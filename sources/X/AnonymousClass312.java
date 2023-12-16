package X;

import android.text.TextUtils;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException;
import com.whatsapp.jobqueue.job.E2eMessageEncryptor$UnrecoverableErrorException;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.312  reason: invalid class name */
public class AnonymousClass312 {
    public final int A00;
    public final int A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C116985rC A04;
    public final C55682qk A05;
    public final C56972sr A06;
    public final AnonymousClass36E A07;
    public final C621133n A08;
    public final C48972fm A09;
    public final C56892sj A0A;
    public final AnonymousClass33Z A0B;
    public final AnonymousClass2GF A0C;
    public final AnonymousClass1VX A0D;
    public final C54932pW A0E;
    public final Jid A0F;
    public final C48122eO A0G;
    public final C622434g A0H;
    public final C47002cY A0I;
    public final AnonymousClass1EU A0J;
    public final C624134x A0K;
    public final AnonymousClass2z0 A0L;
    public final C55832qz A0M;
    public final C183538qC A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final Map A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final byte[] A0U;

    public final AnonymousClass2NY A02(DeviceJid deviceJid) {
        DeviceJid deviceJid2 = deviceJid;
        if (!AnonymousClass0x9.A1P(deviceJid) || this.A0I.A00().contains(deviceJid)) {
            AnonymousClass2z0 r8 = this.A0L;
            UserJid A032 = AnonymousClass32Y.A03(r8.A00);
            C622434g r4 = this.A0H;
            AnonymousClass1EU r6 = this.A0J;
            C624134x r7 = this.A0K;
            String str = this.A0P;
            if (TextUtils.isEmpty(str)) {
                str = this.A0Q;
            }
            AnonymousClass1EU A042 = r4.A04(deviceJid2, r6, r7, r8, str);
            if (A032 == null) {
                A032 = deviceJid.userJid;
            }
            C43592Ss A062 = r4.A02.A06(A032);
            if (A062 != null) {
                A042 = C33061sN.A00(A042, A062);
            }
            int A0O2 = this.A0D.A0O(C58422vE.A02, 1723);
            if (A0O2 != -1) {
                C18260x0.A0w("E2eMessageEncryptor/createCommonEncryptedMessageForIndividual/messagePayloadAdditionalBytes", AnonymousClass001.A0o(), A0O2);
                A042 = C622434g.A00(A042, A0O2);
            }
            return A03(deviceJid, A042, r7);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sende2emessagejob/");
        A0o.append(deviceJid);
        C18260x0.A1M(A0o, " identity has changed, dropping the message");
        return null;
    }

    public final AnonymousClass2NY A03(DeviceJid deviceJid, AnonymousClass1EU r11, C624134x r12) {
        int A012;
        DeviceJid deviceJid2 = deviceJid;
        AnonymousClass2NY A062 = this.A08.A06(AnonymousClass36G.A02(deviceJid), r11.A0F());
        if (!AnonymousClass0x9.A1P(deviceJid) || this.A0I.A00().contains(deviceJid)) {
            AnonymousClass36E r1 = this.A07;
            Jid jid = this.A0F;
            int i = this.A01;
            if (A062.A01 == 0) {
                A012 = 0;
            } else {
                A012 = this.A0G.A01(deviceJid) + 1;
            }
            r1.A0D(A062, deviceJid2, jid, r12, i, A012, this.A00);
            return A062;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sende2emessagejob/");
        A0o.append(deviceJid);
        C18260x0.A1M(A0o, " identity has changed, ignoring encryption failure");
        return null;
    }

    public static C45442a1 A00(AnonymousClass2NY r4) {
        if (r4 == null || r4.A01 != 0) {
            return null;
        }
        return new C45442a1(r4.A02, 2, C381025p.A00(r4.A00));
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2NY A01() {
        /*
            r24 = this;
            r5 = r24
            X.2z0 r0 = r5.A0L
            X.4uZ r0 = r0.A00
            X.1fL r7 = X.C57382tY.A00(r0)
            boolean r1 = r5.A0S
            X.2sr r0 = r5.A06
            if (r1 == 0) goto L_0x003f
            X.6kB r4 = r0.A0G()
        L_0x0014:
            X.C626936e.A06(r4)
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            X.2ov r0 = X.AnonymousClass36G.A02(r4)
            java.lang.String r6 = r5.A0Q
            X.2oh r10 = new X.2oh
            r10.<init>(r0, r6)
            X.33n r3 = r5.A08
            X.34g r0 = r5.A0H
            X.1EU r1 = r5.A0J
            X.34x r2 = r5.A0K
            boolean r0 = r0.A06(r2)
            if (r0 == 0) goto L_0x0036
            X.1EU r1 = X.C622434g.A01(r1, r2)
        L_0x0036:
            byte[] r23 = r1.A0F()
            X.3fe r16 = X.C614730x.A01(r3, r10)
            goto L_0x0044
        L_0x003f:
            X.6kH r4 = X.C56972sr.A03(r0)
            goto L_0x0014
        L_0x0044:
            X.1VX r8 = r3.A0N     // Catch:{ all -> 0x017c }
            X.AnonymousClass34F.A01(r8)     // Catch:{ all -> 0x017c }
            r1 = 189(0xbd, float:2.65E-43)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x017c }
            boolean r0 = r8.A0Y(r0, r1)     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x00bc
            X.2ai r0 = r3.A01     // Catch:{ all -> 0x017c }
            com.whatsapp.wamsys.JniBridge r15 = r0.A03     // Catch:{ all -> 0x017c }
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x017c }
            r20 = r0
            X.2ov r9 = r10.A00     // Catch:{ all -> 0x017c }
            java.lang.String r21 = X.AnonymousClass31S.A01(r9)     // Catch:{ all -> 0x017c }
            int r0 = r9.A00     // Catch:{ all -> 0x017c }
            r11 = 1
            long r12 = (long) r0     // Catch:{ all -> 0x017c }
            com.facebook.simplejni.NativeHolder r22 = X.C18300x5.A0I(r15)     // Catch:{ all -> 0x017c }
            r18 = r12
            r17 = r11
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOO(r17, r18, r20, r21, r22)     // Catch:{ all -> 0x017c }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ all -> 0x017c }
            X.2In r0 = new X.2In     // Catch:{ all -> 0x017c }
            r0.<init>(r1)     // Catch:{ all -> 0x017c }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x017c }
            com.facebook.simplejni.NativeHolder r14 = r0.A00     // Catch:{ all -> 0x017c }
            r0 = 55
            byte[] r8 = X.C18290x4.A1a(r14, r0)     // Catch:{ all -> 0x017c }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ all -> 0x017c }
            r0 = 57
            long r0 = (long) r0     // Catch:{ all -> 0x017c }
            long r0 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r11, r0, r14)     // Catch:{ all -> 0x017c }
            int r11 = (int) r0     // Catch:{ all -> 0x017c }
            X.2KL r0 = new X.2KL     // Catch:{ all -> 0x017c }
            r0.<init>(r8, r11)     // Catch:{ all -> 0x017c }
            int r8 = r0.A00     // Catch:{ all -> 0x017c }
            if (r8 == 0) goto L_0x00a9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "wamsys/encryptForGroup createSenderKeyDistributionMessage returned status="
            r1.append(r0)     // Catch:{ all -> 0x017c }
            r1.append(r8)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "; address="
            X.C18260x0.A1Q(r1, r0, r10)     // Catch:{ all -> 0x017c }
        L_0x00a9:
            java.lang.String r21 = X.AnonymousClass31S.A01(r9)     // Catch:{ all -> 0x017c }
            com.facebook.simplejni.NativeHolder r22 = X.C18300x5.A0I(r15)     // Catch:{ all -> 0x017c }
            r17 = 0
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOO(r17, r18, r20, r21, r22, r23)     // Catch:{ all -> 0x017c }
            X.2NY r11 = X.C40972Il.A00(r0)     // Catch:{ all -> 0x017c }
            goto L_0x0112
        L_0x00bc:
            X.35n r0 = r3.A00     // Catch:{ all -> 0x017c }
            X.2fm r8 = r0.A04     // Catch:{ all -> 0x017c }
            boolean r1 = r8.A03()     // Catch:{ all -> 0x017c }
            X.2qP r0 = r0.A02     // Catch:{ all -> 0x017c }
            X.2fd r12 = r0.A02     // Catch:{ all -> 0x017c }
            X.2ei r9 = new X.2ei     // Catch:{ all -> 0x017c }
            r9.<init>(r12)     // Catch:{ all -> 0x017c }
            X.2fX r0 = X.AnonymousClass31S.A02(r10)     // Catch:{ all -> 0x017c }
            if (r1 == 0) goto L_0x00de
            java.lang.Object r1 = X.AnonymousClass324.A00     // Catch:{ all -> 0x017c }
            monitor-enter(r1)     // Catch:{ all -> 0x017c }
            r9.A00(r0)     // Catch:{ all -> 0x00db }
            monitor-exit(r1)     // Catch:{ all -> 0x00db }
            goto L_0x00e1
        L_0x00db:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x017c }
        L_0x00de:
            r9.A00(r0)     // Catch:{ all -> 0x017c }
        L_0x00e1:
            X.2fX r11 = X.AnonymousClass31S.A02(r10)     // Catch:{ all -> 0x017c }
            r10 = 0
            r9 = 0
            byte[] r1 = X.C625535n.A03(r23)     // Catch:{ 24R -> 0x010b, 24T -> 0x0108 }
            boolean r0 = r8.A03()     // Catch:{ 24R -> 0x010b, 24T -> 0x0108 }
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r8 = X.AnonymousClass324.A00     // Catch:{ 24R -> 0x010b, 24T -> 0x0108 }
            monitor-enter(r8)     // Catch:{ 24R -> 0x010b, 24T -> 0x0108 }
            byte[] r1 = X.AnonymousClass324.A01(r12, r11, r1)     // Catch:{ all -> 0x00fa }
            monitor-exit(r8)     // Catch:{ all -> 0x00fa }
            goto L_0x0101
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00fa }
            throw r0     // Catch:{ 24R -> 0x010b, 24T -> 0x0108 }
        L_0x00fd:
            byte[] r1 = X.AnonymousClass324.A01(r12, r11, r1)     // Catch:{ 24R -> 0x010b, 24T -> 0x0108 }
        L_0x0101:
            r0 = 3
            X.2NY r11 = new X.2NY     // Catch:{ 24R -> 0x010b, 24T -> 0x0108 }
            r11.<init>(r1, r0, r9)     // Catch:{ 24R -> 0x010b, 24T -> 0x0108 }
            goto L_0x0112
        L_0x0108:
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            goto L_0x010d
        L_0x010b:
            r0 = -1002(0xfffffffffffffc16, float:NaN)
        L_0x010d:
            X.2NY r11 = new X.2NY     // Catch:{ all -> 0x017c }
            r11.<init>(r10, r9, r0)     // Catch:{ all -> 0x017c }
        L_0x0112:
            r16.close()
            X.36E r10 = r5.A07
            r12 = 0
            int r1 = r5.A01
            int r8 = r11.A01
            r9 = 1
            if (r8 != 0) goto L_0x0173
            r16 = 0
        L_0x0121:
            int r0 = r5.A00
            r17 = r0
            r14 = r2
            r15 = r1
            r13 = r7
            r10.A0D(r11, r12, r13, r14, r15, r16, r17)
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            if (r8 != r0) goto L_0x015e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sende2emessagejob/group cipher has invalid sender key"
            r1.append(r0)
            java.lang.String r0 = r5.A0O
            X.C18260x0.A1M(r1, r0)
            X.2ov r1 = X.AnonymousClass36G.A02(r4)
            X.2oh r0 = new X.2oh
            r0.<init>(r1, r6)
            boolean r0 = r3.A0c(r0, r9)
            if (r0 == 0) goto L_0x0154
            java.lang.Integer r0 = X.C18290x4.A0d()
            r10.A0I(r7, r0)
        L_0x0154:
            X.2sj r1 = r5.A0A
            X.33k r0 = X.C56892sj.A01(r1, r7)
            r1.A05(r0)
        L_0x015d:
            return r11
        L_0x015e:
            if (r8 == 0) goto L_0x015d
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            if (r8 == r0) goto L_0x015d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error when calling signalCoordinator.encryptForGroup(); status="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r8)
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x0173:
            X.2eO r0 = r5.A0G
            int r0 = r0.A01(r4)
            int r16 = r0 + 1
            goto L_0x0121
        L_0x017c:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0181 }
            throw r1
        L_0x0181:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass312.A01():X.2NY");
    }

    public AnonymousClass2KL A04() {
        DeviceJid A032;
        boolean z = this.A0S;
        C56972sr r0 = this.A06;
        if (z) {
            A032 = r0.A0G();
        } else {
            A032 = C56972sr.A03(r0);
        }
        C626936e.A06(A032);
        return this.A08.A09(new C54422oh(AnonymousClass36G.A02(A032), this.A0Q));
    }

    public AnonymousClass1EU A05(AnonymousClass2KL r4, C43592Ss r5, String str) {
        byte[] bArr = r4.A01;
        C626936e.A06(bArr);
        AnonymousClass1BQ r0 = ((AnonymousClass1EU) AnonymousClass1EU.DEFAULT_INSTANCE.A0G().A00).senderKeyDistributionMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1BQ.DEFAULT_INSTANCE;
        }
        C208419n r1 = (C208419n) r0.A0H();
        r1.A0A(this.A0Q);
        r1.A09(AnonymousClass0x9.A0J(bArr));
        AnonymousClass1A4 A0R2 = C18300x5.A0R();
        A0R2.A0F(r1);
        C33061sN.A03(r5, A0R2);
        AnonymousClass1EU A0W = AnonymousClass0x9.A0W(A0R2);
        if (str != null) {
            return C622434g.A02(A0W, (String) null, str);
        }
        return A0W;
    }

    public C45442a1 A06(DeviceJid deviceJid, boolean z) {
        AnonymousClass2NY r0;
        DeviceJid A032;
        if (!z) {
            C626936e.A06(deviceJid);
            if (this.A0T) {
                r0 = A02(deviceJid);
            } else {
                r0 = (AnonymousClass2NY) C48972fm.A01(this.A09, new AnonymousClass4IJ(deviceJid, 0, this));
            }
        } else if (this.A0T) {
            r0 = A01();
        } else {
            r0 = (AnonymousClass2NY) C48972fm.A00(this.A09, this, 6);
        }
        if (r0 == null) {
            return null;
        }
        if (r0.A01 == 0) {
            return A00(r0);
        }
        boolean z2 = this.A0S;
        C56972sr r02 = this.A06;
        if (z2) {
            A032 = r02.A0G();
        } else {
            A032 = C56972sr.A03(r02);
        }
        if (z) {
            deviceJid = A032;
        }
        C48122eO r1 = this.A0G;
        C626936e.A06(deviceJid);
        throw new E2eMessageEncryptor$EncryptionFailException(deviceJid, r1.A00(deviceJid));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r1 != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A09(java.util.Map r18) {
        /*
            r17 = this;
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            r4 = r17
            boolean r0 = r4.A0T
            r5 = r18
            if (r0 == 0) goto L_0x0093
            r4.A0C(r5, r6)
        L_0x0014:
            java.util.Iterator r8 = X.AnonymousClass001.A0u(r6)
            r2 = 0
            r6 = r2
        L_0x001a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a7
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r8)
            java.lang.Object r0 = r1.getKey()
            X.2ov r0 = (X.C54562ov) r0
            com.whatsapp.jid.DeviceJid r11 = X.AnonymousClass36G.A04(r0)
            X.C626936e.A06(r11)
            java.lang.Object r10 = r1.getValue()
            X.2NY r10 = (X.AnonymousClass2NY) r10
            int r7 = r10.A01
            if (r7 == 0) goto L_0x0091
            if (r6 != 0) goto L_0x0043
            X.2cY r0 = r4.A0I
            java.util.Collection r6 = r0.A00()
        L_0x0043:
            boolean r1 = r6.contains(r11)
            if (r1 == 0) goto L_0x005b
        L_0x0049:
            X.36E r9 = r4.A07
            X.34x r13 = r4.A0K
            com.whatsapp.jid.Jid r12 = r4.A0F
            int r14 = r4.A01
            if (r7 != 0) goto L_0x0088
            r15 = 0
        L_0x0054:
            int r0 = r4.A00
            r16 = r0
            r9.A0D(r10, r11, r12, r13, r14, r15, r16)
        L_0x005b:
            X.2a1 r0 = A00(r10)
            if (r0 == 0) goto L_0x0065
            r3.put(r11, r0)
            goto L_0x001a
        L_0x0065:
            int r0 = r11.getDevice()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x007d
            if (r1 == 0) goto L_0x007d
            X.2eO r0 = r4.A0G
            int r0 = r0.A00(r11)
            com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r1 = new com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException
            r1.<init>(r11, r0)
            throw r1
        L_0x007d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sende2emessagejob/encryptMessages/dropping message due to encryption failure for "
            X.C18260x0.A1Q(r1, r0, r11)
            goto L_0x001a
        L_0x0088:
            X.2eO r0 = r4.A0G
            int r0 = r0.A01(r11)
            int r15 = r0 + 1
            goto L_0x0054
        L_0x0091:
            r1 = 1
            goto L_0x0049
        L_0x0093:
            X.2fm r2 = r4.A09
            r0 = 38
            X.3aL r1 = new X.3aL
            r1.<init>(r4, r5, r6, r0)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00
            java.util.concurrent.Future r0 = r0.submit(r1)
            r0.get()
            goto L_0x0014
        L_0x00a7:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "sende2emessagejob/encryptMessages/no encrypted messages due to encryption failures"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 4
            com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r1 = new com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException
            r1.<init>(r2, r0)
            throw r1
        L_0x00c0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass312.A09(java.util.Map):java.util.Map");
    }

    public final void A0B(Collection collection, Map map) {
        collection.retainAll(this.A0I.A00());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid A0R2 = AnonymousClass0x7.A0R(it);
            AnonymousClass2z0 r9 = this.A0L;
            UserJid A032 = AnonymousClass32Y.A03(r9.A00);
            C622434g r5 = this.A0H;
            AnonymousClass1EU r7 = this.A0J;
            C624134x r8 = this.A0K;
            String str = this.A0P;
            if (TextUtils.isEmpty(str)) {
                str = this.A0Q;
            }
            AnonymousClass1EU A042 = r5.A04(A0R2, r7, r8, r9, str);
            if (A032 == null) {
                A032 = A0R2.userJid;
            }
            C43592Ss A062 = r5.A02.A06(A032);
            if (A062 != null) {
                A042 = C33061sN.A00(A042, A062);
            }
            int A0O2 = this.A0D.A0O(C58422vE.A02, 1723);
            if (A0O2 != -1) {
                C18260x0.A0w("E2eMessageEncryptor/createCommonEncryptedMessageForIndividual/messagePayloadAdditionalBytes", AnonymousClass001.A0o(), A0O2);
                A042 = C622434g.A00(A042, A0O2);
            }
            C45442a1 A002 = A00(A03(A0R2, A042, r8));
            if (A002 != null) {
                map.put(A0R2, A002);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0070, code lost:
        if (r14.A0Y(r1, 1885) == false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass312(X.C116985rC r3, X.C116985rC r4, X.C116985rC r5, X.C55682qk r6, X.C56972sr r7, X.AnonymousClass36E r8, X.C621133n r9, X.C48972fm r10, X.C56892sj r11, X.AnonymousClass33Z r12, X.AnonymousClass2GF r13, X.AnonymousClass1VX r14, X.C54932pW r15, X.C48122eO r16, X.C622434g r17, X.C47002cY r18, X.AnonymousClass1EU r19, X.C624134x r20, X.AnonymousClass2z0 r21, X.C55832qz r22, X.C183538qC r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.Map r27, byte[] r28, int r29, int r30, boolean r31) {
        /*
            r2 = this;
            r2.<init>()
            r2.A0D = r14
            r2.A05 = r6
            r2.A06 = r7
            r2.A0E = r15
            r0 = r23
            r2.A0N = r0
            r2.A07 = r8
            r2.A09 = r10
            r0 = r22
            r2.A0M = r0
            r0 = r17
            r2.A0H = r0
            r2.A08 = r9
            r2.A0B = r12
            r2.A0C = r13
            r2.A0A = r11
            r2.A02 = r3
            r2.A04 = r4
            r2.A03 = r5
            r0 = r18
            r2.A0I = r0
            r1 = r24
            com.whatsapp.jid.Jid r0 = X.AnonymousClass32W.A00(r1)
            r2.A0F = r0
            r2.A0Q = r1
            r0 = r25
            r2.A0P = r0
            r0 = r21
            r2.A0L = r0
            r0 = r20
            r2.A0K = r0
            r0 = r19
            r2.A0J = r0
            r0 = r28
            r2.A0U = r0
            r0 = r27
            r2.A0R = r0
            r0 = r26
            r2.A0O = r0
            r0 = r16
            r2.A0G = r0
            r0 = r29
            r2.A01 = r0
            r0 = r30
            r2.A00 = r0
            r0 = 2232(0x8b8, float:3.128E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r14.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0072
            r0 = 1885(0x75d, float:2.641E-42)
            boolean r1 = r14.A0Y(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            r2.A0T = r0
            r0 = r31
            r2.A0S = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass312.<init>(X.5rC, X.5rC, X.5rC, X.2qk, X.2sr, X.36E, X.33n, X.2fm, X.2sj, X.33Z, X.2GF, X.1VX, X.2pW, X.2eO, X.34g, X.2cY, X.1EU, X.34x, X.2z0, X.2qz, X.8qC, java.lang.String, java.lang.String, java.lang.String, java.util.Map, byte[], int, int, boolean):void");
    }

    public final String A07(Collection collection) {
        HashSet A0K2 = AnonymousClass002.A0K();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid userJid = AnonymousClass0x7.A0R(it).userJid;
            if (!this.A06.A0a(userJid)) {
                A0K2.add(userJid.getPrimaryDevice());
            }
        }
        return C621933y.A03(A0K2);
    }

    public Map A08(Collection collection) {
        HashMap A0t = AnonymousClass001.A0t();
        if (!collection.isEmpty()) {
            if (this.A0T) {
                A0B(collection, A0t);
            } else {
                C48972fm r2 = this.A09;
                r2.A00.submit(new C70343aL(this, collection, A0t, 37)).get();
                return A0t;
            }
        }
        return A0t;
    }

    public final void A0A(AnonymousClass1fI r21, Collection collection, Map map) {
        C56972sr r6;
        Jid A052;
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C627336j.A0L(AnonymousClass0x7.A0S(it))) {
                    r6 = this.A06;
                    A052 = r6.A0I();
                    break;
                }
            } else {
                r6 = this.A06;
                A052 = C56972sr.A05(r6);
                break;
            }
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            DeviceJid A0R2 = AnonymousClass0x7.A0R(it2);
            Map map2 = map;
            if (!map2.containsKey(A0R2)) {
                Object obj = null;
                if (!r6.A0b(A0R2)) {
                    UserJid userJid = A0R2.userJid;
                    AnonymousClass3Z2 r0 = (AnonymousClass3Z2) this.A0R.get(userJid.getPrimaryDevice().getRawString());
                    if (r0 != null) {
                        byte[] bArr = this.A0U;
                        int i = r0.expiration;
                        C40952Ij r02 = new C40952Ij((NativeHolder) JniBridge.jvidispatchOII((long) i, C18290x4.A0B(r0.ephemeralSettingTimestamp)));
                        String rawString = userJid.getRawString();
                        String rawString2 = A052.getRawString();
                        NativeHolder nativeHolder = r02.A00;
                        obj = JniBridge.jvidispatchOOOOOOO(0, rawString, rawString2, (Object) null, nativeHolder, bArr, r21.getRawString());
                        if (obj == null) {
                            Log.e("sende2emessagejob/failed to encrypt broadcast setting");
                            throw new E2eMessageEncryptor$EncryptionFailException(A0R2, this.A0G.A00(A0R2));
                        }
                    } else {
                        Log.e("sende2emessagejob/missing broadcast setting");
                        throw new E2eMessageEncryptor$UnrecoverableErrorException(A0R2);
                    }
                }
                map2.put(A0R2, obj);
            }
        }
    }

    public final void A0C(Map map, Map map2) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            A0t.put(AnonymousClass36G.A02(AnonymousClass0x9.A0Q(A0w)), ((C170198Cg) A0w.getValue()).A0F());
        }
        C621133n r4 = this.A08;
        HashMap A0t2 = AnonymousClass001.A0t();
        Iterator A0u = AnonymousClass001.A0u(A0t);
        while (A0u.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0u);
            C54562ov r1 = (C54562ov) A0w2.getKey();
            A0t2.put(r1, r4.A06(r1, (byte[]) A0w2.getValue()));
        }
        map2.putAll(A0t2);
    }
}
