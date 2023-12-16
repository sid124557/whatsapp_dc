package X;

import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.603  reason: invalid class name */
public final class AnonymousClass603 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectoryMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass603(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        super(1);
        this.this$0 = businessDirectoryMapViewActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b5, code lost:
        if (r9.A0Y.get(r12) != null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        if (r15 == false) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25) {
        /*
            r24 = this;
            r2 = r25
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.ArrayList r17 = X.AnonymousClass001.A0s()
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            r0 = r24
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r9 = r0.this$0
            X.5hC r0 = r9.A07
            if (r0 == 0) goto L_0x017c
            X.C162457s7.A0H(r2)
            java.util.Iterator r1 = r2.iterator()
            r8 = 0
            r7 = 0
            r6 = 0
        L_0x0022:
            boolean r0 = r1.hasNext()
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r1.next()
            X.7yS r0 = (X.C166297yS) r0
            int r0 = r0.A00
            if (r0 == r3) goto L_0x003f
            if (r0 == r4) goto L_0x003c
            if (r0 != r5) goto L_0x0022
            int r6 = r6 + 1
            goto L_0x0022
        L_0x003c:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x003f:
            int r8 = r8 + 1
            goto L_0x0022
        L_0x0042:
            java.util.Iterator r16 = r2.iterator()
        L_0x0046:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x017c
            java.lang.Object r2 = r16.next()
            X.7yS r2 = (X.C166297yS) r2
            int r0 = r2.A00
            if (r0 == r3) goto L_0x00fe
            if (r0 == r4) goto L_0x00a5
            if (r0 != r5) goto L_0x0046
            X.5hC r13 = r9.A07
            if (r13 == 0) goto L_0x0046
            X.5e1 r1 = r2.A03
            if (r1 == 0) goto L_0x0046
            X.7Tr r0 = r9.A0I
            if (r0 == 0) goto L_0x0175
            X.4Za r12 = new X.4Za
            r12.<init>(r13, r0, r2, r1)
            r1 = 26
            X.5f3 r0 = new X.5f3
            r0.<init>((java.lang.Object) r9, (int) r1, (java.lang.Object) r12)
            r12.A02 = r0
            r13.A0C(r12)
            r10.add(r12)
            boolean r0 = r2.A01
            java.lang.String r1 = "viewModel"
            if (r0 == 0) goto L_0x0090
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.A06(r0)
            X.4U2 r0 = r9.A0N
            if (r0 != 0) goto L_0x008e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x008e:
            r0.A08 = r12
        L_0x0090:
            int r0 = r10.size()
            if (r6 != r0) goto L_0x0046
            X.4U2 r0 = r9.A0N
            if (r0 != 0) goto L_0x009f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x009f:
            java.util.Set r0 = r0.A0H
            r0.addAll(r10)
            goto L_0x0046
        L_0x00a5:
            X.5e1 r14 = r2.A03
            if (r14 == 0) goto L_0x0046
            java.lang.String r12 = r14.A0G
            r15 = 0
            if (r12 == 0) goto L_0x00b7
            java.util.Map r0 = r9.A0Y
            java.lang.Object r0 = r0.get(r12)
            r13 = 0
            if (r0 == 0) goto L_0x00b8
        L_0x00b7:
            r13 = 1
        L_0x00b8:
            java.util.Map r1 = r9.A0Z
            java.lang.String r0 = r14.A04()
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x00c5
            r15 = 1
        L_0x00c5:
            if (r13 == 0) goto L_0x00d0
            if (r15 == 0) goto L_0x00d2
            r0 = r17
            r9.A77(r2, r0, r7)
            goto L_0x0046
        L_0x00d0:
            if (r15 != 0) goto L_0x00e8
        L_0x00d2:
            java.lang.String r20 = r14.A04()
            X.C162457s7.A0D(r20)
            r21 = r17
            r22 = r1
            r23 = r7
            r18 = r9
            r19 = r2
            r18.A76(r19, r20, r21, r22, r23)
            if (r13 != 0) goto L_0x0046
        L_0x00e8:
            X.C162457s7.A0H(r12)
            java.util.Map r0 = r9.A0Y
            r18 = r9
            r19 = r2
            r20 = r12
            r21 = r17
            r22 = r0
            r23 = r7
            r18.A76(r19, r20, r21, r22, r23)
            goto L_0x0046
        L_0x00fe:
            X.7y3 r15 = r2.A02
            if (r15 == 0) goto L_0x0046
            X.4Lk r12 = r9.A0K
            java.lang.String r0 = "clusterMarkerDrawable"
            if (r12 != 0) goto L_0x010d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x010d:
            int r13 = r15.A02
            double r0 = (double) r13
            r12.A00 = r0
            if (r13 != 0) goto L_0x011f
            X.7AD r13 = r9.A08
            if (r13 != 0) goto L_0x0132
            java.lang.String r0 = "greenDotDescriptor"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x011f:
            int r1 = r12.A01
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
            android.graphics.Canvas r0 = X.AnonymousClass4L0.A06(r1)
            r12.draw(r0)
            X.7AD r13 = X.C106915aN.A01(r1)
        L_0x0132:
            X.7hV r14 = new X.7hV
            r14.<init>()
            r12 = 1056964608(0x3f000000, float:0.5)
            float[] r1 = r14.A06
            r0 = 0
            r1[r0] = r12
            r1[r3] = r12
            r14.A00 = r13
            double r12 = r15.A00
            double r0 = r15.A01
            X.5ds r0 = X.C108975ds.A00(r12, r0)
            r14.A01 = r0
            X.5hC r1 = r9.A07
            if (r1 == 0) goto L_0x015f
            X.4Zc r0 = new X.4Zc
            r0.<init>(r1, r14)
            r1.A0C(r0)
            r0.A0H = r1
            r0.A0K = r2
            r11.add(r0)
        L_0x015f:
            int r0 = r11.size()
            if (r0 != r8) goto L_0x0046
            X.4U2 r0 = r9.A0N
            if (r0 != 0) goto L_0x016e
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x016e:
            java.util.Set r0 = r0.A0G
            r0.addAll(r11)
            goto L_0x0046
        L_0x0175:
            java.lang.String r0 = "directoryImageLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x017c:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass603.invoke(java.lang.Object):java.lang.Object");
    }
}
