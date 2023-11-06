package com.tienda.carritoback.controller;

import com.tienda.carritoback.dao.ProductoDAO;
import com.tienda.carritoback.dto.ProductoDTO;
import com.tienda.carritoback.service.CategoriaService;
import com.tienda.carritoback.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping
    public List<ProductoDTO> listarProductosTodos() {
        return productoService.listarTodos();
    }

    @GetMapping("/nuevo")
    public List<ProductoDTO> listarProductosNuevos() {
        return productoService.listarNuevos(ProductoDAO.PRODUCTO_NUEVO);
    }

    @GetMapping("/nuevo/categoria/{idCategoria}")
    public List<ProductoDTO> listarNuevosPorCategoria(@PathVariable("idCategoria") int categoria) {
        return productoService.listarNuevosPorCategoria(ProductoDAO.PRODUCTO_NUEVO,
                categoria);
    }
    
    @GetMapping("/{id}")
    public ProductoDTO obtenerUno(@PathVariable("id") int codigo){
        return productoService.obtenerUno(codigo);
    }
    
    @PostMapping
    public void insertarProducto(@RequestBody ProductoDTO pro){
        pro.setCategoria(categoriaService.obtenerPorId(pro.getCategoria().getIdCategoria()));
        productoService.insertarProducto(pro);
    }
    
    @PutMapping
    public void modificarProducto(@PathVariable("id") int codigo, @RequestBody ProductoDTO pro){
        pro.setIdProducto(codigo);
        pro.setCategoria(categoriaService.obtenerPorId(pro.getCategoria().getIdCategoria()));
        productoService.modificarProducto(pro);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable("id") int codigo){
        productoService.eliminarProducto(codigo);
    }
    
}
