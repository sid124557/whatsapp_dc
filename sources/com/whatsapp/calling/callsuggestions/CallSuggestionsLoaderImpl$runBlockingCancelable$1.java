package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616331p;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$runBlockingCancelable$1", f = "CallSuggestionsLoaderImpl.kt", i = {}, l = {384}, m = "invokeSuspend", n = {}, s = {})
public final class CallSuggestionsLoaderImpl$runBlockingCancelable$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GR $block;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallSuggestionsLoaderImpl$runBlockingCancelable$1(C84814Du r2, AnonymousClass4GR r3) {
        super(r2, 2);
        this.$block = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4GR r2 = this.$block;
            this.label = 1;
            obj = C616331p.A00(this, r2, 5000);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CallSuggestionsLoaderImpl$runBlockingCancelable$1(r4, this.$block);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CallSuggestionsLoaderImpl$runBlockingCancelable$1((C84814Du) obj2, this.$block));
    }
}
