package X;

import java.io.Serializable;

/* renamed from: X.8LH  reason: invalid class name */
public class AnonymousClass8LH implements Serializable {
    public static final AnonymousClass8LH A00 = new AnonymousClass8LH();

    private Object readResolve() {
        return A00;
    }
}
