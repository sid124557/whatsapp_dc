package X;

import android.app.Dialog;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.bottombar.BottomBarView;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5nY  reason: invalid class name and case insensitive filesystem */
public final class C114755nY implements C185458ti, C182638ok, C182608oh, C182628oj {
    public C182598og A00;
    public C179438j9 A01;
    public final C105385Us A02;
    public final BottomBarView A03;
    public final AnonymousClass5OO A04;
    public final C148287Hu A05;
    public final AnonymousClass5Oa A06;
    public final AnonymousClass5Q1 A07;
    public final C114765nZ A08;

    public void A00(CharSequence charSequence, boolean z) {
        CharSequence charSequence2;
        AnonymousClass5OO r5 = this.A04;
        if (TextUtils.isEmpty(charSequence)) {
            CaptionView captionView = r5.A04;
            captionView.setCaptionText((CharSequence) null);
            C18300x5.A13(r5.A00, captionView, R.string.f11nameremoved);
            return;
        }
        if (z) {
            C620633i r3 = r5.A01;
            C60152y5 r2 = r5.A05;
            MentionableEntry mentionableEntry = r5.A04.A0E;
            charSequence2 = C107345b9.A03(r5.A00, mentionableEntry.getPaint(), r5.A03, C107635bd.A09(r3, r2, charSequence, mentionableEntry.getCurrentTextColor(), true));
        } else {
            charSequence2 = charSequence;
        }
        CaptionView captionView2 = r5.A04;
        captionView2.setCaptionText(charSequence2);
        captionView2.setContentDescription(charSequence);
    }

    public void A01(boolean z) {
        if (z) {
            C114765nZ r3 = this.A08;
            C86624Kv.A0B(r3.A06).withStartAction(new C70013Zn(r3, 2));
        }
        BottomBarView bottomBarView = this.A03;
        C86624Kv.A0B(bottomBarView).withStartAction(new C71533cG((Object) bottomBarView, 48));
    }

    public void A02(boolean z) {
        if (z) {
            C114765nZ r3 = this.A08;
            C86624Kv.A0A(r3.A06).withEndAction(new C70013Zn(r3, 1));
        }
        BottomBarView bottomBarView = this.A03;
        C86624Kv.A0A(bottomBarView).withEndAction(new C71533cG((Object) bottomBarView, 47));
    }

    public void A03(boolean z) {
        this.A07.A01.setClickable(z);
        CaptionView captionView = this.A04.A04;
        captionView.setClickable(z);
        captionView.setAddButtonClickable(z);
        captionView.setViewOnceButtonClickable(z);
    }

