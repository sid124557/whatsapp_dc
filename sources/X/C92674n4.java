package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4n4  reason: invalid class name and case insensitive filesystem */
public class C92674n4 extends C93104nu {
    public static final C148897Kd A02 = new C148897Kd(R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
    public static final C148897Kd A03 = new C148897Kd(R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
    public static final C148897Kd A04 = new C148897Kd(R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
    public static final C148897Kd A05 = new C148897Kd(R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
    public C1230066r A00;
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
            this.A00 = C86634Kw.A0X(r2);
        }
    }

    public C30691mr getFMessage() {
        return (C30691mr) this.A0S;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30691mr);
        this.A0S = r2;
    }

    public C92674n4(Context context, AnonymousClass677 r6, C30691mr r7) {
        super(context, r6, r7);
        A0v();
        setClickable(false);
        TextView textView = this.A00;
        textView.setBackgroundResource(R.drawable.date_balloon);
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        C93314oJ.A0q(textView, this);
        setLongClickable(true);
        setWillNotDraw(false);
        A22();
    }
}
