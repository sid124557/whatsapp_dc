package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4rt  reason: invalid class name and case insensitive filesystem */
public final class C94774rt extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;

    public C94774rt() {
        super(4746, AnonymousClass0x9.A0U(1, false), 2, 0);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(6, this.A00);
        r3.Blb(1, this.A01);
        r3.Blb(2, this.A03);
        r3.Blb(3, this.A02);
        r3.Blb(4, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(C18270x1.A0D(C18290x4.A0d(), this.A00, A0r), this.A01, A0r), this.A03, A0r), this.A02, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPsChannelPostForward {");
        C57292tP.A00(A0o, "channelForwardContentType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "channelForwardGroupType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "cid", this.A03);
        C57292tP.A00(A0o, "mediaType", C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(this.A04, "postId", A0o);
    }
}
