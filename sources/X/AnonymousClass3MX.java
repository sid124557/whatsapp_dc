package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3MX  reason: invalid class name */
public final class AnonymousClass3MX implements AnonymousClass4F6 {
    public final C50672ia A00;
    public final AnonymousClass31V A01;
    public final C55782qu A02;
    public final C49672gu A03;
    public final C52612ll A04;
    public final AtomicInteger A05 = new AtomicInteger(0);

    public AnonymousClass3MX(C50672ia r3, AnonymousClass31V r4, C55782qu r5, C49672gu r6, C52612ll r7) {
        AnonymousClass0x2.A1A(r3, 1, r5);
        this.A00 = r3;
        this.A04 = r7;
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r5;
    }

    /* renamed from: A00 */
    public void Bgn(AnonymousClass4EJ r22, C54662p5 r23, C51952ke r24, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        AnonymousClass4EJ r12 = r22;
        X509Certificate x509Certificate2 = x509Certificate;
        C18270x1.A11(x509Certificate2, 1, r12);
        C54662p5 r15 = r23;
        C162457s7.A0J(r15, 5);
        C55782qu r3 = this.A02;
        Integer num2 = r3.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("perform_backup_restore_");
            r3.A01(intValue, AnonymousClass000.A0h(A0o, this.A05.getAndIncrement()));
        }
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            C18300x5.A1F(r12, "passwordPublicKey is null");
            return;
        }
        Integer num3 = num;
        if (num == null) {
            C18300x5.A1F(r12, "passwordKeyId is null");
            return;
        }
        C51952ke r11 = r24;
        if (r24 == null) {
            C18300x5.A1F(r12, "avatar user backup data is null");
            return;
        }
        try {
            KeyPair A032 = AnonymousClass341.A03();
            String A012 = AnonymousClass341.A01(A032);
            String A0b = C18280x3.A0b(r11.A01);
            try {
                C52612ll r6 = this.A04;
                AnonymousClass2Q4 A022 = this.A00.A02(C18290x4.A0o(r6.A01(A012, r6.A00(A0b, publicKey2, num3.intValue()))), x509Certificate2);
                String A033 = r6.A02.A03();
                C51952ke r17 = r11;
                AnonymousClass4EJ r14 = r12;
                C52612ll r0 = r6;
                r0.A02(r12, C41032Ir.A05(new C35721xK(new C35351wj(A022.A01, A022.A02, A022.A00, A022.A03), new C35351wj(A033, 5), Long.valueOf(C56612sH.A00(r6.A00)), C18280x3.A0a(r11.A00))), A033, new AnonymousClass44H(r12, this, A0b, A032), new AnonymousClass44R(r14, r15, this, r17, num3, publicKey2, x509Certificate2));
            } catch (IOException e) {
                e = e;
                str = "Password encryption IOException:";
                Log.e(str, e);
                r12.BSB(e);
            } catch (GeneralSecurityException e2) {
                e = e2;
                str = "Password encryption GeneralSecurityException:";
                Log.e(str, e);
                r12.BSB(e);
            }
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            str = "Error generating key pair:";
            Log.e(str, e);
            r12.BSB(e);
        }
    }

    public void A01(AnonymousClass4EJ r26, C54662p5 r27, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        AnonymousClass4EJ r8 = r26;
        C54662p5 r24 = r27;
        X509Certificate x509Certificate2 = x509Certificate;
        C18260x0.A0a(x509Certificate2, r8, r24, 0);
        C55782qu r3 = this.A02;
        Integer num2 = r3.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("perform_user_creation_");
            r3.A01(intValue, AnonymousClass000.A0h(A0o, this.A05.getAndIncrement()));
        }
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            C18300x5.A1F(r8, "passwordPublicKey is null");
            return;
        }
        Integer num3 = num;
        if (num == null) {
            C18300x5.A1F(r8, "passwordKeyId is null");
            return;
        }
        try {
            KeyPair A032 = AnonymousClass341.A03();
            String A012 = AnonymousClass341.A01(A032);
            String A002 = AnonymousClass341.A00();
            C162457s7.A0D(A002);
            try {
                C52612ll r5 = this.A04;
                AnonymousClass2Q4 A022 = this.A00.A02(C18290x4.A0o(r5.A01(A012, r5.A00(A002, publicKey2, num3.intValue()))), x509Certificate2);
                String A033 = r5.A02.A03();
                C35351wj r14 = new C35351wj(A022.A01, A022.A02, A022.A00, A022.A03);
                Long valueOf = Long.valueOf(C56612sH.A00(r5.A00));
                C35351wj r32 = new C35351wj(A033, 5);
                C56052rL A013 = C56052rL.A01();
                C56052rL.A0D(A013, "xmlns", "avatars");
                C56052rL.A0C(A013, "smax_id", 100);
                C56052rL.A06(C135206kI.A00, A013, "to");
                C41032Ir.A0E(A013, r14, "encryption_metadata");
                C56052rL A042 = C56052rL.A04("timestamp");
                C18280x3.A0y(A042, valueOf, C626836d.A0J(valueOf, 1, 9007199254740991L, false) ? 1 : 0);
                C56052rL.A07(A042, A013);
                C41032Ir.A08(A013, r32);
                AnonymousClass36K A0F = A013.A0F();
                AnonymousClass44G r0 = new AnonymousClass44G(r8, this, A002, A032);
                PublicKey publicKey3 = publicKey2;
                AnonymousClass4EJ r142 = r8;
                C54662p5 r15 = r24;
                AnonymousClass4EJ r9 = r8;
                AnonymousClass44G r12 = r0;
                C52612ll r82 = r5;
                r82.A02(r9, A0F, A033, r12, new AnonymousClass44P(r142, r15, this, num3, publicKey3, x509Certificate2));
            } catch (IOException e) {
                e = e;
                str = "Password encryption IOException:";
                Log.e(str, e);
                r8.BSB(e);
            } catch (GeneralSecurityException e2) {
                e = e2;
                str = "Password encryption GeneralSecurityException:";
                Log.e(str, e);
                r8.BSB(e);
            }
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            str = "Error generating key pair:";
            Log.e(str, e);
            r8.BSB(e);
        }
    }

    public /* synthetic */ void Bgm(AnonymousClass4EJ r1, C54662p5 r2, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        A01(r1, r2, num, publicKey, x509Certificate);
    }

    public void Bgp(C60272yH r20, AnonymousClass4EJ r21, C54662p5 r22, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        C162457s7.A0J(x509Certificate2, 0);
        C54662p5 r7 = r22;
        C162457s7.A0J(r7, 5);
        C55782qu r4 = this.A02;
        Integer num2 = r4.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("perform_user_deletion_");
            r4.A01(intValue, AnonymousClass000.A0h(A0o, this.A05.getAndIncrement()));
        }
        C52612ll r13 = this.A04;
        String A032 = r13.A02.A03();
        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        String str3 = str;
        if (!C162457s7.A0P(str3, str2)) {
            str2 = "event";
            if (!C162457s7.A0P(str3, str2)) {
                Log.e("Unsupported user deletion reason attribute");
                str2 = null;
            }
        }
        C35351wj r6 = new C35351wj(A032, 5);
        C56052rL A012 = C56052rL.A01();
        C56052rL.A0D(A012, "xmlns", "avatars");
        C56052rL.A0C(A012, "smax_id", 102);
        C56052rL.A06(C135206kI.A00, A012, "to");
        A012.A0K(str2, "reason", C35601x8.A00);
        C41032Ir.A09(A012, r6);
        AnonymousClass4EJ r62 = r21;
        r13.A02(r62, A012.A0F(), A032, new AnonymousClass439(r62), new AnonymousClass44U(r20, r62, r7, this, num, str3, publicKey, x509Certificate2));
    }

    public void Bgr(C60272yH r22, AnonymousClass4EJ r23, C54662p5 r24, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        C60272yH r12 = r22;
        X509Certificate x509Certificate2 = x509Certificate;
        C18260x0.A0O(x509Certificate2, r12);
        AnonymousClass4EJ r11 = r23;
        C162457s7.A0J(r11, 4);
        C54662p5 r15 = r24;
        C162457s7.A0J(r15, 5);
        C55782qu r3 = this.A02;
        Integer num2 = r3.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("perform_token_refresh_");
            r3.A01(intValue, AnonymousClass000.A0h(A0o, this.A05.getAndIncrement()));
        }
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            C18300x5.A1F(r11, "passwordPublicKey is null");
            return;
        }
        Integer num3 = num;
        if (num == null) {
            C18300x5.A1F(r11, "passwordKeyId is null");
            return;
        }
        try {
            KeyPair A032 = AnonymousClass341.A03();
            String A012 = AnonymousClass341.A01(A032);
            String A0b = C18280x3.A0b(r12.A05);
            try {
                C52612ll r6 = this.A04;
                AnonymousClass2Q4 A022 = this.A00.A02(C18290x4.A0o(r6.A01(A012, r6.A00(A0b, publicKey2, num3.intValue()))), x509Certificate2);
                String A033 = r6.A02.A03();
                C54662p5 r16 = r15;
                AnonymousClass4EJ r152 = r11;
                C60272yH r14 = r12;
                C52612ll r0 = r6;
                r0.A02(r11, C41032Ir.A05(new C35721xK(new C35351wj(A022.A01, A022.A02, A022.A00, A022.A03), new C35351wj(A033, 5), Long.valueOf(C56612sH.A00(r6.A00)), C18280x3.A0a(r12.A04))), A033, new AnonymousClass44J(r11, this, A0b, A032), new AnonymousClass44S(r14, r152, r16, this, num3, publicKey2, x509Certificate2));
            } catch (IOException e) {
                e = e;
                str = "Password encryption IOException:";
                Log.e(str, e);
                r11.BSB(e);
            } catch (GeneralSecurityException e2) {
                e = e2;
                str = "Password encryption GeneralSecurityException:";
                Log.e(str, e);
                r11.BSB(e);
            }
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            str = "Error generating key pair:";
            Log.e(str, e);
            r11.BSB(e);
        }
    }

    public void Bgq(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C18320x8.A0m();
    }
}
