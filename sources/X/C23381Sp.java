package X;

import java.io.OutputStream;

/* renamed from: X.1Sp  reason: invalid class name and case insensitive filesystem */
public final class C23381Sp extends AnonymousClass203 {
    public final C61042zc A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23381Sp(C56492s4 r3, C61042zc r4, OutputStream outputStream, Integer num) {
        super(r3, outputStream, num, 1);
        C18270x1.A10(outputStream, 1, r3);
        C162457s7.A0J(r4, 5);
        this.A00 = r4;
    }

    public void A01(int i) {
        super.A01(i);
        this.A00.A03 += (long) i;
    }
}
