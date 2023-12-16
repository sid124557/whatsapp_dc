package X;

import android.net.Uri;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.3sM  reason: invalid class name and case insensitive filesystem */
public final class C76793sM extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass3CP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76793sM(AnonymousClass3CP r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3CP r7 = this.this$0;
        ViewGroup viewGroup = r7.A01;
        LayoutInflater A0D = C18280x3.A0D(viewGroup);
        C162457s7.A0D(A0D);
        View inflate = A0D.inflate(R.layout.f8nameremoved, viewGroup, false);
        View A0M = C18290x4.A0M(inflate, R.id.username_update_banner_close_cta);
        TextView A0F = C18280x3.A0F(inflate, R.id.username_update_banner_message);
        Uri A00 = r7.A03.A00();
        C162457s7.A0D(A00);
        inflate.setOnClickListener(new C109725f5((Object) r7, (Object) inflate, (Object) A00, 5));
        C18320x8.A15(A0M, r7, 23);
        String A0e = C18300x5.A0e(inflate.getContext(), A00.toString(), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        r7.A0A.A03(inflate.getContext(), A0e);
        SpannableString valueOf = SpannableString.valueOf(AnonymousClass0x9.A0B(A0e));
        C162457s7.A0D(valueOf);
        A0F.setText(valueOf, TextView.BufferType.SPANNABLE);
        return inflate;
    }
}
