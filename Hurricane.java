package for_Git;

//2)  ��ǳ ( �ڿ����� )
//�Ӽ� : ��ǳ�̸� , ��ȣ , ���� ��ġ(����,�浵) , �̵��ӵ�, ���...
//�ൿ : �̵�(����,�浵 ����)

public class Hurricane {
	private final String name;
	private final int num;//��ǳ��ȣ�� ������ ���� ���ٰ� �����Ͽ��� ������ String���� ����
	private int latitude;
	private int longitude;
	private int speed;
	
	Hurricane(String name, int num){
		this.name=name;
		this.num = num;
	}
	Hurricane(int num, String name){
		this.name=name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void change_la_n_long(int latitude, int longitude) {
		System.out.println("������ �浵�� "+latitude+"��, "+longitude+"���� �����մϴ�.");
		this.latitude=latitude;
		this.longitude=longitude;
	}
}
