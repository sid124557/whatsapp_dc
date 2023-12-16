package com.whatsapp.funstickers.logging;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C618332l;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logSearchStarted$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logSearchStarted$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C618332l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logSearchStarted$2(C618332l r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003b, code lost:
        if (X.AnonymousClass27B.A00(r3.A06, r1, r2) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x0056
            X.C57682u2.A01(r7)
            X.1Zy r2 = new X.1Zy
            r2.<init>()
            X.32l r1 = r6.this$0
            X.C618332l.A00(r2, r1)
            r0 = 4
            java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r0)
            r2.A01 = r0
            X.4FV r0 = r1.A09
            r0.BhD(r2)
            X.32l r5 = r6.this$0
            X.1Zf r4 = new X.1Zf
            r4.<init>()
            X.32l r3 = r6.this$0
            java.lang.Long r0 = r3.A02
            r4.A05 = r0
            X.30P r0 = r3.A07
            X.2iy r2 = X.AnonymousClass2B5.A00
            X.2yH r1 = r0.A01(r2)
            if (r1 == 0) goto L_0x003d
            X.2sH r0 = r3.A06
            boolean r1 = X.AnonymousClass27B.A00(r0, r1, r2)
            r0 = 0
            if (r1 == 0) goto L_0x003e
        L_0x003d:
            r0 = 1
        L_0x003e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
            r5.A00 = r4
            X.32l r3 = r6.this$0
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r3.A04 = r0
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.funstickers.logging.FunStickersFetchLogger$logSearchStarted$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new FunStickersFetchLogger$logSearchStarted$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new FunStickersFetchLogger$logSearchStarted$2(this.this$0, (C84814Du) obj2));
    }
}
