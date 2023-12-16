package X;

/* renamed from: X.5Nj  reason: invalid class name */
public final class AnonymousClass5Nj {
    public final C1448973j A00;
    public final C1449073k A01;
    public final C147027Cn A02;
    public final C1449173l A03;

    /* JADX WARNING: type inference failed for: r9v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x00a2 A[EDGE_INSN: B:145:0x00a2->B:33:0x00a2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C108755dV A00(X.C160617ny r14, X.AnonymousClass36K r15) {
        /*
            r13 = this;
            if (r15 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            java.lang.String r0 = "properties"
            X.36K r8 = r15.A0l(r0)
            java.lang.String r0 = "listing_details"
            X.36K r1 = r15.A0l(r0)
            java.lang.String r0 = "types"
            X.36K r2 = r15.A0l(r0)
            java.lang.String r0 = "availability"
            X.36K r7 = r15.A0l(r0)
            r6 = 0
            if (r2 == 0) goto L_0x0127
            java.lang.String r0 = "type"
            java.util.List r0 = r2.A0s(r0)
            if (r0 == 0) goto L_0x0127
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r11 = r0.iterator()
        L_0x002f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0127
            X.36K r2 = X.C18310x6.A0Y(r11)
            java.lang.String r0 = "name"
            java.lang.String r5 = X.C86634Kw.A0z(r2, r0)
            java.lang.String r0 = "options"
            X.36K r2 = r2.A0l(r0)
            if (r2 == 0) goto L_0x0086
            java.lang.String r0 = "option"
            java.util.List r0 = r2.A0s(r0)
            if (r0 == 0) goto L_0x0086
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r0.iterator()
        L_0x0057:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0088
            X.36K r2 = X.C18310x6.A0Y(r4)
            java.lang.String r0 = "value"
            java.lang.String r3 = X.C86634Kw.A0z(r2, r0)
            java.lang.String r0 = "thumbnail_media"
            X.36K r0 = r2.A0l(r0)
            if (r3 == 0) goto L_0x0057
            if (r0 != 0) goto L_0x007a
            X.6eu r2 = new X.6eu
            r2.<init>(r3)
        L_0x0076:
            r9.add(r2)
            goto L_0x0057
        L_0x007a:
            X.5db r0 = X.C57092t4.A00(r0)
            if (r0 == 0) goto L_0x0057
            X.6ev r2 = new X.6ev
            r2.<init>(r0, r3)
            goto L_0x0076
        L_0x0086:
            X.3d3 r9 = X.C72023d3.A00
        L_0x0088:
            boolean r10 = r9 instanceof java.util.Collection
            r4 = 1
            if (r10 == 0) goto L_0x00bb
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00bb
        L_0x0096:
            r3 = 0
        L_0x0097:
            if (r10 == 0) goto L_0x00a8
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a8
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            if (r3 == 0) goto L_0x00cf
            if (r4 == 0) goto L_0x00cf
            goto L_0x002f
        L_0x00a8:
            java.util.Iterator r2 = r9.iterator()
        L_0x00ac:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r2.next()
            boolean r0 = r0 instanceof X.C132226eu
            if (r0 == 0) goto L_0x00ac
            goto L_0x00a3
        L_0x00bb:
            java.util.Iterator r2 = r9.iterator()
        L_0x00bf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r2.next()
            boolean r0 = r0 instanceof X.C132236ev
            if (r0 == 0) goto L_0x00bf
            r3 = 1
            goto L_0x0097
        L_0x00cf:
            java.lang.Object r3 = X.C73723fy.A04(r9)
            boolean r0 = r3 instanceof X.C132236ev
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x00f6
            if (r5 != 0) goto L_0x00dc
            r5 = r2
        L_0x00dc:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r9.iterator()
        L_0x00e4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x011d
            java.lang.Object r2 = r3.next()
            boolean r0 = r2 instanceof X.C132236ev
            if (r0 == 0) goto L_0x00e4
            r4.add(r2)
            goto L_0x00e4
        L_0x00f6:
            boolean r0 = r3 instanceof X.C132226eu
            if (r0 == 0) goto L_0x002f
            if (r5 != 0) goto L_0x00fd
            r5 = r2
        L_0x00fd:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r9.iterator()
        L_0x0105:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0117
            java.lang.Object r2 = r3.next()
            boolean r0 = r2 instanceof X.C132226eu
            if (r0 == 0) goto L_0x0105
            r4.add(r2)
            goto L_0x0105
        L_0x0117:
            X.6es r0 = new X.6es
            r0.<init>(r5, r4)
            goto L_0x0122
        L_0x011d:
            X.6et r0 = new X.6et
            r0.<init>(r5, r4)
        L_0x0122:
            r6.add(r0)
            goto L_0x002f
        L_0x0127:
            r5 = 0
            if (r8 == 0) goto L_0x015e
            java.lang.String r0 = "property"
            java.util.List r0 = r8.A0s(r0)
            if (r0 == 0) goto L_0x015e
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r0.iterator()
        L_0x013a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x015d
            X.36K r2 = X.C18310x6.A0Y(r4)
            java.lang.String r0 = "name"
            java.lang.String r3 = r2.A0r(r0, r5)
            java.lang.String r0 = "value"
            java.lang.String r2 = r2.A0r(r0, r5)
            if (r3 == 0) goto L_0x013a
            if (r2 == 0) goto L_0x013a
            X.7xw r0 = new X.7xw
            r0.<init>(r3, r2)
            r8.add(r0)
            goto L_0x013a
        L_0x015d:
            r5 = r8
        L_0x015e:
            if (r1 != 0) goto L_0x01dc
            r8 = 0
        L_0x0161:
            r9 = 0
            if (r7 == 0) goto L_0x0241
            java.lang.String r0 = "listing"
            X.36K r1 = r7.A0l(r0)
            if (r1 == 0) goto L_0x0241
            java.lang.String r0 = "options"
            java.util.List r0 = r1.A0s(r0)
            if (r0 == 0) goto L_0x0241
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r12 = r0.iterator()
        L_0x017c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0236
            X.36K r1 = X.C18310x6.A0Y(r12)
            java.lang.String r0 = "is_available"
            X.36K r0 = r1.A0l(r0)
            if (r0 == 0) goto L_0x01da
            java.lang.String r0 = r0.A0n()
            if (r0 == 0) goto L_0x01da
            boolean r10 = java.lang.Boolean.parseBoolean(r0)
        L_0x0198:
            java.lang.String r0 = "product_id"
            java.lang.String r4 = X.C86634Kw.A0z(r1, r0)
            java.lang.String r0 = "option"
            java.util.List r0 = r1.A0s(r0)
            java.util.ArrayList r3 = X.C18300x5.A0t(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x01ac:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01cf
            X.36K r1 = X.C18310x6.A0Y(r11)
            java.lang.String r0 = "name"
            java.lang.String r2 = r1.A0r(r0, r9)
            java.lang.String r0 = "value"
            java.lang.String r1 = r1.A0r(r0, r9)
            if (r2 == 0) goto L_0x01ac
            if (r1 == 0) goto L_0x01ac
            X.7xw r0 = new X.7xw
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L_0x01ac
        L_0x01cf:
            if (r4 == 0) goto L_0x017c
            X.7y1 r0 = new X.7y1
            r0.<init>(r4, r3, r10)
            r7.add(r0)
            goto L_0x017c
        L_0x01da:
            r10 = 0
            goto L_0x0198
        L_0x01dc:
            java.lang.String r0 = "description"
            X.36K r0 = r1.A0l(r0)
            if (r0 == 0) goto L_0x0214
            java.lang.String r4 = r0.A0n()
        L_0x01e8:
            java.lang.String r0 = "multi_price"
            X.36K r0 = r1.A0l(r0)
            if (r0 == 0) goto L_0x0212
            java.lang.String r0 = r0.A0n()
            if (r0 == 0) goto L_0x0212
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x01fe:
            boolean r3 = X.AnonymousClass0x9.A1Q(r0)
            r2 = 0
            java.lang.String r0 = "lowest_price"
            X.36K r0 = r1.A0l(r0)
            if (r0 == 0) goto L_0x022f
            java.lang.String r1 = r0.A0n()
            if (r1 == 0) goto L_0x022f
            goto L_0x0216
        L_0x0212:
            r0 = 0
            goto L_0x01fe
        L_0x0214:
            r4 = 0
            goto L_0x01e8
        L_0x0216:
            X.5rB r0 = X.C39192Ba.A00     // Catch:{ NumberFormatException -> 0x022f }
            java.util.regex.Pattern r0 = r0.nativePattern     // Catch:{ NumberFormatException -> 0x022f }
            boolean r0 = X.C18280x3.A1X(r1, r0)     // Catch:{ NumberFormatException -> 0x022f }
            if (r0 == 0) goto L_0x022f
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x022f }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x022f }
            if (r14 == 0) goto L_0x022f
            long r0 = r0.longValue()
            java.math.BigDecimal r2 = X.C57952uT.A00(r14, r0)
        L_0x022f:
            X.5dP r8 = new X.5dP
            r8.<init>(r4, r2, r3)
            goto L_0x0161
        L_0x0236:
            boolean r0 = X.AnonymousClass0x7.A1S(r7)
            if (r0 == 0) goto L_0x0241
            X.5dM r9 = new X.5dM
            r9.<init>(r7)
        L_0x0241:
            X.5dV r0 = new X.5dV
            r0.<init>(r9, r8, r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Nj.A00(X.7ny, X.36K):X.5dV");
    }

    public AnonymousClass5Nj(C1448973j r1, C1449073k r2, C147027Cn r3, C1449173l r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
