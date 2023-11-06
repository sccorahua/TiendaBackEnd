package com.tienda.carritoback.dao;

import com.tienda.carritoback.dto.CategoriaDTO;
import java.util.List;

public interface CategoriaDAO {

    public List<CategoriaDTO> listarTodos();

    public CategoriaDTO obtenerPorId(int codigo);
}
