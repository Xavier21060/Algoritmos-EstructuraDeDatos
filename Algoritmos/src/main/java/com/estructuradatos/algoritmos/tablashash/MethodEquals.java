package com.estructuradatos.algoritmos.tablashash;

import java.util.ArrayList;
import java.util.List;

public class MethodEquals {

	 
	public static void main(String[] args) {
		
		
		Student student1 = new Student(1, "xavie2", "1234");
		Student student2 = new Student(1, "xavier", "1234");
		Student student3 = new Student(1, "xavier", "1234");
		
		
		List<Student> arr = new ArrayList<Student>();
		arr.add(student1);
		arr.add(student2);
		arr.add(student3);
		
		
		for (Student allStudent : arr) {
			System.out.println(allStudent.toString());
		}
	
		boolean isEquals = isEqual(student1, student2);
		boolean isEquals2 = isEqual(student2, student1);
		boolean isEquals3 = isEqual(student2, student3);
		boolean isEqual4 = isEqual(student1, student3);
		
		System.out.println("student 1 equals student 2: " + isEquals);
		System.out.println("student 2 equals student 1:" + isEquals2);
		System.out.println("student 2 equals student 3: " + isEquals3);
		System.out.println("student 1 equals student 3: " + isEqual4);

		System.out.println(student1.equals(student2));
		student1.hashCode();
		student2.hashCode();
		
		
		
		
	}
	
	/**
	 * This is a generic method to compare two objects
	 * @param st
	 * @param rs
	 * @return true if are same
	 */
	public static boolean isEqual (Student st, Student rs ) {
		
		if ((st.getId() == rs.getId()) 
				&& (st.getName() == rs.getName())
				&& (st.getPhone() == rs.getPhone())) {
			
			System.out.println("these objects are the same ");
			return true;
		}else {
			return false;
		}
		
	}
	
}

  class Student {

	private int id;
	private String name;
	private String phone;

	public Student(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		System.out.println("hashcode: " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //It the objects are the same to ram memory
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj; //cast the (Object) to student type
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

}