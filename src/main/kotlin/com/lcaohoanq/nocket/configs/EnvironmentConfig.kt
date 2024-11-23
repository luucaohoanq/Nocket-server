package com.lcaohoanq.nocket.configs

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources

@Configuration
@PropertySources(
    PropertySource("classpath:application.yml"),
    PropertySource("classpath:.env", ignoreResourceNotFound = true)
)
class EnvironmentConfig
