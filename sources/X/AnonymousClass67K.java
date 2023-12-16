package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.reactions.ReactionEmojiTextView;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.67K  reason: invalid class name */
public class AnonymousClass67K extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass67K(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void onAnimationCancel(Animator animator) {
        if (1 - this.A02 != 0) {
            super.onAnimationCancel(animator);
        } else {
            animator.removeListener(this);
        }
    }

    public void onAnimationEnd(Animator animator) {
        Bitmap photo;
        switch (this.A02) {
            case 0:
                C92174mD r1 = (C92174mD) this.A00;
                r1.A08((C1225964z) this.A01);
                r1.A01.setTranslationY(0.0f);
                return;
            case 1:
                ReactionsTrayViewModel reactionsTrayViewModel = ((C94024pj) ((C989553w) this.A00).A00).A0G;
                String A0u = C86614Ku.A0u((TextView) this.A01);
                AnonymousClass107 r3 = reactionsTrayViewModel.A0E;
                if (A0u.equals(((AnonymousClass5Q4) r3.A07()).A00)) {
                    A0u = "";
                }
                reactionsTrayViewModel.A0D(0);
                r3.A0H(new AnonymousClass5Q4(((AnonymousClass5Q4) r3.A07()).A00, true, A0u));
                return;
            case 3:
                ((View) this.A01).setSelected(false);
                return;
            case 4:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                C30471mV r6 = (C30471mV) this.A01;
                File A012 = C30471mV.A01(r6);
                if (A012 == null) {
                    Log.d("MediaViewFragment/transitionToMediaPreview/media data file is null");
                    return;
                }
                Uri fromFile = Uri.fromFile(A012);
                ArrayList A0s = C18300x5.A0s(fromFile);
                AnonymousClass5PE r5 = new AnonymousClass5PE(mediaViewFragment.A0G());
                r5.A0G = A0s;
                r5.A0C = C627336j.A07(mediaViewFragment.A14);
                r5.A02 = 29;
                r5.A0K = true;
                byte b = r6.A1I;
                if ((b == 1 || b == 42) && C107275b2.A00) {
                    PhotoView A1J = mediaViewFragment.A1J(r6.A1J);
                    if (!(A1J == null || (photo = A1J.getPhoto()) == null)) {
                        mediaViewFragment.A0S.A02().A09(AnonymousClass000.A0X("-media_view", C18290x4.A0v(fromFile)), photo);
                        r5.A07 = fromFile;
                    }
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    AnonymousClass0x2.A1G(C06560Yg.A02(mediaViewFragment.A0J(), R.id.pager_container), fromFile.toString(), A0s2);
                    View A022 = C06560Yg.A02(mediaViewFragment.A0J(), R.id.media_preview_header);
                    AnonymousClass0x2.A1G(A022, AnonymousClass0YZ.A06(A022), A0s2);
                    View A023 = C06560Yg.A02(mediaViewFragment.A0J(), R.id.media_preview_footer);
                    AnonymousClass0x2.A1G(A023, AnonymousClass0YZ.A06(A023), A0s2);
                    View A024 = C06560Yg.A02(mediaViewFragment.A0J(), R.id.media_preview_send);
                    AnonymousClass0x2.A1G(A024, AnonymousClass0YZ.A06(A024), A0s2);
                    mediaViewFragment.A0n(r5.A01(), 5, C05880Vi.A01(mediaViewFragment.A0R(), (AnonymousClass0PJ[]) A0s2.toArray(new AnonymousClass0PJ[0])).A02());
                    return;
                }
                mediaViewFragment.startActivityForResult(r5.A01(), 5);
                mediaViewFragment.A0R().overridePendingTransition(17432576, 0);
                return;
            case 5:
                MediaViewBaseFragment mediaViewBaseFragment = ((C96014vU) this.A00).A06;
                if (mediaViewBaseFragment.A0Q() != null) {
                    mediaViewBaseFragment.A1W(true, true);
                    ((C182718os) this.A01).Bed(true);
                    return;
                }
                return;
            case 6:
                AnonymousClass0x9.A1K(this.A01);
                break;
        }
        super.onAnimationEnd(animator);
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A02) {
            case 1:
                C106755a7.A04(((C94024pj) ((C989553w) this.A00).A00).A0G.A05);
                return;
            case 2:
                ReactionEmojiTextView reactionEmojiTextView = (ReactionEmojiTextView) this.A01;
                reactionEmojiTextView.setBackgroundScale(0.0f);
                reactionEmojiTextView.setSelected(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
