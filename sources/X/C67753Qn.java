package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Qn  reason: invalid class name and case insensitive filesystem */
public class C67753Qn implements AnonymousClass4DA {
    public int A00;
    public final C116985rC A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C55682qk A04;
    public final C56972sr A05;
    public final AnonymousClass36E A06;
    public final C29021i9 A07;
    public final C55912r7 A08;
    public final C66663Mh A09;
    public final AnonymousClass3FK A0A;
    public final C49712gy A0B;
    public final C29411im A0C;
    public final C56962sq A0D;
    public final C44302Vn A0E;
    public final C58582vU A0F;
    public final C29441ip A0G;
    public final C64773Ex A0H;
    public final C56422rx A0I;
    public final C64213Cp A0J;
    public final AnonymousClass30C A0K;
    public final C56612sH A0L;
    public final AnonymousClass33p A0M;
    public final C621133n A0N;
    public final C48972fm A0O;
    public final C614730x A0P;
    public final C52852m9 A0Q;
    public final C56982ss A0R;
    public final C66543Lv A0S;
    public final C56892sj A0T;
    public final AnonymousClass300 A0U;
    public final C49502gd A0V;
    public final C42872Pv A0W;
    public final C55332qB A0X;
    public final C56382rt A0Y;
    public final C620333f A0Z;
    public final C50562iN A0a;
    public final C29041iB A0b;
    public final AnonymousClass33Z A0c;
    public final AnonymousClass318 A0d;
    public final C55802qw A0e;
    public final C56302rl A0f;
    public final AnonymousClass1VX A0g;
    public final AnonymousClass4FV A0h;
    public final C66493Lq A0i;
    public final C66503Lr A0j;
    public final C56232re A0k;
    public final AnonymousClass3XH A0l;
    public final C55572qZ A0m;
    public final C59432wu A0n;
    public final C47532dP A0o;
    public final C52552lf A0p;
    public final C46472bg A0q;
    public final C66653Mg A0r;
    public final C43882Tv A0s;
    public final C55352qD A0t;
    public final C55882r4 A0u;
    public final AnonymousClass33Y A0v;
    public final AnonymousClass33S A0w;
    public final C614330s A0x;
    public final C55892r5 A0y;
    public final C50462iD A0z;
    public final AnonymousClass2T6 A10;
    public final AnonymousClass3Cj A11;
    public final AnonymousClass9U4 A12;
    public final C54812pK A13;
    public final C61242zw A14;
    public final C45002Yh A15;
    public final C50622iU A16;
    public final AnonymousClass2UP A17;
    public final C47642da A18;
    public final C56832sd A19;
    public final AnonymousClass30F A1A;
    public final C55832qz A1B;
    public final AnonymousClass4BY A1C;
    public final AnonymousClass4FS A1D;
    public final Set A1E = AnonymousClass002.A0K();
    public final Set A1F = AnonymousClass002.A0K();

