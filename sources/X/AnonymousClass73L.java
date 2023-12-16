package X;

/* renamed from: X.73L  reason: invalid class name */
public final class AnonymousClass73L {
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059 A[SYNTHETIC, Splitter:B:25:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[Catch:{ all -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e A[Catch:{ all -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be A[Catch:{ all -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0112 A[Catch:{ all -> 0x01d6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass84O A00(X.AnonymousClass84O r15, X.AnonymousClass84O r16, X.C149677Nk r17) {
        /*
            r9 = r15
            int r0 = r15.A00
            r0 = r0 & 2
            if (r0 == 0) goto L_0x01e3
            r5 = r16
            r2 = r17
            if (r16 == 0) goto L_0x0051
            X.84O r0 = r5.A05
            if (r0 != r15) goto L_0x0051
            java.util.List r1 = r2.A02
            boolean r0 = r1.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x0035
            java.util.Set r3 = r15.A01
            if (r3 != 0) goto L_0x0022
            java.util.Set r3 = java.util.Collections.emptySet()
        L_0x0022:
            X.C162457s7.A0D(r3)
            boolean r0 = X.C18310x6.A1X(r3)
            if (r0 == 0) goto L_0x0035
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0036
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            return r16
        L_0x0036:
            java.util.Iterator r1 = r1.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r1.next()
            X.7Gf r0 = (X.C147917Gf) r0
            X.C162457s7.A0J(r0, r4)
            int r0 = r0.A00
            boolean r0 = X.C18300x5.A1X(r3, r0)
            if (r0 == 0) goto L_0x003a
        L_0x0051:
            X.7XT r0 = X.C159567m6.A00
            boolean r17 = r0.A02()
            if (r17 == 0) goto L_0x006d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = "BloksResolveSubTree: "
            r1.append(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = X.C159397ll.A02(r15)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x01d6 }
            X.C159567m6.A01(r0)     // Catch:{ all -> 0x01d6 }
        L_0x006d:
            int r3 = r15.A03     // Catch:{ all -> 0x01d6 }
            r0 = 13317(0x3405, float:1.8661E-41)
            if (r3 != r0) goto L_0x007d
            X.7S1 r0 = r2.A00     // Catch:{ all -> 0x01d6 }
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x01d6 }
            X.7bI r1 = (X.C153427bI) r1     // Catch:{ all -> 0x01d6 }
            r0 = 0
            X.C162457s7.A0J(r1, r0)     // Catch:{ all -> 0x01d6 }
        L_0x007d:
            boolean r16 = X.C154137cf.A01(r15)     // Catch:{ all -> 0x01d6 }
            X.7nR r0 = X.C158977kt.A01()     // Catch:{ all -> 0x01d6 }
            int[] r7 = r0.A01(r3)     // Catch:{ all -> 0x01d6 }
            int r6 = r7.length     // Catch:{ all -> 0x01d6 }
            r8 = r15
            r4 = 0
        L_0x008c:
            if (r4 >= r6) goto L_0x00b0
            r3 = r7[r4]     // Catch:{ all -> 0x01d6 }
            X.84O r1 = r8.A0K(r3)     // Catch:{ all -> 0x01d6 }
            if (r1 == 0) goto L_0x00ad
            if (r5 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r0 = 0
            goto L_0x009f
        L_0x009b:
            X.84O r0 = r5.A0K(r3)     // Catch:{ all -> 0x01d6 }
        L_0x009f:
            X.84O r1 = A00(r1, r0, r2)     // Catch:{ all -> 0x01d6 }
            boolean r0 = X.C18300x5.A1W(r1, r0)
            r16 = r16 | r0
            X.84O r8 = X.C159397ll.A00(r8, r15, r1, r3)     // Catch:{ all -> 0x01d6 }
        L_0x00ad:
            int r4 = r4 + 1
            goto L_0x008c
        L_0x00b0:
            X.7nR r1 = X.C158977kt.A01()     // Catch:{ all -> 0x01d6 }
            int r0 = r8.A03     // Catch:{ all -> 0x01d6 }
            int[] r15 = r1.A00(r0)     // Catch:{ all -> 0x01d6 }
            int r14 = r15.length     // Catch:{ all -> 0x01d6 }
            r13 = 0
        L_0x00bc:
            if (r13 >= r14) goto L_0x0103
            r12 = r15[r13]     // Catch:{ all -> 0x01d6 }
            java.util.List r11 = r8.A0R(r12)     // Catch:{ all -> 0x01d6 }
            X.C162457s7.A0D(r11)     // Catch:{ all -> 0x01d6 }
            if (r5 == 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r10 = 0
            goto L_0x00d0
        L_0x00cc:
            java.util.List r10 = r5.A0R(r12)     // Catch:{ all -> 0x01d6 }
        L_0x00d0:
            int r7 = r11.size()     // Catch:{ all -> 0x01d6 }
            r6 = r11
            r4 = 0
        L_0x00d6:
            if (r4 >= r7) goto L_0x00fa
            X.84O r3 = X.AnonymousClass6C9.A0V(r11, r4)     // Catch:{ all -> 0x01d6 }
            if (r3 == 0) goto L_0x00f7
            X.84O r0 = X.C159397ll.A01(r3, r10, r4)     // Catch:{ all -> 0x01d6 }
            X.84O r1 = A00(r3, r0, r2)     // Catch:{ all -> 0x01d6 }
            boolean r0 = X.C18300x5.A1W(r1, r0)
            r16 = r16 | r0
            if (r1 == r3) goto L_0x00f7
            if (r6 != r11) goto L_0x00f4
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r11)     // Catch:{ all -> 0x01d6 }
        L_0x00f4:
            r6.set(r4, r1)     // Catch:{ all -> 0x01d6 }
        L_0x00f7:
            int r4 = r4 + 1
            goto L_0x00d6
        L_0x00fa:
            if (r6 == r11) goto L_0x0100
            X.84O r8 = X.C159397ll.A00(r8, r9, r6, r12)     // Catch:{ all -> 0x01d6 }
        L_0x0100:
            int r13 = r13 + 1
            goto L_0x00bc
        L_0x0103:
            if (r16 != 0) goto L_0x010c
            if (r5 == 0) goto L_0x010c
            X.84O r0 = r5.A05     // Catch:{ all -> 0x01d6 }
            if (r0 != r9) goto L_0x010c
            r8 = r5
        L_0x010c:
            boolean r0 = X.C154137cf.A01(r8)     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x01d4
            java.util.List r0 = r2.A02     // Catch:{ all -> 0x01d6 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x01d6 }
        L_0x0118:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x0148
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x01d6 }
            X.7Gf r6 = (X.C147917Gf) r6     // Catch:{ all -> 0x01d6 }
            int r1 = r6.A00     // Catch:{ all -> 0x01d6 }
            int r0 = r8.A02     // Catch:{ all -> 0x01d6 }
            if (r1 != r0) goto L_0x0118
            java.util.Map r4 = r2.A03     // Catch:{ all -> 0x01d6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01d6 }
            java.lang.Object r1 = r4.get(r3)     // Catch:{ all -> 0x01d6 }
            X.0rg r0 = r6.A01     // Catch:{ all -> 0x01d6 }
            java.lang.Object r0 = r0.apply(r1)     // Catch:{ all -> 0x01d6 }
            if (r1 == r0) goto L_0x0144
            r4.put(r3, r0)     // Catch:{ all -> 0x01d6 }
            java.util.Set r0 = r2.A04     // Catch:{ all -> 0x01d6 }
            r0.add(r3)     // Catch:{ all -> 0x01d6 }
        L_0x0144:
            r7.remove()     // Catch:{ all -> 0x01d6 }
            goto L_0x0118
        L_0x0148:
            if (r5 == 0) goto L_0x015c
            X.84O r0 = r5.A05     // Catch:{ all -> 0x01d6 }
            if (r0 != r9) goto L_0x015c
            if (r8 != r9) goto L_0x015c
            int r1 = r9.A02     // Catch:{ all -> 0x01d6 }
            java.util.Set r0 = r2.A04     // Catch:{ all -> 0x01d6 }
            boolean r0 = X.C18300x5.A1X(r0, r1)     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x015c
            goto L_0x01dd
        L_0x015c:
            java.util.Map r7 = r2.A03     // Catch:{ all -> 0x01d6 }
            int r0 = r9.A02     // Catch:{ all -> 0x01d6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.Object r11 = r7.get(r6)     // Catch:{ all -> 0x01d6 }
            X.7kt r0 = X.C158977kt.A00()     // Catch:{ all -> 0x01d6 }
            X.7qG r1 = r0.A0B     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.ComponentMapper"
            X.C162457s7.A0K(r1, r0)     // Catch:{ all -> 0x01d6 }
            X.7S1 r12 = r2.A00     // Catch:{ all -> 0x01d6 }
            int r1 = r8.A03     // Catch:{ all -> 0x01d6 }
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r1 == r0) goto L_0x0180
            r0 = 13336(0x3418, float:1.8688E-41)
            if (r1 != r0) goto L_0x01d4
            goto L_0x0199
        L_0x0180:
            int r0 = r8.A02     // Catch:{ all -> 0x01d6 }
            long r4 = (long) r0     // Catch:{ all -> 0x01d6 }
            X.0h8 r3 = X.C10020h8.A00     // Catch:{ all -> 0x01d6 }
            X.84E r2 = X.AnonymousClass0SV.A00     // Catch:{ all -> 0x01d6 }
            X.0pQ r1 = X.C14340pQ.A00     // Catch:{ all -> 0x01d6 }
            X.7Ls r0 = new X.7Ls     // Catch:{ all -> 0x01d6 }
            r0.<init>(r2, r1, r4)     // Catch:{ all -> 0x01d6 }
            X.84N r1 = new X.84N     // Catch:{ all -> 0x01d6 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x01d6 }
            r0 = 0
            android.util.Pair r2 = X.AnonymousClass0x9.A0C(r1, r0)     // Catch:{ all -> 0x01d6 }
            goto L_0x01bd
        L_0x0199:
            java.lang.Object r10 = r12.A01     // Catch:{ all -> 0x01d6 }
            X.7bI r10 = (X.C153427bI) r10     // Catch:{ all -> 0x01d6 }
            int r0 = r8.A02     // Catch:{ all -> 0x01d6 }
            long r0 = (long) r0     // Catch:{ all -> 0x01d6 }
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01d6 }
            X.0h7 r5 = new X.0h7     // Catch:{ all -> 0x01d6 }
            r5.<init>(r8, r2)     // Catch:{ all -> 0x01d6 }
            X.84E r4 = X.AnonymousClass0SW.A00     // Catch:{ all -> 0x01d6 }
            X.0pO r3 = new X.0pO     // Catch:{ all -> 0x01d6 }
            r3.<init>(r12, r10, r8)     // Catch:{ all -> 0x01d6 }
            X.7Ls r2 = new X.7Ls     // Catch:{ all -> 0x01d6 }
            r2.<init>(r4, r3, r0)     // Catch:{ all -> 0x01d6 }
            X.84N r0 = new X.84N     // Catch:{ all -> 0x01d6 }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x01d6 }
            android.util.Pair r2 = X.AnonymousClass0x9.A0C(r0, r11)     // Catch:{ all -> 0x01d6 }
        L_0x01bd:
            java.lang.Object r1 = r2.first     // Catch:{ all -> 0x01d6 }
            if (r1 == 0) goto L_0x01c7
            r0 = 156(0x9c, float:2.19E-43)
            X.84O r8 = X.C159397ll.A00(r8, r9, r1, r0)     // Catch:{ all -> 0x01d6 }
        L_0x01c7:
            java.lang.Object r1 = r2.second     // Catch:{ all -> 0x01d6 }
            if (r1 != 0) goto L_0x01d1
            boolean r0 = r7.containsKey(r6)     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x01d4
        L_0x01d1:
            r7.put(r6, r1)     // Catch:{ all -> 0x01d6 }
        L_0x01d4:
            r9 = r8
            goto L_0x01de
        L_0x01d6:
            r0 = move-exception
            if (r17 == 0) goto L_0x01dc
            X.C159567m6.A00()
        L_0x01dc:
            throw r0
        L_0x01dd:
            r9 = r5
        L_0x01de:
            if (r17 == 0) goto L_0x01e3
            X.C159567m6.A00()
        L_0x01e3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73L.A00(X.84O, X.84O, X.7Nk):X.84O");
    }
}
