package X;

import android.graphics.Matrix;
import java.util.List;

/* renamed from: X.0Cb  reason: invalid class name and case insensitive filesystem */
public abstract class C01750Cb extends C01780Ce implements C16810u0 {
    public Matrix A00;
    public C02240Fk A01;
    public Boolean A02;
    public String A03;
    public List A04 = AnonymousClass001.A0s();

    public void AwQ(AnonymousClass0NJ r3) {
        if (r3 instanceof C01770Cd) {
            this.A04.add(r3);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Gradient elements cannot contain ");
        A0o.append(r3);
        throw C14450pi.A00(AnonymousClass000.A0X(" elements.", A0o));
    }

    public List B5U() {
        return this.A04;
    }
}
