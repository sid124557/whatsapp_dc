package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.6rI  reason: invalid class name and case insensitive filesystem */
public class C138966rI extends C41022Iq {
    public Object A00;
    public String A01;

    public C138966rI(AnonymousClass36K r22, AnonymousClass36K r23, int i) {
        String str;
        AnonymousClass36K r2 = r22;
        String[] A0Z = AnonymousClass36K.A0Z(r2, "iq");
        Class<String> cls = String.class;
        AnonymousClass36K r9 = r23;
        switch (i) {
            case 0:
            case 2:
            case 3:
            case 10:
            case 12:
            case 15:
            case 19:
            case 21:
            case 23:
                str = "error";
                break;
            case 1:
            case 4:
            case 5:
            case 11:
            case 13:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 27:
                str = "result";
                break;
            default:
                Long A0R = AnonymousClass0x2.A0R();
                Long A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls, A0R, A0S, "result", A0Z, false);
                Class<Jid> cls2 = Jid.class;
                Long l = A0R;
                Long l2 = A0S;
                AnonymousClass36K r14 = r2;
                Class<Jid> cls3 = cls2;
                Long l3 = A0R;
                Long l4 = A0S;
                this.A00 = C626836d.A06(r14, cls3, l3, l4, C626836d.A06(r9, cls2, l, l2, (Object) null, new String[]{"to"}, false), new String[]{"from"}, true);
                String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
                this.A01 = (String) C626836d.A06(r2, cls, l3, l4, C626836d.A06(r9, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr, true);
                break;
        }
        Long A0R2 = AnonymousClass0x2.A0R();
        Long A0S2 = AnonymousClass0x2.A0S();
        C626836d.A06(r2, cls, A0R2, A0S2, str, A0Z, false);
        Long l5 = A0R2;
        Long l6 = A0S2;
        this.A01 = (String) C626836d.A06(r2, cls, A0R2, A0S2, C626836d.A06(r9, cls, l5, l6, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
        Class<Jid> cls4 = Jid.class;
        Class<Jid> cls5 = cls4;
        this.A00 = C626836d.A06(r2, cls5, A0R2, A0S2, C626836d.A06(r9, cls4, l5, l6, (Object) null, new String[]{"to"}, false), new String[]{"from"}, true);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0134, code lost:
        r8 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0139, code lost:
        r0 = X.C626836d.A0B(r3, r4, r5, r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        r10.A00 = r0;
        r10.A00 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00e3, code lost:
        r4 = X.C1896292a.A00(r0);
        r6 = 1;
        r8 = 19999;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C138966rI(X.AnonymousClass36K r11, int r12) {
        /*
            r10 = this;
            r3 = r11
            switch(r12) {
                case 6: goto L_0x013f;
                case 8: goto L_0x0113;
                case 9: goto L_0x00ec;
                case 14: goto L_0x00c3;
                case 17: goto L_0x00a2;
                case 25: goto L_0x0164;
                case 26: goto L_0x0071;
                case 28: goto L_0x0039;
                default: goto L_0x0004;
            }
        L_0x0004:
            r10.<init>()
            java.lang.String r0 = "option"
            X.AnonymousClass36K.A0N(r11, r0)
            java.lang.String r1 = "value"
            java.lang.String r0 = "#elementValue"
            java.lang.String[] r8 = new java.lang.String[]{r1, r0}
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r9 = 0
            r7 = 0
            java.lang.Long r5 = X.AnonymousClass0x2.A0U()
            java.lang.Long r6 = X.AnonymousClass6C9.A0Y()
            java.lang.Object r0 = X.C626836d.A06(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            r10.A01 = r0
            java.lang.String r0 = "thumbnail_media"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 399(0x18f, float:5.59E-43)
            java.lang.Object r0 = X.C86614Ku.A0r(r11, r1, r0)
        L_0x0034:
            r10.A00 = r0
            r10.A00 = r11
            return
        L_0x0039:
            r10.<init>()
            java.lang.String r0 = "type"
            X.AnonymousClass36K.A0N(r11, r0)
            java.lang.String r1 = "name"
            java.lang.String r0 = "#elementValue"
            java.lang.String[] r8 = new java.lang.String[]{r1, r0}
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r9 = 0
            r7 = 0
            java.lang.Long r5 = X.AnonymousClass0x2.A0U()
            java.lang.Long r6 = X.AnonymousClass6C9.A0Y()
            java.lang.Object r0 = X.C626836d.A06(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            r10.A01 = r0
            java.lang.String r1 = "options"
            java.lang.String r0 = "option"
            java.lang.String[] r5 = new java.lang.String[]{r1, r0}
            r0 = 398(0x18e, float:5.58E-43)
            X.92a r4 = X.C1896292a.A00(r0)
            r6 = 1
            r8 = 50
            goto L_0x0139
        L_0x0071:
            r10.<init>()
            java.lang.String r0 = "reaction"
            X.AnonymousClass36K.A0N(r11, r0)
            java.lang.String[] r8 = X.AnonymousClass6C9.A1a()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r9 = 0
            r7 = 0
            java.lang.Long r5 = X.AnonymousClass0x2.A0U()
            java.lang.Long r6 = X.AnonymousClass0x7.A0i()
            java.lang.Object r0 = X.C626836d.A06(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            r10.A01 = r0
            java.lang.String r0 = "count"
            java.lang.String[] r8 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            java.lang.Long r6 = X.AnonymousClass0x2.A0S()
            java.lang.Object r0 = X.C626836d.A06(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0034
        L_0x00a2:
            r10.<init>()
            java.lang.String r0 = "report"
            X.AnonymousClass36K.A0N(r11, r0)
            java.lang.String r0 = "message_id"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = X.AnonymousClass6C7.A0c(r11, r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r10.A01 = r0
            java.lang.String r0 = "reporter"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            r0 = 235(0xeb, float:3.3E-43)
            goto L_0x00e3
        L_0x00c3:
            r10.<init>()
            java.lang.String r0 = "report"
            X.AnonymousClass36K.A0N(r11, r0)
            java.lang.String r0 = "message_id"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = X.AnonymousClass6C7.A0c(r11, r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r10.A01 = r0
            java.lang.String r0 = "reporter"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            r0 = 146(0x92, float:2.05E-43)
        L_0x00e3:
            X.92a r4 = X.C1896292a.A00(r0)
            r6 = 1
            r8 = 19999(0x4e1f, double:9.881E-320)
            goto L_0x0139
        L_0x00ec:
            r10.<init>()
            java.lang.String r0 = "states"
            X.AnonymousClass36K.A0N(r11, r0)
            java.lang.String r0 = "start_at"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = X.AnonymousClass6C7.A0c(r11, r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r10.A01 = r0
            java.lang.String r0 = "state"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            r0 = 79
            X.92a r4 = X.C1896292a.A00(r0)
            r6 = 1
            goto L_0x0134
        L_0x0113:
            r10.<init>()
            java.lang.String r0 = "data"
            java.lang.String[] r1 = X.AnonymousClass36K.A0Z(r11, r0)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = X.AnonymousClass6C7.A0c(r11, r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r10.A01 = r0
            java.lang.String r0 = "pay"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            r0 = 63
            X.92a r4 = X.C1896292a.A00(r0)
            r6 = 0
        L_0x0134:
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0139:
            java.util.List r0 = X.C626836d.A0B(r3, r4, r5, r6, r8)
            goto L_0x0034
        L_0x013f:
            r10.<init>()
            java.lang.String r0 = "alias"
            java.lang.String[] r8 = X.AnonymousClass36K.A0Z(r11, r0)
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r9 = 0
            r7 = 0
            java.lang.Long r5 = X.AnonymousClass0x2.A0U()
            java.lang.Long r6 = X.AnonymousClass6C9.A0Y()
            java.lang.Object r0 = X.C626836d.A05(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            r10.A01 = r0
            r0 = 37
            java.lang.Object r0 = X.C1896292a.A0L(r11, r0, r9)
            goto L_0x0034
        L_0x0164:
            r10.<init>()
            java.lang.String r0 = "linked_accounts"
            X.AnonymousClass36K.A0N(r11, r0)
            java.lang.String r0 = "type"
            java.lang.String r2 = "linked_account"
            java.lang.String[] r1 = new java.lang.String[]{r2, r0}
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r9 = 0
            java.lang.String r0 = "website"
            X.C626836d.A0F(r11, r4, r0, r1)
            java.lang.String r0 = "url"
            java.lang.String[] r8 = new java.lang.String[]{r2, r0}
            r7 = 0
            java.lang.Long r5 = X.AnonymousClass0x2.A0T()
            r0 = 4096(0x1000, double:2.0237E-320)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = X.C626836d.A06(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = (java.lang.String) r0
            r10.A01 = r0
            r10.A00 = r11
            java.lang.String[] r1 = new java.lang.String[]{r2}
            r0 = 300(0x12c, float:4.2E-43)
            java.util.List r0 = X.C1896292a.A0N(r11, r1, r0)
            java.lang.Object r0 = X.C18290x4.A0k(r0)
            r10.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138966rI.<init>(X.36K, int):void");
    }
}
