package com.dv.projectomongo.repository;


import com.dv.projectomongo.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto,String> {
}
