package X;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.Objects;

/* renamed from: X.5Ok  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C103785Ok {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C620733j A01;
    public final /* synthetic */ C89224c7 A02;
    public final /* synthetic */ C27821ej A03;
    public final /* synthetic */ AnonymousClass5Y0 A04;
    public final /* synthetic */ EmojiSearchContainer A05;
    public final /* synthetic */ AnonymousClass5S9 A06;
    public final /* synthetic */ C60152y5 A07;

    public final void A00(EmojiSearchProvider emojiSearchProvider) {
        AnonymousClass5S9 r4 = this.A06;
        C89224c7 r5 = this.A02;
        EmojiSearchContainer emojiSearchContainer = this.A05;
        Activity activity = this.A00;
        AnonymousClass5Y0 r6 = this.A04;
        C27821ej r2 = this.A03;
        C620733j r3 = this.A01;
        C60152y5 r1 = this.A07;
        r5.A06(r5.A0K);
        r5.A0C = r4;
        AnonymousClass93Y r0 = new AnonymousClass93Y(r4, 2);
        emojiSearchContainer.A00 = activity;
        emojiSearchContainer.A07 = r6;
        emojiSearchContainer.A05 = r3;
        emojiSearchContainer.A06 = r2;
        emojiSearchContainer.A09 = emojiSearchProvider;
        emojiSearchContainer.A0A = r0;
        emojiSearchContainer.A0B = r1;
        if (!emojiSearchContainer.A0E) {
            emojiSearchContainer.A0E = true;
            activity.getLayoutInflater().inflate(R.layout.f8nameremoved, emojiSearchContainer, true);
            emojiSearchContainer.A02 = emojiSearchContainer.findViewById(R.id.no_results);
            emojiSearchContainer.A03 = C86664Kz.A0w(emojiSearchContainer, R.id.search_result);
            emojiSearchContainer.A03.A0o(new C188838zZ(emojiSearchContainer, C86634Kw.A07(emojiSearchContainer), 0));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1X(0);
            emojiSearchContainer.A03.setLayoutManager(linearLayoutManager);
            emojiSearchContainer.A01 = emojiSearchContainer.findViewById(R.id.progress_container);
            InterceptingEditText interceptingEditText = (InterceptingEditText) emojiSearchContainer.findViewById(R.id.search_bar);
            emojiSearchContainer.A04 = interceptingEditText;
            interceptingEditText.setHint(R.string.f11nameremoved);
            View findViewById = emojiSearchContainer.findViewById(R.id.clear_search_btn);
            C18310x6.A18(findViewById, emojiSearchContainer, 18);
            emojiSearchContainer.setOnTouchListener(new C154417d8(2));
            InterceptingEditText interceptingEditText2 = emojiSearchContainer.A04;
            Objects.requireNonNull(r4);
            interceptingEditText2.A00 = new AnonymousClass90U(r4, 0);
            emojiSearchContainer.A04.addTextChangedListener(new AnonymousClass4HR(findViewById, 0, emojiSearchContainer));
            AnonymousClass54E.A00(emojiSearchContainer.findViewById(R.id.back), r4, emojiSearchContainer, 4);
            C18270x1.A0d(emojiSearchContainer.getContext(), AnonymousClass0x9.A0F(emojiSearchContainer, R.id.back), r3, R.drawable.ic_emoji_search_back);
        }
        emojiSearchContainer.setVisibility(0);
        emojiSearchContainer.A02.setVisibility(0);
        emojiSearchContainer.A01.setVisibility(8);
        AnonymousClass900 r22 = new AnonymousClass900(emojiSearchContainer.A00, emojiSearchContainer.A05, emojiSearchContainer.A07, new AnonymousClass93Y(emojiSearchContainer, 1), emojiSearchContainer.A0B, emojiSearchContainer, emojiSearchContainer.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0);
        emojiSearchContainer.A08 = r22;
        emojiSearchContainer.A03.setAdapter(r22);
        emojiSearchContainer.A0D = "";
        emojiSearchContainer.A01("");
        emojiSearchContainer.A04.setText("");
        emojiSearchContainer.A04.requestFocus();
        emojiSearchContainer.A04.A07(false);
        C86654Ky.A13(emojiSearchContainer.A04);
    }

    public /* synthetic */ C103785Ok(Activity activity, C620733j r2, C89224c7 r3, C27821ej r4, AnonymousClass5Y0 r5, EmojiSearchContainer emojiSearchContainer, AnonymousClass5S9 r7, C60152y5 r8) {
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = emojiSearchContainer;
        this.A00 = activity;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A07 = r8;
    }
}
