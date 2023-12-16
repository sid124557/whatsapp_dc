package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.97S  reason: invalid class name */
public abstract class AnonymousClass97S extends C89644eZ {
    public static int[] A0Z(String str) {
        String[] split = str.split("/");
        return new int[]{C615531h.A01(split[0], 0), C615531h.A01(split[1], -2000) + 2000};
    }

    public static Intent A0C(Context context, C133786hw r5, Object obj) {
        Intent intent = new Intent(context, BrazilPayBloksActivity.class);
        AnonymousClass98s.A0a(intent, "referral_screen", "payment_method_details");
        HashMap hashMap = new HashMap();
        hashMap.put("credential_id", obj);
        hashMap.put("last4", r5.A0J);
        intent.putExtra("screen_params", hashMap);
        intent.putExtra("screen_name", "brpay_p_add_cvv_card");
        return intent;
    }

    public static C08240dc A0L(C08270df r3, AnonymousClass98s r4) {
        C08240dc r2 = new C08240dc(r3);
        r2.A0A(r4.A05, R.id.bloks_fragment_container);
        return r2;
    }

    public AnonymousClass97S() {
        C204019og.A00(this, 0);
    }

    public static String A0X(Object obj, Map map) {
        Object obj2 = map.get(obj);
        C626936e.A06(obj2);
        return (String) obj2;
    }

    public static String A0Y(Object obj, Map map) {
        String str = (String) map.get(obj);
        C626936e.A05(str);
        return str;
    }
}
