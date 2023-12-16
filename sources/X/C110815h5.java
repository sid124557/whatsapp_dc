package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import java.util.Comparator;

/* renamed from: X.5h5  reason: invalid class name and case insensitive filesystem */
public abstract class C110815h5 implements C180238ki {
    public static int A0D;
    public static final Comparator A0E = new AnonymousClass91S(3);
    public double A00;
    public double A01;
    public float A02;
    public int A03 = 1;
    public boolean A04 = true;
    public final float A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final C110885hC A09;
    public final C106725a3 A0A;
    public final C157467iL A0B = new C157467iL();
    public final float[] A0C = AnonymousClass4L0.A0T();

    public abstract void A0B(Canvas canvas);

    public int A01(float f, float f2) {
        if (this instanceof AnonymousClass4Zh) {
            AnonymousClass4Zh r1 = (AnonymousClass4Zh) this;
            if (r1.A0B == null || !r1.A0A.contains(f, f2)) {
                return 0;
            }
            return 1;
        } else if (this instanceof AnonymousClass4Zf) {
            AnonymousClass4Zf r4 = (AnonymousClass4Zf) this;
            float f3 = r4.A04;
            float f4 = r4.A05;
            float f5 = f3 - f4;
            if (f >= f5 && f <= f3) {
                float f6 = r4.A06;
                if (f2 >= f6 && f2 <= f6 + f4) {
                    r4.A0D = true;
                    return 2;
                }
            }
            float f7 = r4.A03;
            if (f >= f5 - f7 && f <= f3 + f7) {
                float f8 = r4.A06;
                if (f2 >= f8 - f7 && f2 <= f8 + f4 + f7) {
                    r4.A0D = true;
                    return 1;
                }
            }
            r4.A0D = false;
            return 0;
        } else if (this instanceof AnonymousClass4Ze) {
            AnonymousClass4Ze r3 = (AnonymousClass4Ze) this;
            float f9 = r3.A01;
            float f10 = r3.A03;
            if (f >= f9 - f10 && f <= f9 + f10) {
                float f11 = r3.A02;
                if (f2 >= f11 - f10 && f2 <= f11 + f10) {
                    return 2;
                }
            }
            float f12 = r3.A09;
            if (f < f9 - f12 || f > f9 + f12) {
                return 0;
            }
            float f13 = r3.A02;
            if (f2 < f13 - f12 || f2 > f13 + f12) {
                return 0;
            }
            return 1;
        } else if (this instanceof AnonymousClass4Zd) {
            AnonymousClass4Zd r12 = (AnonymousClass4Zd) this;
            if (!r12.A05.contains(f, f2)) {
                return AnonymousClass000.A1S(r12.A06.contains(f, f2) ? 1 : 0) ? 1 : 0;
            }
            return 2;
        }
        return 0;
    }

    public void A02() {
        this.A09.A0R.invalidate();
    }

