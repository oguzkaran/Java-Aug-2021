/*----------------------------------------------------------------------------------------------------------------------
	Arayüzler (Interfaces):

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;


class App {
	public static void main(String[] args)
	{

	}
}

class Sample {
	public static void bar() throws YourException
	{
		//...
	}
}

class B extends A {
	public void foo() throws Exception
	{
		Sample.bar();
	}
}

abstract class A {
	public abstract void foo() throws Exception;
}


class WrapperException extends RuntimeException {
	public WrapperException(String message)
	{
		this(message, null);
	}

	public WrapperException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public String getMessage()
	{
		Throwable cause = getCause();

		return String.format("Message:%s%s", super.getMessage(), cause != null ? ", Cause Message:" + cause.getMessage() : "");
	}
}

class MyException extends Exception {
	//...
}

class YourException extends Exception {
	//...
}


