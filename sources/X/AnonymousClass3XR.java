package X;

import android.app.Activity;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import java.util.Map;

/* renamed from: X.3XR  reason: invalid class name */
public final class AnonymousClass3XR implements C84184Bj {
    public void Bgk(Activity activity, C41182Jg r8, Map map) {
        C08310eF r2;
        C162457s7.A0K(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C08310eF A0D = ((C003203q) activity).getSupportFragmentManager().A0D("extensions_bottom_sheet_container");
        String str = null;
        if (A0D != null) {
            r2 = A0D.A0T().A0D("BK_FRAGMENT");
        } else {
            r2 = null;
        }
        boolean z = false;
        if (map != null) {
            if (map.containsKey("show_full_screen_error")) {
                z = AnonymousClass0x2.A1Z(map, "show_full_screen_error");
            }
            if (map.containsKey("custom_error_message")) {
                str = C18310x6.A0o("custom_error_message", map);
            }
        }
        if (r2 != null) {
            ((WaBkExtensionsLayoutViewModel) AnonymousClass0x9.A0H(r2).A01(WaBkExtensionsLayoutViewModel.class)).A0G((C27091dG) null, (String) null, str, "extensions-error-from-layout", z);
        }
    }
}
