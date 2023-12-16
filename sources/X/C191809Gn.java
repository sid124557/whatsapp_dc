package X;

/* renamed from: X.9Gn  reason: invalid class name and case insensitive filesystem */
public class C191809Gn extends AnonymousClass5ZM {
    public final C203309nU A00;
    public final C115115o9 A01;
    public final C194259Se A02;
    public final String A03;
    public final String A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return Boolean.valueOf(this.A01.Bia("com.whatsapp", this.A04, this.A02.A01(), this.A03));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Boolean bool = (Boolean) obj;
        C203309nU r2 = this.A00;
        if (r2 != null) {
            C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiSetupCoordinator/registered: ", bool);
            r2.BZe(bool.booleanValue());
        }
        AnonymousClass9S0.A0A = null;
    }

    public C191809Gn(C203309nU r1, C115115o9 r2, C194259Se r3, String str, String str2) {
        this.A02 = r3;
        this.A03 = str;
        this.A01 = r2;
        this.A04 = str2;
        this.A00 = r1;
    }
}
