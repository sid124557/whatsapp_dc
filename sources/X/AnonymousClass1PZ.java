package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1PZ  reason: invalid class name */
public class AnonymousClass1PZ extends C93314oJ {
    public C625735q A00;
    public C49522gf A01;
    public boolean A02;
    public final TextView A03;

    public void A0v() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass0x7.A0I(this).A4b(this);
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
        C95814uZ r2;
        C30311mF r4 = (C30311mF) this.A0S;
        C625735q r3 = this.A00;
        AnonymousClass2z0 r1 = r4.A1J;
        if (r1.A02) {
            r2 = C56972sr.A04(this.A0Z);
        } else {
            r2 = r1.A00;
        }
        String A0E = r3.A0E(r2, r4.A00, true);
        Drawable A0G = AnonymousClass0x2.A0G(this);
        TextView textView = this.A03;
        AnonymousClass0x7.A15(A0G, textView, A0E);
        textView.setOnClickListener(new C109345eT(this, 22));
    }

    public C30311mF getFMessage() {
        return (C30311mF) this.A0S;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30311mF);
        this.A0S = r2;
    }

    public AnonymousClass1PZ(Context context, AnonymousClass677 r3, C30311mF r4) {
        super(context, r3, r4);
        A0v();
        setClickable(false);
        setLongClickable(false);
        TextView A09 = AnonymousClass002.A09(this, R.id.info);
        this.A03 = A09;
        AnonymousClass0x2.A0r(context, A09, this);
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
