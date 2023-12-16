package X;

/* renamed from: X.3Au  reason: invalid class name */
public class AnonymousClass3Au implements AnonymousClass4CC {
    public final C56612sH A00;
    public final AnonymousClass33p A01;

    public synchronized AnonymousClass2XL BBI() {
        AnonymousClass2XL r3;
        AnonymousClass33p r2 = this.A01;
        String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r2), "phoneid_id");
        long A0A = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r2), "phoneid_timestamp");
        if (A0Z == null || A0A == -1) {
            r3 = new AnonymousClass2XL(C18280x3.A0Y(), this.A00.A0H());
            Bmt(r3);
        } else {
            r3 = new AnonymousClass2XL(A0Z, A0A);
        }
        return r3;
    }

    public synchronized void Bmt(AnonymousClass2XL r7) {
        AnonymousClass33p r5 = this.A01;
        String str = r7.A01;
        long j = r7.A00;
        C18270x1.A0j(C18270x1.A03(r5), "phoneid_id", str);
        C18260x0.A0M(r5, "phoneid_timestamp", j);
    }

    public AnonymousClass3Au(C56612sH r1, AnonymousClass33p r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
