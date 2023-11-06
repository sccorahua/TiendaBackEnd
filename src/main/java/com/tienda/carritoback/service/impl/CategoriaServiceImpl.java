package com.tienda.carritoback.service.impl;

import com.tienda.carritoback.dao.CategoriaDAO;
import com.tienda.carritoback.dto.CategoriaDTO;
import com.tienda.carritoback.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDAO categoriaDAO;

    @Override
    public List<CategoriaDTO> listarTodos() {
        return categoriaDAO.listarTodos();
    }

    @Override
    public CategoriaDTO obtenerPorId(int codigo) {
        return categoriaDAO.obtenerPorId(codigo);
    }

}
