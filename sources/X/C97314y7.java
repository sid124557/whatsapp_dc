package X;

import android.content.Context;
import android.text.TextPaint;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4y7  reason: invalid class name and case insensitive filesystem */
public final class C97314y7 extends C115165oE {
    public final C114005mL A00;
    public final AnonymousClass5Y0 A01;

    public C97314y7(C114005mL r1, AnonymousClass5Y0 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BjV(AnonymousClass5RS r8, C624134x r9) {
        C18260x0.A0O(r9, r8);
        TextEmojiLabel textEmojiLabel = r8.A00;
        AnonymousClass5Y0 r5 = this.A01;
        C114005mL r0 = this.A00;
        Context context = textEmojiLabel.getContext();
        TextPaint A002 = C115165oE.A00(textEmojiLabel, context);
        C30401mO r92 = (C30401mO) r9;
        C623234o r2 = (C623234o) r0.A0L.get();
        C115165oE.A01(textEmojiLabel, r5, C87044Mw.A01(A002, r2.A03(context, r92, false), context.getString(r2.A02(r92))));
    }
}
