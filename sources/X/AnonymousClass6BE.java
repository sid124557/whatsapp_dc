package X;

import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;

/* renamed from: X.6BE  reason: invalid class name */
public class AnonymousClass6BE implements C182468oS {
    public Object A00;
    public final int A01;

    public AnonymousClass6BE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final C186308v5 B0p(boolean z) {
        C114205mf r5;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) obj;
            AnonymousClass1VX r7 = storageUsageMediaGalleryFragment.A0J;
            C55832qz r9 = storageUsageMediaGalleryFragment.A08;
            r5 = new C134336iq(storageUsageMediaGalleryFragment.A04, r7, storageUsageMediaGalleryFragment.A07, r9, storageUsageMediaGalleryFragment.A0A, storageUsageMediaGalleryFragment.A03, storageUsageMediaGalleryFragment.A00);
        } else {
            MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) obj;
            AnonymousClass1VX r72 = mediaGalleryFragment.A0J;
            C55832qz r92 = mediaGalleryFragment.A04;
            r5 = new C114205mf(mediaGalleryFragment.A01, r72, mediaGalleryFragment.A03, r92, mediaGalleryFragment.A05);
        }
        if (r5.A01 == null) {
            C55832qz r4 = r5.A05;
            r5.A01 = new C86684Lb(r5.A00(), (AnonymousClass1VX) null, r5.A04, r4);
        }
        return r5;
    }
}
