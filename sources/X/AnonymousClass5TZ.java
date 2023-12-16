package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.5TZ  reason: invalid class name */
public final class AnonymousClass5TZ {
    public C108845de A00;
    public final AnonymousClass1VX A01;

    public AnonymousClass5TZ(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public final C108845de A00(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        if (bundle.getBoolean("persisted_status_distribution_key", false)) {
            return this.A00;
        }
        return (C108845de) bundle.getParcelable("status_distribution");
    }

    public final void A02(Bundle bundle, C108845de r4) {
        C162457s7.A0J(bundle, 0);
        if (A03(r4)) {
            bundle.putParcelable("status_distribution", r4);
            return;
        }
        this.A00 = r4;
        bundle.putBoolean("persisted_status_distribution_key", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.A0O(r1, 2467);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C108845de r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto L_0x0025
            X.1VX r2 = r4.A01
            X.2vE r1 = X.C58422vE.A01
            r0 = 2469(0x9a5, float:3.46E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0025
            r0 = 2467(0x9a3, float:3.457E-42)
            int r2 = r2.A0O(r1, r0)
            java.util.List r0 = r5.A01
            int r1 = r0.size()
            java.util.List r0 = r5.A02
            int r0 = r0.size()
            int r1 = r1 + r0
            if (r1 <= r2) goto L_0x0025
            r3 = 0
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TZ.A03(X.5de):boolean");
    }

    public final void A01(Intent intent, C108845de r4) {
        if (A03(r4)) {
            intent.putExtra("status_distribution", r4);
            return;
        }
        this.A00 = r4;
        intent.putExtra("persisted_status_distribution_key", true);
    }
}
