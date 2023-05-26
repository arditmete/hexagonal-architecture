package com.example.domain.config

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DomainConfig {
    @Bean
    fun modelMapper(): ModelMapper {
        return ModelMapper()
    }
}