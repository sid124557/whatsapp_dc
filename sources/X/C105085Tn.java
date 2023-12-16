package X;

import android.text.TextUtils;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5Tn  reason: invalid class name and case insensitive filesystem */
public class C105085Tn {
    public Long A00;
    public boolean A01;
    public final AnonymousClass4w0 A02;
    public final C56612sH A03;
    public final AnonymousClass5ZR A04;
    public final AnonymousClass1VX A05;
    public final C105355Up A06;
    public final AtomicBoolean A07 = C18280x3.A0l();

    public static Integer A00(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        return businessDirectoryContextualSearchViewModel.A0R.A03();
    }

    public AnonymousClass5ZO A01() {
        try {
            AnonymousClass4w0 r3 = this.A02;
            String A0v = AnonymousClass0x9.A0v(r3.A04.A01(), "current_search_location");
            if (TextUtils.isEmpty(A0v)) {
                return null;
            }
            return AnonymousClass5ZO.A02(C616731u.A00(r3.A00, r3.A03, A0v));
        } catch (Exception e) {
            Log.e("SearchLocationRepository/readSearchLocation: Failed to fetch the search location", e);
            return null;
        }
    }

    public boolean A04() {
        if (this.A06.A0A()) {
            return this.A04.A05();
        }
        AnonymousClass4w0 r1 = this.A02;
        return r1.A04.A01().getBoolean("location_access_granted", r1.A00.A0A());
    }

    public C105085Tn(AnonymousClass4w0 r2, C56612sH r3, AnonymousClass5ZR r4, AnonymousClass1VX r5, C105355Up r6) {
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = r6;
        this.A02 = r2;
    }

    public AnonymousClass5ZO A02() {
        AnonymousClass5ZO A012 = A01();
        if (A012 == null) {
            return null;
        }
        if ("device".equals(A012.A09) && (this.A01 || !this.A06.A0A())) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.A00;
            if (l == null || 86400000 < currentTimeMillis - l.longValue()) {
                return null;
            }
        }
        return A012;
    }

    public Integer A03() {
        int i;
        AnonymousClass5ZO A012 = A01();
        if (A012 != null) {
            i = A012.A04();
        } else {
            i = 2;
        }
        return Integer.valueOf(i);
    }
}
