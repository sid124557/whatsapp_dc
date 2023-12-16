package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass001;
import X.AnonymousClass2S1;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C42672Pb;
import X.C57682u2;
import X.C59022wD;
import X.C614130p;
import X.C75003pT;
import X.C837249n;
import X.C84814Du;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.CallSuggestionsLoaderImpl$fetchCallLogsJob$2$1", f = "CallSuggestionsLoaderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallSuggestionsLoaderImpl$fetchCallLogsJob$2$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C614130p this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallSuggestionsLoaderImpl$fetchCallLogsJob$2$1(C614130p r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            ArrayList A04 = this.this$0.A05.A04((C837249n) null, 0, 200);
            AnonymousClass2S1 r1 = this.this$0.A03;
            C162457s7.A0H(A04);
            return new C42672Pb(r1, A04);
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CallSuggestionsLoaderImpl$fetchCallLogsJob$2$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CallSuggestionsLoaderImpl$fetchCallLogsJob$2$1(this.this$0, (C84814Du) obj2));
    }
}
