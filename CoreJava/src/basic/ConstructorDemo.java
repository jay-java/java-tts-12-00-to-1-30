package basic;

class Employee{
	int id;
	String name;
	double salary;
	Employee(){
		System.out.println("this is defualt constructor");
	}
	Employee(int id,String name,double salary){
		System.out.println(id+name+salary);
		this.id = id;
		this.name=name;
		this.salary=salary;
		System.out.println("this is parameterized constructor");
	}
	public void show() {
		System.out.println("id : "+id+" name : "+name+" salary : "+salary);
	}
}
class Data{
	int id;
	String name;
	double salary;
	Data(Employee e1){
		this.id = e1.id;
		this.name = e1.name;
		this.salary = e1.salary;
	}
	public void showData() {
		System.out.println("id : "+id+" name : "+name+" salary : "+salary);
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"java",233333.3);
		e1.show();
		Data d = new Data(e1);
		d.showData();
	}
}
