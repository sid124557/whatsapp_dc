package com.whatsapp.catalogcategory.view;

import X.AnonymousClass0GH;
import X.AnonymousClass4GP;
import X.AnonymousClass4GQ;
import X.AnonymousClass90T;
import X.AnonymousClass920;
import X.AnonymousClass93V;
import X.C108815db;
import X.C146957Cg;
import X.C148087Gw;
import X.C152967aS;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;

public final class CategoryThumbnailLoader implements C17280vG {
    public final C15910sA A00;
    public final C152967aS A01;

    public final void A00(C108815db r10, UserJid userJid, AnonymousClass4GP r12, AnonymousClass4GP r13, AnonymousClass4GQ r14) {
        C148087Gw r5 = new C148087Gw(new C146957Cg(897451484), userJid);
        C108815db r3 = r10;
        this.A01.A01((ImageView) null, r3, new AnonymousClass90T(r13, 5), r5, new AnonymousClass920(r12, 1), new AnonymousClass93V(r14, 5), 2);
    }

    public void BcK(AnonymousClass0GH r3, C15910sA r4) {
        C162457s7.A0J(r3, 1);
        if (r3.ordinal() == 5) {
            this.A01.A00();
            this.A00.getLifecycle().A01(this);
        }
    }

    public CategoryThumbnailLoader(C15910sA r2, C152967aS r3) {
        this.A01 = r3;
        this.A00 = r2;
        r2.getLifecycle().A00(this);
    }
}
