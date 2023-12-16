package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.5mR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C114065mR implements AnonymousClass4A4 {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ ImageView A03;
    public final /* synthetic */ WaTextView A04;
    public final /* synthetic */ MessageReplyActivity A05;
    public final /* synthetic */ boolean A06;

    public final void Bbj(int[] iArr) {
        MessageReplyActivity messageReplyActivity = this.A05;
        boolean z = this.A06;
        ViewGroup viewGroup = this.A02;
        MessageReplyActivity.A0C(this.A00, this.A01, viewGroup, this.A03, this.A04, messageReplyActivity, iArr, z);
    }

    public /* synthetic */ C114065mR(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, WaTextView waTextView, MessageReplyActivity messageReplyActivity, boolean z) {
        this.A05 = messageReplyActivity;
        this.A06 = z;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A03 = imageView;
        this.A00 = resources;
        this.A04 = waTextView;
    }
}
