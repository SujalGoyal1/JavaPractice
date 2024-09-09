public class increment {
    public static void main(String[] args) {
         /*  int i=2;
        i++;
        System.out.println(++i);
        System.out.println(i);*/
       /*  int i=2;
        int j=0;
        j = ++i + i++;
        System.out.println(j);
        System.out.println(i);*/

        /*int i = 2;
        int j = 0;
        j = i++ + 1 + ++i + i++ + 3;
        System.err.println(j);
        System.out.println(i);*/

        int i = 2;
        int j = 0;
       // j = i++ + i++ + i++;
      // j = i++ + --i + i++ + i--;
       //System.out.println(j);
      // System.out.println(i);
      i = i--;
      System.out.println(j++);
      System.out.println(i);
      System.out.println(j);

    }
}


