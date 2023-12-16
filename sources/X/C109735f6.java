package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bonsai.waitlist.BonsaiWaitlistUnavailableBottomSheet;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Objects;

/* renamed from: X.5f6  reason: invalid class name and case insensitive filesystem */
public class C109735f6 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public C109735f6(Context context, View view, C620733j r9, AnonymousClass1VX r10, StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A07 = 2;
        this.A00 = new int[2];
        this.A01 = new int[2];
        this.A02 = new AnonymousClass6BG((Object) this, 33);
        this.A05 = new C05430Th(context, view, C86664Kz.A04(C620733j.A04(r9) ? 1 : 0), 0, AnonymousClass29M.A00(r10));
        this.A04 = view;
        this.A03 = statusPlaybackBaseFragment;
    }

    public void onClick(View view) {
        boolean A002;
        switch (this.A07) {
            case 0:
                C89654ea r4 = (C89654ea) this.A04;
                if (r4 != null) {
                    View.OnClickListener onClickListener = (View.OnClickListener) this.A03;
                    if ((onClickListener instanceof AnonymousClass54F) && ((AnonymousClass54F) onClickListener).A01 == 26) {
                        C117085rM.A01((AnonymousClass4FS) this.A05, this, 35);
                    }
                    C50192hm r3 = (C50192hm) this.A00;
                    C112155jH r2 = new C112155jH(view, this);
                    if (!r3.A01.A01.A01()) {
                        Log.d("openOnboardingFromContactCard/open/disabled");
                        Log.d("openCantWaitList/open/can't join");
                        r4.Boo(new BonsaiWaitlistUnavailableBottomSheet());
                        return;
                    }
                    r3.A00(r4, r2, C996357k.AGENT, C18290x4.A0c());
                    return;
                }
                return;
            case 1:
                C106365Yr.A01((TextEmojiLabel) this.A02, (C179218in) this.A05, (C58932w3) this.A04);
                AnonymousClass0YG.A06((Drawable) this.A03, AnonymousClass0Y8.A04((Context) this.A01, R.color.f5nameremoved));
                ((DialogFragment) this.A06).A1K();
                return;
            default:
                if (this.A06 == null) {
                    ViewTreeObserver viewTreeObserver = ((View) this.A04).getViewTreeObserver();
                    this.A06 = viewTreeObserver;
                    viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.A02);
                }
                int[] iArr = (int[]) this.A00;
                ((View) this.A04).getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) this.A01;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                C05430Th r5 = (C05430Th) this.A05;
                C07890cz r42 = r5.A04;
                r42.clear();
                StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) this.A03;
                StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) statusPlaybackBaseFragment;
                C105285Uh A1R = statusPlaybackContactFragment.A1R(C18320x8.A0R(statusPlaybackContactFragment.A0o, statusPlaybackContactFragment.A00));
                if (!statusPlaybackContactFragment.A0r || !(A1R instanceof AnonymousClass51v)) {
                    boolean A0j = statusPlaybackContactFragment.A0W.A0j(statusPlaybackContactFragment.A0R);
                    int i = R.id.menuitem_conversations_mute;
                    int i2 = R.string.f11nameremoved;
                    if (A0j) {
                        i = R.id.menuitem_conversations_unmute;
                        i2 = R.string.f11nameremoved;
                    }
                    r42.add(0, i, 0, i2);
                    UserJid userJid = statusPlaybackContactFragment.A0R;
                    if ((userJid instanceof PhoneUserJid) && userJid != AnonymousClass1fY.A00) {
                        r42.add(0, (int) R.id.menuitem_conversations_message_contact, 0, (int) R.string.f11nameremoved);
                        r42.add(0, (int) R.id.menuitem_conversations_voice_call_contact, 0, (int) R.string.f11nameremoved);
                        r42.add(0, (int) R.id.menuitem_conversations_video_call_contact, 0, (int) R.string.f11nameremoved);
                        r42.add(0, (int) R.id.menuitem_conversations_contact_info, 0, (int) R.string.f11nameremoved);
                        if (statusPlaybackContactFragment.A03.A0X(2728)) {
                            r42.add(0, (int) R.id.menuitem_report_status, 0, (int) R.string.f11nameremoved);
                        }
                    }
                } else {
                    AnonymousClass51v r8 = (AnonymousClass51v) A1R;
                    r42.add(0, (int) R.id.menuitem_forward, 0, (int) R.string.f11nameremoved);
                    C624134x r9 = r8.A06;
                    if (r9 != null) {
                        WfalManager wfalManager = r8.A07;
                        if (wfalManager.A02()) {
                            A002 = r8.A0O.A00(AnonymousClass223.FACEBOOK, r9);
                        } else {
                            if (r8.A0R.A02()) {
                                A002 = AnonymousClass5O0.A00(r8.A0Q, Collections.singletonList(r9), 3);
                            }
                            if (wfalManager.A02() && r8.A0O.A00(AnonymousClass223.INSTAGRAM, r9)) {
                                r42.add(0, (int) R.id.menuitem_share_status_instagram, 0, (int) R.string.f11nameremoved);
                            }
                        }
                        if (A002) {
                            r42.add(0, (int) R.id.menuitem_share_status_facebook, 0, (int) R.string.f11nameremoved);
                        }
                        r42.add(0, (int) R.id.menuitem_share_status_instagram, 0, (int) R.string.f11nameremoved);
                    }
                    if (!r8.A06.A0Y() || (r8.A0E.A01().getBoolean("post_status_in_companion", false) && r8.A0O.A0X(4905))) {
                        r42.add(0, (int) R.id.menuitem_delete, 0, (int) R.string.f11nameremoved);
                    }
                }
                r5.A00 = new AnonymousClass6AJ(this, 1);
                Objects.requireNonNull(statusPlaybackBaseFragment);
                r5.A01 = new C1236669h(statusPlaybackBaseFragment, 1);
                r5.A00();
                statusPlaybackBaseFragment.A06 = true;
                statusPlaybackBaseFragment.A1I();
                return;
        }
    }

    public C109735f6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
        this.A06 = obj7;
    }
}
