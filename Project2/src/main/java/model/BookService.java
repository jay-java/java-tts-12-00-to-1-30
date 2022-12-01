package model;

public class BookService {
	private int bid,cid,sid;
	private String sname,semail,stype,status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	@Override
	public String toString() {
		return "BookService [bid=" + bid + ", cid=" + cid + ", sid=" + sid + ", sname=" + sname + ", semail=" + semail
				+ ", stype=" + stype + ", status=" + status + "]";
	}
	
}
