package com.tienda.carritoback.mapper;

import com.tienda.carritoback.dao.entity.CategoriaEntity;
import com.tienda.carritoback.dto.CategoriaDTO;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface CategoriaEntityMapper {

    CategoriaEntity convierteDTOAEntity(CategoriaDTO categoria);

    CategoriaDTO convierteEntityADTO(CategoriaEntity categoria);

    List<CategoriaEntity> convierteListDTOAEntity(List<CategoriaDTO> lista);

    List<CategoriaDTO> convierteListEntityADTO(List<CategoriaEntity> lista);
}
