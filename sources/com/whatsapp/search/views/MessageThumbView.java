package com.whatsapp.search.views;

import X.AnonymousClass1n2;
import X.AnonymousClass1n3;
import X.AnonymousClass35V;
import X.C100465Ba;
import X.C107295b4;
import X.C18320x8;
import X.C185528tp;
import X.C30471mV;
import X.C31961pA;
import X.C31971pB;
import X.C31991pD;
import X.C33141sV;
import X.C620733j;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class MessageThumbView extends WaImageView {
    public int A00;
    public C30471mV A01;
    public C33141sV A02;
    public boolean A03;
    public final C185528tp A04;

    private int getNotDownloadedContentDescription() {
        C30471mV r1 = this.A01;
        if ((r1 instanceof AnonymousClass1n2) || (r1 instanceof AnonymousClass1n3) || (r1 instanceof C31961pA) || (r1 instanceof C31971pB) || (r1 instanceof C31991pD)) {
            return R.string.f11nameremoved;
        }
        return -1;
    }

    public void setMessage(C30471mV r3) {
        if (this.A02 != null) {
            this.A01 = r3;
            C185528tp r1 = this.A04;
            r1.Bp1(this);
            this.A02.A09(this, r3, r1);
        }
    }

    public void setStatus(int i) {
        Resources resources;
        int i2;
        String A032;
        if (this.A00 != null && this.A01 != null) {
            C107295b4.A01(this);
            if (i == 0 || i == 1) {
                resources = getResources();
                i2 = R.string.f11nameremoved;
            } else if (i == 2 || i == 3) {
                resources = getResources();
                i2 = R.string.f11nameremoved;
            } else {
                C107295b4.A03(this, R.string.f11nameremoved);
                setOnClickListener((View.OnClickListener) null);
                int notDownloadedContentDescription = getNotDownloadedContentDescription();
                if (notDownloadedContentDescription != -1) {
                    Resources resources2 = getResources();
                    Object[] objArr = new Object[1];
                    C620733j r5 = this.A00;
                    long j = this.A01.A00;
                    if (j <= 0) {
                        A032 = "";
                    } else {
                        A032 = AnonymousClass35V.A03(r5, j);
                    }
                    setContentDescription(C18320x8.A0b(resources2, A032, objArr, 0, notDownloadedContentDescription));
                    return;
                }
                return;
            }
            setContentDescription(resources.getString(i2));
            setOnClickListener((View.OnClickListener) null);
        }
    }

    public MessageThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A04 = new C100465Ba(this, 16);
    }

    public void setRadius(int i) {
        this.A00 = i;
    }

    public MessageThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A04 = new C100465Ba(this, 16);
    }

    public MessageThumbView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public MessageThumbView(Context context) {
        this(context, (AttributeSet) null);
    }
}
