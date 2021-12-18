package com.helper;

public class File_Reader_Manager {

	private File_Reader_Manager() {
		
	}
	
	public static File_Reader_Manager getInstanceFRM() {

	File_Reader_Manager frm=new File_Reader_Manager();
	
	return frm;
	
	
	}
	
	public Configuraton_Reader getInstanceCR()  throws Throwable{
		
		Configuraton_Reader reader=new Configuraton_Reader();
		
		return reader;
		
	}
	
	
	
	
}
