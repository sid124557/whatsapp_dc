package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView;

/* renamed from: X.8Js  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C172128Js implements C183278pm {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AudioChatBottomSheetFooterView A01;

    public final void BUX(View view) {
        Context context = this.A00;
        AudioChatBottomSheetFooterView audioChatBottomSheetFooterView = this.A01;
        ImageView imageView = (ImageView) view;
        C18260x0.A0O(context, audioChatBottomSheetFooterView);
        imageView.setImageResource(R.drawable.vec_ic_lwc_leave);
        imageView.setColorFilter(AnonymousClass0Y8.A04(context, R.color.f5nameremoved));
        imageView.setOnClickListener(new C109315eQ(audioChatBottomSheetFooterView, 5));
    }

    public /* synthetic */ C172128Js(Context context, AudioChatBottomSheetFooterView audioChatBottomSheetFooterView) {
        this.A00 = context;
        this.A01 = audioChatBottomSheetFooterView;
    }
}
