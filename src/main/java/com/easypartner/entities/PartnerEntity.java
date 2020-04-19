package com.easypartner.entities;

import com.easybuy.dto.PartnerDTO;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "partner", schema = "public", catalog = "easybuydb")

public class PartnerEntity {
    private Integer partnerId;
    private String  nit;
    private String  name;
    private Date    creationDate;
    private String  email;
    private String  phone;
    private String  queryEndpoint;
    private String  notificationEndpoint;

    @GenericGenerator(
            name = "partnerGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "partner_partner_id_seq"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
    )
    @Id
    @GeneratedValue(generator = "partnerGenerator")
    @Column(name = "partner_id", columnDefinition = "serial")
    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    @Basic
    @Column(name = "nit")
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "creation_date")
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "query_endpoint")
    public String getQueryEndpoint() {
        return queryEndpoint;
    }

    public void setQueryEndpoint(String queryEndpoint) {
        this.queryEndpoint = queryEndpoint;
    }

    @Basic
    @Column(name = "notification_endpoint")
    public String getNotificationEndpoint() {
        return notificationEndpoint;
    }

    public void setNotificationEndpoint(String notificationEndpoint) {
        this.notificationEndpoint = notificationEndpoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartnerEntity that = (PartnerEntity) o;
        return Objects.equals(partnerId, that.partnerId) &&
                Objects.equals(nit, that.nit) &&
                Objects.equals(name, that.name) &&
                Objects.equals(creationDate, that.creationDate) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(queryEndpoint, that.queryEndpoint) &&
                Objects.equals(notificationEndpoint, that.notificationEndpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partnerId, nit, name, creationDate, email, phone, queryEndpoint, notificationEndpoint);
    }

    public PartnerEntity() {
    }

    private void AssignValues(PartnerDTO data) {
        this.partnerId = data.getPartnerId();
        this.nit = data.getNit();
        this.name = data.getName();
        this.creationDate = data.getCreationDate();
        this.email = data.getEmail();
        this.phone = data.getPhone();
        this.queryEndpoint = data.getQueryEndpoint();
        this.notificationEndpoint = data.getNotificationEndpoint();
    }

    public PartnerEntity(PartnerDTO data) {
        this.partnerId = data.getPartnerId();
    AssignValues(data);
    }


    public void updateEntity(PartnerDTO data) {
        AssignValues(data);
    }
}
