package com.ibm;

public class AssignVariable {
	
	private int props = loadProps();
	
	public AssignVariable() throws Exception {
		//props = loadProps();
	}
	
	private int loadProps() throws Exception {

		return 1;
	}
	
	public int get()
	{
		return props;
	}
	
	public static void main(String[] args) throws Exception {
		AssignVariable ins = new AssignVariable();
		System.out.println(ins.get());
	}
}
