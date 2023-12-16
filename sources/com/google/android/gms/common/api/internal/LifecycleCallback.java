package com.google.android.gms.common.api.internal;

import X.AnonymousClass001;
import X.AnonymousClass6R3;
import X.AnonymousClass70B;
import X.C163007t7;
import X.C185368tX;
import android.os.Bundle;

public class LifecycleCallback {
    public final C185368tX A00;

    public static C185368tX getChimeraLifecycleFragmentImpl(AnonymousClass70B r0) {
        throw AnonymousClass001.A0e("Method not available in SDK.");
    }

    public void A00() {
        if (this instanceof AnonymousClass6R3) {
            AnonymousClass6R3 r1 = (AnonymousClass6R3) this;
            if (!r1.A01.isEmpty()) {
                r1.A03.A07(r1);
            }
        }
    }

    public void A01() {
        if (this instanceof AnonymousClass6R3) {
            AnonymousClass6R3 r1 = (AnonymousClass6R3) this;
            r1.A05 = true;
            if (!r1.A01.isEmpty()) {
                r1.A03.A07(r1);
            }
        }
    }

    public void A02() {
        if (this instanceof AnonymousClass6R3) {
            AnonymousClass6R3 r3 = (AnonymousClass6R3) this;
            r3.A05 = false;
            C163007t7 r2 = r3.A03;
            synchronized (C163007t7.A0I) {
                if (r2.A01 == r3) {
                    r2.A01 = null;
                    r2.A0A.clear();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass6R3
            if (r0 == 0) goto L_0x0035
            r5 = r8
            X.6R3 r5 = (X.AnonymousClass6R3) r5
            java.util.concurrent.atomic.AtomicReference r4 = r5.A04
            java.lang.Object r6 = r4.get()
            X.7GK r6 = (X.AnonymousClass7GK) r6
            r0 = 1
            if (r9 == r0) goto L_0x0036
            r0 = 2
            if (r9 != r0) goto L_0x0060
            X.6Q8 r2 = r5.A02
            X.8tX r0 = r5.A00
            android.app.Activity r1 = r0.B96()
            X.C162177rO.A02(r1)
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.A04(r1, r0)
            if (r2 == 0) goto L_0x0065
            if (r6 == 0) goto L_0x0035
            X.6Tp r0 = r6.A01
            int r1 = r0.A01
            r0 = 18
            if (r1 != r0) goto L_0x0062
            if (r2 != r0) goto L_0x0062
        L_0x0035:
            return
        L_0x0036:
            r0 = -1
            if (r10 == r0) goto L_0x0065
            if (r10 != 0) goto L_0x0060
            if (r6 == 0) goto L_0x0035
            r3 = 13
            if (r11 == 0) goto L_0x0047
            java.lang.String r0 = "<<ResolutionFailureErrorDetail>>"
            int r3 = r11.getIntExtra(r0, r3)
        L_0x0047:
            X.6Tp r0 = r6.A01
            java.lang.String r2 = r0.toString()
            r1 = 0
            r0 = 1
            X.6Tp r7 = new X.6Tp
            r7.<init>(r1, r2, r0, r3)
        L_0x0054:
            int r1 = r6.A00
            r0 = 0
            r4.set(r0)
            X.7t7 r0 = r5.A03
            r0.A05(r7, r1)
            return
        L_0x0060:
            if (r6 == 0) goto L_0x0035
        L_0x0062:
            X.6Tp r7 = r6.A01
            goto L_0x0054
        L_0x0065:
            r0 = 0
            r4.set(r0)
            X.7t7 r0 = r5.A03
            android.os.Handler r1 = r0.A06
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r1.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.A03(int, int, android.content.Intent):void");
    }

    public void A04(Bundle bundle) {
    }

    public void A05(Bundle bundle) {
    }

    public LifecycleCallback(C185368tX r1) {
        this.A00 = r1;
    }
}
