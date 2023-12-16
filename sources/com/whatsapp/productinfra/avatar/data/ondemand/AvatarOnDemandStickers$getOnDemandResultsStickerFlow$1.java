package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass28M;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1", f = "AvatarOnDemandStickers.kt", i = {0, 1, 1}, l = {221, 225, 230}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "stickerLocations"}, s = {"L$0", "L$0", "L$1"})
public final class AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $qplInstanceKey;
    public final /* synthetic */ AnonymousClass28M $searchType;
    public final /* synthetic */ List $stableIds;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r8 == r1) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r13) {
        /*
            r12 = this;
            r8 = r13
            X.218 r1 = X.AnonymousClass218.COROUTINE_SUSPENDED
            r9 = r12
            int r0 = r12.label
            r2 = 3
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r3) goto L_0x0037
            if (r0 == r7) goto L_0x0099
            if (r0 != r2) goto L_0x00b9
            X.C57682u2.A01(r13)
        L_0x0014:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0017:
            X.C57682u2.A01(r13)
            java.lang.Object r10 = r12.L$0
            X.4C9 r10 = (X.AnonymousClass4C9) r10
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r12.this$0
            X.2TT r6 = r0.A04
            java.util.List r5 = r12.$stableIds
            r12.L$0 = r10
            r12.label = r3
            X.3gB r4 = r6.A07
            r3 = 0
            com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2 r0 = new com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2
            r0.<init>(r6, r5, r3)
            java.lang.Object r8 = X.C616131n.A00(r12, r4, r0)
            if (r8 != r1) goto L_0x003e
        L_0x0036:
            return r1
        L_0x0037:
            java.lang.Object r10 = r12.L$0
            X.4C9 r10 = (X.AnonymousClass4C9) r10
            X.C57682u2.A01(r13)
        L_0x003e:
            java.util.List r8 = (java.util.List) r8
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r12.this$0
            X.2qu r4 = r0.A02
            int r3 = r12.$qplInstanceKey
            java.lang.String r0 = "stickers_located"
            r4.A01(r3, r0)
            X.28M r5 = r12.$searchType
            r12.L$0 = r10
            r12.L$1 = r8
            r12.label = r7
            java.util.ArrayList r4 = X.C73783g4.A0c(r8)
            java.util.Iterator r6 = r8.iterator()
        L_0x005c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r3 = r6.next()
            X.28O r3 = (X.AnonymousClass28O) r3
            boolean r0 = r3 instanceof X.C30011li
            if (r0 == 0) goto L_0x0079
            X.1li r3 = (X.C30011li) r3
            X.39M r0 = r3.A00
            X.1lg r3 = new X.1lg
            r3.<init>(r0)
        L_0x0075:
            r4.add(r3)
            goto L_0x005c
        L_0x0079:
            boolean r0 = r3 instanceof X.C30021lj
            if (r0 == 0) goto L_0x00be
            X.1lj r3 = (X.C30021lj) r3
            X.2jB r0 = r3.A00
            java.lang.String r0 = r0.A00
            X.1lf r3 = new X.1lf
            r3.<init>(r0)
            goto L_0x0075
        L_0x0089:
            X.1le r0 = new X.1le
            r0.<init>(r5, r4)
            java.lang.Object r0 = r10.B2K(r0, r12)
            if (r0 == r1) goto L_0x0036
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r1) goto L_0x00a5
            return r1
        L_0x0099:
            java.lang.Object r0 = r12.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r10 = r12.L$0
            X.4C9 r10 = (X.AnonymousClass4C9) r10
            X.C57682u2.A01(r13)
            r8 = r0
        L_0x00a5:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r6 = r12.this$0
            X.28M r7 = r12.$searchType
            int r11 = r12.$qplInstanceKey
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r0
            r12.label = r2
            java.lang.Object r0 = r6.A00(r7, r8, r9, r10, r11)
            if (r0 != r1) goto L_0x0014
            return r1
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x00be:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1.A09(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1(AnonymousClass28M r2, AvatarOnDemandStickers avatarOnDemandStickers, List list, C84814Du r5, int i) {
        super(r5, 2);
        this.this$0 = avatarOnDemandStickers;
        this.$stableIds = list;
        this.$qplInstanceKey = i;
        this.$searchType = r2;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1 avatarOnDemandStickers$getOnDemandResultsStickerFlow$1 = new AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1(this.$searchType, this.this$0, this.$stableIds, r8, this.$qplInstanceKey);
        avatarOnDemandStickers$getOnDemandResultsStickerFlow$1.L$0 = obj;
        return avatarOnDemandStickers$getOnDemandResultsStickerFlow$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
