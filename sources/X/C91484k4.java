package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.view.Window;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.info.views.StarredMessageInfoView;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.ui.media.MediaCard;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4k4  reason: invalid class name and case insensitive filesystem */
public abstract class C91484k4 extends C89604eQ {
    public long A00;
    public View A01;
    public C107895c5 A02;
    public C621033m A03;
    public AnonymousClass5T7 A04;
    public C105405Uu A05;
    public C105145Tt A06;
    public AnonymousClass5X1 A07;
    public C1224464k A08;
    public AnonymousClass5XG A09;
    public C1224564l A0A;
    public AnonymousClass5R5 A0B;
    public C1224664m A0C;
    public AnonymousClass5QY A0D;
    public AnonymousClass10p A0E;
    public C106995aW A0F;
    public AnonymousClass5UK A0G;
    public AnonymousClass67C A0H;
    public C64773Ex A0I;
    public AnonymousClass5ZR A0J;
    public C56922sm A0K;
    public C56982ss A0L;
    public C28891hw A0M;
    public C66543Lv A0N;
    public C56892sj A0O;
    public C52472lX A0P;
    public C50452iC A0Q;
    public C153087ae A0R;
    public C195219Wq A0S;
    public C30471mV A0T;
    public AnonymousClass1R1 A0U;
    public C55832qz A0V;
    public AnonymousClass30V A0W;
    public MediaCard A0X;
    public C56072rN A0Y;
    public C33141sV A0Z;
    public AnonymousClass5UY A0a;
    public C183538qC A0b;
    public boolean A0c;
    public final HashSet A0d = AnonymousClass002.A0K();

    public void A66() {
        this.A0W.A03(A75(), 5);
        super.A66();
    }

    public C95814uZ A75() {
        if (this instanceof NewsletterInfoActivity) {
            return ((NewsletterInfoActivity) this).A7H();
        }
        if (this instanceof GroupChatInfoActivity) {
            return ((GroupChatInfoActivity) this).A7G();
        }
        if (this instanceof ListChatInfoActivity) {
            return ((ListChatInfoActivity) this).A7G();
        }
        return C86604Kt.A0d(((ContactInfoActivity) this).A1K);
    }

    public void A76() {
        this.A0E.A0E();
    }

    public void A77() {
        if (!(this instanceof NewsletterInfoActivity)) {
            this.A0D.A01(AnonymousClass1R1.A00(A75(), this.A0U).A01);
        }
    }

    public void A78() {
        MediaCard mediaCard = this.A0X;
        if (mediaCard == null) {
            mediaCard = (MediaCard) C005205m.A00(this, R.id.media_card_view);
        }
        this.A0X = mediaCard;
        this.A0B = this.A0A.B0H(this, A75(), this.A0X);
    }

    public void A7A(Bitmap bitmap) {
        if (bitmap != null) {
            ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) ((C91504kC) findViewById(R.id.content));
            C86604Kt.A1B(chatInfoLayoutV2, R.id.photo_progress);
            chatInfoLayoutV2.A04.setImageBitmap(bitmap);
            chatInfoLayoutV2.A04.setOnClickListener(chatInfoLayoutV2.A0A);
            AnonymousClass0OY r5 = new AnonymousClass0OY(bitmap);
            new AnonymousClass01Q(r5, new C110725gv(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{r5.A01});
        }
    }

    public void A7B(AnonymousClass10p r3) {
        this.A0E = r3;
        AnonymousClass6C6.A01(this, r3.A02, 67);
        AnonymousClass6C6.A01(this, r3.A05, 68);
        AnonymousClass6C6.A01(this, r3.A07, 69);
        AnonymousClass6C6.A01(this, r3.A03, 70);
        AnonymousClass6C6.A01(this, r3.A06, 71);
        AnonymousClass6C6.A01(this, r3.A04, 72);
        C86654Ky.A1G(this, r3.A01, 19);
    }

    public void A7E(String str, int i) {
        View A022 = C06560Yg.A02(this.A00, R.id.exit_group_btn);
        if (A022 instanceof ListItemWithLeftIcon) {
            C89364cO r1 = (C89364cO) A022;
            r1.setTitle(str);
            r1.setIcon(i);
        }
    }

