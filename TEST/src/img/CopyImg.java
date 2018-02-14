package img;

import java.awt.image.BufferedImage;

/***************************************
 *made by pengyao1207
 * create:2018/02/02 18:51
 ***************************************/
public class CopyImg {
    public static BufferedImage copyImg(BufferedImage bufferedImage){
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(),bufferedImage.getType());
        bufferedImage2.setData(bufferedImage.getData());
        return bufferedImage2;
    }
}
