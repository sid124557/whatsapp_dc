package X;

import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.5oA  reason: invalid class name and case insensitive filesystem */
public final class C115125oA implements AnonymousClass66B {
    public final C196629bS A00;
    public final C46092b4 A01;
    public final C183538qC A02;

    public String B5M(String str, String str2, boolean z) {
        C156697h3 r3 = this.A01.A00;
        if (r3 == null) {
            return null;
        }
        String name = C156697h3.class.getName();
        Log.d(name, "GetChallenge called");
        if (C86664Kz.A1Y(str) || C86664Kz.A1Y(str2)) {
            Log.d(name, "In-sufficient arguments provided");
            return null;
        }
        try {
            return r3.A03.B5L(str, str2);
        } catch (RemoteException unused) {
            Log.e("CLServerices", "RemoteException in getChallenge");
            return null;
        }
    }

    public boolean Bia(String str, String str2, String str3, String str4) {
        String str5;
        String str6 = null;
        try {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            str5 = Base64.encodeToString(bArr, 2);
            C162457s7.A0D(str5);
        } catch (NoSuchAlgorithmException unused) {
            com.whatsapp.util.Log.e("registerApp NoSuchAlgorithmException");
            str5 = null;
        }
        byte[] bArr2 = (byte[]) this.A00.A05().A00;
        String str7 = str2;
        String str8 = str3;
        if (!(bArr2 == null || str5 == null)) {
            try {
                StringBuilder A0l = AnonymousClass000.A0l("com.whatsapp");
                A0l.append('|');
                A0l.append(str2);
                str6 = Base64.encodeToString(C57422tc.A01(str5, C57422tc.A00(AnonymousClass0x2.A0e(str3, A0l, '|'), str5), bArr2), 0);
            } catch (Exception unused2) {
                com.whatsapp.util.Log.e("CryptoUtils: populateHmac Exception");
            }
        }
        C156697h3 r3 = this.A01.A00;
        if (r3 == null) {
            return false;
        }
        String name = C156697h3.class.getName();
        Log.d(name, "Register App called");
        if (C86664Kz.A1Y("com.whatsapp") || C86664Kz.A1Y(str2) || C86664Kz.A1Y(str3) || str6 == null || C86664Kz.A1Y(str6) || str5 == null) {
            Log.d(name, "In-sufficient arguments provided");
            return false;
        }
        try {
            return r3.A03.Bib("com.whatsapp", str7, str8, str6, str5);
        } catch (RemoteException unused3) {
            Log.e("CLServices", "Remote Exception in registerApp");
            return false;
        }
    }

    public C115125oA(C196629bS r2, C46092b4 r3, C183538qC r4) {
        C18260x0.A0V(r3, r4, r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        r3.A00((C84064Aw) null);
    }
}
