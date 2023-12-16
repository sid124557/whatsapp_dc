package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.8X1  reason: invalid class name */
public final class AnonymousClass8X1 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C186308v5 $safeMediaList;
    public final /* synthetic */ MediaGalleryFragmentBase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8X1(C186308v5 r2, MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        super(0);
        this.this$0 = mediaGalleryFragmentBase;
        this.$safeMediaList = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.this$0;
        mediaGalleryFragmentBase.A0X = true;
        mediaGalleryFragmentBase.A01 = this.$safeMediaList.getCount();
        this.this$0.A1P();
        return C59022wD.A00;
    }
}
