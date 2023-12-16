package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.penmode.PenModeView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4LC  reason: invalid class name */
public class AnonymousClass4LC extends Dialog {
    public int A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public WaImageView A04;
    public WaImageView A05;
    public ColorPickerComponent A06;
    public AnonymousClass4Lt A07;
    public PenModeView A08;
    public WDSButton A09;
    public int[] A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D = getContext().getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    public final View.OnLayoutChangeListener A0E;
    public final AnonymousClass5GV A0F;
    public final AnonymousClass5TK A0G;
    public final boolean A0H;

    public void onBackPressed() {
        if (!this.A0G.A03) {
            super.onBackPressed();
        }
    }

    public AnonymousClass4LC(Activity activity, AnonymousClass5GV r10, AnonymousClass7E7 r11, C103795Ol r12, AnonymousClass5N6 r13, int[] iArr, boolean z) {
        super(activity, R.style.f12nameremoved);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0B = dimensionPixelSize;
        this.A0C = getContext().getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A00 = -1;
        this.A0E = new AnonymousClass691((Object) this, 8);
        this.A0F = r10;
        AnonymousClass7E7 r1 = r11;
        C103795Ol r2 = r12;
        AnonymousClass5N6 r4 = r13;
        this.A0G = new AnonymousClass5TK(r1, r2, new C150537Re(this), r4, r10.A00, AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved), dimensionPixelSize);
        this.A0A = iArr;
        this.A0H = z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            setContentView(R.layout.f8nameremoved);
            this.A02 = findViewById(R.id.doodle_pen_root);
            this.A09 = (WDSButton) findViewById(R.id.pen_dialog_done);
            this.A04 = (WaImageView) findViewById(R.id.pen_dialog_pen);
            this.A05 = (WaImageView) findViewById(R.id.pen_dialog_undo);
            this.A03 = (ViewGroup) findViewById(R.id.canvas);
            this.A06 = (ColorPickerComponent) findViewById(R.id.pen_dialog_color_picker_component);
            this.A08 = (PenModeView) findViewById(R.id.pen_mode_view);
            this.A01 = findViewById(R.id.doodle_pen_top_bar);
            window.setLayout(-1, -1);
            window.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            if (Build.VERSION.SDK_INT >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
            this.A02.addOnLayoutChangeListener(this.A0E);
            C18290x4.A1F(this.A09, this, 29);
            C86654Ky.A19(this.A03, this, 10);
            AnonymousClass4Lt r1 = new AnonymousClass4Lt(getContext(), R.drawable.new_pen);
            this.A07 = r1;
            this.A04.setImageDrawable(r1);
            this.A06.A00();
            this.A06.A03((AnonymousClass5UO) null, new C114775na(this), (C182658om) null);
            AnonymousClass4Lt r2 = new AnonymousClass4Lt(getContext(), R.drawable.new_undo);
            r2.A01(AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved));
            this.A05.setImageDrawable(r2);
            C18290x4.A1F(this.A05, this, 30);
            AnonymousClass692.A00(this.A05, this, 9);
            this.A08.A00 = new C171438Hb(this);
            AnonymousClass5TK r22 = this.A0G;
            int i = r22.A05;
            r22.A01 = i;
            r22.A0A.A00.A07.A01(i);
            r22.A01(2, r22.A06);
            r22.A02(false);
            if (!this.A0H) {
                PenModeView penModeView = this.A08;
                C06560Yg.A02(penModeView, R.id.pen_mode_blur).setVisibility(8);
                C86604Kt.A1E(penModeView, R.id.pen_mode_blur_space, 8);
            }
        }
    }
}
