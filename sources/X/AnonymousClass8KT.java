package X;

import java.io.Closeable;

/* renamed from: X.8KT  reason: invalid class name */
public final class AnonymousClass8KT implements Closeable {
    public final C140326tY A00;
    public final C140326tY A01;
    public final C140326tY A02;
    public final /* synthetic */ C622934l A03;

    public AnonymousClass8KT(C140326tY r1, C140326tY r2, C140326tY r3, C622934l r4) {
        this.A03 = r4;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public AnonymousClass7N1 A00() {
        String A002;
        C622934l r4 = this.A03;
        String A003 = this.A02.A00();
        String A004 = this.A00.A00();
        C140326tY r0 = this.A01;
        if (r0 == null) {
            A002 = null;
        } else {
            A002 = r0.A00();
        }
        return new AnonymousClass7N1(r4, A003, A004, A002);
    }

    public void close() {
        C624535b.A03(this.A00);
        C624535b.A03(this.A02);
        C624535b.A03(this.A01);
    }
}
