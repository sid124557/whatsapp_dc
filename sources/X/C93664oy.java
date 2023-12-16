package X;

import com.whatsapp.gallery.MediaGalleryActivity;
import java.util.Collection;

/* renamed from: X.4oy  reason: invalid class name and case insensitive filesystem */
public final class C93664oy extends C113255l8 {
    public final MediaGalleryActivity A00;
    public final C93774pH A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93664oy(AnonymousClass5M7 r4, MediaGalleryActivity mediaGalleryActivity, C93774pH r6) {
        super(r4.A00(mediaGalleryActivity));
        C162457s7.A0J(r4, 1);
        this.A00 = mediaGalleryActivity;
        this.A01 = r6;
    }

    public boolean B2s(AnonymousClass654 r4, Collection collection, int i) {
        C162457s7.A0J(collection, 1);
        if (i == 19) {
            return this.A01.A00.A02(this.A00, C86654Ky.A0b(collection));
        } else if (i != 20) {
            return super.B2s(r4, collection, i);
        } else {
            return this.A01.A01.A02(this.A00, C86654Ky.A0b(collection));
        }
    }
}
