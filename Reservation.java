package for_Git;

//4)  ���� ( ���� )
//�Ӽ� : �ð�, �ο�, ������, ����ó ,  ���� (������, �������)
//�ൿ : �����ϱ�, ���ຯ��, ���, ��ȸ

public class Reservation {
	private int time;
	private int pernum;
	private String resername;
	private String phonenum;
	private boolean status;
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPernum() {
		return pernum;
	}
	public void setPernum(int pernum) {
		this.pernum = pernum;
	}
	public String getResername() {
		return resername;
	}
	public void setResername(String resername) {
		this.resername = resername;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
