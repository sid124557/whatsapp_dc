package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8TO  reason: invalid class name */
public class AnonymousClass8TO extends ArrayList<Object> implements List<Object>, C188538z3, C188548z4 {
    public static final long serialVersionUID = 9106884089231309568L;

    public String Bqq() {
        C160267nL r2 = C159877mc.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        try {
            C160377nX.A03.Bsi(A0o, this, r2);
        } catch (IOException unused) {
        }
        return A0o.toString();
    }

    public void Bsg(Appendable appendable) {
        C160377nX.A03.Bsi(appendable, this, C159877mc.A00);
    }

    public void Bsh(Appendable appendable, C160267nL r3) {
        C160377nX.A03.Bsi(appendable, this, r3);
    }

    public String Bqr(C160267nL r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        try {
            C160377nX.A03.Bsi(A0o, this, r3);
        } catch (IOException unused) {
        }
        return A0o.toString();
    }

    public String toString() {
        return Bqq();
    }
}
