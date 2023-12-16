package X;

import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.54p  reason: invalid class name and case insensitive filesystem */
public class C991454p extends AnonymousClass5ZM {
    public final AnonymousClass0QU A00;
    public final AnonymousClass65B A01;
    public final AnonymousClass319 A02;
    public final HashMap A03 = AnonymousClass001.A0t();

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        StorageUsageDeleteMessagesDialogFragment A002;
        C08270df A0T;
        Collection collection = (Collection) obj;
        AnonymousClass6BT r1 = (AnonymousClass6BT) this.A01;
        int i = r1.A02;
        Object obj2 = r1.A00;
        if (i != 0) {
            StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) obj2;
            Log.i("storage-usage-gallery-activity/load duplicate messages/loaded");
            storageUsageGalleryActivity.A74();
            A002 = StorageUsageDeleteMessagesDialogFragment.A00(new AnonymousClass6AL(storageUsageGalleryActivity, 1), (Collection) r1.A01, collection);
            A0T = storageUsageGalleryActivity.getSupportFragmentManager();
        } else {
            C08310eF r3 = (C08310eF) obj2;
            A002 = StorageUsageDeleteMessagesDialogFragment.A00(new AnonymousClass6AL(r3, 0), (Collection) r1.A01, collection);
            C003203q A0Q = r3.A0Q();
            if (A0Q != null && !A0Q.isFinishing()) {
                A0T = r3.A0T();
            } else {
                return;
            }
        }
        A002.A1O(A0T, (String) null);
    }

    public C991454p(AnonymousClass0QU r5, AnonymousClass65B r6, AnonymousClass319 r7, Collection collection) {
        File file;
        this.A02 = r7;
        this.A00 = r5;
        this.A01 = r6;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (A0T instanceof C30471mV) {
                C30471mV r1 = (C30471mV) A0T;
                String str = r1.A04;
                AnonymousClass33C r0 = r1.A01;
                if (r0 != null) {
                    file = r0.A0F;
                } else {
                    file = null;
                }
                if (!(str == null || file == null)) {
                    this.A03.put(str, file);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0u = AnonymousClass001.A0u(this.A03);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            String A0q = C18310x6.A0q(A0w);
            A0s.addAll(this.A02.A0E(this.A00, (File) A0w.getValue(), A0q));
        }
        return A0s;
    }
}
