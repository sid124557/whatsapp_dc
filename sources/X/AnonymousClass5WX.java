package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.5WX  reason: invalid class name */
public class AnonymousClass5WX {
    public static final List A02;
    public final AnonymousClass4FV A00;
    public final AnonymousClass5WV A01;

    static {
        Integer[] numArr = new Integer[12];
        C86624Kv.A1V(numArr, 0);
        C86624Kv.A1V(numArr, 1);
        C86624Kv.A1V(numArr, 2);
        C86624Kv.A1V(numArr, 3);
        C86624Kv.A1V(numArr, 4);
        C86624Kv.A1V(numArr, 5);
        C86624Kv.A1V(numArr, 6);
        C86624Kv.A1V(numArr, 7);
        C86624Kv.A1V(numArr, 8);
        C86624Kv.A1V(numArr, 9);
        C86624Kv.A1V(numArr, 10);
        C86624Kv.A1V(numArr, 11);
        A02 = Arrays.asList(numArr);
    }

    public void A00(int i, int i2) {
        AnonymousClass5WV r3 = this.A01;
        synchronized (r3) {
            String A002 = AnonymousClass5WV.A00(i);
            SharedPreferences sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A01.A03("privacy_highlight");
                r3.A00 = sharedPreferences;
            }
            String str = "0,0,0";
            String string = sharedPreferences.getString(A002, str);
            if (string != null) {
                str = string;
            }
            String[] split = str.split(",");
            if (i2 < split.length) {
                split[i2] = String.valueOf(Integer.parseInt(split[i2]) + 1);
                String join = TextUtils.join(",", split);
                SharedPreferences sharedPreferences2 = r3.A00;
                if (sharedPreferences2 == null) {
                    sharedPreferences2 = r3.A01.A03("privacy_highlight");
                    r3.A00 = sharedPreferences2;
                }
                C18270x1.A0j(sharedPreferences2.edit(), A002, join);
            } else {
                throw AnonymousClass001.A0e("position exceeds event array length");
            }
        }
    }

    public AnonymousClass5WX(AnonymousClass4FV r1, AnonymousClass5WV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
