package X;

import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.5qa  reason: invalid class name and case insensitive filesystem */
public class C116625qa implements AnonymousClass66N {
    public final /* synthetic */ C86874Me A00;

    public C116625qa(C86874Me r1) {
        this.A00 = r1;
    }

    public void B1q() {
        C116155pp r0 = (C116155pp) this.A00.A0D.get();
        if (r0 != null) {
            boolean z = r0.A0B;
            C185148tA r02 = r0.A0I;
            if (z) {
                r02.BEi();
            } else {
                r02.BEh();
            }
        }
    }

    public void Bop() {
        C116155pp r0 = (C116155pp) this.A00.A0D.get();
        if (r0 != null) {
            VoiceRecordingView voiceRecordingView = (VoiceRecordingView) r0.A0I;
            voiceRecordingView.A03.setVisibility(0);
            voiceRecordingView.A0C.setVisibility(4);
            voiceRecordingView.A08.setVisibility(4);
            voiceRecordingView.A05.setVisibility(4);
            voiceRecordingView.A01.setVisibility(4);
            if (voiceRecordingView.A02 == null) {
                voiceRecordingView.A02 = new C125046Ey();
            }
            voiceRecordingView.A00.setVisibility(0);
            voiceRecordingView.A00.startAnimation(voiceRecordingView.A02);
        }
    }
}
