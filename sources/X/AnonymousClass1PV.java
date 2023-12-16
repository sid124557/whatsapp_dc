package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1PV  reason: invalid class name */
public class AnonymousClass1PV extends C93314oJ {
    public boolean A00;
    public final TextView A01;

    public void A0v() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass0x7.A0I(this).A4a(this);
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public C30341mI getFMessage() {
        return (C30341mI) this.A0S;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30341mI);
        this.A0S = r2;
    }

    public AnonymousClass1PV(Context context, AnonymousClass677 r4, C30341mI r5) {
        super(context, r4, r5);
        A0v();
        setClickable(false);
        setLongClickable(false);
        TextView A0G = C18300x5.A0G(getRootView(), R.id.info);
        this.A01 = A0G;
        AnonymousClass0x2.A0r(context, A0G, this);
        A22();
    }

    public boolean A14() {
        return true;
    }

    public boolean A1v() {
        return false;
    }

    public final void A22() {
        String string = getContext().getString(R.string.f11nameremoved);
        Drawable A0G = AnonymousClass0x2.A0G(this);
        TextView textView = this.A01;
        AnonymousClass0x7.A15(A0G, textView, string);
        textView.setOnClickListener(new C109345eT(this, 21));
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
