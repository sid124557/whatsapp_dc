package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.3bk  reason: invalid class name and case insensitive filesystem */
public final class C71213bk implements Runnable {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C116985rC A03;
    public final C55682qk A04;
    public final C56972sr A05;
    public final AnonymousClass36E A06;
    public final C49712gy A07;
    public final C56612sH A08;
    public final C621133n A09;
    public final C48972fm A0A;
    public final AnonymousClass313 A0B;
    public final C56892sj A0C;
    public final C40432Fu A0D;
    public final C66483Lp A0E;
    public final AnonymousClass300 A0F;
    public final C55332qB A0G;
    public final C29041iB A0H;
    public final AnonymousClass1VX A0I;
    public final C54602oz A0J;
    public final C66383Le A0K;
    public final Jid A0L;
    public final UserJid A0M;
    public final C624134x A0N;
    public final C59882xe A0O;
    public final C55832qz A0P;
    public final C72183dJ A0Q;
    public final C183538qC A0R;
    public final Runnable A0S;
    public final Set A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;

    public final void A00(C28011fL r4, AnonymousClass1A4 r5) {
        byte[] bArr = this.A09.A09(C54422oh.A00(AnonymousClass36G.A02(C56972sr.A02(this.A05)), r4)).A01;
        C626936e.A06(bArr);
        AnonymousClass1BQ r0 = ((AnonymousClass1EU) r5.A00).senderKeyDistributionMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1BQ.DEFAULT_INSTANCE;
        }
        C208419n r1 = (C208419n) r0.A0H();
        r1.A0A(r4.getRawString());
        r1.A09(AnonymousClass0x9.A0J(bArr));
        r5.A0F(r1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.24A} */
    /* JADX WARNING: type inference failed for: r5v77, types: [java.util.AbstractMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c6, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        com.whatsapp.util.Log.e("send message error building sender key distribution message", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03e6, code lost:
        if (r25 != false) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0404, code lost:
        if (r24 != false) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04c9, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04ca, code lost:
        X.C18260x0.A0u("send message runnable failed to build message; messageId=", r7, X.AnonymousClass001.A0o(), r5);
        r7 = r3.A04;
        r6 = X.AnonymousClass001.A0o();
        r6.append("buildE2eMessage failed at ");
        r1 = r5.getStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04e3, code lost:
        if (r1 == null) goto L_0x0556;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04e8, code lost:
        r0 = r1[0].toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04ef, code lost:
        r7.A0A("SendMessageRunnable/run", true, X.AnonymousClass000.A0X(r0, r6));
        r9 = r5 instanceof X.AnonymousClass24A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04fb, code lost:
        if (r9 != false) goto L_0x04fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04fd, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0509, code lost:
        if (r3.A0I.A0Y(X.C58422vE.A02, 5024) == false) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x050b, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x050d, code lost:
        r8 = r3.A06;
        r11 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0510, code lost:
        if (r9 != false) goto L_0x0512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0512, code lost:
        r11 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0514, code lost:
        r7 = r2.A1d;
        r6 = r2.A0B;
        r14 = r3.A0G.A01(r4).size();
        r1 = r3.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0524, code lost:
        if (r9 != false) goto L_0x0526;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0526, code lost:
        r0 = r5.e2eFailureReason;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x052b, code lost:
        r8.A0N(r2, r0, r11, r7, r6, r14, 0, 0, 0, r18, false, false, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x053d, code lost:
        if (r18 != false) goto L_0x053f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x053f, code lost:
        r3.A0F.A01((X.AnonymousClass2JG) null, r4, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0547, code lost:
        r3.A0S.run();
        r0 = r3.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x054e, code lost:
        if (r0 != null) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0550, code lost:
        r0.BQr(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0553, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0554, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0556, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0567, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0568, code lost:
        if (r6 != null) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x056e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0573, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0577, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0134, code lost:
        r12 = r3.A0D;
        r5 = r2.A1L;
        r15 = r12.A00.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r14 = ((X.AnonymousClass3H0) r15).A03;
        r12 = X.AnonymousClass002.A0M();
        X.AnonymousClass000.A16(java.lang.Long.valueOf(r5), r8, r12);
        r14.A0I("INSERT OR REPLACE INTO message_broadcast_ephemeral (message_row_id, shared_secret) VALUES (?, ?)", "INSERT_MESSAGE_SQL", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        if ((r10 instanceof X.C135166kE) != false) goto L_0x006b;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:51:0x0143, B:56:0x0178, B:228:0x056a] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04c9 A[ExcHandler: 24A | NullPointerException (r5v9 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:84:0x0245] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0242  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r50 = this;
            r3 = r50
            com.whatsapp.jid.Jid r0 = r3.A0L
            r27 = r0
            boolean r0 = r0 instanceof X.C95804uY
            java.lang.String r4 = "Attempting to send message with invalid jid: "
            r2 = 1
            r8 = 0
            if (r0 == 0) goto L_0x001e
            X.2qk r1 = r3.A04
            r0 = r27
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0k(r0, r4)
            java.lang.String r0 = r0.toString()
            r1.A0A(r0, r2, r8)
        L_0x001d:
            return
        L_0x001e:
            if (r27 == 0) goto L_0x057e
            boolean r0 = r27.isProtocolCompliant()
            if (r0 == 0) goto L_0x057e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "send message runnable running; messageId="
            r1.append(r0)
            X.34x r2 = r3.A0N
            X.2z0 r4 = r2.A1J
            java.lang.String r7 = r4.A01
            r1.append(r7)
            java.lang.String r0 = "; resend="
            r1.append(r0)
            boolean r0 = r3.A0V
            r26 = r0
            r1.append(r0)
            java.lang.String r0 = "; targetDevices="
            r1.append(r0)
            java.util.Set r9 = r3.A0T
            X.C18260x0.A0o(r9, r1)
            X.4uZ r10 = r4.A00
            X.2sH r0 = r3.A08
            r29 = r0
            long r0 = r29.A0H()
            boolean r25 = X.C627336j.A0K(r10)
            boolean r5 = r10 instanceof X.AnonymousClass1fS
            r24 = r5
            boolean r11 = r10 instanceof X.AnonymousClass1fI
            if (r11 != 0) goto L_0x006b
            boolean r5 = r10 instanceof X.C135166kE
            r23 = 0
            if (r5 == 0) goto L_0x006d
        L_0x006b:
            r23 = 1
        L_0x006d:
            X.2sr r5 = r3.A05
            r28 = r5
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.of(r27)
            if (r6 == 0) goto L_0x009a
            boolean r5 = X.C56972sr.A09(r5, r6)
            if (r5 == 0) goto L_0x009a
            X.1iB r5 = r3.A0H
            java.util.List r5 = r5.A0C()
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 != 0) goto L_0x009a
            java.lang.String r0 = "skip scheduling send message job for self-thread, as there are no paired devices."
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0091:
            X.3dJ r1 = r3.A0Q
            if (r1 == 0) goto L_0x001d
            r0 = 0
            r1.BQt(r0)
            return
        L_0x009a:
            int r13 = r2.A01
            java.util.concurrent.ConcurrentHashMap r12 = com.whatsapp.jobqueue.job.SendE2EMessageJob.A19
            java.lang.String r6 = r27.getRawString()
            X.2gl r5 = new X.2gl
            r5.<init>(r6, r7, r8, r13)
            boolean r12 = r12.containsKey(r5)
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "send message runnable checking scheduling; messageId="
            r6.append(r5)
            r6.append(r7)
            java.lang.String r5 = "; jobAlreadyScheduled="
            X.C18260x0.A1E(r5, r6, r12)
            if (r26 == 0) goto L_0x00f3
            if (r12 == 0) goto L_0x00d9
            X.3dJ r0 = r3.A0Q
            if (r0 == 0) goto L_0x00c8
            r0.BQt(r8)
        L_0x00c8:
            X.36E r3 = r3.A06
            int r2 = r7.hashCode()
            r1 = 5
            boolean r0 = r3.A0d
            if (r0 == 0) goto L_0x001d
            X.30L r0 = r3.A0O
            r0.A04(r2, r1)
            return
        L_0x00d9:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "recreating e2e message job because it's not in the scheduled list; message.key="
            r6.append(r5)
            r6.append(r4)
            java.lang.String r5 = " edit="
            r6.append(r5)
            int r5 = r2.A01
            r6.append(r5)
            X.AnonymousClass0x2.A19(r6)
        L_0x00f3:
            boolean r5 = r2 instanceof X.C30801n8
            if (r5 == 0) goto L_0x013f
            r5 = r2
            X.1n8 r5 = (X.C30801n8) r5
            int r5 = r5.A00
            if (r5 <= 0) goto L_0x013f
            java.lang.Integer r22 = java.lang.Integer.valueOf(r5)
        L_0x0102:
            if (r11 == 0) goto L_0x0216
            boolean r5 = r2 instanceof X.C30441mS
            if (r5 != 0) goto L_0x0216
            int r5 = r2.A0C
            if (r5 != 0) goto L_0x015a
            r5 = 32
            byte[] r8 = new byte[r5]
            java.security.SecureRandom r5 = new java.security.SecureRandom
            r5.<init>()
            r5.nextBytes(r8)
            X.2qB r5 = r3.A0G
            java.util.Set r5 = r5.A01(r4)
            java.util.Iterator r12 = r5.iterator()
        L_0x0122:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x0194
            com.whatsapp.jid.DeviceJid r6 = X.AnonymousClass0x7.A0R(r12)
            r5 = r28
            boolean r5 = r5.A0b(r6)
            if (r5 == 0) goto L_0x0122
            X.2Fu r12 = r3.A0D
            long r5 = r2.A1L
            X.3dV r12 = r12.A00
            X.4Fq r15 = r12.A04()
            goto L_0x0142
        L_0x013f:
            r22 = r8
            goto L_0x0102
        L_0x0142:
            r12 = r15
            X.3H0 r12 = (X.AnonymousClass3H0) r12     // Catch:{ all -> 0x0573 }
            X.2sg r14 = r12.A03     // Catch:{ all -> 0x0573 }
            java.lang.String r13 = "INSERT OR REPLACE INTO message_broadcast_ephemeral (message_row_id, shared_secret) VALUES (?, ?)"
            java.lang.Object[] r12 = X.AnonymousClass002.A0M()     // Catch:{ all -> 0x0573 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0573 }
            X.AnonymousClass000.A16(r5, r8, r12)     // Catch:{ all -> 0x0573 }
            java.lang.String r5 = "INSERT_MESSAGE_SQL"
            r14.A0I(r13, r5, r12)     // Catch:{ all -> 0x0573 }
            goto L_0x0191
        L_0x015a:
            X.2Fu r8 = r3.A0D
            long r5 = r2.A1L
            X.3dV r8 = r8.A00
            X.4GK r15 = r8.get()
            r8 = r15
            X.3H0 r8 = (X.AnonymousClass3H0) r8     // Catch:{ all -> 0x0573 }
            X.2sg r13 = r8.A03     // Catch:{ all -> 0x0573 }
            java.lang.String r12 = "SELECT shared_secret FROM message_broadcast_ephemeral WHERE message_row_id = ?"
            java.lang.String[] r8 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0573 }
            X.C18260x0.A1Y(r8, r5)     // Catch:{ all -> 0x0573 }
            java.lang.String r5 = "GET_SHARED_SECRET_BY_ROW_ID_SQL"
            android.database.Cursor r6 = r13.A0E(r12, r5, r8)     // Catch:{ all -> 0x0573 }
            boolean r5 = r6.moveToNext()     // Catch:{ all -> 0x0567 }
            if (r5 == 0) goto L_0x0189
            java.lang.String r5 = "shared_secret"
            byte[] r8 = X.C18280x3.A1Z(r6, r5)     // Catch:{ all -> 0x0567 }
            r6.close()     // Catch:{ all -> 0x0573 }
            goto L_0x0191
        L_0x0189:
            r6.close()     // Catch:{ all -> 0x0573 }
            r15.close()
            r8 = 0
            goto L_0x0194
        L_0x0191:
            r15.close()
        L_0x0194:
            java.util.Map r5 = r2.A1A
            r20 = r5
            if (r5 != 0) goto L_0x021e
            X.313 r13 = r3.A0B
            X.C626936e.A0C(r11)
            java.util.HashMap r20 = X.AnonymousClass001.A0t()
            X.34U r5 = r13.A06
            X.0PJ r11 = r5.A03(r2)
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "SELECT chat_row_id, duration FROM message_view LEFT JOIN message_ephemeral ON _id = message_row_id"
            r6.append(r5)
            java.lang.Object r5 = r11.A00
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = X.AnonymousClass000.A0X(r5, r6)
            java.lang.Object r5 = r11.A01
            X.0PJ r6 = X.AnonymousClass0x9.A0G(r6, r5)
            X.3dV r5 = r13.A04
            X.4GK r19 = r5.get()
            r5 = r19
            X.3H0 r5 = (X.AnonymousClass3H0) r5     // Catch:{ all -> 0x0562 }
            X.2sg r12 = r5.A03     // Catch:{ all -> 0x0562 }
            java.lang.Object r11 = r6.A00     // Catch:{ all -> 0x0562 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0562 }
            java.lang.Object r6 = r6.A01     // Catch:{ all -> 0x0562 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0562 }
            X.C626936e.A06(r6)     // Catch:{ all -> 0x0562 }
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x0562 }
            java.lang.Object[] r6 = r6.toArray(r5)     // Catch:{ all -> 0x0562 }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x0562 }
            java.lang.String r5 = "GET_BROADCAST_ROW_IDS_AND_EPHEMERAL_SETTINGS_SQL"
            android.database.Cursor r12 = r12.A0E(r11, r5, r6)     // Catch:{ all -> 0x0562 }
            if (r12 == 0) goto L_0x021b
        L_0x01e8:
            boolean r5 = r12.moveToNext()     // Catch:{ all -> 0x0558 }
            if (r5 == 0) goto L_0x0212
            X.2sm r5 = r13.A01     // Catch:{ all -> 0x0558 }
            X.4uZ r11 = r5.A0C(r12)     // Catch:{ all -> 0x0558 }
            java.lang.String r5 = "duration"
            int r6 = X.AnonymousClass0x2.A04(r12, r5)     // Catch:{ all -> 0x0558 }
            com.whatsapp.jid.DeviceJid r18 = com.whatsapp.jid.DeviceJid.of(r11)     // Catch:{ all -> 0x0558 }
            r5 = 0
            r16 = 0
            X.3Z2 r11 = new X.3Z2     // Catch:{ all -> 0x0558 }
            r15 = r6
            r14 = r5
            r5 = r16
            r11.<init>(r15, r5, r14)     // Catch:{ all -> 0x0558 }
            r6 = r18
            r5 = r20
            r5.put(r6, r11)     // Catch:{ all -> 0x0558 }
            goto L_0x01e8
        L_0x0212:
            r12.close()     // Catch:{ all -> 0x0562 }
            goto L_0x021b
        L_0x0216:
            r20 = r8
            r21 = r8
            goto L_0x0228
        L_0x021b:
            r19.close()
        L_0x021e:
            X.2sj r5 = r3.A0C
            if (r24 == 0) goto L_0x0242
            X.2ss r5 = r5.A04
            java.lang.String r21 = r5.A0D(r10)
        L_0x0228:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "send message runnable loading thumbs; messageId="
            X.C18260x0.A0s(r5, r7, r6)
            X.2oz r5 = r3.A0J
            r5.A02(r2)
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "send message runnable building message; messageId="
            X.C18260x0.A0s(r5, r7, r6)
            goto L_0x0245
        L_0x0242:
            r21 = 0
            goto L_0x0228
        L_0x0245:
            X.1A4 r11 = X.C18300x5.A0R()     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            boolean r5 = r2 instanceof X.AnonymousClass48R     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            if (r5 == 0) goto L_0x025e
            X.3Lp r5 = r3.A0E     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            java.util.Set r6 = r5.A04(r2)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            if (r6 == 0) goto L_0x04b5
            boolean r5 = r6.isEmpty()     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            if (r5 != 0) goto L_0x04b5
            r9.addAll(r6)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
        L_0x025e:
            boolean r5 = r2 instanceof X.C30501mY     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r19 = r5
            if (r5 == 0) goto L_0x02ce
            X.33n r5 = r3.A09     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            boolean r5 = r5.A0X()     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            if (r5 == 0) goto L_0x02b3
            boolean r5 = r10 instanceof X.C28011fL     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            if (r5 == 0) goto L_0x02b1
            X.1fL r10 = (X.C28011fL) r10     // Catch:{ 24A | NullPointerException -> 0x04c9 }
        L_0x0272:
            X.C626936e.A06(r10)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r3.A00(r10, r11)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
        L_0x0278:
            X.1EU r18 = X.AnonymousClass0x9.A0W(r11)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            java.util.List r11 = X.C624835f.A01(r18)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            X.1VX r5 = r3.A0I     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r30 = r5
            X.2qk r5 = r3.A04     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r49 = r5
            r10 = r5
            r6 = r30
            r5 = r18
            boolean r5 = X.C624835f.A03(r10, r6, r5, r11)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            if (r5 != 0) goto L_0x02f8
            boolean r5 = X.C56952sp.A0E(r30)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            if (r5 == 0) goto L_0x02f8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            java.lang.String r0 = "SendMessageRunnable/invalid protobuf; message.key="
            r1.append(r0)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r1.append(r4)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            java.lang.String r0 = " messageTypes="
            X.C18260x0.A1S(r1, r0, r11)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r0 = 12
            X.24A r0 = X.AnonymousClass24A.A00(r0)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            throw r0     // Catch:{ 24A | NullPointerException -> 0x04c9 }
        L_0x02b1:
            r10 = 0
            goto L_0x0272
        L_0x02b3:
            X.2fm r12 = r3.A0A     // Catch:{ InterruptedException | ExecutionException -> 0x02c6, 24A | NullPointerException -> 0x04c9 }
            r5 = 13
            X.3aM r6 = new X.3aM     // Catch:{ InterruptedException | ExecutionException -> 0x02c6, 24A | NullPointerException -> 0x04c9 }
            r6.<init>(r3, r10, r11, r5)     // Catch:{ InterruptedException | ExecutionException -> 0x02c6, 24A | NullPointerException -> 0x04c9 }
            java.util.concurrent.ThreadPoolExecutor r5 = r12.A00     // Catch:{ InterruptedException | ExecutionException -> 0x02c6, 24A | NullPointerException -> 0x04c9 }
            java.util.concurrent.Future r5 = r5.submit(r6)     // Catch:{ InterruptedException | ExecutionException -> 0x02c6, 24A | NullPointerException -> 0x04c9 }
            r5.get()     // Catch:{ InterruptedException | ExecutionException -> 0x02c6, 24A | NullPointerException -> 0x04c9 }
            goto L_0x0278
        L_0x02c6:
            r6 = move-exception
            java.lang.String r5 = "send message error building sender key distribution message"
            com.whatsapp.util.Log.e(r5, r6)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            goto L_0x0278
        L_0x02ce:
            X.2qz r12 = r3.A0P     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            X.2xe r6 = r3.A0O     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            X.36E r5 = r3.A06     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            X.C624835f.A02(r5, r2, r6, r12)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            X.2sj r5 = r3.A0C     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            boolean r12 = r5.A0B(r10)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            X.3Le r10 = r3.A0K     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            X.2cu r6 = X.C47222cu.A00(r11)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            X.3Z2 r5 = r2.A0v()     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r6.A00 = r5     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r6.A07 = r8     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r5 = 1
            r6.A01 = r5     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r6.A05 = r12     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            X.2pg r5 = r6.A01()     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            r10.A01(r5, r2)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            goto L_0x0278
        L_0x02f8:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "send message runnable creating e2e message job; messageId="
            X.C18260x0.A0s(r5, r7, r6)
            boolean r17 = X.C627636p.A0r(r2)
            boolean r5 = r9.isEmpty()
            if (r5 == 0) goto L_0x03a4
            if (r25 != 0) goto L_0x0310
            if (r23 == 0) goto L_0x03a4
        L_0x0310:
            X.2qB r11 = r3.A0G
            java.util.Set r10 = r11.A01(r4)
            boolean r6 = r3.A0W
            if (r6 == 0) goto L_0x039e
            X.6kB r5 = r28.A0G()
        L_0x031e:
            r10.add(r5)
            java.lang.String r16 = X.C621933y.A03(r10)
            if (r25 != 0) goto L_0x0329
            if (r23 == 0) goto L_0x03a6
        L_0x0329:
            java.util.Set r10 = r11.A01(r4)
            if (r6 == 0) goto L_0x0399
            X.6kB r5 = r28.A0G()
        L_0x0333:
            r10.add(r5)
            int r5 = r10.size()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r5)
            r5 = r49
            X.C627336j.A0F(r5, r10, r6)
            java.lang.String r15 = X.C620833k.A00(r6)
        L_0x0348:
            boolean r5 = r2 instanceof X.C30551md
            if (r5 == 0) goto L_0x0395
            r5 = r2
            X.1md r5 = (X.C30551md) r5
            int r5 = r5.A01
            if (r5 != 0) goto L_0x0395
            r6 = 4042(0xfca, float:5.664E-42)
            r5 = r30
            long r12 = X.C56952sp.A04(r5, r6)
            r10 = 300000(0x493e0, double:1.482197E-318)
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0365
            r12 = 300000(0x493e0, double:1.482197E-318)
        L_0x0365:
            long r0 = r0 + r12
            long r5 = r3.A02
            r11 = 0
            int r10 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0372
            long r0 = java.lang.Math.min(r5, r0)
        L_0x0372:
            boolean r5 = r9.isEmpty()
            r47 = r5 ^ 1
            if (r47 == 0) goto L_0x03a8
            X.8qC r5 = r3.A0R
            r5.get()
            boolean r5 = X.C57322tS.A00(r2)
            if (r5 == 0) goto L_0x03a8
            r6 = 4
            X.4KE r5 = new X.4KE
            r5.<init>(r6)
            X.AnonymousClass367.A01(r5, r9)
            boolean r5 = r9.isEmpty()
            if (r5 == 0) goto L_0x03a8
            return
        L_0x0395:
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x0365
        L_0x0399:
            X.6kH r5 = X.C56972sr.A03(r28)
            goto L_0x0333
        L_0x039e:
            X.6kH r5 = X.C56972sr.A03(r28)
            goto L_0x031e
        L_0x03a4:
            r16 = 0
        L_0x03a6:
            r15 = 0
            goto L_0x0348
        L_0x03a8:
            long r11 = android.os.SystemClock.uptimeMillis()
            long r40 = r29.A0H()
            long r5 = r3.A00
            long r40 = r40 - r5
            if (r47 == 0) goto L_0x04af
            r38 = r40
        L_0x03b8:
            X.5rC r13 = r3.A03
            X.2dZ r10 = new X.2dZ
            r28 = r10
            r29 = r13
            r31 = r27
            r32 = r18
            r33 = r7
            r34 = r9
            r28.<init>(r29, r30, r31, r32, r33, r34)
            com.whatsapp.jid.UserJid r7 = r3.A0M
            r10.A0A = r7
            int r7 = r2.A0C
            r10.A03 = r7
            byte r7 = r2.A1I
            r10.A00 = r7
            boolean r13 = r3.A0U
            r10.A0J = r13
            r10.A05 = r11
            r7 = r16
            r10.A0D = r7
            r10.A0E = r15
            if (r24 != 0) goto L_0x03e8
            r7 = 0
            if (r25 == 0) goto L_0x03e9
        L_0x03e8:
            r7 = 1
        L_0x03e9:
            r10.A0H = r7
            r10.A04 = r0
            r10.A06 = r5
            long r0 = r3.A01
            r10.A07 = r0
            int r0 = r2.A0k()
            r10.A02 = r0
            int r0 = r2.A01
            r10.A01 = r0
            r0 = r22
            r10.A0B = r0
            if (r25 != 0) goto L_0x0406
            r0 = 0
            if (r24 == 0) goto L_0x0407
        L_0x0406:
            r0 = 1
        L_0x0407:
            r10.A0L = r0
            r0 = r17
            r10.A0I = r0
            boolean r0 = r3.A0W
            r10.A0K = r0
            r10.A0M = r8
            r1 = r20
            r10.A0F = r1
            r1 = r21
            r10.A0C = r1
            r1 = r19
            r10.A0G = r1
            X.8qC r1 = r3.A0R
            X.2sS r5 = X.C18320x8.A0I(r1)
            boolean r1 = r2.A1k()
            if (r1 == 0) goto L_0x04ad
            java.util.List r1 = r2.A18
            com.whatsapp.jid.UserJid r1 = r5.A00(r1)
        L_0x0431:
            r10.A09 = r1
            com.whatsapp.jobqueue.job.SendE2EMessageJob r5 = r10.A00()
            X.2gy r1 = r3.A07
            org.whispersystems.jobqueue.JobParameters r6 = r5.parameters
            java.lang.String r7 = r6.groupId
            X.2d0 r6 = r1.A01()
            X.2nb r6 = r6.A06
            int r35 = r6.A00(r7)
            X.2d0 r6 = r1.A01()
            java.util.concurrent.atomic.AtomicInteger r6 = r6.A04
            int r36 = r6.get()
            if (r25 != 0) goto L_0x04a4
            if (r23 != 0) goto L_0x04a4
            r9 = 0
        L_0x0456:
            X.36E r10 = r3.A06
            r30 = 5
            int r8 = r2.A1d
            int r7 = r2.A0C
            r4 = 0
            int r6 = r2.A0B
            r34 = r4
            r45 = r4
            r48 = r4
            r27 = r10
            r28 = r2
            r29 = r9
            r31 = r8
            r32 = r7
            r33 = r4
            r37 = r6
            r42 = r40
            r44 = r13
            r46 = r26
            r27.A0O(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r45, r46, r47, r48)
            if (r25 == 0) goto L_0x049f
            if (r0 != 0) goto L_0x049f
            if (r9 == 0) goto L_0x049f
            java.util.Iterator r2 = r9.iterator()
        L_0x0488:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x049f
            java.lang.Object r0 = r2.next()
            boolean r0 = r0 instanceof X.C135136kB
            if (r0 == 0) goto L_0x0488
            java.lang.String r6 = "unexpected-lid-in-non-incognito group"
            r2 = 0
            r0 = r49
            r0.A0A(r6, r4, r2)
        L_0x049f:
            r1.A02(r5)
            goto L_0x0091
        L_0x04a4:
            if (r47 != 0) goto L_0x0456
            X.2qB r6 = r3.A0G
            java.util.Set r9 = r6.A01(r4)
            goto L_0x0456
        L_0x04ad:
            r1 = 0
            goto L_0x0431
        L_0x04af:
            long r13 = r2.A1Q
            long r38 = r11 - r13
            goto L_0x03b8
        L_0x04b5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            java.lang.String r0 = "send message runnable skip sending transient message: "
            X.C18260x0.A1R(r1, r0, r4)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            X.3dJ r1 = r3.A0Q     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            if (r1 == 0) goto L_0x001d
            r0 = 0
            r1.BQt(r0)     // Catch:{ 24A | NullPointerException -> 0x04c9 }
            goto L_0x057d
        L_0x04c9:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "send message runnable failed to build message; messageId="
            X.C18260x0.A0u(r0, r7, r1, r5)
            X.2qk r7 = r3.A04
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "buildE2eMessage failed at "
            r6.append(r0)
            java.lang.StackTraceElement[] r1 = r5.getStackTrace()
            if (r1 == 0) goto L_0x0556
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0556
            r0 = 0
            r0 = r1[r0]
            java.lang.String r0 = r0.toString()
        L_0x04ef:
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r6)
            java.lang.String r1 = "SendMessageRunnable/run"
            r0 = 1
            r7.A0A(r1, r0, r6)
            boolean r9 = r5 instanceof X.AnonymousClass24A
            if (r9 == 0) goto L_0x050b
            X.1VX r6 = r3.A0I
            r1 = 5024(0x13a0, float:7.04E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r6.A0Y(r0, r1)
            r18 = 1
            if (r0 != 0) goto L_0x050d
        L_0x050b:
            r18 = 0
        L_0x050d:
            X.36E r8 = r3.A06
            r11 = 3
            if (r9 == 0) goto L_0x0514
            r11 = 13
        L_0x0514:
            int r7 = r2.A1d
            int r6 = r2.A0B
            X.2qB r0 = r3.A0G
            java.util.Set r0 = r0.A01(r4)
            int r14 = r0.size()
            boolean r1 = r3.A0U
            if (r9 == 0) goto L_0x0554
            r0 = r5
            X.24A r0 = (X.AnonymousClass24A) r0
            java.lang.Integer r0 = r0.e2eFailureReason
        L_0x052b:
            r15 = 0
            r17 = r15
            r19 = r15
            r20 = r15
            r9 = r2
            r10 = r0
            r12 = r7
            r13 = r6
            r16 = r15
            r21 = r1
            r8.A0N(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r18 == 0) goto L_0x0547
            X.300 r2 = r3.A0F
            r1 = 20
            r0 = 0
            r2.A01(r0, r4, r1)
        L_0x0547:
            java.lang.Runnable r0 = r3.A0S
            r0.run()
            X.3dJ r0 = r3.A0Q
            if (r0 == 0) goto L_0x001d
            r0.BQr(r5)
            return
        L_0x0554:
            r0 = 0
            goto L_0x052b
        L_0x0556:
            r0 = 0
            goto L_0x04ef
        L_0x0558:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x055d }
            goto L_0x0561
        L_0x055d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0562 }
        L_0x0561:
            throw r1     // Catch:{ all -> 0x0562 }
        L_0x0562:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0578 }
            throw r1
        L_0x0567:
            r1 = move-exception
            if (r6 == 0) goto L_0x0572
            r6.close()     // Catch:{ all -> 0x056e }
            goto L_0x0572
        L_0x056e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0573 }
        L_0x0572:
            throw r1     // Catch:{ all -> 0x0573 }
        L_0x0573:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0578 }
            throw r1
        L_0x0578:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x057d:
            return
        L_0x057e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r27
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r0, r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71213bk.run():void");
    }

    public C71213bk(C116985rC r4, C55682qk r5, C56972sr r6, AnonymousClass36E r7, C49712gy r8, C64773Ex r9, C56612sH r10, C621133n r11, C48972fm r12, C56982ss r13, AnonymousClass313 r14, C56892sj r15, C40432Fu r16, C66483Lp r17, AnonymousClass300 r18, C55332qB r19, C29041iB r20, AnonymousClass1VX r21, C54602oz r22, C66383Le r23, Jid jid, UserJid userJid, C624134x r26, C59882xe r27, C55832qz r28, C72183dJ r29, C183538qC r30, Runnable runnable, Set set, long j, long j2, long j3, boolean z, boolean z2) {
        this.A08 = r10;
        this.A0I = r21;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
        this.A0R = r30;
        this.A06 = r7;
        this.A0A = r12;
        this.A0P = r28;
        this.A09 = r11;
        this.A0F = r18;
        this.A0G = r19;
        this.A0B = r14;
        this.A0H = r20;
        this.A0O = r27;
        this.A03 = r4;
        this.A0J = r22;
        this.A0C = r15;
        this.A0K = r23;
        this.A0E = r17;
        this.A0D = r16;
        C624134x r2 = r26;
        this.A0N = r2;
        this.A0L = jid;
        this.A0M = userJid;
        this.A0T = set;
        this.A0V = z;
        this.A0U = z2;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A0S = runnable;
        this.A0Q = r29;
        this.A0W = C627636p.A0V(r9, r13, r15, r2);
    }
}
