package X;

import com.whatsapp.migration.transfer.ui.ChatTransferActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Al  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63743Al implements C16200sd {
    public final /* synthetic */ ChatTransferActivity A00;

    public final void onResult(Object obj) {
        ChatTransferActivity chatTransferActivity = this.A00;
        Throwable th = (Throwable) obj;
        Log.e("fpm/ChatTransferActivity/lottie-failure", th);
        chatTransferActivity.A03.A09("NetworkResourceLoader/ChatTransferActivity/Lottie", th.toString(), th);
    }

    public /* synthetic */ C63743Al(ChatTransferActivity chatTransferActivity) {
        this.A00 = chatTransferActivity;
    }
}
