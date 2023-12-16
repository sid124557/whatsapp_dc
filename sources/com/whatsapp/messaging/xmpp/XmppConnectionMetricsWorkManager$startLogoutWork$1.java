package com.whatsapp.messaging.xmpp;

import X.AnonymousClass001;
import X.AnonymousClass0GD;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C04610Pv;
import X.C06310Xb;
import X.C162457s7;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager$startLogoutWork$1", f = "XmppConnectionMetricsWorkManager.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
public final class XmppConnectionMetricsWorkManager$startLogoutWork$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ XmppConnectionMetricsWorkManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppConnectionMetricsWorkManager$startLogoutWork$1(XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager, C84814Du r3) {
        super(r3, 2);
        this.this$0 = xmppConnectionMetricsWorkManager;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager = this.this$0;
            Object obj2 = xmppConnectionMetricsWorkManager.A02.get();
            C162457s7.A0D(obj2);
            this.label = 1;
            obj = xmppConnectionMetricsWorkManager.A00((C06310Xb) obj2, "xmpp-lifecycle-worker", this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        C04610Pv r6 = (C04610Pv) obj;
        if (r6 != null) {
            XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager2 = this.this$0;
            AnonymousClass0GD r1 = r6.A03;
            if (r1 != AnonymousClass0GD.RUNNING && r1.A00()) {
                xmppConnectionMetricsWorkManager2.A02();
            }
        }
        this.this$0.A06 = null;
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new XmppConnectionMetricsWorkManager$startLogoutWork$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new XmppConnectionMetricsWorkManager$startLogoutWork$1(this.this$0, (C84814Du) obj2));
    }
}
