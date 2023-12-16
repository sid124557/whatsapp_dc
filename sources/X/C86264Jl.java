package X;

/* renamed from: X.4Jl  reason: invalid class name and case insensitive filesystem */
public class C86264Jl implements C84134Bd {
    public Object A00;
    public Object A01;
    public final int A02;

    public C86264Jl(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0392, code lost:
        com.whatsapp.util.Log.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0395, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0452, code lost:
        r0 = r6.A0Q();
        X.C162457s7.A0K(r0, r5);
        ((X.AnonymousClass4FU) r0).Boo(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x045e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01bd, code lost:
        r0.A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0267, code lost:
        r3 = X.C107245ax.A06(new X.AnonymousClass5WB((android.graphics.BitmapFactory.Options) null, (java.lang.Long) null, 96, 96, true), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0279, code lost:
        r9 = X.C107655bf.A0I(r0, (android.graphics.Matrix) null, 96, 96);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02f7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02f8, code lost:
        com.whatsapp.util.Log.e("MediaJobManager/enqueueThumbnailUpload, exception when creating thumbnail file", r1);
        r4.A04 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02ff, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AwB(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r17
            r3 = r16
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x01ac;
                case 1: goto L_0x01b5;
                case 2: goto L_0x000a;
                case 3: goto L_0x01c1;
                case 4: goto L_0x01d4;
                case 5: goto L_0x0045;
                case 6: goto L_0x0070;
                case 7: goto L_0x01e9;
                case 8: goto L_0x00ab;
                case 9: goto L_0x00e2;
                case 10: goto L_0x0109;
                case 11: goto L_0x0300;
                case 12: goto L_0x034c;
                case 13: goto L_0x03c9;
                case 14: goto L_0x012b;
                case 15: goto L_0x03ed;
                case 16: goto L_0x0165;
                case 17: goto L_0x0418;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r6 = r3.A00
            com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer r6 = (com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer) r6
            java.lang.Object r4 = r3.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r3 = X.AnonymousClass001.A1Z(r1)
            X.03q r0 = r6.A0Q()
            java.lang.String r5 = "null cannot be cast to non-null type com.whatsapp.DialogInterface"
            X.C162457s7.A0K(r0, r5)
            X.4FU r0 = (X.AnonymousClass4FU) r0
            boolean r0 = r0.BHW()
            if (r0 != 0) goto L_0x0009
            X.1VX r2 = r6.A0H
            if (r2 == 0) goto L_0x0437
            java.lang.String r0 = "extension_menu_report"
            X.5XI r1 = new X.5XI
            r1.<init>(r2, r4, r0, r3)
            r1.A01 = r4
            X.34x r0 = r6.A0J
            if (r0 == 0) goto L_0x0043
            X.2z0 r0 = r0.A1J
        L_0x003b:
            r1.A02 = r0
            androidx.fragment.app.DialogFragment r1 = r1.A00()
            goto L_0x0452
        L_0x0043:
            r0 = 0
            goto L_0x003b
        L_0x0045:
            java.lang.Object r4 = r3.A00
            com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment r4 = (com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment) r4
            java.lang.Object r3 = r3.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            boolean r2 = X.AnonymousClass001.A1Z(r1)
            X.03q r1 = r4.A0Q()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogInterface"
            X.C162457s7.A0K(r1, r0)
            X.4FU r1 = (X.AnonymousClass4FU) r1
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0009
            X.4FS r1 = r4.A09
            if (r1 == 0) goto L_0x043c
            X.3a8 r0 = new X.3a8
            r0.<init>(r4, r3, r2)
            r1.BkM(r0)
            return
        L_0x0070:
            java.lang.Object r6 = r3.A00
            com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer r6 = (com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer) r6
            java.lang.Object r4 = r3.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r3 = X.AnonymousClass001.A1Z(r1)
            X.03q r0 = r6.A0Q()
            java.lang.String r5 = "null cannot be cast to non-null type com.whatsapp.DialogInterface"
            X.C162457s7.A0K(r0, r5)
            X.4FU r0 = (X.AnonymousClass4FU) r0
            boolean r0 = r0.BHW()
            if (r0 != 0) goto L_0x0009
            X.1VX r1 = r6.A0F
            if (r1 == 0) goto L_0x045f
            java.lang.String r0 = "extension_menu_report"
            X.5XI r2 = new X.5XI
            r2.<init>(r1, r4, r0, r3)
            r0 = 0
            r2.A05 = r0
            r2.A01 = r4
            com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel r0 = r6.A0C
            r1 = 0
            if (r0 != 0) goto L_0x0444
            java.lang.String r0 = "waFlowsViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ab:
            java.lang.Object r4 = r3.A00
            X.33c r4 = (X.C620033c) r4
            java.lang.Object r3 = r3.A01
            X.3QO r3 = (X.AnonymousClass3QO) r3
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediajobmanager/optimistic/job finished; result="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "; job="
            X.C18260x0.A1P(r2, r0, r3)
            boolean r0 = r3.A06()
            if (r0 == 0) goto L_0x0009
            int r2 = r1.intValue()
            r0 = 14
            if (r2 == r0) goto L_0x00de
            X.2gm r1 = r4.A0C
            r0 = 1
            X.5Rn r0 = r4.A06(r3, r2, r0)
            r1.A01(r0)
        L_0x00de:
            r3.A03()
            return
        L_0x00e2:
            java.lang.Object r2 = r3.A00
            X.2re r2 = (X.C56232re) r2
            java.lang.Object r4 = r3.A01
            X.3QO r4 = (X.AnonymousClass3QO) r4
            java.lang.Number r1 = (java.lang.Number) r1
            java.util.WeakHashMap r0 = r2.A0U
            boolean r0 = r0.containsValue(r4)
            if (r0 != 0) goto L_0x0009
            X.2gm r3 = r2.A0H
            X.33c r2 = r2.A0D
            int r1 = r1.intValue()
            int r0 = r4.A01
            X.5Rn r0 = r2.A06(r4, r1, r0)
            r3.A01(r0)
            r4.A03()
            return
        L_0x0109:
            java.lang.Object r4 = r3.A00
            X.2re r4 = (X.C56232re) r4
            java.lang.Object r3 = r3.A01
            X.1mV r3 = (X.C30471mV) r3
            r0 = 0
            boolean r0 = X.C618132i.A01(r3, r0)
            if (r0 == 0) goto L_0x0009
            X.3Lv r0 = r4.A06
            r0.A0Y(r3)
            r5 = 6
            r7 = 1
            X.4FS r0 = r4.A0R
            r6 = 3
            X.3cT r2 = new X.3cT
            r2.<init>(r3, r4, r5, r6, r7)
            r0.BkM(r2)
            return
        L_0x012b:
            java.lang.Object r6 = r3.A00
            X.33d r6 = (X.C620133d) r6
            java.lang.Object r5 = r3.A01
            X.1mV r5 = (X.C30471mV) r5
            X.2kP r1 = (X.C51802kP) r1
            java.lang.String r0 = "MessageDownloadManagerNotify#whenPartialHdDownloaded notify message changed"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2sk r0 = r1.A00
            java.io.File r4 = r0.A03()
            if (r4 == 0) goto L_0x0154
            monitor-enter(r5)
            X.33C r0 = X.C30471mV.A00(r5)     // Catch:{ all -> 0x0464 }
            r0.A0F = r4     // Catch:{ all -> 0x0464 }
            X.C626936e.A06(r4)     // Catch:{ all -> 0x0464 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0464 }
            r4.setLastModified(r2)     // Catch:{ all -> 0x0464 }
            monitor-exit(r5)     // Catch:{ all -> 0x0464 }
        L_0x0154:
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0009
            java.util.concurrent.Executor r2 = r6.A0o
            r1 = 30
            X.3by r0 = new X.3by
            r0.<init>(r6, r1, r5)
            r2.execute(r0)
            return
        L_0x0165:
            java.lang.Object r7 = r3.A00
            com.whatsapp.messaging.ViewOnceViewerActivity r7 = (com.whatsapp.messaging.ViewOnceViewerActivity) r7
            java.lang.Object r6 = r3.A01
            X.34x r6 = (X.C624134x) r6
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = X.C621433s.A03(r7)
            if (r0 != 0) goto L_0x0009
            X.1VX r5 = r7.A0D
            X.2z0 r4 = r6.A1J
            X.4uZ r3 = r4.A00
            java.lang.String r2 = "view_once_viewer"
            boolean r0 = r1.booleanValue()
            X.5XI r1 = new X.5XI
            r1.<init>(r5, r3, r2, r0)
            r0 = 0
            r1.A00 = r0
            r1.A08 = r0
            com.whatsapp.jid.UserJid r0 = r6.A0o()
            r1.A01 = r0
            r0 = 0
            r1.A05 = r0
            r1.A07 = r0
            X.3Ub r0 = new X.3Ub
            r0.<init>(r7)
            r1.A03 = r0
            r1.A02 = r4
            androidx.fragment.app.DialogFragment r1 = r1.A00()
            X.0df r0 = r7.getSupportFragmentManager()
            X.AnonymousClass344.A00(r1, r0)
            return
        L_0x01ac:
            java.lang.Object r0 = r3.A00
            X.2S4 r0 = (X.AnonymousClass2S4) r0
            java.lang.Object r1 = r3.A01
            X.1i6 r0 = r0.A01
            goto L_0x01bd
        L_0x01b5:
            java.lang.Object r0 = r3.A00
            X.1iA r0 = (X.C29031iA) r0
            java.lang.Object r1 = r3.A01
            X.1i6 r0 = r0.A0O
        L_0x01bd:
            r0.A07(r1)
            return
        L_0x01c1:
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            java.lang.Object r0 = r3.A00
            X.3XA r0 = (X.AnonymousClass3XA) r0
            r0.A02()
            java.lang.Object r0 = r3.A01
            X.4Du r0 = (X.C84814Du) r0
            r0.BkD(r1)
            return
        L_0x01d4:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            java.lang.Object r0 = r3.A00
            X.3XA r0 = (X.AnonymousClass3XA) r0
            r0.A02()
            java.lang.Object r0 = r3.A01
            X.4Du r0 = (X.C84814Du) r0
            X.AnonymousClass3Z0.A02(r1, r0)
            return
        L_0x01e9:
            java.lang.Object r5 = r3.A00
            X.33c r5 = (X.C620033c) r5
            java.lang.Object r4 = r3.A01
            X.3QO r4 = (X.AnonymousClass3QO) r4
            X.7Hs r1 = (X.C148267Hs) r1
            X.38t r3 = X.C47592dV.A00(r4)
            X.32J r0 = r4.A0N
            X.7iO r7 = r0.A03
            boolean r2 = r7.A02
            X.2UD r0 = r4.A00()
            int[] r0 = r0.A0H
            boolean r0 = r5.A0H(r3, r0, r2)
            r11 = 0
            if (r0 != 0) goto L_0x020d
            r4.A04 = r11
            return
        L_0x020d:
            byte[] r6 = r4.A04
            if (r6 != 0) goto L_0x0215
            java.lang.String r0 = "MediaJobManager/enqueueThumbnailUpload, thumbnail data on MediaJob is null"
            goto L_0x0392
        L_0x0215:
            X.2eK r0 = r5.A08     // Catch:{ IOException -> 0x02f7 }
            X.2gw r2 = r0.A00     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = ""
            java.io.File r3 = r2.A00(r0)     // Catch:{ IOException -> 0x02f7 }
            X.C627536m.A0H(r3, r6)     // Catch:{ IOException -> 0x02f7 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "MediaJobManager/enqueueThumbnailUpload, created thumbnail file at "
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r3, r0, r2)     // Catch:{ IOException -> 0x02f7 }
            X.C18260x0.A1J(r2, r0)     // Catch:{ IOException -> 0x02f7 }
            X.38t r0 = X.C47592dV.A00(r4)     // Catch:{ IOException -> 0x02f7 }
            byte r2 = r0.A00     // Catch:{ IOException -> 0x02f7 }
            X.38t r0 = X.C47592dV.A00(r4)     // Catch:{ IOException -> 0x02f7 }
            boolean r0 = X.AnonymousClass36O.A05(r0)     // Catch:{ IOException -> 0x02f7 }
            X.38t r0 = X.AnonymousClass36O.A00(r2, r0)     // Catch:{ IOException -> 0x02f7 }
            X.2UD r2 = X.C154347d1.A01(r1, r0, r3)     // Catch:{ IOException -> 0x02f7 }
            X.2rD r10 = r5.A09     // Catch:{ IOException -> 0x02f7 }
            X.38t r0 = X.C47592dV.A00(r4)     // Catch:{ IOException -> 0x02f7 }
            byte r9 = r0.A00     // Catch:{ IOException -> 0x02f7 }
            X.2dV r0 = r4.A01()     // Catch:{ IOException -> 0x02f7 }
            int r8 = r0.A01     // Catch:{ IOException -> 0x02f7 }
            X.33a r6 = r4.A0M     // Catch:{ IOException -> 0x02f7 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x02f7 }
            boolean r1 = r6.A0N     // Catch:{ all -> 0x02f4 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x02f7 }
            X.5LM r0 = r4.A0L     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = r0.A0D     // Catch:{ IOException -> 0x02f7 }
            X.3QN r6 = r10.A03(r0, r9, r8, r1)     // Catch:{ IOException -> 0x02f7 }
            X.38t r1 = r2.A06     // Catch:{ IOException -> 0x02f7 }
            X.38t r0 = X.C633138t.A0A     // Catch:{ IOException -> 0x02f7 }
            if (r1 != r0) goto L_0x02c1
            r13 = 96
            r15 = 1
            X.5WB r10 = new X.5WB     // Catch:{ IOException -> 0x02f7 }
            r12 = r11
            r14 = r13
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x02f7 }
            X.7KE r3 = X.C107245ax.A06(r10, r3)     // Catch:{ IOException -> 0x02f7 }
            android.graphics.Bitmap r0 = r3.A02     // Catch:{ IOException -> 0x02f7 }
            if (r0 == 0) goto L_0x02c1
            android.graphics.Bitmap r9 = X.C107655bf.A0I(r0, r11, r13, r13)     // Catch:{ IOException -> 0x02f7 }
            r1 = 48
            r0 = 0
            byte[] r8 = X.C105495Ve.A00(r9, r1, r0, r0)     // Catch:{ IOException -> 0x02f7 }
            if (r8 == 0) goto L_0x02c1
            int r0 = r3.A01     // Catch:{ IOException -> 0x02f7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x02f7 }
            int r0 = r3.A00     // Catch:{ IOException -> 0x02f7 }
            android.util.Pair r3 = X.C18290x4.A0K(r1, r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "ThumbnailGenerator/size="
            r1.append(r0)     // Catch:{ IOException -> 0x02f7 }
            int r0 = r8.length     // Catch:{ IOException -> 0x02f7 }
            r1.append(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = " width="
            r1.append(r0)     // Catch:{ IOException -> 0x02f7 }
            int r0 = r9.getWidth()     // Catch:{ IOException -> 0x02f7 }
            r1.append(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = " height="
            r1.append(r0)     // Catch:{ IOException -> 0x02f7 }
            int r0 = r9.getHeight()     // Catch:{ IOException -> 0x02f7 }
            X.C18260x0.A1F(r1, r0)     // Catch:{ IOException -> 0x02f7 }
            X.2QF r1 = new X.2QF     // Catch:{ IOException -> 0x02f7 }
            r1.<init>(r3, r11, r8, r11)     // Catch:{ IOException -> 0x02f7 }
            X.3XB r0 = r4.A05     // Catch:{ IOException -> 0x02f7 }
            r0.A05(r1)     // Catch:{ IOException -> 0x02f7 }
        L_0x02c1:
            X.5LM r1 = r6.A00     // Catch:{ IOException -> 0x02f7 }
            X.8rZ r0 = X.C620033c.A00(r2)     // Catch:{ IOException -> 0x02f7 }
            X.2zt r3 = new X.2zt     // Catch:{ IOException -> 0x02f7 }
            r3.<init>(r0, r1, r2, r7)     // Catch:{ IOException -> 0x02f7 }
            X.33a r1 = r6.A01     // Catch:{ IOException -> 0x02f7 }
            X.2UL r0 = r3.A04     // Catch:{ IOException -> 0x02f7 }
            r1.A0B(r0)     // Catch:{ IOException -> 0x02f7 }
            r4.A02 = r6     // Catch:{ IOException -> 0x02f7 }
            X.1fj r2 = r5.A0H     // Catch:{ IOException -> 0x02f7 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "mediauploadqueue/enqueue "
            X.C18260x0.A1R(r1, r0, r3)     // Catch:{ IOException -> 0x02f7 }
            java.lang.Runnable r3 = r2.A02(r6, r3)     // Catch:{ IOException -> 0x02f7 }
            X.1I5 r3 = (X.AnonymousClass1I5) r3     // Catch:{ IOException -> 0x02f7 }
            r0 = 6
            X.92X r2 = new X.92X     // Catch:{ IOException -> 0x02f7 }
            r2.<init>(r4, r0)     // Catch:{ IOException -> 0x02f7 }
            java.util.concurrent.Executor r1 = r5.A0O     // Catch:{ IOException -> 0x02f7 }
            X.3XB r0 = r3.A0H     // Catch:{ IOException -> 0x02f7 }
            r0.A04(r2, r1)     // Catch:{ IOException -> 0x02f7 }
            return
        L_0x02f4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x02f7 }
            throw r0     // Catch:{ IOException -> 0x02f7 }
        L_0x02f7:
            r1 = move-exception
            java.lang.String r0 = "MediaJobManager/enqueueThumbnailUpload, exception when creating thumbnail file"
            com.whatsapp.util.Log.e(r0, r1)
            r4.A04 = r11
            return
        L_0x0300:
            java.lang.Object r7 = r3.A00
            X.33d r7 = (X.C620133d) r7
            java.lang.Object r6 = r3.A01
            X.1mV r6 = (X.C30471mV) r6
            java.lang.Number r1 = (java.lang.Number) r1
            X.33C r0 = r6.A01
            X.C626936e.A06(r0)
            X.33C r12 = r6.A01
            long r8 = r6.A00
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x033d
            r4 = 0
        L_0x031b:
            r12.A0C = r4
            long r0 = r1.longValue()
            r12.A09 = r0
            X.1io r1 = r7.A0H
            r0 = 8
            r1.A0C(r6, r0)
            long r5 = android.os.SystemClock.uptimeMillis()
            long r1 = r7.A00
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0346
            long r3 = r5 - r1
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0346
            return
        L_0x033d:
            long r4 = r1.longValue()
            r2 = 100
            long r4 = r4 * r2
            long r4 = r4 / r8
            goto L_0x031b
        L_0x0346:
            r7.A00 = r5
            r7.A05()
            return
        L_0x034c:
            java.lang.Object r4 = r3.A00
            X.33d r4 = (X.C620133d) r4
            java.lang.Object r5 = r3.A01
            X.1mV r5 = (X.C30471mV) r5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadManager/DownloadResult/Failed due to expiration of media; mediaHash; message.key="
            X.2z0 r3 = X.C624134x.A08(r5, r0, r1)
            r1.append(r3)
            java.lang.String r0 = ", message.mediaHash = "
            r1.append(r0)
            java.lang.String r0 = r5.A04
            X.C18260x0.A1J(r1, r0)
            X.300 r2 = r4.A0I
            r1 = 11
            r0 = 0
            r2.A01(r0, r3, r1)
            X.2sr r1 = r4.A07
            boolean r0 = r1.A0Y()
            X.33S r2 = r4.A0U
            if (r0 == 0) goto L_0x03c5
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A05(r1)
            X.4uZ r0 = r3.A00
            boolean r0 = r0 instanceof X.C135176kF
            if (r0 == 0) goto L_0x0396
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendMethods/sendMdMessageMediaError skip sending error because jid is gdpr"
        L_0x038e:
            java.lang.String r0 = X.AnonymousClass000.A0P(r5, r0, r1)
        L_0x0392:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0396:
            X.33C r0 = r5.A01
            if (r0 == 0) goto L_0x03bd
            byte[] r0 = r0.A0W
            if (r0 == 0) goto L_0x03bd
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendMethods/sendMdMessageMediaError message:"
            X.C18260x0.A1P(r1, r0, r5)
            X.2gy r3 = r2.A01
            X.33C r0 = X.C30471mV.A00(r5)
            byte[] r2 = r0.A0W
            X.C626936e.A06(r2)
            r1 = 0
            com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob r0 = new com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob
            r0.<init>(r4, r5, r1, r2)
            r3.A02(r0)
            return
        L_0x03bd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendMethods/sendMdMessageMediaError skip sending error since no media key"
            goto L_0x038e
        L_0x03c5:
            r2.A02(r5)
            return
        L_0x03c9:
            java.lang.Object r5 = r3.A01
            X.1mV r5 = (X.C30471mV) r5
            X.2LK r1 = (X.AnonymousClass2LK) r1
            monitor-enter(r5)
            X.33C r4 = X.C30471mV.A00(r5)     // Catch:{ all -> 0x03ea }
            r0 = 0
            r4.A0R = r0     // Catch:{ all -> 0x03ea }
            r0 = 1
            r4.A0c = r0     // Catch:{ all -> 0x03ea }
            r2 = 0
            r4.A0C = r2     // Catch:{ all -> 0x03ea }
            r4.A0M = r0     // Catch:{ all -> 0x03ea }
            boolean r0 = r1.A00     // Catch:{ all -> 0x03ea }
            r4.A0a = r0     // Catch:{ all -> 0x03ea }
            boolean r0 = r1.A01     // Catch:{ all -> 0x03ea }
            r4.A0b = r0     // Catch:{ all -> 0x03ea }
            monitor-exit(r5)     // Catch:{ all -> 0x03ea }
            return
        L_0x03ea:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03ea }
            throw r0
        L_0x03ed:
            java.lang.Object r4 = r3.A00
            X.2xU r4 = (X.C59792xU) r4
            java.lang.Object r3 = r3.A01
            X.2T0 r3 = (X.AnonymousClass2T0) r3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProfilePicturePlainFileDownloadManager/callback/remove downloader from map/jid = "
            r2.append(r0)
            X.4uZ r0 = r3.A03
            r2.append(r0)
            java.lang.String r0 = ", type = "
            r2.append(r0)
            int r0 = r3.A02
            X.C18260x0.A1F(r2, r0)
            java.util.HashMap r2 = r4.A0A
            monitor-enter(r2)
            r2.remove(r1)     // Catch:{ all -> 0x0415 }
            monitor-exit(r2)     // Catch:{ all -> 0x0415 }
            return
        L_0x0415:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0415 }
            throw r0
        L_0x0418:
            java.lang.Object r4 = r3.A00
            X.3Lm r4 = (X.C66453Lm) r4
            java.lang.Object r3 = r3.A01
            X.1mV r3 = (X.C30471mV) r3
            r2 = 0
            X.3Wi r1 = r4.A03
            r0 = 21
            X.C69263Wi.A05(r1, r4, r3, r0)
            monitor-enter(r3)
            X.33C r1 = X.C30471mV.A00(r3)     // Catch:{ all -> 0x0434 }
            r1.A0R = r2     // Catch:{ all -> 0x0434 }
            r0 = 1
            r1.A0c = r0     // Catch:{ all -> 0x0434 }
            monitor-exit(r3)
            return
        L_0x0434:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0437:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x043c:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0444:
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r0.A0G
            X.34x r0 = r0.A01
            if (r0 == 0) goto L_0x044c
            X.2z0 r1 = r0.A1J
        L_0x044c:
            r2.A02 = r1
            androidx.fragment.app.DialogFragment r1 = r2.A00()
        L_0x0452:
            X.03q r0 = r6.A0Q()
            X.C162457s7.A0K(r0, r5)
            X.4FU r0 = (X.AnonymousClass4FU) r0
            r0.Boo(r1)
            return
        L_0x045f:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0464:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0464 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86264Jl.AwB(java.lang.Object):void");
    }
}
