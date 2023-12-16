package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewOutlineProvider;
import java.io.IOException;
import java.util.Objects;

/* renamed from: X.84h  reason: invalid class name and case insensitive filesystem */
public class C1681484h implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        float f;
        float f2;
        int i;
        float f3;
        Paint paint;
        AnonymousClass6N7 r5 = (AnonymousClass6N7) obj;
        AnonymousClass6ND r7 = (AnonymousClass6ND) obj2;
        AnonymousClass84O r3 = r7.A07;
        if (r3 != null) {
            try {
                AnonymousClass6N4 r52 = (AnonymousClass6N4) r5;
                C153427bI r12 = r7.A0A;
                Objects.requireNonNull(r12);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    C147967Gk r1 = r7.A08;
                    r1.A00 = r52.getOutlineAmbientShadowColor();
                    r1.A01 = r52.getOutlineSpotShadowColor();
                }
                String str = (String) AnonymousClass84O.A05(r3, 48);
                if (str != null) {
                    float A01 = C162407s0.A01(str);
                    if (A01 != 0.0f) {
                        r52.setElevation(A01);
                        r52.setOutlineProvider(new C188738zP(r3, 1));
                        if (i2 >= 28) {
                            if (r3.A0K(68) != null) {
                                int i3 = r7.A08.A00;
                                AnonymousClass84O A0J = r3.A0K(68);
                                if (A0J != null) {
                                    i3 = C154127ce.A01(r12, A0J, i3);
                                }
                                r52.setOutlineAmbientShadowColor(i3);
                            }
                            if (r3.A0K(69) != null) {
                                int i4 = r7.A08.A01;
                                AnonymousClass84O A0J2 = r3.A0K(69);
                                if (A0J2 != null) {
                                    i4 = C154127ce.A01(r12, A0J2, i4);
                                }
                                r52.setOutlineSpotShadowColor(i4);
                            }
                        }
                    }
                }
                String str2 = (String) AnonymousClass84O.A05(r3, 46);
                if (str2 == null) {
                    f = 0.0f;
                } else {
                    f = C162407s0.A01(str2);
                }
                int i5 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (r3.A0W(43, false)) {
                    if (i5 != 0) {
                        r52.setOutlineProvider(new C125016Ev(r3, f));
                        String A08 = AnonymousClass84O.A08(r3);
                        if (A08 == null) {
                            f2 = 0.0f;
                        } else {
                            f2 = C162407s0.A01(A08);
                        }
                        int A00 = C159417ln.A00(r3.A0S(56), 0);
                        if (f2 != 0.0f || !C159417ln.A02(A00)) {
                            AnonymousClass7Q9 r53 = r52.A00;
                            r53.A04 = true;
                            r53.A0B.setLayerType(2, (Paint) null);
                            AnonymousClass84O A0J3 = r3.A0K(45);
                            String str3 = (String) AnonymousClass84O.A05(r3, 44);
                            if (str3 != null) {
                                i = C162407s0.A05(str3);
                            } else {
                                i = 0;
                            }
                            if (A0J3 != null) {
                                try {
                                    String str4 = (String) AnonymousClass84O.A05(A0J3, 35);
                                    if (str4 == null || C162407s0.A05(str4) == 0) {
                                        String A07 = AnonymousClass84O.A07(A0J3);
                                        if (A07 != null) {
                                            if (C162407s0.A05(A07) == 0) {
                                            }
                                        }
                                    }
                                } catch (AnonymousClass6u2 unused) {
                                    C159737mN.A01("ThemedColorUtils", "Error parsing themed color");
                                }
                                i = C154127ce.A01(r12, A0J3, 0);
                            }
                            int A002 = C159407lm.A00(r12, r3);
                            float[] A02 = C159407lm.A02(r3.A0S(62));
                            String str5 = (String) AnonymousClass84O.A05(r3, 63);
                            if (str5 == null) {
                                f3 = 0.0f;
                            } else {
                                f3 = C162407s0.A01(str5);
                            }
                            r53.A03 = A00;
                            r53.A02 = f;
                            Paint paint2 = r53.A06;
                            paint2.setColor(i);
                            if (i == 0) {
                                C86634Kw.A18(paint2, PorterDuff.Mode.CLEAR);
                            }
                            int i6 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                            if (i6 != 0) {
                                paint = r53.A05;
                                paint.setColor(A002);
                            } else {
                                paint = r53.A05;
                                paint.setColor(0);
                            }
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(f2);
                            if (i6 > 0 && A02 != null) {
                                paint.setPathEffect(new DashPathEffect(A02, f3));
                            }
                            Path path = r53.A08;
                            path.setFillType(Path.FillType.EVEN_ODD);
                            float f4 = f2 / 2.0f;
                            r53.A00 = f4;
                            r53.A01 = r53.A02 - f4;
                            path.reset();
                        } else {
                            r52.setClipToOutline(true);
                        }
                    }
                } else if (i5 != 0) {
                    r52.setOutlineProvider(new C188738zP(r3, 2));
                }
                Drawable drawable = r7.A05;
                Drawable drawable2 = r7.A04;
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
                if (drawable2 instanceof Animatable) {
                    ((Animatable) drawable2).start();
                    return null;
                }
            } catch (IOException e) {
                C159737mN.A00((C153427bI) null, "HostWithDecoratorRenderUnit", "Parse exception while binding Box Decoration", e);
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass6N7 r5 = (AnonymousClass6N7) obj;
        AnonymousClass6ND r6 = (AnonymousClass6ND) obj2;
        if (r6.A07 != null) {
            AnonymousClass6N4 r52 = (AnonymousClass6N4) r5;
            AnonymousClass7Q9 r0 = r52.A00;
            r0.A04 = false;
            r0.A0B.setLayerType(0, (Paint) null);
            r52.setElevation(0.0f);
            r52.setClipToOutline(false);
            r52.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            if (Build.VERSION.SDK_INT >= 28) {
                C147967Gk r1 = r6.A08;
                r52.setOutlineAmbientShadowColor(r1.A00);
                r52.setOutlineSpotShadowColor(r1.A01);
            }
            Drawable drawable = r6.A05;
            Drawable drawable2 = r6.A04;
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).stop();
            }
        }
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
