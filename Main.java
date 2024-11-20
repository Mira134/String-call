import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char[] ch = new char[n];
        ch = scn.next().toCharArray();

        String original = "";
        for(int i = 0;i<n;i++){
            original+= ch[i];
        }
        System.out.println("Original String: "+original);
        String reverse = "";
        for(int i=ch.length-1;i>=0;i--){
            reverse+= ch[i];
        }
        System.out.println("Reverse String: "+reverse);

        System.out.println("Concatinated String: "+original+"<->"+reverse);
    }
}