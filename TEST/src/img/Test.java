package img;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

/***************************************
 *made by pengyao1207
 * create:2018/02/02 17:59
 ***************************************/
public class Test {
    public static void main(String ... args) throws IOException {
        String pic1="C:\\Users\\school\\Desktop\\timg.jpg";
        String pic2="C:\\Users\\school\\Desktop\\333.png";
        String pic3="C:\\Users\\school\\Desktop\\QQ图片20180202165422.jpg";
        String pic4="C:\\Users\\school\\Desktop\\timg.jpg";
        System.out.println(GetDiff.getDiff(pic1,pic2));


//        System.out.println(GetDiff.getDiff(pic1,pic3));
//        System.out.println(GetDiff.getDiff(pic3,pic4));
    }
}
