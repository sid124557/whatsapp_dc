package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1PY  reason: invalid class name */
public class AnonymousClass1PY extends C93314oJ {
    public C625735q A00;
    public C49522gf A01;
    public boolean A02;
    public final TextView A03;

    public void A0v() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass0x7.A0I(this).A4X(this);
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public void A22() {
        C95814uZ A04;
        C31161nq r5 = (C31161nq) this.A0S;
        C56972sr r1 = this.A0Z;
        if (r5.A00 == 2) {
            A04 = r5.A1J.A00;
        } else {
            A04 = C56972sr.A04(r1);
        }
        C626936e.A06(A04);
        boolean A012 = this.A01.A01();
        String A0D = this.A00.A0D(A04, r5.A00, A012);
        Drawable A0G = AnonymousClass0x2.A0G(this);
        TextView textView = this.A03;
        AnonymousClass0x7.A15(A0G, textView, A0D);
        textView.setOnClickListener(new C634239e(2, this, A012));
    }

    public C31161nq getFMessage() {
        return (C31161nq) this.A0S;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C31161nq);
        this.A0S = r2;
    }

    public AnonymousClass1PY(Context context, AnonymousClass677 r3, C31161nq r4) {
        super(context, r3, r4);
        A0v();
        setClickable(false);
        setLongClickable(false);
        TextView A0G = C18300x5.A0G(this, R.id.info);
        this.A03 = A0G;
        AnonymousClass0x2.A0r(context, A0G, this);
        A22();
    }

    public boolean A14() {
        return true;
    }

    public boolean A1v() {
        return false;
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

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }
}
