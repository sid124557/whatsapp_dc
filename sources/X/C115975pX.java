package X;

import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import java.util.List;

/* renamed from: X.5pX  reason: invalid class name and case insensitive filesystem */
public final class C115975pX implements AnonymousClass4BP, AnonymousClass4AK {
    public C94264qq A00;
    public AnonymousClass4AK A01;
    public AnonymousClass8s7 A02;
    public PickerSearchDialogFragment A03;
    public AnonymousClass4BP A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public final C162157rM A08;

    public final void A02(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C162157rM r0;
        C162457s7.A0J(pickerSearchDialogFragment, 0);
        this.A06 = true;
        this.A03 = pickerSearchDialogFragment;
        pickerSearchDialogFragment.A00 = this;
        if ((pickerSearchDialogFragment instanceof StickerSearchDialogFragment) && (r0 = this.A08) != null) {
            r0.A00 = this;
        }
    }

    public void BU5(C166177yG r2) {
        C162457s7.A0J(r2, 0);
        AnonymousClass4AK r0 = this.A01;
        if (r0 != null) {
            r0.BU5(r2);
        }
    }

    public void Bci(AnonymousClass39M r2, Integer num, int i) {
        C162457s7.A0J(r2, 0);
        AnonymousClass4BP r0 = this.A04;
        if (r0 != null) {
            r0.Bci(r2, num, i);
        }
    }

    public final void A00() {
        C94264qq r1 = this.A00;
        if (r1 != null) {
            r1.A03 = null;
        }
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
    }

    public void A03(List list) {
        this.A05 = list;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment instanceof StickerSearchDialogFragment) {
            C162457s7.A0K(pickerSearchDialogFragment, "null cannot be cast to non-null type com.whatsapp.picker.search.StickerSearchDialogFragment");
            ((StickerSearchDialogFragment) pickerSearchDialogFragment).A1U().A01.A0H(list);
        }
    }

    public final void A04(boolean z) {
        this.A07 = z;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment != null) {
            pickerSearchDialogFragment.A1K();
        }
    }

    public C115975pX(C162157rM r1) {
        this.A08 = r1;
    }

    public final void A01(C94264qq r1, AnonymousClass8s7 r2) {
        C18260x0.A0O(r2, r1);
        this.A02 = r2;
        this.A00 = r1;
        r1.A03 = this;
    }
}
