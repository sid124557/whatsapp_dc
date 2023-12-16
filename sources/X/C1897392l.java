package X;

/* renamed from: X.92l  reason: invalid class name and case insensitive filesystem */
public class C1897392l implements C15930sC {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public C1897392l(C06270Wx r1, AnonymousClass08J r2, C183258pk r3, int i, boolean z) {
        this.A04 = i;
        this.A00 = r1;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void BOf(Object obj) {
        Object Ax8;
        int i = this.A04;
        boolean z = this.A03;
        C06270Wx r2 = (C06270Wx) this.A01;
        C183258pk r1 = (C183258pk) this.A02;
        Object A07 = ((C06270Wx) this.A00).A07();
        if (i != 0) {
            if (z || !(A07 == null || obj == null)) {
                Ax8 = r1.Ax8(A07, obj);
            } else {
                return;
            }
        } else if (z || !(obj == null || A07 == null)) {
            Ax8 = r1.Ax8(obj, A07);
        } else {
            return;
        }
        r2.A0H(Ax8);
    }
}
