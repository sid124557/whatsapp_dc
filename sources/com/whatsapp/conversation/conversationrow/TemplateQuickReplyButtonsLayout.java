package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.C106365Yr;
import X.C106905aM;
import X.C109565ep;
import X.C116855qy;
import X.C162457s7;
import X.C179218in;
import X.C18270x1;
import X.C58932w3;
import X.C620733j;
import X.C626936e;
import X.C64333Db;
import X.C86614Ku;
import X.C86624Kv;
import X.C86644Kx;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class TemplateQuickReplyButtonsLayout extends ViewGroup implements AnonymousClass4GJ {
    public C106365Yr A00;
    public C620733j A01;
    public AnonymousClass1VX A02;
    public C116855qy A03;
    public List A04;
    public boolean A05;
    public View[] A06;
    public View[] A07;

    public void A01() {
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A01 = C64333Db.A2t(A002);
            this.A02 = C64333Db.A4B(A002);
            this.A00 = new C106365Yr(C86624Kv.A0Q(A002));
        }
    }

    public void A02(C179218in r12, List list) {
        boolean z;
        View view;
        View view2;
        int i;
        int i2;
        boolean A0X = this.A02.A0X(3444);
        ArrayList A0s = AnonymousClass001.A0s();
        if (!A0X && list != null) {
            for (int i3 = 0; i3 < list.size() && A0s.size() < 3; i3++) {
                if (((C58932w3) list.get(i3)).A06 == 1) {
                    A0s.add(list.get(i3));
                }
            }
        }
        this.A04 = A0s;
        boolean z2 = !A0s.isEmpty();
        setVisibility(AnonymousClass001.A08(z2 ? 1 : 0));
        if (z2) {
            int i4 = 0;
            do {
                if (this.A04.size() > i4) {
                    z = true;
                    C626936e.A0B(true);
                    View[] viewArr = this.A06;
                    if (viewArr[i4] == null) {
                        if (i4 != 0) {
                            i2 = R.id.quick_reply_btn_2;
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    i2 = R.id.quick_reply_btn_3;
                                }
                                C106905aM.A04((TextView) viewArr[i4]);
                            }
                        } else {
                            i2 = R.id.quick_reply_btn_1;
                        }
                        viewArr[i4] = findViewById(i2);
                        C106905aM.A04((TextView) viewArr[i4]);
                    }
                    view = viewArr[i4];
                } else {
                    z = false;
                    view = this.A06[i4];
                }
                TextView textView = (TextView) view;
                if (z) {
                    C626936e.A0B(true);
                    View[] viewArr2 = this.A07;
                    if (viewArr2[i4] == null) {
                        if (i4 != 0) {
                            i = R.id.quick_reply_btn_background_2;
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    i = R.id.quick_reply_btn_background_3;
                                }
                                View view3 = viewArr2[i4];
                                C626936e.A04(view3);
                                C86614Ku.A11(getContext(), view3, R.drawable.balloon_incoming_normal_stkr);
                            }
                        } else {
                            i = R.id.quick_reply_btn_background_1;
                        }
                        viewArr2[i4] = findViewById(i);
                        View view32 = viewArr2[i4];
                        C626936e.A04(view32);
                        C86614Ku.A11(getContext(), view32, R.drawable.balloon_incoming_normal_stkr);
                    }
                    view2 = viewArr2[i4];
                } else {
                    view2 = this.A07[i4];
                }
                if (!(textView == null || view2 == null)) {
                    textView.setVisibility(C86614Ku.A09(z));
                    view2.setVisibility(C86614Ku.A09(z));
                }
                if (z) {
                    C626936e.A04(textView);
                    C626936e.A04(view2);
                    boolean z3 = ((C58932w3) this.A04.get(i4)).A04;
                    C106365Yr r7 = this.A00;
                    C58932w3 r6 = (C58932w3) this.A04.get(i4);
                    C162457s7.A0J(textView, 0);
                    C18270x1.A10(r6, 1, r12);
                    textView.setText(r6.A08);
                    textView.setSelected(r6.A04);
                    textView.setOnClickListener(new C109565ep(r6, r7, textView, r12, 3));
                    view2.setContentDescription(((C58932w3) this.A04.get(i4)).A08);
                    view2.setClickable(!z3);
                    view2.setLongClickable(true);
                }
                i4++;
            } while (i4 < 3);
        }
    }

    public final boolean A03(int i, int i2) {
        if (this.A04.size() <= 1) {
            return false;
        }
        View[] viewArr = this.A06;
        int i3 = (i / 2) - (i2 * 2);
        if (viewArr[0].getMeasuredWidth() > i3 || viewArr[1].getMeasuredWidth() > i3) {
            return false;
        }
        return true;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r23 == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r27, int r28, int r29, int r30, int r31) {
        /*
            r26 = this;
            r12 = r26
            android.util.DisplayMetrics r1 = X.C86614Ku.A0E(r12)
            r11 = 1
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = android.util.TypedValue.applyDimension(r11, r0, r1)
            int r10 = (int) r0
            int r0 = r12.getMeasuredWidth()
            boolean r24 = r12.A03(r0, r10)
            int r0 = r12.getMeasuredWidth()
            boolean r23 = r12.A04(r0, r10)
            r2 = 0
            if (r24 == 0) goto L_0x0024
            r0 = 0
            if (r23 != 0) goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            X.C626936e.A0B(r0)
            android.util.DisplayMetrics r1 = X.C86614Ku.A0E(r12)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = android.util.TypedValue.applyDimension(r11, r0, r1)
            int r9 = (int) r0
            int r22 = r12.getRight()
            int r0 = r12.getLeft()
            int r22 = r22 - r0
            android.view.View[] r8 = r12.A06
            r2 = r8[r2]
            if (r2 == 0) goto L_0x0134
            android.util.DisplayMetrics r1 = X.C86614Ku.A0E(r2)
            r0 = 1093664768(0x41300000, float:11.0)
            float r0 = android.util.TypedValue.applyDimension(r11, r0, r1)
            int r1 = (int) r0
            android.widget.TextView r2 = (android.widget.TextView) r2
            float r0 = r2.getTextSize()
            int r0 = (int) r0
            int r7 = r1 * 2
            int r7 = r7 + r0
        L_0x0058:
            int r6 = r9 / 2
            r21 = r6
            r5 = 0
        L_0x005d:
            r1 = r8[r5]
            if (r1 == 0) goto L_0x0137
            android.view.View[] r2 = r12.A07
            r0 = r2[r5]
            if (r0 == 0) goto L_0x0137
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0137
            if (r5 != 0) goto L_0x00a3
            if (r24 != 0) goto L_0x00b0
        L_0x0071:
            int r4 = r12.getWidth()
            r3 = r8[r5]
            r16 = r2[r5]
            r0 = r22
            int r13 = X.C86634Kw.A08(r3, r0, r10)
            int r0 = X.AnonymousClass4L0.A05(r3, r7)
            int r15 = r0 / 2
            int r14 = -r9
            int r2 = r4 + r9
            int r1 = r7 + r6
            int r1 = r1 + r9
            r0 = r16
            r0.layout(r14, r6, r2, r1)
            int r1 = r6 + r15
            int r4 = r4 - r13
            int r0 = r3.getMeasuredHeight()
            int r0 = r0 + r1
            int r0 = r0 + r9
            r3.layout(r13, r1, r4, r0)
            int r5 = r5 + 1
        L_0x009e:
            int r6 = r6 + r7
            r0 = 3
            if (r5 >= r0) goto L_0x0137
            goto L_0x005d
        L_0x00a3:
            if (r5 != r11) goto L_0x0071
            if (r23 == 0) goto L_0x0071
            r1 = 2
            r0 = r8[r1]
            if (r0 == 0) goto L_0x0071
            r0 = r2[r1]
            if (r0 == 0) goto L_0x0071
        L_0x00b0:
            X.33j r0 = r12.A01
            boolean r0 = X.C102805Ki.A00(r0)
            if (r0 == 0) goto L_0x0125
            X.1VX r1 = r12.A02
            r0 = 2230(0x8b6, float:3.125E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0125
            int r13 = r12.getWidth()
            int r0 = r5 + 1
            r4 = r8[r0]
            r1 = r2[r0]
            r3 = r8[r5]
            r20 = r2[r5]
        L_0x00d0:
            int r2 = r13 / 2
            int r0 = X.AnonymousClass4L0.A05(r4, r7)
            int r0 = r0 / 2
            r19 = r0
            int r0 = X.AnonymousClass4L0.A05(r3, r7)
            int r0 = r0 / 2
            r18 = r0
            int r17 = X.C86634Kw.A08(r4, r2, r10)
            int r16 = X.C86634Kw.A08(r3, r2, r10)
            int r0 = -r9
            r25 = r0
            int r0 = r2 + r21
            int r15 = r7 + r6
            int r15 = r15 + r9
            r14 = r1
            r1 = r25
            r14.layout(r1, r6, r0, r15)
            int r1 = r2 - r21
            int r0 = r9 + r13
            r14 = r20
            r14.layout(r1, r6, r0, r15)
            int r14 = r19 + r6
            int r1 = r2 - r17
            r0 = r19
            int r15 = X.AnonymousClass4L0.A04(r4, r0)
            int r15 = r15 + r6
            r0 = r17
            r4.layout(r0, r14, r1, r15)
            int r2 = r2 + r16
            int r1 = r18 + r6
            int r13 = r13 - r16
            r0 = r18
            int r0 = X.AnonymousClass4L0.A04(r4, r0)
            int r0 = r0 + r6
            r3.layout(r2, r1, r13, r0)
            int r5 = r5 + 2
            goto L_0x009e
        L_0x0125:
            int r13 = r12.getWidth()
            r4 = r8[r5]
            r1 = r2[r5]
            int r0 = r5 + 1
            r3 = r8[r0]
            r20 = r2[r0]
            goto L_0x00d0
        L_0x0134:
            r7 = 0
            goto L_0x0058
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout.onLayout(boolean, int, int, int, int):void");
    }

    public TemplateQuickReplyButtonsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C86644Kx.A0m(context, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (A04(r10, r6) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r10) {
        /*
            r9 = this;
            android.util.DisplayMetrics r1 = X.C86614Ku.A0E(r9)
            r4 = 1
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            int r6 = (int) r0
            r8 = 0
            r7 = 0
        L_0x000e:
            android.view.View[] r5 = r9.A06
            r1 = r5[r7]
            if (r1 == 0) goto L_0x0030
            android.view.View[] r3 = r9.A07
            r0 = r3[r7]
            if (r0 == 0) goto L_0x0030
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0030
            r2 = r5[r7]
            int r0 = r6 * 2
            int r1 = r10 - r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            X.C86604Kt.A1C(r2, r1, r0)
            r0 = r3[r7]
            X.C86604Kt.A19(r0)
        L_0x0030:
            int r7 = r7 + 1
            r0 = 3
            if (r7 < r0) goto L_0x000e
            boolean r0 = r9.A03(r10, r6)
            if (r0 != 0) goto L_0x0042
            boolean r0 = r9.A04(r10, r6)
            r1 = 0
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r1 = 1
        L_0x0043:
            java.util.List r0 = r9.A04
            int r3 = r0.size()
            if (r1 == 0) goto L_0x004c
            int r3 = r3 - r4
        L_0x004c:
            r2 = r5[r8]
            if (r2 == 0) goto L_0x007e
            android.util.DisplayMetrics r1 = X.C86614Ku.A0E(r2)
            r0 = 1093664768(0x41300000, float:11.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            int r1 = (int) r0
            android.widget.TextView r2 = (android.widget.TextView) r2
            float r0 = r2.getTextSize()
            int r0 = (int) r0
            int r2 = r1 * 2
            int r2 = r2 + r0
        L_0x0065:
            int r2 = r2 * r3
            if (r2 == 0) goto L_0x0074
            android.util.DisplayMetrics r1 = X.C86614Ku.A0E(r9)
            r0 = 1090519040(0x41000000, float:8.0)
            float r0 = android.util.TypedValue.applyDimension(r4, r0, r1)
            int r0 = (int) r0
            int r2 = r2 + r0
        L_0x0074:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
            X.AnonymousClass001.A19(r9, r2, r1, r0)
            return r2
        L_0x007e:
            r2 = 0
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout.A00(int):int");
    }

    public final boolean A04(int i, int i2) {
        if (A03(i, i2) || this.A04.size() <= 2) {
            return false;
        }
        View[] viewArr = this.A06;
        int i3 = (i / 2) - (i2 * 2);
        if (viewArr[1].getMeasuredWidth() > i3 || viewArr[2].getMeasuredWidth() > i3) {
            return false;
        }
        return true;
    }

    public TemplateQuickReplyButtonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C86644Kx.A0m(context, this);
    }

    public TemplateQuickReplyButtonsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public TemplateQuickReplyButtonsLayout(Context context) {
        super(context);
        C86644Kx.A0m(context, this);
    }
}
