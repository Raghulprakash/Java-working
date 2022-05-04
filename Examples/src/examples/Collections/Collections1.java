package examples.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
class Collections1
{
	int rollno;
	int age;
	int std;
	String name;
	String sec;
	Collections1(int rollno,int age,int std,String name,String sec)
	{
		this.rollno=rollno;
		this.age=age;
		this.std=std;
		this.name=name;
		this.sec=sec;
	}
	@Override
	public String toString() {
		return "Collections1 [rollno=" + rollno + ", age=" + age + ", std=" + std + ", name=" + name + ", sec=" + sec
				+ "]";
	}
	
}