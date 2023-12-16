package com.whatsapp.usernames.observers;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C64133Cf;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.observers.UsernameChangeSystemMessageObserver$onUsernameChanged$1", f = "UsernameChangeSystemMessageObserver.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameChangeSystemMessageObserver$onUsernameChanged$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $newUsername;
    public final /* synthetic */ String $oldUsername;
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ C64133Cf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameChangeSystemMessageObserver$onUsernameChanged$1(UserJid userJid, C64133Cf r3, String str, String str2, C84814Du r6) {
        super(r6, 2);
        this.this$0 = r3;
        this.$userJid = userJid;
        this.$oldUsername = str;
        this.$newUsername = str2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C64133Cf r5 = this.this$0;
            UserJid userJid = this.$userJid;
            String str = this.$oldUsername;
            String str2 = this.$newUsername;
            this.label = 1;
            if (C616131n.A00(this, r5.A07, new UsernameChangeSystemMessageObserver$insertUsernameChangeSystemMessage$2(userJid, r5, str, str2, (C84814Du) null)) == r2 || C59022wD.A00 == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new UsernameChangeSystemMessageObserver$onUsernameChanged$1(this.$userJid, this.this$0, this.$oldUsername, this.$newUsername, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
