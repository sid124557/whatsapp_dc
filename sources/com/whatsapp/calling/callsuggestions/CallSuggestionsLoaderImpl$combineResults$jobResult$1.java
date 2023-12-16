package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85464Gi;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$combineResults$jobResult$1", f = "CallSuggestionsLoaderImpl.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
public final class CallSuggestionsLoaderImpl$combineResults$jobResult$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C85464Gi $job;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallSuggestionsLoaderImpl$combineResults$jobResult$1(C84814Du r2, C85464Gi r3) {
        super(r2, 2);
        this.$job = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85464Gi r0 = this.$job;
            this.label = 1;
            obj = r0.Axa(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CallSuggestionsLoaderImpl$combineResults$jobResult$1(r4, this.$job);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CallSuggestionsLoaderImpl$combineResults$jobResult$1((C84814Du) obj2, this.$job));
    }
}
