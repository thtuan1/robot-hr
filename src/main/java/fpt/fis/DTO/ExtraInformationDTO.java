package fpt.fis.DTO;

public class ExtraInformationDTO {
    private Long Id;
    private String phongBan;
    private String soHDLD;
    private String loaiHD;

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

    private String heSoLuong;
}
