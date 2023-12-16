package com.whatsapp.gallery;

import X.AnonymousClass002;
import X.AnonymousClass2Y1;
import X.AnonymousClass3UW;
import X.AnonymousClass665;
import X.C105025Tg;
import X.C106065Xm;
import X.C111095hX;
import X.C187958y5;
import X.C48042eF;
import X.C55682qk;
import X.C69263Wi;
import X.C95254sv;
import android.os.Bundle;
import com.whatsapp.R;

public class DocumentsGalleryFragment extends Hilt_DocumentsGalleryFragment implements AnonymousClass665 {
    public C111095hX A00;
    public C55682qk A01;
    public C69263Wi A02;
    public AnonymousClass2Y1 A03;
    public AnonymousClass3UW A04;
    public C106065Xm A05;
    public C48042eF A06;
    public C105025Tg A07;
    public C187958y5 A08;

    public void A0o(Bundle bundle) {
        super.A0o(bundle);
        C95254sv r1 = new C95254sv(this);
        this.A0A = r1;
        this.A02.setAdapter(r1);
        AnonymousClass002.A09(A0J(), R.id.empty_text).setText(R.string.f11nameremoved);
    }
}
