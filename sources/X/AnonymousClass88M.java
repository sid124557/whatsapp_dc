package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: X.88M  reason: invalid class name */
public final class AnonymousClass88M implements C185358tW {
    public final C160707oA A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final long[] A04;

    public List B6I(long j) {
        C160707oA r10 = this.A00;
        Map map = this.A01;
        Map map2 = this.A03;
        Map map3 = this.A02;
        ArrayList A0s = AnonymousClass001.A0s();
        String str = r10.A06;
        long j2 = j;
        r10.A03(str, A0s, j2);
        TreeMap treeMap = new TreeMap();
        r10.A04(str, treeMap, j2, false);
        r10.A05(str, map, map2, treeMap, j2);
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String A0o = C18310x6.A0o(pair.second, map3);
            if (A0o != null) {
                byte[] decode = Base64.decode(A0o, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                Object obj = map2.get(pair.first);
                obj.getClass();
                C150177Po r6 = (C150177Po) obj;
                C157757ip r1 = new C157757ip();
                r1.A0C = decodeByteArray;
                r1.A02 = r6.A02;
                r1.A08 = 0;
                r1.A01 = r6.A01;
                r1.A07 = 0;
                r1.A06 = r6.A05;
                r1.A04 = r6.A04;
                r1.A00 = r6.A00;
                r1.A0A = r6.A08;
                A0s2.add(r1.A00());
            }
        }
        Iterator A0u = AnonymousClass001.A0u(treeMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            Object A0k = AnonymousClass0x7.A0k(A0w, map2);
            A0k.getClass();
            C150177Po r5 = (C150177Po) A0k;
            C157757ip r4 = (C157757ip) A0w.getValue();
            CharSequence charSequence = r4.A0E;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (AnonymousClass72E r0 : (AnonymousClass72E[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnonymousClass72E.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(r0), spannableStringBuilder.getSpanEnd(r0), "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == 10) {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == 10) {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = r5.A01;
            int i9 = r5.A06;
            r4.A01 = f;
            r4.A07 = i9;
            r4.A06 = r5.A05;
            r4.A02 = r5.A02;
            r4.A04 = r5.A04;
            float f2 = r5.A03;
            int i10 = r5.A07;
            r4.A05 = f2;
            r4.A09 = i10;
            r4.A0A = r5.A08;
            A0s2.add(r4.A00());
        }
        return A0s2;
    }

    public long B7R(int i) {
        return this.A04[i];
    }

    public int B7S() {
        return this.A04.length;
    }

    public int B9y(long j) {
        long[] jArr = this.A04;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] != j);
        }
        if (binarySearch >= jArr.length) {
            return -1;
        }
        return binarySearch;
    }

    public AnonymousClass88M(C160707oA r7, Map map, Map map2, Map map3) {
        this.A00 = r7;
        this.A03 = map2;
        this.A02 = map3;
        this.A01 = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        r7.A06(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = C18310x6.A0B(it.next());
            i++;
        }
        this.A04 = jArr;
    }
}
