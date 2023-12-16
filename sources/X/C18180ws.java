package X;

import android.animation.Animator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatSpinner;
import com.whatsapp.R;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import java.util.List;

/* renamed from: X.0ws  reason: invalid class name and case insensitive filesystem */
public class C18180ws implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public C18180ws(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        int i;
        int measuredHeight;
        switch (this.A01) {
            case 0:
                AnonymousClass04L r2 = (AnonymousClass04L) this.A00;
                if (r2.BIy()) {
                    List<C03670Lc> list = r2.A0O;
                    if (list.size() > 0 && !((C03670Lc) list.get(0)).A02.A0G) {
                        View view = r2.A06;
                        if (view == null || !view.isShown()) {
                            r2.dismiss();
                            return;
                        }
                        for (C03670Lc r0 : list) {
                            r0.A02.Bod();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass04M r22 = (AnonymousClass04M) this.A00;
                if (r22.BIy()) {
                    C003804f r1 = r22.A0I;
                    if (!r1.A0G) {
                        View view2 = r22.A03;
                        if (view2 == null || !view2.isShown()) {
                            r22.dismiss();
                            return;
                        } else {
                            r1.Bod();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.A00;
                C17080uX r23 = appCompatSpinner.A02;
                if (!r23.BIy()) {
                    r23.Boe(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver == null) {
                    return;
                }
                break;
            case 3:
                C003704e r24 = (C003704e) this.A00;
                AppCompatSpinner appCompatSpinner2 = r24.A04;
                if (!C06360Xi.A04(appCompatSpinner2) || !appCompatSpinner2.getGlobalVisibleRect(r24.A03)) {
                    r24.dismiss();
                    return;
                }
                r24.A03();
                C18180ws.super.Bod();
                return;
            case 4:
                AnonymousClass03E r25 = (AnonymousClass03E) this.A00;
                if (r25.A0C) {
                    int i2 = r25.A02;
                    Animator.AnimatorListener animatorListener = r25.A0E;
                    r25.clearAnimation();
                    r25.setScaleX(1.5f);
                    r25.setScaleY(1.5f);
                    r25.animate().setDuration((long) i2).setInterpolator(r25.A04).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setListener(animatorListener);
                } else {
                    boolean equals = r25.A05.equals(AnonymousClass0FU.TOP);
                    int height = r25.getHeight();
                    if (equals) {
                        height = -height;
                    }
                    r25.setTranslationY((float) height);
                    r25.A02(r25.A0E, r25.A02);
                }
                r25.A00();
                viewTreeObserver = r25.getViewTreeObserver();
                break;
            default:
                GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = (GoogleDriveNewUserSetupActivity) this.A00;
                int i3 = 0;
                int measuredHeight2 = ((ViewGroup) googleDriveNewUserSetupActivity.findViewById(R.id.scrollview)).getChildAt(0).getMeasuredHeight();
                if (googleDriveNewUserSetupActivity.A04.getVisibility() == 0) {
                    i = googleDriveNewUserSetupActivity.A04.getMeasuredHeight();
                } else {
                    i = 0;
                }
                int i4 = measuredHeight2 - i;
                if (googleDriveNewUserSetupActivity.A03.getVisibility() == 0) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = googleDriveNewUserSetupActivity.A03.getMeasuredHeight();
                }
                Point point = new Point();
                googleDriveNewUserSetupActivity.getWindowManager().getDefaultDisplay().getSize(point);
                boolean A1V = AnonymousClass001.A1V((((double) ((float) point.y)) > (((double) ((float) (i4 + measuredHeight))) * 0.7d) ? 1 : (((double) ((float) point.y)) == (((double) ((float) (i4 + measuredHeight))) * 0.7d) ? 0 : -1)));
                AppCompatSpinner A0L = googleDriveNewUserSetupActivity.A04;
                int i5 = 8;
                if (A1V) {
                    i5 = 0;
                }
                A0L.setVisibility(i5);
                RadioGroup A0C = googleDriveNewUserSetupActivity.A03;
                int i6 = 0;
                if (A1V) {
                    i6 = 8;
                }
                A0C.setVisibility(i6);
                View findViewById = googleDriveNewUserSetupActivity.findViewById(R.id.gdrive_new_user_setup_select_frequency_message);
                if (A1V) {
                    i3 = 8;
                }
                findViewById.setVisibility(i3);
                googleDriveNewUserSetupActivity.A03.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
