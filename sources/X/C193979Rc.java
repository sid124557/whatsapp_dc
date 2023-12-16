package X;

import java.io.File;

/* renamed from: X.9Rc  reason: invalid class name and case insensitive filesystem */
public class C193979Rc {
    public C54722pB A00;
    public final C69263Wi A01;
    public final C56492s4 A02;
    public final C54292oU A03;
    public final AnonymousClass33K A04;

    public C54722pB A00() {
        C54722pB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C47432dF r1 = new C47432dF(this.A01, this.A02, this.A04, new File(this.A03.A00.getCacheDir(), "bloks_images"), "bloks-bridge-manager");
        r1.A00 = Integer.MAX_VALUE;
        r1.A05 = true;
        C54722pB A012 = r1.A01();
        this.A00 = A012;
        return A012;
    }

    public C193979Rc(C69263Wi r1, C56492s4 r2, C54292oU r3, AnonymousClass33K r4) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r4;
    }
}
