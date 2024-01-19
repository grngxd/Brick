package cc.grng.brick.util.dim;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class Dim4d {
    public double one;
    public double two;
    public double three;
    public double four;

    public static Dim4d ZERO() {
        return new Dim4d(0, 0, 0, 0);
    }
}
