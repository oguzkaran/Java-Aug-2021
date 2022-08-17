/*----------------------------------------------------------------
	FILE		: DateTimeException.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 16.08.2022

	DateTimeException class

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.datetime;

public class DateTimeException extends RuntimeException {
    public DateTimeException(String message)
    {
        super(message);
    }
}
