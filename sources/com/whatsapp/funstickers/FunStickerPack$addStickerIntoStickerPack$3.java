package com.whatsapp.funstickers;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C29361ih;
import X.C50612iT;
import X.C54992pc;
import X.C56872sh;
import X.C57682u2;
import X.C59022wD;
import X.C61102zi;
import X.C75003pT;
import X.C84814Du;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.FunStickerPack$addStickerIntoStickerPack$3", f = "FunStickerPack.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickerPack$addStickerIntoStickerPack$3 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C50612iT $stickerPack;
    public int label;
    public final /* synthetic */ C54992pc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickerPack$addStickerIntoStickerPack$3(C54992pc r2, C50612iT r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$stickerPack = r3;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C29361ih r0 = this.this$0.A04;
            C50612iT r2 = this.$stickerPack;
            Iterator A03 = C61102zi.A03(r0);
            while (A03.hasNext()) {
                ((C56872sh) A03.next()).A08(r2);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new FunStickerPack$addStickerIntoStickerPack$3(this.this$0, this.$stickerPack, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
