package com.whatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass6E9;
import X.C18330xA;
import X.C86614Ku;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SeeMoreTextView extends WaTextView {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03 = false;
    public final Paint A04 = C86664Kz.A0Z();

    public void onMeasure(int i, int i2) {
        int size;
        SpannableStringBuilder A002;
        ArrayList arrayList;
        int i3 = i;
        if (!this.A03 && (size = View.MeasureSpec.getSize(i3) - AnonymousClass000.A02(this)) > 0) {
            String A0u = C86614Ku.A0u(this);
            String A0u2 = C86614Ku.A0u(this);
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (String str : A0u2.split("\\s")) {
                Paint paint = this.A04;
                float f = (float) size;
                if (paint.measureText(str) < f) {
                    A07(paint, str, A0s, A0s2, size);
                } else {
                    if (!TextUtils.isEmpty(str) && paint.measureText(str) > f) {
                        ArrayList A0s3 = AnonymousClass001.A0s();
                        int i4 = 1;
                        int i5 = 0;
                        while (true) {
                            int length = str.length();
                            if (i4 > length) {
                                arrayList = A0s3;
                                break;
                            }
                            if (paint.measureText(str.substring(i5, i4)) >= f) {
                                int i6 = i4 - 1;
                                A0s3.add(str.substring(i5, i6));
                                i5 = i6;
                            }
                            if (i4 == length) {
                                A0s3.add(str.substring(i5, i4));
                            }
                            i4++;
                        }
                    } else {
                        arrayList = Collections.singletonList(str);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        A07(paint, AnonymousClass001.A0m(it), A0s, A0s2, size);
                    }
                }
            }
            if (!A0s2.isEmpty()) {
                A0s.add(TextUtils.join(" ", A0s2));
            }
            if (A0s.size() > 3) {
                if (A0s.size() <= 3) {
                    A002 = C18330xA.A00(TextUtils.join("\n", A0s));
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(this.A00);
                    String A0X = AnonymousClass000.A0X(this.A02, A0o);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    int i7 = 0;
                    while (true) {
                        String A1M = C86664Kz.A1M(A0s, i7);
                        if (i7 != 2) {
                            A0o2.append(A1M);
                            A0o2.append("\n");
                            i7++;
                            if (i7 >= 3) {
                                break;
                            }
                        } else {
                            A0o2.append(A1M.subSequence(0, AnonymousClass001.A0C(A1M.length(), A0X.length(), 0)));
                            A0o2.append(A0X);
                            break;
                        }
                    }
                    String obj = A0o2.toString();
                    A002 = C18330xA.A00(obj);
                    A002.setSpan(new AnonymousClass6E9(this), obj.indexOf(A0X), obj.length(), 0);
                }
                if (!A0u.equals(A002.toString())) {
                    C86654Ky.A1E(this);
                    super.setText(A002, TextView.BufferType.SPANNABLE);
                }
            } else {
                String join = TextUtils.join("\n", A0s);
                if (!A0u.equals(join)) {
                    super.setText(join);
                }
            }
        }
        super.onMeasure(i3, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.A03 = bundle.getBoolean("is_expanded");
            String string = bundle.getString("original_text");
            if (string == null) {
                string = "";
            }
            this.A01 = string;
            parcelable = bundle.getParcelable("super_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setText(String str) {
        this.A01 = str;
        super.setText(str);
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0D();
    }

    public static void A07(Paint paint, String str, ArrayList arrayList, ArrayList arrayList2, int i) {
        arrayList2.add(str);
        if (paint.measureText(TextUtils.join(" ", arrayList2)) >= ((float) i)) {
            arrayList2.remove(C86664Kz.A0M(arrayList2));
            arrayList.add(TextUtils.join(" ", arrayList2));
            arrayList2.clear();
            arrayList2.add(str);
        }
    }

    public final void A0D() {
        this.A00 = getContext().getString(R.string.f11nameremoved);
        this.A02 = getContext().getString(R.string.f11nameremoved);
        this.A01 = C86614Ku.A0u(this);
        Paint paint = this.A04;
        paint.setTextSize(getTextSize());
        paint.setTypeface(getTypeface());
    }

    public Parcelable onSaveInstanceState() {
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("super_state", super.onSaveInstanceState());
        A08.putBoolean("is_expanded", this.A03);
        A08.putString("original_text", this.A01);
        return A08;
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0D();
    }

    public SeeMoreTextView(Context context) {
        super(context);
        A0D();
    }
}
