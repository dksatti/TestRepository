package com.cloudgensys.training.exercise2;

public class POJOSathya {

	private static int ID;
	private String empName;
	private float empSalary;
	private boolean status;
	
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	public static int getID(){
		return ID;
	}
	
	public static void setID(int id){
		ID = id;
	}
	
	PojoSathya (int iD, String name, float salary, boolean status){
		ID = iD;
		this.empName = name;
		this.empSalary = salary;
		this.status = status;
	}
	
}

public class Main{
	 public static void main(String[] args){
		 List<PojoSathya> emps=new ArrayList<PojoSathya>();
		 
		 emps.add(new PojoSathya(1,"name1",15000, true));
		 emps.add(new PojoSathya (2, "name2", 25000, true));
		 emps.add(new PojoSathya(3, "name3", 35000, true));
		 
		 for (PojoSathya e:emps){
			 System.out.println ("\n id :"+e.getID()+"\nname :"+e.getEmpName() +"\nsalary :"
					 		+e.getEmpSalary()+ "\nstatus :" +e.isStatus());	
		 
	 }
}
