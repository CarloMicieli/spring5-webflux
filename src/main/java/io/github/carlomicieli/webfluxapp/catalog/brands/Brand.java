package io.github.carlomicieli.webfluxapp.catalog.brands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Getter
@Document
public class Brand {
    @Id
    private final String id;
    private final String name;
    private final String companyName;
}
