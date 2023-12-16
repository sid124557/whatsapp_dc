package X;

/* renamed from: X.3aK  reason: invalid class name and case insensitive filesystem */
public class C70333aK implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C70333aK(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public static void A00(AnonymousClass4FS r1, Object obj, Object obj2, Object obj3, int i) {
        r1.BkM(new C70333aK(obj, obj2, obj3, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: X.4oL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: X.5XH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v124, resolved type: X.4oL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v125, resolved type: X.4oL} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ea, code lost:
        r0.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ed, code lost:
        X.C18270x1.A0j(r3.A00().edit(), r4.getRawString(), X.C18270x1.A0T(r5.A03()));
        r2 = r4.getRawString();
        r4 = r3.A02();
        X.C18260x0.A0q("ConversationSketchLogger:saveMerchantJIDToMerchantList merchantJID : ", r2, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x021b, code lost:
        if (r4.A00.contains(r2) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x021d, code lost:
        r4.A00.add(r2);
        r0 = r3.A00().edit().putString("merchant_jid_list", X.C18270x1.A0T(r4.A03()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x023a, code lost:
        r2.A01 = X.AnonymousClass0x7.A0j(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x024b, code lost:
        if (r9.A04.size() >= 500) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x024d, code lost:
        r0 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0250, code lost:
        r9.A01 = X.AnonymousClass0x7.A0j(r9.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0259, code lost:
        r0 = "order";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x025e, code lost:
        r0 = "sticker";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0263, code lost:
        r0 = "document";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0267, code lost:
        r0 = "location";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x026b, code lost:
        r0 = "video";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0270, code lost:
        r0 = "audio";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0274, code lost:
        r0 = "image";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0278, code lost:
        r0 = "template_hsm";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x027c, code lost:
        r0 = "template_hsm_reply";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x027f, code lost:
        r8 = new X.AnonymousClass1QZ(r7, r2, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028a, code lost:
        if (X.C40802Hu.A01(r7) != null) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x028e, code lost:
        if (r7.A15 == null) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0290, code lost:
        r0 = "payment";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0295, code lost:
        if (r10 != false) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0297, code lost:
        r0 = r7.A0w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x029b, code lost:
        if (r0 == null) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x029f, code lost:
        if (r0.A1I != 54) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ab, code lost:
        if (android.text.TextUtils.isEmpty(((X.C30481mW) r7).A07) == false) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b3, code lost:
        if (X.C22771Qa.A00(r7.A0y) != false) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b5, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02b6, code lost:
        r8 = new X.AnonymousClass1QY(r6, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c1, code lost:
        if (X.C40802Hu.A01(r7) == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02c3, code lost:
        r8 = new X.C22771Qa(r7, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02ca, code lost:
        r2 = "received";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02cf, code lost:
        r0 = r0.A04.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x033e, code lost:
        r5.A0G(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0341, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x045b, code lost:
        r6 = r0.B9t(r2);
        r0 = X.AnonymousClass33U.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0463, code lost:
        if (r0 == null) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0465, code lost:
        r5.A03(15, 1, r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x046f, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0471, code lost:
        r2 = r3.A1J.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0475, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0477, code lost:
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x047b, code lost:
        if (r1 == 144) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x047d, code lost:
        switch(r1) {
            case 122: goto L_0x048d;
            case 123: goto L_0x0489;
            case 124: goto L_0x048b;
            case 125: goto L_0x0487;
            case 126: goto L_0x0487;
            case 127: goto L_0x0485;
            case 128: goto L_0x0483;
            default: goto L_0x0480;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0480, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0483, code lost:
        r0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0485, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0487, code lost:
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0489, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x048b, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x048d, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x048e, code lost:
        r4 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0492, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0495, code lost:
        if (r6 == 1) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0497, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0499, code lost:
        if (r6 != 2) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x049b, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x049c, code lost:
        r1 = r5.A02.A06(X.AnonymousClass32V.A00(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04a7, code lost:
        if (r1 == 2) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04aa, code lost:
        if (r1 == 3) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04ac, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04ae, code lost:
        if (r1 != 6) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04b0, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04b1, code lost:
        r1 = new X.AnonymousClass1YD();
        r1.A01 = r4;
        r1.A02 = java.lang.Integer.valueOf(r3);
        r1.A00 = java.lang.Integer.valueOf(r2);
        r5.A04.BhD(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04ca, code lost:
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x053b, code lost:
        if (r0.A05 <= 0) goto L_0x053d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0601, code lost:
        if (r0.A05 <= 0) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d8, code lost:
        r2 = r3.A04;
        r1 = X.C58422vE.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e2, code lost:
        if (r2.A0Y(r1, 5535) == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e4, code lost:
        r1 = r2.A0R(r1, 5536);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f0, code lost:
        if ("*".equals(r1) != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
        if (X.C18310x6.A0t(r1).contains(r4.user) == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        r3.A03();
        com.whatsapp.util.Log.d("ConversationSketchLogger/logSentMessageEvent logging");
        r7 = r3.A08.A05(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010c, code lost:
        if (r7 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010e, code lost:
        r0 = "ConversationSketchLogger: logMessageEvent message is null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0110, code lost:
        com.whatsapp.util.Log.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0113, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        r2.A01(r3, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0114, code lost:
        r0 = "ConversationSketchLogger: logSentMessageEvent merchant is not allowed for logging";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("ConversationSketchLogger: logMessageEvent message type: ");
        r8 = r7.A1I;
        X.C18260x0.A1F(r1, r8);
        r5 = r3.A01(r4.getRawString());
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012f, code lost:
        if (r0 != null) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0131, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0132, code lost:
        r6 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0a2b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0134, code lost:
        if (r10 == false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0a2f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0a32, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0a33, code lost:
        X.AnonymousClass2A8.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0a36, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0136, code lost:
        r2 = "sent";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0a77, code lost:
        r0.A0S(new X.C71593cM((java.lang.Object) r3, (java.lang.Object) r4, r5, r6, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0a7f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0139, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013c, code lost:
        if (r8 == 0) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013e, code lost:
        if (r8 == 1) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0141, code lost:
        if (r8 == 2) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0144, code lost:
        if (r8 == 3) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0cb8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0cbc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0cbf, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0cc0, code lost:
        X.AnonymousClass2A8.A00(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0cc3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0148, code lost:
        if (r8 == 9) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014c, code lost:
        if (r8 == 20) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0150, code lost:
        if (r8 == 23) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0d84, code lost:
        r2.A0S(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0d87, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0ed3, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0ed6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0154, code lost:
        if (r8 == 32) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0158, code lost:
        if (r8 == 49) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015c, code lost:
        if (r8 == 52) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0160, code lost:
        if (r8 == 45) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0164, code lost:
        if (r8 == 46) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0166, code lost:
        if (r8 == 54) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016a, code lost:
        if (r8 == 55) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016c, code lost:
        switch(r8) {
            case 25: goto L_0x0278;
            case 26: goto L_0x0278;
            case 27: goto L_0x0278;
            case 28: goto L_0x0278;
            case 29: goto L_0x0278;
            case 30: goto L_0x0278;
            default: goto L_0x016f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016f, code lost:
        if (r8 == 1) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0172, code lost:
        if (r8 == 2) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0175, code lost:
        if (r8 == 3) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0178, code lost:
        if (r8 == 5) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017c, code lost:
        if (r8 == 9) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0180, code lost:
        if (r8 == 20) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0184, code lost:
        if (r8 == 44) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0186, code lost:
        r0 = "unsupported";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0189, code lost:
        r8 = new X.AnonymousClass1QX(r6, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018e, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("ConversationSketchLogger:logMessageEvent logging event : ");
        X.C18260x0.A1J(r1, X.C18270x1.A0T(r8.A03()));
        r10 = r3.A03;
        r11 = r10.A0H();
        r9 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01aa, code lost:
        if (r9 == null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b4, code lost:
        if ((r9.A00 + 86400000) >= r11) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b6, code lost:
        r5.A01.add(r9);
        r5.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01be, code lost:
        r7 = r3.A06.A04(r4.getRawString());
        r8.A00 = 1;
        r0 = r10.A0H();
        r6 = r4.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d3, code lost:
        if (r7 != null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d5, code lost:
        r7 = "defaultThreadID";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d7, code lost:
        r2 = new X.C22791Qc(r0, r6, r7);
        r5.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e6, code lost:
        if (r2.A04.size() >= 500) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e8, code lost:
        r0 = r2.A04;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r2 = r32
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0c9c;
                case 1: goto L_0x0c8a;
                case 2: goto L_0x0c4c;
                case 3: goto L_0x0e0f;
                case 4: goto L_0x064a;
                case 5: goto L_0x05dc;
                case 6: goto L_0x0544;
                case 7: goto L_0x0dc5;
                case 8: goto L_0x0510;
                case 9: goto L_0x0b6a;
                case 10: goto L_0x0d88;
                case 11: goto L_0x04f9;
                case 12: goto L_0x0007;
                case 13: goto L_0x0007;
                case 14: goto L_0x04e2;
                case 15: goto L_0x0b51;
                case 16: goto L_0x04cc;
                case 17: goto L_0x0b25;
                case 18: goto L_0x0ad6;
                case 19: goto L_0x0aac;
                case 20: goto L_0x0d6b;
                case 21: goto L_0x0a80;
                case 22: goto L_0x0a61;
                case 23: goto L_0x0441;
                case 24: goto L_0x0424;
                case 25: goto L_0x0407;
                case 26: goto L_0x03ea;
                case 27: goto L_0x03cd;
                case 28: goto L_0x0a51;
                case 29: goto L_0x0394;
                case 30: goto L_0x0a3e;
                case 31: goto L_0x0366;
                case 32: goto L_0x09d6;
                case 33: goto L_0x0348;
                case 34: goto L_0x02fe;
                case 35: goto L_0x02d7;
                case 36: goto L_0x00c4;
                case 37: goto L_0x00af;
                case 38: goto L_0x0099;
                case 39: goto L_0x007d;
                case 40: goto L_0x0cc4;
                case 41: goto L_0x09c0;
                case 42: goto L_0x09a2;
                case 43: goto L_0x0744;
                case 44: goto L_0x072d;
                case 45: goto L_0x06fe;
                case 46: goto L_0x06f4;
                case 47: goto L_0x06b5;
                case 48: goto L_0x06a1;
                case 49: goto L_0x001c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r2.A00
            X.2qi r1 = (X.C55662qi) r1
            java.lang.Object r3 = r2.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r0 = r2.A02
            X.2w3 r0 = (X.C58932w3) r0
            X.2p9 r2 = r1.A0A
            int r1 = r0.A05
            r0 = 3
        L_0x0018:
            r2.A01(r3, r0, r1)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r7 = r2.A00
            X.2S6 r7 = (X.AnonymousClass2S6) r7
            java.lang.Object r6 = r2.A01
            X.34x r6 = (X.C624134x) r6
            java.lang.Object r5 = r2.A02
            X.3dV r0 = r7.A03
            X.4GK r8 = r0.get()
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0cbd }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0cbd }
            java.lang.String r3 = "SELECT business_owner_jid_row_id FROM business_message_forward_info WHERE message_row_id = ?"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0cbd }
            long r0 = r6.A1L     // Catch:{ all -> 0x0cbd }
            X.C18260x0.A1X(r2, r0)     // Catch:{ all -> 0x0cbd }
            java.lang.String r0 = "GET_BUSINESS_MESSAGE_FORWARD_INFO_FOR_MSG_ROW_ID_SQL"
            android.database.Cursor r2 = r4.A0E(r3, r0, r2)     // Catch:{ all -> 0x0cbd }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0cb6 }
            if (r0 == 0) goto L_0x0caf
            java.lang.String r0 = "business_owner_jid_row_id"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x0cb6 }
            long r3 = (long) r0     // Catch:{ all -> 0x0cb6 }
            r2.close()     // Catch:{ all -> 0x0cbd }
            r8.close()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001b
            X.34p r1 = r7.A02
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.UserJid r2 = X.C623334p.A02(r1, r0, r3)
            if (r2 == 0) goto L_0x0073
            X.3Ex r0 = r7.A01
            X.3ZH r1 = r0.A07(r2)
            X.2kg r0 = new X.2kg
            r0.<init>(r1, r2)
            r6.A1M(r0)
        L_0x0073:
            X.3Wi r2 = r7.A00
            r0 = 20
            X.3Zk r1 = X.C69983Zk.A00(r5, r0)
            goto L_0x0d84
        L_0x007d:
            java.lang.Object r0 = r2.A00
            X.5Mz r0 = (X.C103445Mz) r0
            java.lang.Object r5 = r2.A01
            X.5sj r5 = (X.C117935sj) r5
            java.lang.Object r4 = r2.A02
            java.lang.Object r3 = r5.call()     // Catch:{ 0nr -> 0x001b }
            android.os.Handler r2 = r0.A00     // Catch:{ 0nr -> 0x001b }
            r1 = 38
            X.3aK r0 = new X.3aK     // Catch:{ 0nr -> 0x001b }
            r0.<init>(r5, r4, r3, r1)     // Catch:{ 0nr -> 0x001b }
            r2.post(r0)     // Catch:{ 0nr -> 0x001b }
            goto L_0x0d08
        L_0x0099:
            java.lang.Object r0 = r2.A00
            X.5sj r0 = (X.C117935sj) r0
            java.lang.Object r3 = r2.A01
            X.658 r3 = (X.AnonymousClass658) r3
            java.lang.Object r1 = r2.A02
            X.0QU r0 = r0.A00
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x001b
            r3.BPS(r1)
            return
        L_0x00af:
            java.lang.Object r0 = r2.A00
            X.4Jc r0 = (X.C86174Jc) r0
            java.lang.Object r4 = r2.A01
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            java.lang.Object r5 = r2.A02
            X.2z0 r5 = (X.AnonymousClass2z0) r5
            r4.getRawString()
            java.lang.Object r3 = r0.A00
            X.2pf r3 = (X.C55022pf) r3
            r10 = 1
            goto L_0x00d8
        L_0x00c4:
            java.lang.Object r0 = r2.A00
            X.4Jc r0 = (X.C86174Jc) r0
            java.lang.Object r4 = r2.A01
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            java.lang.Object r5 = r2.A02
            X.2z0 r5 = (X.AnonymousClass2z0) r5
            r4.getRawString()
            java.lang.Object r3 = r0.A00
            X.2pf r3 = (X.C55022pf) r3
            r10 = 0
        L_0x00d8:
            X.1VX r2 = r3.A04
            r0 = 5535(0x159f, float:7.756E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0114
            r0 = 5536(0x15a0, float:7.758E-42)
            java.lang.String r1 = r2.A0R(r1, r0)
            java.lang.String r0 = "*"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00fe
            java.util.List r1 = X.C18310x6.A0t(r1)
            java.lang.String r0 = r4.user
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0114
        L_0x00fe:
            r3.A03()
            java.lang.String r0 = "ConversationSketchLogger/logSentMessageEvent logging"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2qz r0 = r3.A08
            X.34x r7 = r0.A05(r5)
            if (r7 != 0) goto L_0x0117
            java.lang.String r0 = "ConversationSketchLogger: logMessageEvent message is null"
        L_0x0110:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0114:
            java.lang.String r0 = "ConversationSketchLogger: logSentMessageEvent merchant is not allowed for logging"
            goto L_0x0110
        L_0x0117:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationSketchLogger: logMessageEvent message type: "
            r1.append(r0)
            byte r8 = r7.A1I
            X.C18260x0.A1F(r1, r8)
            java.lang.String r0 = r4.getRawString()
            X.1QW r5 = r3.A01(r0)
            X.1Qc r0 = r5.A00
            if (r0 != 0) goto L_0x02cf
            r0 = 0
        L_0x0132:
            int r6 = r0 + 1
            if (r10 == 0) goto L_0x02ca
            java.lang.String r2 = "sent"
        L_0x0139:
            r9 = 54
            r1 = 1
            if (r8 == 0) goto L_0x0286
            if (r8 == r1) goto L_0x02bd
            r0 = 2
            if (r8 == r0) goto L_0x02bd
            r0 = 3
            if (r8 == r0) goto L_0x02bd
            r0 = 9
            if (r8 == r0) goto L_0x02bd
            r0 = 20
            if (r8 == r0) goto L_0x02bd
            r0 = 23
            if (r8 == r0) goto L_0x02c3
            r0 = 32
            if (r8 == r0) goto L_0x027c
            r0 = 49
            if (r8 == r0) goto L_0x02c3
            r0 = 52
            if (r8 == r0) goto L_0x02c3
            r0 = 45
            if (r8 == r0) goto L_0x02c3
            r0 = 46
            if (r8 == r0) goto L_0x02c3
            if (r8 == r9) goto L_0x02c3
            r0 = 55
            if (r8 == r0) goto L_0x02c3
            switch(r8) {
                case 25: goto L_0x0278;
                case 26: goto L_0x0278;
                case 27: goto L_0x0278;
                case 28: goto L_0x0278;
                case 29: goto L_0x0278;
                case 30: goto L_0x0278;
                default: goto L_0x016f;
            }
        L_0x016f:
            if (r8 == r1) goto L_0x0274
            r0 = 2
            if (r8 == r0) goto L_0x0270
            r0 = 3
            if (r8 == r0) goto L_0x026b
            r0 = 5
            if (r8 == r0) goto L_0x0267
            r0 = 9
            if (r8 == r0) goto L_0x0263
            r0 = 20
            if (r8 == r0) goto L_0x025e
            r0 = 44
            if (r8 == r0) goto L_0x0259
            java.lang.String r0 = "unsupported"
        L_0x0189:
            X.1QX r8 = new X.1QX
            r8.<init>(r6, r2, r0)
        L_0x018e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationSketchLogger:logMessageEvent logging event : "
            r1.append(r0)
            org.json.JSONObject r0 = r8.A03()
            java.lang.String r0 = X.C18270x1.A0T(r0)
            X.C18260x0.A1J(r1, r0)
            X.2sH r10 = r3.A03
            long r11 = r10.A0H()
            X.1Qc r9 = r5.A00
            if (r9 == 0) goto L_0x01be
            long r1 = r9.A00
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r1 + r6
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0243
            java.util.List r0 = r5.A01
            r0.add(r9)
            r0 = 0
            r5.A00 = r0
        L_0x01be:
            X.30N r1 = r3.A06
            java.lang.String r0 = r4.getRawString()
            java.lang.String r7 = r1.A04(r0)
            r0 = 1
            r8.A00 = r0
            long r0 = r10.A0H()
            java.lang.String r6 = r4.getRawString()
            if (r7 != 0) goto L_0x01d7
            java.lang.String r7 = "defaultThreadID"
        L_0x01d7:
            X.1Qc r2 = new X.1Qc
            r2.<init>(r0, r6, r7)
            r5.A00 = r2
            java.util.List r0 = r2.A04
            int r1 = r0.size()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x023a
            java.util.List r0 = r2.A04
        L_0x01ea:
            r0.add(r8)
        L_0x01ed:
            java.lang.String r2 = r4.getRawString()
            android.content.SharedPreferences r0 = r3.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            org.json.JSONObject r0 = r5.A03()
            java.lang.String r0 = X.C18270x1.A0T(r0)
            X.C18270x1.A0j(r1, r2, r0)
            java.lang.String r2 = r4.getRawString()
            X.1QV r4 = r3.A02()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationSketchLogger:saveMerchantJIDToMerchantList merchantJID : "
            X.C18260x0.A0q(r0, r2, r1)
            java.util.List r0 = r4.A00
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x001b
            java.util.List r0 = r4.A00
            r0.add(r2)
            android.content.SharedPreferences r0 = r3.A00()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r1 = "merchant_jid_list"
            org.json.JSONObject r0 = r4.A03()
            java.lang.String r0 = X.C18270x1.A0T(r0)
            android.content.SharedPreferences$Editor r0 = r2.putString(r1, r0)
            goto L_0x0ed3
        L_0x023a:
            java.lang.Long r0 = r2.A01
            java.lang.Long r0 = X.AnonymousClass0x7.A0j(r0)
            r2.A01 = r0
            goto L_0x01ed
        L_0x0243:
            java.util.List r0 = r9.A04
            int r1 = r0.size()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x0250
            java.util.List r0 = r9.A04
            goto L_0x01ea
        L_0x0250:
            java.lang.Long r0 = r9.A01
            java.lang.Long r0 = X.AnonymousClass0x7.A0j(r0)
            r9.A01 = r0
            goto L_0x01ed
        L_0x0259:
            java.lang.String r0 = "order"
            goto L_0x0189
        L_0x025e:
            java.lang.String r0 = "sticker"
            goto L_0x0189
        L_0x0263:
            java.lang.String r0 = "document"
            goto L_0x0189
        L_0x0267:
            java.lang.String r0 = "location"
            goto L_0x0189
        L_0x026b:
            java.lang.String r0 = "video"
            goto L_0x0189
        L_0x0270:
            java.lang.String r0 = "audio"
            goto L_0x0189
        L_0x0274:
            java.lang.String r0 = "image"
            goto L_0x0189
        L_0x0278:
            java.lang.String r0 = "template_hsm"
            goto L_0x027f
        L_0x027c:
            java.lang.String r0 = "template_hsm_reply"
        L_0x027f:
            X.1QZ r8 = new X.1QZ
            r8.<init>(r7, r2, r0, r6)
            goto L_0x018e
        L_0x0286:
            X.2Ot r0 = X.C40802Hu.A01(r7)
            if (r0 != 0) goto L_0x02c3
            java.lang.String r0 = r7.A15
            if (r0 == 0) goto L_0x0295
            java.lang.String r0 = "payment"
            goto L_0x0189
        L_0x0295:
            if (r10 != 0) goto L_0x02a2
            X.34x r0 = r7.A0w()
            if (r0 == 0) goto L_0x02a2
            byte r0 = r0.A1I
            if (r0 != r9) goto L_0x02a2
            goto L_0x02c3
        L_0x02a2:
            r0 = r7
            X.1mW r0 = (X.C30481mW) r0
            java.lang.String r0 = r0.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02b6
            java.lang.String r0 = r7.A0y
            boolean r0 = X.C22771Qa.A00(r0)
            if (r0 != 0) goto L_0x02b6
            r1 = 0
        L_0x02b6:
            X.1QY r8 = new X.1QY
            r8.<init>(r6, r2, r1)
            goto L_0x018e
        L_0x02bd:
            X.2Ot r0 = X.C40802Hu.A01(r7)
            if (r0 == 0) goto L_0x016f
        L_0x02c3:
            X.1Qa r8 = new X.1Qa
            r8.<init>(r7, r2, r6)
            goto L_0x018e
        L_0x02ca:
            java.lang.String r2 = "received"
            goto L_0x0139
        L_0x02cf:
            java.util.List r0 = r0.A04
            int r0 = r0.size()
            goto L_0x0132
        L_0x02d7:
            java.lang.Object r4 = r2.A00
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r4 = (com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r4
            java.lang.Object r3 = r2.A01
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.Object r5 = r2.A02
            X.0Wx r5 = (X.C06270Wx) r5
            X.2sr r0 = r4.A00
            X.1RR r1 = X.C56972sr.A01(r0)
            X.3Ex r0 = r4.A01
            X.3ZH r3 = r0.A07(r3)
            if (r1 == 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r1)
            java.lang.String r2 = X.AnonymousClass36P.A03(r0)
            if (r2 == 0) goto L_0x001b
            goto L_0x0335
        L_0x02fe:
            java.lang.Object r4 = r2.A00
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r4 = (com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r4
            java.lang.Object r3 = r2.A01
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.Object r5 = r2.A02
            X.0Wx r5 = (X.C06270Wx) r5
            X.311 r1 = r4.A03
            r0 = r3
            X.1fH r0 = (X.C27981fH) r0
            java.lang.Boolean r1 = r1.A01(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0342
            X.2sr r0 = r4.A00
            X.1RR r1 = X.C56972sr.A01(r0)
            X.3Ex r0 = r4.A01
            X.3ZH r3 = r0.A07(r3)
            if (r1 == 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r1)
            java.lang.String r2 = X.AnonymousClass36P.A03(r0)
            if (r2 == 0) goto L_0x001b
        L_0x0335:
            boolean r0 = r3.A0R()
            X.1QS r1 = new X.1QS
            r1.<init>(r2, r0)
        L_0x033e:
            r5.A0G(r1)
            return
        L_0x0342:
            X.1QR r1 = new X.1QR
            r1.<init>(r3)
            goto L_0x033e
        L_0x0348:
            java.lang.Object r3 = r2.A00
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r3 = (com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r3
            java.lang.Object r1 = r2.A01
            X.4uZ r1 = (X.C95814uZ) r1
            java.lang.Object r2 = r2.A02
            X.0Wx r2 = (X.C06270Wx) r2
            X.3Ex r0 = r3.A01
            X.3ZH r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x001b
            X.5ZU r0 = r3.A02
            java.lang.String r0 = r0.A0N(r1)
            r2.A0G(r0)
            return
        L_0x0366:
            java.lang.Object r6 = r2.A00
            X.4uZ r6 = (X.C95814uZ) r6
            java.lang.Object r5 = r2.A01
            X.1QH r5 = (X.AnonymousClass1QH) r5
            java.lang.Object r4 = r2.A02
            X.34x r4 = (X.C624134x) r4
            if (r6 == 0) goto L_0x038a
            X.2sd r1 = r5.A06
            X.2sH r0 = r5.A02
            long r2 = r0.A0H()
            X.2z0 r0 = X.C56832sd.A00(r6, r1)
            X.1no r1 = new X.1no
            r1.<init>(r0, r2)
            X.3Lv r0 = r5.A04
            r0.A08(r1)
        L_0x038a:
            if (r4 == 0) goto L_0x001b
            long r1 = r4.A1L
            X.2W4 r0 = r5.A05
            r0.A00(r1)
            return
        L_0x0394:
            java.lang.Object r7 = r2.A00
            X.1Px r7 = (X.C22741Px) r7
            java.lang.Object r8 = r2.A01
            X.34x r8 = (X.C624134x) r8
            java.lang.Object r6 = r2.A02
            X.2eV r0 = r7.A07
            int r9 = r0.A00()
            X.2z0 r0 = r8.A1J
            X.4uZ r1 = r0.A00
            if (r1 == 0) goto L_0x001b
            X.2pk r0 = r7.A04
            X.3Ll r2 = r0.A06
            X.2sm r0 = r0.A01
            long r0 = r0.A07(r1)
            java.lang.String[] r5 = X.AnonymousClass0x9.A1Z()
            boolean r4 = X.AnonymousClass0x7.A1W(r5, r0)
            X.2sH r0 = r2.A00
            long r0 = r0.A0H()
            X.C18270x1.A1R(r5, r0)
            X.3dV r0 = r2.A03
            X.4GK r3 = r0.get()
            goto L_0x0d09
        L_0x03cd:
            java.lang.Object r1 = r2.A00
            X.573 r1 = (X.AnonymousClass573) r1
            java.lang.Object r3 = r2.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r2 = r2.A02
            X.1fJ r2 = (X.C27991fJ) r2
            X.33U r5 = r1.getCommunityWamEventHelper()
            boolean r0 = r3 instanceof X.C30341mI
            if (r0 == 0) goto L_0x03e8
            X.1mI r3 = (X.C30341mI) r3
        L_0x03e3:
            X.4Cd r0 = r1.getCommunityMembersManager()
            goto L_0x045b
        L_0x03e8:
            r3 = 0
            goto L_0x03e3
        L_0x03ea:
            java.lang.Object r1 = r2.A00
            X.572 r1 = (X.AnonymousClass572) r1
            java.lang.Object r3 = r2.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r2 = r2.A02
            X.1fJ r2 = (X.C27991fJ) r2
            X.33U r5 = r1.getCommunityWamEventHelper()
            boolean r0 = r3 instanceof X.C30341mI
            if (r0 == 0) goto L_0x0405
            X.1mI r3 = (X.C30341mI) r3
        L_0x0400:
            X.4Cd r0 = r1.getCommunityMembersManager()
            goto L_0x045b
        L_0x0405:
            r3 = 0
            goto L_0x0400
        L_0x0407:
            java.lang.Object r1 = r2.A00
            X.574 r1 = (X.AnonymousClass574) r1
            java.lang.Object r3 = r2.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r2 = r2.A02
            X.1fJ r2 = (X.C27991fJ) r2
            X.33U r5 = r1.getCommunityWamEventHelper()
            boolean r0 = r3 instanceof X.C30341mI
            if (r0 == 0) goto L_0x0422
            X.1mI r3 = (X.C30341mI) r3
        L_0x041d:
            X.4Cd r0 = r1.getCommunityMembersManager()
            goto L_0x045b
        L_0x0422:
            r3 = 0
            goto L_0x041d
        L_0x0424:
            java.lang.Object r1 = r2.A00
            X.571 r1 = (X.AnonymousClass571) r1
            java.lang.Object r3 = r2.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r2 = r2.A02
            X.1fJ r2 = (X.C27991fJ) r2
            X.33U r5 = r1.getCommunityWamEventHelper()
            boolean r0 = r3 instanceof X.C30341mI
            if (r0 == 0) goto L_0x043f
            X.1mI r3 = (X.C30341mI) r3
        L_0x043a:
            X.4Cd r0 = r1.getCommunityMembersManager()
            goto L_0x045b
        L_0x043f:
            r3 = 0
            goto L_0x043a
        L_0x0441:
            java.lang.Object r1 = r2.A00
            X.570 r1 = (X.AnonymousClass570) r1
            java.lang.Object r3 = r2.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r2 = r2.A02
            X.1fJ r2 = (X.C27991fJ) r2
            X.33U r5 = r1.getCommunityWamEventHelper()
            boolean r0 = r3 instanceof X.C30341mI
            if (r0 == 0) goto L_0x0481
            X.1mI r3 = (X.C30341mI) r3
        L_0x0457:
            X.4Cd r0 = r1.getCommunityMembersManager()
        L_0x045b:
            int r6 = r0.B9t(r2)
            java.lang.Integer r0 = X.AnonymousClass33U.A01(r6)
            if (r0 == 0) goto L_0x046f
            r2 = 1
            int r1 = r0.intValue()
            r0 = 15
            r5.A03(r0, r2, r1)
        L_0x046f:
            if (r3 == 0) goto L_0x001b
            X.2z0 r0 = r3.A1J
            X.4uZ r2 = r0.A00
            if (r2 == 0) goto L_0x001b
            int r1 = r3.A00
            r0 = 144(0x90, float:2.02E-43)
            if (r1 == r0) goto L_0x048b
            switch(r1) {
                case 122: goto L_0x048d;
                case 123: goto L_0x0489;
                case 124: goto L_0x048b;
                case 125: goto L_0x0487;
                case 126: goto L_0x0487;
                case 127: goto L_0x0485;
                case 128: goto L_0x0483;
                default: goto L_0x0480;
            }
        L_0x0480:
            return
        L_0x0481:
            r3 = 0
            goto L_0x0457
        L_0x0483:
            r0 = 6
            goto L_0x048e
        L_0x0485:
            r0 = 3
            goto L_0x048e
        L_0x0487:
            r0 = 5
            goto L_0x048e
        L_0x0489:
            r0 = 4
            goto L_0x048e
        L_0x048b:
            r0 = 2
            goto L_0x048e
        L_0x048d:
            r0 = 1
        L_0x048e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r4 == 0) goto L_0x001b
            r0 = 1
            if (r6 == r0) goto L_0x049b
            r0 = 2
            r3 = 2
            if (r6 != r0) goto L_0x049c
        L_0x049b:
            r3 = 1
        L_0x049c:
            X.2ss r1 = r5.A02
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass32V.A00(r2)
            int r1 = r1.A06(r0)
            r0 = 2
            if (r1 == r0) goto L_0x04b0
            r0 = 3
            if (r1 == r0) goto L_0x04ca
            r0 = 6
            r2 = 1
            if (r1 != r0) goto L_0x04b1
        L_0x04b0:
            r2 = 2
        L_0x04b1:
            X.1YD r1 = new X.1YD
            r1.<init>()
            r1.A01 = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A00 = r0
            X.4FV r0 = r5.A04
            r0.BhD(r1)
            return
        L_0x04ca:
            r2 = 3
            goto L_0x04b1
        L_0x04cc:
            java.lang.Object r3 = r2.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r2.A02
            X.34x r1 = (X.C624134x) r1
            X.67A r0 = X.AnonymousClass31N.A01(r0)
            if (r0 == 0) goto L_0x001b
            r0.Bks(r3, r1)
            return
        L_0x04e2:
            java.lang.Object r1 = r2.A00
            X.4oJ r1 = (X.C93314oJ) r1
            java.lang.Object r3 = r2.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r0 = r2.A02
            X.2w3 r0 = (X.C58932w3) r0
            X.2p9 r2 = r1.A1h
            int r1 = r0.A05
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            r0 = 4
            goto L_0x0018
        L_0x04f9:
            java.lang.Object r1 = r2.A00
            X.2qi r1 = (X.C55662qi) r1
            java.lang.Object r3 = r2.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r0 = r2.A02
            X.2w3 r0 = (X.C58932w3) r0
            X.2p9 r2 = r1.A0A
            int r1 = r0.A05
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            r0 = 5
            goto L_0x0018
        L_0x0510:
            java.lang.Object r3 = r2.A00
            X.5mB r3 = (X.C113905mB) r3
            java.lang.Object r6 = r2.A01
            X.2z0 r6 = (X.AnonymousClass2z0) r6
            java.lang.Object r4 = r2.A02
            X.4uZ r4 = (X.C95814uZ) r4
            boolean r0 = r3.A09(r6)
            if (r0 == 0) goto L_0x001b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatMessageCounts/onChatMessageRevoked jid:"
            X.C18260x0.A1R(r1, r0, r4)
            r3.A02()
            r5 = 0
            r8 = 1
            X.2qz r0 = r3.A0a
            X.34x r0 = r0.A05(r6)
            if (r0 == 0) goto L_0x053d
            int r0 = r0.A05
            r9 = 1
            if (r0 > 0) goto L_0x053e
        L_0x053d:
            r9 = 0
        L_0x053e:
            r7 = r5
            r10 = r8
            r3.A07(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0544:
            java.lang.Object r4 = r2.A00
            X.5mB r4 = (X.C113905mB) r4
            java.lang.Object r3 = r2.A01
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r1 = r2.A02
            java.util.Collection r1 = (java.util.Collection) r1
            int r0 = r3.size()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x055d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x059f
            X.34x r1 = X.C18300x5.A0T(r6)
            X.2z0 r0 = r1.A1J
            X.4uZ r5 = r0.A00
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x055d
            int r1 = r1.A0D
            r0 = 16
            if (r1 == r0) goto L_0x055d
            r0 = 18
            if (r1 == r0) goto L_0x055d
            r0 = 17
            if (r1 == r0) goto L_0x055d
            r0 = 9
            if (r1 == r0) goto L_0x055d
            r0 = 10
            if (r1 == r0) goto L_0x055d
            boolean r0 = r3.containsKey(r5)
            if (r0 == 0) goto L_0x055d
            boolean r0 = r2.containsKey(r5)
            r1 = 1
            if (r0 == 0) goto L_0x059b
            java.lang.Object r0 = r2.get(r5)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r1 = r1 + r0
        L_0x059b:
            X.AnonymousClass0x2.A1I(r5, r2, r1)
            goto L_0x055d
        L_0x059f:
            android.content.SharedPreferences r6 = r4.A01()
            java.util.Iterator r5 = X.AnonymousClass001.A0u(r2)
        L_0x05a7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x001b
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r5)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass0x9.A0R(r1)
            java.lang.String r4 = r0.getRawString()
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r6.getString(r4, r0)
            X.5XM r3 = X.AnonymousClass5XM.A00(r0)
            java.lang.Long r2 = r3.A0M
            int r0 = X.AnonymousClass0x2.A08(r1)
            long r0 = (long) r0
            java.lang.Long r0 = X.C624334z.A03(r2, r0)
            r3.A0M = r0
            android.content.SharedPreferences$Editor r1 = r6.edit()
            java.lang.String r0 = r3.toString()
            X.C18270x1.A0j(r1, r4, r0)
            goto L_0x05a7
        L_0x05dc:
            java.lang.Object r4 = r2.A00
            X.5mB r4 = (X.C113905mB) r4
            java.lang.Object r5 = r2.A01
            X.4uZ r5 = (X.C95814uZ) r5
            java.lang.Object r7 = r2.A02
            X.2z0 r7 = (X.AnonymousClass2z0) r7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatMessageCounts/onChatMessagesSent jid:"
            X.C18260x0.A1R(r1, r0, r5)
            r4.A02()
            r6 = 0
            r9 = 1
            X.2qz r1 = r4.A0a
            X.34x r0 = r1.A05(r7)
            if (r0 == 0) goto L_0x0603
            int r0 = r0.A05
            r10 = 1
            if (r0 > 0) goto L_0x0604
        L_0x0603:
            r10 = 0
        L_0x0604:
            boolean r11 = r4.A09(r7)
            r8 = r6
            r4.A07(r5, r6, r7, r8, r9, r10, r11)
            X.34x r3 = r1.A05(r7)
            if (r3 == 0) goto L_0x001b
            X.7am r7 = r4.A06
            r12 = 0
            X.2z0 r0 = r3.A1J
            X.4uZ r8 = r0.A00
            X.34x r2 = r3.A0w()
            if (r8 == 0) goto L_0x001b
            X.34q r1 = r7.A00
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x001b
            X.2rV r0 = r1.A05
            java.util.List r1 = r0.A04(r8, r9, r12, r12)
            boolean r0 = X.C18310x6.A1X(r1)
            if (r0 == 0) goto L_0x0648
            X.34x r9 = X.C18320x8.A0R(r1, r12)
        L_0x0637:
            if (r2 == 0) goto L_0x0641
            X.2qz r1 = r7.A0E
            X.2z0 r0 = r2.A1J
            X.34x r6 = r1.A05(r0)
        L_0x0641:
            byte r11 = r3.A1I
            r10 = r6
            r7.A01(r8, r9, r10, r11, r12)
            return
        L_0x0648:
            r9 = 0
            goto L_0x0637
        L_0x064a:
            java.lang.Object r5 = r2.A00
            X.5mB r5 = (X.C113905mB) r5
            java.lang.Object r4 = r2.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r8 = r2.A02
            X.2z0 r8 = (X.AnonymousClass2z0) r8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatMessageCounts/onChatMessagesSent jids:"
            X.C18260x0.A1R(r1, r0, r4)
            r5.A02()
            X.4uZ r0 = r8.A00
            boolean r0 = r0 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x069f
            X.2qz r0 = r5.A0a
            X.34x r3 = r0.A05(r8)
        L_0x066e:
            java.util.Iterator r2 = r4.iterator()
        L_0x0672:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            com.whatsapp.jid.UserJid r6 = X.C18310x6.A0T(r2)
            r7 = 0
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x0696
            java.util.Map r1 = r3.A1A
            if (r1 == 0) goto L_0x0696
            com.whatsapp.jid.DeviceJid r0 = r6.getPrimaryDevice()
            java.lang.Object r0 = r1.get(r0)
            X.3Z2 r0 = (X.AnonymousClass3Z2) r0
            if (r0 == 0) goto L_0x0696
            int r0 = r0.expiration
            if (r0 <= 0) goto L_0x0696
            r11 = 1
        L_0x0696:
            boolean r12 = r5.A09(r8)
            r9 = r7
            r5.A07(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0672
        L_0x069f:
            r3 = 0
            goto L_0x066e
        L_0x06a1:
            java.lang.Object r1 = r2.A00
            X.2sJ r1 = (X.C56632sJ) r1
            java.lang.Object r0 = r2.A01
            X.34x r0 = (X.C624134x) r0
            java.lang.Object r2 = r2.A02
            X.0Qw r1 = r1.A00
            java.lang.Long r0 = X.C624134x.A0A(r0)
            r1.A08(r0, r2)
            return
        L_0x06b5:
            java.lang.Object r0 = r2.A00
            X.2f0 r0 = (X.C48502f0) r0
            java.lang.Object r4 = r2.A01
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            java.lang.Object r3 = r2.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            X.2Vx r0 = r0.A01
            java.util.HashMap r1 = r0.A00
            r1.size()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.util.Iterator r1 = X.C18290x4.A10(r0)
        L_0x06d1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06f0
            java.lang.Object r0 = r1.next()
            X.2ZX r0 = (X.AnonymousClass2ZX) r0
            int r2 = r0.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 < r0) goto L_0x06d1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "backupencryption/received/error "
            X.C18260x0.A0z(r0, r1, r2)
            r4.run()
            return
        L_0x06f0:
            r3.run()
            return
        L_0x06f4:
            java.lang.Object r0 = r2.A00
            X.3XF r0 = (X.AnonymousClass3XF) r0
            X.8qC r0 = r0.A01
            r0.get()
            return
        L_0x06fe:
            java.lang.Object r0 = r2.A00
            X.33n r0 = (X.C621133n) r0
            java.lang.Object r4 = r2.A01
            X.2ov r4 = (X.C54562ov) r4
            java.lang.Object r1 = r2.A02
            byte[] r1 = (byte[]) r1
            X.2pw r3 = r0.A0G
            monitor-enter(r3)
            X.2wr r0 = new X.2wr     // Catch:{ IOException -> 0x0716 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0716 }
            r3.A04(r0, r4)     // Catch:{ IOException -> 0x0716 }
            goto L_0x0728
        L_0x0716:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x072a }
            java.lang.String r0 = "axolotl storeSession for "
            r1.append(r0)     // Catch:{ all -> 0x072a }
            r1.append(r4)     // Catch:{ all -> 0x072a }
            java.lang.String r0 = " failed to update"
            X.C18260x0.A15(r0, r1, r2)     // Catch:{ all -> 0x072a }
        L_0x0728:
            monitor-exit(r3)     // Catch:{ all -> 0x072a }
            return
        L_0x072a:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x072a }
            throw r1
        L_0x072d:
            java.lang.Object r0 = r2.A00
            X.33n r0 = (X.C621133n) r0
            java.lang.Object r3 = r2.A01
            X.2ov r3 = (X.C54562ov) r3
            java.lang.Object r1 = r2.A02
            X.2wr r1 = (X.C59402wr) r1
            X.2pw r0 = r0.A0G
            monitor-enter(r0)
            r0.A04(r1, r3)     // Catch:{ all -> 0x0741 }
            monitor-exit(r0)     // Catch:{ all -> 0x0741 }
            return
        L_0x0741:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0741 }
            throw r1
        L_0x0744:
            java.lang.Object r4 = r2.A00
            com.whatsapp.crop.CropImage r4 = (com.whatsapp.crop.CropImage) r4
            java.lang.Object r1 = r2.A01
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r9 = r2.A02
            android.graphics.Point r9 = (android.graphics.Point) r9
            java.lang.String r7 = "x"
            android.net.Uri r5 = r1.getData()
            X.33i r0 = r4.A0I     // Catch:{ IOException -> 0x0994 }
            X.5UR r0 = r0.A0R()     // Catch:{ IOException -> 0x0994 }
            int r0 = X.C107655bf.A0B(r5, r0)     // Catch:{ IOException -> 0x0994 }
            r4.A02 = r0     // Catch:{ IOException -> 0x0994 }
            android.graphics.Matrix r3 = X.C107655bf.A0J(r0)     // Catch:{ IOException -> 0x0994 }
            r4.A0D = r3     // Catch:{ IOException -> 0x0994 }
            boolean r0 = r4.A0W     // Catch:{ IOException -> 0x0994 }
            if (r0 == 0) goto L_0x077e
            int r2 = r4.A02     // Catch:{ IOException -> 0x0994 }
            r0 = 6
            if (r2 == r0) goto L_0x0776
            r0 = 8
            if (r2 != r0) goto L_0x077e
        L_0x0776:
            int r2 = r4.A00     // Catch:{ IOException -> 0x0994 }
            int r0 = r4.A01     // Catch:{ IOException -> 0x0994 }
            r4.A00 = r0     // Catch:{ IOException -> 0x0994 }
            r4.A01 = r2     // Catch:{ IOException -> 0x0994 }
        L_0x077e:
            if (r3 != 0) goto L_0x0787
            android.graphics.Matrix r0 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0994 }
            r0.<init>()     // Catch:{ IOException -> 0x0994 }
            r4.A0D = r0     // Catch:{ IOException -> 0x0994 }
        L_0x0787:
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0994 }
            r10.<init>()     // Catch:{ IOException -> 0x0994 }
            X.53r r0 = r4.A0Q     // Catch:{ IOException -> 0x0994 }
            r6 = 1
            java.io.InputStream r3 = r0.A0G(r5, r6)     // Catch:{ IOException -> 0x0994 }
            r2 = 1
            r10.inJustDecodeBounds = r6     // Catch:{ all -> 0x098a }
            r0 = 0
            android.graphics.BitmapFactory.decodeStream(r3, r0, r10)     // Catch:{ all -> 0x098a }
            int r0 = r10.outWidth     // Catch:{ all -> 0x098a }
            java.lang.String r8 = "cropimage/not-a-image"
            if (r0 <= 0) goto L_0x0979
            int r0 = r10.outHeight     // Catch:{ all -> 0x098a }
            if (r0 <= 0) goto L_0x0979
            r3.close()     // Catch:{ IOException -> 0x0994 }
            X.53r r0 = r4.A0Q     // Catch:{ OutOfMemoryError -> 0x0968 }
            java.io.InputStream r5 = r0.A0G(r5, r6)     // Catch:{ OutOfMemoryError -> 0x0968 }
            r10.inDither = r6     // Catch:{ all -> 0x095e }
            r14 = 0
            r10.inScaled = r14     // Catch:{ all -> 0x095e }
            int r12 = r9.x     // Catch:{ all -> 0x095e }
            int r13 = r9.y     // Catch:{ all -> 0x095e }
            X.1VX r3 = r4.A01     // Catch:{ all -> 0x095e }
            android.view.WindowManager r0 = r4.getWindowManager()     // Catch:{ all -> 0x095e }
            java.lang.Long r11 = X.AnonymousClass29J.A00(r0, r3)     // Catch:{ all -> 0x095e }
            X.5WB r9 = new X.5WB     // Catch:{ all -> 0x095e }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x095e }
            r0 = 0
            X.7KE r0 = X.C107245ax.A04(r0, r9, r5, r14)     // Catch:{ all -> 0x095e }
            android.graphics.Bitmap r0 = r0.A02     // Catch:{ all -> 0x095e }
            r4.A0B = r0     // Catch:{ all -> 0x095e }
            int r6 = r10.inSampleSize     // Catch:{ all -> 0x095e }
            r4.A09 = r6     // Catch:{ all -> 0x095e }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x095e }
            java.lang.String r0 = "crop/oncreate/bitmap orientation:"
            r3.append(r0)     // Catch:{ all -> 0x095e }
            int r0 = r4.A02     // Catch:{ all -> 0x095e }
            r3.append(r0)     // Catch:{ all -> 0x095e }
            X.AnonymousClass001.A1L(r3)     // Catch:{ all -> 0x095e }
            int r0 = r10.outWidth     // Catch:{ all -> 0x095e }
            r3.append(r0)     // Catch:{ all -> 0x095e }
            r3.append(r7)     // Catch:{ all -> 0x095e }
            int r0 = r10.outHeight     // Catch:{ all -> 0x095e }
            r3.append(r0)     // Catch:{ all -> 0x095e }
            java.lang.String r0 = " sample:"
            X.C18260x0.A0y(r0, r3, r6)     // Catch:{ all -> 0x095e }
            android.graphics.Rect r6 = r4.A0E     // Catch:{ all -> 0x095e }
            if (r6 == 0) goto L_0x080f
            int r0 = r6.left     // Catch:{ all -> 0x095e }
            int r3 = r4.A09     // Catch:{ all -> 0x095e }
            int r0 = r0 / r3
            r6.left = r0     // Catch:{ all -> 0x095e }
            int r0 = r6.top     // Catch:{ all -> 0x095e }
            int r0 = r0 / r3
            r6.top = r0     // Catch:{ all -> 0x095e }
            int r0 = r6.right     // Catch:{ all -> 0x095e }
            int r0 = r0 / r3
            r6.right = r0     // Catch:{ all -> 0x095e }
            int r0 = r6.bottom     // Catch:{ all -> 0x095e }
            int r0 = r0 / r3
            r6.bottom = r0     // Catch:{ all -> 0x095e }
        L_0x080f:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x095e }
            java.lang.String r0 = "crop/oncreate/bitmap:"
            r6.append(r0)     // Catch:{ all -> 0x095e }
            android.graphics.Bitmap r0 = r4.A0B     // Catch:{ all -> 0x095e }
            if (r0 != 0) goto L_0x0823
            java.lang.String r0 = "null"
        L_0x081f:
            X.C18260x0.A1L(r6, r0)     // Catch:{ all -> 0x095e }
            goto L_0x083c
        L_0x0823:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x095e }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x095e }
            r3.append(r0)     // Catch:{ all -> 0x095e }
            r3.append(r7)     // Catch:{ all -> 0x095e }
            android.graphics.Bitmap r0 = r4.A0B     // Catch:{ all -> 0x095e }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x095e }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ all -> 0x095e }
            goto L_0x081f
        L_0x083c:
            r5.close()     // Catch:{ OutOfMemoryError -> 0x0968 }
            android.graphics.Bitmap r0 = r4.A0B
            if (r0 == 0) goto L_0x0953
            int r0 = r0.getWidth()
            if (r0 == 0) goto L_0x0953
            android.graphics.Bitmap r0 = r4.A0B
            int r0 = r0.getHeight()
            if (r0 == 0) goto L_0x0953
            java.lang.String r0 = "rotation"
            int r6 = r1.getIntExtra(r0, r14)
            java.lang.String r0 = "flipH"
            boolean r8 = r1.getBooleanExtra(r0, r14)
            java.lang.String r0 = "flipV"
            boolean r7 = r1.getBooleanExtra(r0, r14)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "crop/oncreate/bitmap add-rotation:"
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = " flip-h:"
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = " flip-v:"
            X.C18260x0.A1E(r0, r3, r7)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r4.A0C = r0
            r5 = 9
            if (r8 == 0) goto L_0x089a
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float[] r0 = new float[r5]
            r0 = {-1082130432, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            r3.setValues(r0)
            android.graphics.Matrix r0 = r4.A0C
            r0.postConcat(r3)
        L_0x089a:
            if (r7 == 0) goto L_0x08ae
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float[] r0 = new float[r5]
            r0 = {1065353216, 0, 0, 0, -1082130432, 0, 0, 0, 1065353216} // fill-array
            r3.setValues(r0)
            android.graphics.Matrix r0 = r4.A0C
            r0.postConcat(r3)
        L_0x08ae:
            if (r6 == 0) goto L_0x08b6
            android.graphics.Matrix r3 = r4.A0C
            float r0 = (float) r6
            r3.postRotate(r0)
        L_0x08b6:
            android.graphics.Matrix r3 = r4.A0C
            int r0 = r4.A08
            float r0 = (float) r0
            r3.postRotate(r0)
            android.graphics.Bitmap r0 = r4.A0B
            X.2Xw r6 = new X.2Xw
            r6.<init>(r0)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            android.graphics.Matrix r0 = r4.A0D
            r3.set(r0)
            android.graphics.Matrix r0 = r4.A0C
            r3.postConcat(r0)
            r6.A01 = r3
            java.lang.String r0 = "filter"
            int r5 = r1.getIntExtra(r0, r14)
            if (r5 == 0) goto L_0x08ea
            android.graphics.Bitmap r3 = r4.A0B
            X.6i2 r0 = r4.A0N
            android.graphics.Bitmap r0 = com.whatsapp.filter.FilterUtils.A00(r3, r0, r5, r14)
            r4.A0B = r0
            r6.A00 = r0
        L_0x08ea:
            java.lang.String r0 = "doodle"
            java.lang.String r5 = r1.getStringExtra(r0)
            if (r5 == 0) goto L_0x093c
            X.5Y0 r3 = r4.A0O
            X.33j r1 = r4.A00
            X.33O r0 = r4.A0P
            X.5aV r5 = X.C106985aV.A03(r4, r1, r3, r0, r5)
            if (r5 == 0) goto L_0x093c
            android.graphics.Bitmap r0 = r4.A0B
            boolean r0 = r0.isMutable()
            if (r0 != 0) goto L_0x0912
            android.graphics.Bitmap r1 = r4.A0B
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = r1.copy(r0, r2)
            r4.A0B = r0
            r6.A00 = r0
        L_0x0912:
            android.graphics.Bitmap r3 = r4.A0B
            int r9 = r5.A00
            android.graphics.Matrix r1 = r6.A01
            r11 = 0
            if (r1 == 0) goto L_0x0933
            r0 = 2
            float[] r10 = new float[r0]
            r10 = {0, 1065353216} // fill-array
            r1.mapVectors(r10)
            r2 = r10[r14]
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0949
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r11 = 270(0x10e, float:3.78E-43)
            if (r0 <= 0) goto L_0x0933
            r11 = 90
        L_0x0933:
            int r9 = r9 + r11
            int r0 = r4.A08
            int r9 = r9 + r0
            int r0 = r9 % 360
            r5.A07(r3, r0, r8, r7)
        L_0x093c:
            X.3Wi r2 = r4.A0G
            r0 = 42
            X.5rT r1 = new X.5rT
            r1.<init>(r4, r0, r6)
        L_0x0945:
            r2.A0S(r1)
            return
        L_0x0949:
            r0 = 1
            r0 = r10[r0]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0933
            r11 = 180(0xb4, float:2.52E-43)
            goto L_0x0933
        L_0x0953:
            com.whatsapp.util.Log.e((java.lang.String) r8)
            X.3Wi r2 = r4.A0G
            r0 = 7
            X.3Zk r1 = X.C69983Zk.A00(r4, r0)
            goto L_0x0945
        L_0x095e:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0963 }
            goto L_0x0967
        L_0x0963:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x0968 }
        L_0x0967:
            throw r1     // Catch:{ OutOfMemoryError -> 0x0968 }
        L_0x0968:
            r1 = move-exception
            java.lang.String r0 = "cropimage/oom"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0994 }
            X.3Wi r1 = r4.A0G     // Catch:{ IOException -> 0x0994 }
            r0 = 6
            X.3Zk r0 = X.C69983Zk.A00(r4, r0)     // Catch:{ IOException -> 0x0994 }
            r1.A0S(r0)     // Catch:{ IOException -> 0x0994 }
            return
        L_0x0979:
            com.whatsapp.util.Log.e((java.lang.String) r8)     // Catch:{ all -> 0x098a }
            X.3Wi r1 = r4.A0G     // Catch:{ all -> 0x098a }
            r0 = 5
            X.3Zk r0 = X.C69983Zk.A00(r4, r0)     // Catch:{ all -> 0x098a }
            r1.A0S(r0)     // Catch:{ all -> 0x098a }
            r3.close()     // Catch:{ IOException -> 0x0994 }
            return
        L_0x098a:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x098f }
            goto L_0x0993
        L_0x098f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0994 }
        L_0x0993:
            throw r1     // Catch:{ IOException -> 0x0994 }
        L_0x0994:
            r3 = move-exception
            X.3Wi r2 = r4.A0G
            r1 = 41
            X.5rT r0 = new X.5rT
            r0.<init>(r4, r1, r3)
            r2.A0S(r0)
            return
        L_0x09a2:
            java.lang.Object r6 = r2.A00
            X.5XH r6 = (X.AnonymousClass5XH) r6
            java.lang.Object r5 = r2.A01
            X.4uZ r5 = (X.C95814uZ) r5
            java.lang.Object r0 = r2.A02
            long r3 = X.C18310x6.A0B(r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x09bc
            X.2sH r0 = r6.A05
            long r3 = r0.A0H()
        L_0x09bc:
            r6.A01(r5, r3)
            return
        L_0x09c0:
            java.lang.Object r3 = r2.A00
            X.5XH r3 = (X.AnonymousClass5XH) r3
            java.lang.Object r4 = r2.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r5 = r2.A02
            X.2sA r0 = r3.A06
            java.lang.Long r6 = r0.A00(r4)
            X.3Wi r0 = r3.A01
            r7 = 42
            goto L_0x0a77
        L_0x09d6:
            java.lang.Object r1 = r2.A00
            X.4VP r1 = (X.AnonymousClass4VP) r1
            java.lang.Object r3 = r2.A01
            X.2du r3 = (X.C47842du) r3
            java.lang.Object r0 = r2.A02
            X.34x r0 = (X.C624134x) r0
            X.08M r7 = r1.A04
            X.2z0 r9 = r0.A1J
            X.C162457s7.A0C(r9)
            r8 = 0
            X.4uZ r1 = r9.A00
            r6 = 0
            if (r1 == 0) goto L_0x0a3a
            X.3dV r0 = r3.A00
            X.4GK r5 = r0.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0a30 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0a30 }
            java.lang.String r3 = "SELECT COUNT(*) AS count  FROM message_bot_feedback WHERE bot_feedback_key_remote_jid = ? AND bot_feedback_key_from_me = ? AND bot_feedback_key_id = ?"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x0a30 }
            X.C18280x3.A0w(r1, r2, r8)     // Catch:{ all -> 0x0a30 }
            java.lang.String r1 = X.AnonymousClass2z0.A08(r9)     // Catch:{ all -> 0x0a30 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0a30 }
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x0a30 }
            X.C162457s7.A0C(r1)     // Catch:{ all -> 0x0a30 }
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x0a30 }
            java.lang.String r0 = "COUNT_BOT_FEEDBACK_FOR_MESSAGE"
            android.database.Cursor r2 = r4.A0E(r3, r0, r2)     // Catch:{ all -> 0x0a30 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0a29 }
            if (r0 == 0) goto L_0x0a25
            int r0 = X.AnonymousClass0x2.A03(r2)     // Catch:{ all -> 0x0a29 }
            if (r0 <= 0) goto L_0x0a25
            r6 = 1
        L_0x0a25:
            r2.close()     // Catch:{ all -> 0x0a30 }
            goto L_0x0a37
        L_0x0a29:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0a2b }
        L_0x0a2b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0a30 }
            throw r0     // Catch:{ all -> 0x0a30 }
        L_0x0a30:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0a32 }
        L_0x0a32:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r5, r0)
            throw r1
        L_0x0a37:
            r5.close()
        L_0x0a3a:
            X.C06270Wx.A05(r7, r6)
            return
        L_0x0a3e:
            java.lang.Object r0 = r2.A00
            X.1Q2 r0 = (X.AnonymousClass1Q2) r0
            java.lang.Object r3 = r2.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r2 = r2.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1 = 0
            X.2Yd r0 = r0.A04
            r0.A00(r3, r2, r1)
            return
        L_0x0a51:
            java.lang.Object r3 = r2.A00
            X.67A r3 = (X.AnonymousClass67A) r3
            java.lang.Object r1 = r2.A01
            X.5dY r1 = (X.C108785dY) r1
            java.lang.Object r0 = r2.A02
            X.34x r0 = (X.C624134x) r0
            r3.BlY(r0, r1)
            return
        L_0x0a61:
            java.lang.Object r3 = r2.A00
            X.4oL r3 = (X.C93334oL) r3
            java.lang.Object r4 = r2.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r5 = r2.A02
            X.5kg r0 = r3.A00
            X.3Ex r0 = r0.A0C
            X.3ZH r6 = r0.A0A(r4)
            X.3Wi r0 = r3.A05
            r7 = 36
        L_0x0a77:
            X.3cM r2 = new X.3cM
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r7)
            r0.A0S(r2)
            return
        L_0x0a80:
            java.lang.Object r5 = r2.A00
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r5 = (com.whatsapp.conversation.conversationrow.MediaTimeDisplay) r5
            java.lang.Object r4 = r2.A01
            X.0Wx r4 = (X.C06270Wx) r4
            java.lang.Object r3 = r2.A02
            X.0Wx r3 = (X.C06270Wx) r3
            r0 = 0
            r5.A02 = r0
            r5.A06 = r0
            X.5Jo r2 = r5.A03
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0aa1
            r0 = 0
            r2.A01 = r0
            android.os.Handler r1 = r2.A03
            java.lang.Runnable r0 = r2.A00
            r1.removeCallbacks(r0)
        L_0x0aa1:
            X.0sC r0 = r5.A09
            r4.A0F(r0)
            X.0sC r0 = r5.A0A
            r3.A0F(r0)
            return
        L_0x0aac:
            java.lang.Object r1 = r2.A00
            X.1Pd r1 = (X.C22681Pd) r1
            java.lang.Object r0 = r2.A01
            X.1mX r0 = (X.C30491mX) r0
            java.lang.Object r10 = r2.A02
            X.1fJ r10 = (X.C27991fJ) r10
            X.2sH r6 = r1.A1E
            android.content.Context r2 = r1.getContext()
            X.3Wi r3 = r1.A0X
            long r12 = r0.A1L
            X.66r r4 = r1.A00
            X.2sW r7 = r1.A01
            X.2qK r9 = r1.A04
            X.2rn r8 = r1.A03
            r11 = 21
            X.8qC r0 = r1.A2B
            X.3LB r5 = X.C48062eH.A00(r0)
            X.AnonymousClass36T.A04(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0ad6:
            java.lang.Object r4 = r2.A00
            X.4oJ r4 = (X.C93314oJ) r4
            java.lang.Object r0 = r2.A01
            java.lang.Object r1 = r2.A02
            X.34x r1 = (X.C624134x) r1
            if (r0 != 0) goto L_0x0aec
            X.3Wi r2 = r4.A0X
            r1 = 2131890107(0x7f120fbb, float:1.9414896E38)
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x0aec:
            java.util.ArrayList r3 = X.C18300x5.A0s(r0)
            X.5rC r0 = r4.A0S
            r0.A04()
            r4.getContext()
            X.2z0 r0 = r1.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x0b16
            X.59G r2 = X.AnonymousClass59G.A0P
            r1 = 26
        L_0x0b06:
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            X.6eV r0 = new X.6eV
            r0.<init>(r2, r3, r1)
            java.lang.String r0 = "launchAdsCreationExperience"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0g(r0)
            throw r1
        L_0x0b16:
            boolean r0 = r1 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x0b22
            X.59G r2 = X.AnonymousClass59G.A0O
        L_0x0b1c:
            r1 = -1
            if (r0 == 0) goto L_0x0b06
            r1 = 27
            goto L_0x0b06
        L_0x0b22:
            X.59G r2 = X.AnonymousClass59G.A0i
            goto L_0x0b1c
        L_0x0b25:
            java.lang.Object r1 = r2.A00
            X.1PT r1 = (X.AnonymousClass1PT) r1
            java.lang.Object r0 = r2.A01
            X.1mI r0 = (X.C30341mI) r0
            java.lang.Object r10 = r2.A02
            X.1fJ r10 = (X.C27991fJ) r10
            X.2sH r6 = r1.A1E
            android.content.Context r2 = r1.getContext()
            X.3Wi r3 = r1.A0X
            X.1o5 r0 = (X.C31311o5) r0
            long r12 = r0.A01
            X.66r r4 = r1.A04
            X.2sW r7 = r1.A0D
            X.2qK r9 = r1.A0F
            X.2rn r8 = r1.A0E
            r11 = 8
            X.8qC r0 = r1.A2B
            X.3LB r5 = X.C48062eH.A00(r0)
            X.AnonymousClass36T.A04(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0b51:
            java.lang.Object r1 = r2.A00
            X.4oJ r1 = (X.C93314oJ) r1
            java.lang.Object r3 = r2.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r2.A02
            android.content.Intent r2 = (android.content.Intent) r2
            X.2Wn r0 = r1.A1m
            r0.A00()
            X.5hX r1 = r1.A0V
            java.lang.String r0 = "ConversationRow"
            r1.A0C(r3, r2, r0)
            return
        L_0x0b6a:
            java.lang.Object r15 = r2.A00
            X.5mB r15 = (X.C113905mB) r15
            java.lang.Object r3 = r2.A01
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            java.lang.Object r1 = r2.A02
            X.3ZF r1 = (X.AnonymousClass3ZF) r1
            r15.A02()
            X.39J r0 = r1.A0E
            boolean r0 = r0.A03
            r31 = r0
            boolean r0 = r1.A0L
            r30 = r0
            int r0 = r1.A01
            r16 = r0
            monitor-enter(r15)
            android.content.SharedPreferences r29 = r15.A01()     // Catch:{ all -> 0x0c49 }
            java.lang.String r28 = r3.getRawString()     // Catch:{ all -> 0x0c49 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r28)     // Catch:{ all -> 0x0c49 }
            java.lang.String r14 = "_voip"
            java.lang.String r2 = X.AnonymousClass000.A0X(r14, r0)     // Catch:{ all -> 0x0c49 }
            java.lang.String r1 = "0,0,0,0,0,0,0,0,0,0,0"
            r0 = r29
            java.lang.String r0 = r0.getString(r2, r1)     // Catch:{ all -> 0x0c49 }
            java.lang.String[] r11 = X.C18320x8.A1b(r0)     // Catch:{ all -> 0x0c49 }
            r0 = 0
            long r8 = X.C624334z.A00(r11, r0)     // Catch:{ all -> 0x0c49 }
            r0 = 1
            long r6 = X.C624334z.A00(r11, r0)     // Catch:{ all -> 0x0c49 }
            r0 = 2
            long r4 = X.C624334z.A00(r11, r0)     // Catch:{ all -> 0x0c49 }
            r0 = 3
            long r2 = X.C624334z.A00(r11, r0)     // Catch:{ all -> 0x0c49 }
            r0 = 4
            long r0 = X.C624334z.A00(r11, r0)     // Catch:{ all -> 0x0c49 }
            r10 = 5
            long r12 = X.C624334z.A00(r11, r10)     // Catch:{ all -> 0x0c49 }
            r10 = 6
            long r26 = X.C624334z.A00(r11, r10)     // Catch:{ all -> 0x0c49 }
            r10 = 7
            long r24 = X.C624334z.A00(r11, r10)     // Catch:{ all -> 0x0c49 }
            r10 = 8
            long r22 = X.C624334z.A00(r11, r10)     // Catch:{ all -> 0x0c49 }
            r10 = 9
            long r20 = X.C624334z.A00(r11, r10)     // Catch:{ all -> 0x0c49 }
            r10 = 10
            long r18 = X.C624334z.A00(r11, r10)     // Catch:{ all -> 0x0c49 }
            r10 = r16
            long r10 = (long) r10     // Catch:{ all -> 0x0c49 }
            r16 = 1
            if (r31 == 0) goto L_0x0bf1
            long r8 = r8 + r16
            if (r30 == 0) goto L_0x0bee
            long r2 = r2 + r16
            goto L_0x0bf3
        L_0x0bee:
            long r0 = r0 + r16
            goto L_0x0bf3
        L_0x0bf1:
            long r6 = r6 + r16
        L_0x0bf3:
            long r4 = r4 + r10
            android.content.SharedPreferences$Editor r10 = r29.edit()     // Catch:{ all -> 0x0c49 }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0l(r28)     // Catch:{ all -> 0x0c49 }
            java.lang.String r11 = X.AnonymousClass000.A0X(r14, r11)     // Catch:{ all -> 0x0c49 }
            r14 = 11
            java.lang.Long[] r14 = new java.lang.Long[r14]     // Catch:{ all -> 0x0c49 }
            X.C18280x3.A1S(r14, r8)     // Catch:{ all -> 0x0c49 }
            X.AnonymousClass001.A1Q(r14, r6)     // Catch:{ all -> 0x0c49 }
            X.AnonymousClass0x2.A1U(r14, r4)     // Catch:{ all -> 0x0c49 }
            X.AnonymousClass0x2.A1V(r14, r2)     // Catch:{ all -> 0x0c49 }
            X.C18300x5.A1R(r14, r0)     // Catch:{ all -> 0x0c49 }
            X.C18320x8.A1R(r14, r12)     // Catch:{ all -> 0x0c49 }
            java.lang.Long r1 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x0c49 }
            r0 = 6
            r14[r0] = r1     // Catch:{ all -> 0x0c49 }
            java.lang.Long r1 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0c49 }
            r0 = 7
            r14[r0] = r1     // Catch:{ all -> 0x0c49 }
            java.lang.Long r1 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0c49 }
            r0 = 8
            r14[r0] = r1     // Catch:{ all -> 0x0c49 }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0c49 }
            r0 = 9
            r14[r0] = r1     // Catch:{ all -> 0x0c49 }
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0c49 }
            r0 = 10
            java.util.List r1 = X.AnonymousClass0x9.A1A(r1, r14, r0)     // Catch:{ all -> 0x0c49 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x0c49 }
            X.C18270x1.A0j(r10, r11, r0)     // Catch:{ all -> 0x0c49 }
            monitor-exit(r15)
            return
        L_0x0c49:
            r1 = move-exception
            monitor-exit(r15)
            throw r1
        L_0x0c4c:
            java.lang.Object r5 = r2.A00
            X.4mK r5 = (X.C92244mK) r5
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r4 = r2.A02
            X.2i6 r4 = (X.C50392i6) r4
            r1 = 1
            android.content.Context r0 = X.C18290x4.A0F(r0)
            r5.A0B(r0, r1)
            com.whatsapp.WaTextView r3 = r5.A05
            if (r3 == 0) goto L_0x0c72
            int r2 = r4.A00
            r1 = 2
            r0 = 2131893326(0x7f121c4e, float:1.9421425E38)
            if (r2 != r1) goto L_0x0c6f
            r0 = 2131893325(0x7f121c4d, float:1.9421423E38)
        L_0x0c6f:
            r3.setText(r0)
        L_0x0c72:
            com.whatsapp.WaTextView r1 = r5.A04
            if (r1 == 0) goto L_0x0c7b
            java.lang.String r0 = r4.A06
            r1.setText(r0)
        L_0x0c7b:
            com.whatsapp.calling.PeerAvatarLayout r1 = r5.A06
            if (r1 == 0) goto L_0x0c86
            java.util.List r0 = java.util.Collections.emptyList()
            r1.A14(r0)
        L_0x0c86:
            r5.A08()
            return
        L_0x0c8a:
            java.lang.Object r3 = r2.A00
            X.4mB r3 = (X.C92154mB) r3
            java.lang.Object r1 = r2.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            java.lang.Object r0 = r2.A02
            X.0rw r0 = (X.C15790rw) r0
            r3.A06 = r1
            r0.AwB(r1)
            return
        L_0x0c9c:
            java.lang.Object r3 = r2.A00
            X.1hw r3 = (X.C28891hw) r3
            java.lang.Object r1 = r2.A01
            X.4uZ r1 = (X.C95814uZ) r1
            java.lang.Object r0 = r2.A02
            X.2i9 r0 = (X.C50422i9) r0
            r3.A0A(r1)
            r0.A01()
            return
        L_0x0caf:
            r2.close()     // Catch:{ all -> 0x0cbd }
            r8.close()
            return
        L_0x0cb6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0cb8 }
        L_0x0cb8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0cbd }
            throw r0     // Catch:{ all -> 0x0cbd }
        L_0x0cbd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0cbf }
        L_0x0cbf:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r8, r0)
            throw r1
        L_0x0cc4:
            java.lang.Object r9 = r2.A00
            X.5g7 r9 = (X.C110365g7) r9
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r10 = r2.A02
            java.util.AbstractMap r10 = (java.util.AbstractMap) r10
            java.util.Iterator r8 = r0.iterator()
        L_0x0cd4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0cfc
            X.4uZ r7 = X.C18300x5.A0P(r8)
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r7, r10)
            if (r0 == 0) goto L_0x0cd4
            com.whatsapp.conversationslist.ConversationsFragment r6 = r9.A0N
            X.5XH r5 = r6.A1X
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0cf8
            X.2sH r0 = r6.A1i
            long r3 = r0.A0H()
        L_0x0cf8:
            r5.A01(r7, r3)
            goto L_0x0cd4
        L_0x0cfc:
            com.whatsapp.conversationslist.ConversationsFragment r0 = r9.A0N
            X.3Wi r2 = r0.A0i
            r0 = 39
            X.5sE r1 = new X.5sE
            r1.<init>(r9, r0)
            goto L_0x0d84
        L_0x0d08:
            return
        L_0x0d09:
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0d61 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0d61 }
            java.lang.String r1 = X.C625035h.A02     // Catch:{ all -> 0x0d61 }
            java.lang.String r0 = "MessageAddOnStore/getPinnedMessageAddOnsCountInChat"
            android.database.Cursor r2 = r2.A0E(r1, r0, r5)     // Catch:{ all -> 0x0d61 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0d55 }
            if (r0 == 0) goto L_0x0d20
            int r4 = X.AnonymousClass0x2.A03(r2)     // Catch:{ all -> 0x0d55 }
        L_0x0d20:
            r2.close()     // Catch:{ all -> 0x0d61 }
            r3.close()
            boolean r3 = X.C18280x3.A1U(r4, r9)
            X.2hH r2 = r7.A06
            X.20e r1 = X.C369020e.PIN
            X.1ip r0 = r2.A01
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0d44
            X.21G r5 = X.AnonymousClass21G.NO_CONNECTION_ERROR
        L_0x0d38:
            X.3Wi r0 = r7.A00
            r10 = 3
            X.3an r4 = new X.3an
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.BkS(r4)
            return
        L_0x0d44:
            boolean r0 = r2.A00(r1, r8)
            if (r0 != 0) goto L_0x0d4d
            X.21G r5 = X.AnonymousClass21G.OTHER_ERROR
            goto L_0x0d38
        L_0x0d4d:
            if (r3 == 0) goto L_0x0d52
            X.21G r5 = X.AnonymousClass21G.SUCCESS_BUT_NEED_REPLACEMENT
            goto L_0x0d38
        L_0x0d52:
            X.21G r5 = X.AnonymousClass21G.SUCCESS
            goto L_0x0d38
        L_0x0d55:
            r1 = move-exception
            if (r2 == 0) goto L_0x0d60
            r2.close()     // Catch:{ all -> 0x0d5c }
            goto L_0x0d60
        L_0x0d5c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0d61 }
        L_0x0d60:
            throw r1     // Catch:{ all -> 0x0d61 }
        L_0x0d61:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0d66 }
            throw r1
        L_0x0d66:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0d6b:
            java.lang.Object r4 = r2.A00
            X.4o9 r4 = (X.C93214o9) r4
            java.lang.Object r1 = r2.A01
            X.33C r1 = (X.AnonymousClass33C) r1
            java.lang.Object r0 = r2.A02
            X.1pB r0 = (X.C31971pB) r0
            boolean r3 = r4.A2B(r1, r0)
            X.3Wi r2 = r4.A0X
            r0 = 26
            X.3cX r1 = new X.3cX
            r1.<init>((int) r0, (java.lang.Object) r4, (boolean) r3)
        L_0x0d84:
            r2.A0S(r1)
            return
        L_0x0d88:
            java.lang.Object r1 = r2.A00
            X.5mB r1 = (X.C113905mB) r1
            java.lang.Object r0 = r2.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r4 = r2.A02
            X.0rw r4 = (X.C15790rw) r4
            r1.A02()
            android.content.SharedPreferences r3 = r1.A01()
            java.lang.String r0 = r0.getRawString()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "_commerce"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "null,false,false,null,false,null,null,null,null,null"
            java.lang.String r0 = r3.getString(r2, r0)
            X.5Wm r0 = X.C105805Wm.A00(r0)
            r4.AwB(r0)
            android.content.SharedPreferences$Editor r1 = r3.edit()
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            goto L_0x0ed3
        L_0x0dc5:
            java.lang.Object r1 = r2.A00
            X.5mB r1 = (X.C113905mB) r1
            java.lang.Object r0 = r2.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r2 = r2.A02
            X.2pe r2 = (X.C55012pe) r2
            r1.A02()
            android.content.SharedPreferences r6 = r1.A01()
            java.lang.String r0 = r0.getRawString()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "_discovery"
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "null,null"
            java.lang.String r0 = r6.getString(r5, r0)
            java.lang.String r4 = ","
            r0.split(r4)
            java.lang.String r3 = r2.A05
            java.lang.String r2 = r2.A06
            android.content.SharedPreferences$Editor r1 = r6.edit()
            java.lang.String[] r0 = X.AnonymousClass0x9.A1Z()
            X.AnonymousClass001.A1I(r3, r2, r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)
            android.content.SharedPreferences$Editor r0 = r1.putString(r5, r0)
            goto L_0x0ed3
        L_0x0e0f:
            java.lang.Object r1 = r2.A00
            X.5mB r1 = (X.C113905mB) r1
            java.lang.Object r0 = r2.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r12 = r2.A02
            java.lang.Number r12 = (java.lang.Number) r12
            r1.A02()
            android.content.SharedPreferences r27 = r1.A01()
            java.lang.String r26 = r0.getRawString()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r26)
            java.lang.String r14 = "_voip"
            java.lang.String r2 = X.AnonymousClass000.A0X(r14, r0)
            java.lang.String r1 = "0,0,0,0,0,0,0,0,0,0,0"
            r0 = r27
            java.lang.String r0 = r0.getString(r2, r1)
            java.lang.String[] r15 = X.C18320x8.A1b(r0)
            r0 = 0
            long r10 = X.C624334z.A00(r15, r0)
            r0 = 1
            long r8 = X.C624334z.A00(r15, r0)
            r0 = 2
            long r6 = X.C624334z.A00(r15, r0)
            r0 = 3
            long r4 = X.C624334z.A00(r15, r0)
            r0 = 4
            long r2 = X.C624334z.A00(r15, r0)
            r0 = 5
            long r0 = X.C624334z.A00(r15, r0)
            r13 = 6
            long r24 = X.C624334z.A00(r15, r13)
            r13 = 7
            long r22 = X.C624334z.A00(r15, r13)
            r13 = 8
            long r20 = X.C624334z.A00(r15, r13)
            r13 = 9
            long r18 = X.C624334z.A00(r15, r13)
            r13 = 10
            long r16 = X.C624334z.A00(r15, r13)
            int r15 = r12.intValue()
            r12 = 1
            switch(r15) {
                case 0: goto L_0x0ed7;
                case 1: goto L_0x0eda;
                case 2: goto L_0x0edc;
                case 3: goto L_0x0ed7;
                case 4: goto L_0x0edf;
                case 5: goto L_0x0ee2;
                case 6: goto L_0x0ed7;
                case 7: goto L_0x0ed7;
                case 8: goto L_0x0ed7;
                case 9: goto L_0x0edf;
                case 10: goto L_0x0ed7;
                case 11: goto L_0x0ee5;
                case 12: goto L_0x0ee5;
                case 13: goto L_0x0ee5;
                case 14: goto L_0x0ee5;
                case 15: goto L_0x0ed7;
                case 16: goto L_0x0ed7;
                case 17: goto L_0x0ed7;
                case 18: goto L_0x0ee5;
                case 19: goto L_0x0ed7;
                case 20: goto L_0x0eda;
                case 21: goto L_0x0ed7;
                case 22: goto L_0x0eda;
                case 23: goto L_0x0edc;
                case 24: goto L_0x0e7f;
                case 25: goto L_0x0ed7;
                default: goto L_0x0e7f;
            }
        L_0x0e7f:
            android.content.SharedPreferences$Editor r13 = r27.edit()
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0l(r26)
            java.lang.String r12 = X.AnonymousClass000.A0X(r14, r12)
            r14 = 11
            java.lang.Long[] r14 = new java.lang.Long[r14]
            X.C18280x3.A1S(r14, r10)
            X.AnonymousClass001.A1Q(r14, r8)
            X.AnonymousClass0x2.A1U(r14, r6)
            X.AnonymousClass0x2.A1V(r14, r4)
            X.C18300x5.A1R(r14, r2)
            X.C18320x8.A1R(r14, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r24)
            r0 = 6
            r14[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r22)
            r0 = 7
            r14[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            r0 = 8
            r14[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            r0 = 9
            r14[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            r0 = 10
            java.util.List r1 = X.AnonymousClass0x9.A1A(r1, r14, r0)
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            android.content.SharedPreferences$Editor r0 = r13.putString(r12, r0)
        L_0x0ed3:
            r0.apply()
            return
        L_0x0ed7:
            long r16 = r16 + r12
            goto L_0x0e7f
        L_0x0eda:
            long r0 = r0 + r12
            goto L_0x0e7f
        L_0x0edc:
            long r22 = r22 + r12
            goto L_0x0e7f
        L_0x0edf:
            long r24 = r24 + r12
            goto L_0x0e7f
        L_0x0ee2:
            long r20 = r20 + r12
            goto L_0x0e7f
        L_0x0ee5:
            long r18 = r18 + r12
            goto L_0x0e7f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70333aK.run():void");
    }
}
