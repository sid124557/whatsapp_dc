package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass001;
import X.AnonymousClass21M;
import X.AnonymousClass4GR;
import X.C51282jZ;
import X.C57682u2;
import X.C59022wD;
import X.C614130p;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$2", f = "CallSuggestionsLoaderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C614130p this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$2(C614130p r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            return new C51282jZ(AnonymousClass21M.ADHOC, C614130p.A00(this.this$0.A03()));
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CallSuggestionsLoaderImpl$getSuggestionsByFrequency$job$2(this.this$0, (C84814Du) obj2));
    }
}
