package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass34A;
import X.AnonymousClass4GR;
import X.C118255tF;
import X.C18260x0;
import X.C57682u2;
import X.C59022wD;
import X.C626936e;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import X.C90964ig;
import X.C91144iz;
import X.C91164j1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onSwitchToVideoTapped$1", f = "CallAvatarViewModel.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$onSwitchToVideoTapped$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$onSwitchToVideoTapped$1(CallAvatarViewModel callAvatarViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = callAvatarViewModel;
    }

    public final Object A09(Object obj) {
        String str;
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/CallAvatarViewModel/onSwitchToVideoTapped Job is ");
            C85474Gj r0 = this.this$0.A01;
            if (r0 == null || !r0.BGz()) {
                str = "inactive";
            } else {
                str = "active";
            }
            C18260x0.A1J(A0o, str);
            C85474Gj r02 = this.this$0.A01;
            if (r02 != null) {
                this.label = 1;
                if (AnonymousClass34A.A00(this, r02) == r3) {
                    return r3;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.this$0.A08.A02(1);
        if (this.this$0.A0K.A07() instanceof C91144iz) {
            try {
                if (this.this$0.A09.A00.disableAREffect()) {
                    this.this$0.A0K.A0H(new C91164j1((C118255tF) null, false, false));
                } else {
                    throw C90964ig.A00;
                }
            } catch (C118255tF e) {
                this.this$0.A0K.A0H(new C91164j1(e, false, false));
            }
        }
        C626936e.A0D(this.this$0.A0K.A07() instanceof C91164j1, "Avatar view state is expected to be Disabled");
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CallAvatarViewModel$onSwitchToVideoTapped$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CallAvatarViewModel$onSwitchToVideoTapped$1(this.this$0, (C84814Du) obj2));
    }
}
