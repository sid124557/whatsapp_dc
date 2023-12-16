package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.56S  reason: invalid class name */
public class AnonymousClass56S extends C41022Iq {
    public Object A00;
    public Object A01;
    public String A02;

    public AnonymousClass56S(AnonymousClass36K r23, AnonymousClass36K r24, int i) {
        String str;
        AnonymousClass36K r3 = r23;
        AnonymousClass36K.A0N(r3, "iq");
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        if (7 - i != 0) {
            str = "result";
        } else {
            str = "error";
        }
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r3, cls, A0R, A0S, str, strArr, false);
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        AnonymousClass36K r10 = r24;
        Long l = A0R;
        Long l2 = A0S;
        Long l3 = A0R;
        Long l4 = A0S;
        this.A02 = (String) C626836d.A06(r3, cls, l3, l4, C626836d.A06(r10, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), strArr2, true);
        this.A01 = C626836d.A05(r3, UserJid.class, A0R, A0S, (Object) null, new String[]{"to"}, false);
        Class<Jid> cls2 = Jid.class;
        AnonymousClass36K r15 = r3;
        Class<Jid> cls3 = cls2;
        this.A00 = C626836d.A05(r15, cls3, l3, l4, C626836d.A05(r10, cls2, l, l2, (Object) null, new String[]{"to"}, false), new String[]{"from"}, true);
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003f, code lost:
        r1 = X.C86614Ku.A0r(r5, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0043, code lost:
        r0.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0045, code lost:
        r0.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass56S(X.AnonymousClass36K r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r5 = r20
            switch(r21) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x00e3;
                case 2: goto L_0x0085;
                case 3: goto L_0x00e3;
                case 4: goto L_0x00e3;
                case 5: goto L_0x012f;
                case 6: goto L_0x00e3;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x0048;
                case 10: goto L_0x00e3;
                case 11: goto L_0x0007;
                case 12: goto L_0x00e3;
                case 13: goto L_0x00e3;
                case 14: goto L_0x00e3;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0.<init>()
            java.lang.String r1 = "image"
            X.AnonymousClass36K.A0N(r5, r1)
            java.lang.String r1 = "description"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r11 = 0
            r9 = 0
            java.lang.Long r7 = X.AnonymousClass0x2.A0R()
            java.lang.Long r8 = X.AnonymousClass0x2.A0S()
            java.lang.Object r1 = X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = (java.lang.String) r1
            r0.A02 = r1
            java.lang.String r1 = "light"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            r1 = 401(0x191, float:5.62E-43)
            java.lang.Object r1 = X.C86614Ku.A0r(r5, r2, r1)
            r0.A01 = r1
            java.lang.String r1 = "dark"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            r1 = 402(0x192, float:5.63E-43)
        L_0x003f:
            java.lang.Object r1 = X.C86614Ku.A0r(r5, r2, r1)
        L_0x0043:
            r0.A00 = r1
        L_0x0045:
            r0.A00 = r5
            return
        L_0x0048:
            r0.<init>()
            java.lang.String r1 = "sale_price"
            X.AnonymousClass36K.A0N(r5, r1)
            java.lang.String r2 = "price"
            java.lang.String r1 = "#elementValue"
            java.lang.String[] r10 = new java.lang.String[]{r2, r1}
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r11 = 0
            r9 = 0
            java.lang.Long r7 = X.AnonymousClass0x2.A0U()
            r1 = 20
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = (java.lang.String) r1
            r0.A02 = r1
            java.lang.String r1 = "start_date"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            r1 = 386(0x182, float:5.41E-43)
            java.lang.Object r1 = X.C86614Ku.A0r(r5, r2, r1)
            r0.A01 = r1
            java.lang.String r1 = "end_date"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            r1 = 387(0x183, float:5.42E-43)
            goto L_0x003f
        L_0x0085:
            r0.<init>()
            java.lang.String r1 = "notification"
            X.AnonymousClass36K.A0N(r5, r1)
            java.lang.String r1 = "type"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r11 = 0
            java.lang.String r9 = "w:gp2"
            java.lang.Long r7 = X.AnonymousClass0x2.A0R()
            java.lang.Long r8 = X.AnonymousClass0x2.A0S()
            X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = "from"
            java.lang.String[] r17 = new java.lang.String[]{r1}
            java.lang.Class<X.1fJ> r13 = X.C27991fJ.class
            r16 = 0
            r12 = r5
            r14 = r7
            r15 = r8
            r18 = r11
            java.lang.Object r1 = X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)
            r0.A00 = r1
            java.lang.String r1 = "notify"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            java.lang.Long r7 = X.AnonymousClass0x2.A0U()
            r1 = 1024(0x400, double:5.06E-321)
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            r9 = r16
            java.lang.Object r1 = X.C626836d.A05(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = (java.lang.String) r1
            r0.A02 = r1
            r1 = 106(0x6a, float:1.49E-43)
            X.92a r2 = new X.92a
            r2.<init>(r1)
            java.lang.String[] r1 = new java.lang.String[r11]
            java.lang.Object r1 = X.C626836d.A04(r5, r2, r1)
            r0.A01 = r1
            goto L_0x0045
        L_0x00e3:
            r0.<init>()
            java.lang.String r1 = "notification"
            X.AnonymousClass36K.A0N(r5, r1)
            java.lang.String r1 = "t"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            r11 = 0
            r9 = 0
            java.lang.Long r7 = X.AnonymousClass0x2.A0T()
            java.lang.Long r8 = X.AnonymousClass0x2.A0S()
            java.lang.Object r1 = X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)
            r0.A01 = r1
            java.lang.String r1 = "id"
            java.lang.String[] r17 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            java.lang.Long r14 = X.AnonymousClass0x2.A0R()
            r12 = r5
            r15 = r8
            r16 = r9
            r18 = r11
            java.lang.Object r1 = X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r1 = (java.lang.String) r1
            r0.A02 = r1
            java.lang.String r1 = "offline"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            r1 = 1024(0x400, double:5.06E-321)
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = X.C626836d.A05(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0043
        L_0x012f:
            r0.<init>()
            java.lang.String r1 = "message"
            X.AnonymousClass36K.A0N(r5, r1)
            java.lang.String r1 = "code"
            java.lang.String r2 = "reaction"
            java.lang.String[] r10 = new java.lang.String[]{r2, r1}
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r11 = 0
            r9 = 0
            java.lang.Long r7 = X.AnonymousClass0x2.A0U()
            r3 = 100
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            java.lang.Object r1 = X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = (java.lang.String) r1
            r0.A02 = r1
            java.lang.String r1 = "t"
            java.lang.String[] r10 = new java.lang.String[]{r2, r1}
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            java.lang.Long r7 = X.AnonymousClass0x2.A0T()
            java.lang.Long r8 = X.AnonymousClass0x2.A0S()
            java.lang.Object r1 = X.C626836d.A06(r5, r6, r7, r8, r9, r10, r11)
            r0.A01 = r1
            r0.A00 = r5
            java.lang.String[] r7 = new java.lang.String[]{r2}
            r1 = 323(0x143, float:4.53E-43)
            X.92a r6 = new X.92a
            r6.<init>(r1)
            r8 = 1
            r10 = r8
            java.util.List r1 = X.C626836d.A0B(r5, r6, r7, r8, r10)
            java.lang.Object r1 = X.C18290x4.A0k(r1)
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56S.<init>(X.36K, int):void");
    }
}
