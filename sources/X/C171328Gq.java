package X;

import java.util.Map;

/* renamed from: X.8Gq  reason: invalid class name and case insensitive filesystem */
public class C171328Gq implements C184408rk {
    public final String A00;
    public final /* synthetic */ C112275jT A01;

    public C171328Gq(C112275jT r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public void BSO(AnonymousClass7T4 r3, int i) {
        C184168rM r1 = this.A01.A09;
        if (r1 != null) {
            r1.BMD(i, this.A00);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Map map = (Map) obj;
        C184168rM r0 = this.A01.A09;
        if (r0 != null) {
            r0.BME(map);
        }
    }
}
