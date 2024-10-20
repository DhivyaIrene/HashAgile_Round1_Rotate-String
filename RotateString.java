import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        System.out.print("Enter no of rotations(k): ");
        int k = sc.nextInt();
        System.out.println("Rotated String: " + rotateString(s, k));
    }

    public static String rotateString(String s, int k) 
    {
        int strlen = s.length();
        char[] rotatedStr = new char[strlen];
        k = k % strlen;
        int idx = 0;
        for (int index = k; index < strlen; index++) {
            rotatedStr[idx++] = s.charAt(index);
        }
        for (int rotIdx = 0; rotIdx < k; rotIdx++) {
            rotatedStr[idx++] = s.charAt(rotIdx);
        }
        String resultStr = "";
        for (int resIdx = 0; resIdx < strlen; resIdx++) {
            resultStr += rotatedStr[resIdx];
        }
        return resultStr;
    }
}
