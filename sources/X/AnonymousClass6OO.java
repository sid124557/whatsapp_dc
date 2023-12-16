package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import java.util.Arrays;

/* renamed from: X.6OO  reason: invalid class name */
public abstract class AnonymousClass6OO extends Timeline {
    public final int A00;
    public final C186108ul A01;

    public final C158647kK A0B(C158647kK r7, int i, long j) {
        int binarySearch;
        Object obj;
        boolean z = this instanceof AnonymousClass6OA;
        if (z) {
            binarySearch = i / ((AnonymousClass6OA) this).A01;
        } else {
            int[] iArr = ((AnonymousClass6OB) this).A04;
            int i2 = i + 1;
            binarySearch = Arrays.binarySearch(iArr, i2);
            if (binarySearch < 0) {
                binarySearch = -(binarySearch + 2);
            } else {
                do {
                    binarySearch--;
                    if (binarySearch < 0) {
                        break;
                    }
                } while (iArr[binarySearch] != i2);
            }
        }
        int A0E = A0E(binarySearch);
        int A0D = A0D(binarySearch);
        A0F(binarySearch).A0B(r7, i - A0E, j);
        if (z) {
            obj = Integer.valueOf(binarySearch);
        } else {
            obj = ((AnonymousClass6OB) this).A06[binarySearch];
        }
        if (!C158647kK.A0F.equals(r7.A09)) {
            obj = Pair.create(obj, r7.A09);
        }
        r7.A09 = obj;
        r7.A00 += A0D;
        r7.A01 += A0D;
        return r7;
    }

    public int A0D(int i) {
        if (this instanceof AnonymousClass6OA) {
            return i * ((AnonymousClass6OA) this).A00;
        }
        return ((AnonymousClass6OB) this).A03[i];
    }

    public int A0E(int i) {
        if (this instanceof AnonymousClass6OA) {
            return i * ((AnonymousClass6OA) this).A01;
        }
        return ((AnonymousClass6OB) this).A04[i];
    }

    public Timeline A0F(int i) {
        if (this instanceof AnonymousClass6OA) {
            return ((AnonymousClass6OA) this).A03;
        }
        return ((AnonymousClass6OB) this).A05[i];
    }

    public AnonymousClass6OO(C186108ul r2) {
        this.A01 = r2;
        this.A00 = r2.getLength();
    }
}
