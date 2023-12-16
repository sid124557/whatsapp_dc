package com.whatsapp.messaging.offline;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass3CL;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.offline.DelayedStanzasFetcher$onAppForegrounded$1", f = "DelayedStanzasFetcher.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
public final class DelayedStanzasFetcher$onAppForegrounded$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass3CL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DelayedStanzasFetcher$onAppForegrounded$1(AnonymousClass3CL r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.label = 1;
            if (((DelayedStanzasFetcher$StanzaFetcher) this.this$0.A00.getValue()).A00(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new DelayedStanzasFetcher$onAppForegrounded$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new DelayedStanzasFetcher$onAppForegrounded$1(this.this$0, (C84814Du) obj2));
    }
}
