package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9We  reason: invalid class name and case insensitive filesystem */
public class C195139We {
    public static final Rect A00 = new Rect(-1000, -1000, 1000, 1000);

    public static AnonymousClass9PY A00(Camera.Parameters parameters, String str, String str2) {
        String str3 = str;
        String str4 = parameters.get(str);
        ArrayList A01 = A01(str2);
        SparseArray sparseArray = new SparseArray();
        ArrayList A0y = C18290x4.A0y(A01);
        Iterator it = A01.iterator();
        int i = -1;
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            try {
                String str5 = A0m;
                if (A0m.startsWith("ISO")) {
                    str5 = A0m.substring(3);
                }
                int parseInt = Integer.parseInt(str5);
                Integer valueOf = Integer.valueOf(parseInt);
                sparseArray.put(parseInt, A0m);
                A0y.add(valueOf);
                if (A0m.equals(str4)) {
                    i = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return new AnonymousClass9PY(sparseArray, str3, str4, A0y, i);
    }

    public static ArrayList A02(String str) {
        if (str == null || str.isEmpty() || str.charAt(0) != '(' || str.charAt(str.length() - 1) != ')') {
            Log.e("ParametersHelper", AnonymousClass000.A0V("Invalid area string=", str, AnonymousClass001.A0o()));
        } else if (!str.equals("(0,0,0,0,0)") && !str.equals("(0, 0, 0, 0, 0)")) {
            ArrayList A0s = AnonymousClass001.A0s();
            int i = 0;
            do {
                int indexOf = str.indexOf(41, i);
                String substring = str.substring(i, indexOf + 1);
                Camera.Area area = null;
                if (substring == null || substring.isEmpty() || substring.charAt(0) != '(' || substring.charAt(substring.length() - 1) != ')') {
                    Log.e("ParametersHelper", AnonymousClass000.A0T("Invalid area string=", substring));
                } else {
                    Rect rect = new Rect();
                    try {
                        int indexOf2 = substring.indexOf(44);
                        rect.left = C1899593h.A04(substring, 1, indexOf2);
                        int i2 = indexOf2 + 1;
                        int indexOf3 = substring.indexOf(44, i2);
                        rect.top = C1899593h.A04(substring, i2, indexOf3);
                        int i3 = indexOf3 + 1;
                        int indexOf4 = substring.indexOf(44, i3);
                        rect.right = C1899593h.A04(substring, i3, indexOf4);
                        int i4 = indexOf4 + 1;
                        int indexOf5 = substring.indexOf(44, i4);
                        rect.bottom = C1899593h.A04(substring, i4, indexOf5);
                        int i5 = indexOf5 + 1;
                        int indexOf6 = substring.indexOf(44, i5);
                        if (indexOf6 == -1) {
                            indexOf6 = substring.indexOf(41, i5);
                        }
                        area = new Camera.Area(rect, C1899593h.A04(substring, i5, indexOf6));
                    } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                        Log.e("ParametersHelper", AnonymousClass000.A0T("Invalid area string=", substring), e);
                    }
                }
                if (area != null) {
                    A0s.add(area);
                }
                i = str.indexOf(40, indexOf);
            } while (i != -1);
            if (!A0s.isEmpty()) {
                if (A0s.size() == 1) {
                    Camera.Area area2 = (Camera.Area) A0s.get(0);
                    Rect rect2 = area2.rect;
                    rect2.getClass();
                    if (rect2.left == 0 && rect2.top == 0 && rect2.right == 0 && rect2.bottom == 0 && area2.weight == 0) {
                        return null;
                    }
                    return A0s;
                }
                return A0s;
            }
        }
        return null;
    }

    public static List A03(Rect rect) {
        int i;
        Rect rect2 = A00;
        if (!rect.intersect(rect2) && !rect2.contains(rect)) {
            int i2 = rect.right;
            int i3 = rect2.left;
            int i4 = 0;
            if (i2 <= i3) {
                i = i3 - rect.left;
            } else {
                int i5 = rect.left;
                int i6 = rect2.right;
                i = i6 - i2;
                if (i5 < i6) {
                    i = 0;
                }
            }
            int i7 = rect.bottom;
            int i8 = rect2.top;
            if (i7 <= i8) {
                i4 = i8 - rect.top;
            } else {
                int i9 = rect.top;
                int i10 = rect2.bottom;
                if (i9 >= i10) {
                    i4 = i10 - i7;
                }
            }
            rect.offset(i, i4);
            rect.intersect(rect2);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new Camera.Area(rect, 1000));
        return A0s;
    }

    public static ArrayList A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return AnonymousClass001.A0s();
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(str);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator<String> it = simpleStringSplitter.iterator();
        while (it.hasNext()) {
            A0s.add(it.next());
        }
        return A0s;
    }
}
