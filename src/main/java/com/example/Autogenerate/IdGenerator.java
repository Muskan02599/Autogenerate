package com.example.Autogenerate;

import org.bson.types.ObjectId;


/**
 * Utility to handle IdGenerator related operations
*/
public class IdGenerator {
	
	private static final String LIVE_CHAT_PREFIX = "999";

	/**
	 * Method to generate unique key for primary key with Live Chat prefix
	*/
	public static String generateId() {
		return LIVE_CHAT_PREFIX + getObjecIdHexString();
	}

	private static String getObjecIdHexString() {
		return new ObjectId().toHexString();
	}

}