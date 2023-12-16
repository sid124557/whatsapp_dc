package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.4wc  reason: invalid class name and case insensitive filesystem */
public final class C96594wc extends AnonymousClass6mM {
    public final View A00;
    public final TextEmojiLabel A01;
    public final WaTextView A02;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        int i;
        C136126lt r12 = (C136126lt) obj;
        C162457s7.A0J(r12, 0);
        TextEmojiLabel textEmojiLabel = this.A01;
        AnonymousClass5ZO r5 = r12.A01;
        String str = r5.A09;
        boolean A0P = C162457s7.A0P(str, "device");
        View view = this.A00;
        Context context = view.getContext();
        if (A0P) {
            i = AnonymousClass5Yj.A00(view.getContext());
        } else {
            i = R.color.f5nameremoved;
        }
        AnonymousClass0x2.A0q(context, textEmojiLabel, i);
        this.A02.setText(r12.A00);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("# ");
        spannableStringBuilder.append(AnonymousClass4L0.A0A(AnonymousClass000.A0X(C106445Za.A01(view.getContext(), r5), A0o)));
        Drawable A002 = AnonymousClass0RP.A00(view.getContext(), R.drawable.business_directory_ic_location);
        int A04 = AnonymousClass0Y8.A04(view.getContext(), R.color.f5nameremoved);
        if (C162457s7.A0P(str, "device")) {
            A002 = AnonymousClass0RP.A00(view.getContext(), R.drawable.ic_location_nearby);
            A04 = AnonymousClass5Yj.A03(view.getContext(), view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        }
        C626936e.A06(A002);
        Drawable A0B = C107335b8.A0B(A002, A04);
        C162457s7.A0D(A0B);
        C87044Mw.A04(textEmojiLabel.getPaint(), A0B, spannableStringBuilder, -1, 0, 1);
        textEmojiLabel.setText(spannableStringBuilder);
        C18300x5.A18(textEmojiLabel, r12, 3);
    }

    public C96594wc(View view) {
        super(view);
        this.A00 = view;
        this.A01 = C86614Ku.A0M(view, R.id.search_location_address);
        this.A02 = C86604Kt.A0O(view, R.id.title);
    }
}
