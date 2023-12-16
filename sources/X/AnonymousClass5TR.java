package X;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5TR  reason: invalid class name */
public class AnonymousClass5TR {
    public AnonymousClass7ND A00;
    public Runnable A01;
    public Runnable A02;
    public boolean A03 = false;
    public final View A04;
    public final FrameLayout A05;
    public final FrameLayout A06;
    public final ImageView A07;
    public final TextView A08;
    public final C69263Wi A09;
    public final C93244oC A0A;
    public final ConversationRowVideo$RowVideoView A0B;
    public final C620733j A0C;
    public final C31971pB A0D;
    public final AnonymousClass5RW A0E;

    public void A01() {
        C31971pB r3 = this.A0D;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 A082 = C624134x.A08(r3, "conversation/row/video/autoplay/startVideoPlayback/", A0o);
        AnonymousClass2z0.A0A(A082, A0o);
        C86604Kt.A1V(A0o, " conversationRowVideo=", this);
        File A012 = C30471mV.A01(r3);
        if (A012 == null || !C18310x6.A0a(Uri.fromFile(A012)).exists()) {
            Log.w("conversation/row/video/autoplay/alertVideoFileNotFound/ no file");
            C93244oC.A0n(this.A0A, A082);
            return;
        }
        this.A05.setVisibility(4);
        this.A07.setVisibility(4);
        if (this.A02 == null && this.A01 == null) {
            C117085rM A002 = C117085rM.A00(this, 45);
            this.A02 = A002;
            this.A09.A0S(A002);
        }
    }

    public void A02(boolean z) {
        C31971pB r2 = this.A0D;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0.A0A(C624134x.A08(r2, "conversation/row/video/autoplay/stopVideoPlayback/", A0o), A0o);
        C86604Kt.A1V(A0o, " conversationRowVideo=", this);
        Runnable runnable = this.A02;
        if (runnable != null) {
            this.A09.A0R(runnable);
        }
        Runnable runnable2 = this.A01;
        if (runnable2 != null) {
            this.A09.A0R(runnable2);
        }
        this.A02 = null;
        this.A01 = null;
        A03(z);
    }

    public final void A03(boolean z) {
        AnonymousClass7ND r2 = this.A00;
        if (r2 != null) {
            C86604Kt.A1V(AnonymousClass001.A0o(), "conversation/row/video/autoplay/releaseVideoPlayer/videoPlayerId=", r2);
            AnonymousClass7ND r22 = this.A00;
            r22.A03.A0V((C183348pt) null);
            r22.A01 = null;
            if (z) {
                this.A0E.A02(r22);
                this.A00 = null;
            }
        }
        this.A0B.setVisibility(0);
        A00(this.A04, this, 0);
    }

    public AnonymousClass5TR(View view, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, TextView textView, C69263Wi r7, C93244oC r8, ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView, C620733j r10, C31971pB r11, AnonymousClass5RW r12) {
        this.A09 = r7;
        this.A0E = r12;
        this.A04 = view;
        this.A08 = textView;
        this.A07 = imageView;
        this.A05 = frameLayout;
        this.A06 = frameLayout2;
        this.A0D = r11;
        this.A0B = conversationRowVideo$RowVideoView;
        this.A0A = r8;
        this.A0C = r10;
    }

    public static void A00(View view, AnonymousClass5TR r1, int i) {
        view.setVisibility(i);
        r1.A08.setVisibility(i);
        r1.A07.setVisibility(i);
        r1.A05.setVisibility(i);
    }
}
