package X;

import androidx.core.widget.NestedScrollView;
import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.3AR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AR implements C15870s6 {
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A00;

    public final void Bat(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = this.A00;
        userNoticeBottomSheetDialogFragment.A1c(false, false);
        userNoticeBottomSheetDialogFragment.A1a();
        Runnable runnable = userNoticeBottomSheetDialogFragment.A0H;
        if (runnable != null) {
            userNoticeBottomSheetDialogFragment.A09.A0R(runnable);
        }
        if ((userNoticeBottomSheetDialogFragment.A02.getY() - ((float) userNoticeBottomSheetDialogFragment.A08.getHeight())) - ((float) userNoticeBottomSheetDialogFragment.A08.getScrollY()) >= 0.0f) {
            C71263bp A002 = C71263bp.A00(userNoticeBottomSheetDialogFragment, 31);
            userNoticeBottomSheetDialogFragment.A0H = A002;
            userNoticeBottomSheetDialogFragment.A09.A0T(A002, 600);
        }
    }

    public /* synthetic */ AnonymousClass3AR(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A00 = userNoticeBottomSheetDialogFragment;
    }
}
