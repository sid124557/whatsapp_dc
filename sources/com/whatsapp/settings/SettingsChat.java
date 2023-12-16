package com.whatsapp.settings;

import X.AnonymousClass002;
import X.AnonymousClass0XM;
import X.AnonymousClass0YV;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1R1;
import X.AnonymousClass3DW;
import X.AnonymousClass4FV;
import X.AnonymousClass5RU;
import X.AnonymousClass5ZR;
import X.AnonymousClass64I;
import X.AnonymousClass8GB;
import X.AnonymousClass90H;
import X.C06390Xm;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C183538qC;
import X.C187958y5;
import X.C32491qk;
import X.C54412og;
import X.C56512s6;
import X.C60762z7;
import X.C615531h;
import X.C615931l;
import X.C620733j;
import X.C622334f;
import X.C623834u;
import X.C64333Db;
import X.C71283br;
import X.C72343dZ;
import X.C836649h;
import X.C85014Ep;
import X.C86564Kp;
import X.C88834as;
import X.C97154xi;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import java.util.Set;

public class SettingsChat extends C32491qk implements AnonymousClass64I {
    public TextView A00;
    public SwitchCompat A01;
    public SwitchCompat A02;
    public SwitchCompat A03;
    public AnonymousClass0XM A04;
    public C622334f A05;
    public C56512s6 A06;
    public AnonymousClass5ZR A07;
    public AnonymousClass3DW A08;
    public AnonymousClass4FV A09;
    public C97154xi A0A;
    public C60762z7 A0B;
    public SettingsChatViewModel A0C;
    public SettingsRowIconText A0D;
    public SettingsRowIconText A0E;
    public AnonymousClass1R1 A0F;
    public C623834u A0G;
    public AnonymousClass5RU A0H;
    public C187958y5 A0I;
    public C183538qC A0J;
    public C183538qC A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public String[] A0O;
    public String[] A0P;
    public final C85014Ep A0Q;
    public final C836649h A0R;
    public final Set A0S;

    public void Bbh(int i, int i2) {
        if (i == 1) {
            C18270x1.A0j(C18270x1.A03(this.A09), "interface_font_size", String.valueOf(Integer.valueOf(this.A0P[i2]).intValue()));
            this.A00.setText(this.A0O[i2]);
        } else if (i == 2 && this.A0B.A02(i2)) {
            this.A0E.setVisibility(0);
            this.A0E.setSubText(this.A0B.A00());
            finish();
            overridePendingTransition(0, R.anim.f0nameremoved);
            this.A0N = true;
            startActivity(getIntent());
        }
    }

    public void A5r() {
        if (!this.A0M) {
            this.A0M = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r4 = A0I2.A4Z;
            AnonymousClass1Hf.A2G(r4, this);
            C107695bk r1 = r4.A00;
            AnonymousClass1Ha.A23(r4, r1, r1, this);
            AnonymousClass1Ha.A24(r4, this);
            this.A09 = C64333Db.A4H(r4);
            this.A05 = (C622334f) r4.A0v.get();
            this.A0I = (C187958y5) r4.ASM.get();
            this.A0K = C72343dZ.A00(r4.A3J);
            this.A0G = (C623834u) r1.AC9.get();
            this.A04 = (AnonymousClass0XM) r4.A1v.get();
            this.A0F = (AnonymousClass1R1) r4.A56.get();
            this.A06 = (C56512s6) r4.AK3.get();
            this.A08 = (AnonymousClass3DW) r4.AJ6.get();
            this.A0H = A0I2.AD7();
            this.A0A = (C97154xi) r1.AB3.get();
            Context context = r4.AdE.A00;
            C615931l.A00(context);
            this.A0B = new C60762z7(context, (C54412og) r4.Aam.get(), (C620733j) r4.AbU.get());
            this.A07 = C64333Db.A2r(r4);
            this.A0J = C72343dZ.A00(r4.A36);
        }
    }

    public void A6U(Configuration configuration) {
        if (!this.A0N) {
            super.A6U(configuration);
        }
    }

