package X;

import android.database.Cursor;

/* renamed from: X.1nE  reason: invalid class name */
public class AnonymousClass1nE extends C30471mV implements AnonymousClass4B9 {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public transient long A03;
    public transient AnonymousClass330 A04;
    public transient Integer A05;

    public AnonymousClass1nE(AnonymousClass33C r10, AnonymousClass2z0 r11, AnonymousClass1nE r12, long j, boolean z) {
        super(r10, r11, r12, r12.A1I, j, z);
        this.A04 = r12.A04;
        this.A02 = r12.A02;
        this.A00 = r12.A00;
        this.A03 = j;
    }

    public /* bridge */ /* synthetic */ C624134x Az3(AnonymousClass2z0 r8) {
        long j = this.A0K;
        return new AnonymousClass1nE(this.A01, r8, this, j, true);
    }

    public boolean A23() {
        AnonymousClass330 r0 = this.A04;
        if ((r0 == null || !r0.A06) && !this.A01) {
            return false;
        }
        return true;
    }

    public boolean A24() {
        Integer num = this.A00;
        if (num == null || (num.intValue() & 1) == 0) {
            return false;
        }
        return true;
    }

    public void A1y(Cursor cursor, AnonymousClass33C r5) {
        Integer A0a;
        super.A1y(cursor, r5);
        boolean A052 = C626135u.A05(cursor, "is_animated_sticker");
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("sticker_flags");
        if (cursor.isNull(columnIndexOrThrow)) {
            A0a = null;
        } else {
            A0a = C18300x5.A0a(cursor, columnIndexOrThrow);
        }
        this.A00 = A0a;
        this.A02 = A052;
    }

    public AnonymousClass1nE(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 20, j);
        this.A03 = j;
    }
}
