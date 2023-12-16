package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.300  reason: invalid class name */
public class AnonymousClass300 {
    public final C55682qk A00;
    public final C56972sr A01;
    public final AnonymousClass36E A02;
    public final C153167am A03;
    public final C56612sH A04;
    public final C52852m9 A05;
    public final C56542sA A06;
    public final C56982ss A07;
    public final C66543Lv A08;
    public final C50012hU A09;
    public final C72303dV A0A;
    public final C49502gd A0B;
    public final C55332qB A0C;
    public final C54012o2 A0D;
    public final C55292q7 A0E;
    public final AnonymousClass1VX A0F;
    public final AnonymousClass34P A0G;
    public final C55882r4 A0H;
    public final AnonymousClass33Y A0I;
    public final AnonymousClass33S A0J;
    public final C619933b A0K;
    public final C50252hs A0L;
    public final C55832qz A0M;
    public final AnonymousClass4FS A0N;
    public final C183538qC A0O;
    public final Map A0P;

    public void A01(AnonymousClass2JG r9, AnonymousClass2z0 r10, int i) {
        this.A05.A01(new C71433c6(this, r10, r9, i, 16), 36);
    }

    public static boolean A00(AnonymousClass2z0 r0, int i) {
        if (r0.A02) {
            return false;
        }
        if (i == 13 || i == 16 || i == 17) {
            return true;
        }
        return false;
    }

