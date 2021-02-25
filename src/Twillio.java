public class Twillio {

    public static void main(String[] args)
    {
       int result = firstOccurrence("juliasamanthantjulia","ant");
       System.out.println(result);
    }

    public static int firstOccurrence(String s, String x) {
        // Write your code here

        char ch =x.charAt(0);
        String str = String.valueOf(ch);
        int starting = s.indexOf(str);
        String substring = s.substring(starting,x.length()+1);
        //String substring = s.substring(s.indexOf(x.toCharArray()[0]), x.length()-1);
        int count=0;
        for(int i=0;i<substring.length();i++)
        {
            if(substring.charAt(i) !=x.charAt(i))
            {
                count ++;
            }
        }

        if(count ==1)
        {
            return starting;
        }
        return -1;
}
}
