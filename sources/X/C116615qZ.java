package X;

import com.whatsapp.util.Log;

/* renamed from: X.5qZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116615qZ implements C183398py {
    public final /* synthetic */ AnonymousClass5ZT A00;

    public final void AyL() {
        AnonymousClass5ZT r4 = this.A00;
        Log.d("VoiceNoteRecordingUI/processDraftVisualizationError");
        AnonymousClass5TQ r0 = r4.A0L;
        if (r0 == null || r0.A06.isRecording()) {
            int i = r4.A03 + 1;
            r4.A03 = i;
            if (r4.A1U && i == 6) {
                r4.A1D.A0G.setVisibility(4);
                if (r4.A0v.A0X(1140)) {
                    AnonymousClass33p r2 = r4.A0r;
                    if (!C18280x3.A1W(AnonymousClass0x2.A0F(r2), "ptt_draft_preview_error_count_reached")) {
                        C18270x1.A0v(r2, "ptt_draft_preview_error_count_reached", true);
                        r4.A0d.A0A("voice_visualization_error_count_reached_critical_event_name", true, (String) null);
                    }
                }
            }
        }
    }

    public /* synthetic */ C116615qZ(AnonymousClass5ZT r1) {
        this.A00 = r1;
    }
}
