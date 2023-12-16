package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass2PZ;
import X.AnonymousClass4GR;
import X.C53652nR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1", f = "WfsNativeAuthManager.kt", i = {0, 0, 0, 0}, l = {264}, m = "invokeSuspend", n = {"$this$runBlockingWa", "resultChannel", "jobs", "results"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class WfsNativeAuthManager$getSsoList$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C53652nR $abOfflineProps;
    public final /* synthetic */ Context $context;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ AnonymousClass2PZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$1(Context context, AnonymousClass2PZ r3, C53652nR r4, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r3;
        this.$context = context;
        this.$abOfflineProps = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        r15 = new X.AnonymousClass466(B5w());
        r5 = r1.BAA();
        r15.A05(new X.C47162co(r5.A00, (java.lang.Object) null, new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$2$1((X.C84814Du) null, r7), r5.A02, r5.A01, r15), false);
        r3.L$0 = r0;
        r3.L$1 = r1;
        r3.L$2 = r6;
        r3.L$3 = r7;
        r3.label = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d8, code lost:
        if ((X.AnonymousClass466.A05.get(r15) instanceof X.C47162co) == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
        r5 = r15.A02(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00de, code lost:
        if (r5 != r4) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e0, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e1, code lost:
        r5 = r15.A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r7.element != null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r19) {
        /*
            r18 = this;
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            r3 = r18
            int r0 = r3.label
            r9 = 0
            r2 = 1
            r11 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 != r2) goto L_0x00f0
            java.lang.Object r7 = r3.L$3
            X.3Yy r7 = (X.C69903Yy) r7
            java.lang.Object r6 = r3.L$2
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r1 = r3.L$1
            X.4Gn r1 = (X.C85504Gn) r1
            java.lang.Object r0 = r3.L$0
            X.4C6 r0 = (X.AnonymousClass4C6) r0
            X.C57682u2.A01(r19)
        L_0x0020:
            java.lang.Object r5 = r7.element
            if (r5 == 0) goto L_0x007e
        L_0x0024:
            java.util.Iterator r2 = r6.iterator()
        L_0x0028:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = r2.next()
            X.4Gj r0 = (X.C85474Gj) r0
            r0.AyX(r11)
            goto L_0x0028
        L_0x0038:
            X.C57682u2.A01(r19)
            java.lang.Object r0 = r3.L$0
            X.4C6 r0 = (X.AnonymousClass4C6) r0
            X.8PR r1 = new X.8PR
            r1.<init>(r9)
            X.2PZ r7 = r3.this$0
            android.content.Context r6 = r3.$context
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$fbJob$1 r5 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$fbJob$1
            r5.<init>(r6, r7, r11, r1)
            r10 = 3
            X.4Gj r8 = X.C616131n.A02(r11, r5, r0, r11, r10)
            X.2PZ r14 = r3.this$0
            android.content.Context r13 = r3.$context
            X.2nR r15 = r3.$abOfflineProps
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$igJob$1 r12 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$igJob$1
            r16 = r11
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            X.4Gj r7 = X.C616131n.A02(r11, r12, r0, r11, r10)
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$fallbackJob$1 r5 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$fallbackJob$1
            r5.<init>(r11, r8, r7, r1)
            X.4Gj r6 = X.C616131n.A02(r11, r5, r0, r11, r10)
            X.4Gj[] r5 = new X.C85474Gj[r10]
            r5[r9] = r8
            X.C18300x5.A1K(r7, r6, r5)
            java.util.List r6 = X.AnonymousClass8UF.A0o(r5)
            X.3Yy r7 = new X.3Yy
            r7.<init>()
        L_0x007e:
            boolean r5 = X.AnonymousClass349.A04(r0)
            if (r5 == 0) goto L_0x0024
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto L_0x008f
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L_0x008f
            goto L_0x0024
        L_0x008f:
            java.util.Iterator r8 = r6.iterator()
        L_0x0093:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x0024
            java.lang.Object r5 = r8.next()
            X.4Gj r5 = (X.C85474Gj) r5
            boolean r5 = r5.BGz()
            if (r5 == 0) goto L_0x0093
            X.4Gl r5 = r3.B5w()
            X.466 r15 = new X.466
            r15.<init>(r5)
            X.2PR r5 = r1.BAA()
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$2$1 r12 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$2$1
            r12.<init>(r11, r7)
            java.lang.Object r10 = r5.A00
            X.4GS r13 = r5.A02
            X.4GS r14 = r5.A01
            X.2co r9 = new X.2co
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r5 = 0
            r15.A05(r9, r5)
            r3.L$0 = r0
            r3.L$1 = r1
            r3.L$2 = r6
            r3.L$3 = r7
            r3.label = r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = X.AnonymousClass466.A05
            java.lang.Object r5 = r5.get(r15)
            boolean r5 = r5 instanceof X.C47162co
            if (r5 == 0) goto L_0x00e1
            java.lang.Object r5 = r15.A02(r3)
        L_0x00de:
            if (r5 != r4) goto L_0x0020
            return r4
        L_0x00e1:
            java.lang.Object r5 = r15.A03(r3)
            goto L_0x00de
        L_0x00e6:
            r1.Az4(r11)
            java.lang.Object r4 = r7.element
            if (r4 != 0) goto L_0x00ef
            X.3d3 r4 = X.C72023d3.A00
        L_0x00ef:
            return r4
        L_0x00f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        WfsNativeAuthManager$getSsoList$1 wfsNativeAuthManager$getSsoList$1 = new WfsNativeAuthManager$getSsoList$1(this.$context, this.this$0, this.$abOfflineProps, r6);
        wfsNativeAuthManager$getSsoList$1.L$0 = obj;
        return wfsNativeAuthManager$getSsoList$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
