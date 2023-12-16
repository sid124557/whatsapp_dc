package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass4r0;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85504Gn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onEmojiLongTapped$1", f = "EmojiExpressionsViewModel.kt", i = {}, l = {322}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsViewModel$onEmojiLongTapped$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int[] $emoji;
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$onEmojiLongTapped$1(EmojiExpressionsViewModel emojiExpressionsViewModel, C84814Du r3, int[] iArr, int i) {
        super(r3, 2);
        this.this$0 = emojiExpressionsViewModel;
        this.$emoji = iArr;
        this.$position = i;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85504Gn r3 = this.this$0.A01;
            AnonymousClass4r0 r0 = new AnonymousClass4r0(this.$emoji, this.$position);
            this.label = 1;
            if (r3.BlD(r0, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new EmojiExpressionsViewModel$onEmojiLongTapped$1(this.this$0, r6, this.$emoji, this.$position);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
