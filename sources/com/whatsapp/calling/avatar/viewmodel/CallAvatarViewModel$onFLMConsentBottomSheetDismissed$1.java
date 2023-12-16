package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass34A;
import X.AnonymousClass4GR;
import X.AnonymousClass5AG;
import X.C118255tF;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import X.C91094iu;
import X.C91164j1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onFLMConsentBottomSheetDismissed$1", f = "CallAvatarViewModel.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$onFLMConsentBottomSheetDismissed$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass5AG $currentState;
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$onFLMConsentBottomSheetDismissed$1(CallAvatarViewModel callAvatarViewModel, AnonymousClass5AG r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = callAvatarViewModel;
        this.$currentState = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85474Gj r0 = this.this$0.A00;
            if (r0 != null) {
                this.label = 1;
                if (AnonymousClass34A.A00(this, r0) == r2) {
                    return r2;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        boolean A1Q = AnonymousClass0x9.A1Q(this.this$0.A06.A00);
        CallAvatarViewModel callAvatarViewModel = this.this$0;
        if (A1Q) {
            callAvatarViewModel.A0I(((C91094iu) this.$currentState).A00, false);
        } else {
            callAvatarViewModel.A08.A03(5);
            this.this$0.A0K.A0H(new C91164j1((C118255tF) null, false, true));
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CallAvatarViewModel$onFLMConsentBottomSheetDismissed$1(this.this$0, this.$currentState, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
