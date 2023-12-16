package X;

import com.whatsapp.util.Log;

/* renamed from: X.9YI  reason: invalid class name */
public class AnonymousClass9YI implements C16800tz {
    public final C180328kr A00;
    public final C56612sH A01;
    public final AnonymousClass9Qq A02;
    public final C197759dp A03;
    public final C193159Nj A04 = new C193159Nj();

    public C186468vN Bq1(String str, int i, int i2, long j) {
        int i3;
        Log.d("WABloksTTRCLoggerImpl/startTrace");
        C56612sH r9 = this.A01;
        long nanoTime = System.nanoTime();
        AnonymousClass9Qq r8 = this.A02;
        int i4 = i2;
        Integer valueOf = Integer.valueOf(i4);
        int i5 = i;
        int i6 = i5;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            int i7 = 0;
            for (int i8 = 0; i8 < 32; i8++) {
                i7 |= ((intValue >> i8) & 1) << (31 - i8);
            }
            i6 = i ^ i7;
        }
        String str2 = str;
        if (str == null) {
            i3 = r8.A00.A00(i5).A01;
        } else {
            AnonymousClass9TW r4 = r8.A00;
            r4.A01();
            C193379Og r3 = (C193379Og) r4.A04.get(str2);
            if (r3 == null) {
                r3 = new C193379Og(-1, 812974081);
                r4.A04.put(str2, r3);
            }
            i3 = r3.A01;
        }
        C197759dp r10 = this.A03;
        C193159Nj r11 = this.A04;
        AnonymousClass9YN r82 = new AnonymousClass9YN(r9, r10, r11, str2, i3, i6, (((long) i4) & 4294967295L) | ((((long) i5) << 32) & -4294967296L), nanoTime);
        r82.BKc("using_backup_start_time", false);
        r82.BKc("using_capped_backup_start_time", false);
        C197759dp r0 = r82.A05;
        if (r0.A03.isMarkerOn(r82.A01, r82.A00)) {
            r11.A00.put(Long.valueOf(r82.A03), r82);
        }
        return r82;
    }

    public AnonymousClass9YI(C56612sH r2, AnonymousClass9Qq r3, C197759dp r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = new AnonymousClass9YM(r2);
        this.A02 = r3;
    }

    public C180328kr BDU() {
        return this.A00;
    }
}
