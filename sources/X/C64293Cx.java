package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3Cx  reason: invalid class name and case insensitive filesystem */
public class C64293Cx implements C181668n8 {
    public final C55682qk A00;
    public final C43712Te A01;
    public final C29441ip A02;
    public final AnonymousClass1VX A03;

    public String A00(AnonymousClass5II r6) {
        byte[] bArr;
        try {
            bArr = C380825n.A00("".getBytes(), r6.A02);
        } catch (Exception unused) {
            Log.e("ACSTokenProviderImpl/computeHMAC Failed to compute HMAC");
            this.A00.A0A("ACSTokenProviderImpl/computeHMAC", true, "Failed to compute HMAC");
            bArr = null;
        }
        if (bArr != null) {
            return Base64.encodeToString(bArr, 10);
        }
        return null;
    }

    public void B3f(AnonymousClass66T r30, String str) {
        int i;
        byte[] decode;
        AnonymousClass5II r1;
        int A022;
        AnonymousClass66T r12 = r30;
        String str2 = str;
        C45762aX r10 = new C45762aX(r12, this, str2);
        try {
            C43712Te r8 = this.A01;
            AnonymousClass1VX r3 = this.A03;
            C58422vE r2 = C58422vE.A02;
            int A0O = r3.A0O(r2, 966);
            int A0O2 = r3.A0O(r2, 965);
            int A0O3 = r3.A0O(r2, 967);
            int A0O4 = r3.A0O(r2, 968);
            int A0O5 = r3.A0O(r2, 969);
            int A0O6 = r3.A0O(r2, 970);
            int A0O7 = r3.A0O(r2, 971);
            int A0O8 = r3.A0O(r2, 972);
            if (!r8.A09.contains(str2)) {
                this.A00.A0A("ACSTokenProviderImpl/generateACSToken", false, AnonymousClass000.A0X(" is not registered with ACSTokenManager", AnonymousClass000.A0l(str2)));
                r12.BeB(0);
                return;
            }
            Map map = r8.A01;
            if (!map.containsKey(str2)) {
                C55242q2 r32 = new C55242q2(r8.A07, str2);
                AnonymousClass3TF r0 = new AnonymousClass3TF(r8.A06);
                C56612sH r25 = r8.A04;
                AnonymousClass1VX r26 = r8.A05;
                AnonymousClass4FS r20 = r8.A08;
                C54162oH r202 = new C54162oH(r8.A02, r8.A03, r32, r0, r25, r26, r20, str2);
                r32.A02("token_length", A0O);
                r32.A02("shared_secret_length", A0O2);
                r32.A03("max_time_to_live_in_sec", (long) A0O3);
                r32.A02("max_redeem_count", A0O4);
                r32.A02("lead_time_to_prefetch_sec", A0O5);
                r32.A02("lead_redeem_count_to_prefetch", A0O6);
                r32.A02("max_sign_retry_count", A0O7);
                r32.A03("sign_retry_interval_sec", (long) A0O8);
                map.put(str2, r202);
                r8.A00.put(str2, r32);
                r202.A09.execute(new C70043Zq(r202, 37));
            }
            if (map.containsKey(str2)) {
                ((C54162oH) map.get(str2)).A00.add(r10);
            }
            if (map.containsKey(str2) && r8.A00.get(str2) != null) {
                C54162oH r82 = (C54162oH) map.get(str2);
                C55242q2 r6 = r82.A05;
                String string = r6.A00().getString("original_token_string", (String) null);
                long A002 = C56612sH.A00(r82.A07) - AnonymousClass0x2.A0B(r6.A00(), "base_timestamp");
                byte[] bArr = null;
                if (string != null) {
                    if (r6.A00().getInt("redeem_count", -1) >= r6.A00().getInt("max_redeem_count", -1) || A002 >= AnonymousClass0x2.A0B(r6.A00(), "max_time_to_live_in_sec")) {
                        decode = Base64.decode(string, 8);
                        if (!r82.A0F) {
                            r82.A09.execute(new C70043Zq(r82, 34));
                            A022 = C18280x3.A02(r6.A00(), "token_not_ready_reason");
                        } else {
                            r1 = new AnonymousClass5II(decode, (byte[]) null, 13);
                        }
                    } else {
                        int A032 = C18310x6.A03(r6.A00(), "redeem_count") + 1;
                        r6.A02("redeem_count", A032);
                        int i2 = r6.A00().getInt("lead_redeem_count_to_prefetch", 0);
                        int i3 = r6.A00().getInt("lead_time_to_prefetch_sec", 0);
                        if (A032 >= i2 || (A002 > AnonymousClass0x2.A0B(r6.A00(), "max_time_to_live_in_sec") - ((long) i3) && !r82.A0F)) {
                            Log.d("ACSToken/generateNewToken pre-compute next token");
                            r82.A09.execute(new C70043Zq(r82, 35));
                        }
                        decode = Base64.decode(string, 8);
                        String string2 = r6.A00().getString("shared_secret_string", (String) null);
                        if (string2 != null) {
                            bArr = Base64.decode(string2, 8);
                        }
                        A022 = 0;
                        r6.A01(0);
                    }
                    r1 = new AnonymousClass5II(decode, bArr, A022);
                } else if (!r82.A0F) {
                    r82.A09.execute(new C70043Zq(r82, 33));
                    r6.A01(13);
                    r1 = new AnonymousClass5II((byte[]) null, (byte[]) null, 13);
                } else {
                    r1 = new AnonymousClass5II((byte[]) null, (byte[]) null, C18280x3.A02(r6.A00(), "token_not_ready_reason"));
                }
                byte[] bArr2 = r1.A01;
                if (!(bArr2 == null || r1.A02 == null)) {
                    String A003 = A00(r1);
                    if (TextUtils.isEmpty(A003)) {
                        i = 2;
                        r12.BeB(i);
                        r10.A00(str2);
                    }
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(Base64.encodeToString(bArr2, 10));
                    r12.BeC(AnonymousClass000.A0V("+", A003, A0o));
                    r10.A00(str2);
                }
            }
            if (!this.A02.A0F()) {
                i = 4;
                r12.BeB(i);
                r10.A00(str2);
            }
        } catch (Exception unused) {
            Log.e("ACSTokenProviderImpl/generateACSToken Exception while generating ACS token");
            this.A00.A0A("ACSTokenProviderImpl/generateACSToken", true, "Exception while generating ACS token");
            r12.BeB(5);
            r10.A00(str2);
        }
    }

    public C64293Cx(C55682qk r1, C43712Te r2, C29441ip r3, AnonymousClass1VX r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
