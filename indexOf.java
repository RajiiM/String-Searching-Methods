public class Practice {

	public static void main(String[] args) {
      String s1 = "Hello Hello Hello, This is Rajalakshmi";
      String s2 = "Hello";

      System.out.println("First occurence of i in s1: " + s1.indexOf("i"));
      System.out.println("Index of i in s1, after 25th index: " + s1.indexOf("i",25));
      System.out.println("First occurence of z in s1: " + s1.indexOf("z"));
      System.out.println("First occurence of s2 in s1: " + s1.indexOf(s2));
      System.out.println("Index of s2 in s1, after 10th index: " + s1.indexOf(s2,10));
	}    
}

//Output
First occurence of i in s1: 21
Index of i in s1, after 25th index: 37
First occurence of z in s1: -1
First occurence of s2 in s1: 0
Index of s2 in s1, after 10th index: 12
