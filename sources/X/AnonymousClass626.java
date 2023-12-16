package X;

import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.626  reason: invalid class name */
public final class AnonymousClass626 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterDirectoryActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass626(NewsletterDirectoryActivity newsletterDirectoryActivity) {
        super(1);
        this.this$0 = newsletterDirectoryActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4US A75;
        C372821q r4;
        C104605Rq r7 = (C104605Rq) obj;
        NewsletterDirectoryActivity newsletterDirectoryActivity = this.this$0;
        C162457s7.A0H(r7);
        newsletterDirectoryActivity.A04.BkP(new C70123Zz(newsletterDirectoryActivity, 6, r7));
        int ordinal = r7.A01.ordinal();
        boolean z = true;
        if (ordinal != 3) {
            if (ordinal == 2) {
                A75 = newsletterDirectoryActivity.A75();
                z = false;
            }
            return C59022wD.A00;
        }
        A75 = newsletterDirectoryActivity.A75();
        C95804uY r5 = r7.A00;
        C115085o6 r0 = A75.A06;
        if (z) {
            r4 = C372821q.GUEST;
        } else {
            r4 = C372821q.SUBSCRIBED;
        }
        AnonymousClass7N6 r02 = (AnonymousClass7N6) r0.A00.A07();
        if (r02 != null) {
            List list = r02.A03;
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : list) {
                if (C162457s7.A0P(((AnonymousClass31A) next).A05(), r5)) {
                    A0s.add(next);
                }
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                C162457s7.A0J(r4, 0);
                ((AnonymousClass1RL) it.next()).A07 = r4;
            }
        }
        return C59022wD.A00;
    }
}
