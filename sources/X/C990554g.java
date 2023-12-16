package X;

import com.whatsapp.TextEmojiLabel;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.54g  reason: invalid class name and case insensitive filesystem */
public class C990554g extends AnonymousClass5ZM {
    public final AnonymousClass5ZU A00;
    public final AnonymousClass3ZH A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A0U((C28011fL) AnonymousClass3ZH.A05(this.A01, C28011fL.class), -1, true);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A02.get();
        if (textEmojiLabel != null && textEmojiLabel.getTag().equals(this.A01.A0H)) {
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A0K((List) null, str);
        }
    }

    public C990554g(TextEmojiLabel textEmojiLabel, AnonymousClass5ZU r3, AnonymousClass3ZH r4) {
        this.A02 = AnonymousClass0x9.A14(textEmojiLabel);
        this.A01 = r4;
        this.A00 = r3;
    }
}
