package ejemplodos;

public class TiposDeDatos {

	public static void main(String[] args) {
	
      byte numByte = -110 ;
      System.out.println(numByte);
      short numShort = 32767;
      System.out.println(numShort);
      int numInt = -2_147_483_648;
      System.out.println(numInt);
      long numLong = -9_223_372_036_854_700_000L;
      System.out.println(numLong);
      byte num1=100, num2=100;
      byte num3 = (byte) (num1+num2);
      System.out.println("el valor de num3 es" + num3);
      
      float numFloat =12.85f;
      double numDouble= 12.85d;
      System.out.println("numFloat es" + numFloat);
      System.out.println("numDouble es" + numDouble);
     
	}

}
