package com.tienda.carritoback.service;

import com.tienda.carritoback.dto.ProductoDTO;
import java.util.List;

public interface ProductoService {

    public List<ProductoDTO> listarTodos();

    public List<ProductoDTO> listarNuevos(int estado);

    public List<ProductoDTO> listarNuevosPorCategoria(int estado, int categoria);

    public void insertarProducto(ProductoDTO pe);

    public void modificarProducto(ProductoDTO pe);

    public void eliminarProducto(int codigo);

    public ProductoDTO obtenerUno(int codigo);
}
