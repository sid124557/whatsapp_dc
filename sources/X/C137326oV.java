package X;

import android.content.Context;
import android.text.TextPaint;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6oV  reason: invalid class name and case insensitive filesystem */
public class C137326oV extends AnonymousClass8J6 {
    public final C114005mL A00;
    public final AnonymousClass5Y0 A01;

    public void BjV(AnonymousClass5RS r6, C624134x r7) {
        C162457s7.A0J(r6, 1);
        TextEmojiLabel textEmojiLabel = r6.A00;
        AnonymousClass5Y0 r3 = this.A01;
        Context A0F = C18290x4.A0F(textEmojiLabel);
        TextPaint paint = textEmojiLabel.getPaint();
        C162457s7.A0D(paint);
        AnonymousClass8J6.A00(textEmojiLabel, r3, C114005mL.A00(A0F, paint, R.string.f11nameremoved));
    }

    public C137326oV(C114005mL r1, AnonymousClass5Y0 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
