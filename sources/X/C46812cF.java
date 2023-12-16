package X;

import android.database.Cursor;

/* renamed from: X.2cF  reason: invalid class name and case insensitive filesystem */
public final class C46812cF {
    public final C55682qk A00;
    public final C50632iV A01;
    public final C66373Lc A02;
    public final C54102oB A03;
    public final C55122pp A04;
    public final AnonymousClass4FS A05;

    public C46812cF(C55682qk r2, C50632iV r3, C66373Lc r4, C54102oB r5, C55122pp r6, AnonymousClass4FS r7) {
        C162457s7.A0J(r4, 4);
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = r2;
    }

    public final void A00(Cursor cursor, AnonymousClass2z0 r12, String str, boolean z) {
        C69903Yy r7 = new C69903Yy();
        C624134x r4 = null;
        if (z) {
            C624134x A032 = this.A04.A03(cursor, r12);
            if (A032 != null) {
                this.A03.A00(A032);
            } else {
                A032 = null;
            }
            r7.element = A032;
        }
        C55122pp r1 = this.A04;
        C624134x A033 = r1.A03(cursor, r12);
        if (A033 != null) {
            this.A01.A00(A033);
        } else {
            A033 = null;
        }
        Object obj = r7.element;
        if (obj == null) {
            C624134x A034 = r1.A03(cursor, r12);
            if (A034 != null) {
                this.A03.A00(A034);
                r4 = A034;
            }
            r7.element = r4;
            obj = r4;
        }
        try {
            this.A02.A00(A033, (C624134x) obj, (String) null);
        } catch (IllegalStateException e) {
            if (!z) {
                A00(cursor, r12, e.getMessage(), true);
            } else {
                this.A05.Bkn(new C71603cN(this, A033, r7, str, 26), "db-read-mismatch-compare", 2000);
            }
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }
}
