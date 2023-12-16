package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass4GJ;
import X.AnonymousClass4XD;
import X.AnonymousClass4Z7;
import X.AnonymousClass5ZU;
import X.AnonymousClass6C6;
import X.C105175Tw;
import X.C111685iW;
import X.C116855qy;
import X.C15910sA;
import X.C64333Db;
import X.C86654Ky;
import X.C88864av;
import X.C989453v;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

public class FocusViewContainer extends ConstraintLayout implements AnonymousClass4GJ {
    public Rect A00;
    public FrameLayout A01;
    public LinearLayout A02;
    public WaTextView A03;
    public AnonymousClass4XD A04;
    public AnonymousClass4Z7 A05;
    public MenuBottomSheetViewModel A06;
    public AnonymousClass5ZU A07;
    public C116855qy A08;
    public boolean A09;
    public boolean A0A;

    public static /* synthetic */ void A00(FocusViewContainer focusViewContainer) {
        FrameLayout frameLayout = focusViewContainer.A01;
        frameLayout.setScaleX(1.0f);
        frameLayout.setScaleY(1.0f);
        frameLayout.setTranslationX(0.0f);
        frameLayout.setTranslationY(0.0f);
        focusViewContainer.A03.animate().alpha(1.0f);
        focusViewContainer.A02.animate().alpha(1.0f);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A08;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4Z7 getFocusViewHolder() {
        return this.A05;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A00.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public void setMenuViewModel(C15910sA r3, MenuBottomSheetViewModel menuBottomSheetViewModel) {
        this.A06 = menuBottomSheetViewModel;
        AnonymousClass6C6.A02(r3, menuBottomSheetViewModel.A03, this, 57);
    }

    public FocusViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A09) {
            this.A09 = true;
            C88864av r1 = (C88864av) ((C111685iW) generatedComponent());
            this.A04 = (AnonymousClass4XD) r1.A0I.A0I.get();
            this.A07 = C64333Db.A28(r1.A0K);
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A03 = AnonymousClass0x7.A0L(this, R.id.participant_name);
        this.A01 = C86654Ky.A0L(this, R.id.participant_view_container);
        this.A02 = C86654Ky.A0N(this, R.id.menu_list_layout);
        setOnClickListener(new C989453v(this, 47));
        this.A00 = AnonymousClass001.A0N();
    }

    public UserJid getVisiblePeerJid() {
        AnonymousClass4Z7 r1;
        if (getVisibility() != 0 || (r1 = this.A05) == null || !r1.A06()) {
            return null;
        }
        C105175Tw r12 = r1.A07;
        if (!r12.A0J) {
            return r12.A0b;
        }
        return null;
    }

    public FocusViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FocusViewContainer(Context context) {
        this(context, (AttributeSet) null);
    }
}
