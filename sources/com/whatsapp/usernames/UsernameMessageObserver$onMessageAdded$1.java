package com.whatsapp.usernames;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C27981fH;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C65123Gh;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.UsernameMessageObserver$onMessageAdded$1", f = "UsernameMessageObserver.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameMessageObserver$onMessageAdded$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C27981fH $jid;
    public int label;
    public final /* synthetic */ C65123Gh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameMessageObserver$onMessageAdded$1(C27981fH r2, C65123Gh r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$jid = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C65123Gh r4 = this.this$0;
            C27981fH r3 = this.$jid;
            this.label = 1;
            if (C616131n.A00(this, r4.A02, new UsernameMessageObserver$markOwnPnShared$2(r3, r4, (C84814Du) null)) == r5 || C59022wD.A00 == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new UsernameMessageObserver$onMessageAdded$1(this.$jid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
