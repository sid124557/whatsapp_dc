package com.whatsapp.chatlock.search;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass5KU;
import X.C06270Wx;
import X.C105095To;
import X.C162457s7;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import X.C91634kb;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$3;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.search.ChatLockContactSearchManager$setSearchSource$2$1", f = "ChatLockContactSearchManager.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockContactSearchManager$setSearchSource$2$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $searchString;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass5KU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockContactSearchManager$setSearchSource$2$1(AnonymousClass5KU r2, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$searchString = str;
    }

    public final Object A09(Object obj) {
        C06270Wx r5;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass5KU r0 = this.this$0;
            r5 = r0.A02;
            C105095To r4 = r0.A04;
            String str = this.$searchString;
            C162457s7.A0C(str);
            this.L$0 = r5;
            this.label = 1;
            obj = C616131n.A00(this, r4.A05, new ChatLockPasscodeManager$validatePasscode$3(r4, str, (C84814Du) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            r5 = (C06270Wx) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        C06270Wx.A05(r5, C162457s7.A0P(obj, C91634kb.A00));
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ChatLockContactSearchManager$setSearchSource$2$1(this.this$0, this.$searchString, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
