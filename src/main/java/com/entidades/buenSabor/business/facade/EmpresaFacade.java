package com.entidades.buenSabor.business.facade;

import com.entidades.buenSabor.business.facade.Base.BaseFacade;

import com.entidades.buenSabor.domain.dto.EmpresaDto;
import com.entidades.buenSabor.domain.dto.EmpresaLargeDto;
import com.entidades.buenSabor.domain.entities.Empresa;
import org.springframework.data.repository.query.Param;


public interface EmpresaFacade extends BaseFacade<EmpresaDto, Long> {
    EmpresaLargeDto addSucursal(Long idEmpresa, Long idSucursal);
    EmpresaLargeDto findWithSucursalesById( Long id);
}
