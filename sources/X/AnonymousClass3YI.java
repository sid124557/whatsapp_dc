package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3YI  reason: invalid class name */
public final class AnonymousClass3YI implements C84314Bw {
    public final C380625j A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass1VX A02;

    public boolean AxE(AnonymousClass2PJ r9, C833648c r10, C833748d r11) {
        TimeUnit timeUnit;
        long parseLong;
        C162457s7.A0J(r9, 1);
        String A0o = C18310x6.A0o("param", r9.A01);
        if (A0o == null) {
            timeUnit = TimeUnit.MINUTES;
            parseLong = C56952sp.A06(this.A02, 4214);
        } else {
            timeUnit = TimeUnit.SECONDS;
            parseLong = Long.parseLong(A0o);
        }
        long millis = timeUnit.toMillis(parseLong);
        AnonymousClass33p r3 = this.A01;
        int i = AnonymousClass0x2.A0F(r3).getInt("privacy_profile_photo", 0);
        long A0A = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r3), "privacy_tip_remove_profile_photo_timestamp");
        if (((int) A0A) == -1) {
            return false;
        }
        long j = A0A + millis;
        if (i != 0 || System.currentTimeMillis() >= j) {
            return false;
        }
        return true;
    }

    public AnonymousClass3YI(C380625j r1, AnonymousClass33p r2, AnonymousClass1VX r3) {
        C18260x0.A0V(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
