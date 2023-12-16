package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5V5  reason: invalid class name */
public class AnonymousClass5V5 {
    public static void A01(TextEmojiLabel textEmojiLabel, AnonymousClass5OH r8, String str) {
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        r8.A00(textEmojiLabel.getContext(), textEmojiLabel2, AnonymousClass000.A0V("# ", str, AnonymousClass001.A0o()), "security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby");
        CharSequence text = textEmojiLabel.getText();
        C162457s7.A0J(text, 1);
        Context context = textEmojiLabel.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(AnonymousClass4L0.A0A(text));
        C87044Mw.A04(textEmojiLabel.getPaint(), C107335b8.A07(context, C18310x6.A0G(context, R.drawable.ic_security_balloon), R.color.f5nameremoved), spannableStringBuilder, -1, 0, 1);
        textEmojiLabel2.setText(spannableStringBuilder);
    }

    public static void A00(C003203q r5, C50382i5 r6, C53602nM r7) {
        C19340zH A00 = AnonymousClass5V0.A00(r5);
        View A0G = C86654Ky.A0G(r5, R.layout.f8nameremoved);
        View A02 = C06560Yg.A02(A0G, R.id.not_now_btn);
        C109725f5.A00(C06560Yg.A02(A0G, R.id.update_btn), r5, r6, r7, 9);
        C18290x4.A1H(A02, r5, 24);
        A00.A0L(new AnonymousClass91X(r5, 0));
        A00.setView(A0G);
        A00.A0S();
    }
}
