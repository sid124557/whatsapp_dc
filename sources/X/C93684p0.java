package X;

import com.whatsapp.storage.StorageUsageGalleryActivity;
import java.util.Collection;

/* renamed from: X.4p0  reason: invalid class name and case insensitive filesystem */
public final class C93684p0 extends C113255l8 {
    public final StorageUsageGalleryActivity A00;
    public final C93764pG A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93684p0(AnonymousClass5M7 r4, StorageUsageGalleryActivity storageUsageGalleryActivity, C93764pG r6) {
        super(r4.A00(storageUsageGalleryActivity));
        C162457s7.A0J(r4, 1);
        this.A00 = storageUsageGalleryActivity;
        this.A01 = r6;
    }

    public boolean B2s(AnonymousClass654 r3, Collection collection, int i) {
        C162457s7.A0J(collection, 1);
        if (i == 21) {
            return this.A01.A00.A00(this.A00, collection);
        }
        return super.B2s(r3, collection, i);
    }
}
