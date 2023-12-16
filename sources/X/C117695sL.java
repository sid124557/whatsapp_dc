package X;

import android.view.View;

/* renamed from: X.5sL  reason: invalid class name and case insensitive filesystem */
public class C117695sL implements Runnable {
    public Object A00;
    public final int A01;

    public C117695sL(C107285b3 r2) {
        this.A01 = 34;
        this.A00 = r2;
    }

    public static C117695sL A00(Object obj, int i) {
        return new C117695sL(obj, i);
    }

    public static void A01(View view, Object obj, int i) {
        view.post(new C117695sL(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0454, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0457, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x048a, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x048d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0497, code lost:
        ((com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel) r0).A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x049c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04f4, code lost:
        if (r2.intersect(r1) == false) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0552, code lost:
        r3.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0555, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cb, code lost:
        com.whatsapp.util.Log.d("BweMLModelManager/fetchBweModels start");
        r4 = X.AnonymousClass002.A0K();
        r5 = r9.A00;
        r1 = r5.A0Q(4514);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dc, code lost:
        if (r1 == null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        if (r1.isEmpty() != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e4, code lost:
        r3 = X.C18320x8.A1b(r1);
        r2 = r3.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ea, code lost:
        if (r1 >= r2) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ec, code lost:
        X.C86654Ky.A1R(r4, java.lang.Integer.parseInt(r3[r1]));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f8, code lost:
        r1 = r5.A0Q(6230);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fe, code lost:
        if (r1 == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
        if (r1.isEmpty() != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        r3 = X.C18320x8.A1b(r1);
        r2 = r3.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010c, code lost:
        if (r1 >= r2) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010e, code lost:
        X.C86654Ky.A1R(r4, java.lang.Integer.parseInt(r3[r1]));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011a, code lost:
        r7 = r4.size();
        r6 = new int[r7];
        r3 = r4.iterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0129, code lost:
        if (r3.hasNext() == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012b, code lost:
        r6[r2] = ((java.lang.Number) r3.next()).intValue();
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013b, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013e, code lost:
        if (r8 >= r7) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0140, code lost:
        r5 = r9.A01;
        r4 = r6[r8];
        r5.A03.BkM(new X.C117675sJ(r5, new X.C124366Bz(r9, 4), new X.C124366Bz(r9, 5), r4));
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015d, code lost:
        r4 = r9.A01.A00;
        r3 = new java.io.File(X.AnonymousClass000.A0X("/ML_MODEL", X.AnonymousClass000.A0l(r4.A00.A00.getFilesDir().getCanonicalPath())), "wa_bwe_pl_classifier_mobile");
        r2 = java.util.Arrays.toString(r6);
        X.C162457s7.A0D(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0187, code lost:
        if (r3.exists() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018d, code lost:
        if (r3.isDirectory() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018f, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("MLModelCacheManagerImpl/removeModels/deleting model files for ");
        r1.append("wa_bwe_pl_classifier_mobile");
        X.C18260x0.A0s(", but keep versions ", r2, r1);
        r2 = X.AnonymousClass002.A0I(r7);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a5, code lost:
        if (r1 >= r7) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a7, code lost:
        r2.add(r4.A01("wa_bwe_pl_classifier_mobile", r6[r1]));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b3, code lost:
        r1 = X.C829345m.A04(new X.AnonymousClass630(r3, r2), new X.AnonymousClass8PK(r3, X.C141646vu.A03)).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cb, code lost:
        if (r1.hasNext() == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cd, code lost:
        ((java.io.File) r1.next()).delete();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0567;
                case 1: goto L_0x055e;
                case 2: goto L_0x0556;
                case 3: goto L_0x02df;
                case 4: goto L_0x02cd;
                case 5: goto L_0x0284;
                case 6: goto L_0x0266;
                case 7: goto L_0x0549;
                case 8: goto L_0x0538;
                case 9: goto L_0x052a;
                case 10: goto L_0x0517;
                case 11: goto L_0x0005;
                case 12: goto L_0x050d;
                case 13: goto L_0x0502;
                case 14: goto L_0x0252;
                case 15: goto L_0x04f7;
                case 16: goto L_0x04d8;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x04c5;
                case 20: goto L_0x0245;
                case 21: goto L_0x049d;
                case 22: goto L_0x01d7;
                case 23: goto L_0x0495;
                case 24: goto L_0x048e;
                case 25: goto L_0x048e;
                case 26: goto L_0x0480;
                case 27: goto L_0x0476;
                case 28: goto L_0x046c;
                case 29: goto L_0x0458;
                case 30: goto L_0x00c5;
                case 31: goto L_0x044c;
                case 32: goto L_0x0444;
                case 33: goto L_0x043c;
                case 34: goto L_0x008a;
                case 35: goto L_0x0432;
                case 36: goto L_0x0060;
                case 37: goto L_0x0050;
                case 38: goto L_0x042a;
                case 39: goto L_0x0422;
                case 40: goto L_0x0040;
                case 41: goto L_0x0403;
                case 42: goto L_0x0013;
                case 43: goto L_0x03f1;
                case 44: goto L_0x000d;
                case 45: goto L_0x03d6;
                case 46: goto L_0x03bc;
                case 47: goto L_0x03b0;
                case 48: goto L_0x0311;
                case 49: goto L_0x0309;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r0.invoke()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r9 = r12.A00
            X.5lv r9 = (X.C113745lv) r9
            goto L_0x00cb
        L_0x0013:
            java.lang.Object r3 = r12.A00
            X.4Rs r3 = (X.AnonymousClass4Rs) r3
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r0.callId
            X.2rn r1 = r3.A09
            java.lang.String r0 = X.C627436k.A08(r0)
            X.2mt r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x000c
            X.2sW r2 = r3.A08
            long r0 = r0.A00
            X.3ZF r2 = r2.A01(r0)
            if (r2 == 0) goto L_0x000c
            r1 = 46
            X.3a5 r0 = new X.3a5
            r0.<init>(r3, r1, r2)
            r3.post(r0)
            return
        L_0x0040:
            java.lang.Object r0 = r12.A00
            com.whatsapp.calling.views.PermissionDialogFragment r0 = (com.whatsapp.calling.views.PermissionDialogFragment) r0
            X.661 r2 = r0.A04
            if (r2 == 0) goto L_0x000c
            int r1 = r0.A00
            java.lang.String[] r0 = r0.A0E
            r2.BY3(r0, r1)
            return
        L_0x0050:
            java.lang.Object r0 = r12.A00
            X.5Ji r0 = (X.C102565Ji) r0
            android.widget.PopupWindow r1 = r0.A01
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x000c
            r1.dismiss()
            return
        L_0x0060:
            java.lang.Object r0 = r12.A00
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r2 = X.C61102zi.A03(r0)
        L_0x0068:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r2.next()
            X.2NC r0 = (X.AnonymousClass2NC) r0
            java.util.Set r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x007a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r1.next()
            X.4CZ r0 = (X.AnonymousClass4CZ) r0
            r0.BO2()
            goto L_0x007a
        L_0x008a:
            java.lang.Object r4 = r12.A00
            X.5b3 r4 = (X.C107285b3) r4
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x000c
            X.5Lb r0 = r3.self
            if (r0 == 0) goto L_0x000c
            r2 = 1
            r1 = 0
            boolean r0 = r0.A0F
            boolean r0 = X.AnonymousClass000.A1T(r0)
            com.whatsapp.voipcalling.Voip.muteCall(r0)
            if (r0 == 0) goto L_0x00b9
            X.8y5 r0 = r4.A34
            X.8Jm r0 = (X.C172068Jm) r0
            X.1VX r1 = r0.A01
            r0 = 4226(0x1082, float:5.922E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x000c
            X.5pi r0 = r4.A1m
            r0.A0D(r2)
            return
        L_0x00b9:
            X.5Lb r0 = r3.self
            boolean r0 = r0.A0C
            if (r0 != 0) goto L_0x000c
            X.5pi r0 = r4.A1m
            r0.A0D(r1)
            return
        L_0x00c5:
            java.lang.Object r0 = r12.A00
            X.5b3 r0 = (X.C107285b3) r0
            X.5lv r9 = r0.A2I
        L_0x00cb:
            java.lang.String r0 = "BweMLModelManager/fetchBweModels start"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            X.1VX r5 = r9.A00
            r0 = 4514(0x11a2, float:6.325E-42)
            java.lang.String r1 = r5.A0Q(r0)
            if (r1 == 0) goto L_0x00f8
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00f8
            java.lang.String[] r3 = X.C18320x8.A1b(r1)
            int r2 = r3.length
            r1 = 0
        L_0x00ea:
            if (r1 >= r2) goto L_0x00f8
            r0 = r3[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            X.C86654Ky.A1R(r4, r0)
            int r1 = r1 + 1
            goto L_0x00ea
        L_0x00f8:
            r0 = 6230(0x1856, float:8.73E-42)
            java.lang.String r1 = r5.A0Q(r0)
            if (r1 == 0) goto L_0x011a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x011a
            java.lang.String[] r3 = X.C18320x8.A1b(r1)
            int r2 = r3.length
            r1 = 0
        L_0x010c:
            if (r1 >= r2) goto L_0x011a
            r0 = r3[r1]
            int r0 = java.lang.Integer.parseInt(r0)
            X.C86654Ky.A1R(r4, r0)
            int r1 = r1 + 1
            goto L_0x010c
        L_0x011a:
            int r7 = r4.size()
            int[] r6 = new int[r7]
            java.util.Iterator r3 = r4.iterator()
            r2 = 0
        L_0x0125:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r2 + 1
            int r0 = r0.intValue()
            r6[r2] = r0
            r2 = r1
            goto L_0x0125
        L_0x013b:
            r8 = 0
        L_0x013c:
            java.lang.String r5 = "wa_bwe_pl_classifier_mobile"
            if (r8 >= r7) goto L_0x015d
            X.5Np r5 = r9.A01
            r4 = r6[r8]
            r0 = 4
            X.6Bz r3 = new X.6Bz
            r3.<init>(r9, r0)
            r0 = 5
            X.6Bz r2 = new X.6Bz
            r2.<init>(r9, r0)
            X.4FS r1 = r5.A03
            X.5sJ r0 = new X.5sJ
            r0.<init>(r5, r3, r2, r4)
            r1.BkM(r0)
            int r8 = r8 + 1
            goto L_0x013c
        L_0x015d:
            X.5Np r0 = r9.A01
            X.5Wy r4 = r0.A00
            X.2oU r0 = r4.A00
            android.content.Context r0 = r0.A00
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r0 = r0.getCanonicalPath()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "/ML_MODEL"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r5)
            java.lang.String r2 = java.util.Arrays.toString(r6)
            X.C162457s7.A0D(r2)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L_0x000c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MLModelCacheManagerImpl/removeModels/deleting model files for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", but keep versions "
            X.C18260x0.A0s(r0, r2, r1)
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r7)
            r1 = 0
        L_0x01a5:
            if (r1 >= r7) goto L_0x01b3
            r0 = r6[r1]
            java.io.File r0 = r4.A01(r5, r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x01a5
        L_0x01b3:
            X.6vu r0 = X.C141646vu.TOP_DOWN
            X.8PK r1 = new X.8PK
            r1.<init>(r3, r0)
            X.630 r0 = new X.630
            r0.<init>(r3, r2)
            X.4C5 r0 = X.C829345m.A04(r0, r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x01c7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x01c7
        L_0x01d7:
            java.lang.Object r4 = r12.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel r4 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel) r4
            com.whatsapp.jid.GroupJid r2 = r4.A02
            if (r2 == 0) goto L_0x000c
            X.3Ex r0 = r4.A0F
            X.3ZH r1 = r0.A0A(r2)
            X.5ZU r0 = r4.A0I
            java.lang.String r0 = r0.A0H(r1)
            r3 = 0
            X.6g4 r7 = new X.6g4
            r7.<init>(r3, r0)
            X.08M r5 = r4.A0A
            boolean r1 = r4.A06
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            r10 = 0
            java.util.List r9 = r4.A0G(r0, r3, r1, r3)
            X.1VX r3 = r4.A0M
            X.2sj r0 = r4.A0K
            X.33h r1 = r0.A09
            int r0 = r1.A04(r2)
            boolean r11 = X.C627436k.A0L(r3, r0)
            r8 = 0
            X.5Sr r6 = new X.5Sr
            r6.<init>(r7, r8, r9, r10, r11)
            r5.A0G(r6)
            X.08M r0 = r4.A09
            X.AnonymousClass0x7.A18(r0)
            int r2 = r1.A04(r2)
            r0 = 5429(0x1535, float:7.608E-42)
            int r1 = r3.A0N(r0)
            r0 = 1
            if (r1 != r0) goto L_0x000c
            r0 = 6083(0x17c3, float:8.524E-42)
            int r0 = r3.A0N(r0)
            if (r0 <= 0) goto L_0x000c
            r0 = 6119(0x17e7, float:8.575E-42)
            int r0 = r3.A0N(r0)
            if (r2 < r0) goto L_0x000c
            X.4C6 r3 = X.AnonymousClass0IV.A00(r4)
            X.3gB r2 = r4.A0O
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel$updateConfirmationViewState$1$1 r1 = new com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatBottomSheetViewModel$updateConfirmationViewState$1$1
            r1.<init>(r4, r8)
            r0 = 2
            X.C616131n.A02(r2, r1, r3, r8, r0)
            return
        L_0x0245:
            java.lang.Object r0 = r12.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A01
            if (r1 == 0) goto L_0x000c
            r0 = 3
            r1.A0S(r0)
            return
        L_0x0252:
            java.lang.Object r2 = r12.A00
            X.4jN r2 = (X.C91324jN) r2
            r2.A09()
            X.6fx r0 = r2.A00
            if (r0 == 0) goto L_0x000c
            int r1 = r0.A00
            r0 = 1
            if (r1 == r0) goto L_0x000c
            r2.A0A()
            return
        L_0x0266:
            java.lang.Object r3 = r12.A00
            X.4j9 r3 = (X.C91234j9) r3
            X.8KC r2 = r3.A07
            if (r2 == 0) goto L_0x000c
            X.8np r0 = r3.A06
            if (r0 == 0) goto L_0x000c
            r1 = 10
            X.91H r0 = new X.91H
            r0.<init>(r2, r1)
            r2.A04(r0)
            X.8KC r1 = r3.A07
            X.8np r0 = r3.A06
            r1.A09(r0)
            return
        L_0x0284:
            java.lang.Object r2 = r12.A00
            X.4j9 r2 = (X.C91234j9) r2
            X.8KC r1 = r2.A07
            if (r1 == 0) goto L_0x0293
            X.8np r0 = r2.A06
            if (r0 == 0) goto L_0x0293
            r1.A0A(r0)
        L_0x0293:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r2.A06
            if (r4 == 0) goto L_0x000c
            X.5Tw r0 = r2.A07
            if (r0 == 0) goto L_0x000c
            com.whatsapp.jid.UserJid r3 = r0.A0b
            X.5QX r2 = r4.A0U
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            java.util.Map r0 = r2.A02
            java.lang.Object r1 = r0.remove(r3)
            X.4Gj r1 = (X.C85474Gj) r1
            if (r1 == 0) goto L_0x02b1
            r0 = 0
            r1.AyX(r0)
        L_0x02b1:
            java.util.Set r0 = r2.A03
            boolean r0 = r0.remove(r3)
            if (r0 == 0) goto L_0x02c9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/ScreenSharePeerTransitionStateProvider/ Transition state hidden for "
            X.C18260x0.A1P(r1, r0, r3)
            X.08M r1 = r2.A01
            X.2wD r0 = X.C59022wD.A00
            r1.A0H(r0)
        L_0x02c9:
            X.AnonymousClass4VK.A03(r4)
            return
        L_0x02cd:
            java.lang.Object r1 = r12.A00
            X.4j9 r1 = (X.C91234j9) r1
            X.5Tw r0 = r1.A07
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.A0W
            if (r0 != 0) goto L_0x000c
            r0 = 8
            r1.A0J(r0)
            return
        L_0x02df:
            java.lang.Object r1 = r12.A00
            X.5fN r1 = (X.C109905fN) r1
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x000c
            com.whatsapp.calling.callgrid.view.PipViewContainer r3 = r1.A0J
            X.4Z7 r2 = r3.A04
            X.5Tw r0 = r2.A07
            r1 = 0
            if (r0 == 0) goto L_0x0302
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x0302
            android.view.View r0 = r2.A0H
            r0.performHapticFeedback(r1)
            X.4Z7 r0 = r3.A04
            android.view.View r0 = r0.A0H
            r0.performLongClick()
        L_0x0302:
            com.whatsapp.calling.callgrid.view.PipViewContainer.A00(r3, r1)
            r3.A02()
            return
        L_0x0309:
            java.lang.Object r0 = r12.A00
            X.6gD r0 = (X.C132906gD) r0
            X.C132906gD.A04(r0)
            return
        L_0x0311:
            java.lang.Object r0 = r12.A00
            X.68l r0 = (X.C1234468l) r0
            java.lang.Object r3 = r0.A00
            X.5ZS r3 = (X.AnonymousClass5ZS) r3
            boolean r0 = r3.A0Q()
            if (r0 != 0) goto L_0x038c
            X.5Y6 r6 = r3.A0E
            boolean r8 = r3.A0R
            X.2oU r0 = r3.A0o
            android.content.Context r0 = r0.A00
            X.C86604Kt.A02(r0)
            r4 = 2
            r7 = 1
            com.whatsapp.WaImageView r5 = r6.A0I
            r1 = 0
            r2 = 0
            r5.setVisibility(r1)
            com.whatsapp.CircularProgressBar r0 = r6.A05
            if (r0 == 0) goto L_0x033a
            r0.setVisibility(r1)
        L_0x033a:
            r5.setEnabled(r7)
            if (r8 == 0) goto L_0x0344
            r0 = 8
            r5.sendAccessibilityEvent(r0)
        L_0x0344:
            com.whatsapp.WaImageView r1 = r6.A0J
            r1.setEnabled(r7)
            boolean r0 = r6.A0L
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r0 = r6.A0G
            r0.setEnabled(r7)
            r6.A01()
            com.whatsapp.WaImageView r1 = r6.A0H
            X.7KW r0 = r6.A06
            int r0 = r0.A00
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r0 = r6.A0F
            r0.setVisibility(r2)
            X.5UD r0 = r3.A0F
            if (r0 == 0) goto L_0x037a
            com.whatsapp.camera.CameraBottomSheetBehavior r0 = r0.A0B
            int r1 = r0.A0O
            r0 = 3
            if (r1 == r0) goto L_0x037a
            X.5MR r0 = r3.A0G
            com.whatsapp.camera.mode.CameraModeTabLayout r0 = r0.A00
            r0.setVisibility(r2)
        L_0x037a:
            X.5Y6 r0 = r3.A0E
            r0.A00()
            X.5TA r1 = r3.A0I
            X.5Qv r0 = r3.A0i
            int r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1U(r0, r4)
            r1.A01(r0, r2, r2)
        L_0x038c:
            android.view.View r0 = r3.A07
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03a9
            android.view.View r1 = r3.A07
            r0 = 8
            r1.setVisibility(r0)
            android.view.animation.AlphaAnimation r2 = X.C86604Kt.A0G()
            r0 = 400(0x190, double:1.976E-321)
            r2.setDuration(r0)
            android.view.View r0 = r3.A07
            r0.startAnimation(r2)
        L_0x03a9:
            X.5eI r1 = r3.A0B
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A00 = r0
            return
        L_0x03b0:
            java.lang.Object r0 = r12.A00
            X.5PM r0 = (X.AnonymousClass5PM) r0
            X.5ZS r0 = r0.A00
            X.33i r0 = r0.A0m
            X.C106755a7.A03(r0)
            return
        L_0x03bc:
            java.lang.Object r2 = r12.A00
            X.5ZS r2 = (X.AnonymousClass5ZS) r2
            android.view.View r0 = r2.A08
            r1 = 4
            r0.setVisibility(r1)
            android.view.View r0 = r2.A06
            r0.setVisibility(r1)
            X.5MR r0 = r2.A0G
            com.whatsapp.camera.mode.CameraModeTabLayout r0 = r0.A00
            r0.setVisibility(r1)
            android.view.View r3 = r2.A07
            goto L_0x0551
        L_0x03d6:
            java.lang.Object r3 = r12.A00
            X.5ZS r3 = (X.AnonymousClass5ZS) r3
            X.5Qv r0 = r3.A0i
            java.util.Set r0 = r0.A0A
            int r0 = r0.size()
            boolean r2 = X.AnonymousClass001.A1W(r0)
            X.678 r1 = r3.A0C
            X.5PM r0 = new X.5PM
            r0.<init>(r3)
            r1.Bqa(r0, r2)
            return
        L_0x03f1:
            java.lang.Object r1 = r12.A00
            X.4Rs r1 = (X.AnonymousClass4Rs) r1
            X.5TW r0 = r1.A01
            boolean r0 = r0.A01()
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            return
        L_0x0403:
            java.lang.Object r2 = r12.A00
            com.whatsapp.calling.views.VoipCallFooter r2 = (com.whatsapp.calling.views.VoipCallFooter) r2
            android.view.View r1 = r2.A02
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131429456(0x7f0b0850, float:1.8480585E38)
            android.widget.ImageButton r1 = X.C86664Kz.A0t(r2, r0)
            r2.A04 = r1
            r0 = 1
            X.C107215at.A05(r1, r0)
            android.widget.ImageButton r1 = r2.A04
            android.view.View$OnClickListener r0 = r2.A00
            r1.setOnClickListener(r0)
            return
        L_0x0422:
            java.lang.Object r0 = r12.A00
            X.8KC r0 = (X.AnonymousClass8KC) r0
            r0.A06()
            return
        L_0x042a:
            java.lang.Object r0 = r12.A00
            X.364 r0 = (X.AnonymousClass364) r0
            X.AnonymousClass364.A00(r0)
            return
        L_0x0432:
            java.lang.Object r0 = r12.A00
            X.5b3 r0 = (X.C107285b3) r0
            short r0 = r0.A14
            com.whatsapp.voipcalling.Voip.adjustAudioLevel(r0)
            return
        L_0x043c:
            java.lang.Object r0 = r12.A00
            android.media.SoundPool r0 = (android.media.SoundPool) r0
            r0.release()
            return
        L_0x0444:
            java.lang.Object r0 = r12.A00
            X.5b3 r0 = (X.C107285b3) r0
            X.7T0 r1 = r0.A0a
            r0 = 0
            goto L_0x0454
        L_0x044c:
            java.lang.Object r0 = r12.A00
            X.5b3 r0 = (X.C107285b3) r0
            X.7T0 r1 = r0.A0a
            X.8no r0 = r0.A0Z
        L_0x0454:
            r1.A00(r0)
            return
        L_0x0458:
            java.lang.Object r0 = r12.A00
            X.5ZK r0 = (X.AnonymousClass5ZK) r0
            android.media.Ringtone r1 = r0.A01
            if (r1 == 0) goto L_0x0469
            boolean r0 = r1.isPlaying()
            if (r0 != 0) goto L_0x0469
            r1.play()
        L_0x0469:
            java.lang.String r0 = "voip/ringtone/play complete"
            goto L_0x048a
        L_0x046c:
            java.lang.Object r0 = r12.A00
            android.media.Ringtone r0 = (android.media.Ringtone) r0
            r0.stop()
            java.lang.String r0 = "voip/ringtone/stop complete"
            goto L_0x048a
        L_0x0476:
            java.lang.Object r0 = r12.A00
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r0.cancel()
            java.lang.String r0 = "voip/vibrate/stop complete"
            goto L_0x048a
        L_0x0480:
            java.lang.Object r1 = r12.A00
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r0 = 1
            r1.setMode(r0)
            java.lang.String r0 = "voip/ringtone/setmode complete"
        L_0x048a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x048e:
            java.lang.Object r0 = r12.A00
            X.4HI r0 = (X.AnonymousClass4HI) r0
            java.lang.Object r0 = r0.A00
            goto L_0x0497
        L_0x0495:
            java.lang.Object r0 = r12.A00
        L_0x0497:
            com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel r0 = (com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel) r0
            r0.A0D()
            return
        L_0x049d:
            java.lang.Object r4 = r12.A00
            X.4PI r4 = (X.AnonymousClass4PI) r4
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r0 = r4.A02
            if (r0 != 0) goto L_0x04ac
            java.lang.String r0 = "audioChatViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04ac:
            X.08M r3 = r0.A0E
            X.0sA r2 = r4.A00
            if (r2 != 0) goto L_0x04b9
            java.lang.String r0 = "lifeCycleOwner"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04b9:
            r0 = 7
            X.746 r1 = new X.746
            r1.<init>(r4, r0)
            r0 = 158(0x9e, float:2.21E-43)
            X.C86604Kt.A1N(r2, r3, r1, r0)
            return
        L_0x04c5:
            java.lang.Object r0 = r12.A00
            X.0eF r0 = (X.C08310eF) r0
            com.whatsapp.calling.participantlist.ParticipantListBottomSheetDialog r2 = new com.whatsapp.calling.participantlist.ParticipantListBottomSheetDialog
            r2.<init>()
            X.0df r1 = r0.A0T()
            java.lang.String r0 = "ParticipantListBottomSheetDialog"
            r2.A1O(r1, r0)
            return
        L_0x04d8:
            java.lang.Object r3 = r12.A00
            X.4jM r3 = (X.C91314jM) r3
            android.graphics.Rect r2 = X.AnonymousClass001.A0N()
            android.graphics.Rect r1 = X.AnonymousClass001.A0N()
            com.whatsapp.TextEmojiLabel r0 = r3.A00
            r0.getGlobalVisibleRect(r2)
            com.whatsapp.WaTextView r3 = r3.A01
            r3.getGlobalVisibleRect(r1)
            boolean r1 = r2.intersect(r1)
            r0 = 8
            if (r1 != 0) goto L_0x0552
            goto L_0x0551
        L_0x04f7:
            java.lang.Object r0 = r12.A00
            X.4jN r0 = (X.C91324jN) r0
            r0.A09()
            r0.A0A()
            return
        L_0x0502:
            java.lang.Object r0 = r12.A00
            X.5Uk r0 = (X.C105315Uk) r0
            r0.A01()
            r0.A02()
            return
        L_0x050d:
            java.lang.Object r1 = r12.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r1 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r1
            X.5Tj r0 = r1.A0Q
            r0.A02(r1)
            return
        L_0x0517:
            java.lang.Object r2 = r12.A00
            com.whatsapp.contact.picker.SelectedContactsList r2 = (com.whatsapp.contact.picker.SelectedContactsList) r2
            androidx.recyclerview.widget.RecyclerView r1 = r2.A05
            X.4WP r0 = r2.A07
            int r0 = r0.A0G()
            r1.A0a(r0)
            r2.A01()
            return
        L_0x052a:
            java.lang.Object r0 = r12.A00
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            X.4Oa r1 = r0.A0i
            X.2i6 r0 = r0.A0T
            r1.A00 = r0
            r1.notifyDataSetChanged()
            return
        L_0x0538:
            java.lang.Object r1 = r12.A00
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r1
            r0 = 0
            r1.A0C = r0
            X.4xk r0 = r1.A0R
            X.5XK r0 = r0.A08()
            r1.A0S(r0)
            return
        L_0x0549:
            java.lang.Object r0 = r12.A00
            X.5eO r0 = (X.C109295eO) r0
            X.4j9 r0 = r0.A01
            android.view.View r3 = r0.A0F
        L_0x0551:
            r0 = 0
        L_0x0552:
            r3.setVisibility(r0)
            return
        L_0x0556:
            java.lang.Object r0 = r12.A00
            com.whatsapp.calling.callgrid.view.PipViewContainer r0 = (com.whatsapp.calling.callgrid.view.PipViewContainer) r0
            r0.A02()
            return
        L_0x055e:
            java.lang.Object r1 = r12.A00
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            r0 = 3
            r1.A1R(r0)
            return
        L_0x0567:
            java.lang.Object r0 = r12.A00
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            X.4XD r0 = r0.A07
            r0.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117695sL.run():void");
    }

    public C117695sL(AnonymousClass5ZS r1, int i) {
        this.A01 = i;
        if (45 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public C117695sL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
