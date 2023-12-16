package X;

import android.content.Context;
import android.text.SpannableString;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4ml  reason: invalid class name and case insensitive filesystem */
public class C92484ml extends C93314oJ {
    public int getBubbleAlpha() {
        return 153;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public C92484ml(Context context, AnonymousClass677 r7, C30921nR r8, C66433Lk r9) {
        super(context, r7, r8);
        TextEmojiLabel A0M = C86644Kx.A0M(this, R.id.message_text);
        AnonymousClass0x2.A14(this.A0O, A0M);
        C86604Kt.A1J(A0M);
        SpannableString A09 = C87094Nz.A09(this, AnonymousClass0x2.A0X(getContext(), C66433Lk.A00(r9, "835452491239734").toString(), 1, R.string.f11nameremoved));
        AnonymousClass0x2.A12(A0M, this.A0L);
        A0M.setText(A09);
        this.A0U.A02(r8, 2);
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
