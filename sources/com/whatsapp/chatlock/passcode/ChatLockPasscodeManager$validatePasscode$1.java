package com.whatsapp.chatlock.passcode;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C105095To;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$validatePasscode$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $attempt;
    public final /* synthetic */ AnonymousClass4GQ $callback;
    public Object L$0;
    public int label;
    public final /* synthetic */ C105095To this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$validatePasscode$1(C105095To r2, String str, C84814Du r4, AnonymousClass4GQ r5) {
        super(r4, 2);
        this.$callback = r5;
        this.this$0 = r2;
        this.$attempt = str;
    }

    public final Object A09(Object obj) {
        AnonymousClass4GQ r5;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r5 = this.$callback;
            C105095To r4 = this.this$0;
            String str = this.$attempt;
            this.L$0 = r5;
            this.label = 1;
            obj = C616131n.A00(this, r4.A05, new ChatLockPasscodeManager$validatePasscode$3(r4, str, (C84814Du) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            r5 = (AnonymousClass4GQ) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        r5.invoke(obj);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new ChatLockPasscodeManager$validatePasscode$1(this.this$0, this.$attempt, r6, this.$callback);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
