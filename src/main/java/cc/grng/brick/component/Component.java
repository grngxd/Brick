package cc.grng.brick.component;

import cc.grng.brick.style.Style;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.nvgu.NVGU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuperBuilder
@AllArgsConstructor @RequiredArgsConstructor
public class Component {
    int x;
    int y;
    int width;
    int height;
    Style style;
    final ArrayList<Component> components = new ArrayList<>(
            List.of()
    );

    public void init(NVGU nvgu) {}
    public void render(NVGU nvgu) {
        if (style.getColor() != null) {
            nvgu.rectangle(
                    new java.awt.Rectangle(
                            x, y, width, height
                    ),
                    style.getColor()
            );
        }

        for (Component component : components) {
            component.render(nvgu);
        }
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void addComponents(Component... components) {
        this.components.addAll(Arrays.asList(components));
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public void removeAllComponents() {
        components.clear();
    }
}
