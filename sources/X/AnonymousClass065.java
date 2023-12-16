package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.065  reason: invalid class name */
public class AnonymousClass065 extends AnonymousClass0WH {
    public static final Map A05;
    public static final Map A06;
    public static final Map A07;
    public static final Map A08;
    public int A00 = 1056964608;
    public final C153427bI A01;
    public final AnonymousClass84O A02;
    public final AnonymousClass84O A03;
    public final Map A04;

    public static Integer A00(C06220Ws r0) {
        return Integer.valueOf(((AccessibilityNodeInfo.AccessibilityAction) r0.A03).getId());
    }

    public boolean A09(View view, int i, Bundle bundle) {
        C835248t A002;
        String str;
        AnonymousClass0NU r0 = (AnonymousClass0NU) AnonymousClass001.A0i(this.A04, i);
        if (r0 == null || (A002 = r0.A00()) == null) {
            return super.A09(view, i, bundle);
        }
        AnonymousClass84O r2 = this.A03;
        C152057Xj r02 = new C152057Xj();
        r02.A05(r2, 0);
        Object A012 = C159377lj.A01(this.A01, r2, r02.A03(), A002);
        if ((A012 instanceof Number) || (A012 instanceof Boolean)) {
            return C159427lo.A02(A012);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A012 != null) {
            str = "Got a non-boolean result while evaluating action ";
        } else {
            str = "Got a null result while evaluating action ";
        }
        C159737mN.A01("bk.components.AndroidNativeAccessibilityExtension", AnonymousClass000.A0Y(str, A0o, i));
        return false;
    }

