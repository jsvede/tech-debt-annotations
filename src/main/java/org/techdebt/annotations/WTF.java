package org.techdebt.annotations;

/**
 * Used only in the most extreme cases of tech debt, this 
 * annotation should be used to note code that is beyond 
 * comprehension and is in need of immediate refactoring.
 *  
 * @author jsvede
 *
 */
public @interface WTF {
	String comment() ;
}
