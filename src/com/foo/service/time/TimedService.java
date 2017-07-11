package com.foo.service.time;

import com.foo.time.util.TimeIt;

public interface TimedService {

	@TimeIt
    void thisIsATimedMethod();

    void thisIsAnotherMethod();

    @TimeIt
    void thisIsAnotherTimedMethod();
}
