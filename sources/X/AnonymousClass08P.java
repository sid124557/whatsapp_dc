package X;

import java.util.List;

/* renamed from: X.08P  reason: invalid class name */
public final class AnonymousClass08P extends C05550Ty {
    public int A00;
    public boolean A01;
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();

    public final void A0D(int i) {
        AnonymousClass08M r3 = this.A02;
        Object A07 = r3.A07();
        if (A07 != null) {
            List A012 = AnonymousClass360.A01(A07);
            if (AnonymousClass000.A09(A012, i) == 0) {
                A012.set(i, AnonymousClass001.A0f());
                A012.set(this.A00, 0);
                this.A00 = i;
                r3.A0G(A012);
            }
        }
    }
}
