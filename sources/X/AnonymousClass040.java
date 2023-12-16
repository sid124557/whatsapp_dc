package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.040  reason: invalid class name */
public class AnonymousClass040 extends C06280Wy implements C16460tR, LayoutInflater.Factory2 {
    public static final C06290Wz A0m = new C06290Wz();
    public static final boolean A0n = (!"robolectric".equals(Build.FINGERPRINT));
    public static final int[] A0o = {16842836};
    public int A00;
    public int A01 = -100;
    public int A02;
    public Rect A03;
    public Rect A04;
    public MenuInflater A05;
    public View A06;
    public ViewGroup A07;
    public Window A08;
    public PopupWindow A09;
    public TextView A0A;
    public AnonymousClass0R8 A0B;
    public AnonymousClass0b3 A0C;
    public AnonymousClass04F A0D;
    public AnonymousClass0QQ A0E;
    public AnonymousClass0QQ A0F;
    public C04040Mo A0G;
    public C07510b4 A0H;
    public AnonymousClass0Y6 A0I;
    public AnonymousClass0R2 A0J;
    public ActionBarContextView A0K;
    public C16930uG A0L;
    public C04830Qv A0M = null;
    public CharSequence A0N;
    public Runnable A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public C04040Mo[] A0h;
    public final Context A0i;
    public final C16440tP A0j;
    public final Object A0k;
    public final Runnable A0l = new C10660iJ(this);

