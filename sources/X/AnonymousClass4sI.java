package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sI  reason: invalid class name */
public final class AnonymousClass4sI extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;

    public AnonymousClass4sI() {
        super(4692, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(7, this.A05);
        r3.Blb(2, this.A01);
        r3.Blb(3, this.A02);
        r3.Blb(10, this.A03);
        r3.Blb(4, this.A07);
        r3.Blb(9, this.A06);
        r3.Blb(5, this.A08);
        r3.Blb(6, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        AnonymousClass3ZG.A0I(A0r, 8);
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0L(C18270x1.A0G(C18270x1.A0M(C18270x1.A0F(C18270x1.A0E(C18270x1.A0J(AnonymousClass001.A0f(), this.A00, A0r), this.A05, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A07, A0r), this.A06, A0r), this.A08, A0r), this.A04);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChannelCoreEvent {");
        C57292tP.A00(A0o, "channelCoreEventType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "channelDirectorySessionId", this.A05);
        C57292tP.A00(A0o, "channelEntryPoint", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "channelEntryPointApp", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "channelEntryPointMetadata", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "cid", this.A07);
        C57292tP.A00(A0o, "directoryChannelIndex", this.A06);
        C57292tP.A00(A0o, "entryPointMetadata", this.A08);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A04), "eventSurface", A0o);
    }
}
