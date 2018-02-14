package list;

import org.omg.CORBA.IntHolder;

import java.util.ArrayList;

/***************************************
 *made by pengyao1207
 * create:2018/01/31 10:40
 ***************************************/
public class ListTest {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        for(Integer i:arr){
            System.out.println(i);
        }
        System.out.println(arr.get(0));
        System.out.println(arr);
        IntHolder a = new IntHolder();
        a.value=3;
        System.out.println(a.value);
        maxd(1,2,3);
    }

    private static void maxd(int ... val) {
        //val=3;
    }


}
