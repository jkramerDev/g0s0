package util;

import java.util.Arrays;

public enum DIRECTION {
	
	E,S,N,W,H;
	
	public static boolean isInEnum(String value) {
	     return Arrays.stream(DIRECTION.values()).anyMatch(e -> e.name().equals(value));
	}

}
