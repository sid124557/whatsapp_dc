package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.4nJ  reason: invalid class name and case insensitive filesystem */
public final class C92814nJ extends C93174o5 {
    public boolean A00;

    public void setFMessage(C624134x r2) {
        C162457s7.A0J(r2, 0);
        C626936e.A0C(r2 instanceof C30381mM);
        this.A0S = r2;
    }

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

    public C30381mM getFMessage() {
        C624134x r1 = this.A0S;
        C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.newsletter.fmessage.FMessageNewsletterAdminInvite");
        return (C30381mM) r1;
    }

    public View.OnClickListener getOnActionClickListener() {
        return new AnonymousClass54F(this, 41);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92814nJ(Context context, AnonymousClass677 r2, C30381mM r3) {
        super(context, r2, r3);
        C18260x0.A0Q(context, r3);
        A0v();
    }

    public void A22() {
        super.A22();
        this.A07.setText(getFMessage().A03);
        this.A06.setText(R.string.f11nameremoved);
        this.A04.setText(R.string.f11nameremoved);
    }

    public String getInviteCaption() {
        return getFMessage().A02;
    }
}
