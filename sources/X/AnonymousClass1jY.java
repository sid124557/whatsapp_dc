package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.payments.phoenix.webview.activity.FcsWebViewActivity;
import com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1jY  reason: invalid class name */
public final class AnonymousClass1jY extends AnonymousClass1jJ implements AnonymousClass4G9, AnonymousClass48Q {
    public FcsWebViewFragment A00;
    public List A01 = AnonymousClass001.A0s();
    public final C54292oU A02;
    public final C58992w9 A03;
    public final C60482yd A04;

    public C08310eF B9o(String str, String str2, String str3, Map map, Map map2, int i) {
        Object obj;
        Map map3;
        FcsWebViewFragment fcsWebViewFragment;
        Object obj2;
        String str4;
        String str5;
        String str6;
        HashMap hashMap;
        Map map4;
        Map map5;
        Map map6;
        C162457s7.A0J(str, 0);
        String str7 = str3;
        Map map7 = map;
        C18260x0.A0b(map7, str7, map2, 2);
        Object obj3 = map7.get("additional_params");
        if (!(obj3 instanceof Map) || (map6 = (Map) obj3) == null) {
            obj = null;
        } else {
            obj = map6.get("ext_message_id");
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        boolean A1W = AnonymousClass000.A1W(obj);
        String A0d = AnonymousClass0x2.A0d("url", map7);
        String A0o = C18310x6.A0o("successURL", map7);
        String A0o2 = C18310x6.A0o("failureURL", map7);
        Object obj4 = map7.get("inputPayload");
        if (obj4 instanceof Map) {
            map3 = (Map) obj4;
        } else {
            map3 = null;
        }
        String A0d2 = C18280x3.A0d(map3);
        C162457s7.A0D(A0d2);
        boolean A0P = C162457s7.A0P(map7.get("request_type"), "POST");
        String str8 = str2;
        if (A1W) {
            Object obj5 = map7.get("data");
            if (!(obj5 instanceof Map) || (map5 = (Map) obj5) == null) {
                obj2 = null;
            } else {
                obj2 = map5.get("screen");
            }
            if (obj2 instanceof String) {
                str4 = (String) obj2;
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            Object obj6 = map7.get("onTransitionAction");
            if (!(obj6 instanceof String) || (str5 = (String) obj6) == null) {
                str5 = "";
            }
            Object obj7 = map7.get("nextScreen");
            if (!(obj7 instanceof String) || (str6 = (String) obj7) == null) {
                str6 = "";
            }
            C58992w9 r5 = this.A03;
            int A042 = AnonymousClass002.A04(this.A01, 1);
            String A043 = C54292oU.A04(this.A02, R.string.f11nameremoved);
            Object obj8 = map7.get("outputPayload");
            if (!(obj8 instanceof Map) || (map4 = (Map) obj8) == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(map4);
            }
            fcsWebViewFragment = r5.A00(A0d, A0o, A0o2, A0d2, str8, str7, str4, str5, str6, A043, hashMap, A042, A0P);
        } else {
            int A032 = AnonymousClass002.A03(this.A01);
            C162457s7.A0J(A0d, 0);
            fcsWebViewFragment = new FcsWebViewFragment();
            Bundle A0F = AnonymousClass0x7.A0F("url", A0d);
            A0F.putString("success_url", A0o);
            A0F.putString("failure_url", A0o2);
            A0F.putString("post_data", A0d2);
            A0F.putBoolean("use_post_request", true);
            A0F.putString("fds_observer_id", str8);
            A0F.putString("fds_manager_id", str7);
            A0F.putInt("callback_index", A032);
            fcsWebViewFragment.A0u(A0F);
        }
        this.A00 = fcsWebViewFragment;
        C162457s7.A0H(fcsWebViewFragment);
        return fcsWebViewFragment;
    }

    public boolean A09() {
        C19100yl r1;
        FcsWebViewFragment fcsWebViewFragment = this.A00;
        if (fcsWebViewFragment == null || (r1 = fcsWebViewFragment.A01) == null || !r1.canGoBack()) {
            return false;
        }
        r1.goBack();
        return true;
    }

    public void Ay7(boolean z) {
    }

    public void B3J(Map map) {
        if (map != null) {
            Object obj = map.get("callback_index");
            List list = this.A01;
            C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.Int");
            AnonymousClass4DK r2 = (AnonymousClass4DK) list.get(AnonymousClass001.A0K(obj));
            Object obj2 = map.get("resource_output");
            C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map2 = (Map) obj2;
            if (AnonymousClass0x2.A1Z(map, "status")) {
                r2.BdH(map2);
            } else {
                r2.BSv(C60752z6.A03, map2);
            }
        } else {
            throw C18290x4.A0Y();
        }
    }

    public void Bg0(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i) {
        String str7;
        Context context = this.A02.A00;
        C162457s7.A0D(context);
        Map map3 = map;
        String A0d = AnonymousClass0x2.A0d("url", map3);
        Map A1B = AnonymousClass0x9.A1B("data", map3);
        if (A1B != null) {
            str7 = new JSONObject(A1B).toString(2);
        } else {
            str7 = null;
        }
        String A0o = C18310x6.A0o("successURL", map3);
        String A0o2 = C18310x6.A0o("failureURL", map3);
        int A032 = AnonymousClass002.A03(this.A01);
        C162457s7.A0J(A0d, 1);
        Intent A08 = AnonymousClass0x9.A08(context, FcsWebViewActivity.class);
        A08.putExtra("webview_url", A0d);
        A08.putExtra("data", str7);
        A08.putExtra("success_url", A0o);
        A08.putExtra("failure_url", A0o2);
        A08.putExtra("fds_manager_id", str6);
        A08.putExtra("fds_observer_id", str5);
        A08.putExtra("state_name", str4);
        A08.putExtra("callback_index", A032);
        A08.putExtra("webview_can_navigate_back", true);
        A08.putExtra("webview_javascript_enabled", true);
        C18280x3.A0n(context, A08);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jY(AnonymousClass2E1 r2, C54292oU r3, C58992w9 r4, AnonymousClass1j2 r5, C60482yd r6) {
        super(r2, r5);
        C18260x0.A0d(r6, r3, r2, r5);
        this.A04 = r6;
        this.A02 = r3;
        this.A03 = r4;
    }

    public void BgH(C141576vn r1, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i, int i2, boolean z) {
    }
}
