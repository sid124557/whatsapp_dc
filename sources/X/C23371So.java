package X;

import java.io.InputStream;

/* renamed from: X.1So  reason: invalid class name and case insensitive filesystem */
public final class C23371So extends C36851zz {
    public final C61042zc A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23371So(C56492s4 r3, C61042zc r4, InputStream inputStream, Integer num) {
        super(r3, inputStream, num, 1);
        C18270x1.A10(inputStream, 1, r3);
        C162457s7.A0J(r4, 5);
        this.A00 = r4;
    }

    public void A02(int i) {
        super.A02(i);
        this.A00.A02 += (long) i;
    }

    public void A03(long j) {
        super.A03(j);
        this.A00.A02 += j;
    }
}
