package X;

import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.comments.MessageCommentsManager;

/* renamed from: X.3cS  reason: invalid class name and case insensitive filesystem */
public class C71653cS implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C71653cS(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0352, code lost:
        X.C71553cI.A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0355, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04fb, code lost:
        X.C380725l.A00(X.C72553du.A00, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0500, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x054e, code lost:
        X.C69253Wh.A01(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0551, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x059b, code lost:
        X.C162457s7.A0J(r4, 0);
        r3 = r1.A07;
        r2 = r1.A0K;
        r3 = (X.C64623Eg) r3;
        r3.A09.A03(r2, r4, true);
        r5 = r3.A00;
        r4 = new X.C71653cS(r3, 38, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05b4, code lost:
        r5.A0S(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0627, code lost:
        if (r9 != false) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0815, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0819, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x081d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0820, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        X.AnonymousClass2A8.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0825, code lost:
        X.AnonymousClass2A8.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0828, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        r0.A0G(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a0, code lost:
        r3.BjL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a7, code lost:
        if (r3.BHW() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a9, code lost:
        com.whatsapp.util.Log.i("AddGroupsToCommunityActivity/finishAndNavigateToCommunity");
        r3.A05.A01.A0A(r3, X.C627736r.A0Z(r3, r1, false));
        X.C18290x4.A18(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bd, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0638 A[LOOP:10: B:262:0x0632->B:264:0x0638, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0648  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r5 = r19
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x03a9;
                case 1: goto L_0x03c7;
                case 2: goto L_0x0013;
                case 3: goto L_0x03e8;
                case 4: goto L_0x03f4;
                case 5: goto L_0x0408;
                case 6: goto L_0x0027;
                case 7: goto L_0x004b;
                case 8: goto L_0x0064;
                case 9: goto L_0x007d;
                case 10: goto L_0x0096;
                case 11: goto L_0x00af;
                case 12: goto L_0x044e;
                case 13: goto L_0x00cb;
                case 14: goto L_0x0104;
                case 15: goto L_0x045a;
                case 16: goto L_0x04a9;
                case 17: goto L_0x04de;
                case 18: goto L_0x04ed;
                case 19: goto L_0x0158;
                case 20: goto L_0x0501;
                case 21: goto L_0x0552;
                case 22: goto L_0x017f;
                case 23: goto L_0x0194;
                case 24: goto L_0x01be;
                case 25: goto L_0x0566;
                case 26: goto L_0x01be;
                case 27: goto L_0x01dc;
                case 28: goto L_0x0213;
                case 29: goto L_0x0570;
                case 30: goto L_0x0591;
                case 31: goto L_0x023d;
                case 32: goto L_0x057e;
                case 33: goto L_0x05b8;
                case 34: goto L_0x0007;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x0007;
                case 38: goto L_0x0688;
                case 39: goto L_0x0688;
                case 40: goto L_0x0698;
                case 41: goto L_0x06a8;
                case 42: goto L_0x06a8;
                case 43: goto L_0x02bf;
                case 44: goto L_0x06ba;
                case 45: goto L_0x02dc;
                case 46: goto L_0x0301;
                case 47: goto L_0x031a;
                case 48: goto L_0x036f;
                case 49: goto L_0x06dd;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r5.A00
            X.4X5 r1 = (X.AnonymousClass4X5) r1
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            r1.A0K(r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r2 = r5.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.Object r1 = r5.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.2sM r0 = r2.A1L
            com.whatsapp.jid.PhoneUserJid r0 = X.C56662sM.A00(r0, r1)
            if (r0 == 0) goto L_0x0012
            r2.A7T(r0)
            return
        L_0x0027:
            java.lang.Object r4 = r5.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r4 = (com.whatsapp.chatinfo.ListChatInfoActivity) r4
            java.lang.Object r3 = r5.A01
            X.1fL r3 = (X.C28011fL) r3
            X.1VX r2 = r4.A0D
            r1 = 1071(0x42f, float:1.501E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0012
            X.2sj r0 = r4.A0O
            boolean r0 = r0.A0F(r3)
            if (r0 != 0) goto L_0x0012
            X.5WX r2 = r4.A0a
            r1 = 5
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x004b:
            java.lang.Object r2 = r5.A00
            X.1u3 r2 = (X.C33991u3) r2
            java.lang.Object r3 = r5.A01
            java.lang.ref.WeakReference r0 = r2.A0B
            java.lang.Object r1 = r0.get()
            X.10p r1 = (X.AnonymousClass10p) r1
            if (r1 == 0) goto L_0x0012
            boolean r0 = X.C18320x8.A1T(r2)
            if (r0 != 0) goto L_0x0012
            X.08M r0 = r1.A08
            goto L_0x00c7
        L_0x0064:
            java.lang.Object r2 = r5.A00
            X.1u3 r2 = (X.C33991u3) r2
            java.lang.Object r3 = r5.A01
            java.lang.ref.WeakReference r0 = r2.A0B
            java.lang.Object r1 = r0.get()
            X.10p r1 = (X.AnonymousClass10p) r1
            if (r1 == 0) goto L_0x0012
            boolean r0 = X.C18320x8.A1T(r2)
            if (r0 != 0) goto L_0x0012
            X.08M r0 = r1.A0C
            goto L_0x00c7
        L_0x007d:
            java.lang.Object r2 = r5.A00
            X.1NT r2 = (X.AnonymousClass1NT) r2
            java.lang.Object r3 = r5.A01
            java.lang.ref.WeakReference r0 = r2.A08
            java.lang.Object r1 = r0.get()
            X.4kJ r1 = (X.C91524kJ) r1
            if (r1 == 0) goto L_0x0012
            boolean r0 = X.C18320x8.A1T(r2)
            if (r0 != 0) goto L_0x0012
            X.08M r0 = r1.A0H
            goto L_0x00c7
        L_0x0096:
            java.lang.Object r2 = r5.A00
            X.1NT r2 = (X.AnonymousClass1NT) r2
            java.lang.Object r3 = r5.A01
            java.lang.ref.WeakReference r0 = r2.A08
            java.lang.Object r1 = r0.get()
            X.4kJ r1 = (X.C91524kJ) r1
            if (r1 == 0) goto L_0x0012
            boolean r0 = X.C18320x8.A1T(r2)
            if (r0 != 0) goto L_0x0012
            X.08M r0 = r1.A0D
            goto L_0x00c7
        L_0x00af:
            java.lang.Object r2 = r5.A00
            X.1NT r2 = (X.AnonymousClass1NT) r2
            java.lang.Object r3 = r5.A01
            java.lang.ref.WeakReference r0 = r2.A08
            java.lang.Object r1 = r0.get()
            X.4kJ r1 = (X.C91524kJ) r1
            if (r1 == 0) goto L_0x0012
            boolean r0 = X.C18320x8.A1T(r2)
            if (r0 != 0) goto L_0x0012
            X.08M r0 = r1.A0F
        L_0x00c7:
            r0.A0G(r3)
            return
        L_0x00cb:
            java.lang.Object r4 = r5.A00
            X.2cR r4 = (X.C46932cR) r4
            java.lang.Object r3 = r5.A01
            X.2FE r3 = (X.AnonymousClass2FE) r3
            X.3Lk r1 = r4.A05
            java.lang.String r0 = "764072925284841"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.5hX r1 = r4.A00
            X.2oU r0 = r4.A03
            android.content.Context r0 = r0.A00
            r1.A0A(r0, r2)
            if (r3 == 0) goto L_0x0012
            com.whatsapp.chatlock.dialogs.ChatLockQuickAddHelperBottomSheet r0 = r3.A00
            X.5UK r4 = r0.A03
            if (r4 == 0) goto L_0x06ed
            X.4uZ r3 = r0.A05
            int r0 = r0.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r0 = 13
            r4.A04(r3, r2, r1, r0)
            return
        L_0x0104:
            java.lang.Object r4 = r5.A00
            X.5aW r4 = (X.C106995aW) r4
            java.lang.Object r1 = r5.A01
            X.5AS r1 = (X.AnonymousClass5AS) r1
            boolean r0 = r1 instanceof X.C91574kO
            if (r0 == 0) goto L_0x0139
            X.4kO r1 = (X.C91574kO) r1
            java.util.Collection r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0118:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0012
            X.4uZ r2 = X.C18300x5.A0P(r3)
            X.2ss r1 = r4.A03
            r0 = 0
            X.31A r1 = r1.A0A(r2, r0)
            if (r1 == 0) goto L_0x0118
            r1.A0i = r0
            X.8qC r0 = r4.A0B
            java.lang.Object r0 = r0.get()
            X.2sm r0 = (X.C56922sm) r0
            r0.A05(r1)
            goto L_0x0118
        L_0x0139:
            boolean r0 = r1 instanceof X.C91564kN
            if (r0 == 0) goto L_0x0012
            X.2ss r2 = r4.A03
            X.4kN r1 = (X.C91564kN) r1
            X.4uZ r1 = r1.A00
            r0 = 0
            X.31A r1 = r2.A0A(r1, r0)
            if (r1 == 0) goto L_0x0012
            r1.A0i = r0
            X.8qC r0 = r4.A0B
            java.lang.Object r0 = r0.get()
            X.2sm r0 = (X.C56922sm) r0
            r0.A05(r1)
            return
        L_0x0158:
            java.lang.Object r4 = r5.A00
            X.34x r4 = (X.C624134x) r4
            java.lang.Object r3 = r5.A01
            X.3Gj r3 = (X.C65143Gj) r3
            X.2pu r0 = r4.A0t()
            if (r0 == 0) goto L_0x0012
            java.lang.Long r0 = r0.A03()
            if (r0 == 0) goto L_0x0012
            long r1 = r0.longValue()
            X.2qz r0 = r3.A02
            X.34x r11 = X.C55122pp.A00(r0, r1)
            if (r11 == 0) goto L_0x0012
            X.2Xf r10 = r3.A00
            boolean r0 = r4 instanceof X.C30441mS
            monitor-enter(r10)
            goto L_0x06f4
        L_0x017f:
            java.lang.Object r0 = r5.A00
            X.4IC r0 = (X.AnonymousClass4IC) r0
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Object r3 = r0.A00
            com.whatsapp.community.AddGroupsToCommunityActivity r3 = (com.whatsapp.community.AddGroupsToCommunityActivity) r3
            X.2ss r0 = r3.A0F
            boolean r0 = r0.A0L(r1)
            if (r0 != 0) goto L_0x01a0
            return
        L_0x0194:
            java.lang.Object r0 = r5.A00
            X.4IO r0 = (X.AnonymousClass4IO) r0
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Object r3 = r0.A00
            com.whatsapp.community.AddGroupsToCommunityActivity r3 = (com.whatsapp.community.AddGroupsToCommunityActivity) r3
        L_0x01a0:
            r3.BjL()
            boolean r0 = r3.BHW()
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "AddGroupsToCommunityActivity/finishAndNavigateToCommunity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ej r2 = r3.A05
            r0 = 0
            android.content.Intent r1 = X.C627736r.A0Z(r3, r1, r0)
            X.5hX r0 = r2.A01
            r0.A0A(r3, r1)
            X.C18290x4.A18(r3)
            return
        L_0x01be:
            java.lang.Object r0 = r5.A00
            X.2so r0 = (X.C56942so) r0
            java.lang.Object r2 = r5.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.1ie r0 = r0.A0G
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x01cc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r1.next()
            X.2rg r0 = (X.C56252rg) r0
            r0.A00(r2)
            goto L_0x01cc
        L_0x01dc:
            java.lang.Object r0 = r5.A00
            X.2so r0 = (X.C56942so) r0
            java.lang.Object r1 = r5.A01
            X.31A r1 = (X.AnonymousClass31A) r1
            X.1ie r0 = r0.A0G
            monitor-enter(r1)
            monitor-exit(r1)
            java.util.Iterator r3 = X.C61102zi.A03(r0)
        L_0x01ec:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r2 = r3.next()
            X.2rg r2 = (X.C56252rg) r2
            boolean r0 = r2 instanceof X.AnonymousClass4HJ
            if (r0 == 0) goto L_0x01ec
            X.4HJ r2 = (X.AnonymousClass4HJ) r2
            int r0 = r2.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x01ec
            java.lang.Object r0 = r2.A00
            X.11B r0 = (X.AnonymousClass11B) r0
            X.3dI r1 = r0.A0N
            r0 = 3
            X.3bu r0 = X.C71313bu.A00(r2, r0)
            r1.execute(r0)
            goto L_0x01ec
        L_0x0213:
            java.lang.Object r0 = r5.A00
            com.whatsapp.community.CommunityExitDialogFragment r0 = (com.whatsapp.community.CommunityExitDialogFragment) r0
            java.lang.Object r4 = r5.A01
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            X.2Zn r3 = r0.A05
            X.1VX r2 = r3.A01
            r1 = 5245(0x147d, float:7.35E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0012
            java.util.Iterator r1 = r4.iterator()
        L_0x022d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r1.next()
            X.1fJ r0 = (X.C27991fJ) r0
            r3.A00(r0)
            goto L_0x022d
        L_0x023d:
            java.lang.Object r0 = r5.A00
            X.54D r0 = (X.AnonymousClass54D) r0
            java.lang.Object r1 = r5.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            java.lang.Object r5 = r0.A00
            com.whatsapp.community.CommunityHomeActivity r5 = (com.whatsapp.community.CommunityHomeActivity) r5
            X.2cS r0 = r5.A0T
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x026c
            if (r1 == 0) goto L_0x026c
            int r0 = r1.A04
            boolean r0 = X.AnonymousClass001.A1T(r0)
            if (r0 != 0) goto L_0x026c
            X.0zH r1 = X.AnonymousClass5V0.A00(r5)
            r0 = 2131891245(0x7f12142d, float:1.9417205E38)
            X.C19340zH.A01(r5, r1, r0)
            X.C19340zH.A02(r5, r1)
            r1.A0S()
            return
        L_0x026c:
            X.1fJ r2 = r5.A0o
            if (r2 == 0) goto L_0x0012
            X.10x r0 = r5.A0i
            if (r0 == 0) goto L_0x0012
            X.3Lq r1 = r5.A0k
            X.3Ex r0 = r1.A0F
            X.3ZH r0 = r0.A09(r2)
            if (r0 != 0) goto L_0x02b6
            r4 = 0
        L_0x027f:
            X.10x r0 = r5.A0i
            X.107 r0 = r0.A0M
            java.lang.Object r0 = r0.A07()
            int r0 = X.AnonymousClass001.A0K(r0)
            r13 = 1
            int r0 = r0 - r13
            if (r0 >= r4) goto L_0x0831
            X.2ci r0 = r5.A0c
            r0.A00()
            X.0df r4 = r5.getSupportFragmentManager()
            X.1fJ r6 = r5.A0o
            X.1fJ r7 = r5.A0p
            java.util.List r8 = java.util.Collections.emptyList()
            r0 = 0
            X.4Jz r9 = new X.4Jz
            r9.<init>(r0)
            X.4Jv r10 = new X.4Jv
            r10.<init>(r5, r0)
            r0 = 2
            X.AnonymousClass0x2.A1A(r6, r0, r8)
            r11 = 17
            r12 = 6
            X.AnonymousClass27C.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x02b6:
            X.2sj r0 = r1.A0b
            int r0 = r0.A02(r2)
            int r4 = r0 + -1
            goto L_0x027f
        L_0x02bf:
            java.lang.Object r2 = r5.A00
            X.11H r2 = (X.AnonymousClass11H) r2
            java.lang.Object r1 = r5.A01
            java.util.List r0 = r2.A1B
            boolean r0 = r0.remove(r1)
            if (r0 != 0) goto L_0x02d5
            java.util.List r0 = r2.A1A
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L_0x0012
        L_0x02d5:
            r2.A0F()
            r2.A0E()
            return
        L_0x02dc:
            java.lang.Object r3 = r5.A00
            X.11H r3 = (X.AnonymousClass11H) r3
            java.lang.Object r2 = r5.A01
            java.util.List r0 = r3.A1A
            java.util.Iterator r1 = r0.iterator()
        L_0x02e8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            X.2mC r0 = X.AnonymousClass0x7.A0O(r1)
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02e8
            r1.remove()
            r3.A0E()
            return
        L_0x0301:
            java.lang.Object r0 = r5.A00
            X.4H9 r0 = (X.AnonymousClass4H9) r0
            java.lang.Object r1 = r5.A01
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r0.A00
            X.11H r2 = (X.AnonymousClass11H) r2
            X.1fJ r0 = r2.A0s
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            X.3dI r1 = r2.A12
            r0 = 49
            goto L_0x0352
        L_0x031a:
            java.lang.Object r0 = r5.A00
            X.4Hx r0 = (X.C85864Hx) r0
            java.lang.Object r3 = r5.A01
            java.lang.Object r2 = r0.A00
            X.11H r2 = (X.AnonymousClass11H) r2
            X.1fJ r0 = r2.A0s
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0336
            X.3dI r1 = r2.A12
            r0 = 49
            X.C71553cI.A00(r1, r2, r0)
            r2.A0E()
        L_0x0336:
            java.util.List r0 = r2.A1B
            java.util.Iterator r1 = r0.iterator()
        L_0x033c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0356
            X.2mC r0 = X.AnonymousClass0x7.A0O(r1)
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x033c
        L_0x034e:
            X.3dI r1 = r2.A12
            r0 = 45
        L_0x0352:
            X.C71553cI.A00(r1, r2, r0)
            return
        L_0x0356:
            java.util.List r0 = r2.A1A
            java.util.Iterator r1 = r0.iterator()
        L_0x035c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            X.2mC r0 = X.AnonymousClass0x7.A0O(r1)
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x035c
            goto L_0x034e
        L_0x036f:
            java.lang.Object r0 = r5.A00
            X.4Jc r0 = (X.C86174Jc) r0
            java.lang.Object r2 = r5.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r4 = r0.A00
            X.11B r4 = (X.AnonymousClass11B) r4
            java.util.Map r0 = r4.A0T
            java.lang.Object r1 = r0.get(r2)
            if (r1 == 0) goto L_0x0012
            X.2ss r0 = r4.A09
            r3 = 0
            X.31A r2 = r0.A0A(r2, r3)
            java.util.Map r0 = r4.A0S
            java.util.List r1 = X.C18320x8.A0s(r1, r0)
            if (r2 == 0) goto L_0x0012
            if (r1 == 0) goto L_0x0012
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0012
            java.lang.Object r0 = r1.get(r3)
            if (r0 == r2) goto L_0x0012
            java.util.Comparator r0 = r4.A0R
            java.util.Collections.sort(r1, r0)
            r4.A0F(r3)
            return
        L_0x03a9:
            java.lang.Object r3 = r5.A00
            X.11K r3 = (X.AnonymousClass11K) r3
            java.lang.Object r2 = r5.A01
            X.1fH r2 = (X.C27981fH) r2
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            X.311 r0 = r3.A01
            java.lang.Boolean r1 = r0.A01(r2)
            if (r1 != 0) goto L_0x03c1
            r0.A04(r2)
            return
        L_0x03c1:
            X.08M r0 = r3.A00
            r0.A0G(r1)
            return
        L_0x03c7:
            java.lang.Object r3 = r5.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            java.lang.Object r2 = r5.A01
            X.4uZ r2 = (X.C95814uZ) r2
            X.2sM r0 = r3.A1L
            com.whatsapp.jid.PhoneUserJid r1 = X.C56662sM.A00(r0, r2)
            X.3Wi r5 = r3.A05
            if (r1 == 0) goto L_0x03e1
            r0 = 3
            X.3cS r4 = new X.3cS
            r4.<init>(r3, r0, r1)
            goto L_0x05b4
        L_0x03e1:
            X.3cS r4 = new X.3cS
            r4.<init>((com.whatsapp.chatinfo.ContactInfoActivity) r3, (X.C95814uZ) r2)
            goto L_0x05b4
        L_0x03e8:
            java.lang.Object r1 = r5.A00
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            java.lang.Object r0 = r5.A01
            X.4uZ r0 = (X.C95814uZ) r0
            r1.A7S(r0)
            return
        L_0x03f4:
            java.lang.Object r0 = r5.A00
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            java.lang.Object r3 = r5.A01
            X.4uZ r3 = (X.C95814uZ) r3
            X.5Xw r2 = r0.A1q
            X.0df r1 = r0.getSupportFragmentManager()
            X.3ZH r0 = r0.A1K
            r2.A07(r1, r0, r3)
            return
        L_0x0408:
            java.lang.Object r7 = r5.A00
            com.whatsapp.chatinfo.ContactInfoActivity r7 = (com.whatsapp.chatinfo.ContactInfoActivity) r7
            java.lang.Object r6 = r5.A01
            X.4uZ r6 = (X.C95814uZ) r6
            android.content.Intent r5 = X.C18320x8.A07()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.contact.contactform.ContactFormActivity"
            r5.setClassName(r1, r0)
            X.3ZH r4 = r7.A1K
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            X.4uZ r2 = r4.A0H
            if (r2 == 0) goto L_0x0447
            if (r6 == 0) goto L_0x0432
            java.lang.String r1 = "contact_data_phone"
            java.lang.String r0 = X.AnonymousClass36P.A03(r6)
            r3.putString(r1, r0)
        L_0x0432:
            java.lang.String r1 = "contact_data_lid"
            java.lang.String r0 = r2.user
            r3.putString(r1, r0)
            java.lang.String r1 = "contact_data_first_name"
            java.lang.String r0 = r4.A0R
            r3.putString(r1, r0)
            java.lang.String r1 = "contact_data_last_name"
            java.lang.String r0 = r4.A0Q
            r3.putString(r1, r0)
        L_0x0447:
            r5.putExtras(r3)
            r7.startActivity(r5)
            return
        L_0x044e:
            java.lang.Object r1 = r5.A00
            X.5Tu r1 = (X.C105155Tu) r1
            java.lang.Object r0 = r5.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            r1.A01(r0)
            return
        L_0x045a:
            java.lang.Object r0 = r5.A00
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r7 = r5.A01
            X.5aW r7 = (X.C106995aW) r7
            r6 = 0
            r5 = 1
            java.util.Iterator r4 = r0.iterator()
        L_0x0468:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x049d
            java.lang.Object r3 = r4.next()
            X.31A r3 = (X.AnonymousClass31A) r3
            X.4C1 r0 = r7.A0G
            java.lang.Object r2 = r0.get()
            X.3Lv r2 = (X.C66543Lv) r2
            X.4uZ r1 = r3.A05()
            r0 = 0
            r2.A0Q(r1, r0, r6, r5)
            r3.A0j = r6
            X.8qC r0 = r7.A0B
            java.lang.Object r0 = r0.get()
            X.2sm r0 = (X.C56922sm) r0
            r0.A05(r3)
            X.2ss r0 = r7.A03
            X.4uZ r1 = r3.A05()
            java.util.HashSet r0 = r0.A03
            r0.remove(r1)
            goto L_0x0468
        L_0x049d:
            X.8qC r0 = r7.A0C
            java.lang.Object r0 = r0.get()
            X.1hw r0 = (X.C28891hw) r0
            r0.A08()
            return
        L_0x04a9:
            java.lang.Object r3 = r5.A00
            com.whatsapp.chatlock.dialogs.ChatLockQuickAddHelperBottomSheet r3 = (com.whatsapp.chatlock.dialogs.ChatLockQuickAddHelperBottomSheet) r3
            java.lang.Object r2 = r5.A01
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            X.2s7 r0 = r3.A04
            if (r0 == 0) goto L_0x04d7
            X.8OQ r0 = r0.A00()
            int r0 = r0.size()
            r1 = 8
            if (r0 <= 0) goto L_0x04c4
            r1 = 0
        L_0x04c4:
            X.3Wh r4 = r3.A06
            if (r4 == 0) goto L_0x04d0
            r0 = 20
            X.5sM r3 = new X.5sM
            r3.<init>((java.lang.Object) r2, (int) r1, (int) r0)
            goto L_0x054e
        L_0x04d0:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04d7:
            java.lang.String r0 = "deviceManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04de:
            java.lang.Object r2 = r5.A00
            com.whatsapp.comments.MessageCommentsManager r2 = (com.whatsapp.comments.MessageCommentsManager) r2
            java.lang.Object r1 = r5.A01
            X.34x r1 = (X.C624134x) r1
            r0 = 0
            com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessageAsync$1$1 r3 = new com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessageAsync$1$1
            r3.<init>(r2, r1, r0, r0)
            goto L_0x04fb
        L_0x04ed:
            java.lang.Object r2 = r5.A00
            com.whatsapp.comments.MessageCommentsManager r2 = (com.whatsapp.comments.MessageCommentsManager) r2
            java.lang.Object r1 = r5.A01
            X.34x r1 = (X.C624134x) r1
            r0 = 0
            com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1 r3 = new com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1
            r3.<init>(r2, r1, r0, r0)
        L_0x04fb:
            X.3du r0 = X.C72553du.A00
            X.C380725l.A00(r0, r3)
            return
        L_0x0501:
            java.lang.Object r0 = r5.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r5 = r5.A01
            X.3Gj r5 = (X.C65143Gj) r5
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r0.iterator()
        L_0x0511:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x053d
            X.34x r1 = X.C18300x5.A0T(r3)
            boolean r0 = X.C624134x.A0g(r1)
            if (r0 == 0) goto L_0x0511
            X.2pu r0 = r1.A0t()
            if (r0 == 0) goto L_0x0511
            java.lang.Long r0 = r0.A03()
            if (r0 == 0) goto L_0x0511
            long r1 = r0.longValue()
            X.2qz r0 = r5.A02
            X.34x r0 = X.C55122pp.A00(r0, r1)
            if (r0 == 0) goto L_0x0511
            r4.add(r0)
            goto L_0x0511
        L_0x053d:
            java.util.Set r0 = X.C73723fy.A0O(r4)
            java.util.List r1 = X.C73723fy.A0F(r0)
            X.3Wh r4 = r5.A03
            r0 = 21
            X.3cS r3 = new X.3cS
            r3.<init>(r5, r0, r1)
        L_0x054e:
            X.C69253Wh.A01(r4, r3)
            return
        L_0x0552:
            java.lang.Object r1 = r5.A00
            X.3Gj r1 = (X.C65143Gj) r1
            java.lang.Object r2 = r5.A01
            java.util.Collection r2 = (java.util.Collection) r2
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            X.1io r1 = r1.A01
            r0 = 39
            r1.A0E(r2, r0)
            return
        L_0x0566:
            java.lang.Object r1 = r5.A00
            X.0rw r1 = (X.C15790rw) r1
            java.lang.Object r0 = r5.A01
            r1.AwB(r0)
            return
        L_0x0570:
            java.lang.Object r0 = r5.A00
            com.whatsapp.community.CommunityFragment r0 = (com.whatsapp.community.CommunityFragment) r0
            java.lang.Object r1 = r5.A01
            java.util.List r1 = (java.util.List) r1
            X.4XG r0 = r0.A0B
            r0.A0N(r1)
            return
        L_0x057e:
            java.lang.Object r0 = r5.A00
            X.4Rw r0 = (X.AnonymousClass4Rw) r0
            java.lang.Object r4 = r5.A01
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            com.whatsapp.community.CommunityMembersViewModel r1 = r0.A01
            if (r1 != 0) goto L_0x059b
            java.lang.String r0 = "communityMembersViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0591:
            java.lang.Object r0 = r5.A00
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            java.lang.Object r4 = r5.A01
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            com.whatsapp.community.CommunityMembersViewModel r1 = r0.A0V
        L_0x059b:
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.4Cd r3 = r1.A07
            X.1fJ r2 = r1.A0K
            X.3Eg r3 = (X.C64623Eg) r3
            r1 = 1
            X.2k1 r0 = r3.A09
            r0.A03(r2, r4, r1)
            X.3Wi r5 = r3.A00
            r0 = 38
            X.3cS r4 = new X.3cS
            r4.<init>(r3, r0, r2)
        L_0x05b4:
            r5.A0S(r4)
            return
        L_0x05b8:
            java.lang.Object r4 = r5.A00
            X.4X5 r4 = (X.AnonymousClass4X5) r4
            java.lang.Object r5 = r5.A01
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            X.5QZ r0 = r4.A00
            if (r0 == 0) goto L_0x0617
            int r1 = r0.A01
            r0 = 1
            if (r1 == r0) goto L_0x05d0
            r0 = 2
            if (r1 != r0) goto L_0x0617
        L_0x05d0:
            r9 = 1
        L_0x05d1:
            com.whatsapp.jid.GroupJid r8 = r4.A0L
            if (r8 == 0) goto L_0x0627
            int r1 = r5.size()
            X.33h r0 = r4.A0J
            int r0 = r0.A03(r8)
            if (r9 == 0) goto L_0x062e
            if (r1 <= r0) goto L_0x0619
            X.2Vj r7 = r4.A05
            boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x0619
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r5.iterator()
        L_0x05f3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0657
            java.lang.Object r2 = r3.next()
            X.5QZ r2 = (X.AnonymousClass5QZ) r2
            X.2sj r0 = r4.A0I
            com.whatsapp.jid.UserJid r1 = r2.A04
            X.33k r0 = X.C56892sj.A01(r0, r8)
            X.2zG r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x05f3
            r1 = 2
            X.5PX r0 = new X.5PX
            r0.<init>(r1, r2)
            r6.add(r0)
            goto L_0x05f3
        L_0x0617:
            r9 = 0
            goto L_0x05d1
        L_0x0619:
            X.2Vj r0 = r4.A05
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0629
            X.5PX r0 = r4.A07
            r6.add(r0)
            goto L_0x0629
        L_0x0627:
            if (r9 == 0) goto L_0x062e
        L_0x0629:
            X.5PX r0 = r4.A08
            r6.add(r0)
        L_0x062e:
            java.util.Iterator r3 = r5.iterator()
        L_0x0632:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0646
            java.lang.Object r2 = r3.next()
            r1 = 2
            X.5PX r0 = new X.5PX
            r0.<init>(r1, r2)
            r6.add(r0)
            goto L_0x0632
        L_0x0646:
            if (r9 != 0) goto L_0x064d
            X.5PX r0 = r4.A09
            r6.add(r0)
        L_0x064d:
            X.3Wi r2 = r4.A01
            r0 = 37
            X.3cS r1 = new X.3cS
            r1.<init>(r4, r0, r6)
            goto L_0x0684
        L_0x0657:
            java.util.ArrayList r3 = X.AnonymousClass002.A0J(r6)
            int r1 = r6.size()
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x066a
            X.5PX r0 = r4.A0B
            r3.add(r0)
        L_0x066a:
            boolean r0 = r7.A00()
            r1 = 0
            if (r0 == 0) goto L_0x0676
            X.5PX r0 = r4.A07
            r3.add(r1, r0)
        L_0x0676:
            X.5PX r0 = r4.A08
            r3.add(r1, r0)
            X.3Wi r2 = r4.A01
            r0 = 34
            X.3cS r1 = new X.3cS
            r1.<init>(r4, r0, r3)
        L_0x0684:
            r2.A0S(r1)
            return
        L_0x0688:
            java.lang.Object r1 = r5.A00
            X.3Eg r1 = (X.C64623Eg) r1
            java.lang.Object r0 = r5.A01
            X.1iV r1 = r1.A0B
            java.util.Set r0 = X.C18290x4.A13(r0)
            r1.A08(r0)
            return
        L_0x0698:
            java.lang.Object r0 = r5.A00
            X.3Ej r0 = (X.C64653Ej) r0
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.2so r0 = r0.A03
            X.1fJ r1 = (X.C27991fJ) r1
            r0.A09(r1)
            return
        L_0x06a8:
            java.lang.Object r3 = r5.A00
            com.whatsapp.community.CommunitySubgroupsBottomSheet r3 = (com.whatsapp.community.CommunitySubgroupsBottomSheet) r3
            java.lang.Object r2 = r5.A01
            X.1fJ r2 = (X.C27991fJ) r2
            X.33U r1 = r3.A0E
            r0 = 2
            r1.A07(r2, r0)
            r3.A1K()
            return
        L_0x06ba:
            java.lang.Object r1 = r5.A00
            X.11H r1 = (X.AnonymousClass11H) r1
            java.lang.Object r6 = r5.A01
            X.3ZH r6 = (X.AnonymousClass3ZH) r6
            java.lang.String r9 = r1.A06
            r0 = 0
            X.2t8 r8 = new X.2t8
            r8.<init>(r1, r0)
            X.2sH r4 = r1.A0Y
            X.3Wi r2 = r1.A0L
            X.2sr r3 = r1.A0M
            X.3Lr r7 = r1.A0m
            X.1hw r5 = r1.A0c
            X.C34031u7.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            X.107 r0 = r1.A0z
            X.AnonymousClass0x9.A1I(r0)
            return
        L_0x06dd:
            java.lang.Object r0 = r5.A00
            X.4HJ r0 = (X.AnonymousClass4HJ) r0
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Object r0 = r0.A00
            X.11B r0 = (X.AnonymousClass11B) r0
            X.AnonymousClass11B.A00(r0, r1)
            return
        L_0x06ed:
            java.lang.String r0 = "chatLockLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06f4:
            java.lang.String r17 = r10.A00(r11)     // Catch:{ all -> 0x082e }
            if (r0 == 0) goto L_0x0714
            X.20V r2 = X.AnonymousClass20V.COMMENTS_DAILY_DELETES_COUNT     // Catch:{ all -> 0x082e }
        L_0x06fc:
            X.2pu r0 = r11.A0t()     // Catch:{ all -> 0x082e }
            r9 = 0
            if (r0 == 0) goto L_0x0712
            int r0 = r0.A01()     // Catch:{ all -> 0x082e }
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x082e }
        L_0x070b:
            X.2z0 r12 = r11.A1J     // Catch:{ all -> 0x082e }
            boolean r0 = r12.A02     // Catch:{ all -> 0x082e }
            if (r0 == 0) goto L_0x082c
            goto L_0x0717
        L_0x0712:
            r1 = r9
            goto L_0x070b
        L_0x0714:
            X.20V r2 = X.AnonymousClass20V.COMMENTS_DAILY_COUNT     // Catch:{ all -> 0x082e }
            goto L_0x06fc
        L_0x0717:
            if (r1 == 0) goto L_0x082c
            X.2G0 r8 = r10.A01     // Catch:{ all -> 0x082e }
            long r4 = r1.longValue()     // Catch:{ all -> 0x082e }
            monitor-enter(r8)     // Catch:{ all -> 0x082e }
            r0 = 0
            r14 = 1
            int r7 = X.C18320x8.A02(r2, r14)     // Catch:{ all -> 0x0829 }
            if (r7 == r0) goto L_0x0733
            java.lang.String r15 = "comment_deletes"
        L_0x072a:
            X.1RF r0 = r8.A00     // Catch:{ all -> 0x0829 }
            r18 = r0
            X.4Fq r2 = r18.A0C()     // Catch:{ all -> 0x0829 }
            goto L_0x0736
        L_0x0733:
            java.lang.String r15 = "comments"
            goto L_0x072a
        L_0x0736:
            X.3Yo r3 = r2.Axl()     // Catch:{ all -> 0x081e }
            java.lang.String r6 = "comments_event_logging"
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0817 }
            X.2sg r13 = r0.A03     // Catch:{ all -> 0x0817 }
            boolean r0 = X.C626235v.A04(r13, r6)     // Catch:{ all -> 0x0817 }
            r0 = r0 ^ 1
            r16 = 0
            if (r0 != 0) goto L_0x0757
            java.lang.String r0 = "CommentsDailyActionLoggingStore/incrementCount: table does not exist"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0817 }
            r3.close()     // Catch:{ all -> 0x081e }
            r2.close()     // Catch:{ all -> 0x0829 }
            goto L_0x0796
        L_0x0757:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0817 }
            java.lang.String r0 = "\n          UPDATE comments_event_logging \n            SET \n              "
            r1.append(r0)     // Catch:{ all -> 0x0817 }
            X.C18300x5.A1O(r1, r15)     // Catch:{ all -> 0x0817 }
            r1.append(r15)     // Catch:{ all -> 0x0817 }
            java.lang.String r0 = " + ?, \n              accumulated_comments = ? \n            WHERE\n              comment_space_id = ?\n        "
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0817 }
            java.lang.String r0 = "update_comment_action"
            X.2sQ r13 = r13.A0G(r1, r0)     // Catch:{ all -> 0x0817 }
            long r0 = (long) r14     // Catch:{ all -> 0x0817 }
            r13.A06(r14, r0)     // Catch:{ all -> 0x0817 }
            r0 = 2
            r13.A06(r0, r4)     // Catch:{ all -> 0x0817 }
            r1 = 3
            r0 = r17
            r13.A07(r1, r0)     // Catch:{ all -> 0x0817 }
            int r0 = r13.A00()     // Catch:{ all -> 0x0817 }
            r3.A00()     // Catch:{ all -> 0x0817 }
            if (r0 == 0) goto L_0x078c
            r16 = 1
        L_0x078c:
            r3.close()     // Catch:{ all -> 0x081e }
            r2.close()     // Catch:{ all -> 0x0829 }
            monitor-exit(r8)     // Catch:{ all -> 0x082e }
            if (r16 != 0) goto L_0x082c
            goto L_0x0797
        L_0x0796:
            monitor-exit(r8)     // Catch:{ all -> 0x082e }
        L_0x0797:
            X.4uZ r3 = r12.A00     // Catch:{ all -> 0x082e }
            if (r3 == 0) goto L_0x07b6
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x082e }
            if (r2 == 0) goto L_0x07b6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x082e }
            r0 = 64
            r1.append(r0)     // Catch:{ all -> 0x082e }
            java.lang.String r0 = r3.getServer()     // Catch:{ all -> 0x082e }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x082e }
            java.lang.String r9 = X.C175728Zm.A0K(r0, r2)     // Catch:{ all -> 0x082e }
        L_0x07b6:
            X.1fJ r3 = (X.C27991fJ) r3     // Catch:{ all -> 0x082e }
            if (r3 == 0) goto L_0x07d0
            X.33h r0 = r10.A00     // Catch:{ all -> 0x082e }
            int r0 = r0.A03(r3)     // Catch:{ all -> 0x082e }
        L_0x07c0:
            int r12 = X.AnonymousClass36M.A04(r0)     // Catch:{ all -> 0x082e }
            long r2 = r11.A0K     // Catch:{ all -> 0x082e }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r2 % r0
            long r0 = X.C18280x3.A08(r2, r0)     // Catch:{ all -> 0x082e }
            goto L_0x07d2
        L_0x07d0:
            r0 = 0
            goto L_0x07c0
        L_0x07d2:
            if (r9 == 0) goto L_0x082c
            java.lang.String r14 = r10.A00(r11)     // Catch:{ all -> 0x082e }
            monitor-enter(r8)     // Catch:{ all -> 0x082e }
            r2 = 0
            r11 = 1
            if (r7 == r2) goto L_0x07e0
            java.lang.String r13 = "comment_deletes"
            goto L_0x07e2
        L_0x07e0:
            java.lang.String r13 = "comments"
        L_0x07e2:
            X.4Fq r3 = r18.A0C()     // Catch:{ all -> 0x0829 }
            r2 = 7
            android.content.ContentValues r7 = X.AnonymousClass0x9.A07(r2)     // Catch:{ all -> 0x0813 }
            java.lang.String r2 = "comment_space_id"
            r7.put(r2, r14)     // Catch:{ all -> 0x0813 }
            java.lang.String r2 = "comment_parent_group_id"
            r7.put(r2, r9)     // Catch:{ all -> 0x0813 }
            java.lang.String r2 = "group_size_bucket"
            X.C18270x1.A0b(r7, r2, r12)     // Catch:{ all -> 0x0813 }
            java.lang.String r2 = "cag_message_sent_ds"
            X.C18270x1.A0c(r7, r2, r0)     // Catch:{ all -> 0x0813 }
            java.lang.String r0 = "accumulated_comments"
            X.C18270x1.A0c(r7, r0, r4)     // Catch:{ all -> 0x0813 }
            X.2sg r1 = X.AnonymousClass3H0.A01(r7, r3, r13, r11)     // Catch:{ all -> 0x0813 }
            java.lang.String r0 = "update_comment_action"
            r1.A08(r6, r0, r7)     // Catch:{ all -> 0x0813 }
            r3.close()     // Catch:{ all -> 0x0829 }
            monitor-exit(r8)     // Catch:{ all -> 0x082e }
            goto L_0x082c
        L_0x0813:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0815 }
        L_0x0815:
            r1 = move-exception
            goto L_0x0825
        L_0x0817:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0819 }
        L_0x0819:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x081e }
            throw r0     // Catch:{ all -> 0x081e }
        L_0x081e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0820 }
        L_0x0820:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r2, r0)     // Catch:{ all -> 0x0829 }
            goto L_0x0828
        L_0x0825:
            X.AnonymousClass2A8.A00(r3, r0)     // Catch:{ all -> 0x0829 }
        L_0x0828:
            throw r1     // Catch:{ all -> 0x0829 }
        L_0x0829:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x082e }
            throw r0     // Catch:{ all -> 0x082e }
        L_0x082c:
            monitor-exit(r10)
            return
        L_0x082e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0831:
            X.0zH r3 = X.AnonymousClass5V0.A00(r5)
            r0 = 2131886406(0x7f120146, float:1.940739E38)
            r3.A0U(r0)
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131755048(0x7f100028, float:1.9140964E38)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            X.C18270x1.A1Q(r0, r4)
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)
            r3.A0g(r0)
            X.C19340zH.A02(r5, r3)
            X.C18280x3.A0q(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71653cS.run():void");
    }

    public C71653cS(MessageCommentsManager messageCommentsManager, C624134x r3) {
        this.A02 = 17;
        this.A00 = messageCommentsManager;
        this.A01 = r3;
    }

    public C71653cS(ContactInfoActivity contactInfoActivity, C95814uZ r3) {
        this.A02 = 4;
        this.A00 = contactInfoActivity;
        this.A01 = r3;
    }

    public C71653cS(MessageCommentsManager messageCommentsManager, C624134x r3, AnonymousClass4GR r4, int i) {
        this.A02 = 18;
        this.A00 = messageCommentsManager;
        this.A01 = r3;
    }
}
