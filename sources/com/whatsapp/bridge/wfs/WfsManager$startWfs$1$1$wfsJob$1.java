package com.whatsapp.bridge.wfs;

import X.AnonymousClass4CV;
import X.AnonymousClass4GR;
import X.C43842Tr;
import X.C53652nR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1$wfsJob$1", f = "WfsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WfsManager$startWfs$1$1$wfsJob$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C53652nR $abOfflineProps;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass4CV $listener;
    public final /* synthetic */ String $purpose;
    public final /* synthetic */ int $purposePolicyId;
    public int label;
    public final /* synthetic */ C43842Tr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsManager$startWfs$1$1$wfsJob$1(Context context, AnonymousClass4CV r3, C43842Tr r4, C53652nR r5, String str, C84814Du r7, int i) {
        super(r7, 2);
        this.this$0 = r4;
        this.$context = context;
        this.$abOfflineProps = r5;
        this.$purposePolicyId = i;
        this.$purpose = str;
        this.$listener = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005b A[Catch:{ Exception -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce A[Catch:{ Exception -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8 A[Catch:{ Exception -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0111 A[Catch:{ Exception -> 0x01aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r18) {
        /*
            r17 = this;
            r2 = r17
            int r0 = r2.label
            if (r0 != 0) goto L_0x01b9
            X.C57682u2.A01(r18)
            X.2Tr r5 = r2.this$0
            X.2PZ r3 = r5.A02
            android.content.Context r8 = r2.$context
            X.2nR r7 = r2.$abOfflineProps
            int r4 = r2.$purposePolicyId
            java.lang.String r1 = r2.$purpose
            X.4CV r0 = r2.$listener
            X.2ab r2 = new X.2ab
            r2.<init>(r0, r5, r1, r4)
            r10 = 0
            X.C18270x1.A14(r8, r7)
            java.lang.String r0 = "WfsNativeAuthManager/getSsoCredentials"
            X.AnonymousClass356.A01(r0)
            boolean r0 = X.AnonymousClass31M.A02(r8, r7)
            java.lang.String r11 = "ig"
            java.lang.String r9 = "fb"
            r1 = r9
            if (r0 == 0) goto L_0x0031
            r1 = r11
        L_0x0031:
            X.2es r6 = r3.A02     // Catch:{ Exception -> 0x01aa }
            boolean r0 = X.C162457s7.A0P(r1, r9)     // Catch:{ Exception -> 0x01aa }
            r5 = 551497305(0x20df2e59, float:3.780834E-19)
            if (r0 == 0) goto L_0x008f
            X.8vZ r4 = r6.A01     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "fetch_auth_fb_start"
        L_0x0040:
            r4.markerPoint(r5, r0)     // Catch:{ Exception -> 0x01aa }
        L_0x0043:
            r0 = 0
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1 r4 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1     // Catch:{ Exception -> 0x01aa }
            r4.<init>(r8, r3, r7, r0)     // Catch:{ Exception -> 0x01aa }
            X.3du r0 = X.C72553du.A00     // Catch:{ Exception -> 0x01aa }
            java.lang.Object r12 = X.C380725l.A00(r0, r4)     // Catch:{ Exception -> 0x01aa }
            java.util.List r12 = (java.util.List) r12     // Catch:{ Exception -> 0x01aa }
            boolean r0 = r12.isEmpty()     // Catch:{ Exception -> 0x01aa }
            r16 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ce
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x01aa }
            java.util.Iterator r14 = r12.iterator()     // Catch:{ Exception -> 0x01aa }
        L_0x0063:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x01aa }
            r13 = 0
            if (r0 == 0) goto L_0x009a
            java.lang.Object r7 = r14.next()     // Catch:{ Exception -> 0x01aa }
            r5 = r7
            X.2fV r5 = (X.C48802fV) r5     // Catch:{ Exception -> 0x01aa }
            X.7nb r0 = r5.A01     // Catch:{ Exception -> 0x01aa }
            X.7Id r0 = r0.A03     // Catch:{ Exception -> 0x01aa }
            X.6xB r4 = r0.A01     // Catch:{ Exception -> 0x01aa }
            X.6xB r0 = X.C142426xB.FXAccountItemEligibilityEligible     // Catch:{ Exception -> 0x01aa }
            if (r4 != r0) goto L_0x007c
            r13 = 1
        L_0x007c:
            X.7Wu r0 = r5.A00     // Catch:{ Exception -> 0x01aa }
            X.6xj r5 = r0.A04     // Catch:{ Exception -> 0x01aa }
            if (r13 == 0) goto L_0x0063
            X.6xj r4 = X.C142766xj.A04     // Catch:{ Exception -> 0x01aa }
            r0 = r9
            if (r5 != r4) goto L_0x0088
            r0 = r11
        L_0x0088:
            r6.A01(r0)     // Catch:{ Exception -> 0x01aa }
            r8.add(r7)     // Catch:{ Exception -> 0x01aa }
            goto L_0x0063
        L_0x008f:
            boolean r0 = X.C162457s7.A0P(r1, r11)     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x0043
            X.8vZ r4 = r6.A01     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "fetch_auth_ig_start"
            goto L_0x0040
        L_0x009a:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x01aa }
            java.util.Iterator r13 = r12.iterator()     // Catch:{ Exception -> 0x01aa }
        L_0x00a2:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r12 = r13.next()     // Catch:{ Exception -> 0x01aa }
            r5 = r12
            X.2fV r5 = (X.C48802fV) r5     // Catch:{ Exception -> 0x01aa }
            X.7nb r0 = r5.A01     // Catch:{ Exception -> 0x01aa }
            X.7Id r0 = r0.A03     // Catch:{ Exception -> 0x01aa }
            X.6xB r4 = r0.A00     // Catch:{ Exception -> 0x01aa }
            X.6xB r0 = X.C142426xB.FXAccountItemEligibilityEligible     // Catch:{ Exception -> 0x01aa }
            boolean r4 = X.AnonymousClass000.A1Y(r4, r0)
            X.7Wu r0 = r5.A00     // Catch:{ Exception -> 0x01aa }
            X.6xj r5 = r0.A04     // Catch:{ Exception -> 0x01aa }
            if (r4 == 0) goto L_0x00a2
            X.6xj r4 = X.C142766xj.A04     // Catch:{ Exception -> 0x01aa }
            r0 = r9
            if (r5 != r4) goto L_0x00c7
            r0 = r11
        L_0x00c7:
            r6.A01(r0)     // Catch:{ Exception -> 0x01aa }
            r7.add(r12)     // Catch:{ Exception -> 0x01aa }
            goto L_0x00a2
        L_0x00ce:
            r6.A01(r1)     // Catch:{ Exception -> 0x01aa }
            r6.A00(r1)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "sso list is empty"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ Exception -> 0x01aa }
            goto L_0x0101
        L_0x00dc:
            boolean r0 = X.C162457s7.A0P(r1, r9)     // Catch:{ Exception -> 0x01aa }
            r5 = 551497305(0x20df2e59, float:3.780834E-19)
            if (r0 == 0) goto L_0x0106
            X.8vZ r4 = r6.A01     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "fetch_auth_fb_end"
        L_0x00e9:
            r4.markerPoint(r5, r0)     // Catch:{ Exception -> 0x01aa }
        L_0x00ec:
            boolean r0 = r8.isEmpty()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x0111
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x0111
            r6.A01(r1)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "Not eligible for wfs or nta"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ Exception -> 0x01aa }
        L_0x0101:
            r2.A00(r0)     // Catch:{ Exception -> 0x01aa }
            goto L_0x01b6
        L_0x0106:
            boolean r0 = X.C162457s7.A0P(r1, r11)     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x00ec
            X.8vZ r4 = r6.A01     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "fetch_auth_ig_end"
            goto L_0x00e9
        L_0x0111:
            boolean r0 = r8.isEmpty()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x0129
            X.2Tr r0 = r2.A02     // Catch:{ Exception -> 0x01aa }
            X.3Wi r6 = r0.A00     // Catch:{ Exception -> 0x01aa }
            X.4CV r5 = r2.A01     // Catch:{ Exception -> 0x01aa }
            r4 = 17
            X.5rQ r0 = new X.5rQ     // Catch:{ Exception -> 0x01aa }
            r0.<init>(r5, r4)     // Catch:{ Exception -> 0x01aa }
            r6.BkS(r0)     // Catch:{ Exception -> 0x01aa }
            goto L_0x01b6
        L_0x0129:
            java.lang.Object r0 = r8.get(r10)     // Catch:{ Exception -> 0x01aa }
            X.2fV r0 = (X.C48802fV) r0     // Catch:{ Exception -> 0x01aa }
            X.7Wu r0 = r0.A00     // Catch:{ Exception -> 0x01aa }
            X.6xj r4 = r0.A04     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "WfsNativeAuthManager/getSsoCredentials Finished fetching data from app"
            X.AnonymousClass356.A01(r0)     // Catch:{ Exception -> 0x01aa }
            java.util.Map r0 = r3.A03     // Catch:{ Exception -> 0x01aa }
            r7 = 551495536(0x20df2770, float:3.7803767E-19)
            java.lang.Object r0 = X.AnonymousClass001.A0i(r0, r7)     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x01a5
            X.5hc r0 = (X.C111145hc) r0     // Catch:{ Exception -> 0x01aa }
            java.lang.String r6 = "FETCH_PHONE_NUMBER_START"
            r5 = 0
            r0.A02(r7, r5, r6)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r6 = "is_re_reg"
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x01aa }
            r0.A06(r6, r5)     // Catch:{ Exception -> 0x01aa }
            java.lang.String r5 = "source_app"
            X.6xj r7 = X.C142766xj.A04     // Catch:{ Exception -> 0x01aa }
            if (r4 == r7) goto L_0x015a
            r11 = r9
        L_0x015a:
            r0.A06(r5, r11)     // Catch:{ Exception -> 0x01aa }
            X.2Ce r6 = r3.A00     // Catch:{ Exception -> 0x01aa }
            java.lang.Object r5 = r8.get(r10)     // Catch:{ Exception -> 0x01aa }
            X.2fV r5 = (X.C48802fV) r5     // Catch:{ Exception -> 0x01aa }
            X.7nb r5 = r5.A01     // Catch:{ Exception -> 0x01aa }
            java.lang.String r13 = r5.A00     // Catch:{ Exception -> 0x01aa }
            X.C162457s7.A0D(r13)     // Catch:{ Exception -> 0x01aa }
            if (r4 == r7) goto L_0x0170
            r16 = 0
        L_0x0170:
            X.5sx r5 = r6.A00     // Catch:{ Exception -> 0x01aa }
            X.3Db r6 = r5.A03     // Catch:{ Exception -> 0x01aa }
            X.1VX r9 = X.C64333Db.A4B(r6)     // Catch:{ Exception -> 0x01aa }
            X.3FI r11 = X.C64333Db.A8x(r6)     // Catch:{ Exception -> 0x01aa }
            X.2s4 r7 = X.C64333Db.A07(r6)     // Catch:{ Exception -> 0x01aa }
            X.33p r8 = X.C64333Db.A2s(r6)     // Catch:{ Exception -> 0x01aa }
            X.8qC r12 = X.C64333Db.A9V(r6)     // Catch:{ Exception -> 0x01aa }
            X.4as r5 = r5.A01     // Catch:{ Exception -> 0x01aa }
            X.4C1 r14 = r5.A4O     // Catch:{ Exception -> 0x01aa }
            X.4C1 r15 = r5.A4P     // Catch:{ Exception -> 0x01aa }
            X.28T r10 = X.C64333Db.A7R(r6)     // Catch:{ Exception -> 0x01aa }
            X.1vV r6 = new X.1vV     // Catch:{ Exception -> 0x01aa }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01aa }
            r12 = 1
            X.4Ka r7 = new X.4Ka     // Catch:{ Exception -> 0x01aa }
            r10 = r0
            r11 = r2
            r9 = r4
            r8 = r3
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x01aa }
            r6.Bh4(r7)     // Catch:{ Exception -> 0x01aa }
            goto L_0x01b6
        L_0x01a5:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ Exception -> 0x01aa }
            throw r0     // Catch:{ Exception -> 0x01aa }
        L_0x01aa:
            r4 = move-exception
            X.2es r0 = r3.A02
            r0.A01(r1)
            r0.A00(r1)
            r2.A00(r4)
        L_0x01b6:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x01b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1$wfsJob$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r10) {
        C43842Tr r3 = this.this$0;
        Context context = this.$context;
        C53652nR r4 = this.$abOfflineProps;
        int i = this.$purposePolicyId;
        return new WfsManager$startWfs$1$1$wfsJob$1(context, this.$listener, r3, r4, this.$purpose, r10, i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
