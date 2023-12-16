package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;

/* renamed from: X.4HR  reason: invalid class name */
public class AnonymousClass4HR extends C166677z5 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4HR(Object obj, int i, Object obj2) {
        this.A03 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C71343bx r3;
        InterceptingEditText interceptingEditText;
        int i4 = this.A03;
        Runnable runnable = (Runnable) this.A00;
        if (i4 != 0) {
            if (runnable != null) {
                ((EmojiSearchKeyboardContainer) this.A01).A04.removeCallbacks(runnable);
            }
            r3 = new C71343bx(this, 34, charSequence);
            this.A00 = r3;
            interceptingEditText = ((EmojiSearchKeyboardContainer) this.A01).A04;
        } else {
            if (runnable != null) {
                ((EmojiSearchContainer) this.A01).A04.removeCallbacks(runnable);
            }
            r3 = new C71343bx(this, 33, charSequence);
            this.A00 = r3;
            interceptingEditText = ((EmojiSearchContainer) this.A01).A04;
        }
        interceptingEditText.postDelayed(r3, 500);
        ((View) this.A02).setVisibility(AnonymousClass0x9.A00(TextUtils.isEmpty(charSequence) ? 1 : 0));
    }
}
