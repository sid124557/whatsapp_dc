package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1PW  reason: invalid class name */
public class AnonymousClass1PW extends C93314oJ {
    public C625735q A00;
    public boolean A01;
    public final TextView A02;

    public void A0v() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass0x7.A0I(this).A4W(this);
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r5.A0Z.A0a(r1) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A22() {
        /*
            r5 = this;
            X.34x r4 = r5.A0S
            X.1mI r4 = (X.C30341mI) r4
            boolean r0 = r4.A1v()
            r2 = 0
            if (r0 == 0) goto L_0x001a
            X.4uZ r1 = r4.A0n()
            if (r1 == 0) goto L_0x001a
            X.2sr r0 = r5.A0Z
            boolean r0 = r0.A0a(r1)
            r3 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            X.35q r0 = r5.A00
            java.lang.String r0 = r0.A0O(r4, r2)
            android.widget.TextView r2 = r5.A02
            r2.setText(r0)
            r1 = 1
            X.39e r0 = new X.39e
            r0.<init>(r1, r5, r3)
            r2.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PW.A22():void");
    }

    public C31011nb getFMessage() {
        return (C31011nb) this.A0S;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C31011nb);
        this.A0S = r2;
    }

    public AnonymousClass1PW(Context context, AnonymousClass677 r4, C30341mI r5) {
        super(context, r4, r5);
        A0v();
        setClickable(false);
        setLongClickable(false);
        TextView A0G = C18300x5.A0G(this, R.id.info);
        this.A02 = A0G;
        A0G.setBackgroundResource(R.drawable.date_balloon);
        A0G.setTextSize(getDividerFontSize());
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
