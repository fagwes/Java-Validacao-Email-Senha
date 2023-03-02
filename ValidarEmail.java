package validacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarEmail {

	public static void main(String[] args) {
        System.out.println( validaremail ("garbosoftware@gmail.com") );
        System.out.println( validaremail("aaabbb@gmail.com") );
        System.out.println( validaremail("invalido@com.br") );
        System.out.println( validaremail("inv@lido@com.br") );
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