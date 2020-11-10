package io.github.carlomicieli.webfluxapp.catalog.brands;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsRepository extends ReactiveMongoRepository<Brand, String> {
}
