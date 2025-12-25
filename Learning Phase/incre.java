class incre
{
    public static void main(String[] args)
    {
        int a = 5;
        a = a++;
//        a = a + 1;
        System.out.println(a);
        System.out.println(0.1+0.2);
//        String name = null;
//        System.out.println(name.length()); // NPE

        String m = new String("Hello");
        String n = new String("Hello");

        System.out.println(m == n);      // false
        System.out.println(m.equals(n)); // true

        System.out.println(a++);
        System.out.println(a);
    }
}