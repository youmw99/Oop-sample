package for_Git;

import javax.swing.plaf.synth.SynthSeparatorUI;

//1)  ��ǰ
//�Ӽ� :  ��ǰ��, ����, ����
//�ൿ :  �Ǹ�(���� ����) ,  �԰�(��������),  ����....

public class Product {
	private final String name;
	private int price;
	private int order;
	
	Product(String name){
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
	void decre_order(int order) {
		this.order -= order;
	}
	void intcre_order(int order) {
		this.order += order;
	}
	void reservation(String name) {
		System.out.println(name + "�� �����մϴ�.");
		if(this.name ==name) {
			System.out.println("����Ϸ�");
		}
		else {
			System.out.println("�� ��ǰ�� �����Ͻ� �� �����ϴ�.");
		}
	}
	
}
