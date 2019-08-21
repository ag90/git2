package seleniumTopics;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int Counter=0;
	int CounyterLimit=2;
	
	@Override
	public boolean retry(ITestResult result) {

		if (Counter<CounyterLimit) {
			
			Counter++;
			return true;
		}

		return false;
	}
  

	
}
