package X;

import android.accounts.AccountManager;
import android.app.KeyguardManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.2xS  reason: invalid class name and case insensitive filesystem */
public class C59772xS {
    public final C620633i A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;
    public final AnonymousClass31C A06;
    public final C48762fQ A07;
    public final AnonymousClass2M0 A08;
    public final AnonymousClass4FS A09;

    public static /* synthetic */ void A00(C59772xS r5, Exception exc, boolean z) {
        int i;
        KeyguardManager A092 = r5.A00.A09();
        if (A092 != null && C107385bE.A06() && r5.A04.A0Y(C58422vE.A02, 5681)) {
            AnonymousClass1YH r3 = new AnonymousClass1YH();
            AccountManager accountManager = AccountManager.get(r5.A02.A00);
            int i2 = -1;
            if (accountManager != null) {
                try {
                    i2 = accountManager.getAccountsByType("com.google").length;
                } catch (Exception unused) {
                }
            }
            r3.A01 = AnonymousClass0x9.A0m(i2);
            if (exc != null) {
                r3.A02 = C18300x5.A0W(exc).toString();
            }
            if (A092.isDeviceSecure()) {
                i = 4;
                if (z) {
                    i = 3;
                }
            } else {
                i = 2;
            }
            r3.A00 = Integer.valueOf(i);
            r5.A05.BhD(r3);
        }
    }

    public C59772xS(C620633i r1, C56612sH r2, C54292oU r3, AnonymousClass33p r4, AnonymousClass1VX r5, AnonymousClass4FV r6, AnonymousClass31C r7, C48762fQ r8, AnonymousClass2M0 r9, AnonymousClass4FS r10) {
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A09 = r10;
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r1;
        this.A03 = r4;
        this.A08 = r9;
        this.A07 = r8;
    }

    public void A01(int i) {
        String str;
        int i2 = i;
        C18260x0.A0y("BackupTokenProtocolHelper/sendBackupTokenRequest/backupTokenType:", AnonymousClass001.A0o(), i2);
        String A0b = this.A03.A0b();
        if (C107575bX.A0F(A0b)) {
            return;
        }
        if (i2 != 2 || (this.A07.A01() && this.A04.A0Y(C58422vE.A02, 6371))) {
            byte[] A0H = C627236i.A0H();
            AnonymousClass31C r14 = this.A06;
            String A032 = r14.A03();
            AnonymousClass36K r10 = new AnonymousClass36K("token", A0H, (AnonymousClass39V[]) null);
            if (i2 == 2) {
                str = "foa";
            } else {
                str = "blockstore";
            }
            AnonymousClass36K r9 = new AnonymousClass36K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, (AnonymousClass39V[]) null);
            AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
            char A0F = AnonymousClass39V.A0F("to", "s.whatsapp.net", A1W);
            char A0G = AnonymousClass39V.A0G("xmlns", "w:auth:backup:token", A1W);
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W, 2);
            AnonymousClass39V.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
            AnonymousClass36K[] r1 = new AnonymousClass36K[2];
            r1[A0F] = r10;
            r1[A0G] = r9;
            r14.A0E(new C68353Sv(this, A0b, A0H, i2), AnonymousClass36K.A0J("iq", A1W, r1), A032, 226, 32000);
            return;
        }
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest/foa backup token is not eligible");
    }
}
