package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.5XR  reason: invalid class name */
public class AnonymousClass5XR {
    public static List A02;
    public final List A00 = AnonymousClass001.A0s();
    public final List A01 = AnonymousClass001.A0s();

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1L(numArr, 128105);
        AnonymousClass000.A1M(numArr, 128104);
        AnonymousClass000.A1N(numArr, 129489);
        AnonymousClass000.A1O(numArr, 129777);
        C18280x3.A1P(numArr, 129778);
        A02 = Arrays.asList(numArr);
    }

    public AnonymousClass5XR A00(int i, int i2) {
        int i3 = i - 1;
        List list = this.A01;
        if (i3 >= list.size()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MultiSkinToneEmoji/createSkinTonedEmoji/error/person index ");
            A0o.append(i3);
            A0o.append(" is bigger than the total length of sequence ");
            C18270x1.A1F(A0o, list.size());
            return this;
        }
        AnonymousClass5XR r2 = new AnonymousClass5XR(A01());
        List list2 = r2.A01;
        if (list2.size() > i3) {
            list2.set(i3, C18290x4.A0K(C86654Ky.A0k(list2, i3), i2));
        }
        return r2;
    }

    public AnonymousClass5XR(int[] iArr) {
        ArrayList arrayList = null;
        char c = 0;
        int i = 0;
        for (int i2 : iArr) {
            if (AnonymousClass0x7.A1U(A02, i2)) {
                if (arrayList != null) {
                    this.A00.add(arrayList);
                }
                i++;
                this.A01.add(C18290x4.A0K(Integer.valueOf(i2), -1));
                arrayList = AnonymousClass001.A0s();
                c = 1;
            } else {
                int[] iArr2 = C107425bI.A05;
                int length = iArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (iArr2[i3] != i2) {
                        i3++;
                    } else if (c == 1) {
                        List list = this.A01;
                        int i4 = i - 1;
                        list.set(i4, C18290x4.A0K(C86654Ky.A0k(list, i4), i2));
                        c = 2;
                    }
                }
                if (i2 == 8205) {
                    C626936e.A06(arrayList);
                    C18270x1.A1K(arrayList, i2);
                    c = 3;
                } else if (c == 3) {
                    C626936e.A06(arrayList);
                    C18270x1.A1K(arrayList, i2);
                }
            }
        }
    }

    public int[] A01() {
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i >= list.size()) {
                return C159357lh.A02(A0s);
            }
            A0s.add(C86654Ky.A0k(list, i));
            if (!(list.size() <= i || list.get(i) == null || C18290x4.A03((Pair) list.get(i)) == -1)) {
                A0s.add(((Pair) list.get(i)).second);
            }
            List list2 = this.A00;
            if (list2.size() > i && list2.get(i) != null) {
                A0s.addAll((Collection) list2.get(i));
            }
            i++;
        }
    }
}
