package com.dv.projectomongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "producto")
public class Producto {
    @Id
    private String _id;

    private String nombre;

    private Double precio;

    private LocalDate fecha_caducidad;
}
