package X;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.status.ContactStatusThumbnail;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.5LA  reason: invalid class name */
public class AnonymousClass5LA {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final ProgressBar A05;
    public final TextView A06;
    public final WaTextView A07;
    public final SelectionCheckView A08;
    public final ContactStatusThumbnail A09;
    public final /* synthetic */ MyStatusesActivity A0A;

    public AnonymousClass5LA(View view, MyStatusesActivity myStatusesActivity) {
        this.A0A = myStatusesActivity;
        this.A00 = view;
        ContactStatusThumbnail contactStatusThumbnail = (ContactStatusThumbnail) view.findViewById(R.id.contact_photo);
        this.A09 = contactStatusThumbnail;
        contactStatusThumbnail.setClickable(false);
        View findViewById = view.findViewById(R.id.contact_selector);
        this.A01 = findViewById;
        findViewById.setClickable(false);
        this.A06 = AnonymousClass002.A09(view, R.id.date_time);
        ImageView A0F = AnonymousClass0x9.A0F(view, R.id.overflow_icon);
        this.A03 = A0F;
        if (myStatusesActivity.A0D.A0X(6685)) {
            A0F.setColorFilter(AnonymousClass0Y8.A04(A0F.getContext(), R.color.f5nameremoved), PorterDuff.Mode.SRC_IN);
        }
        A0F.setOnClickListener(myStatusesActivity.A0q);
        WaTextView A0O = C86644Kx.A0O(view, R.id.views_count);
        this.A07 = A0O;
        View findViewById2 = view.findViewById(R.id.retry_button);
        this.A02 = findViewById2;
        findViewById2.setOnClickListener(myStatusesActivity.A0r);
        this.A05 = (ProgressBar) view.findViewById(R.id.progress);
        AnonymousClass0Y8.A04(view.getContext(), AnonymousClass5Yj.A00(view.getContext()));
        this.A08 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A04 = C86664Kz.A0v(view, R.id.title_container);
        C106905aM.A04(A0O);
    }
}
