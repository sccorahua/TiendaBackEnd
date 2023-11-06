package com.tienda.carritoback.mapper;

import com.tienda.carritoback.dao.entity.ProductoEntity;
import com.tienda.carritoback.dto.ProductoDTO;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ProductoEntityMapper {

    ProductoEntity convierteDTOAEntity(ProductoDTO producto);

    ProductoDTO convierteEntityADTO(ProductoEntity producto);

    List<ProductoEntity> convierteListDTOAEntity(List<ProductoDTO> lista);

    List<ProductoDTO> convierteListEntityADTO(List<ProductoEntity> lista);
}
