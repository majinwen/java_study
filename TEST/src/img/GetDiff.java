package img;

import java.awt.image.BufferedImage;
import java.io.IOException;

/***************************************
 *made by pengyao1207
 * create:2018/02/02 22:01
 ***************************************/
public class GetDiff {
    public static int getDiff(String str1,String str2) throws IOException {
        BufferedImage pic1=ReadImg.readImg(str1);
        BufferedImage pic2=ReadImg.readImg(str2);

        boolean[] d1 = GetImgDhash.getImgDHash(pic1);
        boolean[] d2 = GetImgDhash.getImgDHash(pic2);

        return GetHamDis.getHamDis(d1,d2);

    }
}
