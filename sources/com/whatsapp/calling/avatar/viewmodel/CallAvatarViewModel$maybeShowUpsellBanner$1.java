package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C103425Mx;
import X.C18270x1;
import X.C57682u2;
import X.C59022wD;
import X.C616231o;
import X.C625635p;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$maybeShowUpsellBanner$1", f = "CallAvatarViewModel.kt", i = {}, l = {649}, m = "invokeSuspend", n = {}, s = {})
public final class CallAvatarViewModel$maybeShowUpsellBanner$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$maybeShowUpsellBanner$1(CallAvatarViewModel callAvatarViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = callAvatarViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.label = 1;
            if (C616231o.A00(this, C625635p.A0L) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        if (this.this$0.A0K()) {
            this.this$0.A0L.A0H((Object) null);
            CallAvatarViewModel callAvatarViewModel = this.this$0;
            C103425Mx r1 = callAvatarViewModel.A0C;
            C18270x1.A0i(C18270x1.A04(r1.A01), "pref_last_upsell_banner_shown_time", callAvatarViewModel.A0G.A0H());
        }
        this.this$0.A02 = null;
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CallAvatarViewModel$maybeShowUpsellBanner$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CallAvatarViewModel$maybeShowUpsellBanner$1(this.this$0, (C84814Du) obj2));
    }
}
