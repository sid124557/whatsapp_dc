package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.8Cv  reason: invalid class name and case insensitive filesystem */
public class C170348Cv implements C181428mk {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public View A0B;
    public ViewTreeObserver.OnPreDrawListener A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    public boolean Blj(C153427bI r6, Object obj, int i) {
        float f;
        float f2;
        if (i == 35) {
            float A052 = AnonymousClass001.A05(obj);
            this.A07 = A052;
            View view = this.A0B;
            if (view != null) {
                view.setScaleX(A052);
                return true;
            }
        } else if (i == 36) {
            float A053 = AnonymousClass001.A05(obj);
            this.A08 = A053;
            View view2 = this.A0B;
            if (view2 != null) {
                view2.setScaleY(A053);
                return true;
            }
        } else if (i == 38) {
            try {
                String str = (String) obj;
                if (str == null) {
                    f = 0.0f;
                } else {
                    f = C162407s0.A01(str);
                }
                this.A09 = f;
                this.A0H = AnonymousClass6C9.A1P(str);
            } catch (AnonymousClass6u2 e) {
                C159737mN.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse translation_x value. ", e);
            }
            View view3 = this.A0B;
            if (view3 != null) {
                view3.setTranslationX(AnonymousClass6C9.A03(this.A09, AnonymousClass4L0.A00(view3), this.A0H ? 1 : 0));
                return true;
            }
        } else if (i == 138) {
            float A054 = AnonymousClass001.A05(obj);
            this.A04 = A054;
            View view4 = this.A0B;
            if (view4 != null) {
                view4.setRotation(A054);
                return true;
            }
        } else if (i != 141) {
            switch (i) {
                case 40:
                    try {
                        String str2 = (String) obj;
                        if (str2 == null) {
                            f2 = 0.0f;
                        } else {
                            f2 = C162407s0.A01(str2);
                        }
                        this.A0A = f2;
                        this.A0I = AnonymousClass6C9.A1P(str2);
                    } catch (AnonymousClass6u2 e2) {
                        C159737mN.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse translation_y value. ", e2);
                    }
                    View view5 = this.A0B;
                    if (view5 != null) {
                        view5.setTranslationY(AnonymousClass6C9.A03(this.A0A, C86664Kz.A02(view5), this.A0I ? 1 : 0));
                        return true;
                    }
                    break;
                case 41:
                    try {
                        String str3 = (String) obj;
                        this.A02 = C162407s0.A01(str3);
                        this.A0F = AnonymousClass6C9.A1P(str3);
                        this.A0E = true;
                    } catch (AnonymousClass6u2 e3) {
                        C159737mN.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_x value. ", e3);
                    }
                    View view6 = this.A0B;
                    if (view6 != null) {
                        view6.setPivotX(AnonymousClass6C9.A03(this.A02, AnonymousClass4L0.A00(view6), this.A0F ? 1 : 0));
                        return true;
                    }
                    break;
                case 42:
                    try {
                        String str4 = (String) obj;
                        this.A03 = C162407s0.A01(str4);
                        this.A0G = AnonymousClass6C9.A1P(str4);
                        this.A0E = true;
                    } catch (AnonymousClass6u2 e4) {
                        C159737mN.A00(r6, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_y value. ", e4);
                    }
                    View view7 = this.A0B;
                    if (view7 != null) {
                        view7.setPivotY(AnonymousClass6C9.A03(this.A03, C86664Kz.A02(view7), this.A0G ? 1 : 0));
                        return true;
                    }
                    break;
                case 43:
                    this.A01 = AnonymousClass001.A05(obj);
                    View view8 = this.A0B;
                    if (view8 != null) {
                        Context context = view8.getContext();
                        float f3 = this.A01;
                        if (f3 == 0.0f) {
                            f3 = 2.14748365E9f;
                        }
                        float A002 = C86604Kt.A00(context);
                        view8.setCameraDistance(A002 * A002 * (-f3) * C159747mO.A00);
                        return true;
                    }
                    break;
                case 44:
                    float A055 = AnonymousClass001.A05(obj);
                    this.A05 = A055;
                    View view9 = this.A0B;
                    if (view9 != null) {
                        view9.setRotationX(A055);
                        return true;
                    }
                    break;
                case 45:
                    float A056 = AnonymousClass001.A05(obj);
                    this.A06 = A056;
                    View view10 = this.A0B;
                    if (view10 != null) {
                        view10.setRotationY(A056);
                        break;
                    }
                    break;
                default:
                    return false;
            }
        } else {
            float A057 = AnonymousClass001.A05(obj);
            this.A00 = A057;
            View view11 = this.A0B;
            if (view11 != null) {
                view11.setAlpha(A057);
                return true;
            }
        }
        return true;
    }
}
