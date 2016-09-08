/**
 * Created by TylerRohaley on 9/6/16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class SubstitutionCipher {

    public static char p[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' };
    public static char ch[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
            'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C',
            'V', 'B', 'N', 'M' };

    public static String doEncryption(String s)
    {
        char c[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (p[j] == s.charAt(i))
                {
                    c[i] = ch[j];
                    break;
                }
            }
        }
        return (new String(c));
    }

    public static String doDecryption(String s)
    {
        char p1[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (ch[j] == s.charAt(i))
                {
                    p1[i] = p[j];
                    break;
                }
            }
        }
        return (new String(p1));
    }

    public static void wordCount() throws IOException
    {

        System.out.println("Enter the message: ");
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();

        String input = s.toLowerCase();// Make your input toLowerCase.
        int[] alphabetArray = new int[26];
        for ( int i = 0; i < input.length(); i++ ) {
            char ch=  input.charAt(i);
            int value = (int) ch;
            if (value >= 97 && value <= 122){
                alphabetArray[ch-'a']++;
            }
        }
        for (int i = 0; i < alphabetArray.length; i++) {
            if(alphabetArray[i]>0){
                char ch = (char) (i+97);
                System.out.println(ch +"  : "+alphabetArray[i]);   //Show the result.
            }
        }

    }

    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        //String en = doEncryption(sc.next().toLowerCase());
        //System.out.println("Encrypted message: " + en);
        //System.out.println("Decrypted message: " + doDecryption(en));

        System.out.println("Crypto Tool Menu");
        System.out.println("1. Check Letter Frequency");
        System.out.println("2. Check Letter Pair Frequency");
        System.out.println("3. Decrypt");
        System.out.println("4. Exit");
        System.out.println("Please choose an option: ");

        Scanner scan = new Scanner(System.in);

        String choice;
        choice = scan.nextLine();


        while (choice != "4")
        {

            switch (choice)
            {

                case "1":

                    wordCount();

                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

            }

            System.out.println("Crypto Tool Menu");
            System.out.println("1. Check Letter Frequency");
            System.out.println("2. Check Letter Pair Frequency");
            System.out.println("3. Decrypt");
            System.out.println("4. Exit");
            System.out.println("Please choose an option: ");

            Scanner sc2 = new Scanner(System.in);

            choice = sc2.nextLine();


        }

    }

}