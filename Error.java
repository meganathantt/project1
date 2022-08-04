package sample2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Error {
	static Logger log=Logger.getLogger(Error.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		int num=10;
		int num1=0;
		
		try {
		System.out.println(num/num1);
		System.out.println(num*num1);
		}
		catch(Exception e) {
			log.error("Dont divide any number by using zero",e);
		}
		
		
	}

}
