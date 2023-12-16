package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.2gQ  reason: invalid class name and case insensitive filesystem */
public class C49372gQ {
    public C172228Ke A00;
    public Map A01;
    public final C54292oU A02;
    public final C60152y5 A03;

    public final void A00() {
        C18270x1.A0j(C60152y5.A00(this.A03, "bloks"), "bk_cache_lookup_map", this.A01.values().toString());
    }

    public C49372gQ(C54292oU r5, C60152y5 r6) {
        this.A02 = r5;
        this.A03 = r6;
        try {
            this.A00 = C172228Ke.A00((AnonymousClass7EN) null, AnonymousClass002.A0A(C54292oU.A02(r5), "bk_cache_dir"), 10485760);
        } catch (IOException unused) {
            Log.e("BkCacheSaveOnDiskHelper/const unable to initialize disk cache for bk cache");
        }
        this.A01 = AnonymousClass001.A0t();
    }
}
