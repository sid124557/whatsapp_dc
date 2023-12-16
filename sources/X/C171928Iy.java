package X;

import com.whatsapp.util.Log;
import java.security.SecureRandom;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8Iy  reason: invalid class name and case insensitive filesystem */
public final class C171928Iy implements C84064Aw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89654ea A01;
    public final /* synthetic */ C166557yt A02;
    public final /* synthetic */ C182818p2 A03;
    public final /* synthetic */ AnonymousClass8I0 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public C171928Iy(C89654ea r1, C166557yt r2, C182818p2 r3, AnonymousClass8I0 r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        this.A01 = r1;
        this.A04 = r4;
        this.A07 = str;
        this.A0B = str2;
        this.A09 = str3;
        this.A00 = i;
        this.A02 = r2;
        this.A05 = str4;
        this.A0C = str5;
        this.A0A = str6;
        this.A08 = str7;
        this.A06 = str8;
        this.A03 = r3;
    }

    public void BOw(C156697h3 r23) {
        C89654ea r14 = this.A01;
        if (!r14.BHW()) {
            AnonymousClass8I0 r13 = this.A04;
            String str = this.A07;
            String str2 = this.A0B;
            String str3 = this.A09;
            int i = this.A00;
            C166557yt r9 = this.A02;
            String str4 = this.A05;
            String str5 = this.A0C;
            String str6 = this.A0A;
            String str7 = this.A08;
            String str8 = this.A06;
            C182818p2 r2 = this.A03;
            JSONObject A032 = r13.A03(str, true, false);
            JSONObject A1G = AnonymousClass0x9.A1G();
            try {
                JSONArray A1F = AnonymousClass0x9.A1F();
                A1F.put(str2);
                A1G.put("txnId", A1F);
                A1G.put("appId", "com.whatsapp");
                JSONArray A1F2 = AnonymousClass0x9.A1F();
                A1F2.put(AnonymousClass8I0.A00(i));
                A1G.put("credType", A1F2);
                A1G.put("deviceId", r13.A0D);
                A1G.put("mobileNumber", str3);
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                String A0t = C18290x4.A0t(bArr);
                C162457s7.A0D(A0t);
                A1G.put("random", A0t);
            } catch (Exception unused) {
                Log.e("exception thrown at getKeySaltForSetup");
            }
            String A012 = AnonymousClass8I0.A01(r9, C18290x4.A0o(A1G));
            String str9 = str4;
            JSONArray A022 = r13.A02(r14, (AnonymousClass39Q) null, (String) null, str9, (String) null, str5, str6, i);
            if (A012 != null) {
                r13.A04(r14, r2, str7, str8, A012, A022, A032, A1G);
            }
        }
    }
}
