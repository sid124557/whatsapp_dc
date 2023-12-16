package X;

/* renamed from: X.2cX  reason: invalid class name and case insensitive filesystem */
public class C46992cX {
    public final C56492s4 A00;
    public final C56612sH A01;
    public final C60872zJ A02;
    public final AnonymousClass1VX A03;
    public final C54672p6 A04;
    public final C55132pq A05;
    public final AnonymousClass3FI A06;

    public C614230q A00(C1228866f r27, String str, String str2, int i, boolean z) {
        boolean A0Y;
        AnonymousClass1VX r6 = this.A03;
        C58422vE r4 = C58422vE.A02;
        boolean A0Y2 = r6.A0Y(r4, 1638);
        C1228866f r7 = r27;
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        if (z) {
            C60872zJ r1 = this.A02;
            if (r1.A02()) {
                String A002 = this.A06.A00();
                return new C27741eT(this.A00, this.A01, r6, r7, this.A05, A002, str3, str4, r1.A02.A01(), i2, A0Y2);
            }
        }
        C55132pq r2 = this.A05;
        String A003 = this.A06.A00();
        C54672p6 r12 = this.A04;
        boolean A012 = r12.A01();
        if (!r12.A01()) {
            A0Y = false;
        } else {
            A0Y = r12.A03.A0Y(r4, 58);
        }
        return new C614230q(this.A00, r7, r2, str3, A003, str4, i2, A012, A0Y, A0Y2);
    }

    public C46992cX(C56492s4 r1, C56612sH r2, C60872zJ r3, AnonymousClass1VX r4, C54672p6 r5, C55132pq r6, AnonymousClass3FI r7) {
        this.A01 = r2;
        this.A03 = r4;
        this.A06 = r7;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
    }
}
