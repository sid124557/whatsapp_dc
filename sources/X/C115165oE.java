package X;

import android.text.TextPaint;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5oE  reason: invalid class name and case insensitive filesystem */
public abstract class C115165oE implements AnonymousClass4G4 {
    public static TextPaint A00(TextView textView, Object obj) {
        C162457s7.A0D(obj);
        TextPaint paint = textView.getPaint();
        C162457s7.A0D(paint);
        return paint;
    }

    public static final void A01(TextEmojiLabel textEmojiLabel, AnonymousClass5Y0 r4, CharSequence charSequence) {
        textEmojiLabel.setText(C107345b9.A02(textEmojiLabel.getContext(), textEmojiLabel.getPaint(), new AnonymousClass8GU(C18320x8.A1V(charSequence) ? 1 : 0, 512), r4, charSequence));
    }

    public final boolean BIP(C624134x r2) {
        return true;
    }

    public final boolean BJB(C624134x r2) {
        return true;
    }

    public final boolean BsU(C624134x r2) {
        return false;
    }
}
