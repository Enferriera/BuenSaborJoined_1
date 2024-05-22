package com.entidades.buenSabor.business.service.Imp;

import com.entidades.buenSabor.business.service.ArticuloManufacturadoService;
import com.entidades.buenSabor.business.service.Base.BaseServiceImp;
import com.entidades.buenSabor.domain.entities.ArticuloManufacturado;
import com.entidades.buenSabor.repositories.ArticuloManufacturadoDetalleRepository;
import com.entidades.buenSabor.repositories.ArticuloManufacturadoRepository;
import com.entidades.buenSabor.repositories.ImagenArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoServiceImpl extends BaseServiceImp<ArticuloManufacturado,Long> implements ArticuloManufacturadoService {

    @Autowired
    private ArticuloManufacturadoDetalleRepository detalleRepository;

    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;

    @Autowired
    private ImagenArticuloRepository imagenRepo;

    @Override
    public String deleteCascade(Long id) {
        if (articuloManufacturadoRepository.contiene(id) == false) {
            detalleRepository.logicDelete(id);
            imagenRepo.deleteLogico(id);
            deleteById(id);
            return "ARTICULO ELIMINADO CORRECTAMENTE";
        } else {
            return "ARTICULO NO SE PUEDE ELIMINAR PERTENECE A UNA PROMOCION";
        }
    }
}