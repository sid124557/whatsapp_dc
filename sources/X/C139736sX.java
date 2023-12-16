package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6sX  reason: invalid class name and case insensitive filesystem */
public final class C139736sX extends C34771vn {
    public final AnonymousClass36K A00;
    public final AnonymousClass36K A01;
    public final AnonymousClass36K A02;
    public final C34981w8 A03;
    public final C138736qu A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C139736sX(AnonymousClass36K r25, C35711xJ r26) {
        AnonymousClass36K r14 = r25;
        AnonymousClass36K A022 = C41032Ir.A02(r14, r26);
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        Class<String> cls2 = cls;
        Long l = A0R;
        Long l2 = A0S;
        C626836d.A06(r14, cls2, l, l2, C626836d.A06(A022, cls, A0R, A0S, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
        Class<Long> cls3 = Long.class;
        Long A0U = AnonymousClass0x2.A0U();
        C626836d.A06(r14, cls3, A0U, l2, (Object) null, new String[]{"account", "version"}, false);
        this.A08 = (String) C626836d.A06(r14, cls, A0U, A0S, (Object) null, new String[]{"account", "international-qr", "pay-detail"}, false);
        C626836d.A05(r14, cls3, A0U, A0S, (Object) null, new String[]{"account", "international-qr", "qr-detail", "expiry-time-stamp"}, false);
        Class<String> cls4 = cls;
        C626836d.A06(r14, cls4, A0U, 10000L, (Object) null, new String[]{"account", "international-qr", "qr-detail", "payload"}, false);
        this.A07 = (String) C626836d.A06(r14, cls4, A0U, 1000L, (Object) null, new String[]{"account", "international-qr", "merchant-detail", "vpa"}, false);
        String[] strArr = {"account", "international-qr", "merchant-detail", PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
        Long A0i = AnonymousClass0x7.A0i();
        this.A06 = (String) C626836d.A06(r14, cls4, A0U, A0i, (Object) null, strArr, false);
        C626836d.A05(r14, cls4, A0U, A0i, (Object) null, new String[]{"account", "international-qr", "merchant-detail", "invoice-number"}, false);
        this.A05 = (String) C626836d.A05(r14, cls4, A0U, A0i, (Object) null, new String[]{"account", "international-qr", "merchant-detail", "mcc"}, false);
        this.A04 = (C138736qu) C626836d.A04(r14, C1896292a.A00(413), new String[]{"account", "international-qr", "fx-detail"});
        this.A03 = (C34981w8) C626836d.A02(r14, new AnonymousClass92Z(A022, 81), 0);
        this.A00 = r14;
        this.A02 = (AnonymousClass36K) C626836d.A0B(r14, C1896292a.A00(414), new String[]{"account"}, 1, 1).get(0);
        this.A00 = (AnonymousClass36K) C626836d.A0B(r14, C1896292a.A00(415), new String[]{"account", "international-qr", "merchant-detail"}, 1, 1).get(0);
        this.A01 = (AnonymousClass36K) C626836d.A0B(r14, C1896292a.A00(416), new String[]{"account", "international-qr", "qr-detail"}, 1, 1).get(0);
    }
}
