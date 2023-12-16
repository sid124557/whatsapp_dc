package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.6G7  reason: invalid class name */
public final class AnonymousClass6G7 extends ConstraintLayout {
    public final WaImageView A00 = ((WaImageView) C18280x3.A0E(this, R.id.bullet_icon));
    public final WaTextView A01 = C86604Kt.A0O(this, R.id.bullet_subtitle);
    public final WaTextView A02 = C86604Kt.A0O(this, R.id.bullet_title);

    public AnonymousClass6G7(Context context) {
        super(context, (AttributeSet) null);
        int dimension = (int) context.getResources().getDimension(R.dimen.f6nameremoved);
        setPadding(0, dimension, 0, dimension);
        View.inflate(context, R.layout.f8nameremoved, this);
    }

    public final void setViewState(C152467Yz r3) {
        C162457s7.A0J(r3, 0);
        this.A00.setImageResource(r3.A00);
        this.A02.setText(r3.A02);
        WaTextView waTextView = this.A01;
        CharSequence charSequence = r3.A01;
        waTextView.setText(charSequence);
        C106895aL.A02(waTextView, charSequence);
    }
}
