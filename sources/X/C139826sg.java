package X;

import android.content.Context;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

/* renamed from: X.6sg  reason: invalid class name and case insensitive filesystem */
public final class C139826sg extends C128996Ys {
    public final /* synthetic */ WDSBottomSheetDialogFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139826sg(Context context, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment, C188498yz r3, int i) {
        super(context, (AnonymousClass4GQ) r3, i);
        this.A00 = wDSBottomSheetDialogFragment;
        C162457s7.A0H(context);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onStart() {
        super.onStart();
        this.A00.A1V(this);
    }
}
