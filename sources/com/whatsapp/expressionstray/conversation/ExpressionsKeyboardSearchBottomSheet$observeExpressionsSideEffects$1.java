package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4C8;
import X.AnonymousClass4GR;
import X.C18320x8;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C86054Iq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet$observeExpressionsSideEffects$1", f = "ExpressionsKeyboardSearchBottomSheet.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardSearchBottomSheet$observeExpressionsSideEffects$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ ExpressionsKeyboardSearchBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardSearchBottomSheet$observeExpressionsSideEffects$1(ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet, C84814Du r3) {
        super(r3, 2);
        this.this$0 = expressionsKeyboardSearchBottomSheet;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C8 A02 = C75003pT.A02(this.this$0, C18320x8.A0L(this.this$0).A0I);
            C86054Iq r0 = new C86054Iq(this.this$0, 19);
            this.label = 1;
            if (A02.Az8(this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ExpressionsKeyboardSearchBottomSheet$observeExpressionsSideEffects$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ExpressionsKeyboardSearchBottomSheet$observeExpressionsSideEffects$1(this.this$0, (C84814Du) obj2));
    }
}