    public void A0D(View view, C05650Ui r25) {
        Number number;
        Number number2;
        C05650Ui r9 = r25;
        super.A0D(view, r9);
        AnonymousClass84O r2 = this.A02;
        boolean A0W = r2.A0W(41, false);
        boolean A0W2 = r2.A0W(49, false);
        boolean A0W3 = r2.A0W(51, false);
        boolean A0W4 = r2.A0W(36, false);
        String A0O = r2.A0O(50);
        String A0O2 = r2.A0O(45);
        String A0O3 = r2.A0O(46);
        String A0O4 = r2.A0O(58);
        String A0O5 = r2.A0O(57);
        AnonymousClass84O A0K = r2.A0K(52);
        AnonymousClass84O A0K2 = r2.A0K(53);
        AnonymousClass84O A0K3 = r2.A0K(54);
        if (A0K != null) {
            String A0O6 = A0K.A0O(40);
            float A0B = A0K.A0B(38, -1.0f);
            float A0B2 = A0K.A0B(36, -1.0f);
            float A0B3 = A0K.A0B(35, -1.0f);
            if (A0B >= 0.0f && A0B3 >= 0.0f && A0B2 >= 0.0f && (number2 = (Number) A07.get(A0O6)) != null) {
                r9.A01.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(number2.intValue(), A0B, A0B2, A0B3));
            }
        }
        if (A0K2 != null) {
            int A0E = A0K2.A0E(35, -1);
            int A0E2 = A0K2.A0E(38, -1);
            boolean A0W5 = A0K2.A0W(36, false);
            String A0P = A0K2.A0P(40, "none");
            if (A0E >= -1 && A0E2 >= -1 && (number = (Number) A06.get(A0P)) != null) {
                r9.A0F(new AnonymousClass0KO(AccessibilityNodeInfo.CollectionInfo.obtain(A0E2, A0E, A0W5, number.intValue())));
            }
        }
        if (A0K3 != null) {
            int A0E3 = A0K3.A0E(35, -1);
            int A0E4 = A0K3.A0E(38, -1);
            int A0E5 = A0K3.A0E(36, -1);
            int A0E6 = A0K3.A0E(40, -1);
            if (A0E3 >= 0 && A0E4 >= 0 && A0E5 >= 0 && A0E6 >= 0) {
                r9.A0G(new AnonymousClass0KP(AccessibilityNodeInfo.CollectionItemInfo.obtain(A0E4, A0E6, A0E3, A0E5, A0W, A0W2)));
            }
        }
        Iterator A0v = AnonymousClass001.A0v(this.A04);
        while (A0v.hasNext()) {
            AnonymousClass0NU r11 = (AnonymousClass0NU) A0v.next();
            int i = r11.A00;
            Map map = A05;
            if (map.containsKey("click") && i == AnonymousClass001.A0K(map.get("click"))) {
                r9.A0H(true);
            } else if (map.containsKey("long_click") && i == AnonymousClass001.A0K(map.get("long_click"))) {
                r9.A01.setLongClickable(true);
            }
            String str = r11.A02;
            if (str != null) {
                r9.A07(new C06220Ws(i, (CharSequence) str));
            } else {
                r9.A01.addAction(i);
            }
        }
        if (A0W3) {
            AccessibilityNodeInfo accessibilityNodeInfo = r9.A01;
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(A0W4);
        }
        if (A0O != null) {
            r9.A0E(A0O);
        }
        if (A0O2 != null && !A0O2.equals("none")) {
            Map map2 = A08;
            if (map2.containsKey(A0O2)) {
                r9.A01.setClassName((CharSequence) map2.get(A0O2));
            }
        }
        if (A0O3 != null) {
            r9.A0C(A0O3);
        }
        if (A0O4 != null) {
            r9.A0D(A0O4);
        }
        if (A0O5 != null && !A0O5.isEmpty()) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = r9.A01;
            accessibilityNodeInfo2.setContentInvalid(true);
            accessibilityNodeInfo2.setError(A0O5);
        }
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("button", "android.widget.Button");
        A0t.put("checkbox", "android.widget.CompoundButton");
        A0t.put("checked_text_view", "android.widget.CheckedTextView");
        A0t.put("drop_down_list", "android.widget.Spinner");
        A0t.put("edit_text", "android.widget.EditText");
        A0t.put("grid", "android.widget.GridView");
        A0t.put("image", "android.widget.ImageView");
        A0t.put("list", "android.widget.AbsListView");
        A0t.put("pager", "androidx.viewpager.widget.ViewPager");
        A0t.put("radio_button", "android.widget.RadioButton");
        A0t.put("seek_control", "android.widget.SeekBar");
        A0t.put("switch", "android.widget.Switch");
        A0t.put("tab_bar", "android.widget.TabWidget");
        A0t.put("toggle_button", "android.widget.ToggleButton");
        A0t.put("view_group", "android.view.ViewGroup");
        A0t.put("web_view", "android.webkit.WebView");
        A0t.put("progress_bar", "android.widget.ProgressBar");
        A0t.put("action_bar_tab", "android.app.ActionBar$Tab");
        A0t.put("drawer_layout", "androidx.drawerlayout.widget.DrawerLayout");
        A0t.put("sliding_drawer", "android.widget.SlidingDrawer");
        A0t.put("icon_menu", "com.android.internal.view.menu.IconMenuView");
        A0t.put("toast", "android.widget.Toast$TN");
        A0t.put("alert_dialog", "android.app.AlertDialog");
        A0t.put("date_picker_dialog", "android.app.DatePickerDialog");
        A0t.put("time_picker_dialog", "android.app.TimePickerDialog");
        A0t.put("date_picker", "android.widget.DatePicker");
        A0t.put("time_picker", "android.widget.TimePicker");
        A0t.put("number_picker", "android.widget.NumberPicker");
        A0t.put("scroll_view", "android.widget.ScrollView");
        A0t.put("horizontal_scroll_view", "android.widget.HorizontalScrollView");
        A0t.put("keyboard_key", "android.inputmethodservice.Keyboard$Key");
        A0t.put("none", "");
        A08 = Collections.unmodifiableMap(A0t);
        HashMap A0t2 = AnonymousClass001.A0t();
        C06220Ws r0 = C06220Ws.A08;
        AnonymousClass71S.A00(r0);
        A0t2.put("click", A00(r0));
        C06220Ws r02 = C06220Ws.A0L;
        AnonymousClass71S.A00(r02);
        A0t2.put("long_click", A00(r02));
        C06220Ws r03 = C06220Ws.A0Z;
        AnonymousClass71S.A00(r03);
        A0t2.put("scroll_forward", A00(r03));
        C06220Ws r04 = C06220Ws.A0X;
        AnonymousClass71S.A00(r04);
        A0t2.put("scroll_backward", A00(r04));
        C06220Ws r05 = C06220Ws.A0H;
        AnonymousClass71S.A00(r05);
        A0t2.put("expand", A00(r05));
        C06220Ws r06 = C06220Ws.A09;
        AnonymousClass71S.A00(r06);
        A0t2.put("collapse", A00(r06));
        C06220Ws r07 = C06220Ws.A0D;
        AnonymousClass71S.A00(r07);
        A0t2.put("dismiss", A00(r07));
        C06220Ws r08 = C06220Ws.A0d;
        AnonymousClass71S.A00(r08);
        A0t2.put("scroll_up", A00(r08));
        C06220Ws r09 = C06220Ws.A0a;
        AnonymousClass71S.A00(r09);
        A0t2.put("scroll_left", A00(r09));
        C06220Ws r010 = C06220Ws.A0Y;
        AnonymousClass71S.A00(r010);
        A0t2.put("scroll_down", A00(r010));
        C06220Ws r011 = C06220Ws.A0b;
        AnonymousClass71S.A00(r011);
        A0t2.put("scroll_right", A00(r011));
        A0t2.put("custom", -1);
        A05 = Collections.unmodifiableMap(A0t2);
        HashMap A0t3 = AnonymousClass001.A0t();
        A0t3.put("percent", 2);
        Integer A0f = AnonymousClass001.A0f();
        A0t3.put("float", A0f);
        A0t3.put("int", 0);
        A07 = Collections.unmodifiableMap(A0t3);
        HashMap A0t4 = AnonymousClass001.A0t();
        A0t4.put("none", 0);
        A0t4.put("single", A0f);
        A0t4.put("multiple", 2);
        A06 = Collections.unmodifiableMap(A0t4);
    }

    public AnonymousClass065(C153427bI r2, AnonymousClass84O r3, AnonymousClass84O r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = A0E();
    }

    public final Map A0E() {
        HashMap A0t = AnonymousClass001.A0t();
        List<AnonymousClass84O> A0R = this.A02.A0R(55);
        if (A0R != null && !A0R.isEmpty()) {
            for (AnonymousClass84O r2 : A0R) {
                String A0O = r2.A0O(35);
                String A0O2 = r2.A0O(36);
                C835248t A0L = r2.A0L(38);
                if (A0O != null) {
                    Map map = A05;
                    if (map.containsKey(A0O)) {
                        int A0K = AnonymousClass001.A0K(map.get(A0O));
                        if (map.containsKey("custom") && A0K == AnonymousClass001.A0K(map.get("custom"))) {
                            A0K = this.A00;
                            this.A00 = A0K + 1;
                        }
                        A0t.put(Integer.valueOf(A0K), new AnonymousClass0NU(A0L, A0O2, A0K));
                    }
                }
            }
        }
        return A0t;
    }
}
