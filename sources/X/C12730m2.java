package X;

import android.view.View;

/* renamed from: X.0m2  reason: invalid class name and case insensitive filesystem */
public class C12730m2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C002202q A02;

    public C12730m2(View view, C002202q r2, int i) {
        this.A02 = r2;
        this.A01 = view;
        this.A00 = i;
    }

    public void run() {
        C002202q r6 = this.A02;
        if (r6.A06 != null) {
            int height = r6.getHeight();
            C16290sm r0 = r6.A06;
            View view = this.A01;
            AnonymousClass0UZ r3 = r6.A07;
            int i = r3.A03;
            int i2 = this.A00;
            r3.A08 = view;
            r3.A02 = -1;
            if (r3.A09(height - r0.BBV(view, height), 0, i2)) {
                AnonymousClass0YY.A05(r6);
                return;
            }
            AnonymousClass0OC r02 = r6.A05;
            if (r02 != null && i == 0) {
                C16290sm r2 = r6.A06;
                AnonymousClass00P r1 = r02.A00;
                r1.A09.A07.A02();
                if (r2 == AnonymousClass00P.A0H) {
                    if (!r1.A0D) {
                        r1.A03(AnonymousClass0FG.SWIPE_AWAY);
                    }
                    r1.A00();
                }
            }
        }
    }
}
