package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.IOnDoneCallback;
import java.io.File;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.000  reason: invalid class name */
public final class AnonymousClass000 {
    public static Object A0K(Class cls, Object obj, String str) {
        return cls.getMethod(str, new Class[0]).invoke(obj, new Object[0]);
    }

    public static void A0s(RectF rectF, float f, float f2) {
        rectF.set(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
    }

    public static void A0u(IBinder iBinder, Parcel parcel) {
        iBinder.transact(2, parcel, (Parcel) null, 1);
    }

    public static void A0v(IBinder iBinder, Parcel parcel) {
        iBinder.transact(3, parcel, (Parcel) null, 1);
    }

    public static void A0w(IBinder iBinder, Parcel parcel, Parcel parcel2, int i) {
        iBinder.transact(i, parcel, parcel2, 0);
        parcel2.readException();
    }

    public static void A11(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[1] = obj;
        objArr[2] = obj2;
        objArr[3] = obj3;
        objArr[4] = obj4;
    }

    public static void A12(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        objArr[8] = obj4;
    }

    public static void A16(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static boolean A1S(int i) {
        return i != 0;
    }

    public static boolean A1T(int i) {
        return i == 0;
    }

    public static boolean A1U(int i, int i2) {
        return i == i2;
    }

    public static boolean A1W(Object obj) {
        return obj != null;
    }

    public static boolean A1X(Object obj) {
        return obj == null;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static boolean A1a(Method method, Object[] objArr, int i) {
        return i != 0 && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
    }

    public static Object[] A1b(Object obj) {
        return new Object[]{obj};
    }

    public static int A00(int i, long j) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A01(long j, int i, long j2) {
        if (i > 0) {
            return (int) ((j * 100) / j2);
        }
        return -1;
    }

    public static int A07(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static RuntimeException A0L() {
        return new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static String A0T(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0c(StringBuilder sb) {
        sb.append(')');
        return sb.toString();
    }

    public static String A0d(StringBuilder sb) {
        sb.append('}');
        return sb.toString();
    }

    public static String A0e(StringBuilder sb) {
        sb.append(")");
        return sb.toString();
    }

    public static String A0f(StringBuilder sb) {
        sb.append("]");
        return sb.toString();
    }

    public static String A0g(StringBuilder sb) {
        sb.append("}");
        return sb.toString();
    }

    public static StringBuilder A0i(AttributeSet attributeSet) {
        StringBuilder sb = new StringBuilder();
        sb.append(attributeSet.getPositionDescription());
        return sb;
    }

    public static StringBuilder A0j(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(obj);
        return sb;
    }

    public static StringBuilder A0k(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb;
    }

    public static StringBuilder A0l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder A0m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0n(XmlPullParser xmlPullParser) {
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        return sb;
    }

    public static void A13(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[12] = obj;
        objArr[13] = obj2;
        objArr[14] = obj3;
        objArr[15] = obj4;
    }

    public static void A14(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[16] = obj;
        objArr[17] = obj2;
        objArr[18] = obj3;
        objArr[19] = obj4;
    }

    public static void A15(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[20] = obj;
        objArr[21] = obj2;
        objArr[22] = obj3;
        objArr[23] = obj4;
    }

    public static int A02(View view) {
        return view.getPaddingLeft() + view.getPaddingRight();
    }

    public static int A03(View view) {
        return view.getPaddingTop() + view.getPaddingBottom();
    }

    public static int A04(View view, int i) {
        return View.combineMeasuredStates(i, view.getMeasuredState());
    }

    public static int A05(View view, int i) {
        return (i - view.getPaddingTop()) - view.getPaddingBottom();
    }

    public static int A06(View view, int i) {
        return (i - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public static int A08(Object obj, int i) {
        return (i + obj.hashCode()) * 31;
    }

    public static int A09(List list, int i) {
        return ((Number) list.get(i)).intValue();
    }

    public static Handler A0A() {
        return new Handler(Looper.getMainLooper());
    }

    public static DisplayMetrics A0B(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static InputMethodManager A0C(View view) {
        return (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    public static IOnDoneCallback A0D(Parcel parcel) {
        return IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder());
    }

    public static IllegalArgumentException A0E(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalArgumentException A0F(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalArgumentException A0G(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0H(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalStateException(sb.toString());
    }

    public static IllegalStateException A0I(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalStateException(sb.toString());
    }

    public static Object A0J(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static String A0M(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    public static String A0N(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.length());
        return sb.toString();
    }

    public static String A0O(Object obj) {
        return obj.getClass().getName();
    }

    public static String A0P(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static String A0Q(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public static String A0R(Object obj, StringBuilder sb) {
        sb.append(obj);
        return sb.toString();
    }

    public static String A0S(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    public static String A0U(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String A0V(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0W(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public static String A0X(String str, StringBuilder sb) {
        sb.append(str);
        return sb.toString();
    }

    public static String A0Y(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A0Z(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String A0a(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th.getMessage());
        return sb.toString();
    }

    public static String A0b(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        return sb.toString();
    }

    public static String A0h(StringBuilder sb, int i) {
        sb.append(i);
        return sb.toString();
    }

    public static ArrayList A0o(Cursor cursor) {
        return new ArrayList(cursor.getCount());
    }

    public static ArrayList A0p(List list) {
        return new ArrayList(list.size());
    }

    public static Iterator A0q(Map map) {
        return map.entrySet().iterator();
    }

    public static void A0r(Matrix matrix, Path path, List list, int i) {
        path.addPath(((C17340vN) list.get(i)).BAd(), matrix);
    }

    public static void A0t(Drawable drawable, View view) {
        if (drawable.isStateful()) {
            drawable.setState(view.getDrawableState());
        }
    }

    public static void A0x(View view, Rect rect) {
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static void A0y(AnonymousClass0T5 r2, AnonymousClass0Y2 r3, C13840np r4, Object obj) {
        if (AnonymousClass0Y2.A04(r2, obj.getClass(), r4.getClass())) {
            r3.A05(r2, r4);
        }
    }

    public static void A0z(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.getPath());
    }

    public static void A10(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.getAbsolutePath());
    }

    public static void A17(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append(str2);
    }

    public static void A18(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        Log.v(str2, sb.toString());
    }

    public static void A19(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        Log.d(str2, sb.toString());
    }

    public static void A1A(Object obj, StringBuilder sb) {
        sb.append(obj.getClass().getSimpleName());
    }

    public static void A1B(Object obj, StringBuilder sb) {
        sb.append(obj.toString());
    }

    public static void A1C(Object obj, AbstractMap abstractMap, boolean z) {
        abstractMap.put(obj, Boolean.valueOf(z));
    }

    public static void A1D(String str, String str2, StringBuilder sb) {
        sb.append(str);
        Log.e(str2, sb.toString());
    }

    public static void A1E(String str, String str2, StringBuilder sb) {
        sb.append(str);
        Log.v(str2, sb.toString());
    }

    public static void A1F(String str, String str2, StringBuilder sb) {
        sb.append(str);
        Log.w(str2, sb.toString());
    }

    public static void A1G(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(Integer.toHexString(i));
    }

    public static void A1H(String str, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(list.size());
    }

    public static void A1I(StringBuilder sb, String str) {
        sb.append(str);
        Log.v("FragmentManager", sb.toString());
    }

    public static void A1J(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void A1K(StringBuilder sb, String str, Object obj) {
        sb.append(str);
        sb.append(obj);
        Log.v("FragmentManager", sb.toString());
    }

    public static void A1L(Object[] objArr, int i) {
        objArr[0] = Integer.valueOf(i);
    }

    public static void A1M(Object[] objArr, int i) {
        objArr[1] = Integer.valueOf(i);
    }

    public static void A1N(Object[] objArr, int i) {
        objArr[2] = Integer.valueOf(i);
    }

    public static void A1O(Object[] objArr, int i) {
        objArr[3] = Integer.valueOf(i);
    }

    public static void A1P(Object[] objArr, int i, int i2) {
        objArr[i2] = Integer.valueOf(i);
    }

    public static void A1Q(Object[] objArr, int i, long j) {
        objArr[i] = Long.valueOf(j);
    }

    public static void A1R(Object[] objArr, boolean z) {
        objArr[1] = Boolean.valueOf(z);
    }

    public static boolean A1V(Parcel parcel, C06790Zf r3, String str) {
        parcel.writeInterfaceToken(str);
        if (r3 != null) {
            parcel.writeInt(1);
            r3.writeToParcel(parcel, 0);
            return false;
        }
        parcel.writeInt(0);
        return false;
    }

    public static boolean A1Z(Object obj, Method method, Object[] objArr) {
        return ((Boolean) method.invoke(obj, objArr)).booleanValue();
    }
}
