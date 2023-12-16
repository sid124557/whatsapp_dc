package X;

import android.content.Context;
import com.whatsapp.comments.MessageCommentsManager;

/* renamed from: X.4mz  reason: invalid class name and case insensitive filesystem */
public abstract class C92624mz extends C133486hS {
    public boolean A00;

    public void A0v() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass4o1 r1 = (AnonymousClass4o1) this;
            C88864av r4 = (C88864av) C87094Nz.A0B(this);
            C64333Db r2 = r4.A0K;
            C87094Nz.A0W(r2, r1);
            C87094Nz.A0X(r2, r1);
            C87094Nz.A0Y(r2, r1);
            C87094Nz.A0Z(r2, r1);
            C87094Nz.A0a(r2, r1, C87094Nz.A0D(r2));
            C116985rC A0A = C87094Nz.A0A(r2, r1);
            C87094Nz.A0R(r2, r2.A00, r1);
            C87094Nz.A0M(A0A, r2, r1, r2.A4V);
            C87094Nz.A0S(r2, r4, r1);
            C87094Nz.A0b(r2, r1, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A, r2, r4, r1, C86604Kt.A0i(r2));
            C87094Nz.A0L(A0A, r2, r1);
            r1.A08 = (C55852r1) r2.AHM.get();
            r1.A06 = (C620133d) r2.AJf.get();
            r1.A07 = (C104295Qk) r2.A00.A7E.get();
            r1.A01 = (MessageCommentsManager) r2.AL1.get();
            r1.A05 = (C56232re) r2.AUV.get();
            r1.A04 = (C22121Ep) r2.A75.get();
            r1.A03 = (C45852ag) r2.A00.A0P.get();
        }
    }

    public C92624mz(Context context, AnonymousClass677 r2, C30471mV r3) {
        super(context, r2, r3);
        A0v();
    }
}
