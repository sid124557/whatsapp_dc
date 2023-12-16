package X;

/* renamed from: X.5YY  reason: invalid class name */
public class AnonymousClass5YY {
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0291, code lost:
        r1 = new X.AnonymousClass24Y(X.AnonymousClass000.A0V("Unrecognized week day: ", r6, X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02a0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ea, code lost:
        switch(r5.hashCode()) {
            case -504372495: goto L_0x02fd;
            case 1800267202: goto L_0x0306;
            case 2060249164: goto L_0x030f;
            default: goto L_0x02ed;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ed, code lost:
        r1 = new X.AnonymousClass24Y(X.AnonymousClass000.A0V("Unrecognized open mode: ", r5, X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0303, code lost:
        if (r5.equals("open_24h") == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x030c, code lost:
        if (r5.equals("specific_hours") == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0315, code lost:
        if (r5.equals("appointment_only") == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0318, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x031a, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x031c, code lost:
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x031d, code lost:
        r10.add(new X.C166127yB(r13, r12, r6, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0356, code lost:
        if ("catalog_exists".equals(r5.A0r("status", (java.lang.String) null)) == false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0388, code lost:
        if (r5 == false) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03a2, code lost:
        if (r5 == false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03b4, code lost:
        if (r5 == false) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        if (r0 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0192, code lost:
        if (r5.equals("none") != false) goto L_0x0194;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x06d7  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x06df  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0212 A[LOOP:3: B:92:0x020c->B:94:0x0212, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C108985dt A00(com.whatsapp.jid.UserJid r16, X.AnonymousClass36K r17) {
        /*
            r8 = 0
            r2 = r17
            if (r17 != 0) goto L_0x0007
            r0 = 0
            return r0
        L_0x0007:
            X.5Wt r1 = new X.5Wt
            r1.<init>()
            r0 = r16
            r1.A08 = r0
            java.lang.String r0 = "tag"
            java.lang.String r0 = r2.A0r(r0, r8)
            r1.A0L = r0
            java.lang.String r0 = "structured_address"
            X.36K r3 = r2.A0l(r0)
            if (r3 == 0) goto L_0x0039
            java.lang.String r0 = "street_address"
            java.lang.String r10 = A02(r3, r0)
            java.lang.String r0 = "zip_code"
            java.lang.String r9 = A02(r3, r0)
            java.lang.String r0 = "city_id"
            java.lang.String r11 = A02(r3, r0)
            java.lang.String r0 = "localized_city_name"
            java.lang.String r12 = A02(r3, r0)
            goto L_0x0042
        L_0x0039:
            java.lang.String r0 = "address"
            java.lang.String r10 = A02(r2, r0)
            r12 = r8
            r9 = r8
            r11 = r8
        L_0x0042:
            java.lang.String r4 = "latitude"
            X.36K r3 = r2.A0l(r4)     // Catch:{ NumberFormatException -> 0x06ef }
            if (r3 == 0) goto L_0x0077
            java.lang.String r0 = r3.A0n()     // Catch:{ NumberFormatException -> 0x06ef }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r3.A0n()     // Catch:{ NumberFormatException -> 0x06ef }
            double r5 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x06ef }
            java.lang.Double r7 = java.lang.Double.valueOf(r5)     // Catch:{ NumberFormatException -> 0x06ef }
        L_0x005c:
            java.lang.String r3 = "longitude"
            X.36K r5 = r2.A0l(r3)     // Catch:{ NumberFormatException -> 0x06ef }
            if (r5 == 0) goto L_0x0079
            java.lang.String r0 = r5.A0n()     // Catch:{ NumberFormatException -> 0x06ef }
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = r5.A0n()     // Catch:{ NumberFormatException -> 0x06ef }
            double r5 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x06ef }
            java.lang.Double r6 = java.lang.Double.valueOf(r5)     // Catch:{ NumberFormatException -> 0x06ef }
            goto L_0x007a
        L_0x0077:
            r7 = 0
            goto L_0x005c
        L_0x0079:
            r6 = 0
        L_0x007a:
            java.lang.String r0 = ""
            r13 = r0
            if (r11 != 0) goto L_0x0080
            r11 = r0
        L_0x0080:
            if (r12 == 0) goto L_0x0083
            r0 = r12
        L_0x0083:
            X.5dH r5 = new X.5dH
            r5.<init>(r7, r6, r11, r0)
            X.5da r0 = new X.5da
            r0.<init>(r5, r8, r10, r9)
            r1.A07 = r0
            java.lang.String r7 = "description"
            java.lang.String r0 = A02(r2, r7)
            r1.A0G = r0
            java.lang.String r0 = "automated_type"
            java.lang.String r5 = A02(r2, r0)
            if (r5 == 0) goto L_0x00b0
            java.lang.String r0 = "1p_partial"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0122
            java.lang.String r0 = "3p_full"
            boolean r0 = r5.equals(r0)
            r5 = 2
            if (r0 != 0) goto L_0x00b1
        L_0x00b0:
            r5 = 0
        L_0x00b1:
            r1.A00 = r5
            java.lang.String r0 = "bot_description"
            java.lang.String r0 = A02(r2, r0)
            r1.A0A = r0
            java.lang.String r0 = "bot_sub_description"
            java.lang.String r0 = A02(r2, r0)
            r1.A0K = r0
            java.lang.String r0 = "commands"
            X.36K r5 = r2.A0l(r0)
            if (r5 == 0) goto L_0x012c
            X.36K r0 = r5.A0l(r7)
            if (r0 == 0) goto L_0x0120
            X.36K r0 = r5.A0l(r7)
            java.lang.String r0 = r0.A0n()
        L_0x00d9:
            r1.A0C = r0
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "command"
            java.util.List r0 = r5.A0s(r0)
            X.C162457s7.A0D(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x00ec:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0124
            X.36K r5 = X.C18310x6.A0Y(r10)
            java.lang.String r0 = "name"
            X.36K r0 = r5.A0l(r0)
            if (r0 == 0) goto L_0x00ec
            java.lang.String r6 = r0.A0n()
            if (r6 == 0) goto L_0x00ec
            boolean r0 = X.C107575bX.A0F(r6)
            if (r0 != 0) goto L_0x00ec
            X.36K r0 = r5.A0l(r7)
            if (r0 == 0) goto L_0x0116
            java.lang.String r5 = r0.A0n()
            if (r5 != 0) goto L_0x0117
        L_0x0116:
            r5 = r13
        L_0x0117:
            X.3ZL r0 = new X.3ZL
            r0.<init>(r6, r5)
            r9.add(r0)
            goto L_0x00ec
        L_0x0120:
            r0 = r8
            goto L_0x00d9
        L_0x0122:
            r5 = 1
            goto L_0x00b1
        L_0x0124:
            java.util.List r0 = r1.A0P
            r0.clear()
            r0.addAll(r9)
        L_0x012c:
            java.lang.String r0 = "prompts"
            X.36K r5 = r2.A0l(r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            if (r5 == 0) goto L_0x017b
            java.lang.String r0 = "prompt"
            java.util.List r0 = r5.A0s(r0)
            X.C162457s7.A0D(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0145:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x017b
            X.36K r5 = X.C18310x6.A0Y(r9)
            java.lang.String r0 = "text"
            X.36K r0 = r5.A0l(r0)
            if (r0 == 0) goto L_0x0145
            java.lang.String r6 = r0.A0n()
            if (r6 == 0) goto L_0x0145
            boolean r0 = X.C107575bX.A0F(r6)
            if (r0 != 0) goto L_0x0145
            java.lang.String r0 = "emoji"
            X.36K r0 = r5.A0l(r0)
            if (r0 == 0) goto L_0x0171
            java.lang.String r5 = r0.A0n()
            if (r5 != 0) goto L_0x0172
        L_0x0171:
            r5 = r13
        L_0x0172:
            X.2jL r0 = new X.2jL
            r0.<init>(r6, r5)
            r7.add(r0)
            goto L_0x0145
        L_0x017b:
            java.util.List r0 = r1.A0S
            r0.clear()
            r0.addAll(r7)
            java.lang.String r0 = "welcome_message_protocol_mode"
            java.lang.String r5 = A02(r2, r0)
            if (r5 == 0) goto L_0x0194
            java.lang.String r0 = "none"
            boolean r5 = r5.equals(r0)
            r0 = 1
            if (r5 == 0) goto L_0x0195
        L_0x0194:
            r0 = 0
        L_0x0195:
            r1.A0d = r0
            java.lang.String r0 = "email"
            java.lang.String r0 = A02(r2, r0)
            r1.A0H = r0
            java.lang.String r0 = "vertical"
            X.36K r5 = r2.A0l(r0)
            if (r5 == 0) goto L_0x01f0
            java.lang.String r0 = "canonical"
            java.lang.String r0 = r5.A0r(r0, r8)
        L_0x01ad:
            r1.A0M = r0
            java.util.List r9 = java.util.Collections.emptyList()
            java.lang.String r0 = "categories"
            java.util.List r5 = r2.A0s(r0)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01f2
            java.lang.Object r5 = X.C18290x4.A0k(r5)
            X.36K r5 = (X.AnonymousClass36K) r5
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "category"
            java.util.Iterator r7 = X.AnonymousClass36K.A0M(r5, r0)
        L_0x01cf:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01f2
            X.36K r5 = X.C18310x6.A0Y(r7)
            java.lang.String r0 = "id"
            java.lang.String r6 = r5.A0r(r0, r8)
            java.lang.String r5 = r5.A0n()
            if (r6 == 0) goto L_0x01cf
            if (r5 == 0) goto L_0x01cf
            X.7yh r0 = new X.7yh
            r0.<init>(r6, r5)
            r9.add(r0)
            goto L_0x01cf
        L_0x01f0:
            r0 = 0
            goto L_0x01ad
        L_0x01f2:
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            java.util.List r0 = r1.A0O
            r0.clear()
            r0.addAll(r9)
            java.lang.String r0 = "website"
            java.util.List r0 = r2.A0s(r0)
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r0.iterator()
        L_0x020c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x021e
            X.36K r0 = X.C18310x6.A0Y(r5)
            java.lang.String r0 = r0.A0n()
            r6.add(r0)
            goto L_0x020c
        L_0x021e:
            java.util.List r0 = r1.A0U
            r0.clear()
            r0.addAll(r6)
            java.lang.String r0 = "business_hours"
            X.36K r6 = r2.A0l(r0)
            r9 = 0
            if (r6 == 0) goto L_0x033e
            java.lang.String r0 = "timezone"
            java.lang.String r11 = r6.A0r(r0, r8)     // Catch:{ NumberFormatException -> 0x0336 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ NumberFormatException -> 0x0336 }
            java.lang.String r0 = "business_hours_note"
            X.36K r5 = r6.A0l(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r5 == 0) goto L_0x0327
            java.lang.String r0 = r5.A0n()     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x0327
            java.lang.String r7 = r5.A0n()     // Catch:{ NumberFormatException -> 0x0336 }
        L_0x024b:
            java.lang.String r0 = "business_hours_config"
            java.util.Iterator r14 = X.AnonymousClass36K.A0M(r6, r0)     // Catch:{ NumberFormatException -> 0x0336 }
        L_0x0251:
            boolean r0 = r14.hasNext()     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x032a
            X.36K r13 = X.C18310x6.A0Y(r14)     // Catch:{ NumberFormatException -> 0x0336 }
            java.lang.String r0 = "day_of_week"
            java.lang.String r6 = r13.A0r(r0, r8)     // Catch:{ NumberFormatException -> 0x0336 }
            X.C626936e.A06(r6)     // Catch:{ NumberFormatException -> 0x0336 }
            java.lang.String r0 = "mode"
            java.lang.String r5 = r13.A0r(r0, r8)     // Catch:{ NumberFormatException -> 0x0336 }
            X.C626936e.A06(r5)     // Catch:{ NumberFormatException -> 0x0336 }
            java.lang.String r0 = "open_time"
            java.lang.String r12 = r13.A0r(r0, r8)     // Catch:{ NumberFormatException -> 0x0336 }
            java.lang.String r0 = "close_time"
            java.lang.String r0 = r13.A0r(r0, r8)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r12 == 0) goto L_0x0280
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x0336 }
            goto L_0x0281
        L_0x0280:
            r13 = r8
        L_0x0281:
            if (r0 == 0) goto L_0x0284
            goto L_0x0286
        L_0x0284:
            r12 = r8
            goto L_0x028a
        L_0x0286:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0336 }
        L_0x028a:
            int r0 = r6.hashCode()     // Catch:{ NumberFormatException -> 0x0336 }
            switch(r0) {
                case 101661: goto L_0x02a1;
                case 108300: goto L_0x02ab;
                case 113638: goto L_0x02b5;
                case 114252: goto L_0x02bf;
                case 114817: goto L_0x02c9;
                case 115204: goto L_0x02d3;
                case 117590: goto L_0x02dd;
                default: goto L_0x0291;
            }     // Catch:{ NumberFormatException -> 0x0336 }
        L_0x0291:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x0336 }
            java.lang.String r0 = "Unrecognized week day: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r6, r1)     // Catch:{ NumberFormatException -> 0x0336 }
            X.24Y r1 = new X.24Y     // Catch:{ NumberFormatException -> 0x0336 }
            r1.<init>((java.lang.String) r0)     // Catch:{ NumberFormatException -> 0x0336 }
        L_0x02a0:
            throw r1     // Catch:{ NumberFormatException -> 0x0336 }
        L_0x02a1:
            java.lang.String r0 = "fri"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x0291
            r6 = 6
            goto L_0x02e6
        L_0x02ab:
            java.lang.String r0 = "mon"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x0291
            r6 = 2
            goto L_0x02e6
        L_0x02b5:
            java.lang.String r0 = "sat"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x0291
            r6 = 7
            goto L_0x02e6
        L_0x02bf:
            java.lang.String r0 = "sun"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x0291
            r6 = 1
            goto L_0x02e6
        L_0x02c9:
            java.lang.String r0 = "thu"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x0291
            r6 = 5
            goto L_0x02e6
        L_0x02d3:
            java.lang.String r0 = "tue"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x0291
            r6 = 3
            goto L_0x02e6
        L_0x02dd:
            java.lang.String r0 = "wed"
            boolean r0 = r6.equals(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x0291
            r6 = 4
        L_0x02e6:
            int r0 = r5.hashCode()     // Catch:{ NumberFormatException -> 0x0336 }
            switch(r0) {
                case -504372495: goto L_0x02fd;
                case 1800267202: goto L_0x0306;
                case 2060249164: goto L_0x030f;
                default: goto L_0x02ed;
            }     // Catch:{ NumberFormatException -> 0x0336 }
        L_0x02ed:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ NumberFormatException -> 0x0336 }
            java.lang.String r0 = "Unrecognized open mode: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ NumberFormatException -> 0x0336 }
            X.24Y r1 = new X.24Y     // Catch:{ NumberFormatException -> 0x0336 }
            r1.<init>((java.lang.String) r0)     // Catch:{ NumberFormatException -> 0x0336 }
            goto L_0x02a0
        L_0x02fd:
            java.lang.String r0 = "open_24h"
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x02ed
            goto L_0x0318
        L_0x0306:
            java.lang.String r0 = "specific_hours"
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x02ed
            goto L_0x031a
        L_0x030f:
            java.lang.String r0 = "appointment_only"
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 == 0) goto L_0x02ed
            goto L_0x031c
        L_0x0318:
            r5 = 1
            goto L_0x031d
        L_0x031a:
            r5 = 0
            goto L_0x031d
        L_0x031c:
            r5 = 2
        L_0x031d:
            X.7yB r0 = new X.7yB     // Catch:{ NumberFormatException -> 0x0336 }
            r0.<init>(r13, r12, r6, r5)     // Catch:{ NumberFormatException -> 0x0336 }
            r10.add(r0)     // Catch:{ NumberFormatException -> 0x0336 }
            goto L_0x0251
        L_0x0327:
            r7 = r8
            goto L_0x024b
        L_0x032a:
            int r0 = r10.size()     // Catch:{ NumberFormatException -> 0x0336 }
            if (r0 <= 0) goto L_0x033e
            X.5dQ r0 = new X.5dQ     // Catch:{ NumberFormatException -> 0x0336 }
            r0.<init>(r11, r7, r10)     // Catch:{ NumberFormatException -> 0x0336 }
            goto L_0x033f
        L_0x0336:
            java.lang.String r1 = "Business hours open/close time failed to parse."
            X.24Y r0 = new X.24Y
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x033e:
            r0 = r8
        L_0x033f:
            r1.A03 = r0
            java.lang.String r0 = "catalog_status"
            X.36K r5 = r2.A0l(r0)
            if (r5 == 0) goto L_0x0358
            java.lang.String r0 = "status"
            java.lang.String r5 = r5.A0r(r0, r8)
            java.lang.String r0 = "catalog_exists"
            boolean r5 = r0.equals(r5)
            r0 = 1
            if (r5 != 0) goto L_0x0359
        L_0x0358:
            r0 = 0
        L_0x0359:
            r1.A0V = r0
            java.lang.String r0 = "profile_options"
            X.36K r6 = r2.A0l(r0)
            if (r6 == 0) goto L_0x03df
            java.lang.String r0 = "commerce_experience"
            java.lang.String r5 = A02(r6, r0)
            r1.A0D = r5
            java.lang.String r0 = "shop"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x0541
            java.lang.String r0 = "shop_url"
            java.lang.String r0 = A02(r6, r0)
            r1.A0J = r0
        L_0x037b:
            java.lang.String r0 = "cart_enabled"
            java.lang.Boolean r0 = A01(r6, r0)
            if (r0 == 0) goto L_0x038a
            boolean r5 = r0.booleanValue()
            r0 = 1
            if (r5 != 0) goto L_0x038b
        L_0x038a:
            r0 = 0
        L_0x038b:
            r1.A0X = r0
            java.lang.String r0 = "commerce_manager_url"
            java.lang.String r0 = A02(r6, r0)
            r1.A0E = r0
            java.lang.String r0 = "is_banned"
            java.lang.Boolean r0 = A01(r6, r0)
            if (r0 == 0) goto L_0x03a4
            boolean r5 = r0.booleanValue()
            r0 = 1
            if (r5 != 0) goto L_0x03a5
        L_0x03a4:
            r0 = 0
        L_0x03a5:
            r1.A0c = r0
            java.lang.String r0 = "has_galaxy_flows"
            java.lang.Boolean r0 = A01(r6, r0)
            if (r0 == 0) goto L_0x03b6
            boolean r5 = r0.booleanValue()
            r0 = 1
            if (r5 != 0) goto L_0x03b7
        L_0x03b6:
            r0 = 0
        L_0x03b7:
            r1.A0Z = r0
            java.lang.String r0 = "calling_enabled"
            java.lang.Boolean r0 = A01(r6, r0)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r0 = r5.equals(r0)
            r1.A0W = r0
            java.lang.String r0 = "is_responsive"
            java.lang.Boolean r0 = A01(r6, r0)
            boolean r0 = r5.equals(r0)
            r1.A0b = r0
            java.lang.String r0 = "is_offerings_eligible"
            java.lang.Boolean r0 = A01(r6, r0)
            boolean r0 = r5.equals(r0)
            r1.A0a = r0
        L_0x03df:
            java.lang.String r0 = "custom_url"
            java.lang.String r0 = A02(r2, r0)
            r1.A0F = r0
            java.lang.String r0 = "linked_accounts"
            X.36K r7 = r2.A0l(r0)
            if (r7 != 0) goto L_0x04ba
            r0 = r8
        L_0x03f0:
            r1.A05 = r0
            java.lang.String r0 = "cover_photo"
            X.36K r5 = r2.A0l(r0)
            java.lang.String r6 = A02(r2, r0)
            if (r5 == 0) goto L_0x0404
            java.lang.String r0 = "id"
            java.lang.String r8 = r5.A0r(r0, r8)
        L_0x0404:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0416
            r0 = 2
            X.C162457s7.A0J(r8, r0)
            r5 = 0
            X.7yC r0 = new X.7yC
            r0.<init>(r8, r5, r5, r6)
            r1.A04 = r0
        L_0x0416:
            java.util.List r6 = java.util.Collections.emptyList()
            java.lang.String r0 = "service_areas"
            java.util.List r5 = r2.A0s(r0)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x054e
            java.lang.Object r5 = X.C18290x4.A0k(r5)
            X.36K r5 = (X.AnonymousClass36K) r5
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "service_area"
            java.util.Iterator r10 = X.AnonymousClass36K.A0M(r5, r0)
        L_0x0436:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x054e
            X.36K r7 = X.C18310x6.A0Y(r10)
            java.lang.String r5 = "area_description"
            X.36K r0 = r7.A0l(r5)
            r9 = 0
            if (r0 == 0) goto L_0x04b8
            X.36K r0 = r7.A0l(r5)
            java.lang.String r12 = r0.A0n()
        L_0x0451:
            java.lang.String r5 = "area_radius_meters"
            X.36K r0 = r7.A0l(r5)
            if (r0 == 0) goto L_0x04b6
            X.36K r0 = r7.A0l(r5)
            java.lang.String r8 = r0.A0n()
        L_0x0461:
            java.lang.String r0 = "area_center"
            X.36K r7 = r7.A0l(r0)
            if (r7 == 0) goto L_0x0436
            X.36K r0 = r7.A0l(r4)
            if (r0 == 0) goto L_0x04b4
            X.36K r0 = r7.A0l(r4)
            java.lang.String r5 = r0.A0n()
        L_0x0477:
            X.36K r0 = r7.A0l(r3)
            if (r0 == 0) goto L_0x0485
            X.36K r0 = r7.A0l(r3)
            java.lang.String r9 = r0.A0n()
        L_0x0485:
            if (r5 == 0) goto L_0x0436
            if (r9 == 0) goto L_0x0436
            if (r8 == 0) goto L_0x0436
            java.lang.Double r7 = java.lang.Double.valueOf(r5)
            java.lang.Double r5 = java.lang.Double.valueOf(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            if (r0 == 0) goto L_0x0436
            if (r7 == 0) goto L_0x0436
            if (r5 == 0) goto L_0x0436
            if (r12 == 0) goto L_0x0436
            int r17 = r0.intValue()
            double r13 = r7.doubleValue()
            double r15 = r5.doubleValue()
            X.5dW r11 = new X.5dW
            r11.<init>(r12, r13, r15, r17)
            r6.add(r11)
            goto L_0x0436
        L_0x04b4:
            r5 = r9
            goto L_0x0477
        L_0x04b6:
            r8 = r9
            goto L_0x0461
        L_0x04b8:
            r12 = r9
            goto L_0x0451
        L_0x04ba:
            java.lang.String r0 = "fb_page"
            X.36K r12 = r7.A0l(r0)
            r11 = 1
            java.lang.String r13 = "has_published_media_posts"
            java.lang.String r6 = "id"
            if (r12 == 0) goto L_0x04fd
            java.lang.String r10 = r12.A0r(r6, r8)
            java.lang.String r0 = "display_name"
            java.lang.String r5 = A02(r12, r0)
            java.lang.String r0 = "likes"
            X.36K r14 = r12.A0l(r0)
            if (r14 == 0) goto L_0x04e8
            java.lang.String r0 = r14.A0n()
            if (r0 == 0) goto L_0x04e8
            java.lang.String r0 = r14.A0n()     // Catch:{ NumberFormatException -> 0x04e8 }
            int r14 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x04e8 }
            goto L_0x04e9
        L_0x04e8:
            r14 = 0
        L_0x04e9:
            java.lang.Boolean r12 = A01(r12, r13)
            if (r10 == 0) goto L_0x04fd
            if (r5 == 0) goto L_0x04fd
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = X.AnonymousClass000.A1Y(r12, r0)
            X.5dX r12 = new X.5dX
            r12.<init>(r10, r5, r14, r0)
            goto L_0x04fe
        L_0x04fd:
            r12 = r8
        L_0x04fe:
            java.lang.String r0 = "ig_professional"
            X.36K r14 = r7.A0l(r0)
            if (r14 == 0) goto L_0x053a
            java.lang.String r10 = r14.A0r(r6, r8)
            java.lang.String r0 = "ig_handle"
            java.lang.String r7 = A02(r14, r0)
            java.lang.String r0 = "followers"
            X.36K r5 = r14.A0l(r0)
            if (r5 == 0) goto L_0x0527
            java.lang.String r0 = r5.A0n()
            if (r0 == 0) goto L_0x0527
            java.lang.String r0 = r5.A0n()     // Catch:{ NumberFormatException -> 0x0527 }
            int r6 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0527 }
            goto L_0x0528
        L_0x0527:
            r6 = 0
        L_0x0528:
            java.lang.Boolean r5 = A01(r14, r13)
            if (r10 == 0) goto L_0x053a
            if (r7 == 0) goto L_0x053a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r5 == r0) goto L_0x0535
            r11 = 0
        L_0x0535:
            X.5dX r9 = new X.5dX
            r9.<init>(r10, r7, r6, r11)
        L_0x053a:
            X.7xy r0 = new X.7xy
            r0.<init>(r12, r9)
            goto L_0x03f0
        L_0x0541:
            java.lang.String r0 = "catalog"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x037b
            r0 = 1
            r1.A0V = r0
            goto L_0x037b
        L_0x054e:
            r7 = 0
            X.C162457s7.A0J(r6, r7)
            java.util.List r0 = r1.A0T
            r0.clear()
            r0.addAll(r6)
            java.lang.String r0 = "direct_connection"
            X.36K r8 = r2.A0l(r0)
            if (r8 == 0) goto L_0x0611
            java.lang.String r3 = "enabled"
            java.lang.String r0 = "false"
            java.lang.String r0 = r8.A0r(r3, r0)
            if (r0 == 0) goto L_0x0572
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r1.A0Y = r0
        L_0x0572:
            java.lang.String r0 = "default_postcode"
            X.36K r6 = r8.A0l(r0)
            if (r6 == 0) goto L_0x059a
            java.lang.String r0 = "code"
            r3 = 0
            java.lang.String r5 = r6.A0r(r0, r3)
            java.lang.String r0 = "location_name"
            java.lang.String r4 = r6.A0r(r0, r3)
            java.lang.String r3 = "postcode_type"
            java.lang.String r0 = "pincode"
            java.lang.String r3 = r6.A0r(r3, r0)
            if (r5 == 0) goto L_0x059a
            if (r4 == 0) goto L_0x059a
            X.7y4 r0 = new X.7y4
            r0.<init>(r5, r4, r3)
            r1.A02 = r0
        L_0x059a:
            java.lang.String r3 = "allowed_country_codes"
            X.36K r0 = r8.A0l(r3)
            if (r0 == 0) goto L_0x05cd
            java.util.List r0 = r8.A0s(r3)
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            java.util.Iterator r3 = r0.iterator()
        L_0x05ae:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05c0
            X.36K r0 = X.C18310x6.A0Y(r3)
            java.lang.String r0 = r0.A0n()
            r4.add(r0)
            goto L_0x05ae
        L_0x05c0:
            java.util.ArrayList r3 = X.AnonymousClass002.A0J(r4)
            r0 = 0
            r1.A0R = r0
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r3)
            r1.A0R = r0
        L_0x05cd:
            java.lang.String r0 = "features"
            java.util.List r0 = r8.A0s(r0)
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r0.iterator()
        L_0x05db:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x05f7
            X.36K r4 = X.C18310x6.A0Y(r5)
            java.lang.String r3 = "name"
            r0 = 0
            java.lang.String r3 = r4.A0r(r3, r0)
            if (r3 == 0) goto L_0x05db
            X.7xt r0 = new X.7xt
            r0.<init>(r3)
            r6.add(r0)
            goto L_0x05db
        L_0x05f7:
            java.util.List r0 = r1.A0Q
            r0.clear()
            r0.addAll(r6)
            java.lang.String r3 = "blocked_status"
            r0 = 0
            java.lang.String r0 = r8.A0r(r3, r0)
            if (r0 == 0) goto L_0x0611
            java.lang.String r0 = X.C86664Kz.A1L(r0)
            X.C162457s7.A0J(r0, r7)
            r1.A0B = r0
        L_0x0611:
            java.lang.String r0 = "member_since_text"
            java.lang.String r0 = A02(r2, r0)
            r1.A0I = r0
            java.lang.String r0 = "price_tier"
            X.36K r6 = r2.A0l(r0)
            if (r6 == 0) goto L_0x06c4
            java.lang.String r0 = "id"
            r3 = 0
            java.lang.String r5 = r6.A0r(r0, r3)
            java.lang.String r4 = r6.A0n()
            java.lang.String r0 = "symbol"
            java.lang.String r3 = r6.A0r(r0, r3)
            X.7y6 r0 = new X.7y6
            r0.<init>(r5, r4, r3)
        L_0x0637:
            r1.A06 = r0
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "offerings"
            X.36K r3 = r2.A0l(r0)
            if (r3 != 0) goto L_0x0664
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x0649:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            r1.A0N = r6
            java.lang.String r3 = "survey_sampling_rate"
            X.36K r0 = r2.A0l(r3)
            if (r0 == 0) goto L_0x06da
            X.36K r2 = r2.A0l(r3)
            if (r2 == 0) goto L_0x06d0
            java.lang.String r0 = r2.A0n()
            if (r0 == 0) goto L_0x06d0
            goto L_0x06c7
        L_0x0664:
            java.lang.String r0 = "category"
            java.util.Iterator r8 = X.AnonymousClass36K.A0M(r3, r0)
        L_0x066a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0649
            X.36K r3 = X.C18310x6.A0Y(r8)
            java.lang.String r5 = "id"
            r4 = 0
            java.lang.String r11 = r3.A0r(r5, r4)
            java.lang.String r0 = "name"
            java.lang.String r10 = r3.A0r(r0, r4)
            boolean r0 = X.C107575bX.A0F(r11)
            if (r0 != 0) goto L_0x066a
            boolean r0 = X.C107575bX.A0F(r10)
            if (r0 != 0) goto L_0x066a
            java.lang.String r0 = "offering"
            java.util.Iterator r7 = X.AnonymousClass36K.A0M(r3, r0)
        L_0x0693:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x066a
            X.36K r3 = X.C18310x6.A0Y(r7)
            java.lang.String r12 = r3.A0r(r5, r4)
            java.lang.String r13 = r3.A0n()
            java.lang.String r0 = "is_offered"
            java.lang.String r0 = r3.A0r(r0, r4)
            if (r12 == 0) goto L_0x0693
            if (r13 == 0) goto L_0x0693
            if (r0 == 0) goto L_0x0693
            java.lang.String r3 = "true"
            java.lang.String r0 = r0.trim()
            boolean r14 = r3.equalsIgnoreCase(r0)
            X.5dd r9 = new X.5dd
            r9.<init>(r10, r11, r12, r13, r14)
            r6.add(r9)
            goto L_0x0693
        L_0x06c4:
            r0 = 0
            goto L_0x0637
        L_0x06c7:
            java.lang.String r0 = r2.A0n()     // Catch:{ NumberFormatException -> 0x06d0 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x06d0 }
            goto L_0x06d1
        L_0x06d0:
            r0 = 0
        L_0x06d1:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r3 != 0) goto L_0x06df
            r3 = 0
        L_0x06d8:
            r1.A09 = r3
        L_0x06da:
            X.5dt r0 = r1.A01()
            return r0
        L_0x06df:
            int r2 = r3.intValue()
            if (r2 < 0) goto L_0x06ea
            r0 = 100
            if (r2 > r0) goto L_0x06ea
            goto L_0x06d8
        L_0x06ea:
            java.lang.Integer r3 = X.C18290x4.A0Z()
            goto L_0x06d8
        L_0x06ef:
            java.lang.String r1 = "business latitude/longitude failed to parse"
            X.24Y r0 = new X.24Y
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YY.A00(com.whatsapp.jid.UserJid, X.36K):X.5dt");
    }

    public static Boolean A01(AnonymousClass36K r0, String str) {
        AnonymousClass36K A0l = r0.A0l(str);
        if (A0l == null || A0l.A0n() == null) {
            return null;
        }
        return Boolean.valueOf(A0l.A0n().trim().equalsIgnoreCase("true"));
    }

    public static String A02(AnonymousClass36K r0, String str) {
        AnonymousClass36K A0l = r0.A0l(str);
        if (A0l != null) {
            return A0l.A0n();
        }
        return null;
    }
}
