package X;

import java.util.Map;

/* renamed from: X.7U2  reason: invalid class name */
public final class AnonymousClass7U2 {
    public C180378kw A00;
    public C180378kw A01;
    public C177768gQ A02;
    public C177768gQ A03;
    public AnonymousClass8LG A04;
    public Map A05;

    public C187428xC A00(C166617yz r9, int... iArr) {
        String str;
        C180378kw r4 = this.A00;
        C166617yz r3 = r9;
        if (r4 == null || (str = r9.A03[0].A0P) == null || !str.startsWith("audio")) {
            r4 = this.A01;
        }
        C177768gQ r5 = this.A02;
        String str2 = r9.A03[0].A0P;
        if (str2 == null || !str2.startsWith("audio")) {
            r5 = this.A03;
        }
        return new AnonymousClass6KE(r3, r4, r5, this.A04, iArr);
    }

    public AnonymousClass7U2(C180378kw r1, C180378kw r2, C177768gQ r3, C177768gQ r4, AnonymousClass8LG r5, Map map) {
        this.A05 = map;
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A02 = r4;
        this.A04 = r5;
    }
}
