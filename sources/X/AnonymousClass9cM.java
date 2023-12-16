package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.9cM  reason: invalid class name */
public class AnonymousClass9cM implements C203069n4 {
    public final /* synthetic */ AnonymousClass9S6 A00;
    public final /* synthetic */ AnonymousClass9OJ A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public AnonymousClass9cM(AnonymousClass9S6 r1, AnonymousClass9OJ r2, Boolean bool, String str, String str2, String str3, String str4) {
        this.A00 = r1;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = bool;
        this.A03 = str4;
        this.A01 = r2;
    }

    public void BZ3(AnonymousClass34V r4) {
        Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
        AnonymousClass9OJ r0 = this.A01;
        AnonymousClass9Bw.A0c(r0.A00, (Map) null, r4.A00);
    }

    public void BZ4(C67993Rl r9) {
        AnonymousClass9S6 r0 = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        C67993Rl r1 = r9;
        r0.A00(r1, this.A01, this.A02, str, str2, str3, this.A03);
    }
}
