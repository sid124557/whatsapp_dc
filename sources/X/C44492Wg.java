package X;

import android.os.Build;
import com.whatsapp.networkresources.NetworkResourceDownloadWorker;
import java.util.Map;

/* renamed from: X.2Wg  reason: invalid class name and case insensitive filesystem */
public class C44492Wg {
    public final C34171uL A00;

    public void A00(C58472vJ r7, String str) {
        AnonymousClass0Pq r5 = new AnonymousClass0Pq();
        r5.A02(C02380Fy.CONNECTED);
        r5.A02 = true;
        r5.A05 = true;
        if (Build.VERSION.SDK_INT >= 23) {
            r5.A01();
        }
        AnonymousClass0Aw r4 = new AnonymousClass0Aw(NetworkResourceDownloadWorker.class);
        AnonymousClass0Q9 r3 = new AnonymousClass0Q9();
        Map map = r3.A00;
        map.put("resource_id", str);
        map.put("resource_filename", r7.A01);
        C18320x8.A1A(r3, r4);
        r4.A04(r5.A00());
        r4.A06("NetworkResourceDownloadTask-Lazy");
        C01460Ay A0I = AnonymousClass0x9.A0I(r4);
        C72333dY.A01(this.A00).A07(C02320Fs.REPLACE, A0I, AnonymousClass000.A0V("Resource-Download-", str, AnonymousClass001.A0o()));
    }

    public C44492Wg(C34171uL r1) {
        this.A00 = r1;
    }
}
