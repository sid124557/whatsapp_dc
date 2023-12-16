package X;

import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.5n3  reason: invalid class name and case insensitive filesystem */
public class C114445n3 implements C184408rk {
    public final float A00;
    public final LatLng A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;
    public final /* synthetic */ AnonymousClass5QV A05;

    public C114445n3(LatLng latLng, C184158rL r3, AnonymousClass5QV r4, String str, String str2, float f) {
        this.A05 = r4;
        this.A01 = latLng;
        this.A03 = str;
        this.A00 = f;
        this.A02 = str2;
        this.A04 = AnonymousClass0x9.A14(r3);
    }

    public void BSO(AnonymousClass7T4 r2, int i) {
        C184158rL r0 = (C184158rL) this.A04.get();
        if (r0 != null) {
            r0.BUU(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        C147107Cv r8 = (C147107Cv) obj;
        LatLng latLng = this.A01;
        double d = latLng.A00;
        double d2 = latLng.A01;
        ArrayList A032 = C106845aG.A03(d, d2, 14);
        C626936e.A06(A032);
        String A022 = C106845aG.A02((Long) C18290x4.A0k(A032), (Long) A032.get(1), 14);
        C184158rL r9 = (C184158rL) this.A04.get();
        if (r9 != null) {
            Map map = r8.A00;
            if (map.containsKey(A022)) {
                i = AnonymousClass001.A0K(map.get(A022));
            } else {
                i = 10;
            }
            String str = this.A02;
            ArrayList A033 = C106845aG.A03(d, d2, i);
            C626936e.A06(A033);
            ArrayList A042 = C106845aG.A04(i, C18310x6.A0B(A033.get(0)), C18310x6.A0B(A033.get(1)));
            LatLng A0H = C86624Kv.A0H((Number) A042.get(1), ((Number) A042.get(0)).doubleValue());
            double A012 = C106845aG.A01(A033, i);
            String str2 = this.A03;
            double d3 = (double) this.A00;
            AnonymousClass5ZO r11 = new AnonymousClass5ZO(Double.valueOf(A012 + d3), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(A0H.A00), Double.valueOf(A0H.A01), Double.valueOf(d3), str2, (String) null, str);
            r11.A00 = i;
            r9.BUV(r11);
        }
    }
}
