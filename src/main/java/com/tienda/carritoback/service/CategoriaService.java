package com.tienda.carritoback.service;

import com.tienda.carritoback.dto.CategoriaDTO;
import java.util.List;

public interface CategoriaService {

    public List<CategoriaDTO> listarTodos();

    public CategoriaDTO obtenerPorId(int codigo);

}
