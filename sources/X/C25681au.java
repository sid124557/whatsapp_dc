package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1au  reason: invalid class name and case insensitive filesystem */
public final class C25681au extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;

    public C25681au() {
        super(2054, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(15, this.A00);
        r3.Blb(4, this.A04);
        r3.Blb(9, this.A05);
        r3.Blb(8, this.A06);
        r3.Blb(1, this.A09);
        r3.Blb(2, this.A02);
        r3.Blb(11, this.A01);
        r3.Blb(14, this.A0A);
        r3.Blb(5, this.A07);
        r3.Blb(7, this.A03);
        r3.Blb(6, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 13);
        A0r.put(C18270x1.A0G(C18270x1.A0F(AnonymousClass0x2.A0P(AnonymousClass0x9.A0j(), this.A00, A0r), (Object) null, A0r), (Object) null, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 10);
        A0r.put(C18270x1.A0D(C18270x1.A0K(C18300x5.A0Y(), this.A05, A0r), this.A06, A0r), this.A09);
        AnonymousClass3ZG.A0I(A0r, 16);
        A0r.put(C18280x3.A0S(), this.A02);
        AnonymousClass3ZG.A0I(A0r, 12);
        A0r.put(C18270x1.A0I(C18270x1.A0J(C18270x1.A0H(C18270x1.A0Q(C18300x5.A0Z(), this.A01, A0r), this.A0A, A0r), this.A07, A0r), this.A03, A0r), this.A08);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidRegDirectMigrationFlow {");
        C57292tP.A00(A0o, "didReceiveRcFromConsumer", this.A00);
        C162457s7.A0J("enteredSamePhoneNumberAsSisterApp", 1);
        C57292tP.A00(A0o, "firstMigrationFailureReason", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "migrateMediaResult", C18270x1.A0T(this.A05));
        C57292tP.A00(A0o, "migratePhoneNumberScreenAction", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "migrationDurationT", this.A09);
        C57292tP.A00(A0o, "migrationTotalSize", this.A02);
        C57292tP.A00(A0o, "otherFilesMigrationFailed", this.A01);
        C57292tP.A00(A0o, "providerAppVersionCode", this.A0A);
        C57292tP.A00(A0o, "secondMigrationFailureReason", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "spacePredictedToNeed", this.A03);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A08), "thirdMigrationFailureReason", A0o);
    }
}
