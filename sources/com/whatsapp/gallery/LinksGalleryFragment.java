package com.whatsapp.gallery;

import X.AnonymousClass002;
import X.AnonymousClass3UX;
import X.AnonymousClass5Y0;
import X.AnonymousClass665;
import X.C103445Mz;
import X.C106065Xm;
import X.C106685Zz;
import X.C111095hX;
import X.C114635nM;
import X.C33141sV;
import X.C66533Lu;
import X.C72173dI;
import X.C95244su;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public class LinksGalleryFragment extends Hilt_LinksGalleryFragment implements AnonymousClass665 {
    public C111095hX A00;
    public C103445Mz A01;
    public C66533Lu A02;
    public C106065Xm A03;
    public C114635nM A04;
    public AnonymousClass5Y0 A05;
    public C106685Zz A06;
    public AnonymousClass3UX A07;
    public C33141sV A08;

    public void A0o(Bundle bundle) {
        super.A0o(bundle);
        C95244su r1 = new C95244su(this);
        this.A0A = r1;
        this.A02.setAdapter(r1);
        AnonymousClass002.A09(A0J(), R.id.empty_text).setText(R.string.f11nameremoved);
    }

    public void A1G(Context context) {
        super.A1G(context);
        this.A01 = new C103445Mz(C72173dI.A00(this.A0G));
    }
}
