
// class demo{
//     public static void main(String[] args){
//         System.out.println(12+12.0);
//         System.out.println("Type Casting");
//         byte a = 127;
//         a =(byte)(a + 1);
//         System.out.println(a);
//         System.out.println("------------------------------------------------------");
//         int b = 4567890;
//         char c; //Decleration
//         c = (char)b;
//         System.out.println(c);
//     }
// }

 class demo{
     public static void main(String...args){
         int a = 5;
         int b = a++ + a++ + ++a + --a + a++;
         int c = a++ - a++;
         int d = a++ + a--;
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         System.out.println(340+98);
     }
 }

//class demo{
//    public static void main(String[] args){
//        int x = 001, y = 010, z = 100;
//        System.out.println(y);
//        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
//        System.out.println(i);
//    }
//}