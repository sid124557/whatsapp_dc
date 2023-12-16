package X;

import android.content.Context;
import android.os.Environment;

/* renamed from: X.2Ti  reason: invalid class name and case insensitive filesystem */
public final class C43752Ti {
    public long A00;
    public String A01;
    public final Context A02;
    public final C69263Wi A03;
    public final C85014Ep A04 = new C86564Kp(this, 1);
    public final C56512s6 A05;
    public final C61072zf A06;
    public final AnonymousClass2SK A07;
    public final C622734j A08;
    public final AnonymousClass4FS A09;

    public C43752Ti(Context context, C69263Wi r4, C56512s6 r5, C61072zf r6, AnonymousClass2SK r7, C622734j r8, AnonymousClass4FS r9) {
        C18260x0.A0e(r8, r9, r4, r5);
        C162457s7.A0J(r6, 6);
        this.A02 = context;
        this.A08 = r8;
        this.A09 = r9;
        this.A03 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = r7;
        String externalStorageState = Environment.getExternalStorageState();
        C162457s7.A0D(externalStorageState);
        this.A01 = externalStorageState;
    }
}
