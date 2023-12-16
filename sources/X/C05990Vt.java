package X;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* renamed from: X.0Vt  reason: invalid class name and case insensitive filesystem */
public class C05990Vt {
    public int A00;
    public ServiceConnection A01;
    public IGetInstallReferrerService A02;
    public final Context A03;

    public C05990Vt(Context context) {
        this.A00 = 0;
        this.A03 = context.getApplicationContext();
    }

    public C05990Vt() {
    }
}
