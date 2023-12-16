package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.text.ParseException;
import java.util.Date;
import javax.crypto.SecretKey;

/* renamed from: X.3TK  reason: invalid class name */
public final class AnonymousClass3TK implements AnonymousClass4EZ {
    public C43602St A00;
    public final UserJid A01;
    public final AnonymousClass31C A02;

    public void BdM(AnonymousClass36K r17, String str) {
        String str2;
        AnonymousClass4EG r0;
        AnonymousClass4EG r8;
        SecretKey secretKey;
        byte[] bArr;
        C55682qk r02;
        AnonymousClass36K r1 = r17;
        C162457s7.A0J(r1, 1);
        AnonymousClass36K A0l = r1.A0l("business_cert_info");
        if (A0l != null) {
            AnonymousClass36K A0l2 = A0l.A0l("ttl_timestamp");
            AnonymousClass36K A0l3 = A0l.A0l("issuer_cn");
            AnonymousClass36K A0l4 = A0l.A0l("business_domain");
            if (!(A0l2 == null || A0l3 == null || A0l4 == null)) {
                String A0n = A0l2.A0n();
                String A0n2 = A0l4.A0n();
                String A0n3 = A0l3.A0n();
                if (!(A0n == null || A0n.length() == 0 || A0n3 == null || A0n3.length() == 0 || A0n2 == null || A0n2.length() == 0)) {
                    C43602St r4 = this.A00;
                    if (r4 != null) {
                        UserJid userJid = this.A01;
                        C55512qT r7 = r4.A00;
                        try {
                            Date parse = AnonymousClass0x7.A0u("yyyyMMdd'T'HHmmss'Z'").parse(A0n);
                            if (parse != null) {
                                if (!A0n2.equals(r4.A02)) {
                                    Log.e("ExtensionsLogger/ExtensionsDataCryptoProcessor/loadBusinessCertInfo()/onGetBusinessCertInfoSuccess() - Incorrect Business domain in certificate");
                                    r02 = r7.A00;
                                    str2 = "extensions-invalid-domain-in-certificate";
                                } else if (!A0n3.equals(r4.A04)) {
                                    Log.e("ExtensionsLogger/ExtensionsDataCryptoProcessor/loadBusinessCertInfo()/onGetBusinessCertInfoSuccess() - Incorrect Issuer CN in certificate");
                                    r02 = r7.A00;
                                    str2 = "extensions-invalid-issuer-in-certificate";
                                } else {
                                    AnonymousClass33p r2 = r7.A03;
                                    String rawString = userJid.getRawString();
                                    long time = parse.getTime();
                                    SharedPreferences.Editor A03 = C18270x1.A03(r2);
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("galaxy_business_cert_expired_timestamp_");
                                    C18270x1.A0k(A03, rawString, A0o, time);
                                    String str3 = r4.A03;
                                    if (str3 != null && (r8 = r4.A01) != null && (secretKey = r4.A05) != null && (bArr = r4.A06) != null) {
                                        r7.A03(r8, userJid, str3, secretKey, bArr, 1, false, false);
                                        return;
                                    }
                                    return;
                                }
                                r02.A0A(str2, false, "");
                                r7.A03.A1O(userJid.user);
                                r0 = r4.A01;
                                if (r0 == null) {
                                    return;
                                }
                                r0.BQb(str2);
                                return;
                            }
                        } catch (ParseException e) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("ExtensionsLogger/ExtensionsDataCryptoProcessor/getTtlTimestampAsDate(ttlTimestamp:");
                            Log.e(C18260x0.A07(A0n, A0o2), e);
                            r7.A00.A0A("extensions-invalid-timestamp-business-cert", true, e.getMessage());
                        }
                        r0 = r4.A01;
                        if (r0 != null) {
                            str2 = "extensions-invalid-timestamp-business-cert";
                            r0.BQb(str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        A00();
    }

    public final void A00() {
        C43602St r1 = this.A00;
        if (r1 != null) {
            UserJid userJid = this.A01;
            Log.e("ExtensionsLogger/ExtensionsDataCryptoProcessor/loadBusinessCertInfo()/onGetBusinessCertInfoError()");
            AnonymousClass4EG r0 = r1.A01;
            if (r0 != null) {
                r0.BQb("extensions-business-cert-error-response");
            }
            C55512qT r2 = r1.A00;
            r2.A00.A0A("extensions-business-cert-error-response", false, "");
            r2.A03.A1O(userJid.user);
        }
    }

    public AnonymousClass3TK(UserJid userJid, AnonymousClass31C r2) {
        this.A01 = userJid;
        this.A02 = r2;
    }

    public void BSN(AnonymousClass36K r3, String str) {
        C18260x0.A0t("GetBusinessCertInfo/delivery-error with iqId ", str, C18270x1.A0X(str));
        A00();
    }

    public void BQs(String str) {
        A00();
    }
}
