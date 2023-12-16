package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4mq  reason: invalid class name and case insensitive filesystem */
public final class C92534mq extends C93314oJ {
    public boolean A00;
    public final TextEmojiLabel A01 = C86644Kx.A0M(this, R.id.message_text);
    public final String A02;

    public void A0v() {
        if (!this.A00) {
            this.A00 = true;
            C88864av A0C = C87094Nz.A0C(this);
            C64333Db r2 = A0C.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A, r2, A0C, this, C86604Kt.A0i(r2));
            C87094Nz.A0L(A0A, r2, this);
        }
    }

    public int getBubbleAlpha() {
        return 191;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public C92534mq(Context context, AnonymousClass677 r5, C30911nQ r6) {
        super(context, r5, r6);
        A0v();
        StringBuilder A0o = AnonymousClass001.A0o();
        String str = C58152un.A09;
        A0o.append(str);
        String A0V = AnonymousClass000.A0V(context.getString(R.string.f11nameremoved), str, A0o);
        this.A02 = A0V;
        TextEmojiLabel textEmojiLabel = this.A01;
        textEmojiLabel.setText(A0V);
        AnonymousClass0x2.A0q(getContext(), textEmojiLabel, R.color.f5nameremoved);
        textEmojiLabel.setTypeface(textEmojiLabel.getTypeface(), 2);
        C86604Kt.A1J(textEmojiLabel);
    }

    public int A19(int i) {
        return 0;
    }

    public int A1A(int i) {
        return 0;
    }

    public void A1q(C624134x r4, boolean z) {
        boolean A1W = C18300x5.A1W(r4, getFMessage());
        super.A1q(r4, z);
        if (z || A1W) {
            TextEmojiLabel textEmojiLabel = this.A01;
            textEmojiLabel.setText(this.A02);
            AnonymousClass0x2.A0q(getContext(), textEmojiLabel, R.color.f5nameremoved);
            textEmojiLabel.setTypeface(textEmojiLabel.getTypeface(), 2);
            C86604Kt.A1J(textEmojiLabel);
        }
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
