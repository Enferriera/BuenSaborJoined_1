package com.entidades.buenSabor.business.service;

import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.domain.entities.Empresa;
import org.springframework.data.repository.query.Param;

public interface EmpresaService extends BaseService<Empresa, Long> {
    Empresa addSucursal(Long idEmpresa, Long idSucursal);
    Empresa findWithSucursalesById( Long id);
}
