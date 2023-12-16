package com.whatsapp.updates.ui;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass0IQ;
import X.AnonymousClass0O9;
import X.AnonymousClass218;
import X.AnonymousClass4C8;
import X.AnonymousClass4GR;
import X.AnonymousClass6AY;
import X.C162457s7;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.ui.UpdatesFragment$observeSideEffects$1", f = "UpdatesFragment.kt", i = {}, l = {596}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesFragment$observeSideEffects$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesFragment$observeSideEffects$1(UpdatesFragment updatesFragment, C84814Du r3) {
        super(r3, 2);
        this.this$0 = updatesFragment;
    }

    public final Object A09(Object obj) {
        AnonymousClass4C8 r2;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            UpdatesFragment updatesFragment = this.this$0;
            UpdatesViewModel updatesViewModel = updatesFragment.A0q;
            if (!(updatesViewModel == null || (r2 = updatesViewModel.A0u) == null)) {
                AnonymousClass0O9 lifecycle = updatesFragment.A0V().getLifecycle();
                C162457s7.A0D(lifecycle);
                AnonymousClass4C8 A00 = AnonymousClass0IQ.A00(AnonymousClass0GC.RESUMED, lifecycle, r2);
                AnonymousClass6AY r0 = new AnonymousClass6AY(this.this$0, 2);
                this.label = 1;
                if (A00.Az8(this, r0) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new UpdatesFragment$observeSideEffects$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new UpdatesFragment$observeSideEffects$1(this.this$0, (C84814Du) obj2));
    }
}
