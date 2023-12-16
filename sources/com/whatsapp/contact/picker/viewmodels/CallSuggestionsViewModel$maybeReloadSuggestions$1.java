package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C18310x6;
import X.C56612sH;
import X.C57682u2;
import X.C59022wD;
import X.C616331p;
import X.C69903Yy;
import X.C75003pT;
import X.C84814Du;
import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel$maybeReloadSuggestions$1", f = "CallSuggestionsViewModel.kt", i = {0, 0, 0}, l = {88}, m = "invokeSuspend", n = {"suggestions", "$this$measureTimeUsingUptimeMillis$iv", "start$iv"}, s = {"L$0", "L$1", "J$0"})
public final class CallSuggestionsViewModel$maybeReloadSuggestions$1 extends C75003pT implements AnonymousClass4GR {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ CallSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallSuggestionsViewModel$maybeReloadSuggestions$1(CallSuggestionsViewModel callSuggestionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = callSuggestionsViewModel;
    }

    public final Object A09(Object obj) {
        C69903Yy r5;
        CallSuggestionsViewModel callSuggestionsViewModel;
        long uptimeMillis;
        C69903Yy r2;
        AnonymousClass218 r8 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r5 = new C69903Yy();
            callSuggestionsViewModel = this.this$0;
            C56612sH r1 = callSuggestionsViewModel.A06;
            uptimeMillis = SystemClock.uptimeMillis();
            CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1 callSuggestionsViewModel$maybeReloadSuggestions$1$1$1 = new CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1(callSuggestionsViewModel, (C84814Du) null);
            this.L$0 = r5;
            this.L$1 = r1;
            this.L$2 = r5;
            this.L$3 = callSuggestionsViewModel;
            this.J$0 = uptimeMillis;
            this.label = 1;
            obj = C616331p.A00(this, callSuggestionsViewModel$maybeReloadSuggestions$1$1$1, 5000);
            if (obj == r8) {
                return r8;
            }
            r2 = r5;
        } else if (i == 1) {
            uptimeMillis = this.J$0;
            callSuggestionsViewModel = (CallSuggestionsViewModel) this.L$3;
            r5 = (C69903Yy) this.L$2;
            r2 = (C69903Yy) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        r5.element = obj;
        callSuggestionsViewModel.A00 = C18310x6.A0A(uptimeMillis);
        Object obj2 = r2.element;
        if (obj2 != null) {
            this.this$0.A03.A0G(obj2);
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CallSuggestionsViewModel$maybeReloadSuggestions$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CallSuggestionsViewModel$maybeReloadSuggestions$1(this.this$0, (C84814Du) obj2));
    }
}
