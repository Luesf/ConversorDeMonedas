import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int seleccion = 0;

        String menu = """
                
                -------------------------------------------------------------------
                
                ****** Conversor de Monedas ******
                Elija una opcion del menu:
                
                1 - Quetzal => Dolar
                2 - Dolar => Quetzal
                3 - Quetzal => Euro
                4 - Euro => Quetzal
                5 - Quetzal => Yen Japones
                6 - Yen Japones => Quetzal
                7 - Salir
                """;
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        while(seleccion != 7){
            System.out.println(menu);
            seleccion = lectura.nextInt();
            System.out.println("Ingrese el valor a convertir: ");
            var valorAConvertir = lectura.nextInt();

            switch (seleccion){
                case 1:
                    System.out.println("El valor "+valorAConvertir+ " GTQ, es igual a "
                            +valorAConvertir * consulta.buscaMoneda("GTQ", "USD")
                            .conversion_rate()+" USD.");
                    break;
                case 2:
                    System.out.println("El valor "+valorAConvertir+ " USD, es igual a "
                            +valorAConvertir * consulta.buscaMoneda("USD", "GTQ")
                            .conversion_rate()+" GTQ.");
                    break;
                case 3:
                    System.out.println("El valor "+valorAConvertir+ " GTQ, es igual a "
                            +valorAConvertir * consulta.buscaMoneda("GTQ", "EUR")
                            .conversion_rate()+" EUR.");
                    break;
                case 4:
                    System.out.println("El valor "+valorAConvertir+ " EUR, es igual a "
                            +valorAConvertir * consulta.buscaMoneda("EUR", "GTQ")
                            .conversion_rate()+" GTQ.");
                    break;
                case 5:
                    System.out.println("El valor "+valorAConvertir+ " GTQ, es igual a "
                            +valorAConvertir * consulta.buscaMoneda("GTQ", "JPY")
                            .conversion_rate()+" JPY.");
                    break;
                case 6:
                    System.out.println("El valor "+valorAConvertir+ " JPY, es igual a "
                            +valorAConvertir * consulta.buscaMoneda("JPY", "GTQ")
                            .conversion_rate()+" GTQ.");
                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor! Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida o no incluida en el menu.");
            }

        }
    }
}
