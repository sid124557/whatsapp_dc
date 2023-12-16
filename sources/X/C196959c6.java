package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.9c6  reason: invalid class name and case insensitive filesystem */
public class C196959c6 implements C203339nX {
    public final /* synthetic */ C166557yt A00;
    public final /* synthetic */ AnonymousClass9AL A01;
    public final /* synthetic */ C35371wl A02;
    public final /* synthetic */ C35371wl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ HashMap A07;

    public C196959c6(C166557yt r1, AnonymousClass9AL r2, C35371wl r3, C35371wl r4, String str, String str2, String str3, HashMap hashMap) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = str;
        this.A07 = hashMap;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = r3;
        this.A02 = r4;
    }

    public void BPu(AnonymousClass99D r11) {
        AnonymousClass9AL r0 = this.A01;
        C166557yt r1 = r11.A02;
        C626936e.A06(r1);
        String str = r11.A03;
        C166557yt r2 = this.A00;
        String str2 = this.A04;
        HashMap hashMap = this.A07;
        r0.A02(r1, r2, this.A03, this.A02, str, str2, this.A06, this.A05, hashMap);
    }

    public void BS6(AnonymousClass34V r2) {
        Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to set pin");
        C203049n2 r0 = this.A01.A01;
        if (r0 != null) {
            r0.BbO(r2);
        }
    }

    public /* synthetic */ void BXD(AnonymousClass9TG r1) {
    }
}
