package X;

import com.whatsapp.community.NewCommunityActivity;

/* renamed from: X.3bu  reason: invalid class name and case insensitive filesystem */
public class C71313bu implements Runnable {
    public Object A00;
    public final int A01;

    public C71313bu(NewCommunityActivity newCommunityActivity, int i) {
        this.A01 = i;
        if (16 - i != 0) {
            this.A00 = newCommunityActivity;
        } else {
            this.A00 = newCommunityActivity;
        }
    }

    public static C71313bu A00(Object obj, int i) {
        return new C71313bu(obj, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: com.whatsapp.community.ManageGroupsInCommunityActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v107, resolved type: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: com.whatsapp.community.NewCommunityActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v108, resolved type: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0318, code lost:
        r1.A0S(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x031b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0400, code lost:
        r0 = X.C627736r.A0h(r1, r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x041c, code lost:
        r1.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x041f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0444, code lost:
        r1.A01(r2, "community-examples-article");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0449, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010a, code lost:
        if (r1.BHW() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010c, code lost:
        r1.A74();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        ((X.AnonymousClass11B) r1).A0F(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0132, code lost:
        r1.A75(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0135, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r6 = r16
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x0136;
                case 2: goto L_0x01b1;
                case 3: goto L_0x0017;
                case 4: goto L_0x001e;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x0007;
                case 8: goto L_0x0025;
                case 9: goto L_0x01e9;
                case 10: goto L_0x01f6;
                case 11: goto L_0x0220;
                case 12: goto L_0x022f;
                case 13: goto L_0x0285;
                case 14: goto L_0x0291;
                case 15: goto L_0x0291;
                case 16: goto L_0x0299;
                case 17: goto L_0x002c;
                case 18: goto L_0x02a1;
                case 19: goto L_0x02b0;
                case 20: goto L_0x031c;
                case 21: goto L_0x04af;
                case 22: goto L_0x03a1;
                case 23: goto L_0x03c2;
                case 24: goto L_0x03d9;
                case 25: goto L_0x006c;
                case 26: goto L_0x03f0;
                case 27: goto L_0x040c;
                case 28: goto L_0x0420;
                case 29: goto L_0x0428;
                case 30: goto L_0x0430;
                case 31: goto L_0x044a;
                case 32: goto L_0x0452;
                case 33: goto L_0x045f;
                case 34: goto L_0x046c;
                case 35: goto L_0x04c8;
                case 36: goto L_0x008e;
                case 37: goto L_0x00bc;
                case 38: goto L_0x04eb;
                case 39: goto L_0x00cd;
                case 40: goto L_0x04f9;
                case 41: goto L_0x0100;
                case 42: goto L_0x0111;
                case 43: goto L_0x0122;
                case 44: goto L_0x0111;
                case 45: goto L_0x0505;
                case 46: goto L_0x054a;
                case 47: goto L_0x055a;
                case 48: goto L_0x0578;
                case 49: goto L_0x058d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r6.A00
            X.4Jb r0 = (X.C86164Jb) r0
            java.lang.Object r1 = r0.A00
        L_0x000d:
            X.11B r1 = (X.AnonymousClass11B) r1
            r0 = 1
            r1.A0F(r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r1 = r6.A00
            goto L_0x000d
        L_0x0017:
            java.lang.Object r0 = r6.A00
            X.4HJ r0 = (X.AnonymousClass4HJ) r0
            java.lang.Object r1 = r0.A00
            goto L_0x000d
        L_0x001e:
            java.lang.Object r0 = r6.A00
            X.4HI r0 = (X.AnonymousClass4HI) r0
            java.lang.Object r1 = r0.A00
            goto L_0x000d
        L_0x0025:
            java.lang.Object r0 = r6.A00
            X.4IC r0 = (X.AnonymousClass4IC) r0
            java.lang.Object r1 = r0.A00
            goto L_0x000d
        L_0x002c:
            double r8 = java.lang.Math.random()
            int[] r7 = com.whatsapp.community.NewCommunityActivity.A0R
            int r0 = r7.length
            r3 = 1
            int r0 = r0 - r3
            double r4 = (double) r0
            double r0 = r8 * r4
            long r1 = java.lang.Math.round(r0)
            int r0 = (int) r1
            int[] r2 = new int[r3]
            r1 = r7[r0]
            r0 = 0
            r2[r0] = r1
            X.4qr r13 = new X.4qr
            r13.<init>(r2)
            long r14 = com.whatsapp.emoji.EmojiDescriptor.A00(r13, r0)
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.NewCommunityActivity r2 = (com.whatsapp.community.NewCommunityActivity) r2
            X.5Y0 r10 = r2.A0C
            android.content.res.Resources r11 = r2.getResources()
            r12 = 0
            android.graphics.drawable.Drawable r5 = r10.A02(r11, r12, r13, r14)
            if (r5 == 0) goto L_0x0013
            X.5Ln r4 = r2.A0C
            android.widget.ImageView r1 = r2.A00
            android.content.res.Resources r0 = r2.getResources()
            android.graphics.Bitmap r7 = r4.A00(r0, r5, r1)
            goto L_0x05a7
        L_0x006c:
            java.lang.Object r0 = r6.A00
            X.2xY r0 = (X.C59822xY) r0
            X.1ie r1 = r0.A0C
            X.1fJ r3 = r0.A02
            java.util.Map r0 = r0.A0H
            java.util.ArrayList r2 = X.C18300x5.A0v(r0)
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x007e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r1.next()
            X.2rg r0 = (X.C56252rg) r0
            r0.A03(r3, r2)
            goto L_0x007e
        L_0x008e:
            java.lang.Object r0 = r6.A00
            X.3Em r0 = (X.C64683Em) r0
            X.2qg r0 = r0.A01
            X.C55642qg.A00(r0)
            X.4FK r5 = r0.A0G
            X.26p r5 = (X.C382626p) r5
            int r0 = r5.A01
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r4 = r5.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r4 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r4
            X.4E3 r3 = r4.A07
            r2 = 1
            r0 = -4
            r3.BK7(r2, r0, r2)
            com.whatsapp.qrcode.DevicePairQrScannerActivity.A0C(r4)
            r5.A00()
            return
        L_0x00b2:
            java.lang.String r0 = "LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onSyncdDeleteAllError"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r5.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r1
            goto L_0x0106
        L_0x00bc:
            java.lang.Object r1 = r6.A00
            X.3TC r1 = (X.AnonymousClass3TC) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0013
            X.2Vm r2 = r1.A07
            X.2S3 r1 = r1.A00
            r0 = -2
            r2.A00(r1, r0)
            return
        L_0x00cd:
            java.lang.Object r4 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r4 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r4
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0013
            androidx.recyclerview.widget.RecyclerView r0 = r4.A01
            X.0Xs r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.A1I()
            int r0 = r0.A1G()
            int r1 = r1 - r0
            r3 = 1
            int r2 = r1 + 1
            X.122 r0 = r4.A06
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            r1 = 0
            if (r2 == r0) goto L_0x00f7
            r3 = 0
        L_0x00f7:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A01
            if (r3 == 0) goto L_0x00fc
            r1 = 2
        L_0x00fc:
            r0.setOverScrollMode(r1)
            return
        L_0x0100:
            java.lang.Object r0 = r6.A00
            X.2ut r0 = (X.C58212ut) r0
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = r0.A00
        L_0x0106:
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0013
            r1.A74()
            r0 = 0
            goto L_0x0132
        L_0x0111:
            java.lang.Object r0 = r6.A00
            X.2ut r0 = (X.C58212ut) r0
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = r0.A00
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0013
            r1.A74()
            r0 = 1
            goto L_0x0132
        L_0x0122:
            java.lang.Object r0 = r6.A00
            X.2ut r0 = (X.C58212ut) r0
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = r0.A00
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0013
            r1.A74()
            r0 = 2
        L_0x0132:
            r1.A75(r0)
            return
        L_0x0136:
            java.lang.Object r3 = r6.A00
            X.11B r3 = (X.AnonymousClass11B) r3
            X.2so r0 = r3.A03
            java.util.List r0 = r0.A02()
            java.util.Iterator r7 = r0.iterator()
        L_0x0144:
            boolean r0 = r7.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x01a5
            X.4uZ r1 = X.C18300x5.A0P(r7)
            X.2ss r0 = r3.A09
            X.31A r4 = X.C56982ss.A00(r0, r1)
            com.whatsapp.jid.GroupJid r5 = X.AnonymousClass32V.A00(r1)
            if (r4 == 0) goto L_0x0144
            if (r5 == 0) goto L_0x0144
            java.util.Map r0 = r3.A0T
            java.util.List r1 = r3.A0E(r4, r0)
            if (r1 == 0) goto L_0x0175
            java.util.Comparator r0 = r3.A0R
            java.util.Collections.sort(r1, r0)
            java.util.Map r0 = r3.A0S
            r0.put(r4, r1)
            int r0 = r1.size()
            if (r0 != r6) goto L_0x0144
        L_0x0175:
            X.2lX r2 = r3.A0K
            int r1 = r4.A02
            r0 = 3
            if (r1 == r0) goto L_0x017e
            if (r1 != r6) goto L_0x0144
        L_0x017e:
            X.3Ex r1 = r2.A00
            X.4uZ r0 = r4.A05()
            X.3ZH r0 = r1.A0A(r0)
            boolean r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x0144
            X.2xM r0 = r3.A04
            java.util.Set r0 = r0.A01
            r0.add(r5)
            java.util.Map r1 = r3.A0S
            java.lang.Object r0 = r1.get(r4)
            if (r0 != 0) goto L_0x0144
            java.util.List r0 = java.util.Collections.emptyList()
            r1.put(r4, r0)
            goto L_0x0144
        L_0x01a5:
            r3.A0F(r6)
            X.3Wi r1 = r3.A01
            r0 = 2
            X.3bu r0 = A00(r3, r0)
            goto L_0x0318
        L_0x01b1:
            java.lang.Object r2 = r6.A00
            X.11B r2 = (X.AnonymousClass11B) r2
            X.1i2 r1 = r2.A08
            X.4F5 r0 = r2.A07
            r1.A06(r0)
            X.1hw r1 = r2.A0B
            X.4FI r0 = r2.A0A
            r1.A06(r0)
            X.1ie r1 = r2.A0J
            X.2rg r0 = r2.A0I
            r1.A06(r0)
            X.1iV r1 = r2.A0H
            X.2qm r0 = r2.A0G
            r1.A06(r0)
            X.1io r1 = r2.A0E
            X.4FW r0 = r2.A0D
            r1.A06(r0)
            X.1in r1 = r2.A06
            X.2sG r0 = r2.A05
            r1.A06(r0)
            X.2xM r0 = r2.A04
            X.1hw r1 = r0.A03
            X.4FI r0 = r0.A02
            r1.A06(r0)
            return
        L_0x01e9:
            java.lang.Object r0 = r6.A00
            X.4VR r0 = (X.AnonymousClass4VR) r0
            X.2so r2 = r0.A06
            X.1fJ r1 = r0.A0e
            r0 = 3
            r2.A08(r1, r0)
            return
        L_0x01f6:
            java.lang.Object r4 = r6.A00
            com.whatsapp.community.LinkExistingGroups r4 = (com.whatsapp.community.LinkExistingGroups) r4
            android.content.Intent r3 = X.C18320x8.A07()
            X.1fJ r2 = r4.A09
            if (r2 != 0) goto L_0x020d
            java.lang.String r1 = "should_open_new_group"
            r0 = 1
            r3.putExtra(r1, r0)
            X.AnonymousClass0x2.A0m(r4, r3)
            return
        L_0x020d:
            r1 = 3
            r0 = 0
            android.content.Intent r1 = X.C627736r.A1A(r4, r0, r1)
            java.lang.String r0 = "parent_group_jid_to_link"
            X.AnonymousClass0x2.A0u(r1, r2, r0)
            r4.finish()
            r4.startActivity(r1)
            return
        L_0x0220:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.LinkExistingGroups r2 = (com.whatsapp.community.LinkExistingGroups) r2
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r1 = r2.A03
            X.1fJ r0 = r2.A09
            java.util.SortedSet r0 = r1.A03(r0)
            r2.A0E = r0
            return
        L_0x022f:
            java.lang.Object r6 = r6.A00
            X.3Oy r6 = (X.C67353Oy) r6
            com.whatsapp.community.LinkExistingGroups r4 = r6.A00
            X.3Lq r5 = r4.A07
            X.3Ex r1 = r4.A0B
            X.1fJ r0 = r4.A0A
            X.3ZH r3 = r1.A0A(r0)
            X.4uZ r0 = r3.A0H
            X.1fJ r1 = X.AnonymousClass34R.A01(r0)
            if (r1 == 0) goto L_0x025d
            X.2ss r0 = r5.A0S
            int r2 = r0.A06(r1)
            r0 = 2
            if (r2 == r0) goto L_0x027e
            if (r2 != 0) goto L_0x025d
            r0 = 0
        L_0x0253:
            X.2Ls r1 = new X.2Ls
            r1.<init>(r0, r2)
            X.2qk r0 = r5.A04
            r3.A0X(r0, r1)
        L_0x025d:
            java.util.ArrayList r2 = r4.A0e
            X.3ZH r1 = r6.A01
            X.4lq r0 = new X.4lq
            r0.<init>(r1)
            int r1 = r2.indexOf(r0)
            X.4lq r0 = new X.4lq
            r0.<init>(r3)
            r2.set(r1, r0)
            X.1RO r0 = new X.1RO
            r0.<init>(r3)
            r4.A7P(r0)
            X.C71313bu.super.Ayk(r3)
            return
        L_0x027e:
            X.2so r0 = r5.A0A
            X.1fJ r0 = r0.A01(r1)
            goto L_0x0253
        L_0x0285:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r2 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r2
            X.2nM r1 = r2.A0G
            java.lang.String r0 = "community-settings-add-groups"
            r1.A01(r2, r0)
            return
        L_0x0291:
            java.lang.Object r1 = r6.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r1 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r1
            X.1fJ r0 = r1.A0L
            goto L_0x0400
        L_0x0299:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.NewCommunityActivity r2 = (com.whatsapp.community.NewCommunityActivity) r2
            X.2nM r1 = r2.A06
            goto L_0x0444
        L_0x02a1:
            java.lang.Object r0 = r6.A00
            X.4IO r0 = (X.AnonymousClass4IO) r0
            java.lang.Object r0 = r0.A00
            X.4ea r0 = (X.C89654ea) r0
            r0.BjL()
            X.C18290x4.A18(r0)
            return
        L_0x02b0:
            java.lang.Object r1 = r6.A00
            com.whatsapp.community.communityInfo.CAGInfoFragment r1 = (com.whatsapp.community.communityInfo.CAGInfoFragment) r1
            X.66R r0 = r1.A09
            java.lang.Object r6 = r0.getValue()
            com.whatsapp.community.communityInfo.CAGInfoViewModel r6 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r6
            X.66R r0 = r1.A0A
            java.lang.Object r7 = r0.getValue()
            X.1fJ r7 = (X.C27991fJ) r7
            X.66R r0 = r1.A0C
            java.lang.Object r2 = r0.getValue()
            X.1Nc r2 = (X.C22411Nc) r2
            X.66R r0 = r1.A0D
            java.lang.Object r1 = r0.getValue()
            X.10x r1 = (X.AnonymousClass10x) r1
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            X.C18260x0.A0Q(r2, r1)
            X.3Ex r0 = r6.A0B
            X.3ZH r5 = r0.A0A(r7)
            r6.A00 = r5
            r6.A04 = r7
            r6.A03 = r2
            r6.A01 = r1
            X.3Lr r4 = r6.A0I
            r3 = 0
            X.5ZU r1 = r6.A0C
            java.lang.String r2 = "cagChat"
            r0 = -1
            boolean r0 = r1.A0e(r5, r0)
            r1 = 0
            if (r0 != 0) goto L_0x030d
            X.3ZH r0 = r6.A00
            if (r0 != 0) goto L_0x0301
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0301:
            java.lang.String r0 = r0.A0V
            if (r0 == 0) goto L_0x030d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x030d
            java.lang.String r3 = "interactive"
        L_0x030d:
            r4.A0E(r7, r3, r1)
            X.3Wi r1 = r6.A09
            r0 = 20
            X.3bu r0 = A00(r6, r0)
        L_0x0318:
            r1.A0S(r0)
            return
        L_0x031c:
            java.lang.Object r4 = r6.A00
            com.whatsapp.community.communityInfo.CAGInfoViewModel r4 = (com.whatsapp.community.communityInfo.CAGInfoViewModel) r4
            X.1io r1 = r4.A0F
            X.66R r0 = r4.A0O
            java.lang.Object r0 = r0.getValue()
            r1.A06(r0)
            X.1hw r1 = r4.A0E
            X.66R r0 = r4.A0N
            java.lang.Object r0 = r0.getValue()
            r1.A06(r0)
            X.2j0 r1 = r4.A0G
            X.66R r0 = r4.A0P
            java.lang.Object r0 = r0.getValue()
            X.4AQ r0 = (X.AnonymousClass4AQ) r0
            r1.A00(r0)
            X.08J r3 = r4.A08
            X.1Nc r0 = r4.A03
            java.lang.String r5 = "groupChatInfoViewModel"
            if (r0 != 0) goto L_0x0350
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0350:
            X.0Wx r2 = r0.A02
            X.41Q r1 = new X.41Q
            r1.<init>(r4)
            r0 = 41
            X.AnonymousClass4K2.A01(r2, r3, r1, r0)
            X.10x r0 = r4.A01
            if (r0 != 0) goto L_0x0367
            java.lang.String r0 = "groupParticipantsViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0367:
            X.108 r2 = r0.A0H
            X.41R r1 = new X.41R
            r1.<init>(r4)
            r0 = 42
            X.AnonymousClass4K2.A01(r2, r3, r1, r0)
            X.1Nc r0 = r4.A03
            if (r0 != 0) goto L_0x037c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x037c:
            X.0Wx r2 = r0.A07
            X.41S r1 = new X.41S
            r1.<init>(r4)
            r0 = 43
            X.AnonymousClass4K2.A01(r2, r3, r1, r0)
            X.1Nc r0 = r4.A03
            if (r0 != 0) goto L_0x0391
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0391:
            X.0Wx r2 = r0.A00
            X.41T r1 = new X.41T
            r1.<init>(r4)
            r0 = 44
            X.AnonymousClass4K2.A01(r2, r3, r1, r0)
            r4.A0E()
            return
        L_0x03a1:
            java.lang.Object r3 = r6.A00
            X.0yw r3 = (X.C19190yw) r3
            X.3Lk r1 = r3.getFaqLinkFactory$community_consumerBeta()
            java.lang.String r0 = "3114626665494175"
            android.net.Uri r0 = r1.A03(r0)
            X.C162457s7.A0D(r0)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            X.5hX r1 = r3.getActivityUtils$community_consumerBeta()
            android.content.Context r0 = r3.getContext()
            r1.A0A(r0, r2)
            return
        L_0x03c2:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet r2 = (com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet) r2
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r2.A01
            r1 = 1
            if (r0 == 0) goto L_0x03ce
            r0.setEnabled(r1)
        L_0x03ce:
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r2.A02
            if (r0 == 0) goto L_0x03d5
            r0.setEnabled(r1)
        L_0x03d5:
            r2.A1L()
            return
        L_0x03d9:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet r2 = (com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet) r2
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r2.A06
            r1 = 1
            if (r0 == 0) goto L_0x03e5
            r0.setEnabled(r1)
        L_0x03e5:
            com.whatsapp.radio.RadioButtonWithSubtitle r0 = r2.A07
            if (r0 == 0) goto L_0x03ec
            r0.setEnabled(r1)
        L_0x03ec:
            r2.A1K()
            return
        L_0x03f0:
            java.lang.Object r1 = r6.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r1 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r1
            X.3Ej r0 = r1.A03
            if (r0 == 0) goto L_0x0405
            X.66R r0 = r1.A0E
            java.lang.Object r0 = r0.getValue()
            X.1fJ r0 = (X.C27991fJ) r0
        L_0x0400:
            android.content.Intent r0 = X.C627736r.A0h(r1, r0)
            goto L_0x041c
        L_0x0405:
            java.lang.String r0 = "communityNavigator"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x040c:
            java.lang.Object r1 = r6.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r1 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r1
            X.66R r0 = r1.A0E
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            android.content.Intent r0 = X.C627736r.A0T(r1, r0)
        L_0x041c:
            r1.startActivity(r0)
            return
        L_0x0420:
            java.lang.Object r0 = r6.A00
            X.0R6 r0 = (X.AnonymousClass0R6) r0
            r0.A05()
            return
        L_0x0428:
            java.lang.Object r0 = r6.A00
            X.12k r0 = (X.C197512k) r0
            r0.A07()
            return
        L_0x0430:
            java.lang.Object r3 = r6.A00
            X.12k r3 = (X.C197512k) r3
            android.view.View r0 = r3.A00
            android.content.Context r1 = r0.getContext()
            java.lang.Class<X.03q> r0 = X.C003203q.class
            android.app.Activity r2 = X.C111095hX.A03(r1, r0)
            X.03q r2 = (X.C003203q) r2
            X.2nM r1 = r3.A03
        L_0x0444:
            java.lang.String r0 = "community-examples-article"
            r1.A01(r2, r0)
            return
        L_0x044a:
            java.lang.Object r0 = r6.A00
            X.0yy r0 = (X.C19200yy) r0
            r0.A00()
            return
        L_0x0452:
            java.lang.Object r0 = r6.A00
            X.2r3 r0 = (X.C55872r3) r0
            X.1iB r2 = r0.A05
            java.lang.String r1 = "invalid_adv_status"
            r0 = 1
            r2.A0K(r1, r0)
            return
        L_0x045f:
            java.lang.Object r0 = r6.A00
            X.2qg r0 = (X.C55642qg) r0
            X.C55642qg.A00(r0)
            X.4FK r0 = r0.A0G
            r0.BUj()
            return
        L_0x046c:
            java.lang.Object r0 = r6.A00
            X.2Vm r0 = (X.C44292Vm) r0
            X.2qg r0 = r0.A00
            X.1iB r5 = r0.A0E
            X.2fi r2 = r0.A00
            java.lang.Object r4 = r5.A0P
            monitor-enter(r4)
            X.2fi r0 = r5.A00     // Catch:{ all -> 0x04ac }
            if (r0 != 0) goto L_0x0497
            r0 = 0
            r5.A01 = r0     // Catch:{ all -> 0x04ac }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ac }
            java.lang.String r0 = "companion-device-manager/device login initiated: "
            r1.append(r0)     // Catch:{ all -> 0x04ac }
            X.33G r0 = r2.A02     // Catch:{ all -> 0x04ac }
            com.whatsapp.jid.DeviceJid r0 = r0.A07     // Catch:{ all -> 0x04ac }
            X.C18260x0.A0o(r0, r1)     // Catch:{ all -> 0x04ac }
            r5.A00 = r2     // Catch:{ all -> 0x04ac }
            r0 = 1
            r5.A03 = r0     // Catch:{ all -> 0x04ac }
        L_0x0495:
            monitor-exit(r4)     // Catch:{ all -> 0x04ac }
            goto L_0x04ab
        L_0x0497:
            java.lang.String r0 = "companion-device-manager/onDeviceLoginInitiated/login already initiated"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04ac }
            X.2qk r3 = r5.A06     // Catch:{ all -> 0x04ac }
            java.lang.String r2 = "companion-device-manager/login already initiated"
            boolean r0 = r5.A03     // Catch:{ all -> 0x04ac }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04ac }
            r0 = 0
            r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x04ac }
            goto L_0x0495
        L_0x04ab:
            return
        L_0x04ac:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x04ac }
            throw r0
        L_0x04af:
            java.lang.Object r0 = r6.A00
            X.4cM r0 = (X.C89354cM) r0
            X.2iC r2 = r0.getUserMuteActions$community_consumerBeta()
            X.1fJ r1 = r0.A06
            if (r1 != 0) goto L_0x04c2
            java.lang.String r0 = "cagJid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04c2:
            X.21R r0 = X.AnonymousClass21R.CONTACT_INFO
            r2.A00(r1, r0)
            return
        L_0x04c8:
            java.lang.Object r1 = r6.A00
            X.4FK r1 = (X.AnonymousClass4FK) r1
            X.26p r1 = (X.C382626p) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x04e5
            java.lang.Object r3 = r1.A00
            android.app.Activity r3 = (android.app.Activity) r3
            r2 = 1
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "has_removed_all_devices"
            r1.putExtra(r0, r2)
            r0 = -1
            r3.setResult(r0, r1)
            return
        L_0x04e5:
            java.lang.String r0 = "LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onRemovedAllDevices"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x04eb:
            java.lang.Object r0 = r6.A00
            X.4ea r0 = (X.C89654ea) r0
            X.3Wi r2 = r0.A05
            r1 = 2131890631(0x7f1211c7, float:1.941596E38)
            r0 = 1
            r2.A0I(r1, r0)
            return
        L_0x04f9:
            java.lang.Object r0 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r0
            X.1iB r1 = r0.A0B
            java.lang.String r0 = "account_sync_timeout"
            r1.A0J(r0)
            return
        L_0x0505:
            java.lang.Object r5 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            X.1iB r4 = r5.A0H
            java.lang.String r0 = "companion-device-manager/refreshDevicePresence"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.Set r0 = r4.A0R
            r0.clear()
            java.util.List r0 = r4.A0D()
            java.util.Iterator r3 = r0.iterator()
        L_0x051d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0537
            java.lang.Object r0 = r3.next()
            X.33G r0 = (X.AnonymousClass33G) r0
            com.whatsapp.jid.DeviceJid r2 = r0.A07
            X.31C r1 = r4.A0L
            r0 = 240(0xf0, float:3.36E-43)
            android.os.Message r0 = X.C18290x4.A0J(r0, r2)
            r1.A0J(r0)
            goto L_0x051d
        L_0x0537:
            X.4FS r4 = r5.A0Y
            r0 = 46
            X.3bu r3 = A00(r5, r0)
            r1 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r0 = "LinedDevicesActivity/refresh"
            java.lang.Runnable r0 = r4.Bkn(r3, r0, r1)
            r5.A02 = r0
            return
        L_0x054a:
            java.lang.Object r2 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r2
            X.4FS r1 = r2.A0Y
            r0 = 45
            X.3bu r0 = A00(r2, r0)
            r1.BkM(r0)
            return
        L_0x055a:
            java.lang.Object r0 = r6.A00
            X.4Id r0 = (X.C85924Id) r0
            java.lang.Object r2 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r2
            r0 = 0
            r2.A03 = r0
            X.08M r1 = r2.A05
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0H(r0)
            X.4UC r0 = r2.A0W
            r1 = 0
            r0.A0H(r1)
            X.4UC r0 = r2.A0Q
            r0.A0H(r1)
            return
        L_0x0578:
            java.lang.Object r0 = r6.A00
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = (com.whatsapp.companiondevice.LinkedDevicesViewModel) r0
            X.4FS r4 = r0.A0A
            X.1iB r3 = r0.A04
            X.5rC r2 = r0.A01
            X.49V r1 = r0.A03
            X.1sx r0 = new X.1sx
            r0.<init>(r2, r1, r3)
            X.C18270x1.A0w(r0, r4)
            return
        L_0x058d:
            java.lang.Object r0 = r6.A00
            X.3TQ r0 = (X.AnonymousClass3TQ) r0
            r0.A00()
            X.30i r3 = r0.A02
            java.lang.String r0 = "SyncResponseHandler/onDeliveryFailure request failed to be delivered, retrying."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2zM r0 = r3.A0J
            java.lang.Long r2 = r0.A01()
            r1 = 0
            r0 = 1
            r3.A04(r2, r1, r0)
            return
        L_0x05a7:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x061d }
            r0 = 640(0x280, float:8.97E-43)
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r0, r0, r1)     // Catch:{ OutOfMemoryError -> 0x061d }
            if (r5 == 0) goto L_0x061d
            int[] r6 = r2.A0N
            int r0 = r6.length
            int r0 = r0 - r3
            double r0 = (double) r0
            double r8 = r8 * r0
            long r3 = java.lang.Math.round(r8)
            int r0 = (int) r3
            r0 = r6[r0]
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r5)
            r3.drawColor(r0)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0 = 0
            r3.drawBitmap(r7, r0, r0, r1)
            X.33i r0 = r2.A08
            X.5UR r4 = r0.A0R()
            r3 = 0
            if (r4 != 0) goto L_0x05de
            java.lang.String r0 = "NewCommunityActivity/getRandomlySelectedEmojiBitmap contentResolver=null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x060e }
            goto L_0x0614
        L_0x05de:
            X.1m3 r1 = r2.A0F     // Catch:{ Exception -> 0x060e }
            X.1PB r0 = r2.A03     // Catch:{ Exception -> 0x060e }
            java.io.File r0 = r1.A03(r0)     // Catch:{ Exception -> 0x060e }
            r0.delete()     // Catch:{ Exception -> 0x060e }
            X.2ro r1 = r2.A0B     // Catch:{ Exception -> 0x060e }
            X.1PB r0 = r2.A03     // Catch:{ Exception -> 0x060e }
            java.io.File r0 = r1.A02(r0)     // Catch:{ Exception -> 0x060e }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x060e }
            java.io.OutputStream r3 = r4.A07(r0)     // Catch:{ Exception -> 0x060e }
            if (r3 == 0) goto L_0x0614
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x060e }
            r0 = 85
            r5.compress(r1, r0, r3)     // Catch:{ Exception -> 0x060e }
            r3.flush()     // Catch:{ Exception -> 0x060e }
            java.lang.String r0 = "NewCommunityActivity/setRandomlySelectedPicture"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x060e }
            r2.A77()     // Catch:{ Exception -> 0x060e }
            goto L_0x0614
        L_0x060e:
            r1 = move-exception
            java.lang.String r0 = "NewCommunityActivity/render/bg/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0618 }
        L_0x0614:
            X.C624535b.A03(r3)
            return
        L_0x0618:
            r0 = move-exception
            X.C624535b.A03(r3)
            throw r0
        L_0x061d:
            java.lang.String r0 = "NewCommunityActivity/Could not create randomly selected community icon"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71313bu.run():void");
    }

    public C71313bu(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
