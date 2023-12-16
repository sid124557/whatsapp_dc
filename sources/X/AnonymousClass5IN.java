package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5IN  reason: invalid class name */
public final class AnonymousClass5IN {
    public final C186048uf A00;
    public final C105355Up A01;
    public final List A02;

    public AnonymousClass5IN(C186048uf r8, C54292oU r9, C105355Up r10) {
        int A05 = C18300x5.A05(r9, r10, 1);
        this.A01 = r10;
        this.A00 = r8;
        int dimensionPixelSize = C54292oU.A00(r9).getDimensionPixelSize(R.dimen.f6nameremoved);
        C150407Qp[] r2 = new C150407Qp[4];
        r2[0] = new C132556fZ(dimensionPixelSize, dimensionPixelSize);
        r2[1] = new C132576fb("description");
        r2[A05] = new AnonymousClass6fY(dimensionPixelSize, dimensionPixelSize);
        r2[3] = new C132566fa("full_details");
        this.A02 = AnonymousClass8UF.A0p(r2);
    }
}
