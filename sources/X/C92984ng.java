package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4ng  reason: invalid class name and case insensitive filesystem */
public class C92984ng extends C93224oA {
    public boolean A00;
    public final View.OnClickListener A01;

    public C92984ng(Context context, View.OnClickListener onClickListener, C30471mV r4) {
        super(context, (AnonymousClass677) null, r4);
        A0v();
        this.A01 = onClickListener;
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
        }
    }

    public void A1N() {
        this.A01.onClick(this);
    }

    public void onDraw(Canvas canvas) {
        View view = this.A02;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            C86654Ky.A0y(C18290x4.A0G(this), view, layoutParams, R.dimen.f6nameremoved);
        }
        view.setBackground(C18310x6.A0G(view.getContext(), R.drawable.balloon_centered_normal));
        this.A0V = false;
        view.setPadding(getResources().getDimensionPixelSize(R.dimen.f6nameremoved), getResources().getDimensionPixelSize(R.dimen.f6nameremoved), C86614Ku.A05(this, R.dimen.f6nameremoved), getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        super.onDraw(canvas);
    }
}
