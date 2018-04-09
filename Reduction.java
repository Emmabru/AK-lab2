/* Labb 2 i DD1352 Algoritmer, datastrukturer och komplexitet    */
/* Se labbanvisning under kurssidan http://www.csc.kth.se/DD1352 */
/* Ursprunglig författare: Viggo Kann KTH viggo@nada.kth.se      */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedList;
import java.util.List;
import java.lang.Math;
import java.util.*;


public class Reduction {
    List<String> answer = null;
    List<String> dialogList;
    List<String> uniqueList;
    Set<String> unique;

  public Reduction(List<String> graphDetails){
    // System.out.println(graphDetails.get(0) + "\n" + graphDetails.get(1));
    String vertices = graphDetails.get(0); // re write to output
    String edges = graphDetails.get(1);
    String colors = graphDetails.get(2);
    // add to list in some order


    //add roles with all actors possible to list


    //list of "scenes"
    List<String> dialogList = new ArrayList<String>();
    List<String> uniqueList = new ArrayList<String>();
    for( int i = 3; i <= graphDetails.size()-1; i++) {
          String x = graphDetails.get(i);
          // gör lista av dialoger
          //System.out.println(x);

        //  System.out.println(dialogList);

          // kalla på unique funktion
          String[] splited = x.split("\\s+");
          uniqueList.add(splited[0]);
          uniqueList.add(splited[1]);
          int actor1 = Integer.parseInt(splited[0]);
          int actor2 = Integer.parseInt(splited[1]);
          actor1 = actor1 + 2;
          actor2 = actor2 + 2;
          // number of un-isolated vertices, check against total vertices
          dialogList.add("2 " + actor1 + " " + actor2);

    }
    Set<String> unique = new HashSet<String>(uniqueList);
    //System.out.println(unique.size());
      System.out.println(unique.size() + 2);      //antal roller
      System.out.println(dialogList.size() + 2);  // antal scener
      System.out.println(unique.size() + 2);      //antal roller=actors

      for(int j = 0; j <= unique.size()+2; j++) {
          System.out.print(unique.size() + " ");
              for( int i = 1; i <= unique.size()+2; i++) {
                System.out.print(i + " ");
              }
              System.out.println();
      }

      // minimumkravet med 3 actors inkl. divor
      System.out.println("2 1 3");
      System.out.println("2 2 3");

      for (String line : dialogList){
          System.out.println(line);
      }



    /*
        unique.size() = vertices // antal roller
        dialogList.size() = edges/scenes
        unique.size()  = roles = actors //vilka scener som innehåller vilka roller ??


        unique.size()  1----> unique.size()
        unique.size()  1---->
        ...

        +
        dialogList

        DONE
    */
  }


}
