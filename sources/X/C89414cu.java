package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4cu  reason: invalid class name and case insensitive filesystem */
public class C89414cu extends AnonymousClass5YB {
    public final C116985rC A00;

    public C89414cu(Context context, C116985rC r9, TextEmojiLabel textEmojiLabel, AnonymousClass5ZU r11, C620733j r12, AnonymousClass1VX r13) {
        super(context, textEmojiLabel, r11, r12, (C56982ss) null, r13);
        this.A00 = r9;
    }

    public void A0E(C107075ae r7, CharSequence charSequence, List list) {
        this.A02.A0H(r7, charSequence, list, 256, false);
    }

    public void A0D(AnonymousClass3ZH r6) {
        TextEmojiLabel textEmojiLabel;
        boolean A0C = A0C(r6);
        C116985rC r1 = this.A00;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("getDrawable");
        }
        if (A0C) {
            int A002 = AnonymousClass29N.A00(this.A06);
            textEmojiLabel = this.A02;
            textEmojiLabel.A0F(A002, R.dimen.f6nameremoved);
        } else {
            textEmojiLabel = this.A02;
            textEmojiLabel.A0E();
        }
        AnonymousClass5Yj.A08(textEmojiLabel.getContext(), textEmojiLabel.getContext(), textEmojiLabel, R.attr.f3nameremoved, R.color.f5nameremoved);
    }
}
