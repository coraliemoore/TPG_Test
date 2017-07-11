package com.foo.time.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

import com.foo.service.time.TimedService;
import com.foo.service.time.TimedServiceImpl;


public class ServiceInvocationHandler implements InvocationHandler {
	
	private Object obj;
	 
	private static final Logger LOG = Logger.getLogger(ServiceInvocationHandler.class.getName());

    public  ServiceInvocationHandler(Object obj) {
        this.obj = obj;
    }
    
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		// if annotation is not present execute method
		if(!method.isAnnotationPresent(TimeIt.class)) {
			return method.invoke(obj, args);
        }
	 
	 	// else execute method and log time taken
        Instant start = Instant.now();
        
        Object returnObj = method.invoke(obj, args);
        
        Instant end = Instant.now();

        LOG.info("Method " + method.getName() + " executed in " + Duration.between(end, start) + " ("+ (end.getNano() - start.getNano()) + " ns).");
		
        return returnObj;
	}
}
