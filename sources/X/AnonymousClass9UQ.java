package X;

import java.io.Closeable;

/* renamed from: X.9UQ  reason: invalid class name */
public class AnonymousClass9UQ {
    public static final char[] A00 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void A00(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                C162477s9.A0A("AssetFileUtil", "unable to close stream", e);
            }
        }
    }
}
