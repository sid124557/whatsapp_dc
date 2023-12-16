package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bI  reason: invalid class name and case insensitive filesystem */
public final class C25921bI extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
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
    public String A0E;
    public String A0F;
    public String A0G;

    public C25921bI() {
        super(4660, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(2, this.A04);
        r3.Blb(3, this.A05);
        r3.Blb(12, this.A0E);
        r3.Blb(4, this.A01);
        r3.Blb(5, this.A0F);
        r3.Blb(6, this.A06);
        r3.Blb(7, this.A07);
        r3.Blb(8, this.A08);
        r3.Blb(9, this.A09);
        r3.Blb(13, this.A0A);
        r3.Blb(14, this.A0B);
        r3.Blb(10, this.A0C);
        r3.Blb(11, this.A0D);
        r3.Blb(15, this.A02);
        r3.Blb(17, this.A0G);
        r3.Blb(16, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass0x2.A0O(AnonymousClass0x2.A0P(AnonymousClass0x2.A0N(C18270x1.A0N(C18270x1.A0M(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0O(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A00, A0r), this.A04, A0r), this.A05, A0r), this.A0E, A0r), this.A01, A0r), this.A0F, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D, A0r), this.A02, A0r), this.A0G, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamSelectParticipantFromPicker {");
        C57292tP.A00(A0o, "addParticipantPickerResult", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "adhocIndex", this.A04);
        C57292tP.A00(A0o, "adhocTotal", this.A05);
        C57292tP.A00(A0o, "appSessionId", this.A0E);
        C57292tP.A00(A0o, "callParticipantSelectSource", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "callRandomId", this.A0F);
        C57292tP.A00(A0o, "groupChatIndex", this.A06);
        C57292tP.A00(A0o, "groupChatTotal", this.A07);
        C57292tP.A00(A0o, "lgcIndex", this.A08);
        C57292tP.A00(A0o, "lgcTotal", this.A09);
        C57292tP.A00(A0o, "oneOnOneIndex", this.A0A);
        C57292tP.A00(A0o, "oneOnOneTotal", this.A0B);
        C57292tP.A00(A0o, "starredIndex", this.A0C);
        C57292tP.A00(A0o, "starredTotal", this.A0D);
        C57292tP.A00(A0o, "subSurface", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "suggestionSessionId", this.A0G);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A03), "uiSurface", A0o);
    }
}
