package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4mt  reason: invalid class name and case insensitive filesystem */
public class C92564mt extends C93314oJ {
    public TextEmojiLabel A00;
    public boolean A01;

    public void A0v() {
        if (!this.A01) {
            this.A01 = true;
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

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public final void A22() {
        if (((C31901p2) this.A0S).A00 != null) {
            TextEmojiLabel textEmojiLabel = this.A00;
            textEmojiLabel.setText(A00(getContext(), textEmojiLabel.getPaint(), ((C31901p2) this.A0S).A00.A04, C102805Ki.A00(this.A0M)));
        }
    }

    public C31901p2 getFMessage() {
        return (C31901p2) this.A0S;
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C31901p2);
        this.A0S = r2;
    }

    public C92564mt(Context context, AnonymousClass677 r4, C31901p2 r5) {
        super(context, r4, r5);
        A0v();
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(this, R.id.message_text);
        this.A00 = A0K;
        AnonymousClass0x2.A14(this.A0O, A0K);
        this.A00.setAutoLinkMask(0);
        this.A00.setLinksClickable(false);
        this.A00.setFocusable(false);
        this.A00.setClickable(false);
        this.A00.setLongClickable(false);
        this.A00.setTextColor(getSecondaryTextColor());
        A22();
    }

    public static CharSequence A00(Context context, Paint paint, String str, boolean z) {
        Drawable A04;
        int length;
        int i;
        SpannableStringBuilder A002;
        int A003 = C18320x8.A00(context, R.dimen.f6nameremoved);
        if (z) {
            A04 = C107335b8.A04(context, R.drawable.vec_extension_termination_check_icon, R.color.f5nameremoved);
            i = 0;
            length = 1;
            A002 = C18330xA.A00(AnonymousClass000.A0P(str, "  ", AnonymousClass001.A0o()));
        } else {
            String A0X = AnonymousClass000.A0X("  ", AnonymousClass000.A0l(str));
            A04 = C107335b8.A04(context, R.drawable.vec_extension_termination_check_icon, R.color.f5nameremoved);
            length = A0X.length();
            i = length - 1;
            A002 = C18330xA.A00(A0X);
        }
        C87044Mw.A04(paint, A04, A002, A003, i, length);
        return A002;
    }

    public void A1H() {
        A22();
        A1t(false);
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
