package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3D1  reason: invalid class name */
public class AnonymousClass3D1 implements AnonymousClass4CI {
    public final /* synthetic */ AnonymousClass3SN A00;
    public final /* synthetic */ C95814uZ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ HashMap A03;

    public AnonymousClass3D1(AnonymousClass3SN r1, C95814uZ r2, String str, HashMap hashMap) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = hashMap;
    }

    public void BSu(Map map) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "onFailure", map);
        if (map.containsKey("validation_errors")) {
            AnonymousClass3SN r2 = this.A00;
            AnonymousClass398 r5 = r2.A04;
            Map A012 = AnonymousClass31O.A01(r5.A01);
            A012.put("validation_errors", map.get("validation_errors"));
            A012.remove("saved_addresses");
            AnonymousClass1QQ r3 = r2.A03;
            Activity activity = r2.A00;
            Map A0E = r3.A0E(activity, r5, A012);
            r3.A0G(activity, r5, r2.A05, r2.A06, r2.A07, A0E, r2.A02);
            return;
        }
        AnonymousClass3SN r0 = this.A00;
        r0.A03.A0F(r0.A00, this.A01, r0.A05, this.A02, this.A03, r0.A02);
    }

    public void onSuccess() {
        Log.d("onSuccess");
        AnonymousClass3SN r0 = this.A00;
        r0.A03.A0F(r0.A00, this.A01, r0.A05, this.A02, this.A03, r0.A02);
    }
}
