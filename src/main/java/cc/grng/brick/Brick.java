package cc.grng.brick;

import cc.grng.brick.component.Component;
import lombok.Getter;
import org.nvgu.NVGU;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
public class Brick {
    NVGU nvgu;
    final ArrayList<Component> components = new ArrayList<>();

    public Brick(NVGU nvgu) {
        this.nvgu = nvgu;
    }

    public void init() {
        for (Component component : components) {
            component.init(nvgu);
        }
    }

    public void render() {
        for (Component component : components) {
            component.render(nvgu);
        }
    }

    public void addComponent(Component component) {
        components.add(component);
        component.init(nvgu);
    }

    public void addComponents(Component... components) {
        this.components.addAll(Arrays.asList(components));
        for (Component component : components) {
            component.init(nvgu);
        }
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public void removeAllComponents() {
        components.clear();
    }
}
