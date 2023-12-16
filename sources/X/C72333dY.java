package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Collections;

/* renamed from: X.3dY  reason: invalid class name and case insensitive filesystem */
public class C72333dY implements AnonymousClass4C1, C183538qC {
    public long A00 = -1;
    public AnonymousClass4C1 A01;
    public volatile Object A02;

    public static C72333dY A04(Object obj) {
        return new C72333dY(obj, (AnonymousClass4C1) null);
    }

    public static C72333dY A06(AnonymousClass4C1 r2) {
        return new C72333dY((Object) null, r2);
    }

    public boolean A08() {
        boolean A1W;
        synchronized (this) {
            A1W = AnonymousClass000.A1W(this.A02);
        }
        return A1W;
    }

    public static C72333dY A03(int i) {
        return new C72333dY((Object) null, new AnonymousClass4KI(i));
    }

    public static C72333dY A05(Object obj, int i) {
        return new C72333dY((Object) null, new AnonymousClass4KG(obj, i));
    }

    public Object get() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    AnonymousClass4C1 r1 = this.A01;
                    C626936e.A0C(AnonymousClass000.A1W(r1));
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        Object obj = r1.get();
                        C626936e.A06(obj);
                        this.A02 = obj;
                        this.A00 = Math.max(0, C18310x6.A0A(uptimeMillis));
                        this.A01 = null;
                    } catch (Throwable th) {
                        this.A00 = Math.max(0, C18310x6.A0A(uptimeMillis));
                        throw th;
                    }
                }
            }
        }
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72333dY(java.lang.Object r3, X.AnonymousClass4C1 r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.A00 = r0
            if (r4 != 0) goto L_0x000c
            r1 = 0
            if (r3 == 0) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            java.lang.String r0 = "Either a provider or instance must be specified."
            X.C626936e.A0E(r1, r0)
            r2.A01 = r4
            r2.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72333dY.<init>(java.lang.Object, X.4C1):void");
    }

    public static SharedPreferences.Editor A00(C72333dY r0) {
        return ((SharedPreferences) r0.get()).edit();
    }

    public static C06310Xb A01(C72333dY r0) {
        return (C06310Xb) r0.get();
    }

    public static C72333dY A02() {
        return new C72333dY(Collections.emptySet(), (AnonymousClass4C1) null);
    }

    public static void A07(C01460Ay r2, C72333dY r3, String str) {
        ((C06310Xb) r3.get()).A07(C02320Fs.REPLACE, r2, str);
    }
}
