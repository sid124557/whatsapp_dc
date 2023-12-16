package com.whatsapp.contact.photos;

import X.AnonymousClass0GH;
import X.C105365Uq;
import X.C15910sA;
import X.C17280vG;

public class ContactPhotos$LoaderLifecycleEventObserver implements C17280vG {
    public final C105365Uq A00;

    public void BcK(AnonymousClass0GH r2, C15910sA r3) {
        if (r2 == AnonymousClass0GH.ON_DESTROY) {
            this.A00.A00();
            r3.getLifecycle().A01(this);
        }
    }

    public ContactPhotos$LoaderLifecycleEventObserver(C105365Uq r1) {
        this.A00 = r1;
    }
}
