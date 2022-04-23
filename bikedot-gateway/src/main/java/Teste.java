import java.util.Arrays;

public class Teste {

	private static final String[] DEFAULT;
	private static final String[] PUBLIC;
	private static final String[] USER;
	private static final String[] ADMIN;
	
	static {
		
		DEFAULT = new String[]{ "/bikedot-reserve/**", "/bikedot-payment/**", "/bikedot-register/**" };
		PUBLIC = new String[]{ "/bikedot-oauth/oauth/token" };
		USER = new String[]{ setPermissions(DEFAULT) };
		ADMIN = new String[]{ setPermissions(DEFAULT) };

	}
	
	public static void main(String[] args) {

		
		System.out.println(Arrays.asList(USER).toString());
		

	}

	private static String setPermissions(String[] DEFAULT) {
		return Arrays.deepToString(DEFAULT).replaceAll("[\\[\\]]", "");
	}
}
