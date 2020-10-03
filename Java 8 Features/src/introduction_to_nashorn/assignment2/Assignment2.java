package introduction_to_nashorn.assignment2;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Assignment2 {

	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("nashorn");
		
		//when running from eclipse prefix ./bin else it runs fine from cmd
		FileReader fr=new FileReader("./introduction_to_nashorn/assignment2/Demo.js");
		engine.eval(fr);
		
		Invocable invocable=(Invocable)engine;
		
		int num=23; //Change this value 
		
		if((boolean)invocable.invokeFunction("checkPrime", num)) {
			System.out.println("Given input: "+num+", is a prime number");
		}else {
			System.out.println("Given input: "+num+", is NOT a prime number");
		}
	}

}
