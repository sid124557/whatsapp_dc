package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4y2  reason: invalid class name and case insensitive filesystem */
public class C97264y2 extends C115165oE {
    public final AnonymousClass5Y0 A00;

    public C97264y2(AnonymousClass5Y0 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BjV(AnonymousClass5RS r6, C624134x r7) {
        C162457s7.A0J(r6, 1);
        TextEmojiLabel textEmojiLabel = r6.A00;
        Context context = textEmojiLabel.getContext();
        AnonymousClass5Y0 r3 = this.A00;
        String string = context.getString(R.string.f11nameremoved);
        CharSequence A01 = C87044Mw.A01(textEmojiLabel.getPaint(), C107335b8.A01(context, R.drawable.msg_status_sticker), string);
        C162457s7.A0D(A01);
        C115165oE.A01(textEmojiLabel, r3, A01);
    }
}
