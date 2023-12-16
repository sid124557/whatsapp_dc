package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass08M;
import X.AnonymousClass0x9;
import X.AnonymousClass4UC;
import X.C05550Ty;
import X.C40722Hm;
import com.whatsapp.newsletterenforcements.userreports.NewsletterUserReportsNetworkClient;
import com.whatsapp.util.Log;

public final class NewsletterUserReportsViewModel extends C05550Ty {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final NewsletterUserReportsNetworkClient A02;
    public final C40722Hm A03;
    public final AnonymousClass4UC A04 = AnonymousClass0x9.A0b();

    public NewsletterUserReportsViewModel(NewsletterUserReportsNetworkClient newsletterUserReportsNetworkClient, C40722Hm r3) {
        this.A02 = newsletterUserReportsNetworkClient;
        this.A03 = r3;
    }

    public void A0C() {
        Log.i("onCleared");
        this.A03.A00.clear();
    }
}
