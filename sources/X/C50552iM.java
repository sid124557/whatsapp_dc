package X;

import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.2iM  reason: invalid class name and case insensitive filesystem */
public class C50552iM {
    public final C116985rC A00;
    public final C620433g A01;
    public final AnonymousClass3LV A02;
    public final AnonymousClass2TI A03;
    public final C59642xF A04;
    public final C40232Fa A05;
    public final AnonymousClass2KC A06;
    public final C44802Xn A07;
    public final C45842af A08;
    public final C40242Fb A09;
    public final AnonymousClass2NT A0A;
    public final AnonymousClass2KD A0B;
    public final AnonymousClass2KE A0C;
    public final AnonymousClass2ZU A0D;
    public final C40252Fc A0E;

    public void A00(AnonymousClass2UJ r9, C43922Tz r10, AnonymousClass3ZH r11, long j) {
        UserJid userJid = r9.A0D;
        C626936e.A06(userJid);
        if (userJid.equals(r11.A0H)) {
            Map singletonMap = Collections.singletonMap(r9.A0D, r9);
            A01(r10, (C25931bJ) null, Collections.singletonList(new C618832q(r11).A03()), singletonMap, (Map) null, j);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("jid doesn't match, jid1=");
        A0o.append(r9.A0D);
        AnonymousClass3ZH.A0C(r11, ", jid2=", A0o);
        throw C18310x6.A0d(A0o);
    }

    public C50552iM(C116985rC r1, C620433g r2, AnonymousClass3LV r3, AnonymousClass2TI r4, C59642xF r5, C40232Fa r6, AnonymousClass2KC r7, C44802Xn r8, C45842af r9, C40242Fb r10, AnonymousClass2NT r11, AnonymousClass2KD r12, AnonymousClass2KE r13, AnonymousClass2ZU r14, C40252Fc r15) {
        this.A06 = r7;
        this.A01 = r2;
        this.A0A = r11;
        this.A0E = r15;
        this.A04 = r5;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = r4;
        this.A09 = r10;
        this.A0C = r13;
        this.A0B = r12;
        this.A00 = r1;
        this.A0D = r14;
        this.A05 = r6;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02cb, code lost:
        if (r0.A04 == 2) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0451, code lost:
        if (r7 == 1) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0453, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x045c, code lost:
        if (r7 != r5.A00) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07cb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x07cc, code lost:
        X.AnonymousClass2A8.A00(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x07cf, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0857, code lost:
        if (r13.get(r9) == null) goto L_0x0859;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0a40, code lost:
        if (r0 == null) goto L_0x0a42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0132, code lost:
        if (r5 == null) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0456  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C43922Tz r38, X.C25931bJ r39, java.util.List r40, java.util.Map r41, java.util.Map r42, long r43) {
        /*
            r37 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactsyncresultupdater/updateCommonSyncResults userRequest size="
            r2 = r40
            X.AnonymousClass000.A1H(r0, r1, r2)
            X.AnonymousClass0x2.A18(r1)
            java.util.HashMap r22 = X.AnonymousClass001.A0t()
            java.util.HashSet r23 = X.AnonymousClass002.A0K()
            r14 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            java.util.Iterator r21 = r2.iterator()
        L_0x0023:
            boolean r0 = r21.hasNext()
            r3 = r37
            r6 = r38
            r4 = r41
            if (r0 == 0) goto L_0x07f0
            java.lang.Object r8 = r21.next()
            X.2UM r8 = (X.AnonymousClass2UM) r8
            X.3ZH r2 = r8.A06
            X.C626936e.A06(r2)
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A0I(r7)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 != 0) goto L_0x0059
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "syncresultupdater/skip/no-user-jid phoneNumber="
            r2.append(r0)
            java.lang.String r1 = r8.A0B
            r0 = 4
            java.lang.String r0 = X.C107575bX.A0B(r1, r0)
            X.C18260x0.A1M(r2, r0)
            goto L_0x0023
        L_0x0059:
            r0 = r22
            r0.put(r1, r8)
            java.lang.Object r0 = r4.get(r1)
            X.2UJ r0 = (X.AnonymousClass2UJ) r0
            if (r0 != 0) goto L_0x0076
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "syncresultupdater/skip/no-result jid="
            r1.append(r0)
            X.4uZ r0 = r2.A0H
            X.C18260x0.A0m(r0, r1)
            goto L_0x0023
        L_0x0076:
            int r5 = r0.A04
            r4 = 3
            if (r5 == r4) goto L_0x07dc
            X.2al r4 = r6.A02
            r13 = 1
            if (r4 == 0) goto L_0x00e6
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x00e6
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncresultupdater/updateCommonSyncResults update contact userJid="
            X.C18260x0.A1P(r5, r4, r2)
            X.2ZU r4 = r3.A0D
            r4.A00(r0, r2, r13)
            boolean r4 = r2.A0t
            if (r4 == 0) goto L_0x00e6
            X.2Fc r5 = r3.A0E
            com.whatsapp.jid.UserJid r12 = r0.A0D
            if (r12 == 0) goto L_0x00e6
            boolean r4 = r2.A0l
            if (r4 != 0) goto L_0x00e6
            X.3Ex r4 = r5.A00
            X.1vC r9 = r4.A05
            android.content.ContentValues r11 = X.AnonymousClass0x9.A07(r13)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            java.lang.String r4 = "is_contact_synced"
            r11.put(r4, r5)
            X.4Fq r10 = X.C18630y0.A07(r9)     // Catch:{ IllegalArgumentException -> 0x00d0 }
            java.lang.String r9 = "wa_contacts"
            java.lang.String r5 = "jid = ?"
            java.lang.String[] r4 = new java.lang.String[r13]     // Catch:{ all -> 0x00c6 }
            X.C18280x3.A0w(r12, r4, r14)     // Catch:{ all -> 0x00c6 }
            X.AnonymousClass361.A07(r11, r10, r9, r5, r4)     // Catch:{ all -> 0x00c6 }
            r10.close()     // Catch:{ IllegalArgumentException -> 0x00d0 }
            goto L_0x00e6
        L_0x00c6:
            r4 = move-exception
            r10.close()     // Catch:{ all -> 0x00cb }
            goto L_0x00cf
        L_0x00cb:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IllegalArgumentException -> 0x00d0 }
        L_0x00cf:
            throw r4     // Catch:{ IllegalArgumentException -> 0x00d0 }
        L_0x00d0:
            r9 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contact-mgr-db/unable to update native contact sync "
            r5.append(r4)
            r5.append(r12)
            java.lang.String r4 = ", "
            java.lang.String r4 = X.AnonymousClass000.A0b(r4, r5, r13)
            X.C626936e.A08(r4, r9)
        L_0x00e6:
            X.2al r4 = r6.A05
            if (r4 == 0) goto L_0x00ee
            boolean r4 = r4.A03
            if (r4 != 0) goto L_0x00f6
        L_0x00ee:
            com.whatsapp.jid.UserJid r4 = r0.A0D
            boolean r4 = X.C627336j.A0L(r4)
            if (r4 == 0) goto L_0x0112
        L_0x00f6:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncresultupdater/updateCommonSyncResults update lid userJid="
            X.C18260x0.A1P(r5, r4, r2)
            X.2KC r10 = r3.A06
            X.1fH r5 = r0.A0C
            com.whatsapp.jid.UserJid r9 = r0.A0D
            if (r5 == 0) goto L_0x0326
            boolean r4 = r9 instanceof com.whatsapp.jid.PhoneUserJid
            if (r4 == 0) goto L_0x0326
            X.2sM r4 = r10.A01
            com.whatsapp.jid.PhoneUserJid r9 = (com.whatsapp.jid.PhoneUserJid) r9
            r4.A09(r5, r9)
        L_0x0112:
            X.2al r4 = r6.A0B
            if (r4 == 0) goto L_0x0134
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x0134
            X.2KE r10 = r3.A0C
            java.lang.String r9 = r0.A0J
            if (r9 == 0) goto L_0x0134
            X.1fH r5 = r0.A0C
            if (r5 != 0) goto L_0x031f
            com.whatsapp.jid.UserJid r5 = r0.A0D
            boolean r4 = r5 instanceof com.whatsapp.jid.PhoneUserJid
            if (r4 == 0) goto L_0x0317
            X.2sM r4 = r10.A01
            com.whatsapp.jid.PhoneUserJid r5 = (com.whatsapp.jid.PhoneUserJid) r5
            X.1fH r5 = r4.A01(r5)
        L_0x0132:
            if (r5 != 0) goto L_0x031f
        L_0x0134:
            X.2al r4 = r6.A09
            if (r4 == 0) goto L_0x017d
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x017d
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncresultupdater/updateCommonSyncResults update status userJid="
            X.C18260x0.A1P(r5, r4, r2)
            X.2NT r11 = r3.A0A
            int r13 = r0.A03
            r12 = 0
            r9 = 1
            r4 = 0
            r10 = 2
            if (r10 == r13) goto L_0x02cd
            if (r9 != r13) goto L_0x02c7
            long r9 = r0.A08
            long r4 = r2.A0D
            int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r12 != 0) goto L_0x0164
            java.lang.String r5 = r0.A0H
            java.lang.String r4 = r2.A0X
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 != 0) goto L_0x017d
        L_0x0164:
            java.lang.String r4 = r0.A0H
            r2.A0X = r4
            long r4 = r0.A08
            r2.A0D = r4
            X.3Ex r11 = r11.A00
            com.whatsapp.jid.Jid r10 = r2.A0I(r7)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            long r4 = r0.A08
            java.lang.String r9 = r0.A0H
            r11.A0Y(r10, r9, r4)
        L_0x017b:
            int r17 = r17 + 1
        L_0x017d:
            X.2al r4 = r6.A0A
            if (r4 == 0) goto L_0x01c5
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x01c5
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncresultupdater/updateCommonSyncResults update text status userJid="
            X.C18260x0.A1P(r5, r4, r2)
            X.2KD r9 = r3.A0B
            X.1VX r10 = r9.A01
            r5 = 5839(0x16cf, float:8.182E-42)
            X.2vE r4 = X.C58422vE.A02
            boolean r4 = r10.A0Y(r4, r5)
            if (r4 == 0) goto L_0x01c5
            java.lang.String r4 = r0.A0H
            r2.A0X = r4
            java.lang.String r4 = r0.A0I
            r2.A0Y = r4
            long r4 = r0.A08
            r2.A0D = r4
            com.whatsapp.jid.Jid r12 = r2.A0I(r7)
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            if (r12 == 0) goto L_0x01c5
            X.3Ex r11 = r9.A00
            long r4 = r2.A0D
            java.lang.String r10 = r2.A0X
            java.lang.String r9 = r2.A0Y
            r24 = r11
            r25 = r12
            r26 = r10
            r27 = r9
            r28 = r4
            r24.A0Z(r25, r26, r27, r28)
        L_0x01c5:
            X.2al r4 = r6.A08
            if (r4 == 0) goto L_0x01f6
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x01f6
            com.whatsapp.jid.UserJid r4 = r8.A07
            if (r4 == 0) goto L_0x01f6
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncresultupdater/updateCommonSyncResults update sidelist userJid="
            X.C18260x0.A1P(r5, r4, r2)
            X.2Fb r5 = r3.A09
            boolean r4 = r2.A0z
            boolean r8 = r8.A0O
            if (r4 == r8) goto L_0x01f1
            r2.A0z = r8
            X.3Ex r8 = r5.A00
            com.whatsapp.jid.Jid r5 = r2.A0I(r7)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            boolean r4 = r2.A0z
            r8.A0a(r5, r4)
        L_0x01f1:
            X.2ZU r4 = r3.A0D
            r4.A00(r0, r2, r14)
        L_0x01f6:
            X.2al r4 = r6.A07
            if (r4 == 0) goto L_0x0267
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x0267
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncresultupdater/updateCommonSyncResults update picture userJid="
            X.C18260x0.A1P(r5, r4, r2)
            X.2af r8 = r3.A08
            int r5 = r0.A04
            r28 = 1
            r4 = 2
            if (r5 == r4) goto L_0x02ba
            int r11 = r0.A02
            r4 = -1
            if (r11 == r4) goto L_0x02ba
            java.lang.String r5 = r0.A0G
            java.lang.String r4 = "image"
            boolean r12 = r4.equals(r5)
            r9 = r43
            if (r12 == 0) goto L_0x0225
            int r4 = r2.A05
            if (r4 != r11) goto L_0x0232
        L_0x0225:
            java.lang.String r4 = "preview"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x029d
            int r4 = r2.A06
            if (r4 == r11) goto L_0x029d
        L_0x0232:
            java.lang.String r4 = r0.A0E
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0294
            com.whatsapp.jid.UserJid r15 = r0.A0D
            r28 = 0
            java.lang.String r12 = r0.A0E
            java.lang.String r11 = r0.A0F
            int r5 = r0.A02
            java.lang.String r13 = r0.A0G
            java.lang.String r4 = "preview"
            boolean r4 = r4.equals(r13)
            int r31 = X.C18280x3.A00(r4)
            X.2T0 r4 = new X.2T0
            r24 = r4
            r25 = r15
            r26 = r12
            r27 = r11
            r29 = r28
            r30 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            X.2xU r5 = r8.A01
            r5.A01(r4, r9)
        L_0x0267:
            X.2al r4 = r6.A01
            if (r4 == 0) goto L_0x0373
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x0373
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncresultupdater/updateCommonSyncResults update business userJid="
            X.C18260x0.A1P(r5, r4, r2)
            X.2TI r4 = r3.A03
            boolean r5 = r2.A0u
            if (r5 != 0) goto L_0x0373
            r12 = 1
            r2.A0u = r12
            X.3Ex r11 = r4.A04
            com.whatsapp.jid.Jid r10 = r2.A0I(r7)
            X.1vC r5 = r11.A05
            android.content.ContentValues r9 = X.AnonymousClass0x9.A07(r12)
            java.lang.String r4 = "is_business_synced"
            X.AnonymousClass0x2.A0o(r9, r4, r12)
            goto L_0x033b
        L_0x0294:
            r8.A00(r0)
            java.lang.String r4 = "ContactSyncPictureUpdater/update photo id doesn't match the existing one in db"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            goto L_0x0267
        L_0x029d:
            X.5Mf r11 = r8.A02
            if (r12 == 0) goto L_0x02a3
            r28 = 2
        L_0x02a3:
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r26 = X.C18310x6.A0f(r4, r9)
            r25 = 0
            r27 = 1
            r29 = 200(0xc8, float:2.8E-43)
            r24 = r11
            r24.A00(r25, r26, r27, r28, r29)
            r8.A00(r0)
            goto L_0x0267
        L_0x02ba:
            r8.A00(r0)
            com.whatsapp.jid.UserJid r4 = r0.A0D
            if (r4 == 0) goto L_0x0267
            X.2pi r5 = r8.A00
            r5.A02(r4)
            goto L_0x0267
        L_0x02c7:
            if (r13 != 0) goto L_0x02e8
            int r9 = r0.A04
            if (r9 != r10) goto L_0x017d
        L_0x02cd:
            long r9 = r2.A0D
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x02d7
            java.lang.String r9 = r2.A0X
            if (r9 == 0) goto L_0x017d
        L_0x02d7:
            r2.A0X = r12
            r2.A0D = r4
            X.3Ex r10 = r11.A00
            com.whatsapp.jid.Jid r9 = r2.A0I(r7)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            r10.A0Y(r9, r12, r4)
            goto L_0x017b
        L_0x02e8:
            r9 = 3
            if (r9 != r13) goto L_0x07d0
            X.1VX r12 = r11.A02
            r10 = 5839(0x16cf, float:8.182E-42)
            X.2vE r9 = X.C58422vE.A02
            boolean r9 = r12.A0Y(r9, r10)
            if (r9 != 0) goto L_0x017d
            X.2oU r9 = r11.A01
            android.content.res.Resources r10 = X.C54292oU.A00(r9)
            r9 = 2131888466(0x7f120952, float:1.9411568E38)
            java.lang.String r9 = r10.getString(r9)
            r2.A0X = r9
            r2.A0D = r4
            X.3Ex r11 = r11.A00
            com.whatsapp.jid.Jid r10 = r2.A0I(r7)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.lang.String r9 = r2.A0X
            r11.A0Y(r10, r9, r4)
            goto L_0x017d
        L_0x0317:
            boolean r4 = r5 instanceof X.C27981fH
            if (r4 == 0) goto L_0x0134
            X.1fU r5 = (X.AnonymousClass1fU) r5
            goto L_0x0132
        L_0x031f:
            X.2q8 r4 = r10.A00
            r4.A04(r5, r9)
            goto L_0x0134
        L_0x0326:
            boolean r4 = X.C627336j.A0L(r9)
            if (r4 == 0) goto L_0x0112
            boolean r5 = r2.A0z
            boolean r4 = r8.A0O
            if (r5 == r4) goto L_0x0112
            r2.A0z = r4
            X.3Ex r5 = r10.A00
            r5.A0a(r9, r4)
            goto L_0x0112
        L_0x033b:
            X.4Fq r8 = X.C18630y0.A07(r5)     // Catch:{ IllegalArgumentException -> 0x035a }
            java.lang.String r7 = "wa_contacts"
            java.lang.String r5 = "jid = ?"
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ all -> 0x0350 }
            X.C18280x3.A0w(r10, r4, r14)     // Catch:{ all -> 0x0350 }
            X.AnonymousClass361.A07(r9, r8, r7, r5, r4)     // Catch:{ all -> 0x0350 }
            r8.close()     // Catch:{ IllegalArgumentException -> 0x035a }
            goto L_0x0370
        L_0x0350:
            r4 = move-exception
            r8.close()     // Catch:{ all -> 0x0355 }
            goto L_0x0359
        L_0x0355:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IllegalArgumentException -> 0x035a }
        L_0x0359:
            throw r4     // Catch:{ IllegalArgumentException -> 0x035a }
        L_0x035a:
            r7 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contact-mgr-db/unable to update contact business sync "
            r5.append(r4)
            r5.append(r10)
            java.lang.String r4 = ", "
            java.lang.String r4 = X.AnonymousClass000.A0b(r4, r5, r12)
            X.C626936e.A08(r4, r7)
        L_0x0370:
            X.C48452ev.A00(r11, r10)
        L_0x0373:
            X.2al r4 = r6.A03
            if (r4 == 0) goto L_0x03ea
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncresultupdater/updateCommonSyncResults update device userJid="
            X.C18260x0.A1P(r5, r4, r1)
            X.2xF r12 = r3.A04
            X.318 r10 = r12.A05
            X.2yB r9 = r10.A07(r1)
            int r5 = r0.A00
            r4 = 1
            if (r5 != r4) goto L_0x03bd
            long r4 = r10.A02(r1)
            X.33Z r11 = r12.A03
            r15 = 1
            long r7 = r0.A06
            int r13 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r13 <= 0) goto L_0x045f
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()
            java.lang.String r13 = "contactsyncDevicesupdater/update/timestamp is less than existing one, current="
            r15.append(r13)
            r15.append(r4)
            java.lang.String r13 = "; new time="
            X.C18270x1.A1B(r13, r15, r7)
            r11.A0A(r1, r4)
            X.2pv r11 = r12.A04
            long r7 = r0.A06
            r24 = r11
            r25 = r4
            r27 = r7
            r29 = r14
            r24.A03(r25, r27, r29)
        L_0x03bd:
            r11 = 0
        L_0x03be:
            X.2yB r5 = r10.A07(r1)
            r8 = 0
            if (r9 != 0) goto L_0x044c
            if (r5 != 0) goto L_0x044c
        L_0x03c7:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)
            X.0PJ r5 = X.AnonymousClass0x9.A0G(r5, r4)
            java.lang.Object r4 = r5.A00
            boolean r4 = X.AnonymousClass001.A1Z(r4)
            if (r4 == 0) goto L_0x03dd
            int r20 = r20 + 1
        L_0x03dd:
            java.lang.Object r4 = r5.A01
            boolean r4 = X.AnonymousClass001.A1Z(r4)
            if (r4 == 0) goto L_0x03ea
            r4 = r23
            r4.add(r1)
        L_0x03ea:
            X.2al r4 = r6.A06
            if (r4 == 0) goto L_0x0603
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncresultupdater/updateCommonSyncResults update payment userJid="
            X.C18260x0.A1P(r5, r4, r1)
            X.2Xn r5 = r3.A07
            X.99n r4 = r5.A01
            boolean r4 = r4.A0E()
            if (r4 == 0) goto L_0x0603
            X.2Pz r4 = r0.A0B
            if (r4 == 0) goto L_0x0603
            X.8EA r11 = r5.A00
            boolean r5 = r4.A03
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r5)
            java.lang.String r10 = r4.A00
            java.util.HashMap r9 = X.AnonymousClass001.A0t()
            java.util.HashMap r4 = r4.A01
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x05b2
            java.util.Iterator r12 = X.AnonymousClass001.A0u(r4)
        L_0x041f:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x05b2
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r12)
            int r7 = X.C18280x3.A06(r4)
            java.lang.Object r4 = r4.getValue()
            X.2Ka r4 = (X.C41382Ka) r4
            r8 = 3
            r5 = 1
            if (r7 == r5) goto L_0x043c
            r5 = 3
            r8 = 1
            if (r7 == r5) goto L_0x043c
            r8 = 0
        L_0x043c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.String r5 = r4.A01
            java.lang.String r4 = r4.A00
            X.0PJ r4 = X.AnonymousClass0x9.A0G(r5, r4)
            r9.put(r7, r4)
            goto L_0x041f
        L_0x044c:
            r4 = 1
            if (r9 != 0) goto L_0x0456
            int r7 = r5.A00
        L_0x0451:
            if (r7 != r4) goto L_0x03c7
        L_0x0453:
            r8 = 1
            goto L_0x03c7
        L_0x0456:
            int r7 = r9.A00
            if (r5 == 0) goto L_0x0451
            int r4 = r5.A00
            if (r7 == r4) goto L_0x03c7
            goto L_0x0453
        L_0x045f:
            X.2sr r13 = r12.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A04(r13)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0483
            boolean r4 = r13.A0Y()
            if (r4 != 0) goto L_0x0483
            X.1iB r5 = r12.A02
            java.util.Map r4 = r0.A0L
            if (r4 != 0) goto L_0x047e
            r4 = 0
        L_0x0478:
            boolean r11 = r5.A0L(r4, r15, r14)
            goto L_0x03be
        L_0x047e:
            X.8OQ r4 = X.AnonymousClass8OQ.copyOf((java.util.Map) r4)
            goto L_0x0478
        L_0x0483:
            byte[] r4 = r0.A0N
            if (r4 != 0) goto L_0x050e
            java.lang.String r4 = "ContactSyncDevicesUpdater/update keyIndex is empty"
            com.whatsapp.util.Log.d((java.lang.String) r4)
            java.util.Map r4 = r0.A0L
            if (r4 == 0) goto L_0x04ad
            java.util.Iterator r5 = X.C18280x3.A0i(r4)
        L_0x0494:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x04ad
            com.whatsapp.jid.DeviceJid r4 = X.AnonymousClass0x7.A0R(r5)
            boolean r4 = X.AnonymousClass0x9.A1P(r4)
            if (r4 == 0) goto L_0x0494
            X.2pv r5 = r12.A04
            r4 = 6
            r11 = 0
            r5.A01(r4, r14)
            goto L_0x03be
        L_0x04ad:
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A04(r13)
            boolean r4 = r1.equals(r4)
            r4 = r4 ^ 1
            X.C626936e.A0C(r4)
            long r7 = r0.A06
            long r4 = r0.A05
            r24 = r12
            r25 = r1
            r26 = r7
            r28 = r4
            boolean r12 = r24.A01(r25, r26, r28)
            X.2yB r11 = r10.A07(r1)
            java.util.Map r4 = r0.A0L
            if (r4 != 0) goto L_0x0509
            X.8OQ r13 = X.AnonymousClass8OQ.of()
        L_0x04d6:
            java.util.Map r4 = r0.A0L
            if (r4 == 0) goto L_0x04fc
            X.8OQ r8 = X.AnonymousClass8OQ.copyOf((java.util.Map) r4)
        L_0x04de:
            if (r11 != 0) goto L_0x04e7
            r4 = 0
        L_0x04e1:
            boolean r11 = r10.A0I(r8, r4, r1, r12)
            goto L_0x03be
        L_0x04e7:
            int r7 = r11.A01
            long r4 = r0.A06
            X.6aS r24 = r13.keySet()
            r25 = r11
            r26 = r7
            r27 = r4
            r29 = r12
            X.2yB r4 = X.C59642xF.A00(r24, r25, r26, r27, r29)
            goto L_0x04e1
        L_0x04fc:
            com.whatsapp.jid.DeviceJid r5 = r1.getPrimaryDevice()
            java.lang.Long r4 = X.AnonymousClass0x2.A0T()
            X.8OQ r8 = X.AnonymousClass8OQ.of(r5, r4)
            goto L_0x04de
        L_0x0509:
            X.8OQ r13 = X.AnonymousClass8OQ.copyOf((java.util.Map) r4)
            goto L_0x04d6
        L_0x050e:
            X.0PJ r4 = r11.A03(r1, r4)
            if (r4 == 0) goto L_0x059d
            java.lang.Object r8 = r4.A00
            if (r8 == 0) goto L_0x059d
            X.1DS r8 = (X.AnonymousClass1DS) r8
            java.lang.Object r7 = r4.A01
            X.2e4 r7 = (X.C47932e4) r7
            if (r8 == 0) goto L_0x059d
            long r15 = r0.A06
            long r4 = r0.A05
            r24 = r12
            r25 = r1
            r26 = r15
            r28 = r4
            boolean r29 = r24.A01(r25, r26, r28)
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A05(r13)
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0598
            X.8OQ r4 = r10.A03()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>(r4)
        L_0x0543:
            X.2yB r25 = r10.A07(r1)
            java.util.Map r12 = r0.A0L
            if (r12 != 0) goto L_0x054c
            r12 = r13
        L_0x054c:
            X.4Fk r5 = r8.validIndexes_
            int r4 = r8.currentIndex_
            java.util.Map r4 = r11.A07(r5, r13, r12, r4)
            X.8OQ r5 = X.AnonymousClass8OQ.copyOf((java.util.Map) r4)
            int r4 = r8.rawId_
            long r12 = r8.timestamp_
            X.6aS r24 = r5.keySet()
            r26 = r4
            r27 = r12
            X.2yB r12 = X.C59642xF.A00(r24, r25, r26, r27, r29)
            long r15 = r0.A06
            X.2Nr r4 = new X.2Nr
            r4.<init>(r5, r12, r11)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r29)
            X.0PJ r5 = X.AnonymousClass0x9.A0G(r4, r5)
            X.33D r4 = new X.33D
            r4.<init>(r5)
            r24 = r11
            r25 = r1
            r26 = r8
            r27 = r4
            r28 = r15
            boolean r4 = r24.A0D(r25, r26, r27, r28)
            if (r4 != 0) goto L_0x05a4
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncDevicesupdater/update/verifyAndUpdateKeyIndexListData indexList fail, userJid="
        L_0x0592:
            X.C18260x0.A1S(r5, r4, r1)
            r11 = 0
            goto L_0x03be
        L_0x0598:
            java.util.Map r13 = r10.A09(r1)
            goto L_0x0543
        L_0x059d:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncDevicesupdater/update/verifyADVSignedKeyIndexList fail keyIndexListNull, userJid="
            goto L_0x0592
        L_0x05a4:
            if (r7 == 0) goto L_0x05af
            X.33n r5 = r11.A0A
            X.2ov r4 = X.AnonymousClass36G.A03(r1)
            r5.A0M(r7, r4)
        L_0x05af:
            r11 = 1
            goto L_0x03be
        L_0x05b2:
            X.2Pz r4 = r0.A0B
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            java.util.HashMap r4 = r4.A02
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x05f1
            java.util.Iterator r13 = X.AnonymousClass001.A0u(r4)
        L_0x05c4:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x05f1
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r13)
            int r5 = X.C18280x3.A06(r4)
            java.lang.Object r12 = r4.getValue()
            X.2Kb r12 = (X.C41392Kb) r12
            r7 = 3
            r4 = 1
            if (r5 == r4) goto L_0x05e1
            r4 = 3
            r7 = 1
            if (r5 == r4) goto L_0x05e1
            r7 = 0
        L_0x05e1:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r5 = r12.A01
            java.lang.String r4 = r12.A00
            X.0PJ r4 = X.AnonymousClass0x9.A0G(r5, r4)
            r8.put(r7, r4)
            goto L_0x05c4
        L_0x05f1:
            r24 = r11
            r25 = r1
            r27 = r10
            r28 = r9
            r29 = r8
            boolean r4 = r24.A0L(r25, r26, r27, r28, r29)
            if (r4 == 0) goto L_0x0603
            int r18 = r18 + 1
        L_0x0603:
            X.2al r4 = r6.A04
            if (r4 == 0) goto L_0x062e
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "contactsyncresultupdater/updateCommonSyncResults update disappearing mode userJid="
            X.C18260x0.A1P(r5, r4, r1)
            X.2Fa r9 = r3.A05
            com.whatsapp.jid.UserJid r8 = r0.A0D
            if (r8 == 0) goto L_0x062e
            int r1 = r2.A01
            int r7 = r0.A01
            if (r1 == r7) goto L_0x062e
            long r4 = r2.A09
            long r1 = r0.A07
            int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x062e
            r4 = -1
            if (r7 == r4) goto L_0x062e
            X.3Ex r4 = r9.A00
            r4.A0X(r8, r7, r1)
            int r19 = r19 + 1
        L_0x062e:
            X.2al r1 = r6.A00
            if (r1 == 0) goto L_0x0656
            X.5rC r2 = r3.A00
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x0656
            java.lang.String r1 = "contactsyncresultupdater/updateCommonSyncResults update bot data"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            java.lang.Object r2 = r2.A04()
            X.2Ex r2 = (X.C40202Ex) r2
            com.whatsapp.jid.UserJid r13 = r0.A0D
            if (r13 == 0) goto L_0x0656
            X.2o3 r3 = r0.A0A
            if (r3 == 0) goto L_0x0656
            boolean r1 = r3.A0B
            if (r1 == 0) goto L_0x0667
            java.lang.String r1 = "ContactSyncBotProfileUpdater/update tag matches"
            com.whatsapp.util.Log.d((java.lang.String) r1)
        L_0x0656:
            com.whatsapp.jid.UserJid r2 = r0.A0D
            if (r2 == 0) goto L_0x0023
            X.2uj r3 = X.C58112uj.A01
            java.util.Set r0 = X.C58112uj.A04
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L_0x0023
            monitor-enter(r3)
            goto L_0x07a3
        L_0x0667:
            X.8qC r1 = r2.A00
            java.lang.Object r12 = r1.get()
            X.2ff r12 = (X.C48902ff) r12
            int r1 = r3.A00
            r35 = r1
            java.lang.String r11 = r3.A07
            java.lang.String r24 = ""
            if (r11 != 0) goto L_0x067b
            r11 = r24
        L_0x067b:
            java.lang.Boolean r1 = r3.A01
            if (r1 == 0) goto L_0x06bc
            boolean r36 = r1.booleanValue()
        L_0x0683:
            java.lang.String r10 = r3.A02
            if (r10 != 0) goto L_0x0689
            r10 = r24
        L_0x0689:
            java.lang.String r9 = r3.A06
            if (r9 != 0) goto L_0x068f
            r9 = r24
        L_0x068f:
            java.lang.String r8 = r3.A04
            if (r8 != 0) goto L_0x0695
            r8 = r24
        L_0x0695:
            java.util.List r1 = r3.A0A
            java.util.ArrayList r7 = X.C73783g4.A0c(r1)
            java.util.Iterator r5 = r1.iterator()
        L_0x069f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x06bf
            java.lang.Object r1 = r5.next()
            X.2k4 r1 = (X.C51592k4) r1
            java.lang.String r4 = r1.A01
            java.lang.String r2 = r1.A00
            if (r2 != 0) goto L_0x06b3
            r2 = r24
        L_0x06b3:
            X.2jL r1 = new X.2jL
            r1.<init>(r4, r2)
            r7.add(r1)
            goto L_0x069f
        L_0x06bc:
            r36 = 0
            goto L_0x0683
        L_0x06bf:
            java.lang.String r15 = r3.A03
            java.lang.String r6 = r3.A08
            java.lang.String r5 = r3.A05
            java.util.List r1 = r3.A09
            java.util.ArrayList r4 = X.C73783g4.A0c(r1)
            java.util.Iterator r16 = r1.iterator()
        L_0x06cf:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x06ec
            java.lang.Object r1 = r16.next()
            X.2k3 r1 = (X.C51582k3) r1
            java.lang.String r3 = r1.A01
            java.lang.String r2 = r1.A00
            if (r2 != 0) goto L_0x06e3
            r2 = r24
        L_0x06e3:
            X.3ZL r1 = new X.3ZL
            r1.<init>(r3, r2)
            r4.add(r1)
            goto L_0x06cf
        L_0x06ec:
            X.2o1 r1 = new X.2o1
            r24 = r1
            r25 = r13
            r26 = r11
            r27 = r10
            r28 = r9
            r29 = r8
            r30 = r15
            r31 = r6
            r32 = r5
            r33 = r7
            r34 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.2us r2 = r12.A00
            X.1RI r2 = r2.A00
            X.4Fq r8 = r2.A0C()
            r2 = 10
            android.content.ContentValues r7 = X.AnonymousClass0x9.A07(r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = "jid"
            com.whatsapp.jid.UserJid r6 = r1.A01     // Catch:{ all -> 0x07c9 }
            X.AnonymousClass0x2.A0n(r7, r6, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "tag"
            int r2 = r1.A00     // Catch:{ all -> 0x07c9 }
            X.C18270x1.A0b(r7, r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "name"
            java.lang.String r2 = r1.A07     // Catch:{ all -> 0x07c9 }
            r7.put(r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "is_default"
            boolean r2 = r1.A0B     // Catch:{ all -> 0x07c9 }
            X.AnonymousClass0x2.A0o(r7, r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "attributes"
            java.lang.String r2 = r1.A02     // Catch:{ all -> 0x07c9 }
            r7.put(r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "description"
            java.lang.String r2 = r1.A06     // Catch:{ all -> 0x07c9 }
            r7.put(r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "category"
            java.lang.String r2 = r1.A04     // Catch:{ all -> 0x07c9 }
            r7.put(r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "prompts"
            java.util.List r2 = r1.A0A     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = X.C57042sy.A00(r2)     // Catch:{ all -> 0x07c9 }
            r7.put(r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "behavior_graph"
            java.lang.String r2 = r1.A03     // Catch:{ all -> 0x07c9 }
            r7.put(r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "persona_id"
            java.lang.String r2 = r1.A08     // Catch:{ all -> 0x07c9 }
            r7.put(r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "commands_description"
            java.lang.String r2 = r1.A05     // Catch:{ all -> 0x07c9 }
            r7.put(r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r3 = "commands"
            java.util.List r2 = r1.A09     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = X.C57032sx.A00(r2)     // Catch:{ all -> 0x07c9 }
            X.2sg r5 = X.AnonymousClass3H0.A03(r7, r8, r3, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r4 = "wa_bot_profiles"
            r3 = 5
            java.lang.String r2 = "INSERT_OR_UPDATE_BOT_PROFILE"
            r5.A0C(r4, r2, r7, r3)     // Catch:{ all -> 0x07c9 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = "BotProfileStore/insertOrUpdateProfileDataFromSync jid="
            X.C18260x0.A1P(r3, r2, r6)     // Catch:{ all -> 0x07c9 }
            r8.close()
            X.66R r2 = r12.A01
            java.lang.Object r2 = r2.getValue()
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            r2.put(r6, r1)
            X.66R r1 = r12.A02
            java.lang.Object r1 = r1.getValue()
            X.0Qw r1 = (X.C04840Qw) r1
            r1.A05(r6)
            goto L_0x0656
        L_0x07a3:
            X.4uZ r0 = X.C58112uj.A00     // Catch:{ all -> 0x07c6 }
            boolean r0 = X.C162457s7.A0P(r0, r2)     // Catch:{ all -> 0x07c6 }
            if (r0 != 0) goto L_0x07c3
            java.util.List r0 = X.C58112uj.A02     // Catch:{ all -> 0x07c6 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x07c6 }
        L_0x07b1:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x07c6 }
            if (r0 == 0) goto L_0x07c1
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x07c6 }
            X.4GQ r0 = (X.AnonymousClass4GQ) r0     // Catch:{ all -> 0x07c6 }
            r0.invoke(r2)     // Catch:{ all -> 0x07c6 }
            goto L_0x07b1
        L_0x07c1:
            X.C58112uj.A00 = r2     // Catch:{ all -> 0x07c6 }
        L_0x07c3:
            monitor-exit(r3)
            goto L_0x0023
        L_0x07c6:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x07c9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x07cb }
        L_0x07cb:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r8, r0)
            throw r1
        L_0x07d0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unrecognized status type="
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0G(r0, r1, r13)
            throw r1
        L_0x07dc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "syncUser with type="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " cannot be updated"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0F(r0, r1)
            throw r1
        L_0x07f0:
            X.2al r0 = r6.A01
            if (r0 == 0) goto L_0x0c6e
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0c6e
            java.lang.String r0 = "contactsyncresultupdater/updateCommonSyncResults/update business data"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.33g r0 = r3.A01
            java.util.Map r0 = r0.A04()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>(r0)
            X.2TI r12 = r3.A03
            java.util.HashMap r11 = X.AnonymousClass001.A0t()
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.util.HashMap r24 = X.AnonymousClass001.A0t()
            java.util.HashSet r10 = X.AnonymousClass002.A0K()
            java.util.Iterator r14 = X.AnonymousClass001.A0u(r22)
        L_0x081e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x08ff
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r14)
            com.whatsapp.jid.UserJid r9 = X.C18320x8.A0P(r0)
            java.lang.Object r8 = r4.get(r9)
            X.2UJ r8 = (X.AnonymousClass2UJ) r8
            r7 = 0
            if (r8 == 0) goto L_0x08bc
            X.2Nf r6 = r8.A09
            if (r6 == 0) goto L_0x08bc
            com.whatsapp.jid.UserJid r5 = r6.A01     // Catch:{ 24Y -> 0x0b99 }
            if (r5 == 0) goto L_0x084c
            X.36K r1 = r6.A02     // Catch:{ 24Y -> 0x0b99 }
            if (r1 == 0) goto L_0x084c
            java.lang.String r0 = "profile"
            X.36K r0 = r1.A0l(r0)     // Catch:{ 24Y -> 0x0b99 }
            X.5dt r7 = X.AnonymousClass5YY.A00(r5, r0)     // Catch:{ 24Y -> 0x0b99 }
        L_0x084c:
            boolean r0 = r13.containsKey(r9)
            if (r0 == 0) goto L_0x0859
            java.lang.Object r0 = r13.get(r9)
            r1 = 1
            if (r0 != 0) goto L_0x085a
        L_0x0859:
            r1 = 0
        L_0x085a:
            boolean r0 = X.AnonymousClass000.A1W(r7)
            if (r1 == 0) goto L_0x088d
            if (r0 == 0) goto L_0x0870
            java.lang.Object r1 = r13.get(r9)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = r7.A0L
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0876
        L_0x0870:
            r10.add(r9)
            r11.put(r9, r7)
        L_0x0876:
            X.2Ne r0 = r6.A00
            if (r0 == 0) goto L_0x0890
            r2.put(r9, r0)
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x081e
            X.2rx r0 = r12.A05
            X.2qS r1 = r0.A01(r9)
            r0 = r24
            r0.put(r9, r1)
            goto L_0x081e
        L_0x088d:
            if (r0 != 0) goto L_0x0870
            goto L_0x0876
        L_0x0890:
            r0 = r42
            if (r42 == 0) goto L_0x089a
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto L_0x081e
        L_0x089a:
            X.2rx r1 = r12.A05
            X.2qS r0 = r1.A01(r9)
            if (r0 == 0) goto L_0x08a5
            r10.add(r9)
        L_0x08a5:
            r1.A02(r9)
            X.1Wq r5 = new X.1Wq
            r5.<init>()
            java.lang.Integer r0 = X.C18310x6.A0e()
            r5.A00 = r0
            X.4FV r1 = r12.A07
            r0 = 10
            r1.BhE(r5, r0)
            goto L_0x081e
        L_0x08bc:
            java.lang.Object r0 = r0.getValue()
            X.2UM r0 = (X.AnonymousClass2UM) r0
            r7 = 0
            if (r0 == 0) goto L_0x081e
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x081e
            X.2rx r5 = r12.A05
            X.2qS r6 = r5.A01(r9)
            X.33g r1 = r12.A02
            X.5dt r0 = r1.A02(r9)
            if (r0 == 0) goto L_0x08d8
            r7 = 1
        L_0x08d8:
            r1.A0B(r9)
            r5.A02(r9)
            if (r6 == 0) goto L_0x08fc
            if (r7 == 0) goto L_0x081e
            X.2eH r1 = r12.A06
            java.lang.Class<X.3Lv> r0 = X.C66543Lv.class
            X.485 r1 = r1.A02(r0)
            X.3Lv r1 = (X.C66543Lv) r1
            X.35K r0 = X.AnonymousClass35K.A01(r6)
            X.2i3 r0 = r0.A02()
            r1.A0P(r9, r0)
        L_0x08f7:
            r10.add(r9)
            goto L_0x081e
        L_0x08fc:
            if (r7 == 0) goto L_0x081e
            goto L_0x08f7
        L_0x08ff:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x09ef
            X.33g r9 = r12.A02
            java.util.HashSet r8 = X.AnonymousClass002.A0K()
            java.util.HashSet r7 = X.AnonymousClass002.A0K()
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            java.util.Iterator r14 = X.AnonymousClass001.A0u(r11)
        L_0x0917:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0978
            java.util.Map$Entry r5 = X.AnonymousClass001.A0w(r14)
            java.lang.Object r4 = r5.getValue()
            X.5dt r4 = (X.C108985dt) r4
            if (r4 == 0) goto L_0x0976
            int r13 = r4.A00
        L_0x092b:
            com.whatsapp.jid.UserJid r0 = X.C18320x8.A0P(r5)
            X.5dt r1 = r9.A02(r0)
            r0 = 1
            if (r13 == r0) goto L_0x096c
            r0 = 2
            if (r13 == r0) goto L_0x0962
            if (r4 == 0) goto L_0x0948
            int r0 = r4.A00
            if (r0 != 0) goto L_0x0948
            if (r1 == 0) goto L_0x0948
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0948
            X.AnonymousClass0x7.A1J(r6, r5)
        L_0x0948:
            boolean r0 = X.C620433g.A00(r4, r1)
            if (r0 == 0) goto L_0x0917
            com.whatsapp.jid.UserJid r4 = X.C18320x8.A0P(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "business-profile-manager/resetBotWelcomeMessageSentState jid="
            X.C18260x0.A1P(r1, r0, r4)
            X.2rv r1 = r9.A0J
            r0 = 0
            r1.A02(r4, r0)
            goto L_0x0917
        L_0x0962:
            boolean r0 = r9.A0H(r4, r1)
            if (r0 == 0) goto L_0x0948
            X.AnonymousClass0x7.A1J(r8, r5)
            goto L_0x0948
        L_0x096c:
            boolean r0 = r9.A0G(r4, r1)
            if (r0 == 0) goto L_0x0948
            X.AnonymousClass0x7.A1J(r7, r5)
            goto L_0x0948
        L_0x0976:
            r13 = 0
            goto L_0x092b
        L_0x0978:
            X.56I r0 = r9.A0A
            r0.A04(r11)
            X.2mu r0 = r9.A0I
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0999
            java.util.Iterator r4 = r7.iterator()
        L_0x0989:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0999
            X.4uZ r1 = X.C18300x5.A0P(r4)
            X.3Lv r0 = r9.A0D
            r0.A0M(r1)
            goto L_0x0989
        L_0x0999:
            r9.A0E(r8)
            r9.A0D(r6)
            java.util.Iterator r8 = X.AnonymousClass001.A0u(r11)
        L_0x09a3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x09ef
            java.util.Map$Entry r7 = X.AnonymousClass001.A0w(r8)
            X.2ra r6 = r9.A07
            X.1VX r4 = r6.A0C
            r1 = 4208(0x1070, float:5.897E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r1)
            com.whatsapp.jid.UserJid r5 = X.C18320x8.A0P(r7)
            java.lang.Object r4 = r7.getValue()
            X.5dt r4 = (X.C108985dt) r4
            if (r0 == 0) goto L_0x09eb
            X.2en r0 = r9.A05
            int r0 = r0.A00()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 <= 0) goto L_0x09a3
            if (r4 == 0) goto L_0x09a3
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x09a3
            java.lang.String r1 = r5.getRawString()
            X.33p r0 = r6.A0A
            r0.A1L(r1)
            r0.A1M(r1)
            X.3Do r1 = new X.3Do
            r1.<init>(r9)
            r0 = 0
            r6.A02(r1, r4, r5, r0)
            goto L_0x09a3
        L_0x09eb:
            r9.A09(r4, r5)
            goto L_0x09a3
        L_0x09ef:
            X.6aP r9 = X.C129526aS.builder()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0b3a
            X.2rx r8 = r12.A05
            X.C626936e.A00()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            java.util.Iterator r21 = X.AnonymousClass001.A0u(r2)
        L_0x0a12:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x0ae8
            java.util.Map$Entry r16 = X.AnonymousClass001.A0w(r21)
            com.whatsapp.jid.UserJid r0 = X.C18320x8.A0P(r16)
            com.whatsapp.jid.DeviceJid r2 = X.C618932r.A00(r0)
            X.C626936e.A06(r2)
            X.33n r13 = r8.A07
            boolean r0 = r13.A0X()
            if (r0 == 0) goto L_0x0abf
            X.3d8 r0 = new X.3d8
            r0.<init>(r13, r2)
            X.33n r1 = r0.A00
            com.whatsapp.jid.DeviceJid r0 = r0.A01
            X.2ov r0 = X.AnonymousClass36G.A02(r0)
            X.2e4 r0 = r1.A08(r0)
        L_0x0a40:
            if (r0 != 0) goto L_0x0a45
        L_0x0a42:
            r6.add(r2)
        L_0x0a45:
            java.lang.Object r0 = r16.getValue()
            if (r0 == 0) goto L_0x0aa1
            java.lang.Object r0 = r16.getValue()
            X.2Ne r0 = (X.C42202Ne) r0
            byte[] r0 = r0.A02
            if (r0 == 0) goto L_0x0aa1
            com.whatsapp.jid.UserJid r15 = r2.userJid
            java.lang.Object r0 = r16.getValue()
            X.2Ne r0 = (X.C42202Ne) r0
            byte[] r14 = r0.A02
            java.lang.Object r0 = r16.getValue()
            X.2Ne r0 = (X.C42202Ne) r0
            int r13 = r0.A00
            java.lang.Object r0 = r16.getValue()
            X.2Ne r0 = (X.C42202Ne) r0
            X.3ZC r1 = r0.A01
            X.3ZC r0 = new X.3ZC
            r0.<init>(r1)
            boolean r0 = r8.A06(r15, r0, r14, r13)
            if (r0 == 0) goto L_0x0a7f
            com.whatsapp.jid.UserJid r0 = r2.userJid
            r4.add(r0)
        L_0x0a7f:
            com.whatsapp.jid.UserJid r0 = r2.userJid
            X.2qS r0 = r8.A01(r0)
            if (r0 == 0) goto L_0x0a91
            int r0 = r0.A02
            if (r0 == 0) goto L_0x0a96
            boolean r0 = r6.contains(r2)
            if (r0 != 0) goto L_0x0a96
        L_0x0a91:
            r6.add(r2)
            goto L_0x0a12
        L_0x0a96:
            boolean r0 = r7.contains(r2)
            if (r0 != 0) goto L_0x0a12
            r7.add(r2)
            goto L_0x0a12
        L_0x0aa1:
            com.whatsapp.jid.UserJid r14 = r2.userJid
            java.lang.Object r0 = r16.getValue()
            X.2Ne r0 = (X.C42202Ne) r0
            int r13 = r0.A00
            java.lang.Object r0 = r16.getValue()
            X.2Ne r0 = (X.C42202Ne) r0
            X.3ZC r1 = r0.A01
            r0 = 0
            boolean r0 = r8.A04(r14, r1, r13, r0)
            if (r0 == 0) goto L_0x0a12
            r5.add(r2)
            goto L_0x0a12
        L_0x0abf:
            X.2fm r1 = r8.A08     // Catch:{ InterruptedException | ExecutionException -> 0x0acc }
            X.3d8 r0 = new X.3d8     // Catch:{ InterruptedException | ExecutionException -> 0x0acc }
            r0.<init>(r13, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0acc }
            java.lang.Object r0 = X.C48972fm.A01(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0acc }
            goto L_0x0a40
        L_0x0acc:
            r1 = move-exception
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifiedNameManager/storeVerifiedNameCerts, vname: failed to get identity entry for jid = "
            r13.append(r0)
            java.lang.Object r0 = r16.getKey()
            r13.append(r0)
            java.lang.String r0 = " error = "
            java.lang.String r0 = X.AnonymousClass000.A0P(r1, r0, r13)
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0a42
        L_0x0ae8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifiedNameManager/storeVerifiedNameCerts, vname: jidsWithLevelOrPrivacyUpdate = "
            X.C18260x0.A1R(r1, r0, r5)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0b04
            X.2eH r1 = r12.A06
            java.lang.Class<X.3Ln> r0 = X.C66463Ln.class
            X.485 r0 = r1.A02(r0)
            X.3Ln r0 = (X.C66463Ln) r0
            r0.A01(r6)
        L_0x0b04:
            X.C626936e.A06(r7)
            int r1 = r7.size()
            X.C626936e.A06(r5)
            int r0 = r5.size()
            int r1 = r1 + r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
        L_0x0b1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b2c
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass0x7.A0R(r1)
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r10.add(r0)
            goto L_0x0b1c
        L_0x0b2c:
            java.util.Iterator r1 = r4.iterator()
        L_0x0b30:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b42
            X.C18310x6.A1R(r10, r1)
            goto L_0x0b30
        L_0x0b3a:
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.Set r5 = java.util.Collections.emptySet()
        L_0x0b42:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0b68
            X.3Wi r2 = r12.A01
            r1 = 41
            X.3aJ r0 = new X.3aJ
            r0.<init>(r12, r7, r11, r1)
            r2.A0S(r0)
            java.util.Iterator r1 = r7.iterator()
        L_0x0b58:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b68
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass0x7.A0R(r1)
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r9.add((java.lang.Object) r0)
            goto L_0x0b58
        L_0x0b68:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0b82
            java.util.Iterator r1 = r5.iterator()
        L_0x0b72:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b82
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass0x7.A0R(r1)
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r9.add((java.lang.Object) r0)
            goto L_0x0b72
        L_0x0b82:
            X.3Ex r0 = r12.A04
            r0.A0K()
            int r2 = r10.size()
            X.8OQ r1 = X.AnonymousClass8OQ.copyOf((java.util.Map) r24)
            X.6aS r0 = r9.build()
            X.2lF r8 = new X.2lF
            r8.<init>(r1, r0, r2)
            goto L_0x0bc1
        L_0x0b99:
            r2 = move-exception
            X.C626936e.A0A(r2)
            X.2qk r4 = r12.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "source=ContactSyncBusinessUpdater message="
            java.lang.String r2 = X.AnonymousClass000.A0a(r0, r1, r2)
            java.lang.String r1 = "CorruptStreamException"
            r0 = 0
            r4.A0A(r1, r0, r2)
            int r2 = r10.size()
            X.8OQ r1 = X.AnonymousClass8OQ.of()
            X.6aS r0 = X.C129526aS.of()
            X.2lF r8 = new X.2lF
            r8.<init>(r1, r0, r2)
        L_0x0bc1:
            int r14 = r8.A00
            X.3LV r7 = r3.A02
            X.6aS r6 = X.C129526aS.copyOf((java.util.Collection) r23)
            r0 = 1
            X.C162457s7.A0J(r6, r0)
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/updateBusinessSecurityMessageFromContactSync"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.6aS r1 = r8.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0c6e
            java.util.Iterator r9 = r1.iterator()
        L_0x0bde:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0c6e
            com.whatsapp.jid.UserJid r5 = X.C18310x6.A0T(r9)
            boolean r0 = r6.contains(r5)
            if (r0 != 0) goto L_0x0c63
            X.8qC r0 = r7.A06
            java.lang.Object r0 = r0.get()
            X.2fk r0 = (X.C48952fk) r0
            boolean r0 = r0.A01(r5)
            if (r0 != 0) goto L_0x0c63
            X.C162457s7.A0H(r5)
            X.8OQ r2 = r8.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/createTransitionSystemMessageForJidIfNeeded for: "
            X.C18260x0.A1P(r1, r0, r5)
            java.lang.Object r4 = r2.get(r5)
            X.2qS r4 = (X.C55502qS) r4
            X.2rx r0 = r7.A03
            X.2qS r0 = r0.A01(r5)
            r3 = 0
            if (r0 == 0) goto L_0x0c60
            X.3ZC r23 = r0.A01()
        L_0x0c1d:
            int r29 = X.C623134n.A00(r0)
            if (r0 == 0) goto L_0x0c5d
            int r2 = r0.A03
            java.lang.String r1 = r0.A08
        L_0x0c27:
            if (r4 == 0) goto L_0x0c57
            int r0 = r4.A03
            java.lang.String r3 = r4.A08
            X.3ZC r22 = r4.A01()
            int r28 = X.C623134n.A00(r4)
        L_0x0c35:
            X.35K r21 = new X.35K
            r24 = r3
            r25 = r1
            r26 = r0
            r27 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            X.2i3 r2 = r21.A02()
            X.2eH r1 = r7.A05
            java.lang.Class<X.3Lv> r0 = X.C66543Lv.class
            X.485 r0 = X.C48062eH.A01(r1, r0)
            X.3Lv r0 = (X.C66543Lv) r0
            X.C162457s7.A0H(r2)
            r0.A0P(r5, r2)
            goto L_0x0bde
        L_0x0c57:
            r22 = r3
            r28 = r29
            r0 = 0
            goto L_0x0c35
        L_0x0c5d:
            r1 = r3
            r2 = 0
            goto L_0x0c27
        L_0x0c60:
            r23 = r3
            goto L_0x0c1d
        L_0x0c63:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/skip hosted: "
            X.C18260x0.A1P(r1, r0, r5)
            goto L_0x0bde
        L_0x0c6e:
            r1 = r39
            if (r39 == 0) goto L_0x0c90
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r17)
            r1.A0H = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r20)
            r1.A07 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r14)
            r1.A05 = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r18)
            r1.A0C = r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r19)
            r1.A08 = r0
        L_0x0c90:
            java.lang.String r0 = "contactsyncresultupdater/updateCommonSyncResults/end"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50552iM.A01(X.2Tz, X.1bJ, java.util.List, java.util.Map, java.util.Map, long):void");
    }
}
