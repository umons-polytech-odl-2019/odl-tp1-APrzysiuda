package exercise1;

class Person {
	private String name;
	private int age;

	Person(String nom,int monage){
		name=nom;
		age=monage;
	}
	public void setName(String nom){
		name=nom;
	}
	public String getName(){
		return name;
	}
	public void setAge(int monage){
		age=monage;
	}
	public int getAge(){
		return age;
	}
}
