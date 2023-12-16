package X;

import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onMultiSkinToneSelected$1;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onSkinToneSelected$1;

/* renamed from: X.5au  reason: invalid class name and case insensitive filesystem */
public class C107225au implements AnonymousClass4A4 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C107225au(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void Bbj(int[] iArr) {
        AnonymousClass4NX r1;
        switch (this.A02) {
            case 0:
                AnonymousClass5ZF r0 = (AnonymousClass5ZF) this.A00;
                r1 = (AnonymousClass4NX) this.A01;
                r0.A04(iArr);
                r1.setEmoji(iArr);
                C107005aX.A02(r0.A0R, iArr);
                break;
            case 1:
                AnonymousClass5ZF r02 = (AnonymousClass5ZF) this.A00;
                r1 = (AnonymousClass4NX) this.A01;
                r02.A04(iArr);
                r1.setEmoji(iArr);
                C107005aX.A03(r02.A0R, iArr);
                break;
            case 2:
                EmojiExpressionsFragment emojiExpressionsFragment = (EmojiExpressionsFragment) this.A00;
                AnonymousClass4r0 r03 = (AnonymousClass4r0) this.A01;
                if (iArr != null) {
                    EmojiExpressionsViewModel A0i = C86634Kw.A0i(emojiExpressionsFragment);
                    int i = r03.A00;
                    C107005aX.A02(A0i.A09, iArr);
                    A0i.A0E(iArr, i);
                    C616131n.A02((C85494Gl) null, new EmojiExpressionsViewModel$onMultiSkinToneSelected$1(A0i, (C84814Du) null, iArr, i), AnonymousClass0IV.A00(A0i), (AnonymousClass20D) null, 3);
                    return;
                }
                return;
            default:
                EmojiExpressionsFragment emojiExpressionsFragment2 = (EmojiExpressionsFragment) this.A00;
                AnonymousClass4r1 r04 = (AnonymousClass4r1) this.A01;
                if (iArr != null) {
                    EmojiExpressionsViewModel A0i2 = C86634Kw.A0i(emojiExpressionsFragment2);
                    int i2 = r04.A00;
                    C107005aX.A03(A0i2.A09, iArr);
                    A0i2.A0E(iArr, i2);
                    C616131n.A02((C85494Gl) null, new EmojiExpressionsViewModel$onSkinToneSelected$1(A0i2, (C84814Du) null, iArr, i2), AnonymousClass0IV.A00(A0i2), (AnonymousClass20D) null, 3);
                    return;
                }
                return;
        }
        r1.invalidate();
    }
}
