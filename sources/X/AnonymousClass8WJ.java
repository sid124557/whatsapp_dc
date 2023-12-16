package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.8WJ  reason: invalid class name */
public final class AnonymousClass8WJ extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ MediaGalleryFragmentBase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8WJ(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        super(0);
        this.this$0 = mediaGalleryFragmentBase;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass5Q0 r1 = this.this$0.A0O;
        if (r1 != null) {
            r1.A01 = true;
            return C59022wD.A00;
        }
        throw C18270x1.A0S("galleryPartialPermissionProvider");
    }
}
