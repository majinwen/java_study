package equal;

/***************************************
 *made by pengyao1207
 * create:2018/01/31 10:14
 ***************************************/
public class Equaltest {
   public static void main(String[] args){
       A e = null;
       Class c1 = e.getClass();
       System.out.println(c1.getName());



      // dd.d=8;
       String a="123";
       String b=a;
       System.out.println(a.equals(b));//true
       A t1 = new B();
       System.out.println(t1.getClass());//B
       System.out.println(t1.getClass().getName());//B
       // String c1="123456789";
        String c2="123456789";
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

   }
}
