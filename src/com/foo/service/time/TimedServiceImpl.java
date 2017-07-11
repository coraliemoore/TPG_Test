package com.foo.service.time;

public class TimedServiceImpl implements TimedService {
	
	
	@Override
	public void thisIsATimedMethod() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void thisIsAnotherMethod() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void thisIsAnotherTimedMethod() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
