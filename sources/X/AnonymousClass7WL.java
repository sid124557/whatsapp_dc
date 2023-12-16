package X;

import com.whatsapp.util.Log;

/* renamed from: X.7WL  reason: invalid class name */
public class AnonymousClass7WL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C160827oN A02;

    public AnonymousClass7WL(C160827oN r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public void A00() {
        C160827oN r2 = this.A02;
        int i = this.A00;
        C626936e.A0C(AnonymousClass001.A1T(r2.A01(i)));
        Log.e("CategoryManager/onManifestError/manifest was errory");
        r2.A09(2, i);
        r2.A0C((String) null);
    }

    public void A01(C160627o1 r10) {
        String str;
        long j;
        int i;
        StringBuilder A0m;
        String str2;
        C160827oN r3 = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        C626936e.A0C(AnonymousClass001.A1T(r3.A01(i2)));
        if (r3 instanceof C133846i2) {
            str = "filter";
        } else {
            str = "doodle_emoji";
        }
        if (r10 == null) {
            C18260x0.A0r("CategoryManager/onManifestReady/No info in manifest for category ", str, AnonymousClass001.A0o());
            i = 2;
        } else {
            C626936e.A0C(str.equals(r10.A01));
            C160627o1 A022 = r3.A02();
            if (A022 != null) {
                if (!A022.A01().equals(r10.A01())) {
                    A0m = AnonymousClass000.A0m("CategoryManager/onManifestReady/category ", str);
                    str2 = " has stale hash against manifest. Clearing local info.";
                } else if (A022.A03(i2).equals(r10.A03(i2))) {
                    boolean A0D = r3.A0D(i2);
                    A0m = AnonymousClass000.A0m("CategoryManager/onManifestReady/category ", str);
                    if (A0D) {
                        C18260x0.A1J(A0m, " is up-to-date as confirmed from manifest, and category content is present.");
                        r3.A09(5, i2);
                        r3.A0C(A022.A03(i2));
                        r3.A07(i2);
                        return;
                    }
                    str2 = " has up-to-date hash against manifest's, but content is not present, clearing local hash too.";
                }
                C18260x0.A1J(A0m, str2);
                r3.A06();
            }
            if (i3 == 0) {
                synchronized (r3) {
                    Long l = (Long) r3.A02.get(i2);
                    if (l == null) {
                        j = 0;
                    } else {
                        j = l.longValue();
                    }
                }
                if (j + 3600000 > r3.A07.A0H()) {
                    C18260x0.A0q("CategoryManager/onManifestReady/Last failure is fresh, network fetch throttled for category ", str, AnonymousClass001.A0o());
                    i = 4;
                }
            }
            Log.d("CategoryManager/onManifestReady/Starting thread to download category data.");
            r3.A09(3, i2);
            r3.A0H.BkM(new C71733ca(r3, r10, i2));
            return;
        }
        r3.A09(i, i2);
        r3.A0C((String) null);
    }
}
