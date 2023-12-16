package com.whatsapp.chatlock.passcode;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass5WP;
import X.C103435My;
import X.C105095To;
import X.C130666cL;
import X.C162457s7;
import X.C18270x1;
import X.C18320x8;
import X.C57682u2;
import X.C59022wD;
import X.C627536m;
import X.C75003pT;
import X.C84814Du;
import X.C91614kZ;
import X.C91634kb;
import com.whatsapp.util.Log;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$3", f = "ChatLockPasscodeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$setPasscode$3 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $passcode;
    public int label;
    public final /* synthetic */ C105095To this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$setPasscode$3(C105095To r2, String str, C84814Du r4) {
        super(r4, 2);
        this.$passcode = str;
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            try {
                AnonymousClass5WP r4 = AnonymousClass5WP.A00;
                String str = this.$passcode;
                C105095To r0 = this.this$0;
                C130666cL A00 = r4.A00(r0.A00, r0.A01, str, C18320x8.A0r(), 64);
                C103435My r1 = this.this$0.A03;
                C162457s7.A0J(A00, 0);
                try {
                    C627536m.A0A(A00, r1.A00());
                    r1.A00 = A00;
                    C18270x1.A0l(C18270x1.A03(this.this$0.A02.A00), "does_user_have_passcode", true);
                    return C91634kb.A00;
                } catch (IOException e) {
                    Log.e(AnonymousClass000.A0a("ChatLockUserPasscodeStorage/setStoredPasscode: ", AnonymousClass001.A0o(), e), e.getCause());
                    return new C91614kZ(2);
                }
            } catch (Exception e2) {
                Log.e(AnonymousClass000.A0a("ChatLockPasscodeManager/setPasscode ", AnonymousClass001.A0o(), e2), e2.getCause());
                return new C91614kZ(2);
            }
        } else {
            throw AnonymousClass001.A0d();
        }
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ChatLockPasscodeManager$setPasscode$3(this.this$0, this.$passcode, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
