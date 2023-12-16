package X;

import android.widget.Filter;

/* renamed from: X.4Ov  reason: invalid class name and case insensitive filesystem */
public class C87284Ov extends Filter {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C87194Oj A02;

    public C87284Ov(C87194Oj r1) {
        this.A02 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        r6.add(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r18) {
        /*
            r17 = this;
            android.widget.Filter$FilterResults r4 = new android.widget.Filter$FilterResults
            r4.<init>()
            r0 = 1
            r10 = r17
            r10.A00 = r0
            r10.A01 = r0
            java.lang.String r0 = "conversations/filter/performFiltering"
            X.33M r3 = new X.33M
            r3.<init>((java.lang.String) r0)
            r14 = r18
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r11 = 0
            if (r0 == 0) goto L_0x002e
            X.4Oj r2 = r10.A02
            com.whatsapp.conversationslist.ConversationsFragment r1 = r2.A08
            boolean r0 = X.AnonymousClass5N3.A00(r1)
            if (r0 == 0) goto L_0x025d
            X.5U2 r0 = r2.A00
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x025d
        L_0x002e:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r1 = r14
            java.lang.String r1 = (java.lang.String) r1
            X.4Oj r2 = r10.A02
            X.33j r0 = r2.A06
            java.util.ArrayList r13 = X.C107155an.A03(r0, r1)
            java.lang.String r0 = "conversations/filter/chats"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.HashSet r9 = X.AnonymousClass002.A0K()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.lang.String r12 = "conversations/filter/chats unsupported filter "
            com.whatsapp.conversationslist.ConversationsFragment r7 = r2.A08
            boolean r0 = X.AnonymousClass5N3.A00(r7)
            if (r0 == 0) goto L_0x00c5
            X.5U2 r0 = r2.A00
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c5
            r10.A01 = r11
            X.5U2 r0 = r2.A00
            java.util.List r0 = r0.A01()
            java.util.Iterator r16 = r0.iterator()
        L_0x006c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.String r1 = X.AnonymousClass001.A0m(r16)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1730152220: goto L_0x0085;
                case 72525144: goto L_0x00a0;
                case 1827283464: goto L_0x00ae;
                default: goto L_0x007d;
            }
        L_0x007d:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A0q(r12, r1, r0)
            goto L_0x006c
        L_0x0085:
            java.lang.String r0 = "CONTACTS_FILTER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.1VX r1 = r7.A24
            r0 = 5868(0x16ec, float:8.223E-42)
            boolean r8 = r1.A0X(r0)
            X.3Lo r1 = r7.A1p
            X.5lL r0 = new X.5lL
            r0.<init>(r1, r8)
            r6.add(r0)
            goto L_0x006c
        L_0x00a0:
            java.lang.String r0 = "GROUP_FILTER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.5lH r0 = new X.5lH
            r0.<init>()
            goto L_0x00c1
        L_0x00ae:
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.1VX r15 = r7.A24
            X.2ss r8 = r7.A1o
            X.2R8 r1 = r7.A22
            X.5lM r0 = new X.5lM
            r0.<init>(r8, r1, r15)
        L_0x00c1:
            r6.add(r0)
            goto L_0x006c
        L_0x00c5:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x00e7
            java.util.ArrayList r12 = X.AnonymousClass002.A0J(r6)
            X.2ML r15 = r7.A2s
            X.3Lo r8 = r7.A1p
            X.5ZU r1 = r7.A1B
            X.5lO r0 = new X.5lO
            r0.<init>(r1, r8, r15, r13)
            r6.add(r0)
            X.2s8 r0 = r7.A3R
            r0.A0A = r12
            r0.A05(r14)
            r0.A06(r13)
        L_0x00e7:
            X.2s8 r8 = r7.A3R
            X.5U2 r1 = r2.A00
            java.util.List r0 = r1.A02
            if (r0 != 0) goto L_0x00f5
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r1.A02 = r0
        L_0x00f5:
            r8.A0D = r0
            r8.A00 = r11
            r0 = 100
            r8.A01 = r0
            r3.A06()
            X.3Lu r1 = r7.A1s
            r0 = 0
            android.util.Pair r0 = r1.A04(r0, r8, r0)
            java.lang.Object r8 = r0.second
            java.util.List r8 = (java.util.List) r8
            r3.A06()
            X.1R1 r0 = r2.A07
            java.util.Set r2 = r0.A0R()
            X.314 r0 = r7.A1K
            java.util.List r0 = r0.A05()
            java.util.Iterator r13 = r0.iterator()
        L_0x011e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0174
            X.4uZ r1 = X.C18300x5.A0P(r13)
            boolean r0 = X.C66473Lo.A00(r1, r6)
            if (r0 == 0) goto L_0x011e
            r9.add(r1)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0141
            r12 = 2
            X.4zQ r0 = new X.4zQ
            r0.<init>(r1, r12)
            r5.add(r11, r0)
            goto L_0x011e
        L_0x0141:
            boolean r0 = X.AnonymousClass5N3.A00(r7)
            if (r0 == 0) goto L_0x0157
            X.2ss r0 = r7.A1o
            boolean r0 = r0.A0M(r1)
            if (r0 != 0) goto L_0x011e
            X.2ss r0 = r7.A1o
            boolean r0 = r0.A0P(r1)
            if (r0 != 0) goto L_0x011e
        L_0x0157:
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0170
            r12 = 2131893374(0x7f121c7e, float:1.9421523E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            java.lang.String r12 = r0.getString(r12)
            X.8G8 r0 = new X.8G8
            r0.<init>(r12)
            r5.add(r0)
            r10.A01 = r11
        L_0x0170:
            X.C97884zQ.A00(r1, r5)
            goto L_0x011e
        L_0x0174:
            r3.A06()
            boolean r0 = X.AnonymousClass5N3.A00(r7)
            if (r0 != 0) goto L_0x01ce
            X.3Lo r0 = r7.A1p
            java.util.List r0 = r0.A02()
            java.util.Iterator r11 = r0.iterator()
        L_0x0187:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01ce
            X.3ZH r2 = X.C18310x6.A0R(r11)
            X.2k5 r0 = r2.A0F
            if (r0 == 0) goto L_0x0187
            java.lang.Class<X.4uZ> r1 = X.C95814uZ.class
            com.whatsapp.jid.Jid r0 = r2.A0I(r1)
            boolean r0 = r9.contains(r0)
            if (r0 != 0) goto L_0x0187
            X.4uZ r0 = X.AnonymousClass3ZH.A02(r2, r1)
            boolean r0 = X.C66473Lo.A00(r0, r6)
            if (r0 == 0) goto L_0x0187
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x01c5
            r1 = 2131893375(0x7f121c7f, float:1.9421525E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            java.lang.String r1 = r0.getString(r1)
            X.8G8 r0 = new X.8G8
            r0.<init>(r1)
            r5.add(r0)
            r0 = 0
            r10.A00 = r0
        L_0x01c5:
            X.4zP r0 = new X.4zP
            r0.<init>(r2)
            r5.add(r0)
            goto L_0x0187
        L_0x01ce:
            r3.A06()
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            X.C626936e.A06(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x01e0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01fd
            X.34x r1 = X.C18300x5.A0T(r8)
            X.2z0 r0 = r1.A1J
            X.4uZ r0 = r0.A00
            X.C626936e.A06(r0)
            boolean r0 = r1.A1F
            if (r0 == 0) goto L_0x01f9
            r2.add(r1)
            goto L_0x01e0
        L_0x01f9:
            r6.add(r1)
            goto L_0x01e0
        L_0x01fd:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0216
            r1 = 2131893379(0x7f121c83, float:1.9421533E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            java.lang.String r1 = r0.getString(r1)
            X.8G8 r0 = new X.8G8
            r0.<init>(r1)
            r5.add(r0)
        L_0x0216:
            java.util.Iterator r2 = r2.iterator()
        L_0x021a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x022d
            X.34x r1 = X.C18300x5.A0T(r2)
            X.4zO r0 = new X.4zO
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x021a
        L_0x022d:
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x0246
            r1 = 2131893377(0x7f121c81, float:1.9421529E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            java.lang.String r1 = r0.getString(r1)
            X.8G8 r0 = new X.8G8
            r0.<init>(r1)
            r5.add(r0)
        L_0x0246:
            java.util.Iterator r2 = r6.iterator()
        L_0x024a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0261
            X.34x r1 = X.C18300x5.A0T(r2)
            X.4zO r0 = new X.4zO
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x024a
        L_0x025d:
            java.util.List r5 = r1.A1P()
        L_0x0261:
            r4.values = r5
            int r0 = r5.size()
            r4.count = r0
            r3.A07()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87284Ov.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r6.A00 <= 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (X.C18280x3.A02(X.AnonymousClass0x2.A0F(r6.A1k), "delete_chat_count") >= 3) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void publishResults(java.lang.CharSequence r13, android.widget.Filter.FilterResults r14) {
        /*
            r12 = this;
            X.4Oj r7 = r12.A02
            com.whatsapp.conversationslist.ConversationsFragment r6 = r7.A08
            android.view.View r2 = r6.A0B
            if (r2 == 0) goto L_0x00fa
            int r0 = r14.count
            r5 = 8
            r4 = 0
            if (r0 != 0) goto L_0x015b
            X.5U2 r0 = r7.A00
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0132
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x0132
            r0 = 2131433330(0x7f0b1772, float:1.8488443E38)
            X.C86604Kt.A1F(r2, r0, r5)
            r6.A1X()
        L_0x0026:
            java.lang.Object r0 = r14.values
            java.util.List r0 = (java.util.List) r0
            r6.A34 = r0
            if (r0 != 0) goto L_0x0034
            java.util.List r0 = r6.A1P()
            r6.A34 = r0
        L_0x0034:
            X.5U2 r0 = r7.A00
            java.lang.String r13 = (java.lang.String) r13
            r0.A01 = r13
            X.33j r0 = r7.A06
            java.util.ArrayList r0 = X.C107155an.A03(r0, r13)
            r7.A02 = r0
            X.5U2 r0 = r7.A00
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0055
            X.5U2 r0 = r7.A00
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0063
        L_0x0055:
            boolean r0 = X.AnonymousClass5N3.A00(r6)
            if (r0 == 0) goto L_0x012f
            java.util.List r0 = r6.A34
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x012f
        L_0x0063:
            r2 = 1
            int r0 = r6.A00
            r11 = 1
            if (r0 > 0) goto L_0x0080
        L_0x0069:
            r11 = 0
            if (r2 == 0) goto L_0x0080
            boolean r0 = r6.A3C
            if (r0 != 0) goto L_0x0080
            X.33p r0 = r6.A1k
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "delete_chat_count"
            int r1 = X.C18280x3.A02(r1, r0)
            r0 = 3
            r10 = 1
            if (r1 < r0) goto L_0x0081
        L_0x0080:
            r10 = 0
        L_0x0081:
            java.util.List r0 = r6.A34
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x008c
            r3 = 0
        L_0x008c:
            if (r2 != 0) goto L_0x009b
            if (r3 == 0) goto L_0x009b
            X.5U2 r9 = r7.A00
            android.view.View r2 = r6.A0B
            if (r2 != 0) goto L_0x00fb
            java.lang.String r0 = "conversations/view/null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x009b:
            android.widget.TextView r1 = r6.A0G
            int r0 = X.C86614Ku.A09(r11)
            r1.setVisibility(r0)
            android.widget.TextView r0 = r6.A0I
            if (r10 == 0) goto L_0x00a9
            r5 = 0
        L_0x00a9:
            r0.setVisibility(r5)
            boolean r0 = X.AnonymousClass5N3.A00(r6)
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r6.A1p()
            if (r0 == 0) goto L_0x00d4
            java.util.List r0 = r6.A34
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d4
            java.util.List r2 = r6.A34
            X.5U2 r0 = r7.A00
            java.util.List r0 = r0.A01()
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r4)
            X.8G7 r0 = new X.8G7
            r0.<init>(r1)
            r2.add(r0)
        L_0x00d4:
            r7.notifyDataSetChanged()
            android.widget.ListView r0 = r6.A0E
            if (r0 == 0) goto L_0x00e6
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x00e6
            android.widget.ListView r0 = r6.A0E
            r0.setSelection(r4)
        L_0x00e6:
            long r1 = r6.A05
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fa
            X.2oJ r3 = r6.A2l
            long r1 = X.C18310x6.A0A(r1)
            r0 = 5
            r3.A00(r0, r1)
            r6.A05 = r4
        L_0x00fa:
            return
        L_0x00fb:
            android.view.ViewGroup r0 = r6.A0C
            r0.setVisibility(r5)
            r6.A1l(r4)
            r8 = 1
            java.lang.String r0 = r9.A01
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 2131433330(0x7f0b1772, float:1.8488443E38)
            if (r1 != 0) goto L_0x0123
            android.widget.TextView r3 = X.AnonymousClass002.A09(r2, r0)
            r2 = 2131893369(0x7f121c79, float:1.9421513E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = r9.A01
            java.lang.String r0 = X.AnonymousClass0x7.A0n(r6, r0, r1, r4, r2)
            r3.setText(r0)
            goto L_0x009b
        L_0x0123:
            android.widget.TextView r1 = X.AnonymousClass002.A09(r2, r0)
            r0 = 2131893368(0x7f121c78, float:1.942151E38)
            r1.setText(r0)
            goto L_0x009b
        L_0x012f:
            r2 = 0
            goto L_0x0069
        L_0x0132:
            r0 = 2131433330(0x7f0b1772, float:1.8488443E38)
            android.view.View r1 = r2.findViewById(r0)
            r1.setVisibility(r4)
            android.widget.ListView r0 = r6.A0E
            if (r0 == 0) goto L_0x014b
            boolean r0 = X.AnonymousClass5N3.A00(r6)
            if (r0 != 0) goto L_0x014b
            android.widget.ListView r0 = r6.A0E
            r0.setEmptyView(r1)
        L_0x014b:
            r0 = 2131429158(0x7f0b0726, float:1.847998E38)
            X.C86604Kt.A1F(r2, r0, r5)
            r0 = 2131429160(0x7f0b0728, float:1.8479985E38)
            X.C86604Kt.A1F(r2, r0, r5)
            r0 = 2131429159(0x7f0b0727, float:1.8479983E38)
            goto L_0x015e
        L_0x015b:
            r0 = 2131433330(0x7f0b1772, float:1.8488443E38)
        L_0x015e:
            X.C86604Kt.A1F(r2, r0, r5)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87284Ov.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
    }
}
