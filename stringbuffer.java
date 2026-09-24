public class stringbuffer {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("hello");
        System.out.println("original  "+sb);
        sb.append("java");
        System.out.println("append  "+sb);
        sb.insert(1,"java");
        System.out.println("insert  "+sb);
        sb.replace(1,3,"java");
        System.out.println("replace  "+sb);
        sb.delete(1, 3);
        System.out.println("delete  "+sb);
        System.out.println("reverse"+sb.reverse());


    }
}
