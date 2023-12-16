package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.media.MediaPlayer;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.4zz  reason: invalid class name and case insensitive filesystem */
public class C98204zz extends C98034zi {
    public AnimatorSet A00;
    public C620733j A01;
    public C179648jU A02 = new AnonymousClass8JY(this);
    public boolean A03;
    public final WaTextView A04;
    public final MessageThumbView A05;
    public final MessageGifVideoPlayer A06;

    public static /* synthetic */ void A00(C98204zz r10, boolean z) {
        AnimatorSet animatorSet = r10.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float A002 = C86634Kw.A00(z ? 1 : 0);
        r10.A00 = C86664Kz.A0O();
        FrameLayout frameLayout = r10.A00;
        r10.A00.playTogether(C86664Kz.A1b(ObjectAnimator.ofFloat(frameLayout, "alpha", new float[]{frameLayout.getAlpha(), A002}), ObjectAnimator.ofFloat(r10.A01, "alpha", new float[]{frameLayout.getAlpha(), A002}), 2, 0));
        C86614Ku.A0y(r10.A00);
        r10.A00.setDuration(100);
        r10.A00.start();
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public void A03() {
        MessageGifVideoPlayer messageGifVideoPlayer = this.A06;
        messageGifVideoPlayer.setVisibility(8);
        MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            messageGifVideoPlayer.A02 = null;
            messageGifVideoPlayer.A0C = false;
            messageGifVideoPlayer.A0D = false;
            messageGifVideoPlayer.A0F = false;
        }
    }

    public boolean A05() {
        return true;
    }

    public float getRatio() {
        return 1.5f;
    }

    public void setScrolling(boolean z) {
        this.A06.setScrolling(z);
    }

    public void setShouldPlay(boolean z) {
        this.A06.setShouldPlay(z);
    }

    public C98204zz(Context context) {
        super(context);
        A01();
        MessageThumbView messageThumbView = (MessageThumbView) C06560Yg.A02(this, R.id.thumb_view);
        this.A05 = messageThumbView;
        MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) C06560Yg.A02(this, R.id.video_player);
        this.A06 = messageGifVideoPlayer;
        this.A04 = AnonymousClass0x7.A0L(this, R.id.media_time);
        C18300x5.A13(context, messageThumbView, R.string.f11nameremoved);
        messageGifVideoPlayer.A06 = this.A02;
    }

    public void setMessage(C31961pA r4) {
        super.setMessage(r4);
        this.A00 = 0;
        setId(R.id.search_message_gif_playeble_thumb_view);
        MessageThumbView messageThumbView = this.A05;
        messageThumbView.setMessage(r4);
        this.A06.setMessage(r4);
        messageThumbView.setVisibility(0);
        WaTextView waTextView = this.A04;
        C86634Kw.A1I(waTextView);
        waTextView.setVisibility(8);
    }

    public int getMark() {
        return R.drawable.msg_status_gif;
    }

    public int getMarkTintColor() {
        return R.color.f5nameremoved;
    }
}
