package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.File;
import java.util.List;

/* renamed from: X.5qb  reason: invalid class name and case insensitive filesystem */
public class C116635qb implements AnonymousClass66N {
    public Animation A00;
    public ImageButton A01;
    public TextView A02;
    public VoiceVisualizer A03;
    public VoiceNoteSeekBar A04;
    public final Context A05;
    public final View A06;
    public final View A07;
    public final ViewGroup A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;
    public final ViewGroup A0B;
    public final ImageButton A0C;
    public final ImageButton A0D;
    public final ImageButton A0E;
    public final C69263Wi A0F;
    public final VoiceVisualizer A0G;
    public final C620733j A0H;
    public final C187958y5 A0I;
    public final AnonymousClass5UY A0J;
    public final AnonymousClass4FS A0K;
    public final List A0L = AnonymousClass001.A0s();
    public final boolean A0M;

    public void A00() {
        AlphaAnimation A0C2 = AnonymousClass4L0.A0C(0.0f, 1.0f);
        AlphaAnimation A0C3 = AnonymousClass4L0.A0C(0.0f, 1.0f);
        A0C2.setDuration(250);
        C1232467r.A00(A0C2, this, 12);
        this.A0D.startAnimation(A0C2);
        AlphaAnimation A0C4 = AnonymousClass4L0.A0C(0.0f, 1.0f);
        A0C4.setDuration(250);
        C1232467r.A00(A0C4, this, 11);
        this.A0C.startAnimation(A0C4);
        A0C3.setDuration(250);
        C1232467r.A00(A0C3, this, 13);
        this.A08.startAnimation(A0C3);
    }

    public C116635qb(Context context, View view, C69263Wi r16, C620733j r17, AnonymousClass1VX r18, C187958y5 r19, AnonymousClass4FS r20) {
        boolean A0X = r18.A0X(1139);
        ImageButton A0t = C86664Kz.A0t(view, R.id.voice_note_draft_stop_btn_v2);
        ImageButton A0t2 = C86664Kz.A0t(view, R.id.voice_note_cancel_btn_v2);
        ViewGroup A0I2 = C86644Kx.A0I(view, R.id.voice_note_draft_layout_v2);
        ViewGroup A0I3 = C86644Kx.A0I(view, R.id.voice_note_draft_v2);
        AnonymousClass5UY A0M2 = AnonymousClass0x2.A0M(view, R.id.voice_note_draft_preview_v2_view_stub);
        ViewGroup A0I4 = C86644Kx.A0I(view, R.id.quoted_message_preview_container_v2);
        ViewGroup A0I5 = C86644Kx.A0I(view, R.id.draft_send_container_v2);
        View A022 = C06560Yg.A02(view, R.id.draft_send_v2);
        View A023 = C06560Yg.A02(view, R.id.voice_note_flashing_recording_view);
        ImageButton A0t3 = C86664Kz.A0t(view, R.id.voice_note_view_once_toggle);
        this.A05 = context;
        this.A0F = r16;
        this.A0K = r20;
        this.A0I = r19;
        this.A0H = r17;
        this.A0M = A0X;
        this.A0D = A0t;
        this.A0C = A0t2;
        this.A0B = A0I2;
        this.A0A = A0I3;
        this.A0J = A0M2;
        AnonymousClass5UY.A02(A0M2, this, 12);
        this.A09 = A0I4;
        this.A08 = A0I5;
        this.A07 = A022;
        this.A0G = (VoiceVisualizer) C06560Yg.A02(view, R.id.voice_note_draft_audio_visualizer);
        this.A06 = A023;
        this.A0E = A0t3;
    }

    public void A01(int i) {
        ImageButton imageButton = this.A0D;
        C620733j r0 = this.A0H;
        Context context = this.A05;
        C18270x1.A0d(context, imageButton, r0, i);
        int i2 = R.string.f11nameremoved;
        if (R.drawable.ic_resume_draft_preview == i) {
            i2 = R.string.f11nameremoved;
        }
        C18300x5.A13(context, imageButton, i2);
    }

    public void A02(AnonymousClass5ZQ r3, File file, boolean z, boolean z2) {
        List list = this.A0L;
        if (!list.isEmpty()) {
            A03(r3, list);
            A04(z, z2);
            return;
        }
        A04(z, z2);
        this.A0J.A04().getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BH(r3, this, file));
    }

    public final void A04(boolean z, boolean z2) {
        if (!z) {
            this.A0A.setVisibility(4);
            if (!z2) {
                this.A0D.setVisibility(8);
            }
            this.A0J.A06(0);
            return;
        }
        Animation A002 = AnonymousClass5CJ.A00(false);
        AlphaAnimation A0C2 = AnonymousClass4L0.A0C(1.0f, 0.0f);
        AlphaAnimation A0C3 = AnonymousClass4L0.A0C(0.0f, 1.0f);
        A0C2.setDuration(150);
        C1232467r.A00(A0C2, this, 15);
        this.A0A.startAnimation(A0C2);
        Animation A003 = AnonymousClass5CJ.A00(true);
        A002.setAnimationListener(new C88814aq(A003, this, true));
        C1232467r.A00(A003, this, 14);
        this.A0D.startAnimation(A002);
        A0C3.setDuration(250);
        C1232467r.A00(A0C3, this, 16);
        this.A0J.A04().startAnimation(A0C3);
    }

    public void B1q() {
        this.A0J.A04();
        VoiceVisualizer voiceVisualizer = this.A03;
        C626936e.A04(voiceVisualizer);
        voiceVisualizer.setVisibility(0);
        this.A0G.setVisibility(0);
        this.A06.setVisibility(8);
        Animation animation = this.A00;
        if (animation != null) {
            animation.cancel();
            this.A00 = null;
        }
    }

    public void Bop() {
        if (this.A00 == null) {
            AlphaAnimation A0H2 = C86604Kt.A0H();
            this.A00 = A0H2;
            A0H2.setDuration(1000);
            this.A00.setRepeatMode(2);
            this.A00.setRepeatCount(-1);
        }
        this.A0G.setVisibility(C86664Kz.A0A(this.A03));
        View view = this.A06;
        view.setVisibility(0);
        view.startAnimation(this.A00);
    }

    public final void A03(AnonymousClass5ZQ r3, List list) {
        int i;
        View view;
        int i2;
        if (list.isEmpty()) {
            if (r3 != null) {
                i2 = r3.A03();
            } else {
                i2 = 0;
            }
            this.A04.setMax(i2);
            this.A04.setProgress(0);
            if (this.A0M) {
                this.A04.setVisibility(0);
            }
            i = 8;
            view = this.A03;
        } else {
            this.A03.setPlaybackPercentage(0.0f);
            this.A03.A02(list, 0.0f);
            this.A03.setVisibility(0);
            i = 8;
            view = this.A04;
        }
        view.setVisibility(i);
    }
}
