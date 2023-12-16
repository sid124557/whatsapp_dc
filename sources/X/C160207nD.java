package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.7nD  reason: invalid class name and case insensitive filesystem */
public final class C160207nD {
    public static final List A01 = AnonymousClass002.A0I(50);
    public final Handler A00;

    public static C150717Rx A00() {
        C150717Rx r0;
        List list = A01;
        synchronized (list) {
            if (list.isEmpty()) {
                r0 = new C150717Rx();
            } else {
                r0 = (C150717Rx) list.remove(AnonymousClass002.A03(list));
            }
        }
        return r0;
    }

    public C160207nD(Handler handler) {
        this.A00 = handler;
    }
}
