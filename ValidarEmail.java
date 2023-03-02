package validacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarEmail {

	public static void main(String[] args) {
        System.out.println( validaremail ("ophelia6507@uorak.com") );
        System.out.println( validaremail("sonia6636@uorak.com") );
        System.out.println( validaremail("bailo4550@uorak.com") );
        System.out.println( validaremail("categoria6970@uorak.com") );
    }

    public static boolean validaremail(String email) {
        boolean emailvalido = false;
        if (email != null && email.length() > 0) {
            String expression = "Validação";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
            	emailvalido = true;
            }
        }
        return emailvalido;
    }
}
