package X;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.util.Locale;

/* renamed from: X.1NN  reason: invalid class name */
public class AnonymousClass1NN extends C19290z9 {
    public C69263Wi A00;
    public C56612sH A01;
    public C620733j A02;
    public AnonymousClass5Y0 A03;
    public C54922pV A04;
    public C45942ap A05;
    public final LinearLayout A06 = ((LinearLayout) C18290x4.A0M(this, R.id.chat_info_event_container));
    public final TextEmojiLabel A07 = ((TextEmojiLabel) C18290x4.A0M(this, R.id.chat_info_event_name));
    public final WaTextView A08 = ((WaTextView) C18290x4.A0M(this, R.id.chat_info_event_date));
    public final WaTextView A09 = ((WaTextView) C18290x4.A0M(this, R.id.chat_info_event_day));
    public final WaTextView A0A = ((WaTextView) C18290x4.A0M(this, R.id.chat_info_event_location));
    public final WaTextView A0B = ((WaTextView) C18290x4.A0M(this, R.id.chat_info_event_month));
    public final AnonymousClass5UY A0C = C18290x4.A0X(this, R.id.chat_info_event_response_status);

    public final void setEmojiLoader(AnonymousClass5Y0 r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setEventLocation(C30461mU r4) {
        String str;
        C162457s7.A0J(r4, 0);
        C52422lS r0 = r4.A01;
        if (r0 == null || (str = r0.A02) == null) {
            this.A0A.setVisibility(8);
            return;
        }
        WaTextView waTextView = this.A0A;
        waTextView.setText(str);
        waTextView.setVisibility(0);
    }

    public final void setEventMessageManager(C54922pV r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setEventName(String str) {
        C162457s7.A0J(str, 0);
        TextEmojiLabel textEmojiLabel = this.A07;
        textEmojiLabel.setText(C107345b9.A03(textEmojiLabel.getContext(), textEmojiLabel.getPaint(), getEmojiLoader(), C18330xA.A00(str)));
    }

    public final void setEventType(AnonymousClass20Q r6) {
        WaTextView waTextView;
        int A042;
        int A022 = C18320x8.A02(r6, 0);
        if (A022 == 0) {
            AnonymousClass0x2.A0q(getContext(), this.A0B, R.color.f5nameremoved);
            waTextView = this.A09;
            A042 = AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved);
        } else if (A022 == 1) {
            WaTextView waTextView2 = this.A0B;
            Context A0F = C18290x4.A0F(this);
            AnonymousClass0x2.A0q(A0F, waTextView2, AnonymousClass5Yj.A02(A0F, R.attr.f3nameremoved, R.color.f5nameremoved));
            waTextView = this.A09;
            A042 = C18300x5.A03(C18290x4.A0F(this), R.attr.f3nameremoved, R.color.f5nameremoved);
        } else {
            return;
        }
        waTextView.setTextColor(A042);
    }

    public final void setEventUtils(C45942ap r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setGlobalUI(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setOnClickListener(C30461mU r3) {
        C162457s7.A0J(r3, 0);
        C18320x8.A16(this.A06, this, r3, 30);
    }

    public final void setResponseStatus(C30461mU r4) {
        C162457s7.A0J(r4, 0);
        getEventUtils().A00(r4, "ChatInfoEventLayout", new C383026z(this, 5));
    }

    public final void setTime(C56612sH r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final AnonymousClass5Y0 getEmojiLoader() {
        AnonymousClass5Y0 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("emojiLoader");
    }

    public final C54922pV getEventMessageManager() {
        C54922pV r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("eventMessageManager");
    }

    public final C45942ap getEventUtils() {
        C45942ap r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("eventUtils");
    }

    public final C69263Wi getGlobalUI() {
        C69263Wi r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C56612sH getTime() {
        C56612sH r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("time");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public AnonymousClass1NN(Context context) {
        super(context);
        View.inflate(context, R.layout.f8nameremoved, this);
        C18310x6.A15(this);
    }

    public final LinearLayout getEventContainer() {
        return this.A06;
    }

    public final void setAbbreviatedDate(long j) {
        Locale A022 = C620733j.A02(getWhatsAppLocale());
        String A0q = C18290x4.A0q(DateFormat.getBestDateTimePattern(A022, "MMM"), A022, j);
        C620733j whatsAppLocale = getWhatsAppLocale();
        String A0q2 = C18290x4.A0q(whatsAppLocale.A0A(167), C620733j.A02(whatsAppLocale), j);
        WaTextView waTextView = this.A0B;
        String upperCase = A0q.toUpperCase(Locale.ROOT);
        C162457s7.A0D(upperCase);
        waTextView.setText(upperCase);
        this.A09.setText(A0q2);
    }

    public final void setEventDate(long j) {
        CharSequence A012 = C107565bW.A01(getTime(), getWhatsAppLocale(), j);
        C162457s7.A0D(A012);
        String A002 = C107145am.A00(getWhatsAppLocale(), j);
        WaTextView waTextView = this.A08;
        Context context = getContext();
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A16(A012, A002, A0M);
        AnonymousClass001.A0y(context, waTextView, A0M, R.string.f11nameremoved);
    }
}
