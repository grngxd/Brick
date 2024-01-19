package cc.grng.brick.component.impl.shape;

import cc.grng.brick.component.Component;
import cc.grng.brick.util.dim.Dim2d;
import cc.grng.brick.util.dim.Dim2f;
import lombok.Builder;
import lombok.experimental.SuperBuilder;
import org.nvgu.NVGU;

import java.awt.*;

@SuperBuilder
public class Arrow extends Component {
    @Builder.Default
    Dim2f start = Dim2f.ZERO();
    @Builder.Default
    Dim2f end = Dim2f.ZERO();
    @Builder.Default
    Color color = Color.BLACK;
    @Builder.Default
    float headLength = 15;
    @Override
    public void render(NVGU nvgu) {



        if (style.isFilled()) {
            nvgu.polygonBorder(
                    new float[][]{
                            new float[]{
                                    start.one, start.two
                            },
                            new float[]{
                                    end.one - (headLength / 4) * (float) Math.cos(Math.atan2(end.two - start.two, end.one - start.one)), end.two - (headLength / 4) * (float) Math.sin(Math.atan2(end.two - start.two, end.one - start.one))
                            },
                    },
                    style.getThickness(),
                    style.getColor()
            );
        } else {
            nvgu.polygonBorder(
                    new float[][]{
                            new float[]{
                                    start.one, start.two
                            },
                            new float[]{
                                    end.one, end.two
                            },
                    },
                    style.getThickness(),
                    style.getColor()
            );
        }

        float angle = (float) Math.atan2(end.two - start.two, end.one - start.one);

        if (style.isFilled()) {
            nvgu.polygon(
                    new float[][]{
                            new float[]{
                                    end.one - headLength * (float) Math.cos(angle - Math.PI / 6), end.two - headLength * (float) Math.sin(angle - Math.PI / 6)
                            },
                            new float[]{
                                    end.one, end.two
                            },
                            new float[]{
                                    end.one - headLength * (float) Math.cos(angle + Math.PI / 6), end.two - headLength * (float) Math.sin(angle + Math.PI / 6)
                            },
                    },
                    style.getColor()
            );
        } else {
            nvgu.polygonBorder(
                    new float[][]{
                            new float[]{
                                    end.one - headLength * (float) Math.cos(angle - Math.PI / 6), end.two - headLength * (float) Math.sin(angle - Math.PI / 6)
                            },
                            new float[]{
                                    end.one, end.two
                            },
                            new float[]{
                                    end.one - headLength * (float) Math.cos(angle + Math.PI / 6), end.two - headLength * (float) Math.sin(angle + Math.PI / 6)
                            },
                    },
                    style.getThickness(),
                    style.getColor()
            );
        }
    }
}
