package X;

import android.content.Context;

/* renamed from: X.99u  reason: invalid class name and case insensitive filesystem */
public class C1907799u extends C197739dn {
    public final /* synthetic */ AnonymousClass4EY A00;
    public final /* synthetic */ AnonymousClass9U5 A01;
    public final /* synthetic */ C203719oC A02;
    public final /* synthetic */ AnonymousClass2LZ A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1907799u(Context context, AnonymousClass4EY r2, C40602Ha r3, AnonymousClass9U5 r4, C203719oC r5, AnonymousClass2LZ r6, C84104Ba r7, String str) {
        super(context, r3, r7);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r2;
        this.A04 = str;
        this.A03 = r6;
    }

    public void A03(AnonymousClass34V r4) {
        C1899593h.A1G(this.A01.A0H, r4, "get-methods: on-request-error=", AnonymousClass001.A0o());
        C203499no B7b = this.A02.B7b();
        if (B7b != null) {
            B7b.BK0(r4, 12);
        }
        AnonymousClass4EY r0 = this.A00;
        if (r0 != null) {
            r0.Ba4(r4);
        }
    }

    public void A04(AnonymousClass34V r4) {
        C1899593h.A1G(this.A01.A0H, r4, "get-methods: on-response-error=", AnonymousClass001.A0o());
        C203499no B7b = this.A02.B7b();
        if (B7b != null) {
            B7b.BK0(r4, 12);
        }
        AnonymousClass4EY r0 = this.A00;
        if (r0 != null) {
            r0.BaB(r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0168, code lost:
        if (r2 > 1) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r21) {
        /*
            r20 = this;
            r11 = r20
            X.9U5 r10 = r11.A01
            X.7oG r1 = r10.A0H
            java.lang.String r0 = "get-methods: on-response-success"
            r1.A07(r0)
            X.9oC r0 = r11.A02
            r18 = r0
            X.9no r1 = r18.B7b()
            r12 = 0
            if (r1 == 0) goto L_0x001b
            r0 = 12
            r1.BK0(r12, r0)
        L_0x001b:
            r19 = r21
            X.36K r13 = X.C1899693i.A0T(r19)
            java.util.Objects.requireNonNull(r13)
            java.lang.String r0 = "instance-id"
            java.lang.String r9 = r13.A0r(r0, r12)
            if (r9 == 0) goto L_0x0068
            java.lang.String r0 = r11.A04
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "wa-support-phone-number"
            java.lang.String r2 = r13.A0r(r0, r12)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x004b
            X.33l r0 = r10.A0C
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r0)
            java.lang.String r0 = "payments_support_phone_number"
            X.C18270x1.A0j(r1, r0, r2)
        L_0x004b:
            X.4EY r4 = r11.A00
            if (r4 == 0) goto L_0x0067
            X.9Ac r3 = new X.9Ac
            r3.<init>()
            X.9U4 r0 = r10.A0F
            X.9Tl r0 = X.AnonymousClass9U4.A00(r0)
            X.3XA r2 = r0.A01()
            r1 = 1
            X.9qH r0 = new X.9qH
            r0.<init>(r4, r1, r3)
            r2.A03(r0)
        L_0x0067:
            return
        L_0x0068:
            X.9Tx r0 = r10.A0L
            java.util.ArrayList r1 = r0.A05(r13)
            X.AnonymousClass8EA.A04(r1)
            X.99n r0 = r10.A0E
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0090
            if (r1 == 0) goto L_0x0114
            java.util.Iterator r2 = r1.iterator()
        L_0x007f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0114
            X.7yw r0 = X.C1899693i.A0C(r2)
            int r1 = r0.A08()
            r0 = 5
            if (r1 != r0) goto L_0x007f
        L_0x0090:
            java.util.HashSet r8 = X.AnonymousClass002.A0K()
            X.36K[] r0 = r13.A03
            if (r0 == 0) goto L_0x0121
            int r7 = r0.length
            if (r7 <= 0) goto L_0x0121
            r6 = 0
        L_0x009c:
            X.36K r14 = r13.A0k(r6)
            X.C626936e.A06(r14)
            java.lang.String r1 = r14.A00
            java.lang.String r0 = "alias"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x010f
            r5 = 0
            r4 = r12
            r17 = r12
            r3 = r12
            r2 = 0
        L_0x00b3:
            X.39V[] r1 = r14.A0u()
            int r0 = r1.length
            if (r2 >= r0) goto L_0x00f9
            r1 = r1[r2]
            java.lang.String r0 = r1.A02
            r16 = r0
            java.lang.String r1 = r1.A03
            java.lang.String r15 = "alias_value"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00ce
            r5 = r1
        L_0x00cb:
            int r2 = r2 + 1
            goto L_0x00b3
        L_0x00ce:
            java.lang.String r15 = "alias_id"
            r0 = r16
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00db
            r17 = r1
            goto L_0x00cb
        L_0x00db:
            java.lang.String r15 = "alias_type"
            r0 = r16
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00ea
            java.lang.String r4 = X.AnonymousClass0x9.A0z(r1)
            goto L_0x00cb
        L_0x00ea:
            java.lang.String r15 = "alias_status"
            r0 = r16
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00cb
            java.lang.String r3 = X.AnonymousClass0x9.A0z(r1)
            goto L_0x00cb
        L_0x00f9:
            X.3QD r2 = X.AnonymousClass3QD.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "upiAlias"
            X.7yt r2 = X.C1899693i.A0F(r2, r1, r5, r0)
            X.7yE r1 = new X.7yE
            r0 = r17
            r1.<init>(r2, r4, r0, r3)
            r8.add(r1)
        L_0x010f:
            int r6 = r6 + 1
            if (r6 >= r7) goto L_0x0121
            goto L_0x009c
        L_0x0114:
            X.9U4 r1 = r10.A0F
            java.lang.String r0 = "merchant_account_linking_context"
            X.9Vj r0 = r1.A0C(r0)
            r0.A06()
            goto L_0x0090
        L_0x0121:
            X.7bU r4 = r18.BAh()
            if (r4 == 0) goto L_0x016b
            monitor-enter(r4)
            int r2 = r8.size()     // Catch:{ all -> 0x0197 }
            X.1VX r1 = r4.A01     // Catch:{ all -> 0x0197 }
            r0 = 3114(0xc2a, float:4.364E-42)
            int r0 = r1.A0N(r0)     // Catch:{ all -> 0x0197 }
            int r0 = r0 + 1
            if (r2 > r0) goto L_0x016a
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x0197 }
            if (r0 != 0) goto L_0x0187
            java.util.Iterator r3 = r8.iterator()     // Catch:{ all -> 0x0197 }
            r2 = 0
        L_0x0143:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0197 }
            X.7yE r0 = (X.C166157yE) r0     // Catch:{ all -> 0x0197 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "mobile_number"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0143
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x0143
            X.AnonymousClass8UF.A0q()     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)     // Catch:{ all -> 0x0197 }
            throw r0     // Catch:{ all -> 0x0197 }
        L_0x0167:
            r0 = 1
            if (r2 <= r0) goto L_0x0187
        L_0x016a:
            monitor-exit(r4)
        L_0x016b:
            X.4EY r1 = r11.A00
            if (r1 == 0) goto L_0x0175
            r0 = 0
            X.9Wm r12 = new X.9Wm
            r12.<init>(r1, r0)
        L_0x0175:
            r1 = 0
            r0 = r19
            r10.A07(r12, r0, r1)
            X.2Yb r1 = r10.A0I
            X.2LZ r0 = r11.A03
            if (r9 != 0) goto L_0x0183
            java.lang.String r9 = ""
        L_0x0183:
            r1.A00(r0, r9)
            return
        L_0x0187:
            boolean r0 = r4.A07(r8)     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x016a
            java.util.Set r0 = r4.A00     // Catch:{ all -> 0x0197 }
            r0.clear()     // Catch:{ all -> 0x0197 }
            r0.addAll(r8)     // Catch:{ all -> 0x0197 }
            monitor-exit(r4)
            goto L_0x016b
        L_0x0197:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907799u.A05(X.36K):void");
    }
}
