package com.easypartner.controllers;


import com.easybuy.dto.MessageDTO;
import com.easybuy.dto.PartnerDTO;
import com.easypartner.services.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/partner/")
public class PartnerController {

    private PartnerService ps;

    @Autowired
    public PartnerController(PartnerService ps) {
        this.ps = ps;
    }

    @GetMapping(value = "{id}")
    public PartnerDTO getPartnerById(@PathVariable("id") Integer id) {
        return ps.getPartnerById(id);
    }

    @PostMapping(path = "save")
    public MessageDTO savePartner(@RequestBody PartnerDTO data) {
        ps.savePartner(data);
        return new MessageDTO(1, "Registro Grabado Exitosamente");
    }

    @PutMapping()
    public PartnerDTO updatePartner(@RequestBody PartnerDTO data) {
        return ps.updatePartner(data);
    }
}
