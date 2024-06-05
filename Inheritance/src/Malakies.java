public class Malakies {

    public static void main(String[] args) {
        String birthdate="6/8/1989";
        String string="dsdsdsds";
        System.out.println(birthdate.substring(4));

        System.out.println(String.join("/","haha","yolo","skata","poutse"));
        System.out.println(birthdate.equalsIgnoreCase(string));
        StringBuilder stringBuilder=new StringBuilder("malakia stringbuilder");
        StringBuilder stringBuilder1=new StringBuilder();
        StringBuilder stringBuilder2=new StringBuilder(32);
        stringBuilder.deleteCharAt(3).insert(3,"peos");
        doStringstuff(string);
        doStringstuff(stringBuilder);
        doStringstuff(stringBuilder1);
        doStringstuff(stringBuilder2);


    }


    public static void doStringstuff(String s1){
        System.out.println("string :"+s1);
        System.out.println("length :"+ s1.length());
    }

    public static void doStringstuff(StringBuilder s1){
        System.out.println("string :"+s1);
        System.out.println("length :"+ s1.length());
        System.out.println("cap :"+s1.capacity());
    }
}
