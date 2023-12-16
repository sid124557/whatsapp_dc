package com.whatsapp.chatlock.passcode;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C105095To;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$clearPasscode$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$clearPasscode$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GQ $isSuccessCallback;
    public int label;
    public final /* synthetic */ C105095To this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$clearPasscode$1(C105095To r2, C84814Du r3, AnonymousClass4GQ r4) {
        super(r3, 2);
        this.this$0 = r2;
        this.$isSuccessCallback = r4;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C105095To r3 = this.this$0;
            C73853gB r2 = r3.A05;
            ChatLockPasscodeManager$clearPasscode$1$result$1 chatLockPasscodeManager$clearPasscode$1$result$1 = new ChatLockPasscodeManager$clearPasscode$1$result$1(r3, (C84814Du) null);
            this.label = 1;
            obj = C616131n.A00(this, r2, chatLockPasscodeManager$clearPasscode$1$result$1);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.$isSuccessCallback.invoke(obj);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ChatLockPasscodeManager$clearPasscode$1(this.this$0, r5, this.$isSuccessCallback);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
