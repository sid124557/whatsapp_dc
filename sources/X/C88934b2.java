package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import java.util.List;

/* renamed from: X.4b2  reason: invalid class name and case insensitive filesystem */
public class C88934b2 extends C86994Mr {
    public final /* synthetic */ EllipsizedTextEmojiLabel A00;
    public final /* synthetic */ CharSequence A01;
    public final /* synthetic */ List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88934b2(Context context, EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel, CharSequence charSequence, List list, int i) {
        super(context, i);
        this.A00 = ellipsizedTextEmojiLabel;
        this.A01 = charSequence;
        this.A02 = list;
    }

    public void onClick(View view) {
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = this.A00;
        View.OnClickListener onClickListener = ellipsizedTextEmojiLabel.A01;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        ellipsizedTextEmojiLabel.A03 = false;
        ellipsizedTextEmojiLabel.A0J(this.A01, this.A02, 0, true);
    }
}
