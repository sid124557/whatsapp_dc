package X;

import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.11P  reason: invalid class name */
public final class AnonymousClass11P extends C05550Ty implements AnonymousClass4AX {
    public HashSet A00;
    public final AnonymousClass08M A01;
    public final AnonymousClass08M A02;
    public final EmojiSearchProvider A03;

    public final void A0D() {
        this.A02.A0H(AnonymousClass320.A01((List) this.A01.A07(), this.A00));
    }

    public void BaW(C48652fF r6) {
        List list = r6.A01;
        HashSet A0p = C18320x8.A0p(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != null) {
                A0p.add(obj);
            }
        }
        this.A00 = A0p;
        A0D();
    }

    public AnonymousClass11P(EmojiSearchProvider emojiSearchProvider) {
        this.A03 = emojiSearchProvider;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A01 = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        this.A02 = A013;
        A012.A0H(AnonymousClass002.A0I(0));
        A013.A0H(AnonymousClass002.A0I(0));
    }
}
