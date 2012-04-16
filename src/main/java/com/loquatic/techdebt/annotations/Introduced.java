package com.loquatic.techdebt.annotations;

/**
 * Used when you want to capture the date the tech debt 
 * was identified.
 * 
 * @author jsvede
 *
 */
public @interface Introduced {
	String date() ;
	String format() ;
}
