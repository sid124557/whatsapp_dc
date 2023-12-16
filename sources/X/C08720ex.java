package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* renamed from: X.0ex  reason: invalid class name and case insensitive filesystem */
public class C08720ex implements C16690to {
    public static Class A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public final View A00;

    public static void A00() {
        if (!A05) {
            try {
                A01 = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            A05 = true;
        }
    }

    public void setVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public C08720ex(View view) {
        this.A00 = view;
    }

    public void Bjt(View view, ViewGroup viewGroup) {
    }
}
