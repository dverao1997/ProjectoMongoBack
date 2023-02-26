package com.dv.projectomongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "products")
public class Producto {
    @Id
    private String _id;

    private String name;

    private Double price;

    private LocalDate expiry_date;
}
