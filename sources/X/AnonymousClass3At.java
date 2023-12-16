package X;

/* renamed from: X.3At  reason: invalid class name */
public class AnonymousClass3At implements AnonymousClass4CC {
    public final AnonymousClass33p A00;

    public synchronized AnonymousClass2XL BBI() {
        AnonymousClass2XL r2;
        AnonymousClass33p r22 = this.A00;
        String string = AnonymousClass0x2.A0F(r22).getString("phoneyid_id", (String) null);
        long A0A = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r22), "phoneyid_timestamp");
        if (string == null || A0A == -1) {
            r2 = new AnonymousClass2XL((String) null, 0);
        } else {
            r2 = new AnonymousClass2XL(string, A0A);
        }
        return r2;
    }

    public synchronized void Bmt(AnonymousClass2XL r7) {
        AnonymousClass33p r5 = this.A00;
        String str = r7.A01;
        long j = r7.A00;
        C18270x1.A0j(C18270x1.A03(r5), "phoneyid_id", str);
        C18260x0.A0M(r5, "phoneyid_timestamp", j);
    }

    public AnonymousClass3At(AnonymousClass33p r1) {
        this.A00 = r1;
    }
}
