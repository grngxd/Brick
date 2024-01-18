package cc.grng.brick.component.impl.shape;

import cc.grng.brick.component.Component;
import cc.grng.brick.style.Style;
import cc.grng.brick.util.dim.Dim4f;
import lombok.Builder;
import lombok.experimental.SuperBuilder;
import org.nvgu.NVGU;

import java.awt.*;

@SuperBuilder
public class Rectangle extends Component {
    int x;
    int y;
    int width;
    int height;
    Style style;

    @Override
    public void render(NVGU nvgu) {
        if (style.getRounded().equals(Dim4f.ZERO())) {
            nvgu.rectangle(
                    new java.awt.Rectangle(
                            x, y, width, height
                    ),
                    style.getColor()
            );
        } else {
            nvgu.roundedRectangle(
                    new java.awt.Rectangle(
                            x, y, width, height
                    ),
                    style.getRounded().one,
                    style.getRounded().two,
                    style.getRounded().three,
                    style.getRounded().four,
                    style.getColor()
            );
        }
    }
}
