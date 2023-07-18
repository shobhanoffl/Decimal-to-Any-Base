import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = "";

        while(a>0){
            s+=(a%b);
            a/=b;
        }

        char temp;
        char[] st =s.toCharArray();
        for(int i=0; i<s.length()/2;i++){
            temp=st[i];
            st[i]=st[s.length()-1-i];
            st[s.length()-1-i]=temp;
        }

        int answer = Integer.parseInt(new String(st));
        System.out.println(answer);
    }
}