    public final void A01(DeviceJid deviceJid, AnonymousClass4FY r12, Map map) {
        Set set = this.A1E;
        synchronized (set) {
            AnonymousClass4FY r7 = r12;
            Map map2 = map;
            if (map != null) {
                if (!set.contains(map)) {
                    set.add(map);
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("MessagingXmppHandler/onMessageForMe message in queue; skipping id:");
                    C18260x0.A1L(A0o2, C18310x6.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_ID, map));
                    this.A0y.A05(r12.B9D());
                }
            }
            this.A00++;
            AnonymousClass1gS r2 = (AnonymousClass1gS) this.A0y.A01(0, r12.B9D());
            if (r2 != null) {
                r2.A01 = (long) (this.A00 - 1);
                r2.A03(2);
            }
            this.A15.A00(new C70513ac(this, deviceJid, r7, map2, 13));
        }
    }

    public final void A06(AnonymousClass4FY r15, int i, int i2) {
        AnonymousClass4FY r8 = r15;
        if (r15.BqQ()) {
            r15.Bmv(i);
        }
        C46472bg r7 = this.A0q;
        new C47452dH(this.A07, this.A0B, this.A0N, this.A0Q, this.A0o, r7, r8, (C42612Ov) null, (C42612Ov) null, (byte[]) null, (byte[]) null, false).A00(i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: X.3a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v126, resolved type: X.3bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v24, resolved type: X.3bh} */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r2v35, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r4v76, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r15v25, types: [X.3bh] */
    /* JADX WARNING: type inference failed for: r19v7, types: [X.3b3] */
    /* JADX WARNING: type inference failed for: r11v18, types: [X.3aF] */
    /* JADX WARNING: type inference failed for: r11v19, types: [X.3bB] */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:269|(1:271)|272|273|274|275|276|277|278|279|280) */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04e2, code lost:
        if (r12 == 3) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04ea, code lost:
        if (r15 != false) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0674, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        X.AnonymousClass2A8.A00(r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0678, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x067b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:?, code lost:
        X.AnonymousClass2A8.A00(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x067f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0946, code lost:
        if (r7.A04(r3, "payment_status") == false) goto L_0x087a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x09b8, code lost:
        if (r3.A0K.A0Y(X.C58422vE.A02, 4315) != false) goto L_0x09ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0d3b, code lost:
        if (r14 == null) goto L_0x0d3d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:275:0x065c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x06dc  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0728  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:632:0x0e0c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BFA(android.os.Message r30, int r31) {
        /*
            r29 = this;
            r10 = 1
            r0 = r29
            r7 = r30
            r2 = r31
            if (r31 == 0) goto L_0x0bee
            if (r2 == r10) goto L_0x0ba9
            r1 = 2
            if (r2 == r1) goto L_0x0a51
            r1 = 15
            if (r2 == r1) goto L_0x0981
            r1 = 16
            if (r2 == r1) goto L_0x07cd
            r1 = 19
            r4 = 0
            if (r2 == r1) goto L_0x0114
            r1 = 69
            if (r2 == r1) goto L_0x01eb
            r1 = 86
            if (r2 == r1) goto L_0x0109
            r1 = 215(0xd7, float:3.01E-43)
            if (r2 == r1) goto L_0x00fe
            r1 = 227(0xe3, float:3.18E-43)
            if (r2 == r1) goto L_0x008c
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x0034
            r1 = 259(0x103, float:3.63E-43)
            if (r2 == r1) goto L_0x0a30
            return r4
        L_0x0034:
            java.lang.Object r1 = r7.obj
            X.C626936e.A06(r1)
            X.2LN r1 = (X.AnonymousClass2LN) r1
            X.3SS r5 = r1.A00
            java.util.Map r3 = r1.A01
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessagingXmppHandler/onAppDataForMe id="
            r6.append(r1)
            java.lang.String r1 = r5.A0A
            r6.append(r1)
            java.lang.String r1 = " t="
            r6.append(r1)
            long r1 = r5.A06
            r6.append(r1)
            java.lang.String r1 = " now="
            X.C18290x4.A1Q(r6, r1)
            java.lang.String r1 = " retry="
            X.C18260x0.A0y(r1, r6, r4)
            com.whatsapp.jid.Jid r1 = r5.A07
            X.4uZ r1 = X.C627336j.A02(r1)
            boolean r1 = r1 instanceof X.C135166kE
            if (r1 != 0) goto L_0x0085
            r0.A05(r5)
            com.whatsapp.jid.Jid r1 = r5.BCm()
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r1)
            r0.A01(r1, r5, r3)
            X.3XH r2 = r0.A0l
            android.os.Handler r1 = r2.A01
            java.lang.Runnable r0 = r2.A0A
            r1.removeCallbacks(r0)
            r2.A00 = r4
            return r10
        L_0x0085:
            java.lang.String r0 = "AppData doesn't support status JIDs"
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass002.A0G(r0)
            throw r1
        L_0x008c:
            java.lang.Object r1 = r7.obj
            X.36K r1 = (X.AnonymousClass36K) r1
            java.lang.String r8 = "readreceipts"
            java.lang.String r2 = X.AnonymousClass36K.A0L(r1, r8)
            java.lang.String r1 = "all"
            boolean r7 = r1.equals(r2)
            java.lang.String r6 = "none"
            if (r7 != 0) goto L_0x00b2
            boolean r1 = r6.equals(r2)
            if (r1 != 0) goto L_0x00b2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessagingXmppHandler/onSyncPrivacySetting unknown readreceipts setting: "
            X.C18260x0.A0r(r0, r2, r1)
            return r10
        L_0x00b2:
            X.33p r9 = r0.A0M
            boolean r5 = r9.A2G()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessagingXmppHandler/onSyncPrivacySetting serverSetting="
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = "; clientSetting="
            X.C18260x0.A1D(r1, r2, r5)
            if (r7 == r5) goto L_0x0a4a
            X.2qk r3 = r0.A04
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "server="
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = "; client="
            java.lang.String r2 = X.AnonymousClass000.A0b(r1, r2, r5)
            java.lang.String r1 = "readReceipt-setting-inconsistency"
            r3.A0A(r1, r4, r2)
            if (r5 == 0) goto L_0x00f8
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r9)
            java.lang.String r1 = "read_receipts_enabled"
            X.C18270x1.A0l(r2, r1, r7)
            X.2r7 r0 = r0.A08
            X.C55912r7.A00(r0)
            return r10
        L_0x00f8:
            X.2r7 r0 = r0.A08
            r0.A03(r8, r6)
            return r10
        L_0x00fe:
            X.3Cj r1 = r0.A11
            int r0 = r7.arg2
            if (r0 != r10) goto L_0x0105
            r4 = 1
        L_0x0105:
            r1.A00(r4)
            return r10
        L_0x0109:
            java.lang.Object r1 = r7.obj
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "msgid"
            r1.getString(r0)
            return r10
        L_0x0114:
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "edit"
            java.lang.String r2 = r2.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x01e5
            r12 = 0
        L_0x0125:
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "remote_chat_jid"
            java.lang.String r1 = r2.getString(r1)
            X.4uZ r3 = X.C18310x6.A0S(r1)
            r1 = 8
            if (r12 == r1) goto L_0x0139
            r4 = 1
        L_0x0139:
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "msgid"
            java.lang.String r1 = r2.getString(r1)
            X.2z0 r11 = X.AnonymousClass2z0.A05(r3, r1, r4)
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "participant"
            java.lang.String r1 = r2.getString(r1)
            X.32W r3 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r15 = r3.A03(r1)
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "remoteJid"
            java.lang.String r1 = r2.getString(r1)
            com.whatsapp.jid.Jid r13 = r3.A03(r1)
            com.whatsapp.jid.DeviceJid r13 = (com.whatsapp.jid.DeviceJid) r13
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "phash"
            java.lang.String r9 = r2.getString(r1)
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "counter_abuse_token"
            java.lang.String r20 = r2.getString(r1)
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "count"
            int r19 = r2.getInt(r1)
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "timestamp"
            long r1 = r2.getLong(r1)
            android.os.Bundle r4 = r7.getData()
            java.lang.String r3 = "smid"
            long r5 = r4.getLong(r3)
            android.os.Bundle r4 = r7.getData()
            java.lang.String r3 = "addressing_mode"
            java.lang.String r18 = r4.getString(r3)
            java.lang.String r17 = "; participant="
            java.lang.String r16 = "; remoteJid="
            java.lang.String r14 = "; serverParticipantHash="
            java.lang.String r8 = "; recipientCount="
            java.lang.String r7 = "; counterAbuseToken="
            java.lang.String r4 = "; edit="
            java.lang.String r3 = "; timestamp="
            if (r15 == 0) goto L_0x040d
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "MessagingXmppHandler/onMessageReceivedByServer message received by server ignored; key="
            r0 = r17
            X.AnonymousClass000.A17(r11, r6, r0, r5)
            r5.append(r15)
            r0 = r16
            r5.append(r0)
            r5.append(r13)
            X.AnonymousClass001.A1K(r14, r9, r8, r5)
            r0 = r19
            r5.append(r0)
            r0 = r20
            X.AnonymousClass001.A1K(r7, r0, r4, r5)
            r5.append(r12)
            java.lang.String r0 = X.AnonymousClass000.A0Z(r3, r5, r1)
            goto L_0x027f
        L_0x01e5:
            int r12 = java.lang.Integer.parseInt(r2)
            goto L_0x0125
        L_0x01eb:
            java.lang.Object r2 = r7.obj
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r1 = "recipient"
            java.lang.String r1 = r2.getString(r1)
            X.32W r5 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r4 = r5.A03(r1)
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.String r1 = "remote_jid"
            java.lang.String r1 = r2.getString(r1)
            com.whatsapp.jid.Jid r6 = r5.A03(r1)
            if (r4 != 0) goto L_0x020f
            X.4uZ r4 = X.C106405Yw.A03(r6)
        L_0x020f:
            java.lang.String r1 = "from_me"
            boolean r3 = r2.getBoolean(r1)
            java.lang.String r1 = "msgid"
            java.lang.String r1 = r2.getString(r1)
            X.2z0 r7 = X.AnonymousClass2z0.A05(r4, r1, r3)
            java.lang.String r1 = "category"
            java.lang.String r4 = r2.getString(r1)
            java.lang.String r1 = "requester"
            java.lang.String r1 = r2.getString(r1)
            com.whatsapp.jid.Jid r13 = r5.A03(r1)
            java.lang.String r1 = "participant"
            java.lang.String r1 = r2.getString(r1)
            com.whatsapp.jid.Jid r5 = r5.A03(r1)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.of(r6)
            java.lang.String r1 = "is_md_rmr"
            boolean r18 = r2.getBoolean(r1)
            java.lang.String r1 = "enc_data"
            byte[] r11 = r2.getByteArray(r1)
            java.lang.String r1 = "enc_iv"
            byte[] r9 = r2.getByteArray(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget; key="
            X.AnonymousClass0x2.A1E(r7, r5, r1, r2)
            java.lang.String r1 = "; remoteJid="
            X.C18260x0.A1R(r2, r1, r3)
            java.lang.String r1 = "peer"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x029c
            if (r11 == 0) goto L_0x0299
            if (r9 == 0) goto L_0x0299
            if (r3 == 0) goto L_0x0299
            X.2rl r1 = r0.A0f
            java.lang.String r2 = r7.A01
            X.1mE r4 = r1.A03(r3, r2)
            X.1nO r4 = (X.AnonymousClass1nO) r4
            if (r4 != 0) goto L_0x0283
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/message-missing"
        L_0x027f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r10
        L_0x0283:
            int r1 = r4.A02
            if (r1 <= 0) goto L_0x028a
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/too many retries"
            goto L_0x027f
        L_0x028a:
            byte[] r1 = r4.A0J
            int r1 = r0.A00(r2, r1, r11, r9)
            if (r1 != r10) goto L_0x0a4a
            com.whatsapp.jid.DeviceJid r7 = r4.A00
            if (r7 != 0) goto L_0x03c4
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/no recipient"
            goto L_0x027f
        L_0x0299:
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/no-data"
            goto L_0x027f
        L_0x029c:
            X.4uZ r4 = r7.A00
            if (r4 != 0) goto L_0x02ca
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/key doesn't have chat jid"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x02a5:
            java.lang.String r6 = r7.A01
            r3 = 0
            r2 = 0
        L_0x02a9:
            boolean r7 = r7.A02
        L_0x02ab:
            if (r18 == 0) goto L_0x0a4a
            X.2sr r8 = r0.A05
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r8)
            if (r1 == 0) goto L_0x0a4a
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r13)
            boolean r1 = r8.A0b(r1)
            if (r1 == 0) goto L_0x0a4a
            if (r3 == 0) goto L_0x03fb
            X.33C r1 = r3.A01
            if (r1 == 0) goto L_0x0a4a
            byte[] r1 = r1.A0W
            if (r1 != 0) goto L_0x03fb
            return r10
        L_0x02ca:
            boolean r1 = r4 instanceof X.AnonymousClass1fS
            if (r1 == 0) goto L_0x0320
            if (r5 == 0) goto L_0x0320
            boolean r1 = r4 instanceof X.C135166kE
            if (r1 != 0) goto L_0x0320
            boolean r2 = r7.A02
            java.lang.String r1 = r7.A01
            X.2z0 r8 = X.AnonymousClass2z0.A05(r5, r1, r2)
        L_0x02dc:
            X.2lf r1 = r0.A0p
            r1.A02(r3, r8)
            X.2qz r1 = r0.A1B
            X.34x r3 = r1.A05(r8)
            if (r3 != 0) goto L_0x02f3
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/messagemissing"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x02ee:
            java.lang.String r6 = r7.A01
            r3 = 0
            r2 = 2
            goto L_0x02a9
        L_0x02f3:
            byte r2 = r3.A1I
            boolean r1 = X.C627636p.A0H(r2)
            if (r1 != 0) goto L_0x0307
            boolean r1 = X.C627636p.A0I(r2)
            if (r1 != 0) goto L_0x0307
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/wrongtype"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x02a5
        L_0x0307:
            X.1mV r3 = (X.C30471mV) r3
            X.33C r1 = X.C30471mV.A00(r3)
            X.33C r6 = new X.33C
            r6.<init>(r1)
            java.io.File r1 = r6.A0F
            if (r1 != 0) goto L_0x0322
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/badmediadata; mediaDataV2="
            X.C18260x0.A1Q(r2, r1, r6)
            goto L_0x02ee
        L_0x0320:
            r8 = r7
            goto L_0x02dc
        L_0x0322:
            java.lang.String r2 = r8.A01
            byte[] r1 = r6.A0W
            int r2 = r0.A00(r2, r1, r11, r9)
            if (r2 == r10) goto L_0x0331
            java.lang.String r6 = r7.A01
            r3 = 0
            goto L_0x02a9
        L_0x0331:
            java.io.File r1 = r6.A0F
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0345
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/filemissing"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r6 = r7.A01
            boolean r7 = r7.A02
            r2 = 2
            goto L_0x02ab
        L_0x0345:
            long r1 = r6.A0A
            r11 = 0
            int r9 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x037a
            java.io.File r9 = r6.A0F
            long r11 = r9.length()
            int r9 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x037a
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/filereplaced; mediaDataV2.fileSize="
            r8.append(r1)
            long r1 = r6.A0A
            r8.append(r1)
            java.lang.String r1 = "; mediaDataV2.file.length="
            r8.append(r1)
            java.io.File r1 = r6.A0F
            long r1 = r1.length()
            X.C18260x0.A1I(r8, r1)
            java.lang.String r6 = r7.A01
            boolean r7 = r7.A02
            r2 = 0
            goto L_0x02ab
        L_0x037a:
            if (r18 != 0) goto L_0x0b4a
            X.1ip r1 = r0.A0G
            int r9 = r1.A08(r10)
            X.2qZ r2 = r0.A0m
            boolean r1 = r2.A03(r3)
            if (r1 != 0) goto L_0x0b4a
            boolean r1 = r2.A04(r3, r9)
            if (r1 != 0) goto L_0x0b4a
            byte r6 = r3.A1I
            if (r6 != r10) goto L_0x0399
            if (r9 == 0) goto L_0x0399
            r1 = 3
            if (r9 != r1) goto L_0x0b4a
        L_0x0399:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessagingXmppHandler/onMessageServerErrorForTarget/skipreupload; activeNetworkType="
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = "; message.media_wa_type="
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = "; message.origin="
            r2.append(r0)
            int r0 = r3.A09
            r2.append(r0)
            java.lang.String r0 = "; message.media_size="
            r2.append(r0)
            long r0 = r3.A00
            java.lang.String r0 = X.AnonymousClass001.A0k(r2, r0)
            goto L_0x027f
        L_0x03c4:
            int r8 = r4.A03
            r1 = 4
            if (r8 != r1) goto L_0x03d1
            X.4FS r2 = r0.A1D
            r1 = 42
            X.C70353aM.A00(r2, r0, r4, r7, r1)
            return r10
        L_0x03d1:
            r1 = 2
            if (r8 == r1) goto L_0x03d7
            r1 = 3
            if (r8 != r1) goto L_0x0a4a
        L_0x03d7:
            X.2qw r3 = r0.A0e
            long r1 = r4.A1L
            r6 = 0
            r11 = -1
            r9 = -1
            X.2o9 r5 = new X.2o9
            r15 = r11
            r17 = r11
            r19 = r11
            r21 = r11
            r25 = r1
            r27 = r11
            r13 = r11
            r23 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r15, r17, r19, r21, r23, r25, r27)
            r3.A02(r5)
            X.2Vn r0 = r0.A0E
            r0.A00()
            return r10
        L_0x03fb:
            X.2wu r0 = r0.A0n
            r17 = 0
            r19 = r7
            r11 = r0
            r12 = r4
            r14 = r5
            r15 = r3
            r16 = r6
            r18 = r2
            r11.A01(r12, r13, r14, r15, r16, r17, r18, r19)
            return r10
        L_0x040d:
            X.3Lq r4 = r0.A0i
            X.4uZ r7 = r11.A00
            X.1fJ r15 = X.AnonymousClass34R.A03(r7)
            X.2pW r14 = r4.A0r
            java.lang.String r3 = X.C381125t.A00(r18)
            r8 = 1
            X.C162457s7.A0J(r3, r10)
            r18 = 0
            boolean r3 = r14.A01(r15, r3)
            if (r3 == 0) goto L_0x0431
            X.3Lr r14 = r4.A0t
            X.21x r3 = X.C373521x.LID_MIGRATION
            java.lang.String r4 = r3.contextString
            r3 = 6
            r14.A0E(r15, r4, r3)
        L_0x0431:
            X.2lf r14 = r0.A0p
            java.util.Map r4 = r14.A01
            monitor-enter(r4)
            java.lang.Object r3 = r4.get(r11)     // Catch:{ all -> 0x07ca }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x07ca }
            if (r3 == 0) goto L_0x0444
            java.lang.Object r3 = r3.second     // Catch:{ all -> 0x07ca }
            X.34x r3 = (X.C624134x) r3     // Catch:{ all -> 0x07ca }
            monitor-exit(r4)     // Catch:{ all -> 0x07ca }
            goto L_0x0446
        L_0x0444:
            monitor-exit(r4)     // Catch:{ all -> 0x07ca }
            r3 = 0
        L_0x0446:
            r14.A02(r13, r11)
            boolean r15 = X.C18320x8.A1U(r9)
            r4 = 7
            if (r12 == r4) goto L_0x0455
            r4 = 8
            if (r12 == r4) goto L_0x0455
            r8 = 0
        L_0x0455:
            com.whatsapp.jid.UserJid r13 = X.AnonymousClass32Y.A03(r7)
            if (r13 == 0) goto L_0x0460
            X.2pK r4 = r0.A13
            r4.A02(r13)
        L_0x0460:
            boolean r4 = r7 instanceof X.C135166kE
            r13 = 0
            if (r4 != 0) goto L_0x046b
            boolean r4 = r7 instanceof X.AnonymousClass1fI
            if (r4 == 0) goto L_0x058c
            if (r8 != 0) goto L_0x058c
        L_0x046b:
            r14 = 1
        L_0x046c:
            if (r15 == 0) goto L_0x04ce
            boolean r4 = X.C627336j.A0K(r7)
            if (r4 != 0) goto L_0x0524
            if (r14 != 0) goto L_0x0524
            boolean r4 = r7 instanceof com.whatsapp.jid.UserJid
            if (r4 == 0) goto L_0x04ce
            X.2qB r4 = r0.A0X
            java.util.Set r4 = r4.A01(r11)
            java.util.HashSet r14 = X.AnonymousClass0x9.A15(r4)
            X.2sr r4 = r0.A05
            X.6kH r4 = X.C56972sr.A03(r4)
            r14.add(r4)
            java.lang.String r4 = X.C621933y.A03(r14)
            boolean r4 = android.text.TextUtils.equals(r4, r9)
            if (r4 != 0) goto L_0x04ce
            r0.A04(r11, r8, r13)
        L_0x049a:
            X.36E r13 = r0.A06
            X.1Z4 r9 = new X.1Z4
            r9.<init>()
            java.lang.Integer r4 = X.AnonymousClass36E.A06(r7)
            r9.A02 = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)
            r9.A01 = r4
            if (r3 == 0) goto L_0x0522
            int r4 = X.AnonymousClass29K.A00(r13, r3)
        L_0x04b3:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r13.A0T(r7, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r9.A00 = r4
            X.2ss r4 = r13.A09
            java.lang.Integer r4 = X.AnonymousClass36M.A07(r4, r7)
            r9.A03 = r4
            X.4FV r4 = r13.A0G
            r4.BhD(r9)
        L_0x04ce:
            boolean r4 = r7 instanceof X.C95804uY
            if (r4 == 0) goto L_0x06b6
            X.2T6 r8 = r0.A10
            java.lang.Long r17 = java.lang.Long.valueOf(r5)
            r4 = 8
            r16 = 1
            if (r12 == r4) goto L_0x04e4
            r16 = 0
            r4 = 3
            r15 = 0
            if (r12 != r4) goto L_0x04e5
        L_0x04e4:
            r15 = 1
        L_0x04e5:
            boolean r13 = r11.A02
            if (r13 != 0) goto L_0x04ec
            r4 = 0
            if (r15 == 0) goto L_0x04ed
        L_0x04ec:
            r4 = 1
        L_0x04ed:
            java.lang.String r14 = "Failed requirement."
            if (r4 == 0) goto L_0x06b1
            X.2qf r9 = r8.A02
            X.2qz r4 = r9.A0C
            X.34x r4 = r4.A05(r11)
            if (r4 != 0) goto L_0x0501
            X.33f r4 = r9.A08
            X.1mH r4 = r4.A07(r11)
        L_0x0501:
            if (r15 == 0) goto L_0x050f
            if (r4 != 0) goto L_0x050f
            X.2qz r12 = r8.A05
            r9 = r13 ^ 1
            java.lang.String r4 = r11.A01
            X.34x r4 = X.C55832qz.A01(r7, r12, r4, r9)
        L_0x050f:
            r12 = 0
            if (r16 != 0) goto L_0x0594
            boolean r7 = r4 instanceof X.C30331mH
            if (r7 != 0) goto L_0x0594
            if (r17 == 0) goto L_0x058f
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x0594
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r14)
            throw r1
        L_0x0522:
            r4 = 1
            goto L_0x04b3
        L_0x0524:
            boolean r4 = r7 instanceof X.C28011fL
            if (r4 == 0) goto L_0x058a
            r13 = r7
            X.1fL r13 = (X.C28011fL) r13
        L_0x052b:
            X.C626936e.A06(r13)
            X.2ss r15 = r0.A0R
            X.3Ex r14 = r0.A0H
            X.2sj r4 = r0.A0T
            boolean r14 = X.C627636p.A0V(r14, r15, r4, r3)
            X.2qB r4 = r0.A0X
            java.util.Set r4 = r4.A01(r11)
            java.util.HashSet r15 = X.AnonymousClass0x9.A15(r4)
            X.2sr r4 = r0.A05
            if (r14 == 0) goto L_0x0585
            X.6kB r4 = r4.A0G()
        L_0x054a:
            r15.add(r4)
            java.lang.String r4 = X.C621933y.A03(r15)
            boolean r4 = android.text.TextUtils.equals(r4, r9)
            if (r4 != 0) goto L_0x04ce
            r0.A04(r11, r8, r14)
            boolean r4 = X.C627336j.A0K(r13)
            if (r4 == 0) goto L_0x049a
            X.3Lr r14 = r0.A0j
            X.1fJ r13 = X.AnonymousClass34R.A03(r13)
            X.C626936e.A06(r13)
            X.36E r9 = r0.A06
            if (r3 == 0) goto L_0x0583
            int r4 = X.AnonymousClass29K.A00(r9, r3)
        L_0x0571:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.A0T(r7, r4)
            X.334 r4 = new X.334
            r4.<init>((boolean) r8, (boolean) r9)
            r14.A08(r4, r13)
            goto L_0x049a
        L_0x0583:
            r4 = 1
            goto L_0x0571
        L_0x0585:
            X.6kH r4 = X.C56972sr.A03(r4)
            goto L_0x054a
        L_0x058a:
            r13 = 0
            goto L_0x052b
        L_0x058c:
            r14 = 0
            goto L_0x046c
        L_0x058f:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r14)
            throw r1
        L_0x0594:
            boolean r7 = r4 instanceof X.C30331mH
            if (r7 == 0) goto L_0x05ae
            boolean r5 = r4 instanceof X.C30571mf
            X.33f r6 = r8.A00
            X.1mH r4 = (X.C30331mH) r4
            if (r5 == 0) goto L_0x05a9
            long r4 = r4.A1L
            X.3Ll r1 = r6.A0P
            r1.A08(r4)
            goto L_0x06d4
        L_0x05a9:
            r6.A0F(r4, r1)
            goto L_0x06d4
        L_0x05ae:
            if (r4 == 0) goto L_0x06aa
            if (r17 == 0) goto L_0x05da
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x05da
        L_0x05b6:
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0690
            r4.A1M = r5
            r5 = 4
            r4.A1G(r5)
            r4.A0J = r1
            X.2Ou r5 = r4.A11()
            if (r5 == 0) goto L_0x05d6
            X.2z0 r12 = r5.A02
            long r5 = r5.A01
            X.2Ou r11 = new X.2Ou
            r13 = r1
            r15 = r5
            r11.<init>(r12, r13, r15)
            r4.A1V(r11)
        L_0x05d6:
            X.2rZ r8 = r8.A01
            r5 = 0
            goto L_0x05dd
        L_0x05da:
            long r5 = r4.A1M
            goto L_0x05b6
        L_0x05dd:
            X.3dV r1 = r8.A05     // Catch:{ SQLNonTransientException -> 0x0680, IllegalArgumentException -> 0x0684 }
            X.4Fq r7 = r1.A04()     // Catch:{ SQLNonTransientException -> 0x0680, IllegalArgumentException -> 0x0684 }
            X.3Yo r11 = r7.Axl()     // Catch:{ all -> 0x0679 }
            r1 = r7
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0672 }
            X.2sg r9 = r1.A03     // Catch:{ all -> 0x0672 }
            java.lang.String r14 = "message"
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0672 }
            X.C624134x.A0G(r6, r4)     // Catch:{ all -> 0x0672 }
            int r1 = r4.A0D     // Catch:{ all -> 0x0672 }
            X.C18280x3.A0m(r6, r1)     // Catch:{ all -> 0x0672 }
            long r1 = r4.A0J     // Catch:{ all -> 0x0672 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0672 }
            java.lang.String r1 = "receipt_server_timestamp"
            r6.put(r1, r2)     // Catch:{ all -> 0x0672 }
            java.lang.String r15 = "_id = ?"
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x0672 }
            X.C624134x.A0Y(r4, r1, r5)     // Catch:{ all -> 0x0672 }
            java.lang.String r16 = "UPDATE_MAIN_MESSAGE_TABLE_FOR_NEWSLETTER"
            r17 = r1
            r12 = r9
            r13 = r6
            r12.A05(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0672 }
            r8.A01(r7, r4)     // Catch:{ all -> 0x0672 }
            X.2ss r2 = r8.A02     // Catch:{ all -> 0x0672 }
            X.2z0 r1 = r4.A1J     // Catch:{ all -> 0x0672 }
            X.4uZ r1 = r1.A00     // Catch:{ all -> 0x0672 }
            X.31A r9 = r2.A0A(r1, r5)     // Catch:{ all -> 0x0672 }
            boolean r1 = r9 instanceof X.AnonymousClass1RL     // Catch:{ all -> 0x0672 }
            if (r1 == 0) goto L_0x066b
            X.1RL r9 = (X.AnonymousClass1RL) r9     // Catch:{ all -> 0x0672 }
            if (r9 == 0) goto L_0x066b
            long r5 = r9.A0U     // Catch:{ all -> 0x0672 }
            long r1 = r4.A1L     // Catch:{ all -> 0x0672 }
            int r12 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x0643
            long r1 = r4.A1M     // Catch:{ all -> 0x0672 }
            r9.A0V = r1     // Catch:{ all -> 0x0672 }
            long r1 = r4.A1M     // Catch:{ all -> 0x0672 }
            r9.A0O = r1     // Catch:{ all -> 0x0672 }
            long r1 = r4.A1M     // Catch:{ all -> 0x0672 }
            r9.A0Q = r1     // Catch:{ all -> 0x0672 }
            r9.A0d = r4     // Catch:{ all -> 0x0672 }
            r9.A0c = r4     // Catch:{ all -> 0x0672 }
        L_0x0643:
            X.2sL r6 = r8.A06     // Catch:{ all -> 0x0672 }
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0672 }
            long r1 = r9.A0W     // Catch:{ all -> 0x0672 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0672 }
            java.lang.String r1 = "_id"
            r5.put(r1, r2)     // Catch:{ all -> 0x0672 }
            X.C56652sL.A00(r5, r9)     // Catch:{ all -> 0x0672 }
            X.2sm r1 = r6.A01     // Catch:{ all -> 0x065c }
            r1.A04(r5, r9)     // Catch:{ all -> 0x065c }
        L_0x065c:
            r11.A00()     // Catch:{ all -> 0x0672 }
            r11.close()     // Catch:{ all -> 0x0679 }
            r7.close()     // Catch:{ SQLNonTransientException -> 0x0680, IllegalArgumentException -> 0x0684 }
            X.2Zx r1 = r8.A0A     // Catch:{ SQLNonTransientException -> 0x0680, IllegalArgumentException -> 0x0684 }
            r1.A00(r4)     // Catch:{ SQLNonTransientException -> 0x0680, IllegalArgumentException -> 0x0684 }
            goto L_0x06d4
        L_0x066b:
            java.lang.String r1 = "Corrupt newsletter in cache"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r1)     // Catch:{ all -> 0x0672 }
            throw r1     // Catch:{ all -> 0x0672 }
        L_0x0672:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0674 }
        L_0x0674:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r11, r2)     // Catch:{ all -> 0x0679 }
            throw r1     // Catch:{ all -> 0x0679 }
        L_0x0679:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x067b }
        L_0x067b:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r7, r2)     // Catch:{ SQLNonTransientException -> 0x0680, IllegalArgumentException -> 0x0684 }
            throw r1     // Catch:{ SQLNonTransientException -> 0x0680, IllegalArgumentException -> 0x0684 }
        L_0x0680:
            r2 = move-exception
            java.lang.String r1 = "NewsletterMessageStore/failed to update the message"
            goto L_0x0687
        L_0x0684:
            r2 = move-exception
            java.lang.String r1 = "NewsletterMessageStore/failed to update the message due to message constraints"
        L_0x0687:
            com.whatsapp.util.Log.e(r1, r2)
            java.lang.String r1 = "NewsletterMessageManager/failed to insert a message"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x06d4
        L_0x0690:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NewsletterMessageManager/unexpected server message id "
            r1.append(r0)
            r1.append(r5)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0R(r11, r1)
            X.24Y r1 = X.AnonymousClass24Y.A01(r0)
            throw r1
        L_0x06aa:
            java.lang.String r0 = "NewsletterMessageManager/unable to find a message to update"
            X.24Y r1 = X.AnonymousClass24Y.A01(r0)
            throw r1
        L_0x06b1:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r14)
            throw r1
        L_0x06b6:
            if (r3 == 0) goto L_0x0774
            boolean r4 = X.C624134x.A0d(r3)
            if (r4 == 0) goto L_0x0774
            X.1VX r7 = r0.A0g
            long r4 = r3.A0K
            r6 = 2983(0xba7, float:4.18E-42)
            long r6 = X.C56952sp.A04(r7, r6)
            long r4 = r4 + r6
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x0774
            X.2z0 r2 = r3.A1J
            r1 = 21
            r0.A03(r3, r2, r1)
        L_0x06d4:
            X.3FK r1 = r0.A0A
            X.2Of r2 = r1.A0B
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x06e7
            r1 = 0
            r2.A02 = r1
            X.33T r4 = r2.A01
            r2 = 6
            java.lang.String r1 = "UnsentMessagesNotification2"
            r4.A05(r2, r1)
        L_0x06e7:
            X.30F r7 = r0.A1A
            boolean r5 = r3 instanceof X.AnonymousClass1nW
            if (r5 != 0) goto L_0x0703
            boolean r1 = r3 instanceof X.C30581mg
            if (r1 != 0) goto L_0x0703
        L_0x06f1:
            X.5rC r2 = r0.A02
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x07be
            r2.A04()
            java.lang.String r0 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0g(r0)
            throw r1
        L_0x0703:
            X.1VX r4 = r7.A09
            r2 = 4411(0x113b, float:6.181E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r4.A0Y(r1, r2)
            if (r1 == 0) goto L_0x06f1
            X.2sr r1 = r7.A01
            boolean r1 = X.C627636p.A0P(r1, r3)
            if (r1 == 0) goto L_0x06f1
            X.2z0 r4 = r3.A1J
            X.4uZ r1 = r4.A00
            com.whatsapp.jid.GroupJid r8 = X.AnonymousClass32V.A01(r1)
            if (r8 != 0) goto L_0x0728
            java.lang.String r1 = "updateServerReminder/groupJid is null"
        L_0x0724:
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x06f1
        L_0x0728:
            r6 = 0
            if (r5 == 0) goto L_0x074f
            r1 = r3
            X.1mX r1 = (X.C30491mX) r1
            long r1 = r1.A01
            long r1 = X.C18290x4.A0B(r1)
            java.lang.String r5 = r4.A01
            X.2l9 r4 = new X.2l9
            r4.<init>(r5, r8, r1)
            r1 = r18
            android.os.Message r5 = android.os.Message.obtain(r1, r6, r4)
            X.5jr r4 = r7.A02
            java.lang.String r2 = "set_scheduled_call_reminder"
        L_0x0746:
            X.5Zu r1 = new X.5Zu
            r1.<init>((android.os.Message) r5, (java.lang.String) r2)
            r4.A00(r1)
            goto L_0x06f1
        L_0x074f:
            boolean r1 = r3 instanceof X.C30581mg
            if (r1 == 0) goto L_0x06f1
            r1 = r3
            X.1mH r1 = (X.C30331mH) r1
            X.2z0 r1 = r1.A1v()
            if (r1 != 0) goto L_0x0760
            java.lang.String r1 = "updateServerReminder/parentMessageKey is null"
            goto L_0x0724
        L_0x0760:
            java.lang.String r1 = r1.A01
            r4 = -1
            X.2l9 r2 = new X.2l9
            r2.<init>(r1, r8, r4)
            r1 = r18
            android.os.Message r5 = android.os.Message.obtain(r1, r6, r2)
            X.5jr r4 = r7.A02
            java.lang.String r2 = "cancel_scheduled_call_reminder"
            goto L_0x0746
        L_0x0774:
            boolean r4 = r3 instanceof X.C30331mH
            if (r4 == 0) goto L_0x0789
            X.2iN r5 = r0.A0a
            X.2sr r4 = r5.A01
            boolean r4 = X.C627636p.A0P(r4, r3)
            if (r4 != 0) goto L_0x07aa
            java.lang.String r1 = "MessageAddOnSendRecvManager/cant use this method for messageAddOn not from self"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x06d4
        L_0x0789:
            X.3Lv r5 = r0.A0S
            java.util.Map r4 = r5.A2O
            r4.remove(r11)
            X.2m9 r6 = r5.A0O
            r25 = 0
            X.3b3 r4 = new X.3b3
            r22 = r3
            r23 = r20
            r24 = r19
            r26 = r1
            r19 = r4
            r20 = r5
            r21 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r1 = 23
            goto L_0x07b9
        L_0x07aa:
            X.2m9 r6 = r5.A04
            r14 = 9
            X.3aF r4 = new X.3aF
            r11 = r4
            r12 = r5
            r13 = r3
            r15 = r1
            r11.<init>(r12, r13, r14, r15)
            r1 = 56
        L_0x07b9:
            r6.A01(r4, r1)
            goto L_0x06d4
        L_0x07be:
            boolean r1 = r3 instanceof X.C30791n7
            if (r1 == 0) goto L_0x0a4a
            X.1n7 r3 = (X.C30791n7) r3
            X.3Lv r0 = r0.A0S
            r0.A0h(r3)
            return r10
        L_0x07ca:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x07ca }
            throw r1
        L_0x07cd:
            java.lang.Object r1 = r7.obj
            X.2RS r1 = (X.AnonymousClass2RS) r1
            X.2z0 r5 = r1.A03
            com.whatsapp.jid.DeviceJid r7 = r1.A02
            int r2 = r1.A00
            X.2lf r6 = r0.A0p
            java.util.Map r3 = r6.A01
            monitor-enter(r3)
            java.lang.Object r1 = r3.get(r5)     // Catch:{ all -> 0x097e }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ all -> 0x097e }
            if (r1 == 0) goto L_0x07ea
            java.lang.Object r1 = r1.second     // Catch:{ all -> 0x097e }
            X.34x r1 = (X.C624134x) r1     // Catch:{ all -> 0x097e }
            monitor-exit(r3)     // Catch:{ all -> 0x097e }
            goto L_0x07ed
        L_0x07ea:
            monitor-exit(r3)     // Catch:{ all -> 0x097e }
            r1 = 0
            goto L_0x0823
        L_0x07ed:
            if (r1 == 0) goto L_0x0823
            X.2qB r3 = r0.A0X
            java.util.Set r8 = r3.A01(r5)
            X.36E r4 = r0.A06
            X.3Lv r3 = r0.A0S
            X.2wf r3 = r3.A1S
            int r15 = r3.A01(r1)
            X.2qk r3 = r0.A04
            int r16 = X.C627336j.A00(r3, r8)
            int r17 = r8.size()
            java.util.Set r3 = r6.A02
            boolean r24 = r3.contains(r5)
            r14 = 14
            r18 = 0
            r13 = 0
            r22 = r10
            r23 = r18
            r19 = r18
            r20 = r2
            r21 = r10
            r11 = r4
            r12 = r1
            r11.A0N(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0823:
            r6.A02(r7, r5)
            X.4uZ r4 = r5.A00
            boolean r7 = X.C627336j.A0K(r4)
            r6 = 7
            if (r7 == 0) goto L_0x088e
            r3 = 401(0x191, float:5.62E-43)
            if (r2 != r3) goto L_0x088e
            X.3Lv r9 = r0.A0S
            X.2sd r7 = r0.A19
            X.2sH r2 = r0.A0L
            long r2 = r2.A0H()
            X.2z0 r8 = X.C56832sd.A01(r4, r7, r10)
            r7 = 8
            X.1p1 r2 = X.C31891p1.A02(r8, r7, r2)
            r9.A0V(r2)
            r0.A03(r1, r5, r6)
            X.2sj r2 = r0.A0T
            r1 = r4
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            boolean r1 = r2.A0C(r1)
            if (r1 == 0) goto L_0x087a
            X.3Lq r5 = r0.A0i
            X.1fJ r3 = X.AnonymousClass34R.A02(r4)
            X.2sr r1 = r0.A05
            X.1RR r1 = X.C56972sr.A01(r1)
            X.C626936e.A06(r1)
            X.4uZ r1 = r1.A0H
            X.C626936e.A06(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r5.A0Q(r3, r1)
            X.3Wi r2 = r5.A05
            r1 = 12
            X.C69263Wi.A04(r2, r5, r3, r1)
        L_0x087a:
            X.5rC r1 = r0.A02
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0a4a
            if (r4 == 0) goto L_0x0a4a
            r1.A04()
            java.lang.String r0 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x088e:
            r3 = 405(0x195, float:5.68E-43)
            if (r2 == r3) goto L_0x08bf
            if (r7 != 0) goto L_0x08a2
            r3 = 403(0x193, float:5.65E-43)
            if (r2 != r3) goto L_0x08d8
            r0.A03(r1, r5, r6)
            X.2sq r2 = r0.A0D
            r1 = 0
            r2.A0K(r1)
            goto L_0x087a
        L_0x08a2:
            r3 = 420(0x1a4, float:5.89E-43)
            if (r2 != r3) goto L_0x08c3
            X.3Lv r11 = r0.A0S
            X.2sd r7 = r0.A19
            X.2sH r2 = r0.A0L
            long r2 = r2.A0H()
            r9 = 33
            X.2aD r8 = r7.A03
            X.2z0 r7 = X.C56832sd.A00(r4, r7)
            X.1mI r2 = r8.A00(r7, r9, r2)
            r11.A0V(r2)
        L_0x08bf:
            r0.A03(r1, r5, r6)
            goto L_0x087a
        L_0x08c3:
            r3 = 460(0x1cc, float:6.45E-43)
            if (r2 != r3) goto L_0x08d8
            r2 = 21
            r0.A03(r1, r5, r2)
            X.3Lr r3 = r0.A0j
            r2 = r4
            X.1fJ r2 = (X.C27991fJ) r2
            java.lang.String r1 = "send_failure"
            r3.A0E(r2, r1, r10)
            goto L_0x087a
        L_0x08d8:
            if (r1 == 0) goto L_0x0917
            X.34w r3 = r1.A0P
            if (r3 == 0) goto L_0x0917
            int r3 = r1.A0D
            r0.A03(r1, r5, r6)
            X.34w r11 = r1.A0P
            boolean r5 = r11.A0L()
            r15 = 406(0x196, float:5.69E-43)
            if (r5 == 0) goto L_0x08ef
            r15 = 13
        L_0x08ef:
            X.2sH r5 = r0.A0L
            long r12 = r5.A0H()
            X.34w r5 = r1.A0P
            java.lang.String r14 = r5.A0H
            java.lang.String r16 = java.lang.Integer.toString(r2)
            r17 = 0
            r11.A07(r12, r14, r15, r16, r17)
            X.9U4 r2 = r0.A12
            X.36F r11 = r2.A0A()
            X.2z0 r2 = r1.A1J
            X.34w r1 = r1.A0P
            r16 = 0
            r15 = 0
            r12 = r1
            r13 = r2
            r14 = r3
            r11.A0g(r12, r13, r14, r15, r16)
            goto L_0x087a
        L_0x0917:
            boolean r3 = r1 instanceof X.C30791n7
            if (r3 == 0) goto L_0x094a
            r3 = 473(0x1d9, float:6.63E-43)
            if (r2 != r3) goto L_0x094a
            X.30C r7 = r0.A0K
            r3 = r1
            X.1n7 r3 = (X.C30791n7) r3
            java.lang.String r2 = "review_and_pay"
            boolean r2 = r7.A04(r3, r2)
            if (r2 != 0) goto L_0x08bf
            java.lang.String r2 = "review_order"
            boolean r2 = r7.A04(r3, r2)
            if (r2 != 0) goto L_0x08bf
            java.lang.String r2 = "payment_method"
            boolean r2 = r7.A04(r3, r2)
            if (r2 != 0) goto L_0x08bf
            java.lang.String r2 = "payment_status"
            boolean r2 = r7.A04(r3, r2)
            if (r2 == 0) goto L_0x087a
            goto L_0x08bf
        L_0x094a:
            boolean r3 = r4 instanceof X.C95804uY
            if (r3 == 0) goto L_0x0958
            X.2T6 r6 = r0.A10
            X.4FS r3 = r6.A06
            r1 = 6
            X.C71713cY.A00(r3, r6, r5, r2, r1)
            goto L_0x087a
        L_0x0958:
            X.5rC r6 = r0.A03
            boolean r3 = r6.A07()
            if (r3 == 0) goto L_0x0977
            r3 = 430(0x1ae, float:6.03E-43)
            if (r2 == r3) goto L_0x096c
            r3 = 432(0x1b0, float:6.05E-43)
            if (r2 == r3) goto L_0x096c
            r3 = 433(0x1b1, float:6.07E-43)
            if (r2 != r3) goto L_0x0977
        L_0x096c:
            r6.A04()
            java.lang.String r0 = "setReceivedCertRelatedNack"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0977:
            r2 = 20
            r0.A03(r1, r5, r2)
            goto L_0x087a
        L_0x097e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x097e }
            throw r0
        L_0x0981:
            java.lang.Object r2 = r7.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r1 = "messageCount"
            int r2 = r2.getInt(r1)
            X.2UP r3 = r0.A17
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "OfflineResumeHandler/onOfflineComplete "
            X.C18260x0.A0w(r0, r1, r2)
            if (r2 != 0) goto L_0x09a5
            X.3Qt r0 = r3.A0R
            android.util.SparseArray r0 = r0.A00
            monitor-enter(r0)
            r0.clear()     // Catch:{ all -> 0x09a1 }
            goto L_0x09a4
        L_0x09a1:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x09a4:
            monitor-exit(r0)
        L_0x09a5:
            X.1ip r0 = r3.A07
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x09ba
            X.1VX r2 = r3.A0K
            r1 = 4315(0x10db, float:6.047E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r4 = 0
            if (r0 == 0) goto L_0x09bb
        L_0x09ba:
            r4 = 1
        L_0x09bb:
            X.1VX r1 = r3.A0K
            r0 = 6856(0x1ac8, float:9.607E-42)
            X.2vE r6 = X.C58422vE.A02
            boolean r5 = r1.A0Y(r6, r0)
            X.2Yh r2 = r3.A0Z
            r1 = 2
            X.3c2 r0 = new X.3c2
            r0.<init>(r3, r1, r4, r5)
            r2.A00(r0)
            X.3Cr r2 = r3.A0Y
            monitor-enter(r2)
            X.3Cp r0 = r2.A04     // Catch:{ all -> 0x0a4e }
            X.1VX r1 = r0.A06     // Catch:{ all -> 0x0a4e }
            r0 = 560(0x230, float:7.85E-43)
            boolean r0 = r1.A0Y(r6, r0)     // Catch:{ all -> 0x0a4e }
            if (r0 != 0) goto L_0x09e2
            r2.A00()     // Catch:{ all -> 0x0a4e }
        L_0x09e2:
            monitor-exit(r2)
            X.3Cj r1 = r3.A0X
            monitor-enter(r1)
            boolean r0 = r1.A02     // Catch:{ all -> 0x0a4b }
            if (r0 != 0) goto L_0x09ee
            r0 = 0
            r1.A00(r0)     // Catch:{ all -> 0x0a4b }
        L_0x09ee:
            monitor-exit(r1)
            X.2ay r0 = r3.A0L
            int r6 = r0.A00()
            if (r6 == 0) goto L_0x0a03
            X.3XH r5 = r3.A0M
            r2 = 0
            android.os.Handler r1 = r5.A01
            java.lang.Runnable r0 = r5.A0A
            r1.removeCallbacks(r0)
            r5.A00 = r2
        L_0x0a03:
            X.4FS r2 = r3.A0b
            r0 = 4
            X.3cJ r1 = new X.3cJ
            r1.<init>((java.lang.Object) r3, (int) r6, (int) r0)
            java.lang.String r0 = "OfflineResumeHandler/onOfflineComplete-retry-media-download"
            r2.BkN(r1, r0)
            r0 = 20
            X.3bq r1 = new X.3bq
            r1.<init>((java.lang.Object) r3, (int) r0)
            java.lang.String r0 = "OfflineResumeHandler/onOfflineComplete-zombie-cleanup"
            r2.BkN(r1, r0)
            r0 = 21
            X.3bq r1 = new X.3bq
            r1.<init>((java.lang.Object) r3, (int) r0)
            java.lang.String r0 = "OfflineResumeHandler/onOfflineComplete channel orphan my reaction processing"
            r2.BkN(r1, r0)
            if (r4 != 0) goto L_0x0a4a
            r0 = 0
            X.AnonymousClass2UP.A00(r3, r0)
            return r10
        L_0x0a30:
            java.lang.Object r3 = r7.obj
            android.os.BaseBundle r3 = (android.os.BaseBundle) r3
            java.lang.String r1 = "messageCount"
            int r2 = r3.getInt(r1)
            java.lang.String r1 = "receiptCount"
            r3.getInt(r1)
            java.lang.String r1 = "notificationCount"
            r3.getInt(r1)
            X.2UP r0 = r0.A17
            r0.A0d = r2
        L_0x0a4a:
            return r10
        L_0x0a4b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0a4e:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0a51:
            java.lang.Object r3 = r7.obj
            X.2Tp r3 = (X.C43822Tp) r3
            java.lang.String r2 = "peer"
            java.lang.String r1 = r3.A06
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0b68
            X.2Tv r9 = r0.A0s
            X.39T r8 = r3.A05
            X.2z0 r7 = r3.A02
            byte[] r6 = r3.A0A
            int r5 = r3.A00
            long r1 = r3.A01
            byte[] r0 = r3.A09
            r24 = r0
            byte[] r0 = r3.A08
            r25 = r0
            X.2Ov r12 = r3.A04
            X.2Ov r11 = r3.A03
            boolean r13 = r3.A07
            com.whatsapp.jid.Jid r0 = r8.A02
            com.whatsapp.jid.DeviceJid r4 = com.whatsapp.jid.DeviceJid.of(r0)
            r3 = 0
            byte r0 = r6[r3]
            int r3 = X.C18290x4.A07(r6, r0, r3)
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/got retry request from peer "
            r14.append(r0)
            r14.append(r4)
            java.lang.String r0 = " retryCount "
            r14.append(r0)
            r14.append(r5)
            java.lang.String r0 = " for "
            r14.append(r0)
            java.lang.String r15 = r7.A01
            r14.append(r15)
            java.lang.String r0 = " with "
            r14.append(r0)
            r14.append(r3)
            java.lang.String r0 = " originally sent at "
            X.C18260x0.A12(r0, r14, r1)
            if (r4 == 0) goto L_0x0b1c
            X.2sr r0 = r9.A00
            boolean r0 = r0.A0b(r4)
            if (r0 == 0) goto L_0x0b1c
            X.318 r0 = r9.A07
            X.6aS r0 = r0.A04()
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0b1c
            X.2rl r0 = r9.A08
            X.1mE r14 = r0.A03(r4, r15)
            if (r14 != 0) goto L_0x0af1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/invalid peer message: "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " device: "
        L_0x0ade:
            r1.append(r0)
            r1.append(r4)
        L_0x0ae4:
            java.lang.String r0 = r1.toString()
        L_0x0ae8:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.33S r0 = r9.A09
            r0.A01(r8)
            return r10
        L_0x0af1:
            long r0 = r14.A0K
            X.2sH r2 = r9.A03
            long r17 = r2.A0H()
            r15 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r17 = r17 - r15
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x0b07
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/cannot send retry to older message"
            goto L_0x0ae8
        L_0x0b07:
            X.3Ek r0 = r9.A02
            r0.A0E(r14, r5)
            r0 = 4
            if (r5 <= r0) goto L_0x0b23
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/skipping retry for "
            r1.append(r0)
            r1.append(r7)
            goto L_0x0ae4
        L_0x0b1c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/got peer message retry from device other than my companion: "
            goto L_0x0ade
        L_0x0b23:
            X.33n r0 = r9.A04
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0b85
            X.4FS r1 = r9.A0B
            X.3bh r0 = new X.3bh
            r26 = r5
            r27 = r3
            r28 = r13
            r15 = r0
            r16 = r4
            r17 = r9
            r18 = r7
            r19 = r12
            r20 = r11
            r21 = r8
            r22 = r14
            r23 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0b64
        L_0x0b4a:
            X.2re r6 = r0.A0k
            if (r18 != 0) goto L_0x0b53
            X.4uZ r13 = X.AnonymousClass2z0.A01(r8)
            r4 = 0
        L_0x0b53:
            boolean r2 = r7.A02
            X.4FS r1 = r6.A0R
            X.3bB r0 = new X.3bB
            r11 = r0
            r12 = r4
            r14 = r5
            r15 = r6
            r16 = r3
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
        L_0x0b64:
            r1.BkM(r0)
            return r10
        L_0x0b68:
            X.2da r2 = r0.A18
            X.33n r0 = r2.A0A
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0b7a
            X.4FS r1 = r2.A0U
            r0 = 29
            X.C70133a0.A01(r1, r2, r3, r0)
            return r10
        L_0x0b7a:
            X.2fm r1 = r2.A0B
            r0 = 30
            X.3a0 r2 = X.C70133a0.A00(r2, r3, r0)
            java.util.concurrent.ThreadPoolExecutor r0 = r1.A00
            goto L_0x0ba5
        L_0x0b85:
            X.2fm r0 = r9.A05
            X.3bh r2 = new X.3bh
            r26 = r5
            r27 = r3
            r28 = r13
            r15 = r2
            r16 = r4
            r17 = r9
            r18 = r7
            r19 = r12
            r20 = r11
            r21 = r8
            r22 = r14
            r23 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
        L_0x0ba5:
            r0.execute(r2)
            return r10
        L_0x0ba9:
            java.lang.Object r6 = r7.obj
            X.4FR r6 = (X.AnonymousClass4FR) r6
            r5 = 12
            X.39T r4 = r6.BpU()
            java.util.Set r3 = r0.A1F
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0bcb
            boolean r1 = r3.contains(r4)     // Catch:{ all -> 0x0beb }
            if (r1 != 0) goto L_0x0bd9
            X.3Mh r2 = r0.A09     // Catch:{ all -> 0x0beb }
            X.1Ei r1 = X.C66663Mh.A0r     // Catch:{ all -> 0x0beb }
            boolean r1 = r2.A08(r1)     // Catch:{ all -> 0x0beb }
            if (r1 == 0) goto L_0x0bcb
            r3.add(r4)     // Catch:{ all -> 0x0beb }
        L_0x0bcb:
            r2 = 44
            X.3aM r1 = new X.3aM     // Catch:{ all -> 0x0beb }
            r1.<init>(r0, r6, r4, r2)     // Catch:{ all -> 0x0beb }
            X.2m9 r0 = r0.A0Q     // Catch:{ all -> 0x0beb }
            r0.A02(r1, r5)     // Catch:{ all -> 0x0beb }
        L_0x0bd7:
            monitor-exit(r3)     // Catch:{ all -> 0x0beb }
            goto L_0x0bea
        L_0x0bd9:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0beb }
            java.lang.String r1 = "MessagingXmppHandler/onMessageStatusUpdate receipt in queue; skipping stanzaKey:"
            X.C18260x0.A1R(r2, r1, r4)     // Catch:{ all -> 0x0beb }
            X.2r5 r2 = r0.A0y     // Catch:{ all -> 0x0beb }
            long r0 = r4.A00     // Catch:{ all -> 0x0beb }
            r2.A05(r0)     // Catch:{ all -> 0x0beb }
            goto L_0x0bd7
        L_0x0bea:
            return r10
        L_0x0beb:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0beb }
            throw r1
        L_0x0bee:
            java.lang.Object r1 = r7.obj
            X.2LO r1 = (X.AnonymousClass2LO) r1
            X.3ST r3 = r1.A00
            java.util.Map r6 = r1.A01
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessagingXmppHandler/onMessageForMe id="
            r5.append(r1)
            java.lang.String r1 = r3.A1B
            r5.append(r1)
            java.lang.String r1 = " t="
            r5.append(r1)
            long r1 = r3.A16
            r5.append(r1)
            java.lang.String r4 = " now="
            X.C18290x4.A1Q(r5, r4)
            java.lang.String r4 = " retry="
            r5.append(r4)
            int r4 = r3.BCI()
            r5.append(r4)
            java.lang.String r4 = " offline="
            r5.append(r4)
            java.lang.Integer r4 = r3.A0W
            r5.append(r4)
            java.lang.String r4 = " edit="
            r5.append(r4)
            int r4 = r3.A01
            X.C18260x0.A1G(r5, r4)
            com.whatsapp.jid.Jid r4 = r3.A18
            r19 = r4
            X.4uZ r4 = X.C627336j.A02(r19)
            boolean r4 = r4 instanceof X.C135166kE
            if (r4 == 0) goto L_0x0c74
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r1 + r4
            X.2sH r4 = r0.A0L
            long r7 = r4.A0H()
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0c74
            X.2a1 r4 = r3.A0N
            if (r4 != 0) goto L_0x0c74
            X.33Y r4 = r0.A0v
            java.lang.String r2 = "status-old"
            r1 = 0
            r4.A09(r3, r2, r1)
        L_0x0c5b:
            X.3XH r5 = r0.A0l
            java.lang.Integer r0 = r3.A0W
            boolean r4 = X.AnonymousClass000.A1W(r0)
            android.os.Handler r3 = r5.A01
            java.lang.Runnable r2 = r5.A0A
            r3.removeCallbacks(r2)
            if (r4 == 0) goto L_0x0c71
            r0 = 15000(0x3a98, double:7.411E-320)
            r3.postDelayed(r2, r0)
        L_0x0c71:
            r5.A00 = r4
            return r10
        L_0x0c74:
            X.4uZ r4 = X.C627336j.A02(r19)
            boolean r4 = r4 instanceof X.C95804uY
            if (r4 == 0) goto L_0x0d08
            X.1EU r4 = r3.A0M
            if (r4 != 0) goto L_0x0cec
            int r5 = r3.A01
            r4 = 8
            if (r5 == r4) goto L_0x0cec
            X.2iD r11 = r0.A0z
            X.2z0 r4 = r3.A0Q
            boolean r4 = r4.A02
            if (r4 == 0) goto L_0x0c5b
            java.lang.String r5 = r3.A0v
            java.lang.String r4 = "reaction"
            boolean r4 = X.C162457s7.A0P(r5, r4)
            if (r4 != 0) goto L_0x0caf
            java.lang.String r5 = r3.A0v
            java.lang.String r4 = "poll"
            boolean r4 = X.C162457s7.A0P(r5, r4)
            if (r4 == 0) goto L_0x0c5b
            java.lang.String r5 = r3.A0r
            java.lang.String r4 = "vote"
            boolean r4 = X.C162457s7.A0P(r5, r4)
            if (r4 == 0) goto L_0x0c5b
        L_0x0caf:
            X.4uZ r12 = X.C627336j.A02(r19)
            X.4uY r12 = (X.C95804uY) r12
            java.lang.Long r4 = r3.A0Z
            if (r12 == 0) goto L_0x0ce2
            if (r4 == 0) goto L_0x0ce2
            long r14 = r4.longValue()
            java.lang.String r13 = r3.A0s
            r16 = r1
            r11.A00(r12, r13, r14, r16)
            java.util.Set r13 = r3.A0w
            r11.A01(r12, r13, r14, r16)
            r1 = 0
        L_0x0ccc:
            X.39T r5 = r3.BDD(r1)
            X.31C r4 = r11.A04
            X.1VX r2 = r11.A03
            X.2qk r1 = r11.A00
            android.os.Message r1 = X.AnonymousClass36N.A03(r1, r2, r5)
            X.C162457s7.A0D(r1)
            r4.A0J(r1)
            goto L_0x0c5b
        L_0x0ce2:
            X.36E r4 = r11.A01
            r2 = 0
            r1 = 5
            r4.A0Q(r3, r2, r1)
            java.lang.String r1 = "491"
            goto L_0x0ccc
        L_0x0cec:
            java.lang.Long r1 = r3.A0Z
            if (r1 != 0) goto L_0x0d03
            r8 = -1
        L_0x0cf2:
            X.2iD r5 = r0.A0z
            X.3dI r1 = r5.A0A
            r7 = 12
            X.3aF r4 = new X.3aF
            r6 = r3
            r4.<init>(r5, r6, r7, r8)
            r1.execute(r4)
            goto L_0x0c5b
        L_0x0d03:
            long r8 = r1.longValue()
            goto L_0x0cf2
        L_0x0d08:
            X.3Mg r4 = r0.A0r
            boolean r4 = X.C66653Mg.A00(r4)
            if (r4 == 0) goto L_0x0dc2
            X.2vU r7 = r0.A0F
            X.2r5 r9 = r7.A02
            long r4 = r3.A07
            r8 = 0
            X.2rb r5 = r9.A01(r8, r4)
            if (r5 == 0) goto L_0x0d21
            r4 = 7
            r5.A03(r4)
        L_0x0d21:
            X.2z0 r12 = r3.A0R
            r9 = r12
            if (r12 != 0) goto L_0x0d28
            X.2z0 r12 = r3.A0Q
        L_0x0d28:
            X.4uZ r11 = r12.A00
            r8 = 0
            if (r11 == 0) goto L_0x0d3d
            boolean r4 = X.C627336j.A0K(r11)
            if (r4 == 0) goto L_0x0d48
            boolean r4 = r12.A02
            if (r4 != 0) goto L_0x0d48
            com.whatsapp.jid.UserJid r14 = r3.BCo()
            if (r14 != 0) goto L_0x0d49
        L_0x0d3d:
            if (r9 != 0) goto L_0x0d41
            X.2z0 r9 = r3.A0Q
        L_0x0d41:
            r11 = 0
            if (r8 == 0) goto L_0x0dc2
            X.4uZ r2 = r8.A01
            monitor-enter(r7)
            goto L_0x0d5a
        L_0x0d48:
            r14 = r8
        L_0x0d49:
            boolean r5 = r12.A02
            java.lang.String r4 = r12.A01
            X.2pH r8 = new X.2pH
            r12 = r8
            r13 = r11
            r15 = r4
            r16 = r1
            r18 = r5
            r12.<init>(r13, r14, r15, r16, r18)
            goto L_0x0d3d
        L_0x0d5a:
            java.util.Set r13 = r7.A00     // Catch:{ all -> 0x0f77 }
            if (r13 != 0) goto L_0x0dbd
            X.34v r12 = r7.A01     // Catch:{ all -> 0x0f77 }
            r1 = 3
            X.4JH r5 = new X.4JH     // Catch:{ all -> 0x0f77 }
            r5.<init>(r1)     // Catch:{ all -> 0x0f77 }
            java.util.HashSet r13 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0f77 }
            X.4GK r16 = X.C18630y0.A01(r12)     // Catch:{ all -> 0x0f77 }
            r1 = r16
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0f6d }
            X.2sg r14 = r1.A03     // Catch:{ all -> 0x0f6d }
            java.lang.String r4 = "SELECT mutation_index, chat_jid FROM syncd_mutations WHERE chat_jid IS NOT NULL  AND are_dependencies_missing = 1"
            java.lang.String r1 = "SyncdMutationsTable.SELECT_ALL_CHAT_JIDS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            android.database.Cursor r4 = X.C56862sg.A01(r14, r4, r1)     // Catch:{ all -> 0x0f6d }
        L_0x0d7c:
            boolean r1 = r4.moveToNext()     // Catch:{ all -> 0x0f61 }
            if (r1 == 0) goto L_0x0db5
            java.lang.String r1 = "mutation_index"
            java.lang.String r14 = X.AnonymousClass0x2.A0Z(r4, r1)     // Catch:{ all -> 0x0f61 }
            X.2j3 r15 = r12.A02     // Catch:{ all -> 0x0f61 }
            java.lang.String r1 = X.AnonymousClass35M.A00(r14)     // Catch:{ all -> 0x0f61 }
            X.C162457s7.A0J(r1, r11)     // Catch:{ all -> 0x0f61 }
            X.2sc r1 = r15.A00(r1)     // Catch:{ all -> 0x0f61 }
            if (r1 == 0) goto L_0x0d7c
            boolean r1 = r1.A0C()     // Catch:{ all -> 0x0f61 }
            if (r1 == 0) goto L_0x0d7c
            boolean r1 = r5.B23(r14)     // Catch:{ all -> 0x0f61 }
            if (r1 == 0) goto L_0x0d7c
            java.lang.String r1 = "chat_jid"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0f61 }
            X.4uZ r1 = X.AnonymousClass0x2.A0K(r4, r1)     // Catch:{ all -> 0x0f61 }
            X.C626936e.A06(r1)     // Catch:{ all -> 0x0f61 }
            r13.add(r1)     // Catch:{ all -> 0x0f61 }
            goto L_0x0d7c
        L_0x0db5:
            r4.close()     // Catch:{ all -> 0x0f6d }
            r16.close()     // Catch:{ all -> 0x0f77 }
            r7.A00 = r13     // Catch:{ all -> 0x0f77 }
        L_0x0dbd:
            boolean r1 = r13.contains(r2)     // Catch:{ all -> 0x0f77 }
            goto L_0x0e26
        L_0x0dc2:
            boolean r1 = r3.A11
            if (r1 == 0) goto L_0x0dd3
            X.2Yh r2 = r0.A15
            r1 = 25
            X.3a0 r1 = X.C70133a0.A00(r0, r3, r1)
            r2.A00(r1)
            goto L_0x0c5b
        L_0x0dd3:
            X.4uZ r1 = X.C627336j.A02(r19)
            boolean r1 = X.C57372tX.A01(r1)
            if (r1 == 0) goto L_0x0f0c
            com.whatsapp.jid.Jid r1 = r3.A0E
            java.util.Objects.requireNonNull(r1)
            boolean r1 = X.C57372tX.A00(r1)
            if (r1 == 0) goto L_0x0f0c
            X.36E r5 = r0.A06
            X.4uZ r1 = X.C627336j.A02(r19)
            int r4 = r1.getType()
            r1 = 5
            if (r4 != r1) goto L_0x0e15
            r2 = 72
        L_0x0df7:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0dfb:
            r1 = 12
            r5.A0Q(r3, r2, r1)
            X.1VX r4 = r0.A0g
            r2 = 3280(0xcd0, float:4.596E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r4.A0Y(r1, r2)
            if (r1 == 0) goto L_0x0ea2
            X.33Y r2 = r0.A0v
            r1 = 493(0x1ed, float:6.91E-43)
            r2.A08(r3, r1)
            goto L_0x0c5b
        L_0x0e15:
            r2 = 73
            if (r4 == r10) goto L_0x0df7
            r1 = 3
            r2 = 74
            if (r4 == r1) goto L_0x0df7
            r1 = 6
            if (r4 != r1) goto L_0x0e24
            r2 = 75
            goto L_0x0df7
        L_0x0e24:
            r2 = 0
            goto L_0x0dfb
        L_0x0e26:
            monitor-exit(r7)
            if (r1 == 0) goto L_0x0dc2
            X.34v r7 = r7.A01
            r1 = 4
            X.4JH r5 = new X.4JH
            r5.<init>(r1)
            java.lang.String[] r4 = new java.lang.String[r10]
            X.C18280x3.A0w(r2, r4, r11)
            java.lang.String r2 = "SyncdMutationsTable.SELECT_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.lang.String r1 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid == ? AND are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.List r5 = r7.A08(r5, r1, r2, r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x0e42:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0f08
            X.33W r2 = X.C18320x8.A0K(r4)
            boolean r1 = r2 instanceof X.C23291Sa
            if (r1 == 0) goto L_0x0e42
            X.1Sa r2 = (X.C23291Sa) r2
            X.2z0 r1 = r2.A01
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0e42
            r17 = 1
        L_0x0e5c:
            java.util.Iterator r16 = r5.iterator()
        L_0x0e60:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0dc2
            X.33W r2 = X.C18320x8.A0K(r16)
            boolean r12 = r2 instanceof X.AnonymousClass1SU
            if (r12 != 0) goto L_0x0ea9
            boolean r1 = r2 instanceof X.AnonymousClass1ST
            if (r1 != 0) goto L_0x0ea9
            boolean r1 = r2 instanceof X.AnonymousClass1SZ
            if (r1 == 0) goto L_0x0e60
            r1 = r2
            X.1SZ r1 = (X.AnonymousClass1SZ) r1
            X.2z0 r1 = r1.A02
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0e60
            r2.A0A(r11)
            java.util.Set r1 = java.util.Collections.singleton(r2)
            r7.A0H(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SyncdDeleteMessageRangeHelper/checkIfMessageNeedsToBeDeleted deleteForMeMutation: deletedId = "
            r2.append(r1)
            java.lang.String r1 = r8.A03
            r2.append(r1)
        L_0x0e99:
            X.C18280x3.A14(r2)
            X.36E r2 = r0.A06
            r1 = 0
            r2.A0Q(r3, r1, r10)
        L_0x0ea2:
            X.33Y r1 = r0.A0v
            r1.A07(r3)
            goto L_0x0c5b
        L_0x0ea9:
            r1 = r2
            X.49s r1 = (X.C837749s) r1
            X.35N r13 = r1.B9b()
            if (r12 == 0) goto L_0x0eba
            X.1SU r2 = (X.AnonymousClass1SU) r2
            boolean r1 = r2.A03
            if (r1 != 0) goto L_0x0eba
            if (r17 != 0) goto L_0x0e60
        L_0x0eba:
            long r4 = r8.A00
            long r1 = r13.A00
            int r14 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r14 >= 0) goto L_0x0ee6
            java.lang.String r14 = "MessageRangeUtil/isKeyEnclosedByRange enclosed by the range"
            com.whatsapp.util.Log.i((java.lang.String) r14)
            long r14 = X.AnonymousClass33E.A00(r1, r4)
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x0ee6
        L_0x0ecf:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SyncdDeleteMessageRangeHelper/checkIfMessageNeedsToBeDeleted: deletedId = "
            r2.append(r1)
            java.lang.String r1 = r8.A03
            r2.append(r1)
            java.lang.String r1 = "; isClearChat="
            r2.append(r1)
            r2.append(r12)
            goto L_0x0e99
        L_0x0ee6:
            java.util.Set r1 = r13.A02
            boolean r5 = r1.contains(r8)
            java.util.Set r1 = r13.A03
            boolean r4 = r1.contains(r8)
            if (r5 != 0) goto L_0x0ef6
            if (r4 == 0) goto L_0x0e60
        L_0x0ef6:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessageRangeUtil/isKeyEnclosedByRange messageRangeContains:"
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " messagesWithoutTimestampContains:"
            X.C18260x0.A1E(r1, r2, r4)
            goto L_0x0ecf
        L_0x0f08:
            r17 = 0
            goto L_0x0e5c
        L_0x0f0c:
            r0.A05(r3)
            X.4BY r2 = r0.A1C
            X.4uZ r1 = X.C627336j.A02(r19)
            X.4uZ r4 = r2.BLb(r1)
            X.3ZC r2 = r3.A0T
            if (r4 == 0) goto L_0x0f37
            X.2rt r1 = r0.A0Y
            boolean r1 = r1.A07(r4)
            if (r1 != 0) goto L_0x0f37
            if (r2 == 0) goto L_0x0f37
            int r1 = r2.actualActors
            if (r1 != 0) goto L_0x0f44
            long r4 = r2.privacyModeTs
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0f44
            int r1 = r2.hostStorage
            if (r1 != 0) goto L_0x0f44
        L_0x0f37:
            com.whatsapp.jid.Jid r1 = r3.BCm()
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r1)
            r0.A01(r1, r3, r6)
            goto L_0x0c5b
        L_0x0f44:
            java.lang.String r1 = "MessagingXmppHandler/Incoming message from a new BIZ, ensure verified name is updated"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            byte[] r7 = r3.A15
            if (r7 == 0) goto L_0x0f5b
            X.2rx r5 = r0.A0I
            com.whatsapp.jid.UserJid r4 = r3.BCo()
            int r2 = r3.A06
            X.3ZC r1 = r3.A0T
            r5.A05(r4, r1, r7, r2)
            goto L_0x0f37
        L_0x0f5b:
            java.lang.String r1 = "MessagingXmppHandler/Missing vname cert"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x0f37
        L_0x0f61:
            r1 = move-exception
            if (r4 == 0) goto L_0x0f6c
            r4.close()     // Catch:{ all -> 0x0f68 }
            goto L_0x0f6c
        L_0x0f68:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0f6d }
        L_0x0f6c:
            throw r1     // Catch:{ all -> 0x0f6d }
        L_0x0f6d:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0f72 }
            goto L_0x0f76
        L_0x0f72:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0f77 }
        L_0x0f76:
            throw r1     // Catch:{ all -> 0x0f77 }
        L_0x0f77:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67753Qn.BFA(android.os.Message, int):boolean");
    }

    public final int A00(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String A0X2;
        if (bArr2 == null) {
            return 1;
        }
        if (bArr == null) {
            A0X2 = "MessagingXmppHandler/validateServerErrorEncData/badmediadata;";
        } else if (bArr3 == null) {
            A0X2 = "MessagingXmppHandler/validateServerErrorEncData/incomplete enc data";
        } else {
            C162457s7.A0J(str, 2);
            C59432wu.A00(bArr, bArr3);
            NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOO(1, str, bArr2, bArr, bArr3);
            if (nativeHolder != null) {
                C58302v2 r0 = new C58302v2(nativeHolder);
                JniBridge.getInstance();
                NativeHolder nativeHolder2 = r0.A00;
                long j = (long) 34;
                if (str.equals(JniBridge.jvidispatchOIO(1, j, nativeHolder2))) {
                    return 1;
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("MessagingXmppHandler/validateServerErrorEncData/incorrect stanza id; key=");
                A0o2.append(str);
                A0o2.append("; stanzaId=");
                JniBridge.getInstance();
                A0X2 = AnonymousClass000.A0X((String) JniBridge.jvidispatchOIO(1, j, nativeHolder2), A0o2);
            } else {
                Log.e("MessagingXmppHandler/validateServerErrorEncData/malformed enc data");
                return 3;
            }
        }
        Log.e(A0X2);
        return 0;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02da, code lost:
        if (X.C624134x.A0b(r7) == false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x031d, code lost:
        r8.A0F.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0326, code lost:
        if (r20.isEmpty() != false) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0328, code lost:
        r6.A0v.A0A(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0333, code lost:
        if (r19.isEmpty() != false) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0335, code lost:
        r6.A0w.A04(r19, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x033d, code lost:
        r0.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0340, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0342, code lost:
        if (r17 == false) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0344, code lost:
        r3 = r6.A0t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0350, code lost:
        if (r3.A00.A0Y(X.C58422vE.A01, 4429) != false) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0352, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r3.A03.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0358, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x035d, code lost:
        r6.A0w.A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008e, code lost:
        if (r2 < r14) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0090, code lost:
        if (r4 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        r4.A00 = (long) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r22.isEmpty() != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
        r6.A0U.A02(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (r21.isEmpty() != false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        r8 = r6.A0a;
        r8.A0B.A0G(r18, r21);
        r7 = X.AnonymousClass001.A0u(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        if (r7.hasNext() == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        r0 = X.AnonymousClass001.A0w(r7);
        r4 = r8.A0F;
        r4.A03().post(new X.C70123Zz(r4, 25, r0.getKey()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0135, code lost:
        r15 = r8.A00;
        r11 = r8.A01;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x017a A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass4FR r39, long r40) {
        /*
            r38 = this;
            r6 = r38
            X.2m9 r0 = r6.A0Q
            r0.A00()
            r37 = r39
            X.39T r5 = r37.BpU()
            X.2r5 r3 = r6.A0y
            if (r5 == 0) goto L_0x0319
            long r1 = r5.A00
        L_0x0013:
            r0 = 1
            X.2rb r4 = r3.A01(r0, r1)
            X.1gT r4 = (X.C28261gT) r4
            if (r4 == 0) goto L_0x0020
            r0 = 3
            r4.A03(r0)
        L_0x0020:
            java.util.ArrayList r22 = X.AnonymousClass001.A0s()
            java.util.HashSet r21 = X.AnonymousClass002.A0K()
            java.util.ArrayList r20 = X.AnonymousClass001.A0s()
            java.util.HashSet r19 = X.AnonymousClass002.A0K()
            java.util.HashMap r18 = X.AnonymousClass001.A0t()
            if (r5 == 0) goto L_0x0316
            com.whatsapp.jid.UserJid r3 = r5.A03
        L_0x0038:
            boolean r17 = r37.BIF()
            X.33M r16 = new X.33M
            r1 = 0
            r0 = r16
            r0.<init>((boolean) r1)
            r16.A09()
            int r14 = r37.size()
            if (r4 == 0) goto L_0x0050
            long r0 = (long) r14
            r4.A01 = r0
        L_0x0050:
            r2 = 0
        L_0x0051:
            if (r2 >= r14) goto L_0x008e
            long r7 = r16.A06()
            int r0 = (r7 > r40 ? 1 : (r7 == r40 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d6
            if (r4 == 0) goto L_0x0060
            long r0 = (long) r2
            r4.A00 = r0
        L_0x0060:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessagingXmppHandler/onMessageStatusUpdate: processed "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = " items in "
            r3.append(r0)
            long r0 = r16.A06()
            r3.append(r0)
            java.lang.String r0 = " msec.  Requeuing "
            r3.append(r0)
            int r0 = r14 - r2
            r3.append(r0)
            java.lang.String r0 = " items."
            X.C18260x0.A1M(r3, r0)
            X.2gy r1 = r6.A0B
            r0 = r37
            r0.Bkp(r1, r2)
        L_0x008e:
            if (r2 < r14) goto L_0x0095
            if (r4 == 0) goto L_0x0095
            long r0 = (long) r14
            r4.A00 = r0
        L_0x0095:
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x00a2
            X.300 r1 = r6.A0U
            r0 = r22
            r1.A02(r0)
        L_0x00a2:
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0322
            X.2iN r8 = r6.A0a
            X.33f r2 = r8.A0B
            r1 = r18
            r0 = r21
            r2.A0G(r1, r0)
            java.util.Iterator r7 = X.AnonymousClass001.A0u(r18)
        L_0x00b7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x031d
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r7)
            X.33b r4 = r8.A0F
            java.lang.Object r3 = r0.getKey()
            android.os.Handler r2 = r4.A03()
            r1 = 25
            X.3Zz r0 = new X.3Zz
            r0.<init>(r4, r1, r3)
            r2.post(r0)
            goto L_0x00b7
        L_0x00d6:
            r0 = r37
            com.whatsapp.jid.DeviceJid r10 = r0.BgX(r2)
            long r28 = r0.Bqj(r2)
            X.2z0 r8 = r0.BJV(r2)
            com.whatsapp.jid.Jid r1 = r37.Bj1()
            X.4uZ r7 = r8.A00
            boolean r0 = X.C627336j.A0K(r7)
            if (r0 != 0) goto L_0x0104
            boolean r0 = r7 instanceof X.C135166kE
            if (r0 != 0) goto L_0x0104
            boolean r0 = r7 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x0104
            boolean r0 = r7 instanceof X.C95804uY
            if (r0 != 0) goto L_0x0104
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0310
            boolean r0 = r1 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x0310
        L_0x0104:
            int r0 = r37.Bq7()
            if (r10 == 0) goto L_0x0125
            X.5rC r7 = r6.A01
            boolean r1 = r7.A07()
            if (r1 == 0) goto L_0x0125
            r7.A04()
            com.whatsapp.jid.UserJid r1 = r10.userJid
            boolean r1 = X.C155477ey.A00(r1)
            if (r1 == 0) goto L_0x0125
            if (r3 == 0) goto L_0x0125
            java.lang.String r1 = r8.A01
            X.2z0 r8 = X.AnonymousClass2z0.A04(r3, r1)
        L_0x0125:
            X.2qz r1 = r6.A1B
            X.34x r7 = r1.A05(r8)
            if (r7 != 0) goto L_0x020c
            X.33f r7 = r6.A0Z
            X.1mH r7 = r7.A08(r8)
            if (r7 != 0) goto L_0x020c
            X.4uZ r15 = r8.A00
            java.lang.String r11 = r8.A01
            r7 = 0
            X.34x r7 = X.C55832qz.A01(r15, r1, r11, r7)
            if (r7 != 0) goto L_0x020c
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessagingXmppHandler/updatetargetstatus/nosuchmessage: "
            X.C18260x0.A1S(r7, r1, r8)
            boolean r1 = X.AnonymousClass358.A01(r0)
            if (r1 == 0) goto L_0x0175
            X.2gd r9 = r6.A0V
            X.C626936e.A06(r10)
            X.2mB r7 = new X.2mB
            r30 = r7
            r31 = r10
            r32 = r3
            r33 = r0
            r34 = r28
            r30.<init>(r31, r32, r33, r34)
            long r0 = r7.A01
            r12 = 0
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x017e
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r7 = "orphanedreceiptstore/addorphanedreceiptsformessage/invalid timestamp: "
            X.C18260x0.A11(r7, r8, r0)
        L_0x0175:
            if (r4 == 0) goto L_0x017a
            r0 = 1
            r4.A04 = r0
        L_0x017a:
            int r2 = r2 + 1
            goto L_0x0051
        L_0x017e:
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r10 = "orphanedreceiptstore/addorphanedreceiptsformessage/key:"
            r12.append(r10)
            r12.append(r8)
            java.lang.String r10 = ";receipt:"
            X.C18260x0.A1R(r12, r10, r7)
            r10 = 6
            android.content.ContentValues r13 = X.AnonymousClass0x9.A07(r10)
            X.2sm r10 = r9.A01
            X.C626936e.A06(r15)
            X.C56922sm.A00(r13, r10, r15)
            java.lang.String r10 = "key_id"
            r13.put(r10, r11)
            boolean r10 = r8.A02
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.String r10 = "from_me"
            r13.put(r10, r11)
            X.34p r12 = r9.A02
            com.whatsapp.jid.DeviceJid r11 = r7.A02
            java.lang.Long r15 = X.C623334p.A03(r12, r11)
            java.lang.String r10 = "receipt_device_jid_row_id"
            r13.put(r10, r15)
            com.whatsapp.jid.UserJid r10 = r7.A03
            if (r10 == 0) goto L_0x01c9
            java.lang.Long r15 = X.C623334p.A03(r12, r10)
            java.lang.String r12 = "receipt_recipient_jid_row_id"
            r13.put(r12, r15)
        L_0x01c9:
            int r7 = r7.A00
            X.C18280x3.A0m(r13, r7)
            X.C18290x4.A19(r13, r0)
            X.3dV r0 = r9.A03     // Catch:{ SQLiteConstraintException -> 0x01f2 }
            X.4Fq r12 = r0.A04()     // Catch:{ SQLiteConstraintException -> 0x01f2 }
            r0 = r12
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01e8 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x01e8 }
            java.lang.String r1 = "receipt_orphaned"
            java.lang.String r0 = "addOrphanedReceiptsForMessage/INSERT_RECEIPT_ORPHANED"
            r9.A09(r1, r0, r13)     // Catch:{ all -> 0x01e8 }
            r12.close()     // Catch:{ SQLiteConstraintException -> 0x01f2 }
            goto L_0x0175
        L_0x01e8:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x01ed }
            goto L_0x01f1
        L_0x01ed:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteConstraintException -> 0x01f2 }
        L_0x01f1:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x01f2 }
        L_0x01f2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "orphanedreceiptstore/addorphanedreceiptsformessage/failed "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " "
            X.C18310x6.A1Q(r1, r0, r11)
            r1.append(r10)
            X.C18260x0.A0x(r0, r1, r7)
            goto L_0x0175
        L_0x020c:
            if (r3 == 0) goto L_0x023b
            boolean r1 = X.AnonymousClass2z0.A0D(r7)
            if (r1 == 0) goto L_0x023b
            X.4uZ r1 = r7.A0n()
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x023b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessagingXmppHandler/onMessageStatusUpdate: invalid message update. StanzaKey="
            X.C18260x0.A1Q(r1, r0, r5)
            X.2qk r8 = r6.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StanzaKey="
            java.lang.String r7 = X.AnonymousClass000.A0P(r5, r0, r1)
            java.lang.String r1 = "invalid_message_status_update"
            r0 = 0
            r8.A0A(r1, r0, r7)
            goto L_0x017a
        L_0x023b:
            X.2z0 r1 = r7.A1J
            X.4uZ r9 = r1.A00
            boolean r11 = r9 instanceof X.C95804uY
            if (r11 != 0) goto L_0x02a8
            boolean r11 = r7 instanceof X.C30331mH
            if (r11 == 0) goto L_0x02bb
            r8 = 17
            if (r0 != r8) goto L_0x028e
            r0 = r21
            r0.add(r1)
            r0 = r18
            java.lang.Number r10 = X.AnonymousClass0x9.A0p(r9, r0)
            if (r10 == 0) goto L_0x0262
            long r12 = r10.longValue()
            long r0 = r7.A1L
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x0266
        L_0x0262:
            java.lang.Long r10 = X.C624134x.A0A(r7)
        L_0x0266:
            X.33f r1 = r6.A0Z
            byte r0 = r7.A1I
            java.util.List r1 = r1.A0Z
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x017a
            r0 = r7
            X.1mH r0 = (X.C30331mH) r0
            X.2z0 r1 = r0.A1v()
            int r0 = r7.A0D
            if (r0 == r8) goto L_0x017a
            if (r1 == 0) goto L_0x017a
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x017a
            r0 = r18
            r0.put(r9, r10)
            goto L_0x017a
        L_0x028e:
            r1 = 15
            if (r0 == r1) goto L_0x0295
            r1 = 5
            if (r0 != r1) goto L_0x017a
        L_0x0295:
            X.3ZC r33 = r37.BiQ()
            r30 = r6
            r31 = r10
            r32 = r7
            r34 = r0
            r35 = r28
            r30.A07(r31, r32, r33, r34, r35)
            goto L_0x017a
        L_0x02a8:
            X.3ZC r26 = r37.BiQ()
            r23 = r6
            r24 = r10
            r25 = r7
            r27 = r0
            boolean r1 = r23.A07(r24, r25, r26, r27, r28)
            if (r1 == 0) goto L_0x017a
            goto L_0x02e1
        L_0x02bb:
            r11 = 17
            if (r0 != r11) goto L_0x02ee
            X.2r4 r1 = r6.A0u
            boolean r1 = r1.A05(r7)
            if (r1 == 0) goto L_0x02a8
            boolean r1 = r9 instanceof X.C135216kJ
            if (r1 != 0) goto L_0x02a8
            X.5rC r9 = r6.A01
            boolean r1 = r9.A07()
            if (r1 == 0) goto L_0x02dc
            r9.A04()
            boolean r1 = X.C624134x.A0b(r7)
            if (r1 != 0) goto L_0x02a8
        L_0x02dc:
            r1 = r20
        L_0x02de:
            r1.add(r7)
        L_0x02e1:
            boolean r0 = X.AnonymousClass300.A00(r8, r0)
            if (r0 == 0) goto L_0x017a
            r0 = r22
            r0.add(r8)
            goto L_0x017a
        L_0x02ee:
            r9 = 18
            if (r0 != r9) goto L_0x02a8
            X.3ZC r26 = r37.BiQ()
            r27 = 8
            r23 = r6
            r24 = r10
            r25 = r7
            boolean r9 = r23.A07(r24, r25, r26, r27, r28)
            if (r9 == 0) goto L_0x017a
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r9 = "MessagingXmppHandler/onMessageStatusUpdate: process self receipt, messageKey="
            X.C18260x0.A1P(r10, r9, r1)
            r1 = r19
            goto L_0x02de
        L_0x0310:
            com.whatsapp.jid.DeviceJid r10 = com.whatsapp.jid.DeviceJid.of(r1)
            goto L_0x0104
        L_0x0316:
            r3 = 0
            goto L_0x0038
        L_0x0319:
            r1 = 0
            goto L_0x0013
        L_0x031d:
            X.33b r0 = r8.A0F
            r0.A07()
        L_0x0322:
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x032f
            X.33Y r1 = r6.A0v
            r0 = r20
            r1.A0A(r0)
        L_0x032f:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x033d
            X.33S r2 = r6.A0w
            r1 = 1
            r0 = r19
            r2.A04(r0, r1)
        L_0x033d:
            r16.A07()
            if (r5 == 0) goto L_0x0362
            if (r17 == 0) goto L_0x035d
            X.2qD r3 = r6.A0t
            X.1VX r2 = r3.A00
            X.2vE r1 = X.C58422vE.A01
            r0 = 4429(0x114d, float:6.206E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 != 0) goto L_0x035d
            monitor-enter(r3)
            java.util.List r0 = r3.A03     // Catch:{ all -> 0x035a }
            r0.add(r5)     // Catch:{ all -> 0x035a }
            monitor-exit(r3)     // Catch:{ all -> 0x035a }
            goto L_0x035d
        L_0x035a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x035a }
            throw r0
        L_0x035d:
            X.33S r0 = r6.A0w
            r0.A01(r5)
        L_0x0362:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67753Qn.A02(X.4FR, long):void");
    }

    public final void A03(C624134x r5, AnonymousClass2z0 r6, int i) {
        if (r5 instanceof C30331mH) {
            C50562iN r3 = this.A0a;
            if (!C627636p.A0P(r3.A01, r5)) {
                Log.e("MessageAddOnSendRecvManager/cant use this method for messageAddOn not from self");
            } else {
                r3.A04.A01(new C71343bx(r3, 9, r5), 57);
            }
        } else if (r5 != null) {
            r5.A1G(i);
            this.A0S.A0b(r5, 23);
        } else {
            C18260x0.A1S(AnonymousClass001.A0o(), "MessagingXmppHandler/onMessageError/bounce unable to find message ", r6);
        }
    }

    public final void A04(AnonymousClass2z0 r14, boolean z, boolean z2) {
        Object A032;
        long j;
        long j2;
        AnonymousClass2z0 r6 = r14;
        HashSet A152 = AnonymousClass0x9.A15(this.A0X.A01(r14));
        C56972sr r0 = this.A05;
        if (z2) {
            A032 = r0.A0G();
        } else {
            A032 = C56972sr.A03(r0);
        }
        A152.add(A032);
        C55682qk r2 = this.A04;
        HashSet hashSet = new HashSet(A152.size());
        C627336j.A0F(r2, A152, hashSet);
        C64213Cp r3 = this.A0J;
        UserJid[] userJidArr = (UserJid[]) hashSet.toArray(new UserJid[0]);
        if (z) {
            j2 = 0;
        } else {
            long A0H2 = this.A0L.A0H();
            long A062 = C56952sp.A06(this.A0g, 2257);
            if (A062 <= 0 || A062 > 60) {
                j = 300000;
            } else {
                j = A062 * 60000;
            }
            j2 = A0H2 + j;
        }
        boolean A0A2 = this.A0C.A0A();
        if (userJidArr.length == 0) {
            C18260x0.A1S(AnonymousClass001.A0o(), "SyncDeviceAndResendMessageJob/empty recipients for ", r14);
        } else if (r3.A02.A01(r14)) {
            r3.A00.A02(new SyncDeviceAndResendMessageJob(r6, userJidArr, r3.A04.A0H(), j2, A0A2));
        } else {
            C18260x0.A1P(AnonymousClass001.A0o(), "SyncDeviceAndResendMessageJob/duplicate job request for ", r14);
        }
    }

    public final boolean A07(DeviceJid deviceJid, C624134x r22, AnonymousClass3ZC r23, int i, long j) {
        AnonymousClass3ZC r12;
        this.A0Q.A00();
        C624134x r5 = r22;
        boolean z = true;
        if (r5.A0D == 21) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append(AnonymousClass2z0.A07(r5, "MessagingXmppHandler/onMessageStatusUpdate: ", A0o2));
            C18260x0.A1L(A0o2, " Ignoring status update as the message has permanent send failure");
        } else {
            AnonymousClass2z0 r3 = r5.A1J;
            int i2 = i;
            if (!AnonymousClass358.A01(i2)) {
                return this.A0U.A03((AnonymousClass2JG) null, r3, i2);
            }
            DeviceJid deviceJid2 = deviceJid;
            long j2 = j;
            if (r5 instanceof C30331mH) {
                this.A0X.A02(deviceJid2, r5, j2);
            } else {
                C42872Pv r2 = this.A0W;
                r2.A01.A00();
                C624134x A052 = r2.A03.A05(r3);
                if (A052 == null) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "PrivacyStateMessageManager/check privacy conflict on receipt/fMsg not found for messageKey=", r3);
                } else {
                    C55282q6 r7 = r2.A02;
                    C42312Np A002 = r7.A00(A052.A1L);
                    AnonymousClass3ZC r11 = r23;
                    if (A002 != null) {
                        C18260x0.A1R(AnonymousClass001.A0o(), "PrivacyStateMessageManager/check privacy conflict on receipt/", r3);
                        r12 = A002.A00;
                    } else {
                        if (r23 != null) {
                            C18260x0.A1R(AnonymousClass001.A0o(), "PrivacyStateMessageManager/check privacy conflict on receipt (ent upgrade)/", r3);
                        }
                        r12 = null;
                    }
                    if (C57642ty.A01(r12, r11)) {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        C95814uZ r9 = C624134x.A08(A052, "PrivacyStateMessageManager/check privacy conflict on receipt/privacy mismatch. jid=", A0o3).A00;
                        A0o3.append(r9);
                        A0o3.append(" privacy mode=");
                        A0o3.append(r11);
                        Log.w(C624134x.A0C(A052, " row id=", A0o3));
                        if (r23 != null) {
                            C85284Fq A042 = r7.A02.A04();
                            try {
                                C69833Yo Axl = A042.Axl();
                                try {
                                    ContentValues A062 = AnonymousClass0x9.A06();
                                    C624134x.A0H(A062, A052);
                                    C18270x1.A0b(A062, "host_storage", r11.hostStorage);
                                    C18270x1.A0b(A062, "actual_actors", r11.actualActors);
                                    AnonymousClass3H0.A02(A062, A042, "privacy_mode_ts", r11.privacyModeTs).A0C("message_privacy_state", "INSERT_PRIVACY_STATE_INFO", A062, 5);
                                    A052.A1B(ZipDecompressor.UNZIP_BUFFER_SIZE);
                                    r7.A01.A07(A052, false);
                                    Axl.A00();
                                } catch (IOException e) {
                                    Log.e(C624134x.A0C(A052, "Failed to update msg privacy flag for ", AnonymousClass001.A0o()), e);
                                } catch (Throwable th) {
                                    Axl.close();
                                    throw th;
                                }
                                Axl.close();
                                A042.close();
                                if (r12 == null || r12.privacyModeTs < r11.privacyModeTs) {
                                    C18260x0.A1S(AnonymousClass001.A0o(), "PrivacyStateMessageManager/check privacy conflict on receipt/GetVNameCertificateJob. UserJid=", r9);
                                    r2.A00.A02(new GetVNameCertificateJob(AnonymousClass32Y.A03(r9)));
                                }
                            } catch (Throwable th2) {
                                try {
                                    A042.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } else {
                            StringBuilder A0o4 = AnonymousClass001.A0o();
                            A0o4.append("PrivacyStateMessageManager/check privacy conflict on receipt/Missing payload. row id=");
                            C18260x0.A1H(A0o4, A052.A1L);
                            r7.A01(A052.A1L);
                        }
                    }
                }
                AnonymousClass300 r1 = this.A0U;
                C626936e.A06(deviceJid2);
                r1.A05.A00();
                r1.A0P.remove(r3);
                z = r1.A04(deviceJid2, r5, i2, j2);
            }
            if (r3.A02 || C627636p.A0R(this.A05, r5)) {
                C54562ov A022 = AnonymousClass36G.A02(deviceJid2);
                C621133n r13 = this.A0N;
                if (r13.A0X()) {
                    r13.A0Q(A022, r3);
                    return z;
                }
                C48972fm.A02(this.A0O, new C70353aM(this, A022, r3, 41));
                return z;
            }
        }
        return z;
    }

    public int[] B81() {
        return new int[]{0, 255, 1, 2, 19, 69, 86, 16, 15, 215, 227, 259};
    }

    public final void A05(AnonymousClass4FY r4) {
        String B71;
        if (r4.BCI() == 0 && (B71 = r4.B71()) != null) {
            C56522s7 r1 = this.A0d.A05;
            if (r1.A08 == null) {
                synchronized (r1) {
                    if (r1.A08 == null) {
                        r1.A02();
                    }
                }
            }
            if (!B71.equals(r1.A08)) {
                this.A0h.BhD(new C23941Vm());
            }
        }
    }

    public C67753Qn(C116985rC r2, C116985rC r3, C116985rC r4, C55682qk r5, C56972sr r6, AnonymousClass36E r7, C29021i9 r8, C55912r7 r9, C66663Mh r10, AnonymousClass3FK r11, C49712gy r12, C29411im r13, C56962sq r14, C44302Vn r15, C58582vU r16, C29441ip r17, C64773Ex r18, C56422rx r19, C64213Cp r20, AnonymousClass30C r21, C56612sH r22, AnonymousClass33p r23, C621133n r24, C48972fm r25, C614730x r26, C52852m9 r27, C56982ss r28, C66543Lv r29, C56892sj r30, AnonymousClass300 r31, C49502gd r32, C42872Pv r33, C55332qB r34, C56382rt r35, C620333f r36, C50562iN r37, C29041iB r38, AnonymousClass33Z r39, AnonymousClass318 r40, C55802qw r41, C56302rl r42, AnonymousClass1VX r43, AnonymousClass4FV r44, C66493Lq r45, C66503Lr r46, C56232re r47, AnonymousClass3XH r48, C55572qZ r49, C59432wu r50, C47532dP r51, C52552lf r52, C46472bg r53, C66653Mg r54, C43882Tv r55, C55352qD r56, C55882r4 r57, AnonymousClass33Y r58, AnonymousClass33S r59, C614330s r60, C55892r5 r61, C50462iD r62, AnonymousClass2T6 r63, AnonymousClass3Cj r64, AnonymousClass9U4 r65, C54812pK r66, C61242zw r67, C45002Yh r68, C50622iU r69, AnonymousClass2UP r70, C47642da r71, C56832sd r72, AnonymousClass30F r73, C55832qz r74, AnonymousClass4BY r75, AnonymousClass4FS r76) {
        this.A0L = r22;
        this.A0g = r43;
        this.A04 = r5;
        this.A05 = r6;
        this.A1D = r76;
        this.A0R = r28;
        this.A0Y = r35;
        this.A0h = r44;
        this.A0w = r59;
        this.A09 = r10;
        this.A0P = r26;
        this.A0v = r58;
        this.A0B = r12;
        this.A0H = r18;
        this.A06 = r7;
        this.A0O = r25;
        this.A0A = r11;
        this.A12 = r65;
        this.A0D = r14;
        this.A0S = r29;
        this.A1B = r74;
        this.A0i = r45;
        this.A0j = r46;
        this.A0p = r52;
        this.A07 = r8;
        this.A0u = r57;
        this.A0C = r13;
        this.A0m = r49;
        this.A0J = r20;
        this.A0l = r48;
        this.A0r = r54;
        this.A0f = r42;
        this.A0N = r24;
        this.A0d = r40;
        this.A1C = r75;
        this.A0Q = r27;
        this.A0U = r31;
        this.A0t = r56;
        this.A0y = r61;
        this.A0Z = r36;
        this.A11 = r64;
        this.A18 = r71;
        this.A0I = r19;
        this.A0M = r23;
        this.A01 = r2;
        this.A0c = r39;
        this.A17 = r70;
        this.A0V = r32;
        this.A0X = r34;
        this.A19 = r72;
        this.A0o = r51;
        this.A08 = r9;
        this.A0K = r21;
        this.A0b = r38;
        this.A15 = r68;
        this.A16 = r69;
        this.A0x = r60;
        this.A0E = r15;
        this.A0n = r50;
        this.A0e = r41;
        this.A0s = r55;
        this.A13 = r66;
        this.A0k = r47;
        this.A0T = r30;
        this.A0q = r53;
        this.A03 = r3;
        this.A0G = r17;
        this.A14 = r67;
        this.A0W = r33;
        this.A1A = r73;
        this.A0a = r37;
        this.A10 = r63;
        this.A0F = r16;
        this.A0z = r62;
        this.A02 = r4;
    }
}
