package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.0my  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13310my implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DialogFragment A01;
    public final /* synthetic */ C003203q A02;
    public final /* synthetic */ C17130uc A03;
    public final /* synthetic */ AnonymousClass7r0 A04;
    public final /* synthetic */ C181528mu A05;
    public final /* synthetic */ C156397gY A06;
    public final /* synthetic */ String A07;

    public static /* synthetic */ void A01(DialogFragment dialogFragment, C003203q r7, C17130uc r8, AnonymousClass7r0 r9, C181528mu r10, C156397gY r11, String str, int i) {
        DialogFragment dialogFragment2 = dialogFragment;
        ((C184978sr) dialogFragment2).Bfz(AnonymousClass0VD.A00(r7, dialogFragment2, r8, r9, r11, str), r10, i);
    }

    public final void run() {
        C003203q r1 = this.A02;
        DialogFragment dialogFragment = this.A01;
        String str = this.A07;
        C17130uc r2 = this.A03;
        C156397gY r5 = this.A06;
        A01(dialogFragment, r1, r2, this.A04, this.A05, r5, str, this.A00);
    }

    public /* synthetic */ C13310my(DialogFragment dialogFragment, C003203q r2, C17130uc r3, AnonymousClass7r0 r4, C181528mu r5, C156397gY r6, String str, int i) {
        this.A02 = r2;
        this.A01 = dialogFragment;
        this.A07 = str;
        this.A03 = r3;
        this.A06 = r6;
        this.A04 = r4;
        this.A00 = i;
        this.A05 = r5;
    }
}
