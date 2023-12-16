package X;

import android.content.Intent;
import com.whatsapp.inappsupportbloks.components.BloksSupportVideoView;

/* renamed from: X.8E8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8E8 implements AnonymousClass64L {
    public final /* synthetic */ BloksSupportVideoView A00;

    public final boolean BM3(Intent intent, int i, int i2) {
        BloksSupportVideoView bloksSupportVideoView = this.A00;
        int i3 = 0;
        if (i != 0 || i2 != -1) {
            return false;
        }
        if (intent != null) {
            i3 = intent.getIntExtra("video_start_position", 0);
        }
        bloksSupportVideoView.A00 = i3;
        return true;
    }

    public /* synthetic */ AnonymousClass8E8(BloksSupportVideoView bloksSupportVideoView) {
        this.A00 = bloksSupportVideoView;
    }
}
