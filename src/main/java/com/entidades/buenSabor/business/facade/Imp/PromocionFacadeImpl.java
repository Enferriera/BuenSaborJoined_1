package com.entidades.buenSabor.business.facade.Imp;

import com.entidades.buenSabor.business.facade.Base.BaseFacadeImp;
import com.entidades.buenSabor.business.facade.PromocionFacade;
import com.entidades.buenSabor.business.mapper.BaseMapper;
import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.business.service.ImagenPromocionService;
import com.entidades.buenSabor.business.service.Imp.PromocionServiceImpl;
import com.entidades.buenSabor.business.service.PromocionService;
import com.entidades.buenSabor.domain.dto.PromocionDto;
import com.entidades.buenSabor.domain.entities.Promocion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class PromocionFacadeImpl extends BaseFacadeImp<Promocion, PromocionDto,Long> implements PromocionFacade {

    @Autowired
    private PromocionService promocionService;

    public PromocionFacadeImpl(BaseService<Promocion, Long> baseService, BaseMapper<Promocion, PromocionDto> baseMapper, PromocionServiceImpl promocionServiceImpl) {
        super(baseService, baseMapper);

    }

    @Override
    public ResponseEntity<List<Map<String, Object>>> getAllImagesByArticuloId(Long id) {
        return promocionService.getAllImagesByArticuloId(id);
    }

    @Override
    public ResponseEntity<String> uploadImages(MultipartFile[] files, Long id) {
        return promocionService.uploadImages(files,id);
    }

    @Override
    public ResponseEntity<String> deleteImage(String publicId, Long id) {
        return promocionService.deleteImage(publicId, id);
    }
}
