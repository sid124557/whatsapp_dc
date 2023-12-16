package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.UserJid;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

/* renamed from: X.9Tx  reason: invalid class name and case insensitive filesystem */
public class C194639Tx {
    public final C56972sr A00;
    public final C66543Lv A01;
    public final C617332a A02;
    public final C620933l A03;
    public final C153087ae A04;
    public final AnonymousClass9U4 A05;
    public final C68513Tl A06;

    public C624034w A00(UserJid userJid, UserJid userJid2, AnonymousClass36K r25, long j) {
        C203719oC r7;
        long j2 = j;
        AnonymousClass36K r72 = r25;
        String A0r = r72.A0r("country", this.A04.A02().A03);
        int A012 = C615531h.A01(r72.A0r("version", (String) null), 1);
        String A0r2 = r72.A0r("request-id", (String) null);
        C626936e.A06(A0r2);
        String A0r3 = r72.A0r("expiry-ts", (String) null);
        C626936e.A06(A0r3);
        UserJid A08 = AnonymousClass32Y.A08(r72.A0r("sender", (String) null));
        if (A08 == null) {
            A08 = userJid;
        }
        C626936e.A06(A0r);
        String str = ((AnonymousClass3H6) AnonymousClass1S3.A06).A04;
        AnonymousClass9SU A0F = this.A05.A0F(A0r);
        if (A0F != null) {
            r7 = A0F.A01(str);
        } else {
            r7 = null;
        }
        C626936e.A06(r7);
        C85204Fi A013 = this.A02.A01(str);
        C626936e.A06(A08);
        C624034w A014 = AnonymousClass36S.A01(A013, new AnonymousClass39Q(new BigDecimal(0), 1), A08, userJid2, str, A0r2, A0r, 20, 12, A012, r7.BCt(), 0, j2);
        AnonymousClass1S4 BG4 = r7.BG4();
        if (BG4 != null) {
            A014.A0A(BG4, C615531h.A04(A0r3, j / 1000) * 1000);
        }
        return A014;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624034w A01(com.whatsapp.jid.UserJid r18, X.AnonymousClass36K r19, long r20) {
        /*
            r17 = this;
            java.lang.String r0 = "version"
            r3 = 0
            r1 = r19
            java.lang.String r2 = r1.A0r(r0, r3)
            r0 = 1
            int r12 = X.C615531h.A01(r2, r0)
            java.lang.String r0 = "sync-status"
            java.lang.String r2 = r1.A0r(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "PARTIAL"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00ab
            r5 = 1
            X.4Fi r0 = X.AnonymousClass1S3.A06
            X.3H6 r0 = (X.AnonymousClass3H6) r0
            java.lang.String r7 = r0.A04
            X.7pU r0 = X.C161357pU.A0F
        L_0x002b:
            java.lang.String r2 = r0.A03
            java.lang.String r0 = "country"
            java.lang.String r9 = r1.A0r(r0, r2)
            java.lang.String r0 = "amount"
            java.lang.String r2 = r1.A0r(r0, r3)
            java.lang.String r0 = "receiver"
            java.lang.String r0 = r1.A0r(r0, r3)
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass32Y.A08(r0)
            r3 = r17
            if (r6 != 0) goto L_0x00a7
            X.2sr r4 = r3.A00
            boolean r0 = r4.A0Y()
            if (r0 == 0) goto L_0x00a7
            com.whatsapp.jid.PhoneUserJid r6 = X.C56972sr.A04(r4)
        L_0x0053:
            java.lang.String r0 = "UNSET"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0061
            X.9U4 r0 = r3.A05
            java.lang.String r9 = r0.A0I(r7)
        L_0x0061:
            X.9U4 r0 = r3.A05
            X.9SU r0 = r0.A0F(r9)
            if (r0 == 0) goto L_0x00a5
            X.9oC r0 = r0.A01(r7)
            if (r0 == 0) goto L_0x00a5
            int r13 = r0.BCt()
        L_0x0073:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r8 = 0
            if (r0 != 0) goto L_0x00b6
            X.32a r0 = r3.A02
            X.4Fi r3 = r0.A01(r7)
            if (r5 == 0) goto L_0x009f
            r4 = r8
            r10 = 1000(0x3e8, float:1.401E-42)
        L_0x0085:
            r11 = 0
            r5 = r18
            r15 = r20
            r14 = r11
            X.34w r2 = X.AnonymousClass36S.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = "transaction-id"
            java.lang.String r1 = r1.A0r(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x009e
            r2.A0D(r1)
        L_0x009e:
            return r2
        L_0x009f:
            X.39Q r4 = X.C1899693i.A0B(r3, r2)
            r10 = 3
            goto L_0x0085
        L_0x00a5:
            r13 = 0
            goto L_0x0073
        L_0x00a7:
            X.C626936e.A06(r6)
            goto L_0x0053
        L_0x00ab:
            r5 = 0
            java.lang.String r0 = "currency"
            java.lang.String r7 = r1.A0r(r0, r3)
            X.7pU r0 = X.C161357pU.A0G
            goto L_0x002b
        L_0x00b6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194639Tx.A01(com.whatsapp.jid.UserJid, X.36K, long):X.34w");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[ExcHandler: JSONException (unused org.json.JSONException), SYNTHETIC, Splitter:B:428:0x0808] */
    public X.C624034w A02(X.C201629kS r72, X.AnonymousClass36K r73) {
        /*
            r71 = this;
            java.lang.String r0 = "sender"
            r2 = 0
            r1 = r73
            java.lang.String r0 = r1.A0r(r0, r2)
            X.32Y r3 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r31 = r3.A0E(r0)
            java.lang.String r0 = "receiver"
            java.lang.String r0 = r1.A0r(r0, r2)
            com.whatsapp.jid.UserJid r49 = r3.A0E(r0)
            java.lang.String r0 = "transaction-type"
            java.lang.String r14 = "p2p"
            java.lang.String r13 = r1.A0r(r0, r14)
            int r45 = r13.hashCode()
            r30 = 0
            r9 = r71
            switch(r45) {
                case -1703305877: goto L_0x0875;
                case -1629586251: goto L_0x0878;
                case -934813832: goto L_0x087b;
                case 1554454174: goto L_0x0872;
                default: goto L_0x002c;
            }
        L_0x002c:
            X.2sr r3 = r9.A00
            r0 = r31
            boolean r0 = r3.A0a(r0)
            if (r0 != 0) goto L_0x0038
            if (r49 != 0) goto L_0x003a
        L_0x0038:
            r30 = 1
        L_0x003a:
            java.lang.String r6 = "country"
            java.lang.String r0 = "IN"
            java.lang.String r3 = r1.A0r(r6, r0)
            java.lang.String r5 = "version"
            r7 = 0
            java.lang.String r2 = r1.A0r(r5, r2)
            r0 = 1
            int r0 = X.C615531h.A01(r2, r0)
            boolean r0 = X.AnonymousClass36S.A08(r3, r0)
            if (r0 != 0) goto L_0x005b
            r2 = -1
            X.34w r6 = r9.A03(r1, r2)
        L_0x005a:
            return r6
        L_0x005b:
            java.lang.String r0 = "message-id"
            r4 = 0
            java.lang.String r34 = r1.A0r(r0, r7)
            java.lang.String r0 = "group"
            java.lang.String r2 = r1.A0r(r0, r7)
            X.32V r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r33 = r0.A03(r2)
            java.lang.String r26 = "id"
            r0 = r26
            java.lang.String r32 = r1.A0r(r0, r7)
            java.lang.String r0 = "status"
            java.lang.String r0 = r1.A0r(r0, r7)
            java.lang.String r2 = "ts"
            java.lang.String r8 = r1.A0r(r2, r7)
            r2 = 0
            long r20 = X.C615531h.A04(r8, r2)
            r10 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r10
            java.lang.String r8 = "credential-id"
            java.lang.String r29 = r1.A0r(r8, r7)
            java.lang.String r8 = "error-code"
            java.lang.String r28 = r1.A0r(r8, r7)
            java.lang.String r8 = "bank-transaction-id"
            java.lang.String r35 = r1.A0r(r8, r7)
            java.lang.String r8 = "expiry-ts"
            java.lang.String r8 = r1.A0r(r8, r7)
            long r18 = X.C615531h.A04(r8, r2)
            long r18 = r18 * r10
            java.lang.String r2 = "created-ts"
            java.lang.String r2 = r1.A0r(r2, r7)
            long r16 = X.C615531h.A03(r2)
            long r16 = r16 * r10
            java.lang.String r2 = "counter"
            java.lang.String r3 = r1.A0r(r2, r7)
            r2 = 0
            int r25 = X.C615531h.A01(r3, r2)
            java.lang.String r2 = "sender-alias"
            java.lang.String r24 = r1.A0r(r2, r7)
            java.lang.String r2 = "receiver-alias"
            java.lang.String r23 = r1.A0r(r2, r7)
            java.lang.String r2 = "note"
            java.lang.String r22 = r1.A0r(r2, r7)
            java.lang.String r2 = "payment_initiator"
            java.lang.String r8 = r1.A0r(r2, r7)
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L_0x00e7
            java.lang.String r2 = "p2m"
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L_0x00e9
        L_0x00e7:
            java.lang.String r8 = "na"
        L_0x00e9:
            java.lang.String r2 = "mandate"
            X.36K r2 = r1.A0l(r2)
            r7 = 0
            if (r2 == 0) goto L_0x0108
            r7 = 1
            X.33l r10 = r9.A03
            android.content.SharedPreferences r2 = r10.A03()
            java.lang.String r3 = "payment_has_received_upi_mandate_request"
            boolean r2 = X.C18280x3.A1W(r2, r3)
            if (r2 != 0) goto L_0x0108
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r10)
            X.C18270x1.A0l(r2, r3, r7)
        L_0x0108:
            X.7ae r2 = r9.A04
            X.7pU r2 = r2.A02()
            java.lang.String r15 = r1.A0r(r6, r4)
            if (r15 != 0) goto L_0x011a
            if (r2 != 0) goto L_0x0118
            X.7pU r2 = X.C161357pU.A0G
        L_0x0118:
            java.lang.String r15 = r2.A03
        L_0x011a:
            java.lang.String r3 = r1.A0r(r5, r4)
            r2 = 1
            int r55 = X.C615531h.A01(r3, r2)
            java.lang.String r2 = "onboarding-provider-id"
            java.lang.String r36 = r1.A0r(r2, r4)
            java.lang.String r3 = "onboarding-provider-name"
            r2 = 0
            r1.A0r(r3, r4)
            java.lang.String r3 = "is_vpa"
            java.lang.String r5 = r1.A0r(r3, r4)
            r3 = 0
            int r5 = X.C615531h.A01(r5, r3)
            r27 = 1
            r3 = r27
            if (r5 == r3) goto L_0x0151
            java.lang.String r3 = "is-vpa"
            java.lang.String r5 = r1.A0r(r3, r4)
            r3 = 0
            int r5 = X.C615531h.A01(r5, r3)
            r3 = r27
            if (r5 == r3) goto L_0x0151
            r27 = 0
        L_0x0151:
            java.lang.String r3 = "sync-status"
            java.lang.String r4 = r1.A0r(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x0167
            java.lang.String r3 = "PARTIAL"
            boolean r3 = r3.equalsIgnoreCase(r4)
            r44 = 1
            if (r3 != 0) goto L_0x0169
        L_0x0167:
            r44 = 0
        L_0x0169:
            X.2xu r11 = new X.2xu
            r11.<init>()
            X.4Fi r10 = X.AnonymousClass1S3.A06
            r11.A02 = r10
            X.39L r37 = r11.A01()
            if (r44 != 0) goto L_0x0199
            java.lang.String r3 = "amount"
            X.36K r4 = r1.A0l(r3)
            java.lang.String r5 = "currency"
            java.lang.String r38 = "PAY: PaymentsProtoParser :: extractAmountFromNode"
            if (r4 != 0) goto L_0x0706
            java.lang.String r4 = r1.A0r(r5, r2)
            java.lang.String r5 = r1.A0r(r3, r2)
            if (r4 != 0) goto L_0x06e9
            if (r5 != 0) goto L_0x06f1
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r38)
            java.lang.String r3 = " :: amount node is null"
        L_0x0196:
            X.C18260x0.A1K(r4, r3)
        L_0x0199:
            r3 = r37
            X.4Fi r3 = r3.A01
            X.3H6 r3 = (X.AnonymousClass3H6) r3
            java.lang.String r3 = r3.A04
            X.32a r4 = r9.A02
            r70 = r4
            X.4Fi r46 = r4.A01(r3)
            X.3H6 r10 = (X.AnonymousClass3H6) r10
            java.lang.String r4 = r10.A04
            boolean r43 = r3.equals(r4)
            r6 = 0
            if (r43 != 0) goto L_0x06e6
            r4 = r37
            X.39Q r11 = r4.A02
            java.math.BigDecimal r4 = r11.A00
            double r40 = r4.doubleValue()
            r38 = 0
            int r4 = (r40 > r38 ? 1 : (r40 == r38 ? 0 : -1))
            if (r4 <= 0) goto L_0x06e6
        L_0x01c4:
            if (r44 != 0) goto L_0x01cd
            boolean r4 = X.C18320x8.A1U(r0)
            X.C626936e.A0C(r4)
        L_0x01cd:
            java.lang.String r4 = "service"
            java.lang.String r10 = r1.A0r(r4, r2)
            java.lang.String r5 = "P2M_LITE"
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L_0x06d8
            X.9U4 r9 = r9.A05
            X.9oC r42 = r9.A0H(r5)
        L_0x01e1:
            if (r42 == 0) goto L_0x08b7
            int r6 = r8.hashCode()
            r5 = -906014849(0xffffffffc9ff4f7f, float:-2091503.9)
            if (r6 == r5) goto L_0x06cc
            r5 = 3507(0xdb3, float:4.914E-42)
            if (r6 == r5) goto L_0x01ff
            r5 = 94110131(0x59c01b3, float:1.4670794E-35)
            if (r6 != r5) goto L_0x01ff
            java.lang.String r5 = "buyer"
            boolean r5 = r8.equals(r5)
            r57 = 1
            if (r5 != 0) goto L_0x0201
        L_0x01ff:
            r57 = 0
        L_0x0201:
            if (r44 == 0) goto L_0x025f
            int r56 = r42.BCt()
            r53 = 1000(0x3e8, float:1.401E-42)
            r54 = 0
            r51 = r2
            r47 = r2
            r48 = r31
            r50 = r3
            r52 = r15
            r58 = r20
            X.34w r6 = X.AnonymousClass36S.A01(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
        L_0x021b:
            r0 = r34
            r6.A0L = r0
            if (r33 != 0) goto L_0x0227
            r33 = r31
            if (r30 == 0) goto L_0x0227
            r33 = r49
        L_0x0227:
            r0 = r33
            r6.A0C = r0
            r0 = r30
            r6.A0Q = r0
            r0 = r32
            r6.A0K = r0
            r0 = r35
            r6.A0F = r0
            r0 = r29
            r6.A0H = r0
            r0 = r28
            r6.A0J = r0
            r3 = r20
            r6.A06 = r3
            r3 = r16
            r6.A05 = r3
            r0 = r27
            r6.A0P = r0
            if (r43 != 0) goto L_0x0251
            r0 = r37
            r6.A09 = r0
        L_0x0251:
            X.1S4 r3 = r42.BG4()
            if (r3 == 0) goto L_0x005a
            android.text.TextUtils.isEmpty(r36)
            int r4 = r6.A03
            monitor-enter(r6)
            goto L_0x0754
        L_0x025f:
            java.lang.String r5 = "COLLECT_SUCCESS"
            boolean r41 = r5.equalsIgnoreCase(r0)
            if (r41 != 0) goto L_0x0665
            java.lang.String r5 = "COLLECT_FAILED"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 != 0) goto L_0x0665
            java.lang.String r5 = "COLLECT_FAILED_RISK"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 != 0) goto L_0x0665
            java.lang.String r5 = "COLLECT_REJECTED"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 != 0) goto L_0x0665
            java.lang.String r5 = "COLLECT_EXPIRED"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 != 0) goto L_0x0665
            if (r7 == 0) goto L_0x0299
            java.lang.String r5 = "AUTH_SUCCESS"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 != 0) goto L_0x0665
            java.lang.String r5 = "AUTH_CANCELED"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 != 0) goto L_0x0665
        L_0x0299:
            boolean r5 = android.text.TextUtils.isEmpty(r13)
            r7 = 2
            if (r5 != 0) goto L_0x02b4
            java.lang.String r6 = X.AnonymousClass0x9.A0z(r13)
            int r5 = r6.hashCode()
            switch(r5) {
                case -1703305877: goto L_0x0659;
                case -1629586251: goto L_0x064d;
                case -995205722: goto L_0x0641;
                case -934813832: goto L_0x0636;
                case 109291: goto L_0x0626;
                case 109294: goto L_0x061e;
                case 1554454174: goto L_0x0613;
                default: goto L_0x02ab;
            }
        L_0x02ab:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r5 = "PAY: PaymentTransactionInfoData parseTransactionType: transactionTypeStr = "
            X.C18260x0.A0q(r5, r6, r8)
        L_0x02b4:
            if (r30 == 0) goto L_0x02b7
            r7 = 1
        L_0x02b7:
            int r56 = r42.BCt()
            r6 = r56
            r5 = 9
            if (r7 != r5) goto L_0x02d8
            java.lang.String r5 = r1.A0r(r4, r2)
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x02d6
            java.lang.String r5 = X.AnonymousClass0x9.A0z(r5)
            int r4 = r5.hashCode()
            switch(r4) {
                case -2031560318: goto L_0x05ef;
                case 116014: goto L_0x05fb;
                case 97229420: goto L_0x0607;
                default: goto L_0x02d6;
            }
        L_0x02d6:
            r56 = 0
        L_0x02d8:
            switch(r45) {
                case -1629586251: goto L_0x05d8;
                case -934813832: goto L_0x05db;
                case 1554454174: goto L_0x05de;
                default: goto L_0x02db;
            }
        L_0x02db:
            if (r30 == 0) goto L_0x05d2
            r58 = -1
            X.C626936e.A06(r42)
            r56 = r6
        L_0x02e4:
            r54 = 401(0x191, float:5.62E-43)
        L_0x02e6:
            r47 = r11
            r48 = r31
            r50 = r3
            r51 = r2
            r52 = r15
            r53 = r7
            X.34w r6 = X.AnonymousClass36S.A01(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
        L_0x02f6:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r4 != 0) goto L_0x0331
            r3 = 1
            java.lang.String r40 = "FAILURE"
            java.lang.String r39 = "FAILED_RISK"
            java.lang.String r38 = "AUTH_CANCELED"
            java.lang.String r15 = "FAILED_DA"
            java.lang.String r14 = "EXPIRED"
            java.lang.String r13 = "IN_REVIEW"
            java.lang.String r12 = "PENDING"
            java.lang.String r11 = "CANCELLED"
            java.lang.String r10 = "FAILED"
            java.lang.String r9 = "COMPLETED"
            java.lang.String r8 = "SUCCESS"
            if (r7 == r3) goto L_0x04ca
            r3 = 2
            if (r7 == r3) goto L_0x042a
            java.lang.String r5 = "COLLECT_EXPIRED"
            java.lang.String r4 = "COLLECT_REJECTED"
            r3 = 20
            if (r7 == r3) goto L_0x03d8
            r3 = 40
            if (r7 == r3) goto L_0x03c6
            r3 = 100
            if (r7 == r3) goto L_0x04ca
            r3 = 200(0xc8, float:2.8E-43)
            if (r7 == r3) goto L_0x042a
            switch(r7) {
                case 6: goto L_0x0397;
                case 7: goto L_0x04ba;
                case 8: goto L_0x0335;
                case 9: goto L_0x042a;
                case 10: goto L_0x03d8;
                default: goto L_0x0330;
            }
        L_0x0330:
            r3 = 0
        L_0x0331:
            r6.A02 = r3
            goto L_0x021b
        L_0x0335:
            java.lang.String r3 = "PENDING_CODE"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0394
            boolean r3 = r12.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0394
            boolean r3 = r13.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x034c
            r3 = 603(0x25b, float:8.45E-43)
            goto L_0x0331
        L_0x034c:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0391
            boolean r3 = r9.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0391
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x038e
            java.lang.String r3 = "DECLINED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x038e
            boolean r3 = r11.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x036f
            r3 = 606(0x25e, float:8.49E-43)
            goto L_0x0331
        L_0x036f:
            boolean r3 = r14.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0378
            r3 = 607(0x25f, float:8.5E-43)
            goto L_0x0331
        L_0x0378:
            java.lang.String r3 = "WITHDRAWAL_ACTIVE"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0383
            r3 = 608(0x260, float:8.52E-43)
            goto L_0x0331
        L_0x0383:
            java.lang.String r3 = "PENDING_CANCELLATION"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 609(0x261, float:8.53E-43)
            if (r0 != 0) goto L_0x0331
            goto L_0x0330
        L_0x038e:
            r3 = 605(0x25d, float:8.48E-43)
            goto L_0x0331
        L_0x0391:
            r3 = 604(0x25c, float:8.46E-43)
            goto L_0x0331
        L_0x0394:
            r3 = 602(0x25a, float:8.44E-43)
            goto L_0x0331
        L_0x0397:
            boolean r3 = r12.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03a0
            r3 = 701(0x2bd, float:9.82E-43)
            goto L_0x0331
        L_0x03a0:
            boolean r3 = r13.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03a9
            r3 = 702(0x2be, float:9.84E-43)
            goto L_0x0331
        L_0x03a9:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03b2
            r3 = 703(0x2bf, float:9.85E-43)
            goto L_0x0331
        L_0x03b2:
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03bc
            r3 = 704(0x2c0, float:9.87E-43)
            goto L_0x0331
        L_0x03bc:
            boolean r0 = r11.equalsIgnoreCase(r0)
            r3 = 705(0x2c1, float:9.88E-43)
            if (r0 != 0) goto L_0x0331
            goto L_0x0330
        L_0x03c6:
            if (r41 == 0) goto L_0x03cc
            r3 = 20
            goto L_0x0331
        L_0x03cc:
            java.lang.String r3 = "AUTH_SUCCESS"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x040e
            r3 = 417(0x1a1, float:5.84E-43)
            goto L_0x0331
        L_0x03d8:
            if (r41 == 0) goto L_0x03de
            r3 = 12
            goto L_0x0331
        L_0x03de:
            java.lang.String r3 = "COLLECT_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03ea
            r3 = 13
            goto L_0x0331
        L_0x03ea:
            java.lang.String r3 = "COLLECT_FAILED_RISK"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03f6
            r3 = 14
            goto L_0x0331
        L_0x03f6:
            boolean r3 = r4.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0426
            boolean r3 = r5.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0422
            java.lang.String r3 = "COLLECT_CANCELED"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 18
            if (r0 != 0) goto L_0x0331
            goto L_0x0330
        L_0x040e:
            r3 = r38
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05c6
            boolean r3 = r4.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0426
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0330
        L_0x0422:
            r3 = 16
            goto L_0x0331
        L_0x0426:
            r3 = 15
            goto L_0x0331
        L_0x042a:
            java.lang.String r3 = "PENDING_SETUP"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0436
            r3 = 102(0x66, float:1.43E-43)
            goto L_0x0331
        L_0x0436:
            boolean r3 = r15.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0440
            r3 = 103(0x67, float:1.44E-43)
            goto L_0x0331
        L_0x0440:
            java.lang.String r3 = "FAILED_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x044c
            r3 = 104(0x68, float:1.46E-43)
            goto L_0x0331
        L_0x044c:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04c6
            boolean r3 = r9.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04c6
            r3 = r40
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04b6
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04b6
            boolean r3 = r14.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0470
            r3 = 107(0x6b, float:1.5E-43)
            goto L_0x0331
        L_0x0470:
            r3 = r39
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x047c
            r3 = 108(0x6c, float:1.51E-43)
            goto L_0x0331
        L_0x047c:
            java.lang.String r3 = "WITHDRAWAL_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0488
            r3 = 109(0x6d, float:1.53E-43)
            goto L_0x0331
        L_0x0488:
            java.lang.String r3 = "WITHDRAWAL_FAILURE"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0494
            r3 = 110(0x6e, float:1.54E-43)
            goto L_0x0331
        L_0x0494:
            java.lang.String r3 = "WITHDRAWAL_PERMANENT_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04a0
            r3 = 111(0x6f, float:1.56E-43)
            goto L_0x0331
        L_0x04a0:
            boolean r3 = r11.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04aa
            r3 = 112(0x70, float:1.57E-43)
            goto L_0x0331
        L_0x04aa:
            java.lang.String r3 = "SENT_TO_SELLER"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 113(0x71, float:1.58E-43)
            if (r0 != 0) goto L_0x0331
            goto L_0x0330
        L_0x04b6:
            r3 = 105(0x69, float:1.47E-43)
            goto L_0x0331
        L_0x04ba:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04c6
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0330
        L_0x04c6:
            r3 = 106(0x6a, float:1.49E-43)
            goto L_0x0331
        L_0x04ca:
            java.lang.String r3 = "PENDING_RECEIVER_SETUP"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04d6
            r3 = 402(0x192, float:5.63E-43)
            goto L_0x0331
        L_0x04d6:
            boolean r3 = r15.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04e0
            r3 = 403(0x193, float:5.65E-43)
            goto L_0x0331
        L_0x04e0:
            java.lang.String r3 = "REFUND_FAILED_DA"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04ec
            r3 = 404(0x194, float:5.66E-43)
            goto L_0x0331
        L_0x04ec:
            r3 = r39
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04f8
            r3 = 407(0x197, float:5.7E-43)
            goto L_0x0331
        L_0x04f8:
            java.lang.String r3 = "INITIAL"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0504
            r3 = 401(0x191, float:5.62E-43)
            goto L_0x0331
        L_0x0504:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05ce
            boolean r3 = r9.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05ce
            r3 = r40
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05ca
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05ca
            java.lang.String r3 = "REFUNDED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x052a
            r3 = 408(0x198, float:5.72E-43)
            goto L_0x0331
        L_0x052a:
            java.lang.String r3 = "REFUND_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0536
            r3 = 409(0x199, float:5.73E-43)
            goto L_0x0331
        L_0x0536:
            java.lang.String r3 = "FAILED_RECEIVER_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0542
            r3 = 410(0x19a, float:5.75E-43)
            goto L_0x0331
        L_0x0542:
            java.lang.String r3 = "REFUND_FAILED_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x054e
            r3 = 411(0x19b, float:5.76E-43)
            goto L_0x0331
        L_0x054e:
            java.lang.String r3 = "FAILED_DA_FINAL"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x055a
            r3 = 412(0x19c, float:5.77E-43)
            goto L_0x0331
        L_0x055a:
            java.lang.String r3 = "AUTH_CANCEL_FAILED_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0566
            r3 = 413(0x19d, float:5.79E-43)
            goto L_0x0331
        L_0x0566:
            java.lang.String r3 = "AUTH_CANCEL_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0572
            r3 = 414(0x19e, float:5.8E-43)
            goto L_0x0331
        L_0x0572:
            r3 = r38
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05c6
            boolean r3 = r14.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0584
            r3 = 416(0x1a0, float:5.83E-43)
            goto L_0x0331
        L_0x0584:
            boolean r3 = r13.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x058e
            r3 = 419(0x1a3, float:5.87E-43)
            goto L_0x0331
        L_0x058e:
            boolean r3 = r12.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0598
            r3 = 420(0x1a4, float:5.89E-43)
            goto L_0x0331
        L_0x0598:
            boolean r3 = r11.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05a2
            r3 = 421(0x1a5, float:5.9E-43)
            goto L_0x0331
        L_0x05a2:
            java.lang.String r3 = "REVERSAL_SUCCESS"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05ae
            r3 = 422(0x1a6, float:5.91E-43)
            goto L_0x0331
        L_0x05ae:
            java.lang.String r3 = "REVERSAL_PENDING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05ba
            r3 = 423(0x1a7, float:5.93E-43)
            goto L_0x0331
        L_0x05ba:
            java.lang.String r3 = "REFUND_PENDING"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 424(0x1a8, float:5.94E-43)
            if (r0 != 0) goto L_0x0331
            goto L_0x0330
        L_0x05c6:
            r3 = 415(0x19f, float:5.82E-43)
            goto L_0x0331
        L_0x05ca:
            r3 = 406(0x196, float:5.69E-43)
            goto L_0x0331
        L_0x05ce:
            r3 = 405(0x195, float:5.68E-43)
            goto L_0x0331
        L_0x05d2:
            r54 = 101(0x65, float:1.42E-43)
            r58 = r20
            goto L_0x02e6
        L_0x05d8:
            java.lang.String r4 = "withdrawal"
            goto L_0x05e0
        L_0x05db:
            java.lang.String r4 = "refund"
            goto L_0x05e0
        L_0x05de:
            java.lang.String r4 = "deposit"
        L_0x05e0:
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x02db
            X.C626936e.A06(r42)
            r56 = r6
            r58 = r20
            goto L_0x02e4
        L_0x05ef:
            java.lang.String r4 = "p2m_lite"
            boolean r4 = r5.equals(r4)
            r56 = 4
            if (r4 != 0) goto L_0x02d8
            goto L_0x02d6
        L_0x05fb:
            java.lang.String r4 = "upi"
            boolean r4 = r5.equals(r4)
            r56 = 1
            if (r4 != 0) goto L_0x02d8
            goto L_0x02d6
        L_0x0607:
            java.lang.String r4 = "fbpay"
            boolean r4 = r5.equals(r4)
            r56 = 2
            if (r4 != 0) goto L_0x02d8
            goto L_0x02d6
        L_0x0613:
            java.lang.String r5 = "deposit"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x02ab
            r7 = 6
            goto L_0x02b7
        L_0x061e:
            boolean r5 = r6.equals(r14)
            if (r5 != 0) goto L_0x02b4
            goto L_0x02ab
        L_0x0626:
            java.lang.String r5 = "p2m"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x02ab
            r7 = 200(0xc8, float:2.8E-43)
            if (r30 == 0) goto L_0x02b7
            r7 = 100
            goto L_0x02b7
        L_0x0636:
            java.lang.String r5 = "refund"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x02ab
            r7 = 7
            goto L_0x02b7
        L_0x0641:
            java.lang.String r5 = "payout"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x02ab
            r7 = 300(0x12c, float:4.2E-43)
            goto L_0x02b7
        L_0x064d:
            java.lang.String r5 = "withdrawal"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x02ab
            r7 = 8
            goto L_0x02b7
        L_0x0659:
            java.lang.String r5 = "incentive"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x02ab
            r7 = 9
            goto L_0x02b7
        L_0x0665:
            if (r30 == 0) goto L_0x06a8
            if (r7 == 0) goto L_0x0687
            int r56 = r42.BCt()
            r53 = 40
            r54 = 12
            r57 = 0
            r47 = r11
            r48 = r31
            r50 = r3
            r51 = r2
            r52 = r15
            r58 = r20
            X.34w r6 = X.AnonymousClass36S.A01(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
        L_0x0683:
            int r7 = r6.A03
            goto L_0x02f6
        L_0x0687:
            int r65 = X.C57232tJ.A00(r15)
            r63 = 20
            r64 = 12
            r67 = 0
            r56 = r46
            r57 = r11
            r58 = r31
            r59 = r49
            r60 = r3
            r61 = r2
            r62 = r15
            r66 = r55
            r68 = r20
            X.34w r6 = X.AnonymousClass36S.A01(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
            goto L_0x0683
        L_0x06a8:
            r63 = 10
            r64 = 11
            int r65 = X.C57232tJ.A00(r15)
            r67 = 0
            r56 = r46
            r57 = r11
            r58 = r31
            r59 = r49
            r60 = r3
            r61 = r2
            r62 = r15
            r66 = r55
            r68 = r20
            X.34w r6 = X.AnonymousClass36S.A01(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
            r7 = 10
            goto L_0x02f6
        L_0x06cc:
            java.lang.String r5 = "seller"
            boolean r5 = r8.equals(r5)
            r57 = 2
            if (r5 != 0) goto L_0x0201
            goto L_0x01ff
        L_0x06d8:
            X.9U4 r5 = r9.A05
            X.9SU r5 = r5.A0F(r15)
            if (r5 == 0) goto L_0x08b7
            X.9oC r42 = r5.A01(r3)
            goto L_0x01e1
        L_0x06e6:
            r11 = r2
            goto L_0x01c4
        L_0x06e9:
            X.32a r3 = r9.A02
            X.4Fi r3 = r3.A01(r4)
            r11.A02 = r3
        L_0x06f1:
            r12 = 1000(0x3e8, float:1.401E-42)
            if (r5 == 0) goto L_0x06fe
            double r3 = java.lang.Double.parseDouble(r5)
            double r5 = (double) r12
            double r3 = r3 * r5
            long r5 = (long) r3
            r11.A01 = r5
        L_0x06fe:
            r11.A00 = r12
            X.39L r37 = r11.A01()
            goto L_0x0199
        L_0x0706:
            java.lang.String r3 = "money"
            X.36K r4 = r4.A0l(r3)
            if (r4 != 0) goto L_0x0716
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r38)
            java.lang.String r3 = " :: money node is null"
            goto L_0x0196
        L_0x0716:
            java.lang.String r3 = "value"
            java.lang.String r12 = r4.A0r(r3, r2)     // Catch:{ Exception -> 0x0748 }
            java.lang.String r3 = "offset"
            java.lang.String r6 = r4.A0r(r3, r2)     // Catch:{ Exception -> 0x0748 }
            java.lang.String r4 = r4.A0r(r5, r2)     // Catch:{ Exception -> 0x0748 }
            X.32a r3 = r9.A02     // Catch:{ Exception -> 0x0748 }
            X.4Fi r5 = r3.A01(r4)     // Catch:{ Exception -> 0x0748 }
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0748 }
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x0748 }
            r11.A01 = r3     // Catch:{ Exception -> 0x0748 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0748 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0748 }
            r11.A00 = r3     // Catch:{ Exception -> 0x0748 }
            r11.A02 = r5     // Catch:{ Exception -> 0x0748 }
            X.39L r37 = r11.A01()     // Catch:{ Exception -> 0x0748 }
            goto L_0x0199
        L_0x0748:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r38)
            java.lang.String r3 = " :: an error occurred while parsing the money node :: e = "
            X.C18260x0.A16(r3, r4, r5)
            goto L_0x0199
        L_0x0754:
            X.1S4 r5 = r6.A0A     // Catch:{ all -> 0x08b4 }
            if (r5 != 0) goto L_0x075b
            r6.A0A = r3     // Catch:{ all -> 0x08b4 }
            r5 = r3
        L_0x075b:
            r0 = r70
            r5.A04(r0, r1, r4)     // Catch:{ all -> 0x08b4 }
            X.39L r0 = r6.A09     // Catch:{ all -> 0x08b4 }
            if (r0 == 0) goto L_0x0766
            r5.A01 = r0     // Catch:{ all -> 0x08b4 }
        L_0x0766:
            java.lang.String r0 = "offer_claim"
            X.36K r4 = r1.A0l(r0)     // Catch:{ all -> 0x08b4 }
            if (r4 == 0) goto L_0x0794
            java.lang.String r0 = "offer_id"
            java.lang.String r9 = r4.A0r(r0, r2)     // Catch:{ all -> 0x08b4 }
            r0 = r26
            java.lang.String r8 = r4.A0r(r0, r2)     // Catch:{ all -> 0x08b4 }
            java.lang.String r0 = "parent_transaction_id"
            java.lang.String r7 = r4.A0r(r0, r2)     // Catch:{ all -> 0x08b4 }
            java.lang.String r0 = "incentive_payment_id"
            java.lang.String r4 = r4.A0r(r0, r2)     // Catch:{ all -> 0x08b4 }
            if (r9 == 0) goto L_0x0794
            if (r8 != 0) goto L_0x078d
            if (r7 != 0) goto L_0x078d
            goto L_0x0794
        L_0x078d:
            X.39O r0 = new X.39O     // Catch:{ all -> 0x08b4 }
            r0.<init>(r9, r8, r7, r4)     // Catch:{ all -> 0x08b4 }
            r5.A00 = r0     // Catch:{ all -> 0x08b4 }
        L_0x0794:
            java.lang.String r0 = "order"
            X.36K r8 = r1.A0l(r0)     // Catch:{ all -> 0x08b4 }
            if (r8 == 0) goto L_0x07c1
            r0 = r26
            java.lang.String r7 = r8.A0r(r0, r2)     // Catch:{ all -> 0x08b4 }
            if (r7 == 0) goto L_0x07c1
            java.lang.String r0 = "message_id"
            java.lang.String r4 = r8.A0r(r0, r2)     // Catch:{ all -> 0x08b4 }
            if (r4 == 0) goto L_0x07c1
            r1 = 0
            java.lang.String r0 = "expiry_ts"
            long r1 = r8.A0e(r0, r1)     // Catch:{ 24Y -> 0x07b5 }
            goto L_0x07ba
        L_0x07b5:
            java.lang.String r0 = "PAY: PaymentTransactionCountryData/parseOrderData : invalid expiry timestamp format"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08b4 }
        L_0x07ba:
            X.39U r0 = new X.39U     // Catch:{ all -> 0x08b4 }
            r0.<init>(r1, r7, r4)     // Catch:{ all -> 0x08b4 }
            r5.A02 = r0     // Catch:{ all -> 0x08b4 }
        L_0x07c1:
            monitor-exit(r6)
            r0 = r25
            r6.A09(r3, r0)
            monitor-enter(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r24)     // Catch:{ all -> 0x08b4 }
            if (r0 != 0) goto L_0x07da
            X.1S4 r1 = r6.A0A     // Catch:{ all -> 0x08b4 }
            if (r1 != 0) goto L_0x07d5
            r6.A0A = r3     // Catch:{ all -> 0x08b4 }
            r1 = r3
        L_0x07d5:
            r0 = r24
            r1.A0a(r0)     // Catch:{ all -> 0x08b4 }
        L_0x07da:
            monitor-exit(r6)
            monitor-enter(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x08b4 }
            if (r0 != 0) goto L_0x07ee
            X.1S4 r1 = r6.A0A     // Catch:{ all -> 0x08b4 }
            if (r1 != 0) goto L_0x07e9
            r6.A0A = r3     // Catch:{ all -> 0x08b4 }
            r1 = r3
        L_0x07e9:
            r0 = r23
            r1.A0Z(r0)     // Catch:{ all -> 0x08b4 }
        L_0x07ee:
            monitor-exit(r6)
            r0 = r18
            r6.A0A(r3, r0)
            r4 = r72
            if (r72 == 0) goto L_0x005a
            if (r27 == 0) goto L_0x005a
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x005a
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x005a
            if (r22 == 0) goto L_0x005a
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r22)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "pkeVersion"
            r1.getInt(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "nonce"
            java.lang.String r7 = r1.getString(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "serverPubKey"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "serverPubKeySig"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "cert"
            java.lang.String r9 = r1.getString(r0)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r0 = "encData"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x005a }
            r0 = 8
            byte[] r10 = android.util.Base64.decode(r7, r0)     // Catch:{ JSONException -> 0x005a }
            byte[] r11 = android.util.Base64.decode(r5, r0)     // Catch:{ JSONException -> 0x005a }
            byte[] r12 = android.util.Base64.decode(r2, r0)     // Catch:{ JSONException -> 0x005a }
            byte[] r13 = android.util.Base64.decode(r1, r0)     // Catch:{ JSONException -> 0x005a }
            X.9Pb r8 = new X.9Pb     // Catch:{ JSONException -> 0x005a }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ JSONException -> 0x005a }
            byte[] r5 = r8.A03
            byte[] r7 = r8.A04
            java.lang.String r2 = r8.A00
            X.2UU r1 = new X.2UU
            r1.<init>()
            java.lang.String r0 = "CN=Facebook Purpose Encryption Signature"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ CertificateExpiredException -> 0x08ae, JSONException -> 0x005a }
            java.security.cert.X509Certificate r2 = r1.A00(r2, r0)     // Catch:{ CertificateExpiredException -> 0x08ae, JSONException -> 0x005a }
            java.lang.String r0 = "SHA256withRSA"
            java.security.Signature r1 = java.security.Signature.getInstance(r0)     // Catch:{ CertificateExpiredException -> 0x08ae, JSONException -> 0x005a }
            java.security.PublicKey r0 = r2.getPublicKey()     // Catch:{ CertificateExpiredException -> 0x08ae, JSONException -> 0x005a }
            r1.initVerify(r0)     // Catch:{ CertificateExpiredException -> 0x08ae, JSONException -> 0x005a }
            r1.update(r5)     // Catch:{ CertificateExpiredException -> 0x08ae, JSONException -> 0x005a }
            boolean r0 = r1.verify(r7)     // Catch:{ CertificateExpiredException -> 0x08ae, JSONException -> 0x005a }
            if (r0 == 0) goto L_0x005a
            goto L_0x0885
        L_0x0872:
            java.lang.String r0 = "deposit"
            goto L_0x087d
        L_0x0875:
            java.lang.String r0 = "incentive"
            goto L_0x087d
        L_0x0878:
            java.lang.String r0 = "withdrawal"
            goto L_0x087d
        L_0x087b:
            java.lang.String r0 = "refund"
        L_0x087d:
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x002c
            goto L_0x003a
        L_0x0885:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A00
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x08a7
            byte[] r0 = r4.A01
            byte[] r2 = X.C161227pF.A00(r5, r0)
            byte[] r1 = r8.A02
            byte[] r0 = r8.A01
            byte[] r1 = X.C159457lr.A01(r2, r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            r3.A0X(r0)
            r4.destroy()
            return r6
        L_0x08a7:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x08ae:
            java.lang.String r0 = "Certificate expired"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        L_0x08b4:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x08b7:
            java.lang.String r0 = "PaymentsProtoParser/parsePaymentTransaction service == null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194639Tx.A02(X.9kS, X.36K):X.34w");
    }

    public final C624034w A03(AnonymousClass36K r11, long j) {
        byte[] bArr;
        String A0r = r11.A0r("country", "IN");
        int A012 = C615531h.A01(AnonymousClass36K.A0L(r11, "version"), 1);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(DefaultCrypto.BUFFER_SIZE);
            C68543To.A01(r11, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: PaymentsProtoParser serializeProtocolNode: ", e);
            bArr = null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY PaymentsProtoParser: buildFuturePaymentFromPayNode: futurePayment country=");
        A0o.append(A0r);
        C18260x0.A0y(" version=", A0o, A012);
        C624034w r3 = new C624034w(A0r, 5, A012, 0, j);
        r3.A0R = bArr;
        return r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r21v15, types: [X.6hr] */
    /* JADX WARNING: type inference failed for: r17v11, types: [X.6hm] */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x024f, code lost:
        switch(r14) {
            case 0: goto L_0x0255;
            case 1: goto L_0x0257;
            case 2: goto L_0x025c;
            case 3: goto L_0x0261;
            case 4: goto L_0x0266;
            case 5: goto L_0x026b;
            case 6: goto L_0x0270;
            case 7: goto L_0x0273;
            case 8: goto L_0x0278;
            case 9: goto L_0x027a;
            case 10: goto L_0x0282;
            case 11: goto L_0x0287;
            default: goto L_0x0252;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0255, code lost:
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0257, code lost:
        r16 = "1".equals(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x025c, code lost:
        r18 = "1".equals(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0261, code lost:
        r21 = "1".equals(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0266, code lost:
        r31 = X.C133736hr.A01(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x026b, code lost:
        r26 = X.C133736hr.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0270, code lost:
        r25 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0273, code lost:
        r19 = "1".equals(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0278, code lost:
        r11 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x027a, code lost:
        r0 = X.C615531h.A03(r8) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0282, code lost:
        r17 = "1".equals(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0287, code lost:
        r20 = "1".equals(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ee, code lost:
        if (r7 == false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x031e, code lost:
        if (r20 != false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0326, code lost:
        if (r18 != false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0349, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        com.whatsapp.util.Log.w("PAY: PaymentsProtoParser unset payment method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03c6, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0051 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A05(X.AnonymousClass36K r33) {
        /*
            r32 = this;
            r9 = r33
            if (r33 == 0) goto L_0x03e9
            java.lang.String r0 = "wa-support-phone-number"
            java.lang.String r2 = X.AnonymousClass36K.A0L(r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r3 = r32
            if (r0 != 0) goto L_0x001d
            X.33l r0 = r3.A03
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r0)
            java.lang.String r0 = "payments_support_phone_number"
            X.C18270x1.A0j(r1, r0, r2)
        L_0x001d:
            X.36K[] r0 = r9.A03
            if (r0 == 0) goto L_0x03e9
            int r15 = r0.length
            if (r15 <= 0) goto L_0x03e9
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            r5 = 0
        L_0x0029:
            if (r5 >= r15) goto L_0x03ea
            X.36K r2 = r9.A0k(r5)
            X.C626936e.A06(r2)
            java.lang.String r1 = r2.A00
            int r4 = r1.hashCode()
            switch(r4) {
                case -795192327: goto L_0x03de;
                case -505296440: goto L_0x03db;
                case 3016252: goto L_0x03d8;
                case 3046160: goto L_0x03d5;
                case 1368775624: goto L_0x03d2;
                default: goto L_0x003b;
            }
        L_0x003b:
            java.lang.String r0 = "PAY: PaymentsProtoParser unset payment method"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x0051
            switch(r4) {
                case -795192327: goto L_0x0054;
                case -505296440: goto L_0x007d;
                case 3016252: goto L_0x0139;
                case 3046160: goto L_0x020f;
                case 1368775624: goto L_0x034c;
                default: goto L_0x0046;
            }
        L_0x0046:
            java.lang.String r0 = "PAY: PaymentsProtoParser unset payment method"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004b:
            r4 = 0
        L_0x004c:
            if (r4 == 0) goto L_0x0051
            r6.add(r4)
        L_0x0051:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0054:
            java.lang.String r0 = "wallet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "country"
            java.lang.String r1 = X.AnonymousClass36K.A0L(r2, r0)
            X.9U4 r0 = r3.A05
            X.9SU r0 = r0.A0F(r1)
            X.C626936e.A06(r0)
            X.9oC r0 = r0.A00()
            X.6hs r0 = r0.BG5()
            X.C626936e.A06(r0)
            java.lang.String r0 = "fromNetwork"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x007d:
            java.lang.String r0 = "merchant"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            r4 = 0
            X.39V[] r12 = r2.A0u()     // Catch:{ Exception -> 0x0131 }
            if (r12 != 0) goto L_0x0092
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing merchant: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0131 }
            goto L_0x004c
        L_0x0092:
            r11 = 0
            r13 = r4
            r19 = r4
            r20 = r4
            r21 = r4
            r10 = 0
            r24 = 0
            r25 = 0
            r23 = 0
        L_0x00a1:
            int r0 = r12.length     // Catch:{ Exception -> 0x0131 }
            if (r10 >= r0) goto L_0x0103
            r0 = r12[r10]     // Catch:{ Exception -> 0x0131 }
            java.lang.String r8 = r0.A02     // Catch:{ Exception -> 0x0131 }
            r0 = r12[r10]     // Catch:{ Exception -> 0x0131 }
            java.lang.String r7 = r0.A03     // Catch:{ Exception -> 0x0131 }
            java.lang.String r0 = "credential-id"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0131 }
            if (r0 == 0) goto L_0x00b5
            goto L_0x00fe
        L_0x00b5:
            java.lang.String r0 = "country"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0131 }
            if (r0 == 0) goto L_0x00bf
            r13 = r7
            goto L_0x0100
        L_0x00bf:
            java.lang.String r0 = "merchant-id"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0131 }
            if (r0 == 0) goto L_0x00ca
            r21 = r7
            goto L_0x0100
        L_0x00ca:
            java.lang.String r0 = "p2m-eligible"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r1 = "1"
            if (r0 == 0) goto L_0x00d9
            boolean r24 = r1.equals(r7)     // Catch:{ Exception -> 0x0131 }
            goto L_0x0100
        L_0x00d9:
            java.lang.String r0 = "p2p-eligible"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0131 }
            if (r0 == 0) goto L_0x00e6
            boolean r25 = r1.equals(r7)     // Catch:{ Exception -> 0x0131 }
            goto L_0x0100
        L_0x00e6:
            java.lang.String r0 = "logo-uri"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0131 }
            if (r0 == 0) goto L_0x00f1
            r20 = r7
            goto L_0x0100
        L_0x00f1:
            java.lang.String r0 = "max_installment_count"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x0131 }
            if (r0 == 0) goto L_0x0100
            int r23 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x0131 }
            goto L_0x0100
        L_0x00fe:
            r19 = r7
        L_0x0100:
            int r10 = r10 + 1
            goto L_0x00a1
        L_0x0103:
            java.lang.String r1 = "gateway-name"
            java.lang.String r0 = ""
            java.lang.String r22 = r2.A0r(r1, r0)     // Catch:{ Exception -> 0x0131 }
            X.9U4 r0 = r3.A05     // Catch:{ Exception -> 0x0131 }
            X.9SU r0 = r0.A0F(r13)     // Catch:{ Exception -> 0x0131 }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x0131 }
            X.9oC r0 = r0.A00()     // Catch:{ Exception -> 0x0131 }
            X.6hv r0 = r0.BG3()     // Catch:{ Exception -> 0x0131 }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x0131 }
            X.32a r1 = r3.A02     // Catch:{ Exception -> 0x0131 }
            r0.A04(r1, r2, r11)     // Catch:{ Exception -> 0x0131 }
            X.7pU r17 = X.C161357pU.A00(r13)     // Catch:{ Exception -> 0x0131 }
            X.6ho r16 = new X.6ho     // Catch:{ Exception -> 0x0131 }
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0131 }
            goto L_0x03c6
        L_0x0131:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating merchant account: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x004c
        L_0x0139:
            java.lang.String r0 = "bank"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            r4 = 0
            X.39V[] r13 = r2.A0u()     // Catch:{ Exception -> 0x0207 }
            if (r13 != 0) goto L_0x014f
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating bank account: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0207 }
            goto L_0x004c
        L_0x014f:
            r0 = 0
            r14 = r4
            r27 = r4
            r26 = r4
            r25 = r4
            r21 = 0
            r12 = 0
            r17 = 0
            r16 = 0
        L_0x015f:
            int r7 = r13.length     // Catch:{ Exception -> 0x0207 }
            if (r12 >= r7) goto L_0x01c5
            r7 = r13[r12]     // Catch:{ Exception -> 0x0207 }
            java.lang.String r11 = r7.A02     // Catch:{ Exception -> 0x0207 }
            r7 = r13[r12]     // Catch:{ Exception -> 0x0207 }
            java.lang.String r10 = r7.A03     // Catch:{ Exception -> 0x0207 }
            java.lang.String r7 = "credential-id"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0207 }
            if (r7 == 0) goto L_0x0173
            goto L_0x01c0
        L_0x0173:
            java.lang.String r7 = "account-number"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0207 }
            if (r7 == 0) goto L_0x017e
            r26 = r10
            goto L_0x01c2
        L_0x017e:
            java.lang.String r7 = "bank-name"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0207 }
            if (r7 == 0) goto L_0x0189
            r25 = r10
            goto L_0x01c2
        L_0x0189:
            java.lang.String r7 = "country"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0207 }
            if (r7 == 0) goto L_0x0193
            r14 = r10
            goto L_0x01c2
        L_0x0193:
            java.lang.String r7 = "default-debit"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0207 }
            java.lang.String r8 = "1"
            if (r7 == 0) goto L_0x01a2
            boolean r17 = r10.equals(r8)     // Catch:{ Exception -> 0x0207 }
            goto L_0x01c2
        L_0x01a2:
            java.lang.String r7 = "default-credit"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0207 }
            if (r7 == 0) goto L_0x01af
            boolean r16 = r10.equals(r8)     // Catch:{ Exception -> 0x0207 }
            goto L_0x01c2
        L_0x01af:
            java.lang.String r7 = "created"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0207 }
            if (r7 == 0) goto L_0x01c2
            long r21 = X.C615531h.A04(r10, r0)     // Catch:{ Exception -> 0x0207 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r7
            goto L_0x01c2
        L_0x01c0:
            r27 = r10
        L_0x01c2:
            int r12 = r12 + 1
            goto L_0x015f
        L_0x01c5:
            X.9U4 r0 = r3.A05     // Catch:{ Exception -> 0x0207 }
            X.9SU r0 = r0.A0F(r14)     // Catch:{ Exception -> 0x0207 }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x0207 }
            X.9oC r0 = r0.A00()     // Catch:{ Exception -> 0x0207 }
            X.6hu r0 = r0.BFz()     // Catch:{ Exception -> 0x0207 }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x0207 }
            X.32a r7 = r3.A02     // Catch:{ Exception -> 0x0207 }
            r1 = 0
            r0.A04(r7, r2, r1)     // Catch:{ Exception -> 0x0207 }
            X.7pU r18 = X.C161357pU.A00(r14)     // Catch:{ Exception -> 0x0207 }
            int r19 = X.C18310x6.A02(r17)
            int r20 = X.C18310x6.A02(r16)
            r23 = -1
            X.6hm r2 = new X.6hm     // Catch:{ Exception -> 0x0207 }
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ Exception -> 0x0207 }
            r1 = r27
            r2.A0A = r1     // Catch:{ Exception -> 0x0207 }
            r1 = r26
            r2.A0D(r1)     // Catch:{ Exception -> 0x0207 }
            r1 = r25
            r2.A0B = r1     // Catch:{ Exception -> 0x0207 }
            r2.A0D = r4     // Catch:{ Exception -> 0x0207 }
            r2.A08 = r0     // Catch:{ Exception -> 0x0207 }
            goto L_0x0349
        L_0x0207:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating bank account: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x004c
        L_0x020f:
            java.lang.String r0 = "card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.39V[] r13 = r2.A0u()
            r4 = 0
            if (r13 != 0) goto L_0x0225
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing card: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x004c
        L_0x0225:
            r25 = r4
            r0 = -1
            r12 = 0
            r21 = 0
            r26 = 7
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r31 = 0
            r16 = 0
            r11 = r4
        L_0x023b:
            int r7 = r13.length
            r14 = 2
            if (r12 >= r7) goto L_0x02f2
            r7 = r13[r12]
            java.lang.String r10 = r7.A02
            java.lang.String r8 = r7.A03
            int r7 = r10.hashCode()
            switch(r7) {
                case -1485088175: goto L_0x028c;
                case -387679965: goto L_0x0294;
                case -387679962: goto L_0x029c;
                case -129299872: goto L_0x02a3;
                case -65633415: goto L_0x02ab;
                case 3575610: goto L_0x02b3;
                case 102744158: goto L_0x02bb;
                case 270132229: goto L_0x02c3;
                case 957831062: goto L_0x02cb;
                case 1028554472: goto L_0x02d4;
                case 1830091262: goto L_0x02dd;
                case 1830091265: goto L_0x02e6;
                default: goto L_0x024c;
            }
        L_0x024c:
            r14 = -1
        L_0x024d:
            java.lang.String r7 = "1"
            switch(r14) {
                case 0: goto L_0x0255;
                case 1: goto L_0x0257;
                case 2: goto L_0x025c;
                case 3: goto L_0x0261;
                case 4: goto L_0x0266;
                case 5: goto L_0x026b;
                case 6: goto L_0x0270;
                case 7: goto L_0x0273;
                case 8: goto L_0x0278;
                case 9: goto L_0x027a;
                case 10: goto L_0x0282;
                case 11: goto L_0x0287;
                default: goto L_0x0252;
            }
        L_0x0252:
            int r12 = r12 + 1
            goto L_0x023b
        L_0x0255:
            r4 = r8
            goto L_0x0252
        L_0x0257:
            boolean r16 = r7.equals(r8)
            goto L_0x0252
        L_0x025c:
            boolean r18 = r7.equals(r8)
            goto L_0x0252
        L_0x0261:
            boolean r21 = r7.equals(r8)
            goto L_0x0252
        L_0x0266:
            int r31 = X.C133736hr.A01(r8)
            goto L_0x0252
        L_0x026b:
            int r26 = X.C133736hr.A00(r8)
            goto L_0x0252
        L_0x0270:
            r25 = r8
            goto L_0x0252
        L_0x0273:
            boolean r19 = r7.equals(r8)
            goto L_0x0252
        L_0x0278:
            r11 = r8
            goto L_0x0252
        L_0x027a:
            long r0 = X.C615531h.A03(r8)
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            goto L_0x0252
        L_0x0282:
            boolean r17 = r7.equals(r8)
            goto L_0x0252
        L_0x0287:
            boolean r20 = r7.equals(r8)
            goto L_0x0252
        L_0x028c:
            java.lang.String r7 = "credential-id"
            boolean r7 = r10.equals(r7)
            r14 = 0
            goto L_0x02ee
        L_0x0294:
            java.lang.String r7 = "default-credit-p2m"
            boolean r7 = r10.equals(r7)
            r14 = 1
            goto L_0x02ee
        L_0x029c:
            java.lang.String r7 = "default-credit-p2p"
            boolean r7 = r10.equals(r7)
            goto L_0x02ee
        L_0x02a3:
            java.lang.String r7 = "default-debit"
            boolean r7 = r10.equals(r7)
            r14 = 3
            goto L_0x02ee
        L_0x02ab:
            java.lang.String r7 = "network-type"
            boolean r7 = r10.equals(r7)
            r14 = 4
            goto L_0x02ee
        L_0x02b3:
            java.lang.String r7 = "type"
            boolean r7 = r10.equals(r7)
            r14 = 5
            goto L_0x02ee
        L_0x02bb:
            java.lang.String r7 = "last4"
            boolean r7 = r10.equals(r7)
            r14 = 6
            goto L_0x02ee
        L_0x02c3:
            java.lang.String r7 = "default-credit"
            boolean r7 = r10.equals(r7)
            r14 = 7
            goto L_0x02ee
        L_0x02cb:
            java.lang.String r7 = "country"
            boolean r7 = r10.equals(r7)
            r14 = 8
            goto L_0x02ee
        L_0x02d4:
            java.lang.String r7 = "created"
            boolean r7 = r10.equals(r7)
            r14 = 9
            goto L_0x02ee
        L_0x02dd:
            java.lang.String r7 = "default-debit-p2m"
            boolean r7 = r10.equals(r7)
            r14 = 10
            goto L_0x02ee
        L_0x02e6:
            java.lang.String r7 = "default-debit-p2p"
            boolean r7 = r10.equals(r7)
            r14 = 11
        L_0x02ee:
            if (r7 != 0) goto L_0x024d
            goto L_0x024c
        L_0x02f2:
            X.9U4 r7 = r3.A05
            X.9SU r7 = r7.A0F(r11)
            if (r7 != 0) goto L_0x0305
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "[PAY] : PaymentsProtoParser/parseCard unsupported country : "
            X.C18260x0.A0r(r0, r11, r1)
            goto L_0x004b
        L_0x0305:
            X.9oC r7 = r7.A00()
            X.6hw r7 = r7.BG0()
            X.C626936e.A06(r7)
            X.32a r10 = r3.A02
            r8 = 0
            r7.A04(r10, r2, r8)
            X.7pU r22 = X.C161357pU.A00(r11)
            if (r21 != 0) goto L_0x0320
            r27 = 0
            if (r20 == 0) goto L_0x0322
        L_0x0320:
            r27 = 2
        L_0x0322:
            if (r19 != 0) goto L_0x0328
            r28 = 0
            if (r18 == 0) goto L_0x032a
        L_0x0328:
            r28 = 2
        L_0x032a:
            int r29 = X.C18310x6.A02(r17)
            int r30 = X.C18310x6.A02(r16)
            X.7yt r2 = r7.A08
            java.lang.Object r8 = X.C1899593h.A0X(r2)
            java.lang.String r8 = (java.lang.String) r8
            X.6hr r2 = new X.6hr
            r21 = r2
            r23 = r4
            r24 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.A05 = r0
            r2.A08 = r7
        L_0x0349:
            r4 = r2
            goto L_0x004c
        L_0x034c:
            java.lang.String r0 = "custom_payment_method"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            r4 = 0
            X.39V[] r11 = r2.A0u()     // Catch:{ Exception -> 0x03ca }
            if (r11 != 0) goto L_0x0362
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing custom payment method: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x03ca }
            goto L_0x004c
        L_0x0362:
            r8 = 0
            r7 = r4
            r19 = r4
            r20 = r4
            r10 = 0
        L_0x0369:
            int r0 = r11.length     // Catch:{ Exception -> 0x03ca }
            if (r10 >= r0) goto L_0x0397
            r0 = r11[r10]     // Catch:{ Exception -> 0x03ca }
            java.lang.String r12 = r0.A02     // Catch:{ Exception -> 0x03ca }
            r0 = r11[r10]     // Catch:{ Exception -> 0x03ca }
            java.lang.String r1 = r0.A03     // Catch:{ Exception -> 0x03ca }
            java.lang.String r0 = "credential-id"
            boolean r0 = r12.equals(r0)     // Catch:{ Exception -> 0x03ca }
            if (r0 == 0) goto L_0x037d
            goto L_0x0392
        L_0x037d:
            java.lang.String r0 = "country"
            boolean r0 = r12.equals(r0)     // Catch:{ Exception -> 0x03ca }
            if (r0 == 0) goto L_0x0387
            r7 = r1
            goto L_0x0394
        L_0x0387:
            java.lang.String r0 = "type"
            boolean r0 = r12.equals(r0)     // Catch:{ Exception -> 0x03ca }
            if (r0 == 0) goto L_0x0394
            r19 = r1
            goto L_0x0394
        L_0x0392:
            r20 = r1
        L_0x0394:
            int r10 = r10 + 1
            goto L_0x0369
        L_0x0397:
            X.9U4 r0 = r3.A05     // Catch:{ Exception -> 0x03ca }
            X.9SU r0 = r0.A0F(r7)     // Catch:{ Exception -> 0x03ca }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x03ca }
            X.9oC r0 = r0.A00()     // Catch:{ Exception -> 0x03ca }
            if (r0 != 0) goto L_0x03ad
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing custom payment method: service is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x03ca }
            goto L_0x004c
        L_0x03ad:
            X.6ht r1 = r0.BG2()     // Catch:{ Exception -> 0x03ca }
            X.C626936e.A06(r1)     // Catch:{ Exception -> 0x03ca }
            X.32a r0 = r3.A02     // Catch:{ Exception -> 0x03ca }
            r1.A04(r0, r2, r8)     // Catch:{ Exception -> 0x03ca }
            X.7pU r17 = X.C161357pU.A00(r7)     // Catch:{ Exception -> 0x03ca }
            X.6hq r16 = new X.6hq     // Catch:{ Exception -> 0x03ca }
            r21 = r19
            r18 = r1
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x03ca }
        L_0x03c6:
            r4 = r16
            goto L_0x004c
        L_0x03ca:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating merchant account: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x004c
        L_0x03d2:
            java.lang.String r0 = "custom_payment_method"
            goto L_0x03e0
        L_0x03d5:
            java.lang.String r0 = "card"
            goto L_0x03e0
        L_0x03d8:
            java.lang.String r0 = "bank"
            goto L_0x03e0
        L_0x03db:
            java.lang.String r0 = "merchant"
            goto L_0x03e0
        L_0x03de:
            java.lang.String r0 = "wallet"
        L_0x03e0:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            r0 = 1
            goto L_0x0041
        L_0x03e9:
            r6 = 0
        L_0x03ea:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194639Tx.A05(X.36K):java.util.ArrayList");
    }

    public void A06(AnonymousClass3ST r3, AnonymousClass36K r4) {
        r3.A0C = A03(r4, r3.A16);
    }

    public void A08(AnonymousClass3ST r7, AnonymousClass36K r8) {
        C624034w r1 = r7.A0C;
        AnonymousClass36K r3 = r8;
        if (r1 != null) {
            String A0L = AnonymousClass36K.A0L(r8, "request-id");
            C626936e.A06(A0L);
            r1.A0D(A0L);
            return;
        }
        r7.A0C = A00(AnonymousClass32Y.A03(r7.BC1()), AnonymousClass32Y.A05(r7.BAZ()), r3, r7.A16);
    }

    public boolean A09(C624034w r26) {
        byte[] bArr;
        C624034w A022;
        C624034w A012;
        C203719oC r9;
        C624034w r6 = r26;
        if (r6.A0N() && (bArr = r6.A0R) != null) {
            try {
                AnonymousClass36K A032 = this.A06.A03(new ByteArrayInputStream(bArr));
                if (A032 != null) {
                    String str = A032.A00;
                    if (str.equals("pay")) {
                        AnonymousClass2z0 A0R = C1899593h.A0R(r6);
                        if (A0R.A00 == null || A0R.A01 == null) {
                            return false;
                        }
                        C66543Lv r62 = this.A01;
                        C624134x A052 = r62.A2D.A05(A0R);
                        if (A052 == null) {
                            return false;
                        }
                        String A0L = AnonymousClass36K.A0L(A032, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        C95814uZ A0n = A052.A0n();
                        if (A0L == null || !A0L.equals("request")) {
                            A012 = A01(AnonymousClass32Y.A03(A0n), A032, A052.A0K);
                            if (A012 == null) {
                                return false;
                            }
                        } else {
                            C624034w r7 = A052.A0P;
                            if (r7 == null) {
                                return false;
                            }
                            C95814uZ r8 = A052.A1J.A00;
                            if (C627336j.A0K(r8) && !this.A00.A0a(r7.A0E)) {
                                return false;
                            }
                            C624034w r4 = A052.A0P;
                            String str2 = r4.A0G;
                            String str3 = r4.A0I;
                            AnonymousClass9SU A0F = this.A05.A0F(str2);
                            if (A0F != null) {
                                r9 = A0F.A01(str3);
                            } else {
                                r9 = null;
                            }
                            C626936e.A06(r9);
                            C624034w r72 = A052.A0P;
                            UserJid userJid = r72.A0E;
                            UserJid userJid2 = r72.A0D;
                            String str4 = r72.A0I;
                            AnonymousClass39Q r12 = r72.A08;
                            C85204Fi r11 = r72.A07;
                            long j = A052.A0K;
                            String str5 = r72.A0G;
                            String str6 = str5;
                            A012 = AnonymousClass36S.A01(r11, r12, userJid, userJid2, str4, (String) null, str6, 20, 12, C57232tJ.A00(str5), r9.BCt(), 0, j);
                            int i = A052.A0P.A02;
                            if (i != 0) {
                                A012.A02 = i;
                            }
                            C624034w A002 = A00(AnonymousClass32Y.A03(r8), AnonymousClass32Y.A05(A0n), A032, A052.A0K);
                            A012.A0K = A002.A0K;
                            A012.A0A = A002.A0A;
                        }
                        r62.A0L(A012, A0R);
                        return true;
                    } else if (!str.equals("transaction") || (A022 = A02((C201629kS) null, A032)) == null) {
                        return false;
                    } else {
                        if (A022.A0C == null && !TextUtils.isEmpty(A022.A0L)) {
                            AnonymousClass2z0 A0R2 = C1899593h.A0R(A022);
                            C66543Lv r3 = this.A01;
                            C624134x A053 = r3.A2D.A05(A0R2);
                            if (A053 != null) {
                                C624034w r0 = A053.A0P;
                                if (r0 != null && !TextUtils.isEmpty(r0.A0M)) {
                                    A022.A0M = A053.A0P.A0M;
                                }
                                r3.A0L(A022, A0R2);
                                return true;
                            }
                        }
                        return AnonymousClass9U4.A01(this.A05).A0f(A022, r6, A022.A0L);
                    }
                }
            } catch (AnonymousClass24Y | IOException e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: PaymentsProtoParser deserializeProtocolNode: ", e);
            }
        }
        return false;
    }

    public C194639Tx(C56972sr r4, C66543Lv r5, C617332a r6, AnonymousClass1VX r7, C620933l r8, C153087ae r9, AnonymousClass9U4 r10) {
        this.A00 = r4;
        this.A05 = r10;
        this.A01 = r5;
        this.A03 = r8;
        this.A02 = r6;
        this.A04 = r9;
        this.A06 = new C68513Tl((C55682qk) null, r7, new C43932Ua(), (C41992Mj) null);
    }

    public ArrayList A04(C201629kS r8, AnonymousClass36K r9) {
        AnonymousClass36K[] r0;
        int length;
        AnonymousClass36K A0T = C1899693i.A0T(r9);
        if (A0T == null || (r0 = A0T.A03) == null || (length = r0.length) <= 0) {
            return null;
        }
        ArrayList A0I = AnonymousClass002.A0I(length);
        int i = 0;
        do {
            AnonymousClass36K A0k = A0T.A0k(i);
            C626936e.A06(A0k);
            if ("transaction".equals(A0k.A00)) {
                A0I.add(A02(r8, A0k));
            }
            i++;
        } while (i < length);
        return A0I;
    }

    public void A07(AnonymousClass3ST r4, AnonymousClass36K r5) {
        C624034w A012 = A01(AnonymousClass32Y.A03(r4.BC1()), r5, r4.A16);
        if (A012 != null) {
            r4.A0C = A012;
        }
    }
}
