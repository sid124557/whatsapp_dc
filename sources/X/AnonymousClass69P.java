package X;

import android.widget.AdapterView;

/* renamed from: X.69P  reason: invalid class name */
public class AnonymousClass69P implements AdapterView.OnItemLongClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass69P(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r0.A09 == false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onItemLongClick(android.widget.AdapterView r12, android.view.View r13, int r14, long r15) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x007f;
                case 2: goto L_0x00d4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r11.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            X.4OU r0 = r1.A0Z
            int r0 = r0.getCount()
            if (r14 >= r0) goto L_0x0117
            X.4OU r0 = r1.A0Z
            java.util.List r0 = r0.A00
            X.34x r0 = X.C18320x8.A0R(r0, r14)
            r1.A77(r13, r0)
        L_0x001c:
            r0 = 1
            return r0
        L_0x001e:
            java.lang.Object r3 = r11.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            android.widget.ListView r0 = r3.A0L
            android.widget.ListAdapter r2 = r0.getAdapter()
            boolean r0 = r2 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0032
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
        L_0x0032:
            X.4lo r2 = (X.C91924lo) r2
            android.widget.ListView r0 = r3.A0L
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0045
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r0 = r1.getHeadersCount()
            int r14 = r14 - r0
        L_0x0045:
            if (r14 < 0) goto L_0x001c
            X.4lo r0 = r3.A18
            int r0 = r0.getCount()
            if (r14 >= r0) goto L_0x001c
            java.util.List r0 = r2.A02
            java.lang.Object r0 = r0.get(r14)
            X.8nu r0 = (X.C182128nu) r0
            X.3ZH r2 = r0.getContact()
            if (r2 == 0) goto L_0x0117
            boolean r0 = r2.A10
            if (r0 == 0) goto L_0x0117
            X.2qS r0 = r2.A0E
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.A09
            r1 = 1
            if (r0 != 0) goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            X.2sq r0 = r3.A0k
            boolean r0 = X.C86604Kt.A1a(r0, r2)
            if (r0 != 0) goto L_0x0117
            if (r1 != 0) goto L_0x0117
            boolean r0 = r3.A21()
            if (r0 == 0) goto L_0x001c
            r3.A1o(r13, r2)
            goto L_0x001c
        L_0x007f:
            java.lang.Object r6 = r11.A00
            com.whatsapp.documentpicker.DocumentPickerActivity r6 = (com.whatsapp.documentpicker.DocumentPickerActivity) r6
            android.widget.ListView r0 = r6.getListView()
            int r0 = r0.getHeaderViewsCount()
            int r14 = r14 - r0
            r7 = 1
            if (r14 < 0) goto L_0x001c
            java.util.List r0 = r6.A0U
            java.lang.Object r1 = r0.get(r14)
            X.5QG r1 = (X.AnonymousClass5QG) r1
            X.0R2 r0 = r6.A05
            if (r0 == 0) goto L_0x00a0
            r6.A7A(r1)
            goto L_0x001c
        L_0x00a0:
            java.util.List r0 = r6.A0Y
            r0.clear()
            r0.add(r1)
            X.33i r5 = r6.A08
            android.content.res.Resources r4 = r6.getResources()
            r3 = 2131755212(0x7f1000cc, float:1.9141297E38)
            int r2 = r0.size()
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = r0.size()
            X.AnonymousClass000.A1L(r1, r0)
            java.lang.String r0 = r4.getQuantityString(r3, r2, r1)
            X.C107295b4.A00(r6, r5, r0)
            X.0uE r0 = r6.A0X
            X.0R2 r0 = r6.Bpz(r0)
            r6.A05 = r0
            X.4Oh r0 = r6.A0J
            r0.notifyDataSetChanged()
            goto L_0x001c
        L_0x00d4:
            java.lang.Object r4 = r11.A00
            com.whatsapp.status.StatusesFragment r4 = (com.whatsapp.status.StatusesFragment) r4
            java.lang.Object r3 = r13.getTag()
            X.4Yw r3 = (X.C88474Yw) r3
            X.03q r2 = X.C86654Ky.A0O(r4)
            if (r3 == 0) goto L_0x0117
            com.whatsapp.jid.UserJid r1 = r3.A06
            X.1fY r0 = X.AnonymousClass1fY.A00
            if (r1 == r0) goto L_0x0117
            X.0df r0 = r2.getSupportFragmentManager()
            boolean r0 = r0.A0t()
            if (r0 != 0) goto L_0x0117
            X.1R1 r0 = r4.A0l
            X.C626936e.A06(r1)
            boolean r0 = r0.A0j(r1)
            com.whatsapp.jid.UserJid r5 = r3.A06
            r6 = 0
            java.lang.String r9 = r4.A1K()
            r10 = 1
            r8 = r6
            r7 = r6
            if (r0 == 0) goto L_0x0112
            com.whatsapp.status.StatusConfirmUnmuteDialogFragment r0 = X.C387028u.A00(r5, r6, r7, r8, r9, r10)
        L_0x010d:
            X.C57052sz.A01(r0, r4)
            goto L_0x001c
        L_0x0112:
            com.whatsapp.status.StatusConfirmMuteDialogFragment r0 = X.C386928t.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x010d
        L_0x0117:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69P.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
    }
}
