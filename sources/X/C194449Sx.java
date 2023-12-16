package X;

import java.util.Map;

/* renamed from: X.9Sx  reason: invalid class name and case insensitive filesystem */
public class C194449Sx {
    public final AnonymousClass3CF A00;

    public void A00(AnonymousClass20B r2, String str, String str2, Map map) {
        this.A00.A00(r2, str, str2, map);
    }

    public void A01(AnonymousClass20B r4, Map map) {
        this.A00.A00(r4, "DEFAULT_JOB_ID", "DEFAULT_NAMESPACE", map);
    }

    public void A02(String str) {
        AnonymousClass2MR r1 = this.A00.A00;
        synchronized (r1) {
            r1.A00.remove(str);
        }
    }

    public C194449Sx(AnonymousClass3CF r1) {
        this.A00 = r1;
    }
}