    public void A02(List list) {
        this.A05.A00();
        List<AnonymousClass2z0> list2 = list;
        C18260x0.A1P(AnonymousClass001.A0o(), "MessageStatusStore/onmessagesreadbypeer/", list2);
        HashMap A0t = AnonymousClass001.A0t();
        for (AnonymousClass2z0 r2 : list2) {
            C95814uZ A012 = AnonymousClass2z0.A01(r2);
            C624134x A052 = this.A0M.A05(r2);
            if (A052 != null) {
                if (A012 instanceof C135166kE) {
                    C50252hs r3 = this.A0L;
                    C55152pt r22 = r3.A03;
                    C95814uZ A0n = A052.A0n();
                    C626936e.A06(A0n);
                    C162457s7.A0K(A0n, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    r3.A01(A052, r22.A01((UserJid) A0n));
                } else {
                    C18280x3.A0k(A012, A0t).add(A052);
                }
            }
        }
        Iterator A0u = AnonymousClass001.A0u(A0t);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            C95814uZ A0N2 = C18320x8.A0N(A0w);
            List list3 = (List) A0w.getValue();
            AnonymousClass4IU.A00(list3, 12);
            if (this.A0F.A0Y(C58422vE.A02, 7004)) {
                C70343aL.A01(this.A0N, this, A0N2, list3, 8);
            }
            C624134x r6 = (C624134x) C18300x5.A0c(list3);
            C56542sA r1 = this.A06;
            long j = r6.A1L;
            long j2 = r6.A1M;
            C183538qC r17 = r1.A02;
            C18310x6.A0Q(r17).A09.A00();
            AnonymousClass31A A0A2 = r1.A00.A0A(A0N2, false);
            StringBuilder A0o = AnonymousClass001.A0o();
            if (A0A2 == null) {
                A0o.append("msgstore/setchatseenonasynccommitthread/nochat/");
                A0o.append(A0N2);
            } else {
                AnonymousClass0x7.A1F(A0o, "msgstore/setchatseenonasynccommitthread/", A0N2);
                C18260x0.A1L(A0o, A0A2.A08());
                if (A0A2.A0Q >= j2) {
                    A0o = AnonymousClass000.A0k(A0N2, "msgstore/setchatseenonasynccommitthread/");
                    A0o.append("/message already read");
                } else {
                    int A013 = C18310x6.A0Q(r17).A0J.A01(A0N2, j2);
                    int A022 = C18310x6.A0Q(r17).A0J.A02(A0N2, j2);
                    int A002 = C18310x6.A0Q(r17).A0E.A00(A0N2, j2);
                    int i = A013 - A022;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("msgstore/setchatseenonasynccommitthread/original unseen count=");
                    A0o2.append(A0A2.A08);
                    A0o2.append(" new unseen count=");
                    A0o2.append(i);
                    A0o2.append("/original unseen important count=");
                    A0o2.append(A0A2.A06);
                    C18260x0.A0w(" new unseen important count=", A0o2, A002);
                    if (i < A0A2.A08) {
                        A0A2.A0G(i, A022, A013, A002);
                        A0A2.A0P = j;
                        A0A2.A0Q = j2;
                        if (C18310x6.A0Q(r17).A0Q.A02(A0N2)) {
                            A0A2.A0R = j;
                            A0A2.A0S = j2;
                        }
                        C18310x6.A0Q(r17).A0C.A0I(A0A2);
                        C18310x6.A0Q(r17).A0B.A09(A0N2, (Collection) null, 0);
                    }
                    C619933b r0 = this.A0K;
                    r0.A09(A0N2, r6);
                    r0.A08(A0N2);
                }
            }
            C18280x3.A14(A0o);
            C619933b r02 = this.A0K;
            r02.A09(A0N2, r6);
            r02.A08(A0N2);
        }
        if (!A0t.isEmpty()) {
            this.A0K.A07();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r9 == 8) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.AnonymousClass2JG r7, X.AnonymousClass2z0 r8, int r9) {
        /*
            r6 = this;
            X.2m9 r0 = r6.A05
            r0.A00()
            X.2qz r5 = r6.A0M
            X.34x r4 = r5.A05(r8)
            r2 = 0
            if (r4 != 0) goto L_0x001e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStatusStore/update/nosuchmessage: "
            r1.append(r0)
            r1.append(r8)
        L_0x001a:
            X.AnonymousClass0x2.A19(r1)
            return r2
        L_0x001e:
            int r0 = r4.A0D
            int r0 = X.AnonymousClass358.A00(r0, r9)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x0044
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStatusStore/update/statusdowngrade: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " current:"
            X.C624134x.A0O(r4, r0, r1)
            java.lang.String r0 = " new:"
            r1.append(r0)
            r1.append(r9)
            goto L_0x001a
        L_0x0044:
            r0 = 9
            if (r9 == r0) goto L_0x0051
            r0 = 10
            if (r9 == r0) goto L_0x0051
            r0 = 8
            r1 = 0
            if (r9 != r0) goto L_0x0073
        L_0x0051:
            r1 = 1
            boolean r0 = X.C627636p.A0X(r4)
            if (r0 != 0) goto L_0x0073
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStatusStore/update/status-played-non-ptt or view-once: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " type="
            r1.append(r0)
            byte r0 = r4.A1I
            java.lang.String r0 = X.C627636p.A0D(r0)
            r1.append(r0)
            goto L_0x001a
        L_0x0073:
            r4.A1G(r9)
            if (r1 == 0) goto L_0x007d
            X.2q7 r0 = r6.A0E
            r0.A04(r4)
        L_0x007d:
            long r0 = r4.A0K
            r2 = 4
            if (r9 != r2) goto L_0x008f
            long r0 = X.AnonymousClass0x9.A05(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MessageStatusStore/update/receipt/server/delay "
            X.C18260x0.A12(r2, r3, r0)
        L_0x008f:
            r0 = 11
            r1 = -1
            if (r9 == r0) goto L_0x00a5
            r0 = 12
            if (r9 == r0) goto L_0x00a5
            r0 = 16
            if (r9 == r0) goto L_0x00a5
            r0 = 17
            if (r9 == r0) goto L_0x00a5
            X.2hU r0 = r6.A09
            r0.A00(r4, r1)
        L_0x00a5:
            boolean r0 = r5.A07(r4, r1)
            if (r0 == 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00dd
            X.3Go r1 = r7.A00
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x00dd
            X.33S r5 = r1.A0k
            r3 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendMethods/sendMessagePlayed message="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; fromPeer="
            X.C18260x0.A1D(r0, r1, r3)
            X.34P r0 = r5.A05
            X.1VX r2 = r0.A00
            r1 = 361(0x169, float:5.06E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00df
            java.util.Set r0 = java.util.Collections.singleton(r4)
            r5.A04(r0, r3)
        L_0x00dd:
            r0 = 1
            return r0
        L_0x00df:
            X.2gy r1 = r5.A01
            com.whatsapp.jobqueue.job.SendPlayedReceiptJob r0 = new com.whatsapp.jobqueue.job.SendPlayedReceiptJob
            r0.<init>(r4)
            r1.A02(r0)
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass300.A03(X.2JG, X.2z0, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x025f, code lost:
        if ((r10 instanceof com.whatsapp.jid.UserJid) == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0296, code lost:
        if (r13 == false) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a3, code lost:
        if (r30 != false) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r0.A08(r10) < r7.A1L) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0161, code lost:
        if (r27 == false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b4, code lost:
        if (r6 == 13) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0240, code lost:
        if (r30 != false) goto L_0x0242;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x039f A[Catch:{ all -> 0x05fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04ed A[ADDED_TO_REGION, Catch:{ all -> 0x05fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0522 A[Catch:{ all -> 0x05fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x053c A[Catch:{ all -> 0x05fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x053f A[Catch:{ all -> 0x05fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x054b A[Catch:{ all -> 0x05fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0577 A[Catch:{ all -> 0x05fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x05e9  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x053a A[EDGE_INSN: B:285:0x053a->B:239:0x053a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f3 A[Catch:{ all -> 0x05fb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(com.whatsapp.jid.DeviceJid r41, X.C624134x r42, int r43, long r44) {
        /*
            r40 = this;
            r6 = r43
            boolean r0 = X.AnonymousClass358.A01(r6)
            X.C626936e.A0B(r0)
            r8 = r41
            com.whatsapp.jid.UserJid r0 = r8.userJid
            r39 = r0
            r7 = r42
            X.2z0 r5 = r7.A1J
            r9 = 0
            r11 = 0
            r2 = r44
            int r0 = (r44 > r9 ? 1 : (r44 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x002e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus/invalidtimestamp: key="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", timestamp="
            X.C18260x0.A11(r0, r1, r2)
        L_0x002d:
            return r11
        L_0x002e:
            r4 = r40
            X.2r4 r0 = r4.A0H
            X.4uZ r10 = r5.A00
            boolean r0 = r0.A02(r10)
            if (r0 != 0) goto L_0x0066
            r0 = 13
            if (r6 == r0) goto L_0x0054
            r0 = 8
            if (r6 != r0) goto L_0x0066
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0066
            X.34P r0 = r4.A0G
            X.1VX r9 = r0.A00
            r1 = 361(0x169, float:5.06E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r9.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0066
        L_0x0054:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus/ignore when setting is off, status="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; key="
            X.C18260x0.A1P(r1, r0, r5)
            r6 = 5
        L_0x0066:
            boolean r1 = r5.A02
            r12 = 0
            if (r1 != 0) goto L_0x009e
            X.2sr r0 = r4.A01
            boolean r0 = X.C627636p.A0R(r0, r7)
            if (r0 != 0) goto L_0x009e
            r0 = 8
            if (r6 == r0) goto L_0x0082
            r0 = 13
            r3 = 16
            if (r6 == r0) goto L_0x0084
            r3 = 17
            if (r6 == r3) goto L_0x0084
            return r11
        L_0x0082:
            r3 = 10
        L_0x0084:
            boolean r0 = A00(r5, r3)
            if (r0 == 0) goto L_0x0099
            X.2ss r0 = r4.A07
            X.C626936e.A06(r10)
            long r8 = r0.A08(r10)
            long r1 = r7.A1L
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002d
        L_0x0099:
            boolean r0 = r4.A03(r12, r5, r3)
            return r0
        L_0x009e:
            int r9 = r7.A0D
            r0 = 6
            if (r9 != r0) goto L_0x00ad
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus/invalidmessage: "
            X.C18260x0.A1S(r1, r0, r5)
            return r11
        L_0x00ad:
            r0 = 15
            if (r6 == r0) goto L_0x00bc
            r0 = 5
            if (r6 != r0) goto L_0x00c2
            X.2sr r0 = r4.A01
            boolean r0 = X.C56972sr.A09(r0, r8)
            if (r0 == 0) goto L_0x00c2
        L_0x00bc:
            X.2qB r0 = r4.A0C
            r0.A02(r8, r7, r2)
            return r11
        L_0x00c2:
            boolean r31 = X.C627336j.A0K(r10)
            boolean r0 = r10 instanceof X.C135166kE
            r30 = r0
            boolean r0 = r10 instanceof X.AnonymousClass1fS
            r29 = r0
            boolean r0 = r10 instanceof X.AnonymousClass1fI
            r28 = r0
            X.8qC r0 = r4.A0O
            X.2sS r11 = X.C18320x8.A0I(r0)
            r9 = 1
            r0 = r39
            X.C162457s7.A0J(r0, r9)
            boolean r0 = r11.A04(r7)
            boolean r27 = X.AnonymousClass000.A1S(r0)
            java.lang.String r25 = " new:"
            java.lang.String r26 = " current:"
            java.lang.String r11 = "MessageStatusStore/updatetargetstatus/statusdowngrade: "
            if (r30 != 0) goto L_0x015d
            if (r29 == 0) goto L_0x0128
            X.2qz r12 = r4.A0M
            X.C626936e.A06(r39)
            java.lang.String r9 = r5.A01
            r0 = r39
            X.34x r1 = X.C55832qz.A01(r0, r12, r9, r1)
            if (r1 != 0) goto L_0x0110
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus/nosuchmessage for broadcast: "
            X.C18280x3.A1H(r3, r0, r5)
            r3.append(r8)
        L_0x010b:
            X.AnonymousClass0x2.A19(r3)
        L_0x010e:
            r0 = 0
            return r0
        L_0x0110:
            int r0 = r1.A0D
            int r0 = X.AnonymousClass358.A00(r0, r6)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x0154
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            r0 = r26
            X.AnonymousClass000.A17(r5, r11, r0, r3)
            int r9 = r1.A0D
            goto L_0x0190
        L_0x0128:
            if (r31 != 0) goto L_0x0163
            if (r27 != 0) goto L_0x0163
            int r9 = r7.A0D
            int r0 = X.AnonymousClass358.A00(r9, r6)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x019d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r26
            X.AnonymousClass000.A17(r5, r11, r0, r1)
            int r0 = r7.A0D
            r1.append(r0)
            r0 = r25
            X.C18260x0.A0z(r0, r1, r6)
            X.2qB r0 = r4.A0C
            X.C626936e.A06(r8)
            r0.A02(r8, r7, r2)
            goto L_0x010e
        L_0x0154:
            r1.A1G(r6)
            X.2hU r9 = r4.A09
            r0 = -1
            r9.A00(r1, r0)
        L_0x015d:
            if (r31 != 0) goto L_0x0163
            if (r30 != 0) goto L_0x0163
            if (r27 == 0) goto L_0x01e5
        L_0x0163:
            X.2o2 r0 = r4.A0D
            X.2W3 r0 = r0.A00(r7)
            java.util.concurrent.ConcurrentHashMap r1 = r0.A00
            r0 = r39
            java.lang.Object r0 = r1.get(r0)
            X.2z3 r0 = (X.C60722z3) r0
            if (r0 == 0) goto L_0x01e5
            int r9 = r0.A00()
            int r0 = X.AnonymousClass358.A00(r9, r6)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x01e5
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0k(r5, r11)
            java.lang.String r2 = " remoteUser:"
            r1 = r26
            r0 = r39
            X.AnonymousClass000.A17(r0, r2, r1, r3)
        L_0x0190:
            r3.append(r9)
            r0 = r25
            r3.append(r0)
            r3.append(r6)
            goto L_0x010b
        L_0x019d:
            r7.A1G(r6)
            X.2hU r1 = r4.A09
            r0 = -1
            r1.A00(r7, r0)
            X.2sr r0 = r4.A01
            boolean r0 = r0.A0b(r8)
            if (r0 != 0) goto L_0x01e5
            r0 = 5
            if (r6 == r0) goto L_0x01b6
            r0 = 13
            r1 = 0
            if (r6 != r0) goto L_0x01b7
        L_0x01b6:
            r1 = 1
        L_0x01b7:
            r0 = 4
            if (r9 != r0) goto L_0x01e5
            if (r1 == 0) goto L_0x01e5
            X.2sH r0 = r4.A04
            long r12 = X.C56612sH.A04(r0, r7)
            X.36E r11 = r4.A02
            r9 = 1
            X.1Xy r1 = new X.1Xy
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r1.A02 = r0
            int r0 = X.AnonymousClass29K.A00(r11, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.A01 = r0
            X.4FV r0 = r11.A0G
            r0.BhD(r1)
        L_0x01e5:
            X.3dV r0 = r4.A0A
            X.4Fq r24 = r0.A04()
            X.3Yo r23 = r24.Axl()     // Catch:{ all -> 0x0605 }
            boolean r0 = r7.A1N     // Catch:{ all -> 0x05fb }
            if (r0 != 0) goto L_0x0233
            X.2o2 r9 = r4.A0D     // Catch:{ all -> 0x05fb }
            java.util.Set r0 = r9.A0B     // Catch:{ all -> 0x05fb }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x05fb }
            if (r0 != 0) goto L_0x0233
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "receiptmanager/addMessageReceipt: key="
            r11.append(r0)     // Catch:{ all -> 0x05fb }
            r11.append(r5)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = ", remoteDevice="
            r11.append(r0)     // Catch:{ all -> 0x05fb }
            r11.append(r8)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = ", status="
            r11.append(r0)     // Catch:{ all -> 0x05fb }
            r11.append(r6)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = ", ts="
            r11.append(r0)     // Catch:{ all -> 0x05fb }
            r11.append(r2)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = ", rowId="
            r11.append(r0)     // Catch:{ all -> 0x05fb }
            long r0 = r7.A1L     // Catch:{ all -> 0x05fb }
            X.C18260x0.A1I(r11, r0)     // Catch:{ all -> 0x05fb }
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x05fb }
            if (r31 != 0) goto L_0x0242
            goto L_0x023e
        L_0x0233:
            r23.A00()     // Catch:{ all -> 0x05fb }
            r23.close()     // Catch:{ all -> 0x0605 }
            r24.close()
            goto L_0x010e
        L_0x023e:
            r22 = 0
            if (r30 == 0) goto L_0x0244
        L_0x0242:
            r22 = 1
        L_0x0244:
            X.5rC r1 = r9.A01     // Catch:{ all -> 0x05fb }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x05fb }
            if (r0 == 0) goto L_0x0261
            java.lang.Object r1 = r1.A04()     // Catch:{ all -> 0x05fb }
            X.2sS r1 = (X.C56722sS) r1     // Catch:{ all -> 0x05fb }
            r0 = 1
            X.C162457s7.A0J(r10, r0)     // Catch:{ all -> 0x05fb }
            boolean r0 = r1.A04(r7)     // Catch:{ all -> 0x05fb }
            if (r0 == 0) goto L_0x0261
            boolean r0 = r10 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x05fb }
            r13 = 1
            if (r0 != 0) goto L_0x0262
        L_0x0261:
            r13 = 0
        L_0x0262:
            X.2qB r0 = r9.A07     // Catch:{ all -> 0x05fb }
            r0.A02(r8, r7, r2)     // Catch:{ all -> 0x05fb }
            com.whatsapp.jid.UserJid r11 = r8.userJid     // Catch:{ all -> 0x05fb }
            X.2ge r0 = r9.A08     // Catch:{ all -> 0x05fb }
            r8 = r0
            long r0 = r7.A1L     // Catch:{ all -> 0x05fb }
            r14 = 1
            r32 = r8
            r33 = r11
            r34 = r6
            r35 = r0
            r37 = r2
            r32.A01(r33, r34, r35, r37)     // Catch:{ all -> 0x05fb }
            if (r29 == 0) goto L_0x0292
            X.2qz r1 = r9.A0A     // Catch:{ all -> 0x05fb }
            X.C626936e.A06(r11)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x05fb }
            X.34x r0 = X.C55832qz.A01(r11, r1, r0, r14)     // Catch:{ all -> 0x05fb }
            if (r0 == 0) goto L_0x0292
            long r0 = r0.A1L     // Catch:{ all -> 0x05fb }
            r35 = r0
            r32.A01(r33, r34, r35, r37)     // Catch:{ all -> 0x05fb }
        L_0x0292:
            if (r22 != 0) goto L_0x0384
            if (r29 != 0) goto L_0x029b
            if (r13 != 0) goto L_0x0384
        L_0x0298:
            r3 = 0
            goto L_0x04c5
        L_0x029b:
            if (r13 != 0) goto L_0x0384
            X.2c3 r8 = r9.A09     // Catch:{ all -> 0x05fb }
            r15 = 0
            if (r31 != 0) goto L_0x02a5
            r0 = 1
            if (r30 == 0) goto L_0x02a6
        L_0x02a5:
            r0 = 0
        L_0x02a6:
            X.C626936e.A0B(r0)     // Catch:{ all -> 0x05fb }
            java.util.List r18 = r7.A19()     // Catch:{ all -> 0x05fb }
            if (r18 == 0) goto L_0x02fb
            int r1 = r18.size()     // Catch:{ all -> 0x05fb }
            int r0 = r7.A0B     // Catch:{ all -> 0x05fb }
            if (r1 < r0) goto L_0x02fb
            int r0 = r18.size()     // Catch:{ all -> 0x05fb }
            int r0 = r0 + 1
            java.util.ArrayList r12 = X.AnonymousClass002.A0I(r0)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x05fb }
            r12.add(r0)     // Catch:{ all -> 0x05fb }
            java.util.Iterator r15 = r18.iterator()     // Catch:{ all -> 0x05fb }
        L_0x02ca:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x05fb }
            if (r0 == 0) goto L_0x02de
            X.4uZ r1 = X.C18300x5.A0P(r15)     // Catch:{ all -> 0x05fb }
            X.2sm r0 = r8.A02     // Catch:{ all -> 0x05fb }
            long r0 = r0.A07(r1)     // Catch:{ all -> 0x05fb }
            X.C18280x3.A1K(r12, r0)     // Catch:{ all -> 0x05fb }
            goto L_0x02ca
        L_0x02de:
            java.lang.String[] r12 = X.C18300x5.A1b(r12)     // Catch:{ all -> 0x05fb }
            int r1 = r18.size()     // Catch:{ all -> 0x05fb }
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "SELECT chat_row_id, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM available_message_view WHERE from_me = 1 AND broadcast = 2 AND (receipt_device_timestamp > 0 OR read_device_timestamp > 0 OR played_device_timestamp > 0) AND key_id = ? AND "
            r15.append(r0)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "chat_row_id IN "
            X.C57212tH.A02(r0, r15, r1)     // Catch:{ all -> 0x05fb }
            java.lang.String r18 = r15.toString()     // Catch:{ all -> 0x05fb }
            java.lang.String r15 = "GET_MESSAGE_RECEIPTS_FOR_PARTICIPANTS_DEPRECATED"
            goto L_0x0314
        L_0x02fb:
            java.lang.String r0 = "msgstore/getMessageReceiptsForBroadcastMessage falling back to table scan"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x05fb }
            X.2qk r12 = r8.A00     // Catch:{ all -> 0x05fb }
            java.lang.String r1 = "message-table-scan"
            java.lang.String r0 = "get-broadcast-receipts"
            r12.A0A(r1, r14, r0)     // Catch:{ all -> 0x05fb }
            java.lang.String[] r12 = new java.lang.String[r14]     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x05fb }
            r12[r15] = r0     // Catch:{ all -> 0x05fb }
            java.lang.String r18 = "SELECT chat_row_id, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM available_message_view WHERE from_me = 1 AND broadcast = 2 AND (receipt_device_timestamp > 0 OR read_device_timestamp > 0 OR played_device_timestamp > 0) AND key_id = ?"
            java.lang.String r15 = "GET_BROADCAST_MESSAGE_RECEIPTS_SQL_DEPRECATED"
        L_0x0314:
            X.2W3 r21 = new X.2W3     // Catch:{ all -> 0x05fb }
            r21.<init>()     // Catch:{ all -> 0x05fb }
            X.3dV r0 = r8.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x038b }
            X.4GK r20 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x038b }
            r1 = r20
            r0 = r18
            android.database.Cursor r12 = X.C56862sg.A03(r1, r0, r15, r12)     // Catch:{ all -> 0x037a }
        L_0x0327:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x036e }
            if (r0 == 0) goto L_0x0367
            X.2sm r0 = r8.A02     // Catch:{ all -> 0x036e }
            r1 = r0
            java.lang.String r0 = "chat_row_id"
            long r18 = X.AnonymousClass0x2.A0C(r12, r0)     // Catch:{ all -> 0x036e }
            r15 = r1
            r0 = r18
            X.4uZ r0 = r15.A0B(r0)     // Catch:{ all -> 0x036e }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r0)     // Catch:{ all -> 0x036e }
            if (r0 == 0) goto L_0x0327
            java.lang.String r1 = "receipt_device_timestamp"
            long r33 = X.AnonymousClass0x2.A0C(r12, r1)     // Catch:{ all -> 0x036e }
            java.lang.String r1 = "read_device_timestamp"
            long r35 = X.AnonymousClass0x2.A0C(r12, r1)     // Catch:{ all -> 0x036e }
            java.lang.String r1 = "played_device_timestamp"
            long r37 = X.AnonymousClass0x2.A0C(r12, r1)     // Catch:{ all -> 0x036e }
            X.2z3 r15 = new X.2z3     // Catch:{ all -> 0x036e }
            r32 = r15
            r32.<init>(r33, r35, r37)     // Catch:{ all -> 0x036e }
            r1 = r21
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00     // Catch:{ all -> 0x036e }
            r1.put(r0, r15)     // Catch:{ all -> 0x036e }
            goto L_0x0327
        L_0x0367:
            r12.close()     // Catch:{ all -> 0x037a }
            r20.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x038b }
            goto L_0x0394
        L_0x036e:
            r0 = move-exception
            if (r12 == 0) goto L_0x0379
            r12.close()     // Catch:{ all -> 0x0375 }
            goto L_0x0379
        L_0x0375:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ all -> 0x037a }
        L_0x0379:
            throw r0     // Catch:{ all -> 0x037a }
        L_0x037a:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x037f }
            goto L_0x0383
        L_0x037f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x038b }
        L_0x0383:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x038b }
        L_0x0384:
            X.2c3 r8 = r9.A09     // Catch:{ all -> 0x05fb }
            X.2W3 r21 = r8.A00(r5, r13)     // Catch:{ all -> 0x05fb }
            goto L_0x0394
        L_0x038b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x05fb }
            X.2q5 r0 = r8.A04     // Catch:{ all -> 0x05fb }
            r0.A04()     // Catch:{ all -> 0x05fb }
        L_0x0394:
            X.C626936e.A06(r11)     // Catch:{ all -> 0x05fb }
            r0 = r21
            boolean r0 = r0.A00(r11, r6, r2)     // Catch:{ all -> 0x05fb }
            if (r0 == 0) goto L_0x0298
            if (r22 != 0) goto L_0x03a5
            if (r13 != 0) goto L_0x03a5
            goto L_0x04ae
        L_0x03a5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "receiptmessagestore/writeReceipt/key="
            r1.append(r0)     // Catch:{ all -> 0x05fb }
            r1.append(r5)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "; status="
            r1.append(r0)     // Catch:{ all -> 0x05fb }
            r1.append(r6)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "; timestamp="
            X.C18260x0.A12(r0, r1, r2)     // Catch:{ all -> 0x05fb }
            long r21 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x05fb }
            android.content.ContentValues r12 = X.AnonymousClass0x9.A07(r14)     // Catch:{ all -> 0x05fb }
            r0 = 5
            java.lang.String r1 = " "
            if (r6 == r0) goto L_0x03f1
            r0 = 8
            if (r6 == r0) goto L_0x03f5
            r0 = 13
            if (r6 != r0) goto L_0x03d8
            java.lang.String r0 = "read_device_timestamp"
            goto L_0x03f8
        L_0x03d8:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "Unexpected status "
            r2.append(r0)     // Catch:{ all -> 0x05fb }
            r2.append(r6)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = " for message "
            r2.append(r0)     // Catch:{ all -> 0x05fb }
            r2.append(r5)     // Catch:{ all -> 0x05fb }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r11, r1, r2)     // Catch:{ all -> 0x05fb }
            throw r0     // Catch:{ all -> 0x05fb }
        L_0x03f1:
            java.lang.String r0 = "receipt_device_timestamp"
            goto L_0x03f8
        L_0x03f5:
            java.lang.String r0 = "played_device_timestamp"
        L_0x03f8:
            X.C18270x1.A0c(r12, r0, r2)     // Catch:{ all -> 0x05fb }
            java.lang.String r3 = X.C18300x5.A0i(r11)     // Catch:{ all -> 0x05fb }
            java.lang.String r2 = X.C18300x5.A0i(r10)     // Catch:{ all -> 0x05fb }
            r0 = 3
            java.lang.String[] r20 = X.C18300x5.A1a(r2, r0)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x05fb }
            r13 = r20
            X.C18300x5.A1K(r0, r3, r13)     // Catch:{ all -> 0x05fb }
            X.3dV r13 = r8.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x04a4 }
            X.4Fq r19 = r13.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04a4 }
            X.3Yo r18 = r19.Axl()     // Catch:{ all -> 0x049a }
            r13 = r19
            X.3H0 r13 = (X.AnonymousClass3H0) r13     // Catch:{ all -> 0x0490 }
            X.2sg r13 = r13.A03     // Catch:{ all -> 0x0490 }
            r32 = r13
            java.lang.String r15 = "receipts"
            java.lang.String r35 = "key_remote_jid = ? AND key_id = ? AND remote_resource = ?"
            java.lang.String r36 = "writeReceipt/UPDATE_RECEIPTS"
            r33 = r12
            r34 = r15
            r37 = r20
            int r13 = r32.A05(r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0490 }
            if (r13 != 0) goto L_0x047d
            java.lang.String r13 = "key_remote_jid"
            r12.put(r13, r2)     // Catch:{ all -> 0x0490 }
            java.lang.String r2 = "key_id"
            r12.put(r2, r0)     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = "remote_resource"
            r12.put(r0, r3)     // Catch:{ all -> 0x0490 }
            java.lang.String r3 = "writeReceipt/INSERT_RECEIPTS"
            r2 = r32
            long r12 = r2.A08(r15, r3, r12)     // Catch:{ all -> 0x0490 }
            r2 = -1
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x047d
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = "msgstore/updatemessagetargetstatusinbackground/insert/failed "
            r2.append(r0)     // Catch:{ all -> 0x0490 }
            r2.append(r5)     // Catch:{ all -> 0x0490 }
            X.C18260x0.A1Q(r2, r1, r11)     // Catch:{ all -> 0x0490 }
            X.2qk r3 = r8.A00     // Catch:{ all -> 0x0490 }
            java.lang.String r2 = "ReceiptsMessageStore: update or insert failed"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = "key="
            r1.append(r0)     // Catch:{ all -> 0x0490 }
            r1.append(r5)     // Catch:{ all -> 0x0490 }
            java.lang.String r0 = " participant="
            java.lang.String r0 = X.AnonymousClass000.A0P(r11, r0, r1)     // Catch:{ all -> 0x0490 }
            r3.A0A(r2, r14, r0)     // Catch:{ all -> 0x0490 }
        L_0x047d:
            r18.A00()     // Catch:{ all -> 0x0490 }
            X.2ga r3 = r8.A03     // Catch:{ all -> 0x0490 }
            java.lang.String r2 = "ReceiptsMessageStore/writeReceipt"
            r0 = r21
            X.C49472ga.A00(r3, r2, r0)     // Catch:{ all -> 0x0490 }
            r18.close()     // Catch:{ all -> 0x049a }
            r19.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04a4 }
            goto L_0x04b9
        L_0x0490:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0495 }
            goto L_0x0499
        L_0x0495:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x049a }
        L_0x0499:
            throw r1     // Catch:{ all -> 0x049a }
        L_0x049a:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x049f }
            goto L_0x04a3
        L_0x049f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x04a4 }
        L_0x04a3:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x04a4 }
        L_0x04a4:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x05fb }
            X.2q5 r0 = r8.A04     // Catch:{ all -> 0x05fb }
            r0.A04()     // Catch:{ all -> 0x05fb }
            goto L_0x04b9
        L_0x04ae:
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x05fb }
            X.2z0 r1 = X.AnonymousClass2z0.A05(r11, r0, r14)     // Catch:{ all -> 0x05fb }
            X.0Qw r0 = r9.A00     // Catch:{ all -> 0x05fb }
            r0.A05(r1)     // Catch:{ all -> 0x05fb }
        L_0x04b9:
            X.2ga r3 = r9.A04     // Catch:{ all -> 0x05fb }
            long r0 = X.C18310x6.A0A(r16)     // Catch:{ all -> 0x05fb }
            java.lang.String r2 = "ReceiptManager/addMessageReceipt"
            r3.A02(r2, r0)     // Catch:{ all -> 0x05fb }
            r3 = 1
        L_0x04c5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus/added="
            r1.append(r0)     // Catch:{ all -> 0x05fb }
            r1.append(r3)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "; remoteChatJid="
            r1.append(r0)     // Catch:{ all -> 0x05fb }
            r1.append(r10)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "; status="
            r1.append(r0)     // Catch:{ all -> 0x05fb }
            r1.append(r6)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "; key.id="
            r1.append(r0)     // Catch:{ all -> 0x05fb }
            java.lang.String r2 = r5.A01     // Catch:{ all -> 0x05fb }
            X.C18260x0.A1L(r1, r2)     // Catch:{ all -> 0x05fb }
            if (r3 == 0) goto L_0x04fc
            if (r28 == 0) goto L_0x04fc
            X.3Lv r1 = r4.A08     // Catch:{ all -> 0x05fb }
            r11 = 1
            r0 = r39
            X.2z0 r0 = X.AnonymousClass2z0.A05(r0, r2, r14)     // Catch:{ all -> 0x05fb }
            r1.A0g(r0, r6)     // Catch:{ all -> 0x05fb }
            goto L_0x04fd
        L_0x04fc:
            r11 = 1
        L_0x04fd:
            if (r31 != 0) goto L_0x0505
            if (r30 != 0) goto L_0x0505
            if (r29 != 0) goto L_0x0505
            if (r27 == 0) goto L_0x05cd
        L_0x0505:
            X.C626936e.A0B(r14)     // Catch:{ all -> 0x05fb }
            X.2W3 r0 = r9.A00(r7)     // Catch:{ all -> 0x05fb }
            int r13 = r7.A0B     // Catch:{ all -> 0x05fb }
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00     // Catch:{ all -> 0x05fb }
            java.util.Iterator r12 = X.C18290x4.A10(r0)     // Catch:{ all -> 0x05fb }
            r10 = 0
            r8 = 0
            r3 = 0
        L_0x0517:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x05fb }
            r2 = 13
            r1 = 8
            r6 = 5
            if (r0 == 0) goto L_0x053a
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x05fb }
            X.2z3 r0 = (X.C60722z3) r0     // Catch:{ all -> 0x05fb }
            int r0 = r0.A00()     // Catch:{ all -> 0x05fb }
            if (r0 == r6) goto L_0x0537
            if (r0 == r1) goto L_0x0533
            if (r0 == r2) goto L_0x0535
            goto L_0x0517
        L_0x0533:
            int r10 = r10 + 1
        L_0x0535:
            int r8 = r8 + 1
        L_0x0537:
            int r3 = r3 + 1
            goto L_0x0517
        L_0x053a:
            if (r10 < r13) goto L_0x053f
            r6 = 8
            goto L_0x0547
        L_0x053f:
            if (r8 < r13) goto L_0x0544
            r6 = 13
            goto L_0x0547
        L_0x0544:
            if (r3 >= r13) goto L_0x0547
            r6 = 4
        L_0x0547:
            int r0 = r7.A0D     // Catch:{ all -> 0x05fb }
            if (r6 == r0) goto L_0x0577
            int r0 = X.AnonymousClass358.A00(r0, r6)     // Catch:{ all -> 0x05fb }
            if (r0 <= 0) goto L_0x05ca
            X.2W3 r0 = r9.A00(r7)     // Catch:{ all -> 0x05fb }
            java.util.concurrent.ConcurrentHashMap r1 = r0.A00     // Catch:{ all -> 0x05fb }
            int r0 = r1.size()     // Catch:{ all -> 0x05fb }
            java.util.ArrayList r8 = X.AnonymousClass002.A0I(r0)     // Catch:{ all -> 0x05fb }
            java.util.Iterator r1 = X.C18290x4.A10(r1)     // Catch:{ all -> 0x05fb }
        L_0x0563:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x05fb }
            if (r0 == 0) goto L_0x0579
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x05fb }
            X.2z3 r0 = (X.C60722z3) r0     // Catch:{ all -> 0x05fb }
            int r0 = r0.A00()     // Catch:{ all -> 0x05fb }
            X.C18270x1.A1K(r8, r0)     // Catch:{ all -> 0x05fb }
            goto L_0x0563
        L_0x0577:
            r11 = 0
            goto L_0x05de
        L_0x0579:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "MessageStatusStore/statusDowngrade: "
            r3.append(r0)     // Catch:{ all -> 0x05fb }
            r3.append(r5)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = " fMessage:"
            r3.append(r0)     // Catch:{ all -> 0x05fb }
            int r0 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x05fb }
            r3.append(r0)     // Catch:{ all -> 0x05fb }
            java.lang.String r2 = " remoteUser:"
            r1 = r26
            r0 = r39
            X.AnonymousClass000.A17(r0, r2, r1, r3)     // Catch:{ all -> 0x05fb }
            int r0 = r7.A0D     // Catch:{ all -> 0x05fb }
            r3.append(r0)     // Catch:{ all -> 0x05fb }
            r0 = r25
            r3.append(r0)     // Catch:{ all -> 0x05fb }
            r3.append(r6)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = " recipientCount:"
            r3.append(r0)     // Catch:{ all -> 0x05fb }
            int r0 = r7.A0B     // Catch:{ all -> 0x05fb }
            r3.append(r0)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = " statuses:"
            r3.append(r0)     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r8)     // Catch:{ all -> 0x05fb }
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r3)     // Catch:{ all -> 0x05fb }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x05fb }
            X.2qk r1 = r4.A00     // Catch:{ all -> 0x05fb }
            java.lang.String r0 = "MessageStatusStore/statusDowngrade"
            r1.A0A(r0, r14, r2)     // Catch:{ all -> 0x05fb }
        L_0x05ca:
            r7.A1G(r6)     // Catch:{ all -> 0x05fb }
        L_0x05cd:
            X.3Lv r0 = r4.A08     // Catch:{ all -> 0x05fb }
            r0.A0g(r5, r6)     // Catch:{ all -> 0x05fb }
            X.2q7 r0 = r4.A0E     // Catch:{ all -> 0x05fb }
            r0.A04(r7)     // Catch:{ all -> 0x05fb }
            r1 = 43
            r0 = r24
            X.C70093Zw.A01(r0, r4, r7, r1)     // Catch:{ all -> 0x05fb }
        L_0x05de:
            r23.A00()     // Catch:{ all -> 0x05fb }
            r23.close()     // Catch:{ all -> 0x0605 }
            r24.close()
            if (r11 == 0) goto L_0x05f3
            X.2hU r0 = r4.A09
            android.os.Handler r2 = r0.A02
            r0 = 2
            r1 = -1
        L_0x05ef:
            X.C18300x5.A16(r2, r7, r0, r1)
            return r11
        L_0x05f3:
            r1 = -1
            X.2hU r0 = r4.A09
            android.os.Handler r2 = r0.A02
            r0 = 10
            goto L_0x05ef
        L_0x05fb:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x0600 }
            goto L_0x0604
        L_0x0600:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0605 }
        L_0x0604:
            throw r1     // Catch:{ all -> 0x0605 }
        L_0x0605:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x060a }
            throw r1
        L_0x060a:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass300.A04(com.whatsapp.jid.DeviceJid, X.34x, int, long):boolean");
    }

    public AnonymousClass300(C55682qk r2, C56972sr r3, AnonymousClass36E r4, C153167am r5, C56612sH r6, C52852m9 r7, C56542sA r8, C56982ss r9, C66543Lv r10, C50012hU r11, C54762pF r12, C72303dV r13, C49502gd r14, C55332qB r15, C54012o2 r16, C55292q7 r17, AnonymousClass1VX r18, AnonymousClass34P r19, C55882r4 r20, AnonymousClass33Y r21, AnonymousClass33S r22, C619933b r23, C50252hs r24, C55832qz r25, AnonymousClass4FS r26, C183538qC r27) {
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = r9;
        this.A06 = r8;
        this.A0J = r22;
        this.A0I = r21;
        this.A0L = r24;
        this.A0O = r27;
        this.A09 = r11;
        this.A02 = r4;
        this.A0D = r16;
        this.A08 = r10;
        this.A0M = r25;
        this.A0H = r20;
        this.A05 = r7;
        this.A0G = r19;
        this.A0K = r23;
        this.A0A = r13;
        this.A0B = r14;
        this.A0C = r15;
        this.A0E = r17;
        this.A0P = r12.A02;
        this.A0N = r26;
        this.A03 = r5;
        this.A0F = r18;
        r10.A00 = this;
    }
}
