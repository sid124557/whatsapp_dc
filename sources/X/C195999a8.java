package X;

import android.content.Intent;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.List;

/* renamed from: X.9a8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C195999a8 implements AnonymousClass64L {
    public final /* synthetic */ C196249aX A00;
    public final /* synthetic */ WaBloksActivity A01;
    public final /* synthetic */ String A02;

    public final boolean BM3(Intent intent, int i, int i2) {
        C196249aX r5 = this.A00;
        String str = this.A02;
        WaBloksActivity waBloksActivity = this.A01;
        if (i2 != -1 || i != 1) {
            return false;
        }
        List A0B = C627336j.A0B(C95814uZ.class, intent.getStringArrayListExtra("jids"));
        if (A0B.isEmpty()) {
            return true;
        }
        ((C50482iF) r5.A0U.get()).A00(new C197779dr(r5, waBloksActivity, str, A0B), str);
        return true;
    }

    public /* synthetic */ C195999a8(C196249aX r1, WaBloksActivity waBloksActivity, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = waBloksActivity;
    }
}
