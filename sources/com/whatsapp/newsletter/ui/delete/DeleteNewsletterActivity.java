package com.whatsapp.newsletter.ui.delete;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass1Gz;
import X.AnonymousClass30V;
import X.AnonymousClass317;
import X.AnonymousClass33S;
import X.AnonymousClass3ZH;
import X.AnonymousClass4DY;
import X.AnonymousClass4FN;
import X.AnonymousClass5ZU;
import X.C08240dc;
import X.C08310eF;
import X.C103985Pe;
import X.C106715a2;
import X.C114015mM;
import X.C136706n8;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C44572Wo;
import X.C56842se;
import X.C57162tC;
import X.C64773Ex;
import X.C86194Je;
import X.C86314Jq;
import X.C95804uY;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public final class DeleteNewsletterActivity extends AnonymousClass1Gz implements AnonymousClass4FN {
    public View A00;
    public View A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public C114015mM A04;
    public C57162tC A05;
    public AnonymousClass3ZH A06;
    public C95804uY A07;
    public AnonymousClass33S A08;
    public C56842se A09;
    public C103985Pe A0A;
    public C44572Wo A0B;
    public AnonymousClass317 A0C;
    public AnonymousClass30V A0D;
    public C106715a2 A0E;
    public WDSProfilePhoto A0F;
    public final AnonymousClass4DY A0G = new C86314Jq(this, 1);

    public void Big(C44572Wo r3) {
        C162457s7.A0J(r3, 0);
        this.A0B = r3;
        AnonymousClass317 r0 = this.A0C;
        if (r0 != null) {
            r0.A12.add(this.A0G);
            return;
        }
        throw C18270x1.A0S("registrationManager");
    }

    public void A66() {
        AnonymousClass30V r2 = this.A0D;
        if (r2 != null) {
            r2.A03(this.A07, 33);
            super.A66();
            return;
        }
        throw C18270x1.A0S("navigationTimeSpentManager");
    }

    public void BrP(C44572Wo r3) {
        AnonymousClass317 r0 = this.A0C;
        if (r0 != null) {
            r0.A12.remove(this.A0G);
            this.A0B = null;
            return;
        }
        throw C18270x1.A0S("registrationManager");
    }

    public boolean A6C() {
        return true;
    }

    public final void A74() {
        C08310eF A0B2 = getSupportFragmentManager().A0B(R.id.phone_matching_container);
        if (A0B2 != null) {
            C08240dc A0J = AnonymousClass0x2.A0J(this);
            A0J.A07(A0B2);
            A0J.A01();
        }
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().A0D("channel_delete_confirmation");
        if (dialogFragment != null) {
            dialogFragment.A1L();
        }
    }

    public final void A75(String str, boolean z, boolean z2) {
        CountryAndPhoneNumberFragment countryAndPhoneNumberFragment;
        EditText editText;
        C08310eF A0B2 = getSupportFragmentManager().A0B(R.id.phone_matching_container);
        if (A0B2 instanceof MatchPhoneNumberFragment) {
            countryAndPhoneNumberFragment = (CountryAndPhoneNumberFragment) A0B2;
        } else {
            countryAndPhoneNumberFragment = null;
        }
        if (z) {
            if (countryAndPhoneNumberFragment != null) {
                countryAndPhoneNumberFragment.A07.setVisibility(0);
                countryAndPhoneNumberFragment.A07.setText(str);
                editText = countryAndPhoneNumberFragment.A03;
            } else {
                return;
            }
        } else if (countryAndPhoneNumberFragment != null) {
            if (z2) {
                countryAndPhoneNumberFragment.A1L(true);
                countryAndPhoneNumberFragment.A04.setText(str);
            }
            editText = countryAndPhoneNumberFragment.A02;
        } else {
            return;
        }
        editText.requestFocus();
    }

    public void B1s() {
    }

    public void BPo() {
        Log.d("onConnectionError");
    }

    public void BW5() {
        A74();
        C95804uY r3 = this.A07;
        if (r3 != null) {
            Bp9(R.string.f11nameremoved);
            C56842se r1 = this.A09;
            if (r1 != null) {
                C86194Je r2 = new C86194Je(this, 1);
                if (C18300x5.A1S(r1.A0E)) {
                    r1.A07.A02(new C136706n8(r3, r2));
                    return;
                }
                return;
            }
            throw C18270x1.A0S("newsletterManager");
        }
        throw AnonymousClass001.A0c("Failed requirement.");
    }

    public void BWl() {
        A75(C18290x4.A0l(this, R.string.f11nameremoved), true, false);
    }

    public boolean BlR(String str, String str2) {
        C18260x0.A0O(str, str2);
        AnonymousClass33S r0 = this.A08;
        if (r0 != null) {
            return r0.A06(str, str2);
        }
        throw C18270x1.A0S("sendMethods");
    }

    public void Bp6() {
        Log.d("showProgress");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            r0 = 2131624049(0x7f0e0071, float:1.8875267E38)
            r10.setContentView((int) r0)
            androidx.appcompat.widget.Toolbar r1 = X.AnonymousClass1Hf.A28(r10)
            r0 = 2131888552(0x7f1209a8, float:1.9411743E38)
            r1.setTitle((int) r0)
            r10.setSupportActionBar(r1)
            boolean r7 = X.AnonymousClass1Hf.A2I(r10)
            r0 = 2131430651(0x7f0b0cfb, float:1.848301E38)
            android.view.View r0 = X.C18290x4.A0L(r10, r0)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r0
            r10.A0F = r0
            X.5Yx r1 = X.C95804uY.A03
            java.lang.String r0 = X.AnonymousClass0x7.A0l(r10)
            X.4uY r1 = r1.A01(r0)
            r10.A07 = r1
            if (r1 != 0) goto L_0x0037
            r10.finish()
            return
        L_0x0037:
            X.3ZH r0 = new X.3ZH
            r0.<init>(r1)
            r10.A06 = r0
            r0 = 2131429374(0x7f0b07fe, float:1.8480419E38)
            android.view.View r0 = X.C18290x4.A0L(r10, r0)
            r10.A00 = r0
            r0 = 2131432098(0x7f0b12a2, float:1.8485944E38)
            android.view.View r0 = X.C18290x4.A0L(r10, r0)
            r10.A01 = r0
            X.5Pe r1 = r10.A0A
            if (r1 == 0) goto L_0x0122
            X.4uY r0 = r10.A07
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x006d
            android.view.View r1 = r10.A01
            if (r1 != 0) goto L_0x0068
            java.lang.String r0 = "pastChannelActivityInfoView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0068:
            r0 = 8
            r1.setVisibility(r0)
        L_0x006d:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166169(0x7f0703d9, float:1.7946576E38)
            int r3 = r1.getDimensionPixelSize(r0)
            X.5mM r1 = r10.A04
            if (r1 == 0) goto L_0x011b
            java.lang.String r0 = "delete-newsletter"
            X.5Uq r2 = r1.A06(r10, r0)
            X.3ZH r1 = r10.A06
            java.lang.String r9 = "contact"
            if (r1 != 0) goto L_0x008d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x008d:
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r10.A0F
            java.lang.String r8 = "icon"
            if (r0 != 0) goto L_0x0098
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x0098:
            r2.A09(r0, r1, r3, r7)
            r1 = 2131103109(0x7f060d85, float:1.7818675E38)
            r0 = 2131103158(0x7f060db6, float:1.7818774E38)
            X.6st r6 = new X.6st
            r6.<init>(r1, r0)
            r5 = 2131231730(0x7f0803f2, float:1.807955E38)
            r4 = 2131168686(0x7f070dae, float:1.795168E38)
            r3 = 2131168687(0x7f070daf, float:1.7951683E38)
            r2 = 2131168688(0x7f070db0, float:1.7951685E38)
            r1 = 2131168691(0x7f070db3, float:1.795169E38)
            X.7ZR r0 = new X.7ZR
            r0.<init>(r4, r3, r2, r1)
            X.6t0 r1 = new X.6t0
            r1.<init>(r0, r6, r5)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r10.A0F
            if (r0 != 0) goto L_0x00c8
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x00c8:
            r0.setProfileBadge(r1)
            r0 = 2131429373(0x7f0b07fd, float:1.8480417E38)
            android.view.View r1 = X.C005205m.A00(r10, r0)
            r0 = 30
            X.C18300x5.A19(r1, r10, r0)
            r3 = 2131888555(0x7f1209ab, float:1.9411749E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            X.5ZU r1 = r10.A03
            if (r1 == 0) goto L_0x0113
            X.3ZH r0 = r10.A06
            if (r0 != 0) goto L_0x00e9
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x00e9:
            X.C18290x4.A1K(r1, r0, r2)
            java.lang.String r1 = r10.getString(r3, r2)
            X.C162457s7.A0D(r1)
            r0 = 2131429376(0x7f0b0800, float:1.8480423E38)
            android.view.View r0 = X.C005205m.A00(r10, r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r0.A0I(r1)
            r0 = 2131429375(0x7f0b07ff, float:1.848042E38)
            android.view.View r1 = X.C18290x4.A0L(r10, r0)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r0 = 2131428856(0x7f0b05f8, float:1.8479368E38)
            android.view.View r0 = X.C18290x4.A0L(r10, r0)
            X.C57652tz.A00(r0, r1)
            return
        L_0x0113:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x011b:
            java.lang.String r0 = "contactPhotos"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0122:
            java.lang.String r0 = "newsletterSuspensionUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity.onCreate(android.os.Bundle):void");
    }
}
