package com.whatsapp.registration.passkeys;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C009707r;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1", f = "PasskeyFacade.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C009707r $activity;
    public final /* synthetic */ AnonymousClass4GQ $callback;
    public int label;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1(C009707r r2, PasskeyFacade passkeyFacade, C84814Du r4, AnonymousClass4GQ r5) {
        super(r4, 2);
        this.this$0 = passkeyFacade;
        this.$activity = r2;
        this.$callback = r5;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            PasskeyFacade passkeyFacade = this.this$0;
            C009707r r0 = this.$activity;
            this.label = 1;
            obj = passkeyFacade.A00(r0, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.$callback.invoke(obj);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new PasskeyFacade$maybeCreatePasskeyWithoutEducationScreen$1(this.$activity, this.this$0, r6, this.$callback);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
