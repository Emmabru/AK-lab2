import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Reduction {

  public Reduction(List<String> graphDetails){
      int vertices = Integer.parseInt(graphDetails.get(0));
      int edges = Integer.parseInt(graphDetails.get(1));
      int colors = Integer.parseInt(graphDetails.get(2));

      // check if we can color each node in a separate color
      // remove excessive colors
      if (vertices <= colors) {
        colors = vertices;
        }

      // we add three roles to guarantee roles-> scenes for divas ( 2 divas, 1 "tree")
      // scenes are all edges plus number of roles to ensure that all roles are casted
      // we add two actor, a diva and someone for the diva to dialog with
      // diva 2 is in the given input
      int roles = vertices + 3;
      int scenes = (graphDetails.size() - 3) + roles -1;
      int actors = colors + 2;

      // Print roles, scenes, actors
      System.out.println(roles);
      System.out.println(scenes);
      System.out.println(actors);

      // list of what roles can be played by what actors
      // last three roles are reserved for the divas and their playmate
      for(int j = 4; j <= roles; j++) {
          // we remove the diva, and divas playmate from all other roles
          System.out.print(actors-2 + " ");

          for( int i = 2; i < actors ; i++) {
              // all actors from diva nr 2, up to final actor from input
              System.out.print(i + " ");
          }
          System.out.println();
      }
      // Print reserved roles for divas and their playmate
      System.out.println("1 2");
      System.out.println("1 1");
      System.out.println("1 " + actors);  //the playmate, played by added actor

      // Print scenes, as given in input, starting from first edge = 1 dialog
      for( int i = 3; i <= graphDetails.size()-1; i++) {
          String x = graphDetails.get(i);
          System.out.println("2 " + x);
      }

      // all roles should play with the playmate to ensure that all roles are casted
      // The playmate is also the only one who plays againt diva 1
      for(int i = 1; i < roles ; i++) {
          System.out.println("2 "+ roles + " " + i);
      }
  }
}
