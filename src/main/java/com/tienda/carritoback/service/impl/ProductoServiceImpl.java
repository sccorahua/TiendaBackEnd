package com.tienda.carritoback.service.impl;

import com.tienda.carritoback.dao.ProductoDAO;
import com.tienda.carritoback.dto.ProductoDTO;
import com.tienda.carritoback.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDAO productoDAO;

    @Override
    public List<ProductoDTO> listarTodos() {
        return productoDAO.listarTodos();
    }

    @Override
    public List<ProductoDTO> listarNuevos(int estado) {
        return productoDAO.listarNuevos(estado);
    }

    @Override
    public List<ProductoDTO> listarNuevosPorCategoria(int estado, int categoria) {
        return productoDAO.listarNuevosPorCategoria(estado, categoria);
    }

    @Override
    public void insertarProducto(ProductoDTO pe) {
        productoDAO.insertarProducto(pe);
    }

    @Override
    public void modificarProducto(ProductoDTO pe) {
        productoDAO.modificarProducto(pe);
    }

    @Override
    public void eliminarProducto(int codigo) {
        productoDAO.eliminarProducto(codigo);
    }

    @Override
    public ProductoDTO obtenerUno(int codigo) {
        return productoDAO.obtenerUno(codigo);
    }

}
