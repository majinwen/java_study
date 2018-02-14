package img;

import java.awt.image.BufferedImage;

/***************************************
 *made by pengyao1207
 * create:2018/02/02 17:34
 ***************************************/
public class ImgToGra {

    public static BufferedImage getImageGray(BufferedImage bufferedImage) {
        for (int i = 0; i < bufferedImage.getWidth(); i++) {
            for (int j = 0; j < bufferedImage.getHeight(); j++) {
                final int color = bufferedImage.getRGB(i, j);
                final int r = (color >> 16) & 0xff;
                final int g = (color >> 8) & 0xff;
                final int b = color & 0xff;
                int gray = (int) (0.3 * r + 0.59 * g + 0.11 * b);
                int newPixel = colorToRGB(gray, gray, gray);
                bufferedImage.setRGB(i,j,newPixel);
            }
        }
        return bufferedImage;
    }

    private static int colorToRGB(int red, int green, int blue) {
        // TODO RGB到灰化值
        int newPixel = 0;
        newPixel += 255;
        newPixel = newPixel << 8;
        newPixel += red;
        newPixel = newPixel << 8;
        newPixel += green;
        newPixel = newPixel << 8;
        newPixel += blue;
        return newPixel;
    }
}
