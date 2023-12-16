package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass2z0;
import X.AnonymousClass32Y;
import X.AnonymousClass36E;
import X.C1228065u;
import X.C18270x1;
import X.C18300x5;
import X.C18310x6;
import X.C18330xA;
import X.C389229y;
import X.C43542Sn;
import X.C49332gM;
import X.C49422gV;
import X.C52382lO;
import X.C55332qB;
import X.C55682qk;
import X.C55832qz;
import X.C56612sH;
import X.C56892sj;
import X.C56972sr;
import X.C56982ss;
import X.C620333f;
import X.C624134x;
import X.C626936e;
import X.C627336j;
import X.C64213Cp;
import X.C64223Cq;
import X.C64333Db;
import X.C66423Lj;
import X.C66483Lp;
import X.C95814uZ;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.io.ObjectInputStream;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDeviceAndResendMessageJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient C55682qk A01;
    public transient C56972sr A02;
    public transient AnonymousClass36E A03;
    public transient C64223Cq A04;
    public transient C49422gV A05;
    public transient C64213Cp A06;
    public transient C43542Sn A07;
    public transient C56612sH A08;
    public transient C56982ss A09;
    public transient C56892sj A0A;
    public transient C66483Lp A0B;
    public transient C55332qB A0C;
    public transient C620333f A0D;
    public transient C52382lO A0E;
    public transient AnonymousClass1VX A0F;
    public transient C66423Lj A0G;
    public transient AnonymousClass2z0 A0H;
    public transient C55832qz A0I;
    public transient Boolean A0J;
    public transient Set A0K = AnonymousClass002.A0K();
    public transient boolean A0L;
    public final long expirationMs;
    public final String messageId;
    public final String messageRawChatJid;
    public final String[] rawUserJids;
    public final long startTimeMs;

    public void A09(int i) {
        C624134x A052 = this.A0I.A05(this.A0H);
        if (A052 != null || (A052 = this.A0D.A08(this.A0H)) != null) {
            Set A012 = this.A0C.A01(this.A0H);
            this.A03.A0N(A052, (Integer) null, i, 1, C627336j.A00(this.A01, A012), A012.size(), 0, 0, 0, false, false, true, this.A0L);
        }
    }

    public SyncDeviceAndResendMessageJob(AnonymousClass2z0 r6, UserJid[] userJidArr, long j, long j2, boolean z) {
        super(C49332gM.A02(C49332gM.A00()));
        C626936e.A0H(userJidArr);
        for (UserJid userJid : userJidArr) {
            Set set = this.A0K;
            C626936e.A07(userJid, "invalid jid");
            set.add(userJid);
        }
        this.A0H = r6;
        this.rawUserJids = C627336j.A0P(userJidArr);
        this.messageId = r6.A01;
        this.messageRawChatJid = C18300x5.A0i(r6.A00);
        this.expirationMs = j2;
        this.startTimeMs = j;
        this.A0J = Boolean.valueOf(z);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.rawUserJids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw C18330xA.A06("rawJids must not be empty");
        }
        this.A0K = AnonymousClass002.A0K();
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            UserJid A082 = AnonymousClass32Y.A08(str);
            if (A082 != null) {
                this.A0K.add(A082);
                i++;
            } else {
                throw C18330xA.A06(AnonymousClass000.A0T("invalid jid:", str));
            }
        }
        C95814uZ A0S = C18310x6.A0S(this.messageRawChatJid);
        if (A0S != null) {
            this.A0H = AnonymousClass2z0.A04(A0S, this.messageId);
        } else {
            throw C18270x1.A0C(this.messageRawChatJid, AnonymousClass000.A0l("invalid jid:"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.util.HashSet} */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02dd A[Catch:{ all -> 0x0539, Exception -> 0x053f }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r22 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/param="
            r1.append(r0)
            r3 = r22
            java.lang.String r0 = r3.A08()
            X.C18260x0.A1L(r1, r0)
            long r6 = r3.expirationMs
            r4 = 0
            r2 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            X.2sH r0 = r3.A08
            long r6 = r0.A0H()
            long r4 = r3.expirationMs
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/skipping job due to expiration"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 5
            r3.A09(r0)
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x0058
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/expiration due to waiting for requirements"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2qk r4 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            int r0 = r3.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.Boolean r0 = r3.A0J
            java.lang.String r1 = X.AnonymousClass000.A0R(r0, r1)
            java.lang.String r0 = "e2e-backfill-expired"
            r4.A0A(r0, r2, r1)
        L_0x0058:
            return
        L_0x0059:
            X.2z0 r0 = r3.A0H     // Catch:{ Exception -> 0x053f }
            X.4uZ r1 = r0.A00     // Catch:{ Exception -> 0x053f }
            boolean r0 = X.C627336j.A0L(r1)     // Catch:{ Exception -> 0x053f }
            if (r0 != 0) goto L_0x01fa
            X.2ss r0 = r3.A09     // Catch:{ Exception -> 0x053f }
            boolean r0 = r0.A0O(r1)     // Catch:{ Exception -> 0x053f }
            if (r0 != 0) goto L_0x01fa
            X.2z0 r0 = r3.A0H     // Catch:{ Exception -> 0x053f }
            X.4uZ r0 = r0.A00     // Catch:{ Exception -> 0x053f }
            boolean r0 = r0 instanceof X.C135166kE     // Catch:{ Exception -> 0x053f }
            if (r0 != 0) goto L_0x01fa
            X.1VX r4 = r3.A0F     // Catch:{ Exception -> 0x053f }
            r1 = 2193(0x891, float:3.073E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ Exception -> 0x053f }
            boolean r0 = r4.A0Y(r0, r1)     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x01fa
            X.2sj r1 = r3.A0A     // Catch:{ Exception -> 0x053f }
            X.2z0 r0 = r3.A0H     // Catch:{ Exception -> 0x053f }
            X.4uZ r0 = r0.A00     // Catch:{ Exception -> 0x053f }
            boolean r0 = r1.A0B(r0)     // Catch:{ Exception -> 0x053f }
            if (r0 != 0) goto L_0x01fa
            java.util.Set r0 = r3.A0K     // Catch:{ Exception -> 0x053f }
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r0)     // Catch:{ Exception -> 0x053f }
            X.2sr r0 = r3.A02     // Catch:{ Exception -> 0x053f }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)     // Catch:{ Exception -> 0x053f }
            r1.remove(r0)     // Catch:{ Exception -> 0x053f }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x00b9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/requestPrekeyForDevices only self device in the list. recipients size="
            r1.append(r0)     // Catch:{ Exception -> 0x053f }
            java.util.Set r0 = r3.A0K     // Catch:{ Exception -> 0x053f }
            int r0 = r0.size()     // Catch:{ Exception -> 0x053f }
            X.C18270x1.A1F(r1, r0)     // Catch:{ Exception -> 0x053f }
        L_0x00b2:
            r0 = 8
            r3.A09(r0)     // Catch:{ Exception -> 0x053f }
            goto L_0x0526
        L_0x00b9:
            X.2Sn r10 = r3.A07     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = ""
            X.C626936e.A09(r0, r1)     // Catch:{ Exception -> 0x053f }
            X.3dJ r11 = new X.3dJ     // Catch:{ Exception -> 0x053f }
            r11.<init>()     // Catch:{ Exception -> 0x053f }
            X.2Xo r9 = new X.2Xo     // Catch:{ Exception -> 0x053f }
            r9.<init>(r10, r11)     // Catch:{ Exception -> 0x053f }
            X.2qk r8 = r10.A00     // Catch:{ Exception -> 0x053f }
            X.31C r7 = r10.A04     // Catch:{ Exception -> 0x053f }
            java.util.HashMap r6 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x053f }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ Exception -> 0x053f }
        L_0x00d6:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x0112
            com.whatsapp.jid.UserJid r5 = X.C18310x6.A0T(r14)     // Catch:{ Exception -> 0x053f }
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x053f }
            X.318 r0 = r10.A03     // Catch:{ Exception -> 0x053f }
            java.util.Set r0 = r0.A0D(r5)     // Catch:{ Exception -> 0x053f }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Exception -> 0x053f }
        L_0x00ee:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x010e
            com.whatsapp.jid.DeviceJid r1 = X.AnonymousClass0x7.A0R(r13)     // Catch:{ Exception -> 0x053f }
            X.2ov r12 = X.AnonymousClass36G.A02(r1)     // Catch:{ Exception -> 0x053f }
            X.33n r0 = r10.A01     // Catch:{ Exception -> 0x053f }
            X.2wr r0 = r0.A0A(r12)     // Catch:{ Exception -> 0x053f }
            X.2uv r0 = r0.A01     // Catch:{ Exception -> 0x053f }
            X.1E1 r0 = r0.A00     // Catch:{ Exception -> 0x053f }
            int r0 = r0.remoteRegistrationId_     // Catch:{ Exception -> 0x053f }
            if (r0 <= 0) goto L_0x00ee
            X.AnonymousClass0x2.A1I(r1, r4, r0)     // Catch:{ Exception -> 0x053f }
            goto L_0x00ee
        L_0x010e:
            r6.put(r5, r4)     // Catch:{ Exception -> 0x053f }
            goto L_0x00d6
        L_0x0112:
            X.3So r10 = new X.3So     // Catch:{ Exception -> 0x053f }
            r10.<init>(r8, r9, r7, r6)     // Catch:{ Exception -> 0x053f }
            java.util.Map r4 = r10.A03     // Catch:{ Exception -> 0x053f }
            boolean r0 = r4.isEmpty()     // Catch:{ Exception -> 0x053f }
            r0 = r0 ^ 1
            X.C626936e.A0B(r0)     // Catch:{ Exception -> 0x053f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "FetchPrekeyForAllDevicesProtocolHelper/sendFetchPrekeyForAllDeviceRequest size="
            r1.append(r0)     // Catch:{ Exception -> 0x053f }
            int r0 = r4.size()     // Catch:{ Exception -> 0x053f }
            X.C18260x0.A1G(r1, r0)     // Catch:{ Exception -> 0x053f }
            X.31C r15 = r10.A02     // Catch:{ Exception -> 0x053f }
            java.lang.String r9 = r15.A03()     // Catch:{ Exception -> 0x053f }
            r19 = 346(0x15a, float:4.85E-43)
            java.util.ArrayList r14 = X.C18290x4.A0z(r4)     // Catch:{ Exception -> 0x053f }
            java.util.Iterator r18 = X.AnonymousClass000.A0q(r4)     // Catch:{ Exception -> 0x053f }
        L_0x0142:
            boolean r0 = r18.hasNext()     // Catch:{ Exception -> 0x053f }
            r13 = 0
            java.lang.String r12 = "id"
            r8 = 1
            if (r0 == 0) goto L_0x01a9
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r18)     // Catch:{ Exception -> 0x053f }
            com.whatsapp.jid.Jid r7 = X.AnonymousClass0x9.A0R(r0)     // Catch:{ Exception -> 0x053f }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x053f }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x053f }
            java.util.ArrayList r6 = X.C18290x4.A0z(r0)     // Catch:{ Exception -> 0x053f }
            java.util.Iterator r17 = X.AnonymousClass000.A0q(r0)     // Catch:{ Exception -> 0x053f }
        L_0x0162:
            boolean r0 = r17.hasNext()     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x0197
            java.util.Map$Entry r16 = X.AnonymousClass001.A0w(r17)     // Catch:{ Exception -> 0x053f }
            java.lang.Object r0 = r16.getValue()     // Catch:{ Exception -> 0x053f }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ Exception -> 0x053f }
            byte[] r1 = X.AnonymousClass36A.A01(r0)     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "registration"
            X.36K r5 = new X.36K     // Catch:{ Exception -> 0x053f }
            r5.<init>((java.lang.String) r0, (byte[]) r1, (X.AnonymousClass39V[]) r13)     // Catch:{ Exception -> 0x053f }
            X.39V[] r4 = new X.AnonymousClass39V[r8]     // Catch:{ Exception -> 0x053f }
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass0x9.A0Q(r16)     // Catch:{ Exception -> 0x053f }
            int r1 = r0.getDevice()     // Catch:{ Exception -> 0x053f }
            X.39V r0 = new X.39V     // Catch:{ Exception -> 0x053f }
            r0.<init>((java.lang.String) r12, (int) r1)     // Catch:{ Exception -> 0x053f }
            r4[r2] = r0     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "device"
            X.AnonymousClass36K.A0O(r5, r0, r6, r4)     // Catch:{ Exception -> 0x053f }
            goto L_0x0162
        L_0x0197:
            X.39V[] r4 = new X.AnonymousClass39V[r8]     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "jid"
            X.AnonymousClass39V.A02(r7, r0, r4, r2)     // Catch:{ Exception -> 0x053f }
            X.36K[] r1 = X.C18280x3.A1a(r6, r2)     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "user"
            X.AnonymousClass36K.A0S(r0, r14, r4, r1)     // Catch:{ Exception -> 0x053f }
            goto L_0x0142
        L_0x01a9:
            X.39V[] r4 = X.AnonymousClass0x9.A1W()     // Catch:{ Exception -> 0x053f }
            X.AnonymousClass39V.A0B(r12, r9, r4, r2)     // Catch:{ Exception -> 0x053f }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "encrypt"
            X.AnonymousClass39V.A09(r1, r0, r4)     // Catch:{ Exception -> 0x053f }
            X.39V r1 = X.AnonymousClass39V.A00()     // Catch:{ Exception -> 0x053f }
            r0 = 3
            r4[r0] = r1     // Catch:{ Exception -> 0x053f }
            X.36K[] r1 = X.C18280x3.A1a(r14, r2)     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "key_fetch"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r13, r1)     // Catch:{ Exception -> 0x053f }
            X.36K r17 = X.AnonymousClass36K.A0G(r0, r4)     // Catch:{ Exception -> 0x053f }
            r20 = 64000(0xfa00, double:3.162E-319)
            r16 = r10
            r18 = r9
            r15.A0D(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x053f }
            java.lang.Object r0 = r11.get()     // Catch:{ Exception -> 0x053f }
            boolean r5 = X.AnonymousClass001.A1Z(r0)     // Catch:{ Exception -> 0x053f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/requestPrekeyForDevices success="
            X.C18260x0.A1D(r0, r1, r5)     // Catch:{ Exception -> 0x053f }
            X.3Cp r4 = r3.A06     // Catch:{ Exception -> 0x053f }
            java.util.Set r1 = r3.A0K     // Catch:{ Exception -> 0x053f }
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r2]     // Catch:{ Exception -> 0x053f }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ Exception -> 0x053f }
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1     // Catch:{ Exception -> 0x053f }
            r0 = 3
            r4.A01(r1, r0)     // Catch:{ Exception -> 0x053f }
            goto L_0x02db
        L_0x01fa:
            X.2z0 r0 = r3.A0H     // Catch:{ Exception -> 0x053f }
            X.4uZ r0 = r0.A00     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x028e
            X.1VX r4 = r3.A0F     // Catch:{ Exception -> 0x053f }
            r1 = 4961(0x1361, float:6.952E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ Exception -> 0x053f }
            boolean r0 = r4.A0Y(r0, r1)     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x028e
            java.util.Set r0 = r3.A0K     // Catch:{ Exception -> 0x053f }
            java.util.HashSet r6 = X.AnonymousClass0x9.A15(r0)     // Catch:{ Exception -> 0x053f }
            X.2sj r9 = r3.A0A     // Catch:{ Exception -> 0x053f }
            X.2z0 r0 = r3.A0H     // Catch:{ Exception -> 0x053f }
            X.4uZ r8 = r0.A00     // Catch:{ Exception -> 0x053f }
            boolean r0 = r8 instanceof X.C28011fL     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x028b
            X.2pW r1 = r9.A0E     // Catch:{ Exception -> 0x053f }
            r0 = r8
            X.1fL r0 = (X.C28011fL) r0     // Catch:{ Exception -> 0x053f }
            boolean r1 = r1.A02(r0)     // Catch:{ Exception -> 0x053f }
            X.33k r4 = X.C56892sj.A01(r9, r0)     // Catch:{ Exception -> 0x053f }
            X.2sr r0 = r9.A02     // Catch:{ Exception -> 0x053f }
            boolean r0 = r4.A0P(r0)     // Catch:{ Exception -> 0x053f }
            if (r1 == 0) goto L_0x028b
            if (r0 == 0) goto L_0x028b
            java.util.HashSet r5 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x053f }
            X.318 r1 = r9.A0C     // Catch:{ Exception -> 0x053f }
            java.util.Map r0 = r4.A08     // Catch:{ Exception -> 0x053f }
            java.util.Set r0 = r0.keySet()     // Catch:{ Exception -> 0x053f }
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r0)     // Catch:{ Exception -> 0x053f }
            java.util.Map r11 = r1.A0A(r0)     // Catch:{ Exception -> 0x053f }
            java.util.Map r0 = r4.A09     // Catch:{ Exception -> 0x053f }
            java.util.Set r0 = r0.keySet()     // Catch:{ Exception -> 0x053f }
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r0)     // Catch:{ Exception -> 0x053f }
            java.util.Map r0 = r1.A0A(r0)     // Catch:{ Exception -> 0x053f }
            java.util.Iterator r12 = X.AnonymousClass000.A0q(r0)     // Catch:{ Exception -> 0x053f }
        L_0x0259:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x0291
            java.util.Map$Entry r10 = X.AnonymousClass001.A0w(r12)     // Catch:{ Exception -> 0x053f }
            com.whatsapp.jid.UserJid r1 = X.C18320x8.A0P(r10)     // Catch:{ Exception -> 0x053f }
            X.2sM r0 = r9.A0B     // Catch:{ Exception -> 0x053f }
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1     // Catch:{ Exception -> 0x053f }
            X.1fH r7 = r0.A01(r1)     // Catch:{ Exception -> 0x053f }
            java.lang.Object r4 = r11.get(r7)     // Catch:{ Exception -> 0x053f }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ Exception -> 0x053f }
            java.lang.Object r0 = r10.getValue()     // Catch:{ Exception -> 0x053f }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x053f }
            if (r4 == 0) goto L_0x0287
            int r1 = r0.size()     // Catch:{ Exception -> 0x053f }
            int r0 = r4.size()     // Catch:{ Exception -> 0x053f }
            if (r1 == r0) goto L_0x0259
        L_0x0287:
            r5.add(r7)     // Catch:{ Exception -> 0x053f }
            goto L_0x0259
        L_0x028b:
            X.3d7 r5 = X.C72063d7.A00     // Catch:{ Exception -> 0x053f }
            goto L_0x02b5
        L_0x028e:
            java.util.Set r6 = r3.A0K     // Catch:{ Exception -> 0x053f }
            goto L_0x02b8
        L_0x0291:
            int r0 = r5.size()     // Catch:{ Exception -> 0x053f }
            if (r0 <= 0) goto L_0x02b5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "GroupParticipantsManager/getLidsUsersIfMissingDevices found lid users with missing devices for group: "
            X.C18260x0.A1P(r1, r0, r8)     // Catch:{ Exception -> 0x053f }
            X.2qk r4 = r9.A00     // Catch:{ Exception -> 0x053f }
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r8)     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = ":"
            X.C18260x0.A19(r0, r1, r5)     // Catch:{ Exception -> 0x053f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "pnh-cag-missing-lids"
            r4.A0A(r0, r2, r1)     // Catch:{ Exception -> 0x053f }
        L_0x02b5:
            r6.addAll(r5)     // Catch:{ Exception -> 0x053f }
        L_0x02b8:
            X.3Cq r1 = r3.A04     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "jid list is empty"
            X.C626936e.A09(r0, r6)     // Catch:{ Exception -> 0x053f }
            X.227 r0 = X.AnonymousClass227.A0G     // Catch:{ Exception -> 0x053f }
            X.3dJ r0 = r1.A04(r0, r6)     // Catch:{ Exception -> 0x053f }
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x053f }
            X.304 r4 = (X.AnonymousClass304) r4     // Catch:{ Exception -> 0x053f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/requestSyncDevices/sync is success="
            r1.append(r0)     // Catch:{ Exception -> 0x053f }
            boolean r5 = r4.A00()     // Catch:{ Exception -> 0x053f }
            X.C18260x0.A1U(r1, r5)     // Catch:{ Exception -> 0x053f }
        L_0x02db:
            if (r5 == 0) goto L_0x00b2
            X.2z0 r9 = r3.A0H     // Catch:{ Exception -> 0x053f }
            X.2qz r0 = r3.A0I     // Catch:{ Exception -> 0x053f }
            X.34x r7 = r0.A05(r9)     // Catch:{ Exception -> 0x053f }
            if (r7 != 0) goto L_0x0302
            X.33f r0 = r3.A0D     // Catch:{ Exception -> 0x053f }
            X.1mH r7 = r0.A08(r9)     // Catch:{ Exception -> 0x053f }
            if (r7 != 0) goto L_0x0302
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/revokeMessage/message "
            r1.append(r0)     // Catch:{ Exception -> 0x053f }
            r1.append(r9)     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = " no longer exist"
            X.C18260x0.A1L(r1, r0)     // Catch:{ Exception -> 0x053f }
            goto L_0x0527
        L_0x0302:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/message = "
            X.C18260x0.A1R(r1, r0, r7)     // Catch:{ Exception -> 0x053f }
            X.2qB r0 = r3.A0C     // Catch:{ Exception -> 0x053f }
            java.util.Set r8 = r0.A01(r9)     // Catch:{ Exception -> 0x053f }
            X.3Lp r6 = r3.A0B     // Catch:{ Exception -> 0x053f }
            boolean r0 = r7 instanceof X.C30441mS     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x032e
            java.util.Set r6 = r6.A05(r7)     // Catch:{ Exception -> 0x053f }
        L_0x031b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/original list = "
            X.C18260x0.A1R(r1, r0, r8)     // Catch:{ Exception -> 0x053f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/new list = "
            X.C18260x0.A1R(r1, r0, r6)     // Catch:{ Exception -> 0x053f }
            goto L_0x035c
        L_0x032e:
            X.2z0 r0 = r7.A1J     // Catch:{ Exception -> 0x053f }
            boolean r1 = r0.A02     // Catch:{ Exception -> 0x053f }
            if (r1 == 0) goto L_0x0341
            long r4 = r7.A0I     // Catch:{ Exception -> 0x053f }
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0341
            java.util.Set r6 = r6.A06(r7)     // Catch:{ Exception -> 0x053f }
            goto L_0x031b
        L_0x0341:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "MessageDeviceTargetManager/getDevicesToResendMessage/invalid message: "
            r4.append(r0)     // Catch:{ Exception -> 0x053f }
            r4.append(r1)     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = " : "
            r4.append(r0)     // Catch:{ Exception -> 0x053f }
            long r0 = r7.A0I     // Catch:{ Exception -> 0x053f }
            r4.append(r0)     // Catch:{ Exception -> 0x053f }
            X.AnonymousClass0x2.A19(r4)     // Catch:{ Exception -> 0x053f }
            r6 = 0
            goto L_0x031b
        L_0x035c:
            if (r6 == 0) goto L_0x0058
            r6.removeAll(r8)     // Catch:{ Exception -> 0x053f }
            boolean r0 = r6.isEmpty()     // Catch:{ Exception -> 0x053f }
            if (r0 != 0) goto L_0x04ed
            X.2lO r5 = r3.A0E     // Catch:{ Exception -> 0x053f }
            X.2qk r4 = r3.A01     // Catch:{ Exception -> 0x053f }
            int r1 = r6.size()     // Catch:{ Exception -> 0x053f }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x053f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x053f }
            X.C627336j.A0F(r4, r6, r0)     // Catch:{ Exception -> 0x053f }
            java.util.Map r8 = r5.A01(r0)     // Catch:{ Exception -> 0x053f }
            X.2qB r1 = r3.A0C     // Catch:{ Exception -> 0x053f }
            X.2qz r0 = r1.A03     // Catch:{ Exception -> 0x053f }
            X.34x r0 = r0.A05(r9)     // Catch:{ Exception -> 0x053f }
            if (r0 != 0) goto L_0x03a3
            X.1R2 r5 = r1.A00     // Catch:{ Exception -> 0x053f }
        L_0x0387:
            boolean r0 = r5 instanceof X.AnonymousClass1R3     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x0415
            X.1R3 r5 = (X.AnonymousClass1R3) r5     // Catch:{ Exception -> 0x053f }
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x053f }
            X.2qz r0 = r5.A02     // Catch:{ Exception -> 0x053f }
            X.34x r0 = r0.A05(r9)     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x0494
            java.lang.String[] r10 = X.AnonymousClass0x9.A1Y()     // Catch:{ Exception -> 0x053f }
            long r0 = r0.A1L     // Catch:{ Exception -> 0x053f }
            X.C18260x0.A1X(r10, r0)     // Catch:{ Exception -> 0x053f }
            goto L_0x03a6
        L_0x03a3:
            X.1R3 r5 = r1.A01     // Catch:{ Exception -> 0x053f }
            goto L_0x0387
        L_0x03a6:
            X.3dV r0 = r5.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0490 }
            X.4GK r14 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0490 }
            r0 = r14
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x040b }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x040b }
            java.lang.String r1 = "SELECT receipt_device_jid_row_id, primary_device_version FROM receipt_device WHERE message_row_id = ?"
            java.lang.String r0 = "MessageReceiptDeviceStore/GET_PRIMARY_DEVICE_VERSIONS_SQL"
            android.database.Cursor r11 = r9.A0E(r1, r0, r10)     // Catch:{ all -> 0x040b }
            java.lang.String r0 = "primary_device_version"
            int r12 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03ff }
            java.lang.String r0 = "receipt_device_jid_row_id"
            int r10 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03ff }
        L_0x03c7:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x03ff }
            if (r0 == 0) goto L_0x03f7
            long r0 = r11.getLong(r10)     // Catch:{ all -> 0x03ff }
            X.34p r13 = r5.A02     // Catch:{ all -> 0x03ff }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r9 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r1 = r13.A0B(r9, r0)     // Catch:{ all -> 0x03ff }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x03ff }
            if (r1 == 0) goto L_0x03c7
            int r0 = r1.getDevice()     // Catch:{ all -> 0x03ff }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ all -> 0x03ff }
            if (r0 == 0) goto L_0x03c7
            boolean r0 = r11.isNull(r12)     // Catch:{ all -> 0x03ff }
            if (r0 != 0) goto L_0x03c7
            com.whatsapp.jid.UserJid r9 = r1.userJid     // Catch:{ all -> 0x03ff }
            long r0 = r11.getLong(r12)     // Catch:{ all -> 0x03ff }
            X.AnonymousClass0x2.A1J(r9, r4, r0)     // Catch:{ all -> 0x03ff }
            goto L_0x03c7
        L_0x03f7:
            r11.close()     // Catch:{ all -> 0x040b }
            r14.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0490 }
            goto L_0x0494
        L_0x03ff:
            r1 = move-exception
            if (r11 == 0) goto L_0x040a
            r11.close()     // Catch:{ all -> 0x0406 }
            goto L_0x040a
        L_0x0406:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x040b }
        L_0x040a:
            throw r1     // Catch:{ all -> 0x040b }
        L_0x040b:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0410 }
            goto L_0x0414
        L_0x0410:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0490 }
        L_0x0414:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0490 }
        L_0x0415:
            X.1R2 r5 = (X.AnonymousClass1R2) r5     // Catch:{ Exception -> 0x053f }
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x053f }
            X.4uZ r1 = X.AnonymousClass2z0.A01(r9)     // Catch:{ Exception -> 0x053f }
            X.2sm r0 = r5.A00     // Catch:{ Exception -> 0x053f }
            long r0 = r0.A07(r1)     // Catch:{ Exception -> 0x053f }
            java.lang.String[] r10 = X.AnonymousClass0x9.A1a()     // Catch:{ Exception -> 0x053f }
            X.C18270x1.A1S(r10, r0)     // Catch:{ Exception -> 0x053f }
            java.lang.String r1 = X.AnonymousClass2z0.A08(r9)     // Catch:{ Exception -> 0x053f }
            r0 = 1
            r10[r0] = r1     // Catch:{ Exception -> 0x053f }
            r1 = 2
            java.lang.String r0 = r9.A01     // Catch:{ Exception -> 0x053f }
            r10[r1] = r0     // Catch:{ Exception -> 0x053f }
            X.3dV r0 = r5.A04     // Catch:{ Exception -> 0x053f }
            X.4GK r14 = r0.get()     // Catch:{ Exception -> 0x053f }
            r0 = r14
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0534 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x0534 }
            java.lang.String r1 = "SELECT receipt_device_jid_row_id, primary_device_version FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ?"
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/GET_PRIMARY_DEVICE_VERSIONS_SQL"
            android.database.Cursor r11 = r9.A0E(r1, r0, r10)     // Catch:{ all -> 0x0534 }
            java.lang.String r0 = "primary_device_version"
            int r12 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0528 }
            java.lang.String r0 = "receipt_device_jid_row_id"
            int r10 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0528 }
        L_0x0459:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0528 }
            if (r0 == 0) goto L_0x0489
            long r0 = r11.getLong(r10)     // Catch:{ all -> 0x0528 }
            X.34p r13 = r5.A02     // Catch:{ all -> 0x0528 }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r9 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r1 = r13.A0B(r9, r0)     // Catch:{ all -> 0x0528 }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x0528 }
            if (r1 == 0) goto L_0x0459
            int r0 = r1.getDevice()     // Catch:{ all -> 0x0528 }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ all -> 0x0528 }
            if (r0 == 0) goto L_0x0459
            boolean r0 = r11.isNull(r12)     // Catch:{ all -> 0x0528 }
            if (r0 != 0) goto L_0x0459
            com.whatsapp.jid.UserJid r9 = r1.userJid     // Catch:{ all -> 0x0528 }
            long r0 = r11.getLong(r12)     // Catch:{ all -> 0x0528 }
            X.AnonymousClass0x2.A1J(r9, r4, r0)     // Catch:{ all -> 0x0528 }
            goto L_0x0459
        L_0x0489:
            r11.close()     // Catch:{ all -> 0x0534 }
            r14.close()     // Catch:{ Exception -> 0x053f }
            goto L_0x0494
        L_0x0490:
            r0 = move-exception
            X.C55272q5.A00(r5, r0)     // Catch:{ Exception -> 0x053f }
        L_0x0494:
            java.util.HashSet r5 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x053f }
            java.util.Iterator r10 = r6.iterator()     // Catch:{ Exception -> 0x053f }
        L_0x049c:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x04ec
            com.whatsapp.jid.DeviceJid r9 = X.AnonymousClass0x7.A0R(r10)     // Catch:{ Exception -> 0x053f }
            boolean r0 = X.C57372tX.A00(r9)     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x04b2
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/filterInvalidDevices/dropping hosted jid"
        L_0x04ae:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x053f }
            goto L_0x049c
        L_0x04b2:
            com.whatsapp.jid.UserJid r6 = r9.userJid     // Catch:{ Exception -> 0x053f }
            java.lang.Object r1 = r8.get(r6)     // Catch:{ Exception -> 0x053f }
            java.lang.Object r0 = r4.get(r6)     // Catch:{ Exception -> 0x053f }
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)     // Catch:{ Exception -> 0x053f }
            if (r0 == 0) goto L_0x04c6
            r5.add(r9)     // Catch:{ Exception -> 0x053f }
            goto L_0x049c
        L_0x04c6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/filterInvalidDevices/dropping: "
            r1.append(r0)     // Catch:{ Exception -> 0x053f }
            r1.append(r9)     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = " currentVersion: "
            r1.append(r0)     // Catch:{ Exception -> 0x053f }
            java.lang.Object r0 = r8.get(r6)     // Catch:{ Exception -> 0x053f }
            r1.append(r0)     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = " versionsAtTimeOfMessageSend: "
            r1.append(r0)     // Catch:{ Exception -> 0x053f }
            java.lang.Object r0 = r4.get(r6)     // Catch:{ Exception -> 0x053f }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ Exception -> 0x053f }
            goto L_0x04ae
        L_0x04ec:
            r6 = r5
        L_0x04ed:
            boolean r0 = r6.isEmpty()     // Catch:{ Exception -> 0x053f }
            if (r0 != 0) goto L_0x0058
            X.3Lp r0 = r3.A0B     // Catch:{ Exception -> 0x053f }
            r0.A07(r7, r6)     // Catch:{ Exception -> 0x053f }
            X.2qB r0 = r3.A0C     // Catch:{ Exception -> 0x053f }
            r0.A04(r7, r6)     // Catch:{ Exception -> 0x053f }
            X.3dJ r12 = new X.3dJ     // Catch:{ Exception -> 0x053f }
            r12.<init>()     // Catch:{ Exception -> 0x053f }
            X.3Lj r11 = r3.A0G     // Catch:{ Exception -> 0x053f }
            long r4 = r3.expirationMs     // Catch:{ Exception -> 0x053f }
            long r0 = r3.startTimeMs     // Catch:{ Exception -> 0x053f }
            r10 = 0
            X.2sH r9 = r11.A08     // Catch:{ Exception -> 0x053f }
            X.2Tk r8 = new X.2Tk     // Catch:{ Exception -> 0x053f }
            r8.<init>(r9, r7)     // Catch:{ Exception -> 0x053f }
            r8.A07 = r2     // Catch:{ Exception -> 0x053f }
            r8.A06 = r2     // Catch:{ Exception -> 0x053f }
            r8.A05 = r6     // Catch:{ Exception -> 0x053f }
            r8.A02 = r4     // Catch:{ Exception -> 0x053f }
            r8.A00 = r0     // Catch:{ Exception -> 0x053f }
            X.2nu r0 = new X.2nu     // Catch:{ Exception -> 0x053f }
            r0.<init>(r8)     // Catch:{ Exception -> 0x053f }
            r11.A00(r0, r12, r10)     // Catch:{ Exception -> 0x053f }
            r12.get()     // Catch:{ Exception -> 0x053f }
            goto L_0x053e
        L_0x0526:
            return
        L_0x0527:
            return
        L_0x0528:
            r1 = move-exception
            if (r11 == 0) goto L_0x0533
            r11.close()     // Catch:{ all -> 0x052f }
            goto L_0x0533
        L_0x052f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0534 }
        L_0x0533:
            throw r1     // Catch:{ all -> 0x0534 }
        L_0x0534:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0539 }
            goto L_0x053d
        L_0x0539:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x053f }
        L_0x053d:
            throw r1     // Catch:{ Exception -> 0x053f }
        L_0x053e:
            return
        L_0x053f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/error, param="
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A1K(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob.A07():void");
    }

    public String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; key=");
        A0o.append(this.A0H);
        A0o.append("; timeoutMs=");
        A0o.append(this.expirationMs);
        A0o.append("; rawJids=");
        A0o.append(this.A0K);
        A0o.append("; offlineInProgressDuringMessageSend=");
        return AnonymousClass000.A0R(this.A0J, A0o);
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A08 = A002.Bqh();
        this.A0F = C64333Db.A4B(A002);
        this.A01 = A002.Azq();
        this.A02 = A002.BL4();
        this.A09 = C64333Db.A39(A002);
        this.A03 = (AnonymousClass36E) A002.ALM.get();
        this.A0I = C64333Db.A8F(A002);
        this.A06 = (C64213Cp) A002.A8E.get();
        this.A04 = (C64223Cq) A002.A6b.get();
        this.A0G = (C66423Lj) A002.AUX.get();
        this.A0D = (C620333f) A002.AKQ.get();
        this.A0C = (C55332qB) A002.ATK.get();
        this.A05 = (C49422gV) A002.A8D.get();
        this.A0A = C64333Db.A3G(A002);
        this.A0E = (C52382lO) A002.ARF.get();
        this.A0B = (C66483Lp) A002.AL5.get();
        this.A07 = (C43542Sn) A002.AcK.A00.A51.get();
        this.A05.A01(this.A0H);
    }
}
