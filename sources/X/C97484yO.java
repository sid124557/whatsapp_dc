package X;

import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.polls.PollCreatorViewModel;

/* renamed from: X.4yO  reason: invalid class name and case insensitive filesystem */
public class C97484yO extends AnonymousClass6I5 {
    public int A00 = -1;
    public final Drawable A01;
    public final WaEditText A02;
    public final C620633i A03;
    public final AnonymousClass5UY A04;
    public final AnonymousClass5UY A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97484yO(View view, C620633i r13, C620733j r14, AnonymousClass487 r15, AnonymousClass5Y0 r16, AnonymousClass1VX r17, PollCreatorViewModel pollCreatorViewModel, C60152y5 r19) {
        super(view);
        C620633i r5 = r13;
        this.A03 = r13;
        this.A04 = AnonymousClass0x2.A0M(view, R.id.duplicated_option);
        this.A05 = AnonymousClass0x2.A0M(view, R.id.max_option_text_view);
        WaEditText waEditText = (WaEditText) C06560Yg.A02(view, R.id.poll_option_edit_text);
        this.A02 = waEditText;
        waEditText.setRawInputType(16385);
        PollCreatorViewModel pollCreatorViewModel2 = pollCreatorViewModel;
        waEditText.setOnFocusChangeListener(new C1234768o(pollCreatorViewModel2, 0, this));
        waEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2500), new C109095e4(r17.A0N(1407))});
        C107295b4.A05(waEditText, R.string.f11nameremoved);
        Drawable mutate = C18310x6.A0G(view.getContext(), R.drawable.sticker_store_reorder).mutate();
        this.A01 = mutate;
        mutate.setAlpha(0);
        if (C102805Ki.A00(r14)) {
            waEditText.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            waEditText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
        }
        waEditText.addTextChangedListener(new AnonymousClass52P(r5, r15, r16, this, pollCreatorViewModel2, r19));
    }
}
