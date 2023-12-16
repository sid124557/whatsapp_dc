package X;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: X.5QV  reason: invalid class name */
public class AnonymousClass5QV {
    public C114445n3 A00;
    public C90634hx A01;
    public final AnonymousClass5F8 A02;
    public final C181688nA A03;
    public final AnonymousClass8r5 A04;
    public final AnonymousClass5GG A05;

    public synchronized void A00() {
        C90634hx r0 = this.A01;
        if (!(r0 == null || r0.A07.A06() == 2 || C18320x8.A1T(this.A01.A07))) {
            this.A01.A07.A0D(true);
            this.A01 = null;
        }
    }

    public void A01(LatLng latLng, C184158rL r20, AnonymousClass5ZI r21, String str, String str2, float f) {
        LatLng latLng2 = latLng;
        ArrayList A032 = C106845aG.A03(latLng2.A00, latLng2.A01, 10);
        C626936e.A06(A032);
        ArrayList A042 = C106845aG.A04(10, C18310x6.A0B(A032.get(0)), C18310x6.A0B(A032.get(1)));
        LatLng A0H = C86624Kv.A0H((Number) A042.get(1), ((Number) A042.get(0)).doubleValue());
        synchronized (this) {
            A00();
            C114445n3 r11 = new C114445n3(latLng2, r20, this, str, str2, f);
            this.A00 = r11;
            AnonymousClass5F8 r1 = this.A02;
            AnonymousClass8r5 r8 = this.A04;
            C181688nA r7 = this.A03;
            C59722xN r12 = this.A05.A00;
            C64333Db r13 = r1.A00.A01;
            C55682qk A012 = C64333Db.A01(r13);
            AnonymousClass4FS A8y = C64333Db.A8y(r13);
            C90634hx r3 = new C90634hx(A0H, A012, r13.A00.AIq(), r7, r8, C86624Kv.A0R(r13), C64333Db.A2t(r13), r11, r12, r21, A8y);
            r3.A08();
            this.A01 = r3;
        }
    }

    public AnonymousClass5QV(AnonymousClass5F8 r1, C181688nA r2, AnonymousClass8r5 r3, AnonymousClass5GG r4) {
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
        this.A02 = r1;
    }
}
