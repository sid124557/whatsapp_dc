package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1f2  reason: invalid class name */
public class AnonymousClass1f2 extends C56262rh {
    public final C29171iO A00;
    public final C40512Gr A01;
    public final C46732c7 A02;
    public final AnonymousClass1f3 A03;
    public final AnonymousClass1f4 A04;
    public final AnonymousClass1f6 A05;
    public final AnonymousClass1f7 A06;
    public final AnonymousClass1f5 A07;
    public final C34211uP A08;

    public final void A05() {
        try {
            if (this.A01.A00.A0Y(C58422vE.A02, 6408)) {
                A06(this.A05.A00(this.A08.A02("com.facebook.stella"), Voip.getCallInfo()));
            }
        } catch (SecurityException e) {
            Log.e("StellaEventDispatcher/cannot create event for untrusted package", e);
        }
    }

    public final void A06(AnonymousClass2LB r5) {
        if (r5 != null) {
            try {
                C46732c7 r3 = this.A02;
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("action", r5.A00);
                A1G.putOpt("payload", r5.A01);
                r3.A00(A1G.toString(), true);
            } catch (JSONException unused) {
                Log.e("StellaEventDispatcher/failed to create event");
            }
        }
    }

    public AnonymousClass1f2(C29171iO r1, C40512Gr r2, C46732c7 r3, AnonymousClass1f3 r4, AnonymousClass1f4 r5, AnonymousClass1f6 r6, AnonymousClass1f7 r7, AnonymousClass1f5 r8, C34211uP r9) {
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A08 = r9;
        this.A00 = r1;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
    }
}
