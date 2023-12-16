package X;

/* renamed from: X.5rP  reason: invalid class name and case insensitive filesystem */
public class C117115rP implements Runnable {
    public Object A00;
    public final int A01;

    public C117115rP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C69263Wi r1, Object obj, int i) {
        r1.A0S(new C117115rP(obj, i));
    }

    public static void A01(AnonymousClass4FS r1, Object obj, int i) {
        r1.BkM(new C117115rP(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: X.4hJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: X.4hN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: X.4hK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: X.4hP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: X.4hL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: X.4hM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: X.4hO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v352, resolved type: X.4hJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v353, resolved type: X.4hN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v354, resolved type: X.4hJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v355, resolved type: X.4hN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v356, resolved type: X.4hN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v357, resolved type: X.4hN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v358, resolved type: X.4hJ} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x029f, code lost:
        r1.append("db_backup ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02a7, code lost:
        if (r9[2] == false) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a9, code lost:
        r1.append("gdrive_backup ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b1, code lost:
        if (r9[3] == false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02b3, code lost:
        r1.append("voice_call ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02bb, code lost:
        if (r9[4] == false) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02bd, code lost:
        r1.append("video_call ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c5, code lost:
        if (r9[5] == false) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c7, code lost:
        r1.append("db_migration ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02cf, code lost:
        if (r9[6] == false) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d1, code lost:
        r1.append("gdrive_backup_with_worker ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02d9, code lost:
        if (r9[7] == false) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02db, code lost:
        r1.append("gdrive_old_media_enc_re_upload ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02e0, code lost:
        r2.A0A = r1.toString();
        r2.A06 = X.C18310x6.A0g(r8.A06);
        r3.BhE(r2, r10.intValue());
        r1 = X.AnonymousClass001.A0o();
        r1.append("BatteryMetrics: ");
        r1.append(r7);
        X.C18260x0.A1P(r1, " ", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0306, code lost:
        r0 = (((r4.systemTimeS + r4.userTimeS) * 1000.0d) / ((double) r5.realtimeMs)) * 3600.0d;
        r4 = r8.A0C;
        r2 = X.C66663Mh.A10;
        r7 = X.C66663Mh.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0321, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r2 = r4.A00.getFloat(r2.A00, Float.MAX_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x032d, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0332, code lost:
        if (r0 < ((double) r2)) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0334, code lost:
        r8.A0B.A0A("CriticalBatteryUsageEvent", false, java.lang.Double.toString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x033f, code lost:
        java.lang.System.arraycopy(r8.A0A, 0, r8.A09, 0, 8);
        r8.A06.set(0);
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r5.realtimeMs);
        r7 = java.lang.Integer.valueOf(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x035d, code lost:
        if ((r8.A0K instanceof X.C69423Wy) == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x035f, code lost:
        X.C626936e.A06(r8.A04);
        r9 = r3.AzK(r8.A04, (X.AnonymousClass5ZC) null, false);
        r6 = X.C69423Wy.A06.A00;
        r6 = android.util.Pair.create(java.lang.Long.valueOf(r6.A03.getAndSet(0)), java.lang.Long.valueOf(r6.A04.getAndSet(0)));
        r0 = r8.A0F;
        r1 = r0.A00;
        r0.A00 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x038f, code lost:
        if (r9 == null) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0391, code lost:
        r4 = new X.C94614rd();
        r4.A00 = r7;
        r4.A04 = java.lang.Long.valueOf(r10);
        r4.A02 = (java.lang.Long) r6.first;
        r4.A03 = (java.lang.Long) r6.second;
        r4.A01 = java.lang.Long.valueOf(r1);
        r3.BhE(r4, r9.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r3.A00();
        r0 = X.C58052ud.A00;
        r7 = new java.util.HashMap(r0);
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03c6, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03c7, code lost:
        r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03cb, code lost:
        r7 = X.AnonymousClass001.A0t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03cf, code lost:
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03d1, code lost:
        if (r0 == null) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03d3, code lost:
        X.C626936e.A06(r0);
        r3 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03d8, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r3.A00();
        r0 = X.C58052ud.A01;
        r6 = new java.util.HashMap(r0);
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03e6, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03e7, code lost:
        r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03eb, code lost:
        r6 = X.AnonymousClass001.A0t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03ef, code lost:
        X.C18260x0.A0M(r9, "network_statistics_last_report_time", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03f6, code lost:
        if (r10 == -1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03fc, code lost:
        if (r14 < 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0402, code lost:
        if (r7.isEmpty() == false) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0408, code lost:
        if (r6.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x040a, code lost:
        X.C626936e.A06(r8.A05);
        r5 = r8.A0H;
        r13 = r5.AzK(r8.A05, (X.AnonymousClass5ZC) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0419, code lost:
        if (r13 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x041b, code lost:
        r1 = X.AnonymousClass002.A0K();
        r1.addAll(r7.keySet());
        r1.addAll(r6.keySet());
        r12 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0435, code lost:
        if (r12.hasNext() == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0437, code lost:
        r8 = (java.lang.Integer) r12.next();
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0447, code lost:
        if (r7.containsKey(r8) == false) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0449, code lost:
        r0 = X.AnonymousClass0x9.A0p(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x044d, code lost:
        if (r0 == null) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x044f, code lost:
        r4 = java.lang.Long.valueOf((long) java.lang.Math.ceil(((double) r0.longValue()) / 1000.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0462, code lost:
        if (r6.containsKey(r8) == false) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0464, code lost:
        r0 = X.AnonymousClass0x9.A0p(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0468, code lost:
        if (r0 == null) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x046a, code lost:
        r9 = java.lang.Long.valueOf((long) java.lang.Math.ceil(((double) r0.longValue()) / 1000.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0479, code lost:
        if (r4 == null) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0483, code lost:
        if (r4.longValue() <= 0) goto L_0x04a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0485, code lost:
        r1 = new X.C94634rf();
        r1.A00 = r8;
        r1.A04 = java.lang.Long.valueOf(r14);
        r1.A01 = java.lang.Integer.valueOf(r16);
        r1.A02 = r4;
        r1.A03 = r9;
        r5.BhE(r1, r13.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04a4, code lost:
        if (r9 == null) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04ae, code lost:
        if (r9.longValue() <= 0) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04b1, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x06d4, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0743, code lost:
        r4.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0746, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x081d, code lost:
        r1.Bh4(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0820, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0841, code lost:
        r6.Bh4(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0844, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0878, code lost:
        if ("UNBLOCKED".equals(r3.A00(r5)) != false) goto L_0x087a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x088b, code lost:
        if (r1 == false) goto L_0x087b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08e4, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018d, code lost:
        r16 = !r7.equals("background");
        X.C626936e.A06(r8.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019c, code lost:
        if (r8.A07 == false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019e, code lost:
        r3 = X.C18280x3.A08(java.lang.System.currentTimeMillis(), r8.A00);
        X.C18260x0.A10("BatteryMetrics/coldStartDuration/", X.AnonymousClass001.A0o(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01bb, code lost:
        if (r3 >= X.C56952sp.A06(r8.A0G, 2640)) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01bd, code lost:
        r0 = "BatteryMetrics: Ignoring short cold start session";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01bf, code lost:
        com.whatsapp.util.Log.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c2, code lost:
        r9 = r8.A0E;
        r10 = X.AnonymousClass0x2.A0A(X.AnonymousClass0x2.A0F(r9), "network_statistics_last_report_time");
        r1 = java.lang.System.currentTimeMillis();
        r14 = r1 - r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01db, code lost:
        if (r14 <= 157680000000L) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01dd, code lost:
        r14 = X.C18310x6.A0A(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e1, code lost:
        r4 = r8.A0I;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e5, code lost:
        if (r0 == null) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e7, code lost:
        X.C626936e.A06(r0);
        r3 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ec, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ef, code lost:
        r3 = r8.A02;
        r2 = r3.A02 & r3.A04.A02(r3.A00);
        r3.A02 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fe, code lost:
        if (r2 != false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0200, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0201, code lost:
        r6 = (X.C126056Kn) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0203, code lost:
        if (r6 != null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0205, code lost:
        r0 = "BatteryMetrics: CompositeMetrics are null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0208, code lost:
        r1 = r3.A00;
        r0 = r3.A01;
        r6 = r3.A03;
        r1.A01(r0, r6);
        r1 = r3.A01;
        r3.A01 = r3.A00;
        r3.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021a, code lost:
        r5 = (X.C126016Kj) r6.A02(X.C126016Kj.class);
        r4 = (X.C126036Kl) r6.A02(X.C126036Kl.class);
        X.C626936e.A06(r8.A03);
        r3 = r8.A0H;
        r10 = r3.AzK(r8.A03, (X.AnonymousClass5ZC) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0239, code lost:
        if (r10 == null) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023b, code lost:
        r2 = new X.AnonymousClass4sR();
        r2.A09 = r7;
        r2.A08 = java.lang.Long.valueOf(r5.realtimeMs);
        r2.A07 = java.lang.Long.valueOf(r5.uptimeMs);
        r2.A00 = java.lang.Double.valueOf(r4.systemTimeS);
        r2.A01 = java.lang.Double.valueOf(r4.userTimeS);
        r9 = (X.C126026Kk) r6.A02(X.C126026Kk.class);
        r2.A02 = java.lang.Long.valueOf(r9.mobileBytesRx);
        r2.A03 = java.lang.Long.valueOf(r9.mobileBytesTx);
        r2.A04 = java.lang.Long.valueOf(r9.wifiBytesRx);
        r2.A05 = java.lang.Long.valueOf(r9.wifiBytesTx);
        r1 = X.AnonymousClass001.A0o();
        r9 = r8.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0293, code lost:
        if (r9[0] == false) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0295, code lost:
        r1.append("daily_cron ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x029d, code lost:
        if (r9[1] == false) goto L_0x02a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0928;
                case 1: goto L_0x04cd;
                case 2: goto L_0x091e;
                case 3: goto L_0x04b3;
                case 4: goto L_0x0180;
                case 5: goto L_0x0175;
                case 6: goto L_0x08e8;
                case 7: goto L_0x08df;
                case 8: goto L_0x08df;
                case 9: goto L_0x08d8;
                case 10: goto L_0x00e7;
                case 11: goto L_0x08cc;
                case 12: goto L_0x08cc;
                case 13: goto L_0x00d5;
                case 14: goto L_0x00b0;
                case 15: goto L_0x08bd;
                case 16: goto L_0x0007;
                case 17: goto L_0x0007;
                case 18: goto L_0x08b3;
                case 19: goto L_0x000f;
                case 20: goto L_0x088e;
                case 21: goto L_0x009f;
                case 22: goto L_0x084d;
                case 23: goto L_0x0845;
                case 24: goto L_0x0821;
                case 25: goto L_0x07fd;
                case 26: goto L_0x07dc;
                case 27: goto L_0x07b9;
                case 28: goto L_0x0798;
                case 29: goto L_0x0772;
                case 30: goto L_0x0747;
                case 31: goto L_0x0086;
                case 32: goto L_0x0845;
                case 33: goto L_0x0041;
                case 34: goto L_0x0032;
                case 35: goto L_0x0733;
                case 36: goto L_0x06ff;
                case 37: goto L_0x06ef;
                case 38: goto L_0x0025;
                case 39: goto L_0x06d8;
                case 40: goto L_0x06bc;
                case 41: goto L_0x06a6;
                case 42: goto L_0x0694;
                case 43: goto L_0x067b;
                case 44: goto L_0x0658;
                case 45: goto L_0x0630;
                case 46: goto L_0x055f;
                case 47: goto L_0x0557;
                case 48: goto L_0x0536;
                case 49: goto L_0x0518;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.5Ox r0 = (X.C103915Ox) r0
            r0.A00()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r1 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r1
            X.4V6 r0 = r1.A0W
            com.whatsapp.jid.UserJid r1 = r1.A0u
            X.08M r2 = r0.A0E
            X.5Pq r0 = r0.A0I
            boolean r0 = r0.A00(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x00d1
        L_0x0025:
            java.lang.Object r3 = r1.A00
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x000e }
            r0 = 32000(0x7d00, double:1.581E-319)
            r3.get(r0, r2)     // Catch:{ Exception -> 0x000e }
            goto L_0x09cc
        L_0x0032:
            java.lang.Object r1 = r1.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r1 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r1
            X.7Sv r0 = r1.A0B
            if (r0 == 0) goto L_0x000e
            r0.A00()
            r0 = 0
            r1.A0B = r0
            return
        L_0x0041:
            java.lang.Object r6 = r1.A00
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r6 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r6
            X.7Sv r2 = r6.A0B
            if (r2 == 0) goto L_0x000e
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168494(0x7f070cee, float:1.7951291E38)
            float r5 = X.C86664Kz.A01(r1, r0)
            android.widget.TextView r4 = r2.A00
            java.lang.String r0 = r2.A02
            r4.setText(r0)
            X.33j r3 = r2.A01
            android.content.res.Resources r2 = r6.getResources()
            r1 = 0
            r0 = 2131233755(0x7f080bdb, float:1.8083656E38)
            android.graphics.drawable.Drawable r1 = X.C02680He.A00(r1, r2, r0)
            X.6dx r0 = new X.6dx
            r0.<init>(r1, r3)
            r4.setBackground(r0)
            r0 = 0
            r4.setVisibility(r0)
            r4.setTranslationY(r5)
            r0 = 0
            r4.setAlpha(r0)
            android.view.ViewPropertyAnimator r2 = X.C86624Kv.A0B(r4)
            r0 = 320(0x140, double:1.58E-321)
            X.C86634Kw.A1E(r2, r0)
            return
        L_0x0086:
            java.lang.Object r2 = r1.A00
            X.5Qn r2 = (X.C104325Qn) r2
            X.5UW r1 = r2.A05
            com.whatsapp.jid.UserJid r0 = r2.A07
            java.util.concurrent.Future r0 = r1.A04(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x000e }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x000e }
            X.08M r0 = r2.A04     // Catch:{ Exception -> 0x000e }
            r0.A0G(r1)     // Catch:{ Exception -> 0x000e }
            goto L_0x09cd
        L_0x009f:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r0 = r0.A03
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x000e
            r0 = 1
            r1.setSoftInputMode(r0)
            return
        L_0x00b0:
            java.lang.Object r2 = r1.A00
            X.5PC r2 = (X.AnonymousClass5PC) r2
            X.5UW r1 = r2.A0D
            com.whatsapp.jid.UserJid r0 = r2.A0J
            java.util.concurrent.Future r0 = r1.A04(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x00cb }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x00cb }
            X.08M r0 = r2.A01     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x000e
            r0.A0G(r1)     // Catch:{ Exception -> 0x00cb }
            goto L_0x09ce
        L_0x00cb:
            X.08M r2 = r2.A07
            if (r2 == 0) goto L_0x000e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x00d1:
            r2.A0G(r0)
            return
        L_0x00d5:
            java.lang.Object r0 = r1.A00
            X.4gr r0 = (X.C90184gr) r0
            X.8s8 r2 = r0.A01
            if (r2 == 0) goto L_0x000e
            java.lang.Integer r1 = X.AnonymousClass001.A0f()
            java.lang.String r0 = "Direct connection error"
            X.C86654Ky.A1N(r2, r1, r0)
            return
        L_0x00e7:
            java.lang.Object r5 = r1.A00
            X.4rF r5 = (X.C94414rF) r5
            X.1VX r1 = r5.A05
            r0 = 1846(0x736, float:2.587E-42)
            java.lang.String r6 = r1.A0Q(r0)
            boolean r1 = r5.A01
            X.33g r4 = r5.A03
            boolean r0 = r4.A0F()
            if (r1 != r0) goto L_0x0105
            java.lang.String r0 = r5.A00
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x000e
        L_0x0105:
            java.lang.String r0 = r5.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0113
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x000e
        L_0x0113:
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            java.lang.String r0 = r5.A00
            java.lang.String r2 = ","
            java.lang.String[] r1 = r0.split(r2)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0129
            java.util.List r0 = java.util.Arrays.asList(r1)
            r3.addAll(r0)
        L_0x0129:
            java.lang.String[] r1 = r6.split(r2)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0137
            java.util.List r0 = java.util.Arrays.asList(r1)
            r3.addAll(r0)
        L_0x0137:
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x000e
            java.util.Iterator r3 = r3.iterator()
        L_0x0141:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = X.AnonymousClass001.A0m(r3)
            com.whatsapp.jid.PhoneUserJid r2 = X.AnonymousClass32X.A00(r0)     // Catch:{ 24P -> 0x016c }
            X.3Ex r0 = r5.A04
            boolean r0 = r0.A0l(r2)
            if (r0 != 0) goto L_0x0161
            X.2Eb r0 = r5.A02
            X.314 r0 = r0.A00
            boolean r0 = r0.A0D(r2)
            if (r0 == 0) goto L_0x0141
        L_0x0161:
            r0 = 0
            X.92z r1 = new X.92z
            r1.<init>(r5, r0)
            r0 = 0
            r4.A08(r1, r2, r0)
            goto L_0x0141
        L_0x016c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0141
        L_0x0175:
            java.lang.Object r8 = r1.A00
            X.5PA r8 = (X.AnonymousClass5PA) r8
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x000e
            java.lang.String r7 = "background"
            goto L_0x018d
        L_0x0180:
            java.lang.Object r8 = r1.A00
            X.5PA r8 = (X.AnonymousClass5PA) r8
            r0 = 0
            r8.A07 = r0
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x000e
            java.lang.String r7 = "foreground"
        L_0x018d:
            java.lang.String r0 = "background"
            boolean r0 = r7.equals(r0)
            r16 = r0 ^ 1
            X.7NV r0 = r8.A02
            X.C626936e.A06(r0)
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x01ef
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r8.A00
            long r3 = X.C18280x3.A08(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BatteryMetrics/coldStartDuration/"
            X.C18260x0.A10(r0, r1, r3)
            X.1VX r1 = r8.A0G
            r0 = 2640(0xa50, float:3.7E-42)
            long r1 = X.C56952sp.A06(r1, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ef
            java.lang.String r0 = "BatteryMetrics: Ignoring short cold start session"
        L_0x01bf:
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x01c2:
            X.33p r9 = r8.A0E
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r9)
            java.lang.String r5 = "network_statistics_last_report_time"
            long r10 = X.AnonymousClass0x2.A0A(r0, r5)
            long r1 = java.lang.System.currentTimeMillis()
            long r14 = r1 - r10
            r3 = 157680000000(0x24b675dc00, double:7.79042710362E-313)
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e1
            long r14 = X.C18310x6.A0A(r10)
        L_0x01e1:
            X.2gD r4 = r8.A0I
            X.0yQ r0 = r4.A00
            if (r0 == 0) goto L_0x03cb
            X.C626936e.A06(r0)
            X.0yQ r3 = r4.A00
            monitor-enter(r3)
            goto L_0x03b9
        L_0x01ef:
            X.7NV r3 = r8.A02
            boolean r2 = r3.A02
            X.7Uj r1 = r3.A04
            X.8L6 r0 = r3.A00
            boolean r0 = r1.A02(r0)
            r2 = r2 & r0
            r3.A02 = r2
            if (r2 != 0) goto L_0x0208
            r6 = 0
        L_0x0201:
            X.6Kn r6 = (X.C126056Kn) r6
            if (r6 != 0) goto L_0x021a
            java.lang.String r0 = "BatteryMetrics: CompositeMetrics are null"
            goto L_0x01bf
        L_0x0208:
            X.8L6 r1 = r3.A00
            X.8L6 r0 = r3.A01
            X.8L6 r6 = r3.A03
            r1.A01(r0, r6)
            X.8L6 r1 = r3.A01
            X.8L6 r0 = r3.A00
            r3.A01 = r0
            r3.A00 = r1
            goto L_0x0201
        L_0x021a:
            java.lang.Class<X.6Kj> r0 = X.C126016Kj.class
            X.8L6 r5 = r6.A02(r0)
            X.6Kj r5 = (X.C126016Kj) r5
            java.lang.Class<X.6Kl> r0 = X.C126036Kl.class
            X.8L6 r4 = r6.A02(r0)
            X.6Kl r4 = (X.C126036Kl) r4
            X.4sR r0 = r8.A03
            X.C626936e.A06(r0)
            X.4FV r3 = r8.A0H
            X.4sR r2 = r8.A03
            r1 = 0
            r0 = 0
            java.lang.Integer r10 = r3.AzK(r2, r1, r0)
            if (r10 == 0) goto L_0x0306
            X.4sR r2 = new X.4sR
            r2.<init>()
            r2.A09 = r7
            long r0 = r5.realtimeMs
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08 = r0
            long r0 = r5.uptimeMs
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
            double r0 = r4.systemTimeS
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A00 = r0
            double r0 = r4.userTimeS
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A01 = r0
            java.lang.Class<X.6Kk> r0 = X.C126026Kk.class
            X.8L6 r9 = r6.A02(r0)
            X.6Kk r9 = (X.C126026Kk) r9
            long r0 = r9.mobileBytesRx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02 = r0
            long r0 = r9.mobileBytesTx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A03 = r0
            long r0 = r9.wifiBytesRx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            long r0 = r9.wifiBytesTx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            boolean[] r9 = r8.A09
            r0 = 0
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x029a
            java.lang.String r0 = "daily_cron "
            r1.append(r0)
        L_0x029a:
            r0 = 1
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x02a4
            java.lang.String r0 = "db_backup "
            r1.append(r0)
        L_0x02a4:
            r0 = 2
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x02ae
            java.lang.String r0 = "gdrive_backup "
            r1.append(r0)
        L_0x02ae:
            r0 = 3
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x02b8
            java.lang.String r0 = "voice_call "
            r1.append(r0)
        L_0x02b8:
            r0 = 4
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x02c2
            java.lang.String r0 = "video_call "
            r1.append(r0)
        L_0x02c2:
            r0 = 5
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x02cc
            java.lang.String r0 = "db_migration "
            r1.append(r0)
        L_0x02cc:
            r0 = 6
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x02d6
            java.lang.String r0 = "gdrive_backup_with_worker "
            r1.append(r0)
        L_0x02d6:
            r0 = 7
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x02e0
            java.lang.String r0 = "gdrive_old_media_enc_re_upload "
            r1.append(r0)
        L_0x02e0:
            java.lang.String r0 = r1.toString()
            r2.A0A = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A06
            java.lang.Long r0 = X.C18310x6.A0g(r0)
            r2.A06 = r0
            int r0 = r10.intValue()
            r3.BhE(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BatteryMetrics: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            X.C18260x0.A1P(r1, r0, r6)
        L_0x0306:
            double r0 = r4.systemTimeS
            double r6 = r4.userTimeS
            double r0 = r0 + r6
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r6
            long r9 = r5.realtimeMs
            double r6 = (double) r9
            double r0 = r0 / r6
            r6 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r0 = r0 * r6
            X.3Mh r4 = r8.A0C
            X.1Eh r2 = X.C66663Mh.A10
            java.lang.Class<X.3Mh> r7 = X.C66663Mh.class
            monitor-enter(r7)
            android.content.SharedPreferences r6 = r4.A00     // Catch:{ all -> 0x09d2 }
            java.lang.String r4 = r2.A00     // Catch:{ all -> 0x09d2 }
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r2 = r6.getFloat(r4, r2)     // Catch:{ all -> 0x09d2 }
            monitor-exit(r7)     // Catch:{ all -> 0x09d2 }
            double r6 = (double) r2     // Catch:{ all -> 0x09d2 }
            r4 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x033f
            X.2qk r6 = r8.A0B
            java.lang.String r2 = "CriticalBatteryUsageEvent"
            java.lang.String r0 = java.lang.Double.toString(r0)
            r6.A0A(r2, r4, r0)
        L_0x033f:
            boolean[] r2 = r8.A0A
            boolean[] r1 = r8.A09
            r0 = 8
            java.lang.System.arraycopy(r2, r4, r1, r4, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A06
            r0.set(r4)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r5.realtimeMs
            long r10 = r2.toSeconds(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            X.4FS r0 = r8.A0K
            boolean r0 = r0 instanceof X.C69423Wy
            if (r0 == 0) goto L_0x01c2
            X.4rd r0 = r8.A04
            X.C626936e.A06(r0)
            X.4rd r1 = r8.A04
            r0 = 0
            java.lang.Integer r9 = r3.AzK(r1, r0, r4)
            X.2p2 r0 = X.C69423Wy.A06
            X.2pN r6 = r0.A00
            java.util.concurrent.atomic.AtomicLong r0 = r6.A03
            r4 = 0
            long r0 = r0.getAndSet(r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.concurrent.atomic.AtomicLong r0 = r6.A04
            long r0 = r0.getAndSet(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r6 = android.util.Pair.create(r2, r0)
            X.1io r0 = r8.A0F
            long r1 = r0.A00
            r0.A00 = r4
            if (r9 == 0) goto L_0x01c2
            X.4rd r4 = new X.4rd
            r4.<init>()
            r4.A00 = r7
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r4.A04 = r0
            java.lang.Object r0 = r6.first
            java.lang.Long r0 = (java.lang.Long) r0
            r4.A02 = r0
            java.lang.Object r0 = r6.second
            java.lang.Long r0 = (java.lang.Long) r0
            r4.A03 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r4.A01 = r0
            int r0 = r9.intValue()
            r3.BhE(r4, r0)
            goto L_0x01c2
        L_0x03b9:
            r3.A00()     // Catch:{ all -> 0x09cf }
            java.util.HashMap r0 = X.C58052ud.A00     // Catch:{ all -> 0x09cf }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x09cf }
            r7.<init>(r0)     // Catch:{ all -> 0x09cf }
            r0.clear()     // Catch:{ all -> 0x09cf }
            monitor-exit(r3)
            r4.A00()
            goto L_0x03cf
        L_0x03cb:
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
        L_0x03cf:
            X.0yQ r0 = r4.A00
            if (r0 == 0) goto L_0x03eb
            X.C626936e.A06(r0)
            X.0yQ r3 = r4.A00
            monitor-enter(r3)
            r3.A00()     // Catch:{ all -> 0x09cf }
            java.util.HashMap r0 = X.C58052ud.A01     // Catch:{ all -> 0x09cf }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x09cf }
            r6.<init>(r0)     // Catch:{ all -> 0x09cf }
            r0.clear()     // Catch:{ all -> 0x09cf }
            monitor-exit(r3)
            r4.A00()
            goto L_0x03ef
        L_0x03eb:
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
        L_0x03ef:
            X.C18260x0.A0M(r9, r5, r1)
            r1 = -1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x000e
            r1 = 0
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x000e
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x040a
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x000e
        L_0x040a:
            X.4rf r0 = r8.A05
            X.C626936e.A06(r0)
            X.4FV r5 = r8.A0H
            X.4rf r2 = r8.A05
            r1 = 0
            r0 = 0
            java.lang.Integer r13 = r5.AzK(r2, r1, r0)
            if (r13 == 0) goto L_0x000e
            java.util.HashSet r1 = X.AnonymousClass002.A0K()
            java.util.Set r0 = r7.keySet()
            r1.addAll(r0)
            java.util.Set r0 = r6.keySet()
            r1.addAll(r0)
            java.util.Iterator r12 = r1.iterator()
        L_0x0431:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r8 = r12.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            boolean r0 = r7.containsKey(r8)
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r9 = 0
            if (r0 == 0) goto L_0x04b1
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r8, r7)
            if (r0 == 0) goto L_0x04b1
            long r2 = r0.longValue()
            double r0 = (double) r2
            double r0 = r0 / r10
            double r2 = java.lang.Math.ceil(r0)
            long r0 = (long) r2
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x045e:
            boolean r0 = r6.containsKey(r8)
            if (r0 == 0) goto L_0x0479
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r8, r6)
            if (r0 == 0) goto L_0x0479
            long r2 = r0.longValue()
            double r0 = (double) r2
            double r0 = r0 / r10
            double r2 = java.lang.Math.ceil(r0)
            long r0 = (long) r2
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L_0x0479:
            if (r4 == 0) goto L_0x04a4
            long r10 = r4.longValue()
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04a4
        L_0x0485:
            X.4rf r1 = new X.4rf
            r1.<init>()
            r1.A00 = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r1.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A01 = r0
            r1.A02 = r4
            r1.A03 = r9
            int r0 = r13.intValue()
            r5.BhE(r1, r0)
            goto L_0x0431
        L_0x04a4:
            if (r9 == 0) goto L_0x0431
            long r10 = r9.longValue()
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0431
            goto L_0x0485
        L_0x04b1:
            r4 = r9
            goto L_0x045e
        L_0x04b3:
            java.lang.Object r0 = r1.A00
            X.2Qp r0 = (X.C43062Qp) r0
            X.1ih r0 = r0.A03
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x04bd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r1.next()
            X.2sh r0 = (X.C56872sh) r0
            r0.A04()
            goto L_0x04bd
        L_0x04cd:
            java.lang.Object r3 = r1.A00
            X.3SJ r3 = (X.AnonymousClass3SJ) r3
            X.2kc r0 = r3.A04
            X.66R r4 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r4)
            java.lang.String r0 = "pref_avatar_preview_cache_url"
            r2 = 0
            X.C18270x1.A0j(r1, r0, r2)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A04(r4)
            java.lang.String r0 = "pref_avatar_profile_photo_poses"
            X.C18270x1.A0j(r1, r0, r2)
            X.2gt r0 = r3.A05
            X.2Wt r0 = r0.A02
            r4 = 1
            X.66R r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.30R r0 = (X.AnonymousClass30R) r0
            r0.A05(r4)
            X.2mU r0 = r3.A06
            r0.A02()
            X.2gs r0 = r3.A03
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x000e
            X.1iO r0 = r3.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x09d5
            X.2dT r0 = r3.A02
            java.lang.String r1 = "avatar_art_update"
            r3 = 7
            X.44W r2 = X.AnonymousClass44W.A00
            r6 = r4
            r5 = r4
            r0.A00(r1, r2, r3, r4, r5, r6)
            return
        L_0x0518:
            java.lang.Object r3 = r1.A00
            com.whatsapp.blocklist.BlockList r3 = (com.whatsapp.blocklist.BlockList) r3
            X.2sq r0 = r3.A02
            java.util.Set r1 = r0.A06()
            java.lang.Object r2 = r3.A0R
            monitor-enter(r2)
            java.util.Set r0 = r3.A0U     // Catch:{ all -> 0x0533 }
            r0.addAll(r1)     // Catch:{ all -> 0x0533 }
            X.3Wi r1 = r3.A05     // Catch:{ all -> 0x0533 }
            r0 = 46
            A00(r1, r3, r0)     // Catch:{ all -> 0x0533 }
            monitor-exit(r2)     // Catch:{ all -> 0x0533 }
            return
        L_0x0533:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0533 }
            throw r0
        L_0x0536:
            java.lang.Object r3 = r1.A00
            com.whatsapp.blocklist.BlockList r3 = (com.whatsapp.blocklist.BlockList) r3
            X.2sq r0 = r3.A02
            java.util.Set r1 = r0.A06()
            java.lang.Object r2 = r3.A0R
            monitor-enter(r2)
            java.util.Set r0 = r3.A0U     // Catch:{ all -> 0x0554 }
            r0.clear()     // Catch:{ all -> 0x0554 }
            r0.addAll(r1)     // Catch:{ all -> 0x0554 }
            X.3Wi r1 = r3.A05     // Catch:{ all -> 0x0554 }
            r0 = 46
            A00(r1, r3, r0)     // Catch:{ all -> 0x0554 }
            monitor-exit(r2)     // Catch:{ all -> 0x0554 }
            return
        L_0x0554:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0554 }
            throw r0
        L_0x0557:
            java.lang.Object r0 = r1.A00
            com.whatsapp.blocklist.BlockList r0 = (com.whatsapp.blocklist.BlockList) r0
            r0.A75()
            return
        L_0x055f:
            java.lang.Object r5 = r1.A00
            com.whatsapp.blocklist.BlockList r5 = (com.whatsapp.blocklist.BlockList) r5
            java.util.ArrayList r4 = r5.A0S
            r4.clear()
            java.util.ArrayList r8 = r5.A0T
            r8.clear()
            java.lang.Object r3 = r5.A0R
            monitor-enter(r3)
            java.util.Set r0 = r5.A0U     // Catch:{ all -> 0x062d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x062d }
        L_0x0576:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x062d }
            if (r0 == 0) goto L_0x0586
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)     // Catch:{ all -> 0x062d }
            X.3Ex r0 = r5.A05     // Catch:{ all -> 0x062d }
            X.C86614Ku.A1P(r0, r1, r8)     // Catch:{ all -> 0x062d }
            goto L_0x0576
        L_0x0586:
            monitor-exit(r3)     // Catch:{ all -> 0x062d }
            X.5ZU r2 = r5.A07
            X.33j r1 = r5.A00
            X.5sc r0 = new X.5sc
            r0.<init>(r2, r1)
            java.util.Collections.sort(r8, r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r8.iterator()
        L_0x05a3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x05c3
            X.3ZH r2 = X.C18310x6.A0R(r8)
            boolean r1 = r2.A0R()
            X.5jC r0 = new X.5jC
            if (r1 == 0) goto L_0x05bc
            r0.<init>(r2)
            r6.add(r0)
            goto L_0x05a3
        L_0x05bc:
            r0.<init>(r2)
            r7.add(r0)
            goto L_0x05a3
        L_0x05c3:
            X.9Tt r0 = r5.A0G
            if (r0 == 0) goto L_0x05f1
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x05f1
            X.9Tt r0 = r5.A0G
            java.util.Set r0 = r0.A01()
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            java.util.Collections.sort(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x05de:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05f1
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            X.5jE r0 = new X.5jE
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x05de
        L_0x05f1:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0600
            r1 = 0
            X.5jD r0 = new X.5jD
            r0.<init>(r1)
            r4.add(r0)
        L_0x0600:
            r4.addAll(r7)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0615
            r1 = 1
            X.5jD r0 = new X.5jD
            r0.<init>(r1)
            r4.add(r0)
            r4.addAll(r6)
        L_0x0615:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0624
            r1 = 2
            X.5jD r0 = new X.5jD
            r0.<init>(r1)
            r4.add(r0)
        L_0x0624:
            r4.addAll(r3)
            X.4OO r0 = r5.A01
            r0.notifyDataSetChanged()
            return
        L_0x062d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x062d }
            throw r0
        L_0x0630:
            java.lang.Object r3 = r1.A00
            com.whatsapp.blocklist.BlockList r3 = (com.whatsapp.blocklist.BlockList) r3
            X.2sq r0 = r3.A02
            java.util.Set r1 = r0.A06()
            java.lang.Object r2 = r3.A0R
            monitor-enter(r2)
            java.util.Set r0 = r3.A0U     // Catch:{ all -> 0x0655 }
            r0.clear()     // Catch:{ all -> 0x0655 }
            r0.addAll(r1)     // Catch:{ all -> 0x0655 }
            X.3Wi r1 = r3.A05     // Catch:{ all -> 0x0655 }
            r0 = 46
            A00(r1, r3, r0)     // Catch:{ all -> 0x0655 }
            X.3Wi r1 = r3.A05     // Catch:{ all -> 0x0655 }
            r0 = 47
            A00(r1, r3, r0)     // Catch:{ all -> 0x0655 }
            monitor-exit(r2)     // Catch:{ all -> 0x0655 }
            return
        L_0x0655:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0655 }
            throw r0
        L_0x0658:
            java.lang.Object r2 = r1.A00
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            r0 = 2131433006(0x7f0b162e, float:1.8487785E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r2, r0)
            r0 = 2131893060(0x7f121b44, float:1.9420886E38)
            r1.setText(r0)
            r0 = 2131433004(0x7f0b162c, float:1.8487781E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r2, r0)
            r0 = 2131893061(0x7f121b45, float:1.9420888E38)
            r1.setText(r0)
            return
        L_0x067b:
            java.lang.Object r0 = r1.A00
            X.4ha r0 = (X.C90514ha) r0
            X.2dz r4 = r0.A0o
            com.whatsapp.jid.UserJid r2 = r0.A0r
            X.5dw r0 = r0.A0V
            if (r0 == 0) goto L_0x0692
            java.lang.String r1 = r0.A0F
        L_0x0689:
            java.lang.String r0 = "product_link"
            X.2vg r3 = new X.2vg
            r3.<init>(r2, r0, r1)
            goto L_0x0743
        L_0x0692:
            r1 = 0
            goto L_0x0689
        L_0x0694:
            java.lang.Object r2 = r1.A00
            X.8EO r2 = (X.AnonymousClass8EO) r2
            X.33g r1 = r2.A01
            com.whatsapp.jid.UserJid r0 = r2.A03
            X.5dt r1 = r1.A02(r0)
            X.08M r0 = r2.A00
            r0.A0G(r1)
            return
        L_0x06a6:
            java.lang.Object r1 = r1.A00
            X.4gs r1 = (X.C90194gs) r1
            X.7KL r0 = r1.A00
            if (r0 != 0) goto L_0x06b1
            java.lang.String r0 = "CreateOrderProtocol/onDirectConnectionSucceeded/Failed to repeat request. It is null"
            goto L_0x06d4
        L_0x06b1:
            java.lang.String r0 = "CreateOrderProtocol/onDirectConnectionSucceeded/retrying request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.7KL r0 = r1.A00
            r1.A02(r0)
            return
        L_0x06bc:
            java.lang.Object r3 = r1.A00
            X.4gs r3 = (X.C90194gs) r3
            X.8s8 r2 = r3.A01
            if (r2 == 0) goto L_0x06cf
            r0 = 421(0x1a5, float:5.9E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "Failed to create direct connection info"
            X.C86654Ky.A1N(r2, r1, r0)
        L_0x06cf:
            r0 = 0
            r3.A00 = r0
            java.lang.String r0 = "CreateOrderProtocol/onDirectConnectionError/Failed to create direct connection info"
        L_0x06d4:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x06d8:
            java.lang.Object r0 = r1.A00
            X.4gs r0 = (X.C90194gs) r0
            X.8s8 r2 = r0.A01
            if (r2 == 0) goto L_0x06e9
            java.lang.Integer r1 = X.AnonymousClass001.A0f()
            java.lang.String r0 = "delivery failure"
            X.C86654Ky.A1N(r2, r1, r0)
        L_0x06e9:
            java.lang.String r0 = "CreateOrderProtocol/onDeliveryFailure"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x06ef:
            java.lang.Object r0 = r1.A00
            X.3GP r0 = (X.AnonymousClass3GP) r0
            X.8qC r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.1iR r0 = (X.C29201iR) r0
            r0.A08()
            return
        L_0x06ff:
            java.lang.Object r5 = r1.A00
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r5 = (com.whatsapp.biz.catalog.view.widgets.QuantitySelector) r5
            com.whatsapp.WaImageButton r0 = r5.A0H
            int r4 = r0.getMeasuredWidth()
            int r3 = r5.getMeasuredWidth()
            android.animation.ValueAnimator r2 = X.C86604Kt.A06(r3, r4)
            r5.A02 = r2
            r1 = 0
            X.75O r0 = new X.75O
            r0.<init>(r5, r3, r4, r1)
            r2.addUpdateListener(r0)
            android.animation.ValueAnimator r1 = r5.A02
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r2 = r5.A02
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.animation.ValueAnimator r0 = r5.A02
            r0.start()
            return
        L_0x0733:
            java.lang.Object r0 = r1.A00
            X.4hW r0 = (X.C90504hW) r0
            X.2dz r4 = r0.A0L
            com.whatsapp.jid.UserJid r2 = r0.A0M
            java.lang.String r1 = "catalog_link"
            r0 = 0
            X.2vg r3 = new X.2vg
            r3.<init>(r2, r1, r0)
        L_0x0743:
            r4.A01(r3)
            return
        L_0x0747:
            java.lang.Object r0 = r1.A00
            X.4hO r0 = (X.C90484hO) r0
            r0.A06()
            X.2U6 r6 = r0.A00
            X.5TG r9 = r0.A01
            r1 = 0
            X.C162457s7.A0J(r9, r1)
            X.1VX r5 = r6.A05
            X.2s4 r7 = r6.A00
            X.33p r10 = r6.A04
            X.8qC r4 = r6.A07
            X.4C1 r3 = r6.A08
            X.4C1 r2 = r6.A0F
            X.33g r8 = r6.A01
            X.28T r1 = r6.A06
            X.4hG r6 = new X.4hG
            r11 = r5
            r12 = r1
            r13 = r4
            r14 = r3
            r15 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0841
        L_0x0772:
            java.lang.Object r0 = r1.A00
            X.4hM r0 = (X.C90464hM) r0
            r0.A06()
            X.2U6 r1 = r0.A02
            X.2zH r4 = r0.A03
            X.1VX r6 = r1.A05
            X.2s4 r2 = r1.A00
            X.33p r5 = r1.A04
            X.33g r3 = r1.A01
            X.8qC r8 = r1.A07
            X.4C1 r10 = r1.A08
            X.4C1 r11 = r1.A0D
            X.28T r7 = r1.A06
            X.5Tt r1 = r1.A02
            java.lang.String r9 = r1.A02
            X.4hI r1 = new X.4hI
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x081d
        L_0x0798:
            java.lang.Object r0 = r1.A00
            X.4hL r0 = (X.C90454hL) r0
            r0.A06()
            X.2U6 r1 = r0.A03
            X.7PB r5 = r0.A07
            X.1VX r6 = r1.A05
            X.2s4 r2 = r1.A00
            X.33p r4 = r1.A04
            X.33g r3 = r1.A01
            X.8qC r8 = r1.A07
            X.4C1 r9 = r1.A08
            X.4C1 r10 = r1.A0E
            X.28T r7 = r1.A06
            X.4tw r1 = new X.4tw
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x081d
        L_0x07b9:
            java.lang.Object r0 = r1.A00
            X.4hP r0 = (X.C90494hP) r0
            r0.A06()
            X.2U6 r1 = r0.A02
            X.7n8 r6 = r0.A06
            X.1VX r7 = r1.A05
            X.2s4 r2 = r1.A00
            X.33p r5 = r1.A04
            X.33g r3 = r1.A01
            X.8qC r9 = r1.A07
            X.4C1 r10 = r1.A08
            X.4C1 r11 = r1.A0C
            X.28T r8 = r1.A06
            X.258 r4 = r1.A03
            X.4hH r1 = new X.4hH
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x081d
        L_0x07dc:
            java.lang.Object r0 = r1.A00
            X.4hK r0 = (X.C90444hK) r0
            r0.A06()
            X.2U6 r1 = r0.A01
            X.7PS r9 = r0.A02
            X.1VX r11 = r1.A05
            X.2s4 r7 = r1.A00
            X.33p r10 = r1.A04
            X.8qC r13 = r1.A07
            X.4C1 r14 = r1.A08
            X.4C1 r15 = r1.A0B
            X.33g r8 = r1.A01
            X.28T r12 = r1.A06
            X.4hF r6 = new X.4hF
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0841
        L_0x07fd:
            java.lang.Object r0 = r1.A00
            X.4hN r0 = (X.C90474hN) r0
            r0.A06()
            X.2U6 r1 = r0.A02
            X.7Tq r4 = r0.A01
            X.1VX r6 = r1.A05
            X.2s4 r2 = r1.A00
            X.33p r5 = r1.A04
            X.8qC r8 = r1.A07
            X.4C1 r9 = r1.A08
            X.4C1 r10 = r1.A0A
            X.33g r3 = r1.A01
            X.28T r7 = r1.A06
            X.4hE r1 = new X.4hE
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x081d:
            r1.Bh4(r0)
            return
        L_0x0821:
            java.lang.Object r0 = r1.A00
            X.4hJ r0 = (X.C90434hJ) r0
            r0.A06()
            X.2U6 r1 = r0.A02
            X.7Gv r9 = r0.A01
            X.1VX r11 = r1.A05
            X.2s4 r7 = r1.A00
            X.33p r10 = r1.A04
            X.8qC r13 = r1.A07
            X.4C1 r14 = r1.A08
            X.4C1 r15 = r1.A09
            X.33g r8 = r1.A01
            X.28T r12 = r1.A06
            X.4hD r6 = new X.4hD
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0841:
            r6.Bh4(r0)
            return
        L_0x0845:
            java.lang.Object r0 = r1.A00
            X.03q r0 = (X.C003203q) r0
            r0.A5V()
            return
        L_0x084d:
            java.lang.Object r2 = r1.A00
            X.4Ty r2 = (X.C87604Ty) r2
            X.33g r1 = r2.A03
            com.whatsapp.jid.UserJid r0 = r2.A07
            X.5dt r5 = r1.A02(r0)
            X.08M r4 = r2.A00
            X.5Th r3 = r2.A02
            r2 = 0
            if (r5 == 0) goto L_0x087b
            boolean r0 = r5.A0W
            if (r0 == 0) goto L_0x087b
            boolean r0 = r5.A0X
            if (r0 == 0) goto L_0x087f
            boolean r0 = r3.A03(r5)
            if (r0 == 0) goto L_0x087b
            java.lang.String r1 = "UNBLOCKED"
            java.lang.String r0 = r3.A00(r5)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x087b
        L_0x087a:
            r2 = 1
        L_0x087b:
            X.C06270Wx.A05(r4, r2)
            return
        L_0x087f:
            X.2rx r1 = r3.A03
            com.whatsapp.jid.UserJid r0 = r5.A08
            boolean r1 = r1.A03(r0)
            boolean r0 = r5.A0Y
            if (r0 != 0) goto L_0x087a
            if (r1 == 0) goto L_0x087b
            goto L_0x087a
        L_0x088e:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r3 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r3
            int r1 = r3.A00
            r2 = 59
            if (r1 == 0) goto L_0x08a5
            r2 = 1
            if (r1 == r2) goto L_0x08b0
            r0 = 2
            if (r1 == r0) goto L_0x08ad
            r0 = 3
            if (r1 == r0) goto L_0x08ad
            r0 = 4
            if (r1 != r0) goto L_0x08a5
            r2 = 4
        L_0x08a5:
            X.30V r1 = r3.A13
            com.whatsapp.jid.UserJid r0 = r3.A0u
            r1.A03(r0, r2)
            return
        L_0x08ad:
            r2 = 60
            goto L_0x08a5
        L_0x08b0:
            r2 = 61
            goto L_0x08a5
        L_0x08b3:
            java.lang.Object r0 = r1.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r0
            X.4c7 r0 = r0.A0o
            r0.A09()
            return
        L_0x08bd:
            java.lang.Object r2 = r1.A00
            X.5Ox r2 = (X.C103915Ox) r2
            X.5PL r1 = r2.A03
            com.whatsapp.jid.UserJid r0 = r2.A07
            r1.A01(r0)
            r2.A00()
            return
        L_0x08cc:
            java.lang.Object r1 = r1.A00
            X.5if r1 = (X.C111775if) r1
            X.5T7 r0 = r1.A04
            X.1iS r0 = r0.A05
            r0.A07(r1)
            return
        L_0x08d8:
            java.lang.Object r1 = r1.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            goto L_0x08e4
        L_0x08df:
            java.lang.Object r1 = r1.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 0
        L_0x08e4:
            r1.setVisibility(r0)
            return
        L_0x08e8:
            java.lang.Object r3 = r1.A00
            X.4LX r3 = (X.AnonymousClass4LX) r3
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            r2.addAction(r0)
            java.lang.String r0 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            r2.addAction(r0)
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0914
            X.1VX r1 = r3.A04
            r0 = 580(0x244, float:8.13E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0914
            java.lang.String r0 = "com.samsung.android.action.WARNING_NOTIFICATION"
            r2.addAction(r0)
        L_0x0914:
            android.content.Context r1 = r3.A00
            r0 = 1
            X.C154317cy.A01(r3, r1, r2, r0)
            r3.A02()
            return
        L_0x091e:
            java.lang.Object r0 = r1.A00
            X.2Qp r0 = (X.C43062Qp) r0
            X.1ih r0 = r0.A03
            r0.A08()
            return
        L_0x0928:
            java.lang.Object r7 = r1.A00
            X.3SJ r7 = (X.AnonymousClass3SJ) r7
            X.2dT r4 = r7.A02
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0G
            r0 = 1
            r1.set(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r4.A00
            java.lang.Object r3 = r0.get()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0949
            X.3Wi r2 = r4.A01
            r1 = 7
            X.3bv r0 = new X.3bv
            r0.<init>(r1, r3, r4)
            r2.A0S(r0)
        L_0x0949:
            X.2op r1 = r4.A0E
            r0 = 2
            java.util.List r0 = r1.A00(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0954:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x096e
            java.lang.Object r1 = r3.next()
            X.2iT r1 = (X.C50612iT) r1
            boolean r0 = r1.A0S
            if (r0 == 0) goto L_0x0954
            X.2sn r2 = r4.A0B
            java.lang.String r1 = r1.A0G
            X.4BO r0 = r4.A0A
            r2.A0D(r0, r1)
            goto L_0x0954
        L_0x096e:
            X.2gt r0 = r4.A07
            X.2Wt r0 = r0.A02
            r1 = 1
            X.66R r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.30R r0 = (X.AnonymousClass30R) r0
            r0.A05(r1)
            X.1el r3 = r4.A09
            X.3dI r2 = r3.A0C
            r1 = 20
            X.5sF r0 = new X.5sF
            r0.<init>(r3, r1)
            r2.execute(r0)
            X.2pZ r6 = r4.A0D
            X.C626936e.A00()
            r6.A01()
            X.2yp r0 = r6.A05
            X.8qC r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.0y0 r0 = (X.C18630y0) r0
            X.4Fq r5 = r0.A0C()
            java.lang.String r0 = "1"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ all -> 0x09c2 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x09c2 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x09c2 }
            java.lang.String r2 = "starred_stickers"
            java.lang.String r1 = "is_avatar = ?"
            java.lang.String r0 = "removeStarredAvatarStickers/DELETE_STARRED_AVATAR_STICKERS"
            r3.A07(r2, r1, r0, r4)     // Catch:{ all -> 0x09c2 }
            r5.close()
            r6.A01()
            X.2mU r0 = r7.A06
            r0.A02()
            return
        L_0x09c2:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x09c7 }
            throw r1
        L_0x09c7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x09cc:
            return
        L_0x09cd:
            return
        L_0x09ce:
            return
        L_0x09cf:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x09d2:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x09d2 }
            throw r0
        L_0x09d5:
            X.2VX r2 = r3.A01
            r1 = 7
            java.lang.String r0 = "avatar_art_update"
            r2.A00(r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117115rP.run():void");
    }
}
