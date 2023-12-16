package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.6If  reason: invalid class name and case insensitive filesystem */
public class C125486If extends C05570Ua {
    public ImageView A00;
    public TextView A01;
    public final /* synthetic */ AnonymousClass6Hm A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125486If(View view, AnonymousClass6Hm r3) {
        super(view);
        this.A02 = r3;
        this.A01 = AnonymousClass002.A09(view, R.id.no_results);
        this.A00 = (ImageView) view.findViewById(R.id.shrug_emoji);
    }
}
