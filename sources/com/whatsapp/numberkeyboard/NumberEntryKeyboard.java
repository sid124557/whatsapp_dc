package com.whatsapp.numberkeyboard;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5Yj;
import X.AnonymousClass6C8;
import X.AnonymousClass74Q;
import X.AnonymousClass7I2;
import X.AnonymousClass7LC;
import X.C05040Rr;
import X.C100905Cs;
import X.C111685iW;
import X.C116855qy;
import X.C136956nX;
import X.C136966nY;
import X.C149917Ok;
import X.C159677mH;
import X.C171588Hq;
import X.C18280x3;
import X.C18290x4;
import X.C184508rw;
import X.C620633i;
import X.C620733j;
import X.C86604Kt;
import X.C86634Kw;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class NumberEntryKeyboard extends LinearLayout implements AnonymousClass4GJ {
    public static final int A0J = ((int) Math.floor(20.399999618530273d));
    public int A00;
    public int A01;
    public long A02;
    public Paint A03;
    public RectF A04;
    public View A05;
    public EditText A06;
    public C620633i A07;
    public C620733j A08;
    public AnonymousClass7LC A09;
    public C184508rw A0A;
    public C116855qy A0B;
    public Map A0C;
    public Map A0D;
    public boolean A0E;
    public boolean A0F;
    public View[][] A0G;
    public AnonymousClass7I2[][] A0H;
    public final View.OnTouchListener A0I;

    public final Object generatedComponent() {
        C116855qy r0 = this.A0B;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void setCustomKey(C184508rw r6) {
        this.A0A = r6;
        View[] viewArr = this.A0G[3];
        char c = 2;
        if (this.A08.A0T()) {
            c = 0;
        }
        ViewGroup viewGroup = (ViewGroup) viewArr[c];
        viewGroup.removeAllViews();
        if (r6 != null) {
            Context context = getContext();
            WaImageView waImageView = new WaImageView(context);
            waImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            waImageView.setImageResource(((C171588Hq) r6).A00);
            C05040Rr.A01(PorterDuff.Mode.SRC_IN, waImageView);
            AnonymousClass0x2.A0p(context, waImageView, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
            viewGroup.addView(waImageView);
        }
        invalidate();
    }

    public void setEditText(WaEditText waEditText) {
        this.A06 = waEditText;
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0F) {
            this.A0F = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4n(this);
        }
        this.A0C = AnonymousClass001.A0t();
        this.A02 = -1;
        this.A0I = new C159677mH(this, 11);
        A01(context, attributeSet);
    }

    public static C184508rw A00(C620733j r1) {
        if (AnonymousClass74Q.A00(r1).equals(".")) {
            return new C136966nY();
        }
        return new C136956nX();
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        KeyEvent.Callback callback;
        View[] viewArr;
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.custom_key_container);
        boolean z = false;
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, C100905Cs.A0D, 0, 0).getInteger(0, 0) == 1) {
            C184508rw A002 = A00(this.A08);
            this.A0A = A002;
            WaImageView waImageView = new WaImageView(context);
            waImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            waImageView.setImageResource(((C171588Hq) A002).A00);
            C05040Rr.A01(PorterDuff.Mode.SRC_IN, waImageView);
            AnonymousClass0x2.A0p(context, waImageView, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
            viewGroup.addView(waImageView);
        }
        View[][] viewArr2 = new View[4][];
        View[] viewArr3 = new View[3];
        if (this.A08.A0T()) {
            AnonymousClass6C8.A0y(this, viewArr3, R.id.one_key, 0);
            AnonymousClass6C8.A0y(this, viewArr3, R.id.two_key, 1);
            AnonymousClass6C8.A0y(this, viewArr3, R.id.three_key, 2);
            viewArr2[0] = viewArr3;
            View[] viewArr4 = new View[3];
            AnonymousClass6C8.A0y(this, viewArr4, R.id.four_key, 0);
            AnonymousClass6C8.A0y(this, viewArr4, R.id.five_key, 1);
            AnonymousClass6C8.A0y(this, viewArr4, R.id.six_key, 2);
            viewArr2[1] = viewArr4;
            View[] viewArr5 = new View[3];
            AnonymousClass6C8.A0y(this, viewArr5, R.id.seven_key, 0);
            AnonymousClass6C8.A0y(this, viewArr5, R.id.eight_key, 1);
            AnonymousClass6C8.A0y(this, viewArr5, R.id.nine_key, 2);
            viewArr2[2] = viewArr5;
            View[] viewArr6 = new View[3];
            viewArr6[0] = viewGroup;
            AnonymousClass6C8.A0y(this, viewArr6, R.id.zero_key, 1);
            viewArr = viewArr6;
            callback = findViewById(R.id.backspace_key);
        } else {
            AnonymousClass6C8.A0y(this, viewArr3, R.id.three_key, 0);
            AnonymousClass6C8.A0y(this, viewArr3, R.id.two_key, 1);
            AnonymousClass6C8.A0y(this, viewArr3, R.id.one_key, 2);
            viewArr2[0] = viewArr3;
            View[] viewArr7 = new View[3];
            AnonymousClass6C8.A0y(this, viewArr7, R.id.six_key, 0);
            AnonymousClass6C8.A0y(this, viewArr7, R.id.five_key, 1);
            AnonymousClass6C8.A0y(this, viewArr7, R.id.four_key, 2);
            viewArr2[1] = viewArr7;
            View[] viewArr8 = new View[3];
            AnonymousClass6C8.A0y(this, viewArr8, R.id.nine_key, 0);
            AnonymousClass6C8.A0y(this, viewArr8, R.id.eight_key, 1);
            AnonymousClass6C8.A0y(this, viewArr8, R.id.seven_key, 2);
            viewArr2[2] = viewArr8;
            View[] viewArr9 = new View[3];
            AnonymousClass6C8.A0y(this, viewArr9, R.id.backspace_key, 0);
            AnonymousClass6C8.A0y(this, viewArr9, R.id.zero_key, 1);
            callback = viewGroup;
            viewArr = viewArr9;
        }
        viewArr[2] = callback;
        viewArr2[3] = viewArr;
        this.A0G = viewArr2;
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, C100905Cs.A0D, 0, 0).getInteger(0, 0) == 1) {
            setCustomKey(A00(this.A08));
        }
        int dimensionPixelSize = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setOrientation(1);
        C86604Kt.A0z(getContext(), this, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        for (View[] viewArr10 : this.A0G) {
            int i = 0;
            while (true) {
                if (i >= viewArr10.length) {
                    break;
                }
                View view = viewArr10[i];
                if (view != null && (view instanceof TextView)) {
                    TextView textView = (TextView) view;
                    NumberFormat A0M = this.A08.A0M();
                    int id = view.getId();
                    int i2 = 0;
                    if (id != R.id.zero_key) {
                        i2 = 1;
                        if (id != R.id.one_key) {
                            i2 = 2;
                            if (id != R.id.two_key) {
                                i2 = 3;
                                if (id != R.id.three_key) {
                                    i2 = 4;
                                    if (id != R.id.four_key) {
                                        i2 = 5;
                                        if (id != R.id.five_key) {
                                            i2 = 6;
                                            if (id != R.id.six_key) {
                                                i2 = 7;
                                                if (id != R.id.seven_key) {
                                                    i2 = 9;
                                                    if (id == R.id.eight_key) {
                                                        i2 = 8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    textView.setText(A0M.format((long) i2));
                }
                i++;
            }
        }
        if (Settings.System.getFloat(this.A07.A0R().A00, "window_animation_scale", 1.0f) == 1.0f) {
            z = true;
        }
        this.A0E = z;
        if (z) {
            Paint paint = new Paint(1);
            this.A03 = paint;
            paint.setColor(AnonymousClass0Y8.A04(context, R.color.f5nameremoved));
            this.A03.setStyle(Paint.Style.FILL);
            C86634Kw.A18(this.A03, PorterDuff.Mode.SRC_OVER);
            this.A04 = AnonymousClass002.A07();
            this.A0D = AnonymousClass001.A0t();
            this.A09 = new AnonymousClass7LC(this);
        }
        setOnTouchListener(this.A0I);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0E) {
            Map map = this.A0D;
            Objects.requireNonNull(map);
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                C149917Ok r6 = (C149917Ok) this.A0D.get(A0i.next());
                Objects.requireNonNull(r6);
                PointF pointF = r6.A04;
                Objects.requireNonNull(pointF);
                float f = r6.A00;
                float f2 = pointF.x;
                float f3 = f / 2.0f;
                float f4 = pointF.y;
                RectF rectF = this.A04;
                Objects.requireNonNull(rectF);
                rectF.set(f2 - f3, f4 - f3, f2 + f3, f4 + f3);
                Paint paint = this.A03;
                Objects.requireNonNull(paint);
                paint.setAlpha(r6.A01);
                canvas.drawOval(this.A04, this.A03);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float A002 = AnonymousClass4L0.A00(this);
            float A022 = C86664Kz.A02(this);
            View[][] viewArr = this.A0G;
            int length = viewArr[0].length;
            float f2 = A002 / ((float) length);
            int length2 = viewArr.length;
            float f3 = A022 / ((float) length2);
            int floor = ((int) Math.floor((double) f2)) + 12;
            this.A00 = floor;
            this.A01 = (int) (((float) floor) / 2.0f);
            int[] A1Z = C86664Kz.A1Z();
            A1Z[1] = length;
            A1Z[0] = length2;
            this.A0H = (AnonymousClass7I2[][]) Array.newInstance(AnonymousClass7I2.class, A1Z);
            for (int i6 = 0; i6 < this.A0G.length; i6++) {
                int i7 = 0;
                while (true) {
                    View[][] viewArr2 = this.A0G;
                    int length3 = viewArr2[0].length;
                    if (i7 >= length3) {
                        break;
                    }
                    View view = viewArr2[i6][i7];
                    float f4 = ((float) i7) * f2;
                    float f5 = ((float) i6) * f3;
                    float f6 = f4 + f2;
                    float f7 = f5 + f3;
                    if (i7 == 0) {
                        i5 = getPaddingLeft();
                    } else if (i7 == length3 - 1) {
                        i5 = -getPaddingRight();
                    } else {
                        f = 0.0f;
                        AnonymousClass7I2 r1 = new AnonymousClass7I2(new PointF(((f4 + f6) / 2.0f) + f, (f5 + f7) / 2.0f), new RectF(f4, f5, f6, f7));
                        this.A0H[i6][i7] = r1;
                        this.A0C.put(view, r1);
                        i7++;
                    }
                    f = (float) i5;
                    AnonymousClass7I2 r12 = new AnonymousClass7I2(new PointF(((f4 + f6) / 2.0f) + f, (f5 + f7) / 2.0f), new RectF(f4, f5, f6, f7));
                    this.A0H[i6][i7] = r12;
                    this.A0C.put(view, r12);
                    i7++;
                }
            }
        }
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A0F) {
            this.A0F = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4n(this);
        }
        this.A0C = AnonymousClass001.A0t();
        this.A02 = -1;
        this.A0I = new C159677mH(this, 11);
        A01(context, attributeSet);
    }

    public NumberEntryKeyboard(Context context) {
        this(context, (AttributeSet) null);
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
