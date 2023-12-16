package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.util.Log;

/* renamed from: X.4Z9  reason: invalid class name */
public class AnonymousClass4Z9 extends C05570Ua implements View.OnClickListener {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final SelectionCheckView A04;
    public final /* synthetic */ C87964Wu A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Z9(View view, C87964Wu r3) {
        super(view);
        this.A05 = r3;
        this.A01 = view;
        this.A00 = view.findViewById(R.id.filter_thumb);
        this.A02 = AnonymousClass0x9.A0F(view, R.id.filter_thumb_image);
        this.A04 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A03 = AnonymousClass002.A09(view, R.id.filter_name);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        int A012 = A01();
        if (A012 == -1) {
            Log.d("FilterThumbnailAdapter.ViewHolder/onClick Cannot get current viewholder position, ignoring click.");
        } else if (A012 <= 0 || this.A05.A01[A012 - 1] != null) {
            AnonymousClass5Y7 r3 = this.A05.A09;
            if (A012 != r3.A01) {
                r3.A05(new C117705sM((Object) this, A012, 40), new C117705sM((Object) this, A012, 41), A012);
            }
        }
    }
}
