package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.9c4  reason: invalid class name */
public class AnonymousClass9c4 implements C203339nX {
    public final /* synthetic */ C166557yt A00;
    public final /* synthetic */ AnonymousClass9AL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ HashMap A04;

    public AnonymousClass9c4(C166557yt r1, AnonymousClass9AL r2, String str, String str2, HashMap hashMap) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A04 = hashMap;
        this.A03 = str2;
    }

    public void BPu(AnonymousClass99D r8) {
        AnonymousClass9AL r0 = this.A01;
        C166557yt r1 = r8.A02;
        C626936e.A06(r1);
        String str = r8.A03;
        r0.A03(r1, this.A00, str, this.A02, this.A03, this.A04);
    }

    public void BS6(AnonymousClass34V r2) {
        Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to change pin");
        C203049n2 r0 = this.A01.A01;
        if (r0 != null) {
            r0.BbO(r2);
        }
    }

    public /* synthetic */ void BXD(AnonymousClass9TG r1) {
    }
}
