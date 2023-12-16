package X;

import java.util.AbstractCollection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bJ  reason: invalid class name and case insensitive filesystem */
public final class C25931bJ extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public String A0I;

    public C25931bJ() {
        super(1006, AnonymousClass0x9.A0T(1, 20, 100), 0, -1);
    }

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(20, this.A05);
        r3.Blb(10, this.A06);
        r3.Blb(19, this.A07);
        r3.Blb(22, this.A08);
        r3.Blb(14, this.A09);
        r3.Blb(16, this.A0A);
        r3.Blb(17, this.A0B);
        r3.Blb(12, this.A00);
        r3.Blb(21, this.A0C);
        r3.Blb(6, this.A01);
        r3.Blb(5, this.A02);
        r3.Blb(15, this.A0D);
        r3.Blb(7, this.A0E);
        r3.Blb(8, this.A03);
        r3.Blb(11, this.A0F);
        r3.Blb(13, this.A0G);
        r3.Blb(18, this.A0H);
        r3.Blb(9, this.A04);
        r3.Blb(1, this.A0I);
    }

    public static boolean A00(C25931bJ r2, AbstractCollection abstractCollection) {
        r2.A0F = Long.valueOf((long) abstractCollection.size());
        return abstractCollection.isEmpty();
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0E(C18270x1.A0F(C18270x1.A0G(C18270x1.A0D(C18270x1.A0L(AnonymousClass0x2.A0Q(C18270x1.A0P(C18270x1.A0N(C18270x1.A0K(C18270x1.A0J(AnonymousClass0x2.A0N(C18270x1.A0H(C18270x1.A0I(AnonymousClass3ZG.A07(C18270x1.A0O(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(C18270x1.A0Q(AnonymousClass3ZG.A08(AnonymousClass3ZG.A05(C18270x1.A0M(20, this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A00, A0r), this.A0C, A0r), this.A01, A0r), this.A02, A0r), this.A0D, A0r), this.A0E, A0r), this.A03, A0r), this.A0F, A0r), this.A0G, A0r), this.A0H, A0r), this.A04, A0r), this.A0I, A0r), (Object) null, A0r), (Object) null, A0r), (Object) null);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamContactSyncEvent {");
        C57292tP.A00(A0o, "contactSyncBusinessResponseNew", this.A05);
        C57292tP.A00(A0o, "contactSyncChangedVersionRowCount", this.A06);
        C57292tP.A00(A0o, "contactSyncDeviceResponseNew", this.A07);
        C57292tP.A00(A0o, "contactSyncDisappearingModeResponseNew", this.A08);
        C57292tP.A00(A0o, "contactSyncErrorCode", this.A09);
        C57292tP.A00(A0o, "contactSyncFailureProtocol", this.A0A);
        C57292tP.A00(A0o, "contactSyncLatency", this.A0B);
        C57292tP.A00(A0o, "contactSyncNoop", this.A00);
        C57292tP.A00(A0o, "contactSyncPayResponseNew", this.A0C);
        C57292tP.A00(A0o, "contactSyncRequestClearWaSyncData", this.A01);
        C57292tP.A00(A0o, "contactSyncRequestIsUrgent", this.A02);
        C57292tP.A00(A0o, "contactSyncRequestProtocol", this.A0D);
        C57292tP.A00(A0o, "contactSyncRequestRetryCount", this.A0E);
        C57292tP.A00(A0o, "contactSyncRequestShouldRetry", this.A03);
        C57292tP.A00(A0o, "contactSyncRequestedCount", this.A0F);
        C57292tP.A00(A0o, "contactSyncResponseCount", this.A0G);
        C57292tP.A00(A0o, "contactSyncStatusResponseNew", this.A0H);
        C57292tP.A00(A0o, "contactSyncSuccess", this.A04);
        return AnonymousClass3ZG.A0G(this.A0I, "contactSyncType", A0o);
    }
}
