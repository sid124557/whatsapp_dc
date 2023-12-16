package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass21X;
import X.AnonymousClass2YV;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GJ;
import X.AnonymousClass5UX;
import X.AnonymousClass5YB;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.C06560Yg;
import X.C106905aM;
import X.C111685iW;
import X.C116855qy;
import X.C141426vY;
import X.C143916zg;
import X.C159727mM;
import X.C18300x5;
import X.C27991fJ;
import X.C55502qS;
import X.C56072rN;
import X.C56422rx;
import X.C56972sr;
import X.C58422vE;
import X.C613330g;
import X.C620733j;
import X.C64333Db;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.Log;
import java.util.EnumMap;

public class ContactQrContactCardView extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public View A01;
    public C56972sr A02;
    public QrImageView A03;
    public AnonymousClass64J A04;
    public AnonymousClass5YB A05;
    public AnonymousClass5YB A06;
    public AnonymousClass5YB A07;
    public WaTextView A08;
    public ThumbnailButton A09;
    public AnonymousClass5UX A0A;
    public C56422rx A0B;
    public AnonymousClass5ZU A0C;
    public C613330g A0D;
    public C620733j A0E;
    public AnonymousClass2YV A0F;
    public C56072rN A0G;
    public C116855qy A0H;
    public boolean A0I;

    public void A02(AnonymousClass3ZH r9, boolean z) {
        AnonymousClass5YB r4;
        int i;
        AnonymousClass3ZH r42 = r9;
        if (!r9.A0g || !z) {
            this.A0A.A07(this.A09, r9);
        } else {
            this.A09.setImageBitmap(this.A0D.A03(getContext(), r42, (float) getResources().getDimensionPixelSize(R.dimen.f6nameremoved), getResources().getDimensionPixelSize(R.dimen.f6nameremoved), false));
        }
        if (r9.A0U()) {
            AnonymousClass5YB r2 = this.A07;
            r2.A02.setText(this.A0C.A0H(r9));
            boolean A062 = this.A0G.A06((C27991fJ) AnonymousClass3ZH.A04(r9));
            AnonymousClass5YB r0 = this.A06;
            int i2 = R.string.f11nameremoved;
            if (A062) {
                i2 = R.string.f11nameremoved;
            }
            r0.A02.setText(i2);
            return;
        }
        if (!r9.A0R()) {
            AnonymousClass5YB r02 = this.A07;
            r02.A02.setText(r9.A0b);
            r4 = this.A06;
            i = R.string.f11nameremoved;
        } else {
            C55502qS A012 = this.A0B.A01(AnonymousClass3ZH.A07(r9));
            if (r9.A0V() || (A012 != null && A012.A03 == 3)) {
                AnonymousClass5YB r03 = this.A07;
                r03.A02.setText(r9.A0b);
                this.A07.A06(1);
                r4 = this.A06;
                AnonymousClass2YV r04 = this.A0F;
                i = R.string.f11nameremoved;
                if (r04.A01.A0Y(C58422vE.A02, 5846)) {
                    i = R.string.f11nameremoved;
                }
            } else {
                AnonymousClass5YB r05 = this.A07;
                r05.A02.setText(r9.A0b);
                r4 = this.A06;
                i = R.string.f11nameremoved;
            }
        }
        r4.A02.setText(i);
    }

    public void A00() {
        if (!this.A0I) {
            this.A0I = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A02 = C64333Db.A06(r1);
            this.A0A = (AnonymousClass5UX) r1.A6K.get();
            this.A0C = C64333Db.A28(r1);
            this.A0E = C64333Db.A2t(r1);
            this.A0G = C64333Db.A8w(r1);
            this.A0B = (C56422rx) r1.AZn.get();
            this.A0D = (C613330g) r1.A6S.get();
            this.A0F = (AnonymousClass2YV) r1.AMs.get();
            this.A04 = (AnonymousClass64J) r1.AEN.get();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0H;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A0H = r0;
        }
        return r0.generatedComponent();
    }

    public void setCustomUrl(String str) {
        this.A05.A02.setText(str);
    }

    public void setCustomUrlVisible(boolean z) {
        AnonymousClass5YB r0 = this.A05;
        r0.A02.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public void setPrompt(String str) {
        this.A08.setText(str);
    }

    public void setQrCode(String str) {
        try {
            this.A03.setQrCode(C159727mM.A00(AnonymousClass21X.M, str, new EnumMap(C141426vY.class)));
            this.A03.invalidate();
        } catch (C143916zg e) {
            Log.e("ContactQrContactCardView/failed to set QR code", e);
        }
    }

    public void setStyle(int i) {
        C106905aM.A04(this.A07.A02);
        if (i == 1) {
            setBackgroundColor(AnonymousClass0Y8.A04(getContext(), AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
            setPadding(0, getResources().getDimensionPixelOffset(R.dimen.f6nameremoved), 0, getPaddingBottom());
            ((ViewGroup.MarginLayoutParams) this.A08.getLayoutParams()).setMargins(0, this.A08.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0);
            WaTextView waTextView = this.A08;
            waTextView.setTextSize(0, (float) waTextView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
            AnonymousClass0x2.A0q(getContext(), this.A08, R.color.f5nameremoved);
            this.A01.setVisibility(0);
            return;
        }
        C18300x5.A13(getContext(), this.A00, R.string.f11nameremoved);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        A01(context);
    }

    public final void A01(Context context) {
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A09 = (ThumbnailButton) C06560Yg.A02(this, R.id.profile_picture);
        this.A07 = AnonymousClass5YB.A00(this, this.A04, R.id.title);
        this.A05 = AnonymousClass5YB.A00(this, this.A04, R.id.custom_url);
        this.A06 = AnonymousClass5YB.A00(this, this.A04, R.id.subtitle);
        this.A00 = C06560Yg.A02(this, R.id.qr_code_container);
        this.A03 = (QrImageView) C06560Yg.A02(this, R.id.qr_code);
        this.A08 = AnonymousClass0x7.A0L(this, R.id.prompt);
        this.A01 = C06560Yg.A02(this, R.id.qr_shadow);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(context);
    }

    public ContactQrContactCardView(Context context) {
        super(context);
        A00();
        A01(context);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }
}
