package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1b5  reason: invalid class name and case insensitive filesystem */
public final class C25791b5 extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
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

    public C25791b5() {
        super(3112, AnonymousClass0x9.A0T(1, 20, 1000), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(17, this.A03);
        r3.Blb(18, this.A04);
        r3.Blb(19, this.A05);
        r3.Blb(2, this.A00);
        r3.Blb(13, this.A01);
        r3.Blb(3, this.A06);
        r3.Blb(14, this.A07);
        r3.Blb(6, this.A08);
        r3.Blb(7, this.A09);
        r3.Blb(8, this.A0A);
        r3.Blb(20, this.A0B);
        r3.Blb(9, this.A0C);
        r3.Blb(21, this.A02);
        r3.Blb(12, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0D(35, (Object) null, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 23);
        A0r.put(C18270x1.A0P(C18270x1.A0E(AnonymousClass3ZG.A05(AnonymousClass0x2.A0Q(17, this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A00, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 22);
        A0r.put(C18270x1.A0N(AnonymousClass0x2.A0N(C18270x1.A0M(AnonymousClass3ZG.A07(C18270x1.A0L(AnonymousClass3ZG.A06(C18270x1.A0K(C18270x1.A0J(C18270x1.A0I(C18270x1.A0H(AnonymousClass3ZG.A0A(C18270x1.A0G(C18270x1.A0Q(C18290x4.A0a(), this.A06, A0r), this.A07, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A02, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 25);
        AnonymousClass0x2.A1H((Object) null, A0r, 26);
        AnonymousClass0x2.A1H((Object) null, A0r, 27);
        AnonymousClass0x2.A1H((Object) null, A0r, 28);
        AnonymousClass0x2.A1H((Object) null, A0r, 29);
        AnonymousClass0x2.A1H((Object) null, A0r, 30);
        AnonymousClass0x2.A1H((Object) null, A0r, 31);
        AnonymousClass0x2.A1H((Object) null, A0r, 32);
        A0r.put(C18270x1.A0O(33, (Object) null, A0r), this.A0D);
        AnonymousClass3ZG.A0I(A0r, 34);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamOfflineResume {");
        C57292tP.A00(A0o, "expectedOfflineMessageCount", this.A03);
        C57292tP.A00(A0o, "expectedOfflineNotificationCount", this.A04);
        C57292tP.A00(A0o, "expectedOfflineReceiptCount", this.A05);
        C57292tP.A00(A0o, "isOfflineCompleteMissed", this.A00);
        C57292tP.A00(A0o, "isResumeInForeground", this.A01);
        C57292tP.A00(A0o, "lastStanzaT", this.A06);
        C57292tP.A00(A0o, "mailboxAge", this.A07);
        C57292tP.A00(A0o, "offlineMessageCount", this.A08);
        C57292tP.A00(A0o, "offlineNotificationCount", this.A09);
        C57292tP.A00(A0o, "offlinePreviewT", this.A0A);
        C57292tP.A00(A0o, "offlineProcessingT", this.A0B);
        C57292tP.A00(A0o, "offlineReceiptCount", this.A0C);
        C57292tP.A00(A0o, "offlineResumeResult", C18270x1.A0T(this.A02));
        return AnonymousClass3ZG.A0G(this.A0D, "socketConnectT", A0o);
    }
}
