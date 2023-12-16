package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Fh  reason: invalid class name and case insensitive filesystem */
public class C64863Fh implements AnonymousClass664 {
    public final C50132hg A00;

    public void BQV() {
        Log.d("NetworkResourceDailyCron/onDailyCron");
        C50132hg r4 = this.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass0x2.A1F("bad-image", ".png", A0s);
        AnonymousClass0x2.A1F("android_to_ios_start_v2", ".png", A0s);
        AnonymousClass0x2.A1F("android_to_ios_start_v2_night", ".png", A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C70113Zy.A01(r4.A05, r4, it.next(), 32);
        }
        Log.d("NetworkResourcesManager/deleteOldFiles()");
    }

    public C64863Fh(C50132hg r1) {
        this.A00 = r1;
    }

    public String BDW() {
        return "NetworkResourceDailyCron";
    }
}
