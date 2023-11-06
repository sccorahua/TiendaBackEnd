package com.tienda.carritoback.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "categoria")
@Data
public class CategoriaEntity {

    @Id
    @Column(name = "idcategoria")
    private int idCategoria;
    @Column(name = "nomcategoria")
    private String nomCategoria;
}
