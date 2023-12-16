package X;

/* renamed from: X.3X3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3X3 implements C84134Bd {
    public final /* synthetic */ AnonymousClass30M A00;
    public final /* synthetic */ C56232re A01;
    public final /* synthetic */ AnonymousClass3QO A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x024d, code lost:
        if (r15.hasNext() == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x024f, code lost:
        r9 = X.C18320x8.A0S(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0253, code lost:
        if (r7 != 2) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0255, code lost:
        r12 = X.C30471mV.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x025b, code lost:
        if (r9.A07 != null) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x025d, code lost:
        r4 = X.AnonymousClass001.A0o();
        X.C18260x0.A1K(r4, X.AnonymousClass2z0.A07(r9, "mediauploadresponseprocessor/uploaded, but url is null for ", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x026e, code lost:
        if (r12.A0W == null) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0274, code lost:
        if (r12.A0B != 0) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x027c, code lost:
        if (X.C58942w4.A0C.A00() == false) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x027e, code lost:
        r6.A00.A0A("MediaUploadResponseProcessor/processNormalUploadResponse", true, "mediauploadresponseprocessor/media key timestamp not set");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0289, code lost:
        if (r9.A00 > 0) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x028b, code lost:
        r3 = r12.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x028d, code lost:
        if (r3 == null) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x028f, code lost:
        r14 = X.C18290x4.A0v(r3);
        r14.append("; exists=");
        r14.append(r12.A0F.exists());
        r14.append("; size=");
        r14 = X.AnonymousClass001.A0k(r14, r12.A0F.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b0, code lost:
        r12 = X.AnonymousClass001.A0o();
        r12.append("mediauploadresponseprocessor/uploaded, but mediaSize=");
        r12.append(r9.A00);
        r12.append("; file=");
        r12.append(r14);
        X.C18260x0.A1K(r12, X.AnonymousClass2z0.A07(r9, "; msg=", r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d5, code lost:
        if (X.C58942w4.A0B.A00() == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d7, code lost:
        r6.A00.A0A("MediaUploadResponseProcessor/processNormalUploadResponse", true, "mediauploadresponseprocessor/invalid mediaSize");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02de, code lost:
        r4 = r6.A03;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02e1, code lost:
        if (r7 != 2) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e3, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e4, code lost:
        r4.A0b(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02e7, code lost:
        if (r7 == 2) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e9, code lost:
        r6.A06.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02f0, code lost:
        r14 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02f4, code lost:
        r26 = "success";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f9, code lost:
        r26 = "cancelled";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02fd, code lost:
        r26 = "failed_insufficient_space";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0301, code lost:
        r26 = "media_error_io";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0305, code lost:
        r26 = "media_error_oom";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0309, code lost:
        r26 = "media_error_bad_media";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x030d, code lost:
        r26 = "media_error_no_permissions";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0311, code lost:
        r26 = "media_error_fnf";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0315, code lost:
        r26 = "media_error_server";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0319, code lost:
        r26 = "media_error_request";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x031d, code lost:
        r26 = "media_error_request_timeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0321, code lost:
        r26 = "media_error_not_finalized";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0325, code lost:
        r26 = "media_error_optimistic_hash";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0329, code lost:
        r26 = "media_error_conn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x032d, code lost:
        r26 = "media_error_optimistic_network_unsafe";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0331, code lost:
        r26 = "media_error_throttle";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0335, code lost:
        r26 = "media_error_no_such_algorithm";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0339, code lost:
        r26 = "media_error_no_client_network";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x033d, code lost:
        r26 = "media_error_ssl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0341, code lost:
        r26 = "media_error_url";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0345, code lost:
        r26 = "media_error_transcoding_unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0349, code lost:
        r26 = "media_error_file_format_unsupported";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x034d, code lost:
        r26 = "media_error_dns";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0351, code lost:
        r26 = "media_error_wamsys";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0355, code lost:
        r26 = "media_error_too_large";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0359, code lost:
        r26 = "media_switch_required";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x035d, code lost:
        r26 = "media_skipped_ep_no_primary_host";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0361, code lost:
        r26 = "media_error_cronet";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0365, code lost:
        r26 = "media_error_no_direct_path";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0184, code lost:
        if (r9.A01.A02.A0E != false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a5, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ef, code lost:
        r12.A0F(r11, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fa, code lost:
        r11.A0H(r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r12 = r15.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0206, code lost:
        if (r12.hasNext() == false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0208, code lost:
        r4 = X.C18320x8.A0S(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0210, code lost:
        if (X.AnonymousClass2z0.A0B(r4) == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0212, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0214, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0215, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0218, code lost:
        if (r4 == null) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x021a, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021b, code lost:
        if (r9 == null) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x021d, code lost:
        r11 = r9.A01.A04.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0223, code lost:
        r18 = r6.A09;
        r27 = X.AnonymousClass29K.A01(r6.A04, r4, r6.A07, r6.A08);
        r28 = X.AnonymousClass0x2.A0D(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0235, code lost:
        switch(r3) {
            case 0: goto L_0x02f4;
            case 1: goto L_0x02f9;
            case 2: goto L_0x02fd;
            case 3: goto L_0x0301;
            case 4: goto L_0x0305;
            case 5: goto L_0x0309;
            case 6: goto L_0x030d;
            case 7: goto L_0x0311;
            case 8: goto L_0x0315;
            case 9: goto L_0x0319;
            case 10: goto L_0x031d;
            case 11: goto L_0x0321;
            case 12: goto L_0x0325;
            case 13: goto L_0x0329;
            case 14: goto L_0x032d;
            case 15: goto L_0x0331;
            case 16: goto L_0x0335;
            case 17: goto L_0x0339;
            case 18: goto L_0x033d;
            case 19: goto L_0x0341;
            case 20: goto L_0x0345;
            case 21: goto L_0x0349;
            case 22: goto L_0x034d;
            case 23: goto L_0x0351;
            case 24: goto L_0x0355;
            case 25: goto L_0x0339;
            case 26: goto L_0x0359;
            case 27: goto L_0x035d;
            case 28: goto L_0x0361;
            case 29: goto L_0x0365;
            case 30: goto L_0x0238;
            case 31: goto L_0x0238;
            case 32: goto L_0x02f9;
            case 33: goto L_0x0329;
            case 34: goto L_0x0309;
            case 35: goto L_0x0309;
            case 36: goto L_0x0309;
            case 37: goto L_0x0301;
            default: goto L_0x0238;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0238, code lost:
        r26 = "error_unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023a, code lost:
        r18.A08(r4, r26, r27, r28, r20, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0245, code lost:
        r15 = X.AnonymousClass0x7.A0x(r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AwB(java.lang.Object r34) {
        /*
            r33 = this;
            r13 = r34
            r4 = r33
            X.2re r2 = r4.A01
            X.30M r1 = r4.A00
            X.3QO r0 = r4.A02
            boolean r3 = r4.A03
            r20 = r3
            boolean r3 = r4.A04
            r19 = r3
            java.lang.Integer r13 = (java.lang.Integer) r13
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "mediajobmanager/mediajob/finished for "
            r4.append(r3)
            java.util.concurrent.CopyOnWriteArrayList r15 = r1.A02
            X.C18320x8.A1O(r4, r15)
            java.lang.String r3 = " messages; result = "
            r4.append(r3)
            r4.append(r13)
            java.lang.String r3 = "; job="
            X.C18260x0.A1P(r4, r3, r0)
            X.33a r3 = r0.A0M
            r32 = r3
            int r7 = r32.A01()
            X.7Oi r9 = r0.A02()
            if (r9 == 0) goto L_0x0048
            X.32i r5 = r2.A0E
            r4 = 4
            X.4Ja r3 = new X.4Ja
            r3.<init>(r5, r4)
            X.C618132i.A00(r1, r3, r9)
        L_0x0048:
            X.3XB r3 = r0.A0G
            java.lang.Object r5 = r3.A01()
            X.7Oi r5 = (X.C149897Oi) r5
            if (r5 == 0) goto L_0x005d
            X.32i r6 = r2.A0E
            r4 = 0
            X.4Ja r3 = new X.4Ja
            r3.<init>(r6, r4)
            X.C618132i.A00(r1, r3, r5)
        L_0x005d:
            X.3XB r3 = r0.A05
            java.lang.Object r8 = r3.A01()
            if (r8 == 0) goto L_0x0070
            X.32i r6 = r2.A0E
            r4 = 5
            X.4Ja r3 = new X.4Ja
            r3.<init>(r6, r4)
            X.C618132i.A00(r1, r3, r8)
        L_0x0070:
            X.32i r6 = r2.A0E
            int r3 = r13.intValue()
            r8 = 2
            X.92T r4 = new X.92T
            r4.<init>(r6, r8)
            X.C618132i.A00(r1, r4, r13)
            java.util.Iterator r6 = r15.iterator()
        L_0x0083:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0369
            X.34x r4 = X.C18300x5.A0T(r6)
            boolean r4 = X.AnonymousClass2z0.A0D(r4)
            if (r4 == 0) goto L_0x0083
            r23 = 1
        L_0x0095:
            X.2w4 r6 = r2.A0L
            X.32J r4 = r0.A0N
            X.7iO r4 = r4.A03
            boolean r11 = r4.A03
            if (r7 == 0) goto L_0x0177
            if (r7 == r8) goto L_0x0177
            r4 = 4
            if (r7 == r4) goto L_0x0177
            if (r9 != 0) goto L_0x0135
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "mediauploadresponseprocessor/processUploadResponse/not regular upload, but upload response is null: uploadType="
            r6.append(r4)
            r6.append(r7)
            java.lang.String r4 = "; result="
            X.C18260x0.A0x(r4, r6, r3)
        L_0x00b7:
            r3 = 0
            r2.A02(r1, r3)
            int r9 = X.C622934l.A00(r1)
            X.2gm r4 = r2.A0H
            X.33c r8 = r2.A0D
            int r3 = r0.A00
            X.5Rn r3 = r8.A06(r0, r3, r9)
            r4.A01(r3)
            X.3QN r3 = r0.A02
            if (r3 == 0) goto L_0x00f1
            if (r5 == 0) goto L_0x00f1
            X.4FV r7 = r2.A0C
            X.5LM r6 = r3.A00
            X.33a r4 = r3.A01
            int r3 = r5.A00
            int r20 = r4.A01()
            r14 = r8
            r15 = r6
            r16 = r4
            r17 = r5
            r18 = r3
            r19 = r9
            X.5Rn r3 = r14.A05(r15, r16, r17, r18, r19, r20)
            X.1bW r3 = r3.A00
            r7.BhD(r3)
        L_0x00f1:
            X.1mV r6 = r1.A00()
            X.36Y r5 = r2.A0A
            X.2hp r4 = r2.A0O
            X.2Yl r3 = r2.A0P
            int r20 = X.AnonymousClass29K.A01(r5, r6, r4, r3)
            r3 = r32
            X.2UL r4 = r3.A07
            if (r4 == 0) goto L_0x0132
            java.lang.Long r3 = r4.A08
            if (r3 == 0) goto L_0x0132
            long r21 = r3.longValue()
            X.5Ie r3 = r4.A01
            if (r3 == 0) goto L_0x011b
            java.lang.Long r3 = r3.A02
            if (r3 == 0) goto L_0x011b
            long r3 = r3.longValue()
            long r21 = r21 - r3
        L_0x011b:
            X.4FS r4 = r2.A0R
            X.3bA r3 = new X.3bA
            r15 = r3
            r16 = r1
            r17 = r2
            r18 = r0
            r19 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r23)
            r4.BkM(r3)
            r0.A03()
            return
        L_0x0132:
            r21 = 0
            goto L_0x011b
        L_0x0135:
            r4 = 3
            if (r7 != r4) goto L_0x00b7
            X.1mV r8 = r1.A00()
            X.2zt r4 = r9.A01
            X.6kd r4 = (X.C135416kd) r4
            X.2wu r14 = r6.A05
            if (r3 == 0) goto L_0x0174
            r7 = 7
            r21 = 2
            if (r3 == r7) goto L_0x014b
            r21 = 0
        L_0x014b:
            com.whatsapp.jid.Jid r11 = r4.A01
            X.2z0 r7 = r8.A1J
            java.lang.String r10 = r7.A01
            X.4uZ r15 = r4.A00
            boolean r7 = r4.A03
            com.whatsapp.jid.UserJid r4 = r4.A02
            X.2sV r9 = r9.A02
            java.lang.String r20 = r9.A03()
            r18 = r8
            r19 = r10
            r22 = r7
            r16 = r11
            r17 = r4
            r14.A01(r15, r16, r17, r18, r19, r20, r21, r22)
            if (r3 != 0) goto L_0x00b7
            X.3Lv r4 = r6.A03
            r3 = -1
            r4.A0b(r8, r3)
            goto L_0x00b7
        L_0x0174:
            r21 = 1
            goto L_0x014b
        L_0x0177:
            r14 = 0
            if (r3 != 0) goto L_0x019f
            if (r9 == 0) goto L_0x0186
            X.2zt r4 = r9.A01
            X.2UD r4 = r4.A02
            boolean r4 = r4.A0E
            r7 = 13
            if (r4 == 0) goto L_0x0187
        L_0x0186:
            r7 = 2
        L_0x0187:
            java.util.Iterator r10 = r15.iterator()
        L_0x018b:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x01a1
            X.34x r4 = X.C18300x5.A0T(r10)
            if (r7 != 0) goto L_0x019b
            r4.A1A()
            goto L_0x018b
        L_0x019b:
            r4.A1G(r7)
            goto L_0x018b
        L_0x019f:
            r7 = 0
            goto L_0x0187
        L_0x01a1:
            r10 = 1
            switch(r3) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x01a7;
                case 2: goto L_0x01c9;
                case 3: goto L_0x01cf;
                case 4: goto L_0x01d5;
                case 5: goto L_0x01b8;
                case 6: goto L_0x01db;
                case 7: goto L_0x01e1;
                case 8: goto L_0x01a7;
                case 9: goto L_0x01a7;
                case 10: goto L_0x01a7;
                case 11: goto L_0x01a7;
                case 12: goto L_0x01a7;
                case 13: goto L_0x01a7;
                case 14: goto L_0x01a5;
                case 15: goto L_0x01a7;
                case 16: goto L_0x01a7;
                case 17: goto L_0x01a7;
                case 18: goto L_0x01a7;
                case 19: goto L_0x01a7;
                case 20: goto L_0x01a5;
                case 21: goto L_0x01f3;
                case 22: goto L_0x01a7;
                case 23: goto L_0x01a5;
                case 24: goto L_0x01a7;
                case 25: goto L_0x01a5;
                case 26: goto L_0x01a5;
                case 27: goto L_0x01a5;
                case 28: goto L_0x01a5;
                case 29: goto L_0x01a5;
                case 30: goto L_0x01a7;
                case 31: goto L_0x01a7;
                case 32: goto L_0x01a7;
                case 33: goto L_0x01a7;
                case 34: goto L_0x01b8;
                case 35: goto L_0x01b8;
                case 36: goto L_0x01b8;
                case 37: goto L_0x01cf;
                default: goto L_0x01a5;
            }
        L_0x01a5:
            monitor-enter(r1)
            goto L_0x01fe
        L_0x01a7:
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "mediaUploadResponseProcessor/result = "
            r11.append(r4)
            java.lang.String r4 = X.C154357d2.A00(r3)
            X.C18260x0.A1L(r11, r4)
            goto L_0x01a5
        L_0x01b8:
            X.1mV r4 = r1.A00()
            byte r4 = r4.A1I
            X.3Wi r12 = r6.A01
            r11 = 2131889069(0x7f120bad, float:1.9412791E38)
            if (r4 != r10) goto L_0x01ef
            r11 = 2131889079(0x7f120bb7, float:1.9412811E38)
            goto L_0x01ef
        L_0x01c9:
            X.3Wi r12 = r6.A01
            r11 = 2131889102(0x7f120bce, float:1.9412858E38)
            goto L_0x01ef
        L_0x01cf:
            X.3Wi r11 = r6.A01
            r4 = 2131893800(0x7f121e28, float:1.9422387E38)
            goto L_0x01fa
        L_0x01d5:
            X.3Wi r12 = r6.A01
            r11 = 2131889108(0x7f120bd4, float:1.941287E38)
            goto L_0x01ef
        L_0x01db:
            X.3Wi r12 = r6.A01
            r11 = 2131891184(0x7f1213f0, float:1.941708E38)
            goto L_0x01ef
        L_0x01e1:
            X.3Wi r12 = r6.A01
            boolean r4 = X.C61072zf.A01()
            r11 = 2131889511(0x7f120d67, float:1.9413688E38)
            if (r4 == 0) goto L_0x01ef
            r11 = 2131889510(0x7f120d66, float:1.9413686E38)
        L_0x01ef:
            r12.A0F(r11, r14)
            goto L_0x01a5
        L_0x01f3:
            if (r11 == 0) goto L_0x01a5
            X.3Wi r11 = r6.A01
            r4 = 2131893801(0x7f121e29, float:1.9422389E38)
        L_0x01fa:
            r11.A0H(r4, r14)
            goto L_0x01a5
        L_0x01fe:
            java.util.Iterator r12 = r15.iterator()     // Catch:{ all -> 0x036d }
        L_0x0202:
            boolean r4 = r12.hasNext()     // Catch:{ all -> 0x036d }
            if (r4 == 0) goto L_0x0214
            X.1mV r4 = X.C18320x8.A0S(r12)     // Catch:{ all -> 0x036d }
            boolean r11 = X.AnonymousClass2z0.A0B(r4)     // Catch:{ all -> 0x036d }
            if (r11 == 0) goto L_0x0202
            monitor-exit(r1)
            goto L_0x0216
        L_0x0214:
            monitor-exit(r1)
            r4 = 0
        L_0x0216:
            r16 = 0
            if (r4 == 0) goto L_0x0245
            r11 = 0
            if (r9 == 0) goto L_0x0223
            X.2zt r9 = r9.A01
            X.2UL r9 = r9.A04
            java.lang.Long r11 = r9.A0G
        L_0x0223:
            X.5mK r9 = r6.A09
            r18 = r9
            X.36Y r14 = r6.A04
            X.2hp r12 = r6.A07
            X.2Yl r9 = r6.A08
            int r27 = X.AnonymousClass29K.A01(r14, r4, r12, r9)
            long r28 = X.AnonymousClass0x2.A0D(r11)
            switch(r3) {
                case 0: goto L_0x02f4;
                case 1: goto L_0x02f9;
                case 2: goto L_0x02fd;
                case 3: goto L_0x0301;
                case 4: goto L_0x0305;
                case 5: goto L_0x0309;
                case 6: goto L_0x030d;
                case 7: goto L_0x0311;
                case 8: goto L_0x0315;
                case 9: goto L_0x0319;
                case 10: goto L_0x031d;
                case 11: goto L_0x0321;
                case 12: goto L_0x0325;
                case 13: goto L_0x0329;
                case 14: goto L_0x032d;
                case 15: goto L_0x0331;
                case 16: goto L_0x0335;
                case 17: goto L_0x0339;
                case 18: goto L_0x033d;
                case 19: goto L_0x0341;
                case 20: goto L_0x0345;
                case 21: goto L_0x0349;
                case 22: goto L_0x034d;
                case 23: goto L_0x0351;
                case 24: goto L_0x0355;
                case 25: goto L_0x0339;
                case 26: goto L_0x0359;
                case 27: goto L_0x035d;
                case 28: goto L_0x0361;
                case 29: goto L_0x0365;
                case 30: goto L_0x0238;
                case 31: goto L_0x0238;
                case 32: goto L_0x02f9;
                case 33: goto L_0x0329;
                case 34: goto L_0x0309;
                case 35: goto L_0x0309;
                case 36: goto L_0x0309;
                case 37: goto L_0x0301;
                default: goto L_0x0238;
            }
        L_0x0238:
            java.lang.String r26 = "error_unknown"
        L_0x023a:
            r30 = r20
            r31 = r19
            r24 = r18
            r25 = r4
            r24.A08(r25, r26, r27, r28, r30, r31)
        L_0x0245:
            java.util.Iterator r15 = X.AnonymousClass0x7.A0x(r15)
        L_0x0249:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x00b7
            X.1mV r9 = X.C18320x8.A0S(r15)
            if (r7 != r8) goto L_0x02de
            X.33C r12 = X.C30471mV.A00(r9)
            java.lang.String r3 = r9.A07
            if (r3 != 0) goto L_0x026a
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "mediauploadresponseprocessor/uploaded, but url is null for "
            java.lang.String r3 = X.AnonymousClass2z0.A07(r9, r3, r4)
            X.C18260x0.A1K(r4, r3)
        L_0x026a:
            byte[] r3 = r12.A0W
            java.lang.String r11 = "MediaUploadResponseProcessor/processNormalUploadResponse"
            if (r3 == 0) goto L_0x0285
            long r3 = r12.A0B
            int r14 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x0285
            X.5ZC r3 = X.C58942w4.A0C
            boolean r3 = r3.A00()
            if (r3 == 0) goto L_0x0285
            X.2qk r4 = r6.A00
            java.lang.String r3 = "mediauploadresponseprocessor/media key timestamp not set"
            r4.A0A(r11, r10, r3)
        L_0x0285:
            long r3 = r9.A00
            int r14 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r14 > 0) goto L_0x02de
            java.io.File r3 = r12.A0F
            if (r3 == 0) goto L_0x02f0
            java.lang.StringBuilder r14 = X.C18290x4.A0v(r3)
            java.lang.String r3 = "; exists="
            r14.append(r3)
            java.io.File r3 = r12.A0F
            boolean r3 = r3.exists()
            r14.append(r3)
            java.lang.String r3 = "; size="
            r14.append(r3)
            java.io.File r3 = r12.A0F
            long r3 = r3.length()
            java.lang.String r14 = X.AnonymousClass001.A0k(r14, r3)
        L_0x02b0:
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "mediauploadresponseprocessor/uploaded, but mediaSize="
            r12.append(r3)
            long r3 = r9.A00
            r12.append(r3)
            java.lang.String r3 = "; file="
            r12.append(r3)
            r12.append(r14)
            java.lang.String r3 = "; msg="
            java.lang.String r3 = X.AnonymousClass2z0.A07(r9, r3, r12)
            X.C18260x0.A1K(r12, r3)
            X.5ZC r3 = X.C58942w4.A0B
            boolean r3 = r3.A00()
            if (r3 == 0) goto L_0x02de
            X.2qk r4 = r6.A00
            java.lang.String r3 = "mediauploadresponseprocessor/invalid mediaSize"
            r4.A0A(r11, r10, r3)
        L_0x02de:
            X.3Lv r4 = r6.A03
            r3 = -1
            if (r7 != r8) goto L_0x02e4
            r3 = 1
        L_0x02e4:
            r4.A0b(r9, r3)
            if (r7 == r8) goto L_0x0249
            X.2ol r3 = r6.A06
            r3.A02(r9)
            goto L_0x0249
        L_0x02f0:
            java.lang.String r14 = "null"
            goto L_0x02b0
        L_0x02f4:
            java.lang.String r26 = "success"
            goto L_0x023a
        L_0x02f9:
            java.lang.String r26 = "cancelled"
            goto L_0x023a
        L_0x02fd:
            java.lang.String r26 = "failed_insufficient_space"
            goto L_0x023a
        L_0x0301:
            java.lang.String r26 = "media_error_io"
            goto L_0x023a
        L_0x0305:
            java.lang.String r26 = "media_error_oom"
            goto L_0x023a
        L_0x0309:
            java.lang.String r26 = "media_error_bad_media"
            goto L_0x023a
        L_0x030d:
            java.lang.String r26 = "media_error_no_permissions"
            goto L_0x023a
        L_0x0311:
            java.lang.String r26 = "media_error_fnf"
            goto L_0x023a
        L_0x0315:
            java.lang.String r26 = "media_error_server"
            goto L_0x023a
        L_0x0319:
            java.lang.String r26 = "media_error_request"
            goto L_0x023a
        L_0x031d:
            java.lang.String r26 = "media_error_request_timeout"
            goto L_0x023a
        L_0x0321:
            java.lang.String r26 = "media_error_not_finalized"
            goto L_0x023a
        L_0x0325:
            java.lang.String r26 = "media_error_optimistic_hash"
            goto L_0x023a
        L_0x0329:
            java.lang.String r26 = "media_error_conn"
            goto L_0x023a
        L_0x032d:
            java.lang.String r26 = "media_error_optimistic_network_unsafe"
            goto L_0x023a
        L_0x0331:
            java.lang.String r26 = "media_error_throttle"
            goto L_0x023a
        L_0x0335:
            java.lang.String r26 = "media_error_no_such_algorithm"
            goto L_0x023a
        L_0x0339:
            java.lang.String r26 = "media_error_no_client_network"
            goto L_0x023a
        L_0x033d:
            java.lang.String r26 = "media_error_ssl"
            goto L_0x023a
        L_0x0341:
            java.lang.String r26 = "media_error_url"
            goto L_0x023a
        L_0x0345:
            java.lang.String r26 = "media_error_transcoding_unknown"
            goto L_0x023a
        L_0x0349:
            java.lang.String r26 = "media_error_file_format_unsupported"
            goto L_0x023a
        L_0x034d:
            java.lang.String r26 = "media_error_dns"
            goto L_0x023a
        L_0x0351:
            java.lang.String r26 = "media_error_wamsys"
            goto L_0x023a
        L_0x0355:
            java.lang.String r26 = "media_error_too_large"
            goto L_0x023a
        L_0x0359:
            java.lang.String r26 = "media_switch_required"
            goto L_0x023a
        L_0x035d:
            java.lang.String r26 = "media_skipped_ep_no_primary_host"
            goto L_0x023a
        L_0x0361:
            java.lang.String r26 = "media_error_cronet"
            goto L_0x023a
        L_0x0365:
            java.lang.String r26 = "media_error_no_direct_path"
            goto L_0x023a
        L_0x0369:
            r23 = 0
            goto L_0x0095
        L_0x036d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3X3.AwB(java.lang.Object):void");
    }

    public /* synthetic */ AnonymousClass3X3(AnonymousClass30M r1, C56232re r2, AnonymousClass3QO r3, boolean z, boolean z2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = z;
        this.A04 = z2;
    }
}
