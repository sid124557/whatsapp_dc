package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4C8;
import X.AnonymousClass4GR;
import X.AnonymousClass6AY;
import X.C154567dN;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C86634Kw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment$observeExpressionsSideEffects$1", f = "EmojiExpressionsFragment.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsFragment$observeExpressionsSideEffects$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ EmojiExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsFragment$observeExpressionsSideEffects$1(EmojiExpressionsFragment emojiExpressionsFragment, C84814Du r3) {
        super(r3, 2);
        this.this$0 = emojiExpressionsFragment;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C8 A02 = C75003pT.A02(this.this$0, C154567dN.A01(C86634Kw.A0i(this.this$0).A01));
            AnonymousClass6AY r0 = new AnonymousClass6AY(this.this$0, 0);
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
        return new EmojiExpressionsFragment$observeExpressionsSideEffects$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new EmojiExpressionsFragment$observeExpressionsSideEffects$1(this.this$0, (C84814Du) obj2));
    }
}
