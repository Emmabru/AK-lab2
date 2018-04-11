import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedList;
import java.util.List;
import java.lang.Math;

public class Main {

  public static List<String> readInput(BufferedReader input) throws IOException {
    LinkedList<String> list = new LinkedList<String>();
    String s = null;
    while ( (s = input.readLine() ) != null) {
      list.add(s);
    }
    return list;
  }



  public static void main(String args[]) throws IOException {
        //long t1 = System.currentTimeMillis();
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
    // Säkrast att specificera att UTF-8 ska användas, för vissa system har annan
    // standardinställning för teckenkodningen.
    List<String> graphDetails = readInput(stdin);
    //String line;
    //System.out.println(graphDetails.get(0) + "\n" + graphDetails.get(1));
    //while ((line = stdin.readLine()) != null) {
    Reduction answer = new Reduction(graphDetails);

      /// printa lista
    }

}
