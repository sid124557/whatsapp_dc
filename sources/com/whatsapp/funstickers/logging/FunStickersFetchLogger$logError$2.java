package com.whatsapp.funstickers.logging;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass4GR;
import X.C24911Zf;
import X.C25101Zy;
import X.C57682u2;
import X.C58422vE;
import X.C59022wD;
import X.C618332l;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logError$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logError$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Integer $errorCode;
    public final /* synthetic */ int $errorType;
    public int label;
    public final /* synthetic */ C618332l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logError$2(C618332l r2, Integer num, C84814Du r4, int i) {
        super(r4, 2);
        this.this$0 = r2;
        this.$errorType = i;
        this.$errorCode = num;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C25101Zy r3 = new C25101Zy();
            C618332l r1 = this.this$0;
            C618332l.A00(r3, r1);
            r3.A01 = AnonymousClass0x9.A0k(3);
            r3.A00 = AnonymousClass0x9.A0k(this.$errorType);
            if (this.$errorCode != null && r1.A08.A0Y(C58422vE.A02, 5325)) {
                r3.A06 = this.$errorCode.toString();
            }
            this.this$0.A09.BhD(r3);
            C618332l r4 = this.this$0;
            Long l = r4.A04;
            if (l != null) {
                long longValue = l.longValue();
                C24911Zf r32 = r4.A00;
                if (r32 != null) {
                    r32.A02 = new Long(AnonymousClass0x7.A0E(longValue));
                }
            }
            if (r4.A08.A0Y(C58422vE.A02, 5325)) {
                C24911Zf r12 = r4.A00;
                if (r12 != null) {
                    r4.A09.BhD(r12);
                }
                r4.A04 = null;
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new FunStickersFetchLogger$logError$2(this.this$0, this.$errorCode, r6, this.$errorType);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
