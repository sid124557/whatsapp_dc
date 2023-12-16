package X;

import android.util.SparseArray;

/* renamed from: X.7mR  reason: invalid class name and case insensitive filesystem */
public abstract class C159777mR {
    public static final C06290Wz A00;

    static {
        C06290Wz r1 = new C06290Wz(1);
        A00 = r1;
        SparseArray sparseArray = new SparseArray(2);
        sparseArray.append(1, new String[]{"januarja", "februarja", "marca", "aprila", "maja", "junija", "julija", "avgusta", "septembra", "oktobra", "novembra", "decembra"});
        sparseArray.append(2, new String[]{"januarjem", "februarjem", "marcem", "aprilom", "majem", "junijem", "julijem", "avgustom", "septembrom", "oktobrom", "novembrom", "decembrom"});
        r1.put("sl", sparseArray);
    }

    public static String[] A00(C620733j r3) {
        return new String[]{r3.A0A(261), r3.A0A(260), r3.A0A(264), r3.A0A(257), r3.A0A(265), r3.A0A(263), r3.A0A(262), r3.A0A(258), r3.A0A(268), r3.A0A(267), r3.A0A(266), r3.A0A(259)};
    }

    public static String[] A01(C620733j r3, int i) {
        String[] strArr;
        SparseArray sparseArray = (SparseArray) A00.get(r3.A07());
        if (sparseArray != null && (strArr = (String[]) sparseArray.get(i)) != null) {
            return strArr;
        }
        return new String[]{r3.A0A(249), r3.A0A(248), r3.A0A(252), r3.A0A(245), r3.A0A(253), r3.A0A(251), r3.A0A(250), r3.A0A(246), r3.A0A(256), r3.A0A(255), r3.A0A(254), r3.A0A(247)};
    }
}
