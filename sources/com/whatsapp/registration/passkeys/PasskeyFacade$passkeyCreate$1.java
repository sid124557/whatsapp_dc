package com.whatsapp.registration.passkeys;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GP;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C009707r;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyFacade$passkeyCreate$1", f = "PasskeyFacade.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyFacade$passkeyCreate$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C009707r $activity;
    public final /* synthetic */ AnonymousClass4GQ $onFinishRegisterResponse;
    public final /* synthetic */ AnonymousClass4GP $onStartRegisterResponse;
    public int label;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyFacade$passkeyCreate$1(C009707r r2, PasskeyFacade passkeyFacade, C84814Du r4, AnonymousClass4GP r5, AnonymousClass4GQ r6) {
        super(r4, 2);
        this.this$0 = passkeyFacade;
        this.$activity = r2;
        this.$onStartRegisterResponse = r5;
        this.$onFinishRegisterResponse = r6;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            PasskeyFacade passkeyFacade = this.this$0;
            C009707r r1 = this.$activity;
            AnonymousClass4GP r0 = this.$onStartRegisterResponse;
            this.label = 1;
            obj = passkeyFacade.A01(r1, this, r0);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.$onFinishRegisterResponse.invoke(obj);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new PasskeyFacade$passkeyCreate$1(this.$activity, this.this$0, r8, this.$onStartRegisterResponse, this.$onFinishRegisterResponse);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
