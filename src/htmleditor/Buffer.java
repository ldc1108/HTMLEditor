/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package htmleditor;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Danielle Neuberger and Luke Coy
 */
public class Buffer extends Observable{
    String contents = "";
    int number;    
    
    public Buffer(int number, String contents){
        this.number = number;
        this.contents = contents;
    }
    
    public void updateContents(String s){
        contents = s;
    }
}
