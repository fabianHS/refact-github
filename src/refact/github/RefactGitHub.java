/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refact.github;

/**
 *
 * @author Fabian
 */
public class RefactGitHub {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        crear_matriz();
    }

    public static void crear_matriz() {
        matriz(3);
        matriz (4);
        matriz (5);
        
    }
    
    public static void matriz(int numero){
        
        System.out.println("Matriz ["+numero+"]["+numero+"]");
        for (int i =1; i <=numero; i++){
            for(int y =1; y <=numero; y++){
                if (i == 1 || y == 1 || y ==numero || i== numero  ){
                    System.out.print("1");
                    
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
