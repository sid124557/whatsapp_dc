package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.7do  reason: invalid class name and case insensitive filesystem */
public final class C154827do {
    public static final C151737Wc A00 = new C151737Wc("GoogleSignInCommon", new String[0]);

    public static void A00(Context context) {
        C157437iI.A00(context).A01();
        Set<C159087l6> set = C159087l6.A00;
        synchronized (set) {
        }
        for (C159087l6 r1 : set) {
            if (r1 instanceof C127086Qo) {
                C186128un r0 = ((C127086Qo) r1).A01;
                if (r0 != null) {
                    r0.BtA();
                }
            } else {
                throw C18320x8.A0m();
            }
        }
        C163007t7.A02();
    }
}
