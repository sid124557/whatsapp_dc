package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.expressions.BaseExpressionsBottomSheet;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import com.whatsapp.group.GroupProfileEmojiEditor;

/* renamed from: X.5a8  reason: invalid class name and case insensitive filesystem */
public class C106765a8 implements C84534Cs {
    public Object A00;
    public final int A01;

    public C106765a8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BgM() {
        String str;
        int i;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                C113245l7 r3 = (C113245l7) obj;
                int A0T = r3.A0T();
                if (!r3.A41.A0X(3403) || !r3.A6S) {
                    str = null;
                } else {
                    str = r3.A4P.getStringText();
                    A0T = 8;
                }
                BaseExpressionsBottomSheet A002 = r3.A3z.A00(str, A0T);
                r3.A3y = A002;
                ((ExpressionsKeyboardSearchBottomSheet) A002).A0C = new AnonymousClass6AK(this, 0);
                C08240dc r2 = new C08240dc(C113245l7.A04(r3));
                r2.A0C(r3.A3y, "expressions_search_dialog_fragment");
                r2.A02();
                return;
            case 1:
                AnonymousClass5YE r32 = (AnonymousClass5YE) obj;
                AnonymousClass2WI r22 = r32.A0R;
                if (r32 instanceof C94334qy) {
                    i = 4;
                } else if (r32 instanceof C94324qx) {
                    i = 3;
                } else {
                    i = 7;
                }
                BaseExpressionsBottomSheet A003 = r22.A00((String) null, i);
                r32.A0C = A003;
                ((ExpressionsKeyboardSearchBottomSheet) A003).A0C = new AnonymousClass6AK(r32, 1);
                C182448oQ r0 = r32.A0D;
                if (r0 != null) {
                    r0.BpD(A003);
                    return;
                }
                return;
            default:
                C114085mT r33 = (C114085mT) obj;
                r33.A07.Bon(r33.A0H.A00((String) null, 2), (String) null);
                return;
        }
    }

    public void Bpc() {
        BottomSheetBehavior bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                C113245l7 r2 = (C113245l7) obj;
                bottomSheetBehavior = r2.A0t;
                if (bottomSheetBehavior != null && bottomSheetBehavior.A0O == 3) {
                    r2.A6h = true;
                    break;
                } else {
                    C113245l7.A0L(r2);
                    return;
                }
                break;
            case 1:
                AnonymousClass5YE r22 = (AnonymousClass5YE) obj;
                bottomSheetBehavior = r22.A07;
                if (bottomSheetBehavior != null && bottomSheetBehavior.A0O == 3) {
                    r22.A0J = true;
                    break;
                } else {
                    AnonymousClass5YE.A00(r22);
                    return;
                }
                break;
            default:
                C114085mT r23 = (C114085mT) obj;
                if (r23.A03 != null && (bottomSheetBehavior2 = r23.A00) != null) {
                    bottomSheetBehavior2.A0d(true);
                    r23.A00.A0S(5);
                    EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = r23.A03;
                    GroupProfileEmojiEditor groupProfileEmojiEditor = r23.A07;
                    AnonymousClass5Y0 r7 = r23.A0F;
                    C27821ej r6 = r23.A0E;
                    emojiSearchKeyboardContainer.A03(groupProfileEmojiEditor, r23.A0D, r6, r7, new C1233968g(this, 1), r23.A0G, new C114095mU(this), r23.A0N);
                    C86654Ky.A13(r23.A03.A04);
                    return;
                }
                return;
        }
        bottomSheetBehavior.A0S(4);
    }
}
