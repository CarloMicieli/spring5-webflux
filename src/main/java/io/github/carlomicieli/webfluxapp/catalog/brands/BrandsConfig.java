package io.github.carlomicieli.webfluxapp.catalog.brands;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class BrandsConfig {

    @Bean
    public RouterFunction<ServerResponse> brandRoutes(BrandHandlers handlers) {
        return route(GET("/api/brands"), handlers::getAllBrands)
                .and(route(GET("/api/brands/{brandId}"), handlers::getBrandById));
    }

}
