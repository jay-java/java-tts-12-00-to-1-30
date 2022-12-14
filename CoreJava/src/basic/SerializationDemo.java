package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudntData implements Serializable {
	int id;
	String name;
	float per;

	public StudntData(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}

	public String toString() {
		return "StudntData [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
}

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StudntData s1 = new StudntData(1, "jeel", 67.7f);
		
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("object stored");
		
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudntData s = (StudntData) ois.readObject();
		System.out.println(s);
	}
}
