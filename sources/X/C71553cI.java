package X;

import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.3cI  reason: invalid class name and case insensitive filesystem */
public class C71553cI implements Runnable {
    public Object A00;
    public final int A01;

    public C71553cI(C91504kC r1, int i) {
        this.A01 = i;
        if (15 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public static void A00(C72173dI r1, Object obj, int i) {
        r1.execute(new C71553cI(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.54D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: X.54D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: X.54D} */
    /* JADX WARNING: type inference failed for: r1v71, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03c6, code lost:
        if (r2 != null) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0403, code lost:
        r1.A0G(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0406, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x045d, code lost:
        r0 = new X.C71653cS(r4, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0462, code lost:
        r2.A0S(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0465, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0490, code lost:
        r2.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0493, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x052a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x052e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0531, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0532, code lost:
        X.AnonymousClass2A8.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0535, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0566, code lost:
        r0.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0569, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x065a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x065e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x065f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0660, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0663, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:169:0x03da, B:267:0x063d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r3 = r19
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x022d;
                case 1: goto L_0x023f;
                case 2: goto L_0x0247;
                case 3: goto L_0x000f;
                case 4: goto L_0x024f;
                case 5: goto L_0x025a;
                case 6: goto L_0x0264;
                case 7: goto L_0x026c;
                case 8: goto L_0x027f;
                case 9: goto L_0x0302;
                case 10: goto L_0x0313;
                case 11: goto L_0x0007;
                case 12: goto L_0x0007;
                case 13: goto L_0x0007;
                case 14: goto L_0x0007;
                case 15: goto L_0x0324;
                case 16: goto L_0x0033;
                case 17: goto L_0x032f;
                case 18: goto L_0x005b;
                case 19: goto L_0x006d;
                case 20: goto L_0x0337;
                case 21: goto L_0x0343;
                case 22: goto L_0x0368;
                case 23: goto L_0x0370;
                case 24: goto L_0x03de;
                case 25: goto L_0x03ed;
                case 26: goto L_0x0085;
                case 27: goto L_0x03f6;
                case 28: goto L_0x0407;
                case 29: goto L_0x0413;
                case 30: goto L_0x0420;
                case 31: goto L_0x0420;
                case 32: goto L_0x043a;
                case 33: goto L_0x0447;
                case 34: goto L_0x0468;
                case 35: goto L_0x0474;
                case 36: goto L_0x0484;
                case 37: goto L_0x0494;
                case 38: goto L_0x04c0;
                case 39: goto L_0x04e2;
                case 40: goto L_0x0536;
                case 41: goto L_0x0542;
                case 42: goto L_0x00aa;
                case 43: goto L_0x00c9;
                case 44: goto L_0x055a;
                case 45: goto L_0x00f1;
                case 46: goto L_0x01ba;
                case 47: goto L_0x0562;
                case 48: goto L_0x01dd;
                case 49: goto L_0x01f7;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            r0.A7O()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r3 = r3.A00
            com.whatsapp.camera.overlays.AutofocusOverlay r3 = (com.whatsapp.camera.overlays.AutofocusOverlay) r3
            int r1 = r3.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x000e
            r3.setVisibility(r0)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x000e
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x0033:
            java.lang.Object r4 = r3.A00
            X.4kC r4 = (X.C91504kC) r4
            android.widget.ListView r0 = r4.A0I
            r2 = 0
            android.view.View r1 = r0.getChildAt(r2)
            if (r1 == 0) goto L_0x000e
            android.widget.ListView r0 = r4.A0I
            int r0 = r0.getFirstVisiblePosition()
            if (r0 != 0) goto L_0x000e
            int r0 = r1.getTop()
            int r1 = r4.A08
            if (r0 == r1) goto L_0x056a
            android.widget.ListView r0 = r4.A0I
            r0.setSelectionFromTop(r2, r1)
            android.widget.ListView r0 = r4.A0I
            r0.post(r3)
            return
        L_0x005b:
            java.lang.Object r2 = r3.A00
            X.4kJ r2 = (X.C91524kJ) r2
            X.3ZH r0 = r2.A02
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3ZH.A07(r0)
            if (r1 == 0) goto L_0x000e
            X.2fr r0 = r2.A0Q
            r0.A01(r1)
            return
        L_0x006d:
            java.lang.Object r4 = r3.A00
            X.4kJ r4 = (X.C91524kJ) r4
            r3 = 0
            X.1VX r2 = r4.A0S
            r1 = 1071(0x42f, float:1.501E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x000e
            X.5WX r1 = r4.A0Y
            r0 = 3
            r1.A00(r0, r3)
            return
        L_0x0085:
            java.lang.Object r5 = r3.A00
            com.whatsapp.community.CommunityExitDialogFragment r5 = (com.whatsapp.community.CommunityExitDialogFragment) r5
            android.content.Context r4 = r5.A1D()
            if (r4 == 0) goto L_0x000e
            X.3Lk r1 = r5.A06
            java.lang.String r0 = "3114626665494175"
            android.net.Uri r3 = r1.A03(r0)
            android.content.Intent r2 = X.C18310x6.A0D(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CommunityExitDialogFragment intent: "
            X.C18260x0.A1R(r1, r0, r3)
            X.5hX r0 = r5.A00
            r0.A0A(r4, r2)
            return
        L_0x00aa:
            java.lang.Object r3 = r3.A00
            X.11H r3 = (X.AnonymousClass11H) r3
            X.2so r2 = r3.A0O
            X.1fJ r1 = r3.A0s
            boolean r0 = r2.A0G(r1)
            if (r0 == 0) goto L_0x00bd
            X.4UC r0 = r3.A16
            r0.A0G(r1)
        L_0x00bd:
            boolean r0 = r2.A0D(r1)
            if (r0 == 0) goto L_0x000e
            X.4UC r0 = r3.A15
            r0.A0G(r1)
            return
        L_0x00c9:
            java.lang.Object r4 = r3.A00
            X.11H r4 = (X.AnonymousClass11H) r4
            X.1VX r2 = r4.A0g
            r1 = 6601(0x19c9, float:9.25E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x000e
            X.2so r0 = r4.A0O
            X.1fJ r3 = r4.A0s
            com.whatsapp.jid.GroupJid r2 = r0.A00(r3)
            X.1fJ r2 = (X.C27991fJ) r2
            if (r2 == 0) goto L_0x0582
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r1 = r4.A0S
            X.2WQ r0 = r4.A0q
            boolean r0 = r0.A00()
            r1.A05(r3, r2, r0)
            return
        L_0x00f1:
            java.lang.Object r9 = r3.A00
            X.11H r9 = (X.AnonymousClass11H) r9
            java.util.List r8 = r9.A1B
            r8.clear()
            java.util.List r4 = r9.A1A
            r4.clear()
            X.2lX r1 = r9.A0r
            X.3ZH r0 = r9.A04
            boolean r0 = r1.A00(r0)
            X.2so r2 = r9.A0O
            X.1fJ r6 = r9.A0s
            if (r0 == 0) goto L_0x015c
            X.2rM r0 = r2.A0H
            java.util.Set r0 = r0.A03(r6)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r11 = r0.iterator()
        L_0x011b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0154
            X.2mC r7 = X.AnonymousClass0x7.A0O(r11)
            X.2lX r10 = r2.A0J
            if (r7 == 0) goto L_0x0145
            int r3 = r7.A00
            r1 = 3
            r0 = 1
            if (r3 == r1) goto L_0x0131
            if (r3 != r0) goto L_0x0145
        L_0x0131:
            X.3Ex r1 = r10.A00
            com.whatsapp.jid.GroupJid r0 = r7.A02
            X.3ZH r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0145
            boolean r0 = r10.A00(r0)
            if (r0 == 0) goto L_0x0145
            r5.add(r7)
            goto L_0x011b
        L_0x0145:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CommunityChatManager/getTerminatedLinkedSubgroups - unexpected subgroup: "
            r1.append(r0)
            com.whatsapp.jid.GroupJid r0 = r7.A02
            X.C18270x1.A17(r0, r1)
            goto L_0x011b
        L_0x0154:
            java.util.List r0 = X.C73723fy.A0C(r5)
            r8.addAll(r0)
            goto L_0x0180
        L_0x015c:
            java.util.Set r0 = r2.A05(r6)
            java.util.List r0 = X.C73723fy.A0C(r0)
            r8.addAll(r0)
            X.2L1 r3 = r2.A0I
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            X.2rM r2 = r3.A01
            r1 = 5
            X.4KD r0 = new X.4KD
            r0.<init>(r3, r1)
            java.util.Set r0 = r2.A02(r0, r6)
            java.util.List r0 = X.C73723fy.A0C(r0)
            r4.addAll(r0)
        L_0x0180:
            r9.A0F()
            r9.A0E()
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x000e
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x000e
            r7 = 0
            r9.A0A = r7
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.Iterator r3 = r4.iterator()
        L_0x019b:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0588
            X.2mC r2 = X.AnonymousClass0x7.A0O(r3)
            X.3Ex r0 = r9.A0U
            com.whatsapp.jid.GroupJid r2 = r2.A02
            X.3ZH r0 = r0.A0A(r2)
            int r0 = r0.A06
            if (r0 <= 0) goto L_0x01b6
            java.lang.String r1 = java.lang.Integer.toString(r0)
        L_0x01b6:
            r5.put(r2, r1)
            goto L_0x019b
        L_0x01ba:
            java.lang.Object r3 = r3.A00
            X.11H r3 = (X.AnonymousClass11H) r3
            X.2rV r2 = r3.A0f
            X.1fJ r1 = r3.A0s
            r0 = 1
            X.34x r0 = r2.A02(r1, r0)
            if (r0 == 0) goto L_0x01d0
            boolean r0 = X.C627636p.A0n(r0)
            if (r0 == 0) goto L_0x01d0
            return
        L_0x01d0:
            X.2ss r0 = r3.A0a
            X.31A r2 = X.C56982ss.A00(r0, r1)
            r3.A03 = r2
            if (r2 == 0) goto L_0x000e
            monitor-enter(r2)
            goto L_0x0622
        L_0x01dd:
            java.lang.Object r3 = r3.A00
            X.11H r3 = (X.AnonymousClass11H) r3
            X.31A r0 = r3.A03
            if (r0 == 0) goto L_0x000e
            long r0 = r3.A01
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            X.3Lv r4 = r3.A0d
            X.1fJ r5 = r3.A0s
            long r6 = r4.A05(r5, r0)
            X.31A r2 = r3.A03
            monitor-enter(r2)
            goto L_0x062f
        L_0x01f7:
            java.lang.Object r4 = r3.A00
            X.11H r4 = (X.AnonymousClass11H) r4
            X.3Ex r1 = r4.A0U
            X.1fJ r0 = r4.A0s
            X.3ZH r3 = r1.A07(r0)
            r4.A04 = r3
            if (r3 == 0) goto L_0x0216
            X.4uZ r0 = r3.A0H
            boolean r0 = r0 instanceof X.C27991fJ
            if (r0 == 0) goto L_0x0216
            r2 = 1
            r1 = 0
            X.2Ls r0 = new X.2Ls
            r0.<init>(r1, r2)
            r3.A0J = r0
        L_0x0216:
            X.08M r1 = r4.A0F
            X.3ZH r0 = r4.A04
            r1.A0G(r0)
            X.3ZH r2 = r4.A04
            if (r2 == 0) goto L_0x000e
            X.08M r1 = r4.A0D
            X.5ZU r0 = r4.A0X
            java.lang.String r0 = r0.A0H(r2)
            r1.A0G(r0)
            return
        L_0x022d:
            java.lang.Object r0 = r3.A00
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            r0.forceLayout()
            android.view.View r0 = r0.getRootView()
            r0.requestLayout()
            return
        L_0x023f:
            java.lang.Object r0 = r3.A00
            X.6gD r0 = (X.C132906gD) r0
            r0.A09()
            return
        L_0x0247:
            java.lang.Object r0 = r3.A00
            X.0R6 r0 = (X.AnonymousClass0R6) r0
            r0.A05()
            return
        L_0x024f:
            java.lang.Object r1 = r3.A00
            com.whatsapp.camera.overlays.ShutterOverlay r1 = (com.whatsapp.camera.overlays.ShutterOverlay) r1
            r0 = 0
            r1.A02 = r0
            r1.invalidate()
            return
        L_0x025a:
            java.lang.Object r1 = r3.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0264:
            java.lang.Object r0 = r3.A00
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r0 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r0
            r0.A1M()
            return
        L_0x026c:
            java.lang.Object r4 = r3.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            X.2sM r1 = r4.A1L
            com.whatsapp.jid.UserJid r0 = r4.A7H()
            com.whatsapp.jid.PhoneUserJid r3 = X.C56662sM.A00(r1, r0)
            X.3Wi r2 = r4.A05
            r1 = 5
            goto L_0x045d
        L_0x027f:
            java.lang.Object r5 = r3.A00
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            X.3Ex r4 = r5.A0I
            com.whatsapp.jid.UserJid r3 = r5.A7H()
            X.1vC r9 = r4.A05
            X.3ZH r7 = r9.A0B(r3)
            if (r7 == 0) goto L_0x02fc
            java.lang.String r0 = r7.A0J()
            r7.A0b = r0
            r0 = 0
            r7.A0P = r0
            X.33M r6 = X.AnonymousClass33M.A00()
            X.4Fq r11 = X.C18630y0.A07(r9)     // Catch:{ IllegalArgumentException -> 0x02d6 }
            android.content.ContentValues r10 = X.C18290x4.A0E()     // Catch:{ all -> 0x02cc }
            java.lang.String r0 = "raw_contact_id"
            r10.putNull(r0)     // Catch:{ all -> 0x02cc }
            X.AnonymousClass3ZH.A0A(r10, r7)     // Catch:{ all -> 0x02cc }
            java.lang.String r1 = "wa_name"
            java.lang.String r0 = r7.A0b     // Catch:{ all -> 0x02cc }
            r10.put(r1, r0)     // Catch:{ all -> 0x02cc }
            java.lang.String r8 = "wa_contacts"
            java.lang.String r2 = "jid = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x02cc }
            X.4uZ r0 = r7.A0H     // Catch:{ all -> 0x02cc }
            X.C18280x3.A0v(r0, r1)     // Catch:{ all -> 0x02cc }
            X.AnonymousClass361.A07(r10, r11, r8, r2, r1)     // Catch:{ all -> 0x02cc }
            r11.close()     // Catch:{ IllegalArgumentException -> 0x02d6 }
            goto L_0x02e7
        L_0x02cc:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x02d1 }
            goto L_0x02d5
        L_0x02d1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x02d6 }
        L_0x02d5:
            throw r1     // Catch:{ IllegalArgumentException -> 0x02d6 }
        L_0x02d6:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact-mgr-db/unable to update contact "
            X.AnonymousClass3ZH.A0C(r7, r0, r1)
            java.lang.String r0 = r1.toString()
            X.C626936e.A08(r0, r2)
        L_0x02e7:
            java.lang.StringBuilder r1 = X.C28831hq.A00(r9, r7)
            java.lang.String r0 = "contact-mgr-db/updated contact jid="
            X.AnonymousClass3ZH.A0C(r7, r0, r1)
            java.lang.String r0 = " | time: "
            X.AnonymousClass33M.A04(r6, r0, r1)
            android.os.Handler r1 = r4.A01
            r0 = 41
            X.C70193a6.A00(r1, r4, r3, r0)
        L_0x02fc:
            X.3Cq r0 = r5.A18
            r0.A08()
            return
        L_0x0302:
            java.lang.Object r0 = r3.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            r0.A7R()
            android.os.Handler r2 = r0.A25
            long r0 = r0.A7G()
            r2.postDelayed(r3, r0)
            return
        L_0x0313:
            java.lang.Object r0 = r3.A00
            X.4IC r0 = (X.AnonymousClass4IC) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            r0.A7M()
            X.5XG r0 = r0.A0r
            r0.A00()
            return
        L_0x0324:
            java.lang.Object r0 = r3.A00
            X.4kC r0 = (X.C91504kC) r0
            android.widget.ListView r1 = r0.A0I
            r0 = 0
            r1.setSelectionFromTop(r0, r0)
            return
        L_0x032f:
            java.lang.Object r0 = r3.A00
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r0 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r0
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard.A01(r0)
            return
        L_0x0337:
            java.lang.Object r0 = r3.A00
            X.4kJ r0 = (X.C91524kJ) r0
            X.2iC r2 = r0.A0X
            X.4uZ r1 = r0.A0G
            X.21R r0 = X.AnonymousClass21R.CONTACT_INFO
            goto L_0x0490
        L_0x0343:
            java.lang.Object r1 = r3.A00
            com.whatsapp.chatlock.ChatLockAuthViewModel r1 = (com.whatsapp.chatlock.ChatLockAuthViewModel) r1
            X.2s7 r0 = r1.A07
            X.8OQ r0 = r0.A00()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0365
            X.5aW r0 = r1.A04
            X.2ss r0 = r0.A03
            java.util.HashSet r0 = r0.A03
            boolean r0 = X.AnonymousClass0x7.A1S(r0)
            if (r0 != 0) goto L_0x0365
            X.08M r1 = r1.A02
        L_0x0361:
            X.2wD r0 = X.C59022wD.A00
            goto L_0x0403
        L_0x0365:
            X.08M r1 = r1.A01
            goto L_0x0361
        L_0x0368:
            java.lang.Object r0 = r3.A00
            X.4d8 r0 = (X.C89524d8) r0
            r0.A78()
            return
        L_0x0370:
            java.lang.Object r9 = r3.A00
            X.54D r9 = (X.AnonymousClass54D) r9
            java.lang.Object r8 = r9.A00
            com.whatsapp.community.AddGroupsToCommunityActivity r8 = (com.whatsapp.community.AddGroupsToCommunityActivity) r8
            X.2sr r0 = r8.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
            if (r0 != 0) goto L_0x038c
            r10 = 0
        L_0x0381:
            X.3Wi r2 = r8.A05
            r1 = 19
            X.3cX r0 = new X.3cX
            r0.<init>((int) r1, (java.lang.Object) r9, (boolean) r10)
            goto L_0x0462
        L_0x038c:
            X.2sj r1 = r8.A0H
            X.2sr r0 = r8.A01
            com.whatsapp.jid.PhoneUserJid r7 = X.C56972sr.A04(r0)
            X.33h r1 = r1.A09
            X.3dV r0 = r1.A0A
            X.4GK r6 = r0.get()
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x03d9 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x03d9 }
            java.lang.String r4 = "SELECT * FROM group_participant_user WHERE (rank = ? OR rank = ?) AND user_jid_row_id = ? LIMIT 1"
            java.lang.String[] r3 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x03d9 }
            r10 = 1
            X.C18270x1.A1O(r3, r10)     // Catch:{ all -> 0x03d9 }
            r2 = 2
            X.C18280x3.A1Q(r3, r2, r10)     // Catch:{ all -> 0x03d9 }
            long r0 = r1.A05(r7)     // Catch:{ all -> 0x03d9 }
            X.AnonymousClass0x2.A1S(r3, r2, r0)     // Catch:{ all -> 0x03d9 }
            java.lang.String r0 = "GET_USER_IS_ADMIN_OF_AT_LEAST_ONE_GROUP_SQL"
            android.database.Cursor r2 = r5.A0E(r4, r0, r3)     // Catch:{ all -> 0x03d9 }
            if (r2 == 0) goto L_0x03c5
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x03cf }
            if (r0 == 0) goto L_0x03c5
            goto L_0x03c8
        L_0x03c5:
            r10 = 0
            if (r2 == 0) goto L_0x03cb
        L_0x03c8:
            r2.close()     // Catch:{ all -> 0x03d9 }
        L_0x03cb:
            r6.close()
            goto L_0x0381
        L_0x03cf:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x03d4 }
            goto L_0x03d8
        L_0x03d4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03d9 }
        L_0x03d8:
            throw r1     // Catch:{ all -> 0x03d9 }
        L_0x03d9:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x065f }
            throw r1
        L_0x03de:
            java.lang.Object r0 = r3.A00
            X.4IO r0 = (X.AnonymousClass4IO) r0
            java.lang.Object r0 = r0.A00
            X.4ea r0 = (X.C89654ea) r0
            r0.BjL()
            X.C18290x4.A18(r0)
            return
        L_0x03ed:
            java.lang.Object r1 = r3.A00
            X.0rw r1 = (X.C15790rw) r1
            r0 = 0
            r1.AwB(r0)
            return
        L_0x03f6:
            java.lang.Object r1 = r3.A00
            X.4VM r1 = (X.AnonymousClass4VM) r1
            X.4UC r0 = r1.A05
            X.AnonymousClass0x9.A1I(r0)
            X.4UC r1 = r1.A04
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x0403:
            r1.A0G(r0)
            return
        L_0x0407:
            java.lang.Object r0 = r3.A00
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            X.1R1 r1 = r0.A0r
            X.1fJ r0 = r0.A0o
            r1.A0N(r0)
            return
        L_0x0413:
            java.lang.Object r0 = r3.A00
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            X.11H r2 = r0.A0X
            r1 = 0
            X.1fJ r0 = r0.A0p
            r2.A0H(r0, r1)
            return
        L_0x0420:
            java.lang.Object r0 = r3.A00
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            X.11H r4 = r0.A0X
            X.3ZH r3 = r0.A0g
            X.107 r0 = r4.A0z
            X.AnonymousClass0x7.A18(r0)
            X.4FS r2 = r4.A17
            r1 = 44
            X.3cS r0 = new X.3cS
            r0.<init>(r4, r1, r3)
            r2.BkM(r0)
            return
        L_0x043a:
            java.lang.Object r0 = r3.A00
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            X.2so r2 = r0.A0R
            X.1fJ r1 = r0.A0p
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x0447:
            java.lang.Object r4 = r3.A00
            X.54D r4 = (X.AnonymousClass54D) r4
            java.lang.Object r2 = r4.A00
            com.whatsapp.community.CommunityHomeActivity r2 = (com.whatsapp.community.CommunityHomeActivity) r2
            X.1fJ r1 = r2.A0o
            if (r1 == 0) goto L_0x0466
            X.3Ex r0 = r2.A0Y
            X.3ZH r3 = r0.A0A(r1)
        L_0x0459:
            X.3Wi r2 = r2.A05
            r1 = 31
        L_0x045d:
            X.3cS r0 = new X.3cS
            r0.<init>(r4, r1, r3)
        L_0x0462:
            r2.A0S(r0)
            return
        L_0x0466:
            r3 = 0
            goto L_0x0459
        L_0x0468:
            java.lang.Object r2 = r3.A00
            com.whatsapp.community.CommunityNUXActivity r2 = (com.whatsapp.community.CommunityNUXActivity) r2
            X.2nM r1 = r2.A03
            java.lang.String r0 = "community-examples-article"
            r1.A01(r2, r0)
            return
        L_0x0474:
            java.lang.Object r2 = r3.A00
            com.whatsapp.community.CommunityNUXActivity r2 = (com.whatsapp.community.CommunityNUXActivity) r2
            X.3Lk r1 = r2.A06
            java.lang.String r0 = "625069579217642"
            android.net.Uri r0 = r1.A03(r0)
            X.AnonymousClass1Ha.A1w(r0, r2)
            return
        L_0x0484:
            java.lang.Object r0 = r3.A00
            X.4kj r0 = (X.C91694kj) r0
            com.whatsapp.community.CommunityNavigationActivity r0 = r0.A00
            X.2iC r2 = r0.A0c
            X.4uZ r1 = r0.A0a
            X.21R r0 = X.AnonymousClass21R.COMMUNITY_NAVIGATION
        L_0x0490:
            r2.A00(r1, r0)
            return
        L_0x0494:
            java.lang.Object r0 = r3.A00
            X.4X0 r0 = (X.AnonymousClass4X0) r0
            com.whatsapp.community.CommunitySubgroupsBottomSheet r5 = r0.A01
            X.1fJ r4 = r0.A00
            X.33U r1 = r5.A0E
            r0 = 4
            r1.A07(r4, r0)
            r5.A1K()
            X.3Ej r3 = r5.A0C
            android.content.Context r1 = r5.A1D()
            java.lang.Class<X.07r> r0 = X.C009707r.class
            android.app.Activity r2 = X.C111095hX.A03(r1, r0)
            X.03q r1 = r5.A0R()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
            r3.Bg5(r2, r0, r4)
            return
        L_0x04c0:
            java.lang.Object r0 = r3.A00
            X.4X0 r0 = (X.AnonymousClass4X0) r0
            com.whatsapp.community.CommunitySubgroupsBottomSheet r4 = r0.A01
            X.1fJ r3 = r0.A00
            X.33U r1 = r4.A0E
            r0 = 3
            r1.A07(r3, r0)
            r2 = 0
            X.03q r0 = r4.A0R()
            android.content.Intent r1 = X.C627736r.A0T(r0, r3)
            android.content.Context r0 = r4.A0G()
            X.AnonymousClass0RN.A00(r0, r1, r2)
            r4.A1K()
            return
        L_0x04e2:
            java.lang.Object r7 = r3.A00
            X.11H r7 = (X.AnonymousClass11H) r7
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = r7.A0S
            X.1fJ r1 = r7.A0s
            r6 = 0
            X.C162457s7.A0J(r1, r6)
            X.2is r0 = r0.A06
            X.1RI r0 = r0.A00
            X.4GK r5 = r0.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x052f }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x052f }
            java.lang.String r3 = "SELECT COUNT(DISTINCT group_jid)  as count FROM member_suggested_groups_v2 WHERE parent_group_jid = ?"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x052f }
            java.lang.String r0 = r1.getRawString()     // Catch:{ all -> 0x052f }
            r1 = 0
            r2[r6] = r0     // Catch:{ all -> 0x052f }
            java.lang.String r0 = "GET_DISTINCT_GROUP_SUGGESTIONS_BY_PARENT_GROUP_JID"
            android.database.Cursor r2 = r4.A0E(r3, r0, r2)     // Catch:{ all -> 0x052f }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0528 }
            if (r0 == 0) goto L_0x0518
            int r1 = X.AnonymousClass0x2.A03(r2)     // Catch:{ all -> 0x0528 }
        L_0x0518:
            r2.close()     // Catch:{ all -> 0x052f }
            r5.close()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.A05 = r0
            r7.A0E()
            return
        L_0x0528:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x052a }
        L_0x052a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x052f }
            throw r0     // Catch:{ all -> 0x052f }
        L_0x052f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0531 }
        L_0x0531:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r5, r0)
            throw r1
        L_0x0536:
            java.lang.Object r2 = r3.A00
            X.11H r2 = (X.AnonymousClass11H) r2
            X.3dI r1 = r2.A12
            r0 = 47
            A00(r1, r2, r0)
            return
        L_0x0542:
            java.lang.Object r0 = r3.A00
            X.11H r0 = (X.AnonymousClass11H) r0
            X.2UY r1 = r0.A0p
            X.2qk r2 = r0.A0J
            X.31C r6 = r0.A0t
            X.3Lq r4 = r0.A0h
            X.1fJ r5 = r0.A0s
            r7 = 0
            X.3Ev r3 = new X.3Ev
            r3.<init>(r0)
            r1.A00(r2, r3, r4, r5, r6, r7)
            return
        L_0x055a:
            java.lang.Object r0 = r3.A00
            X.11H r0 = (X.AnonymousClass11H) r0
            r0.A0F()
            goto L_0x0566
        L_0x0562:
            java.lang.Object r0 = r3.A00
            X.11H r0 = (X.AnonymousClass11H) r0
        L_0x0566:
            r0.A0E()
            return
        L_0x056a:
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = X.C111095hX.A02(r0)
            X.03q r0 = (X.C003203q) r0
            r0.A5V()
            android.widget.ListView r1 = r4.A0I
            X.3A7 r0 = new X.3A7
            r0.<init>(r3)
            r1.setOnScrollListener(r0)
            return
        L_0x0582:
            java.lang.String r0 = "CommunitySubgroupsViewModel/fetchSubgroupSuggestions/failed to find hint group"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0588:
            X.1VX r2 = r9.A0g
            X.31C r0 = r9.A0t
            X.2vN r4 = new X.2vN
            r4.<init>(r2, r0)
            X.2FH r3 = new X.2FH
            r3.<init>(r9)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x05a6
            java.lang.Object r0 = r8.get(r7)
            X.2mC r0 = (X.C52882mC) r0
            com.whatsapp.jid.GroupJid r1 = r0.A02
            X.1fJ r1 = (X.C27991fJ) r1
        L_0x05a6:
            X.C162457s7.A0J(r6, r7)
            X.31C r12 = r4.A01
            java.lang.String r15 = r12.A03()
            int r0 = r5.size()
            java.util.ArrayList r9 = X.AnonymousClass002.A0I(r0)
            java.util.Iterator r11 = X.AnonymousClass001.A0u(r5)
        L_0x05bb:
            boolean r0 = r11.hasNext()
            r8 = 0
            if (r0 == 0) goto L_0x05f2
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r11)
            java.lang.Object r10 = r0.getKey()
            X.1fJ r10 = (X.C27991fJ) r10
            java.lang.String r2 = X.AnonymousClass0x9.A12(r0)
            if (r2 == 0) goto L_0x05d9
            r0 = 13
            X.1wm r8 = new X.1wm
            r8.<init>((java.lang.String) r2, (int) r0)
        L_0x05d9:
            X.1we r7 = new X.1we
            r7.<init>()
            X.1wd r5 = new X.1wd
            r5.<init>()
            r0 = 1
            X.1wn r2 = new X.1wn
            r2.<init>(r10, r0)
            X.1wZ r0 = new X.1wZ
            r0.<init>(r8, r2, r5, r7)
            r9.add(r0)
            goto L_0x05bb
        L_0x05f2:
            if (r1 == 0) goto L_0x05fb
            r0 = 14
            X.1wm r8 = new X.1wm
            r8.<init>((X.C27991fJ) r1, (int) r0)
        L_0x05fb:
            X.1wm r2 = new X.1wm
            r2.<init>((X.C35381wm) r8, (java.util.List) r9)
            r0 = 7
            X.1wm r1 = new X.1wm
            r1.<init>((java.lang.String) r15, (int) r0)
            X.1ww r0 = new X.1ww
            r0.<init>(r6, r1)
            X.1xK r1 = new X.1xK
            r1.<init>((X.C35381wm) r2, (X.C35481ww) r0)
            r16 = 375(0x177, float:5.25E-43)
            X.36K r14 = X.C41032Ir.A05(r1)
            r0 = 0
            X.939 r13 = new X.939
            r13.<init>(r4, r3, r1, r0)
            long r17 = X.C58512vN.A02
            r12.A0D(r13, r14, r15, r16, r17)
            return
        L_0x0622:
            long r0 = r2.A0J     // Catch:{ all -> 0x0664 }
            monitor-exit(r2)
            r3.A01 = r0
            X.2so r1 = r3.A0O
            X.31A r0 = r3.A03
            r1.A07(r0)
            return
        L_0x062f:
            long r8 = r2.A0N     // Catch:{ all -> 0x0664 }
            monitor-exit(r2)
            long r10 = java.lang.System.currentTimeMillis()
            android.database.Cursor r4 = r4.A07(r5, r6, r8, r10)
            if (r4 != 0) goto L_0x063d
            return
        L_0x063d:
            boolean r2 = r4.moveToNext()     // Catch:{ all -> 0x065a }
            if (r2 == 0) goto L_0x064d
            X.2qz r2 = r3.A0w     // Catch:{ all -> 0x065a }
            X.34x r2 = r2.A04(r4, r5)     // Catch:{ all -> 0x065a }
            r3.A0I(r2, r0)     // Catch:{ all -> 0x065a }
            goto L_0x063d
        L_0x064d:
            r4.close()
            X.2qz r2 = r3.A0w
            X.34x r2 = X.C55122pp.A00(r2, r8)
            r3.A0I(r2, r0)
            return
        L_0x065a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x065f }
            throw r1
        L_0x065f:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0664:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71553cI.run():void");
    }

    public C71553cI(ContactInfoActivity contactInfoActivity, int i) {
        this.A01 = i;
        switch (i) {
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 14:
                this.A00 = contactInfoActivity;
                return;
            default:
                this.A00 = contactInfoActivity;
                return;
        }
    }

    public C71553cI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
