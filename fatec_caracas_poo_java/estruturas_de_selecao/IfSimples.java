import javax.swing.JOptionPane;
public class IfSimples{
   public static void public static void main(String[] args) {
       double nota;
       nota =Double.parseDouble(JOptionPane.showInputDialog ("Digite a nota"));
       /*esse é um comentario de varias
       linhas */ 
       if (nota >= 70){
           JOptionPane.showMessageDialog(null,"Aprovado");
       }
   }     
}
