package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5Is  reason: invalid class name and case insensitive filesystem */
public class C102405Is {
    public final TextView A00;
    public final TextView A01;
    public final C620733j A02;

    public C102405Is(View view, C620733j r4) {
        this.A02 = r4;
        AnonymousClass0x9.A0E(view, R.id.voice_cancel_animation).setImageResource(R.drawable.recording_mic_red);
        AnonymousClass0x9.A0E(view, R.id.voice_cancel_trashcan_lid).setImageResource(R.drawable.rec_bucket_lid);
        AnonymousClass0x9.A0E(view, R.id.voice_cancel_trashcan_body).setImageResource(R.drawable.rec_bucket_body);
        this.A00 = C18300x5.A0G(view, R.id.voice_note_info);
        this.A01 = C18300x5.A0G(view, R.id.voice_note_info_v2);
    }
}