    public void A03() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this instanceof AnonymousClass4Ze) {
            AnonymousClass4Ze r4 = (AnonymousClass4Ze) this;
            float f6 = r4.A05;
            float f7 = ((float) 0) + f6;
            float f8 = f6 + ((float) r4.A09.A06);
            float f9 = r4.A03;
            r4.A01 = f7 + f9;
            r4.A02 = f8 + f9;
        } else if (this instanceof AnonymousClass4Zd) {
            AnonymousClass4Zd r6 = (AnonymousClass4Zd) this;
            C110885hC r7 = r6.A09;
            AnonymousClass4PH r2 = r7.A0R;
            Rect rect = r6.A04;
            Drawable drawable = r6.A07;
            rect.set(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int ordinal = r6.A08.ordinal();
            if (ordinal == 0) {
                f = r6.A00;
                f4 = ((float) 0) + f;
                f3 = f + ((float) r7.A06);
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    f5 = r6.A00;
                    f2 = (((float) (r2.getWidth() - rect.width())) - f5) - ((float) r7.A05);
                } else {
                    f5 = r6.A00;
                    f2 = f5 + ((float) 0);
                }
                f3 = (((float) (r2.getHeight() - rect.height())) - f5) - ((float) r7.A04);
            } else {
                f = r6.A00;
                f4 = (((float) (r2.getWidth() - rect.width())) - f) - ((float) r7.A05);
                f3 = f + ((float) r7.A06);
            }
            RectF rectF = r6.A05;
            rectF.set(rect);
            rectF.offsetTo(f2, f3);
            rect.offsetTo((int) f2, (int) f3);
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            RectF rectF2 = r6.A06;
            float f10 = r6.A02;
            rectF2.set(centerX - f10, centerY - f10, centerX + f10, centerY + f10);
        }
    }

    public void A04() {
    }

    public void A05() {
        this.A09.A0D(this);
    }

    public void A06(float f) {
        C110885hC r0 = this.A09;
        r0.A0D(this);
        this.A02 = f;
        r0.A0C(this);
    }

    public void A07(float f, float f2) {
        if (this instanceof AnonymousClass4Zf) {
            A02();
        }
    }

    public void A08(float f, float f2) {
        if (this instanceof AnonymousClass4Zf) {
            AnonymousClass4Zf r1 = (AnonymousClass4Zf) this;
            r1.A0D = false;
            r1.A02();
        }
    }

    public void A09(boolean z) {
        this.A04 = z;
        A02();
    }

    public boolean A0A(float f, float f2) {
        int i;
        C110885hC r2;
        AnonymousClass7UM r1;
        if (this instanceof AnonymousClass4Zh) {
            AnonymousClass4Zh r22 = (AnonymousClass4Zh) this;
            AnonymousClass5MM r12 = r22.A0B;
            if (r12 == null || !r22.A0A.contains(f, f2)) {
                return false;
            }
            r12.A00(r22.A02, r22);
            return true;
        }
        if (this instanceof AnonymousClass4Zf) {
            r2 = this.A09;
            r2.A0R.A0T.BlT("my_location_button_click");
            Location location = r2.A0V.A00;
            if (location == null) {
                return true;
            }
            r1 = C153847c7.A01(C108975ds.A01(location), 15.0f);
        } else if (this instanceof AnonymousClass4Ze) {
            r2 = this.A09;
            r1 = new AnonymousClass7UM();
            r1.A00 = 0.0f;
        } else if (!(this instanceof AnonymousClass4Zd)) {
            return false;
        } else {
            AnonymousClass4Zd r3 = (AnonymousClass4Zd) this;
            C110885hC r0 = r3.A09;
            C166477yk A022 = r0.A02();
            AnonymousClass4PH r13 = r0.A0R;
            C156807hE r23 = r3.A01;
            Context context = r3.A08;
            int width = r13.getWidth();
            int height = r13.getHeight();
            Resources resources = r0.A0P.getResources();
            String str = C161247pI.A04;
            C108645dK r32 = new C108645dK(r13.A0N.A04);
            r32.A04 = "InfoButtonDrawable.java";
            C108975ds r9 = A022.A03;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(r9.A00);
            A0o.append(",");
            A0o.append(r9.A01);
            r32.A02 = A0o.toString();
            r32.A0B = String.valueOf((int) A022.A02);
            int i2 = 2;
            if (resources.getDisplayMetrics().density < 1.5f) {
                i2 = 1;
            }
            float f3 = resources.getDisplayMetrics().density;
            if (f3 < 1.5f) {
                i = 1;
            } else {
                i = 3;
                if (f3 < 2.5f) {
                    i = 2;
                }
            }
            C161247pI.A02(C161247pI.A06);
            Uri.Builder buildUpon = Uri.parse(C161247pI.A0B.A03).buildUpon();
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append(width / i2);
            A0o2.append("x");
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("size", AnonymousClass000.A0h(A0o2, height / i2)).appendQueryParameter("scale", String.valueOf(i2)).appendQueryParameter("marker_scale", String.valueOf(i)).appendQueryParameter("language", str);
            String str2 = r32.A05;
            if (str2 == null) {
                str2 = "jpg";
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("format", str2);
            String str3 = r32.A0A;
            if (str3 != null) {
                appendQueryParameter2.appendQueryParameter("visible", str3);
            }
            String str4 = r32.A03;
            if (str4 != null) {
                appendQueryParameter2.appendQueryParameter("circle", str4);
            }
            String str5 = r32.A06;
            if (str5 != null) {
                appendQueryParameter2.appendQueryParameter("markers", str5);
            }
            String str6 = r32.A07;
            if (str6 != null) {
                appendQueryParameter2.appendQueryParameter("path", str6);
            }
            String str7 = r32.A02;
            if (str7 != null) {
                appendQueryParameter2.appendQueryParameter("center", str7);
            }
            String str8 = r32.A0B;
            if (str8 != null) {
                appendQueryParameter2.appendQueryParameter("zoom", str8);
            }
            int size = r32.A0C.size();
            for (int i3 = 0; i3 < size; i3++) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("marker_list[");
                A0o3.append(i3);
                String A0X = AnonymousClass000.A0X("]", A0o3);
                String A0n = AnonymousClass001.A0n(r32.A0C, i3);
                if (A0n != null) {
                    appendQueryParameter2.appendQueryParameter(A0X, A0n);
                }
            }
            String str9 = r32.A09;
            if (str9 != null) {
                appendQueryParameter2.appendQueryParameter("theme", str9);
            }
            String str10 = r32.A04;
            if (str10 == null) {
                str10 = "StaticMapView.java";
            }
            appendQueryParameter2.appendQueryParameter("_nc_client_caller", str10);
            String str11 = r32.A08;
            if (str11 != null) {
                appendQueryParameter2.appendQueryParameter("_nc_client_id", str11);
            }
            ((AnonymousClass6KT) r23).A00.A0A.BkW(context, C18290x4.A0H(Uri.parse("https://mbasic.facebook.com/maps/information/?").buildUpon(), "static_map_url", appendQueryParameter2.build().toString()), (C624134x) null);
            return true;
        }
        r2.A09(r1);
        return true;
    }

    public C108975ds BBX() {
        return C108975ds.A00(C106725a3.A02(this.A01), (this.A00 * 360.0d) - 180.0d);
    }

    public C110815h5(C110885hC r3) {
        int i = A0D;
        A0D = i + 1;
        this.A06 = i;
        this.A09 = r3;
        this.A0A = r3.A0S;
        Context context = r3.A0R.getContext();
        this.A08 = context;
        this.A05 = C86604Kt.A00(context);
        this.A07 = r3.A0O;
    }
}
