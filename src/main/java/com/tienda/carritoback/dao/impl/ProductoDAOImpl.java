package com.tienda.carritoback.dao.impl;

import com.tienda.carritoback.dao.ProductoDAO;
import com.tienda.carritoback.dao.repository.ProductoRepository;
import com.tienda.carritoback.dto.ProductoDTO;
import com.tienda.carritoback.mapper.ProductoEntityMapper;
import java.util.List;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoDAOImpl implements ProductoDAO {

    private ProductoEntityMapper mapper
            = Mappers.getMapper(ProductoEntityMapper.class);

    @Autowired
    private ProductoRepository repositorio;

    @Override
    public List<ProductoDTO> listarTodos() {
        return mapper.convierteListEntityADTO(repositorio.findAll());
    }

    @Override
    public List<ProductoDTO> listarNuevos(int estado) {
        return mapper.convierteListEntityADTO(repositorio.findByNueProducto(estado));
    }

    @Override
    public List<ProductoDTO> listarNuevosPorCategoria(int estado, int categoria) {
        return mapper.convierteListEntityADTO(
                repositorio.findByNueProductoAndCategoria(estado, categoria));
    }

    @Override
    public void insertarProducto(ProductoDTO pe) {
        repositorio.save(mapper.convierteDTOAEntity(pe));
    }

    @Override
    public void modificarProducto(ProductoDTO pe) {
        repositorio.save(mapper.convierteDTOAEntity(pe));
    }

    @Override
    public void eliminarProducto(int codigo) {
        repositorio.deleteById(codigo);
    }

    @Override
    public ProductoDTO obtenerUno(int codigo) {
        return mapper.convierteEntityADTO(repositorio.findById(codigo).orElse(null));
    }

}
