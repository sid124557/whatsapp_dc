package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZS  reason: invalid class name */
public final class AnonymousClass1ZS extends AnonymousClass3ZG {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public String A03;
    public String A04;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A03);
        r3.Blb(2, this.A04);
        r3.Blb(3, this.A01);
        r3.Blb(4, this.A00);
        r3.Blb(5, this.A02);
    }

    public AnonymousClass1ZS() {
        super(3466, AnonymousClass3ZG.A04(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(AnonymousClass001.A0f(), this.A03, A0r), this.A04);
        AnonymousClass3ZG.A0I(A0r, 6);
        A0r.put(C18270x1.A0K(C18270x1.A0J(C18270x1.A0H(C18270x1.A0G(C18290x4.A0a(), this.A01, A0r), this.A00, A0r), this.A02, A0r), (Object) null, A0r), (Object) null);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCtwaUserJourney {");
        C57292tP.A00(A0o, "adId", this.A03);
        C57292tP.A00(A0o, "businessJid", this.A04);
        C57292tP.A00(A0o, "ctwaUserJourneyOperation", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "icebreakersShown", this.A00);
        return AnonymousClass3ZG.A0G(this.A02, "sequenceNumber", A0o);
    }
}
