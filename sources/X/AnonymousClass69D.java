package X;

import android.view.MenuItem;

/* renamed from: X.69D  reason: invalid class name */
public class AnonymousClass69D implements MenuItem.OnMenuItemClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass69D(C91694kj r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cb, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        r3.A12.execute(new X.C71553cI((java.lang.Object) r3, 44));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f0, code lost:
        r3.BkM(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x005a;
                case 2: goto L_0x0073;
                case 3: goto L_0x0084;
                case 4: goto L_0x009d;
                case 5: goto L_0x00db;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            X.4kj r0 = (X.C91694kj) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.4uZ r4 = r0.A0a
            if (r4 == 0) goto L_0x0021
            X.5Qi r3 = r0.A0N
            X.1R1 r0 = r3.A05
            java.util.Set r2 = r0.A0R()
            int r1 = r2.size()
            r0 = 3
            if (r1 < r0) goto L_0x0023
            r3.A00(r2)
        L_0x0021:
            r0 = 1
            return r0
        L_0x0023:
            X.4FS r1 = r3.A06
            r0 = 22
            X.C117155rT.A00(r1, r3, r4, r0)
            goto L_0x0021
        L_0x002b:
            java.lang.Object r2 = r12.A00
            X.4kj r2 = (X.C91694kj) r2
            com.whatsapp.community.CommunityNavigationActivity r3 = r2.A00
            X.4uZ r1 = r3.A0a
            if (r1 == 0) goto L_0x0021
            X.1R1 r0 = r3.A0e
            boolean r0 = r0.A0h(r1)
            if (r0 == 0) goto L_0x0048
            X.4FS r3 = r3.A04
            r0 = 36
            X.3cI r1 = new X.3cI
            r1.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x00f0
        L_0x0048:
            X.4uZ r1 = r3.A0a
            X.21R r0 = X.AnonymousClass21R.COMMUNITY_NAVIGATION
            com.whatsapp.mute.ui.MuteDialogFragment r2 = X.C57402ta.A00(r1, r0)
            X.0df r1 = r3.getSupportFragmentManager()
            java.lang.String r0 = "MuteDialogFragment"
            r2.A1O(r1, r0)
            goto L_0x0021
        L_0x005a:
            java.lang.Object r0 = r12.A00
            X.4kj r0 = (X.C91694kj) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.4uZ r2 = r0.A0a
            r4 = 1
            if (r2 == 0) goto L_0x0021
            X.2oD r1 = r0.A0K
            r3 = 3
            r6 = r4
            r5 = r4
            r1.A01(r2, r3, r4, r5, r6)
            X.33b r0 = r0.A0d
            r0.A07()
            goto L_0x0021
        L_0x0073:
            java.lang.Object r0 = r12.A00
            X.4kj r0 = (X.C91694kj) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.4uZ r2 = r0.A0a
            r1 = 1
            if (r2 == 0) goto L_0x0021
            X.2oD r0 = r0.A0K
            r0.A02(r2, r1)
            goto L_0x0021
        L_0x0084:
            java.lang.Object r0 = r12.A00
            X.4kj r0 = (X.C91694kj) r0
            com.whatsapp.community.CommunityNavigationActivity r4 = r0.A00
            X.4uZ r3 = r4.A0a
            if (r3 == 0) goto L_0x0021
            X.5XH r0 = r4.A0O
            r2 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.2sA r0 = r0.A06
            r0.A06(r3, r1, r2)
            X.11H r3 = r4.A0C
            goto L_0x00cb
        L_0x009d:
            java.lang.Object r0 = r12.A00
            X.4kj r0 = (X.C91694kj) r0
            com.whatsapp.community.CommunityNavigationActivity r5 = r0.A00
            X.4uZ r4 = r5.A0a
            r9 = 1
            if (r4 == 0) goto L_0x0021
            X.5XH r3 = r5.A0O
            java.lang.Integer r2 = X.C18290x4.A0a()
            X.2sA r0 = r3.A06
            r0.A06(r4, r2, r9)
            X.4FS r1 = r3.A0B
            r0 = 41
            X.C70333aK.A00(r1, r3, r4, r2, r0)
            X.2oD r6 = r5.A0K
            X.4uZ r7 = r5.A0a
            r8 = 0
            r11 = r9
            r10 = r9
            r6.A01(r7, r8, r9, r10, r11)
            X.33b r0 = r5.A0d
            r0.A07()
            X.11H r3 = r5.A0C
        L_0x00cb:
            if (r3 == 0) goto L_0x0021
            X.3dI r2 = r3.A12
            r1 = 44
            X.3cI r0 = new X.3cI
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.execute(r0)
            goto L_0x0021
        L_0x00db:
            java.lang.Object r0 = r12.A00
            X.4kj r0 = (X.C91694kj) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.4uZ r4 = r0.A0a
            if (r4 == 0) goto L_0x0021
            X.5Qi r2 = r0.A0N
            X.4FS r3 = r2.A06
            r0 = 21
            X.5rT r1 = new X.5rT
            r1.<init>(r2, r0, r4)
        L_0x00f0:
            r3.BkM(r1)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69D.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
