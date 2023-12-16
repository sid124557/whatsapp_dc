package com.whatsapp.funstickers.logging;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass4GR;
import X.C24911Zf;
import X.C25101Zy;
import X.C57682u2;
import X.C59022wD;
import X.C618332l;
import X.C75003pT;
import X.C84814Du;
import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logMetadataReturned$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ long $numberOfOptions;
    public int label;
    public final /* synthetic */ C618332l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logMetadataReturned$2(C618332l r2, C84814Du r3, long j) {
        super(r3, 2);
        this.this$0 = r2;
        this.$numberOfOptions = j;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C25101Zy r4 = new C25101Zy();
            C618332l r3 = this.this$0;
            C618332l.A00(r4, r3);
            r4.A01 = AnonymousClass0x9.A0k(5);
            r4.A03 = new Long(this.$numberOfOptions);
            r3.A09.BhD(r4);
            C618332l r42 = this.this$0;
            Long l = r42.A04;
            if (l != null) {
                long longValue = l.longValue();
                C24911Zf r32 = r42.A00;
                if (r32 != null) {
                    r32.A02 = new Long(AnonymousClass0x7.A0E(longValue));
                }
            }
            r42.A04 = new Long(SystemClock.elapsedRealtime());
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new FunStickersFetchLogger$logMetadataReturned$2(this.this$0, r6, this.$numberOfOptions);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
