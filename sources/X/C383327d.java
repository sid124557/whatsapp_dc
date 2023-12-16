package X;

/* renamed from: X.27d  reason: invalid class name and case insensitive filesystem */
public class C383327d {
    public static boolean A00(C56612sH r10, AnonymousClass33p r11, AnonymousClass1VX r12, C624134x r13) {
        C58422vE r1 = C58422vE.A02;
        if (!r12.A0Y(r1, 249)) {
            return false;
        }
        if ((!(r13 instanceof AnonymousClass1n2) && !(r13 instanceof C31981pC)) || !AnonymousClass2z0.A0B(r13) || r12.A0Y(r1, 1116)) {
            return false;
        }
        C183538qC r8 = r11.A01;
        if ((C18300x5.A0B(r8).getLong("status_tab_last_opened_time", 0) == 0 || r10.A0H() - C18300x5.A0B(r8).getLong("status_tab_last_opened_time", 0) > 1209600000) && (AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(r11), "registration_initialized_time") <= 0 || System.currentTimeMillis() - AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(r11), "registration_initialized_time") > 1209600000)) {
            return false;
        }
        return true;
    }
}
