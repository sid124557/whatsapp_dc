package X;

import java.util.HashMap;

/* renamed from: X.2eP  reason: invalid class name and case insensitive filesystem */
public class C48132eP {
    public final HashMap A00 = AnonymousClass001.A0t();

    public AnonymousClass1I7 A00(AnonymousClass33C r3) {
        AnonymousClass1I7 r0;
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            r0 = (AnonymousClass1I7) hashMap.get(r3);
        }
        return r0;
    }

    public void A01(AnonymousClass33C r4, String str) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            if (hashMap.remove(r4) != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("MediaDataHelper/removeDownloader/successfully remove downloader for mediaDataV2 = ");
                A0o.append(r4);
                C18260x0.A0q("mediaHash=", str, A0o);
            }
        }
    }
}
