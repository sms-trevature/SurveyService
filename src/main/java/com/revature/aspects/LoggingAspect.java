package com.revature.aspects;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

//import com.revature.annotations.Logging;

/**
 * The Class LoggingAspect.
 * Class contains all all operations necessary for Logging elements
 * by making use of Spring AOP
 */
@Aspect
@Component
public class LoggingAspect {
	
	/** The logger. */
	private Logger logger = Logger.getRootLogger();
	
	/**
	 * Logging method to handle logging necessary for Survey Service class
	 *
	 * @param pjp the Proceeding Join Point
	 * @return generic java object
	 * @throws Checks and throws for null pointer exception
	 */
	@Around("execution(* com.revature.services.*.*(..))")
	public Object Logging(ProceedingJoinPoint pjp) throws Throwable {
		String logInfo = "";
		if (pjp.getSignature().getName() != null) {
			logInfo = logInfo + "Method: " + pjp.getSignature().getName() + "\n";
		} else {
			logInfo = logInfo + "Method not found\n";
		}
//		String args = "";
//		if (pjp.getArgs().length > 0) {
//			args = "Arguments:";
//			for (Object o: pjp.getArgs()) {
//				args = args + " " + o.toString();
//			}
//			logInfo = logInfo + args + "\n";
//		}
		Object value = pjp.proceed();
		try {
			logInfo = logInfo + "Result: " + value.toString() + "\n";
			logger.info(logInfo);
		}catch (NullPointerException e) {
			
		}
		
		if (value != null) {
			logInfo = logInfo + "Result: " + value.toString() + "\n";
		} else {
			logInfo = logInfo + "Result: method returned null\n";
		}
		logger.info(logInfo);
		return value;
	}
	
	/**
	 * Logging Method to handle more Logging
	 *
	 * @param pjp the Proceeding Join Point
	 * @return a generic java object
	 * @throws Throwable for exception handling
	 */
	@Around("execution(* com.revature.controllers.*.*(..))")
	public Object Logging2(ProceedingJoinPoint pjp) throws Throwable {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		String logInfo = "";
		if (request.getRemoteAddr().equals("") || request.getRemoteAddr() == null) {
			logInfo = logInfo + "IP Address not found!\n";
		} else {
			logInfo = logInfo + "IP Address: " + request.getRemoteAddr() + "\n";
		}
		logger.info(logInfo);
		Object value = pjp.proceed();
		return value;
	}
}
