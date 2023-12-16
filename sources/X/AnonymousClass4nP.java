package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.4nP  reason: invalid class name */
public class AnonymousClass4nP extends C93234oB {
    public boolean A00;
    public final /* synthetic */ PopupNotification A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4nP(Context context, C105365Uq r9, C113895mA r10, PopupNotification popupNotification, C30721mu r12) {
        super(context, r9, (AnonymousClass677) null, popupNotification.A0e, r10, r12);
        this.A01 = popupNotification;
        A0v();
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
            C87094Nz.A0P(A0A, r2, this);
            C87094Nz.A0c(r2, this);
            C87094Nz.A0V(r2, A0C, this);
        }
    }

    public void onDraw(Canvas canvas) {
        View view = this.A03;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            C86654Ky.A0y(C18290x4.A0G(this), view, layoutParams, R.dimen.f6nameremoved);
        }
        view.setBackground(C18310x6.A0G(view.getContext(), R.drawable.balloon_centered_normal));
        this.A0V = false;
        super.onDraw(canvas);
    }
}
