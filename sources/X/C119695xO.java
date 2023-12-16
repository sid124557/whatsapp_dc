package X;

import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.5xO  reason: invalid class name and case insensitive filesystem */
public final class C119695xO extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119695xO(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GalleryTabHostFragment galleryTabHostFragment = this.this$0;
        AnonymousClass30B r4 = galleryTabHostFragment.A06;
        if (r4 != null) {
            C620633i r3 = galleryTabHostFragment.A08;
            if (r3 != null) {
                return new C53492nB(galleryTabHostFragment.A0H, r4, r3, "tabbed-gallery-ui");
            }
            throw C18270x1.A0S("systemServices");
        }
        throw C18270x1.A0S("caches");
    }
}
