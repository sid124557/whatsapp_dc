package com.whatsapp.expressionstray;

import X.AnonymousClass001;
import X.AnonymousClass1TH;
import X.AnonymousClass1TI;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onBackButtonClick$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {239, 241}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onBackButtonClick$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $isKeyboardShowing;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onBackButtonClick$1(ExpressionsSearchViewModel expressionsSearchViewModel, C84814Du r3, boolean z) {
        super(r3, 2);
        this.$isKeyboardShowing = z;
        this.this$0 = expressionsSearchViewModel;
    }

    public final Object A09(Object obj) {
        Object obj2;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            boolean z = this.$isKeyboardShowing;
            C85534Gq r1 = this.this$0.A0I;
            if (z) {
                obj2 = AnonymousClass1TI.A00;
                this.label = 1;
            } else {
                obj2 = AnonymousClass1TH.A00;
                this.label = 2;
            }
            if (r1.B2K(obj2, this) == r5) {
                return r5;
            }
        } else if (i == 1 || i == 2) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ExpressionsSearchViewModel$onBackButtonClick$1(this.this$0, r5, this.$isKeyboardShowing);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
