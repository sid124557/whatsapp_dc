package com.whatsapp.funstickers.logging;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C24911Zf;
import X.C57682u2;
import X.C59022wD;
import X.C618332l;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$assignServerDurations$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Long $llmDuration;
    public final /* synthetic */ Long $stickerGenDuration;
    public int label;
    public final /* synthetic */ C618332l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$assignServerDurations$2(C618332l r2, Long l, Long l2, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r2;
        this.$llmDuration = l;
        this.$stickerGenDuration = l2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C24911Zf r2 = this.this$0.A00;
            if (r2 == null) {
                return null;
            }
            Long l = this.$llmDuration;
            Long l2 = this.$stickerGenDuration;
            r2.A03 = l;
            r2.A04 = l2;
            return r2;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new FunStickersFetchLogger$assignServerDurations$2(this.this$0, this.$llmDuration, this.$stickerGenDuration, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
