package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.EmojiContainerView;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.690  reason: invalid class name */
public class AnonymousClass690 implements View.OnLongClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public AnonymousClass690(Resources resources, ImageView imageView, WaTextView waTextView, C106655Zv r4, EmojiContainerView emojiContainerView, MessageReplyActivity messageReplyActivity, int i) {
        this.A06 = i;
        this.A00 = messageReplyActivity;
        this.A01 = r4;
        this.A02 = emojiContainerView;
        this.A03 = imageView;
        this.A04 = resources;
        this.A05 = waTextView;
    }

    public final boolean onLongClick(View view) {
        PopupWindow r6;
        int i = this.A06;
        MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
        C106655Zv r0 = (C106655Zv) this.A01;
        View view2 = (View) this.A02;
        ImageView imageView = (ImageView) this.A03;
        Resources resources = (Resources) this.A04;
        WaTextView waTextView = (WaTextView) this.A05;
        GridLayout gridLayout = messageReplyActivity.A0A;
        if (i != 0) {
            r6 = new AnonymousClass4Rm(imageView, new C114065mR(resources, view2, gridLayout, imageView, waTextView, messageReplyActivity, false), messageReplyActivity.A0C, r0.A00, AnonymousClass4SG.A41(messageReplyActivity));
        } else {
            r6 = new AnonymousClass4Ro(imageView, new C114065mR(resources, view2, gridLayout, imageView, waTextView, messageReplyActivity, true), messageReplyActivity.A0C, r0.A00, AnonymousClass4SG.A41(messageReplyActivity));
        }
        C106825aE.A00(imageView, view2.getRootView(), r6);
        return true;
    }
}
