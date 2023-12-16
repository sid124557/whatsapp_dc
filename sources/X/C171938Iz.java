package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8Iz  reason: invalid class name and case insensitive filesystem */
public final class C171938Iz implements C84064Aw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89654ea A01;
    public final /* synthetic */ AnonymousClass39Q A02;
    public final /* synthetic */ C166557yt A03;
    public final /* synthetic */ AnonymousClass9AG A04;
    public final /* synthetic */ C182818p2 A05;
    public final /* synthetic */ AnonymousClass8I0 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ boolean A0J;

    public void BOw(C156697h3 r32) {
        C89654ea r30 = this.A01;
        if (!r30.BHW()) {
            AnonymousClass8I0 r12 = this.A06;
            String str = this.A09;
            boolean z = this.A0J;
            String str2 = this.A0H;
            AnonymousClass39Q r17 = this.A02;
            String str3 = this.A0G;
            String str4 = this.A0E;
            String str5 = this.A0D;
            int i = this.A00;
            C166557yt r10 = this.A03;
            AnonymousClass9AG r9 = this.A04;
            String str6 = this.A0B;
            String str7 = this.A07;
            String str8 = this.A0C;
            String str9 = this.A0I;
            String str10 = this.A0F;
            String str11 = this.A0A;
            String str12 = this.A08;
            C182818p2 r15 = this.A05;
            JSONObject A032 = r12.A03(str, false, z);
            String A0o = C18290x4.A0o(r17);
            JSONObject A1G = AnonymousClass0x9.A1G();
            try {
                JSONArray A1F = AnonymousClass0x9.A1F();
                A1F.put(str2);
                A1G.put("txnId", A1F);
                A1G.put("txnAmount", A0o);
                A1G.put("deviceId", r12.A0D);
                A1G.put("appId", "com.whatsapp");
                A1G.put("mobileNumber", str5);
                JSONArray A1F2 = AnonymousClass0x9.A1F();
                A1F2.put(AnonymousClass8I0.A00(i));
                A1G.put("credType", A1F2);
                A1G.put("payerAddr", str3);
                A1G.put("payeeAddr", str4);
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                String A0t = C18290x4.A0t(bArr);
                C162457s7.A0D(A0t);
                A1G.put("random", A0t);
                r12.A09.A04("getKeySaltWithTransactionDetails");
                String A012 = AnonymousClass8I0.A01(r10, C18290x4.A0o(A1G));
                r9.A01(A1G);
                int i2 = i;
                AnonymousClass8I0 r16 = r12;
                C89654ea r172 = r30;
                JSONArray A022 = r16.A02(r172, r17, str6, str7, str8, str9, str10, i2);
                if (A012 != null) {
                    r12.A04(r30, r15, str11, str12, A012, A022, A032, A1G);
                }
            } catch (JSONException e) {
                throw C18330xA.A09(e);
            } catch (NoSuchAlgorithmException e2) {
                throw C18330xA.A09(e2);
            }
        }
    }

    public C171938Iz(C89654ea r2, AnonymousClass39Q r3, C166557yt r4, AnonymousClass9AG r5, C182818p2 r6, AnonymousClass8I0 r7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, boolean z) {
        this.A01 = r2;
        this.A06 = r7;
        this.A09 = str;
        this.A0J = z;
        this.A0H = str2;
        this.A02 = r3;
        this.A0G = str3;
        this.A0E = str4;
        this.A0D = str5;
        this.A00 = i;
        this.A03 = r4;
        this.A04 = r5;
        this.A0B = str6;
        this.A07 = str7;
        this.A0C = str8;
        this.A0I = str9;
        this.A0F = str10;
        this.A0A = str11;
        this.A08 = str12;
        this.A05 = r6;
    }
}
