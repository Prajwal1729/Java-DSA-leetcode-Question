package Leetcode;

public class problem161 {

    public static String multiplyString(String s1,String s2){
        int n1 = s1.length();
        int n2 = s2.length();

        int res[] = new int[n1+n2];

        for(int i = n1-1;i>=0;i--){
           for(int j = n2-1;j>=0;j--){
              int mul = (s1.charAt(i) - '0')*(s2.charAt(j) - '0');
              int sum = mul + res[i+j+1];
              res[i+j+1] =  sum%10;
              res[i+j]+=sum/10;
           }
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0;i<res.length;i++){
            if(sb.length() == 0 && res[i] == 0){
                continue;
            }
            sb.append(res[i]);
        }

        return sb.length()==0 ? "0" : sb.toString();



    }
    public static void main(String[] args) {
        String num1 = "23";
        String num2 = "42";
        String res = multiplyString(num1, num2);
        System.out.println(res);
    }
}
