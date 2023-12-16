package X;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.0i2  reason: invalid class name and case insensitive filesystem */
public class C10500i2 implements AutoCloseable {
    public String[] A00;
    public final ArrayDeque A01;

    public void close() {
        this.A01.removeFirst();
    }

    public C10500i2(Object obj, String str, ArrayDeque arrayDeque) {
        this.A01 = arrayDeque;
        if (obj != null) {
            AnonymousClass0OI r4 = new AnonymousClass0OI(obj, str);
            arrayDeque.addFirst(r4);
            if (Log.isLoggable("CarApp.Bun", 2)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                int min = Math.min(arrayDeque.size(), 11);
                String[] strArr = this.A00;
                if (strArr == null) {
                    strArr = new String[12];
                    this.A00 = strArr;
                }
                String str2 = strArr[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    str2 = new String(cArr);
                    str2 = min == 11 ? AnonymousClass000.A0X("...", AnonymousClass000.A0l(str2)) : str2;
                    this.A00[min] = str2;
                }
                A0o.append(str2);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(AnonymousClass0YB.A03(r4.A00.getClass()));
                AnonymousClass001.A1L(A0o2);
                AnonymousClass000.A1E(AnonymousClass000.A0X(r4.A01, A0o2), "CarApp.Bun", A0o);
            }
        }
    }

    public String A00() {
        StringBuilder A0o = AnonymousClass001.A0o();
        ArrayDeque arrayDeque = this.A01;
        int min = Math.min(arrayDeque.size(), 8);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i = min - 1;
            if (min <= 0) {
                break;
            }
            AnonymousClass0OI r2 = (AnonymousClass0OI) descendingIterator.next();
            StringBuilder A0p = AnonymousClass001.A0p();
            A0p.append(r2.A01);
            AnonymousClass001.A1M(A0p);
            A0o.append(AnonymousClass000.A0W(AnonymousClass0YB.A03(r2.A00.getClass()), A0p));
            min = i;
        }
        if (descendingIterator.hasNext()) {
            A0o.append("[...]");
        }
        return A0o.toString();
    }
}
