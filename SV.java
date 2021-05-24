package test ;
public abstract class SV {
        private String maSV;
	private String hoTen;
	private int namSinh;
	private boolean gioiTinh;
	
	public SV(){
            
            
		}
	public SV(String maSV, String hoTen, int namSinh ,boolean gioiTinh){
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
        
    public abstract double getDiemTB();
    public String getHocLuc(){
        if(getDiemTB()<3.5) return "kem";
        if(getDiemTB()<5) return "yeu";
        if(getDiemTB()<6.5) return "trung binh";
        if(getDiemTB()<8) return "kha";
        if(getDiemTB()<9) return "gioi";
        return "xuatsac";
    }
    public String toString(){
		return maSV+" "+hoTen+" "+namSinh+" "+ ((gioiTinh == true)?" Nam ": " Nu ");
    }
}
