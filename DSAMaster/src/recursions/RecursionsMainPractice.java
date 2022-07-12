package recursions;

import org.apache.logging.log4j.*;

public class RecursionsMainPractice {

	private static Logger log = LogManager.getLogger(RecursionsMainPractice.class.getName());
	
	public static void main(String[] args) {
		
 		//factorial -->
		
		FactorialPractice factorial = new FactorialPractice();
		int n = 3;
		int factorialValue = factorial.getFactorial(n);
		log.debug(n + "! =" +factorialValue);
		
		
		//
	}

}
