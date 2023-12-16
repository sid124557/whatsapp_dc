package X;

import android.content.Context;
import android.text.TextPaint;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4yL  reason: invalid class name and case insensitive filesystem */
public class C97454yL extends C115165oE {
    public final C114005mL A00;
    public final AnonymousClass5Y0 A01;

    public C97454yL(C114005mL r1, AnonymousClass5Y0 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BjV(AnonymousClass5RS r7, C624134x r8) {
        C18260x0.A0O(r8, r7);
        TextEmojiLabel textEmojiLabel = r7.A00;
        AnonymousClass5Y0 r4 = this.A01;
        C114005mL r0 = this.A00;
        Context context = textEmojiLabel.getContext();
        TextPaint A002 = C115165oE.A00(textEmojiLabel, context);
        C30451mT r82 = (C30451mT) r8;
        boolean A1Y = C86614Ku.A1Y(r0.A0C);
        int i = R.drawable.msg_status_poll;
        if (A1Y) {
            i = R.drawable.msg_status_poll_v2;
        }
        C115165oE.A01(textEmojiLabel, r4, C87044Mw.A00(context, A002, r82.A03, i));
    }
}
