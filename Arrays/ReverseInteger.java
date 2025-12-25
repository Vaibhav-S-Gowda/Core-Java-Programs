class ReverseInteger
{
    public int reverse(int x)
    {
        String rev = "";
        int numDigits = String.valueOf(Math.abs(x)).length();
        for(int i = 0; i < numDigits; i++)
        {
            char a = (char) ('0' + (x % 10));  // convert digit to char
            rev = rev + a;  // concatenate char as string
            x = x / 10;
        }
        x = Integer.parseInt(rev);
        return x;
    }
    public static void main(String...a)
    {
        int num = 123;
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse(num));
    }
}