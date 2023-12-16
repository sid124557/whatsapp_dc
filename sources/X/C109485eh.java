package X;

import android.view.View;

/* renamed from: X.5eh  reason: invalid class name and case insensitive filesystem */
public class C109485eh implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C109485eh(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02c0, code lost:
        r1 = X.AnonymousClass0x9.A09(r0);
        r1.setClass(r3, com.whatsapp.migration.export.service.MessagesExporterService.class);
        r1.putExtra("IS_FIRST_PARTY", false);
        X.AnonymousClass29R.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0333, code lost:
        if (r1 == 0) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03c1, code lost:
        if (r1 == 0) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0757, code lost:
        r2.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x075a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08ac, code lost:
        r0.A0U(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x08af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0929, code lost:
        r2.A04.A04 = X.C18290x4.A0m(r3.A01);
        r2.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0936, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0992, code lost:
        if (r1 == null) goto L_0x0994;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0a6d, code lost:
        if (r2.A08 != null) goto L_0x0a6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0ad7, code lost:
        r2.A0Y((android.content.DialogInterface.OnClickListener) null, r1);
        r2.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0ade, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0148, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014a, code lost:
        r1 = java.lang.Integer.valueOf(r1.A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0152, code lost:
        r0.invoke(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0155, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r2 = r17
            int r0 = r2.A02
            r6 = r18
            switch(r0) {
                case 0: goto L_0x0538;
                case 1: goto L_0x055e;
                case 2: goto L_0x0068;
                case 3: goto L_0x056d;
                case 4: goto L_0x0579;
                case 5: goto L_0x0589;
                case 6: goto L_0x0070;
                case 7: goto L_0x05cf;
                case 8: goto L_0x0626;
                case 9: goto L_0x0632;
                case 10: goto L_0x063e;
                case 11: goto L_0x009d;
                case 12: goto L_0x00c8;
                case 13: goto L_0x0651;
                case 14: goto L_0x0133;
                case 15: goto L_0x013e;
                case 16: goto L_0x0156;
                case 17: goto L_0x067b;
                case 18: goto L_0x06f5;
                case 19: goto L_0x072f;
                case 20: goto L_0x0745;
                case 21: goto L_0x075b;
                case 22: goto L_0x07f7;
                case 23: goto L_0x0847;
                case 24: goto L_0x0897;
                case 25: goto L_0x08a2;
                case 26: goto L_0x017e;
                case 27: goto L_0x018e;
                case 28: goto L_0x08b0;
                case 29: goto L_0x08d1;
                case 30: goto L_0x090a;
                case 31: goto L_0x0913;
                case 32: goto L_0x0009;
                case 33: goto L_0x0009;
                case 34: goto L_0x0937;
                case 35: goto L_0x094b;
                case 36: goto L_0x01a1;
                case 37: goto L_0x023f;
                case 38: goto L_0x02a8;
                case 39: goto L_0x02e8;
                case 40: goto L_0x095c;
                case 41: goto L_0x096c;
                case 42: goto L_0x0978;
                case 43: goto L_0x02f6;
                case 44: goto L_0x036e;
                case 45: goto L_0x045e;
                case 46: goto L_0x04aa;
                case 47: goto L_0x0999;
                case 48: goto L_0x04ea;
                case 49: goto L_0x09b2;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r2.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r0 = r2.A01
            X.34x r0 = (X.C624134x) r0
            X.2z0 r5 = r0.A1J
            X.03q r0 = r4.A0Q()
            if (r0 == 0) goto L_0x0067
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0067
            X.5YG r0 = r4.A1n
            if (r0 == 0) goto L_0x0046
            boolean r0 = r0.A0a()
            if (r0 == 0) goto L_0x0046
            X.5YG r0 = r4.A1n
            r0.A0C()
            X.5YG r0 = r4.A1n
            X.561 r1 = r0.A0A()
            if (r1 == 0) goto L_0x0046
            android.widget.FrameLayout r0 = r1.A0E
            boolean r0 = X.C86604Kt.A1Y(r0)
            if (r0 != 0) goto L_0x0046
            r1.A05()
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A0E(r0)
        L_0x0046:
            r4.A1b()
            X.03q r0 = r4.A0R()
            r3 = 1
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.status.playback.MessageReplyActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "isMediaViewReply"
            r2.putExtra(r0, r3)
            android.content.Intent r0 = X.C107395bF.A00(r2, r5)
            r4.A0m(r0)
        L_0x0067:
            return
        L_0x0068:
            java.lang.Object r0 = r2.A00
            X.4GQ r0 = (X.AnonymousClass4GQ) r0
            java.lang.Object r1 = r2.A01
            goto L_0x0152
        L_0x0070:
            java.lang.Object r5 = r2.A00
            com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment r5 = (com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment) r5
            java.lang.Object r4 = r2.A01
            X.4eZ r4 = (X.C89644eZ) r4
            r3 = 1
            r5.A1L()
            r2 = 0
            X.5Qj r1 = r5.A03
            if (r1 == 0) goto L_0x09fa
            r0 = 0
            r1.A01(r0, r0, r2, r3)
            X.3Ex r2 = r5.A02
            if (r2 == 0) goto L_0x09f3
            X.66R r0 = r5.A06
            long r0 = X.C18290x4.A0D(r0)
            X.3ZH r1 = r2.A04(r0)
            if (r1 == 0) goto L_0x0067
            X.5Qj r0 = r5.A03
            if (r0 == 0) goto L_0x09ec
            r0.A00(r4, r1, r3)
            return
        L_0x009d:
            java.lang.Object r3 = r2.A00
            com.whatsapp.group.GroupAdminPickerActivity r3 = (com.whatsapp.group.GroupAdminPickerActivity) r3
            java.lang.Object r1 = r2.A01
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.view.View r0 = r3.A03
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0067
            float r2 = r1.y
            android.view.View r0 = r3.A02
            float r1 = r0.getY()
            android.view.View r0 = r3.A02
            int r0 = r0.getPaddingTop()
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0067
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A06
            r0 = 4
            r1.A0S(r0)
            return
        L_0x00c8:
            java.lang.Object r5 = r2.A00
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            java.lang.Object r3 = r2.A01
            X.5MG r3 = (X.AnonymousClass5MG) r3
            boolean r0 = X.AnonymousClass4SG.A4A(r5)
            if (r0 == 0) goto L_0x00e5
            X.0zH r2 = X.AnonymousClass5V0.A00(r5)
            r0 = 2131889329(0x7f120cb1, float:1.9413318E38)
            r2.A0T(r0)
            r1 = 2131890046(0x7f120f7e, float:1.9414773E38)
            goto L_0x0ad7
        L_0x00e5:
            boolean r0 = X.AnonymousClass4SG.A49(r5)
            if (r0 != 0) goto L_0x00f2
            r0 = 2131889330(0x7f120cb2, float:1.941332E38)
            r5.Bot(r0)
            return
        L_0x00f2:
            X.3ZH r4 = r5.A19
            boolean r0 = r4.A0g
            r11 = 0
            if (r0 == 0) goto L_0x0a01
            boolean r0 = r5.A0c
            if (r0 != 0) goto L_0x0067
            android.view.Window r0 = r5.getWindow()
            int r9 = r0.getStatusBarColor()
            boolean r0 = X.C107385bE.A05()
            if (r0 == 0) goto L_0x0113
            android.view.Window r0 = r5.getWindow()
            int r11 = r0.getNavigationBarColor()
        L_0x0113:
            r7 = 0
            X.3ZH r0 = r5.A19
            X.4uZ r6 = r0.A0H
            r10 = 0
            r8 = 0
            r13 = r10
            r12 = r10
            android.content.Intent r2 = X.C627736r.A0e(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.4kC r1 = r5.A0j
            r0 = 2131434871(0x7f0b1d77, float:1.8491568E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            android.os.Bundle r1 = X.AnonymousClass5MG.A00(r5, r0, r3)
            r0 = 15
            X.C05680Um.A02(r5, r2, r1, r0)
            return
        L_0x0133:
            java.lang.Object r0 = r2.A00
            X.4X7 r0 = (X.AnonymousClass4X7) r0
            java.lang.Object r1 = r2.A01
            X.0Ua r1 = (X.C05570Ua) r1
            X.4GQ r0 = r0.A02
            goto L_0x0148
        L_0x013e:
            java.lang.Object r0 = r2.A00
            X.4X7 r0 = (X.AnonymousClass4X7) r0
            java.lang.Object r1 = r2.A01
            X.0Ua r1 = (X.C05570Ua) r1
            X.4GQ r0 = r0.A03
        L_0x0148:
            if (r0 == 0) goto L_0x0067
            int r1 = r1.A01()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0152:
            r0.invoke(r1)
            return
        L_0x0156:
            java.lang.Object r1 = r2.A00
            X.4WW r1 = (X.AnonymousClass4WW) r1
            java.lang.Object r0 = r2.A01
            X.0Ua r0 = (X.C05570Ua) r0
            int r4 = r0.A01()
            if (r4 < 0) goto L_0x0067
            X.4UF r3 = r1.A01
            int[] r1 = r1.A03
            int r0 = r1.length
            int r0 = r4 % r0
            r2 = r1[r0]
            X.107 r1 = r3.A01
            int r0 = X.C86604Kt.A05(r1)
            if (r4 == r0) goto L_0x0067
            X.C06270Wx.A03(r1, r4)
            X.107 r0 = r3.A00
            X.C06270Wx.A03(r0, r2)
            return
        L_0x017e:
            java.lang.Object r0 = r2.A00
            com.whatsapp.mediacomposer.doodle.penmode.PenModeView r0 = (com.whatsapp.mediacomposer.doodle.penmode.PenModeView) r0
            java.lang.Object r1 = r2.A01
            X.8on r1 = (X.C182668on) r1
            X.8jC r0 = r0.A00
            if (r0 == 0) goto L_0x0067
            r1.BGm(r0)
            return
        L_0x018e:
            java.lang.Object r3 = r2.A00
            X.6Hj r3 = (X.C125326Hj) r3
            java.lang.Object r0 = r2.A01
            X.0Ua r0 = (X.C05570Ua) r0
            int r1 = r0.A01()
            r0 = -1
            if (r1 == r0) goto L_0x0067
            r3.A0L(r1)
            return
        L_0x01a1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaViewFragment/onClick/audioClick "
            r1.append(r0)
            java.lang.Object r6 = r2.A00
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            int r0 = r6.getProgress()
            r1.append(r0)
            java.lang.String r0 = " | "
            r1.append(r0)
            int r0 = r6.getMax()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.Object r2 = r2.A01
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            int r0 = r2.A01
            X.C18260x0.A1G(r1, r0)
            X.5ZQ r0 = r2.A1g
            if (r0 == 0) goto L_0x0067
            int r0 = r2.A01
            r5 = 2
            r4 = 1
            r3 = 0
            if (r0 != r5) goto L_0x01f9
            int r0 = r6.getProgress()
            if (r0 <= 0) goto L_0x01f9
            int r1 = r6.getProgress()
            int r0 = r6.getMax()
            if (r1 >= r0) goto L_0x01f9
            X.5Td r1 = r2.A1h
            r0 = 2131892619(0x7f12198b, float:1.9419991E38)
            r1.A02(r0)
            X.5mA r0 = r2.A0d
            r0.A04()
            goto L_0x0a24
        L_0x01f9:
            int r0 = r2.A01
            if (r0 != r5) goto L_0x021a
            X.5ZQ r0 = r2.A1g
            int r1 = r0.A02()
            X.5ZQ r0 = r2.A1g
            int r0 = r0.A03()
            if (r1 < r0) goto L_0x0a33
            int r1 = r6.getProgress()
            int r0 = r6.getMax()
            if (r1 != r0) goto L_0x0a33
            r6.setProgress(r3)
            goto L_0x0a2e
        L_0x021a:
            if (r0 != r4) goto L_0x0220
            r2.A1b()
            return
        L_0x0220:
            int r0 = r2.A04
            X.1mV r0 = r2.A1a(r0)
            X.C626936e.A06(r0)
            r2.A1o(r0)
            X.5ZQ r0 = r2.A1g
            if (r0 == 0) goto L_0x0067
            X.5Td r1 = r2.A1h
            r0 = 2131892619(0x7f12198b, float:1.9419991E38)
            r1.A02(r0)
            X.5mA r0 = r2.A0d
            r0.A04()
            goto L_0x0a5b
        L_0x023f:
            java.lang.Object r9 = r2.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r9 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r9
            java.lang.Object r0 = r2.A01
            int r1 = X.AnonymousClass001.A0K(r0)
            r0 = 2
            if (r0 != r1) goto L_0x025a
            java.lang.String r0 = "ExportMigrationActivity/activateContentProviderAndFinishActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 100
            r9.setResult(r0)
        L_0x0256:
            r9.finish()
            return
        L_0x025a:
            r0 = 4
            if (r0 != r1) goto L_0x0285
            X.2j6 r2 = r9.A0G
            java.lang.String r1 = r9.A0J
            r0 = 13
            r2.A00(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExportMigrationActivity/upgradeApp/user-accepted-update; playStoreEnabled: "
            r1.append(r0)
            X.2i5 r0 = r9.A00
            boolean r0 = r0.A01()
            r1.append(r0)
            X.C18280x3.A13(r1)
            X.2i5 r0 = r9.A00
            android.net.Uri r0 = r0.A00()
            X.AnonymousClass1Ha.A1w(r0, r9)
            goto L_0x0256
        L_0x0285:
            X.33p r0 = r9.A09
            boolean r0 = X.C06540Yd.A0K(r0)
            if (r0 != 0) goto L_0x0a84
            X.0hc r0 = r9.A07
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0a84
            java.lang.String r0 = "ExportMigrationActivity/startExport"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2oU r0 = r9.A0A
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "xpm-export-service-startExport()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "ACTION_START_EXPORT"
            goto L_0x02c0
        L_0x02a8:
            java.lang.Object r4 = r2.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r4 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r4
            java.lang.Object r0 = r2.A01
            int r1 = X.AnonymousClass001.A0K(r0)
            r3 = 1
            if (r3 != r1) goto L_0x02d3
            X.2oU r0 = r4.A0A
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "xpm-export-service-cancelExport()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "ACTION_CANCEL_EXPORT"
        L_0x02c0:
            r2 = 0
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)
            java.lang.Class<com.whatsapp.migration.export.service.MessagesExporterService> r0 = com.whatsapp.migration.export.service.MessagesExporterService.class
            r1.setClass(r3, r0)
            java.lang.String r0 = "IS_FIRST_PARTY"
            r1.putExtra(r0, r2)
            X.AnonymousClass29R.A00(r3, r1)
            return
        L_0x02d3:
            r0 = 4
            if (r0 != r1) goto L_0x0067
            r0 = 9
            X.3Zo r2 = new X.3Zo
            r2.<init>(r4, r0)
            r1 = 10
            X.3Zo r0 = new X.3Zo
            r0.<init>(r4, r1)
            r4.A77(r2, r0, r3)
            return
        L_0x02e8:
            java.lang.Object r0 = r2.A00
            X.4W2 r0 = (X.AnonymousClass4W2) r0
            java.lang.Object r1 = r2.A01
            X.8ow r0 = r0.A00
            if (r0 == 0) goto L_0x0067
            r0.BUp(r1)
            return
        L_0x02f6:
            java.lang.Object r3 = r2.A00
            X.4X6 r3 = (X.AnonymousClass4X6) r3
            java.lang.Object r0 = r2.A01
            X.0Ua r0 = (X.C05570Ua) r0
            int r8 = r0.A01()
            if (r8 < 0) goto L_0x0067
            java.util.List r1 = r3.A08
            int r0 = r1.size()
            if (r8 >= r0) goto L_0x0067
            java.lang.Object r1 = r1.get(r8)
            boolean r0 = r1 instanceof X.C96934xH
            if (r0 == 0) goto L_0x0067
            X.4xH r1 = (X.C96934xH) r1
            if (r1 == 0) goto L_0x0067
            X.8jN r6 = r3.A06
            X.1RL r5 = r1.A02
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r6 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r6
            X.4uZ r7 = r5.A05()
            boolean r0 = r7 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0067
            X.4uY r7 = (X.C95804uY) r7
            if (r7 == 0) goto L_0x0067
            java.lang.String r0 = r6.A0L
            if (r0 == 0) goto L_0x0335
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0336
        L_0x0335:
            r0 = 1
        L_0x0336:
            r4 = r0 ^ 1
            X.5YD r3 = r6.A74()
            X.59F r2 = X.AnonymousClass59F.NEWSLETTER_DIRECTORY
            java.lang.StringBuilder r1 = X.C18290x4.A0v(r7)
            java.lang.String r0 = " Item clicked, source: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", position: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", is in search mode: "
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r4)
            X.AnonymousClass5YD.A01(r0)
            r0 = 5
            r3.A06(r7, r0, r8, r4)
            X.4US r0 = r6.A75()
            r1 = 6
            if (r4 == 0) goto L_0x0368
            r1 = 9
        L_0x0368:
            X.5Um r0 = r0.A05
            r0.A03(r6, r5, r1)
            return
        L_0x036e:
            java.lang.Object r3 = r2.A00
            X.4xJ r3 = (X.C96954xJ) r3
            java.lang.Object r2 = r2.A01
            X.4X6 r2 = (X.AnonymousClass4X6) r2
            int r1 = r3.A01()
            r0 = -1
            if (r1 == r0) goto L_0x0067
            X.5UY r0 = r3.A06
            android.view.View r1 = r0.A04()
            X.C162457s7.A0D(r1)
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r1 = r3.A01
            r0 = 4
            r1.setVisibility(r0)
            int r15 = r3.A01()
            boolean r0 = r1.isSelected()
            r1 = r0 ^ 1
            java.util.List r0 = r2.A08
            java.lang.Object r4 = r0.get(r15)
            boolean r0 = r4 instanceof X.C96934xH
            if (r0 == 0) goto L_0x0067
            X.4xH r4 = (X.C96934xH) r4
            if (r4 == 0) goto L_0x0067
            X.8jN r3 = r2.A06
            X.1RL r8 = r4.A02
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r3 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r3
            if (r1 == 0) goto L_0x0422
            X.5YD r9 = r3.A74()
            X.4uY r10 = r8.A0I()
            java.lang.String r0 = r3.A0L
            if (r0 == 0) goto L_0x03c3
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x03c4
        L_0x03c3:
            r0 = 1
        L_0x03c4:
            r2 = r0 ^ 1
            X.59R r0 = r3.A0E
            java.lang.String r13 = r0.A00()
            java.lang.StringBuilder r1 = X.C18270x1.A0X(r10)
            java.lang.String r0 = "Quick follow: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " clicked, position: "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ", is in search mode: "
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r2)
            X.AnonymousClass5YD.A01(r0)
            r0 = 7
            r9.A06(r10, r0, r15, r2)
            if (r2 == 0) goto L_0x041f
            X.59F r11 = X.AnonymousClass59F.NEWSLETTER_DIRECTORY_SEARCH
        L_0x03f1:
            r14 = 0
            r12 = r11
            r9.A0A(r10, r11, r12, r13, r14, r15)
            long r5 = r8.A00
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0405
            r3.A76(r8)
        L_0x0401:
            r0 = 1
            r4.A01 = r0
            return
        L_0x0405:
            java.lang.ref.WeakReference r2 = X.AnonymousClass0x9.A14(r3)
            com.whatsapp.newsletter.viewmodel.NewsletterListViewModel r0 = r3.A0G
            if (r0 != 0) goto L_0x0414
            java.lang.String r0 = "newsletterListViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0414:
            X.5z9 r1 = new X.5z9
            r1.<init>(r8, r2)
            X.2se r0 = r0.A04
            r0.A03(r8, r1)
            goto L_0x0401
        L_0x041f:
            X.59F r11 = X.AnonymousClass59F.NEWSLETTER_DIRECTORY
            goto L_0x03f1
        L_0x0422:
            X.4uY r7 = r8.A0I()
            X.0zH r6 = X.AnonymousClass5V0.A00(r3)
            r5 = 2131894594(0x7f122142, float:1.9423997E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            r1 = 0
            java.lang.String r0 = r8.A0H
            r2[r1] = r0
            X.C86624Kv.A0i(r3, r6, r2, r5)
            r2 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1 = 4
            X.92n r0 = new X.92n
            r0.<init>(r1)
            r6.A0c(r3, r0, r2)
            r1 = 2131894590(0x7f12213e, float:1.942399E38)
            X.5gZ r0 = new X.5gZ
            r0.<init>(r7, r3, r15)
            r6.A0d(r3, r0, r1)
            r1 = 21
            X.5As r0 = new X.5As
            r0.<init>(r7, r1, r3)
            r6.A0b(r3, r0)
            X.C18280x3.A0q(r6)
            goto L_0x0401
        L_0x045e:
            java.lang.Object r3 = r2.A00
            X.4Wr r3 = (X.C87934Wr) r3
            java.lang.Object r0 = r2.A01
            X.0Ua r0 = (X.C05570Ua) r0
            int r1 = r0.A01()
            r0 = -1
            if (r1 == r0) goto L_0x0067
            X.8jP r4 = r3.A02
            java.util.List r0 = r3.A00
            java.lang.Object r0 = r0.get(r1)
            X.5SD r0 = (X.AnonymousClass5SD) r0
            X.59R r3 = r0.A01
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r4 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r4
            X.4Wr r1 = r4.A0D
            if (r1 == 0) goto L_0x0484
            java.lang.String r0 = r4.A0K
            r1.A0K(r3, r0)
        L_0x0484:
            int r2 = r3.ordinal()
            r1 = 1
            r0 = 5
            if (r2 != r0) goto L_0x0b0c
            java.lang.String r3 = r4.A0K
            com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet r2 = new com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "SELECTED_COUNTRY_ISO"
            r1.putString(r0, r3)
            r2.A0u(r1)
            X.7I1 r0 = new X.7I1
            r0.<init>(r4, r2)
            r2.A04 = r0
            r4.Boo(r2)
            return
        L_0x04aa:
            java.lang.Object r3 = r2.A00
            X.4WG r3 = (X.AnonymousClass4WG) r3
            java.lang.Object r0 = r2.A01
            X.0Ua r0 = (X.C05570Ua) r0
            int r0 = r0.A01()
            com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet r1 = r3.A03
            java.lang.Object r0 = r3.A0K(r0)
            X.7Kl r0 = (X.C148977Kl) r0
            java.lang.String r4 = r0.A02
            X.C162457s7.A0C(r4)
            X.7I1 r3 = r1.A04
            if (r3 == 0) goto L_0x0067
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r2 = r3.A00
            java.lang.String r0 = r2.A0K
            boolean r0 = X.C162457s7.A0P(r0, r4)
            if (r0 != 0) goto L_0x04e4
            r2.A0K = r4
            X.4Wr r1 = r2.A0D
            if (r1 == 0) goto L_0x04dc
            X.59R r0 = r2.A0E
            r1.A0K(r0, r4)
        L_0x04dc:
            java.lang.Integer r1 = X.C18280x3.A0S()
            r0 = 0
            r2.A78(r1, r0)
        L_0x04e4:
            com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet r0 = r3.A01
            r0.A1L()
            return
        L_0x04ea:
            java.lang.Object r7 = r2.A00
            X.5mA r7 = (X.C113895mA) r7
            X.1mu r3 = r7.A01()
            if (r3 == 0) goto L_0x0067
            X.2z0 r0 = r3.A1J
            X.4uZ r5 = r0.A00
            if (r5 == 0) goto L_0x0067
            java.lang.Object r1 = r2.A01
            X.8qC r1 = (X.C183538qC) r1
            X.5Xj r0 = X.C86664Kz.A1G(r1)
            r0.A00 = r3
            X.5Xj r0 = X.C86664Kz.A1G(r1)
            r0.A02(r5)
            android.content.Context r6 = r6.getContext()
            X.36r r0 = X.C86664Kz.A1B()
            long r3 = r3.A1L
            android.content.Intent r5 = X.C86634Kw.A0D(r6, r0, r5)
            java.lang.String r2 = "start_t"
            long r0 = android.os.SystemClock.uptimeMillis()
            android.content.Intent r1 = r5.putExtra(r2, r0)
            java.lang.String r0 = "row_id"
            r1.putExtra(r0, r3)
            r6.startActivity(r1)
            X.5pj r1 = r7.A00()
            if (r1 == 0) goto L_0x0067
            int r0 = r1.A05
            int r0 = r0 + 1
            r1.A05 = r0
            return
        L_0x0538:
            java.lang.Object r0 = r2.A00
            X.5IX r0 = (X.AnonymousClass5IX) r0
            java.lang.Object r1 = r2.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            X.65D r0 = r0.A00
            boolean r2 = r1.isChecked()
            X.6BW r0 = (X.AnonymousClass6BW) r0
            int r1 = r0.A01
            java.lang.Object r0 = r0.A00
            switch(r1) {
                case 0: goto L_0x0554;
                case 1: goto L_0x0559;
                default: goto L_0x054f;
            }
        L_0x054f:
            com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment r0 = (com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment) r0
            r0.A01 = r2
            return
        L_0x0554:
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r0 = (com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment) r0
            r0.A06 = r2
            return
        L_0x0559:
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r0 = (com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment) r0
            r0.A05 = r2
            return
        L_0x055e:
            java.lang.Object r1 = r2.A00
            X.653 r1 = (X.AnonymousClass653) r1
            java.lang.Object r0 = r2.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.Ayt()
            r0.dismiss()
            return
        L_0x056d:
            java.lang.Object r0 = r2.A00
            X.1Tz r0 = (X.C23621Tz) r0
            java.lang.Object r1 = r2.A01
            X.4GQ r0 = r0.A02
            r0.invoke(r1)
            return
        L_0x0579:
            java.lang.Object r1 = r2.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r1 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r1
            java.lang.Object r0 = r2.A01
            X.2ix r0 = (X.C50902ix) r0
            X.2UW r0 = r0.A00()
            r1.A1V(r0)
            return
        L_0x0589:
            java.lang.Object r5 = r2.A00
            com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment r5 = (com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment) r5
            java.lang.Object r4 = r2.A01
            android.content.Context r4 = (android.content.Context) r4
            r3 = 8
            X.5Qj r2 = r5.A03
            if (r2 == 0) goto L_0x05c8
            r1 = 0
            r0 = 1
            r2.A01(r1, r1, r3, r0)
            X.3Lk r1 = r5.A04
            if (r1 == 0) goto L_0x05c1
            java.lang.String r0 = "1313491802751163"
            android.net.Uri r0 = r1.A03(r0)
            X.C162457s7.A0D(r0)
            android.content.Intent r1 = X.C18310x6.A0D(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            X.5hX r0 = r5.A00
            if (r0 == 0) goto L_0x05ba
            r0.A0A(r4, r1)
            return
        L_0x05ba:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05c1:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05c8:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05cf:
            java.lang.Object r6 = r2.A00
            com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment r6 = (com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment) r6
            java.lang.Object r5 = r2.A01
            X.4eZ r5 = (X.C89644eZ) r5
            r6.A1L()
            r3 = 2
            X.5Qj r2 = r6.A03
            if (r2 == 0) goto L_0x061f
            r1 = 0
            r0 = 1
            r2.A01(r1, r1, r3, r0)
            X.5Qj r4 = r6.A03
            if (r4 == 0) goto L_0x0618
            X.66R r0 = r6.A05
            java.lang.Object r3 = r0.getValue()
            X.4uZ r3 = (X.C95814uZ) r3
            X.C626936e.A06(r3)
            X.C162457s7.A0D(r3)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r3)
            if (r1 == 0) goto L_0x0615
            X.2sD r0 = r4.A05
            boolean r0 = r0.A09(r1)
            if (r0 == 0) goto L_0x0615
            java.lang.String r2 = "chat_fmx_card_safety_tools_report"
        L_0x0606:
            X.1iB r0 = r4.A02
            X.3XA r1 = r0.A08()
            X.5qI r0 = new X.5qI
            r0.<init>(r5, r4, r3, r2)
            r1.A03(r0)
            return
        L_0x0615:
            java.lang.String r2 = "chat_fmx_card_safety_tools_report_suspicious"
            goto L_0x0606
        L_0x0618:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x061f:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0626:
            java.lang.Object r1 = r2.A00
            X.4Cw r1 = (X.C84574Cw) r1
            java.lang.Object r0 = r2.A01
            X.3ZO r0 = (X.AnonymousClass3ZO) r0
            r1.BP2(r0)
            return
        L_0x0632:
            java.lang.Object r1 = r2.A00
            X.4Cw r1 = (X.C84574Cw) r1
            java.lang.Object r0 = r2.A01
            X.3ZO r0 = (X.AnonymousClass3ZO) r0
            r1.BRL(r0)
            return
        L_0x063e:
            java.lang.Object r1 = r2.A00
            X.4GP r1 = (X.AnonymousClass4GP) r1
            java.lang.Object r0 = r2.A01
            X.0eF r0 = (X.C08310eF) r0
            r1.invoke()
            X.03q r0 = r0.A0R()
            X.C107395bF.A05(r0)
            return
        L_0x0651:
            java.lang.Object r5 = r2.A00
            X.5hX r5 = (X.C111095hX) r5
            java.lang.Object r1 = r2.A01
            X.4Yn r1 = (X.C88384Yn) r1
            r4 = 1
            java.lang.Object r3 = r6.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C162457s7.A0K(r3, r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            android.view.View r0 = r1.A00
            android.content.Context r2 = r0.getContext()
            android.content.Context r1 = r0.getContext()
            java.lang.Integer r0 = X.C18290x4.A0b()
            android.content.Intent r0 = X.C627736r.A0l(r1, r3, r0, r4, r4)
            r5.A0A(r2, r0)
            return
        L_0x067b:
            java.lang.Object r3 = r2.A00
            com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment r3 = (com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment) r3
            java.lang.Object r5 = r2.A01
            android.view.View r5 = (android.view.View) r5
            X.33m r2 = r3.A00
            if (r2 == 0) goto L_0x06ee
            java.lang.String r13 = r3.A09
            X.66R r4 = r3.A0A
            java.lang.Object r10 = r4.getValue()
            X.4uZ r10 = (X.C95814uZ) r10
            X.66R r0 = r3.A0B
            java.lang.Object r9 = r0.getValue()
            com.whatsapp.jid.GroupJid r9 = (com.whatsapp.jid.GroupJid) r9
            X.66R r0 = r3.A0C
            java.lang.String r8 = X.AnonymousClass0x9.A13(r0)
            X.66R r0 = r3.A0D
            java.lang.String r7 = X.AnonymousClass0x9.A13(r0)
            java.lang.String r0 = "UserActions/userActionSendRequestMessage"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2sH r6 = r2.A0V
            long r0 = r6.A0H()
            X.1nT r11 = X.C385328b.A00(r9, r8, r7, r0)
            java.lang.String r0 = ""
            r11.A1Z(r0)
            long r0 = r6.A0H()
            r2.A05(r0)
            X.2Yj r9 = r2.A1c
            X.3YM r12 = new X.3YM
            r12.<init>()
            r14 = 0
            r15 = r0
            X.1mW r1 = r9.A00(r10, r11, r12, r13, r14, r15)
            r2.A0O(r1)
            X.3Lv r0 = r2.A0l
            r0.A0V(r1)
            X.36r r2 = X.C86664Kz.A1B()
            android.content.Context r1 = r5.getContext()
            java.lang.Object r0 = r4.getValue()
            X.4uZ r0 = (X.C95814uZ) r0
            android.content.Intent r0 = X.C86634Kw.A0D(r1, r2, r0)
            r3.A0m(r0)
            X.C18300x5.A1A(r3)
            return
        L_0x06ee:
            java.lang.String r0 = "userActions"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06f5:
            java.lang.Object r0 = r2.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            java.lang.Object r1 = r2.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r1 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r1
            r8 = 1
            r0.dismiss()
            X.66R r0 = r1.A0Q
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r3 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r3
            com.whatsapp.WaEditText r0 = r1.A0A
            r2 = 0
            if (r0 == 0) goto L_0x072d
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x072d
            java.lang.String r4 = r0.toString()
        L_0x0718:
            java.lang.String r5 = r1.A75()
            android.net.Uri[] r7 = r1.A0P
            java.lang.String r6 = r1.A0N
            r3.A0F(r4, r5, r6, r7, r8)
            X.2WS r1 = r1.A74()
            r0 = 18
            r1.A00(r0, r2)
            return
        L_0x072d:
            r4 = r2
            goto L_0x0718
        L_0x072f:
            java.lang.Object r1 = r2.A00
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.Object r0 = r2.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r0 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r0
            r1.dismiss()
            r0.A76()
            X.2WS r2 = r0.A74()
            r1 = 0
            r0 = 19
            goto L_0x0757
        L_0x0745:
            java.lang.Object r1 = r2.A00
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.Object r0 = r2.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r0 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r0
            r1.dismiss()
            X.2WS r2 = r0.A74()
            r1 = 0
            r0 = 20
        L_0x0757:
            r2.A00(r0, r1)
            return
        L_0x075b:
            java.lang.Object r0 = r2.A00
            X.0yr r0 = (X.C19160yr) r0
            java.lang.Object r7 = r2.A01
            X.5dq r7 = (X.C108955dq) r7
            com.whatsapp.inappsupport.ui.SupportTopicsActivity r6 = r0.A00
            java.lang.String r4 = r7.A01
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0799
            java.util.Objects.requireNonNull(r4)
            java.lang.String r3 = r7.A04
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.FaqItemActivityV2"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.util.Objects.requireNonNull(r4)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.FaqItemActivityV2.html_content"
            r1.putExtra(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0793
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.FaqItemActivityV2.url"
            r1.putExtra(r0, r3)
        L_0x0793:
            r0 = 15
            r6.startActivityForResult(r1, r0)
            return
        L_0x0799:
            java.util.ArrayList r3 = r7.A05
            if (r3 == 0) goto L_0x07f3
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x07f3
            android.view.MenuItem r1 = r6.A02
            if (r1 == 0) goto L_0x07ac
            boolean r0 = r7.A06
            r1.setVisible(r0)
        L_0x07ac:
            X.0df r2 = r6.getSupportFragmentManager()
            com.whatsapp.inappsupport.ui.SupportTopicsFragment r5 = new com.whatsapp.inappsupport.ui.SupportTopicsFragment
            r5.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "parent_topic"
            r1.putParcelable(r0, r7)
            java.lang.String r0 = "topics"
            r1.putParcelableArrayList(r0, r3)
            r5.A0u(r1)
            X.0dc r4 = new X.0dc
            r4.<init>(r2)
            java.lang.String r0 = r7.A02
            r4.A0I(r0)
            r3 = 2130772008(0x7f010028, float:1.7147122E38)
            r2 = 2130772009(0x7f010029, float:1.7147124E38)
            r1 = 2130772007(0x7f010027, float:1.714712E38)
            r0 = 2130772010(0x7f01002a, float:1.7147126E38)
            r4.A02 = r3
            r4.A03 = r2
            r4.A05 = r1
            r4.A06 = r0
            r0 = 2131434104(0x7f0b1a78, float:1.8490013E38)
            r4.A0A(r5, r0)
            r4.A01()
            java.util.List r0 = r6.A05
            r0.add(r5)
            return
        L_0x07f3:
            r6.A74(r7)
            return
        L_0x07f7:
            java.lang.Object r3 = r2.A00
            com.whatsapp.inappsupport.ui.SupportVideoActivity r3 = (com.whatsapp.inappsupport.ui.SupportVideoActivity) r3
            java.lang.Object r4 = r2.A01
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 0
            X.6qG r2 = r3.A74()
            X.6qG r0 = r3.A74()
            X.6qL r0 = r0.A0O
            com.google.android.exoplayer2.ui.SubtitleView r0 = r0.A02
            boolean r0 = X.C86604Kt.A1Y(r0)
            r1 = r0 ^ 1
            X.6qL r0 = r2.A0O
            r0.setCaptionsEnabled(r1)
            X.6qG r0 = r3.A74()
            X.6qL r0 = r0.A0O
            com.google.android.exoplayer2.ui.SubtitleView r0 = r0.A02
            int r2 = r0.getVisibility()
            r1 = 2131233949(0x7f080c9d, float:1.808405E38)
            r0 = 2131894153(0x7f121f89, float:1.9423103E38)
            if (r2 != 0) goto L_0x0831
            r1 = 2131233951(0x7f080c9f, float:1.8084054E38)
            r0 = 2131894154(0x7f121f8a, float:1.9423105E38)
        L_0x0831:
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r5)
            r0.show()
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A03(r3, r1, r0)
            r4.setImageDrawable(r0)
            r0 = 4
            r3.A75(r0)
            return
        L_0x0847:
            java.lang.Object r8 = r2.A00
            X.4el r8 = (X.C89704el) r8
            java.lang.Object r1 = r2.A01
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r1 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r1
            r9 = 0
            android.content.Context r0 = r1.getContext()
            java.lang.String r7 = r1.A0D
            if (r7 != 0) goto L_0x085f
            java.lang.String r0 = "videoUrl"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x085f:
            java.lang.String r6 = r1.A0A
            int r5 = r1.A00
            java.lang.String r4 = r1.A0B
            java.lang.String r3 = r1.A0C
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportVideoActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "video_url"
            r2.putExtra(r0, r7)
            if (r6 == 0) goto L_0x0880
            java.lang.String r0 = "captions_url"
            r2.putExtra(r0, r6)
        L_0x0880:
            java.lang.String r0 = "video_start_position"
            r2.putExtra(r0, r5)
            if (r4 == 0) goto L_0x088c
            java.lang.String r0 = "media_group_id"
            r2.putExtra(r0, r4)
        L_0x088c:
            if (r3 == 0) goto L_0x0893
            java.lang.String r0 = "video_locale"
            r2.putExtra(r0, r3)
        L_0x0893:
            r8.startActivityForResult(r2, r9)
            return
        L_0x0897:
            java.lang.Object r0 = r2.A00
            X.4uf r0 = (X.C95864uf) r0
            java.lang.Object r1 = r2.A01
            X.2pX r1 = (X.C54942pX) r1
            X.5i6 r0 = r0.A06
            goto L_0x08ac
        L_0x08a2:
            java.lang.Object r0 = r2.A00
            X.4ue r0 = (X.C95854ue) r0
            java.lang.Object r1 = r2.A01
            X.2pX r1 = (X.C54942pX) r1
            X.5i6 r0 = r0.A04
        L_0x08ac:
            r0.A0U(r1)
            return
        L_0x08b0:
            java.lang.Object r4 = r2.A00
            com.whatsapp.mediacomposer.doodle.textentry.NewTextEntryView r4 = (com.whatsapp.mediacomposer.doodle.textentry.NewTextEntryView) r4
            java.lang.Object r3 = r2.A01
            X.5ng r3 = (X.C114835ng) r3
            X.7Nx r2 = r3.A04
            int r0 = r2.A01
            int r0 = r0 + 1
            int r1 = r0 % 3
            r2.A01 = r1
            X.4vO r0 = r3.A00
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r0.A01
            r0.A09(r1)
            X.5nf r0 = r3.A03
            r0.A00 = r1
            r4.A03(r1)
            return
        L_0x08d1:
            java.lang.Object r4 = r2.A00
            com.whatsapp.mediacomposer.doodle.textentry.NewTextEntryView r4 = (com.whatsapp.mediacomposer.doodle.textentry.NewTextEntryView) r4
            java.lang.Object r3 = r2.A01
            X.5ng r3 = (X.C114835ng) r3
            X.7Nx r0 = r3.A04
            X.5X6 r2 = r0.A03
            int r0 = r2.A02
            int r0 = r0 + 1
            int r1 = r0 % 4
            r2.A02 = r1
            int r0 = r2.A03
            r2.A01(r0, r1)
            X.4vO r0 = r3.A00
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r0.A01
            r0.setBackgroundStyle(r1)
            X.5nf r0 = r3.A03
            r0.A01 = r1
            r3 = 2131233747(0x7f080bd3, float:1.808364E38)
            r0 = 1
            if (r1 != r0) goto L_0x08fe
            r3 = 2131233748(0x7f080bd4, float:1.8083642E38)
        L_0x08fe:
            com.whatsapp.WaImageView r2 = r4.A02
            X.33j r1 = r4.A04
            android.content.Context r0 = r4.getContext()
            X.C18270x1.A0d(r0, r2, r1, r3)
            return
        L_0x090a:
            java.lang.Object r3 = r2.A00
            X.4vO r3 = (X.AnonymousClass4vO) r3
            java.lang.Object r2 = r2.A01
            X.5ng r2 = (X.C114835ng) r2
            goto L_0x0929
        L_0x0913:
            java.lang.Object r3 = r2.A00
            X.4vO r3 = (X.AnonymousClass4vO) r3
            java.lang.Object r2 = r2.A01
            X.5ng r2 = (X.C114835ng) r2
            boolean r0 = r3 instanceof com.whatsapp.mediacomposer.doodle.textentry.TextEntryView
            if (r0 == 0) goto L_0x0929
            r0 = r3
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r0
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r0.A04
            boolean r0 = r0.A06
            r1.A04(r0)
        L_0x0929:
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r3.A01
            java.lang.String r1 = X.C18290x4.A0m(r0)
            X.7Nx r0 = r2.A04
            r0.A04 = r1
            r2.dismiss()
            return
        L_0x0937:
            java.lang.Object r3 = r2.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r3 = (com.whatsapp.mediaview.MediaViewBaseFragment) r3
            java.lang.Object r0 = r2.A01
            X.5eh r0 = (X.C109485eh) r0
            r6.setOnClickListener(r0)
            boolean r0 = r3.A0J
            r1 = r0 ^ 1
            r0 = 1
            r3.A1W(r1, r0)
            return
        L_0x094b:
            java.lang.Object r0 = r2.A00
            X.5Bs r0 = (X.C100645Bs) r0
            java.lang.Object r2 = r2.A01
            X.1mV r2 = (X.C30471mV) r2
            java.lang.Object r1 = r0.A00
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            r0 = 0
            r1.A1r(r2, r0, r0)
            return
        L_0x095c:
            java.lang.Object r1 = r2.A00
            X.4wp r1 = (X.C96724wp) r1
            java.lang.Object r0 = r2.A01
            X.7I0 r0 = (X.AnonymousClass7I0) r0
            X.8oy r1 = r1.A05
            X.3ZH r0 = r0.A00
            r1.BcB(r0)
            return
        L_0x096c:
            java.lang.Object r1 = r2.A00
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r1 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r1
            java.lang.Object r0 = r2.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.onOptionsItemSelected(r0)
            return
        L_0x0978:
            java.lang.Object r0 = r2.A00
            X.4xI r0 = (X.C96944xI) r0
            X.8jO r3 = r0.A00
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r3 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r3
            X.4US r0 = r3.A75()
            X.0Wx r0 = r0.A02
            java.lang.Object r0 = r0.A07()
            X.7N7 r0 = (X.AnonymousClass7N7) r0
            r2 = 0
            if (r0 == 0) goto L_0x0994
            java.lang.String r1 = r0.A02
            r0 = 1
            if (r1 != 0) goto L_0x0995
        L_0x0994:
            r0 = 0
        L_0x0995:
            r3.A78(r2, r0)
            return
        L_0x0999:
            java.lang.Object r3 = r2.A00
            X.5mA r3 = (X.C113895mA) r3
            X.5pj r1 = r3.A00()
            if (r1 == 0) goto L_0x09a6
            r0 = 1
            r1.A0X = r0
        L_0x09a6:
            java.lang.Object r1 = r2.A01
            X.8qC r1 = (X.C183538qC) r1
            android.view.View r0 = r6.getRootView()
            X.C107465bM.A04(r0, r3, r1)
            return
        L_0x09b2:
            java.lang.Object r1 = r2.A00
            X.7LE r1 = (X.AnonymousClass7LE) r1
            java.lang.Object r0 = r2.A01
            X.0Ua r0 = (X.C05570Ua) r0
            X.7I7 r6 = r1.A00
            int r5 = r0.A01()
            X.6Ha r4 = r6.A01
            int r3 = r4.A00
            java.util.List r2 = r4.A03
            java.lang.Object r1 = r2.get(r3)
            X.7LE r1 = (X.AnonymousClass7LE) r1
            r0 = 0
            r1.A02 = r0
            r4.A06(r3)
            r4.A00 = r5
            java.lang.Object r1 = r2.get(r5)
            X.7LE r1 = (X.AnonymousClass7LE) r1
            r0 = 1
            r1.A02 = r0
            r4.A06(r5)
            X.8pA r1 = r6.A00
            java.lang.Object r0 = r2.get(r5)
            X.7LE r0 = (X.AnonymousClass7LE) r0
            r1.Bry(r0, r5)
            return
        L_0x09ec:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x09f3:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x09fa:
            java.lang.String r0 = "fmxManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0a01:
            X.1fJ r2 = r5.A1h
            X.2sj r0 = r5.A0O
            boolean r1 = r0.A0C(r2)
            boolean r0 = r0.A0D(r2)
            if (r1 == 0) goto L_0x0a19
            if (r0 != 0) goto L_0x0a15
            boolean r0 = r4.A14
            if (r0 != 0) goto L_0x0a19
        L_0x0a15:
            r5.A7O()
            return
        L_0x0a19:
            r0 = 2131889326(0x7f120cae, float:1.9413312E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r11)
            r0.show()
            return
        L_0x0a24:
            X.5ZQ r0 = r2.A1g     // Catch:{ IOException -> 0x0a2a }
            r0.A08()     // Catch:{ IOException -> 0x0a2a }
            goto L_0x0a6b
        L_0x0a2a:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/onClick/failed to start from mid pause"
            goto L_0x0a54
        L_0x0a2e:
            X.5ZQ r0 = r2.A1g     // Catch:{ IOException | IllegalStateException -> 0x0a51 }
            r0.A0A(r3)     // Catch:{ IOException | IllegalStateException -> 0x0a51 }
        L_0x0a33:
            X.5Td r1 = r2.A1h
            r0 = 2131892619(0x7f12198b, float:1.9419991E38)
            r1.A02(r0)
            X.5mA r0 = r2.A0d
            r0.A04()
            X.5ZQ r0 = r2.A1g     // Catch:{ IOException -> 0x0a4d }
            r0.A08()     // Catch:{ IOException -> 0x0a4d }
            android.os.Handler r0 = r2.A08
            if (r0 == 0) goto L_0x0a74
            r0.removeMessages(r3)
            goto L_0x0a6f
        L_0x0a4d:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/onClick/failed to start from beginning no reset pause"
            goto L_0x0a54
        L_0x0a51:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/onClick/failed to start from beginning reset pause"
        L_0x0a54:
            com.whatsapp.util.Log.e(r0, r1)
            X.AnonymousClass4SG.A3B(r2)
            return
        L_0x0a5b:
            X.5ZQ r0 = r2.A1g     // Catch:{ IOException -> 0x0a7a }
            r0.A08()     // Catch:{ IOException -> 0x0a7a }
            r2.A1d()
            android.os.Handler r0 = r2.A08
            if (r0 == 0) goto L_0x0a77
            r0.sendEmptyMessage(r3)
            goto L_0x0a77
        L_0x0a6b:
            android.os.Handler r0 = r2.A08
            if (r0 == 0) goto L_0x0a74
        L_0x0a6f:
            android.os.Handler r0 = r2.A08
            r0.sendEmptyMessage(r3)
        L_0x0a74:
            r2.A1d()
        L_0x0a77:
            r2.A01 = r4
            return
        L_0x0a7a:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/onClick/failed to start from unknown"
            com.whatsapp.util.Log.e(r0, r1)
            X.AnonymousClass4SG.A3B(r2)
            return
        L_0x0a84:
            X.2j6 r2 = r9.A0G
            java.lang.String r1 = r9.A0J
            r0 = 18
            r2.A00(r1, r0)
            X.0QJ r0 = r9.A08
            java.util.concurrent.atomic.AtomicLong r0 = r0.A04
            long r0 = r0.get()
            X.0QJ r2 = r9.A08
            java.util.concurrent.atomic.AtomicLong r2 = r2.A05
            long r6 = r2.get()
            r5 = -1
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0b0a
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0b0a
            r2 = 100
            long r2 = r2 * r0
            long r2 = r2 / r6
            int r4 = (int) r2
        L_0x0aad:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ExportMigrationActivity/waitingForRestoreToComplete "
            X.C18260x0.A0x(r2, r3, r4)
            r2 = 2131890841(0x7f121299, float:1.9416385E38)
            java.lang.String r11 = r9.getString(r2)
            r10 = 1
            if (r4 != r5) goto L_0x0adf
            r0 = 2131890839(0x7f121297, float:1.9416381E38)
            java.lang.String r0 = r9.getString(r0)
        L_0x0ac7:
            X.0zH r2 = X.AnonymousClass5V0.A00(r9)
            r2.A0h(r11)
            r2.A0g(r0)
            r2.A0i(r10)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
        L_0x0ad7:
            r0 = 0
            r2.A0Y(r0, r1)
            r2.A0S()
            return
        L_0x0adf:
            X.33j r2 = r9.A00
            java.lang.String r3 = X.AnonymousClass35V.A03(r2, r0)
            r8 = 2131890840(0x7f121298, float:1.9416383E38)
            java.lang.Object[] r5 = X.AnonymousClass0x9.A1X()
            r2 = 0
            r5[r2] = r3
            X.33j r2 = r9.A00
            java.lang.String r2 = X.AnonymousClass35V.A03(r2, r6)
            r5[r10] = r2
            X.33j r2 = r9.A00
            java.text.NumberFormat r4 = r2.A0N()
            double r2 = (double) r0
            double r0 = (double) r6
            double r2 = r2 / r0
            java.lang.String r1 = r4.format(r2)
            r0 = 2
            java.lang.String r0 = X.AnonymousClass002.A0F(r9, r1, r5, r0, r8)
            goto L_0x0ac7
        L_0x0b0a:
            r4 = -1
            goto L_0x0aad
        L_0x0b0c:
            r4.A0E = r3
            X.4US r0 = r4.A75()
            X.47C r0 = r0.A00
            if (r0 == 0) goto L_0x0b19
            r0.cancel()
        L_0x0b19:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0 = 0
            r4.A78(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109485eh.onClick(android.view.View):void");
    }
}
