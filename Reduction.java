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
    int vertices = Integer.parseInt(graphDetails.get(0)); // re write to output
    int edges = Integer.parseInt(graphDetails.get(1));
    int colors = Integer.parseInt(graphDetails.get(2));

    // add to list in some order
/*    if (vertices <= colors) {
      baseCase();
      return;
    } */

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
          int roll1 = Integer.parseInt(splited[0]);
          int roll2 = Integer.parseInt(splited[1]);
          // number of un-isolated vertices, check against total vertices
          dialogList.add("2 " + roll1 + " " + roll2);

    }


    Set<String> unique = new HashSet<String>(uniqueList);
      int roles = unique.size() + 3;
      int scenes = dialogList.size() + roles -1;
      int actors = colors + 2;
      System.out.println(roles);           //antal roller
      System.out.println(scenes);      // antal scener = edges
      System.out.println(actors);                 //actors


      //list of actors to roles
      for(int j = 4; j <= roles; j++) {
          System.out.print(actors-2 + " ");
              for( int i = 2; i < actors ; i++) {
                System.out.print(i + " ");
              }
              System.out.println();
      }
      System.out.println("1 2");
      System.out.println("1 1");
      System.out.println("1 " + actors);  //the tree guy, played by added actor

      //scene and roles
      for(int i = 0; i <= dialogList.size() -1 ; i++) {
          System.out.println(dialogList.get(i));
        }
      for(int i = 1; i < roles ; i++) {
          System.out.println("2 "+ roles + " " + i);
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
  void baseCase(){
    System.out.println(3);
    System.out.println(2);
    System.out.println(3);
    System.out.println("1 1");
    System.out.println("1 2");
    System.out.println("1 3");
    System.out.println("2 1 3");
    System.out.println("2 2 3");
  }

}
