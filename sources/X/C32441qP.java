package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.1qP  reason: invalid class name and case insensitive filesystem */
public class C32441qP extends AnonymousClass3UP {
    public String A00;
    public String A01;
    public final AnonymousClass2H2 A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public final Uri.Builder A03(AnonymousClass7US r7) {
        byte[] bArr;
        byte[] bArr2;
        String str = this.A01;
        if (str == null) {
            AnonymousClass2H2 r1 = this.A02;
            C626936e.A06(r1);
            String str2 = this.A02;
            if (this.A07) {
                bArr = new byte[32];
                AnonymousClass0x9.A1C().nextBytes(bArr);
            } else {
                AnonymousClass33p A0J = C18320x8.A0J(r1.A00);
                String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(A0J), "upload_token_random_bytes");
                if (TextUtils.isEmpty(A0Z) || (bArr2 = Base64.decode(A0Z, 3)) == null) {
                    bArr2 = new byte[32];
                    new SecureRandom().nextBytes(bArr2);
                    C18270x1.A0j(C18270x1.A03(A0J), "upload_token_random_bytes", C18320x8.A0i(bArr2));
                }
                byte[] A1X = AnonymousClass0x7.A1X(str2);
                if (A1X == null) {
                    bArr = (byte[]) bArr2.clone();
                } else {
                    int length = bArr2.length;
                    int length2 = A1X.length;
                    bArr = new byte[(length + length2)];
                    System.arraycopy(bArr2, 0, bArr, 0, length);
                    System.arraycopy(A1X, 0, bArr, length, length2);
                }
            }
            try {
                str = C107575bX.A0A(C18290x4.A0t(AnonymousClass0x7.A0t().digest(bArr)));
                this.A01 = str;
            } catch (NoSuchAlgorithmException e) {
                throw AnonymousClass0x9.A0i(e);
            }
        }
        C626936e.A0D(AnonymousClass000.A1W(str), "Upload token has not been set");
        Uri.Builder A012 = A01(r7);
        A012.appendQueryParameter("token", this.A01);
        return A012;
    }

    public C32441qP(AnonymousClass2H2 r2, Long l, Long l2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        super(str, str2, str3);
        if (!z2) {
            this.A00 = this.A03;
        }
        this.A02 = r2;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = str4;
        this.A03 = l;
        this.A04 = l2;
    }

    public final Uri.Builder A02(AnonymousClass7US r4) {
        Uri.Builder A032 = A03(r4);
        if (this.A06) {
            A032.appendQueryParameter("stream", "1");
        }
        String str = this.A05;
        if (str != null) {
            A032.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        }
        Long l = this.A03;
        if (l != null) {
            A032.appendQueryParameter("media_id", String.valueOf(l));
        }
        Long l2 = this.A04;
        if (l2 != null) {
            A032.appendQueryParameter("media_id_upload", String.valueOf(l2));
        }
        return A032;
    }

    public String B3m(AnonymousClass7US r2, boolean z) {
        return C18300x5.A0f(A02(r2));
    }
}
