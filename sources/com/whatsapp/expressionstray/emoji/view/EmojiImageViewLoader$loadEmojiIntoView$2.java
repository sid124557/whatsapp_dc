package com.whatsapp.expressionstray.emoji.view;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass5OY;
import X.C104775Sh;
import X.C106655Zv;
import X.C107425bI;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C94274qr;
import X.C999858y;
import android.graphics.drawable.Drawable;
import com.whatsapp.emoji.EmojiDescriptor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader$loadEmojiIntoView$2", f = "EmojiImageViewLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiImageViewLoader$loadEmojiIntoView$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Drawable $icon;
    public final /* synthetic */ C104775Sh $task;
    public int label;
    public final /* synthetic */ AnonymousClass5OY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageViewLoader$loadEmojiIntoView$2(Drawable drawable, C104775Sh r3, AnonymousClass5OY r4, C84814Du r5) {
        super(r5, 2);
        this.$task = r3;
        this.$icon = drawable;
        this.this$0 = r4;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C104775Sh r1 = this.$task;
            EmojiImageView emojiImageView = (EmojiImageView) r1.A04.get();
            if (emojiImageView != null) {
                Drawable drawable = this.$icon;
                int[] A01 = r1.A01.A01();
                boolean z = false;
                if (A01 == null) {
                    emojiImageView.A04 = null;
                    emojiImageView.A02 = null;
                    emojiImageView.A03 = false;
                    emojiImageView.setContentDescription((CharSequence) null);
                } else {
                    EmojiDescriptor.A00(new C94274qr(A01), false);
                    emojiImageView.A04 = A01;
                    if (C107425bI.A03(A01) || C107425bI.A02(A01)) {
                        z = true;
                    }
                    emojiImageView.A03 = z;
                    emojiImageView.A02 = drawable;
                    emojiImageView.setContentDescription(C106655Zv.A01(A01));
                    emojiImageView.invalidate();
                }
                Integer num = this.$task.A03;
                if (num != null) {
                    this.this$0.A02.A00(num.intValue(), "emoji_image_loader_load_end", (String) null);
                    this.this$0.A02.A01(C999858y.SUCCESS, this.$task.A03.intValue());
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new EmojiImageViewLoader$loadEmojiIntoView$2(this.$icon, this.$task, this.this$0, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
