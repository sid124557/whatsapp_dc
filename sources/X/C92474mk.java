package X;

import android.content.Context;
import android.text.SpannableString;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4mk  reason: invalid class name and case insensitive filesystem */
public final class C92474mk extends C93314oJ {
    public int getBubbleAlpha() {
        return 153;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public C92474mk(Context context, AnonymousClass677 r8, C30931nS r9, C66433Lk r10) {
        super(context, r8, r9);
        TextEmojiLabel A0M = C86644Kx.A0M(this, R.id.message_text);
        AnonymousClass0x2.A14(this.A0O, A0M);
        C86604Kt.A1J(A0M);
        SpannableString A09 = C87094Nz.A09(this, AnonymousClass0x2.A0X(getContext(), C66433Lk.A00(r10, "26000015").toString(), 1, R.string.f11nameremoved));
        AnonymousClass0x2.A12(A0M, this.A0L);
        A0M.setText(A09);
        C18260x0.A0L(this.A1G, "decryption_failure_views", AnonymousClass0x2.A0F(this.A1G).getInt("decryption_failure_views", 0) + 1);
        this.A0U.A02(r9, 2);
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
