package X;

import android.os.Bundle;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;

/* renamed from: X.6AL  reason: invalid class name */
public class AnonymousClass6AL implements C1226765h {
    public Object A00;
    public final int A01;

    public AnonymousClass6AL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BQo(int i, long j, long j2) {
        long j3 = j2;
        if (this.A01 != 0) {
            StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A00;
            Log.i("storage-usage-gallery-activity/message delete started");
            storageUsageGalleryActivity.A0S = new C117285rg(storageUsageGalleryActivity, i, 3, j, j3);
            if (i > 0) {
                storageUsageGalleryActivity.A0V.postDelayed(storageUsageGalleryActivity.A0Z, 800);
                return;
            }
            return;
        }
        StorageUsageDeleteCompleteDialogFragment storageUsageDeleteCompleteDialogFragment = new StorageUsageDeleteCompleteDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putLong("deleted_disk_size", j2);
        storageUsageDeleteCompleteDialogFragment.A0u(A08);
        storageUsageDeleteCompleteDialogFragment.A1O(((C08310eF) this.A00).A0T(), (String) null);
    }
}
