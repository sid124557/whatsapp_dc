package X;

/* renamed from: X.31J  reason: invalid class name */
public final class AnonymousClass31J {
    public static final int A00(String str) {
        String str2;
        switch (str.hashCode()) {
            case -449631153:
                if (str.equals("otp_did_not_request")) {
                    return 5;
                }
                break;
            case -119378578:
                if (str.equals("offensive_messages")) {
                    return 4;
                }
                break;
            case 3536713:
                if (str.equals("spam")) {
                    return 3;
                }
                break;
            case 291932813:
                str2 = "no_longer_needed";
                break;
            case 1245889503:
                if (str.equals("no_sign_up")) {
                    return 2;
                }
                break;
            case 1633167393:
                str2 = "no_longer_interested";
                break;
        }
        return str.equals(str2) ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r0 = r4.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r4.equals(r0) == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r4.equals(r0) == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A01(java.lang.String r4) {
        /*
            if (r4 == 0) goto L_0x000c
            int r0 = r4.hashCode()
            r3 = 1
            r2 = 4
            r1 = 0
            switch(r0) {
                case -2046991529: goto L_0x000e;
                case -1882719533: goto L_0x0012;
                case -1421455676: goto L_0x001a;
                case -401299234: goto L_0x001d;
                case -184936212: goto L_0x0020;
                case 3052376: goto L_0x0023;
                case 779161541: goto L_0x002c;
                case 1622880667: goto L_0x0036;
                default: goto L_0x000c;
            }
        L_0x000c:
            r1 = 3
        L_0x000d:
            return r1
        L_0x000e:
            java.lang.String r0 = "overflow_menu_report"
            goto L_0x002f
        L_0x0012:
            java.lang.String r0 = "account_info_report"
            boolean r0 = r4.equals(r0)
            r1 = 2
            goto L_0x0029
        L_0x001a:
            java.lang.String r0 = "biz_spam_banner_block"
            goto L_0x0039
        L_0x001d:
            java.lang.String r0 = "biz_overflow_menu_block"
            goto L_0x0025
        L_0x0020:
            java.lang.String r0 = "biz_block_header_chat"
            goto L_0x0025
        L_0x0023:
            java.lang.String r0 = "chat"
        L_0x0025:
            boolean r0 = r4.equals(r0)
        L_0x0029:
            if (r0 != 0) goto L_0x000d
            goto L_0x000c
        L_0x002c:
            java.lang.String r0 = "ongoing_call_link_block"
        L_0x002f:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000c
            return r2
        L_0x0036:
            java.lang.String r0 = "psa_banner_block"
        L_0x0039:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000c
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31J.A01(java.lang.String):int");
    }

    public static final Long A02(AnonymousClass3ZH r0) {
        C95814uZ r02 = r0.A0H;
        if (r02 == null) {
            return null;
        }
        return C18290x4.A0h(r02.user);
    }
}
