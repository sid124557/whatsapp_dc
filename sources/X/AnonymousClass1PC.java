package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1PC  reason: invalid class name */
public final class AnonymousClass1PC extends AnonymousClass54P {
    public static final AnonymousClass5ZC A0Z = new AnonymousClass5ZC(1, 1000, 1000000, true);
    public final C55682qk A00;
    public final AnonymousClass3DP A01;
    public final C56962sq A02;
    public final C60122y2 A03;
    public final C64773Ex A04;
    public final AnonymousClass2FW A05;
    public final AnonymousClass30T A06;
    public final C56892sj A07;
    public final C56652sL A08;
    public final C620533h A09;
    public final C59972xn A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass4FV A0C;
    public final C95814uZ A0D;
    public final AnonymousClass9U4 A0E;
    public final C186568vZ A0F;
    public final C56072rN A0G;
    public final AnonymousClass2ML A0H;
    public final C183538qC A0I;
    public final HashSet A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    public static final List A00(List list) {
        AnonymousClass33M A022 = AnonymousClass33M.A02(false);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            if (!C627336j.A0L(((AnonymousClass3ZH) next).A0H)) {
                A0s.add(next);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33M.A03(A022, "loadContactsTask/filterOutLidContacts took ", A0o);
        C18260x0.A1J(A0o, " ms");
        return A0s;
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0269, code lost:
        if (r15.contains(43) != false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03e6, code lost:
        if (r14.A01.A0Y(r8, 3751) == false) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03f2, code lost:
        if (r14.A01.A0Y(r8, 3762) != false) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b2, code lost:
        if (r11 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d1, code lost:
        if (r9.A0Y(r8, 5392) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e0, code lost:
        if (r9.A0O(r8, 4833) < 1) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a0, code lost:
        if (r13 == null) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a2, code lost:
        if (r16 == null) goto L_0x01b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r35) {
        /*
            r34 = this;
            r7 = 0
            r0 = r35
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r0, r7)
            java.lang.String r0 = "contactpicker/load-contacts forward:"
            r1.append(r0)
            r5 = r34
            boolean r4 = r5.A0T
            r1.append(r4)
            java.lang.String r0 = " share:"
            r1.append(r0)
            boolean r3 = r5.A0Y
            r1.append(r3)
            java.lang.String r0 = " newChat:"
            r1.append(r0)
            boolean r2 = r5.A0U
            r1.append(r2)
            java.lang.String r0 = " contactList:"
            r1.append(r0)
            boolean r0 = r5.A0P
            r20 = r0
            r1.append(r0)
            java.lang.String r0 = " callPicker:"
            r1.append(r0)
            boolean r0 = r5.A0O
            r22 = r0
            r1.append(r0)
            java.lang.String r0 = " usageForGroupCall:"
            r1.append(r0)
            boolean r10 = r5.A0S
            X.C18260x0.A1U(r1, r10)
            X.1VX r9 = r5.A0B
            r0 = 6116(0x17e4, float:8.57E-42)
            X.2vE r8 = X.C58422vE.A02
            boolean r21 = r9.A0Y(r8, r0)
            r1 = 148445312(0x8d91880, float:1.3065972E-33)
            if (r21 == 0) goto L_0x005d
            X.8vZ r0 = r5.A0F
            r0.markerStart(r1)
        L_0x005d:
            java.lang.String r0 = "loadContactsTask/MainStopwatch"
            X.33M r6 = X.AnonymousClass33M.A01(r0)
            r6.A09()
            X.4MC r0 = r5.A02
            r24 = r0
            boolean r0 = r24.isCancelled()
            r19 = 1
            if (r0 != 0) goto L_0x00b4
            if (r4 != 0) goto L_0x0094
            if (r3 != 0) goto L_0x0094
            boolean r0 = r5.A0W
            if (r0 != 0) goto L_0x0094
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L_0x0094
            boolean r0 = r5.A0M
            if (r0 != 0) goto L_0x0094
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x0094
            if (r20 != 0) goto L_0x0094
            if (r10 == 0) goto L_0x02ab
            r0 = 4833(0x12e1, float:6.772E-42)
            int r1 = r9.A0O(r8, r0)
            r0 = r19
            if (r1 < r0) goto L_0x02ab
        L_0x0094:
            X.33M r17 = X.AnonymousClass33M.A02(r7)
            java.lang.String r13 = " ms"
            java.lang.String r16 = "loadContactsTask/getFrequentJids took "
            if (r10 == 0) goto L_0x0242
            X.2y2 r0 = r5.A03
            if (r0 == 0) goto L_0x023f
            java.util.List r11 = r0.A00
        L_0x00a4:
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0l(r16)
            long r0 = r17.A07()
            r12.append(r0)
            X.C18260x0.A1J(r12, r13)
            if (r11 != 0) goto L_0x00b6
        L_0x00b4:
            X.3d3 r11 = X.C72023d3.A00
        L_0x00b6:
            java.lang.String r0 = "loadContactsTask/gotFrequentJids"
            r6.A08(r0)
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01b8
            if (r4 != 0) goto L_0x00c9
            if (r3 == 0) goto L_0x00d3
        L_0x00c9:
            r0 = 5392(0x1510, float:7.556E-42)
            boolean r0 = r9.A0Y(r8, r0)
            r18 = 1
            if (r0 != 0) goto L_0x00d5
        L_0x00d3:
            r18 = 0
        L_0x00d5:
            if (r10 == 0) goto L_0x00e2
            r0 = 4833(0x12e1, float:6.772E-42)
            int r12 = r9.A0O(r8, r0)
            r14 = 5
            r0 = r19
            if (r12 >= r0) goto L_0x00e3
        L_0x00e2:
            r14 = 3
        L_0x00e3:
            java.util.Iterator r17 = r11.iterator()
            r13 = 0
            r16 = r13
        L_0x00ea:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01a0
            X.4uZ r12 = X.C18300x5.A0P(r17)
            if (r18 == 0) goto L_0x019a
            if (r13 == 0) goto L_0x01b2
            if (r16 != 0) goto L_0x01a4
        L_0x00fa:
            boolean r0 = r12 instanceof X.C135166kE
            if (r0 != 0) goto L_0x00ea
            X.8qC r0 = r5.A0I
            java.lang.Object r0 = r0.get()
            X.5aW r0 = (X.C106995aW) r0
            boolean r0 = r0.A0I(r12)
            if (r0 != 0) goto L_0x00ea
            X.3Ex r0 = r5.A04
            X.3ZH r11 = r0.A07(r12)
            if (r11 == 0) goto L_0x00ea
            X.2sq r0 = r5.A02
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass3ZH.A07(r11)
            boolean r0 = r0.A0P(r15)
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r12 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r12 instanceof X.C95804uY
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r5.A0L
            if (r0 == 0) goto L_0x0131
            boolean r0 = r12 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x0131
            goto L_0x00ea
        L_0x0131:
            if (r4 != 0) goto L_0x0135
            if (r3 == 0) goto L_0x013a
        L_0x0135:
            boolean r0 = r12 instanceof X.AnonymousClass1fI
            if (r0 == 0) goto L_0x013a
            goto L_0x00ea
        L_0x013a:
            boolean r0 = r11.A0U()
            if (r0 == 0) goto L_0x0155
            X.2sj r0 = r5.A07
            r23 = r0
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r15 = X.AnonymousClass3ZH.A05(r11, r0)
            com.whatsapp.jid.GroupJid r15 = (com.whatsapp.jid.GroupJid) r15
            r0 = r23
            boolean r0 = r0.A0C(r15)
            if (r0 != 0) goto L_0x0155
            goto L_0x00ea
        L_0x0155:
            X.4uZ r0 = r5.A0D
            boolean r0 = X.C162457s7.A0P(r12, r0)
            if (r0 != 0) goto L_0x00ea
            if (r20 != 0) goto L_0x016b
            X.2FW r0 = r5.A05
            X.1VX r12 = r0.A00
            r0 = 6317(0x18ad, float:8.852E-42)
            boolean r0 = r12.A0Y(r8, r0)
            if (r0 == 0) goto L_0x0173
        L_0x016b:
            boolean r0 = r11.A0U()
            if (r0 == 0) goto L_0x0173
            goto L_0x00ea
        L_0x0173:
            int r0 = r1.size()
            if (r0 >= r14) goto L_0x0197
            r1.add(r11)
            if (r18 == 0) goto L_0x00ea
            boolean r0 = r5.A0H(r11)
            if (r0 != 0) goto L_0x0185
            r13 = r11
        L_0x0185:
            int r0 = r1.size()
            if (r0 < r14) goto L_0x00ea
            if (r11 == r13) goto L_0x00ea
            boolean r0 = r5.A0H(r11)
            if (r0 == 0) goto L_0x00ea
            r16 = r11
            goto L_0x00ea
        L_0x0197:
            if (r18 == 0) goto L_0x00ea
            goto L_0x0185
        L_0x019a:
            int r0 = r1.size()
            if (r0 < r14) goto L_0x00fa
        L_0x01a0:
            if (r13 == 0) goto L_0x01b8
            if (r16 == 0) goto L_0x01b8
        L_0x01a4:
            java.lang.String r0 = "LoadContactsTask/getTopContacts promoting a small group"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1.remove(r13)
            r0 = r16
            r1.add(r0)
            goto L_0x01b8
        L_0x01b2:
            int r0 = r1.size()
            if (r0 < r14) goto L_0x00fa
        L_0x01b8:
            java.lang.String r0 = "loadContactsTask/gotTopContacts"
            r6.A08(r0)
            java.util.ArrayList r18 = X.AnonymousClass001.A0s()
            r0 = 3689(0xe69, float:5.17E-42)
            boolean r0 = r9.A0Y(r8, r0)
            if (r0 == 0) goto L_0x01d1
            if (r22 != 0) goto L_0x0211
            if (r2 != 0) goto L_0x0211
            if (r10 != 0) goto L_0x0211
            if (r20 != 0) goto L_0x0211
        L_0x01d1:
            java.lang.String r0 = "loadContactsTask/gotRecentlyAcceptedInviteContacts"
            r6.A08(r0)
            X.2FW r0 = r5.A05
            X.1VX r14 = r0.A00
            r12 = 6317(0x18ad, float:8.852E-42)
            boolean r0 = r14.A0Y(r8, r12)
            if (r0 == 0) goto L_0x0313
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            boolean r0 = r14.A0Y(r8, r12)
            if (r0 == 0) goto L_0x0315
            java.util.HashMap r13 = X.AnonymousClass001.A0t()
            r0 = 6319(0x18af, float:8.855E-42)
            float r17 = r14.A0M(r8, r0)
            java.util.Iterator r15 = r1.iterator()
        L_0x01fa:
            boolean r0 = r15.hasNext()
            r16 = 981668463(0x3a83126f, float:0.001)
            if (r0 == 0) goto L_0x02b7
            java.lang.Object r12 = r15.next()
            java.lang.Float r0 = java.lang.Float.valueOf(r17)
            r13.put(r12, r0)
            float r17 = r17 - r16
            goto L_0x01fa
        L_0x0211:
            X.2xn r0 = r5.A0A
            java.util.ArrayList r0 = r0.A00()
            java.util.Iterator r13 = r0.iterator()
        L_0x021b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01d1
            X.4uZ r11 = X.C18300x5.A0P(r13)
            X.3Ex r0 = r5.A04
            X.3ZH r12 = r0.A07(r11)
            if (r12 == 0) goto L_0x021b
            X.2sq r11 = r5.A02
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r12)
            boolean r0 = r11.A0P(r0)
            if (r0 != 0) goto L_0x021b
            r0 = r18
            r0.add(r12)
            goto L_0x021b
        L_0x023f:
            r11 = 0
            goto L_0x00a4
        L_0x0242:
            X.30T r14 = r5.A06
            boolean r0 = r14.A06()
            if (r0 == 0) goto L_0x024f
            X.3DP r0 = r5.A01
            r0.A03()
        L_0x024f:
            java.util.HashSet r15 = r5.A0J
            java.lang.Integer r0 = X.C18290x4.A0a()
            boolean r0 = r15.contains(r0)
            r12 = 100
            r11 = 1
            if (r0 != 0) goto L_0x026b
            r0 = 43
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r15.contains(r0)
            r1 = 1
            if (r0 == 0) goto L_0x026d
        L_0x026b:
            r1 = 100
        L_0x026d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            boolean r0 = r15.contains(r0)
            if (r0 != 0) goto L_0x0283
            r0 = 42
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r15.contains(r0)
            if (r0 == 0) goto L_0x0285
        L_0x0283:
            r11 = 100
        L_0x0285:
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r15.contains(r0)
            if (r0 != 0) goto L_0x0292
            r12 = 1
        L_0x0292:
            X.3GQ r0 = new X.3GQ
            r0.<init>(r11, r12, r1)
            java.util.List r11 = r14.A01(r0, r7)
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0l(r16)
            long r0 = r17.A07()
            r12.append(r0)
            X.C18260x0.A1J(r12, r13)
            goto L_0x00b6
        L_0x02ab:
            if (r2 == 0) goto L_0x00b4
            r0 = 691(0x2b3, float:9.68E-43)
            boolean r0 = r9.A0Y(r8, r0)
            if (r0 == 0) goto L_0x00b4
            goto L_0x0094
        L_0x02b7:
            r0 = 6318(0x18ae, float:8.853E-42)
            float r15 = r14.A0M(r8, r0)
            java.util.Iterator r14 = r18.iterator()
        L_0x02c1:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x02eb
            java.lang.Object r12 = r14.next()
            boolean r0 = r13.containsKey(r12)
            if (r0 == 0) goto L_0x02e6
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r12, r13)
            if (r0 == 0) goto L_0x02e3
            float r0 = r0.floatValue()
            float r0 = r0 + r15
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x02e0:
            r13.put(r12, r0)
        L_0x02e3:
            float r15 = r15 - r16
            goto L_0x02c1
        L_0x02e6:
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            goto L_0x02e0
        L_0x02eb:
            java.util.Set r0 = r13.entrySet()
            X.C162457s7.A0J(r0, r7)
            java.util.ArrayList r14 = X.AnonymousClass002.A0J(r0)
            X.45W r13 = X.AnonymousClass45W.A00
            r12 = 5
            X.4IS r0 = new X.4IS
            r0.<init>((java.lang.Object) r13, (int) r12)
            X.C73753g1.A0a(r14, r0)
            java.util.Iterator r12 = r14.iterator()
        L_0x0305:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0315
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r12)
            X.AnonymousClass0x7.A1J(r11, r0)
            goto L_0x0305
        L_0x0313:
            X.3d3 r11 = X.C72023d3.A00
        L_0x0315:
            java.lang.String r0 = "loadContactsTask/gotSuggestedContacts"
            r6.A08(r0)
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            boolean r0 = r24.isCancelled()
            if (r0 != 0) goto L_0x0333
            boolean r0 = r5.A0X
            if (r0 == 0) goto L_0x036d
            X.3Ex r0 = r5.A04
            X.1vC r0 = r0.A05
            java.util.ArrayList r0 = r0.A0C()
            r13.addAll(r0)
        L_0x0333:
            java.lang.String r0 = "loadContactsTask/gotAllContacts"
            r6.A08(r0)
            r12 = 0
            if (r4 == 0) goto L_0x03a2
            r0 = 6011(0x177b, float:8.423E-42)
            boolean r0 = r9.A0Y(r8, r0)
            if (r0 == 0) goto L_0x03a2
            java.util.HashSet r17 = X.AnonymousClass002.A0K()
            java.util.Iterator r15 = r13.iterator()
        L_0x034b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x03a4
            X.3ZH r14 = X.C18310x6.A0R(r15)
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r10 = r14.A0I(r0)
            X.4uZ r10 = (X.C95814uZ) r10
            if (r10 == 0) goto L_0x034b
            X.2rN r0 = r5.A0G
            boolean r0 = r0.A04(r14, r10)
            if (r0 == 0) goto L_0x034b
            r0 = r17
            r0.add(r10)
            goto L_0x034b
        L_0x036d:
            if (r10 != 0) goto L_0x038d
            if (r22 != 0) goto L_0x038d
            boolean r0 = r5.A0N
            if (r0 != 0) goto L_0x0387
            if (r2 != 0) goto L_0x0387
            if (r20 != 0) goto L_0x0387
            if (r4 != 0) goto L_0x0393
            if (r3 != 0) goto L_0x0393
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x0393
            X.3Ex r0 = r5.A04
            r0.A0h(r13)
            goto L_0x0333
        L_0x0387:
            X.3Ex r0 = r5.A04
            r0.A0b(r13)
            goto L_0x0333
        L_0x038d:
            X.3Ex r0 = r5.A04
            X.1vC r0 = r0.A05
            r14 = 2
            goto L_0x0398
        L_0x0393:
            X.3Ex r0 = r5.A04
            X.1vC r0 = r0.A05
            r14 = 3
        L_0x0398:
            r16 = r7
            r17 = r7
            r12 = r0
            r15 = r7
            r12.A0U(r13, r14, r15, r16, r17)
            goto L_0x0333
        L_0x03a2:
            r17 = r12
        L_0x03a4:
            java.lang.String r0 = "loadContactsTask/gotReadyOnlyGroupJids"
            r6.A08(r0)
            java.util.ArrayList r16 = X.AnonymousClass001.A0s()
            boolean r0 = r24.isCancelled()
            if (r0 != 0) goto L_0x03c6
            if (r2 == 0) goto L_0x03c6
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x03c6
            X.3Ex r0 = r5.A04
            X.1vC r0 = r0.A05
            java.util.ArrayList r10 = r0.A0C()
            r0 = r16
            r0.addAll(r10)
        L_0x03c6:
            java.lang.String r0 = "loadContactsTask/gotGroupContacts"
            r6.A08(r0)
            if (r4 != 0) goto L_0x0507
            if (r3 != 0) goto L_0x0507
            boolean r0 = r5.A0W
            if (r0 != 0) goto L_0x0507
        L_0x03d3:
            X.3d3 r10 = X.C72023d3.A00
        L_0x03d5:
            java.lang.String r0 = "loadContactsTask/gotNewsletterContacts"
            r6.A08(r0)
            X.2ML r14 = r5.A0H
            if (r2 == 0) goto L_0x03e8
            X.1VX r15 = r14.A01
            r0 = 3751(0xea7, float:5.256E-42)
            boolean r0 = r15.A0Y(r8, r0)
            if (r0 != 0) goto L_0x03f4
        L_0x03e8:
            if (r22 == 0) goto L_0x04fd
            X.1VX r14 = r14.A01
            r0 = 3762(0xeb2, float:5.272E-42)
            boolean r0 = r14.A0Y(r8, r0)
            if (r0 == 0) goto L_0x04fd
        L_0x03f4:
            java.lang.String r0 = "loadContactsTask/filterLidContacts"
            r6.A08(r0)
            java.util.List r13 = r5.A0G(r13)
            java.util.List r25 = r5.A0G(r1)
            java.lang.String r0 = "loadContactsTask/filterBotContacts"
            r6.A08(r0)
            r0 = r19
            X.5L3[] r0 = new X.AnonymousClass5L3[r0]
            X.3d3 r28 = X.C72023d3.A00
            X.2y2 r15 = r5.A03
            X.5L3 r23 = new X.5L3
            r24 = r15
            r26 = r13
            r27 = r16
            r29 = r11
            r30 = r12
            r31 = r18
            r32 = r10
            r33 = r17
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0[r7] = r23
            r5.A0F(r0)
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x0445
            if (r22 == 0) goto L_0x04e5
            X.3Ex r8 = r5.A04
            X.1vC r8 = r8.A05
            r28 = 2
        L_0x0438:
            r31 = r7
            r26 = r8
            r27 = r1
            r29 = r19
            r30 = r7
            r26.A0U(r27, r28, r29, r30, r31)
        L_0x0445:
            java.util.List r28 = r5.A0G(r1)
            java.lang.String r1 = "loadContactsTask/gotDeviceContacts"
            r6.A08(r1)
            if (r0 != 0) goto L_0x04d9
            r30 = 0
        L_0x0452:
            java.lang.String r0 = "loadContactsTask/gotPaymentsContacts"
            r6.A08(r0)
            long r0 = r6.A07()
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "contactpicker/LoadContactsTask took "
            r8.append(r6)
            r8.append(r0)
            java.lang.String r6 = " ms to load "
            X.AnonymousClass000.A1H(r6, r8, r13)
            java.lang.String r6 = " contacts"
            X.C18260x0.A1L(r8, r6)
            r8 = 15000(0x3a98, double:7.411E-320)
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0486
            X.5ZC r6 = A0Z
            boolean r6 = r6.A00()
            if (r6 == 0) goto L_0x0486
            X.2qk r8 = r5.A00
            java.lang.String r6 = "contactpicker/LoadContactsTask Contacts loading took too long"
            r8.A0A(r6, r7, r12)
        L_0x0486:
            if (r21 == 0) goto L_0x049a
            X.8vZ r9 = r5.A0F
            java.lang.String r8 = "contacts_count"
            int r7 = r13.size()
            r6 = 148445312(0x8d91880, float:1.3065972E-33)
            r9.markerAnnotate((int) r6, (java.lang.String) r8, (int) r7)
            r7 = 2
            r9.markerEnd(r6, r7)
        L_0x049a:
            X.1Xz r6 = new X.1Xz
            r6.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A00 = r0
            java.lang.String r0 = "load-contacts-task"
            r6.A02 = r0
            if (r4 == 0) goto L_0x04c3
            java.lang.String r0 = "usageForward"
        L_0x04ae:
            r6.A01 = r0
            X.4FV r0 = r5.A0C
            r0.BhD(r6)
            X.5L3 r23 = new X.5L3
            r26 = r13
            r27 = r16
            r29 = r11
            r31 = r18
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r23
        L_0x04c3:
            if (r2 == 0) goto L_0x04c9
            java.lang.String r0 = "usageNewChat"
            goto L_0x04ae
        L_0x04c9:
            if (r3 == 0) goto L_0x04cf
            java.lang.String r0 = "usageShare"
            goto L_0x04ae
        L_0x04cf:
            if (r20 == 0) goto L_0x04d5
            java.lang.String r0 = "usageContactList"
            goto L_0x04ae
        L_0x04d5:
            java.lang.String r0 = "other"
            goto L_0x04ae
        L_0x04d9:
            X.9U4 r0 = r5.A0E
            X.8EA r0 = r0.A0B()
            java.util.List r30 = r0.A0C()
            goto L_0x0452
        L_0x04e5:
            if (r2 != 0) goto L_0x04f5
            if (r4 != 0) goto L_0x04eb
            if (r3 == 0) goto L_0x0445
        L_0x04eb:
            r14 = 6741(0x1a55, float:9.446E-42)
            int r9 = r9.A0O(r8, r14)
            r8 = r19
            if (r9 != r8) goto L_0x0445
        L_0x04f5:
            X.3Ex r8 = r5.A04
            X.1vC r8 = r8.A05
            r28 = 1
            goto L_0x0438
        L_0x04fd:
            java.util.List r13 = A00(r13)
            java.util.List r1 = A00(r1)
            goto L_0x03f4
        L_0x0507:
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x03d3
            r0 = 6323(0x18b3, float:8.86E-42)
            boolean r0 = r9.A0Y(r8, r0)
            if (r0 == 0) goto L_0x03d3
            X.2sL r0 = r5.A08
            java.util.List r0 = r0.A05()
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.util.Iterator r15 = r0.iterator()
        L_0x0521:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x03d5
            X.4uZ r14 = X.C18300x5.A0P(r15)
            X.3Ex r0 = r5.A04
            X.3ZH r0 = r0.A07(r14)
            if (r0 == 0) goto L_0x0521
            r10.add(r0)
            goto L_0x0521
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PC.A08(java.lang.Object[]):java.lang.Object");
    }

    public final List A0G(List list) {
        AnonymousClass33M A022 = AnonymousClass33M.A02(false);
        if (this.A0T || this.A0Y) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : list) {
                C55502qS r0 = ((AnonymousClass3ZH) next).A0E;
                if (r0 == null || !r0.A09) {
                    A0s.add(next);
                }
            }
            StringBuilder A0l = AnonymousClass000.A0l("loadContactsTask/filterOutBotContactsIfNeeded took ");
            A0l.append(A022.A07());
            C18260x0.A1J(A0l, " ms");
            return A0s;
        }
        StringBuilder A0l2 = AnonymousClass000.A0l("loadContactsTask/filterOutBotContactsIfNeeded took ");
        A0l2.append(A022.A07());
        C18260x0.A1J(A0l2, " ms");
        return list;
    }

    public final boolean A0H(AnonymousClass3ZH r4) {
        C28011fL r1;
        int A032;
        if (!r4.A0U()) {
            return false;
        }
        C95814uZ r12 = r4.A0H;
        if (!(r12 instanceof C28011fL) || (r1 = (C28011fL) r12) == null || 3 > (A032 = this.A09.A03(r1)) || A032 >= 34) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1PC(C55682qk r20, AnonymousClass3DP r21, C56962sq r22, C60122y2 r23, C64773Ex r24, AnonymousClass2FW r25, ContactPickerFragment contactPickerFragment, AnonymousClass30T r27, C56892sj r28, C56652sL r29, C620533h r30, C59972xn r31, AnonymousClass1VX r32, AnonymousClass4FV r33, C95814uZ r34, AnonymousClass9U4 r35, C186568vZ r36, C56072rN r37, AnonymousClass2ML r38, C183538qC r39, HashSet hashSet, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        super(contactPickerFragment);
        AnonymousClass1VX r15 = r32;
        C55682qk r18 = r20;
        AnonymousClass0x2.A1C(r15, r18);
        AnonymousClass4FV r7 = r33;
        C162457s7.A0J(r7, 20);
        C64773Ex r14 = r24;
        C162457s7.A0J(r14, 21);
        C56072rN r4 = r37;
        C162457s7.A0J(r4, 22);
        AnonymousClass9U4 r6 = r35;
        C162457s7.A0J(r6, 23);
        C56962sq r16 = r22;
        C162457s7.A0J(r16, 24);
        AnonymousClass3DP r17 = r21;
        C162457s7.A0J(r17, 25);
        C183538qC r2 = r39;
        C162457s7.A0J(r2, 26);
        AnonymousClass30T r12 = r27;
        C162457s7.A0J(r12, 27);
        AnonymousClass2ML r3 = r38;
        C162457s7.A0J(r3, 29);
        C186568vZ r5 = r36;
        C162457s7.A0J(r5, 30);
        C56892sj r11 = r28;
        C162457s7.A0J(r11, 31);
        AnonymousClass2FW r13 = r25;
        C162457s7.A0J(r13, 32);
        C59972xn r8 = r31;
        C162457s7.A0J(r8, 33);
        C620533h r9 = r30;
        C162457s7.A0J(r9, 34);
        C56652sL r10 = r29;
        C162457s7.A0J(r10, 35);
        this.A0J = hashSet;
        this.A0D = r34;
        this.A0R = z;
        this.A0N = z2;
        this.A0Y = z3;
        this.A0Q = z4;
        this.A0T = z5;
        this.A0X = z6;
        this.A0O = z7;
        this.A0S = z8;
        this.A0U = z9;
        this.A0W = z10;
        this.A0V = z11;
        this.A0P = z12;
        this.A0L = z13;
        this.A0B = r15;
        this.A00 = r18;
        this.A0M = z14;
        this.A0C = r7;
        this.A04 = r14;
        this.A0G = r4;
        this.A0E = r6;
        this.A02 = r16;
        this.A01 = r17;
        this.A0I = r2;
        this.A06 = r12;
        this.A03 = r23;
        this.A0H = r3;
        this.A0F = r5;
        this.A07 = r11;
        this.A05 = r13;
        this.A0A = r8;
        this.A09 = r9;
        this.A08 = r10;
        this.A0K = z15;
    }
}
