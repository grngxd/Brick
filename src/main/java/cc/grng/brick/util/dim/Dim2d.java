package cc.grng.brick.util.dim;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dim2d {
    public double one;
    public double two;

    public static Dim2d ZERO() {
        return new Dim2d(0, 0);
    }
}
