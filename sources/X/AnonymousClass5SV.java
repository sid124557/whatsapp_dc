package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.expressionstray.emoji.handler.EmojiHandlerImageView;

/* renamed from: X.5SV  reason: invalid class name */
public final class AnonymousClass5SV {
    public final long A00;
    public final Drawable A01;
    public final EmojiHandlerImageView A02;
    public final Integer A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SV) {
                AnonymousClass5SV r8 = (AnonymousClass5SV) obj;
                if (!C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00 || !C162457s7.A0P(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A00(((AnonymousClass000.A07(this.A02) * 31) + AnonymousClass000.A07(this.A01)) * 31, this.A00) + C18310x6.A07(this.A03);
    }

    public AnonymousClass5SV(Drawable drawable, EmojiHandlerImageView emojiHandlerImageView, Integer num, long j) {
        this.A02 = emojiHandlerImageView;
        this.A01 = drawable;
        this.A00 = j;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EmojiMessageLoadedObject(emojiImageView=");
        A0o.append(this.A02);
        A0o.append(", drawable=");
        A0o.append(this.A01);
        A0o.append(", descriptor=");
        A0o.append(this.A00);
        A0o.append(", qplInstanceKey=");
        return C18260x0.A04(this.A03, A0o);
    }
}
