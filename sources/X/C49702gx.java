package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2gx  reason: invalid class name and case insensitive filesystem */
public final class C49702gx {
    public final C60922zO A00;
    public final C55512qT A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FS A03;

    public C49702gx(C60922zO r2, C55512qT r3, AnonymousClass1VX r4, AnonymousClass4FS r5) {
        C18270x1.A11(r5, 3, r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public final String A00(String str, SecretKey secretKey, byte[] bArr, int i, boolean z, boolean z2) {
        String str2;
        C162457s7.A0J(str, 0);
        C55512qT r5 = this.A01;
        if (z) {
            AnonymousClass1Uc r1 = r5.A07;
            if (z2) {
                str2 = "decryption_1_start";
            } else {
                str2 = "decryption_start";
            }
            C56672sN.A01(r1, str2, i);
        }
        try {
            byte[] encoded = secretKey.getEncoded();
            byte[] decode = Base64.decode(str, 2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, 0, encoded.length, "AES");
            C162457s7.A0H(decode);
            C162457s7.A0J(decode, 2);
            byte[] A1Y = C18310x6.A1Y(secretKeySpec, C18330xA.A0D(bArr), C18320x8.A0v(), decode, 2);
            C162457s7.A0H(A1Y);
            return new String(A1Y, AnonymousClass79X.A05);
        } catch (Exception e) {
            if (z) {
                r5.A07.A0C(i, "extensions-decryption-failed-exception", C55512qT.A00(r5, e));
            }
            C18260x0.A17("ExtensionsLogger/ExtensionsDataCryptoProcessor/decryptGalaxyFlowData() - Issue while decrypting data", AnonymousClass001.A0o(), e);
            r5.A00.A0A("extensions-decryption-failed-exception", true, C55512qT.A00(r5, e));
            return null;
        }
    }

    public final void A01(AnonymousClass4EG r21, UserJid userJid, String str, String str2, String str3, SecretKey secretKey, byte[] bArr, boolean z, boolean z2, boolean z3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        UserJid userJid2 = userJid;
        String str9 = str2;
        C18270x1.A12(userJid2, str9);
        String str10 = str3;
        C162457s7.A0J(str10, 9);
        int hashCode = str10.hashCode();
        C60922zO r3 = this.A00;
        AnonymousClass4EG r4 = r21;
        if (r3.A02(userJid2) || str9.equals("2") || str9.equals("3") || this.A02.A0Y(C58422vE.A02, 2999)) {
            boolean z4 = z2;
            boolean z5 = z3;
            if (z2) {
                AnonymousClass1Uc r2 = r3.A02;
                if (z3) {
                    str7 = "encryption_1_start";
                } else {
                    str7 = "encryption_start";
                }
                Integer valueOf = Integer.valueOf(hashCode);
                r2.A09(valueOf, str7);
                if (z3) {
                    str8 = "fetch_key_1_start";
                } else {
                    str8 = "fetch_key_start";
                }
                r2.A09(valueOf, str8);
            }
            String str11 = str;
            SecretKey secretKey2 = secretKey;
            byte[] bArr2 = bArr;
            if (!z) {
                C55512qT r11 = r3.A00;
                if (!r11.A04(userJid2)) {
                    if (z2) {
                        AnonymousClass1Uc r22 = r3.A02;
                        if (z3) {
                            str6 = "fetch_key_1_cache_hit";
                        } else {
                            str6 = "fetch_key_cache_hit";
                        }
                        r22.A05(hashCode, str6, true);
                    }
                    r11.A03(r4, userJid2, str11, secretKey2, bArr2, hashCode, z4, z5);
                    return;
                }
            }
            if (z2) {
                AnonymousClass1Uc r23 = r3.A02;
                if (z3) {
                    str4 = "fetch_key_1_cache_hit";
                } else {
                    str4 = "fetch_key_cache_hit";
                }
                r23.A05(hashCode, str4, false);
                if (z3) {
                    str5 = "fetch_key_network_1_start";
                } else {
                    str5 = "fetch_key_network_start";
                }
                C56672sN.A01(r23, str5, hashCode);
            }
            new AnonymousClass3TI(userJid2, r3.A05).A00(new C64513Du(r3, r4, str11, secretKey2, bArr2, hashCode, z4, z5));
            return;
        }
        r4.BQb("extensions-invalid-business-profile");
    }
}
