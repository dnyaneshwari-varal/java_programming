package Coding_que;

public class LargeNum {

	public static void main(String[] args) {
		int[] arr = {45, 9, 4, 633, 61, 98};
		String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = arr[i] + ""; // simple way to convert to string
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = 0; j < strArr.length - i - 1; j++) {
                String ab = strArr[j] + strArr[j + 1];
                String ba = strArr[j + 1] + strArr[j];
                if (ab.compareTo(ba) < 0) { // swap if ba is bigger
                    String temp = strArr[j];
                    strArr[j] = strArr[j + 1];
                    strArr[j + 1] = temp;
                }
            }
        }
        
        String result = "";
        for (String s : strArr) {
            result += s;
        }

        // Step 4: Print result
        System.out.println("Largest Number: " + result);
	}

}
