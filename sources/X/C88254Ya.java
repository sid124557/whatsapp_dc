package X;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.4Ya  reason: invalid class name and case insensitive filesystem */
public class C88254Ya extends C05570Ua {
    public final ImageButton A00;
    public final ImageButton A01;
    public final ImageView A02;
    public final TextView A03;
    public final AnonymousClass5YB A04;
    public final /* synthetic */ GroupCallLogActivity A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88254Ya(View view, GroupCallLogActivity groupCallLogActivity) {
        super(view);
        this.A05 = groupCallLogActivity;
        this.A02 = AnonymousClass0x9.A0F(view, R.id.contact_photo);
        this.A04 = AnonymousClass5YB.A00(view, groupCallLogActivity.A00, R.id.contact_name);
        this.A01 = (ImageButton) view.findViewById(R.id.call_btn);
        this.A00 = (ImageButton) view.findViewById(R.id.video_call_btn);
        this.A03 = AnonymousClass002.A09(view, R.id.participant_call_log_result);
    }
}
