package com.whatsapp.product.newsletterenforcements.newsletterguidelines;

import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.C003203q;
import X.C106715a2;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C53602nM;
import X.C633939b;
import X.C70133a0;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final class NewsletterGuidelinesRequirementsBottomSheet extends Hilt_NewsletterGuidelinesRequirementsBottomSheet {
    public C53602nM A00;
    public AnonymousClass1VX A01;
    public C106715a2 A02;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C003203q A0R = A0R();
        View findViewById = view.findViewById(R.id.close_bottom_sheet);
        TextView A09 = AnonymousClass002.A09(view, R.id.bottom_sheet_description);
        C106715a2 r5 = this.A02;
        if (r5 != null) {
            A09.setText(r5.A06(A0R, C70133a0.A00(this, A0R, 7), AnonymousClass0x7.A0n(this, "clickable-span", AnonymousClass002.A0L(), 0, R.string.f11nameremoved), "clickable-span", C18290x4.A00(A0R)));
            AnonymousClass1VX r0 = this.A01;
            if (r0 != null) {
                C18270x1.A0q(A09, r0);
                C633939b.A00(findViewById, this, 24);
                return;
            }
            throw C18270x1.A0R();
        }
        throw C18270x1.A0S("linkifier");
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
