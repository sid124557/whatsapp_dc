package X;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: X.06H  reason: invalid class name */
public class AnonymousClass06H extends C05640Uh {
    public static Class A05;
    public static Field A06;
    public static Field A07;
    public static Method A08;
    public static boolean A09;
    public AnonymousClass0XU A00;
    public AnonymousClass0XU A01 = null;
    public AnonymousClass0XY A02;
    public AnonymousClass0XU[] A03;
    public final WindowInsets A04;

    public AnonymousClass0XU A0C(int i) {
        return A00(i, false);
    }

    public AnonymousClass0XU A0D(int i) {
        return A00(i, true);
    }

    private AnonymousClass0XU A00(int i, boolean z) {
        AnonymousClass0XU A002;
        AnonymousClass0XU r0;
        AnonymousClass0XU r9;
        AnonymousClass0XU r1;
        AnonymousClass0XU r12;
        AnonymousClass0UQ A052;
        AnonymousClass0XU r5 = AnonymousClass0XU.A04;
        AnonymousClass0XU r4 = r5;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    AnonymousClass0XU r13 = null;
                    if (i2 != 2) {
                        if (i2 == 8) {
                            AnonymousClass0XU[] r14 = this.A03;
                            if (r14 == null || (A002 = r14[3]) == null) {
                                AnonymousClass0XU A0B = A0B();
                                AnonymousClass0XY r02 = this.A02;
                                if (r02 != null) {
                                    r1 = r02.A00.A02();
                                } else {
                                    r1 = r4;
                                }
                                int i3 = A0B.A00;
                                int i4 = r1.A00;
                                if (i3 > i4 || ((r12 = this.A00) != null && !r12.equals(r4) && (i3 = r12.A00) > i4)) {
                                    A002 = AnonymousClass0XU.A00(0, 0, 0, i3);
                                }
                            }
                        } else if (i2 == 16) {
                            A002 = A03();
                        } else if (i2 == 32) {
                            A002 = A01();
                        } else if (i2 == 64) {
                            A002 = A04();
                        } else if (i2 == 128) {
                            AnonymousClass0XY r03 = this.A02;
                            if (r03 != null) {
                                A052 = r03.A00.A05();
                            } else {
                                A052 = A05();
                            }
                            if (A052 != null) {
                                A002 = AnonymousClass0XU.A00(A052.A02(), A052.A04(), A052.A03(), A052.A01());
                            }
                        }
                        A002 = r4;
                    } else if (z) {
                        AnonymousClass0XY r04 = this.A02;
                        if (r04 != null) {
                            r9 = r04.A00.A02();
                        } else {
                            r9 = r4;
                        }
                        AnonymousClass0XU A022 = A02();
                        A002 = AnonymousClass0XU.A00(Math.max(r9.A01, A022.A01), 0, Math.max(r9.A02, A022.A02), Math.max(r9.A00, A022.A00));
                    } else {
                        AnonymousClass0XU A0B2 = A0B();
                        AnonymousClass0XY r05 = this.A02;
                        if (r05 != null) {
                            r13 = r05.A00.A02();
                        }
                        int i5 = A0B2.A00;
                        if (r13 != null) {
                            i5 = Math.min(i5, r13.A00);
                        }
                        A002 = AnonymousClass0XU.A00(A0B2.A01, 0, A0B2.A02, i5);
                    }
                } else if (z) {
                    AnonymousClass0XY r06 = this.A02;
                    if (r06 != null) {
                        r0 = r06.A00.A02();
                    } else {
                        r0 = r4;
                    }
                    A002 = AnonymousClass0XU.A00(0, Math.max(r0.A03, A0B().A03), 0, 0);
                } else {
                    A002 = AnonymousClass0XU.A00(0, A0B().A03, 0, 0);
                }
                r5 = AnonymousClass0XU.A02(r5, A002);
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return r5;
    }

    public final AnonymousClass0XU A0B() {
        AnonymousClass0XU r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        WindowInsets windowInsets = this.A04;
        AnonymousClass0XU A002 = AnonymousClass0XU.A00(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.A01 = A002;
        return A002;
    }

    public AnonymousClass0XY A0E(int i, int i2, int i3, int i4) {
        C05290St r1 = new C05290St(AnonymousClass001.A0X(this.A04));
        AnonymousClass0XU A002 = AnonymousClass0XY.A00(A0B(), i, i2, i3, i4);
        AnonymousClass0UT r12 = r1.A00;
        r12.A06(A002);
        r12.A05(AnonymousClass0XY.A00(A02(), i, i2, i3, i4));
        return r12.A00();
    }

    public void A0F(View view) {
        AnonymousClass0XU r0;
        if (Build.VERSION.SDK_INT < 30) {
            if (!A09) {
                try {
                    A08 = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                    Class<?> cls = Class.forName("android.view.View$AttachInfo");
                    A05 = cls;
                    A07 = cls.getDeclaredField("mVisibleInsets");
                    A06 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                    A07.setAccessible(true);
                    A06.setAccessible(true);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", AnonymousClass000.A0a("Failed to get visible insets. (Reflection error). ", AnonymousClass001.A0o(), e), e);
                }
                A09 = true;
            }
            Method method = A08;
            if (!(method == null || A05 == null || A07 == null)) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    } else {
                        Rect rect = (Rect) A07.get(A06.get(invoke));
                        if (rect != null) {
                            r0 = AnonymousClass0XU.A00(rect.left, rect.top, rect.right, rect.bottom);
                            if (r0 == null) {
                            }
                            this.A00 = r0;
                            return;
                        }
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", AnonymousClass000.A0a("Failed to get visible insets. (Reflection error). ", AnonymousClass001.A0o(), e2), e2);
                }
            }
            r0 = AnonymousClass0XU.A04;
            this.A00 = r0;
            return;
        }
        throw AnonymousClass002.A0G("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    public boolean A0I() {
        return this.A04.isRound();
    }

    public AnonymousClass06H(AnonymousClass0XY r2, WindowInsets windowInsets) {
        super(r2);
        this.A04 = windowInsets;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.A00, ((AnonymousClass06H) obj).A00);
    }

    public void A0G(AnonymousClass0XY r1) {
        this.A02 = r1;
    }

    public void A0H(AnonymousClass0XU[] r1) {
        this.A03 = r1;
    }
}
