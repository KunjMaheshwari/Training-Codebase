package Main;

class Employee {
	public String name;
	
	public void working() {
		System.out.println(name +" is working.");
	}
}

class Manager extends Employee{
	public void meeting() {
		System.out.println(name+" is attending meeting.");
	}
}
