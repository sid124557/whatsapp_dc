package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.92D  reason: invalid class name */
public class AnonymousClass92D implements C183278pm {
    public Object A00;
    public final int A01;

    public AnonymousClass92D(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BUX(View view) {
        ImageView imageView;
        int i;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                ImageView imageView2 = (ImageView) view;
                C162457s7.A0J(obj, 0);
                imageView2.setImageResource(R.drawable.vec_ic_calling_bluetooth);
                i = 3;
                imageView = imageView2;
                break;
            case 1:
                C162457s7.A0J(obj, 0);
                i = 4;
                imageView = view;
                break;
            case 2:
                ImageView imageView3 = (ImageView) view;
                C162457s7.A0J(obj, 0);
                imageView3.setImageResource(R.drawable.ic_lwc_mic);
                imageView3.getDrawable().setTintList((ColorStateList) null);
                i = 6;
                imageView = imageView3;
                break;
            case 3:
                ImageView imageView4 = (ImageView) view;
                C162457s7.A0J(obj, 0);
                imageView4.setImageResource(R.drawable.vec_ic_calling_speaker);
                i = 7;
                imageView = imageView4;
                break;
            case 4:
                TextView textView = (TextView) view;
                C162457s7.A0J(obj, 0);
                textView.setText(R.string.f11nameremoved);
                i = 8;
                imageView = textView;
                break;
            default:
                view.setOnClickListener(new C109335eS(obj, 39));
                return;
        }
        imageView.setOnClickListener(new C109315eQ(obj, i));
    }
}
