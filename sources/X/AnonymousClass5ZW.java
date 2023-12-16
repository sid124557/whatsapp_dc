package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5ZW  reason: invalid class name */
public class AnonymousClass5ZW {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (X.AnonymousClass2z0.A0C(r1) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.content.Context r7, X.C64773Ex r8, X.AnonymousClass5ZU r9, X.C95814uZ r10, java.util.Collection r11) {
        /*
            r4 = 0
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0008
            return r4
        L_0x0008:
            if (r10 == 0) goto L_0x002b
            X.3ZH r3 = r8.A0A(r10)
        L_0x000e:
            java.util.Iterator r0 = r11.iterator()
            X.34x r1 = X.C18300x5.A0T(r0)
            r6 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0021
            boolean r0 = X.AnonymousClass2z0.A0C(r1)
            r2 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            int r0 = r11.size()
            if (r0 != r5) goto L_0x006d
            if (r1 != 0) goto L_0x002d
            return r4
        L_0x002b:
            r3 = r4
            goto L_0x000e
        L_0x002d:
            X.2z0 r0 = r1.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0060
            if (r3 == 0) goto L_0x0060
            boolean r0 = r3.A0U()
            if (r0 == 0) goto L_0x0052
            X.4uZ r0 = r1.A0n()
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = X.AnonymousClass5ZU.A01(r8, r9, r0)
        L_0x0045:
            r0 = 2131888530(0x7f120992, float:1.9411698E38)
            if (r2 == 0) goto L_0x004d
            r0 = 2131888531(0x7f120993, float:1.94117E38)
        L_0x004d:
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r7, r1, r5, r0)
            return r0
        L_0x0052:
            java.lang.String r0 = r9.A0H(r3)
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = r9.A0H(r3)
            goto L_0x0045
        L_0x005d:
            java.lang.String r1 = ""
            goto L_0x0045
        L_0x0060:
            r0 = 2131888532(0x7f120994, float:1.9411702E38)
            if (r2 == 0) goto L_0x0068
            r0 = 2131888533(0x7f120995, float:1.9411704E38)
        L_0x0068:
            java.lang.String r0 = r7.getString(r0)
            return r0
        L_0x006d:
            r4 = 2131755065(0x7f100039, float:1.9140999E38)
            if (r2 == 0) goto L_0x0075
            r4 = 2131755066(0x7f10003a, float:1.9141E38)
        L_0x0075:
            android.content.res.Resources r3 = r7.getResources()
            int r2 = r11.size()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r0 = r11.size()
            X.AnonymousClass000.A1P(r1, r0, r6)
            java.lang.String r0 = r3.getQuantityString(r4, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZW.A01(android.content.Context, X.3Ex, X.5ZU, X.4uZ, java.util.Collection):java.lang.String");
    }

    public static void A02(AnonymousClass36Y r6, AnonymousClass4FV r7, AnonymousClass30N r8, C50222hp r9, C45042Yl r10, Set set, int i) {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            C624134x r2 = null;
            C624134x r5 = null;
            byte b = -1;
            while (true) {
                if (!it.hasNext()) {
                    r2 = r5;
                    break;
                }
                C624134x A0T = C18300x5.A0T(it);
                if (b == -1) {
                    b = A0T.A1I;
                    r5 = A0T;
                }
                if (b != A0T.A1I) {
                    Log.d("DeleteMessagesDialog/getSampleMessageForMediaType/multi msg type delete");
                    break;
                }
            }
            Iterator it2 = set.iterator();
            C95814uZ r3 = null;
            while (it2.hasNext()) {
                C624134x A0T2 = C18300x5.A0T(it2);
                if (r3 == null) {
                    r3 = A0T2.A1J.A00;
                } else if (!AnonymousClass2z0.A0E(A0T2, r3)) {
                    Log.d("DeleteMessagesDialog/getSampleMessageForMediaType/multi chat jid delete");
                    return;
                }
            }
            if (r3 != null) {
                C94734rp r1 = new C94734rp();
                r1.A01 = Integer.valueOf(i);
                r1.A00 = Boolean.valueOf(C627336j.A0K(r3));
                r1.A03 = AnonymousClass0x9.A0m(set.size());
                r1.A04 = r8.A04(r3.getRawString());
                if (r2 != null) {
                    r1.A02 = Integer.valueOf(AnonymousClass29K.A01(r6, r2, r9, r10));
                }
                r7.BhD(r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0100, code lost:
        if (r0.A0K() == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0117, code lost:
        if (((X.C56722sS) r42.A04()).A05(r6) == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016f, code lost:
        if (r0.longValue() < r15) goto L_0x0171;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x026d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01ca A[EDGE_INSN: B:160:0x01ca->B:113:0x01ca ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Dialog A00(android.content.Context r41, X.C116985rC r42, X.C1228165x r43, X.C835748y r44, X.AnonymousClass64F r45, X.C69263Wi r46, X.C621033m r47, X.C64773Ex r48, X.C56422rx r49, X.AnonymousClass5ZU r50, X.C48952fk r51, X.C56612sH r52, X.AnonymousClass33p r53, X.C620733j r54, X.C56982ss r55, X.C56892sj r56, X.AnonymousClass36Y r57, X.AnonymousClass5Y0 r58, X.AnonymousClass1VX r59, X.AnonymousClass4FV r60, X.AnonymousClass30N r61, X.C52472lX r62, X.C53202mi r63, X.C47052cd r64, X.C50222hp r65, X.C45042Yl r66, X.AnonymousClass4FS r67, java.lang.String r68, java.util.Set r69, boolean r70) {
        /*
            r40 = r69
            boolean r0 = r40.isEmpty()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "dialog/delete no messages"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x000f:
            java.util.Iterator r0 = r40.iterator()
            X.2z0 r0 = X.C86614Ku.A0h(r0)
            X.4uZ r0 = r0.A00
            boolean r0 = r0 instanceof X.C95804uY
            r24 = 1
            if (r0 == 0) goto L_0x0021
            r24 = 0
        L_0x0021:
            if (r70 == 0) goto L_0x0037
            java.util.Iterator r1 = r40.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ae
            X.34x r0 = X.C18300x5.A0T(r1)
            if (r0 == 0) goto L_0x0027
            X.34w r0 = r0.A0P
            if (r0 == 0) goto L_0x0027
        L_0x0037:
            r23 = 0
        L_0x0039:
            r12 = r52
            long r21 = r12.A0H()
            java.util.HashSet r10 = X.AnonymousClass002.A0K()
            java.util.Iterator r20 = r40.iterator()
            r2 = r21
            r11 = 0
            r19 = 0
            r18 = 0
            r34 = 0
            r8 = 0
            r7 = 0
            r39 = 0
        L_0x0054:
            boolean r0 = r20.hasNext()
            r9 = r59
            if (r0 == 0) goto L_0x01ca
            X.34x r6 = X.C18300x5.A0T(r20)
            X.2z0 r1 = r6.A1J
            X.4uZ r5 = r1.A00
            if (r34 != 0) goto L_0x0068
            r34 = r5
        L_0x0068:
            r10.add(r5)
            if (r19 != 0) goto L_0x008c
            byte r4 = r6.A1I
            boolean r0 = X.C627636p.A0I(r4)
            if (r0 != 0) goto L_0x007b
            boolean r0 = X.C627636p.A0H(r4)
            if (r0 == 0) goto L_0x008c
        L_0x007b:
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            java.io.File r0 = X.C30471mV.A01(r0)
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x008c
            r19 = 1
        L_0x008c:
            if (r18 != 0) goto L_0x009d
            boolean r0 = r6 instanceof X.C30471mV
            if (r0 == 0) goto L_0x009d
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            boolean r0 = X.C627636p.A0y(r0)
            if (r0 != 0) goto L_0x009d
            r18 = 1
        L_0x009d:
            if (r5 == 0) goto L_0x01ab
            r0 = r48
            X.3ZH r4 = r0.A0A(r5)
        L_0x00a5:
            boolean r13 = r1.A02
            if (r13 != 0) goto L_0x00ab
            int r11 = r11 + 1
        L_0x00ab:
            boolean r15 = X.C627336j.A0K(r5)
            r1 = r56
            if (r15 == 0) goto L_0x01a7
            X.1fJ r0 = X.AnonymousClass34R.A02(r5)
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x01a7
            r0 = 1
            if (r11 != r0) goto L_0x01a7
            r17 = 1
            r11 = 1
            com.whatsapp.jid.UserJid[] r14 = new com.whatsapp.jid.UserJid[r0]
            com.whatsapp.jid.UserJid r8 = r6.A0o()
            r0 = 0
            r14[r0] = r8
            java.util.ArrayList r8 = X.C162197rQ.newArrayList((java.lang.Object[]) r14)
            r0 = -1
            r14 = r50
            java.lang.String r39 = r14.A0W(r8, r0)
            r8 = 1
        L_0x00d8:
            if (r13 == 0) goto L_0x01a3
            if (r15 == 0) goto L_0x00e6
            X.1fJ r0 = X.AnonymousClass34R.A02(r5)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x01a3
        L_0x00e6:
            r16 = 1
            int r7 = r7 + 1
        L_0x00ea:
            boolean r1 = r5 instanceof X.C95804uY
            if (r16 != 0) goto L_0x0106
            if (r1 == 0) goto L_0x0106
            r0 = r55
            X.31A r0 = X.C56982ss.A00(r0, r5)
            X.1RL r0 = (X.AnonymousClass1RL) r0
            if (r0 == 0) goto L_0x0102
            boolean r0 = r0.A0K()
            r16 = 1
            if (r0 != 0) goto L_0x0104
        L_0x0102:
            r16 = 0
        L_0x0104:
            int r7 = r7 + 1
        L_0x0106:
            boolean r0 = r42.A07()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r0 = r42.A04()
            X.2sS r0 = (X.C56722sS) r0
            boolean r0 = r0.A05(r6)
            r15 = 1
            if (r0 != 0) goto L_0x011a
        L_0x0119:
            r15 = 0
        L_0x011a:
            if (r1 == 0) goto L_0x0195
            boolean r13 = X.C106855aH.A03(r12, r6)
        L_0x0120:
            long r0 = r6.A0K
            long r2 = java.lang.Math.min(r0, r2)
            if (r23 == 0) goto L_0x0171
            if (r16 != 0) goto L_0x012e
            if (r17 != 0) goto L_0x012e
            if (r15 == 0) goto L_0x0171
        L_0x012e:
            boolean r0 = X.C627636p.A0l(r6)
            if (r0 != 0) goto L_0x0171
            if (r13 == 0) goto L_0x0171
            X.4uZ r0 = r6.A0n()
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x0171
            if (r4 == 0) goto L_0x0148
            r0 = r62
            boolean r0 = r0.A01(r4)
            if (r0 != 0) goto L_0x0171
        L_0x0148:
            r0 = r63
            boolean r0 = r0.A02(r5)
            if (r0 != 0) goto L_0x0171
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A03(r5)
            r5 = r49
            boolean r0 = r5.A03(r4)
            if (r0 != 0) goto L_0x0171
            long r15 = r12.A0H()
            int r0 = r6.A05
            if (r0 <= 0) goto L_0x0175
            java.lang.Long r0 = r6.A0r
            X.C626936e.A06(r0)
            long r13 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0175
        L_0x0171:
            r23 = 0
            goto L_0x0054
        L_0x0175:
            X.34n r1 = new X.34n
            r0 = r51
            r1.<init>((X.C56422rx) r5, (X.C48952fk) r0, (com.whatsapp.jid.UserJid) r4)
            r0 = 5968(0x1750, float:8.363E-42)
            boolean r0 = r9.A0X(r0)
            if (r0 == 0) goto L_0x0191
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x0171
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0191
            goto L_0x0171
        L_0x0191:
            r23 = 1
            goto L_0x0054
        L_0x0195:
            long r0 = r6.A0K
            r13 = 216000000(0xcdfe600, double:1.067181795E-315)
            long r0 = r0 + r13
            int r13 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            boolean r13 = X.AnonymousClass001.A1W(r13)
            goto L_0x0120
        L_0x01a3:
            r16 = 0
            goto L_0x00ea
        L_0x01a7:
            r17 = 0
            goto L_0x00d8
        L_0x01ab:
            r4 = 0
            goto L_0x00a5
        L_0x01ae:
            java.util.Iterator r2 = r40.iterator()
        L_0x01b2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c6
            X.34x r0 = X.C18300x5.A0T(r2)
            if (r0 == 0) goto L_0x01b2
            byte r1 = r0.A1I
            r0 = 90
            if (r1 != r0) goto L_0x01b2
            goto L_0x0037
        L_0x01c6:
            r23 = 1
            goto L_0x0039
        L_0x01ca:
            r38 = 0
            r30 = r53
            if (r23 == 0) goto L_0x01e7
            r4 = 1
            if (r8 < r4) goto L_0x02c7
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r30)
            java.lang.String r0 = "pref_revoke_admin_nux"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r7 < r4) goto L_0x02c1
            if (r0 == 0) goto L_0x01e7
            r0 = 24
        L_0x01e3:
            java.lang.Integer r38 = java.lang.Integer.valueOf(r0)
        L_0x01e7:
            r11 = r41
            X.0zH r1 = X.AnonymousClass5V0.A00(r11)
            if (r19 == 0) goto L_0x02bd
            if (r18 == 0) goto L_0x02bd
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r30)
            java.lang.String r0 = "pref_delete_media"
            r5 = 1
            boolean r6 = r2.getBoolean(r0, r5)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r11)
            r0 = 2131624735(0x7f0e031f, float:1.8876658E38)
            android.view.View r4 = X.C86604Kt.A0F(r2, r0)
            r0 = 2131429367(0x7f0b07f7, float:1.8480405E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            int r3 = r10.size()
            r2 = 2131888549(0x7f1209a5, float:1.9411736E38)
            if (r3 != r5) goto L_0x021c
            r2 = 2131888550(0x7f1209a6, float:1.9411738E38)
        L_0x021c:
            r0.setText(r2)
            r0.setChecked(r6)
            r1.setView(r4)
        L_0x0225:
            r2 = r68
            r3 = r58
            java.lang.CharSequence r2 = X.C107345b9.A05(r11, r3, r2)
            r1.A0Q(r2)
            r2 = 1703(0x6a7, float:2.386E-42)
            boolean r59 = r9.A0X(r2)
            r10 = 0
            X.5cM r5 = new X.5cM
            r29 = r47
            r28 = r45
            r2 = r43
            r49 = r54
            r56 = r67
            r37 = r66
            r36 = r65
            r33 = r61
            r32 = r60
            r31 = r57
            r41 = r5
            r42 = r0
            r48 = r30
            r50 = r31
            r51 = r9
            r52 = r32
            r53 = r33
            r54 = r36
            r55 = r37
            r57 = r40
            r58 = r6
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r4 = 0
            X.68t r3 = X.C1235268t.A00(r2, r10)
            if (r23 == 0) goto L_0x02b0
            if (r0 == 0) goto L_0x0276
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x0276
            r10 = 1
        L_0x0276:
            X.5cN r9 = new X.5cN
            r35 = r64
            r25 = r9
            r26 = r11
            r27 = r2
            r41 = r8
            r42 = r7
            r43 = r10
            r44 = r6
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r0 = 2131893211(0x7f121bdb, float:1.9421192E38)
            r1.setPositiveButton(r0, r9)
            if (r24 == 0) goto L_0x0299
            r0 = 2131893212(0x7f121bdc, float:1.9421194E38)
            r1.setNegativeButton(r0, r5)
        L_0x0299:
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1.A0X(r3, r0)
        L_0x029f:
            r0 = 1
            r1.A0R(r0)
            X.68w r0 = new X.68w
            r0.<init>(r2, r4)
            r1.A0D(r0)
            X.043 r0 = r1.create()
            return r0
        L_0x02b0:
            r0 = 2131893212(0x7f121bdc, float:1.9421194E38)
            r1.setPositiveButton(r0, r5)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1.setNegativeButton(r0, r3)
            goto L_0x029f
        L_0x02bd:
            r0 = 0
            r6 = 0
            goto L_0x0225
        L_0x02c1:
            if (r0 == 0) goto L_0x01e7
            r0 = 23
            goto L_0x01e3
        L_0x02c7:
            long r5 = r12.A0H()
            long r5 = r5 - r2
            r1 = 4096000(0x3e8000, double:2.023693E-317)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02e1
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r30)
            java.lang.String r0 = "pref_revoke_sender_nux"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x02e1
            goto L_0x01e7
        L_0x02e1:
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r30)
            java.lang.String r0 = "pref_revoke_sender_nux_v2"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x01e7
            r0 = 19
            if (r7 != r4) goto L_0x01e3
            r0 = 25
            goto L_0x01e3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZW.A00(android.content.Context, X.5rC, X.65x, X.48y, X.64F, X.3Wi, X.33m, X.3Ex, X.2rx, X.5ZU, X.2fk, X.2sH, X.33p, X.33j, X.2ss, X.2sj, X.36Y, X.5Y0, X.1VX, X.4FV, X.30N, X.2lX, X.2mi, X.2cd, X.2hp, X.2Yl, X.4FS, java.lang.String, java.util.Set, boolean):android.app.Dialog");
    }
}
