package X;

/* renamed from: X.4J6  reason: invalid class name */
public class AnonymousClass4J6 implements AnonymousClass4C8 {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4J6(AnonymousClass4GR r1, AnonymousClass4C8 r2, int i) {
        this.A02 = i;
        switch (i) {
            case 6:
                this.A00 = r1;
                this.A01 = r2;
                break;
            case 8:
            case 10:
                this.A01 = r2;
                this.A00 = r1;
                break;
            default:
                this.A00 = r2;
                this.A01 = r1;
                break;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        r2 = new X.C86074Is((java.lang.Object) r10, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        r2 = new X.C86074Is(r1, r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009b, code lost:
        r0 = r3.Az8(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return X.AnonymousClass218.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0140, code lost:
        return X.C59022wD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016f, code lost:
        if (r0 != r7) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0171, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Az8(X.C84814Du r9, X.AnonymousClass4C9 r10) {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0026;
                case 2: goto L_0x002e;
                case 3: goto L_0x0046;
                case 4: goto L_0x004e;
                case 5: goto L_0x005c;
                case 6: goto L_0x00a1;
                case 7: goto L_0x011a;
                case 8: goto L_0x006a;
                case 9: goto L_0x0081;
                case 10: goto L_0x008c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r8.A00
            X.4C8[] r4 = (X.AnonymousClass4C8[]) r4
            X.411 r3 = X.AnonymousClass411.A00
            r2 = 0
            java.lang.Object r1 = r8.A01
            X.4GU r1 = (X.AnonymousClass4GU) r1
            X.3pM r0 = new X.3pM
            r0.<init>(r2, r1)
            java.lang.Object r0 = X.AnonymousClass2AQ.A00(r9, r3, r0, r10, r4)
        L_0x0019:
            java.lang.Object r7 = X.AnonymousClass218.A00(r0)
            return r7
        L_0x001e:
            java.lang.Object r3 = r8.A00
            X.4C8 r3 = (X.AnonymousClass4C8) r3
            java.lang.Object r1 = r8.A01
            r0 = 5
            goto L_0x0064
        L_0x0026:
            java.lang.Object r3 = r8.A00
            X.4C8 r3 = (X.AnonymousClass4C8) r3
            java.lang.Object r1 = r8.A01
            r0 = 6
            goto L_0x0064
        L_0x002e:
            java.lang.Object r4 = r8.A00
            X.4C8[] r4 = (X.AnonymousClass4C8[]) r4
            X.3uG r3 = new X.3uG
            r3.<init>(r4)
            r2 = 0
            java.lang.Object r1 = r8.A01
            X.2UA r1 = (X.AnonymousClass2UA) r1
            com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3 r0 = new com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3
            r0.<init>(r1, r2)
            java.lang.Object r0 = X.AnonymousClass2AQ.A00(r9, r3, r0, r10, r4)
            goto L_0x0019
        L_0x0046:
            java.lang.Object r3 = r8.A00
            X.4C8 r3 = (X.AnonymousClass4C8) r3
            java.lang.Object r1 = r8.A01
            r0 = 7
            goto L_0x0064
        L_0x004e:
            java.lang.Object r3 = r8.A01
            X.4C8 r3 = (X.AnonymousClass4C8) r3
            java.lang.Object r1 = r8.A00
            r0 = 8
            X.4Is r2 = new X.4Is
            r2.<init>((java.lang.Object) r1, (int) r0, (java.lang.Object) r10)
            goto L_0x009b
        L_0x005c:
            java.lang.Object r3 = r8.A00
            X.4C8 r3 = (X.AnonymousClass4C8) r3
            java.lang.Object r1 = r8.A01
            r0 = 9
        L_0x0064:
            X.4Is r2 = new X.4Is
            r2.<init>((java.lang.Object) r10, (int) r0, (java.lang.Object) r1)
            goto L_0x009b
        L_0x006a:
            X.3Yv r3 = new X.3Yv
            r3.<init>()
            java.lang.Object r2 = r8.A01
            X.4C8 r2 = (X.AnonymousClass4C8) r2
            java.lang.Object r1 = r8.A00
            X.4GR r1 = (X.AnonymousClass4GR) r1
            X.8PT r0 = new X.8PT
            r0.<init>(r1, r3, r10)
            java.lang.Object r0 = r2.Az8(r9, r0)
            goto L_0x0019
        L_0x0081:
            java.lang.Object r3 = r8.A00
            X.4C8 r3 = (X.AnonymousClass4C8) r3
            java.lang.Object r1 = r8.A01
            X.4GR r1 = (X.AnonymousClass4GR) r1
            r0 = 11
            goto L_0x0096
        L_0x008c:
            java.lang.Object r3 = r8.A01
            X.4C8 r3 = (X.AnonymousClass4C8) r3
            java.lang.Object r1 = r8.A00
            X.4GR r1 = (X.AnonymousClass4GR) r1
            r0 = 12
        L_0x0096:
            X.4Is r2 = new X.4Is
            r2.<init>((X.AnonymousClass4GR) r1, (X.AnonymousClass4C9) r10, (int) r0)
        L_0x009b:
            java.lang.Object r0 = r3.Az8(r9, r2)
            goto L_0x0019
        L_0x00a1:
            r1 = r8
            boolean r0 = r9 instanceof X.C74573hL
            if (r0 == 0) goto L_0x00c6
            r6 = r9
            X.3hL r6 = (X.C74573hL) r6
            int r3 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00c6
            int r3 = r3 - r2
            r6.label = r3
        L_0x00b4:
            java.lang.Object r5 = r6.result
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x00e1
            if (r0 == r3) goto L_0x00d1
            if (r0 != r4) goto L_0x00cc
            X.C57682u2.A01(r5)
            goto L_0x013e
        L_0x00c6:
            X.3hL r6 = new X.3hL
            r6.<init>(r8, r9)
            goto L_0x00b4
        L_0x00cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x00d1:
            java.lang.Object r2 = r6.L$2
            X.8P9 r2 = (X.AnonymousClass8P9) r2
            java.lang.Object r10 = r6.L$1
            X.4C9 r10 = (X.AnonymousClass4C9) r10
            java.lang.Object r1 = r6.L$0
            X.4J6 r1 = (X.AnonymousClass4J6) r1
            X.C57682u2.A01(r5)     // Catch:{ all -> 0x0115 }
            goto L_0x0100
        L_0x00e1:
            X.C57682u2.A01(r5)
            X.4Gl r0 = r6.B5w()
            X.3hZ r2 = new X.3hZ
            r2.<init>(r0, r10)
            java.lang.Object r0 = r8.A00     // Catch:{ all -> 0x0115 }
            X.4GR r0 = (X.AnonymousClass4GR) r0     // Catch:{ all -> 0x0115 }
            r6.L$0 = r8     // Catch:{ all -> 0x0115 }
            r6.L$1 = r10     // Catch:{ all -> 0x0115 }
            r6.L$2 = r2     // Catch:{ all -> 0x0115 }
            r6.label = r3     // Catch:{ all -> 0x0115 }
            java.lang.Object r0 = r0.invoke(r2, r6)     // Catch:{ all -> 0x0115 }
            if (r0 != r7) goto L_0x0100
            return r7
        L_0x0100:
            r2.A08()
            java.lang.Object r1 = r1.A01
            X.4C8 r1 = (X.AnonymousClass4C8) r1
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.label = r4
            java.lang.Object r0 = r1.Az8(r6, r10)
            goto L_0x016f
        L_0x0115:
            r0 = move-exception
            r2.A08()
            throw r0
        L_0x011a:
            r0 = r8
            boolean r1 = r9 instanceof X.C74513hF
            if (r1 == 0) goto L_0x0172
            r5 = r9
            X.3hF r5 = (X.C74513hF) r5
            int r3 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0172
            int r3 = r3 - r2
            r5.label = r3
        L_0x012d:
            java.lang.Object r4 = r5.result
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r5.label
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0141
            if (r1 == r2) goto L_0x0155
            if (r1 != r3) goto L_0x0178
            X.C57682u2.A01(r4)
        L_0x013e:
            X.2wD r7 = X.C59022wD.A00
            return r7
        L_0x0141:
            X.C57682u2.A01(r4)
            java.lang.Object r1 = r8.A01
            X.4C8 r1 = (X.AnonymousClass4C8) r1
            r5.L$0 = r8
            r5.L$1 = r10
            r5.label = r2
            java.lang.Object r4 = X.AnonymousClass2AO.A00(r5, r1, r10)
            if (r4 != r7) goto L_0x015e
            return r7
        L_0x0155:
            java.lang.Object r10 = r5.L$1
            java.lang.Object r0 = r5.L$0
            X.4J6 r0 = (X.AnonymousClass4J6) r0
            X.C57682u2.A01(r4)
        L_0x015e:
            if (r4 == 0) goto L_0x013e
            java.lang.Object r1 = r0.A00
            X.4GS r1 = (X.AnonymousClass4GS) r1
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r3
            java.lang.Object r0 = r1.BGj(r10, r4, r5)
        L_0x016f:
            if (r0 != r7) goto L_0x013e
            return r7
        L_0x0172:
            X.3hF r5 = new X.3hF
            r5.<init>(r8, r9)
            goto L_0x012d
        L_0x0178:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4J6.Az8(X.4Du, X.4C9):java.lang.Object");
    }

    public AnonymousClass4J6(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
