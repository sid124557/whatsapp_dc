package X;

import com.whatsapp.util.Log;

/* renamed from: X.1ml  reason: invalid class name and case insensitive filesystem */
public class C30631ml extends C54252oQ {
    public final /* synthetic */ AnonymousClass30X A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ byte[] A03;

    public C30631ml(AnonymousClass30X r1, String str, byte[] bArr, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A03 = bArr;
        this.A01 = str;
    }

    public void A02(AnonymousClass36K r5) {
        if (!this.A02) {
            Log.i("ConnectionWriter/app/handle/skip-set-recovery-token");
            AnonymousClass30X r3 = this.A00;
            C18270x1.A0l(C18270x1.A03(r3.A07), "pref_deprecate_rc", true);
            C627236i.A0A(r3.A06.A00);
            return;
        }
        Log.d("ConnectionWriter/app/handle/set-recovery-token");
        if (!C627236i.A0D(this.A00.A06.A00, this.A01, this.A03)) {
            Log.e("ConnectionWriter/app/set-recovery-token/fail");
        }
    }
}
