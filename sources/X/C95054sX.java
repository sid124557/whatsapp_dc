package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sX  reason: invalid class name and case insensitive filesystem */
public final class C95054sX extends AnonymousClass3ZG {
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

    public C95054sX() {
        super(2642, AnonymousClass0x9.A0U(1, false), 2, 113760892);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(21, this.A00);
        r3.Blb(1, this.A01);
        r3.Blb(22, this.A02);
        r3.Blb(3, this.A03);
        r3.Blb(2, this.A04);
        r3.Blb(25, this.A05);
        r3.Blb(26, this.A06);
        r3.Blb(27, this.A07);
        r3.Blb(19, this.A08);
        r3.Blb(20, this.A09);
        r3.Blb(24, this.A0A);
        r3.Blb(23, this.A0B);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass0x2.A0N(C18270x1.A0E(C18270x1.A0F(AnonymousClass3ZG.A08(C18270x1.A0D(21, this.A00, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 14);
        AnonymousClass0x2.A1H((Object) null, A0r, 16);
        AnonymousClass0x2.A1H((Object) null, A0r, 17);
        A0r.put(C18270x1.A0G(C18270x1.A0L(C18270x1.A0I(C18270x1.A0P(C18270x1.A0O(C18270x1.A0K(C18270x1.A0H(C18270x1.A0N(C18270x1.A0M(C18270x1.A0J(AnonymousClass3ZG.A0C(AnonymousClass3ZG.A0B(25, this.A05, A0r), this.A06, A0r), this.A07, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 18);
        A0r.put(C86634Kw.A0t(19, this.A08, A0r), this.A09);
        A0r.put(AnonymousClass3ZG.A09(24, this.A0A, A0r), this.A0B);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamAndroidInfraHealth {");
        C57292tP.A00(A0o, "psDailyStartsBgCold", this.A00);
        C57292tP.A00(A0o, "psDailyStartsCold", this.A01);
        C57292tP.A00(A0o, "psDailyStartsFgCold", this.A02);
        C57292tP.A00(A0o, "psDailyStartsLukeWarm", this.A03);
        C57292tP.A00(A0o, "psDailyStartsWarms", this.A04);
        C57292tP.A00(A0o, "psNumberOfChats", this.A05);
        C57292tP.A00(A0o, "psNumberOfChatsHidden", this.A06);
        C57292tP.A00(A0o, "psNumberOfChatsHiddenNull", this.A07);
        C57292tP.A00(A0o, "timeSinceLastColdStartInMin", this.A08);
        C57292tP.A00(A0o, "timeSinceLastEventInMin", this.A09);
        C57292tP.A00(A0o, "timeSinceLastLukewarmStartInMin", this.A0A);
        return AnonymousClass3ZG.A0G(this.A0B, "timeSinceLastWarmStartInMin", A0o);
    }
}
