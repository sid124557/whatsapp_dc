package X;

import android.view.View;
import com.whatsapp.settings.SettingsPrivacy;

/* renamed from: X.39d  reason: invalid class name and case insensitive filesystem */
public class C634139d implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C634139d(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C634139d(obj, i));
    }

    public static void A01(SettingsPrivacy settingsPrivacy, Integer num, String str, int i) {
        Integer valueOf = Integer.valueOf(SettingsPrivacy.A0C(i, str.equals(settingsPrivacy.A0v)));
        AnonymousClass1XW r1 = new AnonymousClass1XW();
        r1.A00 = valueOf;
        r1.A01 = num;
        settingsPrivacy.A0b.BhA(r1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.whatsapp.settings.SettingsSecurity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: com.whatsapp.settings.SettingsUserProxyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: com.whatsapp.settings.SettingsSecurity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: com.whatsapp.settings.SettingsSecurity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v63, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v65, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v68, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v69, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: com.whatsapp.settings.SettingsUserProxyActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: com.whatsapp.settings.SettingsUserProxyActivity} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x04ce, code lost:
        r4.putExtra(r0, r2);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x04ee, code lost:
        r3.startActivityForResult(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x04f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008e, code lost:
        r1 = java.lang.String.valueOf(r0);
        r5.setText("");
        r5.append(r1);
        r3 = X.AnonymousClass5V0.A00(r4);
        r3.A0U(r8);
        r3.A0a(r7);
        r3.A0d(r4, new X.AnonymousClass3AY(r2, r5, r4, r6), com.whatsapp.R.string.f11nameremoved);
        r3.A0c(r4, new X.AnonymousClass5BX(5), com.whatsapp.R.string.f11nameremoved);
        r0 = X.C18300x5.A0H(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00c1, code lost:
        r2.setVisibility(0);
        r2.setText(com.whatsapp.R.string.f11nameremoved);
        r1 = r4.A05;
        r2.setChecked(((com.whatsapp.settings.SettingsSetupUserProxyViewModel) r1.getValue()).A0D().A06);
        r0 = ((com.whatsapp.settings.SettingsSetupUserProxyViewModel) r1.getValue()).A0D().A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x055a, code lost:
        r4.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x055d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0568, code lost:
        r1.setChecked(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x056b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x067e, code lost:
        r4.setClassName(r1, r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0681, code lost:
        r3.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0684, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0133, code lost:
        r3.A0a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0136, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r2.A1U(X.C18300x5.A0v(r2.A0x.A03.A03), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01f0, code lost:
        r4.startActivityForResult(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x024a, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x024d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02e7, code lost:
        r4.A74(r0, r3, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02fa, code lost:
        r4 = X.AnonymousClass0x9.A09("android.intent.action.RINGTONE_PICKER");
        r4.putExtra("android.intent.extra.ringtone.TITLE", r1);
        r4.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
        r4.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        r4.putExtra("android.intent.extra.ringtone.DEFAULT_URI", android.provider.Settings.System.DEFAULT_NOTIFICATION_URI);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0317, code lost:
        if (r6 == null) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x031f, code lost:
        if (r6.equals("Silent") != false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0321, code lost:
        r1 = android.net.Uri.parse(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0325, code lost:
        if (r1 == null) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0327, code lost:
        r4.putExtra("android.intent.extra.ringtone.EXISTING_URI", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0336, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") == false) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0338, code lost:
        r4.putExtra("android.intent.extra.ringtone.TYPE", 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x033c, code lost:
        r3.startActivityForResult(android.content.Intent.createChooser(r4, (java.lang.CharSequence) null), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0344, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0345, code lost:
        r4.putExtra("android.intent.extra.ringtone.TYPE", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        r7 = X.C18310x6.A0H(android.view.LayoutInflater.from(r4), com.whatsapp.R.layout.f8nameremoved);
        r5 = (com.whatsapp.WaEditText) X.C18280x3.A0E(r7, com.whatsapp.R.id.proxy_port);
        r5.setFilters(new X.AnonymousClass39Y[]{new X.AnonymousClass39Y(0, 65535)});
        r2 = (android.widget.CheckBox) X.C18280x3.A0E(r7, com.whatsapp.R.id.proxy_use_tls);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0079, code lost:
        if (r6 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007b, code lost:
        r2.setVisibility(8);
        r0 = ((com.whatsapp.settings.SettingsSetupUserProxyViewModel) r4.A05.getValue()).A0D().A01;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x00e8;
                case 1: goto L_0x0257;
                case 2: goto L_0x0268;
                case 3: goto L_0x0283;
                case 4: goto L_0x0292;
                case 5: goto L_0x02a1;
                case 6: goto L_0x010e;
                case 7: goto L_0x02c9;
                case 8: goto L_0x02d9;
                case 9: goto L_0x02eb;
                case 10: goto L_0x0349;
                case 11: goto L_0x0137;
                case 12: goto L_0x036b;
                case 13: goto L_0x017b;
                case 14: goto L_0x0387;
                case 15: goto L_0x03a4;
                case 16: goto L_0x03c1;
                case 17: goto L_0x03d8;
                case 18: goto L_0x03f3;
                case 19: goto L_0x0411;
                case 20: goto L_0x046c;
                case 21: goto L_0x048d;
                case 22: goto L_0x001a;
                case 23: goto L_0x04aa;
                case 24: goto L_0x04d3;
                case 25: goto L_0x04f2;
                case 26: goto L_0x050a;
                case 27: goto L_0x0535;
                case 28: goto L_0x0543;
                case 29: goto L_0x055e;
                case 30: goto L_0x003a;
                case 31: goto L_0x0043;
                case 32: goto L_0x01b5;
                case 33: goto L_0x056c;
                case 34: goto L_0x0591;
                case 35: goto L_0x05e6;
                case 36: goto L_0x05f2;
                case 37: goto L_0x0605;
                case 38: goto L_0x0618;
                case 39: goto L_0x0653;
                case 40: goto L_0x0666;
                case 41: goto L_0x06ca;
                case 42: goto L_0x066e;
                case 43: goto L_0x0685;
                case 44: goto L_0x0696;
                case 45: goto L_0x06a6;
                case 46: goto L_0x06ba;
                case 47: goto L_0x06c2;
                case 48: goto L_0x024e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A00
            X.5pH r0 = (X.C115815pH) r0
            com.whatsapp.status.StatusesFragment r2 = r0.A02
            r1 = 0
        L_0x000c:
            X.5Oo r0 = r2.A0x
            X.3Gm r0 = r0.A03
            java.util.Map r0 = r0.A03
            java.util.ArrayList r0 = X.C18300x5.A0v(r0)
            r2.A1U(r0, r1)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r2 = X.C18290x4.A0a()
            int r1 = r4.A00
            java.lang.String r0 = "privacy_groups"
            A01(r4, r2, r0, r1)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAddPrivacyActivity"
            r2.setClassName(r1, r0)
            r0 = 1
            goto L_0x01f0
        L_0x003a:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsSetupUserProxyActivity r4 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r4
            r6 = 0
            r8 = 2131892792(0x7f121a38, float:1.9420342E38)
            goto L_0x004b
        L_0x0043:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsSetupUserProxyActivity r4 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r4
            r6 = 1
            r8 = 2131892793(0x7f121a39, float:1.9420344E38)
        L_0x004b:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131625849(0x7f0e0779, float:1.8878918E38)
            android.view.View r7 = X.C18310x6.A0H(r1, r0)
            r0 = 2131432751(0x7f0b152f, float:1.8487268E38)
            android.view.View r5 = X.C18280x3.A0E(r7, r0)
            com.whatsapp.WaEditText r5 = (com.whatsapp.WaEditText) r5
            r0 = 1
            X.39Y[] r3 = new X.AnonymousClass39Y[r0]
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = 0
            X.39Y r0 = new X.39Y
            r0.<init>(r1, r2)
            r3[r1] = r0
            r5.setFilters(r3)
            r0 = 2131432756(0x7f0b1534, float:1.8487278E38)
            android.view.View r2 = X.C18280x3.A0E(r7, r0)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            if (r6 == 0) goto L_0x00c1
            r0 = 8
            r2.setVisibility(r0)
            X.66R r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.2zS r0 = r0.A0D()
            int r0 = r0.A01
        L_0x008e:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = ""
            r5.setText(r0)
            r5.append(r1)
            X.0zH r3 = X.AnonymousClass5V0.A00(r4)
            r3.A0U(r8)
            r3.A0a(r7)
            r1 = 2131893273(0x7f121c19, float:1.9421318E38)
            X.3AY r0 = new X.3AY
            r0.<init>(r2, r5, r4, r6)
            r3.A0d(r4, r0, r1)
            r2 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1 = 5
            X.5BX r0 = new X.5BX
            r0.<init>(r1)
            r3.A0c(r4, r0, r2)
            X.043 r0 = X.C18300x5.A0H(r3)
            goto L_0x024a
        L_0x00c1:
            r2.setVisibility(r1)
            r0 = 2131892795(0x7f121a3b, float:1.9420348E38)
            r2.setText(r0)
            X.66R r1 = r4.A05
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.2zS r0 = r0.A0D()
            boolean r0 = r0.A06
            r2.setChecked(r0)
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.2zS r0 = r0.A0D()
            int r0 = r0.A00
            goto L_0x008e
        L_0x00e8:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0Z
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0Z
            boolean r0 = r0.isChecked()
            boolean r1 = X.C18320x8.A1W(r1, r0)
            r2.A0i = r1
            X.1R1 r3 = r2.A0c
            java.lang.String r0 = "group_chat_defaults"
            X.2sa r2 = r3.A0M(r0)
            boolean r0 = r2.A0G
            if (r1 == r0) goto L_0x0019
            r2.A0G = r1
            goto L_0x0133
        L_0x010e:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0Y
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0Y
            boolean r0 = r0.isChecked()
            boolean r1 = X.C18320x8.A1W(r1, r0)
            r2.A0h = r1
            X.1R1 r3 = r2.A0c
            java.lang.String r0 = "group_chat_defaults"
            X.2sa r2 = r3.A0M(r0)
            boolean r0 = r2.A0F
            if (r1 == r0) goto L_0x0019
            r2.A0F = r1
        L_0x0133:
            r3.A0a(r2)
            return
        L_0x0137:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r4 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r4
            X.03q r3 = r4.A0Q()
            if (r3 != 0) goto L_0x0146
            java.lang.String r0 = "SettingsPasskeys/no activity bound"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0146:
            X.AnonymousClass0x9.A1L(r3)
            if (r3 == 0) goto L_0x0019
            X.66R r0 = r4.A01
            X.5OE r2 = X.C18300x5.A0V(r0)
            r1 = 0
            r0 = 12
            r2.A00(r1, r0)
            X.0zH r2 = X.AnonymousClass5V0.A00(r3)
            r0 = 2131893704(0x7f121dc8, float:1.9422192E38)
            r2.A0U(r0)
            r0 = 2131893703(0x7f121dc7, float:1.942219E38)
            r2.A0T(r0)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 191(0xbf, float:2.68E-43)
            X.C19340zH.A03(r4, r2, r0, r1)
            r1 = 2131893702(0x7f121dc6, float:1.9422188E38)
            r0 = 192(0xc0, float:2.69E-43)
            X.C19340zH.A04(r4, r2, r0, r1)
            r2.A0S()
            return
        L_0x017b:
            java.lang.Object r5 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r5 = (com.whatsapp.settings.SettingsPrivacy) r5
            java.lang.Integer r2 = X.C18290x4.A0c()
            int r1 = r5.A00
            java.lang.String r0 = "wcs_read_receipts"
            A01(r5, r2, r0, r1)
            androidx.appcompat.widget.SwitchCompat r0 = r5.A0Q
            boolean r0 = r0.isChecked()
            r4 = r0 ^ 1
            java.lang.String r3 = "all"
            if (r4 != 0) goto L_0x019a
            java.lang.String r3 = "none"
        L_0x019a:
            java.lang.String r2 = "readreceipts"
            X.2qc r1 = r5.A0j
            r0 = 1
            r1.A04(r0)
            X.2r7 r0 = r5.A0R
            boolean r0 = r0.A05(r2, r3)
            if (r0 == 0) goto L_0x0019
            if (r4 == 0) goto L_0x0019
            X.4FS r1 = r5.A04
            r0 = 10
            X.C71293bs.A00(r1, r5, r0)
            return
        L_0x01b5:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsUserProxyActivity r4 = (com.whatsapp.settings.SettingsUserProxyActivity) r4
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r4.A09
            boolean r1 = r0.A0H()
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r4.A09
            if (r1 == 0) goto L_0x01fb
            java.lang.String r1 = r0.A02
            if (r1 != 0) goto L_0x01f4
            X.2zS r3 = new X.2zS
            r3.<init>()
        L_0x01cc:
            java.lang.Class<com.whatsapp.settings.SettingsSetupUserProxyActivity> r0 = com.whatsapp.settings.SettingsSetupUserProxyActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r4, r0)
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "intent_host_name"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "intent_chat_port"
            int r0 = r3.A00
            r2.putExtra(r1, r0)
            java.lang.String r1 = "intent_media_port"
            int r0 = r3.A01
            r2.putExtra(r1, r0)
            java.lang.String r1 = "intent_use_tls"
            boolean r0 = r3.A06
            r2.putExtra(r1, r0)
            r0 = 10001(0x2711, float:1.4014E-41)
        L_0x01f0:
            r4.startActivityForResult(r2, r0)
            return
        L_0x01f4:
            X.2rm r0 = r0.A0E
            X.2zS r3 = X.C385528d.A00(r0, r1)
            goto L_0x01cc
        L_0x01fb:
            X.2yZ r0 = r0.A0F
            X.2rm r0 = r0.A00
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0019
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131625848(0x7f0e0778, float:1.8878916E38)
            android.view.View r1 = X.C18310x6.A0H(r1, r0)
            r0 = 2131432750(0x7f0b152e, float:1.8487266E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r1, r0)
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r4.A09
            X.08M r0 = r0.A05
            java.lang.Object r0 = r0.A07()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            X.0zH r3 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131892788(0x7f121a34, float:1.9420334E38)
            r3.A0U(r0)
            r3.A0a(r1)
            r1 = 2131893273(0x7f121c19, float:1.9421318E38)
            r0 = 19
            X.C19340zH.A09(r3, r2, r4, r0, r1)
            r2 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1 = 14
            X.69A r0 = new X.69A
            r0.<init>(r1)
            r3.A0W(r0, r2)
            X.043 r0 = r3.create()
        L_0x024a:
            r0.show()
            return
        L_0x024e:
            java.lang.Object r0 = r9.A00
            X.5pH r0 = (X.C115815pH) r0
            com.whatsapp.status.StatusesFragment r2 = r0.A02
            r1 = 1
            goto L_0x000c
        L_0x0257:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsNotifications r3 = (com.whatsapp.settings.SettingsNotifications) r3
            r0 = 2131896322(0x7f122802, float:1.9427502E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0f
            r5 = 7
            r2 = 2
            goto L_0x02fa
        L_0x0268:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0X
            r0.toggle()
            X.33p r1 = r2.A09
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0X
            boolean r2 = r0.isChecked()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "conversation_sound"
            X.C18270x1.A0l(r1, r0, r2)
            return
        L_0x0283:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            r3 = 2131896327(0x7f122807, float:1.9427512E38)
            int r2 = r4.A03
            r1 = 2130903080(0x7f030028, float:1.7412968E38)
            r0 = 12
            goto L_0x02e7
        L_0x0292:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            r3 = 2131896320(0x7f122800, float:1.9427498E38)
            int r2 = r4.A02
            r1 = 2130903070(0x7f03001e, float:1.7412948E38)
            r0 = 13
            goto L_0x02e7
        L_0x02a1:
            java.lang.Object r5 = r9.A00
            com.whatsapp.settings.SettingsNotifications r5 = (com.whatsapp.settings.SettingsNotifications) r5
            int r4 = r5.A01
            X.33j r1 = r5.A00
            int[] r0 = com.whatsapp.settings.SettingsNotifications.A0r
            java.lang.String[] r3 = r1.A0V(r0)
            r1 = 14
            com.whatsapp.SingleSelectionDialogFragment r2 = new com.whatsapp.SingleSelectionDialogFragment
            r2.<init>()
            r0 = 2131896318(0x7f1227fe, float:1.9427494E38)
            android.os.Bundle r1 = X.C18320x8.A0A(r1, r4, r0)
            java.lang.String r0 = "items"
            r1.putStringArray(r0, r3)
            r2.A0u(r1)
            r5.Boo(r2)
            return
        L_0x02c9:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsNotifications r3 = (com.whatsapp.settings.SettingsNotifications) r3
            r0 = 2131896305(0x7f1227f1, float:1.9427468E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0e
            r5 = 1
            r2 = 3
            goto L_0x02fa
        L_0x02d9:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            r3 = 2131896327(0x7f122807, float:1.9427512E38)
            int r2 = r4.A00
            r1 = 2130903080(0x7f030028, float:1.7412968E38)
            r0 = 15
        L_0x02e7:
            r4.A74(r0, r3, r2, r1)
            return
        L_0x02eb:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsNotifications r3 = (com.whatsapp.settings.SettingsNotifications) r3
            r0 = 2131896322(0x7f122802, float:1.9427502E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0g
            r5 = 7
            r2 = 1
        L_0x02fa:
            java.lang.String r0 = "android.intent.action.RINGTONE_PICKER"
            android.content.Intent r4 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "android.intent.extra.ringtone.TITLE"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.ringtone.SHOW_SILENT"
            r1 = 1
            r4.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.ringtone.SHOW_DEFAULT"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "android.intent.extra.ringtone.DEFAULT_URI"
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            r4.putExtra(r1, r0)
            if (r6 == 0) goto L_0x032c
            java.lang.String r0 = "Silent"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x032c
            android.net.Uri r1 = android.net.Uri.parse(r6)
            if (r1 == 0) goto L_0x032c
            java.lang.String r0 = "android.intent.extra.ringtone.EXISTING_URI"
            r4.putExtra(r0, r1)
        L_0x032c:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r1.equalsIgnoreCase(r0)
            java.lang.String r1 = "android.intent.extra.ringtone.TYPE"
            if (r0 == 0) goto L_0x0345
            r0 = 2
            r4.putExtra(r1, r0)
        L_0x033c:
            r0 = 0
            android.content.Intent r0 = android.content.Intent.createChooser(r4, r0)
            r3.startActivityForResult(r0, r2)
            return
        L_0x0345:
            r4.putExtra(r1, r5)
            goto L_0x033c
        L_0x0349:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPasskeysDisabledFragment r4 = (com.whatsapp.settings.SettingsPasskeysDisabledFragment) r4
            X.4Gj r0 = r4.A01
            if (r0 == 0) goto L_0x0359
            boolean r1 = r0.BGz()
            r0 = 1
            if (r1 != r0) goto L_0x0359
            return
        L_0x0359:
            X.0ni r3 = X.AnonymousClass0IT.A00(r4)
            r2 = 0
            com.whatsapp.settings.SettingsPasskeysDisabledFragment$initCreateButton$1$1 r1 = new com.whatsapp.settings.SettingsPasskeysDisabledFragment$initCreateButton$1$1
            r1.<init>(r4, r2)
            r0 = 3
            X.4Gj r0 = X.C616131n.A02(r2, r1, r3, r2, r0)
            r4.A01 = r0
            return
        L_0x036b:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.C18290x4.A0d()
            int r1 = r3.A00
            java.lang.String r0 = "privacy_blocked"
            A01(r3, r2, r0, r1)
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.blocklist.BlockList"
            goto L_0x067e
        L_0x0387:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.AnonymousClass001.A0f()
            int r1 = r3.A00
            java.lang.String r0 = "wcs_profile_photo"
            A01(r3, r2, r0, r1)
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoPrivacyActivity"
            android.content.Intent r1 = r1.setClassName(r3, r0)
            r0 = 4
            goto L_0x04ee
        L_0x03a4:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.C18280x3.A0S()
            int r1 = r3.A00
            java.lang.String r0 = "wcs_about_status"
            A01(r3, r2, r0, r1)
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "com.whatsapp.profile.AboutStatusPrivacyActivity"
            android.content.Intent r1 = r1.setClassName(r3, r0)
            r0 = 5
            goto L_0x04ee
        L_0x03c1:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.C18290x4.A0b()
            int r1 = r3.A00
            java.lang.String r0 = "privacy_status"
            A01(r3, r2, r0, r1)
            android.content.Intent r1 = X.C627736r.A07(r3)
            r0 = 0
            goto L_0x04ee
        L_0x03d8:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.AnonymousClass0x7.A0g()
            int r1 = r3.A00
            java.lang.String r0 = "live_location"
            A01(r3, r2, r0, r1)
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.location.LiveLocationPrivacyActivity"
            goto L_0x067e
        L_0x03f3:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            r0 = 20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r3.A00
            java.lang.String r0 = "privacy_chat_lock_unlock_clear"
            A01(r3, r2, r0, r1)
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockPrivacySettingsActivity"
            goto L_0x067e
        L_0x0411:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            r0 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r3.A00
            java.lang.String r0 = "camera_effects"
            A01(r3, r2, r0, r1)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r4 = r3.A0o
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0P
            boolean r0 = r0.isChecked()
            r2 = r0 ^ 1
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0436
            java.lang.String r0 = "SettingsPrivacyCameraEffectsViewModelonPreferenceClicked An update is already ongoing"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0436:
            X.107 r0 = r4.A07
            java.lang.Object r1 = r0.A07()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0454
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SettingsPrivacyCameraEffectsViewModelonPreferenceClicked isSwitchChecked is already "
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r2)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0454:
            if (r2 == 0) goto L_0x045d
            X.4UC r1 = r4.A08
            r0 = 0
            r1.A0H(r0)
            return
        L_0x045d:
            X.4C6 r3 = X.AnonymousClass0IV.A00(r4)
            r2 = 0
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1 r1 = new com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1
            r1.<init>(r4, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x046c:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.AnonymousClass0x7.A0h()
            int r1 = r3.A00
            java.lang.String r0 = "calling_privacy"
            A01(r3, r2, r0, r1)
            r2 = 0
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsCallingPrivacyActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "target_setting"
            goto L_0x04ce
        L_0x048d:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            r0 = 19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r3.A00
            java.lang.String r0 = "advanced_privacy_relay_calls"
            A01(r3, r2, r0, r1)
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacyAdvancedActivity"
            goto L_0x067e
        L_0x04aa:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.C18300x5.A0Z()
            int r1 = r3.A00
            java.lang.String r0 = "screen_lock"
            A01(r3, r2, r0, r1)
            java.lang.String r2 = r3.A0v
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.authentication.AppAuthSettingsActivity"
            r4.setClassName(r1, r0)
            if (r2 == 0) goto L_0x0681
            java.lang.String r0 = "search_result_key"
        L_0x04ce:
            r4.putExtra(r0, r2)
            goto L_0x0681
        L_0x04d3:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Integer r2 = X.C18290x4.A0Z()
            int r1 = r3.A00
            java.lang.String r0 = "wcs_last_seen"
            A01(r3, r2, r0, r1)
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "com.whatsapp.lastseen.PresencePrivacyActivity"
            android.content.Intent r1 = r1.setClassName(r3, r0)
            r0 = 3
        L_0x04ee:
            r3.startActivityForResult(r1, r0)
            return
        L_0x04f2:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r2 = X.C18300x5.A0Y()
            int r1 = r4.A00
            java.lang.String r0 = "disappearing_messages_privacy"
            A01(r4, r2, r0, r1)
            r0 = 1
            android.content.Intent r1 = X.C18320x8.A07()
            X.C627736r.A1G(r4, r1, r0)
            goto L_0x055a
        L_0x050a:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r3 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r3
            boolean r0 = r3.A05
            r0 = r0 ^ 1
            r3.A05 = r0
            X.1VX r2 = r3.A0D
            r1 = 3436(0xd6c, float:4.815E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0527
            X.4FS r1 = r3.A04
            r0 = 17
            X.C71293bs.A00(r1, r3, r0)
        L_0x0527:
            androidx.appcompat.widget.SwitchCompat r1 = r3.A00
            if (r1 != 0) goto L_0x0532
            java.lang.String r0 = "callRelayingPrivacySwitch"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0532:
            boolean r0 = r3.A05
            goto L_0x0568
        L_0x0535:
            java.lang.Object r1 = r9.A00
            X.4eZ r1 = (X.C89644eZ) r1
            java.lang.String r0 = "https://www.whatsapp.com/security"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            X.AnonymousClass1Ha.A1w(r0, r1)
            return
        L_0x0543:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsSecurity r4 = (com.whatsapp.settings.SettingsSecurity) r4
            java.lang.String r3 = "android.intent.action.VIEW"
            X.3Lk r2 = r4.A03
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "security-code-change-notification"
            android.net.Uri r0 = r2.A04(r1, r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r0)
        L_0x055a:
            r4.startActivity(r1)
            return
        L_0x055e:
            java.lang.Object r1 = r9.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
        L_0x0568:
            r1.setChecked(r0)
            return
        L_0x056c:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.autoconf.ShareAutoConfVerifierActivity r2 = (com.whatsapp.settings.autoconf.ShareAutoConfVerifierActivity) r2
            X.3Q0 r1 = r2.A03
            if (r1 != 0) goto L_0x057c
            java.lang.String r0 = "updateAutoConfConsentManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x057c:
            androidx.appcompat.widget.SwitchCompat r0 = r2.A00
            if (r0 != 0) goto L_0x0587
            java.lang.String r0 = "consentSwitch"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0587:
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            r1.A00(r2, r0)
            return
        L_0x0591:
            java.lang.Object r5 = r9.A00
            X.1r1 r5 = (X.C32511r1) r5
            X.4uZ r2 = r5.A00
            if (r2 == 0) goto L_0x05e2
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x05e2
            X.3Ex r0 = r5.A01
            X.5ZU r1 = r5.A02
            r6 = 100
            X.3ZH r0 = r0.A07(r2)
            X.C626936e.A06(r0)
            java.lang.String r2 = r1.A0I(r0)
            r1 = 2131895491(0x7f1224c3, float:1.9425817E38)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3 = 0
            java.lang.String r2 = X.AnonymousClass002.A0F(r5, r2, r0, r3, r1)
            boolean r1 = X.C107405bG.A0D(r5)
            r0 = 2131895490(0x7f1224c2, float:1.9425814E38)
            if (r1 == 0) goto L_0x05c5
            r0 = 2131895488(0x7f1224c0, float:1.942581E38)
        L_0x05c5:
            java.lang.String r0 = r5.getString(r0)
            java.lang.String[] r2 = X.AnonymousClass0x7.A1a(r2, r3)
            r2[r4] = r0
            com.whatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment r1 = new com.whatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment
            r1.<init>()
            r0 = 2131895487(0x7f1224bf, float:1.9425808E38)
            android.os.Bundle r0 = com.whatsapp.SingleSelectionDialogFragment.A00(r2, r6, r3, r0)
            r1.A0u(r0)
            r5.Boo(r1)
            return
        L_0x05e2:
            r5.A76(r2)
            return
        L_0x05e6:
            java.lang.Object r1 = r9.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x05f2:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview r2 = (com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview) r2
            r1 = 0
            r0 = 0
            r2.setResult(r1, r0)
            com.whatsapp.collections.MarginCorrectedViewPager r0 = r2.A09
            int r0 = r0.getCurrentItem()
            r2.A78(r0)
            return
        L_0x0605:
            java.lang.Object r0 = r9.A00
            X.6Hf r0 = (X.C125286Hf) r0
            X.7EW r0 = r0.A01
            com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r0 = r0.A00
            X.6Hf r3 = r0.A06
            java.util.List r2 = r0.A07
            X.0PJ r1 = r0.A02
            r0 = 2
            r3.A0K(r1, r2, r0)
            return
        L_0x0618:
            java.lang.Object r4 = r9.A00
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r4 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r4
            X.1fJ r3 = r4.A0B
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.qrcode.GroupLinkQrActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass0x2.A0u(r1, r3, r0)
            r4.startActivity(r1)
            java.lang.Integer r0 = X.C18280x3.A0S()
            X.1XN r2 = new X.1XN
            r2.<init>()
            r2.A00 = r0
            X.2rN r1 = r4.A0E
            X.1fJ r0 = r4.A0B
            int r0 = r1.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            X.4FV r0 = r4.A09
            r0.BhD(r2)
            return
        L_0x0653:
            java.lang.Object r2 = r9.A00
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r2 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r2
            X.1fJ r1 = r2.A0B
            X.C626936e.A06(r1)
            r0 = 0
            com.whatsapp.RevokeLinkConfirmationDialogFragment r1 = com.whatsapp.RevokeLinkConfirmationDialogFragment.A00(r1, r0)
            r0 = 0
            r2.Bon(r1, r0)
            return
        L_0x0666:
            java.lang.Object r0 = r9.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x066e:
            java.lang.Object r0 = r9.A00
            X.4Yw r0 = (X.C88474Yw) r0
            android.content.Context r3 = r0.A07
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.status.playback.MyStatusesActivity"
        L_0x067e:
            r4.setClassName(r1, r0)
        L_0x0681:
            r3.startActivity(r4)
            return
        L_0x0685:
            java.lang.Object r1 = r9.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.33p r0 = r1.A0Z
            r0.A0z()
            android.view.View r1 = r1.A03
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0696:
            java.lang.Object r1 = r9.A00
            X.0eF r1 = (X.C08310eF) r1
            android.content.Context r0 = r1.A1D()
            android.content.Intent r0 = X.C627736r.A07(r0)
            r1.A0m(r0)
            return
        L_0x06a6:
            java.lang.Object r0 = r9.A00
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            X.2fa r2 = r0.A0H
            X.03q r1 = r0.A0Q()
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01(r1, r0)
            return
        L_0x06ba:
            java.lang.String r0 = "this$0"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x06c2:
            java.lang.String r0 = "this$0"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x06ca:
            X.1aZ r0 = new X.1aZ
            r0.<init>()
            java.lang.String r0 = "source"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C634139d.onClick(android.view.View):void");
    }
}
