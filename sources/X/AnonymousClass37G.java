package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

/* renamed from: X.37G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass37G implements DialogInterface.OnShowListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass4SH A01;
    public final /* synthetic */ C44052Um A02;
    public final /* synthetic */ AnonymousClass4GP A03;

    public final void onShow(DialogInterface dialogInterface) {
        AnonymousClass4SH r3 = this.A01;
        AnonymousClass4GP r7 = this.A03;
        C44052Um r6 = this.A02;
        Activity activity = this.A00;
        View findViewById = r3.findViewById(R.id.design_bottom_sheet);
        C69873Yv r8 = new C69873Yv();
        if (findViewById != null) {
            BottomSheetBehavior A012 = BottomSheetBehavior.A01(findViewById);
            C162457s7.A0D(A012);
            A012.A0p = false;
            A012.A0R(-1);
            A012.A0d(true);
            C69883Yw r9 = new C69883Yw();
            r9.element = -1;
            A012.A0a(new AnonymousClass15V(activity, A012, r6, r7, r8, r9));
            A012.A0S(3);
        }
    }

    public /* synthetic */ AnonymousClass37G(Activity activity, AnonymousClass4SH r2, C44052Um r3, AnonymousClass4GP r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = activity;
    }
}
