package X;

import android.content.Context;

/* renamed from: X.7OI  reason: invalid class name */
public class AnonymousClass7OI {
    public final Context A00;
    public final AnonymousClass76L A01;
    public final AnonymousClass76M A02;
    public final AnonymousClass716 A03;
    public final AnonymousClass76N A04;
    public final C180348kt A05;

    public AnonymousClass7OI(AnonymousClass7J3 r3) {
        AnonymousClass76L r0;
        AnonymousClass76M r02;
        AnonymousClass76N r03;
        this.A00 = r3.A02;
        C180348kt r1 = r3.A01;
        if (r1 == null) {
            r1 = new AnonymousClass741(this, 0);
            r3.A01 = r1;
        }
        this.A05 = r1;
        this.A03 = r3.A00;
        synchronized (AnonymousClass76L.class) {
            r0 = AnonymousClass76L.A00;
            if (r0 == null) {
                r0 = new AnonymousClass76L();
                AnonymousClass76L.A00 = r0;
            }
        }
        this.A01 = r0;
        synchronized (AnonymousClass76M.class) {
            r02 = AnonymousClass76M.A00;
            if (r02 == null) {
                r02 = new AnonymousClass76M();
                AnonymousClass76M.A00 = r02;
            }
        }
        this.A02 = r02;
        synchronized (AnonymousClass76N.class) {
            r03 = AnonymousClass76N.A00;
            if (r03 == null) {
                r03 = new AnonymousClass76N();
                AnonymousClass76N.A00 = r03;
            }
        }
        this.A04 = r03;
    }
}
