package X;

import android.content.Context;

/* renamed from: X.4nG  reason: invalid class name and case insensitive filesystem */
public class C92784nG extends AnonymousClass4o3 {
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
            C87094Nz.A0P(A0A, r2, this);
            C87094Nz.A0d(r2, this);
        }
    }

    public String getGroupRoleTitle() {
        return null;
    }

    public AnonymousClass679 getRowCustomizer() {
        AnonymousClass677 r0;
        this.A29.get();
        if (!C155477ey.A00(getFMessage().A1J.A00) && (r0 = this.A0m) != null && r0.getContainerType() == 0) {
            return this.A0K.A04;
        }
        AnonymousClass679 rowCustomizer = super.getRowCustomizer();
        C162457s7.A0D(rowCustomizer);
        return rowCustomizer;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92784nG(Context context, AnonymousClass677 r2, AnonymousClass1n2 r3) {
        super(context, r2, r3);
        C18260x0.A0Q(context, r3);
        A0v();
    }
}
