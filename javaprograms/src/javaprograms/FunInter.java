package javaprograms;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunInter {

	public static void main(String[] args) {
		/*
	//Predicate<String> ch=str->str.length()>10;
	//System.out.println(ch.test("sirisha"));
		Person person=new Person();
		Consumer<Person> setName=n->n.setName("sirisha");
		setName.accept(person);
		System.out.println(person.getName());
	}
}
class Person{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
*/
		//Function<Integer , String> f=x->x*10+"is a multiplication";
		//System.out.println(f.apply(4));
		
		Supplier<String> supplier=()->"sirisha";
		System.out.println(supplier.get());
	}	}