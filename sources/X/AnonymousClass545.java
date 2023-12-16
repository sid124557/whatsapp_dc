package X;

import android.view.View;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.545  reason: invalid class name */
public class AnonymousClass545 extends C109665ez {
    public final /* synthetic */ C111205hi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass545(C111205hi r1, String str, Map map, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = str;
        this.A02 = map;
    }

    public void A07(View view) {
        AnonymousClass4Pc r4;
        Log.i("UserNoticeBanner/update/banner tapped");
        boolean z = this.A03;
        C111205hi r5 = this.A00;
        AnonymousClass33X r0 = r5.A05;
        if (z) {
            r0.A04();
            C49182g7 r2 = r5.A03;
            r4 = r5.A01;
            r2.A01(r4.getContext(), true);
        } else {
            r0.A05();
            C49182g7 r3 = r5.A03;
            String str = this.A01;
            Map map = this.A02;
            r4 = r5.A01;
            r3.A00(r4.getContext(), str, map);
        }
        r5.A04.A01(C18280x3.A0S());
        C626936e.A04(r5.A00);
        r5.A00.setVisibility(8);
        AnonymousClass4C1 r1 = r5.A06;
        if (r1.get() != null) {
            r4.A02((AnonymousClass5K6) r1.get());
        }
    }
}
