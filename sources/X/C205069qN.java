package X;

/* renamed from: X.9qN  reason: invalid class name and case insensitive filesystem */
public class C205069qN implements C202699mR {
    public Object A00;
    public Object A01;
    public final int A02;

    public C205069qN(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        ((X.AnonymousClass9BY) r0).A05.setChecked(r1);
        r2.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        r5 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r5 != 1440) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        r2.A1c(r7.A01, com.whatsapp.R.plurals.f9nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r5 != 1441) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        X.C1899693i.A0u(r2, r7.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        r1 = (X.AnonymousClass9S2) r1.A00;
        r4 = new X.C204629pf(r2, 24);
        r3 = new X.C204629pf(r2, 25);
        r2 = r1.A03;
        r1 = r1.A01;
        r0 = r2.A04(r1, r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r7 == null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        if (r0 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r0 = r2.A03(r1, r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cb, code lost:
        if (r0 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cd, code lost:
        r0 = X.AnonymousClass9WM.A00(r1, r3, r1.getString(com.whatsapp.R.string.f11nameremoved));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        X.AnonymousClass9Bw.A0c(r2, (java.util.Map) null, r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r2.A00("on_success");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BaJ(X.AnonymousClass34V r7) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0005;
                case 2: goto L_0x0021;
                case 3: goto L_0x0005;
                case 4: goto L_0x005e;
                case 5: goto L_0x0073;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r6.A01
            X.2m3 r2 = (X.C52792m3) r2
            if (r7 != 0) goto L_0x00dc
        L_0x000b:
            java.lang.String r0 = "on_success"
            r2.A00(r0)
            return
        L_0x0011:
            java.lang.Object r0 = r6.A00
            X.9Bw r0 = (X.AnonymousClass9Bw) r0
            java.lang.Object r2 = r6.A01
            X.2m3 r2 = (X.C52792m3) r2
            if (r7 != 0) goto L_0x00dc
            X.5SZ r0 = r0.A0B
            r0.A00()
            goto L_0x000b
        L_0x0021:
            java.lang.Object r3 = r6.A01
            X.2m3 r3 = (X.C52792m3) r3
            if (r7 == 0) goto L_0x0058
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            int r1 = r7.A00
            r0 = 1440(0x5a0, float:2.018E-42)
            if (r1 != r0) goto L_0x0042
            int r0 = r7.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "remaining_retries"
            r2.put(r0, r1)
            java.lang.String r0 = "pin_incorrect"
        L_0x003e:
            r3.A01(r0, r2)
            return
        L_0x0042:
            r0 = 1441(0x5a1, float:2.019E-42)
            if (r1 != r0) goto L_0x0054
            long r0 = r7.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "next_retry_ts"
            r2.put(r0, r1)
            java.lang.String r0 = "pin_rate_limited"
            goto L_0x003e
        L_0x0054:
            X.AnonymousClass9Bw.A0c(r3, r2, r1)
            return
        L_0x0058:
            java.lang.String r0 = "on_success"
            r3.A00(r0)
            return
        L_0x005e:
            java.lang.Object r1 = r6.A00
            X.9qQ r1 = (X.C205099qQ) r1
            java.lang.Object r2 = r6.A01
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r2
            r2.A1a()
            if (r7 != 0) goto L_0x0092
            java.lang.Object r0 = r1.A00
            X.9S2 r0 = (X.AnonymousClass9S2) r0
            X.9lU r0 = r0.A08
            r1 = 0
            goto L_0x0087
        L_0x0073:
            java.lang.Object r1 = r6.A00
            X.9qQ r1 = (X.C205099qQ) r1
            java.lang.Object r2 = r6.A01
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r2
            r2.A1a()
            if (r7 != 0) goto L_0x0092
            java.lang.Object r0 = r1.A00
            X.9S2 r0 = (X.AnonymousClass9S2) r0
            X.9lU r0 = r0.A08
            r1 = 1
        L_0x0087:
            X.9BY r0 = (X.AnonymousClass9BY) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A05
            r0.setChecked(r1)
            r2.A1K()
            return
        L_0x0092:
            int r5 = r7.A00
            r0 = 1440(0x5a0, float:2.018E-42)
            if (r5 != r0) goto L_0x00a1
            int r1 = r7.A01
            r0 = 2131755258(0x7f1000fa, float:1.914139E38)
            r2.A1c(r1, r0)
            return
        L_0x00a1:
            r0 = 1441(0x5a1, float:2.019E-42)
            if (r5 != r0) goto L_0x00ab
            long r0 = r7.A02
            X.C1899693i.A0u(r2, r0)
            return
        L_0x00ab:
            java.lang.Object r1 = r1.A00
            X.9S2 r1 = (X.AnonymousClass9S2) r1
            r0 = 24
            X.9pf r4 = new X.9pf
            r4.<init>(r2, r0)
            r0 = 25
            X.9pf r3 = new X.9pf
            r3.<init>(r2, r0)
            X.9WM r2 = r1.A03
            X.4eZ r1 = r1.A01
            X.043 r0 = r2.A04(r1, r4, r3, r5)
            if (r0 != 0) goto L_0x00d8
            X.043 r0 = r2.A03(r1, r4, r3, r5)
            if (r0 != 0) goto L_0x00d8
            r0 = 2131891948(0x7f1216ec, float:1.941863E38)
            java.lang.String r0 = r1.getString(r0)
            X.043 r0 = X.AnonymousClass9WM.A00(r1, r3, r0)
        L_0x00d8:
            r0.show()
            return
        L_0x00dc:
            r1 = 0
            int r0 = r7.A00
            X.AnonymousClass9Bw.A0c(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C205069qN.BaJ(X.34V):void");
    }
}
