package img;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

/***************************************
 *made by pengyao1207
 * create:2018/02/02 17:56
 ***************************************/
public class ReadImg {
    public static BufferedImage readImg(String url) throws IOException {
        return ImageIO.read(new FileInputStream(url));
    }
}
