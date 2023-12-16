package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.whatsapp.mediacomposer.doodle.textentry.NewTextEntryView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4vO  reason: invalid class name */
public abstract class AnonymousClass4vO extends C125146Ft {
    public AnonymousClass5Y0 A00;
    public DoodleEditText A01;
    public WDSButton A02;

    private int getDelayFitText() {
        if (this instanceof NewTextEntryView) {
            return 500;
        }
        return 0;
    }

    public float A01(CharSequence charSequence) {
        return this.A01.getTextSize();
    }

    public void setEntryTextSize(float f) {
        this.A01.setTextSize(f);
    }

    public void A02(C114835ng r5, C149797Nx r6, int[] iArr) {
        DoodleEditText doodleEditText = (DoodleEditText) C06560Yg.A02(this, R.id.text);
        this.A01 = doodleEditText;
        doodleEditText.setupBackgroundSpan(r6.A04);
        DoodleEditText doodleEditText2 = this.A01;
        AnonymousClass5X6 r2 = r6.A03;
        doodleEditText2.setBackgroundStyle(r2.A02);
        this.A01.A0A(r2.A03);
        this.A01.setFontStyle(r6.A02);
        this.A01.A09(r6.A01);
        DoodleEditText doodleEditText3 = this.A01;
        int length = r6.A04.length();
        doodleEditText3.setSelection(length, length);
        this.A01.setOnEditorActionListener(new AnonymousClass68X(this, 1, r5));
        DoodleEditText doodleEditText4 = this.A01;
        doodleEditText4.A03 = new C171448Hc(this, r5);
        doodleEditText4.addTextChangedListener(new AnonymousClass68I(r5, 2, this));
        WDSButton A0f = C86654Ky.A0f(this, R.id.done);
        this.A02 = A0f;
        C18310x6.A19(A0f, this, r5, 30);
        AnonymousClass5CS r3 = new AnonymousClass5CS(this, 7);
        C18310x6.A19(C06560Yg.A02(this, R.id.main), this, r5, 31);
        C06560Yg.A02(this, R.id.main).setOnTouchListener(r3);
        this.A01.postDelayed(new C71353by(this, 41, r5), (long) getDelayFitText());
        this.A01.A07(false);
    }

    public void setDelayShowColorPicker(boolean z) {
    }

    public void setMaxColorPickerHeight(int i) {
    }

    public AnonymousClass4vO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnonymousClass4vO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
