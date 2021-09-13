package com;

import javax.script.*;  
import java.io.*;  

public class Employee {

	public static void main(String[] args) throws Exception
	{
		        // Creating script engine  
		        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
		        // Reading Nashorn file  
		        ee.eval(new FileReader("E:/All Programs/JEFeatures/src/com/hello.js"));  
		    }  
		}  
add function()
{
}

<<<<<<< HEAD
add function5() // ch5
{}

	
=======
added function3(){} cr3

	
>>>>>>> 639aadedef2fb8cca2dff82d7a17ff1239b02e01
