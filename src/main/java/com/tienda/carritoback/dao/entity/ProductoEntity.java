package com.tienda.carritoback.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "producto")
@Data
public class ProductoEntity {

    @Id
    @Column(name = "idproducto")
    private int idProducto;
    @Column(name = "nomproducto")
    private String nomProducto;
    @OneToOne
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
    private CategoriaEntity categoria;
    @Column(name = "preproducto")
    private double preProducto;
    @Column(name = "antpreproducto")
    private double antPreProducto;
    @Column(name = "nueproducto")
    private int nueProducto;
    @Column(name = "imgproducto")
    private String imgProducto;
}
