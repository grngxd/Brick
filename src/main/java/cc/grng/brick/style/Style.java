package cc.grng.brick.style;

import cc.grng.brick.util.dim.Dim4f;
import lombok.Builder;
import lombok.Getter;
import ru.hogoshi.Animation;

import java.awt.*;

@Builder @Getter
public class Style {
    @Builder.Default Color color = Color.BLACK;
    @Builder.Default
    Dim4f rounded = new Dim4f(0, 0, 0, 0);
    @Builder.Default
    float thickness = 0;
    @Builder.Default
    boolean filled = false;
}
