package com.whatsapp;

import X.AnonymousClass002;
import X.AnonymousClass29z;
import X.AnonymousClass314;
import X.AnonymousClass3DP;
import X.AnonymousClass3DY;
import X.AnonymousClass4GJ;
import X.AnonymousClass5VY;
import X.C104355Qq;
import X.C104905Su;
import X.C107695bk;
import X.C116885r1;
import X.C17190ui;
import X.C18270x1;
import X.C18320x8;
import X.C61072zf;
import X.C64333Db;
import X.C66663Mh;
import X.C86604Kt;
import X.C86634Kw;
import X.C86664Kz;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.preference.PreferenceFragmentCompat;
import com.whatsapp.settings.Hilt_SettingsChatHistoryFragment;
import com.whatsapp.settings.Hilt_SettingsJidNotificationFragment;
import com.whatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.settings.SettingsJidNotificationFragment;

public abstract class Hilt_WaPreferenceFragment extends PreferenceFragmentCompat implements AnonymousClass4GJ {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = AnonymousClass002.A0D();
    public volatile C116885r1 A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0X = r0
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C116885r1.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass2A2.A01(r0)
            r2.A1J()
            r2.A1I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Hilt_WaPreferenceFragment.A1F(android.app.Activity):void");
    }

    public void A1I() {
        if (this instanceof Hilt_SettingsJidNotificationFragment) {
            Hilt_SettingsJidNotificationFragment hilt_SettingsJidNotificationFragment = (Hilt_SettingsJidNotificationFragment) this;
            if (!hilt_SettingsJidNotificationFragment.A02) {
                hilt_SettingsJidNotificationFragment.A02 = true;
                SettingsJidNotificationFragment settingsJidNotificationFragment = (SettingsJidNotificationFragment) hilt_SettingsJidNotificationFragment;
                C64333Db r1 = ((C88854au) ((AnonymousClass3DY) hilt_SettingsJidNotificationFragment.generatedComponent())).A1B;
                settingsJidNotificationFragment.A04 = C64333Db.A3o(r1);
                settingsJidNotificationFragment.A00 = C64333Db.A00(r1);
                settingsJidNotificationFragment.A02 = C64333Db.A26(r1);
                settingsJidNotificationFragment.A07 = C86604Kt.A0e(r1);
                settingsJidNotificationFragment.A06 = C86634Kw.A0p(r1);
                settingsJidNotificationFragment.A01 = (AnonymousClass3DP) r1.Aak.get();
                settingsJidNotificationFragment.A03 = C64333Db.A2t(r1);
            }
        } else if (this instanceof Hilt_SettingsChatHistoryFragment) {
            Hilt_SettingsChatHistoryFragment hilt_SettingsChatHistoryFragment = (Hilt_SettingsChatHistoryFragment) this;
            if (!hilt_SettingsChatHistoryFragment.A02) {
                hilt_SettingsChatHistoryFragment.A02 = true;
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) hilt_SettingsChatHistoryFragment;
                C64333Db r3 = ((C88854au) ((AnonymousClass3DY) hilt_SettingsChatHistoryFragment.generatedComponent())).A1B;
                settingsChatHistoryFragment.A01 = C64333Db.A06(r3);
                settingsChatHistoryFragment.A0C = C64333Db.A8y(r3);
                settingsChatHistoryFragment.A02 = (C66663Mh) r3.AUd.get();
                settingsChatHistoryFragment.A03 = C64333Db.A08(r3);
                settingsChatHistoryFragment.A08 = (C61072zf) r3.AXI.get();
                settingsChatHistoryFragment.A04 = C64333Db.A26(r3);
                C107695bk r12 = r3.A00;
                settingsChatHistoryFragment.A06 = (C104905Su) r12.A4B.get();
                settingsChatHistoryFragment.A07 = C86664Kz.A18(r3);
                settingsChatHistoryFragment.A05 = (AnonymousClass314) r3.A6v.get();
                settingsChatHistoryFragment.A00 = C64333Db.A04(r3);
                settingsChatHistoryFragment.A0B = (C104355Qq) r12.A3P.get();
                settingsChatHistoryFragment.A09 = C64333Db.A4B(r3);
            }
        } else if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final void A1J() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C116885r1(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1J();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C18270x1.A06(super.A1E(bundle), this);
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1J();
        A1I();
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A01(this, super.B6u());
    }
}
