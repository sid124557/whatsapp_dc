package com.whatsapp.expressionstray.stickers.mediacomposer;

import X.AnonymousClass2O1;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.mediacomposer.ContentStickerProvider$observeContentStickers$1", f = "ContentStickerProvider.kt", i = {0, 1, 1, 1}, l = {27, 44}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "shapes", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1", "L$2"})
public final class ContentStickerProvider$observeContentStickers$1 extends C75003pT implements AnonymousClass4GR {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ AnonymousClass2O1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentStickerProvider$observeContentStickers$1(AnonymousClass2O1 r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r13) {
        /*
            r12 = this;
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r12.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 == r4) goto L_0x006f
            if (r0 != r5) goto L_0x0084
            int r10 = r12.I$1
            int r9 = r12.I$0
            java.lang.Object r8 = r12.L$3
            X.2O1 r8 = (X.AnonymousClass2O1) r8
            java.lang.Object r7 = r12.L$2
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.lang.Object r3 = r12.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r12.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.C57682u2.A01(r13)
        L_0x0023:
            int r9 = r9 + 1
        L_0x0025:
            if (r9 >= r10) goto L_0x0081
            r11 = r7[r9]
            X.4Fe r11 = (X.C85164Fe) r11
            android.content.Context r1 = r8.A00
            X.33j r0 = r8.A01
            X.5Uw r1 = r11.B13(r1, r0, r4)
            X.2kB r0 = new X.2kB
            r0.<init>(r11, r1)
            r3.add(r0)
            X.1UK r0 = new X.1UK
            r0.<init>(r3)
            r12.L$0 = r2
            r12.L$1 = r3
            r12.L$2 = r7
            r12.L$3 = r8
            r12.I$0 = r9
            r12.I$1 = r10
            r12.label = r5
            java.lang.Object r0 = r2.B2K(r0, r12)
            if (r0 != r6) goto L_0x0023
            return r6
        L_0x0055:
            X.C57682u2.A01(r13)
            java.lang.Object r2 = r12.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.4Fe[] r0 = X.C58022ua.A00
            int r1 = r0.length
            X.1UL r0 = new X.1UL
            r0.<init>(r1)
            r12.L$0 = r2
            r12.label = r4
            java.lang.Object r0 = r2.B2K(r0, r12)
            if (r0 != r6) goto L_0x0076
            return r6
        L_0x006f:
            java.lang.Object r2 = r12.L$0
            X.4C9 r2 = (X.AnonymousClass4C9) r2
            X.C57682u2.A01(r13)
        L_0x0076:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.4Fe[] r7 = X.C58022ua.A00
            X.2O1 r8 = r12.this$0
            int r10 = r7.length
            r9 = 0
            goto L_0x0025
        L_0x0081:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.mediacomposer.ContentStickerProvider$observeContentStickers$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        ContentStickerProvider$observeContentStickers$1 contentStickerProvider$observeContentStickers$1 = new ContentStickerProvider$observeContentStickers$1(this.this$0, r4);
        contentStickerProvider$observeContentStickers$1.L$0 = obj;
        return contentStickerProvider$observeContentStickers$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
