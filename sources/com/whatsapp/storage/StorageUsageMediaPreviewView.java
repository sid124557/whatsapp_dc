package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0RP;
import X.AnonymousClass30B;
import X.AnonymousClass4GJ;
import X.AnonymousClass4PU;
import X.AnonymousClass4t2;
import X.AnonymousClass5Yj;
import X.AnonymousClass8GZ;
import X.C107335b8;
import X.C116855qy;
import X.C117635sF;
import X.C1234268j;
import X.C166887zQ;
import X.C171238Gh;
import X.C53492nB;
import X.C620633i;
import X.C626936e;
import X.C64333Db;
import X.C84584Cx;
import X.C86624Kv;
import X.C86644Kx;
import X.C88864av;
import X.C95294tG;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.List;

public class StorageUsageMediaPreviewView extends LinearLayout implements AnonymousClass4GJ {
    public static final Bitmap A0C = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public int A00;
    public AnonymousClass30B A01;
    public C620633i A02;
    public C116855qy A03;
    public String A04;
    public List A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Drawable A0A;
    public final C53492nB A0B;

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setPreviewMediaItems(List list, int i, String str) {
        this.A05 = list;
        this.A00 = i;
        this.A04 = str;
        removeAllViews();
        if (list.size() == 0) {
            return;
        }
        if (getMeasuredWidth() == 0) {
            addOnLayoutChangeListener(new C166887zQ(this, str, list, i));
        } else {
            setPreviewMediaItemsInternal(list, i, str);
        }
    }

    public final void setPreviewMediaItemsInternal(List list, int i, String str) {
        ViewGroup.LayoutParams layoutParams;
        C95294tG r15;
        int measuredWidth = getMeasuredWidth();
        int i2 = this.A07;
        int i3 = (measuredWidth + (i2 / 2)) / i2;
        int measuredWidth2 = getMeasuredWidth();
        int i4 = this.A09;
        int i5 = (measuredWidth2 - ((i3 - 1) * i4)) / i3;
        List list2 = list;
        int min = Math.min(list2.size(), i3);
        Drawable A002 = AnonymousClass0RP.A00(getContext(), R.drawable.balloon_incoming_frame);
        int A032 = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        C626936e.A06(A002);
        Drawable A0B2 = C107335b8.A0B(A002, A032);
        for (int i6 = 0; i6 < min; i6++) {
            AnonymousClass8GZ r14 = (AnonymousClass8GZ) list2.get(i6);
            if (i6 != min - 1 || i <= min) {
                AnonymousClass4t2 r152 = new AnonymousClass4t2(getContext());
                r152.A00 = 3;
                r152.setFrameDrawable(A0B2);
                addView(r152);
                layoutParams = r152.getLayoutParams();
                r15 = r152;
            } else {
                C95294tG r153 = new C95294tG(getContext());
                AnonymousClass4PU r13 = new AnonymousClass4PU(getContext());
                int i7 = i - min;
                C95294tG r0 = r13.A00;
                if (r0 != null) {
                    r13.removeView(r0);
                }
                r13.addView(r153, 0);
                r13.A00 = r153;
                WaTextView waTextView = r13.A03;
                Context context = r13.getContext();
                Object[] A0L = AnonymousClass002.A0L();
                AnonymousClass000.A1P(A0L, i7, 0);
                AnonymousClass001.A0y(context, waTextView, A0L, R.string.f11nameremoved);
                r13.setFrameDrawable(A0B2);
                addView(r13);
                layoutParams = r13.getLayoutParams();
                r15 = r153;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i6 != 0) {
                marginLayoutParams.leftMargin = i4;
            }
            marginLayoutParams.width = i5;
            marginLayoutParams.height = i5;
            r15.setMediaItem(r14);
            C86644Kx.A1A(r15);
            r15.setSelector((Drawable) null);
            C53492nB r1 = this.A0B;
            r1.A01((C84584Cx) r15.getTag());
            C171238Gh r02 = new C171238Gh(r14, this, str, i5);
            r15.setTag(r02);
            r1.A02(r02, new C1234268j(r14, r15, r02, this, 2));
        }
    }

    public StorageUsageMediaPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A06) {
            this.A06 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A01 = C86624Kv.A0M(A002);
            this.A02 = C64333Db.A2o(A002);
        }
        setOrientation(0);
        this.A09 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A07 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int A032 = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A08 = A032;
        this.A0A = new ColorDrawable(A032);
        this.A0B = new C53492nB(AnonymousClass000.A0A(), this.A01, this.A02, "storage-usage-media-preview");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A05 != null && this.A04 != null) {
            post(new C117635sF(this, 39));
        }
    }

    public StorageUsageMediaPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StorageUsageMediaPreviewView(Context context) {
        this(context, (AttributeSet) null);
    }
}
