package fpt.fis.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ExtraInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getSoHDLD() {
        return soHDLD;
    }

    public void setSoHDLD(String soHDLD) {
        this.soHDLD = soHDLD;
    }

    public String getLoaiHD() {
        return loaiHD;
    }

    public void setLoaiHD(String loaiHD) {
        this.loaiHD = loaiHD;
    }

    public String getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(String heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getJodCode() {
        return jodCode;
    }

    public void setJodCode(String jodCode) {
        this.jodCode = jodCode;
    }

    public Date getContractendDate() {
        return contractendDate;
    }

    public void setContractendDate(Date contractendDate) {
        this.contractendDate = contractendDate;
    }

    private String phongBan;
    private String soHDLD;
    private String loaiHD;
    private String heSoLuong;
    private String jodCode;
    private Date contractendDate;
}
