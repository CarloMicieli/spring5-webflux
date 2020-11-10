package io.github.carlomicieli.webfluxapp.catalog.brands;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Service
@Log4j2
public class BrandsService {

    private final List<Brand> innerData;

    public BrandsService() {
        innerData = Arrays.asList(
                new Brand("1", "ACME", null),
                new Brand("2", "Roco", null));
    }

    public Flux<Brand> getAll() {
        return Flux.fromIterable(innerData);
    }

    public Mono<Brand> getById(String id) {
        return getAll().filter(it -> it.getId().equals(id)).singleOrEmpty();
    }
}
