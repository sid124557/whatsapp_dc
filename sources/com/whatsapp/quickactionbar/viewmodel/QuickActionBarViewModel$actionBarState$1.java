package com.whatsapp.quickactionbar.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.quickactionbar.viewmodel.QuickActionBarViewModel$actionBarState$1", f = "QuickActionBarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class QuickActionBarViewModel$actionBarState$1 extends C75003pT implements AnonymousClass4GR {
    public int label;

    public QuickActionBarViewModel$actionBarState$1(C84814Du r2) {
        super(r2, 2);
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r3) {
        return new QuickActionBarViewModel$actionBarState$1(r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new QuickActionBarViewModel$actionBarState$1((C84814Du) obj2));
    }
}
