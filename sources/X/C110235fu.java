package X;

import android.widget.AdapterView;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.5fu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110235fu implements AdapterView.OnItemClickListener {
    public final /* synthetic */ ContactPickerFragment A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r0.A09 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        if (r0 != false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(android.widget.AdapterView r16, android.view.View r17, int r18, long r19) {
        /*
            r15 = this;
            r11 = r18
            com.whatsapp.contact.picker.ContactPickerFragment r3 = r15.A00
            boolean r10 = r15.A01
            android.widget.ListView r0 = r3.A0L
            android.widget.ListAdapter r2 = r0.getAdapter()
            boolean r0 = r2 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0016
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
        L_0x0016:
            X.4lo r2 = (X.C91924lo) r2
            android.widget.ListView r0 = r3.A0L
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x002a
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r0 = r1.getHeadersCount()
            int r11 = r18 - r0
        L_0x002a:
            if (r11 < 0) goto L_0x0135
            int r0 = r2.getCount()
            if (r11 >= r0) goto L_0x0135
            java.util.List r0 = r2.A02
            java.lang.Object r9 = r0.get(r11)
            X.8nu r9 = (X.C182128nu) r9
            X.3ZH r8 = r9.getContact()
            if (r8 == 0) goto L_0x01da
            X.2qS r0 = r8.A0E
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.A09
            r14 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r14 = 0
        L_0x004c:
            X.1VX r0 = r3.A1x
            r5 = 4471(0x1177, float:6.265E-42)
            boolean r0 = r0.A0X(r5)
            if (r0 == 0) goto L_0x0097
            boolean r0 = r9 instanceof X.C171108Fu
            if (r0 == 0) goto L_0x0097
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r8.A0I(r4)
            if (r0 == 0) goto L_0x008a
            X.33p r13 = r3.A1U
            java.lang.String r12 = r0.getRawString()
            if (r12 == 0) goto L_0x008a
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r13)
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            java.lang.String r2 = "contactless_jids_store"
            java.util.Set r0 = r1.getStringSet(r2, r0)
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r0)
            r1.add(r12)
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r13)
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r2, r1)
            r0.apply()
        L_0x008a:
            com.whatsapp.jid.Jid r2 = r8.A0I(r4)
            if (r2 == 0) goto L_0x0097
            X.4FS r1 = r3.A2c
            r0 = 23
            X.C70203a7.A00(r1, r3, r2, r0)
        L_0x0097:
            X.2sq r0 = r3.A0k
            boolean r0 = X.C86604Kt.A1a(r0, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0155
            boolean r0 = r3.A3Q
            if (r0 != 0) goto L_0x00ab
            boolean r0 = r3.A3U
            r2 = 2131894570(0x7f12212a, float:1.9423949E38)
            if (r0 == 0) goto L_0x00ae
        L_0x00ab:
            r2 = 2131894569(0x7f122129, float:1.9423946E38)
        L_0x00ae:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.5ZU r0 = r3.A12
            X.C18300x5.A1E(r0, r8, r1, r6)
            android.content.res.Resources r0 = X.C08310eF.A09(r3)
            java.lang.String r2 = r0.getString(r2, r1)
            r1 = 2131886836(0x7f1202f4, float:1.9408262E38)
            X.5AX r0 = new X.5AX
            r0.<init>(r8, r6, r3)
            com.whatsapp.blocklist.UnblockDialogFragment r1 = com.whatsapp.blocklist.UnblockDialogFragment.A00(r0, r2, r1, r6)
            X.03q r0 = r3.A0Q()
            X.C86644Kx.A1D(r1, r0)
        L_0x00d0:
            boolean r0 = r3.A3R
            if (r0 == 0) goto L_0x00e2
            java.util.List r0 = r3.A38
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0149
            X.2on r1 = r3.A2L
            r0 = 3
        L_0x00df:
            r1.A02(r0)
        L_0x00e2:
            if (r10 == 0) goto L_0x0135
            boolean r0 = r8.A10
            if (r0 == 0) goto L_0x0135
            X.4re r1 = new X.4re
            r1.<init>()
            java.util.List r0 = r3.A38
            boolean r0 = r0.contains(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            X.08M r0 = r3.A3h
            java.lang.Object r0 = r0.A07()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.C18320x8.A1U(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            boolean r0 = r8.A0U()
            if (r0 == 0) goto L_0x0136
            r0 = 2
        L_0x0112:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0116:
            r1.A04 = r0
            java.util.List r0 = r3.A35
            boolean r0 = r0.contains(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A02 = r0
            java.util.List r0 = r3.A37
            boolean r0 = r0.contains(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A03 = r0
            X.4FV r0 = r3.A1z
            r0.BhD(r1)
        L_0x0135:
            return
        L_0x0136:
            X.1VX r0 = r3.A1x
            boolean r0 = r0.A0X(r5)
            if (r0 == 0) goto L_0x0144
            boolean r0 = r9 instanceof X.C171108Fu
            if (r0 == 0) goto L_0x0144
            r0 = 3
            goto L_0x0112
        L_0x0144:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x0116
        L_0x0149:
            java.util.List r0 = r3.A35
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x00e2
            X.2on r1 = r3.A2L
            r0 = 4
            goto L_0x00df
        L_0x0155:
            if (r14 == 0) goto L_0x017d
            android.content.Context r0 = r3.A1D()
            X.4ea r6 = X.C89654ea.A4J(r0)
            if (r6 == 0) goto L_0x00d0
            X.8qC r0 = r3.A2i
            java.lang.Object r0 = r0.get()
            X.66o r0 = (X.C1229766o) r0
            X.8F1 r4 = new X.8F1
            r4.<init>(r3, r8, r11)
            X.5jK r0 = (X.C112185jK) r0
            X.2hm r2 = r0.A08
            java.lang.Integer r1 = X.C18300x5.A0Y()
            X.57k r0 = X.C996357k.AGENT
            r2.A00(r6, r4, r0, r1)
            goto L_0x00d0
        L_0x017d:
            boolean r0 = r8.A10
            if (r0 == 0) goto L_0x01b9
            boolean r0 = r3 instanceof com.whatsapp.contact.picker.VoipContactPickerFragment
            if (r0 == 0) goto L_0x0197
            r0 = r3
            com.whatsapp.contact.picker.VoipContactPickerFragment r0 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r0
            X.66R r0 = r0.A06
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x01b0
        L_0x0190:
            r0 = r17
            r3.A1o(r0, r8)
            goto L_0x00d0
        L_0x0197:
            boolean r0 = r3 instanceof com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment
            if (r0 != 0) goto L_0x0190
            boolean r0 = r3.A3d
            if (r0 != 0) goto L_0x0190
            boolean r0 = r3.A3V
            if (r0 != 0) goto L_0x0190
            boolean r0 = r3.A3b
            if (r0 != 0) goto L_0x0190
            java.util.Map r0 = r3.A3n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01b0
            goto L_0x0190
        L_0x01b0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r3.A2F(r1, r8, r0)
            goto L_0x00d0
        L_0x01b9:
            if (r10 == 0) goto L_0x01d5
            boolean r0 = r9 instanceof X.C133346hC
            if (r0 == 0) goto L_0x01d5
            r0 = r9
            X.6hC r0 = (X.C133346hC) r0
            java.util.List r1 = r0.A00
            int r0 = r1.size()
            if (r0 <= r7) goto L_0x01d5
            X.5ZU r0 = r3.A12
            java.lang.String r0 = r0.A0H(r8)
            r3.A1y(r0, r1)
            goto L_0x00d0
        L_0x01d5:
            r3.A1s(r8)
            goto L_0x00d0
        L_0x01da:
            boolean r0 = r9 instanceof X.C171118Fv
            if (r0 == 0) goto L_0x0135
            X.5rC r1 = r3.A0S
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x01f0
            r1.A04()
            java.lang.String r0 = "logEntryPointTap"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x01f0:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "ad_creation_tapped"
            r0 = 1
            r2.putExtra(r1, r0)
            android.os.Bundle r1 = r3.A1K()
            java.lang.String r0 = ""
            X.2z0 r0 = X.C107395bF.A03(r1, r0)
            if (r0 == 0) goto L_0x0209
            X.C107395bF.A00(r2, r0)
        L_0x0209:
            X.5hx r0 = r3.A19
            r0.A03(r2)
            X.C111355hx.A01(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110235fu.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    public /* synthetic */ C110235fu(ContactPickerFragment contactPickerFragment, boolean z) {
        this.A00 = contactPickerFragment;
        this.A01 = z;
    }
}
