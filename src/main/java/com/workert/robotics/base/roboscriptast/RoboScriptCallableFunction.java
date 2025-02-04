package com.workert.robotics.base.roboscriptast;
import java.util.List;

@FunctionalInterface
public interface RoboScriptCallableFunction {
	Object apply(Interpreter interpreter, List<Object> arguments, Token errorToken);
}
