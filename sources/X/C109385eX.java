package X;

import android.view.View;

/* renamed from: X.5eX  reason: invalid class name and case insensitive filesystem */
public class C109385eX implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109385eX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.whatsapp.registration.RegisterName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.whatsapp.registration.RegisterEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.whatsapp.registration.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.whatsapp.registration.ChangeNumberNotifyContacts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: com.whatsapp.registration.EULA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v109, resolved type: com.whatsapp.registration.RegisterName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v110, resolved type: com.whatsapp.registration.RegisterName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v112, resolved type: com.whatsapp.registration.VerifyPhoneNumber} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: com.whatsapp.registration.RegisterEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: com.whatsapp.registration.RegisterEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: com.whatsapp.registration.ChangeNumberNotifyContacts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: com.whatsapp.registration.ChangeNumberNotifyContacts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: com.whatsapp.registration.ChangeNumberNotifyContacts} */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0426, code lost:
        if (r1 == false) goto L_0x0428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d3, code lost:
        r4.A76(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0569, code lost:
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x056c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05a1, code lost:
        r3.A01(r2, r1, 25);
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0641, code lost:
        X.C621433s.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0644, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06d7, code lost:
        r2 = X.AnonymousClass002.A08();
        r2.putString("VERIFY_ANOTHER_WAY_CODE_METHOD", r1);
        r3.A0U().A0n("VERIFY_ANOTHER_WAY_FRAGMENT_RESULT", r2);
        r3.A1L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x06ec, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A01
            r6 = r17
            switch(r0) {
                case 0: goto L_0x01de;
                case 1: goto L_0x0009;
                case 2: goto L_0x0061;
                case 3: goto L_0x0076;
                case 4: goto L_0x01e6;
                case 5: goto L_0x01fa;
                case 6: goto L_0x01de;
                case 7: goto L_0x0286;
                case 8: goto L_0x0286;
                case 9: goto L_0x029c;
                case 10: goto L_0x032c;
                case 11: goto L_0x002c;
                case 12: goto L_0x0099;
                case 13: goto L_0x0334;
                case 14: goto L_0x0045;
                case 15: goto L_0x0360;
                case 16: goto L_0x0011;
                case 17: goto L_0x054d;
                case 18: goto L_0x03d0;
                case 19: goto L_0x03da;
                case 20: goto L_0x03e2;
                case 21: goto L_0x03ff;
                case 22: goto L_0x056d;
                case 23: goto L_0x0576;
                case 24: goto L_0x0590;
                case 25: goto L_0x05aa;
                case 26: goto L_0x0602;
                case 27: goto L_0x00d8;
                case 28: goto L_0x060f;
                case 29: goto L_0x0636;
                case 30: goto L_0x0009;
                case 31: goto L_0x0009;
                case 32: goto L_0x01de;
                case 33: goto L_0x0645;
                case 34: goto L_0x0654;
                case 35: goto L_0x0670;
                case 36: goto L_0x06b8;
                case 37: goto L_0x06cc;
                case 38: goto L_0x06c0;
                case 39: goto L_0x01de;
                case 40: goto L_0x0102;
                case 41: goto L_0x0125;
                case 42: goto L_0x06ed;
                case 43: goto L_0x06f5;
                case 44: goto L_0x0746;
                case 45: goto L_0x0775;
                case 46: goto L_0x057e;
                case 47: goto L_0x077d;
                case 48: goto L_0x0625;
                case 49: goto L_0x0796;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.4ea r0 = (X.C89654ea) r0
            r0.onBackPressed()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r1.A00
            X.5Ty r0 = (X.C105195Ty) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.2nh r3 = r4.A0S
            X.3ZH r0 = r4.A0Z
            X.2k5 r0 = r0.A0F
            java.lang.String r2 = r0.A01
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "smsto:"
            r3.A01(r4, r1, r2, r0)
            goto L_0x00d3
        L_0x002c:
            java.lang.Object r3 = r1.A00
            X.5Ty r3 = (X.C105195Ty) r3
            com.whatsapp.quickcontact.QuickContactActivity r4 = r3.A00
            X.2sj r2 = r4.A0W
            com.whatsapp.jid.GroupJid r1 = r4.A0g
            X.3ZH r0 = r4.A0Z
            X.4uZ r0 = r0.A0H
            X.08M r1 = r2.A03(r0, r1)
            r0 = 276(0x114, float:3.87E-43)
            X.AnonymousClass6C6.A02(r4, r1, r3, r0)
            goto L_0x00d3
        L_0x0045:
            java.lang.Object r0 = r1.A00
            X.5Ty r0 = (X.C105195Ty) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.5hX r2 = r4.A00
            X.36r r1 = X.C86664Kz.A1B()
            X.3ZH r0 = r4.A0Z
            android.content.Intent r0 = r1.A1L(r4, r0)
            android.content.Intent r1 = X.C86654Ky.A0D(r0)
            java.lang.String r0 = "QuickContactActivity"
            r2.A0C(r4, r1, r0)
            goto L_0x00d3
        L_0x0061:
            java.lang.Object r2 = r1.A00
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r2 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r2
            com.whatsapp.qrcode.WaQrScannerView r1 = r2.A06
            X.8vE r0 = r1.A01
            boolean r0 = r0.BqT()
            if (r0 == 0) goto L_0x0010
            r1.Bqx()
            r2.A1K()
            return
        L_0x0076:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r3 = r0.A0Q()
            boolean r0 = r3 instanceof X.C97654yv
            if (r0 == 0) goto L_0x0010
            X.4yv r3 = (X.C97654yv) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerLauncher"
            r2.setClassName(r1, r0)
            r0 = 1
            r3.A0Z = r0
            r0 = 2
            r3.startActivityForResult(r2, r0)
            return
        L_0x0099:
            java.lang.Object r0 = r1.A00
            X.5Ty r0 = (X.C105195Ty) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.1fJ r0 = r4.A0h
            if (r0 == 0) goto L_0x0010
            X.5hX r2 = r4.A00
            X.36r r1 = X.C86664Kz.A1B()
            X.3ZH r0 = r4.A0Z
            android.content.Intent r0 = r1.A1L(r4, r0)
            r2.A0B(r4, r0)
            X.3Ex r5 = r4.A0M
            X.1fJ r6 = r4.A0h
            X.2sj r0 = r4.A0W
            X.2sr r1 = r4.A01
            X.33k r0 = X.C56892sj.A01(r0, r6)
            X.6aS r0 = r0.A02()
            java.util.ArrayList r7 = X.AnonymousClass002.A0J(r0)
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r1)
            r7.remove(r0)
            r8 = 0
            r10 = 1
            r9 = 7
            X.C107305b5.A07(r4, r5, r6, r7, r8, r9, r10)
        L_0x00d3:
            r0 = 0
            r4.A76(r0)
            return
        L_0x00d8:
            java.lang.Object r3 = r1.A00
            com.whatsapp.registration.RegisterName r3 = (com.whatsapp.registration.RegisterName) r3
            r0 = 1
            r3.A1d = r0
            X.2s5 r2 = r3.A1O
            java.lang.String r1 = "profile_photo"
            java.lang.String r0 = "tapped"
            r2.A04(r1, r0)
            X.1m3 r2 = r3.A18
            X.3ZH r1 = r3.A0m
            r0 = 1
            r2.A09(r3, r1, r0, r0)
            X.5rC r1 = r3.A0D
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0010
            r1.A04()
            java.lang.String r0 = "logUserAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0102:
            java.lang.Object r3 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r3 = (com.whatsapp.registration.VerifyCaptcha) r3
            android.widget.ProgressBar r0 = r3.A0B
            r2 = 0
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "captchaRequestLoading"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0112:
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x0010
            com.whatsapp.WaImageView r0 = r3.A0H
            if (r0 != 0) goto L_0x079e
            java.lang.String r0 = "captchaImage"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0125:
            java.lang.Object r8 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r8 = (com.whatsapp.registration.VerifyCaptcha) r8
            r12 = 0
            com.whatsapp.WaImageButton r0 = r8.A0F
            java.lang.String r6 = "captchaAudioBtn"
            if (r0 != 0) goto L_0x0135
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0135:
            r0.setEnabled(r12)
            java.io.File r0 = r8.A0V
            r3 = 1
            if (r0 == 0) goto L_0x01c6
            java.lang.String r4 = "captchaAudioFile"
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x01c6
            android.media.MediaPlayer r0 = r8.A08
            if (r0 != 0) goto L_0x0179
            android.media.MediaPlayer r2 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x07c2 }
            r2.<init>()     // Catch:{ Exception -> 0x07c2 }
            r8.A08 = r2     // Catch:{ Exception -> 0x07c2 }
            X.2oU r0 = r8.A74()     // Catch:{ Exception -> 0x07c2 }
            android.content.Context r1 = r0.A00     // Catch:{ Exception -> 0x07c2 }
            java.io.File r0 = r8.A0V     // Catch:{ Exception -> 0x07c2 }
            if (r0 != 0) goto L_0x015f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)     // Catch:{ Exception -> 0x07c2 }
            throw r0     // Catch:{ Exception -> 0x07c2 }
        L_0x015f:
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x07c2 }
            r2.setDataSource(r1, r0)     // Catch:{ Exception -> 0x07c2 }
            android.media.MediaPlayer r0 = r8.A08     // Catch:{ Exception -> 0x07c2 }
            if (r0 == 0) goto L_0x016d
            r0.prepare()     // Catch:{ Exception -> 0x07c2 }
        L_0x016d:
            android.media.MediaPlayer r1 = r8.A08
            if (r1 == 0) goto L_0x0179
            X.5cZ r0 = new X.5cZ
            r0.<init>(r8)
            r1.setOnCompletionListener(r0)
        L_0x0179:
            android.media.AudioManager r0 = r8.A07
            if (r0 == 0) goto L_0x01bd
            r2 = 3
            int r0 = r0.getStreamVolume(r2)
            float r1 = (float) r0
            android.media.AudioManager r0 = r8.A07
            if (r0 == 0) goto L_0x01bd
            int r0 = r0.getStreamMaxVolume(r2)
            float r0 = (float) r0
            float r1 = r1 / r0
            double r4 = (double) r1
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bd
            android.view.View r2 = r8.A00
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            X.33i r10 = r8.A08
            r1 = 2131887460(0x7f120564, float:1.9409528E38)
            r0 = 3000(0xbb8, float:4.204E-42)
            X.4ab r9 = X.C88694ab.A00(r2, r1, r0)
            X.5fd r7 = new X.5fd
            r7.<init>(r8, r9, r10, r11, r12)
            r2 = 2131888680(0x7f120a28, float:1.9412002E38)
            r1 = 42
            X.5eX r0 = new X.5eX
            r0.<init>(r7, r1)
            r7.A04(r0, r2)
            r7.A01()
        L_0x01bd:
            android.media.MediaPlayer r0 = r8.A08     // Catch:{ Exception -> 0x07d6 }
            if (r0 == 0) goto L_0x0010
            r0.start()     // Catch:{ Exception -> 0x07d6 }
            goto L_0x07d5
        L_0x01c6:
            com.whatsapp.WaImageButton r0 = r8.A0F
            if (r0 != 0) goto L_0x01cf
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x01cf:
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x0010
            com.whatsapp.WaImageButton r0 = r8.A0F
            if (r0 != 0) goto L_0x07e9
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x01de:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x01e6:
            java.lang.Object r1 = r1.A00
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r1 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r1
            r0 = 0
            r1.A07 = r0
            com.whatsapp.qrcode.WaQrScannerView r0 = r1.A06
            if (r0 == 0) goto L_0x01f4
            r0.Bjp()
        L_0x01f4:
            com.whatsapp.qrcode.WaQrScannerView r0 = r1.A06
            r0.Bk5()
            return
        L_0x01fa:
            java.lang.Object r4 = r1.A00
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r4 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r4
            int r1 = r4.A00
            r5 = 1
            if (r1 == 0) goto L_0x0238
            if (r1 == r5) goto L_0x022c
            r0 = 2
            if (r1 != r0) goto L_0x025b
            android.content.Context r3 = r4.A0G()
            java.lang.String r0 = r4.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.36r r2 = X.C86664Kz.A1B()
            com.whatsapp.jid.UserJid r1 = r4.A0G
            if (r0 != 0) goto L_0x0230
            java.lang.String r0 = r4.A0N
            android.content.Intent r0 = r2.A1P(r3, r1, r0)
            r4.A0m(r0)
        L_0x0223:
            X.4FS r1 = r4.A0L
            r0 = 7
            X.C86624Kv.A1L(r1, r4, r0)
            r4.A1K()
        L_0x022c:
            r4.A1K()
            return
        L_0x0230:
            android.content.Intent r0 = X.C86634Kw.A0D(r3, r2, r1)
            X.C57052sz.A00(r0, r4)
            goto L_0x0223
        L_0x0238:
            X.3ZH r0 = r4.A0E
            X.2k5 r0 = r0.A0F
            if (r0 == 0) goto L_0x0262
            X.03q r0 = r4.A0R()
            android.content.Intent r0 = X.C627736r.A00(r0)
            r4.A0m(r0)
            X.36r r2 = X.C86664Kz.A1B()
            android.content.Context r1 = r4.A0G()
            com.whatsapp.jid.UserJid r0 = r4.A0G
            android.content.Intent r0 = X.C86634Kw.A0D(r1, r2, r0)
            X.C57052sz.A00(r0, r4)
            goto L_0x022c
        L_0x025b:
            java.lang.String r0 = "Unhandled type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0262:
            X.5Xw r3 = r4.A0K
            com.whatsapp.jid.UserJid r0 = r4.A0G
            java.lang.String r2 = X.AnonymousClass36P.A06(r0)
            X.C626936e.A06(r2)
            X.3ZH r0 = r4.A0E
            java.lang.String r1 = r0.A0b
            r0 = 0
            android.content.Intent r1 = r3.A03(r2, r1, r5, r0)
            java.lang.String r0 = "finishActivityOnSaveCompleted"
            r1.putExtra(r0, r5)
            r4.startActivityForResult(r1, r5)
            X.5Tk r1 = r4.A0J
            r0 = 11
            r1.A03(r5, r0)
            return
        L_0x0286:
            java.lang.Object r0 = r1.A00
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r0 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r0
            X.03q r2 = r0.A0Q()
            X.36r r1 = X.C86664Kz.A1B()
            X.3ZH r0 = r0.A0E
            android.content.Intent r0 = r1.A1K(r2, r0)
            r2.startActivity(r0)
            return
        L_0x029c:
            java.lang.Object r9 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r9 = (com.whatsapp.quickcontact.QuickContactActivity) r9
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "location_latitude"
            r2 = 0
            double r12 = r1.getDoubleExtra(r0, r2)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "location_longitude"
            double r14 = r1.getDoubleExtra(r0, r2)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0311
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0311
            X.33o r8 = r9.A0i
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "gjid"
            X.4uZ r4 = X.C106405Yw.A01(r1, r0)
            X.C626936e.A06(r4)
            X.3ZH r1 = r9.A0Z
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r7 = X.AnonymousClass3ZH.A05(r1, r0)
            java.lang.Object r6 = r8.A0Q
            monitor-enter(r6)
            java.util.Map r0 = r8.A0B()     // Catch:{ all -> 0x0308 }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x0308 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0308 }
            X.2sH r0 = r8.A0D     // Catch:{ all -> 0x0308 }
            long r4 = r0.A0H()     // Catch:{ all -> 0x0308 }
            if (r1 == 0) goto L_0x0306
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x0308 }
            X.2OP r7 = (X.AnonymousClass2OP) r7     // Catch:{ all -> 0x0308 }
            if (r7 == 0) goto L_0x0306
            long r0 = r7.A00     // Catch:{ all -> 0x0308 }
            boolean r0 = X.C621233o.A02(r0, r4)     // Catch:{ all -> 0x0308 }
            if (r0 == 0) goto L_0x0306
            java.util.Map r1 = r8.A0b     // Catch:{ all -> 0x0308 }
            com.whatsapp.jid.UserJid r0 = r7.A01     // Catch:{ all -> 0x0308 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0308 }
            X.2pX r0 = (X.C54942pX) r0     // Catch:{ all -> 0x0308 }
            monitor-exit(r6)     // Catch:{ all -> 0x0308 }
            goto L_0x030b
        L_0x0306:
            monitor-exit(r6)     // Catch:{ all -> 0x0308 }
            goto L_0x0311
        L_0x0308:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0308 }
            throw r0
        L_0x030b:
            if (r0 == 0) goto L_0x0311
            double r12 = r0.A00
            double r14 = r0.A01
        L_0x0311:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0327
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0327
            X.5ZU r1 = r9.A0O
            X.3ZH r0 = r9.A0Z
            java.lang.String r10 = r1.A0H(r0)
            X.1fd r8 = r9.A0j
            r11 = 0
            r8.A08(r9, r10, r11, r12, r14)
        L_0x0327:
            r0 = 0
            r9.A76(r0)
            return
        L_0x032c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r0 = (com.whatsapp.quickcontact.QuickContactActivity) r0
            com.whatsapp.quickcontact.QuickContactActivity.A0C(r0)
            return
        L_0x0334:
            java.lang.Object r0 = r1.A00
            X.5Ty r0 = (X.C105195Ty) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.3ZF r3 = r4.A0w
            if (r3 == 0) goto L_0x0349
            X.66r r2 = r4.A0F
            r1 = 10
            X.5jl r2 = (X.C112455jl) r2
            r0 = 0
            r2.BJS(r4, r3, r1, r0)
            return
        L_0x0349:
            X.2i6 r2 = r4.A0Y
            if (r2 == 0) goto L_0x0355
            X.66r r1 = r4.A0F
            r0 = 10
            r1.Bpq(r4, r2, r0)
            return
        L_0x0355:
            X.2qk r3 = r4.A03
            java.lang.String r2 = "quickContactDialog "
            r1 = 0
            java.lang.String r0 = "LinkedCallLogPrefetchNotCompletedOnTime"
            r3.A0A(r0, r1, r2)
            return
        L_0x0360:
            java.lang.Object r7 = r1.A00
            X.5Ty r7 = (X.C105195Ty) r7
            com.whatsapp.quickcontact.QuickContactActivity r4 = r7.A00
            X.3ZH r0 = r4.A0Z
            boolean r0 = r0.A0U()
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0399
            X.2so r1 = r4.A0J
            X.1fJ r0 = r4.A0h
            X.1fJ r2 = r1.A01(r0)
            X.2ss r1 = r4.A0V
            X.1fJ r0 = r4.A0h
            boolean r0 = r1.A0N(r0)
            if (r0 == 0) goto L_0x03b8
            if (r2 == 0) goto L_0x03b8
            X.2Vj r0 = r4.A0I
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x03b8
            X.67D r1 = r4.A0K
            android.content.Context r0 = r6.getContext()
            boolean r0 = r1.Bg9(r0, r6, r2)
            if (r0 == 0) goto L_0x03b8
            return
        L_0x0399:
            X.3ZH r0 = r4.A0Z
            X.4uZ r2 = r0.A0H
            boolean r0 = r2 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x03aa
            r1 = 0
            android.content.Intent r0 = X.C627736r.A0f(r4, r2, r5)
            X.AnonymousClass0RN.A00(r4, r0, r1)
            goto L_0x03cc
        L_0x03aa:
            X.2sj r1 = r4.A0W
            com.whatsapp.jid.GroupJid r0 = r4.A0g
            X.08M r1 = r1.A03(r2, r0)
            r0 = 277(0x115, float:3.88E-43)
            X.AnonymousClass6C6.A02(r4, r1, r7, r0)
            goto L_0x03cc
        L_0x03b8:
            X.3ZH r0 = r4.A0Z
            X.4uZ r0 = r0.A0H
            android.content.Intent r1 = X.C627736r.A0g(r4, r0, r5, r3, r5)
            java.lang.Class<com.whatsapp.quickcontact.QuickContactActivity> r0 = com.whatsapp.quickcontact.QuickContactActivity.class
            java.lang.String r0 = r0.getSimpleName()
            X.AnonymousClass5VI.A00(r1, r0)
            r4.startActivity(r1)
        L_0x03cc:
            r4.A76(r3)
            return
        L_0x03d0:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.ChangeNumberNotifyContacts r0 = (com.whatsapp.registration.ChangeNumberNotifyContacts) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A09
            r0.toggle()
            return
        L_0x03da:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.ChangeNumberNotifyContacts r0 = (com.whatsapp.registration.ChangeNumberNotifyContacts) r0
            r0.onRadioButtonClicked(r6)
            return
        L_0x03e2:
            java.lang.Object r3 = r1.A00
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r0 = "changenumberoverview/next"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.ChangeNumber"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            r3.finish()
            return
        L_0x03ff:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.EULA r4 = (com.whatsapp.registration.EULA) r4
            X.33i r0 = r4.A08
            android.telephony.TelephonyManager r1 = r0.A0N()
            r3 = 2
            if (r1 != 0) goto L_0x0415
            java.lang.String r0 = "EULA/cellular-network null"
        L_0x040e:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.C621433s.A01(r4, r3)
            return
        L_0x0415:
            X.5ZR r0 = r4.A0C
            int r2 = X.AnonymousClass321.A01(r1, r0)
            X.1ip r0 = r4.A07
            X.2hc r0 = r0.A0A()
            if (r0 == 0) goto L_0x0428
            boolean r1 = r0.A03
            r0 = 1
            if (r1 != 0) goto L_0x0429
        L_0x0428:
            r0 = 0
        L_0x0429:
            if (r2 != 0) goto L_0x0430
            if (r0 != 0) goto L_0x0430
            java.lang.String r0 = "EULA/cellular-network unknown"
            goto L_0x040e
        L_0x0430:
            X.2jE r0 = r4.A09
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0468
            X.2xP r9 = r4.A0H
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r9.A00
            long r5 = r7 - r0
            long r1 = X.C59742xP.A09
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0468
            r9.A00 = r7
            java.util.List r2 = r9.A08
            java.util.List r1 = r9.A07
            r2.addAll(r1)
            java.util.List r0 = r9.A06
            r2.addAll(r0)
            r1.clear()
            r0.clear()
            X.4FS r2 = r9.A05
            r1 = 24
            X.3Zm r0 = new X.3Zm
            r0.<init>(r9, r1)
            r2.BkM(r0)
        L_0x0468:
            java.lang.String r0 = "EULA/register/eula/accept"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33X r0 = r4.A0L
            r0.A03()
            X.33p r0 = r4.A09
            long r5 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "eula_accepted_time"
            X.C18270x1.A0i(r1, r0, r5)
            X.5J0 r0 = X.AnonymousClass4SG.A2f(r4)
            if (r0 == 0) goto L_0x04a5
            X.2nR r0 = r4.A0G
            boolean r0 = X.AnonymousClass31M.A01(r4, r0)
            if (r0 == 0) goto L_0x04a5
            X.5J0 r0 = X.AnonymousClass4SG.A2f(r4)
            X.C626936e.A06(r0)
            X.2es r5 = r0.A02
            X.8vZ r2 = r5.A01
            r1 = 551497305(0x20df2e59, float:3.780834E-19)
            r0 = 467(0x1d3, float:6.54E-43)
            r2.markerEnd(r1, r0)
            r0 = 0
            r5.A00 = r0
        L_0x04a5:
            X.2bV r1 = r4.A0B
            X.2q4 r0 = r1.A03
            android.content.SharedPreferences r0 = r0.A01()
            java.lang.String r2 = "previously_logged_out_from_primary"
            boolean r0 = X.C18280x3.A1W(r0, r2)
            if (r0 != 0) goto L_0x04ba
            X.2ou r0 = r1.A02
            r0.A00()
        L_0x04ba:
            X.2bV r1 = r4.A0B
            X.2q4 r0 = r1.A03
            android.content.SharedPreferences r0 = r0.A01()
            boolean r0 = X.C18280x3.A1W(r0, r2)
            if (r0 != 0) goto L_0x050c
            X.2ou r0 = r1.A02
            X.20s r2 = r0.A00()
            X.20s r0 = X.C370420s.PHONE
            if (r2 == r0) goto L_0x050c
            X.2lE r0 = r1.A01
            int r1 = r0.A00()
            r0 = 1
            if (r1 == r0) goto L_0x050c
            if (r1 == r3) goto L_0x04ef
            java.lang.String r0 = "fb.running_sapienz"
            java.lang.String r1 = X.C627236i.A03(r0)
            java.lang.String r0 = "true"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x050c
            X.20s r0 = X.C370420s.TABLET
            if (r2 != r0) goto L_0x050c
        L_0x04ef:
            java.lang.String r0 = "EULA/show companion registration flow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = "entry_eula"
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.companionmode.registration.RegisterAsCompanionActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            goto L_0x0569
        L_0x050c:
            X.2mq r0 = r4.A0S
            r0.A00()
            X.317 r0 = r4.A0P
            r10 = 1
            r0.A0B(r10, r10)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r9 = "com.whatsapp.registration.RegisterPhone.phone_number"
            java.lang.String r8 = r0.getStringExtra(r9)
            java.lang.String r7 = "com.whatsapp.registration.RegisterPhone.country_code"
            java.lang.String r6 = r0.getStringExtra(r7)
            java.lang.String r5 = "com.whatsapp.registration.RegisterPhone.clear_phone_number"
            boolean r3 = r0.getBooleanExtra(r5, r10)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            r1.putExtra(r9, r8)
            r1.putExtra(r7, r6)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.resetstate"
            r1.putExtra(r0, r10)
            r1.putExtra(r5, r3)
            r4.startActivity(r1)
            goto L_0x0569
        L_0x054d:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.ChangeNumberNotifyContacts r4 = (com.whatsapp.registration.ChangeNumberNotifyContacts) r4
            java.lang.String r0 = "ChangeNumberNotifyContacts/confirm_change_btn/onClick/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.util.List r0 = r4.A0G
            java.util.ArrayList r1 = X.C627336j.A0A(r0)
            java.lang.String r0 = "selectedJids"
            r2.putStringArrayListExtra(r0, r1)
            r0 = -1
            r4.setResult(r0, r2)
        L_0x0569:
            r4.finish()
            return
        L_0x056d:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.MaacGrantConsentActivity r1 = (com.whatsapp.registration.MaacGrantConsentActivity) r1
            r0 = 0
            r1.A74(r0)
            return
        L_0x0576:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x057e:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.VerifyEmail r4 = (com.whatsapp.registration.VerifyEmail) r4
            java.lang.String r0 = "VerifyEmail/setupNotNowButton/skip verify email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2eI r3 = r4.A74()
            java.lang.String r2 = r4.A0H
            int r1 = r4.A00
            goto L_0x05a1
        L_0x0590:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.RegisterEmail r4 = (com.whatsapp.registration.RegisterEmail) r4
            java.lang.String r0 = "RegisterEmail/setupNotNowButton/skip add email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2eI r3 = r4.A74()
            java.lang.String r2 = r4.A0E
            int r1 = r4.A00
        L_0x05a1:
            r0 = 25
            r3.A01(r2, r1, r0)
            r4.finish()
            return
        L_0x05aa:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.RegisterEmail r4 = (com.whatsapp.registration.RegisterEmail) r4
            com.whatsapp.WaEditText r0 = r4.A01
            if (r0 != 0) goto L_0x05b9
            java.lang.String r0 = "emailInput"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05b9:
            java.lang.String r0 = X.C86644Kx.A0g(r0)
            java.lang.String r2 = X.AnonymousClass2AB.A00(r0)
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS
            boolean r0 = X.C18280x3.A1X(r2, r0)
            if (r0 != 0) goto L_0x05ea
            java.lang.String r0 = "RegisterEmail/executeSetEmailRequest/invalid email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5UY r1 = r4.A09
            if (r1 != 0) goto L_0x05d9
            java.lang.String r0 = "invalidEmailViewStub"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05d9:
            r0 = 0
            r1.A06(r0)
            X.2eI r3 = r4.A74()
            java.lang.String r2 = r4.A0E
            int r1 = r4.A00
            r0 = 5
            r3.A01(r2, r1, r0)
            return
        L_0x05ea:
            r0 = 1
            X.C621433s.A01(r4, r0)
            X.5TX r1 = r4.A04
            if (r1 == 0) goto L_0x05fb
            X.5mP r0 = new X.5mP
            r0.<init>(r4, r2)
            r1.A03(r0, r2)
            return
        L_0x05fb:
            java.lang.String r0 = "emailVerificationXmppMethods"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0602:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            java.lang.String r0 = "RegisterName/clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A79()
            return
        L_0x060f:
            java.lang.Object r1 = r1.A00
            X.4bM r1 = (X.C89024bM) r1
            java.lang.String r0 = "RegisterName/init/stack "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C615631i.A01()
            com.whatsapp.registration.RegisterName r2 = r1.A01
            X.2hd r1 = r2.A0u
            java.lang.String r0 = "regname-init"
            r1.A01(r2, r0)
            return
        L_0x0625:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            int r0 = r1.A75()
            if (r0 == 0) goto L_0x0632
            r0 = 53
            goto L_0x0641
        L_0x0632:
            r1.A7I()
            return
        L_0x0636:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 130(0x82, float:1.82E-43)
            X.C621433s.A00(r1, r0)
            r0 = 126(0x7e, float:1.77E-43)
        L_0x0641:
            X.C621433s.A01(r1, r0)
            return
        L_0x0645:
            java.lang.Object r0 = r1.A00
            X.4bO r0 = (X.C89044bO) r0
            X.68E r0 = (X.AnonymousClass68E) r0
            java.lang.Object r1 = r0.A00
            X.1FB r1 = (X.AnonymousClass1FB) r1
            r0 = 1
            r1.A78(r0)
            return
        L_0x0654:
            java.lang.Object r1 = r1.A00
            X.4bO r1 = (X.C89044bO) r1
            X.68E r1 = (X.AnonymousClass68E) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x066d
            java.lang.String r0 = "ProfileCheckpointRegisterName/restoredialog/skip"
        L_0x0660:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A01(r1, r0)
            return
        L_0x066d:
            java.lang.String r0 = "RegisterName/restoredialog/skip"
            goto L_0x0660
        L_0x0670:
            java.lang.Object r1 = r1.A00
            X.4bO r1 = (X.C89044bO) r1
            X.68E r1 = (X.AnonymousClass68E) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0692
            java.lang.String r0 = "ProfileCheckpointRegisterName/restoredialog/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName r1 = (com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName) r1
            X.0hc r0 = r1.A0E
            boolean r0 = r0.A0n()
            if (r0 == 0) goto L_0x06ad
            X.AnonymousClass4SG.A3f(r1)
            r0 = 1
            r1.A1G = r0
            return
        L_0x0692:
            java.lang.String r0 = "RegisterName/restoredialog/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            X.0hc r0 = r1.A0O
            boolean r0 = r0.A0n()
            if (r0 == 0) goto L_0x06aa
            X.AnonymousClass4SG.A3f(r1)
            r0 = 1
            r1.A1g = r0
            return
        L_0x06aa:
            java.lang.String r0 = "RegisterName/restoredialog/remove"
            goto L_0x06af
        L_0x06ad:
            java.lang.String r0 = "ProfileCheckpointRegisterName/restoredialog/remove"
        L_0x06af:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 103(0x67, float:1.44E-43)
            X.C621433s.A00(r1, r0)
            return
        L_0x06b8:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
            return
        L_0x06c0:
            java.lang.Object r3 = r1.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.String r0 = "VerifyAnotherWayBottomSheetFragment/send-sms"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "sms"
            goto L_0x06d7
        L_0x06cc:
            java.lang.Object r3 = r1.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.String r0 = "VerifyAnotherWayBottomSheetFragment/call-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "voice"
        L_0x06d7:
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_CODE_METHOD"
            r2.putString(r0, r1)
            X.0df r1 = r3.A0U()
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_FRAGMENT_RESULT"
            r1.A0n(r0, r2)
            r3.A1L()
            return
        L_0x06ed:
            java.lang.Object r0 = r1.A00
            X.5fd r0 = (X.C110065fd) r0
            r0.A00()
            return
        L_0x06f5:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r4 = (com.whatsapp.registration.VerifyCaptcha) r4
            com.whatsapp.CodeInputField r0 = r4.A0D
            if (r0 != 0) goto L_0x0704
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0704:
            java.lang.String r7 = r0.getCode()
            X.C162457s7.A0D(r7)
            int r1 = r7.length()
            r0 = 3
            if (r1 == r0) goto L_0x0717
            r0 = 1
            X.C621433s.A01(r4, r0)
            return
        L_0x0717:
            java.lang.String r5 = r4.A0W
            if (r5 != 0) goto L_0x0722
            java.lang.String r0 = "countryCode"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0722:
            java.lang.String r6 = r4.A0X
            if (r6 != 0) goto L_0x072d
            java.lang.String r0 = "phoneNumber"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x072d:
            X.4FS r1 = r4.A04
            X.2sl r3 = r4.A0Q
            if (r3 == 0) goto L_0x073f
            X.55R r2 = new X.55R
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.BkL(r2, r0)
            return
        L_0x073f:
            java.lang.String r0 = "registrationHttpManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0746:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.VerifyEmail r4 = (com.whatsapp.registration.VerifyEmail) r4
            com.whatsapp.CodeInputField r0 = r4.A03
            if (r0 != 0) goto L_0x0755
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0755:
            java.lang.String r3 = r0.getCode()
            X.C162457s7.A0D(r3)
            r0 = 2
            X.C621433s.A01(r4, r0)
            X.5TX r2 = r4.A08
            if (r2 == 0) goto L_0x076e
            r1 = 1
            X.6Bv r0 = new X.6Bv
            r0.<init>(r4, r1)
            r2.A04(r0, r3)
            return
        L_0x076e:
            java.lang.String r0 = "emailVerificationXmppMethods"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0775:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.VerifyEmail r0 = (com.whatsapp.registration.VerifyEmail) r0
            r0.A76()
            return
        L_0x077d:
            java.lang.Object r3 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r3 = (com.whatsapp.registration.VerifyPhoneNumber) r3
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/retryverify"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.CodeInputField r0 = r3.A0Q
            java.lang.String r2 = r0.getCode()
            android.widget.ImageButton r1 = r3.A0J
            r0 = 4
            r1.setVisibility(r0)
            r3.A7z(r2)
            return
        L_0x0796:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r0 = (com.whatsapp.registration.VerifyTwoFactorAuth) r0
            r0.A75()
            return
        L_0x079e:
            r0.setImageBitmap(r2)
            java.lang.String r2 = r3.A0W
            if (r2 != 0) goto L_0x07ac
            java.lang.String r0 = "countryCode"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x07ac:
            java.lang.String r1 = r3.A0X
            if (r1 != 0) goto L_0x07b7
            java.lang.String r0 = "phoneNumber"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x07b7:
            X.4z5 r0 = X.AnonymousClass4SG.A2p(r3)
            r3.A79(r0, r2, r1)
            r3.A77()
            return
        L_0x07c2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyCaptcha/setupCaptchaAudioPlayback/mediaPlayer ex: "
            X.C18260x0.A1Q(r1, r0, r2)
            com.whatsapp.WaImageButton r0 = r8.A0F
            if (r0 != 0) goto L_0x07e9
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x07d5:
            return
        L_0x07d6:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyCaptcha/setupCaptchaAudioPlayback/mediaPlayer.start ex: "
            X.C18260x0.A1Q(r1, r0, r2)
            com.whatsapp.WaImageButton r0 = r8.A0F
            if (r0 != 0) goto L_0x07e9
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x07e9:
            r0.setEnabled(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109385eX.onClick(android.view.View):void");
    }
}
