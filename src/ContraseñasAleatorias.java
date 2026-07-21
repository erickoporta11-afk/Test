import java.util.Scanner;

public class ContraseñasAleatorias {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        int opcMenu;
        
        do {
            mostrarMenuPrincipal();
            
            System.out.println("Que deseas hacer?");
            opcMenu = sc.nextInt();
            
            switch (opcMenu) {
                case 1: {
                    mostrarMenuGenerar(sc);
                }
                case 2: {
                    System.out.println("Funcion en desarrollo...");
                }
                case 3: {
                    System.out.println("Historial en desarrollo...");
                }
                case 4: {
                    System.out.println("");
                    System.out.println("Saliste del sistema");
                    break;
                }
            }
        
        } while (opcMenu != 4);
        
    
    
    }
    
    
    static void mostrarMenuPrincipal() {
        
        System.out.println("=================================================");
        System.out.println("|      GENERADOR DE CONTRASENAS SEGURAS         |");
        System.out.println("=================================================");
        System.out.println("| 1. Generar nueva contrasena                   |");
        System.out.println("| 2. Analizar fortaleza de contrasena           |");
        System.out.println("| 3. Ver historial de contrasenas generadas     |");
        System.out.println("| 4. Salir                                      |");
        System.out.println("=================================================");
    }
    
    static void mostrarMenuGenerar(Scanner sc) {
        System.out.println("=================================================");
        System.out.println("||           CONFIGURAR CONTRASEÑA             ||");
        System.out.println("=================================================");
        System.out.println("Ingrese la longitud deseada(minimo 4)");
        int longitud = sc.nextInt();
        System.out.println(" ");
        System.out.println("Incluir mayusculas(A-Z)? (s/n)");
        char respMayus = sc.next().charAt(0);
        
        boolean incluirMayusc = (respMayus == 's' || respMayus == 'S');
        
        System.out.println("Incluir minusculas(a-z)? (s/n)");
        char respMinus = sc.next().charAt(0);
        
        boolean incluirMinusc = (respMinus == 's' || respMinus == 'S');
        
        System.out.println("Incluir numeros(0-9)? (s/n)");
        char respNums = sc.next().charAt(0);
        
        boolean incluirNums = (respNums == 's' || respNums == 'S');
        
        System.out.println("Incluir símbolos (!@#$%)? (s/n)");
        char respSimb = sc.next().charAt(0);
        
        boolean incluirSimb = (respSimb == 's' || respSimb == 'S');
    } 
}