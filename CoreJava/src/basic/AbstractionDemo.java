package basic;

abstract class RBI{
	public abstract void interest();
	public abstract void homeloan();
	public void repoRate() {
		System.out.println("repo rate : 4%");
	}
}
class SBI extends RBI{
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("sbi interest : 5%");
	}
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("sbi home loan : 7%");
	}
	
}
class PNB extends RBI{
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("pnb interest : 6%");
	}
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("pnb homeloan : 8%");
	}
	
}
class JAVA extends RBI{
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("java interst : 8%");
	}
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("java homeloan : 6%");
	}
	
}
public class AbstractionDemo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.homeloan();
		s.repoRate();
		PNB p = new PNB();
		p.interest();
		p.homeloan();
		p.repoRate();
		JAVA j = new JAVA();
		j.interest();
		j.homeloan();
		j.repoRate();
	}
}
