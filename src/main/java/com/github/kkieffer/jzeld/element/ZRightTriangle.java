
package com.github.kkieffer.jzeld.element;

import java.awt.Color;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author kkieffer
 */
@XmlRootElement(name = "ZRightTriangle")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZRightTriangle extends ZAbstractTriangle {

        
    protected ZRightTriangle() {
        super();
    }
    
    public ZRightTriangle(double x, double y, double width, double height, double rotation, boolean canSelect, boolean canResize, int borderWidth, Color borderColor, Float[] dashPattern, Color fillColor) {
        super(Type.RIGHT, x, y, width, height, rotation, canSelect, canResize, borderWidth, borderColor, dashPattern, fillColor);
    }
    
    protected ZRightTriangle(ZRightTriangle copy) {
        super(copy);    
    }
    
    @Override
    public ZRightTriangle copyOf() {
        return new ZRightTriangle(this);
    }
    
}