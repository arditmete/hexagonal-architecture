package com.example.domain.config

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {
    @Bean
    fun modelMapper(): ModelMapper {
        return ModelMapper()
    }
}