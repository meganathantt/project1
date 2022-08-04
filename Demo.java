package sample2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Demo {
	
	static Logger log=Logger.getLogger(Demo.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("k");
		log.error("a");
		log.fatal("r");
		log.warn("t");
		log.debug("h");
		
		
	}

}
