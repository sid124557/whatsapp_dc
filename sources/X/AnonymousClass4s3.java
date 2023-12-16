package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4s3  reason: invalid class name */
public final class AnonymousClass4s3 extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;

    public AnonymousClass4s3() {
        super(4316, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(8, this.A03);
        r3.Blb(1, this.A00);
        r3.Blb(9, this.A01);
        r3.Blb(4, this.A02);
        r3.Blb(6, this.A05);
        r3.Blb(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0L(C18270x1.A0D(C18310x6.A0e(), this.A03, A0r), this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 3);
        A0r.put(C18270x1.A0I(C18290x4.A0b(), this.A02, A0r), this.A05);
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(C18290x4.A0c(), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChannelOpen {");
        C57292tP.A00(A0o, "channelDirectorySessionId", this.A03);
        C57292tP.A00(A0o, "channelEntryPoint", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "channelEntryPointMetadata", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "channelUserType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "cid", this.A05);
        return AnonymousClass3ZG.A0G(this.A04, "unreadMessages", A0o);
    }
}
