package X;

import android.os.Bundle;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;

/* renamed from: X.73w  reason: invalid class name and case insensitive filesystem */
public final class C1450273w {
    public static final BusinessApiBrowseFragment A00(C166447yh r3, String str, String str2) {
        C162457s7.A0J(str, 1);
        BusinessApiBrowseFragment businessApiBrowseFragment = new BusinessApiBrowseFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("INITIAL_API_CATEGORY", r3);
        A08.putString("ENTRYPOINT_TYPE", str);
        A08.putString("API_BIZ_SEARCH_USE_CASE", str2);
        businessApiBrowseFragment.A0u(A08);
        return businessApiBrowseFragment;
    }
}
