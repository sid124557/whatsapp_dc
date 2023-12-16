package X;

import com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet;

/* renamed from: X.5k2  reason: invalid class name and case insensitive filesystem */
public final class C112625k2 implements AnonymousClass663 {
    public SecretCodeAuthenticationBottomSheet A00;
    public final C106995aW A01;
    public final AnonymousClass5UK A02;
    public final AnonymousClass1VX A03;
    public final C183538qC A04;

    public void AxW(C89644eZ r4, AnonymousClass5AS r5, C1224964p r6, C102575Jj r7, int i) {
        if (this.A03.A0X(5854)) {
            SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = new SecretCodeAuthenticationBottomSheet(this.A02);
            this.A00 = secretCodeAuthenticationBottomSheet;
            secretCodeAuthenticationBottomSheet.A02 = new AnonymousClass5J5(r4, r6, this, i);
            secretCodeAuthenticationBottomSheet.A1O(r4.getSupportFragmentManager(), "SecretCodeAuthenticationBottomSheet");
            return;
        }
        r6.BSk();
    }

    public void Aya() {
        SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = this.A00;
        if (secretCodeAuthenticationBottomSheet != null) {
            secretCodeAuthenticationBottomSheet.A1L();
        }
        this.A00 = null;
    }

    public C112625k2(C106995aW r1, AnonymousClass5UK r2, AnonymousClass1VX r3, C183538qC r4) {
        C18260x0.A0c(r3, r2, r1, r4);
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
    }
}
