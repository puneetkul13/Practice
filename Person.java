package SerialisationDeserialisation;

import java.io.Serializable;

public class Person implements Serializable {
	public String name;
	public int age;
	public int salary;
//	private long serialVersionUID = 1L;
	public Person(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