    public void A04(boolean z) {
        this.A03.setVisibility(0);
        C114765nZ r0 = this.A08;
        r0.A06.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public void BM5() {
        this.A00.BM5();
    }

    public void BOV() {
        C182598og r0 = this.A00;
        if (r0 != null) {
            ((MediaComposerActivity) r0).A7D();
        }
    }

    public void BZc(boolean z) {
        C182598og r4 = this.A00;
        if (r4 != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r4;
            C18260x0.A1D("MediaComposerActivity/sendMedia/onRecipientsClicked/statusChipClicked: ", AnonymousClass001.A0o(), z);
            mediaComposerActivity.A1c = true;
            if (!mediaComposerActivity.A7R() || !mediaComposerActivity.A0D.A0X(6132)) {
                mediaComposerActivity.A7P(z);
                return;
            }
            boolean z2 = true;
            mediaComposerActivity.A1c = z;
            if (!mediaComposerActivity.A0K.A02() && (!mediaComposerActivity.A1N.A00() || mediaComposerActivity.A0K.A02())) {
                z2 = false;
            }
            StatusPrivacyBottomSheetDialogFragment A002 = AnonymousClass5C3.A00(z2);
            mediaComposerActivity.A1E.A02(A002.A0H(), (C108845de) mediaComposerActivity.A0t.A04.A07());
            mediaComposerActivity.Boo(A002);
            Dialog dialog = A002.A03;
            if (dialog != null) {
                C626936e.A06(dialog);
                C86654Ky.A0u(dialog, mediaComposerActivity, 5);
            }
        }
    }

    public void BbE() {
        Integer num;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
        Log.d("MediaComposerActivity/sendMedia/onSendButtonClicked");
        if (AnonymousClass000.A1W(C627336j.A03(AnonymousClass4SG.A30(mediaComposerActivity)))) {
            int i = 10;
            if (mediaComposerActivity.A7S()) {
                i = 12;
            }
            Integer valueOf = Integer.valueOf(i);
            mediaComposerActivity.A1F.A0A((Byte) null, valueOf, C113995mK.A01(valueOf.intValue()));
        }
        mediaComposerActivity.A1O.get();
        mediaComposerActivity.A7D();
        AnonymousClass5U6 r4 = mediaComposerActivity.A0T;
        List A31 = AnonymousClass4SG.A31(mediaComposerActivity);
        C94824ry r3 = r4.A01;
        if (r3 != null && (num = r3.A02) != null) {
            int intValue = num.intValue();
            if (intValue == 3 || intValue == 5 || intValue == 4) {
                if (A31 != null) {
                    Iterator it = A31.iterator();
                    Integer num2 = null;
                    while (it.hasNext()) {
                        int A002 = C18280x3.A00(C989053r.A08(C107655bf.A0W(C86664Kz.A0c(it), r4.A06.A03.A0R())) ? 1 : 0);
                        Integer valueOf2 = Integer.valueOf(A002);
                        if (!(num2 == null || num2 == valueOf2)) {
                            A002 = 3;
                        }
                        num2 = Integer.valueOf(A002);
                    }
                    r3 = r4.A01;
                    r3.A04 = num2;
                }
                r4.A03(r3.A02.intValue());
            }
        }
    }

    public void Be3(int i) {
        Uri A022;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A01;
        if (mediaComposerActivity.A1d || C86604Kt.A05(mediaComposerActivity.A0t.A02) != i) {
            mediaComposerActivity.A1d = false;
            mediaComposerActivity.A0l.setCurrentItem(mediaComposerActivity.A0v.A0M(i));
            C87984Ww r1 = mediaComposerActivity.A0w.A08.A02;
            r1.A00 = false;
            r1.A05();
            Handler handler = mediaComposerActivity.A1m;
            handler.removeCallbacksAndMessages((Object) null);
            C71533cG r2 = new C71533cG(mediaComposerActivity, 43);
            mediaComposerActivity.A1T = r2;
            handler.postDelayed(r2, 500);
        } else if (mediaComposerActivity.A1T == null && (A022 = mediaComposerActivity.A0t.A02()) != null) {
            mediaComposerActivity.A7K(A022);
        }
    }

    public void BfV() {
        C105385Us r3 = this.A02;
        int A052 = C86604Kt.A05(r3.A06);
        if (A052 == 2) {
            r3.A05(3);
        } else if (A052 == 3) {
            r3.A05(2);
        }
    }

    public /* synthetic */ void onDismiss() {
    }

    public C114755nY(C105385Us r6, BottomBarView bottomBarView, AnonymousClass5OO r8, C148287Hu r9, AnonymousClass5Oa r10, AnonymousClass5Q1 r11, C114765nZ r12) {
        this.A03 = bottomBarView;
        this.A02 = r6;
        this.A04 = r8;
        this.A06 = r10;
        this.A05 = r9;
        this.A08 = r12;
        this.A07 = r11;
        AnonymousClass08M r4 = r6.A01;
        r10.A00((C108845de) r6.A04.A07(), C86644Kx.A0h(r4), true);
        CaptionView captionView = r8.A04;
        MentionableEntry mentionableEntry = captionView.A0E;
        mentionableEntry.setScrollBarStyle(33554432);
        mentionableEntry.setClickable(false);
        mentionableEntry.setCursorVisible(false);
        mentionableEntry.setFocusable(false);
        mentionableEntry.setFocusableInTouchMode(false);
        mentionableEntry.setImportantForAccessibility(2);
        captionView.A0C.setVisibility(0);
        r11.A00(r6.A00());
        RecyclerView recyclerView = r12.A06;
        recyclerView.A0o(new AnonymousClass126(r12.A07));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1X(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        boolean z = !C86634Kw.A1Y(r4);
        CaptionView captionView2 = this.A04.A04;
        captionView2.getContext();
        C620733j r0 = captionView2.A00;
        if (z) {
            C154367d3.A00(captionView2, r0);
        } else {
            C154367d3.A01(captionView2, r0);
        }
        this.A07.A01(z);
    }
}
