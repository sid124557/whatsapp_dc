package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZM  reason: invalid class name */
public final class AnonymousClass1ZM extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Long A04;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A03);
        r3.Blb(4, this.A04);
        r3.Blb(6, this.A00);
        r3.Blb(7, this.A01);
        r3.Blb(8, this.A02);
    }

    public AnonymousClass1ZM() {
        super(4362, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0D(C18270x1.A0N(AnonymousClass0x7.A0h(), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A03);
        AnonymousClass3ZG.A0I(A0r, 3);
        A0r.put(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18290x4.A0b(), this.A04, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A00, A0r), this.A01, A0r), this.A02);
        AnonymousClass3ZG.A0I(A0r, 9);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamBizTrustSignalCard {");
        C57292tP.A00(A0o, "bizTrustSignalCardEventType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "businessPhoneNumber", this.A04);
        C57292tP.A00(A0o, "shownFacebookLikes", this.A00);
        C57292tP.A00(A0o, "shownInstagramFollowers", this.A01);
        return AnonymousClass3ZG.A0G(this.A02, "shownJoinDate", A0o);
    }
}
