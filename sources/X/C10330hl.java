package X;

import com.whatsapp.util.Log;

/* renamed from: X.0hl  reason: invalid class name and case insensitive filesystem */
public class C10330hl implements AnonymousClass4EZ {
    public final /* synthetic */ AnonymousClass0XM A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;
    public final /* synthetic */ byte[] A04;

    public final void A00(Runnable runnable, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        String str2 = str;
        if (str != null) {
            byte[] bArr4 = bArr2;
            if (bArr2 != null) {
                Log.i(AnonymousClass000.A0V("BackupSendMethods/sendGetCipherKey/success v=", str, AnonymousClass001.A0o()));
                this.A00.A03.A00(str2, bArr, bArr4, bArr3, i);
                runnable.run();
            }
        }
        Log.w("BackupSendMethods/sendGetCipherKey/get-ck/file is null");
        runnable.run();
    }

    public void BdM(AnonymousClass36K r8, String str) {
        AnonymousClass36K A0k = r8.A0k(0);
        C626936e.A06(A0k);
        AnonymousClass36K.A0N(A0k, "crypto");
        byte[] A0t = A0k.A0m("password").A0t();
        A00(this.A01, this.A02, A0t, this.A04, this.A03, 0);
    }

    public C10330hl(AnonymousClass0XM r1, Runnable runnable, String str, byte[] bArr, byte[] bArr2) {
        this.A00 = r1;
        this.A02 = str;
        this.A04 = bArr;
        this.A03 = bArr2;
        this.A01 = runnable;
    }

    public void BSN(AnonymousClass36K r13, String str) {
        for (AnonymousClass36K r1 : r13.A0s("error")) {
            if (r1 != null) {
                String A0p = r1.A0p("code");
                String A0p2 = r1.A0p("text");
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("BackupSendMethods/sendGetCipherKey id=");
                A0o.append(str);
                A0o.append(" error=");
                A0o.append(A0p);
                Log.w(AnonymousClass000.A0V(" ", A0p2, A0o));
                if (A0p != null) {
                    int parseInt = Integer.parseInt(A0p);
                    A00(this.A01, this.A02, (byte[]) null, this.A04, this.A03, parseInt);
                }
            }
        }
    }

    public void BQs(String str) {
        Log.e(AnonymousClass000.A0V("BackupSendMethods/sendGetCipherKey/failed to deliver id=", str, AnonymousClass001.A0o()));
    }
}
