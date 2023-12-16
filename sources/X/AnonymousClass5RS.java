package X;

import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5RS  reason: invalid class name */
public final class AnonymousClass5RS {
    public final TextEmojiLabel A00;

    public AnonymousClass5RS(TextEmojiLabel textEmojiLabel) {
        C162457s7.A0J(textEmojiLabel, 1);
        this.A00 = textEmojiLabel;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5RS) && C162457s7.A0P(this.A00, ((AnonymousClass5RS) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PinInChatRenderParams(contentTextView=");
        return C18260x0.A04(this.A00, A0o);
    }
}
