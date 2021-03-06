package inheritance;

import sample1.Name;

// parent class or superclass
// What does a child class get from its parent class?
// Answer: i.e.,attributes or methods) that is not private
// Overridden methods
// parent class does not get anything from a child class
// final keyword prevents any subclasses to occur

public class Person {
	protected Name name;
	private String id;

	private static int idCounter = 0;

	public Person(String firstName, String lastName) {
		id = String.valueOf(idCounter++);
		this.name = new Name(firstName, lastName);
	}

	public Person(String firstName, char middleInitial, String lastName) {
		this(firstName, lastName);
		this.name.setmInitial(middleInitial);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
	
	public void commute() {
		System.out.println("Drive to school");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
