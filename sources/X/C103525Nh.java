package X;

import android.content.SharedPreferences;

/* renamed from: X.5Nh  reason: invalid class name and case insensitive filesystem */
public class C103525Nh {
    public final AnonymousClass4FV A00;
    public final C60152y5 A01;
    public final C34171uL A02;

    public void A00(String str) {
        SharedPreferences A03 = this.A01.A03("ntp-scheduler");
        synchronized (this) {
            C18270x1.A0h(A03.edit(), str, A03.getInt(str, 0) + 1);
        }
    }

    public C103525Nh(AnonymousClass4FV r1, C60152y5 r2, C34171uL r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
