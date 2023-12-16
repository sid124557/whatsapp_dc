package X;

import com.whatsapp.payments.ui.PaymentIncentiveViewFragment;

/* renamed from: X.9Wg  reason: invalid class name */
public class AnonymousClass9Wg {
    public static AnonymousClass303 A00(C56612sH r7, AnonymousClass39Q r8, AnonymousClass9VG r9, String str, boolean z) {
        AnonymousClass303[] r0;
        C194869Uu r6;
        int A00;
        if (r9 == null || (r6 = r9.A01) == null || (A00 = r9.A00(C56612sH.A00(r7))) == 0 || A00 == 3) {
            r0 = new AnonymousClass303[0];
        } else {
            C190889Af r5 = new C190889Af();
            r5.A04("is_ended_early", AnonymousClass000.A1U(A00, 4));
            if (z) {
                r5.A04("is_sender_receiver_eligible", AnonymousClass000.A1T(r9.A00));
            }
            AnonymousClass39Q r02 = r6.A09.A00.A02;
            if (r8 != null) {
                boolean z2 = false;
                if (r8.A00.compareTo(r02.A00) < 0) {
                    z2 = true;
                }
                r5.A04("is_amount_low", z2);
            }
            r0 = new AnonymousClass303[]{r5};
        }
        AnonymousClass303 r1 = new AnonymousClass303((String) null, r0);
        if (str != null) {
            r1.A03("section", str);
        }
        if (r1.A01.length() > 0) {
            return r1;
        }
        return null;
    }

    public static AnonymousClass303 A01(C56612sH r2, AnonymousClass39Q r3, AnonymousClass9VG r4, boolean z) {
        AnonymousClass303 A00 = A00(r2, r3, r4, (String) null, true);
        if (A00 == null) {
            A00 = C1899593h.A0K();
        }
        A00.A04("is_p2m_buyer_initiated", z);
        return A00;
    }

    public static void A02(AnonymousClass303 r2, C203499no r3, Integer num, String str, String str2, int i) {
        C203499no r1 = r3;
        C626936e.A06(r3);
        if (r2 != null) {
            r1.BKE(r2, Integer.valueOf(i), num, str, str2);
        } else {
            r3.BKB(Integer.valueOf(i), num, str, str2);
        }
    }

    public static void A03(AnonymousClass303 r6, C203499no r7, String str, String str2) {
        A02(r6, r7, (Integer) null, str, str2, 0);
    }

    public static void A04(PaymentIncentiveViewFragment paymentIncentiveViewFragment, Integer num) {
        A02(A00(paymentIncentiveViewFragment.A02, (AnonymousClass39Q) null, paymentIncentiveViewFragment.A07, (String) null, true), paymentIncentiveViewFragment.A06, num, "incentive_details", (String) null, 1);
    }
}
