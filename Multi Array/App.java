public class App {
    public static void main(String[] args) throws Exception {

//         // Outer loop
//         for (int hours = 0; hours < 12; hours++) {

//             // inner loop
//             for (int minutes = 0; minutes < 60; minutes++) {
                   
//                 for (int seconds = 0; seconds < 60; seconds++) {
//                     System.out.println(hours + " : " + minutes + " : " + seconds);
//                  }   
//         }
//     }

String[][] Array4x3 = { { "A", "B", "C" }, { "D", "E", "F" }, { "I", "J","K" }, { "L", "M","N" }};
     //Outer loop
        for (int rows = 0; rows < Array4x3.length; rows++) {

            // inner loop
            for (int column = 0; column < 3; column++) {
                System.out.println(Array4x3[rows][column]);
        

                }
        }
    }
}
