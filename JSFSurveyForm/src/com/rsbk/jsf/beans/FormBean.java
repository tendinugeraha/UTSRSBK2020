package com.rsbk.jsf.beans;



import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.validator.ValidatorException;



@ManagedBean
@SessionScoped
public class FormBean {
    private String namaDepan;
    private String namaBlkg;
    private String alamatJalan;
    private String alamatKota;
    private String alamatNgrbagian;
    private String alamatPos;
    private String nomorTelepon;
    private String emailAddress;
    private Date tanggalSurvey;
    private String rbTertarik;
    private String ddRekomendasi;
    private String cbDisukai;
    private String komentarTambahan;
	
	
    public String getNamaDepan() {
        return namaDepan;
    }
 
    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBlkg() {
        return namaBlkg;
    }
 
    public void setNamaBlkg(String namaBlkg) {
        this.namaBlkg = namaBlkg;
    }

    public String getAlamatJalan() {
        return alamatJalan;
    }
 
    public void setAlamatJalan(String alamatJalan) {
        this.alamatJalan = alamatJalan;
    }

    public String getAlamatKota() {
        return alamatKota;
    }
 
    public void setAlamatKota(String alamatKota) {
        this.alamatKota = alamatKota;
    }

    public String getAlamatNgrbagian() {
        return alamatNgrbagian;
    }
 
    public void setAlamatNgrbagian(String alamatNgrbagian) {
        this.alamatNgrbagian = alamatNgrbagian;
    }

    public String getAlamatPos() {
        return alamatPos;
    }
 
    public void setAlamatPos(String alamatPos) {
        this.alamatPos = alamatPos;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }
 
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
 
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getTanggalSurvey() {
        return tanggalSurvey;
    }
 
    public void setTanggalSurvey(Date tanggalSurvey) {
        this.tanggalSurvey = tanggalSurvey;
    }



    public String getRbTertarik() {
        return rbTertarik;
    }
 
    public void setRbTertarik(String rbTertarik) {
        this.rbTertarik = rbTertarik;
    }

    public String getDdRekomendasi() {
        return ddRekomendasi;
    }
 
    public void setDdRekomendasi(String ddRekomendasi) {
        this.ddRekomendasi = ddRekomendasi;
    }
    
    public String getCbDisukai() {
        return cbDisukai;
    }
 
    public void setCbDisukai(String cbDisukai) {
        this.cbDisukai = cbDisukai;
    }

public String getKomentarTambahan() {
        return komentarTambahan;
    }
 
    public void setKomentarTambahan(String komentarTambahan) {
        this.komentarTambahan = komentarTambahan;
    }
    
    // Validate Email
    public void validateEmail(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {
        String emailStr = (String) value;
        if (-1 == emailStr.indexOf("@")) {
            FacesMessage message = new FacesMessage("Email Address is Valid");
            throw new ValidatorException(message);
        }
    }
 
    // Action Methods
    public String storeEmployeeInfo() {
        boolean stored = true;
        FacesMessage message = null;
        String outcome = null;
        if (stored) {
            message = new FacesMessage("Employee Information is stored Successfully.");
            outcome = "success";
        } else {
            message = new FacesMessage("Employee Information is NOT stored Successfully.");
            outcome = "form";
        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        return outcome;
    }
}