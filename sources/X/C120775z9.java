package X;

import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.5z9  reason: invalid class name and case insensitive filesystem */
public final class C120775z9 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ WeakReference $activity;
    public final /* synthetic */ AnonymousClass1RL $newsletter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120775z9(AnonymousClass1RL r2, WeakReference weakReference) {
        super(0);
        this.$activity = weakReference;
        this.$newsletter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        NewsletterDirectoryActivity newsletterDirectoryActivity = (NewsletterDirectoryActivity) this.$activity.get();
        if (newsletterDirectoryActivity != null) {
            newsletterDirectoryActivity.A76(this.$newsletter);
        }
        return C59022wD.A00;
    }
}
