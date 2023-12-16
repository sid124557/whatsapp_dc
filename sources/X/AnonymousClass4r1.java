package X;

import java.util.Arrays;

/* renamed from: X.4r1  reason: invalid class name */
public final class AnonymousClass4r1 extends C100425Aw {
    public final int A00;
    public final int[] A01;

    public AnonymousClass4r1(int[] iArr, int i) {
        C162457s7.A0J(iArr, 1);
        this.A01 = iArr;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass4r1.class.equals(C86644Kx.A0e(obj))) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.emoji.EmojiExpressionsSideEffect.ShowSkinTonePopup");
                AnonymousClass4r1 r5 = (AnonymousClass4r1) obj;
                if (!Arrays.equals(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShowSkinTonePopup(emoji=");
        A0o.append(Arrays.toString(this.A01));
        A0o.append(", position=");
        return C18260x0.A09(A0o, this.A00);
    }
}
