import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        StringBuilder str = new StringBuilder(s);
        Boolean Flag = true;
        while (Flag)
        {
        Flag = false;    
        for(int i=0;i<str.length()-1;i++)
        {
            
            if(str.charAt(i)==str.charAt(i+1))
            {
                str.delete(i,i+2);
                Flag = true;
            }
        } 
        }
        if(str.length()==0)
        {
            str = new StringBuilder("Empty String");
        }
        return str.toString();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
