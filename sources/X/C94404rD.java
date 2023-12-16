package X;

import java.util.Arrays;

/* renamed from: X.4rD  reason: invalid class name and case insensitive filesystem */
public final class C94404rD extends AnonymousClass5MX {
    public final AnonymousClass5Y0 A00;
    public final AnonymousClass5SX A01;
    public final Integer A02;
    public final int[] A03;
    public final int[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C94404rD.class.equals(C86644Kx.A0e(obj))) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.expressionstray.emoji.grid.EmojiExpressionsViewItem.EmojiItem");
                C94404rD r5 = (C94404rD) obj;
                if (!Arrays.equals(this.A03, r5.A03) || !Arrays.equals(this.A04, r5.A04) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass5Y0 r0 = this.A00;
        return AnonymousClass002.A02(this.A01, (AnonymousClass000.A08(r0, ((Arrays.hashCode(this.A03) * 31) + Arrays.hashCode(this.A04)) * 31) + C18310x6.A06(this.A02)) * 31);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94404rD(AnonymousClass5Y0 r2, AnonymousClass5SX r3, Integer num, int[] iArr, int[] iArr2) {
        super(r3);
        C18260x0.A0Q(iArr, iArr2);
        C162457s7.A0J(r3, 5);
        this.A03 = iArr;
        this.A04 = iArr2;
        this.A00 = r2;
        this.A02 = num;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EmojiItem(emoji=");
        A0o.append(Arrays.toString(this.A03));
        A0o.append(", emojiWithSkinTone=");
        A0o.append(Arrays.toString(this.A04));
        A0o.append(", emojiLoader=");
        A0o.append(this.A00);
        A0o.append(", qplInstanceKey=");
        A0o.append(this.A02);
        A0o.append(", section=");
        return C18260x0.A04(this.A01, A0o);
    }
}
