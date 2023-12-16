package com.whatsapp.chatlock.passcode;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C103435My;
import X.C105095To;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C627536m;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.util.Log;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$clearPasscode$1$result$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$clearPasscode$1$result$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C105095To this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$clearPasscode$1$result$1(C105095To r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        boolean z;
        if (this.label == 0) {
            C57682u2.A01(obj);
            try {
                C103435My r1 = this.this$0.A03;
                try {
                    z = C627536m.A0O(r1.A00());
                    if (z) {
                        r1.A00 = null;
                    }
                } catch (IOException e) {
                    Log.e(AnonymousClass000.A0a("ChatLockUserPasscodeStorage/unsetStoredPasscode: ", AnonymousClass001.A0o(), e), e.getCause());
                    z = false;
                }
                if (z) {
                    C18270x1.A0l(C18270x1.A03(this.this$0.A02.A00), "does_user_have_passcode", false);
                }
                return Boolean.valueOf(AnonymousClass000.A1S(z ? 1 : 0));
            } catch (Exception e2) {
                Log.e(AnonymousClass000.A0a("ChatLockPasscodeManager/clearPasscode: ", AnonymousClass001.A0o(), e2), e2.getCause());
                return false;
            }
        } else {
            throw AnonymousClass001.A0d();
        }
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ChatLockPasscodeManager$clearPasscode$1$result$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ChatLockPasscodeManager$clearPasscode$1$result$1(this.this$0, (C84814Du) obj2));
    }
}
