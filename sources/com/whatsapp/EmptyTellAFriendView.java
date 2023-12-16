package com.whatsapp;

import X.AnonymousClass0x7;
import X.AnonymousClass33p;
import X.AnonymousClass4GJ;
import X.C06560Yg;
import X.C111685iW;
import X.C116855qy;
import X.C64333Db;
import X.C86624Kv;
import X.C86654Ky;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.whatsapp.wds.components.button.WDSButton;

public class EmptyTellAFriendView extends ScrollView implements AnonymousClass4GJ {
    public WaTextView A00;
    public AnonymousClass33p A01;
    public WDSButton A02;
    public C116855qy A03;
    public boolean A04;

    public void A00() {
        if (!this.A04) {
            this.A04 = true;
            this.A01 = C64333Db.A2s(((C88864av) ((C111685iW) generatedComponent())).A0K);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setInviteButtonClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        A01(true);
    }

    public final void A01(boolean z) {
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        C86624Kv.A0v(this, -1);
        this.A02 = C86654Ky.A0f(this, R.id.invite_button_tell_a_friend);
        this.A00 = AnonymousClass0x7.A0L(this, R.id.subtitle_tell_a_friend);
        if (!z) {
            C86624Kv.A0r(C06560Yg.A02(this, R.id.container));
        }
        boolean equals = String.valueOf(91).equals(this.A01.A0Z());
        WaTextView waTextView = this.A00;
        int i = R.string.f11nameremoved;
        if (equals) {
            i = R.string.f11nameremoved;
        }
        waTextView.setText(i);
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(true);
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public EmptyTellAFriendView(Context context) {
        super(context);
        A00();
        A01(true);
    }

    public EmptyTellAFriendView(Context context, boolean z) {
        super(context);
        A00();
        A01(z);
    }
}
