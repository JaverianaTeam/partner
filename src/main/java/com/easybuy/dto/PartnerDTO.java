package com.easybuy.dto;

        import com.easypartner.entities.PartnerEntity;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import java.sql.Date;

@Data
@NoArgsConstructor
public class PartnerDTO {
    private Integer partnerId;
    private String nit;
    private String name;
    private Date creationDate;
    private String email;
    private String phone;
    private String queryEndpoint;
    private String notificationEndpoint;


    public PartnerDTO(PartnerEntity pe) {
        this.partnerId = pe.getPartnerId();
        this.nit = pe.getNit();
        this.name = pe.getName();
        this.creationDate = pe.getCreationDate();
        this.email = pe.getEmail();
        this.phone = pe.getPhone();
        this.queryEndpoint = pe.getQueryEndpoint();
        this.notificationEndpoint = pe.getNotificationEndpoint();
    }
}
