package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity;
import com.whatsapp.wabloks.ui.WaFcsModalActivity;
import com.whatsapp.wabloks.ui.WaFcsPreloadedBloksActivity;
import java.util.Map;

/* renamed from: X.3Rm  reason: invalid class name and case insensitive filesystem */
public final class C68003Rm implements C185488tl {
    public AnonymousClass3Z6 A00;
    public final C59842xa A01;
    public final C54292oU A02;
    public final C53332mv A03;

    public C08310eF B9o(String str, String str2, String str3, Map map, Map map2, int i) {
        String str4;
        String str5 = str;
        C162457s7.A0J(str, 0);
        String str6 = str3;
        C18260x0.A0b(map, str3, map2, 2);
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str4 = (String) obj) == null) {
            throw AnonymousClass001.A0c("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        AnonymousClass3Z6 r0 = this.A00;
        if (r0 != null) {
            String A0d = C18280x3.A0d(map2);
            return BkFcsPreloadingScreenFragment.A00(this.A03.A03.A00(str3), str4, str5, (String) r0.first, (String) r0.second, A0d, C59842xa.A00(Integer.valueOf(i)), str6, str2);
        }
        throw C18270x1.A0S("dataModuleNamespaceData");
    }

    public static Intent A00(Intent intent, String str, String str2, String str3, String str4) {
        return intent.putExtra("fds_on_back", str).putExtra("fds_on_back_params", str2).putExtra("fds_button_style", str3).putExtra("fds_state_name", str4);
    }

    public void Ay7(boolean z) {
        String str;
        Context context = this.A02.A00;
        Intent A07 = C18320x8.A07();
        String packageName = context.getPackageName();
        if (z) {
            str = "com.whatsapp.wabloks.ui.WaFcsModalActivity";
        } else {
            str = "com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity";
        }
        A07.setClassName(packageName, str);
        A07.setFlags(872415232);
        context.startActivity(A07);
    }

    public void Bg0(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i) {
        String str7;
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str7 = (String) obj) == null) {
            throw AnonymousClass001.A0c("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        Context context = this.A02.A00;
        C162457s7.A0D(context);
        AnonymousClass3Z6 r0 = this.A00;
        if (r0 != null) {
            String A0d = C18280x3.A0d(map2);
            C18280x3.A0n(context, A00(AnonymousClass0x9.A08(context, WaFcsPreloadedBloksActivity.class).putExtra("screen_name", str7).putExtra("data_module_job_id", (String) r0.first).putExtra("data_module_namespace", (String) r0.second).putExtra("fds_manager_id", str6).putExtra("screen_params", A0d), str, str2, str3, str4).putExtra("fds_observer_id", str5).putExtra("qpl_param_map", C59842xa.A00(Integer.valueOf(i))).putExtra("screen_cache_config", this.A03.A03.A00(str6)));
            return;
        }
        throw C18270x1.A0S("dataModuleNamespaceData");
    }

    public void BgH(C141576vn r9, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i, int i2, boolean z) {
        String str7;
        Intent putExtra;
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str7 = (String) obj) == null) {
            throw AnonymousClass001.A0c("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        Context context = this.A02.A00;
        C162457s7.A0D(context);
        if (r9 == C141576vn.BOTTOM_SHEET) {
            putExtra = A00(AnonymousClass0x9.A08(context, WaFcsBottomSheetModalActivity.class).putExtra("screen_params", C18280x3.A0d(map2)).putExtra("fds_observer_id", str5), str, str2, str3, str4).putExtra("fcs_bottom_sheet_max_height_percentage", i2).putExtra("fcs_show_divider_under_nav_bar", z);
            C162457s7.A0D(putExtra);
        } else {
            String A0d = C18280x3.A0d(map2);
            AnonymousClass39C A002 = this.A03.A03.A00(str6);
            putExtra = A00(AnonymousClass0x9.A08(context, WaFcsModalActivity.class).putExtra("screen_name", str7).putExtra("screen_params", A0d).putExtra("screen_cache_config", A002).putExtra("fds_observer_id", str5), str, str2, str3, str4).putExtra("qpl_param_map", C59842xa.A00(Integer.valueOf(i)));
        }
        putExtra.setFlags(268435456);
        context.startActivity(putExtra);
    }

    public C68003Rm(C59842xa r1, C54292oU r2, C53332mv r3) {
        C18260x0.A0Q(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }
}
