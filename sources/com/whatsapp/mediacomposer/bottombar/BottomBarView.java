package com.whatsapp.mediacomposer.bottombar;

import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C64333Db;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

public class BottomBarView extends RelativeLayout implements AnonymousClass4GJ {
    public AnonymousClass1VX A00;
    public C116855qy A01;
    public boolean A02;
    public final WaImageButton A03;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAddStandaloneButtonClick(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public void setAddStandaloneButtonVisibility(int i) {
        this.A03.setVisibility(i);
    }

    public BottomBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C64333Db.A4B(C88864av.A00(generatedComponent()));
        }
    }

    public BottomBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C64333Db.A4B(C88864av.A00(generatedComponent()));
        }
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A03 = C86664Kz.A10(this, R.id.add_button_standalone);
    }
}
