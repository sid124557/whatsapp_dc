package X;

/* renamed from: X.2gR  reason: invalid class name and case insensitive filesystem */
public class C49382gR {
    public final /* synthetic */ C55552qX A00;
    public final /* synthetic */ C46202bF A01;
    public final /* synthetic */ C84724Dl A02;
    public final /* synthetic */ boolean A03;

    public C49382gR(C55552qX r1, C46202bF r2, C84724Dl r3, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = z;
        this.A02 = r3;
    }

    public void A00(Exception exc) {
        C46202bF r3 = this.A01;
        r3.A02 = exc;
        r3.A00 = 4;
        this.A00.A01(r3, this.A02, exc.getLocalizedMessage());
    }

    public void A01(String str) {
        this.A00.A02(this.A01, this.A02, str, this.A03);
    }
}
