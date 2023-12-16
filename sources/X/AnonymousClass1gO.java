package X;

/* renamed from: X.1gO  reason: invalid class name */
public class AnonymousClass1gO extends C67743Qm {
    public final C116985rC A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C54042o5 A03;
    public final C55912r7 A04;
    public final C29411im A05;
    public final C56962sq A06;
    public final C613730l A07;
    public final C55052pi A08;
    public final C56612sH A09;
    public final AnonymousClass33p A0A;
    public final C29041iB A0B;
    public final AnonymousClass33Z A0C;
    public final C56112rR A0D;
    public final C54982pb A0E;
    public final AnonymousClass1VX A0F;
    public final AnonymousClass3S7 A0G;
    public final C50532iK A0H;
    public final C69183Wa A0I;
    public final AnonymousClass2IN A0J;
    public final C56402rv A0K;

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r23, int r24) {
        /*
            r22 = this;
            r4 = r23
            X.36K r1 = r4.A0j()
            java.lang.String r3 = r1.A00
            java.lang.String r0 = "status"
            boolean r0 = r0.equals(r3)
            r2 = r22
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "action"
            r4 = 0
            java.lang.String r3 = r1.A0r(r0, r4)
            java.lang.String r0 = "modify"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0037
            X.2iK r3 = r2.A0H
            X.2TQ r0 = new X.2TQ
            r0.<init>()
            r2 = 1
            r0.A06 = r2
        L_0x002d:
            X.2TR r1 = new X.2TR
            r1.<init>(r0)
            r0 = 0
            r3.A00(r1, r0, r2, r0)
        L_0x0036:
            return
        L_0x0037:
            java.lang.String r0 = "dhash"
            java.lang.String r3 = r1.A0r(r0, r4)
            java.lang.String r1 = r1.A0n()
            X.3Wi r5 = r2.A01
            r0 = 1
            X.3aI r4 = new X.3aI
            r4.<init>(r2, r3, r1, r0)
            goto L_0x0127
        L_0x004b:
            java.lang.String r0 = "picture"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = "action"
            java.lang.String r3 = X.AnonymousClass36K.A0L(r1, r0)
            java.lang.String r0 = "modify"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006e
            X.2iK r3 = r2.A0H
            X.2TQ r0 = new X.2TQ
            r0.<init>()
            r2 = 1
            r0.A04 = r2
            goto L_0x002d
        L_0x006e:
            java.lang.String r0 = "delete"
            X.36K r0 = r1.A0l(r0)
            if (r0 == 0) goto L_0x0036
            X.2pi r1 = r2.A08
            X.2sr r0 = r2.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            r1.A02(r0)
            return
        L_0x0082:
            java.lang.String r0 = "devices"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = "offline"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r4, r0)
            if (r0 != 0) goto L_0x00a7
            X.1im r0 = r2.A05
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0133
            X.1VX r4 = r2.A0F
            r3 = 4097(0x1001, float:5.741E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r3)
            if (r0 == 0) goto L_0x0133
        L_0x00a7:
            r7 = 1
        L_0x00a8:
            java.lang.String r0 = "action"
            r4 = 0
            java.lang.String r3 = r1.A0r(r0, r4)
            java.lang.String r0 = "modify"
            boolean r6 = r0.equals(r3)
            java.lang.String r0 = "reason"
            java.lang.String r3 = r1.A0r(r0, r4)
            java.lang.String r0 = "critical_sync_timeout"
            boolean r4 = r0.equals(r3)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSyncNotificationHandler/handleDeviceChangeNotification noPayload="
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = "; isOffline="
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = "; bootstrapFailed="
            X.C18260x0.A1D(r0, r3, r4)
            if (r4 == 0) goto L_0x00f0
            X.30l r3 = r2.A07
            X.2sH r0 = r2.A09
            long r4 = r0.A0H()
            android.content.SharedPreferences$Editor r3 = X.C613730l.A00(r3)
            java.lang.String r0 = "syncd_bootstrap_fail_time"
            X.C18270x1.A0i(r3, r0, r4)
        L_0x00f0:
            if (r6 != 0) goto L_0x0136
            if (r7 != 0) goto L_0x0136
            java.lang.String r0 = "device"
            java.util.List r0 = r1.A0s(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "key-index-list"
            X.36K r3 = r1.A0l(r0)
            if (r3 != 0) goto L_0x012b
            r5 = 0
        L_0x010a:
            X.33p r0 = r2.A0A
            android.content.SharedPreferences r3 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "adv_timestamp_sec"
            long r3 = X.AnonymousClass0x2.A0A(r3, r0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0036
            X.8OQ r1 = X.C57522tm.A01(r1)
            X.3Wi r5 = r2.A01
            r0 = 19
            X.5rU r4 = new X.5rU
            r4.<init>(r2, r0, r1)
        L_0x0127:
            r5.A0S(r4)
            return
        L_0x012b:
            java.lang.String r0 = "ts"
            long r5 = X.AnonymousClass36K.A04(r3, r0)
            goto L_0x010a
        L_0x0133:
            r7 = 0
            goto L_0x00a8
        L_0x0136:
            X.2iK r3 = r2.A0H
            X.2TQ r0 = new X.2TQ
            r0.<init>()
            r2 = 1
            r0.A02 = r2
            goto L_0x002d
        L_0x0142:
            java.lang.String r0 = "privacy"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0196
            java.lang.String r0 = "action"
            java.lang.String r3 = X.AnonymousClass36K.A0L(r1, r0)
            java.lang.String r0 = "modify"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0166
            X.2iK r3 = r2.A0H
            X.2TQ r0 = new X.2TQ
            r0.<init>()
            r2 = 1
            r0.A05 = r2
            goto L_0x002d
        L_0x0166:
            java.lang.String r3 = "category"
            java.util.List r0 = r1.A0s(r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0036
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.Iterator r4 = X.AnonymousClass36K.A0M(r1, r3)
        L_0x017a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0433
            X.36K r3 = X.C18310x6.A0Y(r4)
            java.lang.String r0 = "name"
            java.lang.String r1 = r3.A0q(r0)
            java.lang.String r0 = "value"
            java.lang.String r0 = r3.A0q(r0)
            r5.put(r1, r0)
            goto L_0x017a
        L_0x0196:
            java.lang.String r0 = "blocklist"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0281
            X.33p r0 = r2.A0A
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r7 = "block_list_v2_dhash"
            java.lang.String r6 = X.C18280x3.A0Z(r0, r7)
            java.lang.String r0 = "prev_dhash"
            r12 = 0
            java.lang.String r4 = r1.A0r(r0, r12)
            java.lang.String r5 = "action"
            java.lang.String r3 = r1.A0r(r5, r12)
            java.lang.String r0 = "modify"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0275
            boolean r0 = android.text.TextUtils.equals(r6, r4)
            if (r0 == 0) goto L_0x0275
            java.lang.String r3 = "item"
            java.util.List r0 = r1.A0s(r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0036
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            java.util.Iterator r10 = X.AnonymousClass36K.A0M(r1, r3)
        L_0x01df:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0212
            X.36K r9 = X.C18310x6.A0Y(r10)
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r4 = r9.A0h(r3, r0)
            java.lang.String r3 = r9.A0q(r5)
            java.lang.String r0 = "block"
            boolean r0 = r0.equals(r3)
            X.AnonymousClass000.A1C(r4, r8, r0)
            java.lang.String r0 = "display_name"
            java.lang.String r3 = r9.A0r(r0, r12)
            boolean r0 = X.C107575bX.A0F(r3)
            if (r0 != 0) goto L_0x01df
            boolean r0 = r4 instanceof X.C27981fH
            if (r0 == 0) goto L_0x01df
            r6.put(r4, r3)
            goto L_0x01df
        L_0x0212:
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            java.util.Iterator r9 = X.AnonymousClass001.A0u(r8)
        L_0x021e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0238
            java.util.Map$Entry r8 = X.AnonymousClass001.A0w(r9)
            java.lang.Object r0 = r8.getValue()
            boolean r3 = X.AnonymousClass001.A1Z(r0)
            java.lang.Object r0 = r8.getKey()
            X.C18300x5.A1M(r0, r5, r4, r3)
            goto L_0x021e
        L_0x0238:
            X.2sq r3 = r2.A06
            java.lang.String r0 = "dhash"
            java.lang.String r2 = r1.A0r(r0, r12)
            java.util.Set r0 = r3.A07(r5)
            r5.addAll(r0)
            java.util.Set r0 = r3.A07(r4)
            r4.addAll(r0)
            java.util.Set r9 = r3.A0d
            r5.removeAll(r9)
            r4.retainAll(r9)
            boolean r0 = X.AnonymousClass0x7.A1S(r5)
            if (r0 != 0) goto L_0x0262
            boolean r0 = X.AnonymousClass0x7.A1S(r4)
            if (r0 == 0) goto L_0x0036
        L_0x0262:
            r8 = 1
            java.util.Iterator r1 = r5.iterator()
        L_0x0267:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0439
            com.whatsapp.jid.UserJid r0 = X.C18310x6.A0T(r1)
            r3.A0J(r0, r8)
            goto L_0x0267
        L_0x0275:
            X.2iK r3 = r2.A0H
            X.2TQ r0 = new X.2TQ
            r0.<init>()
            r2 = 1
            r0.A01 = r2
            goto L_0x002d
        L_0x0281:
            java.lang.String r0 = "tos"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0344
            X.1VX r3 = r2.A0F
            r1 = 877(0x36d, float:1.229E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0036
            X.2yq r6 = X.AnonymousClass29B.A00(r4)
            X.3Wa r0 = r2.A0I
            r0.A01(r6)
            X.5rC r1 = r2.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0301
            java.lang.Object r0 = r1.A04()
            X.2sS r0 = (X.C56722sS) r0
            X.2pP r5 = r0.A03
            java.util.List r0 = r6.A01
            java.util.Iterator r8 = r0.iterator()
        L_0x02b5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0301
            java.lang.Object r1 = r8.next()
            X.2kl r1 = (X.C52022kl) r1
            java.lang.String r7 = r1.A01
            java.lang.String r0 = "20230901"
            boolean r0 = X.C162457s7.A0P(r7, r0)
            r4 = 0
            if (r0 == 0) goto L_0x02f6
            X.66R r0 = r5.A04
        L_0x02ce:
            java.lang.Object r4 = r0.getValue()
            X.2oT r4 = (X.C54282oT) r4
        L_0x02d4:
            int r1 = r1.A00
            r0 = 1
            if (r1 == r0) goto L_0x02f3
            X.21Y r3 = X.AnonymousClass21Y.A03
        L_0x02db:
            if (r4 == 0) goto L_0x02b5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "bonsaitosmanager/accountsynctosresponse/set id="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " value="
            X.C18260x0.A1P(r1, r0, r3)
            r0 = 1
            r4.A01(r3, r0)
            goto L_0x02b5
        L_0x02f3:
            X.21Y r3 = X.AnonymousClass21Y.A02
            goto L_0x02db
        L_0x02f6:
            java.lang.String r0 = "20230902"
            boolean r0 = X.C162457s7.A0P(r7, r0)
            if (r0 == 0) goto L_0x02d4
            X.66R r0 = r5.A05
            goto L_0x02ce
        L_0x0301:
            X.2rv r0 = r2.A0K
            X.2Sa r5 = r0.A00
            java.util.List r0 = r6.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x030b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r2 = r4.next()
            X.2kl r2 = (X.C52022kl) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "20231027"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x030b
            int r3 = r2.A00
            r2 = 1
            X.66R r0 = r5.A05
            java.lang.Object r1 = r0.getValue()
            X.2oT r1 = (X.C54282oT) r1
            if (r3 != r2) goto L_0x0335
            java.lang.String r0 = "yes"
            r1.A01(r0, r2)
            goto L_0x030b
        L_0x0335:
            monitor-enter(r1)
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x04c3 }
            monitor-exit(r1)
            X.2Z3 r0 = r5.A04
            android.content.SharedPreferences r0 = r0.A00()
            X.C18270x1.A0m(r0)
            goto L_0x030b
        L_0x0344:
            java.lang.String r0 = "disappearing_mode"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0375
            java.lang.String r0 = "duration"
            int r6 = X.AnonymousClass36K.A01(r1, r0)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r0 = "t"
            long r0 = X.AnonymousClass36K.A05(r1, r0)
            long r3 = r3.toMillis(r0)
            X.2rR r5 = r2.A0D
            X.2YA r0 = r5.A05
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "disappearing_mode_timestamp"
            long r1 = X.AnonymousClass0x2.A0B(r1, r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            r5.A06(r6, r3)
            return
        L_0x0375:
            java.lang.String r0 = "notice"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0393
            r1.toString()
            X.1VX r4 = r2.A0F
            r3 = 4779(0x12ab, float:6.697E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r3)
            if (r0 == 0) goto L_0x0036
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            goto L_0x04c6
        L_0x0393:
            java.lang.String r0 = "user"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x03cb
            java.lang.String r0 = "state"
            java.lang.String r1 = X.AnonymousClass36K.A0L(r1, r0)
            java.lang.String r0 = "AI available"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            X.5rC r1 = r2.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r1 = r1.A04()
            X.2sS r1 = (X.C56722sS) r1
            X.21j r2 = X.C372121j.AI_AVAILABLE
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.2qG r1 = r1.A04
            X.21j r0 = r1.A00()
            if (r2 == r0) goto L_0x0036
            r1.A02()
            return
        L_0x03cb:
            java.lang.String r0 = "text_status"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0036
            X.1VX r0 = r2.A0F
            boolean r0 = X.C56952sp.A0F(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "action"
            r5 = 0
            java.lang.String r3 = r1.A0r(r0, r5)
            java.lang.String r0 = "modify"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x03f8
            X.2iK r3 = r2.A0H
            X.2TQ r0 = new X.2TQ
            r0.<init>()
            r2 = 1
            r0.A07 = r2
            goto L_0x002d
        L_0x03f8:
            java.lang.String r0 = "text"
            java.lang.String r8 = r1.A0r(r0, r5)
            java.lang.String r0 = "ephemeral_duration_sec"
            java.lang.String r4 = r1.A0r(r0, r5)
            java.lang.String r0 = "last_update_time"
            java.lang.String r3 = r1.A0r(r0, r5)
            java.lang.String r0 = "emoji"
            X.36K r1 = r1.A0l(r0)
            if (r1 == 0) goto L_0x0431
            java.lang.String r0 = "content"
            java.lang.String r11 = r1.A0r(r0, r5)
        L_0x0419:
            if (r4 == 0) goto L_0x0036
            if (r3 == 0) goto L_0x0036
            X.2pb r5 = r2.A0E
            long r6 = java.lang.Long.parseLong(r4)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r3)
            long r9 = r2.toMillis(r0)
            r5.A01(r6, r8, r9, r11)
            return
        L_0x0431:
            r11 = 0
            goto L_0x0419
        L_0x0433:
            X.2r7 r0 = r2.A04
            r0.A04(r5)
            return
        L_0x0439:
            X.1VX r10 = r3.A0U
            r1 = 4408(0x1138, float:6.177E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r0, r1)
            if (r0 == 0) goto L_0x047f
            java.util.Iterator r10 = r5.iterator()
        L_0x0449:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x047f
            com.whatsapp.jid.UserJid r14 = X.C18310x6.A0T(r10)
            X.3Ex r0 = r3.A0D
            X.3ZH r13 = r0.A07(r14)
            boolean r0 = r3.A0O(r13, r8)
            if (r0 == 0) goto L_0x0449
            java.util.List r20 = r3.A03(r14)
            X.2Tn r11 = new X.2Tn
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r15 = r12
            r21 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            X.4FS r1 = r3.A0c
            r0 = 18
            X.C18290x4.A1M(r1, r11, r3, r0)
            goto L_0x0449
        L_0x047f:
            r8 = 0
            java.util.Iterator r1 = r4.iterator()
        L_0x0484:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0492
            com.whatsapp.jid.UserJid r0 = X.C18310x6.A0T(r1)
            r3.A0J(r0, r8)
            goto L_0x0484
        L_0x0492:
            monitor-enter(r3)
            r9.addAll(r5)     // Catch:{ all -> 0x04c0 }
            r9.removeAll(r4)     // Catch:{ all -> 0x04c0 }
            X.1v9 r1 = r3.A0C     // Catch:{ all -> 0x04c0 }
            java.util.Set r0 = r3.A05()     // Catch:{ all -> 0x04c0 }
            r1.A00(r0)     // Catch:{ all -> 0x04c0 }
            X.33p r0 = r3.A0K     // Catch:{ all -> 0x04c0 }
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r0)     // Catch:{ all -> 0x04c0 }
            X.C18270x1.A0j(r0, r7, r2)     // Catch:{ all -> 0x04c0 }
            X.2q8 r0 = r3.A0S     // Catch:{ all -> 0x04c0 }
            r0.A02(r6)     // Catch:{ all -> 0x04c0 }
            java.util.HashSet r2 = X.AnonymousClass0x9.A15(r5)     // Catch:{ all -> 0x04c0 }
            r2.addAll(r4)     // Catch:{ all -> 0x04c0 }
            X.3Wi r1 = r3.A05     // Catch:{ all -> 0x04c0 }
            r0 = 16
            X.C69263Wi.A09(r1, r3, r2, r0)     // Catch:{ all -> 0x04c0 }
            monitor-exit(r3)
            return
        L_0x04c0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x04c3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x04c6:
            java.lang.String r0 = "id"
            int r5 = X.AnonymousClass36K.A02(r1, r0)     // Catch:{ 24Y -> 0x04f4 }
            java.lang.String r0 = "stage"
            int r6 = X.AnonymousClass36K.A02(r1, r0)     // Catch:{ 24Y -> 0x04f4 }
            long r8 = X.AnonymousClass36K.A03(r1)     // Catch:{ 24Y -> 0x04f4 }
            java.lang.String r0 = "version"
            int r7 = X.AnonymousClass36K.A02(r1, r0)     // Catch:{ 24Y -> 0x04f4 }
            java.lang.String r0 = "type"
            int r10 = X.AnonymousClass36K.A02(r1, r0)     // Catch:{ 24Y -> 0x04f4 }
            X.34e r4 = new X.34e     // Catch:{ 24Y -> 0x04f4 }
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ 24Y -> 0x04f4 }
            r3.add(r4)     // Catch:{ 24Y -> 0x04f4 }
            X.3S7 r1 = r2.A0G     // Catch:{ 24Y -> 0x04f4 }
            r0 = 1
            r1.BEx(r3, r0, r0)     // Catch:{ 24Y -> 0x04f4 }
            return
        L_0x04f4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSyncNotificationHandler/handlePrivacyDisclosureNotification bad notice metadata "
            X.C18260x0.A16(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gO.A05(X.36K, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1gO(X.C116985rC r9, X.C55682qk r10, X.C69263Wi r11, X.C56972sr r12, X.C54042o5 r13, X.C55912r7 r14, X.C29411im r15, X.C56962sq r16, X.C613730l r17, X.C55052pi r18, X.C56612sH r19, X.AnonymousClass33p r20, X.C29041iB r21, X.AnonymousClass33Z r22, X.C56112rR r23, X.C54982pb r24, X.AnonymousClass1VX r25, X.AnonymousClass31C r26, X.C55892r5 r27, X.AnonymousClass3S7 r28, X.C50532iK r29, X.C69183Wa r30, X.AnonymousClass2IN r31, X.AnonymousClass4FS r32, X.C56402rv r33) {
        /*
            r8 = this;
            int[] r6 = X.C18330xA.A0E()
            r7 = 0
            r0 = 203(0xcb, float:2.84E-43)
            r6[r7] = r0
            r1 = r8
            r4 = r27
            r3 = r26
            r5 = r32
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = r19
            r8.A09 = r0
            r0 = r25
            r8.A0F = r0
            r8.A01 = r11
            r8.A03 = r13
            r8.A02 = r12
            r0 = r33
            r8.A0K = r0
            r0 = r24
            r8.A0E = r0
            r0 = r16
            r8.A06 = r0
            r8.A05 = r15
            r0 = r29
            r8.A0H = r0
            r8.A00 = r9
            r0 = r18
            r8.A08 = r0
            r0 = r30
            r8.A0I = r0
            r0 = r20
            r8.A0A = r0
            r0 = r22
            r8.A0C = r0
            r8.A04 = r14
            r0 = r21
            r8.A0B = r0
            r0 = r17
            r8.A07 = r0
            r0 = r28
            r8.A0G = r0
            r0 = r23
            r8.A0D = r0
            r0 = r31
            r8.A0J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gO.<init>(X.5rC, X.2qk, X.3Wi, X.2sr, X.2o5, X.2r7, X.1im, X.2sq, X.30l, X.2pi, X.2sH, X.33p, X.1iB, X.33Z, X.2rR, X.2pb, X.1VX, X.31C, X.2r5, X.3S7, X.2iK, X.3Wa, X.2IN, X.4FS, X.2rv):void");
    }
}
