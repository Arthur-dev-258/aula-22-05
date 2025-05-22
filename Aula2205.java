//aula22-05
package aula.pkg22.pkg05;

import javax.swing.JOptionPane;

public class Aula2205 {


    public static void main(String[] args) {
    int opcao;
    opcao = Integer.parseInt(JOptionPane.showInputDialog( 
          "Escolha sua opcao:\n" +
          "1 - adição\n" +
          "2 - subtração\n" +
          "3 - multiplicação\n" + 
          "4 - divisão\n" +
          "5 - fatorial\n"));
          switch (opcao) {
          case 1 : modAdicao();break;
          case 2 : modSubtr(); break;
          case 3 : modMultipl();break;
          case 4 : modDiv();break;
          case 5 : modfatorial();break;
          default:JOptionPane.showMessageDialog(
          null,"fim do programa");
      }
    }

    private static void modAdicao() {
      double v1;
      double v2;
      double res;
      v1= Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor"));
      v2= Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor"));    
      res = v1 + v2;      
      JOptionPane.showMessageDialog(
      null, "soma = "+ res );
      
    }

    private static void modSubtr() {
      double v1;
      double v2;
      double res;
      v1= Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor"));
      v2= Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor"));    
      res = v1 - v2;      
      JOptionPane.showMessageDialog(
      null, "subtração = "+ res );
    }

    private static void modMultipl() {
      double v1;
      double v2;
      double res;
      v1= Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor"));
      v2= Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor"));    
      res = v1 * v2;      
      JOptionPane.showMessageDialog(
      null, "multiplicação = "+ res ); 
    }

    private static void modDiv() {
     double v1;
      double v2;
      double res;
      v1= Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor"));
      v2= Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro valor"));         
       
      if (v2==0){
          JOptionPane.showMessageDialog(
          null,"NAO TEM DIVISAO POR 0 ");
      }
      else {
          res= v1 / v2;
         JOptionPane.showMessageDialog (
         null, "divisao"+res);  
      }
    
      
      
      
    }

    private static void modfatorial() {
      int fat,numero;
      numero = Integer.parseInt(
      JOptionPane.showInputDialog("qual e o numero "));  
      fat = fatorial (numero);
      JOptionPane.showMessageDialog(
      null,"o fatorial  " + numero +"e"+ fat);  
      }
          static int fatorial (int numero){
          int f = 1 ;
          for (int i = 1; i <= numero; i++)
          f = f * i ;
          return f ;
  
    }
}
     
    
    
    
    

