package com.foo.service.time;

import com.foo.time.util.ProxyFactory;

public class Main {

	public static void main(String[] args) {

		TimedService timedService = (TimedService)ProxyFactory.newInstance(new TimedServiceImpl());
		
		timedService.thisIsATimedMethod();
		timedService.thisIsAnotherMethod();
		timedService.thisIsAnotherTimedMethod();
	}

}
