package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2b9  reason: invalid class name and case insensitive filesystem */
public final class C46142b9 {
    public final C111095hX A00;
    public final C69263Wi A01;
    public final C620633i A02;
    public final AnonymousClass1VX A03;

    public final void A00(Context context, TextEmojiLabel textEmojiLabel) {
        C162457s7.A0J(textEmojiLabel, 1);
        AnonymousClass1VX r7 = this.A03;
        C69263Wi r4 = this.A01;
        C111095hX r3 = this.A00;
        C620633i r6 = this.A02;
        String string = context.getString(R.string.f11nameremoved);
        C107635bd.A0E(context, Uri.parse("https://faq.whatsapp.com/5064231857013976"), r3, r4, textEmojiLabel, r6, r7, string, "passkeys_learn_more_uri");
    }

    public C46142b9(C111095hX r1, C69263Wi r2, C620633i r3, AnonymousClass1VX r4) {
        C18260x0.A0c(r4, r2, r1, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
