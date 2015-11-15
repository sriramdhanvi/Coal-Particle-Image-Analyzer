/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpsd;

import org.opencv.core.Mat;

/**
 *
 * @author root
 */
 public class ImageClass{
    private static Mat img;
    private static ImageClass instance = new ImageClass();
    private ImageClass(){
       
    }
    
    public static ImageClass getInstance( ) {
        return instance;
    }

    protected static Mat getImage(){
        return img;
    }
    
    protected static void setImage(Mat myimg){
       img = myimg;
    }
}
