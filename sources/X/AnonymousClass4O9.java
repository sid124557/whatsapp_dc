package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.emoji.EmojiPopupFooter;

/* renamed from: X.4O9  reason: invalid class name */
public final class AnonymousClass4O9 extends Animation {
    public final int A00;
    public final int A01;
    public final /* synthetic */ C89224c7 A02;

    public AnonymousClass4O9(C89224c7 r4, int i) {
        this.A02 = r4;
        this.A00 = i;
        EmojiPopupFooter emojiPopupFooter = r4.A08;
        int i2 = emojiPopupFooter.A00;
        this.A01 = i2;
        setDuration((long) ((AnonymousClass001.A0A(i2, i) * 300) / emojiPopupFooter.getHeight()));
    }

    public void applyTransformation(float f, Transformation transformation) {
        EmojiPopupFooter emojiPopupFooter = this.A02.A08;
        int i = this.A01;
        emojiPopupFooter.setTopOffset((int) (((float) i) + (((float) (this.A00 - i)) * f)));
    }
}
