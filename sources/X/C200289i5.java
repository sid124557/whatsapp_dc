package X;

import android.text.TextUtils;

/* renamed from: X.9i5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200289i5 implements Runnable {
    public final /* synthetic */ C191129Co A00;
    public final /* synthetic */ String A01;

    public final void run() {
        C191129Co r1 = this.A00;
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            r1.A02 = AnonymousClass97T.A0c(r1);
            r1.A7j();
            C133686hm r0 = r1.A00;
            r1.A7g((AnonymousClass99H) r0.A08, str, r0.A0B, r1.A02, (String) C1899593h.A0X(r0.A09), 1);
            return;
        }
        r1.A7e();
    }

    public /* synthetic */ C200289i5(C191129Co r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
