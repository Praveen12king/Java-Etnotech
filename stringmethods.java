public class stringmethods {
    public static void main(String[] args){
        String str="java programming";
        System.out.println("original  "+str);
        System.out.println("length  "+str.length());
        System.out.println("character at index 2  "+str.charAt(2));
        System.out.println("uppercase  "+str.toUpperCase());
        System.out.println("lowercase  "+str.toLowerCase());
        System.out.println("substring  "+str.substring(1,6));
        System.out.println("index of 'pro'  "+str.indexOf("pro"));
        System.out.println("replace 'java' with 'python'  "+str.replace("java","python"));
        System.out.println("concatenation  "+str.concat(" language"));
        System.out.println("starts with 'ja'  "+str.startsWith("ja"));
        System.out.println("ends with 'ing'  "+str.endsWith("ing"));
        System.out.println("trimmed  "+str.trim());


    }
}
