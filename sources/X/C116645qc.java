package X;

import com.whatsapp.R;
import com.whatsapp.voicetranscription.AudioTranscriptionView;
import java.util.Locale;

/* renamed from: X.5qc  reason: invalid class name and case insensitive filesystem */
public class C116645qc implements C184608sD {
    public final /* synthetic */ C93234oB A00;

    public C116645qc(C93234oB r1) {
        this.A00 = r1;
    }

    public void BcG(C30721mu r7) {
        C93234oB r1 = this.A00;
        if (r1.A0F) {
            AudioTranscriptionView audioTranscriptionView = (AudioTranscriptionView) AnonymousClass5UY.A00(r1.A03, 0);
            audioTranscriptionView.A01.setText(C18320x8.A0b(audioTranscriptionView.getResources(), C154327cz.A01(Locale.getDefault()), AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
        }
    }

    public void BeV(C30721mu r6, String str) {
        C93234oB r0 = this.A00;
        AnonymousClass5UY r1 = r0.A03;
        if (r1 != null && ((C30471mV) r0.A0S) == r6) {
            AudioTranscriptionView audioTranscriptionView = (AudioTranscriptionView) AnonymousClass5UY.A00(r1, 0);
            audioTranscriptionView.A00 = r6.A1L;
            if (str.isEmpty()) {
                C86634Kw.A1I(audioTranscriptionView.A01);
            } else {
                audioTranscriptionView.A01.setText(C18320x8.A0b(audioTranscriptionView.getResources(), str, AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
            }
        }
    }
}
