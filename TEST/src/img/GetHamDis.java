package img;

/***************************************
 *made by pengyao1207
 * create:2018/02/02 21:58
 ***************************************/
public class GetHamDis {
    public static int getHamDis(boolean[] arr1,boolean[]arr2){
        int re=0;
        for(int i=0;i<64;i++){
            if(arr1[i]!=arr2[i]){
                re++;
            }
        }
        return re;
    }
}
