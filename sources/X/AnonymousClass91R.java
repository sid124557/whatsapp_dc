package X;

import android.text.Spanned;
import android.util.Pair;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import java.io.File;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.91R  reason: invalid class name */
public class AnonymousClass91R implements Comparator {
    public Object A00;
    public final int A01;

    public AnonymousClass91R(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Object obj, List list, int i) {
        Collections.sort(list, new AnonymousClass91R(obj, i));
    }

    public final int compare(Object obj, Object obj2) {
        Object invoke;
        switch (this.A01) {
            case 0:
                AnonymousClass7QX r0 = (AnonymousClass7QX) this.A00;
                return r0.A00(obj2) - r0.A00(obj);
            case 1:
                return ((File) obj).getName().compareTo(((File) obj2).getName());
            case 2:
                throw AnonymousClass001.A0e("Two plugins with the same ordering provided");
            case 3:
                return (((C160577nt) obj).A08 ^ true ? 1 : 0) - (((C160577nt) obj2).A08 ^ true ? 1 : 0);
            case 4:
                return (((C160577nt) obj).A08 ? 1 : 0) - (((C160577nt) obj2).A08 ? 1 : 0);
            case 5:
                Object obj3 = ((Pair) obj).second;
                Object obj4 = ((Pair) obj2).second;
                if (obj3 == obj4) {
                    return 0;
                }
                if (C18310x6.A0B(obj3) < C18310x6.A0B(obj4)) {
                    return -1;
                }
                return 1;
            case 6:
                C180678lS r02 = (C180678lS) this.A00;
                return r02.BCU(obj2) - r02.BCU(obj);
            case 7:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                ViewGroup viewGroup = (ViewGroup) this.A00;
                return Integer.valueOf(viewGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(viewGroup.indexOfChild(materialButton2)));
            case 9:
                C108975ds BBX = ((C109075e2) obj).BBX();
                C108975ds r2 = (C108975ds) this.A00;
                return AnonymousClass2A6.A00(Float.valueOf(AnonymousClass5ZZ.A00(BBX, r2)), Float.valueOf(AnonymousClass5ZZ.A00(((C109075e2) obj2).BBX(), r2)));
            case 10:
                return ((Collator) this.A00).compare(((C166447yh) obj).A01, ((C166447yh) obj2).A01);
            case 11:
                invoke = ((AnonymousClass8ZU) ((AnonymousClass4GR) this.A00)).invoke(obj, obj2);
                break;
            case 12:
                return Integer.compare(((C60142y4) obj2).A00, ((C60142y4) obj).A00);
            case 13:
                return Long.compare(((C60142y4) obj).A01, ((C60142y4) obj2).A01);
            case 15:
                invoke = ((AnonymousClass8ZV) ((AnonymousClass4GR) this.A00)).invoke(obj, obj2);
                break;
            case 16:
                invoke = ((C1222563r) ((AnonymousClass4GR) this.A00)).invoke(obj, obj2);
                break;
            case 17:
                Spanned spanned = (Spanned) this.A00;
                if (spanned.getSpanStart(obj) < spanned.getSpanStart(obj2)) {
                    return -1;
                }
                if (spanned.getSpanStart(obj) <= spanned.getSpanStart(obj2)) {
                    return Integer.compare(spanned.getSpanEnd(obj2), spanned.getSpanEnd(obj));
                }
                return 1;
            default:
                invoke = ((AnonymousClass4GR) this.A00).invoke(obj, obj2);
                break;
        }
        return AnonymousClass001.A0K(invoke);
    }
}
