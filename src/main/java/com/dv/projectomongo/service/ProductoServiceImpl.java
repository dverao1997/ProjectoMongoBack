package com.dv.projectomongo.service;

import com.dv.projectomongo.model.Producto;
import com.dv.projectomongo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto,String> implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;
    @Override
    public CrudRepository<Producto, String> getDao() {
        return productoRepository;
    }
}
