package img;

import java.awt.image.BufferedImage;

/***************************************
 *made by pengyao1207
 * create:2018/02/02 21:41
 ***************************************/
public class GetImgDhash {
    public static boolean[] getImgDHash(BufferedImage bufferedImage){
        bufferedImage=ImgChangeSize.imgChangeSize(bufferedImage,9,8);
        bufferedImage=ImgToGra.getImageGray(bufferedImage);
        boolean[] re= new boolean[64];
        int n=0;
        for(int j=0;j<8;j++){
            for(int i=0;i<8;i++){
                int color1 = bufferedImage.getRGB(i, j);
                final int r1 = (color1 >> 16) & 0xff;
                int color2 = bufferedImage.getRGB(i+1, j);
                final int r2 = (color2 >> 16) & 0xff;
                re[n++]=(r1 > r2);
            }
        }
        return re;
    }
}
