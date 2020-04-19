package com.easypartner.services;

import com.easybuy.dto.PartnerDTO;
import com.easypartner.entities.PartnerEntity;
import com.easypartner.repositories.PartnerRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartnerService {

    private PartnerRepostitory pr;

    @Autowired
    public PartnerService(PartnerRepostitory pr) {
        this.pr = pr;
    }

    public PartnerDTO getPartnerById(Integer id) {
        PartnerEntity pe = pr.findById(id).get();
        return new PartnerDTO(pe);
    }

    public PartnerDTO savePartner(PartnerDTO data) {
        PartnerEntity pe = new PartnerEntity(data);
        pe = pr.save(pe);
        return new PartnerDTO(pe);
    }

    public PartnerDTO updatePartner(PartnerDTO data) {
        PartnerEntity pe = pr.findById(data.getPartnerId()).get();
        pe.updateEntity(data);
        pe = pr.save(pe);
        return new PartnerDTO(pe);
    }
}
