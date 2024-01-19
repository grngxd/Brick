package cc.grng.brick.util.dim;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dim2f {
    public float one;
    public float two;

    public static Dim2f ZERO() {
        return new Dim2f(0, 0);
    }
}
