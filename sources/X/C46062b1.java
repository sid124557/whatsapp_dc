package X;

import java.util.Arrays;

/* renamed from: X.2b1  reason: invalid class name and case insensitive filesystem */
public class C46062b1 {
    public final C95814uZ A00;
    public final C95814uZ A01;
    public final Long[] A02;
    public final String[] A03;

    public C46062b1(C95814uZ r1, C95814uZ r2, Long[] lArr, String[] strArr) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = lArr;
        this.A03 = strArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("toJid=");
        A0o.append(this.A01);
        A0o.append("; participant=");
        A0o.append(this.A00);
        A0o.append("; rowIds=");
        C18320x8.A1P(A0o, this.A02);
        A0o.append("; ids=");
        return AnonymousClass000.A0X(Arrays.toString(this.A03), A0o);
    }
}
