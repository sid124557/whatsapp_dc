package com.whatsapp.wds.components.fab;

import X.AnonymousClass0Y8;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5Yj;
import X.AnonymousClass6Z3;
import X.C000500m;
import X.C105515Vh;
import X.C106545Zk;
import X.C116855qy;
import X.C117105rO;
import X.C142726xf;
import X.C1462679k;
import X.C161877ql;
import X.C162457s7;
import X.C18290x4;
import X.C18300x5;
import X.C378924l;
import X.C58422vE;
import X.C64333Db;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.whatsapp.R;

public final class WDSFab extends AnonymousClass6Z3 implements AnonymousClass4GJ {
    public AnonymousClass1VX A00;
    public C142726xf A01;
    public C116855qy A02;
    public boolean A03;
    public boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSFab(Context context, AttributeSet attributeSet, int i) {
        super(C105515Vh.A00(new C000500m(context, (int) R.style.f12nameremoved), attributeSet, i, R.style.f12nameremoved), attributeSet, i);
        C162457s7.A0J(context, 1);
        if (!this.A03) {
            this.A03 = true;
            this.A00 = C64333Db.A4B(C88864av.A00(generatedComponent()));
        }
        C142726xf r4 = C142726xf.PRIMARY;
        this.A01 = r4;
        this.A04 = true;
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A08);
            int resourceId = A0X.getResourceId(0, 0);
            if (resourceId != 0) {
                C18300x5.A13(context, this, resourceId);
            }
            int i2 = A0X.getInt(1, 0);
            C142726xf[] values = C142726xf.values();
            if (i2 >= 0) {
                C162457s7.A0J(values, 0);
                if (i2 <= values.length - 1) {
                    r4 = values[i2];
                }
            }
            setWdsFabStyle(r4);
            A0X.recycle();
        }
        if (C106545Zk.A04(this.A00, (C58422vE) null, 4611)) {
            post(new C117105rO(this, 44));
        } else {
            A06();
        }
    }

    public final void A06() {
        setElevation(0.0f);
        setSize(-1);
        setImageTintList((ColorStateList) null);
        setBackgroundTintList((ColorStateList) null);
        C86664Kz.A1R(this);
        setShapeAppearanceModel(new C161877ql());
    }

    public void setShapeAppearanceModel(C161877ql r5) {
        C162457s7.A0J(r5, 0);
        if (this.A04) {
            C142726xf r3 = this.A01;
            r5 = C86624Kv.A0I(new C161877ql(), C86664Kz.A01(C18290x4.A0F(this).getResources(), r3.cornerRadius));
        }
        super.setShapeAppearanceModel(r5);
    }

    public final void setWdsFabStyle(C142726xf r2) {
        C162457s7.A0J(r2, 0);
        boolean A1W = C18300x5.A1W(this.A01, r2);
        this.A01 = r2;
        if (A1W) {
            A06();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        return this.A00;
    }

    public final C142726xf getWdsFabStyle() {
        return this.A01;
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.A04) {
            C142726xf r0 = this.A01;
            Context A0F = C18290x4.A0F(this);
            colorStateList = AnonymousClass0Y8.A07(A0F, AnonymousClass5Yj.A02(A0F, r0.backgroundAttrb, r0.background));
        }
        super.setBackgroundTintList(colorStateList);
    }

    public void setElevation(float f) {
        if (this.A04) {
            f = C86664Kz.A01(C18290x4.A0F(this).getResources(), this.A01.elevation);
        }
        super.setElevation(f);
    }

    public void setImageTintList(ColorStateList colorStateList) {
        if (this.A04) {
            C142726xf r0 = this.A01;
            Context A0F = C18290x4.A0F(this);
            colorStateList = AnonymousClass0Y8.A07(A0F, AnonymousClass5Yj.A02(A0F, r0.contentAttrb, r0.content));
        }
        super.setImageTintList(colorStateList);
    }

    public void setSize(int i) {
        if (this.A04) {
            i = this.A01.size;
        }
        super.setSize(i);
    }

    public final void setAbProps(AnonymousClass1VX r1) {
        this.A00 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSFab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ WDSFab(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSFab(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
