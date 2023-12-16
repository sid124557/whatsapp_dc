package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4nK  reason: invalid class name and case insensitive filesystem */
public class C92824nK extends C93174o5 {
    public C56072rN A00;
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
            this.A00 = C86634Kw.A0r(r2);
        }
    }

    public C30391mN getFMessage() {
        return (C30391mN) this.A0S;
    }

    public String getInviteCaption() {
        return ((C30391mN) this.A0S).A04;
    }

    public View.OnClickListener getOnActionClickListener() {
        return new AnonymousClass543(this.A0S, 43, this);
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30391mN);
        this.A0S = r2;
    }

    public C92824nK(Context context, AnonymousClass677 r2, C30391mN r3) {
        super(context, r2, r3);
        A0v();
    }

    public void A22() {
        super.A22();
        C30391mN r3 = (C30391mN) this.A0S;
        String str = r3.A05;
        AnonymousClass1VX r2 = this.A0O;
        C162457s7.A0J(r2, 0);
        if ((str == null || str.length() == 0) && C56952sp.A0K(r2, 3010, false)) {
            this.A07.setText(R.string.f11nameremoved);
            this.A06.setVisibility(8);
        } else {
            this.A07.setText(str);
        }
        boolean A03 = this.A00.A03(r3.A00);
        TextEmojiLabel textEmojiLabel = this.A06;
        int i = R.string.f11nameremoved;
        if (A03) {
            i = R.string.f11nameremoved;
        }
        textEmojiLabel.setText(i);
        TextEmojiLabel textEmojiLabel2 = this.A04;
        boolean z = r3.A1J.A02;
        int i2 = R.string.f11nameremoved;
        if (z) {
            i2 = R.string.f11nameremoved;
        }
        textEmojiLabel2.setText(i2);
    }
}
