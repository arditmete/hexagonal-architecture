package com.example.launcher

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@SpringBootApplication
@EntityScan("com.example.*")
@ComponentScan("com.example.*")
@EnableJpaRepositories(basePackages = ["com.example.*"])
@EnableJpaAuditing
class LauncherApplication
fun main(args: Array<String>) {
    runApplication<LauncherApplication>(*args)
}
