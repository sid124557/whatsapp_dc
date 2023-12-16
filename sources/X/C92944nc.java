package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.4nc  reason: invalid class name and case insensitive filesystem */
public class C92944nc extends C93304oI {
    public boolean A00;

    public C92944nc(Context context, C30481mW r3) {
        super(context, (AnonymousClass677) null, r3);
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
            C87094Nz.A0L(A0A, r2, this);
            C87094Nz.A0K(A0A, r2, A0C, this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
