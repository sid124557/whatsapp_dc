package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.9ES  reason: invalid class name */
public class AnonymousClass9ES extends C194939Vd {
    public final AnonymousClass9U4 A00;
    public final AnonymousClass4FS A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9ES(X.C69263Wi r20, X.C56972sr r21, X.C89644eZ r22, X.C56612sH r23, X.AnonymousClass30K r24, X.C1906899l r25, X.C194479Ta r26, X.C40602Ha r27, X.C620933l r28, X.AnonymousClass9U5 r29, X.AnonymousClass9WM r30, X.AnonymousClass9U4 r31, X.C194089Rn r32, X.AnonymousClass9VU r33, X.C203499no r34, X.AnonymousClass9W3 r35, X.AnonymousClass9TR r36, X.C203199nH r37, X.AnonymousClass4FS r38) {
        /*
            r19 = this;
            r12 = r30
            r11 = r29
            r10 = r28
            r9 = r27
            r8 = r26
            r7 = r25
            r18 = r37
            r6 = r24
            r17 = r36
            r5 = r23
            r16 = r35
            r4 = r22
            r15 = r34
            r3 = r21
            r14 = r33
            r2 = r20
            r13 = r32
            r1 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r38
            r1.A01 = r0
            r0 = r31
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ES.<init>(X.3Wi, X.2sr, X.4eZ, X.2sH, X.30K, X.99l, X.9Ta, X.2Ha, X.33l, X.9U5, X.9WM, X.9U4, X.9Rn, X.9VU, X.9no, X.9W3, X.9TR, X.9nH, X.4FS):void");
    }

    public void A05(AnonymousClass3ZO r7) {
        C165817xg r2;
        List list = this.A02;
        String str = r7.A06;
        list.add(str);
        C165897xo r0 = r7.A03;
        this.A00 = r0;
        if (r0 != null && (r2 = r0.A00) != null && r2.A00.equals("WEBVIEW")) {
            if (((C137086nl) r2).A00) {
                this.A01.BkL(new AnonymousClass9GU(this.A06, this.A00, new AnonymousClass9d5(this, str)), new C15910sA[0]);
            } else {
                A06((PinBottomSheetDialogFragment) null, (AnonymousClass36K) null);
            }
        }
    }
}
