package X;

import java.util.List;

/* renamed from: X.9ju  reason: invalid class name and case insensitive filesystem */
public class C201339ju implements Runnable {
    public final /* synthetic */ AnonymousClass9RQ A00;
    public final /* synthetic */ C194129Rr A01;
    public final /* synthetic */ AnonymousClass9PU A02;
    public final /* synthetic */ AnonymousClass32L A03;
    public final /* synthetic */ List A04;

    public C201339ju(AnonymousClass9RQ r1, C194129Rr r2, AnonymousClass9PU r3, AnonymousClass32L r4, List list) {
        this.A02 = r3;
        this.A04 = list;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r6.isEmpty() != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            java.util.List r6 = r14.A04
            if (r6 == 0) goto L_0x000b
            boolean r1 = r6.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r2 = 0
            if (r0 == 0) goto L_0x0021
            X.9RQ r3 = r14.A00
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r3.A00(r0)
            X.9Rr r1 = r14.A01
            X.9SI r0 = new X.9SI
            r0.<init>()
            r1.A00(r0, r2)
            return
        L_0x0021:
            java.util.Iterator r5 = r6.iterator()
        L_0x0025:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r4 = r5.next()
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r4 = (com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling) r4
            X.9PU r0 = r14.A02
            X.5Ms r0 = r0.A02
            X.66R r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.8OQ r0 = (X.AnonymousClass8OQ) r0
            java.util.Set r1 = r0.keySet()
            X.C162457s7.A0D(r1)
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r4.mCapability
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            java.lang.Object[] r3 = X.AnonymousClass002.A0M()
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r4.mCapability
            java.lang.String r1 = r0.toServerValue()
            r0 = 0
            r3[r0] = r1
            X.32L r0 = r14.A03
            java.lang.String r1 = r0.A01
            r0 = 1
            r3[r0] = r1
            java.lang.String r1 = "DefaultARModelManager"
            java.lang.String r0 = "tries to fetch unsupported capability: %s. operation id: %s"
            X.C162477s9.A0G(r1, r0, r3)
            goto L_0x0025
        L_0x0068:
            X.9PU r3 = r14.A02
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r6.iterator()
        L_0x0076:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r1 = r7.next()
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r1 = (com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling) r1
            if (r1 == 0) goto L_0x0076
            com.facebook.cameracore.ardelivery.model.VersionedCapability r9 = r1.mCapability
            boolean r0 = r5.contains(r9)
            r12 = 0
            if (r0 == 0) goto L_0x009f
            java.lang.Object[] r6 = X.AnonymousClass002.A0L()
            java.lang.String r0 = r9.toServerValue()
            r6[r12] = r0
            java.lang.String r1 = "DefaultARModelManager"
            java.lang.String r0 = "should not request duplicated capability : %s"
            X.C162477s9.A0G(r1, r0, r6)
            goto L_0x0076
        L_0x009f:
            r5.add(r9)
            int r10 = r1.mMinVersion
            X.5Ms r0 = r3.A02
            X.C162457s7.A0J(r9, r12)
            X.66R r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.8OQ r0 = (X.AnonymousClass8OQ) r0
            java.lang.Object r0 = r0.get(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00c4
            r11 = 0
        L_0x00ba:
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r8 = new com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest
            r13 = r12
            r8.<init>(r9, r10, r11, r12, r13)
            r4.add(r8)
            goto L_0x0076
        L_0x00c4:
            int r11 = r0.intValue()
            goto L_0x00ba
        L_0x00c9:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00db
            X.9Rr r1 = r14.A01
            java.lang.String r0 = "no valid request for capabilityMinVersionList"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            r1.A00(r2, r0)
            return
        L_0x00db:
            X.9TF r3 = r3.A00
            X.32L r2 = r14.A03
            X.9RQ r1 = r14.A00
            X.9Ya r0 = new X.9Ya
            r0.<init>(r14, r4)
            r3.A00(r1, r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201339ju.run():void");
    }
}
