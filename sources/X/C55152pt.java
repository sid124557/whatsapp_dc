package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2pt  reason: invalid class name and case insensitive filesystem */
public class C55152pt {
    public final C55682qk A00;
    public final C64393Dh A01;
    public final AnonymousClass2F3 A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final C52852m9 A05;
    public final C56922sm A06;
    public final C66543Lv A07;
    public final C50012hU A08;
    public final C623334p A09;
    public final AnonymousClass319 A0A;
    public final AnonymousClass2Y6 A0B;
    public final C29431io A0C;
    public final C55272q5 A0D;
    public final C72303dV A0E;
    public final C56082rO A0F;
    public final AnonymousClass2W5 A0G;
    public final C620233e A0H;
    public final AnonymousClass1VX A0I;
    public final C60152y5 A0J;
    public final AnonymousClass2MB A0K;
    public final AnonymousClass2MD A0L;
    public final C55832qz A0M;
    public final AtomicBoolean A0N = C18280x3.A0l();

    public C624134x A00(UserJid userJid) {
        C624134x r0;
        C624134x r02;
        C623534r A052 = this.A0H.A05(userJid);
        if (A052 == null) {
            C18260x0.A1S(AnonymousClass001.A0o(), "statusmsgstore/getlaststatusmessage/no status for ", userJid);
            return null;
        }
        synchronized (A052) {
            r0 = A052.A08;
        }
        if (r0 == null) {
            C66543Lv r03 = this.A07;
            C624134x A022 = r03.A2D.A02(A052.A04());
            synchronized (A052) {
                A052.A08 = A022;
            }
        }
        synchronized (A052) {
            r02 = A052.A08;
        }
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0642, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        r26.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x064b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01cf, code lost:
        if (X.C626635z.A09(r9) == false) goto L_0x01d1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x00d3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a2 A[Catch:{ all -> 0x0642 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e8 A[Catch:{ all -> 0x0642 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01fc A[Catch:{ all -> 0x0642 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x020d A[Catch:{ all -> 0x0642 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0223 A[Catch:{ all -> 0x0642 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0240 A[Catch:{ all -> 0x0642 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0271 A[Catch:{ all -> 0x0642 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0276 A[Catch:{ all -> 0x0642 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x029f A[Catch:{ all -> 0x0642 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(boolean r43) {
        /*
            r42 = this;
            java.lang.String r30 = " statuses"
            java.lang.String r29 = " with "
            java.lang.String r28 = "statusmsgstore/deleteoldstatuses no status info for "
            X.C626936e.A00()
            java.util.HashSet r16 = X.AnonymousClass002.A0K()
            r8 = r42
            X.2sH r15 = r8.A03
            long r0 = X.C56612sH.A01(r15)
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "limitTimestamp: "
            r9.append(r2)
            r9.append(r0)
            java.lang.String r2 = ", currentServerTimeMillis: "
            r9.append(r2)
            long r2 = r15.A0H()
            r9.append(r2)
            java.lang.String r2 = ", currentWaServerTime: "
            r9.append(r2)
            long r2 = r15.A0D()
            r9.append(r2)
            java.lang.String r2 = ", currentNtpServerTime: "
            r9.append(r2)
            long r4 = r15.A02
            r2 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0081
            long r4 = r15.A02
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 + r6
        L_0x004e:
            r9.append(r4)
            java.lang.String r4 = ", currentTimeMillis: "
            X.C18290x4.A1Q(r9, r4)
            java.lang.String r4 = ", currentAdjustedTimeMillis: "
            r9.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r15.A03
            long r4 = r4 - r6
            X.C18260x0.A1I(r9, r4)
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "statusmsgstore/deleteoldstatuses "
            r27 = r43
            r4 = r27
            java.lang.String r4 = X.AnonymousClass000.A0b(r5, r6, r4)
            X.33M r19 = X.AnonymousClass33M.A01(r4)
            X.3dV r4 = r8.A0E
            r41 = r4
            X.4Fq r25 = r41.A04()
            goto L_0x0084
        L_0x0081:
            r4 = 0
            goto L_0x004e
        L_0x0084:
            X.3Yo r26 = r25.Axl()     // Catch:{ all -> 0x064c }
            r4 = r25
            X.3H0 r4 = (X.AnonymousClass3H0) r4     // Catch:{ all -> 0x0642 }
            X.2sg r4 = r4.A03     // Catch:{ all -> 0x0642 }
            r40 = r4
            java.lang.String r7 = X.AnonymousClass2C9.A01     // Catch:{ all -> 0x0642 }
            java.lang.String[] r6 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0642 }
            X.2sm r4 = r8.A06     // Catch:{ all -> 0x0642 }
            r39 = r4
            X.6kE r37 = X.C135166kE.A00     // Catch:{ all -> 0x0642 }
            r5 = r4
            r4 = r37
            X.C56922sm.A01(r5, r4, r6)     // Catch:{ all -> 0x0642 }
            java.lang.String r5 = "GET_STATUS_MESSAGES_SQL"
            r4 = r40
            android.database.Cursor r36 = r4.A0E(r7, r5, r6)     // Catch:{ all -> 0x0642 }
            X.2rO r4 = r8.A0F     // Catch:{ all -> 0x0642 }
            r38 = r4
            java.lang.String r5 = "status_psa_viewed_time"
            r6 = 0
            long r17 = r4.A00(r5, r2)     // Catch:{ all -> 0x0642 }
            java.lang.String r5 = "status_psa_exipration_time"
            long r10 = r4.A00(r5, r2)     // Catch:{ all -> 0x0642 }
            java.util.HashMap r12 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0642 }
            java.util.ArrayList r35 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0642 }
            java.util.ArrayList r34 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0642 }
            java.util.LinkedList r33 = X.AnonymousClass0x9.A18()     // Catch:{ all -> 0x0642 }
            r32 = 0
            r20 = 0
            r14 = 0
        L_0x00d3:
            boolean r2 = r36.moveToNext()     // Catch:{ all -> 0x0642 }
            java.lang.String r31 = " deleted:"
            if (r2 == 0) goto L_0x02ef
            int r14 = r14 + 1
            X.2qz r4 = r8.A0M     // Catch:{ all -> 0x0642 }
            r3 = r36
            r2 = r37
            X.34x r9 = r4.A04(r3, r2)     // Catch:{ all -> 0x0642 }
            if (r9 != 0) goto L_0x00f0
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses/no message"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x0642 }
            goto L_0x00d3
        L_0x00f0:
            X.4uZ r2 = r9.A0n()     // Catch:{ all -> 0x0642 }
            boolean r2 = r2 instanceof X.C135216kJ     // Catch:{ all -> 0x0642 }
            java.lang.String r4 = " "
            if (r2 == 0) goto L_0x018d
            X.2W5 r2 = r8.A0G     // Catch:{ all -> 0x0642 }
            X.33F r13 = r2.A00(r9)     // Catch:{ all -> 0x0642 }
            boolean r2 = r13.A00()     // Catch:{ all -> 0x0642 }
            java.lang.String r5 = "statusmsgstore/deleteoldstatuses/psamessage "
            if (r2 != 0) goto L_0x012a
            long r2 = r15.A0H()     // Catch:{ all -> 0x0642 }
            boolean r2 = r13.A01(r2)     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x022e
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            X.C624134x.A0S(r9, r5, r13)     // Catch:{ all -> 0x0642 }
            X.C624134x.A0T(r9, r4, r13)     // Catch:{ all -> 0x0642 }
            X.C624134x.A0O(r9, r4, r13)     // Catch:{ all -> 0x0642 }
            r13.append(r4)     // Catch:{ all -> 0x0642 }
            long r2 = r9.A0K     // Catch:{ all -> 0x0642 }
            X.C18260x0.A1H(r13, r2)     // Catch:{ all -> 0x0642 }
            goto L_0x01d1
        L_0x012a:
            long r21 = r15.A0H()     // Catch:{ all -> 0x0642 }
            int r2 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0154
            r21 = 0
            int r2 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r2 <= 0) goto L_0x0154
            long r2 = r9.A0K     // Catch:{ all -> 0x0642 }
            int r13 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x0154
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            X.C624134x.A0S(r9, r5, r13)     // Catch:{ all -> 0x0642 }
            X.C624134x.A0T(r9, r4, r13)     // Catch:{ all -> 0x0642 }
            X.C624134x.A0O(r9, r4, r13)     // Catch:{ all -> 0x0642 }
            r13.append(r4)     // Catch:{ all -> 0x0642 }
            long r2 = r9.A0K     // Catch:{ all -> 0x0642 }
            X.C18260x0.A1H(r13, r2)     // Catch:{ all -> 0x0642 }
            goto L_0x01d1
        L_0x0154:
            long r2 = r9.A0K     // Catch:{ all -> 0x0642 }
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x022e
            X.33e r3 = r8.A0H     // Catch:{ all -> 0x0642 }
            com.whatsapp.jid.UserJid r2 = r9.A0o()     // Catch:{ all -> 0x0642 }
            X.34r r2 = r3.A05(r2)     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x022e
            int r2 = r2.A03()     // Catch:{ all -> 0x0642 }
            if (r2 != 0) goto L_0x022e
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            X.C624134x.A0S(r9, r5, r13)     // Catch:{ all -> 0x0642 }
            X.C624134x.A0T(r9, r4, r13)     // Catch:{ all -> 0x0642 }
            X.C624134x.A0O(r9, r4, r13)     // Catch:{ all -> 0x0642 }
            r13.append(r4)     // Catch:{ all -> 0x0642 }
            long r2 = r9.A0K     // Catch:{ all -> 0x0642 }
            r13.append(r2)     // Catch:{ all -> 0x0642 }
            r13.append(r4)     // Catch:{ all -> 0x0642 }
            r13.append(r10)     // Catch:{ all -> 0x0642 }
            r2 = r17
            X.C18270x1.A1B(r4, r13, r2)     // Catch:{ all -> 0x0642 }
            goto L_0x01d1
        L_0x018d:
            X.2z0 r2 = r9.A1J     // Catch:{ all -> 0x0642 }
            boolean r2 = r2.A02     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x019c
            long r2 = r9.A0J     // Catch:{ all -> 0x0642 }
            r21 = 0
            int r5 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r5 <= 0) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            long r2 = r9.A0K     // Catch:{ all -> 0x0642 }
        L_0x019e:
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0223
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses/message "
            X.C624134x.A0S(r9, r2, r5)     // Catch:{ all -> 0x0642 }
            X.C624134x.A0R(r9, r4, r5)     // Catch:{ all -> 0x0642 }
            X.C624134x.A0T(r9, r4, r5)     // Catch:{ all -> 0x0642 }
            X.C624134x.A0O(r9, r4, r5)     // Catch:{ all -> 0x0642 }
            r5.append(r4)     // Catch:{ all -> 0x0642 }
            long r2 = r9.A0K     // Catch:{ all -> 0x0642 }
            r5.append(r2)     // Catch:{ all -> 0x0642 }
            r5.append(r4)     // Catch:{ all -> 0x0642 }
            long r2 = r9.A0J     // Catch:{ all -> 0x0642 }
            X.C18260x0.A1I(r5, r2)     // Catch:{ all -> 0x0642 }
            boolean r2 = X.C627636p.A0l(r9)     // Catch:{ all -> 0x0642 }
            if (r2 != 0) goto L_0x01d3
            boolean r2 = X.C626635z.A09(r9)     // Catch:{ all -> 0x0642 }
            if (r2 != 0) goto L_0x01d3
        L_0x01d1:
            r20 = 1
        L_0x01d3:
            X.2MB r13 = r8.A0K     // Catch:{ all -> 0x0642 }
            r4 = 0
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "ArchiveStatusUtil/ user settings for archive status : "
            X.C18260x0.A1P(r3, r2, r4)     // Catch:{ all -> 0x0642 }
            r3 = 0
            long r4 = r9.A0J     // Catch:{ all -> 0x0642 }
            r21 = 0
            int r2 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r2 > 0) goto L_0x01ea
            long r4 = r9.A0K     // Catch:{ all -> 0x0642 }
        L_0x01ea:
            X.2sH r2 = r13.A00     // Catch:{ all -> 0x0642 }
            long r23 = r2.A0H()     // Catch:{ all -> 0x0642 }
            r21 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = (long) r3     // Catch:{ all -> 0x0642 }
            long r2 = r2 * r21
            long r23 = r23 - r2
            int r2 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r2 < 0) goto L_0x020d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "ArchiveStatusUtil/ message : "
            X.C624134x.A0P(r9, r2, r3)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = " is within archive duration range"
            X.C18260x0.A1J(r3, r2)     // Catch:{ all -> 0x0642 }
            r2 = r35
            goto L_0x021d
        L_0x020d:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "ArchiveStatusUtil/ message "
            X.C624134x.A0P(r9, r2, r3)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = " : is outside archive duration range"
            X.C18260x0.A1J(r3, r2)     // Catch:{ all -> 0x0642 }
            r2 = r34
        L_0x021d:
            r2.add(r9)     // Catch:{ all -> 0x0642 }
            int r32 = r32 + 1
            goto L_0x0297
        L_0x0223:
            r21 = 0
            int r4 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r4 == 0) goto L_0x022d
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x022e
        L_0x022d:
            r6 = r2
        L_0x022e:
            boolean r2 = X.C627636p.A0l(r9)     // Catch:{ all -> 0x0642 }
            if (r2 != 0) goto L_0x0297
            boolean r2 = X.C626635z.A09(r9)     // Catch:{ all -> 0x0642 }
            if (r2 != 0) goto L_0x0297
            com.whatsapp.jid.UserJid r3 = r9.A0o()     // Catch:{ all -> 0x0642 }
            if (r3 != 0) goto L_0x0269
            X.2qk r13 = r8.A00     // Catch:{ all -> 0x0642 }
            java.lang.String r5 = "statusmsgstore/deleteoldstatuses status message with null sender user jid"
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "message: "
            r4.append(r2)     // Catch:{ all -> 0x0642 }
            r4.append(r9)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = " senderJid: "
            X.C624134x.A0R(r9, r2, r4)     // Catch:{ all -> 0x0642 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0642 }
            r2 = 0
            java.lang.StringBuilder r4 = X.C55682qk.A03(r13, r5, r4, r2)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses/null message senderUserJid "
            X.2z0 r2 = X.C624134x.A08(r9, r2, r4)     // Catch:{ all -> 0x0642 }
            X.C18260x0.A0n(r2, r4)     // Catch:{ all -> 0x0642 }
        L_0x0269:
            java.lang.Object r2 = r12.get(r3)     // Catch:{ all -> 0x0642 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0642 }
            if (r2 != 0) goto L_0x0276
            r2 = 1
            X.AnonymousClass0x2.A1I(r3, r12, r2)     // Catch:{ all -> 0x0642 }
            goto L_0x027f
        L_0x0276:
            int r2 = r2.intValue()     // Catch:{ all -> 0x0642 }
            int r2 = r2 + 1
            X.AnonymousClass0x2.A1I(r3, r12, r2)     // Catch:{ all -> 0x0642 }
        L_0x027f:
            if (r43 == 0) goto L_0x0297
            boolean r2 = r9 instanceof X.C30471mV     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x0297
            r2 = r9
            X.1mV r2 = (X.C30471mV) r2     // Catch:{ all -> 0x0642 }
            X.33C r3 = r2.A01     // Catch:{ all -> 0x0642 }
            if (r3 == 0) goto L_0x0297
            java.io.File r2 = r3.A0F     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x0297
            java.io.File r3 = r3.A0F     // Catch:{ all -> 0x0642 }
            r2 = r16
            r2.add(r3)     // Catch:{ all -> 0x0642 }
        L_0x0297:
            int r3 = r35.size()     // Catch:{ all -> 0x0642 }
            r2 = 256(0x100, float:3.59E-43)
            if (r3 < r2) goto L_0x00d3
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r3 = "statusmsgstore/deleteoldstatuses/delete total:"
            r2 = r31
            X.C18270x1.A19(r3, r2, r4, r14)     // Catch:{ all -> 0x0642 }
            r2 = r32
            r4.append(r2)     // Catch:{ all -> 0x0642 }
            java.lang.String r3 = " current batch:"
            r2 = r35
            X.C18260x0.A1B(r3, r4, r2)     // Catch:{ all -> 0x0642 }
            r36.close()     // Catch:{ all -> 0x0642 }
            java.util.Iterator r13 = r35.iterator()     // Catch:{ all -> 0x0642 }
        L_0x02be:
            boolean r2 = r13.hasNext()     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x02d0
            X.34x r5 = X.C18300x5.A0T(r13)     // Catch:{ all -> 0x0642 }
            X.3Lv r4 = r8.A07     // Catch:{ all -> 0x0642 }
            r3 = 1
            r2 = 0
            r4.A0d(r5, r3, r2)     // Catch:{ all -> 0x0642 }
            goto L_0x02be
        L_0x02d0:
            r35.clear()     // Catch:{ all -> 0x0642 }
            java.lang.String r5 = X.AnonymousClass2C9.A02     // Catch:{ all -> 0x0642 }
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x0642 }
            r3 = r39
            r2 = r37
            X.C56922sm.A01(r3, r2, r4)     // Catch:{ all -> 0x0642 }
            long r2 = r9.A1M     // Catch:{ all -> 0x0642 }
            X.C18270x1.A1R(r4, r2)     // Catch:{ all -> 0x0642 }
            java.lang.String r3 = "GET_STATUS_MESSAGES_WITH_REF_GREATER_SQL"
            r2 = r40
            android.database.Cursor r36 = r2.A0E(r5, r3, r4)     // Catch:{ all -> 0x0642 }
            goto L_0x00d3
        L_0x02ef:
            r36.close()     // Catch:{ all -> 0x0642 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses time limit:"
            r4.append(r2)     // Catch:{ all -> 0x0642 }
            r4.append(r0)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = " total:"
            r4.append(r2)     // Catch:{ all -> 0x0642 }
            r4.append(r14)     // Catch:{ all -> 0x0642 }
            java.lang.String r3 = " archived:"
            r2 = r33
            X.C18260x0.A19(r3, r4, r2)     // Catch:{ all -> 0x0642 }
            r2 = r31
            r4.append(r2)     // Catch:{ all -> 0x0642 }
            r2 = r32
            r4.append(r2)     // Catch:{ all -> 0x0642 }
            java.lang.String r3 = " last batch:"
            r2 = r35
            X.C18260x0.A1B(r3, r4, r2)     // Catch:{ all -> 0x0642 }
            java.util.Iterator r9 = r35.iterator()     // Catch:{ all -> 0x0642 }
        L_0x0323:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x0345
            X.34x r5 = X.C18300x5.A0T(r9)     // Catch:{ all -> 0x0642 }
            X.2z0 r4 = r5.A1J     // Catch:{ all -> 0x0642 }
            boolean r2 = r4.A02     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x033d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses/deletingSelfStatus: "
            X.C18260x0.A1R(r3, r2, r4)     // Catch:{ all -> 0x0642 }
        L_0x033d:
            X.3Lv r4 = r8.A07     // Catch:{ all -> 0x0642 }
            r3 = 1
            r2 = 0
            r4.A0d(r5, r3, r2)     // Catch:{ all -> 0x0642 }
            goto L_0x0323
        L_0x0345:
            java.util.Iterator r9 = r34.iterator()     // Catch:{ all -> 0x0642 }
        L_0x0349:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x036b
            X.34x r5 = X.C18300x5.A0T(r9)     // Catch:{ all -> 0x0642 }
            X.2z0 r4 = r5.A1J     // Catch:{ all -> 0x0642 }
            boolean r2 = r4.A02     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x0363
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses/deletingSelfArchivedStatus: "
            X.C18260x0.A1R(r3, r2, r4)     // Catch:{ all -> 0x0642 }
        L_0x0363:
            X.3Lv r4 = r8.A07     // Catch:{ all -> 0x0642 }
            r3 = 1
            r2 = 0
            r4.A0e(r5, r3, r2, r3)     // Catch:{ all -> 0x0642 }
            goto L_0x0349
        L_0x036b:
            java.lang.String r3 = "earliest_status_time"
            r2 = r38
            r2.A04(r3, r6)     // Catch:{ all -> 0x0642 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses new earliest time:"
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            r3.append(r6)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = " active jids:"
            int r2 = X.AnonymousClass0x7.A0A(r2, r3, r12)     // Catch:{ all -> 0x0642 }
            X.C18260x0.A1G(r3, r2)     // Catch:{ all -> 0x0642 }
            java.util.Iterator r10 = X.AnonymousClass001.A0u(r12)     // Catch:{ all -> 0x0642 }
        L_0x038c:
            boolean r2 = r10.hasNext()     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x04a1
            java.util.Map$Entry r9 = X.AnonymousClass001.A0w(r10)     // Catch:{ all -> 0x0642 }
            com.whatsapp.jid.UserJid r5 = X.C18320x8.A0P(r9)     // Catch:{ all -> 0x0642 }
            X.33e r6 = r8.A0H     // Catch:{ all -> 0x0642 }
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A03(r5)     // Catch:{ all -> 0x0642 }
            X.34r r4 = r6.A05(r2)     // Catch:{ all -> 0x0642 }
            if (r4 == 0) goto L_0x041f
            X.1fY r2 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x0642 }
            if (r5 != r2) goto L_0x03b4
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses activeStatuses contains MeJid, StatusInfo: "
            X.C18260x0.A1R(r3, r2, r4)     // Catch:{ all -> 0x0642 }
        L_0x03b4:
            int r3 = r4.A02()     // Catch:{ all -> 0x0642 }
            java.lang.Object r2 = r9.getValue()     // Catch:{ all -> 0x0642 }
            int r2 = X.AnonymousClass0x7.A05(r2)     // Catch:{ all -> 0x0642 }
            if (r3 == r2) goto L_0x038c
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses inconsistency for "
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            r3.append(r5)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = " old count:"
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            int r2 = r4.A02()     // Catch:{ all -> 0x0642 }
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = " ("
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            int r2 = r4.A03()     // Catch:{ all -> 0x0642 }
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = ") new:"
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            java.lang.Object r2 = r9.getValue()     // Catch:{ all -> 0x0642 }
            X.C18270x1.A17(r2, r3)     // Catch:{ all -> 0x0642 }
            java.lang.Object r2 = r9.getValue()     // Catch:{ all -> 0x0642 }
            int r2 = X.AnonymousClass0x7.A05(r2)     // Catch:{ all -> 0x0642 }
            r4.A08(r2)     // Catch:{ all -> 0x0642 }
            int r3 = r4.A03()     // Catch:{ all -> 0x0642 }
            int r2 = r4.A02()     // Catch:{ all -> 0x0642 }
            if (r3 <= r2) goto L_0x0410
            int r2 = r4.A02()     // Catch:{ all -> 0x0642 }
            monitor-enter(r4)     // Catch:{ all -> 0x0642 }
            r4.A01 = r2     // Catch:{ all -> 0x049e }
            monitor-exit(r4)     // Catch:{ all -> 0x0642 }
        L_0x0410:
            int r3 = r4.A03()     // Catch:{ all -> 0x0642 }
            int r2 = r4.A02()     // Catch:{ all -> 0x0642 }
            r6.A0D(r5, r3, r2)     // Catch:{ all -> 0x0642 }
            r20 = 1
            goto L_0x038c
        L_0x041f:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            r3 = r28
            r2 = r29
            X.AnonymousClass000.A17(r5, r3, r2, r4)     // Catch:{ all -> 0x0642 }
            java.lang.Object r2 = r9.getValue()     // Catch:{ all -> 0x0642 }
            r4.append(r2)     // Catch:{ all -> 0x0642 }
            r2 = r30
            X.C18260x0.A1K(r4, r2)     // Catch:{ all -> 0x0642 }
            X.2qk r4 = r8.A00     // Catch:{ all -> 0x0642 }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            r2 = r29
            X.AnonymousClass000.A17(r5, r3, r2, r7)     // Catch:{ all -> 0x0642 }
            java.lang.Object r2 = r9.getValue()     // Catch:{ all -> 0x0642 }
            r7.append(r2)     // Catch:{ all -> 0x0642 }
            r2 = r30
            java.lang.String r7 = X.AnonymousClass000.A0X(r2, r7)     // Catch:{ all -> 0x0642 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "StatusStoreSize: "
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            java.util.Map r2 = r6.A09()     // Catch:{ all -> 0x0642 }
            X.AnonymousClass0x7.A1H(r3, r2)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = ", activeStatusesSize: "
            int r2 = X.AnonymousClass0x7.A0A(r2, r3, r12)     // Catch:{ all -> 0x0642 }
            java.lang.String r3 = X.AnonymousClass000.A0h(r3, r2)     // Catch:{ all -> 0x0642 }
            r2 = 1
            r4.A0A(r7, r2, r3)     // Catch:{ all -> 0x0642 }
            if (r5 == 0) goto L_0x038c
            X.1VX r4 = r8.A0I     // Catch:{ all -> 0x0642 }
            r3 = 6640(0x19f0, float:9.305E-42)
            X.2vE r2 = X.C58422vE.A02     // Catch:{ all -> 0x0642 }
            boolean r2 = r4.A0Y(r2, r3)     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x038c
            X.3Lv r3 = r8.A07     // Catch:{ all -> 0x0642 }
            X.34r r2 = new X.34r     // Catch:{ all -> 0x0642 }
            r2.<init>((X.C56612sH) r15, (com.whatsapp.jid.UserJid) r5)     // Catch:{ all -> 0x0642 }
            X.34r r4 = r3.A0C(r2)     // Catch:{ all -> 0x0642 }
            if (r4 == 0) goto L_0x038c
            r6.A0C(r4, r5)     // Catch:{ all -> 0x0642 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses/regenerating status info for "
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            r3.append(r5)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = " statusInfo: "
            X.C18260x0.A1R(r3, r2, r4)     // Catch:{ all -> 0x0642 }
            goto L_0x038c
        L_0x049e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0642 }
            throw r0     // Catch:{ all -> 0x0642 }
        L_0x04a1:
            X.33e r5 = r8.A0H     // Catch:{ all -> 0x0642 }
            java.util.Map r9 = r5.A09()     // Catch:{ all -> 0x0642 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0642 }
            java.util.Iterator r6 = X.C18280x3.A0i(r9)     // Catch:{ all -> 0x0642 }
        L_0x04af:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x04de
            com.whatsapp.jid.UserJid r4 = X.C18310x6.A0T(r6)     // Catch:{ all -> 0x0642 }
            boolean r2 = r12.containsKey(r4)     // Catch:{ all -> 0x0642 }
            if (r2 != 0) goto L_0x04af
            r7.add(r4)     // Catch:{ all -> 0x0642 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses delete inactive UserJid: "
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            r3.append(r4)     // Catch:{ all -> 0x0642 }
            java.lang.String r2 = " StatusInfo: "
            r3.append(r2)     // Catch:{ all -> 0x0642 }
            java.lang.Object r2 = r9.get(r4)     // Catch:{ all -> 0x0642 }
            X.C18270x1.A17(r2, r3)     // Catch:{ all -> 0x0642 }
            r20 = 1
            goto L_0x04af
        L_0x04de:
            java.util.Iterator r4 = r7.iterator()     // Catch:{ all -> 0x0642 }
        L_0x04e2:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0642 }
            if (r2 == 0) goto L_0x04f9
            com.whatsapp.jid.UserJid r3 = X.C18310x6.A0T(r4)     // Catch:{ all -> 0x0642 }
            X.1fY r2 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x0642 }
            if (r3 != r2) goto L_0x04f5
            java.lang.String r2 = "deleting MeJid status from StatusMessageStore/deleteOldStatusesInternal"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0642 }
        L_0x04f5:
            r5.A03(r3)     // Catch:{ all -> 0x0642 }
            goto L_0x04e2
        L_0x04f9:
            r26.A00()     // Catch:{ all -> 0x0642 }
            r26.close()     // Catch:{ all -> 0x064c }
            r25.close()
            if (r43 == 0) goto L_0x062a
            X.3Dh r7 = r8.A01
            java.io.File r2 = r7.A0I()
            java.io.File[] r6 = r2.listFiles()
            if (r6 == 0) goto L_0x062a
            X.4Fq r15 = r41.A04()
            int r5 = r6.length     // Catch:{ all -> 0x0622 }
            r4 = 0
        L_0x0516:
            if (r4 >= r5) goto L_0x0627
            r9 = r6[r4]     // Catch:{ all -> 0x0622 }
            r2 = r16
            boolean r2 = r2.contains(r9)     // Catch:{ all -> 0x0622 }
            if (r2 != 0) goto L_0x060a
            long r10 = r9.lastModified()     // Catch:{ all -> 0x0622 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x060a
            X.319 r2 = r8.A0A     // Catch:{ all -> 0x0622 }
            java.util.Collection r3 = r2.A0G(r9)     // Catch:{ all -> 0x0622 }
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x0622 }
            java.lang.String r10 = "statusmsgstore/deleteoldstatuses/cleanup/failed to delete "
            if (r2 == 0) goto L_0x055f
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0622 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses/cleanup/ delete "
            X.AnonymousClass000.A10(r9, r2, r11)     // Catch:{ all -> 0x0622 }
            X.AnonymousClass001.A1L(r11)     // Catch:{ all -> 0x0622 }
            long r2 = r9.lastModified()     // Catch:{ all -> 0x0622 }
            X.C18260x0.A1I(r11, r2)     // Catch:{ all -> 0x0622 }
            boolean r2 = r9.delete()     // Catch:{ all -> 0x0622 }
            if (r2 != 0) goto L_0x060a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0622 }
            X.AnonymousClass000.A10(r9, r10, r2)     // Catch:{ all -> 0x0622 }
            X.AnonymousClass0x2.A19(r2)     // Catch:{ all -> 0x0622 }
            goto L_0x060a
        L_0x055f:
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0622 }
            X.34x r2 = X.C18300x5.A0T(r2)     // Catch:{ all -> 0x0622 }
            X.2y5 r12 = r8.A0J     // Catch:{ all -> 0x0622 }
            X.38t r11 = X.AnonymousClass36O.A02(r2)     // Catch:{ all -> 0x0622 }
            int r2 = r2.A09     // Catch:{ all -> 0x0622 }
            java.io.File r11 = X.C107655bf.A0P(r7, r12, r11, r9, r2)     // Catch:{ all -> 0x0622 }
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0622 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses/cleanup "
            X.AnonymousClass000.A10(r9, r2, r12)     // Catch:{ all -> 0x0622 }
            java.lang.String r2 = " found in "
            X.C18290x4.A1O(r2, r12, r3)     // Catch:{ all -> 0x0622 }
            java.lang.String r2 = " message(s), rename to "
            java.lang.String r2 = X.AnonymousClass0x7.A0o(r11, r2, r12)     // Catch:{ all -> 0x0622 }
            X.C18260x0.A1L(r12, r2)     // Catch:{ all -> 0x0622 }
            r7.A0a(r9, r11)     // Catch:{ IOException -> 0x05f8 }
            X.3Yo r14 = r15.Axl()     // Catch:{ all -> 0x0622 }
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x0618 }
        L_0x0596:
            boolean r2 = r12.hasNext()     // Catch:{ all -> 0x0618 }
            if (r2 == 0) goto L_0x05b3
            X.34x r3 = X.C18300x5.A0T(r12)     // Catch:{ all -> 0x0618 }
            boolean r2 = r3 instanceof X.C30471mV     // Catch:{ all -> 0x0618 }
            if (r2 == 0) goto L_0x0596
            r2 = r3
            X.1mV r2 = (X.C30471mV) r2     // Catch:{ all -> 0x0618 }
            X.33C r2 = r2.A01     // Catch:{ all -> 0x0618 }
            if (r2 == 0) goto L_0x0596
            r2.A0F = r11     // Catch:{ all -> 0x0618 }
            X.3Lv r2 = r8.A07     // Catch:{ all -> 0x0618 }
            r2.A0Y(r3)     // Catch:{ all -> 0x0618 }
            goto L_0x0596
        L_0x05b3:
            X.2Y6 r2 = r8.A0B     // Catch:{ all -> 0x0618 }
            java.lang.String r13 = r9.getAbsolutePath()     // Catch:{ all -> 0x0618 }
            java.lang.String r12 = r11.getAbsolutePath()     // Catch:{ all -> 0x0618 }
            X.3dV r2 = r2.A01     // Catch:{ all -> 0x0618 }
            X.4Fq r2 = r2.A04()     // Catch:{ all -> 0x0618 }
            android.content.ContentValues r3 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x060e }
            java.lang.String r11 = "path"
            X.2sg r21 = X.AnonymousClass3H0.A03(r3, r2, r11, r12)     // Catch:{ all -> 0x060e }
            java.lang.String r23 = "media_refs"
            java.lang.String r24 = "path = ?"
            java.lang.String[] r26 = X.C18270x1.A1b(r13)     // Catch:{ all -> 0x060e }
            java.lang.String r25 = "RENAME_MEDIA_REF_SQL"
            r22 = r3
            r21.A05(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x060e }
            r2.close()     // Catch:{ all -> 0x0618 }
            r14.A00()     // Catch:{ all -> 0x0618 }
            r14.close()     // Catch:{ all -> 0x0622 }
            boolean r2 = r9.delete()     // Catch:{ all -> 0x0622 }
            if (r2 != 0) goto L_0x060a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0622 }
            X.AnonymousClass000.A10(r9, r10, r2)     // Catch:{ all -> 0x0622 }
            X.AnonymousClass0x2.A19(r2)     // Catch:{ all -> 0x0622 }
            goto L_0x060a
        L_0x05f8:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0622 }
            java.lang.String r2 = "statusmsgstore/deleteoldstatuses/cleanup/failed to copy from "
            X.AnonymousClass000.A10(r9, r2, r3)     // Catch:{ all -> 0x0622 }
            java.lang.String r2 = " to "
            X.AnonymousClass000.A10(r11, r2, r3)     // Catch:{ all -> 0x0622 }
            X.AnonymousClass0x2.A19(r3)     // Catch:{ all -> 0x0622 }
        L_0x060a:
            int r4 = r4 + 1
            goto L_0x0516
        L_0x060e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0613 }
            goto L_0x0617
        L_0x0613:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0618 }
        L_0x0617:
            throw r1     // Catch:{ all -> 0x0618 }
        L_0x0618:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x061d }
            goto L_0x0621
        L_0x061d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0622 }
        L_0x0621:
            throw r1     // Catch:{ all -> 0x0622 }
        L_0x0622:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0651 }
            throw r1
        L_0x0627:
            r15.close()
        L_0x062a:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "statusmsgstore/deleteoldstatuses time spent:"
            r0 = r19
            X.AnonymousClass33M.A05(r0, r1, r2)
            if (r20 == 0) goto L_0x0641
            X.2hU r0 = r8.A08
            android.os.Handler r1 = r0.A01
            r0 = 25
            X.C69983Zk.A01(r1, r8, r0)
        L_0x0641:
            return
        L_0x0642:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x0647 }
            goto L_0x064b
        L_0x0647:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x064c }
        L_0x064b:
            throw r1     // Catch:{ all -> 0x064c }
        L_0x064c:
            r1 = move-exception
            r25.close()     // Catch:{ all -> 0x0651 }
            throw r1
        L_0x0651:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55152pt.A02(boolean):void");
    }

    public C55152pt(C55682qk r2, C64393Dh r3, AnonymousClass2F3 r4, C56612sH r5, C54292oU r6, C52852m9 r7, C56922sm r8, C66543Lv r9, C50012hU r10, C623334p r11, AnonymousClass319 r12, AnonymousClass2Y6 r13, C29431io r14, C55272q5 r15, C72303dV r16, C56082rO r17, AnonymousClass2W5 r18, C620233e r19, AnonymousClass1VX r20, C60152y5 r21, AnonymousClass2MB r22, AnonymousClass2MD r23, C55832qz r24) {
        this.A03 = r5;
        this.A0I = r20;
        this.A09 = r11;
        this.A06 = r8;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A0H = r19;
        this.A08 = r10;
        this.A0B = r13;
        this.A0M = r24;
        this.A07 = r9;
        this.A0C = r14;
        this.A0K = r22;
        this.A0L = r23;
        this.A0A = r12;
        this.A0F = r17;
        this.A05 = r7;
        this.A0E = r16;
        this.A0G = r18;
        this.A0J = r21;
        this.A02 = r4;
        this.A0D = r15;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d6, code lost:
        if (r1.A01(r5) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fc, code lost:
        if (r11.A0K > r20) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01(com.whatsapp.jid.UserJid r24) {
        /*
            r23 = this;
            X.C626936e.A00()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r7 = r23
            X.3dV r0 = r7.A0E     // Catch:{ RuntimeException -> 0x014a }
            X.4GK r22 = r0.get()     // Catch:{ RuntimeException -> 0x014a }
            r2 = 0
            r10 = 1
            r8 = r24
            if (r24 != 0) goto L_0x0029
            r0 = r22
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0140 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = X.AnonymousClass2C9.A01     // Catch:{ all -> 0x0140 }
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ all -> 0x0140 }
            X.2sm r0 = r7.A06     // Catch:{ all -> 0x0140 }
            X.6kE r9 = X.C135166kE.A00     // Catch:{ all -> 0x0140 }
            X.C56922sm.A02(r0, r9, r4, r2)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "GET_STATUS_MESSAGES_SQL"
            goto L_0x0044
        L_0x0029:
            X.1fY r0 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x0140 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x004b
            r0 = r22
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0140 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = X.AnonymousClass2C9.A04     // Catch:{ all -> 0x0140 }
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ all -> 0x0140 }
            X.2sm r0 = r7.A06     // Catch:{ all -> 0x0140 }
            X.6kE r9 = X.C135166kE.A00     // Catch:{ all -> 0x0140 }
            X.C56922sm.A02(r0, r9, r4, r2)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "SELECT_STATUSES_FOR_ME_SQL"
        L_0x0044:
            android.database.Cursor r4 = r6.A0E(r5, r0, r4)     // Catch:{ all -> 0x0140 }
            if (r24 == 0) goto L_0x007a
            goto L_0x006e
        L_0x004b:
            r0 = r22
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0140 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = X.AnonymousClass2C9.A03     // Catch:{ all -> 0x0140 }
            java.lang.String[] r4 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x0140 }
            X.2sm r0 = r7.A06     // Catch:{ all -> 0x0140 }
            X.6kE r9 = X.C135166kE.A00     // Catch:{ all -> 0x0140 }
            X.C56922sm.A02(r0, r9, r4, r2)     // Catch:{ all -> 0x0140 }
            X.34p r0 = r7.A09     // Catch:{ all -> 0x0140 }
            long r0 = r0.A05(r8)     // Catch:{ all -> 0x0140 }
            X.AnonymousClass0x2.A1S(r4, r10, r0)     // Catch:{ all -> 0x0140 }
            r0 = 2
            X.C18280x3.A0w(r8, r4, r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "SELECT_STATUSES_FOR_JID_SQL"
            goto L_0x0044
        L_0x006e:
            X.33e r0 = r7.A0H     // Catch:{ all -> 0x0134 }
            X.34r r0 = r0.A05(r8)     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x007a
            if (r4 == 0) goto L_0x0130
            goto L_0x012d
        L_0x007a:
            X.2sH r0 = r7.A03     // Catch:{ all -> 0x0134 }
            long r5 = r0.A0H()     // Catch:{ all -> 0x0134 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r20 = r5 - r0
            X.2rO r11 = r7.A0F     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = "status_psa_exipration_time"
            r0 = 0
            long r18 = r11.A00(r10, r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = "status_psa_viewed_time"
            long r16 = r11.A00(r10, r0)     // Catch:{ all -> 0x0134 }
            r15 = 0
        L_0x0098:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0104
            X.2qz r0 = r7.A0M     // Catch:{ all -> 0x0134 }
            X.34x r11 = r0.A04(r4, r9)     // Catch:{ all -> 0x0134 }
            if (r11 != 0) goto L_0x00b1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "statusmsgstore/status-null-message for "
            X.C18260x0.A1Q(r1, r0, r8)     // Catch:{ all -> 0x0134 }
            goto L_0x0098
        L_0x00b1:
            boolean r0 = X.C627636p.A0m(r11)     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x0098
            boolean r0 = X.C626635z.A09(r11)     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x0098
            X.4uZ r0 = r11.A0n()     // Catch:{ all -> 0x0134 }
            boolean r0 = r0 instanceof X.C135216kJ     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x00f8
            X.2W5 r0 = r7.A0G     // Catch:{ all -> 0x0134 }
            X.33F r1 = r0.A00(r11)     // Catch:{ all -> 0x0134 }
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x00d8
            boolean r0 = r1.A01(r5)     // Catch:{ all -> 0x0134 }
            r14 = 1
            if (r0 == 0) goto L_0x00d9
        L_0x00d8:
            r14 = 0
        L_0x00d9:
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x00e6
            long r0 = r11.A0K     // Catch:{ all -> 0x0134 }
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 > 0) goto L_0x00f2
            goto L_0x00e8
        L_0x00e6:
            r0 = 0
            goto L_0x00f3
        L_0x00e8:
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x00f2
            r12 = 0
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00e6
        L_0x00f2:
            r0 = 1
        L_0x00f3:
            if (r0 != 0) goto L_0x00fe
            if (r14 == 0) goto L_0x0102
            goto L_0x00fe
        L_0x00f8:
            long r0 = r11.A0K     // Catch:{ all -> 0x0134 }
            int r10 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r10 <= 0) goto L_0x0102
        L_0x00fe:
            r3.add(r11)     // Catch:{ all -> 0x0134 }
            goto L_0x0098
        L_0x0102:
            r15 = 1
            goto L_0x0098
        L_0x0104:
            if (r15 == 0) goto L_0x012d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "statusmsgstore/status-cleanup/ "
            X.C18260x0.A1R(r1, r0, r8)     // Catch:{ all -> 0x0134 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A0N     // Catch:{ all -> 0x0134 }
            r0 = 1
            boolean r0 = r1.compareAndSet(r2, r0)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0127
            X.2m9 r2 = r7.A05     // Catch:{ all -> 0x0134 }
            r0 = 27
            X.3Zk r1 = X.C69983Zk.A00(r7, r0)     // Catch:{ all -> 0x0134 }
            r0 = 41
            r2.A01(r1, r0)     // Catch:{ all -> 0x0134 }
            goto L_0x012d
        L_0x0127:
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses already running; skip"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0134 }
        L_0x012d:
            r4.close()     // Catch:{ all -> 0x0140 }
        L_0x0130:
            r22.close()     // Catch:{ RuntimeException -> 0x014a }
            return r3
        L_0x0134:
            r1 = move-exception
            if (r4 == 0) goto L_0x013f
            r4.close()     // Catch:{ all -> 0x013b }
            goto L_0x013f
        L_0x013b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0140 }
        L_0x013f:
            throw r1     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x0145 }
            goto L_0x0149
        L_0x0145:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ RuntimeException -> 0x014a }
        L_0x0149:
            throw r1     // Catch:{ RuntimeException -> 0x014a }
        L_0x014a:
            r1 = move-exception
            java.lang.String r0 = "StatusMessageStore/getStatusMessages/exception"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55152pt.A01(com.whatsapp.jid.UserJid):java.util.List");
    }
}
