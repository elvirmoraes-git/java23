package java23.exerciciosSocket;

public class Questao {
   public static void main(String[] args) {
      try {
  op(0);
      } 
      catch (IllegalArgumentException e) { System.out.print ("X"); }
      catch (Exception e) { System.out.print ("Y");} 
      finally {System.out.print ("Z");}
      }
    private static void op(int v) throws IllegalArgumentException {
        if (v == 0) throw new IllegalArgumentException("U");
    }
}