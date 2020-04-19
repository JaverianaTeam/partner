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

    public PartnerDTO(Integer partnerId, String nit, String name, Date creationDate, String email, String phone, String queryEndpoint, String notificationEndpoint) {
        this.partnerId = partnerId;
        this.nit = nit;
        this.name = name;
        this.creationDate = creationDate;
        this.email = email;
        this.phone = phone;
        this.queryEndpoint = queryEndpoint;
        this.notificationEndpoint = notificationEndpoint;
    }

    public PartnerDTO(PartnerEntity pe) {

    }
}
