package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.03x  reason: invalid class name */
public final class AnonymousClass03x extends C04520Op {
    public static Intent A00(String[] strArr) {
        C162457s7.A0J(strArr, 1);
        return A01(strArr);
    }

    public static AnonymousClass0KE A02(Context context, String[] strArr) {
        C162457s7.A0J(strArr, 1);
        int length = strArr.length;
        int i = 0;
        if (length == 0) {
            return new AnonymousClass0KE(C73813g7.A0A());
        }
        int i2 = 0;
        while (AnonymousClass0Y8.A05(context, strArr[i2]) == 0) {
            i2++;
            if (i2 >= length) {
                int A0I = AnonymousClass8UG.A0I(length);
                if (A0I < 16) {
                    A0I = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A0I);
                do {
                    AnonymousClass3Z6 A00 = AnonymousClass2A3.A00(strArr[i], Boolean.TRUE);
                    linkedHashMap.put(A00.A0D(), A00.A0E());
                    i++;
                } while (i < length);
                return new AnonymousClass0KE(linkedHashMap);
            }
        }
        return null;
    }

    public static final List A03(Iterable iterable, Iterable iterable2) {
        C162457s7.A0J(iterable, 0);
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList A0I = AnonymousClass002.A0I(Math.min(C73783g4.A0b(iterable, 10), C73783g4.A0b(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            A0I.add(new AnonymousClass3Z6(it.next(), it2.next()));
        }
        return A0I;
    }

    public static Map A04(Intent intent, int i) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (!(intArrayExtra == null || stringArrayExtra == null)) {
                ArrayList A0I = AnonymousClass002.A0I(r3);
                for (int A1T : intArrayExtra) {
                    A0I.add(Boolean.valueOf(AnonymousClass000.A1T(A1T)));
                }
                return C73813g7.A0B(A03(C73703fw.A03(stringArrayExtra), A0I));
            }
        }
        return C73813g7.A0A();
    }

    public static final Intent A01(String[] strArr) {
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C162457s7.A0D(putExtra);
        return putExtra;
    }

    public /* bridge */ /* synthetic */ Intent A05(Context context, Object obj) {
        return A00((String[]) obj);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0KE A06(Context context, Object obj) {
        return A02(context, (String[]) obj);
    }

    public /* bridge */ /* synthetic */ Object A07(Intent intent, int i) {
        return A04(intent, i);
    }
}
