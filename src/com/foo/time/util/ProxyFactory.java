package com.foo.time.util;

import java.lang.reflect.Proxy;

import com.foo.service.time.TimedService;

public class ProxyFactory {
	
	public static Object newInstance(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
				new Class<?>[] { TimedService.class }, new ServiceInvocationHandler(obj));
	}
}
