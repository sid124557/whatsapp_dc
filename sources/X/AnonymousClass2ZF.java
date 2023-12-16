package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.2ZF  reason: invalid class name */
public final class AnonymousClass2ZF {
    public int A00 = 0;
    public final C160237nI A01;
    public final Map A02 = new AnonymousClass05C();

    public final String A00() {
        String A0v;
        C160237nI r2 = this.A01;
        synchronized (r2) {
            A0v = AnonymousClass0x9.A0v(r2.A01, "topic_operation_queue");
        }
        if (TextUtils.isEmpty(A0v)) {
            return null;
        }
        String[] A1b = C18320x8.A1b(A0v);
        if (A1b.length <= 1 || TextUtils.isEmpty(A1b[1])) {
            return null;
        }
        return A1b[1];
    }

    public AnonymousClass2ZF(C160237nI r2) {
        this.A01 = r2;
    }
}
