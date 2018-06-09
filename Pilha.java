public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{metodo1();
        } // Com este catch pegamos duas ou mais exceções
        catch(NullPointerException | ArithmeticException ex){
        	//aqui coletamos o pq da exceção e exibimos em uma msg
        	String msg = ex.getMessage();
        	System.out.println("Exception "+msg);
        	//imprimindo o rastro da exceção (pilhas onde ela passou)
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i/0;
        }
        System.out.println("Fim do metodo2");
    }
        
    }
//Ao acabar a pilha de execução  o java encerra o processo
//O método logo abaixo é o que chamou o método atual
