package com.whatsapp.funstickers.logging;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass4GR;
import X.C25101Zy;
import X.C57682u2;
import X.C59022wD;
import X.C618332l;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logRetry$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logRetry$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C618332l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logRetry$2(C618332l r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C25101Zy r2 = new C25101Zy();
            C618332l r1 = this.this$0;
            r2.A04 = r1.A03;
            r2.A02 = r1.A01;
            r2.A05 = r1.A05;
            r2.A01 = AnonymousClass0x9.A0k(3);
            r2.A00 = AnonymousClass0x9.A0k(11);
            r1.A09.BhD(r2);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new FunStickersFetchLogger$logRetry$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new FunStickersFetchLogger$logRetry$2(this.this$0, (C84814Du) obj2));
    }
}
