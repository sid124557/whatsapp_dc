package X;

import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.status.playback.widget.StatusEditText;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.whatsapp.textstatuscomposer.voice.VoiceStatusRecordingVisualizer;
import java.util.Objects;

/* renamed from: X.52V  reason: invalid class name */
public class AnonymousClass52V extends C88554aA {
    public boolean A00 = false;
    public final /* synthetic */ CreationModeBottomBar A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52V(CreationModeBottomBar creationModeBottomBar) {
        super(creationModeBottomBar, 1.0f, 2.0f);
        this.A01 = creationModeBottomBar;
    }

    public void Bbv(C153317b2 r12) {
        super.Bbv(r12);
        C179708ja r3 = this.A01.A0E;
        if (r3 != null && r12.A07.A00 >= ((double) this.A00) && !this.A00) {
            C116145po r32 = (C116145po) r3;
            CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r32.A0L;
            AnonymousClass0AN A0x = C86664Kz.A0x(creationModeBottomBar);
            A0x.A0B(new AnonymousClass4ZP(creationModeBottomBar));
            AnonymousClass0XC.A02(creationModeBottomBar, A0x);
            creationModeBottomBar.A0D.setVisibility(8);
            creationModeBottomBar.A03.setVisibility(8);
            creationModeBottomBar.A0A.setVisibility(0);
            r32.A00 = 0.0f;
            r32.A0A = false;
            r32.A0B = false;
            AnonymousClass52X r0 = new AnonymousClass52X(r32);
            r32.A05 = r0;
            r0.A00();
            C179718jb r5 = r32.A06;
            if (r5 != null) {
                r32.A04 = SystemClock.elapsedRealtime();
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r5;
                if (!(textStatusComposerActivity.A0m == null || textStatusComposerActivity.A0n == null)) {
                    AnonymousClass0XC.A01((ViewGroup) textStatusComposerActivity.A00);
                    AnonymousClass0XC.A01(textStatusComposerActivity.A08);
                    textStatusComposerActivity.A0m.setScaleX(1.0f);
                    textStatusComposerActivity.A0m.setScaleY(1.0f);
                    View view = textStatusComposerActivity.A00;
                    Objects.requireNonNull(view);
                    VoiceRecordingView voiceRecordingView = textStatusComposerActivity.A0m;
                    StatusEditText statusEditText = textStatusComposerActivity.A0j;
                    AnonymousClass0A7 r6 = new AnonymousClass0A7();
                    r6.A02 = 200;
                    r6.A03 = true;
                    AnonymousClass0AN r02 = new AnonymousClass0AN(3);
                    r02.A09(statusEditText);
                    r02.A09(voiceRecordingView);
                    r02.A02 = 0;
                    r6.A0c(r02);
                    r6.A0a(new DecelerateInterpolator());
                    r6.A0Z(300);
                    AnonymousClass0XC.A02((ViewGroup) view, r6);
                    ViewGroup viewGroup = textStatusComposerActivity.A08;
                    ImageButton imageButton = textStatusComposerActivity.A0A;
                    TextView textView = textStatusComposerActivity.A0C;
                    AnonymousClass0A7 r62 = new AnonymousClass0A7();
                    r62.A03 = true;
                    r62.A02 = 200;
                    AnonymousClass0AO r10 = new AnonymousClass0AO();
                    r10.A0b(5);
                    r10.A09(imageButton);
                    r10.A09(textView);
                    r10.A02 = 0;
                    AnonymousClass0AG r33 = new AnonymousClass0AG();
                    r33.A00 = Float.POSITIVE_INFINITY;
                    r10.A0S(r33);
                    r10.A07(1500);
                    r62.A0c(r10);
                    AnonymousClass0AN r03 = new AnonymousClass0AN(2);
                    r03.A09(imageButton);
                    r03.A09(textView);
                    r03.A02 = 0;
                    r03.A07(300);
                    r62.A0c(r03);
                    r62.A0a(new DecelerateInterpolator());
                    AnonymousClass0XC.A02(viewGroup, r62);
                    textStatusComposerActivity.A0j.setVisibility(8);
                    textStatusComposerActivity.A0m.setVisibility(0);
                    textStatusComposerActivity.A0A.setVisibility(8);
                    textStatusComposerActivity.A0C.setVisibility(8);
                    C116155pp r7 = textStatusComposerActivity.A0n;
                    r7.A0K.A01();
                    PowerManager.WakeLock wakeLock = r7.A03;
                    if (wakeLock != null) {
                        wakeLock.acquire(r7.A00() + C116155pp.A0P);
                    }
                    C185148tA r8 = r7.A0I;
                    r8.BEi();
                    VoiceRecordingView voiceRecordingView2 = (VoiceRecordingView) r8;
                    VoiceStatusRecordingVisualizer voiceStatusRecordingVisualizer = voiceRecordingView2.A0C;
                    voiceStatusRecordingVisualizer.A0B.clear();
                    voiceStatusRecordingVisualizer.A00 = 0;
                    voiceStatusRecordingVisualizer.A01 = 750;
                    voiceStatusRecordingVisualizer.A06 = false;
                    voiceStatusRecordingVisualizer.invalidate();
                    long j = r7.A02;
                    if (j != -1) {
                        C86874Me A002 = r7.A0D.A00(r7, j);
                        r7.A07 = A002;
                        A002.A00();
                        AnonymousClass5CI.A00(C111095hX.A04(voiceRecordingView2));
                    }
                    r7.A03(0);
                    r7.A0B = true;
                }
            }
            this.A00 = true;
        }
    }
}
