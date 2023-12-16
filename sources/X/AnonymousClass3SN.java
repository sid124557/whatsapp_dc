package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3SN  reason: invalid class name */
public class AnonymousClass3SN implements AnonymousClass4DQ {
    public final Activity A00;
    public final List A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass1QQ A03;
    public final /* synthetic */ AnonymousClass398 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ HashMap A07;

    public AnonymousClass3SN(Activity activity, AnonymousClass1QQ r2, AnonymousClass398 r3, String str, String str2, HashMap hashMap, List list, long j) {
        this.A03 = r2;
        this.A05 = str;
        this.A02 = j;
        this.A04 = r3;
        this.A06 = str2;
        this.A07 = hashMap;
        this.A00 = activity;
        this.A01 = list;
    }

    public void BSv(C60752z6 r2, Map map) {
        Log.e("AddressCaptureAction: FDS onFailure");
    }

    public void BdH(Map map) {
        String str;
        HashMap hashMap;
        if (map != null) {
            Activity activity = this.A00;
            C95814uZ A0S = C18310x6.A0S(C627336j.A06((AnonymousClass4FC) activity));
            String str2 = "address_message";
            if (map.get(str2) instanceof String) {
                str = C18310x6.A0o(str2, map);
                str2 = "params";
                if (!(map.get(str2) instanceof HashMap)) {
                    hashMap = null;
                }
                hashMap = (HashMap) map.get(str2);
            } else {
                str = C18310x6.A0o("body", map);
                hashMap = (HashMap) map.get(str2);
            }
            if (A0S != null && str != null && hashMap != null) {
                List list = this.A01;
                if (list == null || !list.contains("address_message_validate")) {
                    this.A03.A0F(activity, A0S, this.A05, str, hashMap, this.A02);
                    return;
                }
                String A0e = C18320x8.A0e("in_pin_code", (AbstractMap) hashMap.get("values"));
                this.A03.A00.A01(new AnonymousClass3D1(this, A0S, str, hashMap), A0e, A0S.getRawString());
            }
        }
    }
}
