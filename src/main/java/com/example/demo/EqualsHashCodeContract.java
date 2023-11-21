package com.example.demo;

import java.util.Objects;

class Student{

	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}

public class EqualsHashCodeContract {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Vaibhav1");
		Student student2 = new Student(1, "Vaibhav1");
		
		System.out.println(" student1.equals(student2) "+student1.equals(student2));
		System.out.println(" student1.hashCode() == student2.hashCode()  "+(student1.hashCode() == student2.hashCode()));
		
	}

}
