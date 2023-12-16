package X;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.5Z6  reason: invalid class name */
public final class AnonymousClass5Z6 {
    public final AnonymousClass33p A00;
    public final AnonymousClass1VX A01;
    public final C102185Hu A02;

    public final void A02(AnonymousClass588 r5) {
        C162457s7.A0J(r5, 0);
        String A012 = A01(r5);
        AnonymousClass33p r1 = this.A00;
        C18260x0.A0L(r1, A012, C86664Kz.A08(AnonymousClass0x2.A0F(r1), A012, 0));
    }

    public final boolean A03(AnonymousClass588 r8) {
        C162457s7.A0J(r8, 0);
        if (!this.A01.A0X(6285)) {
            return true;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(AnonymousClass588.UPDATES);
        A0s.add(AnonymousClass588.ADVERTISE);
        for (AnonymousClass588 r3 : C73723fy.A0F(A0s)) {
            C162457s7.A0J(r3, 0);
            String A002 = A00(r3);
            C183538qC r2 = this.A00.A01;
            if (!C18300x5.A0B(r2).getBoolean(A002, false)) {
                if (C18300x5.A0B(r2).getInt(A01(r3), 0) < 3) {
                    if (r3 != r8) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass5Z6(AnonymousClass33p r7, AnonymousClass1VX r8, C102185Hu r9) {
        C18260x0.A0Q(r7, r8);
        this.A00 = r7;
        this.A01 = r8;
        this.A02 = r9;
        C183538qC r5 = r7.A01;
        if (C18300x5.A0B(r5).getBoolean("nux_status_banner_ackd_in_updates", false) || C18300x5.A0B(r5).getBoolean("nux_updates_banner_ack", false)) {
            AnonymousClass33p r3 = this.A00;
            AnonymousClass588 r2 = AnonymousClass588.UPDATES;
            C18260x0.A0L(r3, A01(r2), 3);
            C18270x1.A0v(r3, A00(r2), true);
        }
        if (C18280x3.A1W(C18300x5.A0B(r5), "pref_advertise_banner_status_main_shown")) {
            AnonymousClass33p r32 = this.A00;
            AnonymousClass588 r22 = AnonymousClass588.ADVERTISE;
            C18260x0.A0L(r32, A01(r22), 3);
            C18270x1.A0f(C18270x1.A03(r32), A00(r22));
        }
    }

    public static final String A00(AnonymousClass588 r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        String name = r3.name();
        Locale locale = Locale.getDefault();
        C162457s7.A0D(locale);
        A0o.append(C18320x8.A0g(locale, name));
        return AnonymousClass000.A0X("_status_banner_ackd", A0o);
    }

    public static final String A01(AnonymousClass588 r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        String name = r3.name();
        Locale locale = Locale.getDefault();
        C162457s7.A0D(locale);
        A0o.append(C18320x8.A0g(locale, name));
        return AnonymousClass000.A0X("_status_banner_seen_count", A0o);
    }
}
