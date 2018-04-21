package com.pattern.memento;

public class Originator {

	private String name;
	private String sex;
	private Integer age;
	
	public Memento createMemento(){
		return new Memento(age);
	}
	
	public void getMemento(Memento memento){
		age = memento.getAge();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Originator [name=" + name + ", sex=" + sex + ", age=" + age
				+ "]";
	}

	
}
