import java.util.Scanner;

public class EndpointValidator {
    public static String validateEndpoint(String endpoint) {
        // Expressão regular exata fornecida pelo enunciado do desafio
        String regex = "^/api/\\w+(/\\w+)*$";

        // Verifica se o endpoint bate perfeitamente com a regra da API
        if (endpoint != null && endpoint.matches(regex)) {
            return "Endpoint valido.";
        } else {
            return "Endpoint invalido.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String endpoint = scanner.nextLine();
            System.out.println(validateEndpoint(endpoint));
        }
        scanner.close();
    }
}
