package X;

/* renamed from: X.92X  reason: invalid class name */
public class AnonymousClass92X implements C84134Bd {
    public Object A00;
    public final int A01;

    public AnonymousClass92X(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r2 == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (r2 == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        if (r1 != 404) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AwB(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0046;
                case 1: goto L_0x00c9;
                case 2: goto L_0x000d;
                case 3: goto L_0x00d3;
                case 4: goto L_0x0103;
                case 5: goto L_0x010e;
                case 6: goto L_0x0132;
                case 7: goto L_0x0140;
                case 8: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A00
            X.2s3 r0 = (X.C56482s3) r0
            r0.A06(r8)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r7.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x000c
            r1.run()
            return
        L_0x001f:
            java.lang.Object r4 = r7.A00
            X.1I7 r4 = (X.AnonymousClass1I7) r4
            boolean r0 = r8 instanceof java.io.IOException
            r3 = 0
            r2 = 0
            if (r0 == 0) goto L_0x003a
            r0 = 9
            X.35m r1 = new X.35m
            r1.<init>(r0, r2, r3)
            r4.A0G(r1)
            r4.A0D(r1)
        L_0x0036:
            r4.A0E(r1)
            return
        L_0x003a:
            boolean r0 = r8 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x000c
            r0 = 13
            X.35m r1 = new X.35m
            r1.<init>(r0, r2, r3)
            goto L_0x0036
        L_0x0046:
            java.lang.Object r6 = r7.A00
            X.4VR r6 = (X.AnonymousClass4VR) r6
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            boolean r0 = r8 instanceof X.C143636zE
            r5 = 0
            if (r0 == 0) goto L_0x0088
            X.6zE r8 = (X.C143636zE) r8
            X.6xY r0 = r8.error
            boolean r2 = r0.isRecoverable
            int r1 = r0.code
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0082
            r0 = 423(0x1a7, float:5.93E-43)
            if (r1 == r0) goto L_0x0082
            r4 = 2131889936(0x7f120f10, float:1.941455E38)
            if (r2 != 0) goto L_0x006f
        L_0x0066:
            r4 = 2131889935(0x7f120f0f, float:1.9414548E38)
        L_0x0069:
            X.08M r1 = r6.A0a
            r0 = 7
            X.C06270Wx.A04(r1, r0)
        L_0x006f:
            X.08M r3 = r6.A0b
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r1 = 2131100365(0x7f0602cd, float:1.781311E38)
            X.7KY r0 = new X.7KY
            r0.<init>(r2, r1, r4)
            r3.A0G(r0)
        L_0x007e:
            r6.A0I(r5)
            return
        L_0x0082:
            r4 = 2131889937(0x7f120f11, float:1.9414552E38)
            if (r2 != 0) goto L_0x006f
            goto L_0x0069
        L_0x0088:
            boolean r0 = r8 instanceof X.C143646zF
            if (r0 == 0) goto L_0x00a2
            X.6zF r8 = (X.C143646zF) r8
            X.6xL r0 = r8.error
            int r1 = r0.code
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x009e
            r0 = 404(0x194, float:5.66E-43)
            r4 = 2131889939(0x7f120f13, float:1.9414556E38)
            if (r1 == r0) goto L_0x0069
            goto L_0x0066
        L_0x009e:
            r4 = 2131889938(0x7f120f12, float:1.9414554E38)
            goto L_0x0069
        L_0x00a2:
            boolean r0 = r8 instanceof X.C143706zL
            if (r0 == 0) goto L_0x00bf
            X.08M r1 = r6.A0a
            r0 = 7
            X.C06270Wx.A04(r1, r0)
            X.08M r4 = r6.A0b
            r3 = 2131889935(0x7f120f0f, float:1.9414548E38)
        L_0x00b1:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r1 = 2131100365(0x7f0602cd, float:1.781311E38)
            X.7KY r0 = new X.7KY
            r0.<init>(r2, r1, r3)
            r4.A0G(r0)
            goto L_0x007e
        L_0x00bf:
            boolean r0 = r8 instanceof X.C143716zM
            if (r0 == 0) goto L_0x007e
            X.08M r4 = r6.A0b
            r3 = 2131889936(0x7f120f10, float:1.941455E38)
            goto L_0x00b1
        L_0x00c9:
            java.lang.Object r0 = r7.A00
            X.4mx r0 = (X.C92604mx) r0
            X.7O9 r8 = (X.AnonymousClass7O9) r8
            X.C92604mx.A01(r0, r8)
            return
        L_0x00d3:
            java.lang.Object r4 = r7.A00
            X.3XA r4 = (X.AnonymousClass3XA) r4
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r0 = 1
            X.C162457s7.A0J(r8, r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r8.iterator()
        L_0x00e5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.7Zc r0 = (X.C152497Zc) r0
            int r0 = r0.A00
            if (r0 != 0) goto L_0x00e5
            r3.add(r1)
            goto L_0x00e5
        L_0x00fa:
            X.6jz r0 = new X.6jz
            r0.<init>(r3)
            r4.AwB(r0)
            return
        L_0x0103:
            java.lang.Object r1 = r7.A00
            X.3QO r1 = (X.AnonymousClass3QO) r1
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            X.3XB r0 = r1.A0C
            goto L_0x013c
        L_0x010e:
            java.lang.Object r2 = r7.A00
            X.3QO r2 = (X.AnonymousClass3QO) r2
            X.7Oi r8 = (X.C149897Oi) r8
            X.3QN r0 = r2.A02
            if (r0 == 0) goto L_0x0123
            X.33a r1 = r0.A01
            monitor-enter(r1)
            r0 = 1
            r1.A0G = r0     // Catch:{ all -> 0x011f }
            goto L_0x0122
        L_0x011f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0122:
            monitor-exit(r1)
        L_0x0123:
            int r0 = r8.A00
            if (r0 != 0) goto L_0x0128
            r0 = 0
        L_0x0128:
            X.3XB r1 = r2.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05(r0)
            return
        L_0x0132:
            java.lang.Object r1 = r7.A00
            X.3QO r1 = (X.AnonymousClass3QO) r1
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            X.3XB r0 = r1.A0G
        L_0x013c:
            r0.A05(r8)
            return
        L_0x0140:
            java.lang.Object r0 = r7.A00
            X.1I7 r0 = (X.AnonymousClass1I7) r0
            X.35m r8 = (X.C625435m) r8
            r0.A0D(r8)
            r0.A0E(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92X.AwB(java.lang.Object):void");
    }
}
