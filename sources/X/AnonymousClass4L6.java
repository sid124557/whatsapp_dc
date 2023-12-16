package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4L6  reason: invalid class name */
public class AnonymousClass4L6 extends AnimatorListenerAdapter {
    public final /* synthetic */ TextEmojiLabel A00;
    public final /* synthetic */ C93364oQ A01;
    public final /* synthetic */ String A02;

    public AnonymousClass4L6(TextEmojiLabel textEmojiLabel, C93364oQ r2, String str) {
        this.A01 = r2;
        this.A00 = textEmojiLabel;
        this.A02 = str;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A0B = false;
    }

    public void onAnimationStart(Animator animator) {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.A0K((List) null, this.A02);
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setScaleX(0.0f);
        textEmojiLabel.setScaleY(0.0f);
    }
}
