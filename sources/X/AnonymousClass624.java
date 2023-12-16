package X;

import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.624  reason: invalid class name */
public final class AnonymousClass624 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterDirectoryActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass624(NewsletterDirectoryActivity newsletterDirectoryActivity) {
        super(1);
        this.this$0 = newsletterDirectoryActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map map = (Map) obj;
        NewsletterDirectoryActivity newsletterDirectoryActivity = this.this$0;
        C162457s7.A0H(map);
        AnonymousClass4X6 r5 = newsletterDirectoryActivity.A0C;
        if (r5 == null) {
            throw C18270x1.A0S("newsletterDirectoryAdapter");
        }
        C162457s7.A0J(map, 0);
        List list = r5.A08;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            if (next instanceof C96934xH) {
                A0s.add(next);
            }
        }
        C129586aY copyOf = C129586aY.copyOf((Collection) A0s);
        Iterator A0q = AnonymousClass000.A0q(map);
        boolean z = false;
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Iterator it = A0s.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i2 = i + 1;
                if (C162457s7.A0P(((C96934xH) it.next()).A02.A05(), A0w.getKey())) {
                    if (((C96934xH) copyOf.get(i)).A02.A07 != ((C104595Rp) A0w.getValue()).A00.A07) {
                        ((C96934xH) copyOf.get(i)).A01 = false;
                        AnonymousClass1RL r1 = ((C96934xH) copyOf.get(i)).A02;
                        C372821q r0 = ((C104595Rp) A0w.getValue()).A00.A07;
                        C162457s7.A0J(r0, 0);
                        r1.A07 = r0;
                        z = true;
                        break;
                    }
                }
                i = i2;
            }
        }
        if (z) {
            C162457s7.A0H(copyOf);
            r5.A0M(copyOf);
        }
        return C59022wD.A00;
    }
}
