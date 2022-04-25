import java.util.Scanner;

public class AtividadeFor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String sexo;
        float altura;
        float maiorAltura = 0;
        float menorAltura = 0;
        int contadorQtdHomem = 0;
        int contadorQtdMulher = 0;
        float mediaMasculino = 0;
        float media = 0;

        for(int cont = 0; cont < 10; cont++){
            System.out.println("Por favor, digite o sexo: (M para masculino e F para feminino)");
            sexo = scanner.next();
            System.out.println("Por favor, digite a altura: (Exemplo: 1,55) ");
            altura = scanner.nextFloat();

            //Quantidade de mulheres
            if(sexo.equals("F") ){
                contadorQtdMulher = contadorQtdMulher + 1;
    // Média da altura dos homens
            } else if (sexo.equals("M")) {
                mediaMasculino = mediaMasculino + altura;
                contadorQtdHomem = contadorQtdHomem + 1;
            }
            
            
        // A maior e a menor altura do grupo
        if(cont == 0){
            maiorAltura = altura;
            menorAltura = altura;
        } else {
            if (altura > maiorAltura){
                maiorAltura = altura;
            } else if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

    }

        media = mediaMasculino / contadorQtdHomem;

        System.out.println("A maior altura do grupo é: "+ maiorAltura);
        System.out.println("A menor altura do grupo é: "+ menorAltura);
        System.out.println("A média da altura dos homens é de: " + media);
        System.out.println("A quantidade de mulheres informada é de: "+ contadorQtdMulher);

        scanner.close();
    }  
}
