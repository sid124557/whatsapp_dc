package X;

import android.os.Message;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3Qm  reason: invalid class name and case insensitive filesystem */
public abstract class C67743Qm implements AnonymousClass4DA {
    public final C55682qk A00;
    public final AnonymousClass31C A01;
    public final C55892r5 A02;
    public final C72173dI A03;
    public final Set A04 = AnonymousClass002.A0K();
    public final AtomicReference A05 = new AtomicReference();
    public final boolean A06;
    public final int[] A07;

    public final boolean BFA(Message message, int i) {
        int i2;
        boolean z;
        int[] iArr = this.A07;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            i2 = i;
            if (i3 >= length) {
                z = false;
                break;
            } else if (i == iArr[i3]) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        if (!z) {
            return false;
        }
        Object obj = message.obj;
        C626936e.A06(obj);
        AnonymousClass36K r5 = (AnonymousClass36K) obj;
        Parcelable parcelable = message.getData().getParcelable("stanzaKey");
        C626936e.A06(parcelable);
        AnonymousClass39T r6 = (AnonymousClass39T) parcelable;
        AnonymousClass1gR A002 = C55892r5.A00(this.A02, r6);
        if (A002 != null) {
            AnonymousClass36K A0k = r5.A0k(0);
            if (A0k != null) {
                A002.A00 = A0k.A00;
            }
            A002.A03(3);
        }
        if (this.A06) {
            C72173dI r0 = this.A03;
            C626936e.A06(r0);
            r0.execute(new C71433c6(this, r5, r6, i2, 29));
            return true;
        }
        A02(r5, r6, i);
        return true;
    }

    public final AnonymousClass39T A01() {
        Object andSet = this.A05.getAndSet((Object) null);
        C626936e.A06(andSet);
        AnonymousClass39T r1 = (AnonymousClass39T) andSet;
        this.A04.add(r1);
        return r1;
    }

