package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4R7  reason: invalid class name */
public class AnonymousClass4R7 extends LinearLayout implements AnonymousClass4GJ {
    public C620733j A00;
    public C116855qy A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final TextEmojiLabel A08;

    public void onMeasure(int i, int i2) {
        this.A02 = true;
        TextEmojiLabel textEmojiLabel = this.A08;
        measureChild(textEmojiLabel, i, i2);
        setupTitleAndDescriptionMaxLines(C86614Ku.A0u(textEmojiLabel));
        super.onMeasure(i, i2);
    }

    private void setupTitleAndDescriptionMaxLines(String str) {
        TextEmojiLabel textEmojiLabel = this.A08;
        if (textEmojiLabel.getPaint().measureText(str) > ((float) textEmojiLabel.getMeasuredWidth())) {
            textEmojiLabel.setMaxLines(2);
            this.A06.setMaxLines(1);
            return;
        }
        textEmojiLabel.setMaxLines(1);
        this.A06.setMaxLines(2);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setSubText(String str, List list) {
        TextEmojiLabel textEmojiLabel = this.A07;
        textEmojiLabel.setVisibility(C86614Ku.A01(TextUtils.isEmpty(str) ? 1 : 0));
        if (!TextUtils.isEmpty(str)) {
            textEmojiLabel.A0K((List) null, C107075ae.A01(getContext(), this.A00, str, list));
        }
    }

    public void setTitleAndDescription(String str, String str2, List list) {
        TextEmojiLabel textEmojiLabel;
        int i;
        CharSequence charSequence;
        TextEmojiLabel textEmojiLabel2 = this.A06;
        boolean z = false;
        textEmojiLabel2.setVisibility(C86614Ku.A01(TextUtils.isEmpty(str2) ? 1 : 0));
        if (this.A02 || this.A08.getMeasuredWidth() != 0) {
            z = true;
        }
        this.A02 = z;
        if (z) {
            setupTitleAndDescriptionMaxLines(str);
        }
        if (list == null || list.isEmpty()) {
            textEmojiLabel = this.A08;
            i = this.A05;
        } else {
            textEmojiLabel = this.A08;
            i = this.A04;
        }
        textEmojiLabel.setTextColor(i);
        Context context = getContext();
        C620733j r2 = this.A00;
        textEmojiLabel.A0K((List) null, C107075ae.A01(context, r2, str, list));
        if (str2 != null) {
            charSequence = C107075ae.A01(getContext(), r2, str2, list);
        } else {
            charSequence = "";
        }
        textEmojiLabel2.A0K((List) null, charSequence);
    }

    public AnonymousClass4R7(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            this.A00 = C88864av.A02((C111685iW) generatedComponent());
        }
        this.A02 = false;
        C86634Kw.A1H(this, 1);
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(this, R.id.file_attachment_metadata_title);
        this.A08 = A0K;
        this.A06 = AnonymousClass0x7.A0K(this, R.id.file_attachment_metadata_description);
        this.A07 = AnonymousClass0x7.A0K(this, R.id.file_attachment_metadata_subtext);
        this.A04 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A05 = C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved);
        C106905aM.A04(A0K);
    }
}
