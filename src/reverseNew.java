
public class reverseNew
{
    public static StringBuilder sb;    
    public static void main(String args[])
    {        
       String str[] = "India Is my country".split(" ");        
       String finalStr="";            
       for(int i = str.length-1; i>= 0 ;i--)    
       {                
            finalStr += str[i]+" ";
            finalStr.toString();

            sb=new StringBuilder(finalStr);
            sb.reverse();              
      }         
       System.out.print(sb);
    }
}