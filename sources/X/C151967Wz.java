package X;

import java.io.File;

/* renamed from: X.7Wz  reason: invalid class name and case insensitive filesystem */
public final class C151967Wz {
    public long A00;
    public AnonymousClass7WJ A01;
    public boolean A02;
    public final String A03;
    public final long[] A04;
    public final /* synthetic */ C172228Ke A05;

    public File A00() {
        File file = this.A05.A08;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A03);
        return AnonymousClass002.A0A(file, AnonymousClass000.A0Y(".", A0o, 0));
    }

    public File A01() {
        File file = this.A05.A08;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A03);
        A0o.append(".");
        A0o.append(0);
        return C18270x1.A0A(file, ".tmp", A0o);
    }

    public C151967Wz(C172228Ke r2, String str) {
        this.A05 = r2;
        this.A03 = str;
        this.A04 = new long[r2.A05];
    }
}
