package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.whatsapp.R;

/* renamed from: X.4QQ  reason: invalid class name */
public final class AnonymousClass4QQ extends LinearLayout {
    public AnonymousClass58V A00;
    public final ImageView A01 = ((ImageView) C18290x4.A0M(this, R.id.action_button));
    public final ImageView A02 = ((ImageView) C18290x4.A0M(this, R.id.rate_button));
    public final Space A03 = ((Space) C18290x4.A0M(this, R.id.space));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4QQ(Context context) {
        super(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
        View.inflate(context, R.layout.f8nameremoved, this);
    }

    public final void setupRateButton(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        C18270x1.A14(onClickListener, onLongClickListener);
        ImageView imageView = this.A02;
        imageView.setOnClickListener(onClickListener);
        imageView.setOnLongClickListener(onLongClickListener);
        imageView.setVisibility(0);
        A00();
    }

    public final void A00() {
        Space space;
        int i;
        if (this.A02.getVisibility() == 0 && this.A01.getVisibility() == 0) {
            space = this.A03;
            i = 0;
        } else {
            space = this.A03;
            i = 8;
        }
        space.setVisibility(i);
    }
}
