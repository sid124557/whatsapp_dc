package X;

import android.util.Pair;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Sb  reason: invalid class name and case insensitive filesystem */
public class C68153Sb implements AnonymousClass4EZ {
    public final AnonymousClass2NI A00;
    public final AnonymousClass31C A01;

    public void BQs(String str) {
        Log.w("LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq onDeliveryFailure");
        AnonymousClass2NI r1 = this.A00;
        C28881hv r0 = r1.A00;
        String str2 = r1.A02;
        String str3 = r1.A01;
        Iterator A03 = C61102zi.A03(r0);
        while (A03.hasNext()) {
            C58212ut r3 = (C58212ut) A03.next();
            LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = r3.A00;
            linkedDevicesEnterCodeActivity.A04.A00(9, str2, str3);
            linkedDevicesEnterCodeActivity.runOnUiThread(C71313bu.A00(r3, 43));
        }
    }

    public void BdM(AnonymousClass36K r9, String str) {
        Log.d("LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq success");
        AnonymousClass2NI r0 = this.A00;
        C28881hv r7 = r0.A00;
        String str2 = r0.A02;
        String str3 = r0.A01;
        Iterator A03 = C61102zi.A03(r7);
        while (A03.hasNext()) {
            C58212ut r3 = (C58212ut) A03.next();
            r3.A00.runOnUiThread(new C70313aI(r3, str3, str2, 4));
        }
        r7.A02.A00(4, str2, str3);
    }

    public C68153Sb(AnonymousClass2NI r1, AnonymousClass31C r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BSN(AnonymousClass36K r7, String str) {
        Pair A02 = C57492tj.A02(r7);
        if (A02 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq error code=");
            A0o.append(A02.first);
            A0o.append("; text=");
            C18260x0.A1K(A0o, (String) A02.second);
            AnonymousClass2NI r2 = this.A00;
            Number number = (Number) A02.first;
            C28881hv r4 = r2.A00;
            Map map = r4.A00;
            String str2 = r2.A02;
            map.remove(str2);
            C44282Vl r1 = r4.A01;
            String str3 = r2.A01;
            r1.A00(5, str2, str3);
            if (number == null || number.intValue() != 400) {
                r4.A09(str2, str3);
            } else {
                r4.A08();
            }
        } else {
            Log.e("LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq unknown code");
            AnonymousClass2NI r12 = this.A00;
            C28881hv r42 = r12.A00;
            Map map2 = r42.A00;
            String str4 = r12.A02;
            map2.remove(str4);
            C44282Vl r22 = r42.A01;
            String str5 = r12.A01;
            r22.A00(5, str4, str5);
            r42.A09(str4, str5);
        }
    }
}
