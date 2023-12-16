package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bB  reason: invalid class name and case insensitive filesystem */
public final class C25851bB extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public String A0E;

    public C25851bB() {
        super(1980, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(9, this.A0B);
        r3.Blb(8, this.A02);
        r3.Blb(16, this.A03);
        r3.Blb(12, this.A00);
        r3.Blb(15, this.A01);
        r3.Blb(14, this.A0E);
        r3.Blb(6, this.A04);
        r3.Blb(5, this.A05);
        r3.Blb(10, this.A0C);
        r3.Blb(2, this.A06);
        r3.Blb(11, this.A07);
        r3.Blb(3, this.A08);
        r3.Blb(4, this.A0D);
        r3.Blb(1, this.A09);
        r3.Blb(13, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass0x2.A0O(C18270x1.A0K(C18300x5.A0Y(), this.A0B, A0r), this.A02, A0r), this.A03);
        AnonymousClass3ZG.A0I(A0r, 19);
        A0r.put(AnonymousClass0x2.A0N(12, this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(C18270x1.A0F(C18270x1.A0N(C18270x1.A0E(C18270x1.A0M(C18270x1.A0H(C18270x1.A0I(C18320x8.A0W(), this.A0E, A0r), this.A04, A0r), this.A05, A0r), this.A0C, A0r), this.A06, A0r), this.A07, A0r), this.A08);
        AnonymousClass3ZG.A0I(A0r, 17);
        A0r.put(C18270x1.A0P(C18270x1.A0D(C18290x4.A0b(), this.A0D, A0r), this.A09, A0r), this.A0A);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamPlaceholderActivity {");
        C57292tP.A00(A0o, "deviceCount", this.A0B);
        C57292tP.A00(A0o, "deviceSizeBucket", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "e2eSenderType", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "isLid", this.A00);
        C57292tP.A00(A0o, "messageBeforeReg", this.A01);
        C57292tP.A00(A0o, "messageKeyHash", this.A0E);
        C57292tP.A00(A0o, "messageMediaType", C18270x1.A0T(this.A04));
        AnonymousClass3ZG.A0H(C18270x1.A0T(this.A05), A0o);
        C57292tP.A00(A0o, "participantCount", this.A0C);
        C57292tP.A00(A0o, "placeholderActionInd", C18270x1.A0T(this.A06));
        C57292tP.A00(A0o, "placeholderAddReason", C18270x1.A0T(this.A07));
        C57292tP.A00(A0o, "placeholderChatTypeInd", C18270x1.A0T(this.A08));
        C57292tP.A00(A0o, "placeholderTimePeriod", this.A0D);
        C57292tP.A00(A0o, "placeholderTypeInd", C18270x1.A0T(this.A09));
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A0A), "typeOfGroup", A0o);
    }
}
