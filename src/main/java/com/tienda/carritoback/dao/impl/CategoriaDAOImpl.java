package com.tienda.carritoback.dao.impl;

import com.tienda.carritoback.dao.CategoriaDAO;
import com.tienda.carritoback.dao.repository.CategoriaRepository;
import com.tienda.carritoback.dto.CategoriaDTO;
import com.tienda.carritoback.mapper.CategoriaEntityMapper;
import java.util.List;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoriaDAOImpl implements CategoriaDAO {

    private CategoriaEntityMapper mapper
            = Mappers.getMapper(CategoriaEntityMapper.class);

    @Autowired
    private CategoriaRepository repositorio;

    @Override
    public List<CategoriaDTO> listarTodos() {
        return mapper.convierteListEntityADTO(repositorio.findAll());
    }

    @Override
    public CategoriaDTO obtenerPorId(int codigo) {
        return mapper.convierteEntityADTO(repositorio.findById(codigo).get());
    }

}
