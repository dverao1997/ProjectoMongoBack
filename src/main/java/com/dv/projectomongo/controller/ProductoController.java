package com.dv.projectomongo.controller;


import com.dv.projectomongo.model.Producto;
import com.dv.projectomongo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/products")
public class ProductoController {
    @Autowired
    ProductoService productoService;


    @GetMapping("/")
    public ResponseEntity<List<Producto>> getProdcutos(){
        return new ResponseEntity<>(productoService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<Producto> setProdcuto(@RequestBody Producto p){
        return new ResponseEntity<>(productoService.save(p),HttpStatus.CREATED);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<Producto> updateProducto(@PathVariable String id,@RequestBody Producto p){
        Producto pr=productoService.findById(id);
        if(pr==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            try{
                pr.setName(p.getName());
                pr.setPrice(p.getPrice());
                pr.setExpiry_date(p.getExpiry_date());
                return new ResponseEntity<>(productoService.save(p),HttpStatus.OK);
            }catch (DataAccessException e){
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<Producto> deleteProducto(@PathVariable String id){
        productoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
