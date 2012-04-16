package org.techdebt.annotations;

/**
 * An arbitrary list used to describe levels of effort.
 * Loosely speaking these should map to the amount of time
 * needed to fix the issue.  
 * <p>
 * <ul>
 * <li>MICRO - minutes
 * <li>SMALL - hours
 * <li>MEDIUM - days
 * <li>LARGE - weeks
 * <li>HUGE - months
 * <li>MASSIVE - years
 * </ul>
 * <p>
 * You can obviously use these values for your own time durations
 * but the ones listed above are what was originally intended.
 * 
 * @author jon.svede
 *
 */
public enum Effort {
	MICRO,
	SMALL,
	MEDIUM,
	LARGE,
	HUGE,
	MASSIVE
}
