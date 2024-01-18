package cc.grng.brick.util.dim;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dim4f {
    public float one;
    public float two;
    public float three;
    public float four;

    public static Dim4f ZERO() {
        return new Dim4f(0, 0, 0, 0);
    }

}
