package X;

import android.content.Context;
import android.os.Environment;

/* renamed from: X.2TL  reason: invalid class name */
public final class AnonymousClass2TL {
    public long A00;
    public String A01;
    public final Context A02;
    public final C85014Ep A03 = new C86564Kp(this, 2);
    public final C56512s6 A04;
    public final C61072zf A05;
    public final C54322oX A06;
    public final C622734j A07;

    public AnonymousClass2TL(Context context, C56512s6 r4, C61072zf r5, C54322oX r6, C622734j r7) {
        C18260x0.A0e(r7, r4, r5, r6);
        this.A02 = context;
        this.A07 = r7;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r6;
        String externalStorageState = Environment.getExternalStorageState();
        C162457s7.A0D(externalStorageState);
        this.A01 = externalStorageState;
    }
}
