package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass4TB;
import X.AnonymousClass5MT;
import X.C06560Yg;
import X.C106905aM;
import X.C109715f4;
import X.C116855qy;
import X.C46532bn;
import X.C626936e;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

public class DynamicButtonsLayout extends ViewGroup implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public final List A02;
    public final View[] A03;
    public final View[] A04;

    public final View A02(int i) {
        int i2;
        C626936e.A0B(true);
        View[] viewArr = this.A04;
        if (viewArr[i] == null) {
            if (i != 0) {
                i2 = R.id.quick_reply_btn_background_2;
                if (i != 1) {
                    if (i == 2) {
                        i2 = R.id.quick_reply_btn_background_3;
                    }
                    View view = viewArr[i];
                    C626936e.A04(view);
                    C86614Ku.A11(getContext(), view, R.drawable.balloon_incoming_normal_stkr);
                }
            } else {
                i2 = R.id.quick_reply_btn_background_1;
            }
            viewArr[i] = findViewById(i2);
            View view2 = viewArr[i];
            C626936e.A04(view2);
            C86614Ku.A11(getContext(), view2, R.drawable.balloon_incoming_normal_stkr);
        }
        return viewArr[i];
    }

    public final View A03(int i) {
        int i2;
        C626936e.A0B(true);
        View[] viewArr = this.A03;
        if (viewArr[i] == null) {
            if (i != 0) {
                i2 = R.id.quick_reply_btn_2;
                if (i != 1) {
                    if (i == 2) {
                        i2 = R.id.quick_reply_btn_3;
                    }
                    C106905aM.A04((TextView) viewArr[i]);
                }
            } else {
                i2 = R.id.quick_reply_btn_1;
            }
            viewArr[i] = findViewById(i2);
            C106905aM.A04((TextView) viewArr[i]);
        }
        return viewArr[i];
    }

    public static final int A00(View view) {
        if (view == null) {
            return 0;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 11.0f, C86614Ku.A0E(view));
        int textSize = (int) ((TextView) view).getTextSize();
        return Math.max((applyDimension * 2) + textSize, (int) TypedValue.applyDimension(1, 40.0f, C86614Ku.A0E(view)));
    }

    public void A04(AnonymousClass5MT r8, List list) {
        boolean z;
        View view;
        View view2;
        List list2 = this.A02;
        list2.clear();
        int min = Math.min(3, list.size());
        for (int i = 0; i < min; i++) {
            list2.add(list.get(i));
        }
        int i2 = 0;
        do {
            if (list2.size() > i2) {
                z = true;
                view = A03(i2);
                view2 = A02(i2);
            } else {
                z = false;
                view = this.A04[i2];
                view2 = this.A03[i2];
            }
            if (!(view == null || view2 == null)) {
                int i3 = 8;
                view.setVisibility(C86614Ku.A09(z));
                if (z) {
                    i3 = 0;
                }
                view2.setVisibility(i3);
            }
            if (z) {
                TextView textView = (TextView) A03(i2);
                textView.setVisibility(0);
                textView.setText(((C46532bn) list2.get(i2)).A03);
                textView.setSelected(((C46532bn) list2.get(i2)).A00);
                View A022 = A02(i2);
                A022.setVisibility(0);
                if (((C46532bn) list2.get(i2)).A00) {
                    A022.setClickable(false);
                } else {
                    A022.setClickable(true);
                    C109715f4.A00(A022, this, r8, i2, 1);
                }
                A022.setContentDescription(((C46532bn) list2.get(i2)).A03);
                A022.setLongClickable(true);
                C06560Yg.A0O(A022, new AnonymousClass4TB(this, i2));
            }
            i2++;
        } while (i2 < 3);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, C86614Ku.A0E(this));
        int applyDimension2 = (int) TypedValue.applyDimension(1, 2.0f, C86614Ku.A0E(this));
        int right = getRight() - getLeft();
        View[] viewArr = this.A03;
        int i6 = 0;
        int A002 = A00(viewArr[0]);
        int measuredWidth = getMeasuredWidth();
        boolean z2 = false;
        if (this.A02.size() == 2 && viewArr[0].getMeasuredWidth() <= (i5 = (measuredWidth / 2) - (applyDimension * 2)) && viewArr[1].getMeasuredWidth() <= i5) {
            z2 = true;
        }
        int i7 = applyDimension2 / 2;
        int i8 = i7;
        do {
            View view = viewArr[i6];
            if (view != null) {
                View[] viewArr2 = this.A04;
                if (viewArr2[i6] != null && view.getVisibility() == 0) {
                    if (i6 != 0 || !z2) {
                        int width = getWidth();
                        View view2 = viewArr[i6];
                        View view3 = viewArr2[i6];
                        int A08 = C86634Kw.A08(view2, right, applyDimension);
                        int A05 = AnonymousClass4L0.A05(view2, A002) / 2;
                        view3.layout(-applyDimension2, i7, width + applyDimension2, A002 + i7 + applyDimension2);
                        int i9 = i7 + A05;
                        view2.layout(A08, i9, width - A08, view2.getMeasuredHeight() + i9 + applyDimension2);
                        i6++;
                    } else {
                        int width2 = getWidth();
                        View view4 = viewArr[0];
                        View view5 = viewArr2[0];
                        View view6 = viewArr[1];
                        View view7 = viewArr2[1];
                        int i10 = width2 / 2;
                        int A052 = AnonymousClass4L0.A05(view4, A002) / 2;
                        int A053 = AnonymousClass4L0.A05(view6, A002) / 2;
                        int A082 = C86634Kw.A08(view4, i10, applyDimension);
                        int A083 = C86634Kw.A08(view6, i10, applyDimension);
                        int i11 = A002 + i7 + applyDimension2;
                        view5.layout(-applyDimension2, i7, i10 + i8, i11);
                        view7.layout(i10 - i8, i7, width2 + applyDimension2, i11);
                        view4.layout(A082, A052 + i7, i10 - A082, AnonymousClass4L0.A04(view4, A052) + i7);
                        view6.layout(i10 + A083, A053 + i7, width2 - A083, AnonymousClass4L0.A04(view4, A053) + i7);
                        i6 = 2;
                    }
                    i7 += A002;
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (i6 < 3);
    }

    public DynamicButtonsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = new View[3];
        this.A04 = new View[3];
        this.A02 = AnonymousClass001.A0s();
        View.inflate(context, R.layout.f8nameremoved, this);
    }

    public int A01(int i) {
        View[] viewArr;
        int i2;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, C86614Ku.A0E(this));
        boolean z = false;
        int i3 = 0;
        do {
            viewArr = this.A03;
            View view = viewArr[i3];
            if (view != null) {
                View[] viewArr2 = this.A04;
                if (viewArr2[i3] != null && view.getVisibility() == 0) {
                    C86604Kt.A1C(viewArr[i3], i - (applyDimension * 2), Integer.MIN_VALUE);
                    C86604Kt.A19(viewArr2[i3]);
                }
            }
            i3++;
        } while (i3 < 3);
        List list = this.A02;
        if (list.size() == 2 && viewArr[0].getMeasuredWidth() <= (i2 = (i / 2) - (applyDimension * 2)) && viewArr[1].getMeasuredWidth() <= i2) {
            z = true;
        }
        int size = list.size();
        if (z) {
            size--;
        }
        int A002 = A00(viewArr[0]) * size;
        if (A002 != 0) {
            A002 += (int) TypedValue.applyDimension(1, 1.0f, C86614Ku.A0E(this));
        }
        AnonymousClass001.A19(this, A002, 1073741824, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
        return A002;
    }

    public DynamicButtonsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicButtonsLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
