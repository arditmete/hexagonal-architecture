package com.example.domain.mapper

import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class EntityMapper<T, S> : IEntityMapper<T, S> {

    @Autowired
    private lateinit var modelMapper: ModelMapper

    override fun toEntity(data: S, targetClass: Class<T>): T {
        return modelMapper.map(data, targetClass)
    }

    override fun toObject(data: T, targetClass: Class<S>): S {
        return modelMapper.map(data,targetClass)
    }
}