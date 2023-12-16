package X;

import java.net.InetSocketAddress;

/* renamed from: X.3cU  reason: invalid class name and case insensitive filesystem */
public class C71673cU implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public C71673cU(C60182y8 r2, C49272gG r3, InetSocketAddress inetSocketAddress, int i, boolean z) {
        this.A05 = i;
        this.A01 = r2;
        this.A02 = inetSocketAddress;
        this.A00 = 30000;
        this.A04 = z;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r4.A06 == r2) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A05
            switch(r0) {
                case 0: goto L_0x0053;
                case 1: goto L_0x0194;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x00d8;
                case 5: goto L_0x0017;
                case 6: goto L_0x009b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r15.A01
            X.2y8 r3 = (X.C60182y8) r3
            java.lang.Object r2 = r15.A02
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            boolean r1 = r15.A04
            java.lang.Object r0 = r15.A03
            X.2gG r0 = (X.C49272gG) r0
            r3.A01(r0, r2, r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r5 = r15.A01
            X.1m3 r5 = (X.C30191m3) r5
            java.lang.Object r4 = r15.A02
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            int r2 = r15.A00
            java.lang.Object r3 = r15.A03
            X.4uZ r3 = (X.C95814uZ) r3
            X.2ro r0 = r5.A05
            boolean r0 = r0.A06(r4)
            if (r0 != 0) goto L_0x0033
            boolean r0 = r4.A0U()
            if (r0 == 0) goto L_0x0038
        L_0x0033:
            int r0 = r4.A06
            r1 = 1
            if (r0 != r2) goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            X.2pi r0 = r5.A06
            X.2ro r0 = r0.A06
            r0.A04(r4)
            X.1in r0 = r5.A04
            r0.A09(r3)
            r0.A08(r3)
            if (r1 == 0) goto L_0x0016
            X.2s0 r2 = r5.A0E
            int r1 = r4.A06
            r0 = 2
            r2.A01(r3, r1, r0)
            return
        L_0x0053:
            java.lang.Object r5 = r15.A01
            X.2hZ r5 = (X.C50062hZ) r5
            java.lang.Object r4 = r15.A02
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            boolean r3 = r15.A04
            int r0 = r15.A00
            byte r1 = (byte) r0
            java.lang.Object r2 = r15.A03
            X.34x r2 = (X.C624134x) r2
            if (r4 == 0) goto L_0x0069
            r4.run()
        L_0x0069:
            if (r3 == 0) goto L_0x0016
            r0 = 56
            if (r1 != r0) goto L_0x0077
            X.1io r1 = r5.A03
            r0 = 28
        L_0x0073:
            r1.A0C(r2, r0)
            return
        L_0x0077:
            r0 = 67
            if (r1 != r0) goto L_0x0080
            X.1io r1 = r5.A03
            r0 = 31
            goto L_0x0073
        L_0x0080:
            r0 = 68
            if (r1 != r0) goto L_0x0089
            X.1io r1 = r5.A03
            r0 = 30
            goto L_0x0073
        L_0x0089:
            r0 = 79
            if (r1 != r0) goto L_0x0092
            X.1io r1 = r5.A03
            r0 = 36
            goto L_0x0073
        L_0x0092:
            r0 = 93
            if (r1 != r0) goto L_0x0016
            X.1io r1 = r5.A03
            r0 = 42
            goto L_0x0073
        L_0x009b:
            java.lang.Object r5 = r15.A01
            X.1m3 r5 = (X.C30191m3) r5
            java.lang.Object r3 = r15.A02
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            int r6 = r15.A00
            java.lang.Object r4 = r15.A03
            X.4uZ r4 = (X.C95814uZ) r4
            r8 = 1
            int r2 = r3.A05
            r1 = 0
            if (r2 == r6) goto L_0x00b0
            r2 = 0
        L_0x00b0:
            int r0 = r3.A06
            if (r0 != r6) goto L_0x00b5
            r1 = r0
        L_0x00b5:
            X.2pi r0 = r5.A06
            r0.A00(r3, r2, r1)
            X.2aH r2 = r5.A0G
            java.lang.Class<X.4uZ> r0 = X.C95814uZ.class
            com.whatsapp.jid.Jid r1 = r3.A0I(r0)
            X.2jH r0 = r2.A01
            r0.A01(r1)
            X.2jH r0 = r2.A02
            r0.A01(r1)
            X.3Wi r0 = r5.A01
            r7 = 5
            X.3cU r2 = new X.3cU
            r2.<init>((X.AnonymousClass3ZH) r3, (X.C95814uZ) r4, (X.C30191m3) r5, (int) r6, (int) r7, (boolean) r8)
            r0.A0S(r2)
            return
        L_0x00d8:
            boolean r0 = r15.A04
            java.lang.Object r9 = r15.A01
            X.2cf r9 = (X.C47072cf) r9
            int r12 = r15.A00
            java.lang.Object r10 = r15.A02
            X.4GQ r10 = (X.AnonymousClass4GQ) r10
            java.lang.Object r11 = r15.A03
            X.4GQ r11 = (X.AnonymousClass4GQ) r11
            if (r0 != 0) goto L_0x0165
            X.2kc r0 = r9.A02
            X.66R r0 = r0.A01
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r0)
            java.lang.String r0 = "pref_avatar_profile_photo_poses"
            r7 = 0
            java.lang.String r0 = r1.getString(r0, r7)
            if (r0 == 0) goto L_0x0158
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            int r5 = r6.length()
            r4 = 0
        L_0x010a:
            if (r4 >= r5) goto L_0x0133
            org.json.JSONObject r8 = r6.getJSONObject(r4)
            java.lang.String r0 = "url"
            java.lang.String r2 = r8.getString(r0)
            java.lang.String r1 = "emojis"
            boolean r0 = r8.has(r1)
            if (r0 == 0) goto L_0x0131
            java.lang.String r1 = r8.getString(r1)
        L_0x0123:
            X.C162457s7.A0H(r2)
            X.38j r0 = new X.38j
            r0.<init>(r2, r1)
            r3.add(r0)
            int r4 = r4 + 1
            goto L_0x010a
        L_0x0131:
            r1 = r7
            goto L_0x0123
        L_0x0133:
            r2 = 1
            X.2qu r1 = r9.A03
            java.lang.String r0 = "urls_read_from_cache"
            r1.A01(r12, r0)
            r0 = 0
            java.util.List r2 = r9.A00(r3, r0, r2)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0158
            java.lang.String r0 = "bitmaps_read_from_cache"
            r1.A01(r12, r0)
            X.3Wi r1 = r9.A00
            r0 = 11
            X.3a0 r0 = X.C70133a0.A00(r10, r2, r0)
            r1.A0S(r0)
            return
        L_0x0158:
            r14 = 1
            X.4FS r0 = r9.A04
            r13 = 4
            X.3cU r8 = new X.3cU
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (int) r12, (int) r13, (boolean) r14)
            r0.BkP(r8)
            return
        L_0x0165:
            X.4C1 r0 = r9.A06
            java.lang.Object r3 = r0.get()
            X.2Lj r3 = (X.C41732Lj) r3
            X.4B1 r2 = r3.A01
            r1 = 3
            X.4Kl r0 = new X.4Kl
            r0.<init>(r3, r1)
            X.3Os r4 = r2.B03(r0)
            X.44M r3 = new X.44M
            r3.<init>(r9, r10, r11, r12)
            X.43w r1 = new X.43w
            r1.<init>(r9, r11)
            r0 = 2
            X.4Kd r2 = new X.4Kd
            r2.<init>(r3, r0, r1)
            X.2qu r1 = r9.A03
            java.lang.String r0 = "graphql_request_posted"
            r1.A01(r12, r0)
            r4.Bh4(r2)
            return
        L_0x0194:
            java.lang.Object r1 = r15.A01
            X.2hZ r1 = (X.C50062hZ) r1
            java.lang.Object r2 = r15.A02
            X.34x r2 = (X.C624134x) r2
            int r0 = r15.A00
            byte r4 = (byte) r0
            java.lang.Object r3 = r15.A03
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            boolean r6 = r15.A04
            X.3N0 r0 = r1.A01
            boolean r5 = r0.A01(r2, r4)
            r1.A01(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71673cU.run():void");
    }

    public C71673cU(Object obj, Object obj2, Object obj3, int i, int i2, boolean z) {
        this.A05 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = z;
    }

    public C71673cU(AnonymousClass3ZH r2, C95814uZ r3, C30191m3 r4, int i, int i2, boolean z) {
        this.A05 = 5;
        this.A01 = r4;
        this.A04 = true;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
    }

    public C71673cU(AnonymousClass3ZH r2, C95814uZ r3, C30191m3 r4, int i) {
        this.A05 = 6;
        this.A01 = r4;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = true;
        this.A03 = r3;
    }
}
