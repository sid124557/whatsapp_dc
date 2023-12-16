package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0Vh  reason: invalid class name and case insensitive filesystem */
public final class C05870Vh {
    public static C05870Vh A05;
    public static final Object A06 = AnonymousClass002.A0D();
    public final Context A00;
    public final Handler A01;
    public final ArrayList A02 = AnonymousClass001.A0s();
    public final HashMap A03 = AnonymousClass001.A0t();
    public final HashMap A04 = AnonymousClass001.A0t();

    public static C05870Vh A00(Context context) {
        C05870Vh r1;
        synchronized (A06) {
            r1 = A05;
            if (r1 == null) {
                r1 = new C05870Vh(context.getApplicationContext());
                A05 = r1;
            }
        }
        return r1;
    }

    public C05870Vh(Context context) {
        this.A00 = context;
        this.A01 = new AnonymousClass01y(context.getMainLooper(), this);
    }
}
