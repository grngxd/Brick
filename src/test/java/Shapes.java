import cc.grng.brick.Brick;
import cc.grng.brick.component.Component;
import cc.grng.brick.component.impl.shape.Circle;
import cc.grng.brick.component.impl.shape.Rectangle;
import cc.grng.brick.style.Style;
import cc.grng.brick.util.colour.ColourUtil;
import cc.grng.brick.util.dim.Dim4f;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NanoVG;
import org.nvgu.NVGU;
import org.nvgu.util.NVGUColour;

import java.awt.*;

public class Shapes {
    public static void main(String[] args) {
        NVGU nvgu = new NVGU();
        Brick brick = new Brick(nvgu);
        new Window("Shapes", 800, 600, false)
                .run(() -> {
                    nvgu.create();
                    Component root = Component.builder()
                            .x(0)
                            .y(0)
                            .width(800)
                            .height(600)
                            .style(
                                    Style.builder()
                                            .color(ColourUtil.fromHex("#E6E1C5"))
                                            .build()
                            )
                            .build();

                    Rectangle rectangle = Rectangle.builder()
                            .x(200)
                            .y(100)
                            .width(100)
                            .height(100)
                            .style(Style.builder()
                                    .color(ColourUtil.fromHex("#7F2CCB"))
                                    .rounded(new Dim4f(10, 10, 10, 10))
                                    .build()
                            )
                            .build();

                    Circle circle = Circle.builder()
                            .x(100)
                            .y(150)
                            .radius(50)
                            .style(Style.builder()
                                    .color(ColourUtil.fromHex("#06A77D"))
                                    .build()
                            )
                            .build();

                    root.addComponents(
                            rectangle,
                            circle
                    );

                    brick.addComponents(
                            root
                    );
                    brick.init();
                }, () -> {
                    nvgu.frame(800, 600, brick::render);
                });
    }
}