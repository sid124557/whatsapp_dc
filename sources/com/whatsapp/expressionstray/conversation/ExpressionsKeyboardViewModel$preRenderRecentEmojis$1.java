package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass001;
import X.AnonymousClass2Q3;
import X.AnonymousClass4GR;
import X.C106655Zv;
import X.C149467Mo;
import X.C155677fI;
import X.C162457s7;
import X.C27821ej;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C94274qr;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.util.Log;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$preRenderRecentEmojis$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$preRenderRecentEmojis$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass2Q3 $emojiPrerenderCache;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$preRenderRecentEmojis$1(AnonymousClass2Q3 r2, C84814Du r3) {
        super(r3, 2);
        this.$emojiPrerenderCache = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass2Q3 r8 = this.$emojiPrerenderCache;
            if (r8 != null) {
                C27821ej r7 = r8.A01;
                if (r7.A01() > 0) {
                    int A01 = r7.A01();
                    for (int i = 0; i < A01; i++) {
                        int[] iArr = (int[]) r7.A02(i);
                        C162457s7.A0H(iArr);
                        C94274qr r4 = new C94274qr(iArr);
                        r8.A02.A05(r8.A00, r4, EmojiDescriptor.A00(r4, false));
                    }
                } else {
                    C149467Mo[] A00 = C155677fI.A00(r8.A03);
                    if (A00.length == 0) {
                        Log.e("EmojiPreloadCacheFactory/preRenderFirstEmojiPageDrawables/Empty emoji pages found, skipping pre-render");
                    } else {
                        List list = (List) A00[0].A03.get();
                        C162457s7.A0D(list);
                        int min = Math.min(list.size(), 50);
                        for (int i2 = 0; i2 < min; i2++) {
                            int[] iArr2 = ((C106655Zv) list.get(i2)).A00;
                            C162457s7.A0C(iArr2);
                            C94274qr r42 = new C94274qr(iArr2);
                            r8.A02.A05(r8.A00, r42, EmojiDescriptor.A00(r42, false));
                        }
                    }
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ExpressionsKeyboardViewModel$preRenderRecentEmojis$1(this.$emojiPrerenderCache, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ExpressionsKeyboardViewModel$preRenderRecentEmojis$1(this.$emojiPrerenderCache, (C84814Du) obj2));
    }
}
