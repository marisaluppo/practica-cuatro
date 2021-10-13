import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        String usuarioCorrecto = "user";
        String contraseñaCorrecta = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de usuario:");
        String usuario = sc.next();
        System.out.println("Contraseña:");
        String password = sc.next();

        // Si ambos son correctos

        if (usuario.equals(usuarioCorrecto) && password.equals(contraseñaCorrecta)) {
            System.out.println("Has entrado al sistema.");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

	//modificado!!
    }
}
