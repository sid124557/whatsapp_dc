package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4iZ  reason: invalid class name and case insensitive filesystem */
public final class C90894iZ extends C134576jG {
    public final TextEmojiLabel A00;

    public /* bridge */ /* synthetic */ void A0D(Object obj, List list) {
        C97824zJ r3 = (C97824zJ) obj;
        C162457s7.A0J(r3, 0);
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setVisibility(AnonymousClass001.A08(r3.A01 ? 1 : 0));
        C18300x5.A18(textEmojiLabel, r3, 20);
    }

    public C90894iZ(View view) {
        super(view);
        this.A00 = C86614Ku.A0M(view, R.id.see_more);
    }
}
