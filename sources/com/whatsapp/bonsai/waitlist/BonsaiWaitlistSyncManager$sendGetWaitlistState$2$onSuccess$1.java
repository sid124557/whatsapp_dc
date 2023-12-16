package com.whatsapp.bonsai.waitlist;

import X.AnonymousClass001;
import X.AnonymousClass4CU;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bonsai.waitlist.BonsaiWaitlistSyncManager$sendGetWaitlistState$2$onSuccess$1", f = "BonsaiWaitlistSyncManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BonsaiWaitlistSyncManager$sendGetWaitlistState$2$onSuccess$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4CU $callback;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiWaitlistSyncManager$sendGetWaitlistState$2$onSuccess$1(AnonymousClass4CU r2, C84814Du r3) {
        super(r3, 2);
        this.$callback = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            this.$callback.onSuccess();
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new BonsaiWaitlistSyncManager$sendGetWaitlistState$2$onSuccess$1(this.$callback, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new BonsaiWaitlistSyncManager$sendGetWaitlistState$2$onSuccess$1(this.$callback, (C84814Du) obj2));
    }
}
