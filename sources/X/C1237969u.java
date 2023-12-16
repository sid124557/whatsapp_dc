package X;

/* renamed from: X.69u  reason: invalid class name and case insensitive filesystem */
public class C1237969u implements AnonymousClass658 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1237969u(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.4Wt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.whatsapp.updates.ui.statusmuting.MutedStatusesAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.4Wt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.4Wt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.4Wt} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BPS(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x0018;
                case 2: goto L_0x0028;
                case 3: goto L_0x00bf;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r8.A00
            com.whatsapp.updates.ui.statusmuting.MutedStatusesAdapter r1 = (com.whatsapp.updates.ui.statusmuting.MutedStatusesAdapter) r1
            java.lang.Object r0 = r8.A01
            java.util.List r0 = (java.util.List) r0
            X.0U0 r9 = (X.AnonymousClass0U0) r9
            X.C162457s7.A0H(r9)
            r1.A02 = r0
        L_0x0014:
            r9.A02(r1)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r1 = r8.A00
            com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter r1 = (com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter) r1
            java.lang.Object r0 = r8.A01
            java.util.List r0 = (java.util.List) r0
            X.0U0 r9 = (X.AnonymousClass0U0) r9
            X.C162457s7.A0H(r9)
            r1.A01 = r0
            goto L_0x0014
        L_0x0028:
            java.lang.Object r3 = r8.A00
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r3 = (com.whatsapp.updates.ui.adapter.UpdatesAdapter) r3
            java.lang.Object r2 = r8.A01
            java.util.List r2 = (java.util.List) r2
            X.0U0 r9 = (X.AnonymousClass0U0) r9
            X.C162457s7.A0H(r9)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Applying diff util changes, updates list size: "
            r1.append(r0)
            int r0 = r2.size()
            X.C18260x0.A1F(r1, r0)
            r3.A04 = r2
            r9.A02(r3)
            com.whatsapp.updates.ui.UpdatesFragment r3 = r3.A01
            if (r3 == 0) goto L_0x0017
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r3.A0q
            if (r0 == 0) goto L_0x0017
            X.4uZ r6 = r0.A01
            if (r6 == 0) goto L_0x0017
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r0 = r3.A0p
            if (r0 == 0) goto L_0x0017
            java.util.List r0 = r0.A04
            java.util.Iterator r7 = r0.iterator()
            r5 = 0
        L_0x0061:
            boolean r0 = r7.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.Object r2 = r7.next()
            int r1 = r5 + 1
            if (r5 >= 0) goto L_0x0075
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x0075:
            X.5C8 r2 = (X.AnonymousClass5C8) r2
            boolean r0 = r2 instanceof X.AnonymousClass536
            if (r0 == 0) goto L_0x00a4
            r0 = r2
            X.536 r0 = (X.AnonymousClass536) r0
            if (r0 == 0) goto L_0x00a4
            X.1RL r0 = r0.A03
            X.4uZ r0 = r0.A05()
        L_0x0086:
            boolean r0 = X.C162457s7.A0P(r0, r6)
            if (r0 != 0) goto L_0x00a6
            boolean r0 = r2 instanceof X.C986552s
            if (r0 == 0) goto L_0x009c
            X.52s r2 = (X.C986552s) r2
            if (r2 == 0) goto L_0x009c
            X.34r r0 = r2.A00()
            if (r0 == 0) goto L_0x009c
            com.whatsapp.jid.UserJid r4 = r0.A0A
        L_0x009c:
            boolean r0 = X.C162457s7.A0P(r4, r6)
            if (r0 != 0) goto L_0x00a6
            r5 = r1
            goto L_0x0061
        L_0x00a4:
            r0 = r4
            goto L_0x0086
        L_0x00a6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto L_0x0017
            int r2 = r0.intValue()
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = r3.A0q
            if (r1 == 0) goto L_0x00b7
            r0 = 0
            r1.A01 = r0
        L_0x00b7:
            com.whatsapp.collections.ObservableRecyclerView r0 = r3.A0H
            if (r0 == 0) goto L_0x0017
            r0.A0Z(r2)
            return
        L_0x00bf:
            java.lang.Object r1 = r8.A00
            X.4Wt r1 = (X.C87954Wt) r1
            java.lang.Object r0 = r8.A01
            java.util.List r0 = (java.util.List) r0
            X.0U0 r9 = (X.AnonymousClass0U0) r9
            X.C162457s7.A0H(r9)
            r1.A01 = r0
            goto L_0x0014
        L_0x00d0:
            java.lang.Object r5 = r8.A00
            X.4X6 r5 = (X.AnonymousClass4X6) r5
            java.lang.Object r1 = r8.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.0U0 r9 = (X.AnonymousClass0U0) r9
            r0 = 1
            X.C162457s7.A0J(r1, r0)
            X.C162457s7.A0H(r9)
            java.util.List r4 = r5.A08
            r4.clear()
            r4.addAll(r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r4.iterator()
        L_0x00f1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C96934xH
            if (r0 == 0) goto L_0x00f1
            r3.add(r1)
            goto L_0x00f1
        L_0x0103:
            int r1 = r3.size()
            int r0 = r4.size()
            if (r1 != r0) goto L_0x0112
            X.6nL r0 = X.C136836nL.A00
            r4.add(r0)
        L_0x0112:
            r9.A02(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1237969u.BPS(java.lang.Object):void");
    }
}
