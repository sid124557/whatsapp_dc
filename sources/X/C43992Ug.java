package X;

/* renamed from: X.2Ug  reason: invalid class name and case insensitive filesystem */
public final class C43992Ug {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r1 == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r1 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0106, code lost:
        if (r1 == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0129, code lost:
        if (r1 != false) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0065 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x010e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2PL A00(X.C58682ve r10, X.AnonymousClass2U3 r11, X.C833748d r12) {
        /*
            r9 = this;
            r3 = 0
            X.21H r7 = r10.A00
            X.21H r0 = X.AnonymousClass21H.UNKNOWN
            if (r7 == r0) goto L_0x0186
            java.util.ArrayList r2 = r10.A02
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0017
            java.util.ArrayList r0 = r10.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0186
        L_0x0017:
            java.util.Iterator r8 = r2.iterator()
        L_0x001b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r5 = r8.next()
            X.2PJ r5 = (X.AnonymousClass2PJ) r5
            r0 = 2
            X.C162457s7.A0J(r5, r0)
            X.2Qg r4 = r11.A03
            X.2It r0 = r5.A00
            java.lang.String r1 = r0.A00
            java.util.Map r0 = r4.A03
            java.lang.Object r6 = r0.get(r1)
            X.4Bw r6 = (X.C84314Bw) r6
            if (r6 == 0) goto L_0x0088
            X.2Iw r0 = new X.2Iw
            r0.<init>(r6)
        L_0x0040:
            X.48c r1 = r11.A0D
            X.C162457s7.A0J(r12, r3)
            X.4Bw r0 = r0.A00
            boolean r0 = r0.AxE(r5, r1, r12)
            if (r0 != 0) goto L_0x00d2
            X.6aY r1 = X.C129586aY.of(r5)
            r0 = 0
            X.2PL r4 = new X.2PL
            r4.<init>(r1, r0, r3)
        L_0x0057:
            boolean r1 = r4.A02
            X.21H r0 = X.AnonymousClass21H.AND
            if (r7 != r0) goto L_0x0075
            if (r1 != 0) goto L_0x0085
        L_0x005f:
            X.229 r1 = X.AnonymousClass229.NO
        L_0x0061:
            X.229 r0 = X.AnonymousClass229.UNSET
            if (r1 == r0) goto L_0x001b
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r3) goto L_0x0144
            if (r1 == r0) goto L_0x017b
            java.lang.String r0 = "No boolean equivalent for UNSET"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0075:
            X.21H r0 = X.AnonymousClass21H.OR
            if (r7 != r0) goto L_0x007e
            if (r1 == 0) goto L_0x0085
            X.229 r1 = X.AnonymousClass229.YES
            goto L_0x0061
        L_0x007e:
            X.21H r0 = X.AnonymousClass21H.NOR
            if (r7 != r0) goto L_0x0085
            if (r1 == 0) goto L_0x0085
            goto L_0x005f
        L_0x0085:
            X.229 r1 = X.AnonymousClass229.UNSET
            goto L_0x0061
        L_0x0088:
            int r6 = r1.hashCode()
            r0 = 51815053(0x316a28d, float:4.4267637E-37)
            if (r6 == r0) goto L_0x00bf
            r0 = 996032719(0x3b5e40cf, float:0.003391314)
            if (r6 == r0) goto L_0x00ac
            r0 = 1223293935(0x48e9fbef, float:479199.47)
            if (r6 != r0) goto L_0x00d2
            java.lang.String r0 = "whatsapp_smb_user_first_order_creation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d2
            X.3YC r4 = r4.A02
        L_0x00a6:
            X.2Iw r0 = new X.2Iw
            r0.<init>(r4)
            goto L_0x0040
        L_0x00ac:
            java.lang.String r0 = "other_promotion_event"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d2
            X.2zq r1 = r4.A01
            X.2sH r0 = r4.A00
            X.3YF r4 = new X.3YF
            r4.<init>(r0, r1)
            goto L_0x00a6
        L_0x00bf:
            java.lang.String r0 = "seconds_since_last_impression"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d2
            X.2zq r1 = r4.A01
            X.2sH r0 = r4.A00
            X.3YG r4 = new X.3YG
            r4.<init>(r0, r1)
            goto L_0x00a6
        L_0x00d2:
            r1 = 0
            r0 = 1
            X.2PL r4 = new X.2PL
            r4.<init>(r1, r1, r0)
            goto L_0x0057
        L_0x00db:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.ArrayList r0 = r10.A01
            java.util.Iterator r8 = r0.iterator()
        L_0x00e5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r8.next()
            X.2ve r0 = (X.C58682ve) r0
            X.2PL r6 = r9.A00(r0, r11, r12)
            X.21H r5 = X.AnonymousClass21H.OR
            if (r7 != r5) goto L_0x0100
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0100
            r4.add(r6)
        L_0x0100:
            boolean r1 = r6.A02
            X.21H r0 = X.AnonymousClass21H.AND
            if (r7 != r0) goto L_0x011e
            if (r1 != 0) goto L_0x012c
        L_0x0108:
            X.229 r1 = X.AnonymousClass229.NO
        L_0x010a:
            X.229 r0 = X.AnonymousClass229.UNSET
            if (r1 == r0) goto L_0x00e5
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r3) goto L_0x0144
            if (r1 == r0) goto L_0x012f
            java.lang.String r0 = "No boolean equivalent for UNSET"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x011e:
            if (r7 != r5) goto L_0x0125
            if (r1 == 0) goto L_0x012c
            X.229 r1 = X.AnonymousClass229.YES
            goto L_0x010a
        L_0x0125:
            X.21H r0 = X.AnonymousClass21H.NOR
            if (r7 != r0) goto L_0x012c
            if (r1 == 0) goto L_0x012c
            goto L_0x0108
        L_0x012c:
            X.229 r1 = X.AnonymousClass229.UNSET
            goto L_0x010a
        L_0x012f:
            X.6aY r2 = r6.A00
            goto L_0x017f
        L_0x0132:
            int r1 = r7.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x014c
            r0 = 2
            if (r1 == r0) goto L_0x0144
            if (r1 == r3) goto L_0x0144
            X.23r r0 = new X.23r
            r0.<init>()
            throw r0
        L_0x0144:
            r2 = 0
            r0 = 1
            X.2PL r1 = new X.2PL
            r1.<init>(r2, r2, r0)
            return r1
        L_0x014c:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0176
            X.6aO r2 = X.C129586aY.builder()
            java.util.Iterator r1 = r4.iterator()
        L_0x015a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r0 = r1.next()
            X.2PL r0 = (X.AnonymousClass2PL) r0
            X.6aY r0 = r0.A00
            if (r0 == 0) goto L_0x015a
            r2.addAll(r0)
            goto L_0x015a
        L_0x016e:
            X.6aY r2 = r2.build()
            X.C162457s7.A0D(r2)
            goto L_0x017f
        L_0x0176:
            X.6aY r2 = X.C129586aY.copyOf((java.util.Collection) r2)
            goto L_0x017f
        L_0x017b:
            X.6aY r2 = X.C129586aY.of(r5)
        L_0x017f:
            r0 = 0
            X.2PL r1 = new X.2PL
            r1.<init>(r2, r0, r3)
            return r1
        L_0x0186:
            X.23r r0 = new X.23r
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43992Ug.A00(X.2ve, X.2U3, X.48d):X.2PL");
    }
}
