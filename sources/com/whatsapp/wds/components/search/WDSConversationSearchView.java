package com.whatsapp.wds.components.search;

import X.AnonymousClass0VX;
import X.AnonymousClass0Y9;
import X.AnonymousClass0YY;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5Q8;
import X.AnonymousClass6C1;
import X.AnonymousClass75T;
import X.C116855qy;
import X.C141366vS;
import X.C1462679k;
import X.C15610re;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C1892090k;
import X.C620633i;
import X.C64333Db;
import X.C86634Kw;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

public final class WDSConversationSearchView extends FrameLayout implements AnonymousClass4GJ {
    public Drawable A00;
    public View.OnClickListener A01;
    public EditText A02;
    public ImageButton A03;
    public Toolbar A04;
    public WaImageButton A05;
    public C620633i A06;
    public AnonymousClass1VX A07;
    public AnonymousClass5Q8 A08;
    public C141366vS A09;
    public C116855qy A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSConversationSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f3nameremoved);
        C162457s7.A0J(context, 1);
        if (!this.A0G) {
            this.A0G = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A07 = C64333Db.A4B(A002);
            this.A06 = C64333Db.A2o(A002);
        }
        this.A09 = C141366vS.NORMAL;
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A06);
            if (A0X.getResourceId(1, 0) != 0) {
                this.A0B = A0X.getString(1);
            }
            if (A0X.getResourceId(0, 0) != 0) {
                this.A0C = A0X.getString(1);
            }
            this.A00 = A0X.getDrawable(2);
            this.A0E = A0X.getBoolean(4, false);
            this.A0F = A0X.getBoolean(5, false);
            this.A0D = A0X.getBoolean(3, false);
            setVariant(AnonymousClass75T.A00(A0X.getInt(6, 0)));
            A0X.recycle();
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        this.A04 = (Toolbar) C18290x4.A0M(this, R.id.search_view_toolbar);
        this.A03 = (ImageButton) C18290x4.A0M(this, R.id.search_view_clear_button);
        this.A02 = (EditText) C18290x4.A0M(this, R.id.search_view_edit_text);
        this.A05 = (WaImageButton) C18290x4.A0M(this, R.id.search_by_date_button);
        AnonymousClass5Q8 r0 = new AnonymousClass5Q8(C18290x4.A0F(this), this.A09);
        this.A08 = r0;
        AnonymousClass0YY.A04(r0.A01(), this.A04);
        Drawable drawable = this.A00;
        if (drawable == null && !this.A0E) {
            drawable = AnonymousClass0VX.A01(getContext(), R.drawable.vec_ic_nav_search);
            this.A00 = drawable;
        }
        setNavigationIcon(drawable);
        Toolbar toolbar = this.A04;
        if (this.A08 == null) {
            throw C18270x1.A0S("style");
        }
        toolbar.setPopupTheme(R.style.f12nameremoved);
        EditText editText = this.A02;
        if (this.A08 == null) {
            throw C18270x1.A0S("style");
        }
        AnonymousClass0Y9.A06(editText, R.style.f12nameremoved);
        setHint(this.A0B);
        setText(this.A0C);
        if (this.A0D) {
            editText.setClickable(false);
            editText.setFocusable(false);
            editText.setKeyListener((KeyListener) null);
            editText.setCursorVisible(false);
        } else {
            editText.addTextChangedListener(new AnonymousClass6C1(this, 3));
            editText.setOnFocusChangeListener(new C1892090k(this, 7));
        }
        if (!this.A0F && !this.A0D) {
            ImageButton imageButton = this.A03;
            AnonymousClass5Q8 r1 = this.A08;
            if (r1 == null) {
                throw C18270x1.A0S("style");
            }
            imageButton.setImageDrawable(r1.A00(imageButton.getDrawable()));
            C18320x8.A14(imageButton, this, 19);
        }
        if (getAbProps().A0X(6478)) {
            this.A05.setVisibility(0);
            WaImageButton waImageButton = this.A05;
            AnonymousClass5Q8 r12 = this.A08;
            if (r12 == null) {
                throw C18270x1.A0S("style");
            }
            waImageButton.setImageDrawable(r12.A00(waImageButton.getDrawable()));
            this.A05.setContentDescription(super.getResources().getString(R.string.f11nameremoved));
        }
    }

    public static final void setUpClearButton$lambda$5(WDSConversationSearchView wDSConversationSearchView, View view) {
        C162457s7.A0J(wDSConversationSearchView, 0);
        C86634Kw.A1I(wDSConversationSearchView.A02);
        wDSConversationSearchView.A00();
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        C162457s7.A0J(onClickListener, 0);
        this.A04.setNavigationOnClickListener(onClickListener);
    }

    public final void setOnSearchByDateListener(View.OnClickListener onClickListener) {
        C162457s7.A0J(onClickListener, 0);
        this.A05.setOnClickListener(onClickListener);
    }

    public final void setSearchByDate(WaImageButton waImageButton) {
        C162457s7.A0J(waImageButton, 0);
        this.A05 = waImageButton;
    }

    public final void setSystemServices(C620633i r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setVariant(C141366vS r4) {
        C162457s7.A0J(r4, 0);
        boolean A1W = C18300x5.A1W(this.A09, r4);
        this.A09 = r4;
        if (A1W) {
            AnonymousClass5Q8 r0 = new AnonymousClass5Q8(C18290x4.A0F(this), this.A09);
            this.A08 = r0;
            AnonymousClass0YY.A04(r0.A01(), this.A04);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        if (this.A0D && motionEvent != null && motionEvent.getAction() == 1 && (onClickListener = this.A01) != null) {
            onClickListener.onClick(this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final EditText getEditText() {
        return this.A02;
    }

    public final CharSequence getHint() {
        return this.A02.getHint();
    }

    public final WaImageButton getSearchByDate() {
        return this.A05;
    }

    public final C620633i getSystemServices() {
        C620633i r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemServices");
    }

    public final Editable getText() {
        return this.A02.getText();
    }

    public final Toolbar getToolbar() {
        return this.A04;
    }

    public final C141366vS getVariant() {
        return this.A09;
    }

    public final void setHint(int i) {
        this.A02.setHint(i);
    }

    public final void setNavigationIcon(Drawable drawable) {
        Toolbar toolbar = this.A04;
        AnonymousClass5Q8 r0 = this.A08;
        if (r0 == null) {
            throw C18270x1.A0S("style");
        }
        toolbar.setNavigationIcon(r0.A00(drawable));
    }

    public final void setOnMenuItemClickListener(C15610re r2) {
        this.A04.A0R = r2;
    }

    public final void setText(int i) {
        this.A02.setText(i);
    }

    public final void A00() {
        InputMethodManager A0Q = getSystemServices().A0Q();
        if (A0Q != null && !A0Q.isFullscreenMode()) {
            EditText editText = this.A02;
            if (A0Q.isActive(editText)) {
                A0Q.showSoftInput(editText, 0);
            } else {
                editText.requestFocus();
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public final void setHint(CharSequence charSequence) {
        this.A02.setHint(charSequence);
    }

    public final void setNavigationIcon(int i) {
        setNavigationIcon(AnonymousClass0VX.A01(getContext(), i));
    }

    public final void setText(CharSequence charSequence) {
        this.A02.setText(charSequence);
    }
}
