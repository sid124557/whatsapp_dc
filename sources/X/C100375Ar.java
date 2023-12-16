package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Ar  reason: invalid class name and case insensitive filesystem */
public final class C100375Ar {
    public static final boolean A00(AnonymousClass33p r9, AnonymousClass1VX r10) {
        if (AnonymousClass5V9.A01(r10)) {
            int A0N = r10.A0N(5419);
            int A0N2 = r10.A0N(5483);
            if (A0N > 0 && A0N2 > 0) {
                C183538qC r3 = r9.A01;
                if (C18300x5.A0B(r3).getInt("push_to_video_sending_enabled", -1) == -1) {
                    String A0Z = C18280x3.A0Z(C18300x5.A0B(r3), "push_to_video_sending_enabled_default_info");
                    if (A0Z != null) {
                        try {
                            List A0P = C175728Zm.A0P(A0Z, new String[]{","}, 0);
                            ArrayList A0c = C73783g4.A0c(A0P);
                            Iterator it = A0P.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    int parseInt = Integer.parseInt(AnonymousClass001.A0m(it));
                                    if (parseInt < 0) {
                                        break;
                                    }
                                    C18270x1.A1K(A0c, parseInt);
                                } else if (A0c.size() >= 3) {
                                    boolean z = false;
                                    int A07 = C86614Ku.A07(A0c, 0);
                                    int A072 = C86614Ku.A07(A0c, 1);
                                    if (C86614Ku.A07(A0c, 2) != 0) {
                                        z = true;
                                    }
                                    AnonymousClass5S8 r1 = new AnonymousClass5S8(A07, A072, z);
                                    return (A0N == r1.A01 && A0N2 == r1.A00) ? false : true;
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        return false;
    }
}
