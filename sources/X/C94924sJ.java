package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sJ  reason: invalid class name and case insensitive filesystem */
public final class C94924sJ extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public C94924sJ() {
        super(1616, AnonymousClass0x9.A0U(1, false), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
        r3.Blb(6, this.A05);
        r3.Blb(2, this.A01);
        r3.Blb(7, this.A06);
        r3.Blb(8, this.A07);
        r3.Blb(9, this.A08);
        r3.Blb(4, this.A02);
        r3.Blb(3, this.A04);
        r3.Blb(5, this.A03);
    }

    public static void A00(C111515iD r1, C94924sJ r2, int i) {
        r2.A00 = Integer.valueOf(i);
        r2.A01 = 20;
        r1.A01(r2);
    }

    public static void A01(C111515iD r1, C94924sJ r2, int i, int i2, int i3) {
        r2.A00 = Integer.valueOf(i);
        r2.A01 = Integer.valueOf(i2);
        r2.A02 = Integer.valueOf(i3);
        r1.A01(r2);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0H(C18270x1.A0F(C18270x1.A0G(C18270x1.A0L(C18270x1.A0K(C18270x1.A0J(C18270x1.A0E(C18270x1.A0I(AnonymousClass001.A0f(), this.A00, A0r), this.A05, A0r), this.A01, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A02, A0r), this.A04, A0r), this.A03);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamChatFilterEvent {");
        C57292tP.A00(A0o, "actionType", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "activitySessionId", this.A05);
        C57292tP.A00(A0o, "filterType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "metadata", this.A06);
        C57292tP.A00(A0o, "searchQueryId", this.A07);
        C57292tP.A00(A0o, "searchRequestId", this.A08);
        C57292tP.A00(A0o, "searchResultType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "sessionId", this.A04);
        return AnonymousClass3ZG.A0G(C18270x1.A0T(this.A03), "targetScreen", A0o);
    }
}
