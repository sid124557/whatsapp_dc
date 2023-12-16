package X;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.2gk  reason: invalid class name and case insensitive filesystem */
public final class C49572gk {
    public final C56612sH A00;
    public final C47922e3 A01;
    public final AnonymousClass4FV A02;
    public final HashMap A03 = AnonymousClass001.A0t();

    public final void A00(String str) {
        C162457s7.A0J(str, 0);
        HashMap hashMap = this.A03;
        if (hashMap.containsKey(str)) {
            this.A01.A01(AnonymousClass22M.A0D, (String) null);
        }
        AnonymousClass0x2.A1J(str, hashMap, SystemClock.elapsedRealtime());
    }

    public C49572gk(C56612sH r2, C47922e3 r3, AnonymousClass4FV r4) {
        C18260x0.A0Q(r4, r2);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A01(String str, String str2) {
        C18260x0.A0O(str, str2);
        HashMap hashMap = this.A03;
        Number A0p = AnonymousClass0x9.A0p(str, hashMap);
        if (A0p == null) {
            this.A01.A01(AnonymousClass22M.A0E, (String) null);
            return;
        }
        hashMap.remove(str);
        C24591Xz r4 = new C24591Xz();
        r4.A02 = AnonymousClass000.A0T(str, str2);
        C24591Xz.A00(r4, SystemClock.elapsedRealtime(), A0p.longValue());
        this.A02.BhD(r4);
    }
}
