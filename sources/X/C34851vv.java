package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1vv  reason: invalid class name and case insensitive filesystem */
public class C34851vv extends C41022Iq {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;

    public C34851vv(AnonymousClass36K r21, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        AnonymousClass36K r6 = r21;
        switch (i) {
            case 0:
                this.A01 = C626836d.A06(r6, Long.class, AnonymousClass0x2.A0R(), AnonymousClass0x2.A0S(), (Object) null, new String[]{"hash", "epoch"}, false);
                Class<byte[]> cls = byte[].class;
                this.A00 = C626836d.A06(r6, cls, 32L, 32, (Object) null, new String[]{"hash", "#elementValue"}, false);
                this.A03 = C626836d.A06(r6, cls, 64L, 64, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, "#elementValue"}, false);
                this.A00 = r6;
                this.A02 = C18290x4.A0k(C626836d.A0C(r6, new String[]{"hash"}, 58));
                return;
            case 1:
                AnonymousClass36K.A0N(r6, "message");
                this.A00 = C626836d.A02(r6, C86304Jp.A00(68), 0);
                try {
                    obj = C626836d.A04(r6, C86304Jp.A00(69), new String[0]);
                } catch (AnonymousClass24Y unused) {
                    obj = null;
                }
                this.A02 = obj;
                try {
                    obj2 = C626836d.A04(r6, C86304Jp.A00(70), new String[0]);
                } catch (AnonymousClass24Y unused2) {
                    obj2 = null;
                }
                this.A03 = obj2;
                try {
                    obj3 = C626836d.A04(r6, C86304Jp.A00(71), new String[0]);
                } catch (AnonymousClass24Y unused3) {
                    obj3 = null;
                }
                this.A01 = obj3;
                this.A00 = r6;
                return;
            case 2:
                AnonymousClass36K.A0N(r6, "promotion_config");
                Class<Long> cls2 = Long.class;
                Long A0R = AnonymousClass0x2.A0R();
                Long A0S = AnonymousClass0x2.A0S();
                this.A01 = C626836d.A06(r6, cls2, A0R, A0S, (Object) null, new String[]{"max_impressions"}, false);
                this.A02 = C626836d.A06(r6, cls2, A0R, A0S, (Object) null, new String[]{"max_primary_clicks"}, false);
                this.A03 = C626836d.A06(r6, cls2, A0R, A0S, (Object) null, new String[]{"max_secondary_clicks"}, false);
                this.A00 = C626836d.A06(r6, cls2, A0R, A0S, (Object) null, new String[]{"max_dismisses"}, false);
                this.A00 = r6;
                return;
            case 3:
                AnonymousClass36K.A0N(r6, "user_info");
                Class<Long> cls3 = Long.class;
                Long A0R2 = AnonymousClass0x2.A0R();
                Long A0S2 = AnonymousClass0x2.A0S();
                this.A01 = C626836d.A06(r6, cls3, A0R2, A0S2, (Object) null, new String[]{"impression_count"}, false);
                this.A02 = C626836d.A06(r6, cls3, A0R2, A0S2, (Object) null, new String[]{"primary_click_count"}, false);
                this.A03 = C626836d.A06(r6, cls3, A0R2, A0S2, (Object) null, new String[]{"secondary_click_count"}, false);
                this.A00 = C626836d.A06(r6, cls3, A0R2, A0S2, (Object) null, new String[]{"dismiss_click_count"}, false);
                this.A00 = r6;
                return;
            default:
                AnonymousClass36K.A0N(r6, "notice");
                Class<Long> cls4 = Long.class;
                Long A0T = AnonymousClass0x2.A0T();
                Long A0S3 = AnonymousClass0x2.A0S();
                this.A01 = C626836d.A06(r6, cls4, A0T, A0S3, (Object) null, new String[]{"t"}, false);
                AnonymousClass36K r13 = r6;
                Class<Long> cls5 = cls4;
                this.A03 = C626836d.A05(r13, cls5, AnonymousClass0x2.A0U(), A0S3, (Object) null, new String[]{"version"}, false);
                this.A02 = C626836d.A05(r6, cls4, A0T, A0S3, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE}, false);
                this.A00 = C626836d.A02(r6, C86304Jp.A00(123), 0);
                this.A00 = r6;
                return;
        }
    }
}
