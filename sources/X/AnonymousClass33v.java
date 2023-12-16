package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.33v  reason: invalid class name */
public final class AnonymousClass33v {
    public static final String A00(C56972sr r5, C64773Ex r6, AnonymousClass5ZU r7, C54292oU r8, C56892sj r9, C28011fL r10) {
        C162457s7.A0J(r8, 0);
        C56972sr r0 = r5;
        C64773Ex r1 = r6;
        C18260x0.A0d(r0, r6, r9, r10);
        return A01(r0, r1, r7, r8, r9, r10, 10);
    }

    public static final String A03(C54292oU r6, List list, int i) {
        String string;
        C162457s7.A0J(r6, 0);
        int size = list.size();
        if (size == i) {
            return A02(r6, list, 3);
        }
        Resources A00 = C54292oU.A00(r6);
        if (size > 0) {
            int i2 = i - 1;
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = list.get(0);
            AnonymousClass000.A1P(A0M, i2, 1);
            string = A00.getQuantityString(R.plurals.f9nameremoved, i2, A0M);
        } else {
            string = A00.getString(R.string.f11nameremoved);
        }
        C162457s7.A0H(string);
        return string;
    }

    public static final String A01(C56972sr r6, C64773Ex r7, AnonymousClass5ZU r8, C54292oU r9, C56892sj r10, C28011fL r11, int i) {
        HashSet A0K = AnonymousClass002.A0K();
        C172878Nf A01 = C620533h.A01(r10.A09, r11);
        boolean z = false;
        while (A01.hasNext()) {
            UserJid userJid = C18320x8.A0G(A01).A03;
            if (r6.A0a(userJid)) {
                z = true;
            } else {
                A0K.add(r7.A0A(userJid));
            }
        }
        if (!z || !A0K.isEmpty()) {
            return A02(r9, r8.A0Z(A0K, r8.A09(r11), false), i);
        }
        return C18290x4.A0l(r9.A00, R.string.f11nameremoved);
    }

    public static final String A02(C54292oU r8, List list, int i) {
        Resources A00;
        int i2;
        Object[] objArr;
        Object obj;
        String quantityString;
        if (list.isEmpty()) {
            quantityString = C54292oU.A00(r8).getString(R.string.f11nameremoved);
        } else if (list.size() == 1) {
            return AnonymousClass001.A0n(list, 0);
        } else {
            if (list.size() == 2) {
                A00 = C54292oU.A00(r8);
                i2 = R.string.f11nameremoved;
                objArr = new Object[2];
                objArr[0] = list.get(0);
                obj = list.get(1);
            } else if (list.size() == 3) {
                Resources A002 = C54292oU.A00(r8);
                Object[] objArr2 = new Object[3];
                C18290x4.A1T(list, objArr2);
                quantityString = C18320x8.A0b(A002, list.get(2), objArr2, 2, R.string.f11nameremoved);
            } else if (list.size() > i) {
                Resources A003 = C54292oU.A00(r8);
                int A04 = AnonymousClass002.A04(list, 1);
                Object[] objArr3 = new Object[2];
                objArr3[0] = list.get(0);
                AnonymousClass000.A1P(objArr3, AnonymousClass002.A04(list, 1), 1);
                quantityString = A003.getQuantityString(R.plurals.f9nameremoved, A04, objArr3);
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                int A042 = AnonymousClass002.A04(list, 2);
                for (int i3 = 0; i3 < A042; i3++) {
                    A0o.append(AnonymousClass001.A0n(list, i3));
                    AnonymousClass001.A1M(A0o);
                }
                A0o.append(AnonymousClass001.A0n(list, AnonymousClass002.A04(list, 2)));
                A00 = C54292oU.A00(r8);
                i2 = R.string.f11nameremoved;
                objArr = new Object[2];
                AnonymousClass0x7.A1E(A0o, objArr, 0);
                obj = list.get(AnonymousClass002.A04(list, 1));
            }
            quantityString = C18320x8.A0b(A00, obj, objArr, 1, i2);
        }
        C162457s7.A0H(quantityString);
        return quantityString;
    }
}
