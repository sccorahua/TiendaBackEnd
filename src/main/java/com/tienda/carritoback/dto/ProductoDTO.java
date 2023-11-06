package com.tienda.carritoback.dto;

import lombok.Data;

@Data
public class ProductoDTO {

    private int idProducto;
    private String nomProducto;
    private CategoriaDTO categoria;
    private double preProducto;
    private double antPreProducto;
    private int nueProducto;
    private String imgProducto;
}
