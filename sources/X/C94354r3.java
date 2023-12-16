package X;

import java.util.Arrays;

/* renamed from: X.4r3  reason: invalid class name and case insensitive filesystem */
public final class C94354r3 extends C100425Aw {
    public final int A00;
    public final int[] A01;

    public C94354r3(int[] iArr, int i) {
        C162457s7.A0J(iArr, 2);
        this.A00 = i;
        this.A01 = iArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C94354r3.class.equals(C86644Kx.A0e(obj))) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.emoji.EmojiExpressionsSideEffect.UpdateEmojiSkinTone");
                C94354r3 r5 = (C94354r3) obj;
                if (this.A00 != r5.A00 || !Arrays.equals(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UpdateEmojiSkinTone(position=");
        A0o.append(this.A00);
        A0o.append(", emoji=");
        return C18260x0.A07(Arrays.toString(this.A01), A0o);
    }
}
