package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass594;
import X.AnonymousClass59B;
import X.AnonymousClass5ZG;
import X.C103425Mx;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C91094iu;
import X.C91134iy;
import X.C95194sm;
import com.whatsapp.calling.avatar.CallAvatarFLMConsentManager;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onSwitchToAvatarTapped$1", f = "CallAvatarViewModel.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$onSwitchToAvatarTapped$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $productSessionId;
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$onSwitchToAvatarTapped$1(CallAvatarViewModel callAvatarViewModel, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = callAvatarViewModel;
        this.$productSessionId = str;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            CallAvatarViewModel callAvatarViewModel = this.this$0;
            C103425Mx r1 = callAvatarViewModel.A0C;
            C18270x1.A0i(C18270x1.A04(r1.A01), "pref_last_avatar_calling_use_time", callAvatarViewModel.A0G.A0H());
            this.this$0.A0K.A0H(C91134iy.A00);
            CallAvatarFLMConsentManager callAvatarFLMConsentManager = this.this$0.A06;
            this.label = 1;
            if (callAvatarFLMConsentManager.A02(this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        if (this.this$0.A06.A00() == AnonymousClass59B.DISABLED || AnonymousClass0x9.A1Q(this.this$0.A06.A00)) {
            this.this$0.A0I(this.$productSessionId, false);
        } else {
            AnonymousClass5ZG r2 = this.this$0.A08;
            synchronized (r2) {
                C95194sm r12 = r2.A01;
                if (r12 == null) {
                    Log.d("CallAvatarLogger/onConsentRequested No session");
                } else if (!r2.A06(AnonymousClass594.METADATA_FETCHED_OR_CONSENT_REQUESTED, r12)) {
                    Log.d("CallAvatarLogger/onConsentRequested Session has unexpected fields");
                } else {
                    r12.A00 = Boolean.TRUE;
                }
            }
            this.this$0.A0K.A0H(new C91094iu(this.$productSessionId));
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CallAvatarViewModel$onSwitchToAvatarTapped$1(this.this$0, this.$productSessionId, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
