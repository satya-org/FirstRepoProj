package in.nit.Log;

import java.io.IOException;

import org.apache.log4j.Logger;

public class Product {
	private static Logger log=Logger.getLogger(Product.class);
	public static void main(String[] args) throws IOException {
		//Layout lay=new HTMLLayout();
		//Appender ap=new FileAppender(lay,"myapp.log");
		//log.addAppender(ap);
		
		log.debug("Debug");
		log.info("info");
		log.warn("worn");
		log.error("error");
		log.fatal("fatal");
	}
}
