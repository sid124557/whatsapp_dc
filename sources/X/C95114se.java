package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4se  reason: invalid class name and case insensitive filesystem */
public final class C95114se extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Long A0B;
    public Long A0C;
    public String A0D;

    public C95114se() {
        super(1342, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A0D);
        r3.Blb(12, this.A00);
        r3.Blb(4, this.A01);
        r3.Blb(7, this.A06);
        r3.Blb(10, this.A07);
        r3.Blb(16, this.A02);
        r3.Blb(5, this.A03);
        r3.Blb(14, this.A08);
        r3.Blb(6, this.A04);
        r3.Blb(3, this.A05);
        r3.Blb(8, this.A09);
        r3.Blb(1, this.A0B);
        r3.Blb(2, this.A0C);
        r3.Blb(17, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0M(C18270x1.A0J(C18270x1.A0G(C18270x1.A0O(C18300x5.A0Y(), this.A0D, A0r), this.A00, A0r), this.A01, A0r), this.A06, A0r), this.A07);
        AnonymousClass3ZG.A0I(A0r, 13);
        A0r.put(16, this.A02);
        AnonymousClass3ZG.A0I(A0r, 15);
        A0r.put(AnonymousClass0x2.A0P(C18270x1.A0E(C18270x1.A0D(C18270x1.A0K(C18270x1.A0F(C18270x1.A0I(C18270x1.A0Q(C18290x4.A0c(), this.A03, A0r), this.A08, A0r), this.A04, A0r), this.A05, A0r), this.A09, A0r), this.A0B, A0r), this.A0C, A0r), this.A0A);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamRegistrationComplete {");
        C57292tP.A00(A0o, "deviceIdentifier", this.A0D);
        C57292tP.A00(A0o, "registrationAllowNotifications", this.A00);
        C57292tP.A00(A0o, "registrationAttemptSkipWithNoVertical", this.A01);
        C57292tP.A00(A0o, "registrationContactsPermissionSource", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "registrationGoogleDriveBackupStatus", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "registrationIsWfs", this.A02);
        C57292tP.A00(A0o, "registrationProfilePictureSet", this.A03);
        C57292tP.A00(A0o, "registrationProfilePictureSource", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "registrationProfilePictureTapped", this.A04);
        C57292tP.A00(A0o, "registrationRetryFetchingBizProfile", this.A05);
        C57292tP.A00(A0o, "registrationStoragePermissionSource", C18270x1.A0T(this.A09));
        C57292tP.A00(A0o, "registrationT", this.A0B);
        C57292tP.A00(A0o, "registrationTForFillBusinessInfoScreen", this.A0C);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A0A), "registrationWfsSource", A0o);
    }
}
