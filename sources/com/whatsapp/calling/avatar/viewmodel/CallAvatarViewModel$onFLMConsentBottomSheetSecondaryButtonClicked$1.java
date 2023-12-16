package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GP;
import X.AnonymousClass4GR;
import X.C118255tF;
import X.C18320x8;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.calling.avatar.CallAvatarFLMConsentManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onFLMConsentBottomSheetSecondaryButtonClicked$1", f = "CallAvatarViewModel.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$onFLMConsentBottomSheetSecondaryButtonClicked$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GP $onFailure;
    public final /* synthetic */ AnonymousClass4GP $onSuccess;
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$onFLMConsentBottomSheetSecondaryButtonClicked$1(CallAvatarViewModel callAvatarViewModel, C84814Du r3, AnonymousClass4GP r4, AnonymousClass4GP r5) {
        super(r3, 2);
        this.this$0 = callAvatarViewModel;
        this.$onSuccess = r4;
        this.$onFailure = r5;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            try {
                CallAvatarFLMConsentManager callAvatarFLMConsentManager = this.this$0.A06;
                Boolean A0U = C18320x8.A0U();
                this.label = 1;
                if (callAvatarFLMConsentManager.A01(A0U, this) == r3) {
                    return r3;
                }
            } catch (C118255tF unused) {
                this.$onFailure.invoke();
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.$onSuccess.invoke();
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new CallAvatarViewModel$onFLMConsentBottomSheetSecondaryButtonClicked$1(this.this$0, r6, this.$onSuccess, this.$onFailure);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
