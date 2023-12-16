package X;

import android.content.Context;

/* renamed from: X.76J  reason: invalid class name */
public class AnonymousClass76J {
    public static C185258tL A00;

    public static void A00(Context context) {
        if (A00 == null) {
            try {
                A00 = (C185258tL) Class.forName("DefaultLocationProvider").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            } catch (Exception e) {
                throw new AnonymousClass8RB(e);
            }
        }
    }
}