    public void A7F(List list) {
        this.A0B.A01(list);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass2z0 A032;
        if (C107275b2.A00) {
            Window window = getWindow();
            window.requestFeature(13);
            if (getIntent().getBooleanExtra("circular_transition", false)) {
                window.requestFeature(12);
                AnonymousClass6EJ r1 = new AnonymousClass6EJ(true, false);
                r1.addTarget(AnonymousClass5MG.A01(this));
                window.setSharedElementEnterTransition(r1);
                r1.addListener(new C1232967w(this, 0));
            }
            Fade fade = new Fade();
            C86634Kw.A19(fade);
            window.setReturnTransition(fade);
            window.setEnterTransition(fade);
            C86634Kw.A1G(window);
        }
        A5j(5);
        super.onCreate(bundle);
        if (bundle != null && (A032 = C107395bF.A03(bundle, "requested_message")) != null) {
            this.A0T = (C30471mV) this.A0V.A05(A032);
        }
    }

    public void A79(long j) {
        View findViewById = findViewById(R.id.starred_messages_layout);
        if (findViewById instanceof StarredMessageInfoView) {
            ((StarredMessageInfoView) findViewById).A08(j, this.A0P.A02(A75()));
            return;
        }
        View findViewById2 = findViewById(R.id.starred_messages_separator);
        if (j == 0 || this.A0P.A02(A75())) {
            C86624Kv.A12(findViewById, findViewById2);
            return;
        }
        findViewById.setVisibility(0);
        findViewById2.setVisibility(0);
        C86634Kw.A1K(AnonymousClass002.A09(findViewById, R.id.starred_messages_count), this.A00.A0M(), j);
    }

    public void A7C(C109665ez r3) {
        View findViewById = findViewById(R.id.starred_messages_layout);
        if (findViewById instanceof StarredMessageInfoView) {
            ((StarredMessageInfoView) findViewById).setupOnClickListener(r3);
        } else {
            findViewById.setOnClickListener(r3);
        }
    }

    public void A7D(Integer num) {
        C91504kC r6 = (C91504kC) findViewById(R.id.content);
        ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) r6;
        C86604Kt.A1B(chatInfoLayoutV2, R.id.photo_progress);
        if (num != null) {
            chatInfoLayoutV2.A06.A05(chatInfoLayoutV2.A04, chatInfoLayoutV2.A00, num.intValue(), AnonymousClass4L0.A01(chatInfoLayoutV2.getResources(), R.dimen.f6nameremoved));
        }
        chatInfoLayoutV2.A04.setOnClickListener(chatInfoLayoutV2.A0A);
        r6.setColor(C86634Kw.A03(this));
        findViewById(R.id.bottom_shade).setBackgroundColor(0);
        findViewById(R.id.top_shade).setBackgroundColor(0);
    }

    public void finishAfterTransition() {
        A76();
        super.finishAfterTransition();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 34) {
            if (i2 == -1) {
                this.A0B.A00((View) null);
            }
        } else if (i == 4660) {
            A77();
            AnonymousClass5XG B0I = this.A08.B0I(this, (C89364cO) findViewById(R.id.chat_lock_view), A75());
            this.A09 = B0I;
            B0I.A00();
            C95814uZ A75 = A75();
            if (this.A0L.A0P(A75) && this.A0U.A0i(A75)) {
                C86644Kx.A1R(this.A04, this, A75, 49);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        A76();
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            A76();
        }
    }

    public void onRestart() {
        C95814uZ A75 = A75();
        if (A75 != null) {
            C106995aW r2 = this.A0F;
            C95814uZ A752 = A75();
            C162457s7.A0J(A752, 0);
            if (r2.A03.A0P(A752) && this.A02.A02) {
                C106995aW r22 = this.A0F;
                r22.A07(r22.A04(this, this, 4), A75, 4);
            }
        }
        super.onRestart();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C30471mV r0 = this.A0T;
        if (r0 != null) {
            C107395bF.A08(bundle, r0.A1J, "requested_message");
        }
    }
}
