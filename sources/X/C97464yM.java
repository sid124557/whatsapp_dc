package X;

import android.content.Context;
import android.text.TextPaint;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4yM  reason: invalid class name and case insensitive filesystem */
public class C97464yM extends C115165oE {
    public final C114005mL A00;
    public final AnonymousClass5Y0 A01;

    public C97464yM(C114005mL r1, AnonymousClass5Y0 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BjV(AnonymousClass5RS r8, C624134x r9) {
        C18260x0.A0O(r9, r8);
        TextEmojiLabel textEmojiLabel = r8.A00;
        AnonymousClass5Y0 r5 = this.A01;
        C114005mL r4 = this.A00;
        Context context = textEmojiLabel.getContext();
        TextPaint A002 = C115165oE.A00(textEmojiLabel, context);
        AnonymousClass4FG r1 = (AnonymousClass4FG) r9;
        int A003 = AnonymousClass25Z.A00(r1);
        CharSequence BBp = r1.BBp();
        if (A003 != 0) {
            BBp = C87044Mw.A01(A002, AnonymousClass0RP.A00(context, A003), BBp);
        }
        C115165oE.A01(textEmojiLabel, r5, r4.A0F(context, A002, r9, BBp));
    }
}
