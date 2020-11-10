package io.github.carlomicieli.webfluxapp.catalog.brands;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
@Log4j2
public class BrandHandlers {

    private final BrandsRepository brands;

    public Mono<ServerResponse> getAllBrands(ServerRequest request) {
        log.debug("GET all brands");
        return ServerResponse.ok().body(brands.findAll(), Brand.class);
    }

    public Mono<ServerResponse> getBrandById(ServerRequest request) {
        var brandId = request.pathVariable("brandId");
        log.debug("GET brand with id = {}", brandId);

        return ServerResponse.ok().body(brands.findById(brandId), Brand.class);
    }
}
