package com.whatsapp.messaging.xmpp;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2AC;
import X.AnonymousClass4GR;
import X.C01400Ao;
import X.C01410Ap;
import X.C373321v;
import X.C57682u2;
import X.C58422vE;
import X.C59022wD;
import X.C616231o;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLogoutWorker$doWork$2", f = "XmppLogoutWorker.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class XmppLogoutWorker$doWork$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ XmppLogoutWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLogoutWorker$doWork$2(XmppLogoutWorker xmppLogoutWorker, C84814Du r3) {
        super(r3, 2);
        this.this$0 = xmppLogoutWorker;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            long A00 = AnonymousClass2AC.A00(C373321v.SECONDS, this.this$0.A00.A0O(C58422vE.A02, 3532));
            this.label = 1;
            if (C616231o.A01(this, A00) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        if (this.this$0.A01.A00("XmppLifecycleLogoutWorker")) {
            return new C01410Ap();
        }
        return new C01400Ao();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new XmppLogoutWorker$doWork$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new XmppLogoutWorker$doWork$2(this.this$0, (C84814Du) obj2));
    }
}
