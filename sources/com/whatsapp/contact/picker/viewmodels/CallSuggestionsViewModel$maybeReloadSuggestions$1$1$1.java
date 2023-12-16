package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C614130p;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1", f = "CallSuggestionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ CallSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1(CallSuggestionsViewModel callSuggestionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = callSuggestionsViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            return ((C614130p) this.this$0.A07.getValue()).A01(this.this$0.A01);
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1(this.this$0, (C84814Du) obj2));
    }
}
