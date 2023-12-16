package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.34X  reason: invalid class name */
public final class AnonymousClass34X {
    public static volatile AnonymousClass34X A01;
    public final C04840Qw A00 = new C04840Qw(1000);

    public static AnonymousClass34X A01() {
        if (A01 == null) {
            synchronized (AnonymousClass34X.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass34X();
                }
            }
        }
        return A01;
    }

    public static Jid A00(String str) {
        if (str.equals("s.whatsapp.net")) {
            return C135206kI.A00;
        }
        if (str.equals("g.us")) {
            return C28041fO.A00;
        }
        if (str.equals("call")) {
            return C28031fN.A00;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r2.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r1.equals("Server") != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r1.equals("0") != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return new com.whatsapp.jid.PhoneUserJid(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r2.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        return new X.C27981fH(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        return X.C135216kJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        return X.AnonymousClass1fW.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        throw X.AnonymousClass24P.A00(X.AnonymousClass32W.A02(r1, r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.whatsapp.jid.UserJid A02(java.lang.String r1, java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -2070199035: goto L_0x0010;
                case -1673355044: goto L_0x001c;
                case -1211484089: goto L_0x0020;
                case -1102975408: goto L_0x003e;
                case -605206432: goto L_0x0049;
                case 107143: goto L_0x004c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = X.AnonymousClass32W.A02(r1, r2)
            X.24P r0 = X.AnonymousClass24P.A00(r0)
            throw r0
        L_0x0010:
            java.lang.String r0 = "status_me"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1fY r0 = X.AnonymousClass1fY.A00
            return r0
        L_0x001c:
            java.lang.String r0 = "s.whatsapp.net"
            goto L_0x0022
        L_0x0020:
            java.lang.String r0 = "hosted"
        L_0x0022:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "Server"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005a
            com.whatsapp.jid.PhoneUserJid r0 = new com.whatsapp.jid.PhoneUserJid
            r0.<init>(r1)
            return r0
        L_0x003e:
            java.lang.String r0 = "lid_me"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1fX r0 = X.AnonymousClass1fX.A00
            return r0
        L_0x0049:
            java.lang.String r0 = "hosted.lid"
            goto L_0x004e
        L_0x004c:
            java.lang.String r0 = "lid"
        L_0x004e:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1fH r0 = new X.1fH
            r0.<init>(r1)
            return r0
        L_0x005a:
            X.6kJ r0 = X.C135216kJ.A00
            return r0
        L_0x005d:
            X.1fW r0 = X.AnonymousClass1fW.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34X.A02(java.lang.String, java.lang.String):com.whatsapp.jid.UserJid");
    }

    public C95804uY A03(String str, String str2) {
        String trim = str.trim();
        if (trim.isEmpty() || "0".equals(trim) || trim.indexOf("0") == 0) {
            throw AnonymousClass24P.A00("Identifier must be a valid number starting with non-zero");
        }
        String A02 = AnonymousClass32W.A02(str, str2);
        if ("newsletter".equals(str2)) {
            C04840Qw r2 = this.A00;
            Jid jid = (Jid) r2.A04(A02);
            if (jid instanceof C95804uY) {
                return (C95804uY) jid;
            }
            C95804uY r1 = new C95804uY(str);
            r2.A08(A02, r1);
            return r1;
        }
        throw AnonymousClass24P.A00(A02);
    }

    public UserJid A04(String str, String str2) {
        String A02 = AnonymousClass32W.A02(str, str2);
        C04840Qw r2 = this.A00;
        Jid jid = (Jid) r2.A04(A02);
        if (jid instanceof UserJid) {
            return (UserJid) jid;
        }
        UserJid A022 = A02(str, str2);
        r2.A08(A02, A022);
        return A022;
    }
}
