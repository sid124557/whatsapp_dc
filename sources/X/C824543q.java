package X;

import com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient;
import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel;

/* renamed from: X.43q  reason: invalid class name and case insensitive filesystem */
public final class C824543q extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass48N $assistedFactory;
    public final /* synthetic */ C95804uY $newsletterJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C824543q(C95804uY r2, AnonymousClass48N r3) {
        super(1);
        this.$assistedFactory = r3;
        this.$newsletterJid = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass48N r1 = this.$assistedFactory;
        C95804uY r5 = this.$newsletterJid;
        AnonymousClass3S9 r12 = (AnonymousClass3S9) r1;
        AnonymousClass1VX A4B = C64333Db.A4B(r12.A00.A03);
        C118075sx r2 = r12.A00;
        C64333Db r13 = r2.A03;
        NewsletterAppealsClient ACi = r2.A01.ACi();
        AnonymousClass46Q r10 = AnonymousClass2C4.A01;
        C615931l.A00(r10);
        return new NewsletterAlertsViewModel(C64333Db.A39(r13), A4B, r5, (AnonymousClass5UP) r13.ANe.get(), (C51022j9) r13.ANj.get(), ACi, (C49612go) r13.ANv.get(), r10);
    }
}
