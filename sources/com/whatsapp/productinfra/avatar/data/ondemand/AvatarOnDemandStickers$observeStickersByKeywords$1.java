package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass28M;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85444Gg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersByKeywords$1", f = "AvatarOnDemandStickers.kt", i = {0, 0, 1, 2, 2, 3, 4, 4, 4, 5, 5}, l = {104, 106, 121, 123, 134, 143, 152}, m = "invokeSuspend", n = {"$this$flow", "qplInstanceKey", "qplInstanceKey", "$this$flow", "qplInstanceKey", "it", "$this$flow", "stableIds", "qplInstanceKey", "$this$flow", "stableIds"}, s = {"L$0", "I$0", "I$0", "L$0", "I$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1"})
public final class AvatarOnDemandStickers$observeStickersByKeywords$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C85444Gg $fetchStickersSignal;
    public final /* synthetic */ String[] $keywords;
    public final /* synthetic */ AnonymousClass28M $searchType;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$observeStickersByKeywords$1(AnonymousClass28M r2, AvatarOnDemandStickers avatarOnDemandStickers, C84814Du r4, C85444Gg r5, String[] strArr) {
        super(r4, 2);
        this.this$0 = avatarOnDemandStickers;
        this.$searchType = r2;
        this.$fetchStickersSignal = r5;
        this.$keywords = strArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0108, code lost:
        if (r15 != r7) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0120, code lost:
        if (r15 == null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0122, code lost:
        r2 = r14.this$0;
        r14.L$0 = r2;
        r14.I$0 = r6;
        r14.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012f, code lost:
        if (r1.B2K(r15, r14) != r7) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0131, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0132, code lost:
        r14.this$0.A02.A01(r6, "sticker_search_initialized");
        r0 = r14.this$0;
        r2 = r14.$keywords;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r8 = r0.A03;
        r14.L$0 = r1;
        r14.I$0 = r6;
        r14.label = 3;
        r15 = X.C616131n.A00(r14, r8.A00, new com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2(r8, (X.C84814Du) null, (java.lang.String[]) java.util.Arrays.copyOf(r2, r2.length)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015a, code lost:
        if (r15 != r7) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0166, code lost:
        r2.A01.A02(3, "observe_stickers_failed", "search not initialized");
        r2.A02.A02(X.C372621o.FAIL, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0176, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r15 = (java.util.List) r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r15) {
        /*
            r14 = this;
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r14.label
            java.lang.String r5 = "observe_stickers_failed"
            r13 = 0
            r4 = 3
            switch(r0) {
                case 0: goto L_0x00da;
                case 1: goto L_0x0117;
                case 2: goto L_0x015d;
                case 3: goto L_0x0011;
                case 4: goto L_0x018a;
                case 5: goto L_0x006d;
                case 6: goto L_0x00ab;
                case 7: goto L_0x01ad;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0011:
            int r6 = r14.I$0
            java.lang.Object r1 = r14.L$0
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            X.C57682u2.A01(r15)     // Catch:{ all -> 0x001d }
        L_0x001a:
            java.util.List r15 = (java.util.List) r15     // Catch:{ all -> 0x001d }
            goto L_0x0022
        L_0x001d:
            r0 = move-exception
            X.3Z0 r15 = X.AnonymousClass3Z0.A01(r0)
        L_0x0022:
            X.28M r2 = r14.$searchType
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            java.lang.Throwable r3 = X.AnonymousClass3Z9.A00(r15)
            if (r3 != 0) goto L_0x0177
            r12 = r15
            java.util.List r12 = (java.util.List) r12
            X.2qu r2 = r0.A02
            java.lang.String r0 = "sticker_search_done"
            r2.A01(r6, r0)
            X.28M r5 = r14.$searchType
            java.util.ArrayList r4 = X.C73783g4.A0c(r12)
            java.util.Iterator r3 = r12.iterator()
        L_0x0041:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r3.next()
            X.2jB r0 = (X.C51042jB) r0
            java.lang.String r2 = r0.A00
            X.1lf r0 = new X.1lf
            r0.<init>(r2)
            r4.add(r0)
            goto L_0x0041
        L_0x0058:
            X.1le r2 = new X.1le
            r2.<init>(r5, r4)
            r14.L$0 = r1
            r14.L$1 = r12
            r14.I$0 = r6
            r0 = 5
            r14.label = r0
            java.lang.Object r0 = r1.B2K(r2, r14)
            if (r0 != r7) goto L_0x007a
            return r7
        L_0x006d:
            int r6 = r14.I$0
            java.lang.Object r12 = r14.L$1
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r1 = r14.L$0
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            X.C57682u2.A01(r15)
        L_0x007a:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.2qu r2 = r0.A02
            java.lang.String r0 = "loading_stickers_emitted_to_ui"
            r2.A01(r6, r0)
            X.4Gg r0 = r14.$fetchStickersSignal
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r0.BHF()
            if (r0 != 0) goto L_0x00a6
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.2qu r2 = r0.A02
            X.21o r0 = X.C372621o.SUCCESS
            r2.A02(r0, r6)
            X.4Gg r2 = r14.$fetchStickersSignal
            r14.L$0 = r1
            r14.L$1 = r12
            r0 = 6
            r14.label = r0
            java.lang.Object r0 = r2.Axa(r14)
            if (r0 != r7) goto L_0x00b6
            return r7
        L_0x00a6:
            java.lang.Integer r11 = X.AnonymousClass0x9.A0k(r6)
            goto L_0x00b7
        L_0x00ab:
            java.lang.Object r12 = r14.L$1
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r1 = r14.L$0
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            X.C57682u2.A01(r15)
        L_0x00b6:
            r11 = r13
        L_0x00b7:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r10 = r14.this$0
            X.28M r9 = r14.$searchType
            X.2TU r0 = r10.A05
            X.4Gr r0 = r0.A07
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 r8 = new com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1
            r8.<init>(r9, r10, r11, r12, r13)
            X.4C8 r2 = X.C57752u9.A00(r8, r0)
            r14.L$0 = r13
            r14.L$1 = r13
            r0 = 7
            r14.label = r0
            java.lang.Object r0 = r2.Az8(r14, r1)
            if (r0 == r7) goto L_0x010a
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r7) goto L_0x01b0
            return r7
        L_0x00da:
            X.C57682u2.A01(r15)
            java.lang.Object r1 = r14.L$0
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.2qu r0 = r0.A02
            int r6 = r0.A00()
            X.28M r2 = r14.$searchType
            boolean r0 = r2 instanceof X.C29941lb
            if (r0 == 0) goto L_0x010b
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.2qu r2 = r0.A02
            java.lang.String r0 = "sticker_search_started"
        L_0x00f6:
            r2.A01(r6, r0)
        L_0x00f9:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r3 = r14.this$0
            X.28M r2 = r14.$searchType
            r14.L$0 = r1
            r14.I$0 = r6
            r0 = 1
            r14.label = r0
            java.lang.Object r15 = r3.A01(r2, r14, r6)
            if (r15 != r7) goto L_0x0120
        L_0x010a:
            return r7
        L_0x010b:
            boolean r0 = r2 instanceof X.C29931la
            if (r0 == 0) goto L_0x00f9
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.2qu r2 = r0.A02
            java.lang.String r0 = "sticker_category_requested"
            goto L_0x00f6
        L_0x0117:
            int r6 = r14.I$0
            java.lang.Object r1 = r14.L$0
            X.4C9 r1 = (X.AnonymousClass4C9) r1
            X.C57682u2.A01(r15)
        L_0x0120:
            if (r15 == 0) goto L_0x0132
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r2 = r14.this$0
            r14.L$0 = r2
            r14.I$0 = r6
            r0 = 2
            r14.label = r0
            java.lang.Object r0 = r1.B2K(r15, r14)
            if (r0 != r7) goto L_0x0166
            return r7
        L_0x0132:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.2qu r2 = r0.A02
            java.lang.String r0 = "sticker_search_initialized"
            r2.A01(r6, r0)
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            java.lang.String[] r2 = r14.$keywords
            X.1eh r8 = r0.A03     // Catch:{ all -> 0x001d }
            int r0 = r2.length     // Catch:{ all -> 0x001d }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r0)     // Catch:{ all -> 0x001d }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x001d }
            r14.L$0 = r1     // Catch:{ all -> 0x001d }
            r14.I$0 = r6     // Catch:{ all -> 0x001d }
            r14.label = r4     // Catch:{ all -> 0x001d }
            X.3gB r2 = r8.A00     // Catch:{ all -> 0x001d }
            com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2 r0 = new com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2     // Catch:{ all -> 0x001d }
            r0.<init>(r8, r13, r3)     // Catch:{ all -> 0x001d }
            java.lang.Object r15 = X.C616131n.A00(r14, r2, r0)     // Catch:{ all -> 0x001d }
            if (r15 != r7) goto L_0x001a
            goto L_0x0176
        L_0x015d:
            int r6 = r14.I$0
            java.lang.Object r2 = r14.L$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r2 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r2
            X.C57682u2.A01(r15)
        L_0x0166:
            X.2r2 r1 = r2.A01
            java.lang.String r0 = "search not initialized"
            r1.A02(r4, r5, r0)
            X.2qu r1 = r2.A02
            X.21o r0 = X.C372621o.FAIL
            r1.A02(r0, r6)
            goto L_0x01b0
        L_0x0176:
            return r7
        L_0x0177:
            X.1ld r6 = new X.1ld
            r6.<init>(r2, r3)
            r14.L$0 = r0
            r14.L$1 = r3
            r2 = 4
            r14.label = r2
            java.lang.Object r1 = r1.B2K(r6, r14)
            if (r1 != r7) goto L_0x0195
            return r7
        L_0x018a:
            java.lang.Object r3 = r14.L$1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r0 = r14.L$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r0
            X.C57682u2.A01(r15)
        L_0x0195:
            X.2r2 r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "search failed ("
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            java.lang.String r0 = X.C18260x0.A07(r0, r1)
            r2.A02(r4, r5, r0)
            goto L_0x01b0
        L_0x01ad:
            X.C57682u2.A01(r15)
        L_0x01b0:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersByKeywords$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        AvatarOnDemandStickers$observeStickersByKeywords$1 avatarOnDemandStickers$observeStickersByKeywords$1 = new AvatarOnDemandStickers$observeStickersByKeywords$1(this.$searchType, this.this$0, r8, this.$fetchStickersSignal, this.$keywords);
        avatarOnDemandStickers$observeStickersByKeywords$1.L$0 = obj;
        return avatarOnDemandStickers$observeStickersByKeywords$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
