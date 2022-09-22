package basic;
class Member{
	int id;
	String name;
	String address;
	Member(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public String toString() {
		return "id : "+id+" name : "+name+" address : "+address;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Member m = new Member(1, "c", "ahmedabad");
		System.out.println(m);
		Member m1 = new Member(2, "c++", "mumbai");
		System.out.println(m1);
	}
}
