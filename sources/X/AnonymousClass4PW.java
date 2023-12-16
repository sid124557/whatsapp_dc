package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;

/* renamed from: X.4PW  reason: invalid class name */
public class AnonymousClass4PW extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final WaImageView A04;
    public final WaImageView A05;
    public final WaTextView A06;
    public final WaTextView A07;

    public AnonymousClass4PW(Context context, int i) {
        super(context, (AttributeSet) null, 0);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, false);
        this.A02 = inflate;
        WaImageView A0L = AnonymousClass0x9.A0L(inflate, R.id.archived_row_image);
        this.A04 = A0L;
        WaTextView A0L2 = AnonymousClass0x7.A0L(inflate, R.id.archived_row);
        this.A07 = A0L2;
        this.A06 = AnonymousClass0x7.A0L(inflate, R.id.archive_row_counter);
        this.A03 = C06560Yg.A02(inflate, R.id.content_indicator_container);
        WaImageView A0L3 = AnonymousClass0x9.A0L(inflate, R.id.archive_row_important_chat_indicator);
        this.A05 = A0L3;
        C106905aM.A04(A0L2);
        C107295b4.A02(inflate);
        C86644Kx.A0l(context, A0L, R.color.f5nameremoved);
        C86644Kx.A0l(context, A0L3, R.color.f5nameremoved);
        A0L2.setTextColor(AnonymousClass0Y8.A07(context, R.color.f5nameremoved));
        this.A06.setTextColor(AnonymousClass0Y8.A07(context, i != 1 ? R.color.f5nameremoved : R.color.f5nameremoved));
        addView(inflate);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setEnableState(boolean z) {
        this.A02.setClickable(z);
        this.A07.setEnabled(z);
        this.A04.setEnabled(z);
        this.A06.setEnabled(z);
        this.A05.setEnabled(z);
    }

    public void setImportantMessageTag(int i) {
        this.A05.setTag(Integer.valueOf(i));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setVisibility(boolean z) {
        this.A02.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public void setContentIndicatorText(String str) {
        View view;
        if (TextUtils.isEmpty(str)) {
            Log.i("archive/set-content-indicator-to-empty");
            view = this.A03;
        } else {
            this.A03.setVisibility(0);
            boolean equals = "@".equals(str);
            WaImageView waImageView = this.A05;
            if (equals) {
                waImageView.setVisibility(0);
                view = this.A06;
            } else {
                waImageView.setVisibility(8);
                WaTextView waTextView = this.A06;
                waTextView.setText(str);
                waTextView.setVisibility(0);
                return;
            }
        }
        view.setVisibility(8);
    }
}
