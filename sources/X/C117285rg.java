package X;

import android.os.Bundle;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5rg  reason: invalid class name and case insensitive filesystem */
public class C117285rg implements Runnable {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public final int A04;

    public C117285rg(Object obj, int i, int i2, long j, long j2) {
        this.A04 = i2;
        this.A03 = obj;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    public final void run() {
        AnonymousClass6PS r0;
        switch (this.A04) {
            case 0:
                return;
            case 1:
                ((AnonymousClass7VZ) this.A03).A01.BMu(this.A00, this.A01, this.A02);
                return;
            case 2:
                C1685685x r3 = (C1685685x) ((C148697Jj) this.A03).A02;
                C158187jZ r1 = r3.A06;
                if (r1.A03.isEmpty()) {
                    r0 = null;
                } else {
                    r0 = (AnonymousClass6PS) C162247rW.getLast(r1.A03);
                }
                AnonymousClass7XD A012 = r3.A01(r0);
                r3.A03(A012, new C110965hK(A012), 1006);
                return;
            default:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A03;
                long j = this.A01;
                long j2 = this.A02;
                int i = this.A00;
                Log.i("storage-usage-gallery-activity/message delete completed");
                storageUsageGalleryActivity.BjL();
                storageUsageGalleryActivity.A02 += j;
                storageUsageGalleryActivity.A75();
                String str = storageUsageGalleryActivity.A0U;
                int i2 = storageUsageGalleryActivity.A00;
                AnonymousClass4FV r2 = storageUsageGalleryActivity.A0M;
                C25321aK r12 = new C25321aK();
                AnonymousClass296.A00(r12, str, 6, i2);
                r12.A04 = Long.valueOf(j2);
                r12.A03 = AnonymousClass0x9.A0m(i);
                r2.BhD(r12);
                AnonymousClass5QO r02 = storageUsageGalleryActivity.A0E;
                if (r02 != null) {
                    r02.A04.clear();
                }
                AnonymousClass0R2 r03 = storageUsageGalleryActivity.A06;
                if (r03 != null) {
                    r03.A05();
                }
                if (j2 > 0) {
                    StorageUsageDeleteCompleteDialogFragment storageUsageDeleteCompleteDialogFragment = new StorageUsageDeleteCompleteDialogFragment();
                    Bundle A08 = AnonymousClass002.A08();
                    A08.putLong("deleted_disk_size", j2);
                    storageUsageDeleteCompleteDialogFragment.A0u(A08);
                    C18270x1.A0t(storageUsageDeleteCompleteDialogFragment, storageUsageGalleryActivity);
                }
                storageUsageGalleryActivity.A0S = null;
                return;
        }
    }
}
