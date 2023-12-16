package X;

import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.25Y  reason: invalid class name */
public final class AnonymousClass25Y {
    public static void A00(TextView textView, C69263Wi r8, C836249d r9, C620733j r10, C31981pC r11, AnonymousClass4FS r12) {
        C31981pC r2 = r11;
        AnonymousClass33C r0 = r11.A01;
        TextView textView2 = textView;
        C836249d r6 = r9;
        if (r0 == null || r0.A0F == null) {
            Log.d("ConversationRowVideoUtils/fetchAndSetVideoDurationText: duration=''");
            textView.setText("");
            r9.BMK("");
            return;
        }
        textView.setTag(R.id.tag_fetch_video_duration, r11.A1J);
        r12.BkP(new C71453c8(r2, r10, r8, textView2, r6, 7));
    }
}
