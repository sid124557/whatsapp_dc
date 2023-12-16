package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4we  reason: invalid class name and case insensitive filesystem */
public final class C96614we extends AnonymousClass6mM {
    public final View A00;
    public final View A01;
    public final TextEmojiLabel A02;

    public C96614we(View view) {
        super(view);
        this.A00 = view;
        TextEmojiLabel A0M = C86614Ku.A0M(view, R.id.allow_location_btn);
        this.A02 = A0M;
        this.A01 = C18280x3.A0E(view, R.id.more_options_btn);
        Context context = view.getContext();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("# ");
        AnonymousClass0x2.A0s(context, A0o, R.string.f11nameremoved);
        SpannableStringBuilder A002 = C18330xA.A00(A0o.toString());
        C87044Mw.A04(A0M.getPaint(), C107335b8.A07(context, C18310x6.A0G(context, R.drawable.ic_location_nearby), R.color.f5nameremoved), A002, -1, 0, 1);
        A0M.setText(A002);
    }

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C162457s7.A0J(obj, 0);
        C18300x5.A18(this.A02, obj, 8);
        C18300x5.A18(this.A01, obj, 9);
    }
}
