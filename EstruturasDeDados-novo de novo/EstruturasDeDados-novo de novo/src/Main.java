import java.util.Scanner;
public class Main {	
    public static void main(String[] args) {
    	
    	
        UniBHList<Integer> myList = new UniBHList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        int fechar = 0;
       
         
        while(fechar == 0) {
            System.out.println("Esolha entre essas 2 opções:\n1-Iniciar \n2-Fechar \n3-Pesquisar \n4-Remover um numero\n5-Modificar valor");
             int numeroEscolhido = scanner.nextInt();
        if(numeroEscolhido == 1) {	
        	 System.out.println("Informe o valor a ser inserido: ");
             
             int valor = scanner.nextInt();
             
             System.out.println("Informe a posição na qual o número será inserido: ");
             
             int antigo = scanner.nextInt();
             
             for (int i = 0; i < antigo; i++) {
                 myList.insertAtBeginning(i + 1);
                 if (i + 1 == antigo) {
                     myList.insertAfter(antigo, valor);	
                 }

                 System.out.println(myList);
             }

             System.out.println();
             
             System.out.print(myList.totalElements);
             System.out.println("\n");
             }else if(numeroEscolhido == 2) {
        	System.out.println(" \n Por hoje é só pe pe pe pessoal ₍ᐢ･⚇･ᐢ₎ ");
        	fechar = 2;
        }else if(numeroEscolhido == 3) {
        	System.out.println("Informe o valor a ser pesquisado: ");
            int pesquisa = scanner.nextInt();
            myList.Search(pesquisa);
            System.out.println("\n");
            
        }else if(numeroEscolhido == 4) {
        	System.out.println("Informe o valor a ser removido:");
        	int valor = scanner.nextInt();

        	Node<Integer> removido = myList.removeAtBeginning(valor);
        	if (removido != null) {
        	    System.out.println("Removido: " + removido.getValue());
        	}
        	System.out.println(myList);
        }else if(numeroEscolhido == 5) {
            System.out.println("Informe o valor que deseja modificar:");
            int valorAntigo = scanner.nextInt();

            System.out.println("Informe o novo valor:");
            int novoValor = scanner.nextInt();

            boolean modificado = myList.modifyElement(valorAntigo, novoValor);
            if (modificado) {
                System.out.println("Elemento modificado com sucesso!");
            }

            System.out.println(myList);
        }
      }
   }       
}