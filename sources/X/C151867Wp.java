package X;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: X.7Wp  reason: invalid class name and case insensitive filesystem */
public class C151867Wp {
    public ByteBuffer A00 = AnonymousClass6C7.A0s(0);
    public final AnonymousClass7JP A01;
    public final C160277nM A02;
    public final AnonymousClass7QR A03;
    public final ByteBuffer[] A04;

    public C151867Wp(AnonymousClass7JP r4, C160277nM r5, AnonymousClass7QR r6) {
        HashMap A022;
        int i = 0;
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r6;
        C153537bV r1 = r6.A05;
        if (!(r1 == null || (A022 = r1.A02(C142366x5.AUDIO)) == null)) {
            i = A022.size();
        }
        this.A04 = new ByteBuffer[i];
    }
}