    public static final Configuration A00(Context context, Configuration configuration, int i) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = AnonymousClass001.A0M(context.getApplicationContext()).uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    public Context A04(Context context) {
        this.A0R = true;
        int i = this.A01;
        if (i == -100) {
            i = C06280Wy.A00;
        }
        int A0K2 = A0K(context, i);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(A00(context, (Configuration) null, A0K2));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C000500m) {
            try {
                ((C000500m) context).A01(A00(context, (Configuration) null, A0K2));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!A0n) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration A0M2 = AnonymousClass001.A0M(context.createConfigurationContext(configuration2));
        Configuration A0M3 = AnonymousClass001.A0M(context);
        A0M2.uiMode = A0M3.uiMode;
        if (!A0M2.equals(A0M3)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (A0M2.diff(A0M3) != 0) {
                float f = A0M2.fontScale;
                float f2 = A0M3.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i2 = A0M2.mcc;
                int i3 = A0M3.mcc;
                if (i2 != i3) {
                    configuration.mcc = i3;
                }
                int i4 = A0M2.mnc;
                int i5 = A0M3.mnc;
                if (i4 != i5) {
                    configuration.mnc = i5;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 24) {
                    C02500Gm.A00(A0M2, A0M3, configuration);
                } else if (!C04880Ra.A01(A0M2.locale, A0M3.locale)) {
                    configuration.locale = A0M3.locale;
                }
                int i7 = A0M2.touchscreen;
                int i8 = A0M3.touchscreen;
                if (i7 != i8) {
                    configuration.touchscreen = i8;
                }
                int i9 = A0M2.keyboard;
                int i10 = A0M3.keyboard;
                if (i9 != i10) {
                    configuration.keyboard = i10;
                }
                int i11 = A0M2.keyboardHidden;
                int i12 = A0M3.keyboardHidden;
                if (i11 != i12) {
                    configuration.keyboardHidden = i12;
                }
                int i13 = A0M2.navigation;
                int i14 = A0M3.navigation;
                if (i13 != i14) {
                    configuration.navigation = i14;
                }
                int i15 = A0M2.navigationHidden;
                int i16 = A0M3.navigationHidden;
                if (i15 != i16) {
                    configuration.navigationHidden = i16;
                }
                int i17 = A0M2.orientation;
                int i18 = A0M3.orientation;
                if (i17 != i18) {
                    configuration.orientation = i18;
                }
                int i19 = A0M2.screenLayout & 15;
                int i20 = A0M3.screenLayout & 15;
                if (i19 != i20) {
                    configuration.screenLayout |= i20;
                }
                int i21 = A0M2.screenLayout & 192;
                int i22 = A0M3.screenLayout & 192;
                if (i21 != i22) {
                    configuration.screenLayout |= i22;
                }
                int i23 = A0M2.screenLayout & 48;
                int i24 = A0M3.screenLayout & 48;
                if (i23 != i24) {
                    configuration.screenLayout |= i24;
                }
                int i25 = A0M2.screenLayout & 768;
                int i26 = A0M3.screenLayout & 768;
                if (i25 != i26) {
                    configuration.screenLayout |= i26;
                }
                if (i6 >= 26) {
                    C02510Gn.A00(A0M2, A0M3, configuration);
                }
                int i27 = A0M2.uiMode & 15;
                int i28 = A0M3.uiMode & 15;
                if (i27 != i28) {
                    configuration.uiMode |= i28;
                }
                int i29 = A0M2.uiMode & 48;
                int i30 = A0M3.uiMode & 48;
                if (i29 != i30) {
                    configuration.uiMode |= i30;
                }
                int i31 = A0M2.screenWidthDp;
                int i32 = A0M3.screenWidthDp;
                if (i31 != i32) {
                    configuration.screenWidthDp = i32;
                }
                int i33 = A0M2.screenHeightDp;
                int i34 = A0M3.screenHeightDp;
                if (i33 != i34) {
                    configuration.screenHeightDp = i34;
                }
                int i35 = A0M2.smallestScreenWidthDp;
                int i36 = A0M3.smallestScreenWidthDp;
                if (i35 != i36) {
                    configuration.smallestScreenWidthDp = i36;
                }
                int i37 = A0M2.densityDpi;
                int i38 = A0M3.densityDpi;
                if (i37 != i38) {
                    configuration.densityDpi = i38;
                }
            }
        }
        Configuration A002 = A00(context, configuration, A0K2);
        C000500m r3 = new C000500m(context, (int) R.style.f12nameremoved);
        r3.A01(A002);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = r3.getTheme();
                int i39 = Build.VERSION.SDK_INT;
                if (i39 >= 29) {
                    C02690Hf.A00(theme);
                } else if (i39 >= 23) {
                    C05170Sg.A00(theme);
                    return r3;
                }
            }
        } catch (NullPointerException unused3) {
        }
        return r3;
    }

    public void A0A() {
        this.A0e = false;
        A0P();
        AnonymousClass0R8 r0 = this.A0B;
        if (r0 != null) {
            r0.A0R(false);
        }
    }

    public void A0D(Bundle bundle) {
        this.A0R = true;
        A0W(false);
        A0O();
        Object obj = this.A0k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                if (AnonymousClass0RG.A01(activity.getComponentName(), activity) != null) {
                    AnonymousClass0R8 r0 = this.A0B;
                    if (r0 == null) {
                        this.A0U = true;
                    } else {
                        r0.A0M(true);
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
            }
            synchronized (C06280Wy.A02) {
                C06280Wy.A03(this);
                C06280Wy.A01.add(new WeakReference(this));
            }
        }
        this.A0T = true;
    }

    public void A0R(int i) {
        C04040Mo A0M2 = A0M(i);
        if (A0M2.A0A != null) {
            Bundle A082 = AnonymousClass002.A08();
            A0M2.A0A.A0B(A082);
            if (A082.size() > 0) {
                A0M2.A05 = A082;
            }
            C07890cz r0 = A0M2.A0A;
            r0.A08();
            r0.clear();
        }
        A0M2.A0F = true;
        A0M2.A0E = true;
        if ((i == 108 || i == 0) && this.A0L != null) {
            C04040Mo A0M3 = A0M(0);
            A0M3.A0D = false;
            A0Y((KeyEvent) null, A0M3);
        }
    }

    public static ActionMenuView A01(AnonymousClass040 r0) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) r0.A0L;
        actionBarOverlayLayout.A01();
        return ((C07580bG) actionBarOverlayLayout.A0A).A09.A0O;
    }

    public View A05(View view, String str, Context context, AttributeSet attributeSet) {
        AnonymousClass0Y6 r0 = this.A0I;
        if (r0 == null) {
            String string = this.A0i.obtainStyledAttributes(AnonymousClass0KC.A09).getString(116);
            if (string == null) {
                r0 = new AnonymousClass0Y6();
                this.A0I = r0;
            } else {
                try {
                    r0 = (AnonymousClass0Y6) AnonymousClass001.A0h(Class.forName(string));
                    this.A0I = r0;
                } catch (Throwable th) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Failed to instantiate custom view inflater ");
                    A0o2.append(string);
                    Log.i("AppCompatDelegate", AnonymousClass000.A0X(". Falling back to default.", A0o2), th);
                    r0 = new AnonymousClass0Y6();
                    this.A0I = r0;
                }
            }
        }
        return r0.createView(view, str, context, attributeSet, false, false, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f9, code lost:
        if (r1 == false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0R2 A06(X.C16910uE r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x017b
            X.0R2 r0 = r10.A0J
            if (r0 == 0) goto L_0x0009
            r0.A05()
        L_0x0009:
            X.0ax r7 = new X.0ax
            r7.<init>(r10, r11)
            r10.A0P()
            X.0R8 r0 = r10.A0B
            if (r0 == 0) goto L_0x0024
            X.0R2 r1 = r0.A04(r7)
            r10.A0J = r1
            if (r1 == 0) goto L_0x0024
            X.0tP r0 = r10.A0j
            if (r0 == 0) goto L_0x0024
            r0.Bdi(r1)
        L_0x0024:
            X.0R2 r0 = r10.A0J
            if (r0 != 0) goto L_0x0135
            X.0Qv r0 = r10.A0M
            if (r0 == 0) goto L_0x002f
            r0.A01()
        L_0x002f:
            X.0R2 r0 = r10.A0J
            if (r0 == 0) goto L_0x0036
            r0.A05()
        L_0x0036:
            X.0tP r2 = r10.A0j
            r6 = 0
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0K
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L_0x00bb
            boolean r0 = r10.A0a
            if (r0 == 0) goto L_0x014f
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.Context r9 = r10.A0i
            android.content.res.Resources$Theme r3 = r9.getTheme()
            r0 = 2130968597(0x7f040015, float:1.7545852E38)
            r3.resolveAttribute(r0, r8, r4)
            int r0 = r8.resourceId
            if (r0 == 0) goto L_0x014c
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.Resources$Theme r1 = r0.newTheme()
            r1.setTo(r3)
            int r0 = r8.resourceId
            r1.applyStyle(r0, r4)
            X.00m r3 = new X.00m
            r3.<init>((android.content.Context) r9, (int) r5)
            android.content.res.Resources$Theme r0 = r3.getTheme()
            r0.setTo(r1)
        L_0x0074:
            androidx.appcompat.widget.ActionBarContextView r0 = new androidx.appcompat.widget.ActionBarContextView
            r0.<init>(r3, r6)
            r10.A0K = r0
            r0 = 2130968612(0x7f040024, float:1.7545883E38)
            android.widget.PopupWindow r1 = new android.widget.PopupWindow
            r1.<init>(r3, r6, r0)
            r10.A09 = r1
            r0 = 2
            X.C05230Sn.A00(r1, r0)
            android.widget.PopupWindow r1 = r10.A09
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0K
            r1.setContentView(r0)
            android.widget.PopupWindow r1 = r10.A09
            r0 = -1
            r1.setWidth(r0)
            android.content.res.Resources$Theme r1 = r3.getTheme()
            r0 = 2130968591(0x7f04000f, float:1.754584E38)
            r1.resolveAttribute(r0, r8, r4)
            int r1 = r8.data
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r3)
            int r1 = android.util.TypedValue.complexToDimensionPixelSize(r1, r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0K
            r0.A01 = r1
            android.widget.PopupWindow r1 = r10.A09
            r0 = -2
            r1.setHeight(r0)
            X.0iK r0 = new X.0iK
            r0.<init>(r10)
            r10.A0O = r0
        L_0x00bb:
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0K
            if (r0 == 0) goto L_0x0128
            X.0Qv r0 = r10.A0M
            if (r0 == 0) goto L_0x00c6
            r0.A01()
        L_0x00c6:
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0K
            r0.A03()
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0K
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0K
            X.04D r3 = new X.04D
            r3.<init>(r1, r7, r0)
            X.0cz r1 = r3.A02
            X.0uE r0 = r7.A00
            boolean r0 = r0.BQL(r1, r3)
            if (r0 == 0) goto L_0x0149
            r3.A06()
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0K
            r0.A05(r3)
            r10.A0J = r3
            boolean r0 = r10.A0f
            if (r0 == 0) goto L_0x00fb
            android.view.ViewGroup r0 = r10.A07
            if (r0 == 0) goto L_0x00fb
            boolean r1 = X.C06360Xi.A05(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00fc
        L_0x00fb:
            r0 = 0
        L_0x00fc:
            r3 = 1065353216(0x3f800000, float:1.0)
            androidx.appcompat.widget.ActionBarContextView r1 = r10.A0K
            if (r0 == 0) goto L_0x0136
            r0 = 0
            r1.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0K
            X.0Qv r1 = X.C06560Yg.A05(r0)
            r1.A03(r3)
            r10.A0M = r1
            X.0vo r0 = new X.0vo
            r0.<init>(r10, r4)
            r1.A0A(r0)
        L_0x0119:
            android.widget.PopupWindow r0 = r10.A09
            if (r0 == 0) goto L_0x0128
            android.view.Window r0 = r10.A08
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r10.A0O
            r1.post(r0)
        L_0x0128:
            X.0R2 r0 = r10.A0J
            if (r0 == 0) goto L_0x0131
            if (r2 == 0) goto L_0x0131
            r2.Bdi(r0)
        L_0x0131:
            X.0R2 r0 = r10.A0J
            r10.A0J = r0
        L_0x0135:
            return r0
        L_0x0136:
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0K
            r0.setVisibility(r5)
            androidx.appcompat.widget.ActionBarContextView r1 = r10.A0K
            r0 = 32
            r1.sendAccessibilityEvent(r0)
            X.AnonymousClass001.A1A(r10)
            goto L_0x0119
        L_0x0149:
            r10.A0J = r6
            goto L_0x0128
        L_0x014c:
            r3 = r9
            goto L_0x0074
        L_0x014f:
            android.view.ViewGroup r1 = r10.A07
            r0 = 2131427505(0x7f0b00b1, float:1.8476628E38)
            android.view.View r1 = r1.findViewById(r0)
            androidx.appcompat.widget.ViewStubCompat r1 = (androidx.appcompat.widget.ViewStubCompat) r1
            if (r1 == 0) goto L_0x00bb
            r10.A0P()
            X.0R8 r0 = r10.A0B
            if (r0 == 0) goto L_0x0169
            android.content.Context r0 = r0.A02()
            if (r0 != 0) goto L_0x016b
        L_0x0169:
            android.content.Context r0 = r10.A0i
        L_0x016b:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.A02 = r0
            android.view.View r0 = r1.A00()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r10.A0K = r0
            goto L_0x00bb
        L_0x017b:
            java.lang.String r0 = "ActionMode callback can not be null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass040.A06(X.0uE):X.0R2");
    }

    public void A07() {
        LayoutInflater from = LayoutInflater.from(this.A0i);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof AnonymousClass040)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void A09() {
        Object obj = this.A0k;
        boolean z = obj instanceof Activity;
        if (z) {
            synchronized (C06280Wy.A02) {
                C06280Wy.A03(this);
            }
        }
        if (this.A0Y) {
            this.A08.getDecorView().removeCallbacks(this.A0l);
        }
        this.A0e = false;
        this.A0Z = true;
        int i = this.A01;
        if (i == -100 || !z || !((Activity) obj).isChangingConfigurations()) {
            A0m.remove(AnonymousClass000.A0O(obj));
        } else {
            A0m.put(AnonymousClass000.A0O(obj), Integer.valueOf(i));
        }
        AnonymousClass0R8 r0 = this.A0B;
        if (r0 != null) {
            r0.A05();
        }
        AnonymousClass0QQ r02 = this.A0F;
        if (r02 != null) {
            r02.A02();
        }
        AnonymousClass0QQ r03 = this.A0E;
        if (r03 != null) {
            r03.A02();
        }
    }

    public void A0C(Configuration configuration) {
        if (this.A0X && this.A0f) {
            A0P();
            AnonymousClass0R8 r0 = this.A0B;
            if (r0 != null) {
                r0.A0C(configuration);
            }
        }
        AnonymousClass0XJ A012 = AnonymousClass0XJ.A01();
        Context context = this.A0i;
        synchronized (A012) {
            AnonymousClass0XW r1 = A012.A00;
            synchronized (r1) {
                C10550i7 r02 = (C10550i7) r1.A06.get(context);
                if (r02 != null) {
                    r02.A06();
                }
            }
        }
        A0W(false);
    }

    public void A0H(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        Object obj = this.A0k;
        if (obj instanceof Activity) {
            A0P();
            AnonymousClass0R8 r1 = this.A0B;
            if (!(r1 instanceof AnonymousClass03z)) {
                this.A05 = null;
                if (r1 != null) {
                    r1.A05();
                }
                if (toolbar != null) {
                    AnonymousClass03y r0 = new AnonymousClass03y(this.A0D, toolbar, ((Activity) obj).getTitle());
                    this.A0B = r0;
                    window = this.A08;
                    callback = r0.A00;
                } else {
                    this.A0B = null;
                    window = this.A08;
                    callback = this.A0D;
                }
                window.setCallback(callback);
                A08();
                return;
            }
            throw AnonymousClass001.A0e("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final void A0I(CharSequence charSequence) {
        this.A0N = charSequence;
        C16930uG r0 = this.A0L;
        if (r0 != null) {
            r0.setWindowTitle(charSequence);
            return;
        }
        AnonymousClass0R8 r02 = this.A0B;
        if (r02 != null) {
            r02.A0K(charSequence);
            return;
        }
        TextView textView = this.A0A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean A0J(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = C627136h.A03;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.A0g && i == 108) {
            return false;
        }
        if (this.A0X && i == 1) {
            this.A0X = false;
        } else if (i != 1) {
            if (i == 2) {
                A0Q();
                this.A0W = true;
                return true;
            } else if (i == 5) {
                A0Q();
                this.A0V = true;
                return true;
            } else if (i == 10) {
                A0Q();
                this.A0d = true;
                return true;
            } else if (i == 108) {
                A0Q();
                this.A0X = true;
                return true;
            } else if (i != 109) {
                return this.A08.requestFeature(i);
            } else {
                A0Q();
                this.A0c = true;
                return true;
            }
        }
        A0Q();
        this.A0g = true;
        return true;
    }

    public int A0K(Context context, int i) {
        AnonymousClass0QQ A0L2;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (!(i == 1 || i == 2)) {
                        if (i == 3) {
                            A0L2 = this.A0E;
                            if (A0L2 == null) {
                                A0L2 = new AnonymousClass041(context, this);
                                this.A0E = A0L2;
                            }
                        } else {
                            throw AnonymousClass001.A0e("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    A0L2 = A0L(context);
                }
                return A0L2.A00();
            }
            return i;
        }
        return -1;
    }

    public final AnonymousClass0QQ A0L(Context context) {
        AnonymousClass0QQ r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        C03890Ly r2 = C03890Ly.A03;
        if (r2 == null) {
            Context applicationContext = context.getApplicationContext();
            r2 = new C03890Ly(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            C03890Ly.A03 = r2;
        }
        AnonymousClass042 r02 = new AnonymousClass042(this, r2);
        this.A0F = r02;
        return r02;
    }

    public C04040Mo A0M(int i) {
        C04040Mo[] r3 = this.A0h;
        if (r3 == null || r3.length <= i) {
            C04040Mo[] r2 = new C04040Mo[(i + 1)];
            if (r3 != null) {
                System.arraycopy(r3, 0, r2, 0, r3.length);
            }
            this.A0h = r2;
            r3 = r2;
        }
        C04040Mo r0 = r3[i];
        if (r0 != null) {
            return r0;
        }
        C04040Mo r02 = new C04040Mo(i);
        r3[i] = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N() {
        /*
            r11 = this;
            boolean r0 = r11.A0f
            if (r0 != 0) goto L_0x028d
            android.content.Context r8 = r11.A0i
            int[] r7 = X.AnonymousClass0KC.A09
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r7)
            r1 = 117(0x75, float:1.64E-43)
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x019e
            r0 = 126(0x7e, float:1.77E-43)
            r2 = 0
            boolean r0 = r3.getBoolean(r0, r2)
            r4 = 1
            if (r0 == 0) goto L_0x0108
            r11.A0J(r4)
        L_0x0021:
            r0 = 118(0x76, float:1.65E-43)
            boolean r1 = r3.getBoolean(r0, r2)
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == 0) goto L_0x002e
            r11.A0J(r0)
        L_0x002e:
            r0 = 119(0x77, float:1.67E-43)
            boolean r0 = r3.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x003b
            r0 = 10
            r11.A0J(r0)
        L_0x003b:
            boolean r0 = r3.getBoolean(r2, r2)
            r11.A0a = r0
            r3.recycle()
            r11.A0O()
            android.view.Window r0 = r11.A08
            r0.getDecorView()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r8)
            boolean r0 = r11.A0g
            r6 = 0
            if (r0 != 0) goto L_0x00f6
            boolean r0 = r11.A0a
            if (r0 == 0) goto L_0x0083
            r0 = 2131623948(0x7f0e000c, float:1.8875062E38)
            android.view.View r5 = r3.inflate(r0, r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r11.A0c = r2
            r11.A0X = r2
        L_0x0066:
            if (r5 == 0) goto L_0x0161
        L_0x0068:
            X.0wo r0 = new X.0wo
            r0.<init>(r11, r2)
            X.AnonymousClass0YZ.A0E(r5, r0)
            X.0uG r0 = r11.A0L
            if (r0 != 0) goto L_0x007d
            r0 = 2131434290(0x7f0b1b32, float:1.849039E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r5, r0)
            r11.A0A = r0
        L_0x007d:
            java.lang.String r10 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r9 = "ViewUtils"
            goto L_0x0115
        L_0x0083:
            boolean r0 = r11.A0X
            if (r0 == 0) goto L_0x0161
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r1 = r8.getTheme()
            r0 = 2130968597(0x7f040015, float:1.7545852E38)
            r1.resolveAttribute(r0, r3, r4)
            int r1 = r3.resourceId
            if (r1 == 0) goto L_0x00f4
            X.00m r0 = new X.00m
            r0.<init>((android.content.Context) r8, (int) r1)
        L_0x009f:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131623959(0x7f0e0017, float:1.8875084E38)
            android.view.View r5 = r1.inflate(r0, r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0 = 2131429323(0x7f0b07cb, float:1.8480315E38)
            android.view.View r1 = r5.findViewById(r0)
            X.0uG r1 = (X.C16930uG) r1
            r11.A0L = r1
            android.view.Window r0 = r11.A08
            android.view.Window$Callback r0 = r0.getCallback()
            r1.setWindowCallback(r0)
            boolean r0 = r11.A0c
            if (r0 == 0) goto L_0x00ce
            X.0uG r0 = r11.A0L
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            r0.setOverlayMode(r4)
        L_0x00ce:
            boolean r0 = r11.A0W
            if (r0 == 0) goto L_0x00e0
            X.0uG r0 = r11.A0L
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            java.lang.String r1 = "ToolbarWidgetWrapper"
            java.lang.String r0 = "Progress display unsupported"
            android.util.Log.i(r1, r0)
        L_0x00e0:
            boolean r0 = r11.A0V
            if (r0 == 0) goto L_0x0068
            X.0uG r0 = r11.A0L
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            java.lang.String r1 = "ToolbarWidgetWrapper"
            java.lang.String r0 = "Progress display unsupported"
            android.util.Log.i(r1, r0)
            goto L_0x0068
        L_0x00f4:
            r0 = r8
            goto L_0x009f
        L_0x00f6:
            boolean r1 = r11.A0d
            r0 = 2131623957(0x7f0e0015, float:1.887508E38)
            if (r1 == 0) goto L_0x0100
            r0 = 2131623958(0x7f0e0016, float:1.8875082E38)
        L_0x0100:
            android.view.View r5 = r3.inflate(r0, r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x0066
        L_0x0108:
            boolean r0 = r3.getBoolean(r1, r2)
            if (r0 == 0) goto L_0x0021
            r0 = 108(0x6c, float:1.51E-43)
            r11.A0J(r0)
            goto L_0x0021
        L_0x0115:
            java.lang.Class r3 = r5.getClass()     // Catch:{ NoSuchMethodException -> 0x0130, IllegalAccessException | InvocationTargetException -> 0x0136 }
            java.lang.String r1 = "makeOptionalFitsSystemWindows"
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0130, IllegalAccessException | InvocationTargetException -> 0x0136 }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0130, IllegalAccessException | InvocationTargetException -> 0x0136 }
            boolean r0 = r1.isAccessible()     // Catch:{ NoSuchMethodException -> 0x0130, IllegalAccessException | InvocationTargetException -> 0x0136 }
            if (r0 != 0) goto L_0x012a
            r1.setAccessible(r4)     // Catch:{ NoSuchMethodException -> 0x0130, IllegalAccessException | InvocationTargetException -> 0x0136 }
        L_0x012a:
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x0130, IllegalAccessException | InvocationTargetException -> 0x0136 }
            r1.invoke(r5, r0)     // Catch:{ NoSuchMethodException -> 0x0130, IllegalAccessException | InvocationTargetException -> 0x0136 }
            goto L_0x013a
        L_0x0130:
            java.lang.String r0 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r9, r0)
            goto L_0x013a
        L_0x0136:
            r0 = move-exception
            android.util.Log.d(r9, r10, r0)
        L_0x013a:
            r0 = 2131427467(0x7f0b008b, float:1.8476551E38)
            android.view.View r4 = r5.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r4 = (androidx.appcompat.widget.ContentFrameLayout) r4
            android.view.Window r0 = r11.A08
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x01b8
        L_0x0150:
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x01a8
            android.view.View r0 = r1.getChildAt(r2)
            r1.removeViewAt(r2)
            r4.addView(r0)
            goto L_0x0150
        L_0x0161:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AppCompat does not support the current theme features: { windowActionBar: "
            r1.append(r0)
            boolean r0 = r11.A0X
            r1.append(r0)
            java.lang.String r0 = ", windowActionBarOverlay: "
            r1.append(r0)
            boolean r0 = r11.A0c
            r1.append(r0)
            java.lang.String r0 = ", android:windowIsFloating: "
            r1.append(r0)
            boolean r0 = r11.A0a
            r1.append(r0)
            java.lang.String r0 = ", windowActionModeOverlay: "
            r1.append(r0)
            boolean r0 = r11.A0d
            r1.append(r0)
            java.lang.String r0 = ", windowNoTitle: "
            r1.append(r0)
            boolean r0 = r11.A0g
            r1.append(r0)
            java.lang.String r0 = " }"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x019e:
            r3.recycle()
            java.lang.String r0 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x01a8:
            r0 = -1
            r1.setId(r0)
            r4.setId(r3)
            boolean r0 = r1 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x01b8
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.setForeground(r6)
        L_0x01b8:
            android.view.Window r0 = r11.A08
            r0.setContentView(r5)
            X.0bF r0 = new X.0bF
            r0.<init>(r11)
            r4.A06 = r0
            r11.A07 = r5
            java.lang.Object r1 = r11.A0k
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x02a0
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.CharSequence r1 = r1.getTitle()
        L_0x01d2:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01df
            X.0uG r0 = r11.A0L
            if (r0 == 0) goto L_0x028e
            r0.setWindowTitle(r1)
        L_0x01df:
            android.view.ViewGroup r0 = r11.A07
            android.view.View r4 = r0.findViewById(r3)
            androidx.appcompat.widget.ContentFrameLayout r4 = (androidx.appcompat.widget.ContentFrameLayout) r4
            android.view.Window r0 = r11.A08
            android.view.View r0 = r0.getDecorView()
            int r6 = r0.getPaddingLeft()
            int r5 = r0.getPaddingTop()
            int r3 = r0.getPaddingRight()
            int r1 = r0.getPaddingBottom()
            android.graphics.Rect r0 = r4.A07
            r0.set(r6, r5, r3, r1)
            boolean r0 = X.C06360Xi.A05(r4)
            if (r0 == 0) goto L_0x020b
            r4.requestLayout()
        L_0x020b:
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r7)
            r1 = 124(0x7c, float:1.74E-43)
            android.util.TypedValue r0 = r4.getMinWidthMajor()
            r3.getValue(r1, r0)
            r1 = 125(0x7d, float:1.75E-43)
            android.util.TypedValue r0 = r4.getMinWidthMinor()
            r3.getValue(r1, r0)
            r1 = 122(0x7a, float:1.71E-43)
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x0230
            android.util.TypedValue r0 = r4.getFixedWidthMajor()
            r3.getValue(r1, r0)
        L_0x0230:
            r1 = 123(0x7b, float:1.72E-43)
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x023f
            android.util.TypedValue r0 = r4.getFixedWidthMinor()
            r3.getValue(r1, r0)
        L_0x023f:
            r1 = 120(0x78, float:1.68E-43)
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x024e
            android.util.TypedValue r0 = r4.getFixedHeightMajor()
            r3.getValue(r1, r0)
        L_0x024e:
            r1 = 121(0x79, float:1.7E-43)
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x025d
            android.util.TypedValue r0 = r4.getFixedHeightMinor()
            r3.getValue(r1, r0)
        L_0x025d:
            r3.recycle()
            r4.requestLayout()
            r0 = 1
            r11.A0f = r0
            X.0Mo r1 = r11.A0M(r2)
            boolean r0 = r11.A0Z
            if (r0 != 0) goto L_0x028d
            X.0cz r0 = r1.A0A
            if (r0 != 0) goto L_0x028d
            r0 = 108(0x6c, float:1.51E-43)
            int r1 = r11.A00
            r2 = 1
            int r0 = r2 << r0
            r0 = r0 | r1
            r11.A00 = r0
            boolean r0 = r11.A0Y
            if (r0 != 0) goto L_0x028d
            android.view.Window r0 = r11.A08
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r11.A0l
            X.AnonymousClass0YY.A07(r1, r0)
            r11.A0Y = r2
        L_0x028d:
            return
        L_0x028e:
            X.0R8 r0 = r11.A0B
            if (r0 == 0) goto L_0x0297
            r0.A0K(r1)
            goto L_0x01df
        L_0x0297:
            android.widget.TextView r0 = r11.A0A
            if (r0 == 0) goto L_0x01df
            r0.setText(r1)
            goto L_0x01df
        L_0x02a0:
            java.lang.CharSequence r1 = r11.A0N
            goto L_0x01d2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass040.A0N():void");
    }

    public final void A0O() {
        if (this.A08 == null) {
            Object obj = this.A0k;
            if (obj instanceof Activity) {
                A0T(((Activity) obj).getWindow());
            }
        }
        if (this.A08 == null) {
            throw AnonymousClass001.A0e("We have not been given a Window");
        }
    }

    public final void A0Q() {
        if (this.A0f) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
        if (r0.getCount() > 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011d, code lost:
        if (r0 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012f, code lost:
        if (r0.width != -1) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(android.view.KeyEvent r13, X.C04040Mo r14) {
        /*
            r12 = this;
            boolean r0 = r14.A0C
            if (r0 != 0) goto L_0x001b
            boolean r0 = r12.A0Z
            if (r0 != 0) goto L_0x001b
            int r2 = r14.A01
            r7 = 0
            r3 = 1
            if (r2 != 0) goto L_0x001c
            android.content.Context r0 = r12.A0i
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r0)
            int r0 = r0.screenLayout
            r1 = r0 & 15
            r0 = 4
            if (r1 != r0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            android.view.Window r0 = r12.A08
            android.view.Window$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L_0x0030
            X.0cz r0 = r14.A0A
            boolean r0 = r1.onMenuOpened(r2, r0)
            if (r0 != 0) goto L_0x0030
            r12.A0U(r14, r3)
            return
        L_0x0030:
            android.content.Context r4 = r12.A0i
            java.lang.String r0 = "window"
            java.lang.Object r2 = r4.getSystemService(r0)
            android.view.ViewManager r2 = (android.view.ViewManager) r2
            if (r2 == 0) goto L_0x001b
            boolean r0 = r12.A0Y(r13, r14)
            if (r0 == 0) goto L_0x001b
            android.view.ViewGroup r1 = r14.A08
            r6 = -2
            if (r1 == 0) goto L_0x0133
            boolean r0 = r14.A0E
            if (r0 == 0) goto L_0x0121
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x0056
            android.view.ViewGroup r0 = r14.A08
            r0.removeAllViews()
        L_0x0056:
            android.view.View r0 = r14.A06
            if (r0 == 0) goto L_0x00ca
            r14.A07 = r0
        L_0x005c:
            android.view.View r0 = r14.A06
            if (r0 != 0) goto L_0x0073
            X.0b9 r1 = r14.A09
            X.032 r0 = r1.A03
            if (r0 != 0) goto L_0x006d
            X.032 r0 = new X.032
            r0.<init>(r1)
            r1.A03 = r0
        L_0x006d:
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x01a6
        L_0x0073:
            android.view.View r0 = r14.A07
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            if (r4 != 0) goto L_0x0080
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r6, r6)
        L_0x0080:
            int r1 = r14.A00
            android.view.ViewGroup r0 = r14.A08
            r0.setBackgroundResource(r1)
            android.view.View r0 = r14.A07
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0098
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r0 = r14.A07
            r1.removeView(r0)
        L_0x0098:
            android.view.ViewGroup r1 = r14.A08
            android.view.View r0 = r14.A07
            r1.addView(r0, r4)
            android.view.View r0 = r14.A07
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L_0x00ac
            android.view.View r0 = r14.A07
            r0.requestFocus()
        L_0x00ac:
            r5 = -2
        L_0x00ad:
            r14.A0B = r7
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            android.view.WindowManager$LayoutParams r4 = new android.view.WindowManager$LayoutParams
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r0 = r14.A02
            r4.gravity = r0
            int r0 = r14.A03
            r4.windowAnimations = r0
            android.view.ViewGroup r0 = r14.A08
            r2.addView(r0, r4)
            r14.A0C = r3
            return
        L_0x00ca:
            X.0cz r0 = r14.A0A
            if (r0 == 0) goto L_0x01a6
            X.0b4 r1 = r12.A0H
            if (r1 != 0) goto L_0x00d9
            X.0b4 r1 = new X.0b4
            r1.<init>(r12)
            r12.A0H = r1
        L_0x00d9:
            X.0b9 r0 = r14.A09
            if (r0 != 0) goto L_0x00ef
            android.content.Context r0 = r14.A04
            X.0b9 r4 = new X.0b9
            r4.<init>(r0)
            r14.A09 = r4
            r4.A05 = r1
            X.0cz r1 = r14.A0A
            android.content.Context r0 = r1.A0N
            r1.A09(r0, r4)
        L_0x00ef:
            X.0b9 r5 = r14.A09
            android.view.ViewGroup r4 = r14.A08
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A02
            if (r0 != 0) goto L_0x0119
            android.view.LayoutInflater r1 = r5.A01
            r0 = 2131623949(0x7f0e000d, float:1.8875064E38)
            android.view.View r0 = r1.inflate(r0, r4, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r0 = (androidx.appcompat.view.menu.ExpandedMenuView) r0
            r5.A02 = r0
            X.032 r1 = r5.A03
            if (r1 != 0) goto L_0x010f
            X.032 r1 = new X.032
            r1.<init>(r5)
            r5.A03 = r1
        L_0x010f:
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A02
            r0.setAdapter(r1)
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A02
            r0.setOnItemClickListener(r5)
        L_0x0119:
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A02
            r14.A07 = r0
            if (r0 == 0) goto L_0x01a6
            goto L_0x005c
        L_0x0121:
            android.view.View r0 = r14.A06
            if (r0 == 0) goto L_0x00ac
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x00ac
            int r1 = r0.width
            r0 = -1
            r5 = -1
            if (r1 == r0) goto L_0x00ad
            goto L_0x00ac
        L_0x0133:
            r12.A0P()
            X.0R8 r0 = r12.A0B
            if (r0 == 0) goto L_0x0140
            android.content.Context r5 = r0.A02()
            if (r5 != 0) goto L_0x0141
        L_0x0140:
            r5 = r4
        L_0x0141:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Resources$Theme r4 = r0.newTheme()
            android.content.res.Resources$Theme r0 = r5.getTheme()
            r4.setTo(r0)
            r0 = 2130968590(0x7f04000e, float:1.7545838E38)
            r4.resolveAttribute(r0, r1, r3)
            int r0 = r1.resourceId
            if (r0 == 0) goto L_0x0162
            r4.applyStyle(r0, r3)
        L_0x0162:
            r0 = 2130970262(0x7f040696, float:1.754923E38)
            r4.resolveAttribute(r0, r1, r3)
            int r0 = r1.resourceId
            if (r0 != 0) goto L_0x016f
            r0 = 2132083845(0x7f150485, float:1.9807844E38)
        L_0x016f:
            r4.applyStyle(r0, r3)
            X.00m r1 = new X.00m
            r1.<init>((android.content.Context) r5, (int) r7)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r4)
            r14.A04 = r1
            int[] r0 = X.AnonymousClass0KC.A09
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 86
            int r0 = r1.getResourceId(r0, r7)
            r14.A00 = r0
            int r0 = r1.getResourceId(r3, r7)
            r14.A03 = r0
            r1.recycle()
            android.content.Context r1 = r14.A04
            X.04Y r0 = new X.04Y
            r0.<init>(r1, r12)
            r14.A08 = r0
            r0 = 81
            r14.A02 = r0
            goto L_0x0056
        L_0x01a6:
            r14.A0E = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass040.A0S(android.view.KeyEvent, X.0Mo):void");
    }

    public final void A0T(Window window) {
        if (this.A08 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof AnonymousClass04F)) {
                AnonymousClass04F r0 = new AnonymousClass04F(callback, this);
                this.A0D = r0;
                window.setCallback(r0);
                Context context = this.A0i;
                AnonymousClass0UD r1 = new AnonymousClass0UD(context, context.obtainStyledAttributes((AttributeSet) null, A0o));
                Drawable A032 = r1.A03(0);
                if (A032 != null) {
                    window.setBackgroundDrawable(A032);
                }
                r1.A02.recycle();
                this.A08 = window;
                return;
            }
            throw AnonymousClass001.A0e("AppCompat has already installed itself into the Window");
        }
        throw AnonymousClass001.A0e("AppCompat has already installed itself into the Window");
    }

    public void A0U(C04040Mo r5, boolean z) {
        ViewGroup viewGroup;
        C16930uG r0;
        if (!z || r5.A01 != 0 || (r0 = this.A0L) == null || !r0.BIG()) {
            ViewManager viewManager = (ViewManager) this.A0i.getSystemService("window");
            if (!(viewManager == null || !r5.A0C || (viewGroup = r5.A08) == null)) {
                viewManager.removeView(viewGroup);
                if (z) {
                    int i = r5.A01;
                    C07890cz r1 = r5.A0A;
                    if (r5.A0C && !this.A0Z) {
                        this.A0D.A00.onPanelClosed(i, r1);
                    }
                }
            }
            r5.A0D = false;
            r5.A0B = false;
            r5.A0C = false;
            r5.A07 = null;
            r5.A0E = true;
            if (this.A0G == r5) {
                this.A0G = null;
                return;
            }
            return;
        }
        A0V(r5.A0A);
    }

    public void A0V(C07890cz r3) {
        if (!this.A0S) {
            this.A0S = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A0L;
            actionBarOverlayLayout.A01();
            actionBarOverlayLayout.A0A.B1r();
            Window.Callback callback = this.A08.getCallback();
            if (callback != null && !this.A0Z) {
                callback.onPanelClosed(C627136h.A03, r3);
            }
            this.A0S = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r1 == 0) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0W(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.A0Z
            if (r0 != 0) goto L_0x0139
            int r8 = r11.A01
            r0 = -100
            if (r8 != r0) goto L_0x000c
            int r8 = X.C06280Wy.A00
        L_0x000c:
            android.content.Context r7 = r11.A0i
            int r0 = r11.A0K(r7, r8)
            r6 = 0
            android.content.res.Configuration r5 = A00(r7, r6, r0)
            boolean r0 = r11.A0Q
            r4 = 1
            if (r0 != 0) goto L_0x005d
            java.lang.Object r10 = r11.A0k
            boolean r0 = r10 instanceof android.app.Activity
            if (r0 == 0) goto L_0x005d
            android.content.pm.PackageManager r9 = r7.getPackageManager()
            r3 = 0
            if (r9 == 0) goto L_0x0061
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0053 }
            r0 = 29
            if (r1 < r0) goto L_0x0032
            r2 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0039
        L_0x0032:
            r0 = 24
            r2 = 0
            if (r1 < r0) goto L_0x0039
            r2 = 786432(0xc0000, float:1.102026E-39)
        L_0x0039:
            java.lang.Class r1 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x0053 }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0053 }
            r0.<init>(r7, r1)     // Catch:{ NameNotFoundException -> 0x0053 }
            android.content.pm.ActivityInfo r0 = r9.getActivityInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0053 }
            if (r0 == 0) goto L_0x004f
            int r0 = r0.configChanges     // Catch:{ NameNotFoundException -> 0x0053 }
            r1 = r0 & 512(0x200, float:7.175E-43)
            r0 = 1
            if (r1 != 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            r11.A0P = r0     // Catch:{ NameNotFoundException -> 0x0053 }
            goto L_0x005d
        L_0x0053:
            r2 = move-exception
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "Exception while getting ActivityInfo"
            android.util.Log.d(r1, r0, r2)
            r11.A0P = r3
        L_0x005d:
            r11.A0Q = r4
            boolean r3 = r11.A0P
        L_0x0061:
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r7)
            int r0 = r0.uiMode
            r9 = r0 & 48
            int r0 = r5.uiMode
            r1 = r0 & 48
            if (r9 == r1) goto L_0x00d2
            if (r12 == 0) goto L_0x00d2
            if (r3 != 0) goto L_0x00d2
            boolean r0 = r11.A0R
            if (r0 == 0) goto L_0x00d2
            boolean r0 = A0n
            if (r0 != 0) goto L_0x007f
            boolean r0 = r11.A0T
            if (r0 == 0) goto L_0x00d2
        L_0x007f:
            java.lang.Object r2 = r11.A0k
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00d2
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r2.isChild()
            if (r0 != 0) goto L_0x00d2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x00c0
            r2.recreate()
        L_0x0096:
            if (r8 != 0) goto L_0x00a7
            X.0QQ r0 = r11.A0L(r7)
            r0.A03()
        L_0x009f:
            X.0QQ r0 = r11.A0E
            if (r0 == 0) goto L_0x0139
            r0.A02()
            return
        L_0x00a7:
            X.0QQ r0 = r11.A0F
            if (r0 == 0) goto L_0x00ae
            r0.A02()
        L_0x00ae:
            r0 = 3
            if (r8 != r0) goto L_0x009f
            X.0QQ r0 = r11.A0E
            if (r0 != 0) goto L_0x00bc
            X.041 r0 = new X.041
            r0.<init>(r7, r11)
            r11.A0E = r0
        L_0x00bc:
            r0.A03()
            return
        L_0x00c0:
            android.os.Looper r0 = r2.getMainLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            X.0ih r0 = new X.0ih
            r0.<init>(r2)
            r1.post(r0)
            goto L_0x0096
        L_0x00d2:
            if (r9 == r1) goto L_0x0096
            android.content.res.Resources r2 = r7.getResources()
            android.content.res.Configuration r0 = r2.getConfiguration()
            android.content.res.Configuration r5 = new android.content.res.Configuration
            r5.<init>(r0)
            android.content.res.Configuration r0 = r2.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & -49
            r1 = r1 | r0
            r5.uiMode = r1
            r2.updateConfiguration(r5, r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 >= r0) goto L_0x00f8
            X.C06150Wl.A00(r2)
        L_0x00f8:
            int r0 = r11.A02
            if (r0 == 0) goto L_0x010c
            r7.setTheme(r0)
            r0 = 23
            if (r1 < r0) goto L_0x010c
            android.content.res.Resources$Theme r1 = r7.getTheme()
            int r0 = r11.A02
            r1.applyStyle(r0, r4)
        L_0x010c:
            if (r3 == 0) goto L_0x0096
            java.lang.Object r2 = r11.A0k
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0096
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r2 instanceof X.C15910sA
            if (r0 == 0) goto L_0x0136
            r0 = r2
            X.0sA r0 = (X.C15910sA) r0
            X.0O9 r0 = r0.getLifecycle()
            X.08A r0 = (X.AnonymousClass08A) r0
            X.0GC r1 = r0.A02
            X.0GC r0 = X.AnonymousClass0GC.STARTED
            int r0 = r1.compareTo(r0)
            boolean r0 = X.AnonymousClass001.A1U(r0)
        L_0x012f:
            if (r0 == 0) goto L_0x0096
            r2.onConfigurationChanged(r5)
            goto L_0x0096
        L_0x0136:
            boolean r0 = r11.A0e
            goto L_0x012f
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass040.A0W(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0X(android.view.KeyEvent r6) {
        /*
            r5 = this;
            java.lang.Object r1 = r5.A0k
            boolean r0 = r1 instanceof X.C15820rz
            r4 = 1
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1 instanceof X.AnonymousClass00Q
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r5.A08
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = X.C06560Yg.A0V(r0, r6)
            if (r0 == 0) goto L_0x001a
            return r4
        L_0x001a:
            int r1 = r6.getKeyCode()
            r0 = 82
            if (r1 != r0) goto L_0x002d
            X.04F r0 = r5.A0D
            android.view.Window$Callback r0 = r0.A00
            boolean r0 = r0.dispatchKeyEvent(r6)
            if (r0 == 0) goto L_0x002d
            return r4
        L_0x002d:
            int r3 = r6.getKeyCode()
            int r1 = r6.getAction()
            r0 = 4
            if (r1 != 0) goto L_0x0053
            r2 = 1
            r1 = 0
            if (r3 == r0) goto L_0x0126
            r0 = 82
            if (r3 != r0) goto L_0x0131
            int r0 = r6.getRepeatCount()
            if (r0 != 0) goto L_0x0051
            X.0Mo r1 = r5.A0M(r1)
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x0051
            r5.A0Y(r6, r1)
        L_0x0051:
            r0 = 1
            return r0
        L_0x0053:
            r2 = 0
            if (r3 == r0) goto L_0x00fb
            r0 = 82
            if (r3 != r0) goto L_0x0131
            X.0R2 r0 = r5.A0J
            if (r0 != 0) goto L_0x0051
            X.0Mo r3 = r5.A0M(r2)
            X.0uG r0 = r5.A0L
            if (r0 == 0) goto L_0x00d0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            X.0uQ r0 = r0.A0A
            X.0bG r0 = (X.C07580bG) r0
            androidx.appcompat.widget.Toolbar r1 = r0.A09
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00d0
            androidx.appcompat.widget.ActionMenuView r0 = r1.A0O
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x00d0
            android.content.Context r0 = r5.A0i
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 != 0) goto L_0x00d0
            X.0uG r0 = r5.A0L
            boolean r0 = r0.BIG()
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r5.A0Z
            if (r0 != 0) goto L_0x0051
            boolean r0 = r5.A0Y(r6, r3)
            if (r0 == 0) goto L_0x0051
            androidx.appcompat.widget.ActionMenuView r0 = A01(r5)
            if (r0 == 0) goto L_0x0051
            X.0bB r0 = r0.A08
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.A03()
        L_0x00ab:
            if (r0 == 0) goto L_0x0051
        L_0x00ad:
            android.content.Context r0 = r5.A0i
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            if (r0 == 0) goto L_0x00f2
            r0.playSoundEffect(r2)
            goto L_0x0051
        L_0x00c1:
            androidx.appcompat.widget.ActionMenuView r0 = A01(r5)
            if (r0 == 0) goto L_0x0051
            X.0bB r0 = r0.A08
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.A01()
            goto L_0x00ab
        L_0x00d0:
            boolean r1 = r3.A0C
            if (r1 != 0) goto L_0x00ec
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0051
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x00e8
            r3.A0D = r2
            boolean r0 = r5.A0Y(r6, r3)
            if (r0 == 0) goto L_0x0051
        L_0x00e8:
            r5.A0S(r6, r3)
            goto L_0x00ad
        L_0x00ec:
            r5.A0U(r3, r4)
            if (r1 == 0) goto L_0x0051
            goto L_0x00ad
        L_0x00f2:
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r1, r0)
            goto L_0x0051
        L_0x00fb:
            boolean r3 = r5.A0b
            r5.A0b = r2
            X.0Mo r1 = r5.A0M(r2)
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x010e
            if (r3 != 0) goto L_0x0051
            r5.A0U(r1, r4)
            goto L_0x0051
        L_0x010e:
            X.0R2 r0 = r5.A0J
            if (r0 == 0) goto L_0x0117
            r0.A05()
            goto L_0x0051
        L_0x0117:
            r5.A0P()
            X.0R8 r0 = r5.A0B
            if (r0 == 0) goto L_0x0131
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x0131
            goto L_0x0051
        L_0x0126:
            int r0 = r6.getFlags()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x012f
            r2 = 0
        L_0x012f:
            r5.A0b = r2
        L_0x0131:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass040.A0X(android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r7 == 108) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        if (r13.A0F != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0102, code lost:
        if (r6 != null) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0Y(android.view.KeyEvent r12, X.C04040Mo r13) {
        /*
            r11 = this;
            boolean r0 = r11.A0Z
            r2 = 0
            if (r0 != 0) goto L_0x0086
            boolean r0 = r13.A0D
            r3 = 1
            if (r0 != 0) goto L_0x015d
            X.0Mo r0 = r11.A0G
            if (r0 == 0) goto L_0x0013
            if (r0 == r13) goto L_0x0013
            r11.A0U(r0, r2)
        L_0x0013:
            android.view.Window r0 = r11.A08
            android.view.Window$Callback r5 = r0.getCallback()
            if (r5 == 0) goto L_0x0023
            int r0 = r13.A01
            android.view.View r0 = r5.onCreatePanelView(r0)
            r13.A06 = r0
        L_0x0023:
            int r7 = r13.A01
            if (r7 == 0) goto L_0x002c
            r0 = 108(0x6c, float:1.51E-43)
            r10 = 0
            if (r7 != r0) goto L_0x003c
        L_0x002c:
            r10 = 1
            X.0uG r0 = r11.A0L
            if (r0 == 0) goto L_0x003c
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            X.0uQ r0 = r0.A0A
            X.0bG r0 = (X.C07580bG) r0
            r0.A0D = r3
        L_0x003c:
            android.view.View r0 = r13.A06
            if (r0 != 0) goto L_0x0154
            if (r10 == 0) goto L_0x0048
            X.0R8 r0 = r11.A0B
            boolean r0 = r0 instanceof X.AnonymousClass03y
            if (r0 != 0) goto L_0x0154
        L_0x0048:
            X.0cz r6 = r13.A0A
            r4 = 0
            if (r6 == 0) goto L_0x0087
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x010f
        L_0x0051:
            if (r10 == 0) goto L_0x0065
            X.0uG r1 = r11.A0L
            if (r1 == 0) goto L_0x0065
            X.0b3 r0 = r11.A0C
            if (r0 != 0) goto L_0x0062
            X.0b3 r0 = new X.0b3
            r0.<init>(r11)
            r11.A0C = r0
        L_0x0062:
            r1.setMenu(r6, r0)
        L_0x0065:
            X.0cz r0 = r13.A0A
            r0.A08()
            boolean r0 = r5.onCreatePanelMenu(r7, r0)
            if (r0 != 0) goto L_0x010d
            X.0cz r1 = r13.A0A
            if (r4 == r1) goto L_0x007b
            X.0b9 r0 = r13.A09
            r1.A0E(r0)
            r13.A0A = r4
        L_0x007b:
            if (r10 == 0) goto L_0x0086
            X.0uG r1 = r11.A0L
            if (r1 == 0) goto L_0x0086
            X.0b3 r0 = r11.A0C
            r1.setMenu(r4, r0)
        L_0x0086:
            return r2
        L_0x0087:
            android.content.Context r8 = r11.A0i
            if (r7 == 0) goto L_0x008f
            r0 = 108(0x6c, float:1.51E-43)
            if (r7 != r0) goto L_0x00df
        L_0x008f:
            X.0uG r0 = r11.A0L
            if (r0 == 0) goto L_0x00df
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.res.Resources$Theme r1 = r8.getTheme()
            r0 = 2130968597(0x7f040015, float:1.7545852E38)
            r1.resolveAttribute(r0, r9, r3)
            int r0 = r9.resourceId
            if (r0 == 0) goto L_0x0105
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r6 = r0.newTheme()
            r6.setTo(r1)
            int r0 = r9.resourceId
            r6.applyStyle(r0, r3)
            r0 = 2130968598(0x7f040016, float:1.7545854E38)
            r6.resolveAttribute(r0, r9, r3)
        L_0x00bc:
            int r0 = r9.resourceId
            if (r0 == 0) goto L_0x0102
            if (r6 != 0) goto L_0x00cd
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r6 = r0.newTheme()
            r6.setTo(r1)
        L_0x00cd:
            int r0 = r9.resourceId
            r6.applyStyle(r0, r3)
        L_0x00d2:
            X.00m r1 = new X.00m
            r1.<init>((android.content.Context) r8, (int) r2)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r6)
            r8 = r1
        L_0x00df:
            X.0cz r6 = new X.0cz
            r6.<init>(r8)
            r6.A0D(r11)
            X.0cz r1 = r13.A0A
            if (r6 == r1) goto L_0x00fd
            if (r1 == 0) goto L_0x00f2
            X.0b9 r0 = r13.A09
            r1.A0E(r0)
        L_0x00f2:
            r13.A0A = r6
            X.0b9 r1 = r13.A09
            if (r1 == 0) goto L_0x00fd
            android.content.Context r0 = r6.A0N
            r6.A09(r0, r1)
        L_0x00fd:
            X.0cz r6 = r13.A0A
            if (r6 != 0) goto L_0x0051
            return r2
        L_0x0102:
            if (r6 == 0) goto L_0x00df
            goto L_0x00d2
        L_0x0105:
            r0 = 2130968598(0x7f040016, float:1.7545854E38)
            r1.resolveAttribute(r0, r9, r3)
            r6 = 0
            goto L_0x00bc
        L_0x010d:
            r13.A0F = r2
        L_0x010f:
            X.0cz r1 = r13.A0A
            r1.A08()
            android.os.Bundle r0 = r13.A05
            if (r0 == 0) goto L_0x011d
            r1.A0A(r0)
            r13.A05 = r4
        L_0x011d:
            android.view.View r1 = r13.A06
            X.0cz r0 = r13.A0A
            boolean r0 = r5.onPreparePanel(r2, r1, r0)
            if (r0 != 0) goto L_0x0138
            if (r10 == 0) goto L_0x0132
            X.0uG r1 = r11.A0L
            if (r1 == 0) goto L_0x0132
            X.0b3 r0 = r11.A0C
            r1.setMenu(r4, r0)
        L_0x0132:
            X.0cz r0 = r13.A0A
            r0.A07()
            return r2
        L_0x0138:
            if (r12 == 0) goto L_0x015b
            int r0 = r12.getDeviceId()
        L_0x013e:
            android.view.KeyCharacterMap r0 = android.view.KeyCharacterMap.load(r0)
            int r0 = r0.getKeyboardType()
            boolean r1 = X.AnonymousClass001.A1X(r0, r3)
            X.0cz r0 = r13.A0A
            r0.setQwertyMode(r1)
            X.0cz r0 = r13.A0A
            r0.A07()
        L_0x0154:
            r13.A0D = r3
            r13.A0B = r2
            r11.A0G = r13
            return r3
        L_0x015b:
            r0 = -1
            goto L_0x013e
        L_0x015d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass040.A0Y(android.view.KeyEvent, X.0Mo):boolean");
    }

    public boolean BWQ(MenuItem menuItem, C07890cz r9) {
        Window.Callback callback = this.A08.getCallback();
        if (callback == null || this.A0Z) {
            return false;
        }
        C07890cz A022 = r9.A02();
        C04040Mo[] r4 = this.A0h;
        if (r4 == null) {
            return false;
        }
        for (C04040Mo r1 : r4) {
            if (r1 != null && r1.A0A == A022) {
                return callback.onMenuItemSelected(r1.A01, menuItem);
            }
        }
        return false;
    }

    public void BWR(C07890cz r7) {
        ActionMenuView actionMenuView;
        C07530bB r0;
        C07530bB r02;
        ActionMenuView A012;
        C07530bB r1;
        C16930uG r03 = this.A0L;
        if (r03 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) r03;
            actionBarOverlayLayout.A01();
            Toolbar toolbar = ((C07580bG) actionBarOverlayLayout.A0A).A09;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.A0O) != null && actionMenuView.A0B && (!ViewConfiguration.get(this.A0i).hasPermanentMenuKey() || !((A012 = A01(this)) == null || (r1 = A012.A08) == null || (r1.A0F == null && !r1.A02())))) {
                Window.Callback callback = this.A08.getCallback();
                if (this.A0L.BIG()) {
                    ActionMenuView A013 = A01(this);
                    if (!(A013 == null || (r02 = A013.A08) == null)) {
                        r02.A01();
                    }
                    if (!this.A0Z) {
                        callback.onPanelClosed(C627136h.A03, A0M(0).A0A);
                        return;
                    }
                    return;
                } else if (callback != null && !this.A0Z) {
                    if (this.A0Y && (this.A00 & 1) != 0) {
                        View decorView = this.A08.getDecorView();
                        Runnable runnable = this.A0l;
                        decorView.removeCallbacks(runnable);
                        runnable.run();
                    }
                    C04040Mo A0M2 = A0M(0);
                    C07890cz r12 = A0M2.A0A;
                    if (r12 != null && !A0M2.A0F && callback.onPreparePanel(0, A0M2.A06, r12)) {
                        callback.onMenuOpened(C627136h.A03, A0M2.A0A);
                        ActionMenuView A014 = A01(this);
                        if (A014 != null && (r0 = A014.A08) != null) {
                            r0.A03();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        C04040Mo A0M3 = A0M(0);
        A0M3.A0E = true;
        A0U(A0M3, false);
        A0S((KeyEvent) null, A0M3);
    }

    public AnonymousClass040(Context context, Window window, C16440tP r6, Object obj) {
        this.A0i = context;
        this.A0j = r6;
        this.A0k = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof C009707r)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        C009707r r4 = (C009707r) context;
                        if (r4 != null) {
                            this.A01 = ((AnonymousClass040) r4.A5e()).A01;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        if (this.A01 == -100) {
            C06290Wz r2 = A0m;
            String A0O2 = AnonymousClass000.A0O(obj);
            Number number = (Number) r2.get(A0O2);
            if (number != null) {
                this.A01 = number.intValue();
                r2.remove(A0O2);
            }
        }
        if (window != null) {
            A0T(window);
        }
        AnonymousClass0XJ.A02();
    }

    public void A08() {
        A0P();
        AnonymousClass0R8 r0 = this.A0B;
        if (r0 == null || !r0.A0T()) {
            this.A00 = (1 << 0) | this.A00;
            if (!this.A0Y) {
                AnonymousClass0YY.A07(this.A08.getDecorView(), this.A0l);
                this.A0Y = true;
            }
        }
    }

    public void A0B(int i) {
        A0N();
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.A0i).inflate(i, viewGroup);
        this.A0D.A00.onContentChanged();
    }

    public void A0E(View view) {
        A0N();
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.A0D.A00.onContentChanged();
    }

    public void A0F(View view, ViewGroup.LayoutParams layoutParams) {
        A0N();
        ((ViewGroup) this.A07.findViewById(16908290)).addView(view, layoutParams);
        this.A0D.A00.onContentChanged();
    }

    public void A0G(View view, ViewGroup.LayoutParams layoutParams) {
        A0N();
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.A0D.A00.onContentChanged();
    }

    public final void A0P() {
        AnonymousClass03z r1;
        A0N();
        if (this.A0X && this.A0B == null) {
            Object obj = this.A0k;
            if (obj instanceof Activity) {
                r1 = new AnonymousClass03z((Activity) obj, this.A0c);
            } else if (obj instanceof Dialog) {
                r1 = new AnonymousClass03z((Dialog) obj);
            } else {
                return;
            }
            this.A0B = r1;
            r1.A0M(this.A0U);
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return A05(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
