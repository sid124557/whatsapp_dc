package X;

import com.whatsapp.TextEmojiLabel;

/* renamed from: X.91M  reason: invalid class name */
public class AnonymousClass91M implements AnonymousClass658 {
    public Object A00;
    public final int A01;

    public AnonymousClass91M(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BPS(Object obj) {
        if (this.A01 != 0) {
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A00;
            textEmojiLabel.setPlaceholder(0);
            textEmojiLabel.A0I((CharSequence) obj);
            return;
        }
        ((C94114pv) this.A00).A0C((C148957Kj) obj);
    }
}
