package X;

import android.animation.Animator;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.68c  reason: invalid class name and case insensitive filesystem */
public class C1233568c implements Animator.AnimatorListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C1233568c(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public static void A00(C1233568c r3) {
        int i = r3.A03;
        ((Animator) r3.A01).removeAllListeners();
        if (i != 0) {
            MessageReplyActivity.A0L((MessageReplyActivity) r3.A00, (AnonymousClass39M) r3.A02);
        } else {
            ((MessageReplyActivity) r3.A00).A7D(C107345b9.A06((int[]) r3.A02), 15);
        }
    }

    public void onAnimationCancel(Animator animator) {
        A00(this);
    }

    public void onAnimationEnd(Animator animator) {
        A00(this);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
