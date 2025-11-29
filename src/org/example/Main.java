package org.example;
import java.util.Scanner;

    public class  Main {
        public static void main(String[] argd) {

        // -------------------- 1. while - 3ზე გამრავლება --------------------
        System.out.println("1. 3-ზე გამრავლების ტაბულა:");
        int i = 1;
        while (i <= 10) {
            System.out.println("3 * " + i + " = " + (3 * i));
            i++;
        }

        System.out.println("---------------------------------------------");

        // -------------------- 2. წინადადების სიგრძე --------------------
        System.out.println("2. წინადადების სიგრძე (ლუწი/კენტი):");
        String text = "ეს არის წინადადება";
        int length = text.length();

        if (length % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }

        System.out.println("---------------------------------------------");

        // -------------------- 3. მასივის დაბეჭდვა, მეხუთის გარეშე --------------------
        System.out.println("3. მასივის ელემენტები (მეხუთის გარეშე):");
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        for (int index = 0; index < arr.length; index++) {
            if (index == 4) {  // მეხუთე პოზიცია
                continue;
            }
            System.out.println(arr[index]);
        }

        System.out.println("---------------------------------------------");

        // -------------------- 4. For - ხმოვნების დათვლა --------------------
        System.out.println("4. ჩაწერე სტრინგი ხმოვნების დასათვლელად:");
        Scanner sc = new Scanner(System.in);
        String txt1 = sc.nextLine();

        String vowels = "aeiouAEIOU";
        int vowelCount = 0;

        for (int j = 0; j < txt1.length(); j++) {
            if (vowels.indexOf(txt1.charAt(j)) != -1) {
                vowelCount++;
            }
        }

        System.out.println("ხმოვნების რაოდენობა: " + vowelCount);

        System.out.println("---------------------------------------------");

        // -------------------- 5. While - თანხმოვნების დათვლა --------------------
        System.out.println("5. ჩაწერე სტრინგი თანხმოვნების დასათვლელად:");
        String txt2 = sc.nextLine();

        String consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        int k = 0;
        int consonantCount = 0;

        while (k < txt2.length()) {
            if (consonants.indexOf(txt2.charAt(k)) != -1) {
                consonantCount++;
            }
            k++;
        }

        System.out.println("თანხმოვნების რაოდენობა: " + consonantCount);

        sc.close();
    }
}


