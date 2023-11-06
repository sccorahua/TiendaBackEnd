package com.tienda.carritoback.dao.repository;

import com.tienda.carritoback.dao.entity.ProductoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {

    public List<ProductoEntity> findByNueProducto(int estado);

    @Query("select p from ProductoEntity p where p.nueProducto = ?1 and p.categoria.idCategoria = ?2")
    public List<ProductoEntity> findByNueProductoAndCategoria(int estado, int categoria);

}
