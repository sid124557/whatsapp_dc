package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C06560Yg;
import X.C08310eF;
import X.C56972sr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class ContactQrMyCodeFragment extends Hilt_ContactQrMyCodeFragment {
    public C56972sr A00;
    public ContactQrContactCardView A01;
    public String A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) C06560Yg.A02(inflate, R.id.contact_qr_card);
        this.A01 = contactQrContactCardView;
        contactQrContactCardView.setStyle(0);
        this.A01.A02(C56972sr.A01(this.A00), true);
        this.A01.setPrompt(C08310eF.A09(this).getString(R.string.f11nameremoved));
        ContactQrContactCardView contactQrContactCardView2 = this.A01;
        if (!(contactQrContactCardView2 == null || (str = this.A02) == null)) {
            contactQrContactCardView2.setQrCode(AnonymousClass000.A0V("https://wa.me/qr/", str, AnonymousClass001.A0o()));
        }
        return inflate;
    }
}
