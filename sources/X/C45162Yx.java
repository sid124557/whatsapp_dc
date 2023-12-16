package X;

import java.util.Iterator;

/* renamed from: X.2Yx  reason: invalid class name and case insensitive filesystem */
public class C45162Yx {
    public final C56972sr A00;
    public final C56982ss A01;

    public final boolean A00(C624134x r5, int i) {
        if (r5 instanceof C31891p1) {
            C31891p1 r52 = (C31891p1) r5;
            if (r52.A00 == i) {
                Iterator it = r52.A01.iterator();
                while (it.hasNext()) {
                    if (this.A00.A0a(C18300x5.A0P(it))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public C45162Yx(C56972sr r1, C56982ss r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
