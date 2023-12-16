package X;

import android.os.Bundle;

/* renamed from: X.5bL  reason: invalid class name and case insensitive filesystem */
public class C107455bL implements C15900s9 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C107455bL(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BTp(String str, Bundle bundle) {
        String str2;
        C08270df supportFragmentManager;
        if (this.A02 != 0) {
            C111745ic r2 = (C111745ic) this.A00;
            C003203q r1 = (C003203q) this.A01;
            str2 = "request_bottom_sheet_fragment";
            if (str2.equals(str)) {
                r2.A00();
            }
            supportFragmentManager = r1.getSupportFragmentManager();
        } else {
            AnonymousClass654 r3 = (AnonymousClass654) this.A00;
            C003203q r22 = (C003203q) this.A01;
            C162457s7.A0J(str, 2);
            str2 = "request_bottom_sheet_fragment";
            if (str.hashCode() == -860456940 && str.equals(str2) && r3 != null) {
                r3.BM6();
            }
            supportFragmentManager = r22.getSupportFragmentManager();
        }
        supportFragmentManager.A0l(str2);
    }
}
