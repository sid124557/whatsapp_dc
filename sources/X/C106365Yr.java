package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

/* renamed from: X.5Yr  reason: invalid class name and case insensitive filesystem */
public final class C106365Yr {
    public final AnonymousClass5ST A00;

    public C106365Yr(AnonymousClass5ST r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public static final void A01(TextEmojiLabel textEmojiLabel, C179218in r3, C58932w3 r4) {
        r4.A04 = true;
        textEmojiLabel.setSelected(true);
        C93314oJ r2 = ((AnonymousClass8G0) r3).A00;
        C624134x fMessage = r2.getFMessage();
        AnonymousClass67A A0b = C86634Kw.A0b(r2);
        if (A0b != null) {
            A0b.BlW(fMessage, r4);
            C70333aK.A00(r2.A25, r2, fMessage, r4, 14);
            r2.A1u.A00(fMessage, "quick-reply", String.valueOf(r4.A05));
            return;
        }
        Log.e("ConversationRow/onQuickReplyButtonClicked/error: not click in Conversation");
    }

    public static final void A00(Context context, Drawable drawable, TextEmojiLabel textEmojiLabel, C58932w3 r8) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        textEmojiLabel.setText(C87044Mw.A02(textEmojiLabel.getPaint(), drawable, r8.A08, dimensionPixelSize, context.getResources().getInteger(R.integer.f7nameremoved)));
    }
}
