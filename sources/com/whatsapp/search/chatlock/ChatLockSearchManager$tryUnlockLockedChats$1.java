package com.whatsapp.search.chatlock;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass5I3;
import X.AnonymousClass5L5;
import X.C105095To;
import X.C162457s7;
import X.C56532s8;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C69903Yy;
import X.C75003pT;
import X.C84814Du;
import X.C91634kb;
import X.C97794zG;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$3;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.search.chatlock.ChatLockSearchManager$tryUnlockLockedChats$1", f = "ChatLockSearchManager.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockSearchManager$tryUnlockLockedChats$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass5I3 $cancellableInput;
    public final /* synthetic */ C56532s8 $query;
    public final /* synthetic */ C69903Yy $result;
    public int label;
    public final /* synthetic */ AnonymousClass5L5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockSearchManager$tryUnlockLockedChats$1(C56532s8 r2, AnonymousClass5L5 r3, AnonymousClass5I3 r4, C84814Du r5, C69903Yy r6) {
        super(r5, 2);
        this.this$0 = r3;
        this.$query = r2;
        this.$cancellableInput = r4;
        this.$result = r6;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C105095To r4 = (C105095To) this.this$0.A08.get();
            String A02 = this.$query.A02();
            C162457s7.A0D(A02);
            this.label = 1;
            obj = C616131n.A00(this, r4.A05, new ChatLockPasscodeManager$validatePasscode$3(r4, A02, (C84814Du) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        if (C162457s7.A0P(obj, C91634kb.A00)) {
            this.$cancellableInput.A00.A02();
            this.$result.element = new C97794zG(this.this$0.A09);
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new ChatLockSearchManager$tryUnlockLockedChats$1(this.$query, this.this$0, this.$cancellableInput, r8, this.$result);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
