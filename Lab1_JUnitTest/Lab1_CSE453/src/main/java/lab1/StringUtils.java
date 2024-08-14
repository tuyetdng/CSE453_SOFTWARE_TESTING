package lab1;

public final class StringUtils {
	public static Double convertToDouble(String str) {
		if (str == null) {
			return null;
		}
		return Double.valueOf(str);
	}

	public static boolean isBlank(String input) {
		return input == null || input.trim().isEmpty();
	}
}