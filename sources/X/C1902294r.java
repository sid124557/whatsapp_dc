package X;

import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.94r  reason: invalid class name and case insensitive filesystem */
public abstract class C1902294r extends C05550Ty {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final C56612sH A04;
    public final AnonymousClass9VU A05;
    public final AnonymousClass9W3 A06;
    public final AnonymousClass9VB A07;
    public final AnonymousClass9TR A08;

    public void A0D(C89644eZ r13, FingerprintBottomSheet fingerprintBottomSheet, C194109Rp r15, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str, String str2, String str3) {
        C56612sH r8 = this.A04;
        AnonymousClass9TR r11 = this.A08;
        C89644eZ r6 = r13;
        FingerprintBottomSheet fingerprintBottomSheet2 = fingerprintBottomSheet;
        fingerprintBottomSheet.A05 = new AnonymousClass988(r6, fingerprintBottomSheet2, r8, r15, new C197199cj(r13, fingerprintBottomSheet, pinBottomSheetDialogFragment, this, str, str2, str3), r11);
        r13.Boo(fingerprintBottomSheet);
    }

    public void A0E(C89644eZ r18, FingerprintBottomSheet fingerprintBottomSheet, C194109Rp r20, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str, String str2, String str3) {
        C89644eZ r3 = r18;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = pinBottomSheetDialogFragment;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass9W3 r1 = this.A06;
            if (r1.A05() && r1.A01() == 1) {
                A0D(r3, fingerprintBottomSheet, r20, pinBottomSheetDialogFragment2, str4, str5, str6);
                return;
            }
        }
        pinBottomSheetDialogFragment2.A0B = new C197229cm(r3, pinBottomSheetDialogFragment2, this, str5, str6, str4);
        r3.Boo(pinBottomSheetDialogFragment2);
    }

    public boolean A0F(AnonymousClass34V r8, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str) {
        int i = r8.A00;
        if (i != 1440 && i != 444 && i != 478 && i != 1441 && i != 445 && i != 1448 && i != 10718) {
            return false;
        }
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1a();
        }
        int i2 = r8.A00;
        if (i2 != 1440) {
            if (i2 != 1441) {
                if (i2 == 1448) {
                    this.A05.A02(r8, str, "PIN");
                } else if (i2 == 478 || i2 == 444) {
                    this.A05.A01.A02(str, "PIN");
                }
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1L();
                }
                this.A03.A0G(r8);
                return true;
            }
            AnonymousClass9TR r2 = this.A08;
            long j = r8.A02;
            r2.A02(j);
            if (pinBottomSheetDialogFragment == null) {
                return true;
            }
            C1899693i.A0u(pinBottomSheetDialogFragment, j);
            return true;
        } else if (pinBottomSheetDialogFragment == null) {
            return true;
        } else {
            pinBottomSheetDialogFragment.A1c(r8.A01, R.plurals.f9nameremoved);
            return true;
        }
    }

    public C1902294r(C56612sH r2, AnonymousClass9VU r3, AnonymousClass9W3 r4, AnonymousClass9VB r5, AnonymousClass9TR r6) {
        this.A04 = r2;
        this.A07 = r5;
        this.A08 = r6;
        this.A06 = r4;
        this.A05 = r3;
    }
}
