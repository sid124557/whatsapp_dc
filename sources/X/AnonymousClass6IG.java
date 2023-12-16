package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.6IG  reason: invalid class name */
public final class AnonymousClass6IG extends C05570Ua {
    public final C95294tG A00;

    public AnonymousClass6IG(MediaGalleryFragmentBase mediaGalleryFragmentBase, C95294tG r4) {
        super(r4);
        this.A00 = r4;
        r4.setSelector((Drawable) null);
        r4.setOnClickListener(new AnonymousClass54E(this, 8, mediaGalleryFragmentBase));
        r4.setOnLongClickListener(new AnonymousClass919(this, 4, mediaGalleryFragmentBase));
    }
}