    public final void A02(AnonymousClass36K r7, AnonymousClass39T r8, int i) {
        AtomicReference atomicReference = this.A05;
        C626936e.A0C(AnonymousClass000.A1X(atomicReference.getAndSet(r8)));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BaseNotificationHandler/handleAndAckNotification id=");
        A0o.append(r7.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null));
        A0o.append(" type=");
        A0o.append(AnonymousClass36K.A0K(r7));
        A0o.append(" t=");
        A0o.append(r7.A0r("t", (String) null));
        A0o.append(" retry=");
        A0o.append(r7.A0r("retry", (String) null));
        A0o.append(" offline=");
        C18260x0.A1L(A0o, r7.A0r("offline", (String) null));
        try {
            A05(r7, i);
        } catch (AnonymousClass24Y e) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("BaseNotificationHandler/handleAndAckNotification/corrupt-stream-error/stanza ");
            A0o2.append(e.bufString);
            C18260x0.A1S(A0o2, " node:", r7);
            C55682qk r2 = this.A00;
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("source=BaseNotificationHandler recvType=");
            A0o3.append(i);
            r2.A0A("CorruptStreamException", false, AnonymousClass000.A0a(" message=", A0o3, e));
        }
        AnonymousClass39T r1 = (AnonymousClass39T) atomicReference.getAndSet((Object) null);
        if (r1 != null && !this.A04.contains(r1)) {
            this.A01.A0H(r1);
        }
    }

    public final void A03(AnonymousClass39T r2) {
        this.A04.remove(r2);
        this.A01.A0H(r2);
    }

    public final void A04(AnonymousClass39T r4) {
        this.A04.remove(r4);
        C50412i8 A022 = r4.A02();
        A022.A02("error", "487");
        this.A01.A0H(A022.A01());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0669, code lost:
        if ("true".equals(r4.A0q("from_me")) == false) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x08bc, code lost:
        if (r1 != null) goto L_0x08be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x08cb  */
    /* JADX WARNING: Removed duplicated region for block: B:502:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0 instanceof X.AnonymousClass1gE
            r12 = r21
            r2 = r22
            if (r1 == 0) goto L_0x00f2
            X.1gE r0 = (X.AnonymousClass1gE) r0
            r3 = 1
            X.C162457s7.A0J(r12, r3)
            r1 = 260(0x104, float:3.64E-43)
            if (r2 != r1) goto L_0x00a0
            r4 = 0
            java.lang.String r1 = "notification"
            java.lang.String[] r17 = X.AnonymousClass36K.A0Z(r12, r1)
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r5 = 0
            java.lang.String r16 = "username"
            java.lang.Long r14 = X.AnonymousClass0x2.A0R()
            java.lang.Long r15 = X.AnonymousClass0x2.A0S()
            r18 = r5
            X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String[] r17 = X.AnonymousClass0x9.A1b()
            java.lang.Class<com.whatsapp.jid.UserJid> r13 = com.whatsapp.jid.UserJid.class
            r16 = r4
            java.lang.Object r6 = X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            r1 = 119(0x77, float:1.67E-43)
            X.4Jp r2 = X.C86304Jp.A00(r1)
            java.lang.String[] r1 = new java.lang.String[r5]
            X.C626836d.A04(r12, r2, r1)
            r1 = 3
            X.4B7[] r7 = new X.AnonymousClass4B7[r1]
            r1 = 120(0x78, float:1.68E-43)
            X.4Jp r1 = X.C86304Jp.A00(r1)
            r7[r5] = r1
            r1 = 121(0x79, float:1.7E-43)
            X.4Jp r1 = X.C86304Jp.A00(r1)
            r7[r3] = r1
            r1 = 122(0x7a, float:1.71E-43)
            X.4Jp r2 = X.C86304Jp.A00(r1)
            r1 = 2
            r7[r1] = r2
            java.util.ArrayList r7 = X.AnonymousClass0x2.A0i(r7)
            java.lang.String r1 = "set"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            java.lang.String r1 = "Set|SetHash|Deleted"
            java.lang.Object r8 = X.C626836d.A07(r12, r1, r7, r2)
            X.8k6 r8 = (X.C180028k6) r8
            X.C162457s7.A0D(r8)
            boolean r7 = r8 instanceof X.C35181wS
            if (r7 == 0) goto L_0x00af
            r2 = r8
            X.1wS r2 = (X.C35181wS) r2
            int r1 = r2.A01
            if (r1 != r3) goto L_0x00af
            X.C162457s7.A0D(r6)
            java.lang.String r3 = r2.A00
            X.C162457s7.A0D(r3)
        L_0x008d:
            boolean r1 = r6 instanceof X.C27981fH
            if (r1 == 0) goto L_0x00a1
            r1 = r6
            X.1fU r1 = (X.AnonymousClass1fU) r1
        L_0x0094:
            if (r1 == 0) goto L_0x090d
            X.2q8 r0 = r0.A01
            r0.A04(r1, r3)
            if (r4 == 0) goto L_0x00a0
            r0.A03(r1, r4)
        L_0x00a0:
            return
        L_0x00a1:
            boolean r1 = r6 instanceof com.whatsapp.jid.PhoneUserJid
            if (r1 == 0) goto L_0x090d
            X.2sM r2 = r0.A02
            r1 = r6
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            X.1fH r1 = r2.A01(r1)
            goto L_0x0094
        L_0x00af:
            boolean r1 = r8 instanceof X.C35171wR
            if (r1 == 0) goto L_0x00bf
            X.C162457s7.A0D(r6)
            X.1wR r8 = (X.C35171wR) r8
            X.1vr r1 = r8.A00
            java.lang.String r4 = r1.A00
            java.lang.String r3 = ""
            goto L_0x008d
        L_0x00bf:
            if (r7 == 0) goto L_0x00a0
            X.1wS r8 = (X.C35181wS) r8
            int r1 = r8.A01
            if (r1 != r5) goto L_0x00a0
            java.lang.String r2 = r8.A00
            X.C162457s7.A0D(r2)
            int r1 = r2.length()
            if (r1 == 0) goto L_0x00a0
            byte[] r1 = X.AnonymousClass0x2.A1a(r2)
            byte[] r4 = android.util.Base64.decode(r1, r5)
            X.C162457s7.A0D(r4)
            X.227 r1 = X.AnonymousClass227.A0J
            X.2zU r2 = new X.2zU
            r2.<init>(r1)
            r2.A02 = r3
            X.2xW r1 = X.C59812xW.A0L
            X.2zz r1 = X.C60982zU.A00(r2, r1, r4)
            X.3Cq r0 = r0.A00
            r0.A03(r1, r3)
            return
        L_0x00f2:
            boolean r1 = r0 instanceof X.AnonymousClass1gD
            if (r1 == 0) goto L_0x01c2
            X.1gD r0 = (X.AnonymousClass1gD) r0
            r1 = 1
            X.C162457s7.A0J(r12, r1)
            r1 = 236(0xec, float:3.31E-43)
            if (r2 != r1) goto L_0x00a0
            X.36K r5 = X.AnonymousClass36K.A0D(r12)
            if (r5 == 0) goto L_0x00a0
            java.lang.Class<com.whatsapp.jid.Jid> r2 = com.whatsapp.jid.Jid.class
            java.lang.String r1 = "from"
            com.whatsapp.jid.Jid r4 = r12.A0g(r2, r1)
            java.lang.String r1 = "set"
            boolean r1 = X.AnonymousClass36K.A0W(r5, r1)
            if (r1 == 0) goto L_0x019b
            java.lang.String r1 = "hash"
            r2 = 0
            java.lang.String r3 = r5.A0r(r1, r2)
            if (r3 == 0) goto L_0x0158
            X.2xW r4 = X.C59812xW.A0O
            X.C162457s7.A0F(r4)
            r2 = 0
            int r1 = r3.length()
            if (r1 == 0) goto L_0x00a0
            byte[] r1 = X.AnonymousClass0x2.A1a(r3)
            byte[] r3 = android.util.Base64.decode(r1, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "connection/handleSidelistNotification"
            r2.append(r1)
            java.lang.String r1 = java.util.Arrays.toString(r3)
            X.C18260x0.A1J(r2, r1)
            X.227 r2 = X.AnonymousClass227.A0J
            X.2zU r1 = new X.2zU
            r1.<init>(r2)
            r2 = 1
            r1.A02 = r2
            X.2zz r1 = X.C60982zU.A00(r1, r4, r3)
            X.3Cq r0 = r0.A01
            r0.A03(r1, r2)
            return
        L_0x0158:
            java.lang.String r6 = r5.A0n()
            java.lang.String r1 = "t"
            java.lang.String r1 = r12.A0r(r1, r2)
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A03(r4)
            if (r1 == 0) goto L_0x00a0
            if (r5 == 0) goto L_0x00a0
            long r3 = java.lang.Long.parseLong(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            java.util.ArrayList r2 = X.C18300x5.A0s(r5)
            boolean r1 = X.C627336j.A0L(r5)
            if (r1 == 0) goto L_0x0187
            X.2sM r1 = r0.A02
            com.whatsapp.jid.PhoneUserJid r1 = X.C56662sM.A00(r1, r5)
            if (r1 == 0) goto L_0x0187
            r2.add(r1)
        L_0x0187:
            java.util.Iterator r5 = r2.iterator()
        L_0x018b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00a0
            com.whatsapp.jid.UserJid r2 = X.C18310x6.A0T(r5)
            X.3Ex r1 = r0.A00
            r1.A0Y(r2, r6, r3)
            goto L_0x018b
        L_0x019b:
            java.lang.String r1 = "delete"
            boolean r1 = X.AnonymousClass36K.A0W(r5, r1)
            if (r1 == 0) goto L_0x00a0
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A03(r4)
            if (r5 == 0) goto L_0x00a0
            X.3Ex r4 = r0.A00
            X.1vC r3 = r4.A05
            r1 = 0
            r0 = 0
            r3.A0Q(r5, r0, r1)
            X.C48452ev.A00(r4, r5)
            android.os.Handler r2 = r4.A01
            r1 = 0
            X.3a7 r0 = new X.3a7
            r0.<init>(r4, r1, r5)
            r2.post(r0)
            return
        L_0x01c2:
            boolean r1 = r0 instanceof X.AnonymousClass1gH
            if (r1 == 0) goto L_0x026d
            X.1gH r0 = (X.AnonymousClass1gH) r0
            r1 = 238(0xee, float:3.34E-43)
            if (r2 != r1) goto L_0x00a0
            X.36K r3 = X.AnonymousClass36K.A0D(r12)
            if (r3 == 0) goto L_0x00a0
            java.lang.String r1 = "creation"
            long r10 = X.AnonymousClass36K.A05(r3, r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r1
            byte[] r9 = r3.A01
            X.2sH r1 = r0.A01
            long r12 = X.C56612sH.A05(r1, r3)
            java.lang.String r1 = "report_type"
            java.lang.String r2 = X.AnonymousClass36K.A0L(r3, r1)
            if (r2 == 0) goto L_0x026a
            java.lang.String r1 = "newsletters"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x026a
            X.8qC r1 = r0.A04
        L_0x01f7:
            java.lang.Object r8 = r1.get()
            X.3Lm r8 = (X.C66453Lm) r8
            r8.A0B(r9, r10, r12)
            X.3Wi r4 = r0.A00
            X.4FU r1 = r4.A00
            boolean r1 = r1 instanceof X.C84894Ed
            if (r1 != 0) goto L_0x025a
            boolean r1 = r8 instanceof X.C32301q8
            if (r1 == 0) goto L_0x0266
            r2 = 2131891061(0x7f121375, float:1.9416831E38)
        L_0x020f:
            java.lang.String r1 = "gdpr/notify-report-available"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2oU r7 = r8.A07
            android.content.Context r6 = r7.A00
            X.C162457s7.A0D(r6)
            java.lang.String r3 = X.C18290x4.A0l(r6, r2)
            X.0Ue r5 = X.C66553Lw.A00(r6)
            r5.A0C(r3)
            X.AnonymousClass0x7.A17(r5)
            r1 = 1
            r5.A0E(r1)
            r2 = 2131895980(0x7f1226ac, float:1.9426808E38)
            android.content.res.Resources r1 = X.C54292oU.A00(r7)
            java.lang.String r1 = r1.getString(r2)
            r5.A0B(r1)
            r5.A0A(r3)
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r1 = "com.whatsapp.report.ReportActivity"
            r3.setClassName(r2, r1)
            r1 = 0
            android.app.PendingIntent r1 = X.C624735e.A00(r6, r1, r3, r1)
            X.AnonymousClass33T.A01(r1, r5)
            X.33T r2 = r8.A08
            r1 = 16
            X.AnonymousClass33T.A03(r5, r2, r1)
        L_0x025a:
            X.1nF r2 = r8.A02()
            if (r2 == 0) goto L_0x00a0
            r1 = 22
            X.C69263Wi.A05(r4, r0, r2, r1)
            return
        L_0x0266:
            r2 = 2131889533(0x7f120d7d, float:1.9413732E38)
            goto L_0x020f
        L_0x026a:
            X.8qC r1 = r0.A03
            goto L_0x01f7
        L_0x026d:
            boolean r1 = r0 instanceof X.AnonymousClass1gC
            if (r1 == 0) goto L_0x02be
            X.1gC r0 = (X.AnonymousClass1gC) r0
            r1 = 251(0xfb, float:3.52E-43)
            if (r2 != r1) goto L_0x00a0
            X.36K r5 = r12.A0j()
            java.lang.String r1 = "device_logout"
            boolean r1 = X.AnonymousClass36K.A0W(r5, r1)
            if (r1 == 0) goto L_0x0922
            java.lang.String r1 = "t"
            long r2 = X.AnonymousClass36K.A04(r5, r1)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            java.lang.String r1 = "id"
            java.lang.String r7 = r5.A0q(r1)
            java.lang.String r1 = "device"
            java.lang.String r6 = X.AnonymousClass36K.A0L(r5, r1)
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0917
            X.2fb r4 = new X.2fb
            r4.<init>(r2, r6, r7)
            X.317 r3 = r0.A02
            X.1VX r2 = r3.A0m
            r1 = 2466(0x9a2, float:3.456E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00a0
            X.3Wi r2 = r3.A0H
            r1 = 7
            X.3a1 r0 = new X.3a1
            r0.<init>(r3, r1, r4)
            r2.BkS(r0)
            return
        L_0x02be:
            boolean r1 = r0 instanceof X.AnonymousClass1gG
            if (r1 == 0) goto L_0x035a
            X.1gG r0 = (X.AnonymousClass1gG) r0
            r1 = 235(0xeb, float:3.3E-43)
            if (r2 != r1) goto L_0x00a0
            X.36K r2 = X.AnonymousClass36K.A0D(r12)
            if (r2 == 0) goto L_0x00a0
            java.lang.String r1 = "log"
            boolean r1 = X.AnonymousClass36K.A0W(r2, r1)
            if (r1 == 0) goto L_0x0302
            X.34j r3 = r0.A03
            r3.A07()
            X.2oU r1 = r0.A00
            android.content.Context r4 = r1.A00
            java.lang.String r7 = ""
            r5 = 0
            r2 = 1
            java.lang.String r10 = "NotCalculated"
            r14 = -1
            r19 = 0
            r8 = r5
            r9 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r6 = r5
            r16 = r14
            r18 = r2
            java.lang.String r1 = r3.A04(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2qk r1 = r0.A00
            java.lang.String r0 = "AppMessagingXmppHandler/onLogNotification"
            r1.A0A(r0, r2, r5)
            return
        L_0x0302:
            java.lang.String r1 = "props"
            boolean r1 = X.AnonymousClass36K.A0W(r2, r1)
            if (r1 == 0) goto L_0x0312
            X.33S r1 = r0.A02
            r0 = 1
            r1.A05(r0)
            return
        L_0x0312:
            java.lang.String r1 = "abprops"
            boolean r1 = X.AnonymousClass36K.A0W(r2, r1)
            if (r1 == 0) goto L_0x0335
            X.2YT r2 = r0.A01
            r1 = 1
            X.1im r0 = r2.A00
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "sendmethods/sendGetABProps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4C1 r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.2bo r0 = (X.C46542bo) r0
            r0.A00(r1)
            return
        L_0x0335:
            java.lang.String r1 = "push-config"
            boolean r1 = X.AnonymousClass36K.A0W(r2, r1)
            if (r1 == 0) goto L_0x00a0
            java.lang.String r1 = "type"
            java.lang.String r2 = X.AnonymousClass36K.A0L(r2, r1)
            if (r2 == 0) goto L_0x09da
            java.lang.String r1 = "gcm"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x09da
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "push-config notification: unknown type "
            X.C18260x0.A0s(r0, r2, r1)
            return
        L_0x035a:
            boolean r1 = r0 instanceof X.AnonymousClass1gM
            if (r1 == 0) goto L_0x0399
            X.1gM r0 = (X.AnonymousClass1gM) r0
            r1 = 241(0xf1, float:3.38E-43)
            if (r2 != r1) goto L_0x00a0
            X.36K r5 = X.AnonymousClass36K.A0D(r12)
            if (r5 == 0) goto L_0x00a0
            X.39T r4 = r0.A01()
            X.2r5 r1 = r0.A07
            X.1gR r2 = X.C55892r5.A00(r1, r4)
            if (r2 == 0) goto L_0x037a
            java.lang.String r1 = r5.A00
            r2.A00 = r1
        L_0x037a:
            java.lang.String r1 = "count"
            boolean r1 = X.AnonymousClass36K.A0W(r5, r1)
            if (r1 == 0) goto L_0x0a05
            java.lang.String r1 = "value"
            int r5 = X.AnonymousClass36K.A02(r5, r1)
            X.33n r1 = r0.A03
            boolean r1 = r1.A0X()
            if (r1 == 0) goto L_0x09f8
            X.4FS r2 = r0.A0A
            r1 = 13
            X.C71713cY.A00(r2, r0, r4, r5, r1)
            return
        L_0x0399:
            boolean r1 = r0 instanceof X.AnonymousClass1gJ
            if (r1 == 0) goto L_0x04ca
            X.1gJ r0 = (X.AnonymousClass1gJ) r0
            r4 = 1
            X.C162457s7.A0J(r12, r4)
            r1 = 253(0xfd, float:3.55E-43)
            if (r2 == r1) goto L_0x03b5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AvatarUpdateNotificationHandler/invalid notification type: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
        L_0x03b1:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x03b5:
            java.lang.String r6 = "type"
            X.39V r7 = r12.A0i(r6)
            r1 = 0
            if (r7 == 0) goto L_0x03db
            java.lang.String r3 = r7.A03
        L_0x03c1:
            java.lang.String r5 = "avatars:update"
            boolean r3 = X.C162457s7.A0P(r3, r5)
            if (r3 != 0) goto L_0x03dd
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AvatarUpdateNotificationHandler/invalid type: "
            r2.append(r0)
            if (r7 == 0) goto L_0x03d6
            java.lang.String r1 = r7.A03
        L_0x03d6:
            java.lang.String r0 = X.AnonymousClass000.A0X(r1, r2)
            goto L_0x03b1
        L_0x03db:
            r3 = r1
            goto L_0x03c1
        L_0x03dd:
            X.2gs r3 = r0.A02
            boolean r3 = r3.A01()
            if (r3 != 0) goto L_0x03fd
            java.lang.String r1 = "AvatarUpdateNotificationHandler/received avatar update notification but user has no avatar"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.2r2 r3 = r0.A05
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "notificationType="
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r2)
            java.lang.String r0 = "avatar_notification_received_user_has_no_avatar"
            r3.A02(r4, r0, r1)
            return
        L_0x03fd:
            java.lang.String r2 = "notification"
            X.AnonymousClass36K.A0N(r12, r2)     // Catch:{ all -> 0x04b9 }
            java.lang.String[] r17 = X.AnonymousClass0x9.A1b()     // Catch:{ all -> 0x04b9 }
            java.lang.Class<X.6kI> r13 = X.C135206kI.class
            r4 = 0
            X.6kI r16 = X.C135206kI.A00     // Catch:{ all -> 0x04b9 }
            java.lang.Long r14 = X.AnonymousClass0x2.A0R()     // Catch:{ all -> 0x04b9 }
            java.lang.Long r15 = X.AnonymousClass0x2.A0S()     // Catch:{ all -> 0x04b9 }
            r18 = r4
            X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x04b9 }
            java.lang.String[] r17 = new java.lang.String[]{r6}     // Catch:{ all -> 0x04b9 }
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r16 = r5
            X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x04b9 }
            java.lang.String r2 = "to"
            java.lang.String[] r10 = new java.lang.String[]{r2}     // Catch:{ all -> 0x04b9 }
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            r5 = r12
            r7 = r14
            r8 = r15
            r9 = r1
            r11 = r4
            X.C626836d.A05(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x04b9 }
            X.4Jp r3 = X.C86304Jp.A00(r4)     // Catch:{ all -> 0x04b9 }
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ all -> 0x04b9 }
            X.C626836d.A04(r12, r3, r2)     // Catch:{ all -> 0x04b9 }
            java.lang.String r2 = "revision"
            java.lang.String[] r3 = new java.lang.String[]{r2}     // Catch:{ all -> 0x04b9 }
            r2 = 1
            java.lang.Object r4 = X.C626836d.A08(r12, r3, r2)     // Catch:{ all -> 0x04b9 }
            X.6qj r4 = (X.C138626qj) r4     // Catch:{ all -> 0x04b9 }
            java.lang.String r2 = "event_type"
            java.lang.String[] r3 = new java.lang.String[]{r2}     // Catch:{ all -> 0x04b9 }
            r2 = 2
            java.lang.Object r3 = X.C626836d.A08(r12, r3, r2)     // Catch:{ all -> 0x04b9 }
            X.6qj r3 = (X.C138626qj) r3     // Catch:{ all -> 0x04b9 }
            java.lang.String r2 = "artifact"
            java.lang.String[] r14 = new java.lang.String[]{r2}     // Catch:{ all -> 0x04b9 }
            r2 = 3
            X.4Jp r13 = X.C86304Jp.A00(r2)     // Catch:{ all -> 0x04b9 }
            r15 = 0
            r17 = 10000(0x2710, double:4.9407E-320)
            X.C626836d.A0B(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x04b9 }
            if (r3 == 0) goto L_0x0475
            java.lang.Object r2 = r3.A00     // Catch:{ all -> 0x04b9 }
            X.1vq r2 = (X.C34801vq) r2     // Catch:{ all -> 0x04b9 }
            if (r2 == 0) goto L_0x0475
            java.lang.String r1 = r2.A00     // Catch:{ all -> 0x04b9 }
        L_0x0475:
            java.lang.String r2 = "revision_update"
            boolean r1 = X.C162457s7.A0P(r1, r2)     // Catch:{ all -> 0x04b9 }
            if (r1 == 0) goto L_0x04a9
            X.1VX r3 = r0.A01     // Catch:{ all -> 0x04b9 }
            r2 = 3275(0xccb, float:4.589E-42)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ all -> 0x04b9 }
            boolean r1 = r3.A0Y(r1, r2)     // Catch:{ all -> 0x04b9 }
            if (r1 == 0) goto L_0x04a9
            if (r4 != 0) goto L_0x048f
            java.lang.String r0 = "AvatarUpdateNotificationHandler/revision is null"
            goto L_0x04a6
        L_0x048f:
            java.lang.Object r1 = r4.A00     // Catch:{ all -> 0x04b9 }
            X.1vq r1 = (X.C34801vq) r1     // Catch:{ all -> 0x04b9 }
            java.lang.String r4 = r1.A00     // Catch:{ all -> 0x04b9 }
            X.C162457s7.A0D(r4)     // Catch:{ all -> 0x04b9 }
            X.2kc r1 = r0.A03     // Catch:{ all -> 0x04b9 }
            java.lang.String r1 = r1.A01()     // Catch:{ all -> 0x04b9 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x04b9 }
            if (r1 == 0) goto L_0x04ac
            java.lang.String r0 = "AvatarUpdateNotificationHandler/received notification for same revision, ignoring"
        L_0x04a6:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04b9 }
        L_0x04a9:
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x04b9 }
            goto L_0x04be
        L_0x04ac:
            X.3Wi r3 = r0.A00     // Catch:{ all -> 0x04b9 }
            r2 = 49
            X.3bv r1 = new X.3bv     // Catch:{ all -> 0x04b9 }
            r1.<init>(r2, r4, r0)     // Catch:{ all -> 0x04b9 }
            r3.A0S(r1)     // Catch:{ all -> 0x04b9 }
            goto L_0x04a9
        L_0x04b9:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x04be:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)
            if (r1 == 0) goto L_0x00a0
            java.lang.String r0 = "AvatarUpdateNotificationHandler/Unable to process avatar update notification."
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x04ca:
            boolean r1 = r0 instanceof X.AnonymousClass1gB
            if (r1 == 0) goto L_0x0576
            X.1gB r0 = (X.AnonymousClass1gB) r0
            r1 = 1
            X.C162457s7.A0J(r12, r1)
            r1 = 234(0xea, float:3.28E-43)
            if (r2 != r1) goto L_0x00a0
            java.util.LinkedHashSet r5 = X.AnonymousClass0x9.A17()
            java.lang.String r1 = "tokens"
            X.36K r2 = r12.A0m(r1)
            java.lang.String r1 = "token"
            java.util.List r1 = r2.A0s(r1)
            X.C162457s7.A0D(r1)
            java.util.Iterator r8 = r1.iterator()
        L_0x04f1:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x055d
            X.36K r7 = X.C18310x6.A0Y(r8)
            java.lang.String r1 = "type"
            java.lang.String r3 = r7.A0q(r1)
            int r2 = r3.hashCode()
            r1 = -1148920077(0xffffffffbb84def3, float:-0.004054898)
            if (r2 == r1) goto L_0x053f
            r1 = 1266415832(0x4b7bf8d8, float:1.651324E7)
            if (r2 != r1) goto L_0x04f1
            java.lang.String r1 = "trusted_contact"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x04f1
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r1 = "from"
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass36K.A0A(r12, r2, r1)
            if (r6 == 0) goto L_0x04f1
            byte[] r4 = r7.A01
            if (r4 == 0) goto L_0x0a7e
            java.lang.String r3 = "t"
            long r1 = X.AnonymousClass36K.A04(r12, r3)
            long r2 = r7.A0e(r3, r1)
            X.2sK r1 = r0.A01
            int r2 = r1.A01(r6, r4, r2)
            r1 = 2
            if (r2 == r1) goto L_0x04f1
            r5.add(r6)
            goto L_0x04f1
        L_0x053f:
            java.lang.String r1 = "trusted_contact_outgoing"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x04f1
            com.whatsapp.jid.Jid r4 = X.AnonymousClass36K.A06(r7)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            if (r4 == 0) goto L_0x04f1
            java.lang.String r1 = "t"
            long r2 = X.AnonymousClass36K.A04(r7, r1)
            X.2sK r1 = r0.A01
            r1.A0A(r4, r2)
            goto L_0x04f1
        L_0x055d:
            java.util.Iterator r4 = r5.iterator()
        L_0x0561:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r3 = r4.next()
            X.3Wi r2 = r0.A00
            r1 = 3
            X.3a0 r1 = X.C70133a0.A00(r0, r3, r1)
            r2.A0S(r1)
            goto L_0x0561
        L_0x0576:
            boolean r1 = r0 instanceof X.AnonymousClass1gQ
            if (r1 == 0) goto L_0x0644
            X.1gQ r0 = (X.AnonymousClass1gQ) r0
            r1 = 210(0xd2, float:2.94E-43)
            if (r2 != r1) goto L_0x00a0
            java.lang.String r1 = "notification"
            X.AnonymousClass36K.A0N(r12, r1)
            java.lang.String[] r17 = X.AnonymousClass0x9.A1b()
            java.lang.Class<X.6kI> r13 = X.C135206kI.class
            r2 = 0
            X.6kI r16 = X.C135206kI.A00
            java.lang.Long r14 = X.AnonymousClass0x2.A0R()
            java.lang.Long r15 = X.AnonymousClass0x2.A0S()
            r18 = r2
            X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r1 = "type"
            java.lang.String[] r17 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            java.lang.String r16 = "server_sync"
            X.C626836d.A06(r12, r13, r14, r15, r16, r17, r18)
            r1 = 114(0x72, float:1.6E-43)
            X.4Jp r1 = X.C86304Jp.A00(r1)
            java.lang.Object r5 = X.C626836d.A02(r12, r1, r2)
            X.56S r5 = (X.AnonymousClass56S) r5
            java.lang.String r1 = "collection"
            java.lang.String[] r14 = new java.lang.String[]{r1}
            r1 = 115(0x73, float:1.61E-43)
            X.4Jp r13 = X.C86304Jp.A00(r1)
            r15 = 1
            r17 = 20
            java.util.List r2 = X.C626836d.A0B(r12, r13, r14, r15, r17)
            java.lang.String r1 = "SyncdNotificationHandler/processNewPatchRequest"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.Iterator r7 = r2.iterator()
        L_0x05d8:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x060d
            java.lang.Object r1 = r7.next()
            X.1w8 r1 = (X.C34981w8) r1
            java.lang.String r6 = r1.A01
            java.lang.Object r2 = r1.A00
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x05d8
            r4.put(r6, r2)
            java.lang.Object r1 = r5.A00
            if (r1 == 0) goto L_0x05d8
            java.util.Map r3 = r0.A02
            boolean r1 = r3.containsKey(r6)
            if (r1 == 0) goto L_0x060a
            java.lang.Object r1 = X.C18320x8.A0Z(r3, r6)
            long r1 = X.C18310x6.A0B(r1)
        L_0x0605:
            long r1 = r1 + r15
            X.AnonymousClass0x2.A1K(r6, r3, r1)
            goto L_0x05d8
        L_0x060a:
            r1 = 0
            goto L_0x0605
        L_0x060d:
            X.3Gp r5 = r0.A00
            boolean r0 = r5.A0Q()
            if (r0 != 0) goto L_0x0624
            X.2q4 r0 = r5.A0S
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            int r1 = X.C18280x3.A02(r1, r0)
            r0 = 1
            if (r1 != r0) goto L_0x00a0
        L_0x0624:
            java.util.Iterator r4 = X.AnonymousClass001.A0u(r4)
        L_0x0628:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0a86
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r4)
            X.2ri r3 = r5.A0Y
            java.lang.String r2 = X.C18310x6.A0q(r0)
            java.lang.Object r0 = r0.getValue()
            long r0 = X.C18310x6.A0B(r0)
            r3.A04(r2, r0)
            goto L_0x0628
        L_0x0644:
            boolean r1 = r0 instanceof X.AnonymousClass1gF
            if (r1 == 0) goto L_0x07b1
            X.1gF r0 = (X.AnonymousClass1gF) r0
            r1 = 97
            if (r2 != r1) goto L_0x00a0
            java.lang.String r1 = "rmr"
            X.36K r4 = r12.A0l(r1)
            r7 = 0
            r6 = 1
            r11 = 0
            if (r4 == 0) goto L_0x066b
            r11 = 1
            java.lang.String r1 = "from_me"
            java.lang.String r2 = r4.A0q(r1)
            java.lang.String r1 = "true"
            boolean r1 = r1.equals(r2)
            r3 = 1
            if (r1 != 0) goto L_0x06d6
        L_0x066b:
            r3 = 0
            if (r11 != 0) goto L_0x06d6
            java.lang.Class<com.whatsapp.jid.Jid> r2 = com.whatsapp.jid.Jid.class
            java.lang.String r1 = "from"
            com.whatsapp.jid.Jid r1 = r12.A0h(r2, r1)
        L_0x0676:
            X.4uZ r2 = X.C627336j.A02(r1)
            java.lang.String r1 = "id"
            java.lang.String r9 = r12.A0q(r1)
            X.2z0 r2 = X.AnonymousClass2z0.A05(r2, r9, r3)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "media retry notification received; stanzaKeyId="
            r3.append(r1)
            r3.append(r9)
            java.lang.String r8 = "; key="
            X.C18260x0.A1R(r3, r8, r2)
            X.2qz r1 = r0.A03
            X.34x r5 = r1.A05(r2)
            boolean r1 = r5 instanceof X.C30471mV
            if (r1 == 0) goto L_0x00a0
            X.1mV r5 = (X.C30471mV) r5
            X.33C r4 = r5.A01
            if (r4 == 0) goto L_0x0a9c
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "media auto download re-enabled; stanzaKeyId="
            r3.append(r1)
            r3.append(r9)
            X.C18260x0.A1R(r3, r8, r2)
            java.lang.String r1 = "encrypt"
            X.36K r3 = r12.A0l(r1)
            java.lang.String r1 = "enc_p"
            r8 = 0
            if (r3 == 0) goto L_0x06d4
            X.36K r1 = r3.A0l(r1)
            if (r1 == 0) goto L_0x06d4
            byte[] r10 = r1.A01
        L_0x06c7:
            java.lang.String r1 = "enc_iv"
            if (r3 == 0) goto L_0x06df
            X.36K r1 = r3.A0l(r1)
            if (r1 == 0) goto L_0x06df
            byte[] r9 = r1.A01
            goto L_0x06e0
        L_0x06d4:
            r10 = r8
            goto L_0x06c7
        L_0x06d6:
            java.lang.Class<com.whatsapp.jid.Jid> r2 = com.whatsapp.jid.Jid.class
            java.lang.String r1 = "jid"
            com.whatsapp.jid.Jid r1 = r4.A0h(r2, r1)
            goto L_0x0676
        L_0x06df:
            r9 = r8
        L_0x06e0:
            java.lang.String r3 = r2.A01     // Catch:{ 6u5 -> 0x0a95 }
            byte[] r2 = r4.A0W     // Catch:{ 6u5 -> 0x0a95 }
            X.C626936e.A06(r2)     // Catch:{ 6u5 -> 0x0a95 }
            if (r10 == 0) goto L_0x0700
            if (r9 == 0) goto L_0x0700
            X.C18270x1.A10(r2, r6, r3)     // Catch:{ 6u5 -> 0x0a95 }
            X.C59432wu.A00(r2, r9)     // Catch:{ 6u5 -> 0x0a95 }
            r1 = 3
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOO(r1, r3, r10, r2, r9)     // Catch:{ 6u5 -> 0x0a95 }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ 6u5 -> 0x0a95 }
            if (r1 == 0) goto L_0x0a8a
            X.2v1 r8 = new X.2v1     // Catch:{ 6u5 -> 0x0a95 }
            r8.<init>(r1)     // Catch:{ 6u5 -> 0x0a95 }
            goto L_0x0702
        L_0x0700:
            r1 = 0
            goto L_0x0710
        L_0x0702:
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r3 = r8.A00
            r1 = 36
            long r1 = (long) r1
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r6, r1, r3)
            java.lang.String r1 = (java.lang.String) r1
        L_0x0710:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0718
            r4.A0G = r1
        L_0x0718:
            if (r8 == 0) goto L_0x07ae
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r8 = r8.A00
            r2 = 37
            long r2 = (long) r2
            long r2 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r6, r2, r8)
            int r8 = (int) r2
        L_0x0727:
            java.lang.String r2 = "error"
            X.36K r3 = r12.A0l(r2)
            if (r3 == 0) goto L_0x0735
            java.lang.String r2 = "code"
            int r8 = r3.A0b(r2, r7)
        L_0x0735:
            if (r11 == 0) goto L_0x07aa
            r2 = 2
            if (r8 == r2) goto L_0x073d
            r2 = 3
            if (r8 != r2) goto L_0x07aa
        L_0x073d:
            X.3Lv r2 = r0.A00
            r2.A0Y(r5)
            X.3XH r6 = r0.A01
            X.33d r4 = r6.A07
            X.33C r3 = r5.A01
            java.lang.String r2 = ", message.mediaHash="
            if (r3 != 0) goto L_0x0768
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download due to missing media data; message.key = "
        L_0x0752:
            X.C624134x.A0S(r5, r0, r1)
            r1.append(r2)
            java.lang.String r0 = r5.A04
            X.C18260x0.A1K(r1, r0)
            if (r7 == 0) goto L_0x00a0
            r6.A01(r5)
            java.lang.String r0 = "media retry notification; queue auto download"
        L_0x0764:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0768:
            boolean r0 = r3.A0c
            if (r0 != 0) goto L_0x0773
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; not transferring; message.key = "
            goto L_0x0752
        L_0x0773:
            X.2eP r0 = r4.A0P
            X.1I7 r3 = r0.A00(r3)
            if (r3 == 0) goto L_0x07a3
            if (r1 == 0) goto L_0x079b
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediadownload/replacing direct path with "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "; mediaHash="
            r2.append(r0)
            X.2dc r0 = r3.A0e
            java.lang.String r0 = r0.A0H
            X.C18260x0.A1J(r2, r0)
            X.2sk r2 = r3.A0d
            monitor-enter(r2)
            r2.A0G = r1     // Catch:{ all -> 0x0a92 }
            monitor-exit(r2)
        L_0x079b:
            java.util.concurrent.CountDownLatch r0 = r3.A0z
            r0.countDown()
            java.lang.String r0 = "media retry notification; resume reuploading download"
            goto L_0x0764
        L_0x07a3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; downloader not found; message.key = "
            goto L_0x0752
        L_0x07aa:
            r7 = 1
            r4.A0M = r6
            goto L_0x073d
        L_0x07ae:
            r8 = 1
            goto L_0x0727
        L_0x07b1:
            boolean r1 = r0 instanceof X.AnonymousClass1g8
            if (r1 == 0) goto L_0x0873
            X.1g8 r0 = (X.AnonymousClass1g8) r0
            r1 = 1
            X.C162457s7.A0J(r12, r1)
            java.lang.String r4 = "update"
            X.36K r2 = r12.A0l(r4)
            if (r2 == 0) goto L_0x0aad
            java.lang.String r1 = "op_name"
            java.lang.String r2 = X.AnonymousClass36K.A0L(r2, r1)
            if (r2 == 0) goto L_0x0aad
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0aad
            java.util.Locale r1 = java.util.Locale.US
            X.C162457s7.A0F(r1)
            java.lang.String r2 = X.C18320x8.A0g(r1, r2)
            X.66R r0 = r0.A01
            java.lang.Object r3 = X.C18280x3.A0V(r2, r0)
            X.2ib r3 = (X.C50682ib) r3
            if (r3 != 0) goto L_0x07f2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mexnotificationrouter/onhandlernotfound there was no MexNotificationJsonHandler registered to handle notifications for the key "
            X.24Y r0 = X.AnonymousClass24Y.A02(r0, r2, r1)
            throw r0
        L_0x07f2:
            X.36K r0 = r12.A0m(r4)
            java.lang.String r4 = r0.A0n()
            X.7Qs r1 = new X.7Qs
            r1.<init>()
            boolean r0 = r3 instanceof X.C27961ey
            if (r0 == 0) goto L_0x0831
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl> r2 = com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl.class
        L_0x0805:
            java.lang.Object r1 = r1.A00(r4, r2)
            boolean r0 = r1 instanceof X.AnonymousClass3Z0
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0815
            r0 = r1
            X.1eo r0 = (X.C27871eo) r0
            r3.A00(r0)
        L_0x0815:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r1)
            if (r0 == 0) goto L_0x00a0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "basemexnotificationhandler/handlenotificationjson failed to transform notification into expected type "
            r1.append(r0)
            java.lang.String r0 = r2.getName()
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0831:
            boolean r0 = r3 instanceof X.C27941ev
            if (r0 == 0) goto L_0x0838
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationSideSubResponseImpl> r2 = com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationSideSubResponseImpl.class
            goto L_0x0805
        L_0x0838:
            boolean r0 = r3 instanceof X.AnonymousClass1ex
            if (r0 == 0) goto L_0x083f
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.class
            goto L_0x0805
        L_0x083f:
            boolean r0 = r3 instanceof X.C27921et
            if (r0 == 0) goto L_0x0846
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterMuteChangeResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterMuteChangeResponseImpl.class
            goto L_0x0805
        L_0x0846:
            boolean r0 = r3 instanceof X.C27951ew
            if (r0 == 0) goto L_0x084d
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl.class
            goto L_0x0805
        L_0x084d:
            boolean r0 = r3 instanceof X.C27911es
            if (r0 == 0) goto L_0x0854
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterLeaveResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterLeaveResponseImpl.class
            goto L_0x0805
        L_0x0854:
            boolean r0 = r3 instanceof X.C27901er
            if (r0 == 0) goto L_0x085b
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl.class
            goto L_0x0805
        L_0x085b:
            boolean r0 = r3 instanceof X.C27891eq
            if (r0 == 0) goto L_0x0862
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.class
            goto L_0x0805
        L_0x0862:
            boolean r0 = r3 instanceof X.C27881ep
            if (r0 == 0) goto L_0x0869
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.class
            goto L_0x0805
        L_0x0869:
            boolean r0 = r3 instanceof X.C27931eu
            if (r0 == 0) goto L_0x0870
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl.class
            goto L_0x0805
        L_0x0870:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.class
            goto L_0x0805
        L_0x0873:
            boolean r1 = r0 instanceof X.AnonymousClass1gA
            if (r1 == 0) goto L_0x08ef
            X.1gA r0 = (X.AnonymousClass1gA) r0
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r1 = "from"
            com.whatsapp.jid.Jid r4 = r12.A0h(r2, r1)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.String r1 = "t"
            long r13 = X.AnonymousClass36K.A05(r12, r1)
            java.lang.String r1 = "disappearing_mode"
            X.36K r2 = r12.A0l(r1)
            X.C626936e.A06(r2)
            java.lang.String r1 = "duration"
            int r5 = X.AnonymousClass36K.A01(r2, r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            boolean r1 = X.C627336j.A0L(r4)
            X.3Ex r2 = r0.A02
            if (r1 == 0) goto L_0x08ea
            X.3ZH r1 = r2.A07(r4)
            if (r1 == 0) goto L_0x08ae
            r3.add(r1)
        L_0x08ae:
            X.1fH r4 = (X.C27981fH) r4
            X.2sM r1 = r2.A0G
            com.whatsapp.jid.PhoneUserJid r1 = r1.A02(r4)
            if (r1 == 0) goto L_0x08c1
            X.3ZH r1 = r2.A07(r1)
            if (r1 == 0) goto L_0x08c1
        L_0x08be:
            r3.add(r1)
        L_0x08c1:
            java.util.Iterator r4 = r3.iterator()
        L_0x08c5:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00a0
            X.3ZH r3 = X.C18310x6.A0R(r4)
            X.4uZ r1 = r3.A0H
            com.whatsapp.jid.UserJid r11 = X.AnonymousClass32Y.A03(r1)
            if (r11 == 0) goto L_0x08c5
            int r1 = r3.A01
            if (r1 == r5) goto L_0x08c5
            X.2el r2 = r0.A01
            X.3ae r1 = new X.3ae
            r8 = r1
            r9 = r3
            r10 = r0
            r12 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r2.A01(r1)
            goto L_0x08c5
        L_0x08ea:
            X.3ZH r1 = r2.A0A(r4)
            goto L_0x08be
        L_0x08ef:
            X.1g9 r0 = (X.AnonymousClass1g9) r0
            r1 = 248(0xf8, float:3.48E-43)
            if (r2 != r1) goto L_0x00a0
            X.31B r2 = r0.A00
            r1 = 5
            r2.A0C(r1)
            X.1VX r3 = r0.A02
            r2 = 1689(0x699, float:2.367E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r3.A0Y(r1, r2)
            if (r1 == 0) goto L_0x00a0
            X.2ZJ r0 = r0.A01
            r0.A00()
            return
        L_0x090d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UsernameChangeNotificationHandler/updateUsernameForJid no LID for "
            X.C18260x0.A1P(r1, r0, r6)
            return
        L_0x0917:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Logout ID is empty for tag: "
            X.24Y r0 = X.AnonymousClass24Y.A00(r5, r0, r1)
            throw r0
        L_0x0922:
            java.lang.String r1 = "wa_old_registration"
            boolean r1 = X.AnonymousClass36K.A0W(r5, r1)
            if (r1 == 0) goto L_0x09cb
            java.lang.String r1 = "code"
            java.lang.String r7 = X.AnonymousClass36K.A0L(r5, r1)
            java.lang.String r1 = "expiry_t"
            int r2 = X.AnonymousClass36K.A01(r5, r1)
            X.33p r6 = r0.A01
            java.lang.String r1 = r6.A0Y()
            byte[] r1 = X.AnonymousClass36l.A0T(r1)
            java.lang.String r10 = X.AnonymousClass0x7.A0s(r1)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = (long) r2
            long r3 = r3.toMillis(r1)
            if (r7 == 0) goto L_0x098c
            X.2sH r1 = r0.A00
            long r8 = r1.A0H()
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x098c
            if (r10 == 0) goto L_0x098c
            java.lang.String r2 = "device_id"
            java.lang.String r1 = ""
            java.lang.String r1 = r5.A0r(r2, r1)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x098c
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r6)
            java.lang.String r1 = "device_switching_code"
            X.C18270x1.A0j(r2, r1, r7)
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r6)
            java.lang.String r1 = "device_switching_code_expiry"
            X.C18270x1.A0i(r2, r1, r3)
            X.317 r5 = r0.A02
            X.2oU r1 = r5.A0a
            android.content.Context r4 = r1.A00
            X.3Wi r3 = r5.A0H
            r2 = 11
            X.3c3 r1 = new X.3c3
            r1.<init>(r5, r4, r7, r2)
            r3.BkS(r1)
        L_0x098c:
            X.39T r2 = r0.A01()
            java.lang.String r1 = r6.A0Y()
            byte[] r1 = X.AnonymousClass36l.A0T(r1)
            java.lang.String r4 = X.AnonymousClass0x7.A0s(r1)
            if (r4 != 0) goto L_0x09a0
            java.lang.String r4 = ""
        L_0x09a0:
            X.2i8 r3 = new X.2i8
            r3.<init>()
            java.lang.String r1 = "s.whatsapp.net"
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r1)
            r3.A02 = r1
            java.lang.String r1 = r2.A07
            r3.A07 = r1
            java.lang.String r1 = r2.A05
            r3.A05 = r1
            java.lang.String r1 = r2.A08
            r3.A08 = r1
            long r1 = r2.A00
            r3.A00 = r1
            java.lang.String r1 = "device_id"
            r3.A02(r1, r4)
            X.39T r1 = r3.A01()
            r0.A03(r1)
            return
        L_0x09cb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RegistrationNotificationHandler/handleXmppMessage: unknown tag="
            r1.append(r0)
            java.lang.String r0 = r5.A00
            X.C18260x0.A1K(r1, r0)
            return
        L_0x09da:
            java.lang.String r1 = "push-config notification: force replacing GCM token"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2oU r0 = r0.A00
            android.content.Context r4 = r0.A00
            java.lang.String r0 = "GCM: force replacing gcm token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Class<com.whatsapp.push.RegistrationIntentService> r3 = com.whatsapp.push.RegistrationIntentService.class
            r2 = 0
            java.lang.String r0 = "com.whatsapp.action.FORCE_REPLACE"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2, r4, r3)
            r0 = 4
            X.AnonymousClass00W.A00(r4, r1, r3, r0)
            return
        L_0x09f8:
            X.2fm r3 = r0.A04
            r2 = 14
            X.3cY r1 = new X.3cY
            r1.<init>(r0, r4, r5, r2)
            X.C48972fm.A02(r3, r1)
            return
        L_0x0a05:
            java.lang.String r1 = "identity"
            boolean r1 = X.AnonymousClass36K.A0W(r5, r1)
            if (r1 == 0) goto L_0x0a5d
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            java.lang.String r1 = "from"
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass36K.A0A(r12, r7, r1)
            if (r3 == 0) goto L_0x0a50
            X.2bd r6 = new X.2bd
            r6.<init>()
            java.lang.String r2 = "type"
            java.lang.String r1 = ""
            java.lang.String r1 = r12.A0r(r2, r1)
            r6.A00 = r3
            r6.A04 = r1
            java.lang.String r1 = "lid"
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass36K.A0A(r12, r7, r1)
            if (r1 == 0) goto L_0x0a33
            r6.A01 = r1
        L_0x0a33:
            java.lang.String r1 = "display_name"
            java.lang.String r2 = X.AnonymousClass36K.A0L(r12, r1)
            boolean r1 = X.C107575bX.A0F(r2)
            if (r1 != 0) goto L_0x0a41
            r6.A03 = r2
        L_0x0a41:
            X.2mQ r3 = r0.A08
            X.2pI r2 = r6.A00()
            com.whatsapp.jid.UserJid r1 = r2.A02
            java.util.Map r1 = X.C57692u3.A04(r1, r2)
            r3.A02(r1)
        L_0x0a50:
            X.2Yh r3 = r0.A09
            r2 = 37
            X.3aM r1 = new X.3aM
            r1.<init>(r0, r4, r5, r2)
            r3.A00(r1)
            return
        L_0x0a5d:
            java.lang.String r1 = "digest"
            boolean r1 = X.AnonymousClass36K.A0W(r5, r1)
            if (r1 == 0) goto L_0x0a7a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "server asked us to run an e2e key digest check; stanzaKey="
            X.C18260x0.A1R(r2, r1, r4)
            X.33p r2 = r0.A02
            r1 = 1
            r2.A1z(r1)
            X.1i9 r1 = r0.A00
            r1.A0B()
        L_0x0a7a:
            r0.A03(r4)
            return
        L_0x0a7e:
            java.lang.String r0 = "required token element to contain data"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0a86:
            r5.A0F()
            return
        L_0x0a8a:
            java.lang.String r1 = "encrypted message id is different from the expected one"
            X.6u5 r0 = new X.6u5     // Catch:{ 6u5 -> 0x0a95 }
            r0.<init>((java.lang.String) r1)     // Catch:{ 6u5 -> 0x0a95 }
            throw r0     // Catch:{ 6u5 -> 0x0a95 }
        L_0x0a92:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0a95:
            r1 = move-exception
            java.lang.String r0 = "malformed encrypted data"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0a9c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "missing media data for media message; stanzaKeyId="
            r1.append(r0)
            r1.append(r9)
            X.C18260x0.A1S(r1, r8, r2)
            return
        L_0x0aad:
            java.lang.String r0 = "mexnotificationrouter/onoperationnotfound the operation for this notification was not found. Expected an 'update' tag with a non-empty 'operation_name' attribute."
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67743Qm.A05(X.36K, int):void");
    }

    public C67743Qm(C55682qk r2, AnonymousClass31C r3, C55892r5 r4, AnonymousClass4FS r5, int[] iArr, boolean z) {
        C72173dI r0;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = iArr;
        this.A06 = z;
        if (z) {
            r0 = C72173dI.A00(r5);
        } else {
            r0 = null;
        }
        this.A03 = r0;
    }

    public final int[] B81() {
        return this.A07;
    }
}
