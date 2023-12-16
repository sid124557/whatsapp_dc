package X;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3cr  reason: invalid class name and case insensitive filesystem */
public class C71903cr implements Comparator {
    public HashMap A00;
    public final C149467Mo[] A01;

    public final synchronized HashMap A00() {
        HashMap hashMap;
        hashMap = this.A00;
        if (hashMap == null) {
            hashMap = AnonymousClass001.A0t();
            int i = 0;
            for (C149467Mo r0 : this.A01) {
                Iterator A0q = C18320x8.A0q(r0.A03.get());
                while (A0q.hasNext()) {
                    AnonymousClass0x2.A1I(A0q.next(), hashMap, i);
                    i++;
                }
            }
            C18260x0.A0w("EmojiPickerComparator/createEmojiPickerRanking/total emojis:", AnonymousClass001.A0o(), i);
            this.A00 = hashMap;
        }
        return hashMap;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        C106655Zv r4 = (C106655Zv) obj;
        C106655Zv r5 = (C106655Zv) obj2;
        if (A00().containsKey(r4)) {
            i = AnonymousClass001.A0K(A00().get(r4));
        } else {
            C18260x0.A1O(AnonymousClass001.A0o(), "EmojiPickerComparator/found an emoji that doesn't exist in emoji picker ", r4);
            i = 0;
        }
        if (A00().containsKey(r5)) {
            i2 = AnonymousClass001.A0K(A00().get(r5));
        } else {
            C18260x0.A1O(AnonymousClass001.A0o(), "EmojiPickerComparator/found an emoji that doesn't exist in emoji picker ", r5);
            i2 = 0;
        }
        return i - i2;
    }

    public C71903cr(C149467Mo[] r1) {
        this.A01 = r1;
    }
}
