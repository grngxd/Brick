package cc.grng.brick.util.colour;

import java.awt.*;

public class ColourUtil {
    public static Color fromHex(String hex) {
        return new Color(
                Integer.valueOf(hex.substring(1, 3), 16),
                Integer.valueOf(hex.substring(3, 5), 16),
                Integer.valueOf(hex.substring(5, 7), 16),
                hex.length() == 9 ? Integer.valueOf(hex.substring(7, 9), 16) : 255
        );
    }

    public static String toHex(Color color) {
        return String.format("#%02x%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }
}
