package X;

import android.net.ConnectivityManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3cX  reason: invalid class name and case insensitive filesystem */
public class C71703cX implements Runnable {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C71703cX(C619933b r2, int i, boolean z) {
        this.A02 = i;
        if (47 - i != 0) {
            this.A00 = r2;
            this.A01 = z;
            return;
        }
        this.A00 = r2;
        this.A01 = true;
    }

    public static void A00(C71703cX r3) {
        AnonymousClass35O r2 = (AnonymousClass35O) r3.A00;
        ConnectivityManager.NetworkCallback networkCallback = r2.A00;
        if (networkCallback == null) {
            Log.i("voip/weak-wifi/onUnavailable: network callback is already unregistered");
            return;
        }
        r2.A04.unregisterNetworkCallback(networkCallback);
        r2.A00 = null;
        r2.A01 = null;
        Voip.notifyFailureToCreateAlternativeSocket(r3.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0345, code lost:
        r1.BlE(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0348, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03de, code lost:
        if (r24 != false) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x052b, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x052e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06f8, code lost:
        r0 = X.AnonymousClass001.A08(r1 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x07d2, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x07d3, code lost:
        if (r1 != false) goto L_0x07d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07d5, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07d7, code lost:
        r4.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x07da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x08ba, code lost:
        r2.A05(r1, "MessageNotification1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x08bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x08fe, code lost:
        r2.A0S(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0901, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:430:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r48 = this;
            r3 = r48
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0058;
                case 2: goto L_0x052f;
                case 3: goto L_0x0074;
                case 4: goto L_0x053b;
                case 5: goto L_0x055d;
                case 6: goto L_0x007e;
                case 7: goto L_0x009f;
                case 8: goto L_0x0567;
                case 9: goto L_0x0582;
                case 10: goto L_0x059f;
                case 11: goto L_0x08c0;
                case 12: goto L_0x05a9;
                case 13: goto L_0x05b6;
                case 14: goto L_0x05cc;
                case 15: goto L_0x05dc;
                case 16: goto L_0x05e6;
                case 17: goto L_0x019d;
                case 18: goto L_0x05f7;
                case 19: goto L_0x0608;
                case 20: goto L_0x01b9;
                case 21: goto L_0x0696;
                case 22: goto L_0x06b4;
                case 23: goto L_0x06bd;
                case 24: goto L_0x06f0;
                case 25: goto L_0x0204;
                case 26: goto L_0x06a0;
                case 27: goto L_0x06fe;
                case 28: goto L_0x071f;
                case 29: goto L_0x0213;
                case 30: goto L_0x074a;
                case 31: goto L_0x0011;
                case 32: goto L_0x0766;
                case 33: goto L_0x0786;
                case 34: goto L_0x07a9;
                case 35: goto L_0x02f6;
                case 36: goto L_0x032f;
                case 37: goto L_0x07b0;
                case 38: goto L_0x07c5;
                case 39: goto L_0x08ef;
                case 40: goto L_0x07db;
                case 41: goto L_0x0349;
                case 42: goto L_0x07e5;
                case 43: goto L_0x07f3;
                case 44: goto L_0x081a;
                case 45: goto L_0x04c0;
                case 46: goto L_0x0824;
                case 47: goto L_0x086f;
                case 48: goto L_0x0893;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r3.A00
            X.3XI r1 = (X.AnonymousClass3XI) r1
            boolean r0 = r3.A01
            X.AnonymousClass3XI.A00(r1, r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r3.A00
            X.1IL r0 = (X.AnonymousClass1IL) r0
            boolean r1 = r3.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = r0.A04
            android.widget.ImageView r0 = r0.A0D
            android.view.animation.Animation r2 = r0.getAnimation()
            boolean r0 = r2 instanceof X.AnonymousClass4OG
            if (r0 != 0) goto L_0x0758
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversations-gdrive-observer/set-message/unexpected-animation-class: "
            r1.append(r0)
            if (r2 != 0) goto L_0x0037
            java.lang.String r0 = "null"
        L_0x0031:
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            goto L_0x052b
        L_0x0037:
            java.lang.Class r0 = r2.getClass()
            goto L_0x0031
        L_0x003c:
            java.lang.Object r0 = r3.A00
            X.85C r0 = (X.AnonymousClass85C) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0046:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r1 = r2.next()
            X.8vW r1 = (X.C186538vW) r1
            boolean r0 = r3.A01
            r1.Bcu(r0)
            goto L_0x0046
        L_0x0058:
            java.lang.Object r0 = r3.A00
            X.85C r0 = (X.AnonymousClass85C) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0062:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r1 = r2.next()
            X.8vW r1 = (X.C186538vW) r1
            boolean r0 = r3.A01
            r1.BVD(r0)
            goto L_0x0062
        L_0x0074:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0010
            java.lang.Object r0 = r3.A00
            X.AnonymousClass0x9.A1K(r0)
            return
        L_0x007e:
            java.lang.Object r4 = r3.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            boolean r1 = r3.A01
            X.03q r0 = r4.A0Q()
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.C621433s.A03(r0)
            if (r0 != 0) goto L_0x0010
            r2 = 1
            if (r1 == 0) goto L_0x08c4
            r0 = 2
            r4.A00 = r0
            X.30e r0 = r4.A06
            r0.A05(r2)
            r4.A1W()
            return
        L_0x009f:
            java.lang.Object r5 = r3.A00
            com.whatsapp.avatar.home.AvatarHomeActivity r5 = (com.whatsapp.avatar.home.AvatarHomeActivity) r5
            boolean r6 = r3.A01
            com.whatsapp.components.MainChildCoordinatorLayout r0 = r5.A0H
            if (r0 != 0) goto L_0x00b0
            java.lang.String r0 = "coordinatorLayout"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00b0:
            int r3 = r0.getHeight()
            float r1 = (float) r3
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r4 = (int) r1
            android.widget.LinearLayout r2 = r5.A06
            if (r2 != 0) goto L_0x00c4
            java.lang.String r0 = "containerNewUser"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00c4:
            r1 = 0
            int r0 = r2.getMeasuredHeight()
            if (r0 != 0) goto L_0x00d2
            r2.measure(r1, r1)
            int r0 = r2.getMeasuredHeight()
        L_0x00d2:
            if (r6 == 0) goto L_0x00d7
            if (r0 <= 0) goto L_0x00d7
            r4 = r0
        L_0x00d7:
            int r1 = r3 - r4
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r0 = r5.A0G
            if (r0 == 0) goto L_0x00e0
            r0.A0R(r1)
        L_0x00e0:
            android.widget.LinearLayout r0 = r5.A05
            if (r0 != 0) goto L_0x00eb
            java.lang.String r0 = "containerAvatarSheet"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00eb:
            int r0 = r0.getHeight()
            int r3 = r3 - r0
            android.view.View r0 = r5.A03
            java.lang.String r8 = "sheetPaddingView"
            if (r0 != 0) goto L_0x00fc
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x00fc:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x012c
            int r7 = r0.height
        L_0x0104:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 16843499(0x10102eb, float:2.3695652E-38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r6, r0)
            if (r0 == 0) goto L_0x0144
            int r1 = r6.data
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r5)
            int r2 = android.util.TypedValue.complexToDimensionPixelSize(r1, r0)
            android.widget.LinearLayout r0 = r5.A05
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = "containerAvatarSheet"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x012c:
            r7 = 0
            goto L_0x0104
        L_0x012e:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            com.whatsapp.components.MainChildCoordinatorLayout r0 = r5.A0H
            if (r0 != 0) goto L_0x013d
            java.lang.String r0 = "coordinatorLayout"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x013d:
            int r0 = r0.getHeight()
            int r0 = r0 - r2
            r1.height = r0
        L_0x0144:
            if (r3 <= r7) goto L_0x0157
            android.view.View r0 = r5.A03
            if (r0 != 0) goto L_0x014f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x014f:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x0157
            r0.height = r3
        L_0x0157:
            com.whatsapp.CircularProgressBar r0 = r5.A09
            java.lang.String r3 = "avatarLoadingProgressBar"
            if (r0 != 0) goto L_0x0162
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0162:
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x0175
            com.whatsapp.CircularProgressBar r1 = r5.A09
            if (r1 != 0) goto L_0x0171
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0171:
            r0 = 0
            r1.measure(r0, r0)
        L_0x0175:
            com.whatsapp.CircularProgressBar r0 = r5.A09
            if (r0 != 0) goto L_0x017e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x017e:
            int r2 = r0.getMeasuredHeight()
            com.whatsapp.CircularProgressBar r0 = r5.A09
            if (r0 != 0) goto L_0x018b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x018b:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x0010
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            if (r1 == 0) goto L_0x0010
            int r0 = r4 / 2
            int r0 = r0 - r2
            r1.topMargin = r0
            return
        L_0x019d:
            java.lang.Object r4 = r3.A00
            X.1u3 r4 = (X.C33991u3) r4
            boolean r2 = r3.A01
            java.lang.ref.WeakReference r0 = r4.A0B
            java.lang.Object r1 = r0.get()
            X.10p r1 = (X.AnonymousClass10p) r1
            if (r1 == 0) goto L_0x0010
            boolean r0 = X.C18320x8.A1T(r4)
            if (r0 != 0) goto L_0x0010
            X.08M r0 = r1.A09
            X.C06270Wx.A05(r0, r2)
            return
        L_0x01b9:
            java.lang.Object r2 = r3.A00
            X.1iA r2 = (X.C29031iA) r2
            boolean r1 = r3.A01
            X.1hy r0 = r2.A0M
            r0.A0B(r1)
            X.2oU r0 = r2.A0Z
            android.content.Context r5 = r0.A00
            X.33i r0 = r2.A0X
            android.app.ActivityManager r0 = r0.A06()
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0010
            java.lang.String r4 = r5.getPackageName()
            java.util.Iterator r3 = r0.iterator()
        L_0x01dc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0902
            java.lang.Object r2 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r1 = r2.importance
            r0 = 100
            if (r1 != r0) goto L_0x01dc
            java.lang.String r0 = r2.processName
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x01dc
            android.content.Intent r1 = X.C627736r.A03(r5)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r1.setFlags(r0)
            r5.startActivity(r0)
            goto L_0x01dc
        L_0x0204:
            java.lang.Object r2 = r3.A00
            X.7zV r2 = (X.C166937zV) r2
            boolean r1 = r3.A01
            r0 = 0
            r2.A02 = r0
            if (r1 != 0) goto L_0x0010
            r2.A00()
            return
        L_0x0213:
            java.lang.Object r6 = r3.A00
            X.4VQ r6 = (X.AnonymousClass4VQ) r6
            boolean r0 = r3.A01
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            r9 = 1
            if (r0 == 0) goto L_0x02f3
            X.3Lv r1 = r6.A0m
            X.4uZ r2 = r6.A0x
            boolean r0 = r2 instanceof X.C27981fH
            if (r0 == 0) goto L_0x02f3
            X.311 r1 = r1.A1j
            r0 = r2
            X.1fH r0 = (X.C27981fH) r0
            r1.A04(r0)
            java.lang.Boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x023c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x02f3
        L_0x023c:
            r8 = 1
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.util.Set r0 = X.C58112uj.A04
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x024a
            r9 = 0
        L_0x024a:
            X.3Lv r5 = r6.A0m
            X.4uZ r4 = r6.A0x
            X.3Ex r0 = r5.A0F
            X.3ZH r3 = r0.A07(r4)
            if (r3 == 0) goto L_0x029e
            boolean r0 = r3.A0R()
            if (r0 == 0) goto L_0x029e
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r3.A0I(r2)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x029e
            X.1Qq r0 = r5.A0M
            X.2e5 r0 = r0.A00(r1)
            boolean r0 = r0 instanceof X.C22891Qm
            if (r0 == 0) goto L_0x029e
            com.whatsapp.jid.Jid r1 = r3.A0I(r2)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x029e
            X.1k8 r0 = r5.A0N
            java.lang.Object r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x029e
            X.1VX r2 = r5.A1r
            r1 = 3909(0xf45, float:5.478E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x029e
            X.2sd r0 = r5.A2B
            long r2 = X.C56612sH.A06(r5)
            X.2z0 r1 = X.C56832sd.A00(r4, r0)
            X.1nc r0 = new X.1nc
            r0.<init>(r1, r2)
            r7.add(r0)
        L_0x029e:
            if (r8 == 0) goto L_0x02b2
            X.2sd r2 = r5.A2B
            long r0 = X.C56612sH.A06(r5)
            X.2z0 r3 = X.C56832sd.A00(r4, r2)
            X.1nj r2 = new X.1nj
            r2.<init>(r3, r0)
            r7.add(r2)
        L_0x02b2:
            if (r9 == 0) goto L_0x02e3
            X.2rR r0 = r6.A0v
            X.1nq r1 = r0.A04(r4)
            if (r1 == 0) goto L_0x02c4
            X.4UC r0 = r6.A1C
            X.AnonymousClass0x7.A18(r0)
            r7.add(r1)
        L_0x02c4:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0010
            java.util.Iterator r3 = r7.iterator()
        L_0x02ce:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0010
            X.34x r2 = X.C18300x5.A0T(r3)
            boolean r1 = r2.A1W
            r0 = -1
            if (r1 == 0) goto L_0x02df
            r0 = 22
        L_0x02df:
            r5.A0a(r2, r0)
            goto L_0x02ce
        L_0x02e3:
            X.2uj r2 = X.C58112uj.A01
            X.4GQ r1 = r6.A1L
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            monitor-enter(r2)
            java.util.List r0 = X.C58112uj.A02     // Catch:{ all -> 0x0907 }
            r0.add(r1)     // Catch:{ all -> 0x0907 }
            monitor-exit(r2)
            goto L_0x02c4
        L_0x02f3:
            r8 = 0
            goto L_0x024a
        L_0x02f6:
            java.lang.Object r4 = r3.A00
            X.3Mn r4 = (X.C66723Mn) r4
            boolean r3 = r3.A01
            if (r3 == 0) goto L_0x030b
            X.33p r0 = r4.A0D
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "wam_is_current_buffer_real_time"
            X.C18270x1.A0l(r1, r0, r2)
        L_0x030b:
            boolean r0 = r4.A0B()
            if (r0 == 0) goto L_0x031e
            X.8qC r0 = r4.A08
            java.lang.Object r1 = r0.get()
            X.4Ct r1 = (X.C84544Ct) r1
            X.2rX r0 = r4.A03
            r1.BlE(r0, r3)
        L_0x031e:
            boolean r0 = r4.A09()
            if (r0 == 0) goto L_0x0010
            X.8qC r0 = r4.A08
            java.lang.Object r1 = r0.get()
            X.4Ct r1 = (X.C84544Ct) r1
            X.2rX r0 = r4.A01
            goto L_0x0345
        L_0x032f:
            java.lang.Object r2 = r3.A00
            X.3Mn r2 = (X.C66723Mn) r2
            boolean r3 = r3.A01
            boolean r0 = r2.A0A()
            if (r0 == 0) goto L_0x0010
            X.8qC r0 = r2.A07
            java.lang.Object r1 = r0.get()
            X.4Ct r1 = (X.C84544Ct) r1
            X.2rX r0 = r2.A02
        L_0x0345:
            r1.BlE(r0, r3)
            return
        L_0x0349:
            java.lang.Object r2 = r3.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            boolean r11 = r3.A01
            java.util.List r0 = r2.B8s()
            boolean r3 = X.C627336j.A0N(r0)
            java.util.List r5 = r2.B8s()
            boolean r0 = r5.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x04bd
            int r1 = r5.size()
            r0 = 1
            if (r1 != r0) goto L_0x04bd
            java.lang.Object r0 = r5.get(r4)
            boolean r8 = r0 instanceof X.C135166kE
        L_0x036f:
            java.util.List r1 = r2.B8s()
            java.util.List r0 = r2.B8s()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04b9
            X.6kE r0 = X.C135166kE.A00
            boolean r24 = r1.contains(r0)
        L_0x0383:
            X.7rd r0 = r2.A0r
            X.7Yn r26 = r0.A0D(r8, r4, r3)
            X.7rd r0 = r2.A0r
            X.7Yn r36 = r0.A0C()
            if (r3 == 0) goto L_0x04b5
            X.38t r7 = X.C633138t.A0V
        L_0x0393:
            X.5Xq r10 = r2.A1n
            java.util.Collection r0 = r10.A01()
            java.util.Iterator r23 = r0.iterator()
            r22 = 0
        L_0x039f:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r5 = r23.next()
            X.5YF r5 = (X.AnonymousClass5YF) r5
            X.53q r0 = r2.A0o
            byte r1 = r0.A02(r5)
            r0 = 3
            if (r1 != r0) goto L_0x039f
            android.net.Uri r9 = r5.A0G
            X.5YF r0 = r10.A00(r9)
            java.io.File r1 = r0.A07()
            X.5YF r0 = r10.A00(r9)
            X.5Qm r0 = r0.A04()
            if (r0 != 0) goto L_0x03d7
            if (r1 == 0) goto L_0x039f
            X.5Qm r0 = new X.5Qm     // Catch:{ 6pi -> 0x03d0 }
            r0.<init>(r1)     // Catch:{ 6pi -> 0x03d0 }
            goto L_0x03da
        L_0x03d0:
            r1 = move-exception
            java.lang.String r0 = "MediaComposerActivity/estimateMaxOutputVideoSize"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x039f
        L_0x03d7:
            if (r1 != 0) goto L_0x03da
            goto L_0x039f
        L_0x03da:
            if (r8 != 0) goto L_0x03e0
            r46 = 0
            if (r24 == 0) goto L_0x03e2
        L_0x03e0:
            r46 = 1
        L_0x03e2:
            r21 = r22
            X.7rd r3 = r2.A0r
            long r12 = r0.A04
            r31 = 0
            r33 = 0
            boolean r35 = r3.A0I(r7, r1)
            r25 = r3
            r27 = r0
            r28 = r1
            r29 = r12
            r34 = r33
            long r44 = r25.A0A(r26, r27, r28, r29, r31, r33, r34, r35)
            r47 = r22 ^ 1
            r41 = r2
            r42 = r26
            r43 = r0
            android.util.Pair r3 = r41.A74(r42, r43, r44, r46, r47)
            java.lang.Object r4 = r3.first
            long r19 = X.C18310x6.A0B(r4)
            if (r22 != 0) goto L_0x0418
            java.lang.Object r3 = r3.second
            boolean r21 = X.AnonymousClass001.A1Z(r3)
        L_0x0418:
            X.2ld r3 = r2.A0s
            boolean r3 = r3.A00()
            if (r3 == 0) goto L_0x04b2
            X.7rd r3 = r2.A0r
            boolean r45 = r3.A0I(r7, r1)
            r44 = r33
            r35 = r3
            r37 = r0
            r38 = r1
            r39 = r12
            r41 = r31
            r43 = r33
            long r30 = r35.A0A(r36, r37, r38, r39, r41, r43, r44, r45)
            r27 = r2
            r28 = r36
            r29 = r0
            r32 = r46
            android.util.Pair r0 = r27.A74(r28, r29, r30, r32, r33)
            java.lang.Object r0 = r0.first
            long r17 = X.C18310x6.A0B(r0)
        L_0x044a:
            if (r11 == 0) goto L_0x04af
            r3 = r17
        L_0x044e:
            android.graphics.Point r0 = r5.A02()
            if (r0 == 0) goto L_0x04ac
            android.graphics.Point r0 = r5.A02()
            int r0 = r0.y
            long r0 = (long) r0
            android.graphics.Point r5 = r5.A02()
            int r5 = r5.x
            long r5 = (long) r5
            long r15 = r0 - r5
            if (r11 != 0) goto L_0x0468
            r19 = r17
        L_0x0468:
            int r14 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r14 > 0) goto L_0x0474
            int r14 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r14 != 0) goto L_0x04aa
            int r14 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r14 <= 0) goto L_0x04aa
        L_0x0474:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = java.lang.Math.max(r3, r0)
            long r0 = r0 + r5
            long r3 = java.lang.Math.min(r0, r12)
        L_0x047f:
            int r12 = (int) r5
            int r0 = (int) r3
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r12, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r21)
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r1, r0)
            if (r22 != 0) goto L_0x0496
            java.lang.Object r0 = r1.second
            boolean r22 = X.AnonymousClass001.A1Z(r0)
        L_0x0496:
            java.lang.Object r1 = r1.first
            android.graphics.Point r1 = (android.graphics.Point) r1
            int r0 = r1.x
            long r3 = (long) r0
            int r0 = r1.y
            long r0 = (long) r0
            r12 = r2
            r13 = r9
            r14 = r3
            r16 = r0
            r12.Bng(r13, r14, r16)
            goto L_0x039f
        L_0x04aa:
            r3 = r0
            goto L_0x047f
        L_0x04ac:
            r5 = 0
            goto L_0x047f
        L_0x04af:
            r3 = r19
            goto L_0x044e
        L_0x04b2:
            r17 = r19
            goto L_0x044a
        L_0x04b5:
            X.38t r7 = X.C633138t.A0g
            goto L_0x0393
        L_0x04b9:
            r24 = 0
            goto L_0x0383
        L_0x04bd:
            r8 = 0
            goto L_0x036f
        L_0x04c0:
            java.lang.Object r2 = r3.A00
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r2 = (com.whatsapp.migration.transfer.ui.ChatTransferViewModel) r2
            boolean r1 = r3.A01
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x04f9
            X.2iR r6 = r2.A0T
            boolean r2 = r2.A08
            r6.A00()
            X.3Lj r1 = r6.A0B
            r0 = 1
            r1.A03(r0)
            java.lang.String r0 = "fpm/ExportHelper/reconnectToServer()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 != 0) goto L_0x0010
            r0 = 12
            X.3Zo r5 = new X.3Zo
            r5.<init>(r6, r0)
            r0 = 0
            r4 = 0
            X.4FS r3 = r6.A0M
            X.2LT r2 = r6.A0K
            X.3R8 r1 = new X.3R8
            r1.<init>(r6, r5, r0, r4)
            X.3R9 r0 = new X.3R9
            r0.<init>(r1, r2, r3, r4)
            r0.A00()
            return
        L_0x04f9:
            X.2UI r2 = r2.A0U
            X.2j5 r0 = r2.A0C
            r0.A02()
            if (r1 == 0) goto L_0x0010
            X.2d4 r0 = r2.A05
            r0.A00()
            X.2q5 r0 = r2.A04
            r0.A03()
            X.3Dh r0 = r2.A01
            java.io.File r1 = r0.A0G()
            r0 = 0
            X.C627536m.A0G(r1, r0)
            java.lang.String[] r0 = r1.list()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.length
            if (r0 == 0) goto L_0x0010
            X.2qk r3 = r2.A00
            java.lang.String r2 = "cancelImport/could not delete media folder"
            r1 = 0
            java.lang.String r0 = "fpm/ImportHelper/"
            r3.A0A(r0, r1, r2)
            java.lang.String r0 = "fpm/ImportHelper/cleanUpAfterCancellation()/could not delete media folder"
        L_0x052b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x052f:
            java.lang.Object r0 = r3.A00
            X.7VZ r0 = (X.AnonymousClass7VZ) r0
            boolean r1 = r3.A01
            X.8uy r0 = r0.A01
            r0.Bbk(r1)
            return
        L_0x053b:
            java.lang.Object r0 = r3.A00
            X.33m r0 = (X.C621033m) r0
            boolean r3 = r3.A01
            X.3Wi r2 = r0.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to "
            r1.append(r0)
            if (r3 == 0) goto L_0x0559
            java.lang.String r0 = "Keep"
        L_0x0550:
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r0 = 0
            r2.A0P(r1, r0)
            return
        L_0x0559:
            java.lang.String r0 = "undo Keep"
            goto L_0x0550
        L_0x055d:
            java.lang.Object r1 = r3.A00
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity r1 = (com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity) r1
            boolean r0 = r3.A01
            r1.A5p(r0)
            return
        L_0x0567:
            java.lang.Object r2 = r3.A00
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r1 = r3.A01
            android.view.Window r0 = r2.getWindow()
            X.C107405bG.A0C(r0, r1)
            r1 = 2130969201(0x7f040271, float:1.7547077E38)
            r0 = 2131100302(0x7f06028e, float:1.7812982E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            X.C107405bG.A07(r2, r0)
            return
        L_0x0582:
            java.lang.Object r0 = r3.A00
            X.3SJ r0 = (X.AnonymousClass3SJ) r0
            boolean r5 = r3.A01
            X.2dT r1 = r0.A02
            if (r5 == 0) goto L_0x059c
            java.lang.String r2 = "avatar_creation"
        L_0x058e:
            r4 = 6
            r6 = 1
            X.44W r3 = X.AnonymousClass44W.A00
            r7 = r6
            r1.A00(r2, r3, r4, r5, r6, r7)
            X.2mU r0 = r0.A06
            r0.A02()
            return
        L_0x059c:
            java.lang.String r2 = "avatar_update"
            goto L_0x058e
        L_0x059f:
            java.lang.Object r1 = r3.A00
            X.35O r1 = (X.AnonymousClass35O) r1
            boolean r0 = r3.A01
            X.AnonymousClass35O.A02(r1, r0)
            return
        L_0x05a9:
            java.lang.Object r2 = r3.A00
            X.4Ql r2 = (X.AnonymousClass4Ql) r2
            boolean r1 = r3.A01
            r0 = 0
            r2.A06 = r0
            r2.A02(r1)
            return
        L_0x05b6:
            java.lang.Object r4 = r3.A00
            X.5b3 r4 = (X.C107285b3) r4
            boolean r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService/actionCreateCallLink isVideoCallLink:"
            X.C18260x0.A1E(r0, r1, r2)
            com.whatsapp.voipcalling.Voip.createCallLink(r2)
            r4.A0B()
            return
        L_0x05cc:
            boolean r1 = r3.A01
            java.lang.Object r0 = r3.A00
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            if (r1 == 0) goto L_0x05d8
            com.whatsapp.voipcalling.Voip.notifyDeviceIdentityDeleted(r0)
            return
        L_0x05d8:
            com.whatsapp.voipcalling.Voip.notifyDeviceIdentityChanged(r0)
            return
        L_0x05dc:
            java.lang.Object r1 = r3.A00
            X.5ZS r1 = (X.AnonymousClass5ZS) r1
            boolean r0 = r3.A01
            r1.A0O(r0)
            return
        L_0x05e6:
            java.lang.Object r0 = r3.A00
            X.68l r0 = (X.C1234468l) r0
            boolean r2 = r3.A01
            java.lang.Object r0 = r0.A00
            X.5ZS r0 = (X.AnonymousClass5ZS) r0
            X.5OK r1 = r0.A0H
            r0 = 0
            r1.A00(r2, r0)
            return
        L_0x05f7:
            java.lang.Object r2 = r3.A00
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r1 = r3.A01
            r0 = 2131428854(0x7f0b05f6, float:1.8479364E38)
            android.view.View r0 = X.C005205m.A00(r2, r0)
            r0.setEnabled(r1)
            return
        L_0x0608:
            java.lang.Object r0 = r3.A00
            X.54D r0 = (X.AnonymousClass54D) r0
            boolean r4 = r3.A01
            java.lang.Object r6 = r0.A00
            com.whatsapp.community.AddGroupsToCommunityActivity r6 = (com.whatsapp.community.AddGroupsToCommunityActivity) r6
            X.10d r0 = r6.A03
            X.107 r0 = r0.A07
            java.lang.Object r0 = r0.A07()
            java.util.Set r0 = (java.util.Set) r0
            int r3 = r0.size()
            X.2so r0 = r6.A04
            X.1VX r2 = r0.A0F
            r1 = 1990(0x7c6, float:2.789E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            int r5 = r0 + 1
            int r5 = r5 - r3
            if (r5 <= 0) goto L_0x0692
            if (r4 == 0) goto L_0x067e
            X.10d r0 = r6.A03
            X.107 r0 = r0.A08
            java.lang.Object r2 = r0.A07()
            java.util.Collection r2 = (java.util.Collection) r2
            r1 = 0
            X.4J9 r0 = new X.4J9
            r0.<init>(r1)
            java.util.Collection r4 = X.C161497pn.transform(r2, r0)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "extra_community_name"
            java.lang.String r3 = r1.getStringExtra(r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.LinkExistingGroups"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "max_groups_allowed_to_link"
            r2.putExtra(r0, r5)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0673
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r4)
            java.lang.String r0 = "selected"
            r2.putExtra(r0, r1)
        L_0x0673:
            java.lang.String r0 = "community_name"
            r2.putExtra(r0, r3)
            r0 = 10
            r6.BpY(r2, r0)
            return
        L_0x067e:
            r8 = 0
            r9 = 2131891201(0x7f121401, float:1.9417115E38)
            r10 = 2131888345(0x7f1208d9, float:1.9411323E38)
            r11 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 1
            X.4Hz r7 = new X.4Hz
            r7.<init>(r6, r0)
            r6.A6Y(r7, r8, r9, r10, r11)
            return
        L_0x0692:
            r6.A77()
            return
        L_0x0696:
            java.lang.Object r0 = r3.A00
            X.2Ts r0 = (X.C43852Ts) r0
            boolean r1 = r3.A01
            com.google.android.material.textfield.TextInputLayout r4 = r0.A05
            goto L_0x07d2
        L_0x06a0:
            java.lang.Object r2 = r3.A00
            X.4o9 r2 = (X.C93214o9) r2
            boolean r0 = r3.A01
            android.widget.FrameLayout r4 = r2.A0A
            if (r0 != 0) goto L_0x07d5
            r1 = 0
            r4.setVisibility(r1)
            android.widget.ImageView r0 = r2.A0B
            r0.setVisibility(r1)
            return
        L_0x06b4:
            java.lang.Object r0 = r3.A00
            X.2Ts r0 = (X.C43852Ts) r0
            boolean r1 = r3.A01
            android.widget.ImageView r4 = r0.A04
            goto L_0x06f8
        L_0x06bd:
            java.lang.Object r4 = r3.A00
            X.54F r4 = (X.AnonymousClass54F) r4
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x06e7
            java.lang.Object r3 = r4.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            X.33e r2 = r3.A1p
            int r1 = r2.A02()
            r0 = 1
            if (r1 != r0) goto L_0x06e7
            java.util.List r0 = r2.A07()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x06e7
            X.3Wi r2 = r3.A0a
            r0 = 13
        L_0x06e0:
            X.3Zj r1 = new X.3Zj
            r1.<init>(r4, r0)
            goto L_0x08fe
        L_0x06e7:
            java.lang.Object r0 = r4.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            X.3Wi r2 = r0.A0a
            r0 = 14
            goto L_0x06e0
        L_0x06f0:
            java.lang.Object r0 = r3.A00
            X.4mA r0 = (X.C92144mA) r0
            boolean r1 = r3.A01
            android.view.ViewStub r4 = r0.A02
        L_0x06f8:
            int r0 = X.AnonymousClass001.A08(r1)
            goto L_0x07d7
        L_0x06fe:
            java.lang.Object r4 = r3.A00
            com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment r4 = (com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment) r4
            boolean r0 = r3.A01
            X.3Lk r1 = r4.A05
            if (r0 == 0) goto L_0x071c
            java.lang.String r0 = "26000361"
        L_0x070a:
            android.net.Uri r0 = X.C66433Lk.A00(r1, r0)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            X.5hX r1 = r4.A00
            android.content.Context r0 = r4.A1D()
            r1.A0A(r0, r2)
            return
        L_0x071c:
            java.lang.String r0 = "28030014"
            goto L_0x070a
        L_0x071f:
            java.lang.Object r4 = r3.A00
            X.5l7 r4 = (X.C113245l7) r4
            boolean r0 = r3.A01
            X.4fS r3 = r4.A2a
            if (r0 == 0) goto L_0x073e
            android.widget.ImageButton r1 = r4.A0g
            r0 = 3
            r3.A0C(r1, r0)
        L_0x072f:
            com.whatsapp.KeyboardPopupLayout r3 = r4.A1a
            r0 = 21
            X.5sD r2 = new X.5sD
            r2.<init>((X.C113245l7) r4, (int) r0)
            r0 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x073e:
            X.4c6 r2 = r3.A02
            if (r2 == 0) goto L_0x072f
            X.4uZ r1 = r3.A0W
            com.whatsapp.community.ConversationCommunityViewModel r0 = r3.A0I
            r2.A0A(r0, r3, r1)
            goto L_0x072f
        L_0x074a:
            java.lang.Object r4 = r3.A00
            X.4UA r4 = (X.AnonymousClass4UA) r4
            boolean r2 = r3.A01
            X.33c r1 = r4.A0X
            X.3Ls r0 = r4.A01
            r1.A07(r0, r4, r2)
            return
        L_0x0758:
            X.4OG r2 = (X.AnonymousClass4OG) r2
            if (r1 == 0) goto L_0x0760
            r0 = 0
        L_0x075d:
            r2.A01 = r0
            return
        L_0x0760:
            r0 = 0
            r2.A00 = r0
            r0 = 1
            goto L_0x075d
        L_0x0766:
            java.lang.Object r1 = r3.A00
            X.1rM r1 = (X.C32631rM) r1
            boolean r4 = r3.A01
            java.lang.String r0 = "EmojiAndGifPopupWindow/downloadInitialPackAsync/successfully downloaded the first sticker pack/setPref"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.5RA r3 = r1.A00
            X.5LY r0 = r3.A06
            X.33p r0 = r0.A05
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "sticker_picker_initial_download"
            X.C18270x1.A0l(r1, r0, r2)
            r3.A00(r4)
            return
        L_0x0786:
            java.lang.Object r1 = r3.A00
            X.35r r1 = (X.C625835r) r1
            java.lang.String r0 = "MessageStoreBackup/backupdb/sb unlocker"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3dV r0 = r1.A0R     // Catch:{ SQLiteException -> 0x07a2 }
            r0.A05()     // Catch:{ SQLiteException -> 0x07a2 }
            X.0xz r0 = r0.A04     // Catch:{ SQLiteException -> 0x07a2 }
            r0.BEc()     // Catch:{ SQLiteException -> 0x07a2 }
            X.2fp r0 = r1.A0T     // Catch:{ SQLiteException -> 0x07a2 }
            r0.A01()     // Catch:{ SQLiteException -> 0x07a2 }
            r1.A0W()     // Catch:{ SQLiteException -> 0x07a2 }
            return
        L_0x07a2:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backupdb/failed-to-get-database/cannot-generate-fts-or-links"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x07a9:
            java.lang.Object r4 = r3.A00
            android.view.View r4 = (android.view.View) r4
            boolean r1 = r3.A01
            goto L_0x07d2
        L_0x07b0:
            java.lang.Object r4 = r3.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            boolean r3 = r3.A01
            X.1fJ r2 = r4.A1h
            X.33m r0 = r4.A03
            X.1ti r1 = new X.1ti
            r1.<init>(r4, r0, r2, r3)
            X.4FS r0 = r4.A04
            X.C18270x1.A0w(r1, r0)
            return
        L_0x07c5:
            java.lang.Object r2 = r3.A00
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r1 = r3.A01
            r0 = 2131432983(0x7f0b1617, float:1.8487739E38)
            android.view.View r4 = X.C005205m.A00(r2, r0)
        L_0x07d2:
            r0 = 0
            if (r1 != 0) goto L_0x07d7
        L_0x07d5:
            r0 = 8
        L_0x07d7:
            r4.setVisibility(r0)
            return
        L_0x07db:
            java.lang.Object r1 = r3.A00
            com.whatsapp.identity.IdentityVerificationActivity r1 = (com.whatsapp.identity.IdentityVerificationActivity) r1
            boolean r0 = r3.A01
            r1.A7F(r0)
            return
        L_0x07e5:
            java.lang.Object r0 = r3.A00
            X.7XM r0 = (X.AnonymousClass7XM) r0
            boolean r1 = r3.A01
            X.6Gy r0 = r0.A0C
            X.107 r0 = r0.A01
            X.C18320x8.A18(r0, r1)
            return
        L_0x07f3:
            java.lang.Object r1 = r3.A00
            X.1i7 r1 = (X.C29001i7) r1
            boolean r3 = r3.A01
            X.2Un r2 = r1.A02
            java.lang.String r0 = "OnTrimMemoryObservers/onTrimMemory/started"
            r2.A00(r0)
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x0804:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0814
            java.lang.Object r0 = r1.next()
            X.4Af r0 = (X.C83894Af) r0
            r0.Bej(r3)
            goto L_0x0804
        L_0x0814:
            java.lang.String r0 = "OnTrimMemoryObservers/onTrimMemory/finished"
            r2.A00(r0)
            return
        L_0x081a:
            java.lang.Object r1 = r3.A00
            com.whatsapp.mentions.MentionPickerView r1 = (com.whatsapp.mentions.MentionPickerView) r1
            boolean r0 = r3.A01
            com.whatsapp.mentions.MentionPickerView.A02(r1, r0)
            return
        L_0x0824:
            java.lang.Object r7 = r3.A00
            X.2se r7 = (X.C56842se) r7
            boolean r6 = r3.A01
            X.1VX r0 = r7.A0C
            X.5oH r8 = new X.5oH
            r8.<init>(r0)
            X.2Hl r0 = r7.A0O
            java.util.concurrent.ConcurrentHashMap r1 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.put(r8, r0)
            X.34e[] r3 = r8.Bij()
            int r2 = r3.length
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r2)
            r1 = 0
        L_0x0844:
            if (r1 >= r2) goto L_0x0850
            r0 = r3[r1]
            int r0 = r0.A01
            X.C18270x1.A1K(r5, r0)
            int r1 = r1 + 1
            goto L_0x0844
        L_0x0850:
            X.32F r4 = r7.A0N
            X.34e[] r3 = r8.Bij()
            X.2Hk r0 = r4.A01
            X.1VX r2 = r0.A00
            r1 = 4679(0x1247, float:6.557E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0869
            X.2rB r0 = r4.A02
            r0.A04(r3)
        L_0x0869:
            X.2rB r0 = r7.A0P
            r0.A03(r5, r6)
            return
        L_0x086f:
            java.lang.Object r4 = r3.A00
            X.33b r4 = (X.C619933b) r4
            java.lang.String r0 = "updating dismissed notification hash"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r3 = r4.A0H
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r0 = "locked_chat_last_notification_hash"
            java.lang.String r2 = X.C18280x3.A0Z(r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r3)
            java.lang.String r0 = "locked_chat_notification_hash"
            X.C18270x1.A0j(r1, r0, r2)
            X.33T r2 = r4.A0G
            r1 = 57
            goto L_0x08ba
        L_0x0893:
            java.lang.Object r4 = r3.A00
            X.33b r4 = (X.C619933b) r4
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x08b7
            java.lang.String r0 = "updating dismissed notification hash"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r3 = r4.A0H
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r0 = "last_notification_hash"
            java.lang.String r2 = X.C18280x3.A0Z(r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r3)
            java.lang.String r0 = "notification_hash"
            X.C18270x1.A0j(r1, r0, r2)
        L_0x08b7:
            X.33T r2 = r4.A0G
            r1 = 1
        L_0x08ba:
            java.lang.String r0 = "MessageNotification1"
            r2.A05(r1, r0)
            return
        L_0x08c0:
            A00(r3)
            return
        L_0x08c4:
            X.30e r1 = r4.A06
            r0 = 0
            r1.A05(r0)
            android.widget.TextView r1 = r4.A02
            r0 = 2131894540(0x7f12210c, float:1.9423888E38)
            r1.setText(r0)
            com.whatsapp.CodeInputField r1 = r4.A03
            java.lang.String r0 = ""
            r1.setCode(r0)
            com.whatsapp.CodeInputField r0 = r4.A03
            r0.setEnabled(r2)
            android.widget.ProgressBar r1 = r4.A01
            r0 = 100
            r1.setProgress(r0)
            X.3Wi r2 = r4.A04
            r0 = 47
            X.3Zq r1 = new X.3Zq
            r1.<init>(r4, r0)
            goto L_0x08fe
        L_0x08ef:
            java.lang.Object r4 = r3.A00
            X.4ea r4 = (X.C89654ea) r4
            boolean r3 = r3.A01
            X.3Wi r2 = r4.A05
            r0 = 37
            X.3cX r1 = new X.3cX
            r1.<init>((int) r0, (java.lang.Object) r4, (boolean) r3)
        L_0x08fe:
            r2.A0S(r1)
            return
        L_0x0902:
            r0 = 0
            java.lang.System.exit(r0)
            return
        L_0x0907:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71703cX.run():void");
    }

    public C71703cX(C625835r r2) {
        this.A02 = 33;
        this.A00 = r2;
        this.A01 = true;
    }

    public C71703cX(Runnable runnable) {
        this.A02 = 3;
        this.A00 = runnable;
    }

    public C71703cX(AnonymousClass35O r1, int i, boolean z) {
        this.A02 = i;
        if (10 - i != 0) {
            this.A00 = r1;
            this.A01 = z;
            return;
        }
        this.A00 = r1;
        this.A01 = z;
    }

    public C71703cX(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }
}
