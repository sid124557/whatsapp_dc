package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onEmojiSelected$1", f = "EmojiExpressionsViewModel.kt", i = {}, l = {252, 266, 277, 291}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsViewModel$onEmojiSelected$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int[] $emoji;
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$onEmojiSelected$1(EmojiExpressionsViewModel emojiExpressionsViewModel, C84814Du r3, int[] iArr, int i) {
        super(r3, 2);
        this.$emoji = iArr;
        this.this$0 = emojiExpressionsViewModel;
        this.$position = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r7) goto L_0x0022
            if (r0 == r6) goto L_0x0022
            if (r0 == r5) goto L_0x0022
            if (r0 != r4) goto L_0x00e4
            X.C57682u2.A01(r9)
        L_0x0015:
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            r2 = 7
            X.2aq r1 = r0.A07
            X.1TZ r0 = X.AnonymousClass1TZ.A00
            r1.A00(r0, r0, r2)
        L_0x001f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0022:
            X.C57682u2.A01(r9)
            goto L_0x001f
        L_0x0026:
            X.C57682u2.A01(r9)
            int[] r0 = r8.$emoji
            boolean r0 = X.C107425bI.A02(r0)
            if (r0 == 0) goto L_0x005d
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.2y5 r1 = r0.A09
            int[] r2 = r8.$emoji
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r1.A03(r0)
            java.lang.String r0 = X.C107005aX.A00(r2)
            boolean r1 = r1.contains(r0)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            if (r1 != 0) goto L_0x00be
            X.4Gn r4 = r0.A01
            int[] r1 = r8.$emoji
            int r0 = r8.$position
            X.4r0 r2 = new X.4r0
            r2.<init>(r1, r0)
            r8.label = r7
        L_0x0056:
            java.lang.Object r0 = r4.BlD(r2, r8)
            if (r0 != r3) goto L_0x001f
            return r3
        L_0x005d:
            int[] r0 = r8.$emoji
            boolean r0 = X.C107425bI.A03(r0)
            if (r0 == 0) goto L_0x00c5
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.33p r0 = r0.A02
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r2 = "skin_emoji_tip"
            int r1 = X.C18280x3.A02(r0, r2)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            if (r1 >= r7) goto L_0x0092
            X.33p r0 = r0.A02
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r0)
            X.C18270x1.A0h(r0, r2, r1)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.4Gn r4 = r0.A01
            int[] r1 = r8.$emoji
            int r0 = r8.$position
            X.4r2 r2 = new X.4r2
            r2.<init>(r1, r0)
            r8.label = r6
            goto L_0x0056
        L_0x0092:
            X.2y5 r1 = r0.A09
            int[] r2 = r8.$emoji
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r1.A03(r0)
            java.lang.String r0 = X.C107005aX.A01(r2)
            boolean r1 = r1.contains(r0)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            if (r1 != 0) goto L_0x00b6
            X.4Gn r4 = r0.A01
            int[] r1 = r8.$emoji
            int r0 = r8.$position
            X.4r1 r2 = new X.4r1
            r2.<init>(r1, r0)
            r8.label = r5
            goto L_0x0056
        L_0x00b6:
            X.2y5 r1 = r0.A09
            int[] r0 = r8.$emoji
            X.C107005aX.A03(r1, r0)
            goto L_0x00c5
        L_0x00be:
            X.2y5 r1 = r0.A09
            int[] r0 = r8.$emoji
            X.C107005aX.A02(r1, r0)
        L_0x00c5:
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.1ej r1 = r0.A03
            int[] r0 = r8.$emoji
            r1.A08(r0)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.2GI r0 = r0.A05
            X.4Gq r2 = r0.A00
            int[] r1 = r8.$emoji
            X.1TD r0 = new X.1TD
            r0.<init>(r1)
            r8.label = r4
            java.lang.Object r0 = r2.B2K(r0, r8)
            if (r0 != r3) goto L_0x0015
            return r3
        L_0x00e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onEmojiSelected$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new EmojiExpressionsViewModel$onEmojiSelected$1(this.this$0, r6, this.$emoji, this.$position);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
