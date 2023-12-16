package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0NL  reason: invalid class name */
public class AnonymousClass0NL {
    public final C64393Dh A00;
    public final AnonymousClass310 A01;

    public AnonymousClass0NL(C64393Dh r1, AnonymousClass310 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(Set set) {
        if (!set.isEmpty()) {
            C64393Dh r3 = this.A00;
            r3.A0Y();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                File A07 = this.A01.A07(AnonymousClass001.A0m(it));
                if (C06540Yd.A0H(r3, A07) && !A07.exists()) {
                    File parentFile = A07.getParentFile();
                    if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                        try {
                            if (!A07.exists() && !A07.createNewFile()) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                AnonymousClass000.A10(A07, "gdrive-activity/create-placeholder/file/failed ", A0o);
                                Log.e(A0o.toString());
                            }
                        } catch (IOException e) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            AnonymousClass000.A10(A07, "gdrive-activity/create-placeholder/failed ", A0o2);
                            Log.e(A0o2.toString(), e);
                        }
                    } else {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        AnonymousClass000.A10(A07, "gdrive-activity/create-placeholder/dir/failed ", A0o3);
                        Log.e(A0o3.toString());
                    }
                }
            }
        }
    }
}
