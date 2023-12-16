package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.6Ii  reason: invalid class name and case insensitive filesystem */
public class C125516Ii extends C05570Ua {
    public final View A00;
    public final View A01;
    public final ImageView A02;

    public C125516Ii(Context context, ViewGroup viewGroup) {
        super(AnonymousClass001.A0R(LayoutInflater.from(context), viewGroup, R.layout.f8nameremoved));
        View view = this.A0H;
        this.A02 = (ImageView) view.findViewById(R.id.icon);
        this.A00 = view.findViewById(R.id.badge);
        this.A01 = view.findViewById(R.id.sel_marker);
    }
}
