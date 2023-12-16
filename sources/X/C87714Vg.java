package X;

import android.content.Context;
import android.database.Cursor;

/* renamed from: X.4Vg  reason: invalid class name and case insensitive filesystem */
public class C87714Vg extends AnonymousClass08c {
    public Cursor A00;
    public AnonymousClass0QU A01;
    public final C620733j A02;
    public final C95814uZ A03;
    public final AnonymousClass65Y A04;
    public final String A05;

    public /* bridge */ /* synthetic */ Object A06() {
        Cursor B9f;
        synchronized (this) {
            if (!AnonymousClass000.A1W(this.A01)) {
                this.A01 = new AnonymousClass0QU();
            } else {
                throw new C13860nr();
            }
        }
        try {
            C56532s8 r3 = new C56532s8(this.A02);
            r3.A05(this.A05);
            B9f = this.A04.B9f(this.A01, this.A03, r3);
            if (B9f != null) {
                B9f.getCount();
            }
            synchronized (this) {
                this.A01 = null;
            }
            return B9f;
        } catch (RuntimeException e) {
            B9f.close();
            throw e;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A01 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    public void A07() {
        synchronized (this) {
            AnonymousClass0QU r0 = this.A01;
            if (r0 != null) {
                r0.A01();
            }
        }
    }

    public void A03() {
        Cursor cursor = this.A00;
        if (cursor != null) {
            A04(cursor);
        }
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        if (z || this.A00 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ void A0B(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: A0C */
    public void A04(Cursor cursor) {
        if (!this.A05) {
            Cursor cursor2 = this.A00;
            this.A00 = cursor;
            if (this.A06) {
                super.A04(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public C87714Vg(Context context, C620733j r2, C95814uZ r3, AnonymousClass65Y r4, String str) {
        super(context);
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = str;
        this.A03 = r3;
    }

    public void A01() {
        A00();
        Cursor cursor = this.A00;
        if (cursor != null && !cursor.isClosed()) {
            this.A00.close();
        }
        this.A00 = null;
    }

    public void A02() {
        A00();
    }
}
