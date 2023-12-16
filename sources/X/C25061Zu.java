package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Zu  reason: invalid class name and case insensitive filesystem */
public final class C25061Zu extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public C25061Zu() {
        super(2046, new AnonymousClass5ZC(1, 1, 1000, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A02);
        r3.Blb(4, this.A00);
        r3.Blb(3, this.A03);
        r3.Blb(6, this.A01);
        r3.Blb(5, this.A04);
        r3.Blb(1, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(C18270x1.A0H(C18270x1.A0I(C18270x1.A0F(C18270x1.A0G(C18280x3.A0S(), this.A02, A0r), this.A00, A0r), this.A03, A0r), this.A01, A0r), this.A04, A0r), this.A05);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamRegInit {");
        C57292tP.A00(A0o, "contactsSyncT", this.A02);
        C57292tP.A00(A0o, "groupsInitDidTimeout", this.A00);
        C57292tP.A00(A0o, "groupsInitT", this.A03);
        C57292tP.A00(A0o, "profilePhotosDownloadDidTimeout", this.A01);
        C57292tP.A00(A0o, "profilePhotosDownloadT", this.A04);
        return AnonymousClass3ZG.A0G(this.A05, "totalT", A0o);
    }
}
