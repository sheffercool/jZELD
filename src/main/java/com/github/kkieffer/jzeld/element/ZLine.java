
package com.github.kkieffer.jzeld.element;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A ZLine is an object that defines line that has color and thickness. The line's
 * top left corer is set within the bounds box such the top left corner of the rectangle is at the object's position.  If rotated,
 * the rotation occurs about the center of the line.
 * 
 * If the line's width is negative, the the line is drawn to the bounds of the panel.
 * 
 * The ZLine does not support a fill color.
 * 
 * 
 * @author kkieffer
 */
@XmlRootElement(name = "ZLine")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZLine extends ZAbstractShape {

  
    protected ZLine() {}

    /**
     * Create a ZLine
     * @param x the x coordinate, upper left x, in units
     * @param y the y coordinate, upper left y, in units
     * @param width the width of the line in units, or -1 for unlimited width
     * @param rotation desired rotation of the component in degrees, clockwise
     * @param canSelect if the object can be selected by the ZCanvas mouse click
     * @param canResize if the object can be resized by the mouse drag
     * @param lineThickness unit width of the border, use zero for no border
     * @param lineColor color of the border, which can be null only if the borderWidth is zero
     */
    public ZLine(double x, double y, double width, double rotation, boolean canSelect, boolean canResize, float lineThickness, Color lineColor, Float[] dashPattern) {
        super(x, y, width, .5, rotation, canSelect, canResize, lineThickness, lineColor, dashPattern, null);
             
        if (lineColor == null)
            throw new IllegalArgumentException("Line color cannot be null");
        
        if (lineThickness <= 0)
            throw new IllegalArgumentException("Line thickness must be positive");


        
    }
    
    public ZLine(ZLine copy) {
        super(copy);
    }
    
    @Override
    public ZElement copyOf() {
        return new ZLine(this);
    }
    

    
    @Override
    public boolean hasFill() {
        return false;
    }
   
    
    @Override
    public boolean supportsFlip() {
        return false;
    }
    
    
    protected void drawLine(Graphics2D g, int unitSize, int width, int height) {
        g.drawLine(0, height/2, width, height/2);
    }
    
   

    @Override
    protected void fillShape(Graphics2D g, int unitSize, int width, int height) {
    }

    @Override
    protected void drawShape(Graphics2D g, int unitSize, int width, int height) {
        g.drawLine(0, height/2, width, height/2);
    }

    @Override
    protected Shape getAbstractShape() {
        return null;
    }

      
}
