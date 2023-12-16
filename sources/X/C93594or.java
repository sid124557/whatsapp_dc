package X;

import android.os.Handler;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.4or  reason: invalid class name and case insensitive filesystem */
public final class C93594or extends C113225l5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93594or(C47052cd r2) {
        super(r2);
        C162457s7.A0J(r2, 1);
    }

    public boolean A00(C89654ea r7, Collection collection) {
        if (!(r7 instanceof StorageUsageGalleryActivity)) {
            return super.A00(r7, collection);
        }
        StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) r7;
        AnonymousClass5QO r2 = storageUsageGalleryActivity.A0E;
        if (r2 == null || r2.A04.isEmpty()) {
            Log.e("storageusagegallery/dialog/delete no messages");
            return true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("storageusagegallery/dialog/delete/");
        C18260x0.A1G(A0o, r2.A04.size());
        storageUsageGalleryActivity.A74();
        storageUsageGalleryActivity.A07 = new AnonymousClass0QU();
        Collection values = storageUsageGalleryActivity.A0E.A04.values();
        storageUsageGalleryActivity.A0G = new C991454p(storageUsageGalleryActivity.A07, new AnonymousClass6BT(storageUsageGalleryActivity, 1, values), storageUsageGalleryActivity.A0H, values);
        storageUsageGalleryActivity.A0T = new C71573cK(storageUsageGalleryActivity, 31, values);
        Handler handler = storageUsageGalleryActivity.A0V;
        handler.postDelayed(storageUsageGalleryActivity.A0a, 800);
        handler.postDelayed(storageUsageGalleryActivity.A0T, 5000);
        C18270x1.A0w(storageUsageGalleryActivity.A0G, storageUsageGalleryActivity.A04);
        Log.i("storage-usage-gallery-activity/load duplicate messages");
        return true;
    }
}
