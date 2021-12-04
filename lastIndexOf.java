public class Practice {

	public static void main(String[] args) {
      String s1 = "Hello Hello Hello, This is Rajalakshmi";
      String s2 = "Hello";

      System.out.println("Last occurence of a in s1: " + s1.lastIndexOf("a"));
      System.out.println("Index of a in s1, before 37th index: " + s1.lastIndexOf("a",37));
      System.out.println("Last occurence of z in s1: " + s1.lastIndexOf("z"));
      System.out.println("Last occurence of s2 in s1: " + s1.lastIndexOf(s2));
      System.out.println("Index of s2 in s1, before 10th index: " + s1.lastIndexOf(s2,10));
	}    
}

//Output:
Last occurence of a in s1: 32
Index of a in s1, before 37th index: 32
Last occurence of z in s1: -1
Last occurence of s2 in s1: 12
Index of s2 in s1, before 10th index: 6
