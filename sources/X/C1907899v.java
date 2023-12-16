package X;

import android.content.Context;

/* renamed from: X.99v  reason: invalid class name and case insensitive filesystem */
public class C1907899v extends C197739dn {
    public final /* synthetic */ AnonymousClass4EY A00;
    public final /* synthetic */ AnonymousClass9b0 A01;
    public final /* synthetic */ C201629kS A02;
    public final /* synthetic */ C203499no A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1907899v(Context context, AnonymousClass4EY r2, C40602Ha r3, AnonymousClass9b0 r4, C201629kS r5, C203499no r6, C84104Ba r7, boolean z) {
        super(context, r3, r7);
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = z;
        this.A00 = r2;
    }

    public void A04(AnonymousClass34V r3) {
        C203499no r1 = this.A03;
        if (r1 != null) {
            r1.BK0(r3, 11);
        }
        AnonymousClass4EY r0 = this.A00;
        if (r0 != null) {
            r0.BaB(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if ("true".equals(r1) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r10) {
        /*
            r9 = this;
            X.9no r2 = r9.A03
            if (r2 == 0) goto L_0x000a
            r1 = 11
            r0 = 0
            r2.BK0(r0, r1)
        L_0x000a:
            X.1iu r5 = new X.1iu
            r5.<init>()
            X.9b0 r6 = r9.A01
            X.9Tx r1 = r6.A09
            X.9kS r0 = r9.A02
            java.util.ArrayList r0 = r1.A04(r0, r10)
            r5.A01 = r0
            X.36K r0 = X.C1899693i.A0T(r10)
            if (r0 == 0) goto L_0x0060
            java.lang.String r8 = "after"
            X.7yP r7 = new X.7yP
            r7.<init>()
            X.39V[] r4 = r0.A0u()
            if (r4 == 0) goto L_0x005e
            r3 = 0
        L_0x002f:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x005e
            r0 = r4[r3]
            java.lang.String r2 = r0.A02
            java.lang.String r1 = r0.A03
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0043
            r7.A00 = r1
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0043:
            java.lang.String r0 = "last"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0040
            boolean r0 = X.C1899693i.A0y(r1)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "true"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x005b
        L_0x005a:
            r0 = 1
        L_0x005b:
            r7.A01 = r0
            goto L_0x0040
        L_0x005e:
            r5.A00 = r7
        L_0x0060:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0084
            X.33l r2 = r6.A05
            X.2sH r0 = r2.A01
            long r3 = r0.A0H()
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r2)
            java.lang.String r0 = "payments_all_transactions_last_sync_time"
            X.C18270x1.A0i(r1, r0, r3)
            X.7oG r2 = r2.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "updateAllTransactionsLastSyncTimeMilli to: "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r3)
            r2.A06(r0)
        L_0x0084:
            r6.A02(r5)
            X.4EY r0 = r9.A00
            if (r0 == 0) goto L_0x008e
            r0.BaC(r5)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907899v.A05(X.36K):void");
    }

    public void A03(AnonymousClass34V r1) {
        A04(r1);
    }
}
