import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.lang.String;


public  class main{
  public static void main(String[] args){
String answer = "41eb77f138ce350932e33b6b26b233df9aad0c0c80c6a49cb9a54ddd8fae3f83";
    List<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    list.add("h");
    list.add("i");
    list.add("j");
    list.add("k");
    list.add("l");
    list.add("m");
    list.add("n");
    list.add("o");
    list.add("p");
    list.add("q");
    list.add("r");
    list.add("s");
    list.add("t");
    list.add("u");
    list.add("v");
    list.add("w");
    list.add("x");
    list.add("y");
    list.add("z");
    for(String a : list){
      for(String b: list){
        for(String c : list){
          for(String d: list){
            
            Crackmethod cracker = new Crackmethod();
            String result = cracker.smoosh(a,b,c,d);
            System.out.print(result);
            System.out.print("\n");
            if(result.equals(answer)) {
              System.out.print(a);
              System.out.print(b);
              System.out.print(c);
              System.out.print(d);
            }
          }
        }
      }
    }
  }
}
