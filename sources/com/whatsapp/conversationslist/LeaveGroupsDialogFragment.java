package com.whatsapp.conversationslist;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1R1;
import X.AnonymousClass30W;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.C27991fJ;
import X.C28891hw;
import X.C29441ip;
import X.C56542sA;
import X.C56892sj;
import X.C56982ss;
import X.C61152zn;
import X.C64773Ex;
import X.C66493Lq;
import X.C66503Lr;
import X.C69263Wi;
import X.C86644Kx;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.Set;

public class LeaveGroupsDialogFragment extends Hilt_LeaveGroupsDialogFragment {
    public C69263Wi A00;
    public C29441ip A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public AnonymousClass30W A04;
    public AnonymousClass33p A05;
    public C56542sA A06;
    public C56982ss A07;
    public C28891hw A08;
    public C56892sj A09;
    public C61152zn A0A;
    public AnonymousClass5Y0 A0B;
    public C66493Lq A0C;
    public C66503Lr A0D;
    public AnonymousClass1R1 A0E;
    public AnonymousClass4FS A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = X.AnonymousClass34R.A04(r5.getRawString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1W(X.C95814uZ r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L_0x001f
            java.lang.String r0 = r5.getRawString()
            X.1fJ r2 = X.AnonymousClass34R.A04(r0)
            if (r2 == 0) goto L_0x001f
            X.2ss r0 = r4.A07
            int r1 = r0.A06(r2)
            r0 = 3
            if (r1 != r0) goto L_0x001f
            X.2sj r0 = r4.A09
            boolean r0 = r0.A0D(r2)
            if (r0 == 0) goto L_0x001f
            r3 = 1
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.LeaveGroupsDialogFragment.A1W(X.4uZ):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = X.AnonymousClass34R.A04(r4.getRawString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1X(X.C95814uZ r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x001e
            java.lang.String r0 = r4.getRawString()
            X.1fJ r1 = X.AnonymousClass34R.A04(r0)
            if (r1 == 0) goto L_0x001e
            X.2sj r0 = r3.A09
            boolean r0 = r0.A0H(r1)
            if (r0 == 0) goto L_0x001e
            X.2ss r0 = r3.A07
            boolean r0 = r0.A0R(r1)
            if (r0 == 0) goto L_0x001e
            r2 = 1
        L_0x001e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.LeaveGroupsDialogFragment.A1X(X.4uZ):boolean");
    }

    public static LeaveGroupsDialogFragment A00(C27991fJ r4, String str, Set set, int i, int i2, boolean z, boolean z2) {
        LeaveGroupsDialogFragment leaveGroupsDialogFragment = new LeaveGroupsDialogFragment();
        Bundle A082 = AnonymousClass002.A08();
        if (set.size() == 1) {
            A082.putString("jid", ((Jid) set.toArray()[0]).getRawString());
        } else {
            C86644Kx.A0r(A082, "selection_jids", set);
        }
        if (r4 != null) {
            AnonymousClass0x2.A0v(A082, r4, "parent_of_last_subgroup_jid");
        }
        A082.putInt("unsent_count", i);
        A082.putBoolean("report_upsell", z);
        A082.putString("block_spam_flow", str);
        A082.putInt("leave_group_action", i2);
        A082.putBoolean("show_neutral_button", z2);
        leaveGroupsDialogFragment.A0u(A082);
        return leaveGroupsDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        if (r5 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0065, code lost:
        if (r5 == null) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r19) {
        /*
            r18 = this;
            r14 = r18
            android.os.Bundle r1 = r14.A0H()
            java.lang.String r0 = "unsent_count"
            r2 = 0
            int r8 = r1.getInt(r0, r2)
            java.lang.String r0 = "jid"
            java.lang.String r5 = r1.getString(r0)
            java.lang.String r0 = "report_upsell"
            boolean r12 = r1.getBoolean(r0, r2)
            java.lang.String r0 = "block_spam_flow"
            java.lang.String r15 = r1.getString(r0)
            java.lang.String r0 = "show_neutral_button"
            r3 = 1
            boolean r11 = r1.getBoolean(r0, r3)
            java.lang.String r0 = "leave_group_action"
            int r17 = r1.getInt(r0, r3)
            java.lang.String r0 = "parent_of_last_subgroup_jid"
            java.lang.String r0 = r1.getString(r0)
            X.34R r4 = X.C27991fJ.A01
            X.1fJ r2 = r4.A07(r0)
            if (r5 == 0) goto L_0x0193
            java.util.List r1 = java.util.Collections.singletonList(r5)
        L_0x003e:
            java.lang.Class<X.1fJ> r0 = X.C27991fJ.class
            java.util.List r16 = X.C627336j.A0B(r0, r1)
            X.1fJ r4 = r4.A07(r5)
            X.4uZ r5 = X.C18310x6.A0S(r5)
            int r7 = r16.size()
            boolean r9 = r14.A1W(r5)
            boolean r6 = r14.A1X(r5)
            X.2zn r0 = r14.A0A
            X.1VX r1 = r0.A02
            r0 = 1597(0x63d, float:2.238E-42)
            boolean r1 = r1.A0X(r0)
            if (r2 == 0) goto L_0x0067
            r0 = 1
            if (r5 != 0) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            if (r9 != 0) goto L_0x0190
            if (r6 != 0) goto L_0x0190
            if (r12 != 0) goto L_0x0072
            if (r1 != 0) goto L_0x0072
            if (r0 == 0) goto L_0x0190
        L_0x0072:
            java.lang.String r6 = r14.A1V(r5, r2, r8, r7)
        L_0x0076:
            int r7 = r16.size()
            boolean r10 = r14.A1W(r5)
            boolean r9 = r14.A1X(r5)
            X.2zn r0 = r14.A0A
            X.1VX r1 = r0.A02
            r0 = 1597(0x63d, float:2.238E-42)
            boolean r0 = r1.A0X(r0)
            if (r2 == 0) goto L_0x0091
            r1 = 1
            if (r5 != 0) goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            if (r10 != 0) goto L_0x018a
            if (r9 != 0) goto L_0x018a
            if (r12 != 0) goto L_0x009c
            if (r0 != 0) goto L_0x009c
            if (r1 == 0) goto L_0x018a
        L_0x009c:
            X.2ss r0 = r14.A07
            boolean r0 = r0.A0N(r5)
            if (r0 == 0) goto L_0x0150
            r1 = 2131888014(0x7f12078e, float:1.9410651E38)
        L_0x00a7:
            android.content.res.Resources r0 = X.C08310eF.A09(r14)
            java.lang.String r7 = r0.getString(r1)
        L_0x00af:
            X.0zH r2 = X.C18300x5.A0M(r14)
            if (r6 == 0) goto L_0x00c2
            android.content.Context r1 = r14.A0G()
            X.5Y0 r0 = r14.A0B
            java.lang.CharSequence r0 = X.C107345b9.A05(r1, r0, r6)
            r2.setTitle(r0)
        L_0x00c2:
            android.content.Context r1 = r14.A0G()
            X.5Y0 r0 = r14.A0B
            java.lang.CharSequence r6 = X.C107345b9.A05(r1, r0, r7)
            r13 = 0
            if (r12 == 0) goto L_0x014c
            X.2ss r0 = r14.A07
            boolean r0 = r0.A0N(r5)
            if (r0 != 0) goto L_0x014c
            boolean r0 = r14.A1W(r5)
            if (r0 != 0) goto L_0x014c
            android.content.Context r0 = r14.A1D()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624769(0x7f0e0341, float:1.8876727E38)
            android.view.View r5 = r1.inflate(r0, r13)
            r2.setView(r5)
            r0 = 2131429449(0x7f0b0849, float:1.8480571E38)
            android.widget.TextView r0 = X.C18300x5.A0G(r5, r0)
            r0.setText(r6)
            r0 = 2131428752(0x7f0b0590, float:1.8479157E38)
            android.view.View r13 = X.C06560Yg.A02(r5, r0)
            android.widget.CheckBox r13 = (android.widget.CheckBox) r13
            r0 = 2131428754(0x7f0b0592, float:1.8479161E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r5, r0)
            r0 = 2131893080(0x7f121b58, float:1.9420926E38)
            r1.setText(r0)
            r0 = 2131428755(0x7f0b0593, float:1.8479163E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r5, r0)
            r0 = 2131893129(0x7f121b89, float:1.9421026E38)
            r1.setText(r0)
            r0 = 2131428753(0x7f0b0591, float:1.847916E38)
            android.view.View r1 = X.C06560Yg.A02(r5, r0)
            r0 = 30
            X.C18290x4.A1G(r1, r13, r0)
        L_0x0128:
            r2.A0R(r3)
            if (r11 == 0) goto L_0x022a
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r16.iterator()
        L_0x0135:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x019b
            X.4uZ r1 = X.C18300x5.A0P(r5)
            X.1R1 r0 = r14.A0E
            boolean r0 = r0.A0h(r1)
            r3 = r3 & r0
            if (r0 != 0) goto L_0x0135
            r6.add(r1)
            goto L_0x0135
        L_0x014c:
            r2.A0Q(r6)
            goto L_0x0128
        L_0x0150:
            if (r12 == 0) goto L_0x0157
            r1 = 2131889212(0x7f120c3c, float:1.9413081E38)
            goto L_0x00a7
        L_0x0157:
            if (r1 == 0) goto L_0x0180
            X.3Ex r0 = r14.A02
            X.3ZH r7 = r0.A0A(r5)
            X.3Ex r0 = r14.A02
            X.3ZH r1 = r0.A0A(r2)
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            X.5ZU r0 = r14.A03
            X.C18290x4.A1K(r0, r7, r2)
            X.5ZU r0 = r14.A03
            X.C18300x5.A1E(r0, r1, r2, r3)
            r1 = 2131889208(0x7f120c38, float:1.9413073E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r14)
            java.lang.String r7 = r0.getString(r1, r2)
            goto L_0x00af
        L_0x0180:
            r1 = 2131889214(0x7f120c3e, float:1.9413085E38)
            if (r7 != r3) goto L_0x00a7
            r1 = 2131889213(0x7f120c3d, float:1.9413083E38)
            goto L_0x00a7
        L_0x018a:
            java.lang.String r7 = r14.A1V(r5, r2, r8, r7)
            goto L_0x00af
        L_0x0190:
            r6 = 0
            goto L_0x0076
        L_0x0193:
            java.lang.String r0 = "selection_jids"
            java.util.ArrayList r1 = r1.getStringArrayList(r0)
            goto L_0x003e
        L_0x019b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.2fY r1 = new X.2fY
            r1.<init>(r0, r6)
            java.lang.Object r0 = r1.A00
            boolean r3 = X.AnonymousClass001.A1Z(r0)
            java.lang.Object r5 = r1.A01
            X.33p r1 = r14.A05
            boolean r0 = r1.A28()
            if (r0 == 0) goto L_0x021b
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r1)
            java.lang.String r0 = "notify_new_message_for_archived_chats"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x021b
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r16.iterator()
            r3 = 1
        L_0x01c9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01e0
            X.4uZ r1 = X.C18300x5.A0P(r5)
            X.2ss r0 = r14.A07
            boolean r0 = r0.A0M(r1)
            r3 = r3 & r0
            if (r0 != 0) goto L_0x01c9
            r6.add(r1)
            goto L_0x01c9
        L_0x01e0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.2fY r1 = new X.2fY
            r1.<init>(r0, r6)
            java.lang.Object r0 = r1.A00
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            java.lang.Object r5 = r1.A01
            if (r0 != 0) goto L_0x022a
            boolean r0 = r14.A1W(r4)
            if (r0 != 0) goto L_0x020d
            boolean r0 = r14.A1X(r4)
            if (r0 != 0) goto L_0x020d
            X.2ss r0 = r14.A07
            boolean r0 = r0.A0N(r4)
            if (r0 != 0) goto L_0x020d
            r3 = 2131886450(0x7f120172, float:1.940748E38)
            r1 = 8
            goto L_0x0222
        L_0x020d:
            r3 = 2131886450(0x7f120172, float:1.940748E38)
            r1 = 8
            X.69T r0 = new X.69T
            r0.<init>(r14, r1, r5)
            r2.setNegativeButton(r3, r0)
            goto L_0x022a
        L_0x021b:
            if (r3 != 0) goto L_0x022a
            r3 = 2131890895(0x7f1212cf, float:1.9416495E38)
            r1 = 9
        L_0x0222:
            X.69T r0 = new X.69T
            r0.<init>(r14, r1, r5)
            r2.A0X(r0, r3)
        L_0x022a:
            boolean r0 = r14.A1W(r4)
            if (r0 != 0) goto L_0x025f
            boolean r0 = r14.A1X(r4)
            if (r0 != 0) goto L_0x025f
            X.2ss r0 = r14.A07
            boolean r0 = r0.A0N(r4)
            if (r0 == 0) goto L_0x024b
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 42
        L_0x0243:
            X.C1235268t.A02(r2, r14, r0, r1)
        L_0x0246:
            X.043 r0 = r2.create()
            return r0
        L_0x024b:
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 43
            X.C1235268t.A01(r2, r14, r0, r1)
            r0 = 2131889195(0x7f120c2b, float:1.9413047E38)
            X.5cF r12 = new X.5cF
            r12.<init>(r13, r14, r15, r16, r17)
            r2.setPositiveButton(r0, r12)
            goto L_0x0246
        L_0x025f:
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 41
            goto L_0x0243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.LeaveGroupsDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r8 == null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A1V(X.C95814uZ r8, X.C27991fJ r9, int r10, int r11) {
        /*
            r7 = this;
            boolean r0 = r7.A1W(r8)
            if (r0 == 0) goto L_0x0012
            r1 = 2131888014(0x7f12078e, float:1.9410651E38)
        L_0x0009:
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            java.lang.String r0 = r0.getString(r1)
        L_0x0011:
            return r0
        L_0x0012:
            boolean r0 = r7.A1X(r8)
            if (r0 == 0) goto L_0x001c
            r1 = 2131887943(0x7f120747, float:1.9410507E38)
            goto L_0x0009
        L_0x001c:
            if (r9 == 0) goto L_0x0021
            r0 = 1
            if (r8 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x003c
            X.2ss r0 = r7.A07
            boolean r0 = r0.A0N(r8)
            if (r0 != 0) goto L_0x003c
            if (r10 != 0) goto L_0x007f
            r1 = 2131889209(0x7f120c39, float:1.9413075E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L_0x003c:
            if (r8 == 0) goto L_0x0059
            X.3Ex r0 = r7.A02
            X.3ZH r5 = r0.A0A(r8)
            if (r10 != 0) goto L_0x008b
            java.lang.Object[] r2 = new java.lang.Object[r6]
            X.5ZU r0 = r7.A03
            X.C18300x5.A1E(r0, r5, r2, r4)
            r1 = 2131889215(0x7f120c3f, float:1.9413087E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
        L_0x0059:
            android.content.res.Resources r1 = X.C08310eF.A09(r7)
            r0 = 2131755026(0x7f100012, float:1.914092E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r1, r11, r4, r0)
            if (r10 <= 0) goto L_0x0011
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            android.content.res.Resources r1 = X.C08310eF.A09(r7)
            r0 = 2131755382(0x7f100176, float:1.9141642E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r1, r10, r4, r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            return r0
        L_0x007f:
            android.content.res.Resources r1 = X.C08310eF.A09(r7)
            r0 = 2131755112(0x7f100068, float:1.9141094E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r1, r10, r4, r0)
            return r0
        L_0x008b:
            android.content.res.Resources r3 = X.C08310eF.A09(r7)
            r2 = 2131755113(0x7f100069, float:1.9141096E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()
            X.5ZU r0 = r7.A03
            X.C18300x5.A1E(r0, r5, r1, r4)
            X.AnonymousClass000.A1P(r1, r10, r6)
            java.lang.String r0 = r3.getQuantityString(r2, r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.LeaveGroupsDialogFragment.A1V(X.4uZ, X.1fJ, int, int):java.lang.String");
    }
}
