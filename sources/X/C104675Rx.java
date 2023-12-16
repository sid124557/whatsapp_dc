package X;

/* renamed from: X.5Rx  reason: invalid class name and case insensitive filesystem */
public class C104675Rx {
    public final C56612sH A00;
    public final C34441vA A01;

    public C102755Kd A00() {
        C102745Kc r2 = new C102745Kc();
        if (A02("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME")) {
            r2.A04 = this.A01.A01("STORAGE_USAGE_MEDIA_SIZE");
        }
        if (A02("STORAGE_USAGE_LARGE_FILES_CACHE_TIME")) {
            C34441vA r1 = this.A01;
            r2.A03 = r1.A01("STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE");
            r2.A01 = r1.A00("STORAGE_USAGE_LARGE_FILES_COUNT");
            r2.A06 = r1.A03("STORAGE_USAGE_LARGE_FILES_ROW_IDS");
        }
        if (A02("STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME")) {
            C34441vA r12 = this.A01;
            r2.A02 = r12.A01("STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE");
            r2.A00 = r12.A00("STORAGE_USAGE_FORWARDED_FILES_COUNT");
            r2.A05 = r12.A03("STORAGE_USAGE_FORWARDED_FILES_ROW_IDS");
        }
        return new C102755Kd(r2);
    }

    public final void A01(String str) {
        this.A01.A05(str, String.valueOf(this.A00.A0H()));
    }

    public final boolean A02(String str) {
        Long A012 = this.A01.A01(str);
        if (A012 == null || this.A00.A0H() - A012.longValue() > 2592000000L) {
            return false;
        }
        return true;
    }

    public C104675Rx(C56612sH r1, C34441vA r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
