package X;

import com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment;
import java.util.Collection;
import java.util.List;

/* renamed from: X.61x  reason: invalid class name and case insensitive filesystem */
public final class C1217961x extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterInfoMembersSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1217961x(NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment) {
        super(1);
        this.this$0 = newsletterInfoMembersSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Collection collection = (Collection) obj;
        C162457s7.A0J(collection, 0);
        NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = this.this$0;
        C87204Ok r1 = newsletterInfoMembersSearchFragment.A06;
        if (r1 != null) {
            C91534kK r0 = newsletterInfoMembersSearchFragment.A05;
            if (r0 == null) {
                throw C18270x1.A0S("newsletterInfoViewModel");
            }
            AnonymousClass1RL r02 = r0.A00;
            if (r02 == null) {
                throw C18270x1.A0S("newsletterInfo");
            }
            r1.A00 = r02.A07;
            List list = r1.A0D;
            list.clear();
            list.addAll(collection);
            r1.A00(r1.A01);
            return C59022wD.A00;
        }
        throw C18270x1.A0S("adapter");
    }
}
