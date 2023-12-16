package X;

import android.widget.AdapterView;

/* renamed from: X.696  reason: invalid class name */
public class AnonymousClass696 implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass696(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AdapterView adapterView, Object obj, int i) {
        adapterView.setOnItemClickListener(new AnonymousClass696(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.4ON} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: X.4Ob} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: X.4ON} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: X.4ON} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(android.widget.AdapterView r10, android.view.View r11, int r12, long r13) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0170;
                case 2: goto L_0x0055;
                case 3: goto L_0x0083;
                case 4: goto L_0x0097;
                case 5: goto L_0x00b4;
                case 6: goto L_0x00fe;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x011d;
                case 10: goto L_0x0151;
                case 11: goto L_0x015d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            r0.onListItemClicked(r11)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r3 = r9.A00
            X.4bW r3 = (X.C89104bW) r3
            java.lang.Object r0 = r11.getTag()
            boolean r0 = r0 instanceof X.AnonymousClass7MT
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r11.getTag()
            X.7MT r0 = (X.AnonymousClass7MT) r0
            com.whatsapp.jid.UserJid r4 = r0.A03
            X.2sq r0 = r3.A07
            boolean r0 = r0.A0P(r4)
            if (r0 == 0) goto L_0x0178
            boolean r0 = r3 instanceof com.whatsapp.status.audienceselector.StatusRecipientsActivity
            if (r0 == 0) goto L_0x000c
            r2 = 2131894571(0x7f12212b, float:1.942395E38)
            X.3Ex r0 = r3.A0A
            X.3ZH r5 = r0.A0A(r4)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.5ZU r0 = r3.A0C
            java.lang.String r0 = r0.A0H(r5)
            r4 = 0
            java.lang.String r2 = X.AnonymousClass002.A0F(r3, r0, r1, r4, r2)
            r1 = 2131886836(0x7f1202f4, float:1.9408262E38)
            X.8Ew r0 = new X.8Ew
            r0.<init>(r3, r5)
            com.whatsapp.blocklist.UnblockDialogFragment r0 = com.whatsapp.blocklist.UnblockDialogFragment.A00(r0, r2, r1, r4)
            X.C18270x1.A0t(r0, r3)
            return
        L_0x0055:
            java.lang.Object r3 = r9.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            r4 = 1
            int r12 = r12 - r4
            if (r12 < 0) goto L_0x000c
            X.4Ob r0 = r3.A0u
            int r0 = r0.getCount()
            if (r12 >= r0) goto L_0x000c
            X.4Ob r2 = r3.A0u
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x01c1
            java.util.List r0 = r2.A02
            int r1 = X.C86614Ku.A08(r0)
            int r0 = r2.A00
            if (r1 <= r0) goto L_0x01c1
            int r0 = r2.A01
            if (r12 != r0) goto L_0x01c1
            X.4Ob r1 = r3.A0u
            boolean r0 = r1.A03
            if (r0 == r4) goto L_0x000c
            r1.A03 = r4
            goto L_0x016c
        L_0x0083:
            java.lang.Object r1 = r9.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            java.lang.Object r0 = r11.getTag()
            X.5J3 r0 = (X.AnonymousClass5J3) r0
            X.3ZH r0 = r0.A03
            if (r0 == 0) goto L_0x000c
            r1.A0S = r0
            r11.showContextMenu()
            return
        L_0x0097:
            java.lang.Object r2 = r9.A00
            X.4eX r2 = (X.C89634eX) r2
            r0 = 2131433485(0x7f0b180d, float:1.8488757E38)
            android.view.View r0 = r11.findViewById(r0)
            if (r0 == 0) goto L_0x000c
            java.lang.Object r1 = r0.getTag()
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            boolean r0 = r2.A7b(r1)
            if (r0 == 0) goto L_0x01d7
            r2.A7Q(r1)
            return
        L_0x00b4:
            java.lang.Object r4 = r9.A00
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r4 = (com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r4
            r8 = 1
            X.C162457s7.A0J(r10, r8)
            java.lang.Object r7 = r10.getItemAtPosition(r12)
            boolean r0 = r7 instanceof X.C112795kJ
            r5 = 0
            if (r0 == 0) goto L_0x000c
            X.5kJ r7 = (X.C112795kJ) r7
            if (r7 == 0) goto L_0x000c
            java.util.List r1 = r7.A01
            int r0 = r1.size()
            if (r0 <= r8) goto L_0x0216
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r1.iterator()
        L_0x00d9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01db
            X.3ZH r1 = X.C18310x6.A0R(r3)
            X.33j r0 = r4.A00
            java.lang.CharSequence r2 = X.AnonymousClass5ZU.A00(r4, r0, r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = X.AnonymousClass36P.A02(r1)
            X.C626936e.A06(r1)
            X.C162457s7.A0D(r1)
            X.5dN r0 = new X.5dN
            r0.<init>(r2, r1)
            r6.add(r0)
            goto L_0x00d9
        L_0x00fe:
            java.lang.Object r2 = r9.A00
            com.whatsapp.documentpicker.DocumentPickerActivity r2 = (com.whatsapp.documentpicker.DocumentPickerActivity) r2
            android.widget.ListView r0 = r2.getListView()
            int r0 = r0.getHeaderViewsCount()
            int r12 = r12 - r0
            if (r12 < 0) goto L_0x000c
            java.util.List r0 = r2.A0U
            java.lang.Object r1 = r0.get(r12)
            X.5QG r1 = (X.AnonymousClass5QG) r1
            X.0R2 r0 = r2.A05
            if (r0 == 0) goto L_0x0233
            r2.A7A(r1)
            return
        L_0x011d:
            java.lang.Object r2 = r9.A00
            com.whatsapp.location.LiveLocationPrivacyActivity r2 = (com.whatsapp.location.LiveLocationPrivacyActivity) r2
            int r1 = r12 + -1
            if (r1 < 0) goto L_0x000c
            X.4OY r0 = r2.A0A
            int r0 = r0.getCount()
            if (r1 >= r0) goto L_0x000c
            X.4OY r0 = r2.A0A
            com.whatsapp.location.LiveLocationPrivacyActivity r0 = r0.A00
            java.util.List r0 = r0.A0F
            java.lang.Object r0 = r0.get(r1)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.second
            X.2z0 r1 = (X.AnonymousClass2z0) r1
            X.2qz r0 = r2.A0C
            X.34x r1 = r0.A05(r1)
            X.36r r0 = X.C86664Kz.A1B()
            android.content.Intent r1 = r0.A1R(r2, r1)
            X.5hX r0 = r2.A00
            r0.A0B(r2, r1)
            return
        L_0x0151:
            java.lang.Object r4 = r9.A00
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r3 = r10.getItemAtPosition(r12)     // Catch:{ IndexOutOfBoundsException -> 0x000c }
            X.5OC r3 = (X.AnonymousClass5OC) r3     // Catch:{ IndexOutOfBoundsException -> 0x000c }
            goto L_0x023b
        L_0x015d:
            java.lang.Object r1 = r9.A00
            X.4ON r1 = (X.AnonymousClass4ON) r1
            java.lang.String r0 = "SelectPhoneNumberDialog/phone-number-selected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r1.A00
            if (r0 == r12) goto L_0x000c
            r1.A00 = r12
        L_0x016c:
            r1.notifyDataSetChanged()
            return
        L_0x0170:
            java.lang.Object r0 = r9.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.openContextMenu(r11)
            return
        L_0x0178:
            java.util.Set r1 = r3.A0V
            boolean r0 = r1.contains(r4)
            if (r0 == 0) goto L_0x01bd
            r1.remove(r4)
        L_0x0183:
            java.lang.String r0 = r3.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a8
            boolean r0 = r1.contains(r4)
            if (r0 == 0) goto L_0x01a8
            X.5Ub r0 = r3.A0G
            androidx.appcompat.widget.SearchView r1 = r0.A02
            if (r1 == 0) goto L_0x01a8
            r0 = 2131433354(0x7f0b178a, float:1.8488491E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            int r1 = r2.length()
            r0 = 0
            r2.setSelection(r0, r1)
        L_0x01a8:
            java.util.Set r0 = r3.A0U
            r0.add(r4)
            android.os.Handler r1 = r3.A0N
            java.lang.Runnable r0 = r3.A0S
            X.C86644Kx.A0s(r1, r0)
            r3.A78()
            X.4OZ r0 = r3.A0O
            r0.notifyDataSetChanged()
            return
        L_0x01bd:
            r1.add(r4)
            goto L_0x0183
        L_0x01c1:
            X.4Ob r0 = r3.A0u
            java.util.List r0 = r0.A02
            if (r0 != 0) goto L_0x01d2
            r0 = 0
        L_0x01c8:
            X.5hX r1 = r3.A00
            android.content.Intent r0 = X.C627736r.A0N(r3, r0)
            r1.A0B(r3, r0)
            return
        L_0x01d2:
            X.3ZH r0 = X.AnonymousClass4L0.A0L(r0, r12)
            goto L_0x01c8
        L_0x01d7:
            r2.Ayk(r1)
            return
        L_0x01db:
            X.2h3 r3 = r4.A0G
            if (r3 == 0) goto L_0x020f
            java.lang.Integer r2 = r4.A75()
            X.1aN r1 = new X.1aN
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.A03 = r0
            r1.A04 = r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A02 = r0
            r1.A01 = r0
            X.4FV r0 = r3.A03
            r0.BhD(r1)
            r3 = 2131890733(0x7f12122d, float:1.9416166E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r1 = 0
            java.lang.String r0 = r7.A00
            java.lang.String r0 = X.AnonymousClass002.A0F(r4, r0, r2, r1, r3)
            com.whatsapp.contact.picker.PhoneNumberSelectionDialog r0 = com.whatsapp.contact.picker.PhoneNumberSelectionDialog.A00(r0, r6)
            r4.Bon(r0, r5)
            return
        L_0x020f:
            java.lang.String r0 = "inviteFlowLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0216:
            X.3ZH r0 = r7.getContact()
            X.C626936e.A06(r0)
            java.lang.String r1 = X.AnonymousClass36P.A02(r0)
            X.C626936e.A06(r1)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r4.A0I
            if (r0 != 0) goto L_0x022d
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x022d:
            X.4UC r0 = r0.A0D
            r0.A0H(r1)
            return
        L_0x0233:
            java.util.List r0 = java.util.Collections.singletonList(r1)
            r2.A7D(r0)
            return
        L_0x023b:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "country_name"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "cc"
            java.lang.String r0 = r3.A00
            r2.putExtra(r1, r0)
            java.lang.String r1 = "iso"
            java.lang.String r0 = r3.A03
            r2.putExtra(r1, r0)
            X.AnonymousClass0x2.A0m(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass696.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
