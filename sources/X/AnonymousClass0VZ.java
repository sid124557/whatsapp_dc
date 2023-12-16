package X;

import android.os.Build;
import android.util.Property;

/* renamed from: X.0VZ  reason: invalid class name */
public class AnonymousClass0VZ {
    public static final Property A00 = new C17510vh(9);
    public static final Property A01 = new C17510vh(8);
    public static final C04720Qj A02;

    static {
        C04720Qj r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            r0 = new AnonymousClass0AI();
        } else if (i >= 23) {
            r0 = new AnonymousClass0AJ();
        } else if (i >= 22) {
            r0 = new AnonymousClass0AK();
        } else {
            r0 = new AnonymousClass0AL();
        }
        A02 = r0;
    }
}
