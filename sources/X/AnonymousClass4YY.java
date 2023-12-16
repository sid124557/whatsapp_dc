package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.contact.FacepileView;

/* renamed from: X.4YY  reason: invalid class name */
public class AnonymousClass4YY extends C05570Ua {
    public FacepileView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;
    public final /* synthetic */ C96964xO A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4YY(View view, C96964xO r4) {
        super(view);
        this.A04 = r4;
        this.A01 = AnonymousClass0x2.A0I(view, R.id.reactions_bottom_sheet_row_primary_text);
        this.A03 = C86614Ku.A0M(view, R.id.reactions_bottom_sheet_row_emoji);
        this.A02 = AnonymousClass0x2.A0I(view, R.id.reactions_bottom_sheet_row_secondary_text);
        if (r4.A02.A01.A0X(5185)) {
            FacepileView facepileView = (FacepileView) view.findViewById(R.id.facepile_view);
            this.A00 = facepileView;
            AnonymousClass0x2.A0x(facepileView);
        }
    }
}
