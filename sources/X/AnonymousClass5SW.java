package X;

import com.whatsapp.expressionstray.emoji.handler.EmojiHandlerImageView;

/* renamed from: X.5SW  reason: invalid class name */
public final class AnonymousClass5SW {
    public final long A00;
    public final C157857j0 A01;
    public final EmojiHandlerImageView A02;
    public final Integer A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SW) {
                AnonymousClass5SW r8 = (AnonymousClass5SW) obj;
                if (!C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00 || !C162457s7.A0P(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A00(AnonymousClass000.A08(this.A01, C18300x5.A04(this.A02)), this.A00) + C18310x6.A07(this.A03);
    }

    public AnonymousClass5SW(C157857j0 r1, EmojiHandlerImageView emojiHandlerImageView, Integer num, long j) {
        this.A02 = emojiHandlerImageView;
        this.A01 = r1;
        this.A00 = j;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EmojiMessageLoadingObject(emojiImageView=");
        A0o.append(this.A02);
        A0o.append(", emojiSequence=");
        A0o.append(this.A01);
        A0o.append(", descriptor=");
        A0o.append(this.A00);
        A0o.append(", qplInstanceKey=");
        return C18260x0.A04(this.A03, A0o);
    }
}
