package cc.grng.brick.component.impl.shape;

import cc.grng.brick.component.Component;
import cc.grng.brick.style.Style;
import cc.grng.brick.util.dim.Dim4f;
import lombok.Builder;
import lombok.experimental.SuperBuilder;
import org.nvgu.NVGU;

import java.awt.*;

@SuperBuilder
public class Circle extends Component {
    int x;
    int y;
    int radius;
    Style style;

    @Override
    public void render(NVGU nvgu) {
        nvgu.circle(
                x,
                y,
                radius,
                style.getColor()
        );
    }
}
