package X;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5WT  reason: invalid class name */
public final class AnonymousClass5WT {
    public static final List A01;
    public static final List A02 = C18290x4.A12("Avatars2");
    public final C183538qC A00;

    public AnonymousClass5WT(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    static {
        String[] strArr = new String[4];
        strArr[0] = "wa_effect_asset_disk_cache";
        strArr[1] = "wa_face_tracking_asset_disk_cache";
        strArr[2] = "wa_multi_model_asset_disk_cache";
        A01 = AnonymousClass0x9.A19("wa_scripting_asset_disk_cache", strArr, 3);
    }

    public final void A00(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File A0A = AnonymousClass002.A0A(((C54292oU) this.A00.get()).A00.getCacheDir(), AnonymousClass001.A0m(it));
            if (A0A.isDirectory()) {
                C174438Un.A00(A0A);
            }
        }
    }
}
