package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.4mm  reason: invalid class name and case insensitive filesystem */
public class C92494mm extends C93314oJ {
    public boolean A00;

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

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public C92494mm(Context context, AnonymousClass677 r7, AnonymousClass1p5 r8) {
        super(context, r7, r8);
        A0v();
        C86624Kv.A17(this, C87094Nz.A09(this, AnonymousClass002.A0F(getContext(), "https://whatsapp.com", AnonymousClass002.A0L(), 0, R.string.f11nameremoved)), R.id.message_text);
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
}
