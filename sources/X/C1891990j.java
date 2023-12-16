package X;

import android.view.KeyEvent;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.90j  reason: invalid class name and case insensitive filesystem */
public class C1891990j implements AnonymousClass4CE {
    public Object A00;
    public final int A01;

    public C1891990j(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BNH() {
        MentionableEntry mentionableEntry;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                mentionableEntry = ((CartFragment) obj).A0v;
                break;
            case 1:
                mentionableEntry = ((C102935Kv) obj).A07;
                break;
            case 2:
                mentionableEntry = ((AnonymousClass4LD) obj).A03.A04.A0E;
                break;
            default:
                mentionableEntry = ((C102855Kn) obj).A06;
                break;
        }
        mentionableEntry.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void BRo(int[] iArr) {
        MentionableEntry mentionableEntry;
        int i;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                mentionableEntry = ((CartFragment) obj).A0v;
                i = 65536;
                break;
            case 1:
                mentionableEntry = ((C102935Kv) obj).A07;
                break;
            case 2:
                mentionableEntry = ((AnonymousClass4LD) obj).A03.A04.A0E;
                break;
            default:
                mentionableEntry = ((C102855Kn) obj).A06;
                break;
        }
        i = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        C107345b9.A09(mentionableEntry, iArr, i);
    }
}