    public final void A76() {
        SettingsRowIconText settingsRowIconText;
        String string;
        if (this.A0D != null) {
            if (AnonymousClass0YV.A0F(getApplicationContext())) {
                settingsRowIconText = this.A0D;
                string = null;
            } else if (this.A07.A0E()) {
                SettingsChatViewModel settingsChatViewModel = this.A0C;
                settingsChatViewModel.A02.BkM(new C71283br((Object) settingsChatViewModel, 47));
                return;
            } else {
                settingsRowIconText = this.A0D;
                string = getString(R.string.f11nameremoved);
            }
            settingsRowIconText.setSubText(string);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049 A[LOOP:0: B:12:0x0049->B:15:0x0059, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x0040
            if (r5 == 0) goto L_0x0040
            java.lang.String r0 = "oom"
            r1 = 0
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "conversation/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131889108(0x7f120bd4, float:1.941287E38)
            r2.Bot(r0)
        L_0x0019:
            java.lang.String r0 = "no-space"
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "conversation/activityres/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131889102(0x7f120bce, float:1.9412858E38)
            r2.Bot(r0)
        L_0x002d:
            java.lang.String r0 = "io-error"
            boolean r0 = r5.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "conversation/activityres/fail/load-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131889090(0x7f120bc2, float:1.9412834E38)
            r2.Bot(r0)
        L_0x0040:
            super.onActivityResult(r3, r4, r5)
            java.util.Set r0 = r2.A0S
            java.util.Iterator r1 = r0.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r1.next()
            X.64L r0 = (X.AnonymousClass64L) r0
            boolean r0 = r0.BM3(r5, r3, r4)
            if (r0 == 0) goto L_0x0049
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChat.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.A0N) {
            super.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [int, boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0273, code lost:
        if (r10 == 2) goto L_0x0275;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r6 = r21
            r0 = r22
            super.onCreate(r0)
            X.0XL r1 = X.AnonymousClass0x9.A0H(r6)
            java.lang.Class<com.whatsapp.settings.SettingsChatViewModel> r0 = com.whatsapp.settings.SettingsChatViewModel.class
            X.0Ty r0 = r1.A01(r0)
            com.whatsapp.settings.SettingsChatViewModel r0 = (com.whatsapp.settings.SettingsChatViewModel) r0
            r6.A0C = r0
            r0 = 2131893593(0x7f121d59, float:1.9421967E38)
            r6.setTitle(r0)
            r0 = 2131625803(0x7f0e074b, float:1.8878824E38)
            r6.setContentView((int) r0)
            boolean r7 = X.AnonymousClass1Hf.A2I(r6)
            android.view.View r1 = r6.A00
            r0 = 2131429842(0x7f0b09d2, float:1.8481368E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r6.A01 = r0
            android.view.View r1 = r6.A00
            r0 = 2131431339(0x7f0b0fab, float:1.8484404E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r6.A02 = r0
            android.view.View r1 = r6.A00
            r0 = 2131430203(0x7f0b0b3b, float:1.84821E38)
            android.widget.TextView r0 = X.C18300x5.A0G(r1, r0)
            r6.A00 = r0
            android.view.View r1 = r6.A00
            r0 = 2131433838(0x7f0b196e, float:1.8489473E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r6.A03 = r0
            r0 = 2131428730(0x7f0b057a, float:1.8479113E38)
            android.view.View r10 = X.C005205m.A00(r6, r0)
            com.whatsapp.components.WaSwitchView r10 = (com.whatsapp.components.WaSwitchView) r10
            android.view.View r1 = r6.A00
            r0 = 2131433673(0x7f0b18c9, float:1.8489138E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            com.whatsapp.settings.SettingsRowIconText r0 = (com.whatsapp.settings.SettingsRowIconText) r0
            r6.A0E = r0
            android.view.View r1 = r6.A00
            r0 = 2131434841(0x7f0b1d59, float:1.8491507E38)
            android.view.View r9 = X.C06560Yg.A02(r1, r0)
            com.whatsapp.settings.SettingsRowIconText r9 = (com.whatsapp.settings.SettingsRowIconText) r9
            android.view.View r1 = r6.A00
            r0 = 2131429841(0x7f0b09d1, float:1.8481366E38)
            android.view.View r20 = X.C06560Yg.A02(r1, r0)
            android.view.View r1 = r6.A00
            r0 = 2131430202(0x7f0b0b3a, float:1.8482098E38)
            android.view.View r19 = X.C06560Yg.A02(r1, r0)
            android.view.View r1 = r6.A00
            r0 = 2131431338(0x7f0b0faa, float:1.8484402E38)
            android.view.View r8 = X.C06560Yg.A02(r1, r0)
            android.view.View r1 = r6.A00
            r0 = 2131430760(0x7f0b0d68, float:1.848323E38)
            android.view.View r3 = X.C06560Yg.A02(r1, r0)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r1 = r6.A00
            r0 = 2131433837(0x7f0b196d, float:1.848947E38)
            android.view.View r11 = X.C06560Yg.A02(r1, r0)
            android.view.View r1 = r6.A00
            r0 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            android.view.View r1 = X.C06560Yg.A02(r1, r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r2 = r6.A00
            r0 = 2131428710(0x7f0b0566, float:1.8479072E38)
            android.view.View r0 = X.C06560Yg.A02(r2, r0)
            com.whatsapp.settings.SettingsRowIconText r0 = (com.whatsapp.settings.SettingsRowIconText) r0
            r6.A0D = r0
            android.view.View r2 = r6.A00
            r0 = 2131428713(0x7f0b0569, float:1.8479078E38)
            android.view.View r5 = X.C06560Yg.A02(r2, r0)
            com.whatsapp.settings.SettingsRowIconText r5 = (com.whatsapp.settings.SettingsRowIconText) r5
            android.view.View r2 = r6.A00
            r0 = 2131428735(0x7f0b057f, float:1.8479123E38)
            android.view.View r4 = X.C06560Yg.A02(r2, r0)
            com.whatsapp.settings.SettingsRowIconText r4 = (com.whatsapp.settings.SettingsRowIconText) r4
            com.whatsapp.settings.SettingsRowIconText r2 = r6.A0E
            r0 = 24
            X.AnonymousClass1Ha.A1x(r2, r6, r0)
            com.whatsapp.settings.SettingsRowIconText r2 = r6.A0E
            r0 = 0
            r2.setVisibility(r0)
            com.whatsapp.settings.SettingsRowIconText r2 = r6.A0E
            X.2z7 r0 = r6.A0B
            java.lang.String r0 = r0.A00()
            r2.setSubText(r0)
            X.1VX r0 = r6.A0D
            boolean r0 = X.AnonymousClass5V9.A01(r0)
            r18 = 0
            if (r0 == 0) goto L_0x01be
            android.view.View r2 = r3.inflate()
            r0 = 2131430761(0x7f0b0d69, float:1.8483232E38)
            android.view.View r3 = X.C06560Yg.A02(r2, r0)
            android.widget.CompoundButton r3 = (android.widget.CompoundButton) r3
            X.1R1 r0 = r6.A0F
            boolean r0 = r0.A0f()
            r3.setChecked(r0)
            r0 = 42
            X.C634339f.A00(r2, r6, r3, r0)
        L_0x0112:
            X.8qC r0 = r6.A0K
            java.lang.Object r0 = r0.get()
            X.2m4 r0 = (X.C52802m4) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x01bb
            android.view.View r1 = r1.inflate()
            r0 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            android.view.View r12 = X.C06560Yg.A02(r1, r0)
            android.widget.CompoundButton r12 = (android.widget.CompoundButton) r12
            X.8qC r0 = r6.A0J
            java.lang.Object r0 = r0.get()
            X.7KQ r0 = (X.AnonymousClass7KQ) r0
            X.66R r0 = r0.A02
            android.content.SharedPreferences r3 = X.C18310x6.A0F(r0)
            java.lang.String r0 = "bonsai_meta_ai_button_setting_enabled"
            boolean r0 = r3.getBoolean(r0, r7)
            r12.setChecked(r0)
            r0 = 43
            X.C634339f.A00(r1, r6, r12, r0)
        L_0x0149:
            X.1VX r12 = r6.A0D
            r3 = 4023(0xfb7, float:5.637E-42)
            X.2vE r17 = X.C58422vE.A02
            r0 = r17
            boolean r0 = r12.A0Y(r0, r3)
            r3 = 0
            if (r0 == 0) goto L_0x01c2
            com.whatsapp.settings.SettingsRowIconText r12 = r6.A0E
            r0 = 2131232632(0x7f080778, float:1.8081379E38)
            r12.setIcon((int) r0)
            r0 = 2131232634(0x7f08077a, float:1.8081383E38)
            r9.setIcon((int) r0)
            com.whatsapp.settings.SettingsRowIconText r12 = r6.A0D
            r0 = 2131232628(0x7f080774, float:1.808137E38)
            r12.setIcon((int) r0)
            r0 = 2131232604(0x7f08075c, float:1.8081322E38)
            r4.setIcon((int) r0)
            r0 = 2131232630(0x7f080776, float:1.8081375E38)
            r5.setIcon((int) r0)
            r0 = 7
            android.view.View[] r14 = new android.view.View[r0]
            r14[r3] = r20
            r14[r7] = r8
            r0 = r19
            X.AnonymousClass001.A1H(r2, r0, r14)
            r0 = 4
            r14[r0] = r11
            r0 = 5
            r14[r0] = r10
            r0 = 6
            r14[r0] = r1
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168171(0x7f070bab, float:1.7950636E38)
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            r13 = r0
            r15 = 0
        L_0x019d:
            r16 = r14[r15]
            if (r16 == 0) goto L_0x01b5
            int r2 = r16.getPaddingTop()
            int r1 = r16.getPaddingRight()
            int r0 = r16.getPaddingBottom()
            r12 = r2
            r2 = r1
            r1 = r0
            r0 = r16
            r0.setPadding(r13, r12, r2, r1)
        L_0x01b5:
            int r15 = r15 + 1
            r0 = 7
            if (r15 >= r0) goto L_0x01c2
            goto L_0x019d
        L_0x01bb:
            r1 = r18
            goto L_0x0149
        L_0x01be:
            r2 = r18
            goto L_0x0112
        L_0x01c2:
            X.2sr r0 = r6.A01
            boolean r0 = r0.A0Y()
            r2 = 8
            if (r0 == 0) goto L_0x0372
            r0 = r20
            r0.setVisibility(r2)
        L_0x01d1:
            X.4xi r0 = r6.A0A
            boolean r0 = r0.A0H()
            if (r0 != 0) goto L_0x035b
            X.4xi r0 = r6.A0A
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x035b
            r11.setVisibility(r2)
        L_0x01e4:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2130903056(0x7f030010, float:1.741292E38)
            java.lang.String[] r0 = r1.getStringArray(r0)
            r6.A0O = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2130903057(0x7f030011, float:1.7412921E38)
            java.lang.String[] r0 = r1.getStringArray(r0)
            r6.A0P = r0
            int r11 = r6.A75(r0)
            if (r11 < 0) goto L_0x020d
            android.widget.TextView r1 = r6.A00
            java.lang.String[] r0 = r6.A0O
            r0 = r0[r11]
            r1.setText(r0)
        L_0x020d:
            r1 = 18
            r0 = r19
            X.AnonymousClass1Ha.A1x(r0, r6, r1)
            r0 = 2131432884(0x7f0b15b4, float:1.8487538E38)
            android.view.View r12 = X.C005205m.A00(r6, r0)
            r0 = 2131427746(0x7f0b01a2, float:1.8477117E38)
            android.view.View r11 = X.C005205m.A00(r6, r0)
            X.33p r0 = r6.A09
            boolean r0 = r0.A28()
            if (r0 == 0) goto L_0x0350
            X.2sr r0 = r6.A01
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0350
            r10.setVisibility(r3)
            X.33p r0 = r6.A09
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "notify_new_message_for_archived_chats"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            r0 = r0 ^ 1
            r10.setChecked(r0)
            X.90i r0 = new X.90i
            r0.<init>(r6, r7)
            r10.setOnCheckedChangeListener(r0)
            r1 = 23
            X.39c r0 = new X.39c
            r0.<init>(r10, r1)
            r10.setOnClickListener(r0)
            r12.setVisibility(r3)
            r11.setVisibility(r3)
            r6.scrollToArchiveSettingIfNeeded(r10)
        L_0x0262:
            r8.setVisibility(r3)
            androidx.appcompat.widget.SwitchCompat r11 = r6.A02
            X.1R1 r0 = r6.A0F
            X.2sa r0 = r0.A0I()
            int r10 = r0.A01
            if (r10 == 0) goto L_0x0275
            r0 = 2
            r1 = 0
            if (r10 != r0) goto L_0x0276
        L_0x0275:
            r1 = 1
        L_0x0276:
            r11.setChecked(r1)
            r0 = 19
            X.AnonymousClass1Ha.A1x(r8, r6, r0)
            r0 = 20
            X.AnonymousClass1Ha.A1x(r9, r6, r0)
            X.2sr r0 = r6.A01
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x0336
            com.whatsapp.settings.SettingsRowIconText r0 = r6.A0D
            r0.setVisibility(r2)
        L_0x0290:
            r0 = 25
            X.AnonymousClass1Ha.A1x(r5, r6, r0)
            boolean r0 = X.C107385bE.A02()
            if (r0 == 0) goto L_0x02b7
            X.1VX r2 = r6.A0D
            r1 = 2870(0xb36, float:4.022E-42)
            r0 = r17
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x02b7
            X.2sr r0 = r6.A01
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x02b7
            r4.setVisibility(r3)
            r0 = 26
            X.AnonymousClass1Ha.A1x(r4, r6, r0)
        L_0x02b7:
            X.3Wi r3 = r6.A05
            X.8G3 r2 = new X.8G3
            r2.<init>(r3)
            X.74P r13 = new X.74P
            r13.<init>()
            X.33i r1 = r6.A08
            X.34u r0 = r6.A0G
            X.3Cy r8 = new X.3Cy
            r10 = r6
            r9 = r6
            r11 = r3
            r12 = r2
            r14 = r1
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.util.Set r0 = r6.A0S
            r0.add(r8)
            com.whatsapp.settings.SettingsChatViewModel r0 = r6.A0C
            X.08M r1 = r0.A00
            r0 = 189(0xbd, float:2.65E-43)
            X.AnonymousClass1Ha.A21(r6, r1, r0)
            android.content.Intent r4 = r6.getIntent()
            if (r4 == 0) goto L_0x030c
            java.lang.String r3 = "page"
            java.lang.String r2 = r4.getStringExtra(r3)
            if (r2 == 0) goto L_0x030c
            java.lang.String r0 = "font"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0326
            java.lang.String r0 = "theme"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0320
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SettingChat/Deeplink entry point: Entrypoint unsupported: "
            X.C18260x0.A0r(r0, r2, r1)
        L_0x0309:
            r4.removeExtra(r3)
        L_0x030c:
            java.lang.String r3 = X.AnonymousClass1Ha.A1q(r6)
            r6.A0L = r3
            X.5RU r2 = r6.A0H
            android.view.View r1 = r6.A00
            java.lang.String r0 = "chat"
            r2.A02(r1, r0, r3)
            r0 = r18
            r6.A0L = r0
            return
        L_0x0320:
            X.2z7 r0 = r6.A0B
            r0.A01(r6)
            goto L_0x0309
        L_0x0326:
            java.lang.String[] r0 = r6.A0P
            int r2 = r6.A75(r0)
            r1 = 2131893615(0x7f121d6f, float:1.9422012E38)
            r0 = 2130903056(0x7f030010, float:1.741292E38)
            r6.A74(r7, r1, r2, r0)
            goto L_0x0309
        L_0x0336:
            android.content.Context r0 = r6.getApplicationContext()
            boolean r0 = X.AnonymousClass0YV.A0F(r0)
            com.whatsapp.settings.SettingsRowIconText r1 = r6.A0D
            if (r0 != 0) goto L_0x0349
            r0 = 21
            X.AnonymousClass1Ha.A1x(r1, r6, r0)
            goto L_0x0290
        L_0x0349:
            r0 = 22
            X.AnonymousClass1Ha.A1x(r1, r6, r0)
            goto L_0x0290
        L_0x0350:
            r10.setVisibility(r2)
            r12.setVisibility(r2)
            r11.setVisibility(r2)
            goto L_0x0262
        L_0x035b:
            r0 = 17
            X.AnonymousClass1Ha.A1x(r11, r6, r0)
            androidx.appcompat.widget.SwitchCompat r11 = r6.A03
            X.2og r0 = r6.A0A
            android.content.SharedPreferences r1 = r0.A01
            java.lang.String r0 = "otp_split_mode_user_choice"
            boolean r0 = r1.getBoolean(r0, r7)
            r11.setChecked(r0)
            goto L_0x01e4
        L_0x0372:
            r1 = 16
            r0 = r20
            X.AnonymousClass1Ha.A1x(r0, r6, r1)
            androidx.appcompat.widget.SwitchCompat r12 = r6.A01
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = "input_enter_send"
            boolean r0 = r1.getBoolean(r0, r7)
            r12.setChecked(r0)
            goto L_0x01d1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChat.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        if (i == 600) {
            return C06390Xm.A00(this);
        }
        if (i != 602) {
            return super.onCreateDialog(i);
        }
        return C06390Xm.A01(this);
    }

    public void onPause() {
        this.A06.A05(this.A0R);
        super.onPause();
    }

    public SettingsChat(int i) {
        this.A0M = false;
        A5J(new AnonymousClass90H(this, 93));
    }

    public final int A75(String[] strArr) {
        int A012 = C615531h.A01(AnonymousClass1Hf.A27(this).getString("interface_font_size", "0"), 0);
        for (int i = 0; i < strArr.length; i++) {
            if (A012 == Integer.valueOf(strArr[i]).intValue()) {
                return i;
            }
        }
        return -1;
    }

    public void onResume() {
        super.onResume();
        this.A06.A04(this.A0R);
        A76();
    }

    public final void scrollToArchiveSettingIfNeeded(View view) {
        Intent intent = getIntent();
        if (intent != null && "archived_chats".equals(intent.getStringExtra("scroll_to_setting"))) {
            view.getParent().requestChildFocus(view, view);
        }
    }

    public SettingsChat() {
        this(0);
        this.A0R = new AnonymousClass8GB(this);
        this.A0L = null;
        this.A0S = AnonymousClass002.A0K();
        this.A0Q = new C86564Kp(this, 3);
    }
}
