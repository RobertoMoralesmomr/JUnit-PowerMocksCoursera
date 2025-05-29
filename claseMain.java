public class claseMain{
  public static void main (String[]args){
    System.out.println("Hola perros desde mi iPad");

    System.out.println("Suma desde un método publico: "+suma(15,7));

    System.out.println("Resta desde un método privado: "+resta(10,5));
  }

  public static int suma(int a, int b){
    return a+b;
  }

  private static int resta(int s, int b){
    return s-b;
  }
}

