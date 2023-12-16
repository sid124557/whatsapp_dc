package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1b4  reason: invalid class name and case insensitive filesystem */
public final class C25781b4 extends AnonymousClass3ZG {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C25781b4() {
        super(2208, AnonymousClass0x9.A0T(1, 20, 1000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(7, this.A00);
        r3.Blb(3, this.A01);
        r3.Blb(14, this.A02);
        r3.Blb(13, this.A03);
        r3.Blb(12, this.A04);
        r3.Blb(10, this.A05);
        r3.Blb(9, this.A06);
        r3.Blb(11, this.A07);
        r3.Blb(8, this.A08);
        r3.Blb(6, this.A09);
        r3.Blb(5, this.A0A);
        r3.Blb(4, this.A0B);
        r3.Blb(2, this.A0C);
        r3.Blb(1, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0E(C18270x1.A0G(C18270x1.A0H(C18270x1.A0I(C18270x1.A0K(C18270x1.A0N(C18270x1.A0L(C18270x1.A0M(C18270x1.A0O(C18270x1.A0P(C18270x1.A0Q(C18270x1.A0F(AnonymousClass0x7.A0g(), this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidDiskFootprintEvent {");
        C57292tP.A00(A0o, "chatDatabaseSize", this.A00);
        C57292tP.A00(A0o, "chatUsageSize", this.A01);
        C57292tP.A00(A0o, "externalBackupsSize", this.A02);
        C57292tP.A00(A0o, "externalDatabasesSize", this.A03);
        C57292tP.A00(A0o, "externalMediaSize", this.A04);
        C57292tP.A00(A0o, "externalStorageAvailSize", this.A05);
        C57292tP.A00(A0o, "externalStorageTotalSize", this.A06);
        C57292tP.A00(A0o, "externalWhatsappFolderSize", this.A07);
        C57292tP.A00(A0o, "internalCachedirSize", this.A08);
        C57292tP.A00(A0o, "internalDatabasesSize", this.A09);
        C57292tP.A00(A0o, "internalFilesdirSize", this.A0A);
        C57292tP.A00(A0o, "internalWhatsappFolderSize", this.A0B);
        C57292tP.A00(A0o, "storageAvailSize", this.A0C);
        return AnonymousClass3ZG.A0G(this.A0D, "storageTotalSize", A0o);
    }
}
