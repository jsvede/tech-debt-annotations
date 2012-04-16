package com.loquatic.techdebt.annotations;

/**
 * A simple annotation to set a date by which
 * this should be resolved.  The annotation tags two
 * arguments, a date formatted as MM/dd/YYYY and an
 * optional date format formatted as per the Javadoc
 * of SimpleDateFormat.
 * 
 * @author jsvede
 *
 */
public @interface FixBy {
	String date() ;
	String format() ;
}
