package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4ZC  reason: invalid class name */
public class AnonymousClass4ZC extends RecyclerView {
    public int A00 = -1;
    public int A01;
    public int A02 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    public int A03;
    public int A04 = -1;
    public View A05;
    public ViewGroup A06;
    public TextView A07;
    public AnonymousClass7HZ A08;
    public C156757h9 A09 = new C156757h9(this);
    public C156757h9 A0A = new C156757h9(this);
    public AnonymousClass4WA A0B;
    public C105895Wv A0C;
    public List A0D;
    public boolean A0E = false;

    public AnonymousClass4ZC(Context context, View view, ViewGroup viewGroup, TextView textView, AnonymousClass7HZ r10, C105895Wv r11) {
        super(context, (AttributeSet) null);
        this.A05 = view;
        this.A07 = textView;
        this.A06 = viewGroup;
        this.A0C = r11;
        this.A08 = r10;
        C86604Kt.A0z(getContext(), this, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        C86654Ky.A14(this, -1, -2);
        this.A0B = new AnonymousClass4WA();
        getContext();
        C18270x1.A0u(this);
        setAdapter(this.A0B);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r3 = r19
            r9 = r17
            android.view.View r0 = r9.A05
            boolean r0 = X.C105895Wv.A00(r0)
            if (r0 == 0) goto L_0x0113
            X.7h9 r8 = r9.A09
        L_0x000e:
            boolean r0 = r8.A03
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x004f
            r8.A03 = r5
            X.4ZC r0 = r8.A04
            android.view.View r0 = r0.A05
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 3
            X.AnonymousClass6AE.A00(r1, r8, r0)
        L_0x0024:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
        L_0x0028:
            int r0 = r9.getVisibility()
            if (r0 != 0) goto L_0x0047
            X.7HZ r1 = r9.A08
            int r2 = android.view.View.MeasureSpec.getSize(r3)
            X.5RH r0 = r1.A01
            X.5KX r1 = r1.A00
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0047
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r1.A05
            android.view.View r1 = r0.A01
            if (r2 <= 0) goto L_0x004d
            r0 = 8
        L_0x0044:
            r1.setVisibility(r0)
        L_0x0047:
            r0 = r18
            super.onMeasure(r0, r3)
            return
        L_0x004d:
            r0 = 0
            goto L_0x0044
        L_0x004f:
            X.4ZC r4 = r8.A04
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x0028
            int r10 = r4.A00
            r1 = -1
            if (r10 != r1) goto L_0x00fa
            int r0 = r4.A03
            if (r0 == r1) goto L_0x00ec
            int r0 = r4.A04
            if (r0 == r1) goto L_0x00e4
            int r12 = r0 + 1
        L_0x0064:
            r11 = 0
            r10 = 0
            r3 = 0
        L_0x0067:
            if (r11 >= r12) goto L_0x00ef
            X.4WA r0 = r4.A0B
            int r13 = r0.getItemViewType(r11)
            java.util.Map r2 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r2.get(r0)
            X.6Iw r1 = (X.C125656Iw) r1
            if (r1 != 0) goto L_0x0084
            X.6Iw r1 = X.AnonymousClass4WA.A00(r4, r13)
            r2.put(r0, r1)
        L_0x0084:
            java.util.List r0 = r4.A0D
            java.lang.Object r0 = r0.get(r11)
            X.7VI r0 = (X.AnonymousClass7VI) r0
            r1.A07(r0)
            android.view.ViewGroup r0 = r4.A06
            r16 = r0
            android.view.View r13 = r1.A0H
            int r0 = r16.getWidth()
            int r2 = X.C86664Kz.A05(r0)
            int r0 = r16.getHeight()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            if (r15 != 0) goto L_0x00b2
            r1 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r1, r0)
        L_0x00b2:
            int r1 = X.AnonymousClass000.A02(r16)
            int r0 = r15.width
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r2, r1, r0)
            int r1 = X.AnonymousClass000.A03(r16)
            int r0 = r15.height
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r14, r1, r0)
            r13.measure(r2, r0)
            int r2 = r13.getMeasuredHeight()
            int r1 = r4.A03
            int r0 = r1 + 1
            if (r11 >= r0) goto L_0x00d8
            if (r11 != r1) goto L_0x00e2
            int r0 = r2 / 2
        L_0x00d7:
            int r3 = r3 + r0
        L_0x00d8:
            int r0 = r4.A04
            if (r11 != r0) goto L_0x00de
            int r2 = r2 / 2
        L_0x00de:
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x0067
        L_0x00e2:
            r0 = r2
            goto L_0x00d7
        L_0x00e4:
            X.4WA r0 = r4.A0B
            int r12 = r0.A0G()
            goto L_0x0064
        L_0x00ec:
            int r10 = r4.A02
            goto L_0x00fa
        L_0x00ef:
            r4.A00 = r10
            r4.A01 = r3
            X.4WA r0 = r4.A0B
            java.util.Map r0 = r0.A00
            r0.clear()
        L_0x00fa:
            int r1 = r8.A01
            int r0 = r1 + r10
            int r2 = r8.A00
            if (r0 <= r2) goto L_0x0111
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x010d
            int r1 = r4.A01
            r0 = -1
            if (r1 == r0) goto L_0x010d
            if (r2 < r1) goto L_0x010d
            r6 = r2
        L_0x010d:
            r8.A02 = r5
            goto L_0x0024
        L_0x0111:
            r6 = r10
            goto L_0x010d
        L_0x0113:
            X.7h9 r8 = r9.A0A
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZC.onMeasure(int, int):void");
    }

    public void setData(String str, List list, C179298iv r7) {
        this.A0D = AnonymousClass001.A0s();
        if (str != null && !TextUtils.isEmpty(str)) {
            this.A0D.add(new C133646hi(str));
        }
        this.A00 = -1;
        this.A04 = -1;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                this.A0D.add(new C133656hj((C48492ez) list.get(i), r7));
                if (i == 0) {
                    this.A03 = AnonymousClass002.A03(this.A0D);
                } else if (i == 2) {
                    this.A04 = AnonymousClass002.A03(this.A0D);
                }
                this.A0D.add(new AnonymousClass7VI(3));
            }
        }
        this.A0B.A0L(this.A0D);
    }
}
