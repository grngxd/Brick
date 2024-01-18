package cc.grng.brick.util.dim;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dim4i {
    public int one;
    public int two;
    public int three;
    public int four;

    public static Dim4i ZERO() {
        return new Dim4i(0, 0, 0, 0);
    }
}
