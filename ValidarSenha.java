package validacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarSenha {

	public static void main(String[] args) {
        System.out.println( validarsenha ("12345678") );
        System.out.println( validarsenha ("gato") );
        System.out.println( validarsenha ("peixe") );
        System.out.println( validarsenha ("foca") );
    }

    public static boolean validarsenha(String senha) {
        boolean senhavalida = false;
        if (senha != null && senha.length() > 0) {
            String expression = "Validação";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(senha);
            if (matcher.matches()) {
            	senhavalida = true;
            }
        }
        return senhavalida;
    }
}