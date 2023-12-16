package X;

import android.view.View;

/* renamed from: X.39c  reason: invalid class name and case insensitive filesystem */
public class C634039c implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C634039c(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x035a, code lost:
        r1.A0u(com.whatsapp.SingleSelectionDialogFragment.A00(r3, r2, r4, r0));
        r5.Boo(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0364, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03c2, code lost:
        r0 = com.whatsapp.settings.MultiSelectionDialogFragment.A00(r4, r0, r3);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03c6, code lost:
        r5.Boo(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0081, code lost:
        r3.A0a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05be, code lost:
        r2.setClassName(r1, r0);
        r3.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x060e, code lost:
        r5.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0611, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        r4.A00.A0A(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01fd, code lost:
        r4.A74(r0, r3, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0200, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x061c;
                case 1: goto L_0x0612;
                case 2: goto L_0x05db;
                case 3: goto L_0x05c5;
                case 4: goto L_0x05b0;
                case 5: goto L_0x05a3;
                case 6: goto L_0x0594;
                case 7: goto L_0x0585;
                case 8: goto L_0x0576;
                case 9: goto L_0x0567;
                case 10: goto L_0x0558;
                case 11: goto L_0x054a;
                case 12: goto L_0x053b;
                case 13: goto L_0x052b;
                case 14: goto L_0x051b;
                case 15: goto L_0x0150;
                case 16: goto L_0x04f6;
                case 17: goto L_0x04b4;
                case 18: goto L_0x049f;
                case 19: goto L_0x0118;
                case 20: goto L_0x0485;
                case 21: goto L_0x00d3;
                case 22: goto L_0x045c;
                case 23: goto L_0x0452;
                case 24: goto L_0x0448;
                case 25: goto L_0x0438;
                case 26: goto L_0x0429;
                case 27: goto L_0x0419;
                case 28: goto L_0x00a4;
                case 29: goto L_0x03fc;
                case 30: goto L_0x03d2;
                case 31: goto L_0x03ca;
                case 32: goto L_0x03a3;
                case 33: goto L_0x0384;
                case 34: goto L_0x0365;
                case 35: goto L_0x0336;
                case 36: goto L_0x0311;
                case 37: goto L_0x0301;
                case 38: goto L_0x0225;
                case 39: goto L_0x0215;
                case 40: goto L_0x0007;
                case 41: goto L_0x0007;
                case 42: goto L_0x0085;
                case 43: goto L_0x0201;
                case 44: goto L_0x01ef;
                case 45: goto L_0x01c1;
                case 46: goto L_0x01b2;
                case 47: goto L_0x018a;
                case 48: goto L_0x005c;
                case 49: goto L_0x0036;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsHelpV2 r4 = (com.whatsapp.settings.SettingsHelpV2) r4
            X.2oX r2 = r4.A05
            if (r2 == 0) goto L_0x0182
            r0 = 20
            X.1aW r1 = new X.1aW
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.4FV r0 = r2.A00
            r0.BhA(r1)
            r3 = 0
            java.lang.String r2 = "com.bloks.www.csf.whatsapp.gethelp.user"
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportBloksActivity"
            r1.setClassName(r4, r0)
            X.C18310x6.A11(r1, r2, r3)
        L_0x0030:
            X.5hX r0 = r4.A00
            r0.A0A(r4, r1)
        L_0x0035:
            return
        L_0x0036:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0b
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0b
            boolean r0 = r0.isChecked()
            boolean r1 = X.C18320x8.A1W(r1, r0)
            r2.A0i = r1
            X.1R1 r3 = r2.A0c
            java.lang.String r0 = "individual_chat_defaults"
            X.2sa r2 = r3.A0M(r0)
            boolean r0 = r2.A0G
            if (r1 == r0) goto L_0x0035
            r2.A0G = r1
            goto L_0x0081
        L_0x005c:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0a
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0a
            boolean r0 = r0.isChecked()
            boolean r1 = X.C18320x8.A1W(r1, r0)
            r2.A0j = r1
            X.1R1 r3 = r2.A0c
            java.lang.String r0 = "individual_chat_defaults"
            X.2sa r2 = r3.A0M(r0)
            boolean r0 = r2.A0F
            if (r1 == r0) goto L_0x0035
            r2.A0F = r1
        L_0x0081:
            r3.A0a(r2)
            return
        L_0x0085:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsHelpV2 r4 = (com.whatsapp.settings.SettingsHelpV2) r4
            X.2oX r0 = r4.A05
            if (r0 == 0) goto L_0x0635
            android.util.Pair r3 = r0.A00()
            X.3Lk r2 = r4.A0C
            if (r2 == 0) goto L_0x062e
            java.lang.String r1 = "android"
            r0 = 0
            android.net.Uri r0 = r2.A02(r3, r1, r0, r0)
            X.C162457s7.A0D(r0)
            android.content.Intent r1 = X.C18310x6.A0D(r0)
            goto L_0x0030
        L_0x00a4:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r3 = (com.whatsapp.settings.SettingsDataUsageActivity) r3
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0H
            r0.toggle()
            X.33p r1 = r3.A09
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0H
            boolean r2 = r0.isChecked()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "voip_low_data_usage"
            X.C18270x1.A0l(r1, r0, r2)
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0H
            boolean r2 = r0.isChecked()
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            if (r1 == 0) goto L_0x0035
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0035
            com.whatsapp.voipcalling.Voip.setCallLowDataUsage(r2)
            return
        L_0x00d3:
            java.lang.Object r3 = r1.A00
            com.whatsapp.settings.SettingsChat r3 = (com.whatsapp.settings.SettingsChat) r3
            X.2s6 r0 = r3.A06
            X.4Ep r1 = r3.A0Q
            boolean r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0035
            X.2s6 r0 = r3.A06
            boolean r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x0035
            X.1Zl r2 = new X.1Zl
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            java.lang.Integer r0 = X.C18290x4.A0Z()
            r2.A04 = r0
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r2.A02 = r0
            X.3DW r9 = r3.A08
            X.2zf r8 = r3.A07
            X.33j r7 = r3.A00
            X.0XM r5 = r3.A04
            X.5ZR r6 = r3.A07
            X.3Ua r10 = new X.3Ua
            r10.<init>(r2, r3)
            r4 = r3
            X.C06390Xm.A05(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0118:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsChat r5 = (com.whatsapp.settings.SettingsChat) r5
            androidx.appcompat.widget.SwitchCompat r0 = r5.A02
            r0.toggle()
            androidx.appcompat.widget.SwitchCompat r0 = r5.A02
            boolean r4 = r0.isChecked()
            X.1R1 r3 = r5.A0F
            int r2 = X.C18280x3.A00(r4)
            java.lang.String r0 = "individual_chat_defaults"
            X.2sa r1 = r3.A0M(r0)
            int r0 = r1.A01
            if (r2 == r0) goto L_0x013c
            r1.A01 = r2
            r3.A0a(r1)
        L_0x013c:
            if (r4 == 0) goto L_0x0035
            X.4FS r3 = r5.A04
            X.3Dh r2 = r5.A04
            java.util.Objects.requireNonNull(r2)
            r1 = 44
            X.3br r0 = new X.3br
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.BkM(r0)
            return
        L_0x0150:
            java.lang.Object r6 = r1.A00
            com.whatsapp.settings.SettingsCallingPrivacyActivity r6 = (com.whatsapp.settings.SettingsCallingPrivacyActivity) r6
            int r0 = r6.A01
            r5 = 0
            r4 = 5
            r3 = 0
            if (r0 == r4) goto L_0x015c
            r3 = 5
        L_0x015c:
            X.66R r0 = r6.A0A
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x064c
            X.2r7 r2 = r6.A04
            if (r2 == 0) goto L_0x0644
            java.lang.String r1 = "calladd"
            java.lang.String r0 = X.AnonymousClass35B.A03(r1, r3)
            r2.A05(r1, r0)
            if (r3 != r4) goto L_0x0035
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x0035
            r0 = 1
            r6.A08 = r0
            X.3Lq r0 = r6.A06
            if (r0 == 0) goto L_0x063d
            r0.A0C(r5, r5)
            return
        L_0x0182:
            java.lang.String r0 = "supportLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x018a:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsNotifications r5 = (com.whatsapp.settings.SettingsNotifications) r5
            int r4 = r5.A04
            X.33j r1 = r5.A00
            int[] r0 = com.whatsapp.settings.SettingsNotifications.A0r
            java.lang.String[] r3 = r1.A0V(r0)
            r1 = 11
            com.whatsapp.SingleSelectionDialogFragment r2 = new com.whatsapp.SingleSelectionDialogFragment
            r2.<init>()
            r0 = 2131896318(0x7f1227fe, float:1.9427494E38)
            android.os.Bundle r1 = X.C18320x8.A0A(r1, r4, r0)
            java.lang.String r0 = "items"
            r1.putStringArray(r0, r3)
            r2.A0u(r1)
            r5.Boo(r2)
            return
        L_0x01b2:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            r3 = 2131896320(0x7f122800, float:1.9427498E38)
            int r2 = r4.A05
            r1 = 2130903070(0x7f03001e, float:1.7412948E38)
            r0 = 10
            goto L_0x01fd
        L_0x01c1:
            java.lang.Object r5 = r1.A00
            X.4ea r5 = (X.C89654ea) r5
            java.lang.String r4 = "26000003"
            r3 = 0
            r2 = 2131892688(0x7f1219d0, float:1.9420131E38)
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "message_string_res_id"
            r1.putInt(r0, r2)
            java.lang.String r0 = "faq_id"
            r1.putString(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x01e5
            java.lang.String r0 = "faq_section_name"
            r1.putString(r0, r3)
        L_0x01e5:
            com.whatsapp.dialogs.FAQLearnMoreDialogFragment r0 = new com.whatsapp.dialogs.FAQLearnMoreDialogFragment
            r0.<init>()
            r0.A0u(r1)
            goto L_0x03c6
        L_0x01ef:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            r3 = 2131896327(0x7f122807, float:1.9427512E38)
            int r2 = r4.A06
            r1 = 2130903080(0x7f030028, float:1.7412968E38)
            r0 = 9
        L_0x01fd:
            r4.A74(r0, r3, r2, r1)
            return
        L_0x0201:
            java.lang.Object r2 = r1.A00
            X.4ea r2 = (X.C89654ea) r2
            com.whatsapp.settings.SettingsNetworkUsage$ResetUsageConfirmationDialog r1 = new com.whatsapp.settings.SettingsNetworkUsage$ResetUsageConfirmationDialog
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass002.A08()
            r1.A0u(r0)
            r2.Boo(r1)
            return
        L_0x0215:
            java.lang.Object r2 = r1.A00
            X.4eZ r2 = (X.C89644eZ) r2
            X.5X8 r1 = r2.A03
            java.lang.String r0 = "https://www.whatsapp.com/legal/"
            android.net.Uri r0 = r1.A00(r0)
            X.AnonymousClass1Ha.A1w(r0, r2)
            return
        L_0x0225:
            java.lang.Object r6 = r1.A00
            com.whatsapp.settings.SettingsHelpV2 r6 = (com.whatsapp.settings.SettingsHelpV2) r6
            r15 = 0
            X.1ip r0 = r6.A07
            boolean r0 = r0.A0F()
            r4 = 0
            r2 = 1
            if (r0 != 0) goto L_0x026d
            java.lang.String r0 = "about/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 2131892913(0x7f121ab1, float:1.9420588E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 2131888105(0x7f1207e9, float:1.9410836E38)
            java.lang.String r0 = r6.getString(r0)
            r1[r15] = r0
            X.2iE r3 = com.whatsapp.LegacyMessageDialogFragment.A00(r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r0 = 2131891207(0x7f121407, float:1.9417128E38)
            r3.A05 = r0
            r3.A0B = r1
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 13
            X.69A r0 = new X.69A
            r0.<init>(r1)
            r3.A01(r0, r2)
            androidx.fragment.app.DialogFragment r1 = r3.A00()
            X.0df r0 = r6.getSupportFragmentManager()
            r1.A1O(r0, r4)
            return
        L_0x026d:
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = "change_number_new_number_banned"
            r5 = 0
            java.lang.String r3 = r1.getString(r0, r4)
            if (r3 != 0) goto L_0x02a7
            java.lang.String r14 = "settings/about"
        L_0x027d:
            X.1VX r3 = r6.A0D
            r1 = 6296(0x1898, float:8.823E-42)
            X.2vE r0 = X.C58422vE.A02
            int r1 = r3.A0O(r0, r1)
            r0 = 2
            if (r1 != r0) goto L_0x02bb
            X.5hX r4 = r6.A00
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsWithAiActivity"
            r3.setClassName(r1, r0)
            r4.A0A(r6, r3)
            X.2oX r1 = r6.A05
            if (r1 == 0) goto L_0x02b3
            java.lang.String r0 = "settingsHelp"
            r1.A01(r2, r0)
            return
        L_0x02a7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "settings/about/chnum "
            java.lang.String r14 = X.AnonymousClass000.A0V(r0, r3, r1)
            goto L_0x027d
        L_0x02b3:
            java.lang.String r0 = "supportLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02bb:
            X.4FS r1 = r6.A04
            X.5WY r7 = r6.A01
            if (r7 == 0) goto L_0x02f9
            X.33i r9 = r6.A08
            X.2mi r12 = r6.A04
            if (r12 == 0) goto L_0x02f1
            X.5ZR r10 = r6.A03
            if (r10 == 0) goto L_0x02e9
            X.2sl r13 = r6.A09
            if (r13 == 0) goto L_0x02e1
            X.1ip r8 = r6.A07
            X.1tq r4 = new X.1tq
            r11 = r5
            r16 = r2
            r17 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String[] r0 = new java.lang.String[r15]
            r1.BkL(r4, r0)
            return
        L_0x02e1:
            java.lang.String r0 = "registrationHttpManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02e9:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02f1:
            java.lang.String r0 = "supportGatingUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02f9:
            java.lang.String r0 = "sendFeedback"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0301:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.About"
            goto L_0x05be
        L_0x0311:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            X.5W3 r2 = r5.A0J
            X.33p r0 = r2.A01
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "photo_quality"
            int r4 = X.C18280x3.A02(r1, r0)
            X.33j r1 = r2.A02
            int[] r0 = X.AnonymousClass5W3.A03
            java.lang.String[] r3 = r1.A0V(r0)
            r2 = 6
            r0 = 2131893705(0x7f121dc9, float:1.9422194E38)
            com.whatsapp.settings.PhotoQualityConfirmationDialogFragment r1 = new com.whatsapp.settings.PhotoQualityConfirmationDialogFragment
            r1.<init>()
            goto L_0x035a
        L_0x0336:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            X.5W4 r2 = r5.A0L
            X.33p r0 = r2.A01
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "video_quality"
            int r4 = X.C18280x3.A02(r1, r0)
            X.33j r1 = r2.A02
            int[] r0 = X.AnonymousClass5W4.A03
            java.lang.String[] r3 = r1.A0V(r0)
            r2 = 5
            r0 = 2131893779(0x7f121e13, float:1.9422344E38)
            com.whatsapp.settings.VideoQualityConfirmationDialogFragment r1 = new com.whatsapp.settings.VideoQualityConfirmationDialogFragment
            r1.<init>()
        L_0x035a:
            android.os.Bundle r0 = com.whatsapp.SingleSelectionDialogFragment.A00(r3, r2, r4, r0)
            r1.A0u(r0)
            r5.Boo(r1)
            return
        L_0x0365:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            r3 = 2131893582(0x7f121d4e, float:1.9421945E38)
            int r2 = r5.A01
            java.lang.String[] r0 = r5.A0g
            int r0 = r0.length
            boolean[] r4 = new boolean[r0]
            r1 = 0
        L_0x0374:
            r0 = 4
            if (r2 == 0) goto L_0x03c2
            r0 = r2 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r4[r1] = r0
            int r2 = r2 >> 1
            int r1 = r1 + 1
            goto L_0x0374
        L_0x0384:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            r3 = 2131893584(0x7f121d50, float:1.9421949E38)
            int r2 = r5.A02
            java.lang.String[] r0 = r5.A0g
            int r0 = r0.length
            boolean[] r4 = new boolean[r0]
            r1 = 0
        L_0x0393:
            r0 = 3
            if (r2 == 0) goto L_0x03c2
            r0 = r2 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r4[r1] = r0
            int r2 = r2 >> 1
            int r1 = r1 + 1
            goto L_0x0393
        L_0x03a3:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            r3 = 2131893580(0x7f121d4c, float:1.942194E38)
            int r2 = r5.A00
            java.lang.String[] r0 = r5.A0g
            int r0 = r0.length
            boolean[] r4 = new boolean[r0]
            r1 = 0
        L_0x03b2:
            r0 = 2
            if (r2 == 0) goto L_0x03c2
            r0 = r2 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r4[r1] = r0
            int r2 = r2 >> 1
            int r1 = r1 + 1
            goto L_0x03b2
        L_0x03c2:
            com.whatsapp.settings.MultiSelectionDialogFragment r0 = com.whatsapp.settings.MultiSelectionDialogFragment.A00(r4, r0, r3)
        L_0x03c6:
            r5.Boo(r0)
            return
        L_0x03ca:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r0 = (com.whatsapp.settings.SettingsDataUsageActivity) r0
            com.whatsapp.settings.SettingsDataUsageActivity.A0C(r0)
            return
        L_0x03d2:
            java.lang.Object r4 = r1.A00
            X.1qk r4 = (X.C32491qk) r4
            r3 = 2131891095(0x7f121397, float:1.94169E38)
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r4)
            java.lang.String r0 = "newsletter_media_cache_purge_after"
            int r1 = X.C18280x3.A02(r1, r0)
            r0 = 1
            if (r1 == r0) goto L_0x03fa
            r0 = 7
            if (r1 == r0) goto L_0x03f8
            r0 = 30
            r2 = 2
            if (r1 == r0) goto L_0x03f0
            r2 = 3
        L_0x03f0:
            r1 = 7
            r0 = 2130903065(0x7f030019, float:1.7412937E38)
            r4.A74(r1, r3, r2, r0)
            return
        L_0x03f8:
            r2 = 1
            goto L_0x03f0
        L_0x03fa:
            r2 = 0
            goto L_0x03f0
        L_0x03fc:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            java.lang.String r2 = r5.A0b
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsNetworkUsage"
            r4.setClassName(r1, r0)
            if (r2 == 0) goto L_0x060e
            java.lang.String r0 = "search_result_key"
            r4.putExtra(r0, r2)
            goto L_0x060e
        L_0x0419:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsUserProxyActivity"
            goto L_0x05be
        L_0x0429:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            r2 = 0
            r1 = 0
            r0 = 1
            android.content.Intent r0 = X.C627736r.A18(r3, r2, r0, r1)
            r3.startActivity(r0)
            return
        L_0x0438:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsChatHistory"
            goto L_0x05be
        L_0x0448:
            java.lang.Object r1 = r1.A00
            com.whatsapp.settings.SettingsChat r1 = (com.whatsapp.settings.SettingsChat) r1
            X.2z7 r0 = r1.A0B
            r0.A01(r1)
            return
        L_0x0452:
            java.lang.Object r0 = r1.A00
            com.whatsapp.components.WaSwitchView r0 = (com.whatsapp.components.WaSwitchView) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A02
            r0.toggle()
            return
        L_0x045c:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsChat r5 = (com.whatsapp.settings.SettingsChat) r5
            r4 = 0
            java.lang.String r3 = r5.A0L
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.backup.google.SettingsGoogleDrive"
            r2.setClassName(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0479
            r2.setAction(r4)
        L_0x0479:
            if (r3 == 0) goto L_0x0481
            java.lang.String r0 = "search_result_key"
            r2.putExtra(r0, r3)
        L_0x0481:
            r5.startActivity(r2)
            return
        L_0x0485:
            java.lang.Object r5 = r1.A00
            android.content.Context r5 = (android.content.Context) r5
            r3 = 0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity"
            android.content.Intent r4 = r2.setClassName(r1, r0)
            java.lang.String r0 = "chat_jid"
            X.C627336j.A0D(r4, r3, r0)
            goto L_0x060e
        L_0x049f:
            java.lang.Object r4 = r1.A00
            com.whatsapp.settings.SettingsChat r4 = (com.whatsapp.settings.SettingsChat) r4
            java.lang.String[] r0 = r4.A0P
            int r3 = r4.A75(r0)
            r2 = 2131893615(0x7f121d6f, float:1.9422012E38)
            r1 = 2130903056(0x7f030010, float:1.741292E38)
            r0 = 1
            r4.A74(r0, r2, r3, r1)
            return
        L_0x04b4:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsChat r2 = (com.whatsapp.settings.SettingsChat) r2
            X.4xi r0 = r2.A0A
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x04da
            r5 = 0
            r6 = 2131895808(0x7f122600, float:1.942646E38)
            r7 = 2131895809(0x7f122601, float:1.9426461E38)
            r8 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 5
            X.4Hz r3 = new X.4Hz
            r3.<init>(r2, r0)
            r0 = 1
            X.69f r4 = new X.69f
            r4.<init>(r0)
            r2.A6a(r3, r4, r5, r6, r7, r8)
            return
        L_0x04da:
            androidx.appcompat.widget.SwitchCompat r0 = r2.A03
            r0.toggle()
            X.2og r1 = r2.A0A
            androidx.appcompat.widget.SwitchCompat r0 = r2.A03
            boolean r2 = r0.isChecked()
            android.content.SharedPreferences$Editor r1 = X.C54412og.A00(r1)
            java.lang.String r0 = "otp_split_mode_user_choice"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.commit()
            return
        L_0x04f6:
            java.lang.Object r1 = r1.A00
            com.whatsapp.settings.SettingsChat r1 = (com.whatsapp.settings.SettingsChat) r1
            androidx.appcompat.widget.SwitchCompat r0 = r1.A01
            r0.toggle()
            X.33p r3 = r1.A09
            androidx.appcompat.widget.SwitchCompat r0 = r1.A01
            boolean r2 = r0.isChecked()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wa-shared-prefs/setenter-is-send "
            X.C18260x0.A1D(r0, r1, r2)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r3)
            java.lang.String r0 = "input_enter_send"
            X.C18270x1.A0l(r1, r0, r2)
            return
        L_0x051b:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPasskeys"
            goto L_0x05be
        L_0x052b:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsSecurity"
            goto L_0x05be
        L_0x053b:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.autoconf.ShareAutoConfVerifierActivity"
            goto L_0x05be
        L_0x054a:
            java.lang.Object r1 = r1.A00
            X.4ea r1 = (X.C89654ea) r1
            r0 = 15
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r0 = X.C379924v.A00(r0)
            r1.Boo(r0)
            return
        L_0x0558:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.ChangeNumberOverview"
            goto L_0x05be
        L_0x0567:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.delete.DeleteAccountActivity"
            goto L_0x05be
        L_0x0576:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.remove.RemoveAccountActivity"
            goto L_0x05be
        L_0x0585:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsActivity"
            goto L_0x05be
        L_0x0594:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.report.ReportActivity"
            goto L_0x05be
        L_0x05a3:
            java.lang.Object r1 = r1.A00
            X.03q r1 = (X.C003203q) r1
            com.whatsapp.settings.SettingsCompanionLogoutDialog r0 = new com.whatsapp.settings.SettingsCompanionLogoutDialog
            r0.<init>()
            X.C18270x1.A0t(r0, r1)
            return
        L_0x05b0:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.twofactor.SettingsTwoFactorAuthActivity"
        L_0x05be:
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x05c5:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.Settings r2 = (com.whatsapp.settings.Settings) r2
            r1 = 1
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r2.A0t
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x05d7
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r2.A0t
            r0.A02(r1)
        L_0x05d7:
            r2.A74()
            return
        L_0x05db:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.Settings r5 = (com.whatsapp.settings.Settings) r5
            r0 = 23
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A7B(r0)
            X.5rC r1 = r5.A07
            r2 = 0
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x05fb
            r1.A04()
            java.lang.String r0 = "getMessageQRActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x05fb:
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.qrcode.contactqr.ContactQrActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "scan"
            r4.putExtra(r0, r2)
        L_0x060e:
            r5.startActivity(r4)
            return
        L_0x0612:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.Settings r0 = (com.whatsapp.settings.Settings) r0
            com.whatsapp.WaImageView r0 = r0.A0K
            r0.callOnClick()
            return
        L_0x061c:
            java.lang.Object r2 = r1.A00
            X.4ea r2 = (X.C89654ea) r2
            r1 = 1
            java.lang.String r0 = "Settings/showAccountSwitcher"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r0 = X.C379924v.A00(r1)
            r2.Boo(r0)
            return
        L_0x062e:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0635:
            java.lang.String r0 = "supportLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x063d:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0644:
            java.lang.String r0 = "privacySettingManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x064c:
            r6.A01 = r3
            r6.A74()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C634039c.onClick(android.view.View):void");
    }
}
