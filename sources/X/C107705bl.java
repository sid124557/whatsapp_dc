package X;

import android.animation.Animator;
import android.view.View;
import com.whatsapp.contact.picker.SelectedContactsList;

/* renamed from: X.5bl  reason: invalid class name and case insensitive filesystem */
public class C107705bl implements Animator.AnimatorListener {
    public final /* synthetic */ SelectedContactsList A00;

    public C107705bl(SelectedContactsList selectedContactsList) {
        this.A00 = selectedContactsList;
    }

    public void onAnimationEnd(Animator animator) {
        int i;
        View view;
        SelectedContactsList selectedContactsList = this.A00;
        if (!selectedContactsList.A09.isEmpty()) {
            i = 0;
            view = selectedContactsList.A04;
        } else {
            i = 4;
            view = selectedContactsList;
        }
        view.setVisibility(i);
    }

    public void onAnimationStart(Animator animator) {
        int i;
        View view;
        SelectedContactsList selectedContactsList = this.A00;
        if (!selectedContactsList.A09.isEmpty()) {
            i = 0;
            view = selectedContactsList;
        } else {
            i = 8;
            view = selectedContactsList.A04;
        }
        view.setVisibility(i);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
