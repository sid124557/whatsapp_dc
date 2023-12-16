package X;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.profile.ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1;

/* renamed from: X.5Zn  reason: invalid class name and case insensitive filesystem */
public final class C106575Zn {
    public static final boolean A00 = C18280x3.A1U(Build.VERSION.SDK_INT, 22);

    public static final void A00(View view, View view2, Toolbar toolbar, C89654ea r11, PhotoView photoView, AnonymousClass7ZM r13, boolean z) {
        C18260x0.A0d(view, view2, toolbar, photoView);
        ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1 profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1 = new ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1(r11, photoView);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        view.setBackground(colorDrawable);
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A01 = 0.5f;
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A0A = true;
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A07 = z;
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A05 = new C114315mq(colorDrawable, toolbar, r11, r13, z);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        C162457s7.A0K(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((C002002f) layoutParams).A01(profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1);
    }

    public static final void A01(C89654ea r7, AnonymousClass7ZM r8, C151977Xa r9) {
        AnonymousClass6EJ r1;
        String stringExtra;
        Window window = r7.getWindow();
        Intent intent = r7.getIntent();
        if (A00) {
            window.addFlags(Integer.MIN_VALUE);
            C86634Kw.A1F(window);
            AnonymousClass4N6 r2 = new AnonymousClass4N6(window, r8, intent.getFloatExtra("start_transition_alpha", 0.0f));
            AnonymousClass4N5 r12 = new AnonymousClass4N5(window, r8);
            C86634Kw.A19(r2);
            window.setEnterTransition(r2);
            window.setReturnTransition(r12);
            r2.addListener(new C89924fV(window, r7, r9));
            r12.addListener(new C1232867v(r7, 1, r9));
            if (intent.getBooleanExtra("circular_transition", false)) {
                AnonymousClass5MG r3 = new AnonymousClass5MG(r7);
                AnonymousClass6EJ r13 = new AnonymousClass6EJ(true, false);
                r13.addTarget(r3.A03(R.string.f11nameremoved));
                window.setSharedElementEnterTransition(r13);
                r1 = new AnonymousClass6EJ(false, true);
                stringExtra = r3.A03(R.string.f11nameremoved);
            } else if (intent.hasExtra("circular_return_name")) {
                AnonymousClass6EJ r14 = new AnonymousClass6EJ(false, false);
                r14.addTarget(intent.getStringExtra("circular_return_name"));
                window.setSharedElementEnterTransition(r14);
                r1 = new AnonymousClass6EJ(false, true);
                stringExtra = intent.getStringExtra("circular_return_name");
            } else {
                return;
            }
            r1.addTarget(stringExtra);
            window.setSharedElementReturnTransition(r1);
        }
    }
}
