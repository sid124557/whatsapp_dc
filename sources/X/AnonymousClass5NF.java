package X;

import android.net.Uri;
import android.text.SpannableString;
import com.whatsapp.TextEmojiLabel;
import java.util.HashMap;

/* renamed from: X.5NF  reason: invalid class name */
public final class AnonymousClass5NF {
    public final AnonymousClass5X8 A00;
    public final AnonymousClass33p A01;

    public final void A00(TextEmojiLabel textEmojiLabel, C89644eZ r14, int i) {
        C18270x1.A14(r14, textEmojiLabel);
        String A0l = C18290x4.A0l(r14, i);
        HashMap A0t = AnonymousClass001.A0t();
        Uri A002 = this.A00.A00("https://faq.whatsapp.com/android/verification/how-to-register-your-account-with-a-missed-call");
        C162457s7.A0D(A002);
        A0t.put("flash-call-faq-link", A002);
        AnonymousClass1VX abProps = r14.getAbProps();
        C69263Wi r6 = r14.A05;
        C107635bd.A0G(r14, r14.A00, r6, textEmojiLabel, r14.A08, abProps, A0l, A0t);
        SpannableString A0A = AnonymousClass4L0.A0A(textEmojiLabel.getText());
        ((C88944b3[]) A0A.getSpans(0, A0A.length(), C88944b3.class))[0].A02 = new AnonymousClass5YR(this, 1);
    }

    public AnonymousClass5NF(AnonymousClass5X8 r1, AnonymousClass33p r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
