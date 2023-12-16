package com.whatsapp.usernames.observers;

import X.AnonymousClass001;
import X.AnonymousClass31A;
import X.AnonymousClass35J;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C30341mI;
import X.C31181ns;
import X.C57682u2;
import X.C59022wD;
import X.C64133Cf;
import X.C66543Lv;
import X.C75003pT;
import X.C84814Du;
import X.C95814uZ;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.observers.UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2", f = "UsernameChangeSystemMessageObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $newUsername;
    public final /* synthetic */ String $oldUsername;
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ C64133Cf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2(UserJid userJid, C64133Cf r3, String str, String str2, C84814Du r6) {
        super(r6, 2);
        this.this$0 = r3;
        this.$userJid = userJid;
        this.$oldUsername = str;
        this.$newUsername = str2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass31A A0A = this.this$0.A01.A0A(this.$userJid, true);
            if (A0A != null) {
                C64133Cf r0 = this.this$0;
                C95814uZ A05 = A0A.A05();
                C162457s7.A0D(A05);
                String str = this.$oldUsername;
                String str2 = this.$newUsername;
                C30341mI A00 = r0.A05.A00(AnonymousClass35J.A01(A05, r0.A04), 165, System.currentTimeMillis());
                C162457s7.A0K(A00, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageSystemUsernameChange");
                C31181ns r1 = (C31181ns) A00;
                C162457s7.A0J(str, 0);
                r1.A01 = str;
                C162457s7.A0J(str2, 0);
                r1.A00 = str2;
                ((C66543Lv) this.this$0.A06.getValue()).A0V(r1);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2(this.$userJid, this.this$0, this.$oldUsername, this.$newUsername, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
