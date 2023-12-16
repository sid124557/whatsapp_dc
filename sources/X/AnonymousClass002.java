package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.002  reason: invalid class name */
public final class AnonymousClass002 {
    public static float A00(float f, float f2) {
        return Math.abs(f - f2);
    }

    public static Object[] A0L() {
        return new Object[1];
    }

    public static Object[] A0M() {
        return new Object[2];
    }

    public static float A01(float[] fArr, float f, float f2, int i) {
        return f2 + (fArr[i] * f);
    }

    public static Matrix A05() {
        return new Matrix();
    }

    public static Path A06() {
        return new Path();
    }

    public static RectF A07() {
        return new RectF();
    }

    public static Bundle A08() {
        return new Bundle();
    }

    public static File A0A(File file, String str) {
        return new File(file, str);
    }

    public static File A0B(String str) {
        return new File(str);
    }

    public static IOException A0C(String str) {
        return new IOException(str);
    }

    public static Object A0D() {
        return new Object();
    }

    public static RuntimeException A0E(String str) {
        return new RuntimeException(str);
    }

    public static String A0F(Context context, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return context.getString(i2, objArr);
    }

    public static UnsupportedOperationException A0G(String str) {
        return new UnsupportedOperationException(str);
    }

    public static Method A0H(Class cls, Object obj, String str, Class[] clsArr, int i) {
        clsArr[i] = obj;
        return cls.getDeclaredMethod(str, clsArr);
    }

    public static ArrayList A0I(int i) {
        return new ArrayList(i);
    }

    public static ArrayList A0J(Collection collection) {
        return new ArrayList(collection);
    }

    public static HashSet A0K() {
        return new HashSet();
    }

    public static int A02(Object obj, int i) {
        return i + obj.hashCode();
    }

    public static int A03(List list) {
        return list.size() - 1;
    }

    public static int A04(List list, int i) {
        return list.size() - i;
    }

    public static TextView A09(View view, int i) {
        return (TextView) view.findViewById(i);
    }
}
