import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Intem {

    public static void main(String[] args) {

   //     System.out.println(reverse(13405));
        System.out.println(4%10);
    }


    public static int reverse(int x){
        int dec=10;
        int c;
        List<Integer> list=new LinkedList<>();
            while (x/dec!=0){
                dec=dec*10;
            }
            dec=dec/10;
            while (dec>=1){
                System.out.println(x/dec+" x :"+x+" dex :"+dec);
                c=x/dec;
                list.add(c);
                x=x-c*dec;

                dec=dec/10;
            }
        System.out.println("sp it begins");
        Iterator<Integer> integerIterator=list.listIterator();
            while (integerIterator.hasNext()){
                System.out.println(integerIterator.next());
            }

        return dec;


    }
}
