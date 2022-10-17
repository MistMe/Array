public class App {
    public static void main(String args[]) {
    
    char [] Firstname = {'L', 'Y', 'O', 'D'};
    //System.out.println (Firstname[3]);
    //System.out.println (Firstname[2]);
    //System.out.println (Firstname[1]);
    //System.out.println (Firstname[0]);
    //System.out.println (Firstname[80]);
    
    //for (int i = 0; i < Firstname.length; i++) {
     //   System.out.println(Firstname[i]);
   //}
   
   //for (int i = Firstname.length - 1; i >=0; i--) {
     //   System.out.println(Firstname[i]);
    //}
    
    for (int i = 0; i < Firstname.length; i++) {
        if(!(Firstname[i] == 'A'|| Firstname[i] == 'E'|| Firstname[i] == 'I' || Firstname[i] == 'O' || Firstname[i] == 'U')) {
            System.out.println(Firstname[i]);
        }
   }
}
}
