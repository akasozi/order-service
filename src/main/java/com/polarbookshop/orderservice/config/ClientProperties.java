package com.polarbookshop.orderservice.config;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.net.URI;

@ConfigurationProperties(prefix = "polar")
@RefreshScope
public record ClientProperties(
        @NotNull
        URI catalogServiceUri
) {
}
