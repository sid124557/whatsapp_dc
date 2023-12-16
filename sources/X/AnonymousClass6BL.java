package X;

import android.view.ViewTreeObserver;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6BL  reason: invalid class name */
public class AnonymousClass6BL implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;

    public AnonymousClass6BL(AnonymousClass67A r2, AnonymousClass5J8 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r3.A01.getHeight();
    }

    public void onGlobalLayout() {
        int height;
        if (this.A03 != 0) {
            C93304oI r1 = ((AnonymousClass5J9) this.A02).A03;
            height = r1.getHeight();
            if (height > this.A00) {
                AnonymousClass67A r2 = (AnonymousClass67A) this.A01;
                if (r1.getTop() + this.A00 <= r2.getListView().getHeight()) {
                    r2.scrollBy(height - this.A00, 0);
                }
            } else {
                return;
            }
        } else {
            AnonymousClass67A r7 = (AnonymousClass67A) this.A01;
            AnonymousClass5J8 r9 = (AnonymousClass5J8) this.A02;
            C93094nt r8 = r9.A01;
            height = r8.getHeight();
            int i = this.A00;
            if (height > i) {
                int i2 = height - i;
                boolean z = false;
                if (r8.getTop() + this.A00 <= r7.getListView().getHeight()) {
                    z = true;
                }
                TextEmojiLabel textEmojiLabel = r8.A05;
                int lineCount = textEmojiLabel.getLineCount();
                int i3 = r9.A00;
                if (lineCount > i3) {
                    i2 = ((textEmojiLabel.getHeight() / textEmojiLabel.getLineCount()) * i3) - this.A00;
                }
                int top = r8.getTop() - r7.getListView().getTop();
                if (top < i2) {
                    i2 = top;
                }
                if (z && i2 > 0) {
                    r7.scrollBy(i2, 0);
                    C18260x0.A0w("WordAnimation/scrollBy/", AnonymousClass001.A0o(), i2);
                }
            } else {
                return;
            }
        }
        this.A00 = height;
    }

    public AnonymousClass6BL(AnonymousClass67A r2, AnonymousClass5J9 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r3.A03.getHeight();
    }
}
