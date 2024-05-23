package com.entidades.buenSabor.presentation.rest;

import com.entidades.buenSabor.business.facade.Imp.EmpresaFacadeImpl;

import com.entidades.buenSabor.domain.dto.EmpresaDto;

import com.entidades.buenSabor.domain.dto.EmpresaLargeDto;
import com.entidades.buenSabor.domain.entities.Empresa;

import com.entidades.buenSabor.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresa")
@CrossOrigin("*")
public class EmpresaController extends BaseControllerImp<Empresa, EmpresaDto, Long, EmpresaFacadeImpl> {
    public EmpresaController(EmpresaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/addSucursal/{idEmpresa}/{idSucursal}")
    public ResponseEntity<EmpresaLargeDto> addSucursal(@PathVariable Long idEmpresa, @PathVariable Long idSucursal){
        return ResponseEntity.ok(facade.addSucursal(idEmpresa,idSucursal));
    }

    @GetMapping("/full/{id}")
    public ResponseEntity<EmpresaLargeDto> findWithSucursalesById(@PathVariable Long id) {
        return ResponseEntity.ok(facade.findWithSucursalesById(id));
    }
}
