package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass3S8;
import X.AnonymousClass5RU;
import X.AnonymousClass5WY;
import X.AnonymousClass5ZR;
import X.C107335b8;
import X.C107405bG;
import X.C107695bk;
import X.C116985rC;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C47362d8;
import X.C53202mi;
import X.C54322oX;
import X.C55522qU;
import X.C56002rG;
import X.C56912sl;
import X.C57162tC;
import X.C58422vE;
import X.C60222yC;
import X.C626936e;
import X.C634839k;
import X.C64333Db;
import X.C66433Lk;
import X.C70123Zz;
import X.C88744aj;
import X.C88834as;
import X.C89644eZ;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

public class SettingsHelpV2 extends C89644eZ {
    public C116985rC A00;
    public AnonymousClass5WY A01;
    public C57162tC A02;
    public AnonymousClass5ZR A03;
    public C53202mi A04;
    public C54322oX A05;
    public C55522qU A06;
    public AnonymousClass3S8 A07;
    public C56002rG A08;
    public C56912sl A09;
    public AnonymousClass5RU A0A;
    public C47362d8 A0B;
    public C66433Lk A0C;
    public boolean A0D;
    public boolean A0E;

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r3 = r1.A00;
            AnonymousClass1Ha.A23(r1, r3, r3, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A00 = C88744aj.A00;
            this.A01 = (AnonymousClass5WY) r1.AUS.get();
            this.A0C = C64333Db.A8X(r1);
            this.A04 = (C53202mi) r1.AXV.get();
            this.A06 = (C55522qU) r3.A8I.get();
            this.A03 = C64333Db.A2r(r1);
            this.A0B = (C47362d8) r3.A2c.get();
            this.A07 = (AnonymousClass3S8) r1.AZV.get();
            this.A09 = (C56912sl) r1.ATe.get();
            this.A08 = (C56002rG) r1.AZW.get();
            this.A02 = (C57162tC) r1.AaV.get();
            this.A0A = A0I.AD7();
            this.A05 = (C54322oX) r1.AXY.get();
        }
    }

    public SettingsHelpV2(int i) {
        this.A0D = false;
        AnonymousClass1Hf.A2D(this, 95);
    }

    public void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            AnonymousClass1VX r1 = this.A0D;
            C58422vE r4 = C58422vE.A02;
            this.A0E = r1.A0Y(r4, 4023);
            int A002 = C107405bG.A00(this, R.attr.f3nameremoved, R.color.f5nameremoved);
            if (!this.A0D.A0Y(r4, 1347)) {
                View A1k = AnonymousClass1Ha.A1k(this, R.id.faq_preference, A002);
                int i = 42;
                if (this.A0D.A0Y(r4, 6301)) {
                    i = 41;
                }
                AnonymousClass1Ha.A1x(A1k, this, i);
                View findViewById = findViewById(R.id.contact_us_preference);
                findViewById.setVisibility(0);
                C107335b8.A0E(AnonymousClass0x9.A0F(findViewById, R.id.settings_row_icon), A002);
                AnonymousClass1Ha.A1x(findViewById, this, 38);
            } else {
                AnonymousClass1Ha.A1x(AnonymousClass1Ha.A1k(this, R.id.get_help_preference, A002), this, 40);
            }
            View findViewById2 = findViewById(R.id.terms_and_privacy_preference);
            TextView A092 = AnonymousClass002.A09(findViewById2, R.id.settings_row_text);
            ImageView A0F = AnonymousClass0x9.A0F(findViewById2, R.id.settings_row_icon);
            boolean z = this.A0E;
            int i2 = R.drawable.ic_settings_terms_policy;
            if (z) {
                i2 = R.drawable.ic_settings_account_unfilled_description;
            }
            C18270x1.A0d(this, A0F, this.A00, i2);
            C107335b8.A0E(A0F, A002);
            A092.setText(getText(R.string.f11nameremoved));
            AnonymousClass1Ha.A1x(findViewById2, this, 39);
            SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.about_preference);
            if (this.A0E) {
                settingsRowIconText.setIcon((int) R.drawable.ic_settings_help_unfilled_info);
            }
            C107335b8.A0E(AnonymousClass0x9.A0F(settingsRowIconText, R.id.settings_row_icon), A002);
            AnonymousClass1Ha.A1x(settingsRowIconText, this, 37);
            if (this.A0D.A0Y(C58422vE.A01, 1799) && (viewGroup = (ViewGroup) findViewById(R.id.notice_list)) != null) {
                C56002rG r0 = this.A08;
                if (r0 != null) {
                    List<C60222yC> A022 = r0.A02();
                    if (C18310x6.A1X(A022)) {
                        AnonymousClass3S8 r6 = this.A07;
                        if (r6 != null) {
                            LayoutInflater layoutInflater = getLayoutInflater();
                            for (C60222yC r7 : A022) {
                                if (r7 != null) {
                                    SettingsRowNoticeView settingsRowNoticeView = (SettingsRowNoticeView) AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
                                    String str = r7.A05.A02;
                                    if (URLUtil.isValidUrl(str)) {
                                        settingsRowNoticeView.setOnClickListener(new C634839k(r6, r7, settingsRowNoticeView, str, 2));
                                    }
                                    settingsRowNoticeView.setNotice(r7);
                                    if (r6.A03(r7, false)) {
                                        settingsRowNoticeView.setBadgeIcon(settingsRowNoticeView.A01);
                                        r6.A00.execute(new C70123Zz(r6, 49, r7));
                                    } else {
                                        settingsRowNoticeView.setBadgeIcon((Drawable) null);
                                    }
                                    C626936e.A0D(settingsRowNoticeView instanceof View, "UserNoticeBadgeView from the factory is not an android.view.View");
                                    viewGroup.addView(settingsRowNoticeView);
                                }
                            }
                        } else {
                            throw C18270x1.A0S("userNoticeBadgeManager");
                        }
                    }
                    viewGroup.setVisibility(0);
                } else {
                    throw C18270x1.A0S("noticeBadgeSharedPreferences");
                }
            }
            AnonymousClass5RU r3 = this.A0A;
            if (r3 != null) {
                View view = this.A00;
                C162457s7.A0D(view);
                r3.A02(view, "help", AnonymousClass1Ha.A1q(this));
                return;
            }
            throw C18270x1.A0S("settingsSearchUtil");
        }
        throw C18300x5.A0X();
    }

    public void onResume() {
        super.onResume();
        if (this.A06 != null) {
            Iterator it = AnonymousClass001.A0s().iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        throw C18270x1.A0S("noticeBadgeManager");
    }

    public SettingsHelpV2() {
        this(0);
    }
}
