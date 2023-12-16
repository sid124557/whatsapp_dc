package com.whatsapp.bonsai;

import X.AnonymousClass001;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bonsai.BonsaiPrewarmer$getDefaultBotForInvoke$1$1", f = "BonsaiPrewarmer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BonsaiPrewarmer$getDefaultBotForInvoke$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass3ZH $bot;
    public final /* synthetic */ AnonymousClass4GQ $callback;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiPrewarmer$getDefaultBotForInvoke$1$1(AnonymousClass3ZH r2, C84814Du r3, AnonymousClass4GQ r4) {
        super(r3, 2);
        this.$callback = r4;
        this.$bot = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            this.$callback.invoke(this.$bot);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new BonsaiPrewarmer$getDefaultBotForInvoke$1$1(this.$bot, r5, this.$callback);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
