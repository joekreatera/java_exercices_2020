import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

class ImageBN{

    public static void main(String[] args) throws Exception {
        BufferedImage img = ImageIO.read(new File("./image.jpg"));
        int height = img.getHeight();
        int width = img.getWidth();
    
        System.out.println(height + "  " + width + " " + img.getRGB(30, 30));
    
        for (int h = 1; h < height; h++) {
          for (int w = 1; w < width; w++) {
            int rgb = img.getRGB(w, h);
            int red = (rgb >> 16) & 0x000000FF;
            int green = (rgb >> 8) & 0x000000FF;
            int blue = (rgb) & 0x000000FF;
    
            if (red == 0 && green == 0 && blue == 0) {
               System.out.print("__");
            }else{
                System.out.print("  ");
            }
          }
          System.out.println("");
        }
      }
}