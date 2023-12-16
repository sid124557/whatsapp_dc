package X;

import android.content.Context;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.47o  reason: invalid class name */
public final class AnonymousClass47o extends Job implements C1228065u {
    public static final ConcurrentHashMap A0C = AnonymousClass0x9.A1D();
    public static final long serialVersionUID = 1;
    public transient long A00;
    public transient AnonymousClass36E A01;
    public transient C56612sH A02;
    public transient AnonymousClass300 A03;
    public transient C620333f A04;
    public transient AnonymousClass36Y A05;
    public transient C95804uY A06;
    public transient AnonymousClass31C A07;
    public transient C45402Zx A08;
    public transient AnonymousClass1EU A09;
    public transient C55832qz A0A;
    public transient boolean A0B;
    public final long expireTimeMs;
    public final byte fMessageType;
    public String fmsgKeyId;
    public final boolean isEditMessage;
    public final String newsletterRawJid;

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        C64333Db A012 = C389229y.A01(context);
        this.A02 = A012.Bqh();
        this.A07 = A012.BLC();
        this.A0A = C64333Db.A8F(A012);
        this.A04 = (C620333f) A012.AKQ.get();
        this.A05 = (AnonymousClass36Y) A012.A7u.get();
        this.A01 = (AnonymousClass36E) A012.ALM.get();
        this.A03 = (AnonymousClass300) A012.AM7.get();
        this.A08 = A012.Aoe();
    }

    public static final AnonymousClass36K A00(C624134x r5) {
        AnonymousClass39V[] r1;
        String str;
        if (r5 instanceof C30451mT) {
            r1 = new AnonymousClass39V[1];
            str = "creation";
        } else if (!(r5 instanceof C30591mh)) {
            return null;
        } else {
            r1 = new AnonymousClass39V[1];
            str = "vote";
        }
        AnonymousClass39V.A0B("polltype", str, r1, 0);
        return AnonymousClass36K.A0I("meta", r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01c0, code lost:
        if (((X.C30481mW) r4).A07 == null) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x026e, code lost:
        if (r9 != null) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x036b, code lost:
        if (r12.length() <= 0) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bb, code lost:
        if (r4 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f6, code lost:
        if ((r4 instanceof X.C30591mh) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x010a, code lost:
        if (r1 != false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r22 = this;
            r2 = r22
            X.2sH r0 = r2.A02
            r4 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x000f:
            long r9 = android.os.SystemClock.uptimeMillis()
            long r7 = r2.A00
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            r2.A00 = r9
        L_0x001d:
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendNewsletterMessageJob/e2e messasge job is duplicate skipping "
        L_0x0028:
            java.lang.String r0 = A01(r2, r0, r1)
            X.C18260x0.A1M(r1, r0)
            return
        L_0x0030:
            X.1EU r0 = r2.A09
            if (r0 == 0) goto L_0x0066
            byte[] r9 = r0.A0F()
        L_0x0038:
            r1 = 1
            if (r9 == 0) goto L_0x003f
            int r0 = r9.length
            if (r0 == 0) goto L_0x003f
            r1 = 0
        L_0x003f:
            r3 = 1
            if (r1 == 0) goto L_0x0068
            byte r1 = r2.fMessageType
            r0 = 15
            if (r1 == r0) goto L_0x0068
            r0 = 64
            if (r1 == r0) goto L_0x0068
            r0 = 56
            if (r1 == r0) goto L_0x0068
            r0 = 67
            if (r1 == r0) goto L_0x0068
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendNewsletterMessageJob/e2e messasge is empty - skipping "
            java.lang.String r0 = A01(r2, r0, r1)
            X.C18260x0.A1M(r1, r0)
            r2.A09(r4)
            return
        L_0x0066:
            r9 = r4
            goto L_0x0038
        L_0x0068:
            X.4uY r1 = r2.A06
            java.lang.String r0 = r2.fmsgKeyId
            X.2z0 r4 = X.AnonymousClass2z0.A05(r1, r0, r3)
            byte r1 = r2.fMessageType
            r0 = 56
            if (r1 == r0) goto L_0x00a2
            r0 = 67
            if (r1 == r0) goto L_0x00a2
            X.2qz r0 = r2.A0A
            java.lang.String r6 = "fMessageDatabase"
            if (r0 != 0) goto L_0x0085
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0085:
            X.34x r4 = r0.A05(r4)
            if (r4 != 0) goto L_0x00db
            byte r1 = r2.fMessageType
            r0 = 15
            if (r1 == r0) goto L_0x0099
            r0 = 64
            if (r1 == r0) goto L_0x0099
            boolean r0 = r2.isEditMessage
            if (r0 == 0) goto L_0x00bd
        L_0x0099:
            X.2qz r5 = r2.A0A
            if (r5 != 0) goto L_0x00b2
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x00a2:
            X.33f r0 = r2.A04
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = "messageAddOnManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ad:
            X.1mH r4 = r0.A08(r4)
            goto L_0x00bb
        L_0x00b2:
            X.4uY r4 = r2.A06
            r1 = 0
            java.lang.String r0 = r2.fmsgKeyId
            X.34x r4 = X.C55832qz.A01(r4, r5, r0, r1)
        L_0x00bb:
            if (r4 != 0) goto L_0x00db
        L_0x00bd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendNewsletterMessageJob/message was deleted from message store "
            java.lang.String r0 = A01(r2, r0, r1)
            X.C18260x0.A1L(r1, r0)
            r4 = 0
            r2.A09(r4)
            r7 = 3
        L_0x00d0:
            X.36E r5 = r2.A01
            if (r5 != 0) goto L_0x0159
            java.lang.String r0 = "messageLoggingBridge"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00db:
            int r1 = r4.A0D
            r0 = 4
            if (r1 != r0) goto L_0x00e9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendNewsletterMessageJob/message received by server, skipping; "
            goto L_0x0028
        L_0x00e9:
            boolean r0 = r4 instanceof X.C30331mH
            r20 = r0
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r4 instanceof X.C30571mf
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r4 instanceof X.C30591mh
            r5 = 1
            if (r0 == 0) goto L_0x00f9
        L_0x00f8:
            r5 = 0
        L_0x00f9:
            byte r11 = r4.A1I
            r0 = 15
            if (r11 == r0) goto L_0x0124
            r0 = 64
            if (r11 == r0) goto L_0x0124
            r0 = 56
            if (r11 != r0) goto L_0x011d
            boolean r1 = r4 instanceof X.C30571mf
        L_0x0109:
            r0 = 1
            if (r1 == 0) goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            if (r5 != 0) goto L_0x0144
            if (r0 != 0) goto L_0x0144
            X.2sH r0 = r2.A02
            if (r0 != 0) goto L_0x0127
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x011d:
            r0 = 67
            if (r11 != r0) goto L_0x010c
            boolean r1 = r4 instanceof X.C30591mh
            goto L_0x0109
        L_0x0124:
            boolean r1 = r4 instanceof X.C30441mS
            goto L_0x0109
        L_0x0127:
            long r6 = r0.A0H()
            long r0 = r2.expireTimeMs
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r5 < 0) goto L_0x0162
            java.lang.String r0 = "sendNewsletterMessageJob/message send job expired "
            java.lang.String r0 = A01(r2, r0, r1)
            X.C18260x0.A1L(r1, r0)
            r2.A09(r4)
            r7 = 5
            goto L_0x00d0
        L_0x0144:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendNewsletterMessageJob/unexpected message "
            java.lang.String r0 = A01(r2, r0, r1)
            X.C18260x0.A1L(r1, r0)
            r2.A09(r4)
            r7 = 11
            goto L_0x00d0
        L_0x0159:
            r9 = r3
            r11 = r3
            r6 = r4
            r8 = r3
            r10 = r3
            r5.A0L(r6, r7, r8, r9, r10, r11)
            return
        L_0x0162:
            java.lang.String r0 = "sendNewsletterMessageJob/running message send job "
            java.lang.String r0 = A01(r2, r0, r1)
            X.C18260x0.A1L(r1, r0)
            X.2i8 r1 = new X.2i8
            r1.<init>()
            X.4uY r0 = r2.A06
            r1.A02 = r0
            java.lang.String r3 = "message"
            r1.A05 = r3
            java.lang.String r0 = r2.fmsgKeyId
            r1.A07 = r0
            byte r5 = r2.fMessageType
            r0 = 15
            if (r5 == r0) goto L_0x0187
            r0 = 64
            if (r5 != r0) goto L_0x018b
        L_0x0187:
            java.lang.String r0 = "8"
            r1.A06 = r0
        L_0x018b:
            boolean r0 = r4 instanceof X.C30571mf
            r19 = r0
            if (r0 == 0) goto L_0x01a2
            r0 = r4
            X.1mf r0 = (X.C30571mf) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x019e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01a2
        L_0x019e:
            java.lang.String r0 = "7"
            r1.A06 = r0
        L_0x01a2:
            boolean r0 = X.C624134x.A0d(r4)
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = "3"
            r1.A06 = r0
        L_0x01ac:
            X.39T r18 = r1.A01()
            X.4uY r0 = r2.A06
            r21 = r0
            boolean r0 = r4 instanceof X.C30481mW
            r17 = r0
            if (r0 == 0) goto L_0x01c2
            r0 = r4
            X.1mW r0 = (X.C30481mW) r0
            java.lang.String r0 = r0.A07
            r5 = 1
            if (r0 != 0) goto L_0x01c3
        L_0x01c2:
            r5 = 0
        L_0x01c3:
            boolean r1 = r4 instanceof X.C30471mV
            boolean r0 = r4 instanceof X.C30451mT
            if (r0 != 0) goto L_0x03dd
            boolean r0 = r4 instanceof X.C30591mh
            if (r0 != 0) goto L_0x03dd
            if (r5 != 0) goto L_0x03d9
            if (r1 != 0) goto L_0x03d9
            java.lang.String r15 = "text"
        L_0x01d4:
            boolean r0 = r4 instanceof X.C30441mS
            java.lang.String r16 = "plaintext"
            r12 = 3
            java.lang.String r10 = "type"
            java.lang.String r14 = "to"
            r5 = 2
            java.lang.String r13 = "id"
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x021a
            X.39V[] r8 = X.AnonymousClass0x9.A1W()
            java.lang.String r0 = r21.getRawString()
            X.AnonymousClass39V.A0B(r14, r0, r8, r6)
            X.AnonymousClass39V.A0B(r10, r15, r8, r7)
            java.lang.String r0 = X.AnonymousClass2z0.A06(r4)
            X.AnonymousClass39V.A0B(r13, r0, r8, r5)
            java.lang.String r5 = "edit"
            r1 = 8
            X.39V r0 = new X.39V
            r0.<init>((java.lang.String) r5, (int) r1)
            r8[r12] = r0
            X.36K r0 = X.AnonymousClass36K.A0H(r16)
            X.36K r5 = X.AnonymousClass36K.A0F(r0, r3, r8)
        L_0x020f:
            X.31C r3 = r2.A07
            if (r3 != 0) goto L_0x03e2
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x021a:
            r8 = 0
            if (r19 == 0) goto L_0x028e
            r15 = r4
            X.1mf r15 = (X.C30571mf) r15
            java.lang.String r9 = r15.A01
            X.2qz r0 = r2.A0A
            if (r0 != 0) goto L_0x022d
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x022d:
            X.34x r1 = X.C30331mH.A01(r15, r0)
            if (r1 == 0) goto L_0x0422
            X.39V[] r11 = X.AnonymousClass0x9.A1W()
            java.lang.String r0 = X.AnonymousClass2z0.A06(r15)
            X.AnonymousClass39V.A0B(r13, r0, r11, r6)
            java.lang.String r0 = r21.getRawString()
            X.AnonymousClass39V.A0B(r14, r0, r11, r7)
            java.lang.String r14 = "server_id"
            long r0 = r1.A1M
            X.39V r13 = new X.39V
            r13.<init>((java.lang.String) r14, (long) r0)
            r11[r5] = r13
            java.lang.String r5 = "reaction"
            X.AnonymousClass39V.A0B(r10, r5, r11, r12)
            java.util.List r11 = X.AnonymousClass8UF.A0p(r11)
            if (r9 == 0) goto L_0x0263
            int r0 = r9.length()
            if (r0 != 0) goto L_0x0270
        L_0x0263:
            java.lang.String r10 = "edit"
            r1 = 7
            X.39V r0 = new X.39V
            r0.<init>((java.lang.String) r10, (int) r1)
            r11.add(r0)
            if (r9 == 0) goto L_0x027d
        L_0x0270:
            int r0 = r9.length()
            if (r0 == 0) goto L_0x027d
            X.39V[] r8 = new X.AnonymousClass39V[r7]
            java.lang.String r0 = "code"
            X.AnonymousClass39V.A0B(r0, r9, r8, r6)
        L_0x027d:
            X.39V[] r0 = new X.AnonymousClass39V[r6]
            java.lang.Object[] r1 = r11.toArray(r0)
            X.39V[] r1 = (X.AnonymousClass39V[]) r1
            X.36K r0 = X.AnonymousClass36K.A0I(r5, r8)
            X.36K r5 = X.AnonymousClass36K.A0F(r0, r3, r1)
            goto L_0x020f
        L_0x028e:
            boolean r0 = r4 instanceof X.C30591mh
            if (r0 == 0) goto L_0x0310
            r15 = r4
            X.1mh r15 = (X.C30591mh) r15
            X.2qz r0 = r2.A0A
            if (r0 != 0) goto L_0x02a0
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02a0:
            X.34x r1 = X.C30331mH.A01(r15, r0)
            if (r1 == 0) goto L_0x042c
            X.39V[] r9 = X.AnonymousClass0x9.A1W()
            java.lang.String r0 = X.AnonymousClass2z0.A06(r15)
            X.AnonymousClass39V.A0B(r13, r0, r9, r6)
            java.lang.String r0 = r21.getRawString()
            X.AnonymousClass39V.A0B(r14, r0, r9, r7)
            java.lang.String r13 = "server_id"
            long r0 = r1.A1M
            X.39V r11 = new X.39V
            r11.<init>((java.lang.String) r13, (long) r0)
            r9[r5] = r11
            java.lang.String r0 = "poll"
            X.AnonymousClass39V.A0B(r10, r0, r9, r12)
            X.36K r12 = A00(r15)
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.List r0 = r15.A01
            if (r0 == 0) goto L_0x02f2
            java.util.Iterator r10 = r0.iterator()
        L_0x02da:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02f2
            java.lang.String r0 = X.AnonymousClass001.A0m(r10)
            byte[] r1 = android.util.Base64.decode(r0, r5)
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "vote"
            X.AnonymousClass36K.A0Q(r0, r11, r1, r8)
            goto L_0x02da
        L_0x02f2:
            X.36K[] r1 = X.C18280x3.A1a(r11, r6)
            java.lang.String r0 = "votes"
            X.36K r1 = X.AnonymousClass36K.A0J(r0, r8, r1)
            if (r12 == 0) goto L_0x030b
            X.36K[] r0 = new X.AnonymousClass36K[r5]
            r0[r6] = r12
            r0[r7] = r1
        L_0x0305:
            X.36K r5 = X.AnonymousClass36K.A0J(r3, r9, r0)
            goto L_0x020f
        L_0x030b:
            X.36K[] r0 = new X.AnonymousClass36K[r7]
            r0[r6] = r1
            goto L_0x0305
        L_0x0310:
            if (r20 != 0) goto L_0x043d
            X.1EU r5 = r2.A09
            if (r5 == 0) goto L_0x0436
            if (r1 != 0) goto L_0x0321
            if (r17 == 0) goto L_0x0339
            r0 = r4
            X.1mW r0 = (X.C30481mW) r0
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x0339
        L_0x0321:
            X.36Y r0 = r2.A05
            if (r0 != 0) goto L_0x032c
            java.lang.String r0 = "deepLinkHelperBridge"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x032c:
            java.lang.String r5 = X.AnonymousClass368.A07(r0, r5)
            if (r5 == 0) goto L_0x0339
            X.39V[] r8 = new X.AnonymousClass39V[r7]
            java.lang.String r0 = "mediatype"
            X.AnonymousClass39V.A0B(r0, r5, r8, r6)
        L_0x0339:
            X.39V[] r5 = new X.AnonymousClass39V[r12]
            java.lang.String r0 = r21.getRawString()
            X.AnonymousClass39V.A0B(r14, r0, r5, r6)
            X.AnonymousClass39V.A0B(r10, r15, r5, r7)
            java.lang.String r0 = X.AnonymousClass2z0.A06(r4)
            X.AnonymousClass39V.A06(r13, r0, r5)
            java.util.List r11 = X.AnonymousClass8UF.A0p(r5)
            r10 = 0
            if (r1 == 0) goto L_0x03d7
            r0 = r4
            X.1mV r0 = (X.C30471mV) r0
            if (r0 == 0) goto L_0x03d7
            X.33C r0 = r0.A01
            if (r0 == 0) goto L_0x03d7
            java.lang.String r12 = r0.A0J
        L_0x035e:
            X.2qb r0 = r4.A0l
            if (r0 == 0) goto L_0x0364
            java.lang.String r10 = r0.A06
        L_0x0364:
            if (r12 == 0) goto L_0x036d
            int r1 = r12.length()
            r0 = 1
            if (r1 > 0) goto L_0x036e
        L_0x036d:
            r0 = 0
        L_0x036e:
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0376
            java.lang.String r5 = X.AnonymousClass000.A0T(r5, r12)
        L_0x0376:
            if (r10 == 0) goto L_0x0392
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x0392
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x038e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            r0 = 38
            java.lang.String r5 = X.AnonymousClass001.A0j(r1, r0)
        L_0x038e:
            java.lang.String r5 = X.AnonymousClass000.A0T(r5, r10)
        L_0x0392:
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x03a2
            java.lang.String r1 = "media_id"
            X.39V r0 = new X.39V
            r0.<init>((java.lang.String) r1, (java.lang.String) r5)
            r11.add(r0)
        L_0x03a2:
            int r5 = r4.A01
            if (r5 == 0) goto L_0x03b0
            java.lang.String r1 = "edit"
            X.39V r0 = new X.39V
            r0.<init>((java.lang.String) r1, (int) r5)
            r11.add(r0)
        L_0x03b0:
            X.36K r10 = A00(r4)
            X.36K r5 = new X.36K
            r0 = r16
            r5.<init>((java.lang.String) r0, (byte[]) r9, (X.AnonymousClass39V[]) r8)
            X.39V[] r0 = new X.AnonymousClass39V[r6]
            java.lang.Object[] r1 = r11.toArray(r0)
            X.39V[] r1 = (X.AnonymousClass39V[]) r1
            if (r10 == 0) goto L_0x03d2
            r0 = 2
            X.36K[] r0 = new X.AnonymousClass36K[r0]
            r0[r6] = r10
            r0[r7] = r5
        L_0x03cc:
            X.36K r5 = X.AnonymousClass36K.A0J(r3, r1, r0)
            goto L_0x020f
        L_0x03d2:
            X.36K[] r0 = new X.AnonymousClass36K[r7]
            r0[r6] = r5
            goto L_0x03cc
        L_0x03d7:
            r12 = r10
            goto L_0x035e
        L_0x03d9:
            java.lang.String r15 = "media"
            goto L_0x01d4
        L_0x03dd:
            java.lang.String r15 = "poll"
            goto L_0x01d4
        L_0x03e2:
            r1 = 8
            r0 = r18
            java.util.concurrent.Future r0 = r3.A07(r5, r0, r1)
            r0.get()
            java.util.concurrent.ConcurrentHashMap r5 = A0C
            X.4uY r0 = r2.A06
            java.lang.String r3 = r0.getRawString()
            java.lang.String r1 = r2.fmsgKeyId
            X.2kV r0 = new X.2kV
            r0.<init>(r3, r1)
            r5.remove(r0)
            X.36E r8 = r2.A01
            if (r8 != 0) goto L_0x040a
            java.lang.String r0 = "messageLoggingBridge"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x040a:
            r11 = r7
            r12 = r7
            r13 = r7
            r9 = r4
            r10 = r7
            r14 = r6
            r8.A0L(r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendNewsletterMessageJob/message send job finished "
            java.lang.String r0 = A01(r2, r0, r1)
            X.C18260x0.A1L(r1, r0)
            return
        L_0x0422:
            r2.A09(r15)
            java.lang.String r0 = "cant send react to message that doesn't exist"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x042c:
            r2.A09(r15)
            java.lang.String r0 = "cant send poll vote to message that doesn't exist"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0436:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x043d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected Message add on is being sent in channel; type="
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47o.A07():void");
    }

    public final String A08() {
        String A082 = C627336j.A08(this.newsletterRawJid);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; id=");
        A0o.append(this.fmsgKeyId);
        A0o.append("; jid=");
        A0o.append(A082);
        C18270x1.A1I(A0o, this);
        return A0o.toString();
    }

    public final void A09(C624134x r5) {
        AnonymousClass300 r3 = this.A03;
        if (r3 == null) {
            throw C18270x1.A0S("messageStatusStoreBridge");
        }
        r3.A01((AnonymousClass2JG) null, AnonymousClass2z0.A05(this.A06, this.fmsgKeyId, true), 21);
        if (r5 != null) {
            C45402Zx r0 = this.A08;
            if (r0 == null) {
                throw C18270x1.A0S("newsletterMessageObservers");
            }
            r0.A00(r5);
        }
        A0C.remove(new C51862kV(this.A06.getRawString(), this.fmsgKeyId));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass47o(X.C95804uY r6, X.AnonymousClass1EU r7, java.lang.String r8, byte r9, long r10, boolean r12) {
        /*
            r5 = this;
            X.2gM r1 = X.C49332gM.A01()
            java.lang.String r0 = r6.getRawString()
            X.C49332gM.A03(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = X.C49332gM.A02(r1)
            r5.<init>(r0)
            r5.A06 = r6
            r5.fmsgKeyId = r8
            r5.expireTimeMs = r10
            r5.fMessageType = r9
            r5.isEditMessage = r12
            r5.A09 = r7
            java.lang.String r4 = r6.getRawString()
            r5.newsletterRawJid = r4
            java.util.concurrent.ConcurrentHashMap r3 = A0C
            monitor-enter(r3)
            X.4uY r0 = r5.A06     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = r5.fmsgKeyId     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0048 }
            X.2kV r0 = new X.2kV     // Catch:{ all -> 0x0048 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0048 }
            boolean r0 = r3.containsKey(r0)     // Catch:{ all -> 0x0048 }
            r5.A0B = r0     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r5.fmsgKeyId     // Catch:{ all -> 0x0048 }
            X.2kV r1 = new X.2kV     // Catch:{ all -> 0x0048 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0048 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0048 }
            monitor-exit(r3)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47o.<init>(X.4uY, X.1EU, java.lang.String, byte, long, boolean):void");
    }

    public static String A01(AnonymousClass47o r0, String str, StringBuilder sb) {
        sb.append(str);
        return r0.A08();
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        AnonymousClass1EU r2;
        objectInputStream.defaultReadObject();
        C95804uY A012 = C95804uY.A03.A01(this.newsletterRawJid);
        if (A012 != null) {
            this.A06 = A012;
            try {
                Object readObject = objectInputStream.readObject();
                C162457s7.A0K(readObject, "null cannot be cast to non-null type kotlin.ByteArray");
                r2 = AnonymousClass1EU.A00((byte[]) readObject);
                if (r2 == null) {
                    byte b = this.fMessageType;
                    if (!(b == 15 || b == 64)) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        throw C18270x1.A0C(A01(this, "sendNewsletterMessageJob/message must not be null ", A0o), A0o);
                    }
                }
            } catch (OptionalDataException unused) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C18260x0.A1J(A0o2, A01(this, "sendNewsletterMessageJob/missing message bytes ", A0o2));
                r2 = null;
            }
            this.A09 = r2;
            StringBuilder A0o3 = AnonymousClass001.A0o();
            C18260x0.A1L(A0o3, A01(this, "sendNewsletterMessageJob/readObject done: ", A0o3));
            ConcurrentHashMap concurrentHashMap = A0C;
            synchronized (concurrentHashMap) {
                C95804uY r0 = this.A06;
                this.A0B = concurrentHashMap.containsKey(new C51862kV(r0.getRawString(), this.fmsgKeyId));
                concurrentHashMap.put(new C51862kV(this.newsletterRawJid, this.fmsgKeyId), Boolean.TRUE);
            }
            return;
        }
        StringBuilder A0o4 = AnonymousClass001.A0o();
        throw C18270x1.A0C(A01(this, "sendNewsletterMessageJob/jid must not be null ", A0o4), A0o4);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        AnonymousClass1EU r0 = this.A09;
        if (r0 != null) {
            objectOutputStream.writeObject(r0.A0F());
        }
    }
}
